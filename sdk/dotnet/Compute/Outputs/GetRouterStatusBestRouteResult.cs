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
    public sealed class GetRouterStatusBestRouteResult
    {
        public readonly ImmutableArray<Outputs.GetRouterStatusBestRouteAsPathResult> AsPaths;
        /// <summary>
        /// Creation timestamp in RFC3339 text format.
        /// </summary>
        public readonly string CreationTimestamp;
        /// <summary>
        /// An optional description of this resource. Provide this property
        /// when you create the resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The destination range of outgoing packets that this route applies to.
        /// Only IPv4 is supported.
        /// </summary>
        public readonly string DestRange;
        /// <summary>
        /// The name of the router.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The network name or resource link to the parent
        /// network of this subnetwork.
        /// </summary>
        public readonly string Network;
        /// <summary>
        /// URL to a gateway that should handle matching packets.
        /// Currently, you can only specify the internet gateway, using a full or
        /// partial valid URL:
        /// * 'https://www.googleapis.com/compute/v1/projects/project/global/gateways/default-internet-gateway'
        /// * 'projects/project/global/gateways/default-internet-gateway'
        /// * 'global/gateways/default-internet-gateway'
        /// * The string 'default-internet-gateway'.
        /// </summary>
        public readonly string NextHopGateway;
        /// <summary>
        /// The hub network that should handle matching packets, which should conform to RFC1035.
        /// </summary>
        public readonly string NextHopHub;
        /// <summary>
        /// The IP address or URL to a forwarding rule of type
        /// loadBalancingScheme=INTERNAL that should handle matching
        /// packets.
        /// 
        /// With the GA provider you can only specify the forwarding
        /// rule as a partial or full URL. For example, the following
        /// are all valid values:
        /// * 10.128.0.56
        /// * https://www.googleapis.com/compute/v1/projects/project/regions/region/forwardingRules/forwardingRule
        /// * regions/region/forwardingRules/forwardingRule
        /// 
        /// When the beta provider, you can also specify the IP address
        /// of a forwarding rule from the same VPC or any peered VPC.
        /// 
        /// Note that this can only be used when the destinationRange is
        /// a public (non-RFC 1918) IP CIDR range.
        /// </summary>
        public readonly string NextHopIlb;
        /// <summary>
        /// URL to an instance that should handle matching packets.
        /// You can specify this as a full or partial URL. For example:
        /// * 'https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance'
        /// * 'projects/project/zones/zone/instances/instance'
        /// * 'zones/zone/instances/instance'
        /// * Just the instance name, with the zone in 'next_hop_instance_zone'.
        /// </summary>
        public readonly string NextHopInstance;
        /// <summary>
        /// The zone of the instance specified in next_hop_instance. Omit if next_hop_instance is specified as a URL.
        /// </summary>
        public readonly string NextHopInstanceZone;
        /// <summary>
        /// Internal fixed region-to-region cost that Google Cloud calculates based on factors such as network performance, distance, and available bandwidth between regions.
        /// </summary>
        public readonly string NextHopInterRegionCost;
        /// <summary>
        /// Network IP address of an instance that should handle matching packets.
        /// </summary>
        public readonly string NextHopIp;
        /// <summary>
        /// Multi-Exit Discriminator, a BGP route metric that indicates the desirability of a particular route in a network.
        /// </summary>
        public readonly string NextHopMed;
        /// <summary>
        /// URL to a Network that should handle matching packets.
        /// </summary>
        public readonly string NextHopNetwork;
        /// <summary>
        /// Indicates the origin of the route. Can be IGP (Interior Gateway Protocol), EGP (Exterior Gateway Protocol), or INCOMPLETE.
        /// </summary>
        public readonly string NextHopOrigin;
        /// <summary>
        /// The network peering name that should handle matching packets, which should conform to RFC1035.
        /// </summary>
        public readonly string NextHopPeering;
        /// <summary>
        /// URL to a VpnTunnel that should handle matching packets.
        /// </summary>
        public readonly string NextHopVpnTunnel;
        /// <summary>
        /// Additional params passed with the request, but not persisted as part of resource payload
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRouterStatusBestRouteParamResult> Params;
        /// <summary>
        /// The priority of this route. Priority is used to break ties in cases
        /// where there is more than one matching route of equal prefix length.
        /// 
        /// In the case of two routes with equal prefix length, the one with the
        /// lowest-numbered priority value wins.
        /// 
        /// Default value is 1000. Valid range is 0 through 65535.
        /// </summary>
        public readonly int Priority;
        /// <summary>
        /// The ID of the project in which the resource
        /// belongs. If it is not provided, the provider project is used.
        /// </summary>
        public readonly string Project;
        /// <summary>
        /// The status of the route, which can be one of the following values:
        /// - 'ACTIVE' for an active route
        /// - 'INACTIVE' for an inactive route
        /// </summary>
        public readonly string RouteStatus;
        /// <summary>
        /// The type of this route, which can be one of the following values:
        /// - 'TRANSIT' for a transit route that this router learned from another Cloud Router and will readvertise to one of its BGP peers
        /// - 'SUBNET' for a route from a subnet of the VPC
        /// - 'BGP' for a route learned from a BGP peer of this router
        /// - 'STATIC' for a static route
        /// </summary>
        public readonly string RouteType;
        public readonly string SelfLink;
        /// <summary>
        /// A list of instance tags to which this route applies.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// If potential misconfigurations are detected for this route, this field will be populated with warning messages.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRouterStatusBestRouteWarningResult> Warnings;

        [OutputConstructor]
        private GetRouterStatusBestRouteResult(
            ImmutableArray<Outputs.GetRouterStatusBestRouteAsPathResult> asPaths,

            string creationTimestamp,

            string description,

            string destRange,

            string name,

            string network,

            string nextHopGateway,

            string nextHopHub,

            string nextHopIlb,

            string nextHopInstance,

            string nextHopInstanceZone,

            string nextHopInterRegionCost,

            string nextHopIp,

            string nextHopMed,

            string nextHopNetwork,

            string nextHopOrigin,

            string nextHopPeering,

            string nextHopVpnTunnel,

            ImmutableArray<Outputs.GetRouterStatusBestRouteParamResult> @params,

            int priority,

            string project,

            string routeStatus,

            string routeType,

            string selfLink,

            ImmutableArray<string> tags,

            ImmutableArray<Outputs.GetRouterStatusBestRouteWarningResult> warnings)
        {
            AsPaths = asPaths;
            CreationTimestamp = creationTimestamp;
            Description = description;
            DestRange = destRange;
            Name = name;
            Network = network;
            NextHopGateway = nextHopGateway;
            NextHopHub = nextHopHub;
            NextHopIlb = nextHopIlb;
            NextHopInstance = nextHopInstance;
            NextHopInstanceZone = nextHopInstanceZone;
            NextHopInterRegionCost = nextHopInterRegionCost;
            NextHopIp = nextHopIp;
            NextHopMed = nextHopMed;
            NextHopNetwork = nextHopNetwork;
            NextHopOrigin = nextHopOrigin;
            NextHopPeering = nextHopPeering;
            NextHopVpnTunnel = nextHopVpnTunnel;
            Params = @params;
            Priority = priority;
            Project = project;
            RouteStatus = routeStatus;
            RouteType = routeType;
            SelfLink = selfLink;
            Tags = tags;
            Warnings = warnings;
        }
    }
}
