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
    /// The Compute NetworkFirewallPolicy with rules resource
    /// 
    /// ## Example Usage
    /// 
    /// ### Compute Region Network Firewall Policy With Rules Full
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
    ///     var addressGroup1 = new Gcp.NetworkSecurity.AddressGroup("address_group_1", new()
    ///     {
    ///         Name = "address-group",
    ///         Parent = project.Apply(getProjectResult =&gt; getProjectResult.Id),
    ///         Description = "Regional address group",
    ///         Location = "us-west2",
    ///         Items = new[]
    ///         {
    ///             "208.80.154.224/32",
    ///         },
    ///         Type = "IPV4",
    ///         Capacity = 100,
    ///     });
    /// 
    ///     var secureTagKey1 = new Gcp.Tags.TagKey("secure_tag_key_1", new()
    ///     {
    ///         Description = "Tag key",
    ///         Parent = project.Apply(getProjectResult =&gt; getProjectResult.Id),
    ///         Purpose = "GCE_FIREWALL",
    ///         ShortName = "tag-key",
    ///         PurposeData = 
    ///         {
    ///             { "network", $"{project.Apply(getProjectResult =&gt; getProjectResult.Name)}/default" },
    ///         },
    ///     });
    /// 
    ///     var secureTagValue1 = new Gcp.Tags.TagValue("secure_tag_value_1", new()
    ///     {
    ///         Description = "Tag value",
    ///         Parent = secureTagKey1.Id,
    ///         ShortName = "tag-value",
    ///     });
    /// 
    ///     var primary = new Gcp.Compute.RegionNetworkFirewallPolicyWithRules("primary", new()
    ///     {
    ///         Name = "fw-policy",
    ///         Region = "us-west2",
    ///         Description = "Terraform test",
    ///         Rules = new[]
    ///         {
    ///             new Gcp.Compute.Inputs.RegionNetworkFirewallPolicyWithRulesRuleArgs
    ///             {
    ///                 Description = "tcp rule",
    ///                 Priority = 1000,
    ///                 EnableLogging = true,
    ///                 Action = "allow",
    ///                 Direction = "EGRESS",
    ///                 Match = new Gcp.Compute.Inputs.RegionNetworkFirewallPolicyWithRulesRuleMatchArgs
    ///                 {
    ///                     DestIpRanges = new[]
    ///                     {
    ///                         "11.100.0.1/32",
    ///                     },
    ///                     DestFqdns = new[]
    ///                     {
    ///                         "www.yyy.com",
    ///                         "www.zzz.com",
    ///                     },
    ///                     DestRegionCodes = new[]
    ///                     {
    ///                         "HK",
    ///                         "IN",
    ///                     },
    ///                     DestThreatIntelligences = new[]
    ///                     {
    ///                         "iplist-search-engines-crawlers",
    ///                         "iplist-tor-exit-nodes",
    ///                     },
    ///                     DestAddressGroups = new[]
    ///                     {
    ///                         addressGroup1.Id,
    ///                     },
    ///                     Layer4Configs = new[]
    ///                     {
    ///                         new Gcp.Compute.Inputs.RegionNetworkFirewallPolicyWithRulesRuleMatchLayer4ConfigArgs
    ///                         {
    ///                             IpProtocol = "tcp",
    ///                             Ports = new[]
    ///                             {
    ///                                 "8080",
    ///                                 "7070",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///                 TargetSecureTags = new[]
    ///                 {
    ///                     new Gcp.Compute.Inputs.RegionNetworkFirewallPolicyWithRulesRuleTargetSecureTagArgs
    ///                     {
    ///                         Name = secureTagValue1.Id,
    ///                     },
    ///                 },
    ///             },
    ///             new Gcp.Compute.Inputs.RegionNetworkFirewallPolicyWithRulesRuleArgs
    ///             {
    ///                 Description = "udp rule",
    ///                 RuleName = "test-rule",
    ///                 Priority = 2000,
    ///                 EnableLogging = false,
    ///                 Action = "deny",
    ///                 Direction = "INGRESS",
    ///                 Disabled = true,
    ///                 Match = new Gcp.Compute.Inputs.RegionNetworkFirewallPolicyWithRulesRuleMatchArgs
    ///                 {
    ///                     SrcIpRanges = new[]
    ///                     {
    ///                         "0.0.0.0/0",
    ///                     },
    ///                     SrcFqdns = new[]
    ///                     {
    ///                         "www.abc.com",
    ///                         "www.def.com",
    ///                     },
    ///                     SrcRegionCodes = new[]
    ///                     {
    ///                         "US",
    ///                         "CA",
    ///                     },
    ///                     SrcThreatIntelligences = new[]
    ///                     {
    ///                         "iplist-known-malicious-ips",
    ///                         "iplist-public-clouds",
    ///                     },
    ///                     SrcAddressGroups = new[]
    ///                     {
    ///                         addressGroup1.Id,
    ///                     },
    ///                     SrcSecureTags = new[]
    ///                     {
    ///                         new Gcp.Compute.Inputs.RegionNetworkFirewallPolicyWithRulesRuleMatchSrcSecureTagArgs
    ///                         {
    ///                             Name = secureTagValue1.Id,
    ///                         },
    ///                     },
    ///                     Layer4Configs = new[]
    ///                     {
    ///                         new Gcp.Compute.Inputs.RegionNetworkFirewallPolicyWithRulesRuleMatchLayer4ConfigArgs
    ///                         {
    ///                             IpProtocol = "udp",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Compute Region Network Firewall Policy With Rules Roce
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var policy = new Gcp.Compute.RegionNetworkFirewallPolicyWithRules("policy", new()
    ///     {
    ///         Name = "rnf-policy",
    ///         Description = "Terraform test",
    ///         PolicyType = "RDMA_ROCE_POLICY",
    ///         Rules = new[]
    ///         {
    ///             new Gcp.Compute.Inputs.RegionNetworkFirewallPolicyWithRulesRuleArgs
    ///             {
    ///                 Description = "deny all rule",
    ///                 Priority = 1000,
    ///                 EnableLogging = true,
    ///                 Action = "deny",
    ///                 Direction = "INGRESS",
    ///                 Match = new Gcp.Compute.Inputs.RegionNetworkFirewallPolicyWithRulesRuleMatchArgs
    ///                 {
    ///                     SrcIpRanges = new[]
    ///                     {
    ///                         "0.0.0.0/0",
    ///                     },
    ///                     Layer4Configs = new[]
    ///                     {
    ///                         new Gcp.Compute.Inputs.RegionNetworkFirewallPolicyWithRulesRuleMatchLayer4ConfigArgs
    ///                         {
    ///                             IpProtocol = "all",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// RegionNetworkFirewallPolicyWithRules can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/regions/{{region}}/firewallPolicies/{{name}}`
    /// 
    /// * `{{project}}/{{region}}/{{name}}`
    /// 
    /// * `{{region}}/{{name}}`
    /// 
    /// * `{{name}}`
    /// 
    /// When using the `pulumi import` command, RegionNetworkFirewallPolicyWithRules can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/regionNetworkFirewallPolicyWithRules:RegionNetworkFirewallPolicyWithRules default projects/{{project}}/regions/{{region}}/firewallPolicies/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/regionNetworkFirewallPolicyWithRules:RegionNetworkFirewallPolicyWithRules default {{project}}/{{region}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/regionNetworkFirewallPolicyWithRules:RegionNetworkFirewallPolicyWithRules default {{region}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/regionNetworkFirewallPolicyWithRules:RegionNetworkFirewallPolicyWithRules default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:compute/regionNetworkFirewallPolicyWithRules:RegionNetworkFirewallPolicyWithRules")]
    public partial class RegionNetworkFirewallPolicyWithRules : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Creation timestamp in RFC3339 text format.
        /// </summary>
        [Output("creationTimestamp")]
        public Output<string> CreationTimestamp { get; private set; } = null!;

        /// <summary>
        /// An optional description of this resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Fingerprint of the resource. This field is used internally during updates of this resource.
        /// </summary>
        [Output("fingerprint")]
        public Output<string> Fingerprint { get; private set; } = null!;

        /// <summary>
        /// User-provided name of the Network firewall policy.
        /// The name should be unique in the project in which the firewall policy is created.
        /// The name must be 1-63 characters long, and comply with RFC1035. Specifically,
        /// the name must be 1-63 characters long and match the regular expression a-z?
        /// which means the first character must be a lowercase letter, and all following characters must be a dash,
        /// lowercase letter, or digit, except the last character, which cannot be a dash.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the resource. This identifier is defined by the server.
        /// </summary>
        [Output("networkFirewallPolicyId")]
        public Output<string> NetworkFirewallPolicyId { get; private set; } = null!;

        /// <summary>
        /// Policy type is used to determine which resources (networks) the policy can be associated with.
        /// A policy can be associated with a network only if the network has the matching policyType in its network profile.
        /// Different policy types may support some of the Firewall Rules features.
        /// Possible values are: `VPC_POLICY`, `RDMA_ROCE_POLICY`.
        /// </summary>
        [Output("policyType")]
        public Output<string> PolicyType { get; private set; } = null!;

        /// <summary>
        /// A list of firewall policy pre-defined rules.
        /// Structure is documented below.
        /// </summary>
        [Output("predefinedRules")]
        public Output<ImmutableArray<Outputs.RegionNetworkFirewallPolicyWithRulesPredefinedRule>> PredefinedRules { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The region of this resource.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Total count of all firewall policy rule tuples. A firewall policy can not exceed a set number of tuples.
        /// </summary>
        [Output("ruleTupleCount")]
        public Output<int> RuleTupleCount { get; private set; } = null!;

        /// <summary>
        /// A list of firewall policy rules.
        /// Structure is documented below.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.RegionNetworkFirewallPolicyWithRulesRule>> Rules { get; private set; } = null!;

        /// <summary>
        /// Server-defined URL for the resource.
        /// </summary>
        [Output("selfLink")]
        public Output<string> SelfLink { get; private set; } = null!;

        /// <summary>
        /// Server-defined URL for this resource with the resource id.
        /// </summary>
        [Output("selfLinkWithId")]
        public Output<string> SelfLinkWithId { get; private set; } = null!;


        /// <summary>
        /// Create a RegionNetworkFirewallPolicyWithRules resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RegionNetworkFirewallPolicyWithRules(string name, RegionNetworkFirewallPolicyWithRulesArgs args, CustomResourceOptions? options = null)
            : base("gcp:compute/regionNetworkFirewallPolicyWithRules:RegionNetworkFirewallPolicyWithRules", name, args ?? new RegionNetworkFirewallPolicyWithRulesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RegionNetworkFirewallPolicyWithRules(string name, Input<string> id, RegionNetworkFirewallPolicyWithRulesState? state = null, CustomResourceOptions? options = null)
            : base("gcp:compute/regionNetworkFirewallPolicyWithRules:RegionNetworkFirewallPolicyWithRules", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RegionNetworkFirewallPolicyWithRules resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RegionNetworkFirewallPolicyWithRules Get(string name, Input<string> id, RegionNetworkFirewallPolicyWithRulesState? state = null, CustomResourceOptions? options = null)
        {
            return new RegionNetworkFirewallPolicyWithRules(name, id, state, options);
        }
    }

    public sealed class RegionNetworkFirewallPolicyWithRulesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An optional description of this resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// User-provided name of the Network firewall policy.
        /// The name should be unique in the project in which the firewall policy is created.
        /// The name must be 1-63 characters long, and comply with RFC1035. Specifically,
        /// the name must be 1-63 characters long and match the regular expression a-z?
        /// which means the first character must be a lowercase letter, and all following characters must be a dash,
        /// lowercase letter, or digit, except the last character, which cannot be a dash.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Policy type is used to determine which resources (networks) the policy can be associated with.
        /// A policy can be associated with a network only if the network has the matching policyType in its network profile.
        /// Different policy types may support some of the Firewall Rules features.
        /// Possible values are: `VPC_POLICY`, `RDMA_ROCE_POLICY`.
        /// </summary>
        [Input("policyType")]
        public Input<string>? PolicyType { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The region of this resource.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("rules", required: true)]
        private InputList<Inputs.RegionNetworkFirewallPolicyWithRulesRuleArgs>? _rules;

        /// <summary>
        /// A list of firewall policy rules.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.RegionNetworkFirewallPolicyWithRulesRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.RegionNetworkFirewallPolicyWithRulesRuleArgs>());
            set => _rules = value;
        }

        public RegionNetworkFirewallPolicyWithRulesArgs()
        {
        }
        public static new RegionNetworkFirewallPolicyWithRulesArgs Empty => new RegionNetworkFirewallPolicyWithRulesArgs();
    }

    public sealed class RegionNetworkFirewallPolicyWithRulesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Creation timestamp in RFC3339 text format.
        /// </summary>
        [Input("creationTimestamp")]
        public Input<string>? CreationTimestamp { get; set; }

        /// <summary>
        /// An optional description of this resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Fingerprint of the resource. This field is used internally during updates of this resource.
        /// </summary>
        [Input("fingerprint")]
        public Input<string>? Fingerprint { get; set; }

        /// <summary>
        /// User-provided name of the Network firewall policy.
        /// The name should be unique in the project in which the firewall policy is created.
        /// The name must be 1-63 characters long, and comply with RFC1035. Specifically,
        /// the name must be 1-63 characters long and match the regular expression a-z?
        /// which means the first character must be a lowercase letter, and all following characters must be a dash,
        /// lowercase letter, or digit, except the last character, which cannot be a dash.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The unique identifier for the resource. This identifier is defined by the server.
        /// </summary>
        [Input("networkFirewallPolicyId")]
        public Input<string>? NetworkFirewallPolicyId { get; set; }

        /// <summary>
        /// Policy type is used to determine which resources (networks) the policy can be associated with.
        /// A policy can be associated with a network only if the network has the matching policyType in its network profile.
        /// Different policy types may support some of the Firewall Rules features.
        /// Possible values are: `VPC_POLICY`, `RDMA_ROCE_POLICY`.
        /// </summary>
        [Input("policyType")]
        public Input<string>? PolicyType { get; set; }

        [Input("predefinedRules")]
        private InputList<Inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleGetArgs>? _predefinedRules;

        /// <summary>
        /// A list of firewall policy pre-defined rules.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleGetArgs> PredefinedRules
        {
            get => _predefinedRules ?? (_predefinedRules = new InputList<Inputs.RegionNetworkFirewallPolicyWithRulesPredefinedRuleGetArgs>());
            set => _predefinedRules = value;
        }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The region of this resource.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Total count of all firewall policy rule tuples. A firewall policy can not exceed a set number of tuples.
        /// </summary>
        [Input("ruleTupleCount")]
        public Input<int>? RuleTupleCount { get; set; }

        [Input("rules")]
        private InputList<Inputs.RegionNetworkFirewallPolicyWithRulesRuleGetArgs>? _rules;

        /// <summary>
        /// A list of firewall policy rules.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.RegionNetworkFirewallPolicyWithRulesRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.RegionNetworkFirewallPolicyWithRulesRuleGetArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// Server-defined URL for the resource.
        /// </summary>
        [Input("selfLink")]
        public Input<string>? SelfLink { get; set; }

        /// <summary>
        /// Server-defined URL for this resource with the resource id.
        /// </summary>
        [Input("selfLinkWithId")]
        public Input<string>? SelfLinkWithId { get; set; }

        public RegionNetworkFirewallPolicyWithRulesState()
        {
        }
        public static new RegionNetworkFirewallPolicyWithRulesState Empty => new RegionNetworkFirewallPolicyWithRulesState();
    }
}
