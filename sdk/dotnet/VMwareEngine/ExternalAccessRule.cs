// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.VMwareEngine
{
    /// <summary>
    /// External access firewall rules for filtering incoming traffic destined to `ExternalAddress` resources.
    /// 
    /// To get more information about ExternalAccessRule, see:
    /// 
    /// * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPolicies.externalAccessRules)
    /// 
    /// ## Example Usage
    /// 
    /// ### Vmware Engine External Access Rule Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var external_access_rule_nw = new Gcp.VMwareEngine.Network("external-access-rule-nw", new()
    ///     {
    ///         Name = "sample-nw",
    ///         Location = "global",
    ///         Type = "STANDARD",
    ///         Description = "PC network description.",
    ///     });
    /// 
    ///     var external_access_rule_np = new Gcp.VMwareEngine.NetworkPolicy("external-access-rule-np", new()
    ///     {
    ///         Location = "us-west1",
    ///         Name = "sample-np",
    ///         EdgeServicesCidr = "192.168.30.0/26",
    ///         VmwareEngineNetwork = external_access_rule_nw.Id,
    ///     });
    /// 
    ///     var vmw_engine_external_access_rule = new Gcp.VMwareEngine.ExternalAccessRule("vmw-engine-external-access-rule", new()
    ///     {
    ///         Name = "sample-external-access-rule",
    ///         Parent = external_access_rule_np.Id,
    ///         Priority = 101,
    ///         Action = "DENY",
    ///         IpProtocol = "TCP",
    ///         SourceIpRanges = new[]
    ///         {
    ///             new Gcp.VMwareEngine.Inputs.ExternalAccessRuleSourceIpRangeArgs
    ///             {
    ///                 IpAddressRange = "0.0.0.0/0",
    ///             },
    ///         },
    ///         SourcePorts = new[]
    ///         {
    ///             "80",
    ///         },
    ///         DestinationIpRanges = new[]
    ///         {
    ///             new Gcp.VMwareEngine.Inputs.ExternalAccessRuleDestinationIpRangeArgs
    ///             {
    ///                 IpAddressRange = "0.0.0.0/0",
    ///             },
    ///         },
    ///         DestinationPorts = new[]
    ///         {
    ///             "433",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Vmware Engine External Access Rule Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var external_access_rule_nw = new Gcp.VMwareEngine.Network("external-access-rule-nw", new()
    ///     {
    ///         Name = "sample-nw",
    ///         Location = "global",
    ///         Type = "STANDARD",
    ///         Description = "PC network description.",
    ///     });
    /// 
    ///     var external_access_rule_pc = new Gcp.VMwareEngine.PrivateCloud("external-access-rule-pc", new()
    ///     {
    ///         Location = "us-west1-a",
    ///         Name = "sample-pc",
    ///         Description = "Sample test PC.",
    ///         NetworkConfig = new Gcp.VMwareEngine.Inputs.PrivateCloudNetworkConfigArgs
    ///         {
    ///             ManagementCidr = "192.168.50.0/24",
    ///             VmwareEngineNetwork = external_access_rule_nw.Id,
    ///         },
    ///         ManagementCluster = new Gcp.VMwareEngine.Inputs.PrivateCloudManagementClusterArgs
    ///         {
    ///             ClusterId = "sample-mgmt-cluster",
    ///             NodeTypeConfigs = new[]
    ///             {
    ///                 new Gcp.VMwareEngine.Inputs.PrivateCloudManagementClusterNodeTypeConfigArgs
    ///                 {
    ///                     NodeTypeId = "standard-72",
    ///                     NodeCount = 3,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var external_access_rule_np = new Gcp.VMwareEngine.NetworkPolicy("external-access-rule-np", new()
    ///     {
    ///         Location = "us-west1",
    ///         Name = "sample-np",
    ///         EdgeServicesCidr = "192.168.30.0/26",
    ///         VmwareEngineNetwork = external_access_rule_nw.Id,
    ///     });
    /// 
    ///     var external_access_rule_ea = new Gcp.VMwareEngine.ExternalAddress("external-access-rule-ea", new()
    ///     {
    ///         Name = "sample-ea",
    ///         Parent = external_access_rule_pc.Id,
    ///         InternalIp = "192.168.0.65",
    ///     });
    /// 
    ///     var vmw_engine_external_access_rule = new Gcp.VMwareEngine.ExternalAccessRule("vmw-engine-external-access-rule", new()
    ///     {
    ///         Name = "sample-external-access-rule",
    ///         Parent = external_access_rule_np.Id,
    ///         Description = "Sample Description",
    ///         Priority = 101,
    ///         Action = "ALLOW",
    ///         IpProtocol = "tcp",
    ///         SourceIpRanges = new[]
    ///         {
    ///             new Gcp.VMwareEngine.Inputs.ExternalAccessRuleSourceIpRangeArgs
    ///             {
    ///                 IpAddressRange = "0.0.0.0/0",
    ///             },
    ///         },
    ///         SourcePorts = new[]
    ///         {
    ///             "80",
    ///         },
    ///         DestinationIpRanges = new[]
    ///         {
    ///             new Gcp.VMwareEngine.Inputs.ExternalAccessRuleDestinationIpRangeArgs
    ///             {
    ///                 ExternalAddress = external_access_rule_ea.Id,
    ///             },
    ///         },
    ///         DestinationPorts = new[]
    ///         {
    ///             "433",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ExternalAccessRule can be imported using any of these accepted formats:
    /// 
    /// * `{{parent}}/externalAccessRules/{{name}}`
    /// 
    /// When using the `pulumi import` command, ExternalAccessRule can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:vmwareengine/externalAccessRule:ExternalAccessRule default {{parent}}/externalAccessRules/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:vmwareengine/externalAccessRule:ExternalAccessRule")]
    public partial class ExternalAccessRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The action that the external access rule performs.
        /// Possible values are: `ALLOW`, `DENY`.
        /// </summary>
        [Output("action")]
        public Output<string> Action { get; private set; } = null!;

        /// <summary>
        /// Creation time of this resource.
        /// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
        /// up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// User-provided description for the external access rule.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// If destination ranges are specified, the external access rule applies only to
        /// traffic that has a destination IP address in these ranges.
        /// Structure is documented below.
        /// </summary>
        [Output("destinationIpRanges")]
        public Output<ImmutableArray<Outputs.ExternalAccessRuleDestinationIpRange>> DestinationIpRanges { get; private set; } = null!;

        /// <summary>
        /// A list of destination ports to which the external access rule applies.
        /// </summary>
        [Output("destinationPorts")]
        public Output<ImmutableArray<string>> DestinationPorts { get; private set; } = null!;

        /// <summary>
        /// The IP protocol to which the external access rule applies.
        /// </summary>
        [Output("ipProtocol")]
        public Output<string> IpProtocol { get; private set; } = null!;

        /// <summary>
        /// The ID of the external access rule.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The resource name of the network policy.
        /// Resource names are schemeless URIs that follow the conventions in https://cloud.google.com/apis/design/resource_names.
        /// For example: projects/my-project/locations/us-west1-a/networkPolicies/my-policy
        /// </summary>
        [Output("parent")]
        public Output<string> Parent { get; private set; } = null!;

        /// <summary>
        /// External access rule priority, which determines the external access rule to use when multiple rules apply.
        /// </summary>
        [Output("priority")]
        public Output<int> Priority { get; private set; } = null!;

        /// <summary>
        /// If source ranges are specified, the external access rule applies only to
        /// traffic that has a source IP address in these ranges.
        /// Structure is documented below.
        /// </summary>
        [Output("sourceIpRanges")]
        public Output<ImmutableArray<Outputs.ExternalAccessRuleSourceIpRange>> SourceIpRanges { get; private set; } = null!;

        /// <summary>
        /// A list of source ports to which the external access rule applies.
        /// </summary>
        [Output("sourcePorts")]
        public Output<ImmutableArray<string>> SourcePorts { get; private set; } = null!;

        /// <summary>
        /// State of the Cluster.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// System-generated unique identifier for the resource.
        /// </summary>
        [Output("uid")]
        public Output<string> Uid { get; private set; } = null!;

        /// <summary>
        /// Last updated time of this resource.
        /// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
        /// fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a ExternalAccessRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ExternalAccessRule(string name, ExternalAccessRuleArgs args, CustomResourceOptions? options = null)
            : base("gcp:vmwareengine/externalAccessRule:ExternalAccessRule", name, args ?? new ExternalAccessRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ExternalAccessRule(string name, Input<string> id, ExternalAccessRuleState? state = null, CustomResourceOptions? options = null)
            : base("gcp:vmwareengine/externalAccessRule:ExternalAccessRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ExternalAccessRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ExternalAccessRule Get(string name, Input<string> id, ExternalAccessRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new ExternalAccessRule(name, id, state, options);
        }
    }

    public sealed class ExternalAccessRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action that the external access rule performs.
        /// Possible values are: `ALLOW`, `DENY`.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// User-provided description for the external access rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("destinationIpRanges", required: true)]
        private InputList<Inputs.ExternalAccessRuleDestinationIpRangeArgs>? _destinationIpRanges;

        /// <summary>
        /// If destination ranges are specified, the external access rule applies only to
        /// traffic that has a destination IP address in these ranges.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ExternalAccessRuleDestinationIpRangeArgs> DestinationIpRanges
        {
            get => _destinationIpRanges ?? (_destinationIpRanges = new InputList<Inputs.ExternalAccessRuleDestinationIpRangeArgs>());
            set => _destinationIpRanges = value;
        }

        [Input("destinationPorts", required: true)]
        private InputList<string>? _destinationPorts;

        /// <summary>
        /// A list of destination ports to which the external access rule applies.
        /// </summary>
        public InputList<string> DestinationPorts
        {
            get => _destinationPorts ?? (_destinationPorts = new InputList<string>());
            set => _destinationPorts = value;
        }

        /// <summary>
        /// The IP protocol to which the external access rule applies.
        /// </summary>
        [Input("ipProtocol", required: true)]
        public Input<string> IpProtocol { get; set; } = null!;

        /// <summary>
        /// The ID of the external access rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The resource name of the network policy.
        /// Resource names are schemeless URIs that follow the conventions in https://cloud.google.com/apis/design/resource_names.
        /// For example: projects/my-project/locations/us-west1-a/networkPolicies/my-policy
        /// </summary>
        [Input("parent", required: true)]
        public Input<string> Parent { get; set; } = null!;

        /// <summary>
        /// External access rule priority, which determines the external access rule to use when multiple rules apply.
        /// </summary>
        [Input("priority", required: true)]
        public Input<int> Priority { get; set; } = null!;

        [Input("sourceIpRanges", required: true)]
        private InputList<Inputs.ExternalAccessRuleSourceIpRangeArgs>? _sourceIpRanges;

        /// <summary>
        /// If source ranges are specified, the external access rule applies only to
        /// traffic that has a source IP address in these ranges.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ExternalAccessRuleSourceIpRangeArgs> SourceIpRanges
        {
            get => _sourceIpRanges ?? (_sourceIpRanges = new InputList<Inputs.ExternalAccessRuleSourceIpRangeArgs>());
            set => _sourceIpRanges = value;
        }

        [Input("sourcePorts", required: true)]
        private InputList<string>? _sourcePorts;

        /// <summary>
        /// A list of source ports to which the external access rule applies.
        /// </summary>
        public InputList<string> SourcePorts
        {
            get => _sourcePorts ?? (_sourcePorts = new InputList<string>());
            set => _sourcePorts = value;
        }

        public ExternalAccessRuleArgs()
        {
        }
        public static new ExternalAccessRuleArgs Empty => new ExternalAccessRuleArgs();
    }

    public sealed class ExternalAccessRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action that the external access rule performs.
        /// Possible values are: `ALLOW`, `DENY`.
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// Creation time of this resource.
        /// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and
        /// up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// User-provided description for the external access rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("destinationIpRanges")]
        private InputList<Inputs.ExternalAccessRuleDestinationIpRangeGetArgs>? _destinationIpRanges;

        /// <summary>
        /// If destination ranges are specified, the external access rule applies only to
        /// traffic that has a destination IP address in these ranges.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ExternalAccessRuleDestinationIpRangeGetArgs> DestinationIpRanges
        {
            get => _destinationIpRanges ?? (_destinationIpRanges = new InputList<Inputs.ExternalAccessRuleDestinationIpRangeGetArgs>());
            set => _destinationIpRanges = value;
        }

        [Input("destinationPorts")]
        private InputList<string>? _destinationPorts;

        /// <summary>
        /// A list of destination ports to which the external access rule applies.
        /// </summary>
        public InputList<string> DestinationPorts
        {
            get => _destinationPorts ?? (_destinationPorts = new InputList<string>());
            set => _destinationPorts = value;
        }

        /// <summary>
        /// The IP protocol to which the external access rule applies.
        /// </summary>
        [Input("ipProtocol")]
        public Input<string>? IpProtocol { get; set; }

        /// <summary>
        /// The ID of the external access rule.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The resource name of the network policy.
        /// Resource names are schemeless URIs that follow the conventions in https://cloud.google.com/apis/design/resource_names.
        /// For example: projects/my-project/locations/us-west1-a/networkPolicies/my-policy
        /// </summary>
        [Input("parent")]
        public Input<string>? Parent { get; set; }

        /// <summary>
        /// External access rule priority, which determines the external access rule to use when multiple rules apply.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        [Input("sourceIpRanges")]
        private InputList<Inputs.ExternalAccessRuleSourceIpRangeGetArgs>? _sourceIpRanges;

        /// <summary>
        /// If source ranges are specified, the external access rule applies only to
        /// traffic that has a source IP address in these ranges.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ExternalAccessRuleSourceIpRangeGetArgs> SourceIpRanges
        {
            get => _sourceIpRanges ?? (_sourceIpRanges = new InputList<Inputs.ExternalAccessRuleSourceIpRangeGetArgs>());
            set => _sourceIpRanges = value;
        }

        [Input("sourcePorts")]
        private InputList<string>? _sourcePorts;

        /// <summary>
        /// A list of source ports to which the external access rule applies.
        /// </summary>
        public InputList<string> SourcePorts
        {
            get => _sourcePorts ?? (_sourcePorts = new InputList<string>());
            set => _sourcePorts = value;
        }

        /// <summary>
        /// State of the Cluster.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// System-generated unique identifier for the resource.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        /// <summary>
        /// Last updated time of this resource.
        /// A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
        /// fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public ExternalAccessRuleState()
        {
        }
        public static new ExternalAccessRuleState Empty => new ExternalAccessRuleState();
    }
}
