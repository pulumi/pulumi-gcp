// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class AwsNodePoolConfigInstancePlacementGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The tenancy for the instance. Possible values: TENANCY_UNSPECIFIED, DEFAULT, DEDICATED, HOST
        /// </summary>
        [Input("tenancy")]
        public Input<string>? Tenancy { get; set; }

        public AwsNodePoolConfigInstancePlacementGetArgs()
        {
        }
        public static new AwsNodePoolConfigInstancePlacementGetArgs Empty => new AwsNodePoolConfigInstancePlacementGetArgs();
    }
}
