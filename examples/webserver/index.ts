// Copyright 2016-2018, Pulumi Corporation.  All rights reserved.

import * as gcp from "@pulumi/gcp";
import * as process from "process";

const name = "webserver";

const region = process.env.GOOGLE_REGION;
const regionZone = process.env.GOOGLE_ZONE;
const projectName = process.env.GOOGLE_PROJECT;

console.log(region);
console.log(projectName);
console.log(regionZone);

const projSM = new gcp.projects.Service("webserverprojectsm", {
    service: "servicemanagement.googleapis.com",
    project: projectName,
    disableOnDestroy: false
});

const projCompute = new gcp.projects.Service("webserverprojectcompute",{
    service: "compute.googleapis.com",
    project: projectName,
    disableOnDestroy: false
});

const computeNetwork = new gcp.compute.network ("network", {
    name: "epnetwork",
    autoCreateSubnetworks: true,
    project: projectName
});

const computeFirewall = new gcp.compute.Firewall("firewall", {
    name: "epfirewall",
    network: computeNetwork.id,
    project: projectName,
    allows: [{
        protocol: "icmp",
        },
    {
        protocol: "tcp",
        ports: [
            "22", 
            "80"
        ]
    }],
});

const computeIntance = new gcp.compute.Instance("instance", {
    name: "epinstance",
    project: projectName,
    machineType: "f1-micro",
    zone: regionZone,
    bootDisk: {
        initializeParams: {
            image: "debian-cloud/debian-8"
        }
    },
    networkInterfaces: [
        {
            network: computeFirewall.network,
        }
    ],
    serviceAccount: {
        scopes: ["https://www.googleapis.com/auth/cloud-platform"]
    }
});

export let instance = computeIntance.selfLink.get;
