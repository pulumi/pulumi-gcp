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

