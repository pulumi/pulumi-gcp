// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dns.Inputs
{

    public sealed class RecordSetRoutingPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to enable fencing for geo queries.
        /// </summary>
        [Input("enableGeoFencing")]
        public Input<bool>? EnableGeoFencing { get; set; }

        [Input("geos")]
        private InputList<Inputs.RecordSetRoutingPolicyGeoArgs>? _geos;

        /// <summary>
        /// The configuration for Geolocation based routing policy.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.RecordSetRoutingPolicyGeoArgs> Geos
        {
            get => _geos ?? (_geos = new InputList<Inputs.RecordSetRoutingPolicyGeoArgs>());
            set => _geos = value;
        }

        /// <summary>
        /// Specifies the health check (used with external endpoints).
        /// </summary>
        [Input("healthCheck")]
        public Input<string>? HealthCheck { get; set; }

        /// <summary>
        /// The configuration for a failover policy with global to regional failover. Queries are responded to with the global primary targets, but if none of the primary targets are healthy, then we fallback to a regional failover policy.
        /// Structure is documented below.
        /// </summary>
        [Input("primaryBackup")]
        public Input<Inputs.RecordSetRoutingPolicyPrimaryBackupArgs>? PrimaryBackup { get; set; }

        [Input("wrrs")]
        private InputList<Inputs.RecordSetRoutingPolicyWrrArgs>? _wrrs;

        /// <summary>
        /// The configuration for Weighted Round Robin based routing policy.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.RecordSetRoutingPolicyWrrArgs> Wrrs
        {
            get => _wrrs ?? (_wrrs = new InputList<Inputs.RecordSetRoutingPolicyWrrArgs>());
            set => _wrrs = value;
        }

        public RecordSetRoutingPolicyArgs()
        {
        }
        public static new RecordSetRoutingPolicyArgs Empty => new RecordSetRoutingPolicyArgs();
    }
}
