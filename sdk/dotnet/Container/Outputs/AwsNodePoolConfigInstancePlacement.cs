// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class AwsNodePoolConfigInstancePlacement
    {
        /// <summary>
        /// The tenancy for the instance. Possible values: TENANCY_UNSPECIFIED, DEFAULT, DEDICATED, HOST
        /// </summary>
        public readonly string? Tenancy;

        [OutputConstructor]
        private AwsNodePoolConfigInstancePlacement(string? tenancy)
        {
            Tenancy = tenancy;
        }
    }
}