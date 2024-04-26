import * as pulumi from "@pulumi/pulumi";
import * as gcp from "@pulumi/gcp";


const prov = new gcp.Provider("my-provider", {accessToken: process.env.GCP_TOKEN})

export const token = prov.accessToken;