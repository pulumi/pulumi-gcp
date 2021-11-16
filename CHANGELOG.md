CHANGELOG
=========

## HEAD (Unreleased)
_(none)_

---

## 6.0.0 (2021-11-16)
* Upgrade to v4.0.0 of the Google Beta Terraform Provider
  * **PLEASE NOTE:** There are a summary of the breaking changes to the underlying provider can be found [in the Terraform upgrade guide](https://registry.terraform.io/providers/hashicorp/google/latest/docs/guides/version_4_upgrade)

## 5.26.0 (2021-11-01)
* Upgrade to v3.90.0 of the Google Beta Terraform Provider

## 5.25.0 (2021-10-19)
* Upgrade to v3.89.0 of the Google Beta Terraform Provider

## 5.24.0 (2021-10-12)
* Upgrade to v3.88.0 of the Google Beta Terraform Provider
  **PLEASE NOTE** there are breaking changes in the `gcp.gkehub.Feature` and `gcp.gkehub.FeatureMembership` where a number of parameters are not required due to changes in the upstream Google API.

## 5.23.0 (2021-10-08)
* Upgrade to v3.9.0 of the pulumi-terraform-bridge. This includes a change to emit input type registrations.

## 5.22.0 (2021-10-07)
* Upgrade to v3.87.0 of the Google Beta Terraform Provider

## 5.21.0 (2021-09-28)
* Upgrade to v3.86.0 of the Google Beta Terraform Provider
* Upgrade to pulumi sdk + codegen v3.11.0
* Upgrade to pulumi-terraform-bridge v3.7.0

## 5.20.0 (2021-09-15)
* Upgrade to v3.84.0 of the Google Beta Terraform Provider

## 5.19.0 (2021-09-10)
* Upgrade to v3.83.0 of the Google Beta Terraform Provider

## 5.18.0 (2021-08-31)
* Upgrade to v3.82.0 of the Google Beta Terraform Provider

## 5.17.0 (2021-08-26)
* Upgrade to v3.81.0 of the Google Beta Terraform Provider

## 5.16.0 (2021-08-20)
* Upgrade to v3.80.0 of the Google Beta Terraform Provider

## 5.15.0 (2021-08-11)
* Upgrade to v3.79.0 of the Google Beta Terraform Provider

## 5.14.0 (2021-08-03)
* Upgrade to v3.78.0 of the Google Beta Terraform Provider
* Prevent panic in bigquery.Dataset.get when passing a different projectId from the current project

## 5.13.0 (2021-07-21)
* Upgrade to v3.76.0 of the Google Beta Terraform Provider
* (breaking) Change the way types are generated for the Pulumi Go SDK. In most circumstances these changes will relax the allowed types for input properties on `State` types, but in this release and future releases it may cause some properties to require an update to match the desired type.

## 5.12.0 (2021-07-15)
* Upgrade to v3.75.0 of the Google Beta Terraform Provider
  **PLEASE NOTE there are breaking changes in the `gcp.certificateauthority` resources as they have changed as part of the GA release in the Google API :**

## 5.11.0 (2021-07-01)
* Upgrade to v3.74.0 of the Google Beta Terraform Provider

## 5.10.1 (2021-06-23)
* Prevent panic in `gcp.sql.DatabaseInstance` when using a Get request to lookup existing Database

## 5.10.0 (2021-06-22)
* Upgrade to v3.73.0 of the Google Beta Terraform Provider

## 5.9.0 (2021-06-16)
* Upgrade to v3.72.0 of the Google Beta Terraform Provider

## 5.8.1 (2021-06-14)
* Ensure `gcp.pubsub.Schema` is packaged as part of the Go SDK

## 5.8.0 (2021-06-08)
* Upgrade to v3.71.0 of the Google Beta Terraform Provider

## 5.7.0 (2021-06-04)
* Upgrade to v3.70.0 of the Google Beta Terraform Provider

## 5.6.0 (2021-05-27)
* Upgrade to v3.2.1 of the pulumi-terraform-bridge

## 5.5.0 (2021-05-26)
* Upgrade to v3.69.0 of the Google Beta Terraform Provider

## 5.4.0 (2021-05-19)
* Upgrade to v3.68.0 of the Google Beta Terraform Provider

## 5.3.0 (2021-05-12)
* Upgrade to v3.67.0 of the Google Beta Terraform Provider  
  **PLEASE NOTE THE FOLLOWING BREAKING CHANGES:**
  * Changing `dataSetId` or `projectId` on `gcp.bigquery.Dataset` will now force a resource recreation.
  This is due to changes in the upstream API.

## 5.2.0 (2021-04-29)
* Upgrade to v3.66.1 of the Google Beta Terraform Provider

## 5.1.0 (2021-04-28)
* Upgrade to v3.65.0 of the Google Beta Terraform Provider

## 5.0.0 (2021-04-19)
* Depend on Pulumi 3.0, which includes improvements to Python resource arguments and key translation, Go SDK performance,
  Node SDK performance, general availability of Automation API, and more.  
  **PLEASE NOTE THE FOLLOWING BREAKING CHANGES:**
  * `gcp.notebooks.Instance` now supports multiple `instanceOwners`. 
  * `gcp.compute.TargetSSLProxy` now supports multiple `sslCertificates`. 

## 4.21.0 (2021-04-13)
* Upgrade to v3.64.0 of the Google Beta Terraform Provider

## 4.20.0 (2021-04-12)
* Upgrade to pulumi-terraform-bridge v2.23.0

## 4.19.0 (2021-04-06)
* Upgrade to v3.63.0 of the Google Beta Terraform Provider

## 4.18.0 (2021-03-30)
* Upgrade to v3.62.0 of the Google Beta Terraform Provider

## 4.17.0 (2021-03-24)
* Upgrade to v3.61.0 of the Google Beta Terraform Provider

## 4.16.1 (2021-03-22)
* Upgrade to pulumi-terraform-bridge v2.22.1
  **Please Note:** This includes a bug fix to the refresh operation regarding arrays

## 4.16.0 (2021-03-22)
* Upgrade to v3.60.0 of the Google Beta Terraform Provider  
  **PLEASE NOTE:**  
  * `gcp.compute.InstanceTemplate` has had `nicType` removed to it not actually being used in the provider
  * `gcp.config.ResourceManagerV2beta1CustomEndpoint` has been renamed to  `gcp.config.ResourceManagerV2CustomEndpoint` as it is now classed as GA.

## 4.15.0 (2021-03-15)
* Upgrade to pulumi-terraform-bridge v2.21.0

## 4.14.0 (2021-03-15)
* Upgrade to v3.59.0 of the Google Beta Terraform Provider
* Release macOS arm64 binary

## 4.13.0 (2021-03-01)
* Upgrade to v3.58.0 of the Google Beta Terraform Provider

## 4.12.0 (2021-02-18)
* Upgrade to v3.57.0 of the Google Beta Terraform Provider

## 4.11.1 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider
* Avoid storing config from the environment into the state

## 4.11.0 (2021-02-10)
* Upgrade to v3.56.0 of the Google Beta Terraform Provider

## 4.10.0 (2021-02-02)
* Upgrade to v3.55.0 of the Google Beta Terraform Provider

## 4.9.1 (2021-01-29)
* Upgrading pulumi-terraform-bridge to v2.18.0

## 4.9.0 (2021-01-27)
* Upgrade to v3.54.0 of the Google Beta Terraform Provider

## 4.8.0 (2021-01-21)
* Upgrade to v3.53.0 of the Google Beta Terraform Provider
* Remove autonaming from `gcp.dns.RecordSets` as the name of the resouce relates to a DNS name.

## 4.7.0 (2021-01-12)
* Upgrade to v3.52.0 of the Google Beta Terraform Provider

## 4.6.1 (2021-01-08)
* Upgrade to v3.51.1 of the Google Beta Terraform Provider

## 4.6.0 (2020-12-22)
* Upgrade to v2.16.0 of pulumi-terraform-bridge
    * Preserve unknowns during provider preview
* Upgrade NodeJS and Python versions to use Pulumi >= v2.15.0
* Upgrade to v3.51.0 of the Google Beta Terraform Provider

## 4.5.2 (2020-12-08)
* Upgrade to v2.15.3 of pulumi-terraform-bridge
  * Bug fix: Corrects a panic caused by reading sets with partially-known elements.

## 4.5.1 (2020-12-08)
* Upgrade to v2.15.2 of pulumi-terraform-bridge
  * Bug fix: Corrects an issue where replacements were not being correctly identified and leading to panics.

## 4.5.0 (2020-12-07)
* Upgrade to v3.49.0 of the Google Beta Terraform Provider
* Upgrade to pulumi-terraform-provider v2.13.3  

## 4.4.0 (2020-11-18)
* Upgrade to v3.48.0 of the Google Beta Terraform Provider
* Upgrade to pulumi-terraform-provider v2.13.2  
  * This adds import examples to the SDK
  * This fixes the examples as part of the SDK documentation

## 4.3.0 (2020-11-11)
* Upgrade to v3.47.0 of the Google Beta Terraform Provider

## 4.2.1 (2020-11-05)
* Upgrade to pulumi-terraform-bridge v2.12.1

## 4.2.0 (2020-11-04)
* Upgrade to v3.46.0 of the Google Beta Terraform Provider

## 4.1.0 (2020-10-30)
* Upgrade to v3.45.0 of the Google Beta Terraform Provider
  ** PLEASE NOTE:**  
  * Changing the `EnableMessageOrdering` of `gcp.pubsub.Subscription` will now cause the subscription to be recreated.
  * `gcp.spanner.Database` resources need `DeletionProtection` to be set to `false` before they can be deleted.

## 4.0.0 (2020-10-26)
* Upgrade to v3.44.0 of the Google Beta Terraform Provider
  ** PLEASE NOTE:**  
  There are a number of breaking changes to the output properties of Functions now being lists rather than single items
* Upgrade to Pulumi v2.12.0 and pulumi-terraform-bridge v2.11.0
* Improving the accuracy of previews leading to a more accurate understanding of what will actually change rather than assuming all output properties will change.  
  ** PLEASE NOTE:**  
  This new preview functionality can be disabled by setting `PULUMI_DISABLE_PROVIDER_PREVIEW` to `1` or `false`.

## 3.25.0 (2020-09-22)
* Upgrade to v3.40.0 of the Google Beta Terraform Provider

## 3.24.0 (2020-09-16)
* Upgrade to v3.39.0 of the Google Beta Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.8.0
* Upgrade to Pulumi v2.10.0

## 3.23.0 (2020-09-09)
* Upgrade to v3.38.0 of the Google Beta Terraform Provider

## 3.22.0 (2020-09-01)
* Upgrade to v3.37.0 of the Google Beta Terraform Provider

## 3.21.1 (2020-08-27)
* Upgrade to pulumi-terraform-bridge v2.7.3

## 3.21.0 (2020-08-25)
* Upgrade to v3.36.0 of the Google Beta Terraform Provider

## 3.20.0 (2020-08-24)
* Upgrade to Pulumi v2.9.0, which adds type annotations and input/output classes to Python
* Upgrade to pulumi-terraform-bridge v2.7.1

## 3.19.0 (2020-08-18)
* Upgrade to v3.35.0 of the Google Beta Terraform Provider
* Upgrade to Pulumi v2.7.1
* Upgrade to pulumi-terraform-bridge v2.6.0.  
  **PLEASE NOTE**  
  There is a *breaking change* in the `serviceAccount` module name:  
  * Go `serviceAccount` is now `serviceaccount`  
  * NodeJS `serviceAccount` is now `serviceaccount`
  * Python `service_account` is now `serviceaccount`

## 3.18.0 (2020-08-12)
* Upgrade to v3.34.0 of the Google Beta Terraform Provider

## 3.17.0 (2020-08-06)
* Upgrade to v3.33.0 of the Google Beta Terraform Provider

## 3.16.0 (2020-07-28)
* Upgrade to v3.32.0 of the Google Beta Terraform Provider

## 3.15.0 (2020-07-22)
* Upgrade to v3.31.0 of the Google Beta Terraform Provider

## 3.14.0 (2020-07-16)
* Upgrade to v3.30.0 of the Google Beta Terraform Provider

## 3.13.0 (2020-07-07)
* Upgrade to v3.29.0 of the Google Beta Terraform Provider

## 3.12.0 (2020-06-30)
* Upgrade to v3.28.0 of the Google Beta Terraform Provider

## 3.11.0 (2020-06-24)
* Upgrade to v3.27.0 of the Google Beta Terraform Provider

## 3.10.1 (2020-06-17)
* Fix up ldflags being pushed to pulumi-gcp binary

## 3.10.0 (2020-06-16)
* Upgrade to v3.26.0 of the Google Beta Terraform Provider
* Switch to GitHub actions for build

## 3.9.0 (2020-06-09)
* Upgrade to v3.25.0 of the Google Beta Terraform Provider

## 3.8.0 (2020-06-02)
* Upgrade to v3.24.0 of the Google Beta Terraform Provider

## 3.7.1 (2020-05-28)
* Upgrade to Pulumi v2.3.0
* Upgrade to pulumi-terraform-bridge v2.4.0

## 3.7.0 (2020-05-27)
* Upgrade to pulumi-terraform-bridge v2.3.3
* Upgrade to v3.23.0 of the Google Beta Terraform Provider

## 3.6.0 (2020-05-19)
* Upgrade to v3.22.0 of the Google Beta Terraform Provider

## 3.5.0 (2020-05-14)
* Upgrade to v3.21.0 of the Google Beta Terraform Provider

## 3.4.0 (2020-05-11)
* Upgrade to pulumi-terraform-bridge v2.3.1
* Upgrade to v3.20.0 of the Google Beta Terraform Provider

## 3.3.0 (2020-04-30)
* Upgrade to v3.19.0 of the Google Beta Terraform Provider

## 3.2.0 (2020-04-28)
* Regenerate datasource examples to be async
* Upgrade to pulumi-terraform-bridge v2.1.0

## 3.1.0 (2020-04-21)
* Rename `kms.Registry` to be `iot.Registry` to better match the use-case
* Upgrade to v3.18.0 of the Google Beta Terraform Provider

## 3.0.1 (2020-04-16)
* Fix release tag

## 3.0.0 (2020-04-16)
* Upgrade to v2.0.0 of Pulumi
* Upgrade to v2.0.0 of Pulumi terraform bridge

## 2.13.0 (2020-04-13)
* Upgrade to v3.16.0 of the Google Beta Terraform Provider

## 2.12.0 (2020-03-31)
* Rename `compute.Autoscalar` to `compute.Autoscaler`
* Upgrade to v3.15.0 of the Google Beta Terraform Provider

## 2.11.1 (2020-03-30)
* Bump consumable git modules to v2 as per [go documentation](https://github.com/golang/go/wiki/Modules#releasing-modules-v2-or-higher)

## 2.11.0 (2020-03-30)
* Upgrade to Pulumi v1.13.1

## 2.10.0 (2020-03-24)
* Upgrade to v3.14.0 of the Google Beta Terraform Provider

## 2.9.0 (2020-03-13)
* Move `getSecretVersion` to correct (`secretmanager`) namespace
* Upgrade to v3.12.0 of the Google Beta Terraform Provider
* Upgrade to Pulumi v1.12.1
* Upgrade to pulumi-terraform-bridge v1.8.2

## 2.8.0 (2020-03-05)
* Upgrade to v3.11.0 of the Google Beta Terraform Provider

## 2.7.0 (2020-02-20)
* Upgrade to v3.9.0 of the Google Beta Terraform Provider

## 2.6.0 (2020-02-11)
* Upgrade to v3.8.0 of the Google Beta Terraform Provider

## 2.5.0 (2020-02-06)
* Upgrade to v3.7.0 of the Google Beta Terraform Provider.

## 2.4.0 (2020-01-31)
* Upgrade to v3.6.0 of the Google Beta Terraform Provider.

## 2.3.0 (2020-01-29)
* Upgrade to v3.5.0 of the Google Beta Terraform Provider.
* Upgrade to pulumi-terraform-bridge v1.6.4

## 2.2.0 (2020-01-08)
* Upgrade to v3.4.0 of the Google Beta Terraform Provider.

## 2.1.0 (2019-12-18)
* Upgrade to v3.3.0 of the Google Beta Terraform Provider.

## 2.0.0 (2019-12-13)
* Upgrade to v3.2.0 of the Google Beta Terraform Provider.
  A summary of the breaking changes to the underlying provider can be found [in the Terraform upgrade guide](https://www.terraform.io/docs/providers/google/guides/version_3_upgrade.html#upgrade-topics)

## 1.8.0 (2019-12-12)
* Upgrade to pulumi-terraform-bridge v1.5.2
* Namespace names in .NET SDK are adjusted to PascalCase
([#259](https://github.com/pulumi/pulumi-gcp/pull/259)).

## 1.7.0 (2019-12-02)
* Upgrade to support go 1.13.x
* Upgrade to pulumi-terraform-bridge v1.4.3

## 1.6.0 (2019-11-16)
* Allow passing `runtime` arg to HttpCallbackFunction
* Upgrade to v2.20.0 of the Google Beta Terraform Provider.

## 1.5.0 (2019-11-07)
* Add a **preview** .NET SDK.

## 1.4.1 (2019-10-28)
* Upgrade to v2.18.1 of the Google Beta Terraform Provider.

## 1.4.0 (2019-10-24)
* Upgrade to v2.18.0 of the Google Beta Terraform Provider.

## 1.3.0 (2019-10-09)
* Regenerate SDK against tf2pulumi 0.6.0
* Renamed Compute `MangedSslCertificate` to `ManagedSslCertificate`
* Upgrade to v2.17.0 of the Google Beta Terraform Provider.

## 1.2.0 (2019-09-25)
* Upgrade to support go1.13
* Upgrade to v2.16.0 of the Google Beta Terraform Provider.

## 1.1.0 (2019-09-13)
* Upgrade to pulumi-terraform a3ddba3fb5
* Upgrade to v2.14.0 of the Google Beta Terraform Provider.

## 1.0.0 (2019-09-03)
* Use 1.0 version of Pulumi dependency

## 1.0.0-rc.1 (2019-08-28)
* Retype gcp.storage.BucketObject::source as Asset [#205](https://github.com/pulumi/pulumi-gcp/pull/205)
* Upgrade pulumi-terraform to 3f206601e7

## 1.0.0-beta.2 (2019-08-26)
* Upgrade to pulumi-terraform@14e049b09d
* Upgrade to pulumi-terraform@58c7473d08
* Use 1.0-beta versions of python dependencies

## 1.0.0-beta.1 (2019-08-13)
* No significant changes

## 0.18.16 (2019-08-09)
* Update to pulumi-terraform 9db2fc93cd

# 0.18.15 (2019-08-05)
* Update pulumi-terraform to 6bcafb609d
* Upgrade to v2.12.0 of the Google Beta Terraform Provider.

## 0.18.14 (2019-07-21)
* Upgrade to pulumi-terraform@98fabcf506 to allow Firestore to be used.

## 0.18.13 (2019-07-16)
* Upgrade to v2.11.0 of the Google Beta Terraform Provider.

## 0.18.12 (2019-07-09)
* Fix detailed diffs with nested computed values.

## 0.18.11 (2019-07-08)
* Communicate detailed information about the difference between a resource's desired and actual state during a Pulumi update

## 0.18.10 (2019-07-03)
* Update to v2.10.0 of the Google Beta Terraform Provider.

## 0.18.9 (2019-06-21)
* Update to pulumi-terraform@3635bed3a5 which stops maps containing `.` being treated as nested maps.
* Update to v2.9.1 of the Google Beta Terraform Provider.

## 0.18.8 (2019-06-20)
* Add TypeScript type guards for each resource class ([7ace3e9b5f](https://github.com/pulumi/pulumi-terraform/commit/7ace3e9b5f2dcd4692b029ba4b80360582d7949a))
* Upgrade to version v2.9.0 of the Google Beta Terraform Provider.
  NOTE: This release allows us to set custom_endpoints that allow us to use non-default API endpoints (e.g. emulators or mock APIs)

## 0.18.7 (2019-06-04)
* Update to v2.8.0 of the Google Beta Terraform provider
* DEPRECATION:  on  is deprecated

## 0.18.6 (2019-05-29)
* Update to v2.7.0 of the Google Beta Terraform provider

## 0.18.5 (2019-04-29)
* Update to v2.5.1 of the Google Beta Terraform provider

## 0.18.4 (2019-04-24)
* Update generated package documentation

## 0.18.3 (2019-04-05)
* Fix a bug where selecting particular names for `cloudfunction.Function` or `storage.Bucket` instances would result in an error

## 0.18.2 (2019-04-02)
* Add a new gcp.cloudfunctions.CallbackFunction component. This component makes it simple to create Cloud Functions from an existing JavaScript function. See https://github.com/pulumi/docs/blob/master/reference/serializing-functions.md for more details
* Using the above, serverless event handlers have been added that enable creating Cloud Functions from a JavaScript function and then invoking that function in response to:
    1. http triggers - i.e. when accessing some url.
    2. storage triggers - for example, when an object is created in a bucket.
    3. pubsub triggers - for example, when a message is published to a topic.

## 0.18.1 (2019-04-01)
* Update to v2.3.0 of the Google Beta Terraform provider

## 0.18.0 (2019-03-21)
* Update to v2.2.0 of the Google Beta Terraform provider
* BREAKING: The GCP provider is now based on the Google Beta Terraform provider rather than the Google provider.
* BREAKING: Correct `gcp.runtimeconfig.Variavble` to `gcp.runtimeconfig.Variable`
* Fix a bug where setting a property value back to a default value results in no change

## 0.17.1 (2019-03-06)
* Depend on the latest `pulumi` package in the `pulumi_gcp` Python SDK

## 0.17.0 (2019-03-05)
* Update to the latest version of the `pulumi` SDK
* Breaking: This version of the GCP provider will not work side-by-side with previous versions

## 0.16.9 (2019-02-21)
* Correct module names in the Python SDK
* Remove :param documentation comments for parameters with no documentation in the Python SDK

## 0.16.8 (2019-02-11)
* Add support for the `deleteBeforeReplace` resource option and improved delete-before-replace behaviour introduced in Pulumi v0.16.14

## 0.16.7 (2019-02-08)
* Fix a bug which caused crashes if functions such as `compute.getAddress()` returned no results

## 0.16.6 (2019-01-19)
* Add documentation comments to the Node.js SDK

## 0.16.5 (2019-01-15)
* Fix a bug resulting in errors of the form 'Invalid address to set' for some resources

## 0.16.4 (2019-01-09)
* Update to v1.20.0 of the Google Terraform provider

## 0.16.3 (2018-12-22)
* Allow `.get` methods to work with only an ID in most cases
* Make package installation succeed without the Pulumi CLI being installed

## 0.16.2 (2018-11-13)
* Support Python 3.6 and higher, instead of only Python 3.7

## 0.16.1 (2018-10-23)
* Update to revision 35d82b05559 of the GCP Terraform provider

## 0.16.0 (2018-10-12)
* Initial release of the GCP Provider

## 0.15.1 (2018-09-10)
* Support provider configuration and property values provided by environment variaibles. [pulumi/pulumi-gcp#43](https://github.com/pulumi/pulumi-gcp/pull/43)

## 0.15.0 (2018-08-13)
* Added support for `new gcp.serverless.Function` to create serverless functions defined inline in the Pulumi program in GCP using Google Cloud Functions.  A big thanks to **[@mikhailshilkov](https://github.com/mikhailshilkov)** for contributing this feature!

```typescript
import * as gcp from "@pulumi/gcp";
let f = new gcp.serverless.Function("f", {}, (req, res) => {
    res.send(`Hello ${req.body.name || 'World'}!`);
});
export let url = f.function.httpsTriggerUrl;
```

## 0.14.3 (2018-07-25)
* Only apply AutoName to inputs ([pulumi/pulumi-gcp#29](https://github.com/pulumi/pulumi-gcp/pull/29)). Terraform properties named `name` but are not inputs do not have auto naming applied to them.
* Add a serverless example ([pulumi/pulumi-gcp#12](https://github.com/pulumi/pulumi-gcp/pull/12)). The GCP provider now has better support for creating google cloud functions from code. We have an [example](https://github.com/pulumi/pulumi-gcp/tree/v0.14.3/examples/serverless) of how to use this support. We plan to add higher level support here (similar to what we have with AWS) in a future release.

## 0.14.1 (2018-07-03)
* The result of calls to data sources now include an `id` property. Special thanks to [@Frassle](https://github.com/Frassle) for adding this support in [pulumi/pulumi-terraform#189](https://github.com/pulumi/pulumi-terraform/pull/189).
* We've added assets support to the Python runtime and our Python packages. It is now possible to create resources that need an asset like a AWS Lambda or AWS Bucket Object in Python.

## 0.14.0 (2018-06-15)
* This package is new in this release! Use it to deploy and manage resources for Google Cloud Platform.
