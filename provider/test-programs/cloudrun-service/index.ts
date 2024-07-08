import * as gcp from "@pulumi/gcp";

new gcp.cloudrun.Service("my-service", {
    location: "us-central1",
    template: {
        spec: {
            containers: [{
                image: "us-docker.pkg.dev/cloudrun/container/hello",
            }],
        },
    },
});