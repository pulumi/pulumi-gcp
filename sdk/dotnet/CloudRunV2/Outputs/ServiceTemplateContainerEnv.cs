// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Outputs
{

    [OutputType]
    public sealed class ServiceTemplateContainerEnv
    {
        /// <summary>
        /// Volume's name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The header field value
        /// </summary>
        public readonly string? Value;
        /// <summary>
        /// Source for the environment variable's value.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.ServiceTemplateContainerEnvValueSource? ValueSource;

        [OutputConstructor]
        private ServiceTemplateContainerEnv(
            string name,

            string? value,

            Outputs.ServiceTemplateContainerEnvValueSource? valueSource)
        {
            Name = name;
            Value = value;
            ValueSource = valueSource;
        }
    }
}