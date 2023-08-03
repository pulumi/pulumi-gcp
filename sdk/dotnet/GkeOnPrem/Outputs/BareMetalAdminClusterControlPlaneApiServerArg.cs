// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem.Outputs
{

    [OutputType]
    public sealed class BareMetalAdminClusterControlPlaneApiServerArg
    {
        /// <summary>
        /// The argument name as it appears on the API Server command line please make sure to remove the leading dashes.
        /// </summary>
        public readonly string Argument;
        /// <summary>
        /// The value of the arg as it will be passed to the API Server command line.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private BareMetalAdminClusterControlPlaneApiServerArg(
            string argument,

            string value)
        {
            Argument = argument;
            Value = value;
        }
    }
}