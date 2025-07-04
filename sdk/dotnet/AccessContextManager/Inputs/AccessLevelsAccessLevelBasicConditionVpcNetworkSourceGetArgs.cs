// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AccessContextManager.Inputs
{

    public sealed class AccessLevelsAccessLevelBasicConditionVpcNetworkSourceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Sub networks within a VPC network.
        /// Structure is documented below.
        /// </summary>
        [Input("vpcSubnetwork")]
        public Input<Inputs.AccessLevelsAccessLevelBasicConditionVpcNetworkSourceVpcSubnetworkGetArgs>? VpcSubnetwork { get; set; }

        public AccessLevelsAccessLevelBasicConditionVpcNetworkSourceGetArgs()
        {
        }
        public static new AccessLevelsAccessLevelBasicConditionVpcNetworkSourceGetArgs Empty => new AccessLevelsAccessLevelBasicConditionVpcNetworkSourceGetArgs();
    }
}
