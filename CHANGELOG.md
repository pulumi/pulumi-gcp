## 0.18.0 (Unreleased)

### Important

Version 0.18.0 of `pulumi-gcp` is now based on v2.2.0 of the Google Beta Terraform Provider, which has a variety of breaking changes from the previous version.

## Improvements

- Update to v2.2.0 of the Google Beta Terraform Provider.

- Fix a bug where setting a property value back to the default results in no change

## 0.17.1 (Released March 6, 2019)

## Improvements

- Fix an issue where the Python `pulumi_gcp` package was depending on an older `pulumi` package.

## 0.17.0 (Released March 5, 2019)

### Important

Updating to v0.17.0 version of `@pulumi/pulumi`.  This is an update that will not play nicely
in side-by-side applications that pull in prior versions of this package.

See https://github.com/pulumi/pulumi/commit/7f5e089f043a70c02f7e03600d6404ff0e27cc9d for more details.

As such, we are rev'ing the minor version of the package from 0.16 to 0.17.  Recent version of `pulumi` will now detect, and warn, if different versions of `@pulumi/pulumi` are loaded into the same application.  If you encounter this warning, it is recommended you move to versions of the `@pulumi/...` packages that are compatible.  i.e. keep everything on 0.16.x until you are ready to move everything to 0.17.x.

## 0.16.9 (Released February 21st, 2019)

### Improvements

- Module names have been corrected in the Python SDK.

- `:param` documentation comments for parameters lacking documentation no longer appear in the Python SDK.

## 0.16.8 (Released February 11th, 2019)

### Improvements

- Support for the `deleteBeforeReplace` resource option and improved
  delete-before-replace behaviour introduced in [Pulumi
  0.16.14](https://github.com/pulumi/pulumi/blob/master/CHANGELOG.md#01614-released-january-31st-2019).

## 0.16.7 (Released February 8th, 2019)

- Fixed a bug in the Terraform bridge which could cause crashes when functions like `compute.getAddress` returned no
  results

## 0.16.6 (Released January 19th, 2019)

- Documentation comments for the Node.js SDK now include examples

## 0.16.5 (Released January 15th, 2019)

### Improvements

- Fixed a bug which resulted in errors of the form "Invalid address to set" for some resources.

## 0.16.4 (Released January 9th, 2019)

### Improvements

- `pulumi-gcp` is now based on v1.20.0 of the Terraform Google Cloud provider.

## 0.16.3 (Released December 22nd, 2018)

### Improvements

- `.get` methods can now work with just an `id` in most cases
- Package installation does not fail when `pulumi` is not present

## 0.16.2 (Released Novemeber 13th, 2018)

### Major Changes

- If you're using Pulumi with Python, this release removes Python 2.7 support in favor of Python 3.6 and greater.
