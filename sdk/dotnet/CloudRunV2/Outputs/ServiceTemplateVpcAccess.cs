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
    public sealed class ServiceTemplateVpcAccess
    {
        /// <summary>
        /// VPC Access connector name. Format: projects/{project}/locations/{location}/connectors/{connector}, where {project} can be project id or number.
        /// </summary>
        public readonly string? Connector;
        /// <summary>
        /// Traffic VPC egress settings.
        /// Possible values are `ALL_TRAFFIC` and `PRIVATE_RANGES_ONLY`.
        /// </summary>
        public readonly string? Egress;

        [OutputConstructor]
        private ServiceTemplateVpcAccess(
            string? connector,

            string? egress)
        {
            Connector = connector;
            Egress = egress;
        }
    }
}