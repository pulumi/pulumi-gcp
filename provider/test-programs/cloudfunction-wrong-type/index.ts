import * as pulumi from "@pulumi/pulumi";
import * as gcp from "@pulumi/gcp";

// Create a GCP resource (Storage Bucket)
const bucket = new gcp.storage.Bucket("my-bucket", {
    location: "US"
});

const archive = new gcp.storage.BucketObject("archive", {
    name: "index.zip",
    bucket: bucket.name,
    source: new pulumi.asset.FileArchive("./fn"),
});

new gcp.cloudfunctions.Function(
    `a-function`,
    {
      runtime: 'nodejs20',
      sourceArchiveBucket: bucket.name,
      sourceArchiveObject: archive.name,
      entryPoint: "main",
      name: 'name',
      environmentVariables: [{ a_key: 'A value'}] as any,
      triggerHttp: true,
    },
  );