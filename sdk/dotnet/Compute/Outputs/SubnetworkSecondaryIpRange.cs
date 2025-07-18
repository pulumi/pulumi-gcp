// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class SubnetworkSecondaryIpRange
    {
        /// <summary>
        /// The range of IP addresses belonging to this subnetwork secondary
        /// range. Provide this property when you create the subnetwork.
        /// Ranges must be unique and non-overlapping with all primary and
        /// secondary IP ranges within a network. Only IPv4 is supported.
        /// Field is optional when `reserved_internal_range` is defined, otherwise required.
        /// </summary>
        public readonly string? IpCidrRange;
        /// <summary>
        /// The name associated with this subnetwork secondary range, used
        /// when adding an alias IP range to a VM instance. The name must
        /// be 1-63 characters long, and comply with RFC1035. The name
        /// must be unique within the subnetwork.
        /// </summary>
        public readonly string RangeName;
        /// <summary>
        /// The ID of the reserved internal range. Must be prefixed with `networkconnectivity.googleapis.com`
        /// E.g. `networkconnectivity.googleapis.com/projects/{project}/locations/global/internalRanges/{rangeId}`
        /// </summary>
        public readonly string? ReservedInternalRange;

        [OutputConstructor]
        private SubnetworkSecondaryIpRange(
            string? ipCidrRange,

            string rangeName,

            string? reservedInternalRange)
        {
            IpCidrRange = ipCidrRange;
            RangeName = rangeName;
            ReservedInternalRange = reservedInternalRange;
        }
    }
}
