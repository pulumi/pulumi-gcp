import * as gcp from "@pulumi/gcp";
import * as pulumi from "@pulumi/pulumi";
import { secret } from "@pulumi/pulumi";

const bucket = new gcp.storage.Bucket("my-bucket");

// export const example = { "a": undefined };

export const example = pulumi
    .all([
      bucket.name,
      pulumi.secret('mysecret')
    ]).apply(([ a, b ]) => {
        console.log("i was run");
      return `${a}.${b}`;
    });

export const a1 = { b: "c" };
export const a2 = { b: secret("c") };
export const a3 = secret({ b: "c" });