// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Outputs
{

    [OutputType]
    public sealed class FeatureFleetDefaultMemberConfigMesh
    {
        /// <summary>
        /// Whether to automatically manage Service Mesh
        /// Possible values are: `MANAGEMENT_UNSPECIFIED`, `MANAGEMENT_AUTOMATIC`, `MANAGEMENT_MANUAL`.
        /// </summary>
        public readonly string Management;

        [OutputConstructor]
        private FeatureFleetDefaultMemberConfigMesh(string management)
        {
            Management = management;
        }
    }
}