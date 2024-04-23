import * as pulumi from "@pulumi/pulumi";
import * as gcp from "@pulumi/gcp";

const prov = new gcp.Provider("prov", {
  defaultLabels: { def: "defaultlabel" },
});

// Create a GCP resource (Storage Bucket)
const bucket = new gcp.storage.Bucket(
  "my-bucket",
  {
    location: "US",
    labels: { app: "my-bucket" },
  },
  { provider: prov }
);

export const bucketPulumiLabels = bucket.pulumiLabels;
export const bucketLabels = bucket.labels;
export const bucketId = bucket.id;
