// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dns
{
    /// <summary>
    /// A Response Policy is a collection of selectors that apply to queries
    /// made against one or more Virtual Private Cloud networks.
    /// 
    /// ## Example Usage
    /// 
    /// ### Dns Response Policy Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var network_1 = new Gcp.Compute.Network("network-1", new()
    ///     {
    ///         Name = "network-1",
    ///         AutoCreateSubnetworks = false,
    ///     });
    /// 
    ///     var network_2 = new Gcp.Compute.Network("network-2", new()
    ///     {
    ///         Name = "network-2",
    ///         AutoCreateSubnetworks = false,
    ///     });
    /// 
    ///     var subnetwork_1 = new Gcp.Compute.Subnetwork("subnetwork-1", new()
    ///     {
    ///         Name = network_1.Name,
    ///         Network = network_1.Name,
    ///         IpCidrRange = "10.0.36.0/24",
    ///         Region = "us-central1",
    ///         PrivateIpGoogleAccess = true,
    ///         SecondaryIpRanges = new[]
    ///         {
    ///             new Gcp.Compute.Inputs.SubnetworkSecondaryIpRangeArgs
    ///             {
    ///                 RangeName = "pod",
    ///                 IpCidrRange = "10.0.0.0/19",
    ///             },
    ///             new Gcp.Compute.Inputs.SubnetworkSecondaryIpRangeArgs
    ///             {
    ///                 RangeName = "svc",
    ///                 IpCidrRange = "10.0.32.0/22",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var cluster_1 = new Gcp.Container.Cluster("cluster-1", new()
    ///     {
    ///         Name = "cluster-1",
    ///         Location = "us-central1-c",
    ///         InitialNodeCount = 1,
    ///         NetworkingMode = "VPC_NATIVE",
    ///         DefaultSnatStatus = new Gcp.Container.Inputs.ClusterDefaultSnatStatusArgs
    ///         {
    ///             Disabled = true,
    ///         },
    ///         Network = network_1.Name,
    ///         Subnetwork = subnetwork_1.Name,
    ///         PrivateClusterConfig = new Gcp.Container.Inputs.ClusterPrivateClusterConfigArgs
    ///         {
    ///             EnablePrivateEndpoint = true,
    ///             EnablePrivateNodes = true,
    ///             MasterIpv4CidrBlock = "10.42.0.0/28",
    ///             MasterGlobalAccessConfig = new Gcp.Container.Inputs.ClusterPrivateClusterConfigMasterGlobalAccessConfigArgs
    ///             {
    ///                 Enabled = true,
    ///             },
    ///         },
    ///         MasterAuthorizedNetworksConfig = null,
    ///         IpAllocationPolicy = new Gcp.Container.Inputs.ClusterIpAllocationPolicyArgs
    ///         {
    ///             ClusterSecondaryRangeName = subnetwork_1.SecondaryIpRanges.Apply(secondaryIpRanges =&gt; secondaryIpRanges[0].RangeName),
    ///             ServicesSecondaryRangeName = subnetwork_1.SecondaryIpRanges.Apply(secondaryIpRanges =&gt; secondaryIpRanges[1].RangeName),
    ///         },
    ///         DeletionProtection = true,
    ///     });
    /// 
    ///     var example_response_policy = new Gcp.Dns.ResponsePolicy("example-response-policy", new()
    ///     {
    ///         ResponsePolicyName = "example-response-policy",
    ///         Networks = new[]
    ///         {
    ///             new Gcp.Dns.Inputs.ResponsePolicyNetworkArgs
    ///             {
    ///                 NetworkUrl = network_1.Id,
    ///             },
    ///             new Gcp.Dns.Inputs.ResponsePolicyNetworkArgs
    ///             {
    ///                 NetworkUrl = network_2.Id,
    ///             },
    ///         },
    ///         GkeClusters = new[]
    ///         {
    ///             new Gcp.Dns.Inputs.ResponsePolicyGkeClusterArgs
    ///             {
    ///                 GkeClusterName = cluster_1.Id,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ResponsePolicy can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/responsePolicies/{{response_policy_name}}`
    /// 
    /// * `{{project}}/{{response_policy_name}}`
    /// 
    /// * `{{response_policy_name}}`
    /// 
    /// When using the `pulumi import` command, ResponsePolicy can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:dns/responsePolicy:ResponsePolicy default projects/{{project}}/responsePolicies/{{response_policy_name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:dns/responsePolicy:ResponsePolicy default {{project}}/{{response_policy_name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:dns/responsePolicy:ResponsePolicy default {{response_policy_name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:dns/responsePolicy:ResponsePolicy")]
    public partial class ResponsePolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the response policy, such as `My new response policy`.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The list of Google Kubernetes Engine clusters that can see this zone.
        /// Structure is documented below.
        /// </summary>
        [Output("gkeClusters")]
        public Output<ImmutableArray<Outputs.ResponsePolicyGkeCluster>> GkeClusters { get; private set; } = null!;

        /// <summary>
        /// The list of network names specifying networks to which this policy is applied.
        /// Structure is documented below.
        /// </summary>
        [Output("networks")]
        public Output<ImmutableArray<Outputs.ResponsePolicyNetwork>> Networks { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The user assigned name for this Response Policy, such as `myresponsepolicy`.
        /// </summary>
        [Output("responsePolicyName")]
        public Output<string> ResponsePolicyName { get; private set; } = null!;


        /// <summary>
        /// Create a ResponsePolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResponsePolicy(string name, ResponsePolicyArgs args, CustomResourceOptions? options = null)
            : base("gcp:dns/responsePolicy:ResponsePolicy", name, args ?? new ResponsePolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResponsePolicy(string name, Input<string> id, ResponsePolicyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:dns/responsePolicy:ResponsePolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ResponsePolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResponsePolicy Get(string name, Input<string> id, ResponsePolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new ResponsePolicy(name, id, state, options);
        }
    }

    public sealed class ResponsePolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the response policy, such as `My new response policy`.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("gkeClusters")]
        private InputList<Inputs.ResponsePolicyGkeClusterArgs>? _gkeClusters;

        /// <summary>
        /// The list of Google Kubernetes Engine clusters that can see this zone.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ResponsePolicyGkeClusterArgs> GkeClusters
        {
            get => _gkeClusters ?? (_gkeClusters = new InputList<Inputs.ResponsePolicyGkeClusterArgs>());
            set => _gkeClusters = value;
        }

        [Input("networks")]
        private InputList<Inputs.ResponsePolicyNetworkArgs>? _networks;

        /// <summary>
        /// The list of network names specifying networks to which this policy is applied.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ResponsePolicyNetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.ResponsePolicyNetworkArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The user assigned name for this Response Policy, such as `myresponsepolicy`.
        /// </summary>
        [Input("responsePolicyName", required: true)]
        public Input<string> ResponsePolicyName { get; set; } = null!;

        public ResponsePolicyArgs()
        {
        }
        public static new ResponsePolicyArgs Empty => new ResponsePolicyArgs();
    }

    public sealed class ResponsePolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the response policy, such as `My new response policy`.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("gkeClusters")]
        private InputList<Inputs.ResponsePolicyGkeClusterGetArgs>? _gkeClusters;

        /// <summary>
        /// The list of Google Kubernetes Engine clusters that can see this zone.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ResponsePolicyGkeClusterGetArgs> GkeClusters
        {
            get => _gkeClusters ?? (_gkeClusters = new InputList<Inputs.ResponsePolicyGkeClusterGetArgs>());
            set => _gkeClusters = value;
        }

        [Input("networks")]
        private InputList<Inputs.ResponsePolicyNetworkGetArgs>? _networks;

        /// <summary>
        /// The list of network names specifying networks to which this policy is applied.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ResponsePolicyNetworkGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.ResponsePolicyNetworkGetArgs>());
            set => _networks = value;
        }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The user assigned name for this Response Policy, such as `myresponsepolicy`.
        /// </summary>
        [Input("responsePolicyName")]
        public Input<string>? ResponsePolicyName { get; set; }

        public ResponsePolicyState()
        {
        }
        public static new ResponsePolicyState Empty => new ResponsePolicyState();
    }
}
