// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Inputs
{

    public sealed class WorkerPoolTemplateContainerEnvValueSourceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Selects a secret and a specific version from Cloud Secret Manager.
        /// Structure is documented below.
        /// </summary>
        [Input("secretKeyRef")]
        public Input<Inputs.WorkerPoolTemplateContainerEnvValueSourceSecretKeyRefGetArgs>? SecretKeyRef { get; set; }

        public WorkerPoolTemplateContainerEnvValueSourceGetArgs()
        {
        }
        public static new WorkerPoolTemplateContainerEnvValueSourceGetArgs Empty => new WorkerPoolTemplateContainerEnvValueSourceGetArgs();
    }
}
