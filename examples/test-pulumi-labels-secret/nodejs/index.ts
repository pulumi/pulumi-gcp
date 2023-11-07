import * as pulumi from "@pulumi/pulumi";
import * as gcp from "@pulumi/gcp";

const gcpProvider = new gcp.Provider("gcp-provider", {
    defaultLabels: {
        hello: "goodbye",
        new: "defaultlabel"
    }
});

const tsBucket = new gcp.storage.Bucket("ts-bucket", {
    location: "EU",
    labels: {
        good: "morning",
        bad: "things",
    },
}, {
    provider: gcpProvider,

});
export const pulumiLabels = tsBucket.pulumiLabels["good"]
