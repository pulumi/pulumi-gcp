// Copyright 2016-2018, Pulumi Corporation.  All rights reserved.

import * as gcp from "@pulumi/gcp";
import * as process from "process";

const name = "loadbalancer";

const region = process.env.GOOGLE_REGION;
const regionZone = process.env.GOOGLE_ZONE;
const projectName = process.env.GOOGLE_PROJECT;

console.log(region);
console.log(projectName);
console.log(regionZone);

const machineTypeName = "f1-micro";
const imageName = "debian-cloud/debian-8";
const tag = "http-tag";

let wwwInstance = new gcp.compute.Instance("www-compute", {
    name: "www-compute",
    project: projectName,
    machineType: machineTypeName,
    zone: regionZone,
    tags: [tag],
    bootDisk: {
        initializeParams: {
            image: imageName
        },
    },
    networkInterfaces: [{
        network: "default"
    }],
    metadataStartupScript: "./scripts/install-www.sh",
    serviceAccount: {
        scopes: ["https://www.googleapis.com/auth/compute.readonly"]
    },
});

let wwwVideoInstance = new gcp.compute.Instance("www-video-compute", {
    name: "www-video-compute",
    project: projectName,
    machineType: machineTypeName,
    zone: regionZone,
    tags: [tag],
    bootDisk: {
        initializeParams: {
            image: imageName
        },
    },
    networkInterfaces: [{
        network: "default"
    }],
    metadataStartupScript: "./scripts/install-video.sh",
    serviceAccount: {
        scopes: ["https://www.googleapis.com/auth/compute.readonly"]
    }
});

let globalAddress = new gcp.compute.GlobalAddress("external-address", {
    name: "external-address-1",
    project: projectName

});

let wwwResources = new gcp.compute.InstanceGroup("www-resources", {
    name: "www-resources",
    project: projectName,
    zone: regionZone,
    instances: [
        wwwInstance.selfLink
    ],
    namedPorts: [{
        name: "http",
        port: 80
      }],
});

let videoResources = new gcp.compute.InstanceGroup("www-video-resources", {
    name: "www-video-resources",
    project: projectName,
    zone: regionZone,
    instances: [
        wwwVideoInstance.selfLink
    ],
    namedPorts: [{
        name: "http",
        port: 80
      }]
});

let healthCheck = new gcp.compute.HealthCheck("health-check", {
    name: "health-check",
    project: projectName,    
    httpHealthCheck: {}
});

let wwwService = new gcp.compute.BackendService("www-service", {
    name: "www-service",
    project: projectName,
    protocol: "HTTP",
    healthChecks: healthCheck.selfLink,
    backends: [{
        group: wwwResources.selfLink
    }]
});

let videoService = new gcp.compute.BackendService("www-video-service", {
    name: "www-video-service",
    protocol: "HTTP",
    project: projectName,
    healthChecks: healthCheck.selfLink,
    backends: [{
        group: videoResources.selfLink
    }]
});

let webmap = new gcp.compute.URLMap("web-map", {
    name: "web-map",
    project: projectName,
    defaultService: wwwService.selfLink,
    hostRules: [
        {
            hosts: ["*"],
            pathMatcher: "allpaths"
        }
    ],
    pathMatchers: [{
        name: "allpaths",
        defaultService: wwwService.selfLink,
        pathRules: [{
            paths: ["/video", "/video/*"],
            service: videoService.selfLink
        }]
    }]
});

let httpProxy = new gcp.compute.TargetHttpProxy("http-lb-proxy", {
    name: "http-lb-proxy",
    project: projectName,
    urlMap: webmap.selfLink
});

let forwardingRule = new gcp.compute.GlobalForwardingRule("default-rule", {
    name: "default-rule",
    project: projectName,
    target: httpProxy.selfLink,
    ipAddress: globalAddress.selfLink,
    portRange: "80"
});

let firewall = new gcp.compute.Firewall("firewall-allow-internal-only", {
    name: "allow-internal-only",
    project: projectName,
    network: "default",
    allows: [{
        protocol: "tcp",
        ports: ["80"]
    }],
    sourceRanges: ["130.211.0.0/22", "35.191.0.0/16"],
    targetTags: [tag],
});

export let externalIp = globalAddress.address.get;

console.log(externalIp.name);