// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Workstations.Inputs
{

    public sealed class WorkstationConfigHostGceInstanceConfidentialInstanceConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the instance has confidential compute enabled.
        /// </summary>
        [Input("enableConfidentialCompute")]
        public Input<bool>? EnableConfidentialCompute { get; set; }

        public WorkstationConfigHostGceInstanceConfidentialInstanceConfigGetArgs()
        {
        }
        public static new WorkstationConfigHostGceInstanceConfidentialInstanceConfigGetArgs Empty => new WorkstationConfigHostGceInstanceConfidentialInstanceConfigGetArgs();
    }
}