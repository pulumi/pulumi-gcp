// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InstanceGroupManagerResourcePoliciesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The URL of the workload policy that is specified for this managed instance group. It can be a full or partial URL.
        /// </summary>
        [Input("workloadPolicy")]
        public Input<string>? WorkloadPolicy { get; set; }

        public InstanceGroupManagerResourcePoliciesArgs()
        {
        }
        public static new InstanceGroupManagerResourcePoliciesArgs Empty => new InstanceGroupManagerResourcePoliciesArgs();
    }
}
