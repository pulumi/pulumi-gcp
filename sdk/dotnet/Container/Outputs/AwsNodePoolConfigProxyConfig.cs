// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class AwsNodePoolConfigProxyConfig
    {
        /// <summary>
        /// The ARN of the AWS Secret Manager secret that contains the HTTP(S) proxy configuration.
        /// </summary>
        public readonly string SecretArn;
        /// <summary>
        /// The version string of the AWS Secret Manager secret that contains the HTTP(S) proxy configuration.
        /// </summary>
        public readonly string SecretVersion;

        [OutputConstructor]
        private AwsNodePoolConfigProxyConfig(
            string secretArn,

            string secretVersion)
        {
            SecretArn = secretArn;
            SecretVersion = secretVersion;
        }
    }
}
