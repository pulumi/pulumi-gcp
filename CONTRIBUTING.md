# Contributing to Pulumi

Do you want to hack on Pulumi?  Awesome!  We are so happy to have you.

Please refer to the [main Pulumi repo](https://github.com/pulumi/pulumi/)'s [CONTRIBUTING.md file](
https://github.com/pulumi/pulumi/blob/master/CONTRIBUTING.md) for details on how to do so.

## Running Integration Tests

The examples and integration tests in this repository will create and destroy real GCP
cloud resources while running. Before running these tests, make sure that you have
[configured Pulumi with GCP](https://pulumi.io/install/gcp.html) successfully once before.

You need to set these environment variables before running the integration tests:

1. `GOOGLE_PROJECT` - The name of the project to deploy test resources into.
1. `GOOGLE_REGION` - The name of the region to deploy test resources into.
1. `GOOGLE_ZONE` - The name of the zone within the chosen region to deploy
test resources into.

The integration tests do try to clean up after themselves by deleting everything that was
created, but in the event of bugs or test failures you may need to go into the Google Cloud portal
and delete resources yourself.

Once you have set all required environment variables and configured your GCP credentials, `make test_all` will run all integration tests.
