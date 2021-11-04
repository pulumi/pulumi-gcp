# Copyright 2016-2020, Pulumi Corporation.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

from pulumi_gcp import config, compute

region_zone = config.zone
project_name = config.project

compute_network = compute.Network(
    "network",
    project=project_name,
    auto_create_subnetworks=True,
)

compute_firewall = compute.Firewall(
    "firewall",
    project=project_name,
    network=compute_network.self_link,
    source_tags = ["foo"],
    allows=[
        {
            "protocol": "icmp",
        },
        {
            "protocol": "tcp",
            "ports": ["22", "80"],
        },
    ],
)

compute_instance = compute.Instance(
    "instance",
    project=project_name,
    machine_type="f1-micro",
    zone=region_zone,
    boot_disk={
        "initializeParams": {
            "image": "debian-cloud/debian-9",
        },
    },
    network_interfaces=[{
        "network": compute_firewall.network,
    }],
    service_account={
        "scopes": ["https://www.googleapis.com/auth/cloud-platform"],
    },
)
