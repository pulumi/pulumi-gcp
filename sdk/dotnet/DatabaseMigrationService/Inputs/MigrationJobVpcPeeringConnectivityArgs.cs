// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DatabaseMigrationService.Inputs
{

    public sealed class MigrationJobVpcPeeringConnectivityArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the VPC network to peer with the Cloud SQL private network.
        /// </summary>
        [Input("vpc")]
        public Input<string>? Vpc { get; set; }

        public MigrationJobVpcPeeringConnectivityArgs()
        {
        }
        public static new MigrationJobVpcPeeringConnectivityArgs Empty => new MigrationJobVpcPeeringConnectivityArgs();
    }
}
