import * as pulumi from "@pulumi/pulumi";
import * as gcp from "@pulumi/gcp";

const gcpProvider = new gcp.Provider("gcp-provider", {
    project: "pulumi-development",
    defaultLabels: {
        hello: "goodbye",
        new: "defaultlabel"
    }
});

const myBucket = new gcp.storage.Bucket("my-bucket", {
    location: "EU",
    labels: {
        good: "morning",
        bad: "things",
    },
}, {
    provider: gcpProvider,

});
export const pulumiLabels = myBucket.pulumiLabels["good"]
