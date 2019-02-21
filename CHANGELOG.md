## 0.16.9 (Unreleased)

### Improvements

- Module names have been corrected in the Python SDK.

- `:param` documentation comments for parameters lacking documentation no longer appear in the Python SDK.

## 0.16.8 (Released February 11, 2019)

### Improvements

- Support for the `deleteBeforeReplace` resource option and improved
  delete-before-replace behaviour introduced in [Pulumi
  0.16.14](https://github.com/pulumi/pulumi/blob/master/CHANGELOG.md#01614-released-january-31st-2019).

## 0.16.7 (Released February 8, 2019)

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
