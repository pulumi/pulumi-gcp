// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex
{
    /// <summary>
    /// ## Import
    /// 
    /// For all import syntaxes, the "resource in question" can take any of the following forms:
    /// 
    /// * projects/{{project}}/locations/{{region}}/featureGroups/{{name}}
    /// 
    /// * {{project}}/{{region}}/{{name}}
    /// 
    /// * {{region}}/{{name}}
    /// 
    /// * {{name}}
    /// 
    /// Any variables not passed in the import command will be taken from the provider configuration.
    /// 
    /// Vertex AI featuregroup IAM resources can be imported using the resource identifiers, role, and member.
    /// 
    /// IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
    /// 
    /// ```sh
    /// $ pulumi import gcp:vertex/aiFeatureGroupIamMember:AiFeatureGroupIamMember editor "projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}} roles/viewer user:jane@example.com"
    /// ```
    /// 
    /// IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
    /// 
    /// ```sh
    /// $ pulumi import gcp:vertex/aiFeatureGroupIamMember:AiFeatureGroupIamMember editor "projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}} roles/viewer"
    /// ```
    /// 
    /// IAM policy imports use the identifier of the resource in question, e.g.
    /// 
    /// ```sh
    /// $ pulumi import gcp:vertex/aiFeatureGroupIamMember:AiFeatureGroupIamMember editor projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}}
    /// ```
    /// 
    /// -&gt; **Custom Roles** If you're importing a IAM resource with a custom role, make sure to use the
    /// 
    ///  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
    /// </summary>
    [GcpResourceType("gcp:vertex/aiFeatureGroupIamMember:AiFeatureGroupIamMember")]
    public partial class AiFeatureGroupIamMember : global::Pulumi.CustomResource
    {
        [Output("condition")]
        public Output<Outputs.AiFeatureGroupIamMemberCondition?> Condition { get; private set; } = null!;

        /// <summary>
        /// (Computed) The etag of the IAM policy.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Output("featureGroup")]
        public Output<string> FeatureGroup { get; private set; } = null!;

        /// <summary>
        /// Identities that will be granted the privilege in `role`.
        /// Each entry can have one of the following values:
        /// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
        /// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
        /// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        /// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        /// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        /// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        /// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
        /// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
        /// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
        /// </summary>
        [Output("member")]
        public Output<string> Member { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The region of feature group. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
        /// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
        /// region is specified, it is taken from the provider configuration.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The role that should be applied. Only one
        /// `gcp.vertex.AiFeatureGroupIamBinding` can be used per role. Note that custom roles must be of the format
        /// `[projects|organizations]/{parent-name}/roles/{role-name}`.
        /// </summary>
        [Output("role")]
        public Output<string> Role { get; private set; } = null!;


        /// <summary>
        /// Create a AiFeatureGroupIamMember resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AiFeatureGroupIamMember(string name, AiFeatureGroupIamMemberArgs args, CustomResourceOptions? options = null)
            : base("gcp:vertex/aiFeatureGroupIamMember:AiFeatureGroupIamMember", name, args ?? new AiFeatureGroupIamMemberArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AiFeatureGroupIamMember(string name, Input<string> id, AiFeatureGroupIamMemberState? state = null, CustomResourceOptions? options = null)
            : base("gcp:vertex/aiFeatureGroupIamMember:AiFeatureGroupIamMember", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AiFeatureGroupIamMember resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AiFeatureGroupIamMember Get(string name, Input<string> id, AiFeatureGroupIamMemberState? state = null, CustomResourceOptions? options = null)
        {
            return new AiFeatureGroupIamMember(name, id, state, options);
        }
    }

    public sealed class AiFeatureGroupIamMemberArgs : global::Pulumi.ResourceArgs
    {
        [Input("condition")]
        public Input<Inputs.AiFeatureGroupIamMemberConditionArgs>? Condition { get; set; }

        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("featureGroup", required: true)]
        public Input<string> FeatureGroup { get; set; } = null!;

        /// <summary>
        /// Identities that will be granted the privilege in `role`.
        /// Each entry can have one of the following values:
        /// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
        /// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
        /// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        /// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        /// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        /// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        /// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
        /// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
        /// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
        /// </summary>
        [Input("member", required: true)]
        public Input<string> Member { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The region of feature group. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
        /// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
        /// region is specified, it is taken from the provider configuration.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The role that should be applied. Only one
        /// `gcp.vertex.AiFeatureGroupIamBinding` can be used per role. Note that custom roles must be of the format
        /// `[projects|organizations]/{parent-name}/roles/{role-name}`.
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        public AiFeatureGroupIamMemberArgs()
        {
        }
        public static new AiFeatureGroupIamMemberArgs Empty => new AiFeatureGroupIamMemberArgs();
    }

    public sealed class AiFeatureGroupIamMemberState : global::Pulumi.ResourceArgs
    {
        [Input("condition")]
        public Input<Inputs.AiFeatureGroupIamMemberConditionGetArgs>? Condition { get; set; }

        /// <summary>
        /// (Computed) The etag of the IAM policy.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// Used to find the parent resource to bind the IAM policy to
        /// </summary>
        [Input("featureGroup")]
        public Input<string>? FeatureGroup { get; set; }

        /// <summary>
        /// Identities that will be granted the privilege in `role`.
        /// Each entry can have one of the following values:
        /// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
        /// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
        /// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        /// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        /// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        /// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        /// * **projectOwner:projectid**: Owners of the given project. For example, "projectOwner:my-example-project"
        /// * **projectEditor:projectid**: Editors of the given project. For example, "projectEditor:my-example-project"
        /// * **projectViewer:projectid**: Viewers of the given project. For example, "projectViewer:my-example-project"
        /// </summary>
        [Input("member")]
        public Input<string>? Member { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The region of feature group. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
        /// the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
        /// region is specified, it is taken from the provider configuration.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The role that should be applied. Only one
        /// `gcp.vertex.AiFeatureGroupIamBinding` can be used per role. Note that custom roles must be of the format
        /// `[projects|organizations]/{parent-name}/roles/{role-name}`.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        public AiFeatureGroupIamMemberState()
        {
        }
        public static new AiFeatureGroupIamMemberState Empty => new AiFeatureGroupIamMemberState();
    }
}
