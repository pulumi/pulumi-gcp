# Pulumi GCP Provider Version Upgrade Guide

Version 10.0.0 of the GCP provider for Pulumi is a major release and includes changes that you need to consider when upgrading.
This guide will help with that process and focuses only on changes from version 9.x to version 10.0.0.
See the [Version 9 Upgrade Guide](https://www.pulumi.com/registry/packages/gcp/how-to-guides/9-0-migration) for information on upgrading from 8.x to version 9.0.0.

Version 10.0.0 tracks the upstream `terraform-provider-google-beta` v8.0.0 release.

## Removed resources

Several Google Cloud APIs were shut down or reached End of Life. The resources that wrapped them have been removed and have no replacement within the same module.

- Resource `gcp.beyondcorp.AppConnection` removed:
  - Use `gcp.beyondcorp.SecurityGateway` and `gcp.beyondcorp.SecurityGatewayApplication` for modern BeyondCorp Zero Trust application deployments.

- Resource `gcp.beyondcorp.AppConnector` removed.

- Resource `gcp.beyondcorp.AppGateway` removed:
  - Use `gcp.beyondcorp.SecurityGateway` instead.

- Resource `gcp.iap.Brand` and `gcp.iap.Client` removed:
  - The Google Cloud IAP OAuth Admin APIs have been permanently shut down. OAuth consent screens and OAuth clients can no longer be managed programmatically and must be configured in the [Google Cloud Console](https://console.cloud.google.com/apis/credentials).
  - Remove these resources from your program and from your stack state before upgrading.

- Resource `gcp.ml.EngineModel` removed:
  - The underlying Cloud ML Engine (AI Platform Prediction) API has been deprecated. Migrate to Vertex AI resources such as `gcp.vertex.AiEndpoint`.
  - This was the only resource in the `gcp.ml` module, so the module no longer exists.

- Resource `gcp.notebooks.Environment` removed:
  - The User-Managed and Google-Managed Notebooks products have reached End of Life. Settings such as the VM or container image and the post startup script are now specified directly on `gcp.workbench.Instance`.

- Resource `gcp.notebooks.Instance` removed:
  - Associated resources `InstanceIamBinding`, `InstanceIamMember`, and `InstanceIamPolicy` have also been removed.
  - Migrate to `gcp.workbench.Instance`.

- Resource `gcp.notebooks.Runtime` removed:
  - Associated resources `RuntimeIamBinding`, `RuntimeIamMember`, and `RuntimeIamPolicy` have also been removed.
  - Migrate to `gcp.workbench.Instance`.
  - With the above removals the `gcp.notebooks` module no longer exists.

- Resource `gcp.vertex.AiSchedule` removed:
  - Use `gcp.colab.Schedule` instead.

## Removed functions

- `gcp.beyondcorp.getAppConnection`
- `gcp.beyondcorp.getAppConnector`
- `gcp.beyondcorp.getAppGateway`
- `gcp.iap.getClient`
- `gcp.notebooks.getInstanceIamPolicy`
- `gcp.notebooks.getRuntimeIamPolicy`

## Changed resources

- Resource `gcp.bigquery.DataTransferConfig`:
  - Exactly one of `sensitiveParams.secretAccessKey` and `sensitiveParams.secretAccessKeyWo` must now be set.
  - Field `sensitiveParams.secretAccessKeyWoVersion` has changed type from integer to string.

- Resource `gcp.bigquery.Dataset`:
  - Field `defaultCollation` is no longer computed. If you were relying on the server assigned value, set it explicitly in your program.

- Resource `gcp.cloudrunv2.WorkerPool`:
  - Field `customAudiences` is removed.
  - Field `httpGet.httpHeaders.port` is removed.
  - Field `httpGet.httpHeaders.name` is now required.

- Resource `gcp.cloudsecuritycompliance.Framework`:
  - Field `cloudControlDetails` is now a set. Ordering is no longer significant and duplicate entries are rejected.

- Resource `gcp.compute.BackendService`:
  - Field `loadBalancingScheme` default value changed to `EXTERNAL_MANAGED`.

- Resource `gcp.compute.GlobalForwardingRule`:
  - Field `loadBalancingScheme` default value changed to `EXTERNAL_MANAGED`.

- Resource `gcp.compute.Instance`:
  - Field `guestAccelerator` can now be updated to a count of `0` instead of requiring replacement.

- Resource `gcp.compute.InterconnectAttachmentGroup`:
  - Field `logicalStructure.zones.attachment` is removed.

- Resource `gcp.compute.Reservation`:
  - Field `reservationBlockCount` is removed.

- Resource `gcp.compute.ServiceAttachment`:
  - Fields `natSubnets` and `consumerRejectLists` are now sets. Ordering is no longer significant.
  - Field `consumerAcceptLists` entries now default to empty strings.

- Resource `gcp.container.Cluster`:
  - Fields `loggingConfig.enableComponents` and `monitoringConfig.enableComponents` are now sets. Ordering is no longer significant.

- Resource `gcp.container.Cluster` and `gcp.container.NodePool`:
  - Field `namePrefix` maximum length has been extended from 14 to 31 characters.

- Resource `gcp.dataloss.PreventionJobTrigger`:
  - Field `actions.publishFindingsToCloudDataCatalog` is removed.

- Resource `gcp.iam.WorkforcePoolProviderScimTenant`:
  - Field `claimMapping` is now required on create.

- Resource `gcp.applicationintegration.Client`:
  - Field `runAsServiceAccount` is removed.

- Resource `gcp.monitoring.UptimeCheckConfig`:
  - Exactly one of `httpCheck.authInfo.password` and `httpCheck.authInfo.passwordWo` must now be set.

- Resource `gcp.netapp.StoragePool`:
  - Field `scaleTier` is removed.

- Resource `gcp.secretmanager.SecretVersion`:
  - Field `secretDataWoVersion` has changed type from integer to string.
  - Field `secretDataWo` now requires `secretDataWoVersion` to be set.

- Resource `gcp.workflows.Workflow`:
  - Field `sourceContents` is now required.

## Changed functions

- Function `gcp.backupdisasterrecovery.getBackupPlanAssociations`:
  - Field `resourceType` is removed.

- Function `gcp.backupdisasterrecovery.getDataSourceReferences`:
  - Field `resourceType` is removed.
