// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkServices.Outputs
{

    [OutputType]
    public sealed class EdgeCacheOriginAwsV4Authentication
    {
        /// <summary>
        /// The access key ID your origin uses to identify the key.
        /// </summary>
        public readonly string AccessKeyId;
        /// <summary>
        /// The name of the AWS region that your origin is in.
        /// </summary>
        public readonly string OriginRegion;
        /// <summary>
        /// The Secret Manager secret version of the secret access key used by your origin.
        /// This is the resource name of the secret version in the format `projects/*/secrets/*/versions/*` where the `*` values are replaced by the project, secret, and version you require.
        /// </summary>
        public readonly string SecretAccessKeyVersion;

        [OutputConstructor]
        private EdgeCacheOriginAwsV4Authentication(
            string accessKeyId,

            string originRegion,

            string secretAccessKeyVersion)
        {
            AccessKeyId = accessKeyId;
            OriginRegion = originRegion;
            SecretAccessKeyVersion = secretAccessKeyVersion;
        }
    }
}