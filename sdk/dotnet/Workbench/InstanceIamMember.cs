// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Workbench
{
    [GcpResourceType("gcp:workbench/instanceIamMember:InstanceIamMember")]
    public partial class InstanceIamMember : global::Pulumi.CustomResource
    {
        [Output("condition")]
        public Output<Outputs.InstanceIamMemberCondition?> Condition { get; private set; } = null!;

        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        [Output("member")]
        public Output<string> Member { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        [Output("role")]
        public Output<string> Role { get; private set; } = null!;


        /// <summary>
        /// Create a InstanceIamMember resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InstanceIamMember(string name, InstanceIamMemberArgs args, CustomResourceOptions? options = null)
            : base("gcp:workbench/instanceIamMember:InstanceIamMember", name, args ?? new InstanceIamMemberArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InstanceIamMember(string name, Input<string> id, InstanceIamMemberState? state = null, CustomResourceOptions? options = null)
            : base("gcp:workbench/instanceIamMember:InstanceIamMember", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InstanceIamMember resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InstanceIamMember Get(string name, Input<string> id, InstanceIamMemberState? state = null, CustomResourceOptions? options = null)
        {
            return new InstanceIamMember(name, id, state, options);
        }
    }

    public sealed class InstanceIamMemberArgs : global::Pulumi.ResourceArgs
    {
        [Input("condition")]
        public Input<Inputs.InstanceIamMemberConditionArgs>? Condition { get; set; }

        [Input("location")]
        public Input<string>? Location { get; set; }

        [Input("member", required: true)]
        public Input<string> Member { get; set; } = null!;

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        public InstanceIamMemberArgs()
        {
        }
        public static new InstanceIamMemberArgs Empty => new InstanceIamMemberArgs();
    }

    public sealed class InstanceIamMemberState : global::Pulumi.ResourceArgs
    {
        [Input("condition")]
        public Input<Inputs.InstanceIamMemberConditionGetArgs>? Condition { get; set; }

        [Input("etag")]
        public Input<string>? Etag { get; set; }

        [Input("location")]
        public Input<string>? Location { get; set; }

        [Input("member")]
        public Input<string>? Member { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("role")]
        public Input<string>? Role { get; set; }

        public InstanceIamMemberState()
        {
        }
        public static new InstanceIamMemberState Empty => new InstanceIamMemberState();
    }
}
