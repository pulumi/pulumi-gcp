---
title: Google Cloud (GCP) Classic Installation & Configuration
meta_desc: How to set up credentials to use the Pulumi GCP Provider and choose configuration options to tailor the provider to suit your use case.
layout: package
---

## Installation

The Google Cloud (GCP) Classic provider is available as a package in all Pulumi languages:

* JavaScript/TypeScript: [`@pulumi/gcp`](https://www.npmjs.com/package/@pulumi/gcp)
* Python: [`pulumi-gcp`](https://pypi.org/project/pulumi-gcp/)
* Go: [`github.com/pulumi/pulumi-gcp/sdk/v7/go/gcp`](https://github.com/pulumi/pulumi-gcp)
* .NET: [`Pulumi.Gcp`](https://www.nuget.org/packages/Pulumi.Gcp)
* Java: [`com.pulumi.gcp`](https://search.maven.org/search?q=com.pulumi.gcp)

## Authentication Methods

To provision resources with the Pulumi Google Cloud Provider, you need to have Google credentials.

Pulumi can authenticate to Google Cloud via several methods:

* Google Cloud CLI
* OpenID Connect (OIDC)
* Service account

## Configuration

There are a few different ways you can configure your Google Cloud credentials to work with Pulumi.

### Authenticate using the CLI

{{% configure-gcp type="gcp" %}}

### Authenticate using a service account

If you are using Pulumi in a non-interactive setting (such as a CI/CD system) you will need to [configure and use a service account](/registry/packages/gcp/service-account) instead.

### Authenticate with dynamically generated credentials

In addition to configuring the GCP provider locally, you also have the option to centralize your configurations using [Pulumi ESC (Environments, Secrets, and Configuration)](/docs/pulumi-cloud/esc/). Using this service will enable you to run Pulumi CLI commands with dynamically generated credentials, removing the need to configure and manage your credentials locally.

To do this, you will need to complete the following steps:

#### Configure OIDC between Pulumi and GCP

Refer to the [Configuring OpenID Connect for GCP Guide](/docs/pulumi-cloud/oidc/gcp/) for the step-by-step process on how to do this. Once you have completed these steps, you can define and expose environment variables as shown below:

```yaml
values:
  gcp:
    login:
      fn::open::gcp-login:
        project: <your-project-id>
        oidc:
          workloadPoolId: <your-pool-id>
          providerId: <your-provider-id>
          serviceAccount: <your-service-account>
  environmentVariables:
    GOOGLE_OAUTH_ACCESS_TOKEN: ${gcp.login.accessToken}
    GOOGLE_PROJECT: ${gcp.login.project}
    GOOGLE_REGION: <your-region>
    GOOGLE_ZONE: <your-zone>
```

#### Import your environment

The last step is to update your project's stack settings file (`Pulumi.<stack-name>.yaml`) to import your ESC environment as shown below:

```yaml
environment:
  - <your-environment-name>
```

Make sure to replace `<your-environment-name>` with the name of the ESC environment you created in the previous steps.

You can test that your configuration is working by running the `pulumi preview` command. This will validate that your GCP resources can be deployed using the dynamically generated credentials in your environment file.

{{< notes type="info" >}}
Make sure that your local environment does not have GCP credentials configured before running this command. You can logout by running the `gcloud auth revoke` command.
{{< /notes >}}

To learn more about projecting environment variables in Pulumi ESC, refer to the [relevant Pulumi ESC documentation](/docs/pulumi-cloud/esc/environments/#projecting-environment-variables).

## Configuration options

Use `pulumi config set gcp:<option>` or pass options to the [constructor of `new gcp.Provider`](/registry/packages/gcp/api-docs/provider).

| Option | Required? |Description |
| - | - | - |
| `project` | Required | The ID of the project to apply any resources to. This can also be specified using any of the following environment variables (listed in order of precedence): `GOOGLE_PROJECT`, `GOOGLE_CLOUD_PROJECT`, `GCLOUD_PROJECT`, `CLOUDSDK_CORE_PROJECT`. |
| `region` | Optional | The region to operate under, if not specified by a given resource. This can also be specified using any of the following environment variables (listed in order of precedence): `GOOGLE_REGION`, `GCLOUD_REGION`, `CLOUDSDK_COMPUTE_REGION`. |
| `zone` | Optional | The zone to operate under, if not specified by a given resource.  This can also be specified using any of the following environment variables (listed in order of precedence): `GOOGLE_ZONE`, `GCLOUD_ZONE`, `CLOUDSDK_COMPUTE_ZONE`. |
| `credentials` | Optional | Contents of a file (or path to a file) that contains your [service account private key in JSON format](/registry/packages/gcp/service-account). Credentials can also be specified using any of the following environment variables (listed in order of precedence): `GOOGLE_APPLICATION_CREDENTIALS`, `GOOGLE_CLOUD_KEYFILE_JSON`, `GCLOUD_KEYFILE_JSON`. If no credentials are specified, the provider will fall back to using the Google Application Default Credentials. If you are running Pulumi from a GCE instance, see [Creating and Enabling Service Accounts for Instances](https://cloud.google.com/compute/docs/access/create-enable-service-accounts-for-instances) for details. |
| `accessToken` | Optional | A temporary OAuth 2.0 access token obtained from the Google Authorization server, i.e. the `Authorization: Bearer` token used to authenticate HTTP requests to GCP APIs. Alternative to `credentials`. Ignores the `scopes` field. |
| `scopes` | Optional | List of OAuth 2.0 [scopes](https://developers.google.com/identity/protocols/oauth2/scopes) requested when generating an access token using the service account key specified in `credentials`. Defaults: `https://www.googleapis.com/auth/cloud-platform` and `https://www.googleapis.com/auth/userinfo.email` |
| `impersonateServiceAccount` | Optional | Setting to impersonate a [Google service account](https://cloud.google.com/iam/docs/create-short-lived-credentials-direct) If you authenticate as a service account, Google Cloud derives your quota project and permissions from that service account rather than your primary authentication method. A valid primary authentication mechanism must be provided for the impersonation call, and your primary identity must have the `roles/iam.serviceAccountTokenCreator` role on the service account you are impersonating. This can also be specified by setting the `GOOGLE_IMPERSONATE_SERVICE_ACCOUNT` environment variable. |
| `disableGlobalProjectWarning` | Optional | Boolean setting to disable the warning when the Google global `project` is not set |
