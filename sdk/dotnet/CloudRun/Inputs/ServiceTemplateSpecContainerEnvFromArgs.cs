// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRun.Inputs
{

    public sealed class ServiceTemplateSpecContainerEnvFromArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ConfigMap to select from.
        /// Structure is documented below.
        /// </summary>
        [Input("configMapRef")]
        public Input<Inputs.ServiceTemplateSpecContainerEnvFromConfigMapRefArgs>? ConfigMapRef { get; set; }

        /// <summary>
        /// An optional identifier to prepend to each key in the ConfigMap.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// The Secret to select from.
        /// Structure is documented below.
        /// </summary>
        [Input("secretRef")]
        public Input<Inputs.ServiceTemplateSpecContainerEnvFromSecretRefArgs>? SecretRef { get; set; }

        public ServiceTemplateSpecContainerEnvFromArgs()
        {
        }
        public static new ServiceTemplateSpecContainerEnvFromArgs Empty => new ServiceTemplateSpecContainerEnvFromArgs();
    }
}
