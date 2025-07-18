// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.EdgeContainer
{
    /// <summary>
    /// A VPN connection
    /// 
    /// To get more information about VpnConnection, see:
    /// 
    /// * [API documentation](https://cloud.google.com/distributed-cloud/edge/latest/docs/reference/container/rest/v1/projects.locations.vpnConnections)
    /// * How-to Guides
    ///     * [Google Distributed Cloud Edge](https://cloud.google.com/distributed-cloud/edge/latest/docs)
    /// 
    /// ## Example Usage
    /// 
    /// ### Edgecontainer Vpn Connection
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = Gcp.Organizations.GetProject.Invoke();
    /// 
    ///     var cluster = new Gcp.EdgeContainer.Cluster("cluster", new()
    ///     {
    ///         Name = "default",
    ///         Location = "us-central1",
    ///         Authorization = new Gcp.EdgeContainer.Inputs.ClusterAuthorizationArgs
    ///         {
    ///             AdminUsers = new Gcp.EdgeContainer.Inputs.ClusterAuthorizationAdminUsersArgs
    ///             {
    ///                 Username = "admin@hashicorptest.com",
    ///             },
    ///         },
    ///         Networking = new Gcp.EdgeContainer.Inputs.ClusterNetworkingArgs
    ///         {
    ///             ClusterIpv4CidrBlocks = new[]
    ///             {
    ///                 "10.0.0.0/16",
    ///             },
    ///             ServicesIpv4CidrBlocks = new[]
    ///             {
    ///                 "10.1.0.0/16",
    ///             },
    ///         },
    ///         Fleet = new Gcp.EdgeContainer.Inputs.ClusterFleetArgs
    ///         {
    ///             Project = $"projects/{project.Apply(getProjectResult =&gt; getProjectResult.Number)}",
    ///         },
    ///     });
    /// 
    ///     var nodePool = new Gcp.EdgeContainer.NodePool("node_pool", new()
    ///     {
    ///         Name = "nodepool-1",
    ///         Cluster = cluster.Name,
    ///         Location = "us-central1",
    ///         NodeLocation = "us-central1-edge-example-edgesite",
    ///         NodeCount = 3,
    ///     });
    /// 
    ///     var vpc = new Gcp.Compute.Network("vpc", new()
    ///     {
    ///         Name = "example-vpc",
    ///     });
    /// 
    ///     var @default = new Gcp.EdgeContainer.VpnConnection("default", new()
    ///     {
    ///         Name = "vpn-connection-1",
    ///         Location = "us-central1",
    ///         Cluster = Output.Tuple(project, cluster.Name).Apply(values =&gt;
    ///         {
    ///             var project = values.Item1;
    ///             var name = values.Item2;
    ///             return $"projects/{project.Apply(getProjectResult =&gt; getProjectResult.Number)}/locations/us-east1/clusters/{name}";
    ///         }),
    ///         Vpc = vpc.Name,
    ///         EnableHighAvailability = true,
    ///         Labels = 
    ///         {
    ///             { "my_key", "my_val" },
    ///             { "other_key", "other_val" },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             nodePool,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// VpnConnection can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/vpnConnections/{{name}}`
    /// 
    /// * `{{project}}/{{location}}/{{name}}`
    /// 
    /// * `{{location}}/{{name}}`
    /// 
    /// When using the `pulumi import` command, VpnConnection can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:edgecontainer/vpnConnection:VpnConnection default projects/{{project}}/locations/{{location}}/vpnConnections/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:edgecontainer/vpnConnection:VpnConnection default {{project}}/{{location}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:edgecontainer/vpnConnection:VpnConnection default {{location}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:edgecontainer/vpnConnection:VpnConnection")]
    public partial class VpnConnection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The canonical Cluster name to connect to. It is in the form of projects/{project}/locations/{location}/clusters/{cluster}.
        /// </summary>
        [Output("cluster")]
        public Output<string> Cluster { get; private set; } = null!;

        /// <summary>
        /// The time when the VPN connection was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// A nested object resource.
        /// Structure is documented below.
        /// </summary>
        [Output("details")]
        public Output<ImmutableArray<Outputs.VpnConnectionDetail>> Details { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// Whether this VPN connection has HA enabled on cluster side. If enabled, when creating VPN connection we will attempt to use 2 ANG floating IPs.
        /// </summary>
        [Output("enableHighAvailability")]
        public Output<bool> EnableHighAvailability { get; private set; } = null!;

        /// <summary>
        /// Labels associated with this resource.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// Google Cloud Platform location.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The resource name of VPN connection
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// NAT gateway IP, or WAN IP address. If a customer has multiple NAT IPs, the customer needs to configure NAT such that only one external IP maps to the GMEC Anthos cluster.
        /// This is empty if NAT is not used.
        /// </summary>
        [Output("natGatewayIp")]
        public Output<string?> NatGatewayIp { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The combination of labels configured directly on the resource
        /// and default labels configured on the provider.
        /// </summary>
        [Output("pulumiLabels")]
        public Output<ImmutableDictionary<string, string>> PulumiLabels { get; private set; } = null!;

        /// <summary>
        /// The VPN connection Cloud Router name.
        /// </summary>
        [Output("router")]
        public Output<string?> Router { get; private set; } = null!;

        /// <summary>
        /// The time when the VPN connection was last updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;

        /// <summary>
        /// The network ID of VPC to connect to.
        /// </summary>
        [Output("vpc")]
        public Output<string?> Vpc { get; private set; } = null!;

        /// <summary>
        /// Project detail of the VPC network. Required if VPC is in a different project than the cluster project.
        /// Structure is documented below.
        /// </summary>
        [Output("vpcProject")]
        public Output<Outputs.VpnConnectionVpcProject?> VpcProject { get; private set; } = null!;


        /// <summary>
        /// Create a VpnConnection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpnConnection(string name, VpnConnectionArgs args, CustomResourceOptions? options = null)
            : base("gcp:edgecontainer/vpnConnection:VpnConnection", name, args ?? new VpnConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpnConnection(string name, Input<string> id, VpnConnectionState? state = null, CustomResourceOptions? options = null)
            : base("gcp:edgecontainer/vpnConnection:VpnConnection", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "effectiveLabels",
                    "pulumiLabels",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing VpnConnection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpnConnection Get(string name, Input<string> id, VpnConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new VpnConnection(name, id, state, options);
        }
    }

    public sealed class VpnConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The canonical Cluster name to connect to. It is in the form of projects/{project}/locations/{location}/clusters/{cluster}.
        /// </summary>
        [Input("cluster", required: true)]
        public Input<string> Cluster { get; set; } = null!;

        /// <summary>
        /// Whether this VPN connection has HA enabled on cluster side. If enabled, when creating VPN connection we will attempt to use 2 ANG floating IPs.
        /// </summary>
        [Input("enableHighAvailability")]
        public Input<bool>? EnableHighAvailability { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels associated with this resource.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Google Cloud Platform location.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The resource name of VPN connection
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// NAT gateway IP, or WAN IP address. If a customer has multiple NAT IPs, the customer needs to configure NAT such that only one external IP maps to the GMEC Anthos cluster.
        /// This is empty if NAT is not used.
        /// </summary>
        [Input("natGatewayIp")]
        public Input<string>? NatGatewayIp { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The VPN connection Cloud Router name.
        /// </summary>
        [Input("router")]
        public Input<string>? Router { get; set; }

        /// <summary>
        /// The network ID of VPC to connect to.
        /// </summary>
        [Input("vpc")]
        public Input<string>? Vpc { get; set; }

        /// <summary>
        /// Project detail of the VPC network. Required if VPC is in a different project than the cluster project.
        /// Structure is documented below.
        /// </summary>
        [Input("vpcProject")]
        public Input<Inputs.VpnConnectionVpcProjectArgs>? VpcProject { get; set; }

        public VpnConnectionArgs()
        {
        }
        public static new VpnConnectionArgs Empty => new VpnConnectionArgs();
    }

    public sealed class VpnConnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The canonical Cluster name to connect to. It is in the form of projects/{project}/locations/{location}/clusters/{cluster}.
        /// </summary>
        [Input("cluster")]
        public Input<string>? Cluster { get; set; }

        /// <summary>
        /// The time when the VPN connection was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        [Input("details")]
        private InputList<Inputs.VpnConnectionDetailGetArgs>? _details;

        /// <summary>
        /// A nested object resource.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.VpnConnectionDetailGetArgs> Details
        {
            get => _details ?? (_details = new InputList<Inputs.VpnConnectionDetailGetArgs>());
            set => _details = value;
        }

        [Input("effectiveLabels")]
        private InputMap<string>? _effectiveLabels;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        public InputMap<string> EffectiveLabels
        {
            get => _effectiveLabels ?? (_effectiveLabels = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _effectiveLabels = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// Whether this VPN connection has HA enabled on cluster side. If enabled, when creating VPN connection we will attempt to use 2 ANG floating IPs.
        /// </summary>
        [Input("enableHighAvailability")]
        public Input<bool>? EnableHighAvailability { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels associated with this resource.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Google Cloud Platform location.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The resource name of VPN connection
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// NAT gateway IP, or WAN IP address. If a customer has multiple NAT IPs, the customer needs to configure NAT such that only one external IP maps to the GMEC Anthos cluster.
        /// This is empty if NAT is not used.
        /// </summary>
        [Input("natGatewayIp")]
        public Input<string>? NatGatewayIp { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("pulumiLabels")]
        private InputMap<string>? _pulumiLabels;

        /// <summary>
        /// The combination of labels configured directly on the resource
        /// and default labels configured on the provider.
        /// </summary>
        public InputMap<string> PulumiLabels
        {
            get => _pulumiLabels ?? (_pulumiLabels = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _pulumiLabels = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// The VPN connection Cloud Router name.
        /// </summary>
        [Input("router")]
        public Input<string>? Router { get; set; }

        /// <summary>
        /// The time when the VPN connection was last updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        /// <summary>
        /// The network ID of VPC to connect to.
        /// </summary>
        [Input("vpc")]
        public Input<string>? Vpc { get; set; }

        /// <summary>
        /// Project detail of the VPC network. Required if VPC is in a different project than the cluster project.
        /// Structure is documented below.
        /// </summary>
        [Input("vpcProject")]
        public Input<Inputs.VpnConnectionVpcProjectGetArgs>? VpcProject { get; set; }

        public VpnConnectionState()
        {
        }
        public static new VpnConnectionState Empty => new VpnConnectionState();
    }
}
