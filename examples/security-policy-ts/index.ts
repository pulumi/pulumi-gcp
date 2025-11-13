import * as pulumi from "@pulumi/pulumi";
import * as gcp from "@pulumi/gcp";

const genericSecurityPolicy = new gcp.compute.SecurityPolicy("generic-security-policy", {
    rules: [
        {
            action: "deny(403)",
            description: "Deny access to IPs in 9.9.9.0/24",
            match: {
                config: {
                    srcIpRanges: ["9.9.9.0/24"],
                },
                versionedExpr: "SRC_IPS_V1",
            },
            priority: 1000,
        },
        {
            action: "allow",
            description: "default rule",
            match: {
                config: {
                    srcIpRanges: ["*"],
                },
                versionedExpr: "SRC_IPS_V1",
            },
            priority: 2147483647,
        },
    ],
});
