# Pulumi GCP Provider Version Upgrade Guide

Version 9.0.0 of the GCP provider for Pulumi is a major release and includes changes that you need to consider when upgrading. 
This guide will help with that process and focuses only on changes from version 8.x to version 9.0.0. 
See the [Version 8 Upgrade Guide](https://www.pulumi.com/registry/packages/gcp/how-to-guides/8-0-migration) for information on upgrading from 7.x to version 8.0.0.

## Breaking changes

### Bucket Label Import

In v9, we are removing a [patch that changed the Import behavior on `gcp.storage.Bucket`.](https://github.com/pulumi/pulumi-gcp/issues/1961)
This patch allowed for a `pulumi import` to directly import cloud labels to the Bucket's `labels` field.
Going forward, the Import behavior for labels will be on par with all other resources: on a fresh import, the labels will be written to the output-only `effectiveLabels` field in the Pulumi state, and not to the bucket's `labels`. 
The generated code will not include `labels`.
To bring Bucket labels under Pulumi management after an import, you now need to explicitly set them on the Bucket's `labels` field.
You may discover any such potential labels from the Bucket's `effectiveLabels` field.
[Read more about label handling here.](https://www.pulumi.com/registry/packages/gcp/how-to-guides/7-0-migration/#labels-rework)
This change is a bug fix for https://github.com/pulumi/pulumi-gcp/issues/3337.