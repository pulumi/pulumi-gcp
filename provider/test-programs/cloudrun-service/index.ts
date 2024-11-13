import * as pulumi from "@pulumi/pulumi";
import * as gcp from "@pulumi/gcp";

const pulumiConfig = new pulumi.Config()
const cpu = pulumiConfig.get("cpu") || "1"

const cloudRunService = new gcp.cloudrun.Service("my-service", {
    location: "us-central1",
    template: {
        spec: {
            containers: [{
                image: "us-docker.pkg.dev/cloudrun/container/hello",
                resources: {
                    limits: {
                        cpu: cpu,
                    },
                },
            }],
        },
    },
});

export const id = cloudRunService.id