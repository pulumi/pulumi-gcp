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
    public sealed class ServiceTemplateScaling
    {
        /// <summary>
        /// Maximum number of serving instances that this resource should have.
        /// </summary>
        public readonly int? MaxInstanceCount;
        /// <summary>
        /// Minimum number of serving instances that this resource should have.
        /// </summary>
        public readonly int? MinInstanceCount;

        [OutputConstructor]
        private ServiceTemplateScaling(
            int? maxInstanceCount,

            int? minInstanceCount)
        {
            MaxInstanceCount = maxInstanceCount;
            MinInstanceCount = minInstanceCount;
        }
    }
}