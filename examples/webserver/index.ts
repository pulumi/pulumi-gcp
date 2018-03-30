// Copyright 2016-2018, Pulumi Corporation.  All rights reserved.
import * as gcp from "@pulumi/gcp";

const region = gcp.config.region;
const regionZone = gcp.config.zone;
const projectName = gcp.config.project;

const projSM = new gcp.projects.Service("webserverprojectsm", {
    project: projectName,
    service: "servicemanagement.googleapis.com",
    disableOnDestroy: false,
});

const projCompute = new gcp.projects.Service("webserverprojectcompute",{
    project: projectName,
    service: "compute.googleapis.com",
    disableOnDestroy: false,
});

const computeNetwork = new gcp.compute.Network("network", {
    project: projectName,
    autoCreateSubnetworks: true,
});

const computeFirewall = new gcp.compute.Firewall("firewall", {
    project: projectName,
    network: computeNetwork.selfLink,
    allows: [
        {
            protocol: "icmp",
        },
        {
            protocol: "tcp",
            ports: [
                "22", 
                "80",
            ],
        },
    ],
});

const computeIntance = new gcp.compute.Instance("instance", {
    project: projectName,
    machineType: "f1-micro",
    zone: regionZone,
    bootDisk: {
        initializeParams: {
            image: "debian-cloud/debian-8",
        },
    },
    networkInterfaces: [
        {
            network: computeFirewall.network,
        },
    ],
    serviceAccount: {
        scopes: ["https://www.googleapis.com/auth/cloud-platform"],
    },
});

