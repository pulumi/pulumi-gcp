// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecurityCenter
{
    /// <summary>
    /// A Cloud Security Command Center's (Cloud SCC) finding source. A finding
    /// source is an entity or a mechanism that can produce a finding. A source is
    /// like a container of findings that come from the same scanner, logger,
    /// monitor, etc.
    /// 
    /// To get more information about Source, see:
    /// 
    /// * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.sources)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/security-command-center/docs)
    /// 
    /// ## Example Usage
    /// ### Scc Source Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var customSource = new Gcp.SecurityCenter.Source("customSource", new()
    ///     {
    ///         Description = "My custom Cloud Security Command Center Finding Source",
    ///         DisplayName = "My Source",
    ///         Organization = "123456789",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Source can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:securitycenter/sourceIamMember:SourceIamMember default organizations/{{organization}}/sources/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:securitycenter/sourceIamMember:SourceIamMember default {{organization}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:securitycenter/sourceIamMember:SourceIamMember")]
    public partial class SourceIamMember : global::Pulumi.CustomResource
    {
        [Output("condition")]
        public Output<Outputs.SourceIamMemberCondition?> Condition { get; private set; } = null!;

        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        [Output("member")]
        public Output<string> Member { get; private set; } = null!;

        /// <summary>
        /// The organization whose Cloud Security Command Center the Source
        /// lives in.
        /// </summary>
        [Output("organization")]
        public Output<string> Organization { get; private set; } = null!;

        [Output("role")]
        public Output<string> Role { get; private set; } = null!;

        [Output("source")]
        public Output<string> Source { get; private set; } = null!;


        /// <summary>
        /// Create a SourceIamMember resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SourceIamMember(string name, SourceIamMemberArgs args, CustomResourceOptions? options = null)
            : base("gcp:securitycenter/sourceIamMember:SourceIamMember", name, args ?? new SourceIamMemberArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SourceIamMember(string name, Input<string> id, SourceIamMemberState? state = null, CustomResourceOptions? options = null)
            : base("gcp:securitycenter/sourceIamMember:SourceIamMember", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SourceIamMember resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SourceIamMember Get(string name, Input<string> id, SourceIamMemberState? state = null, CustomResourceOptions? options = null)
        {
            return new SourceIamMember(name, id, state, options);
        }
    }

    public sealed class SourceIamMemberArgs : global::Pulumi.ResourceArgs
    {
        [Input("condition")]
        public Input<Inputs.SourceIamMemberConditionArgs>? Condition { get; set; }

        [Input("member", required: true)]
        public Input<string> Member { get; set; } = null!;

        /// <summary>
        /// The organization whose Cloud Security Command Center the Source
        /// lives in.
        /// </summary>
        [Input("organization", required: true)]
        public Input<string> Organization { get; set; } = null!;

        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        [Input("source", required: true)]
        public Input<string> Source { get; set; } = null!;

        public SourceIamMemberArgs()
        {
        }
        public static new SourceIamMemberArgs Empty => new SourceIamMemberArgs();
    }

    public sealed class SourceIamMemberState : global::Pulumi.ResourceArgs
    {
        [Input("condition")]
        public Input<Inputs.SourceIamMemberConditionGetArgs>? Condition { get; set; }

        [Input("etag")]
        public Input<string>? Etag { get; set; }

        [Input("member")]
        public Input<string>? Member { get; set; }

        /// <summary>
        /// The organization whose Cloud Security Command Center the Source
        /// lives in.
        /// </summary>
        [Input("organization")]
        public Input<string>? Organization { get; set; }

        [Input("role")]
        public Input<string>? Role { get; set; }

        [Input("source")]
        public Input<string>? Source { get; set; }

        public SourceIamMemberState()
        {
        }
        public static new SourceIamMemberState Empty => new SourceIamMemberState();
    }
}