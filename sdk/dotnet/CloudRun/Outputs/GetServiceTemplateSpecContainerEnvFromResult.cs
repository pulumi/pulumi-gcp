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
    public sealed class GetServiceTemplateSpecContainerEnvFromResult
    {
        /// <summary>
        /// The ConfigMap to select from.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceTemplateSpecContainerEnvFromConfigMapRefResult> ConfigMapReves;
        /// <summary>
        /// An optional identifier to prepend to each key in the ConfigMap.
        /// </summary>
        public readonly string Prefix;
        /// <summary>
        /// The Secret to select from.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceTemplateSpecContainerEnvFromSecretRefResult> SecretReves;

        [OutputConstructor]
        private GetServiceTemplateSpecContainerEnvFromResult(
            ImmutableArray<Outputs.GetServiceTemplateSpecContainerEnvFromConfigMapRefResult> configMapReves,

            string prefix,

            ImmutableArray<Outputs.GetServiceTemplateSpecContainerEnvFromSecretRefResult> secretReves)
        {
            ConfigMapReves = configMapReves;
            Prefix = prefix;
            SecretReves = secretReves;
        }
    }
}
