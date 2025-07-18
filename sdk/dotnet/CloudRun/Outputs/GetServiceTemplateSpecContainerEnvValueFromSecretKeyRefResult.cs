// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRun.Outputs
{

    [OutputType]
    public sealed class GetServiceTemplateSpecContainerEnvValueFromSecretKeyRefResult
    {
        /// <summary>
        /// A Cloud Secret Manager secret version. Must be 'latest' for the latest
        /// version or an integer for a specific version.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// The name of the Cloud Run Service.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetServiceTemplateSpecContainerEnvValueFromSecretKeyRefResult(
            string key,

            string name)
        {
            Key = key;
            Name = name;
        }
    }
}
