// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Sql.Inputs
{

    public sealed class DatabaseInstanceIpAddressGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IPv4 address assigned.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// The time this IP address will be retired, in RFC
        /// 3339 format.
        /// </summary>
        [Input("timeToRetire")]
        public Input<string>? TimeToRetire { get; set; }

        /// <summary>
        /// The type of this IP address.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DatabaseInstanceIpAddressGetArgs()
        {
        }
        public static new DatabaseInstanceIpAddressGetArgs Empty => new DatabaseInstanceIpAddressGetArgs();
    }
}
