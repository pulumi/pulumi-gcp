// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
import * as gcp from "@pulumi/gcp";

const region = gcp.config.region;
const regionZone = gcp.config.zone;
const projectName = gcp.config.project;

const machineTypeName = "f1-micro";
const imageName = "debian-cloud/debian-9";
const tag = "http-tag";

let network = new gcp.compute.Network("default-network", {
    project: projectName,
    autoCreateSubnetworks: true,
});

let globalAddress = new gcp.compute.GlobalAddress("external-address", {
    project: projectName,
});

let healthCheck = new gcp.compute.HealthCheck("health-check", {
    project: projectName,    
    httpHealthCheck: {},
});

// Create web resources - instance, instance group and backend services
let wwwInstance = new gcp.compute.Instance("www-compute", {
    project: projectName,
    machineType: machineTypeName,
    zone: regionZone,
    tags: [tag],
    bootDisk: {
        initializeParams: {
            image: imageName,
        },
    },
    networkInterfaces: [
        {
            network: network.selfLink,
        },
    ],
    metadataStartupScript: "./scripts/install-www.sh",
    serviceAccount: {
        scopes: ["https://www.googleapis.com/auth/compute.readonly"],
    },
});

let wwwResources = new gcp.compute.InstanceGroup("www-resources", {
    project: projectName,
    zone: regionZone,
    instances: [wwwInstance.selfLink],
    namedPorts: [
        {
            name: "http",
            port: 80,
        },
    ],
});

let wwwService = new gcp.compute.BackendService("www-service", {
    project: projectName,
    protocol: "HTTP",
    healthChecks: healthCheck.selfLink,
    backends: [
        {
            group: wwwResources.selfLink,
        },
    ],
});

// Create video resources - instance, instance group and backend service
let wwwVideoInstance = new gcp.compute.Instance("video-compute", {
    project: projectName,
    machineType: machineTypeName,
    zone: regionZone,
    tags: [tag],
    bootDisk: {
        initializeParams: {
            image: imageName,
        },
    },
    networkInterfaces: [
        {
            network: network.selfLink,
        },
    ],
    metadataStartupScript: "./scripts/install-video.sh",
    serviceAccount: {
        scopes: ["https://www.googleapis.com/auth/compute.readonly"],
    },
});

let videoResources = new gcp.compute.InstanceGroup("video-resources", {
    project: projectName,
    zone: regionZone,
    instances: [wwwVideoInstance.selfLink],
    namedPorts: [
        {
            name: "http",
            port: 80,
        },
    ],
});

let videoService = new gcp.compute.BackendService("video-service", {
    protocol: "HTTP",
    project: projectName,
    healthChecks: healthCheck.selfLink,
    backends: [
        {
            group: videoResources.selfLink,
        },
    ],
});

let webmap = new gcp.compute.URLMap("web-map", {
    project: projectName,
    defaultService: wwwService.selfLink,
    hostRules: [
        {
            hosts: ["*"],
            pathMatcher: "allpaths",
        },
    ],
    pathMatchers: [
        {
            name: "allpaths",
            defaultService: wwwService.selfLink,
            pathRules: [
                {
                    paths: [
                        "/video", 
                        "/video/*",
                    ],
                    service: videoService.selfLink,
                },
            ],
        },
    ],
});

let httpProxy = new gcp.compute.TargetHttpProxy("http-lb-proxy", {
    project: projectName,
    urlMap: webmap.selfLink,
});

let forwardingRule = new gcp.compute.GlobalForwardingRule("default-rule", {
    project: projectName,
    target: httpProxy.selfLink,
    ipAddress: globalAddress.address,
    portRange: "80",
});

let firewall = new gcp.compute.Firewall("internal-only", {
    project: projectName,
    network: network.selfLink,
    allows: [
        {
            protocol: "tcp",
            ports: ["80"],
        },
    ],
    sourceRanges: [
        "130.211.0.0/22", 
        "35.191.0.0/16",
    ],
    targetTags: [tag],
});
