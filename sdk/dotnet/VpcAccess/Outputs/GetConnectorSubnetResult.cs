// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.VpcAccess.Outputs
{

    [OutputType]
    public sealed class GetConnectorSubnetResult
    {
        /// <summary>
        /// Name of the resource.
        /// </summary>
        public readonly string Name;
        public readonly string ProjectId;

        [OutputConstructor]
        private GetConnectorSubnetResult(
            string name,

            string projectId)
        {
            Name = name;
            ProjectId = projectId;
        }
    }
}