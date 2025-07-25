// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    /// <summary>
    /// Packet Mirroring mirrors traffic to and from particular VM instances.
    /// You can use the collected traffic to help you detect security threats
    /// and monitor application performance.
    /// 
    /// To get more information about PacketMirroring, see:
    /// 
    /// * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/packetMirrorings)
    /// * How-to Guides
    ///     * [Using Packet Mirroring](https://cloud.google.com/vpc/docs/using-packet-mirroring#creating)
    /// 
    /// ## Example Usage
    /// 
    /// ### Compute Packet Mirroring Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Gcp.Compute.Network("default", new()
    ///     {
    ///         Name = "my-network",
    ///     });
    /// 
    ///     var mirror = new Gcp.Compute.Instance("mirror", new()
    ///     {
    ///         NetworkInterfaces = new[]
    ///         {
    ///             new Gcp.Compute.Inputs.InstanceNetworkInterfaceArgs
    ///             {
    ///                 AccessConfigs = new[]
    ///                 {
    ///                     null,
    ///                 },
    ///                 Network = @default.Id,
    ///             },
    ///         },
    ///         Name = "my-instance",
    ///         MachineType = "e2-medium",
    ///         BootDisk = new Gcp.Compute.Inputs.InstanceBootDiskArgs
    ///         {
    ///             InitializeParams = new Gcp.Compute.Inputs.InstanceBootDiskInitializeParamsArgs
    ///             {
    ///                 Image = "debian-cloud/debian-11",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var defaultSubnetwork = new Gcp.Compute.Subnetwork("default", new()
    ///     {
    ///         Name = "my-subnetwork",
    ///         Network = @default.Id,
    ///         IpCidrRange = "10.2.0.0/16",
    ///     });
    /// 
    ///     var defaultHealthCheck = new Gcp.Compute.HealthCheck("default", new()
    ///     {
    ///         Name = "my-healthcheck",
    ///         CheckIntervalSec = 1,
    ///         TimeoutSec = 1,
    ///         TcpHealthCheck = new Gcp.Compute.Inputs.HealthCheckTcpHealthCheckArgs
    ///         {
    ///             Port = 80,
    ///         },
    ///     });
    /// 
    ///     var defaultRegionBackendService = new Gcp.Compute.RegionBackendService("default", new()
    ///     {
    ///         Name = "my-service",
    ///         HealthChecks = defaultHealthCheck.Id,
    ///     });
    /// 
    ///     var defaultForwardingRule = new Gcp.Compute.ForwardingRule("default", new()
    ///     {
    ///         Name = "my-ilb",
    ///         IsMirroringCollector = true,
    ///         IpProtocol = "TCP",
    ///         LoadBalancingScheme = "INTERNAL",
    ///         BackendService = defaultRegionBackendService.Id,
    ///         AllPorts = true,
    ///         Network = @default.Id,
    ///         Subnetwork = defaultSubnetwork.Id,
    ///         NetworkTier = "PREMIUM",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             defaultSubnetwork,
    ///         },
    ///     });
    /// 
    ///     var foobar = new Gcp.Compute.PacketMirroring("foobar", new()
    ///     {
    ///         Name = "my-mirroring",
    ///         Description = "bar",
    ///         Network = new Gcp.Compute.Inputs.PacketMirroringNetworkArgs
    ///         {
    ///             Url = @default.Id,
    ///         },
    ///         CollectorIlb = new Gcp.Compute.Inputs.PacketMirroringCollectorIlbArgs
    ///         {
    ///             Url = defaultForwardingRule.Id,
    ///         },
    ///         MirroredResources = new Gcp.Compute.Inputs.PacketMirroringMirroredResourcesArgs
    ///         {
    ///             Tags = new[]
    ///             {
    ///                 "foo",
    ///             },
    ///             Instances = new[]
    ///             {
    ///                 new Gcp.Compute.Inputs.PacketMirroringMirroredResourcesInstanceArgs
    ///                 {
    ///                     Url = mirror.Id,
    ///                 },
    ///             },
    ///         },
    ///         Filter = new Gcp.Compute.Inputs.PacketMirroringFilterArgs
    ///         {
    ///             IpProtocols = new[]
    ///             {
    ///                 "tcp",
    ///             },
    ///             CidrRanges = new[]
    ///             {
    ///                 "0.0.0.0/0",
    ///             },
    ///             Direction = "BOTH",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// PacketMirroring can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/regions/{{region}}/packetMirrorings/{{name}}`
    /// 
    /// * `{{project}}/{{region}}/{{name}}`
    /// 
    /// * `{{region}}/{{name}}`
    /// 
    /// * `{{name}}`
    /// 
    /// When using the `pulumi import` command, PacketMirroring can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/packetMirroring:PacketMirroring default projects/{{project}}/regions/{{region}}/packetMirrorings/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/packetMirroring:PacketMirroring default {{project}}/{{region}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/packetMirroring:PacketMirroring default {{region}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/packetMirroring:PacketMirroring default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:compute/packetMirroring:PacketMirroring")]
    public partial class PacketMirroring : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Forwarding Rule resource (of type load_balancing_scheme=INTERNAL)
        /// that will be used as collector for mirrored traffic. The
        /// specified forwarding rule must have is_mirroring_collector
        /// set to true.
        /// Structure is documented below.
        /// </summary>
        [Output("collectorIlb")]
        public Output<Outputs.PacketMirroringCollectorIlb> CollectorIlb { get; private set; } = null!;

        /// <summary>
        /// A human-readable description of the rule.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A filter for mirrored traffic.  If unset, all traffic is mirrored.
        /// Structure is documented below.
        /// </summary>
        [Output("filter")]
        public Output<Outputs.PacketMirroringFilter?> Filter { get; private set; } = null!;

        /// <summary>
        /// A means of specifying which resources to mirror.
        /// Structure is documented below.
        /// </summary>
        [Output("mirroredResources")]
        public Output<Outputs.PacketMirroringMirroredResources> MirroredResources { get; private set; } = null!;

        /// <summary>
        /// The name of the packet mirroring rule
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the mirrored VPC network. Only packets in this network
        /// will be mirrored. All mirrored VMs should have a NIC in the given
        /// network. All mirrored subnetworks should belong to the given network.
        /// Structure is documented below.
        /// </summary>
        [Output("network")]
        public Output<Outputs.PacketMirroringNetwork> Network { get; private set; } = null!;

        /// <summary>
        /// Since only one rule can be active at a time, priority is
        /// used to break ties in the case of two rules that apply to
        /// the same instances.
        /// </summary>
        [Output("priority")]
        public Output<int> Priority { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The Region in which the created address should reside.
        /// If it is not provided, the provider region is used.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;


        /// <summary>
        /// Create a PacketMirroring resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PacketMirroring(string name, PacketMirroringArgs args, CustomResourceOptions? options = null)
            : base("gcp:compute/packetMirroring:PacketMirroring", name, args ?? new PacketMirroringArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PacketMirroring(string name, Input<string> id, PacketMirroringState? state = null, CustomResourceOptions? options = null)
            : base("gcp:compute/packetMirroring:PacketMirroring", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing PacketMirroring resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PacketMirroring Get(string name, Input<string> id, PacketMirroringState? state = null, CustomResourceOptions? options = null)
        {
            return new PacketMirroring(name, id, state, options);
        }
    }

    public sealed class PacketMirroringArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Forwarding Rule resource (of type load_balancing_scheme=INTERNAL)
        /// that will be used as collector for mirrored traffic. The
        /// specified forwarding rule must have is_mirroring_collector
        /// set to true.
        /// Structure is documented below.
        /// </summary>
        [Input("collectorIlb", required: true)]
        public Input<Inputs.PacketMirroringCollectorIlbArgs> CollectorIlb { get; set; } = null!;

        /// <summary>
        /// A human-readable description of the rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A filter for mirrored traffic.  If unset, all traffic is mirrored.
        /// Structure is documented below.
        /// </summary>
        [Input("filter")]
        public Input<Inputs.PacketMirroringFilterArgs>? Filter { get; set; }

        /// <summary>
        /// A means of specifying which resources to mirror.
        /// Structure is documented below.
        /// </summary>
        [Input("mirroredResources", required: true)]
        public Input<Inputs.PacketMirroringMirroredResourcesArgs> MirroredResources { get; set; } = null!;

        /// <summary>
        /// The name of the packet mirroring rule
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the mirrored VPC network. Only packets in this network
        /// will be mirrored. All mirrored VMs should have a NIC in the given
        /// network. All mirrored subnetworks should belong to the given network.
        /// Structure is documented below.
        /// </summary>
        [Input("network", required: true)]
        public Input<Inputs.PacketMirroringNetworkArgs> Network { get; set; } = null!;

        /// <summary>
        /// Since only one rule can be active at a time, priority is
        /// used to break ties in the case of two rules that apply to
        /// the same instances.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The Region in which the created address should reside.
        /// If it is not provided, the provider region is used.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public PacketMirroringArgs()
        {
        }
        public static new PacketMirroringArgs Empty => new PacketMirroringArgs();
    }

    public sealed class PacketMirroringState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Forwarding Rule resource (of type load_balancing_scheme=INTERNAL)
        /// that will be used as collector for mirrored traffic. The
        /// specified forwarding rule must have is_mirroring_collector
        /// set to true.
        /// Structure is documented below.
        /// </summary>
        [Input("collectorIlb")]
        public Input<Inputs.PacketMirroringCollectorIlbGetArgs>? CollectorIlb { get; set; }

        /// <summary>
        /// A human-readable description of the rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A filter for mirrored traffic.  If unset, all traffic is mirrored.
        /// Structure is documented below.
        /// </summary>
        [Input("filter")]
        public Input<Inputs.PacketMirroringFilterGetArgs>? Filter { get; set; }

        /// <summary>
        /// A means of specifying which resources to mirror.
        /// Structure is documented below.
        /// </summary>
        [Input("mirroredResources")]
        public Input<Inputs.PacketMirroringMirroredResourcesGetArgs>? MirroredResources { get; set; }

        /// <summary>
        /// The name of the packet mirroring rule
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the mirrored VPC network. Only packets in this network
        /// will be mirrored. All mirrored VMs should have a NIC in the given
        /// network. All mirrored subnetworks should belong to the given network.
        /// Structure is documented below.
        /// </summary>
        [Input("network")]
        public Input<Inputs.PacketMirroringNetworkGetArgs>? Network { get; set; }

        /// <summary>
        /// Since only one rule can be active at a time, priority is
        /// used to break ties in the case of two rules that apply to
        /// the same instances.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The Region in which the created address should reside.
        /// If it is not provided, the provider region is used.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public PacketMirroringState()
        {
        }
        public static new PacketMirroringState Empty => new PacketMirroringState();
    }
}
