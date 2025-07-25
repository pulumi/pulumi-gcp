// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InstanceTemplateServiceAccountArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The service account e-mail address. If not given, the
        /// default Google Compute Engine service account is used.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        [Input("scopes", required: true)]
        private InputList<string>? _scopes;

        /// <summary>
        /// A list of service scopes. Both OAuth2 URLs and gcloud
        /// short names are supported. To allow full access to all Cloud APIs, use the
        /// `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
        /// 
        /// The [service accounts documentation](https://cloud.google.com/compute/docs/access/service-accounts#accesscopesiam)
        /// explains that access scopes are the legacy method of specifying permissions for your instance.
        /// To follow best practices you should create a dedicated service account with the minimum permissions the VM requires.
        /// To use a dedicated service account this field should be configured as a list containing the `cloud-platform` scope.
        /// See [Authenticate workloads using service accounts best practices](https://cloud.google.com/compute/docs/access/create-enable-service-accounts-for-instances#best_practices)
        /// and [Best practices for using service accounts](https://cloud.google.com/iam/docs/best-practices-service-accounts#single-purpose).
        /// </summary>
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        public InstanceTemplateServiceAccountArgs()
        {
        }
        public static new InstanceTemplateServiceAccountArgs Empty => new InstanceTemplateServiceAccountArgs();
    }
}
