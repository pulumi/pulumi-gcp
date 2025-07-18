// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DeveloperConnect
{
    /// <summary>
    /// A git repository link to a parent connection.
    /// 
    /// To get more information about GitRepositoryLink, see:
    /// 
    /// * [API documentation](https://cloud.google.com/developer-connect/docs/api/reference/rest/v1/projects.locations.connections.gitRepositoryLinks)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/developer-connect/docs/overview)
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// GitRepositoryLink can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/connections/{{parent_connection}}/gitRepositoryLinks/{{git_repository_link_id}}`
    /// 
    /// * `{{project}}/{{location}}/{{parent_connection}}/{{git_repository_link_id}}`
    /// 
    /// * `{{location}}/{{parent_connection}}/{{git_repository_link_id}}`
    /// 
    /// When using the `pulumi import` command, GitRepositoryLink can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:developerconnect/gitRepositoryLink:GitRepositoryLink default projects/{{project}}/locations/{{location}}/connections/{{parent_connection}}/gitRepositoryLinks/{{git_repository_link_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:developerconnect/gitRepositoryLink:GitRepositoryLink default {{project}}/{{location}}/{{parent_connection}}/{{git_repository_link_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:developerconnect/gitRepositoryLink:GitRepositoryLink default {{location}}/{{parent_connection}}/{{git_repository_link_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:developerconnect/gitRepositoryLink:GitRepositoryLink")]
    public partial class GitRepositoryLink : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Optional. Allows clients to store small amounts of arbitrary data.
        /// **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
        /// Please refer to the field `effective_annotations` for all of the annotations present on the resource.
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, string>?> Annotations { get; private set; } = null!;

        /// <summary>
        /// Required. Git Clone URI.
        /// </summary>
        [Output("cloneUri")]
        public Output<string> CloneUri { get; private set; } = null!;

        /// <summary>
        /// Output only. [Output only] Create timestamp
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Output only. [Output only] Delete timestamp
        /// </summary>
        [Output("deleteTime")]
        public Output<string> DeleteTime { get; private set; } = null!;

        [Output("effectiveAnnotations")]
        public Output<ImmutableDictionary<string, string>> EffectiveAnnotations { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// Optional. This checksum is computed by the server based on the value of other
        /// fields, and may be sent on update and delete requests to ensure the
        /// client has an up-to-date value before proceeding.
        /// </summary>
        [Output("etag")]
        public Output<string?> Etag { get; private set; } = null!;

        /// <summary>
        /// Required. The ID to use for the repository, which will become the final component of
        /// the repository's resource name. This ID should be unique in the connection.
        /// Allows alphanumeric characters and any of -._~%!$&amp;'()*+,;=@.
        /// </summary>
        [Output("gitRepositoryLinkId")]
        public Output<string> GitRepositoryLinkId { get; private set; } = null!;

        /// <summary>
        /// Optional. Labels as key value pairs
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `developerconnect.googleapis.com/GitRepositoryLink`.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Identifier. Resource name of the repository, in the format
        /// `projects/*/locations/*/connections/*/gitRepositoryLinks/*`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `developerconnect.googleapis.com/GitRepositoryLink`.
        /// </summary>
        [Output("parentConnection")]
        public Output<string> ParentConnection { get; private set; } = null!;

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
        /// Output only. Set to true when the connection is being set up or updated in the
        /// background.
        /// </summary>
        [Output("reconciling")]
        public Output<bool> Reconciling { get; private set; } = null!;

        /// <summary>
        /// Output only. A system-assigned unique identifier for a the GitRepositoryLink.
        /// </summary>
        [Output("uid")]
        public Output<string> Uid { get; private set; } = null!;

        /// <summary>
        /// Output only. [Output only] Update timestamp
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a GitRepositoryLink resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GitRepositoryLink(string name, GitRepositoryLinkArgs args, CustomResourceOptions? options = null)
            : base("gcp:developerconnect/gitRepositoryLink:GitRepositoryLink", name, args ?? new GitRepositoryLinkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GitRepositoryLink(string name, Input<string> id, GitRepositoryLinkState? state = null, CustomResourceOptions? options = null)
            : base("gcp:developerconnect/gitRepositoryLink:GitRepositoryLink", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GitRepositoryLink resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GitRepositoryLink Get(string name, Input<string> id, GitRepositoryLinkState? state = null, CustomResourceOptions? options = null)
        {
            return new GitRepositoryLink(name, id, state, options);
        }
    }

    public sealed class GitRepositoryLinkArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Optional. Allows clients to store small amounts of arbitrary data.
        /// **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
        /// Please refer to the field `effective_annotations` for all of the annotations present on the resource.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// Required. Git Clone URI.
        /// </summary>
        [Input("cloneUri", required: true)]
        public Input<string> CloneUri { get; set; } = null!;

        /// <summary>
        /// Optional. This checksum is computed by the server based on the value of other
        /// fields, and may be sent on update and delete requests to ensure the
        /// client has an up-to-date value before proceeding.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// Required. The ID to use for the repository, which will become the final component of
        /// the repository's resource name. This ID should be unique in the connection.
        /// Allows alphanumeric characters and any of -._~%!$&amp;'()*+,;=@.
        /// </summary>
        [Input("gitRepositoryLinkId", required: true)]
        public Input<string> GitRepositoryLinkId { get; set; } = null!;

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Optional. Labels as key value pairs
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `developerconnect.googleapis.com/GitRepositoryLink`.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `developerconnect.googleapis.com/GitRepositoryLink`.
        /// </summary>
        [Input("parentConnection", required: true)]
        public Input<string> ParentConnection { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public GitRepositoryLinkArgs()
        {
        }
        public static new GitRepositoryLinkArgs Empty => new GitRepositoryLinkArgs();
    }

    public sealed class GitRepositoryLinkState : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Optional. Allows clients to store small amounts of arbitrary data.
        /// **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
        /// Please refer to the field `effective_annotations` for all of the annotations present on the resource.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// Required. Git Clone URI.
        /// </summary>
        [Input("cloneUri")]
        public Input<string>? CloneUri { get; set; }

        /// <summary>
        /// Output only. [Output only] Create timestamp
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Output only. [Output only] Delete timestamp
        /// </summary>
        [Input("deleteTime")]
        public Input<string>? DeleteTime { get; set; }

        [Input("effectiveAnnotations")]
        private InputMap<string>? _effectiveAnnotations;
        public InputMap<string> EffectiveAnnotations
        {
            get => _effectiveAnnotations ?? (_effectiveAnnotations = new InputMap<string>());
            set => _effectiveAnnotations = value;
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
        /// Optional. This checksum is computed by the server based on the value of other
        /// fields, and may be sent on update and delete requests to ensure the
        /// client has an up-to-date value before proceeding.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// Required. The ID to use for the repository, which will become the final component of
        /// the repository's resource name. This ID should be unique in the connection.
        /// Allows alphanumeric characters and any of -._~%!$&amp;'()*+,;=@.
        /// </summary>
        [Input("gitRepositoryLinkId")]
        public Input<string>? GitRepositoryLinkId { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Optional. Labels as key value pairs
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `developerconnect.googleapis.com/GitRepositoryLink`.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Identifier. Resource name of the repository, in the format
        /// `projects/*/locations/*/connections/*/gitRepositoryLinks/*`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `developerconnect.googleapis.com/GitRepositoryLink`.
        /// </summary>
        [Input("parentConnection")]
        public Input<string>? ParentConnection { get; set; }

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
        /// Output only. Set to true when the connection is being set up or updated in the
        /// background.
        /// </summary>
        [Input("reconciling")]
        public Input<bool>? Reconciling { get; set; }

        /// <summary>
        /// Output only. A system-assigned unique identifier for a the GitRepositoryLink.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        /// <summary>
        /// Output only. [Output only] Update timestamp
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public GitRepositoryLinkState()
        {
        }
        public static new GitRepositoryLinkState Empty => new GitRepositoryLinkState();
    }
}
