// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    /// <summary>
    /// The Compute NetworkFirewallPolicyAssociation resource
    /// 
    /// ## Example Usage
    /// ### Regional
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var basicRegionalNetworkFirewallPolicy = new Gcp.Compute.RegionNetworkFirewallPolicy("basicRegionalNetworkFirewallPolicy", new()
    ///     {
    ///         Project = "my-project-name",
    ///         Description = "Sample global network firewall policy",
    ///         Region = "us-west1",
    ///     });
    /// 
    ///     var basicNetwork = new Gcp.Compute.Network("basicNetwork");
    /// 
    ///     var primary = new Gcp.Compute.RegionNetworkFirewallPolicyAssociation("primary", new()
    ///     {
    ///         AttachmentTarget = basicNetwork.Id,
    ///         FirewallPolicy = basicRegionalNetworkFirewallPolicy.Name,
    ///         Project = "my-project-name",
    ///         Region = "us-west1",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// NetworkFirewallPolicyAssociation can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/regionNetworkFirewallPolicyAssociation:RegionNetworkFirewallPolicyAssociation default projects/{{project}}/regions/{{region}}/firewallPolicies/{{firewall_policy}}/associations/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/regionNetworkFirewallPolicyAssociation:RegionNetworkFirewallPolicyAssociation default {{project}}/{{region}}/{{firewall_policy}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:compute/regionNetworkFirewallPolicyAssociation:RegionNetworkFirewallPolicyAssociation")]
    public partial class RegionNetworkFirewallPolicyAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The target that the firewall policy is attached to.
        /// </summary>
        [Output("attachmentTarget")]
        public Output<string> AttachmentTarget { get; private set; } = null!;

        /// <summary>
        /// The firewall policy ID of the association.
        /// </summary>
        [Output("firewallPolicy")]
        public Output<string> FirewallPolicy { get; private set; } = null!;

        /// <summary>
        /// The name for an association.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The project for the resource
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The location of this resource.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The short name of the firewall policy of the association.
        /// </summary>
        [Output("shortName")]
        public Output<string> ShortName { get; private set; } = null!;


        /// <summary>
        /// Create a RegionNetworkFirewallPolicyAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RegionNetworkFirewallPolicyAssociation(string name, RegionNetworkFirewallPolicyAssociationArgs args, CustomResourceOptions? options = null)
            : base("gcp:compute/regionNetworkFirewallPolicyAssociation:RegionNetworkFirewallPolicyAssociation", name, args ?? new RegionNetworkFirewallPolicyAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RegionNetworkFirewallPolicyAssociation(string name, Input<string> id, RegionNetworkFirewallPolicyAssociationState? state = null, CustomResourceOptions? options = null)
            : base("gcp:compute/regionNetworkFirewallPolicyAssociation:RegionNetworkFirewallPolicyAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RegionNetworkFirewallPolicyAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RegionNetworkFirewallPolicyAssociation Get(string name, Input<string> id, RegionNetworkFirewallPolicyAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new RegionNetworkFirewallPolicyAssociation(name, id, state, options);
        }
    }

    public sealed class RegionNetworkFirewallPolicyAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The target that the firewall policy is attached to.
        /// </summary>
        [Input("attachmentTarget", required: true)]
        public Input<string> AttachmentTarget { get; set; } = null!;

        /// <summary>
        /// The firewall policy ID of the association.
        /// </summary>
        [Input("firewallPolicy", required: true)]
        public Input<string> FirewallPolicy { get; set; } = null!;

        /// <summary>
        /// The name for an association.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project for the resource
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The location of this resource.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public RegionNetworkFirewallPolicyAssociationArgs()
        {
        }
        public static new RegionNetworkFirewallPolicyAssociationArgs Empty => new RegionNetworkFirewallPolicyAssociationArgs();
    }

    public sealed class RegionNetworkFirewallPolicyAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The target that the firewall policy is attached to.
        /// </summary>
        [Input("attachmentTarget")]
        public Input<string>? AttachmentTarget { get; set; }

        /// <summary>
        /// The firewall policy ID of the association.
        /// </summary>
        [Input("firewallPolicy")]
        public Input<string>? FirewallPolicy { get; set; }

        /// <summary>
        /// The name for an association.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project for the resource
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The location of this resource.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The short name of the firewall policy of the association.
        /// </summary>
        [Input("shortName")]
        public Input<string>? ShortName { get; set; }

        public RegionNetworkFirewallPolicyAssociationState()
        {
        }
        public static new RegionNetworkFirewallPolicyAssociationState Empty => new RegionNetworkFirewallPolicyAssociationState();
    }
}