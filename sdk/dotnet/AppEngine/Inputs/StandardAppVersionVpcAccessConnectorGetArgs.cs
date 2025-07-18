// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AppEngine.Inputs
{

    public sealed class StandardAppVersionVpcAccessConnectorGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The egress setting for the connector, controlling what traffic is diverted through it.
        /// </summary>
        [Input("egressSetting")]
        public Input<string>? EgressSetting { get; set; }

        /// <summary>
        /// Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public StandardAppVersionVpcAccessConnectorGetArgs()
        {
        }
        public static new StandardAppVersionVpcAccessConnectorGetArgs Empty => new StandardAppVersionVpcAccessConnectorGetArgs();
    }
}
