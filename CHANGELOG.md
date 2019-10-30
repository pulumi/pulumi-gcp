CHANGELOG
=========

## HEAD (Unreleased)
* Add a **preview** .NET SDK.

---

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
