# Pulumi GCP Provider Version Upgrade Guide

Version 9.0.0 of the GCP provider for Pulumi is a major release and includes changes that you need to consider when upgrading. 
This guide will help with that process and focuses only on changes from version 8.x to version 9.0.0. 
See the [Version 8 Upgrade Guide](https://www.pulumi.com/registry/packages/gcp/how-to-guides/8-0-migration) for information on upgrading from 7.x to version 8.0.0.

## Breaking changes

GCP provider v9.0 includes several breaking changes to a few resources and invokes. Here are the details:

- Resource `gcp.alloydb.Cluster`:
  - The field `deletionProtection` has been added with a default value of `true`. This field destroying or recreating the cluster during `pulumi up`. In 9.0.0, existing clusters will have `deletionProtection` set to true during the next refresh unless otherwise set in the program configuration.

- Resource `gcp.apigee.KeystoresAliasesKeyCertFile`:
  - The field `certsInfo` is no longer an input and instead is only available as an output property.

- Resource `gcp.artifactregistry.Repository`:
  - Default values have been removed, if you are relying on defaults, you might need to explicitly set them in your program configuration.

- Resource `gcp.beyondcorp.Application` removed:
  - Associated resources `ApplicationIamBinding`, `ApplicationIamMember`, and `ApplicationIamPolicy` have also been removed.
  - Please use the new resource `gcp.beyondcorp.SecurityGatewayApplication` instead.

- Resource `gcp.bigquery.Table`:
  - Field `view.useLegacySql` No longer has a default value of `true`. You may need to explicitly set this field in your program configuration.

- Resource `gcp.bigtable.TableIamBinding`:
  - Field `instance` is now removed in favor of `instanceName`.

- Resource `gcp.bigtable.TableIamMember`:
  - Field `instance` is now removed in favor of `instanceName`.

- Resource `gcp.bigtable.TableIamPolicy`:
  - Field `instance` is now removed in favor of `instanceName`.

- Resource `gcp.cloudfunctionsv2.Function`:
  - Field `eventTrigger.eventType` is now a required field.

  - Field `serviceConfig.service` is now only available as an output property. Remove it from your program configuration when upgrading.

- Resource `gcp.cloudrunv2.WorkerPool`:
  - Field `template.containers.dependsOn` is removed. 

- Resource `gcp.colab.RuntimeTemplate`:
  - Field `postStartupScriptConfig` is removed.

- Resource `gcp.compute.InstanceTemplate`:
  - Field `disks.diskType`, `disks.mode`, `disks.interface` no longer use provider defaults and instead will be set by the API. See the [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates) for more details.

- Resource `gcp.compute.RegionInstanceTemplate`:
  - Field `disks.diskType`, `disks.mode`, `disks.interface` no longer use provider defaults and instead will be set by the API. See the [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates) for more details.

- Resource `gcp.compute.Subnetwork`:
  - Field `enableFlowLogs` has been removed in favor of `logConfig`.

- Resource `gcp.gkehub.Membership`:
  - Field `description` has been removed.

- Resource `gcp.gkehub.FeatureMembership`:
  - Field `configmanagement.binauthz` has been removed.

- Resource `gcp.memorystore.Instance`:
  - Field `allowFewerZonesDeployment` has been removed. 

- Resource `gcp.networkservices.LbTrafficExtension`:
  - Field `loadBalancingScheme` is now required. It was already needed for this resource to function correctly so no changes should be necessary.

- Resource `gcp.notebooks.Location` is removed because it was not a functional resource.

- Resource `gcp.projects.Service`:
  - Field `disableOnDestroy` no longer defaults to `true`. 

- Resource `gcp.redis.Cluster`:
  - Field `allowFewerZonesDeployment` has been removed.

- Resource `gcp.securesourcemanager.Instance`:
  - Field `deletionPolicy` has had its default value changed to `PREVENT`.

- Resource `gcp.storage.TransferJob`:
 - Several `path` fields have improved validation and now are required to not start with `/`.

- Resource `gcp.storage.Bucket`:
  - Field `retentionPeriod` has had its type changed to `string`.

- Resource `gcp.storage.Notification`:
  - Field `topic` now requires a new format and must be provided in the format `projects/{{project}}/topics/{{topic}}`.

- Resource `gcp.tpu.Node` has been removed in favor of `gcp.tpu.V2Vm`. For moving from TPU Node to TPU VM architecture, see https://cloud.google.com/tpu/docs/system-architecture-tpu-vm#from-tpu-node-to-tpu-vm.

- Resource `gcp.vertex.AiIndex`:
  - Field `metadata` and `metadata.config` are now required. These fields were already required for resource functionality, so no change is necessary to existing configurations.


### Bucket Label Import

In v9, we are removing a [patch that changed the Import behavior on `gcp.storage.Bucket`.](https://github.com/pulumi/pulumi-gcp/issues/1961)
This patch allowed for a `pulumi import` to directly import cloud labels to the Bucket's `labels` field.
Going forward, the Import behavior for labels will be on par with all other resources: on a fresh import, the labels will be written to the output-only `effectiveLabels` field in the Pulumi state, and not to the bucket's `labels`. 
The generated code will not include `labels`.
To bring Bucket labels under Pulumi management after an import, you now need to explicitly set them on the Bucket's `labels` field.
You may discover any such potential labels from the Bucket's `effectiveLabels` field.
[Read more about label handling here.](https://www.pulumi.com/registry/packages/gcp/how-to-guides/7-0-migration/#labels-rework)
This change is a bug fix for https://github.com/pulumi/pulumi-gcp/issues/3337.