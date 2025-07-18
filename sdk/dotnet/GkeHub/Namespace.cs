// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub
{
    /// <summary>
    /// Namespace represents a namespace across the Fleet.
    /// 
    /// To get more information about Namespace, see:
    /// 
    /// * [API documentation](https://cloud.google.com/anthos/fleet-management/docs/reference/rest/v1/projects.locations.scopes.namespaces)
    /// * How-to Guides
    ///     * [Registering a Cluster](https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster#register_cluster)
    /// 
    /// ## Example Usage
    /// 
    /// ### Gkehub Namespace Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var scope = new Gcp.GkeHub.Scope("scope", new()
    ///     {
    ///         ScopeId = "tf-test-scope_40289",
    ///     });
    /// 
    ///     var @namespace = new Gcp.GkeHub.Namespace("namespace", new()
    ///     {
    ///         ScopeNamespaceId = "tf-test-namespace_33395",
    ///         ScopeId = scope.ScopeId,
    ///         Scope = scope.Name,
    ///         NamespaceLabels = 
    ///         {
    ///             { "keyb", "valueb" },
    ///             { "keya", "valuea" },
    ///             { "keyc", "valuec" },
    ///         },
    ///         Labels = 
    ///         {
    ///             { "keyb", "valueb" },
    ///             { "keya", "valuea" },
    ///             { "keyc", "valuec" },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             scope,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Namespace can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/global/scopes/{{scope_id}}/namespaces/{{scope_namespace_id}}`
    /// 
    /// * `{{project}}/{{scope_id}}/{{scope_namespace_id}}`
    /// 
    /// * `{{scope_id}}/{{scope_namespace_id}}`
    /// 
    /// When using the `pulumi import` command, Namespace can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:gkehub/namespace:Namespace default projects/{{project}}/locations/global/scopes/{{scope_id}}/namespaces/{{scope_namespace_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:gkehub/namespace:Namespace default {{project}}/{{scope_id}}/{{scope_namespace_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:gkehub/namespace:Namespace default {{scope_id}}/{{scope_namespace_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:gkehub/namespace:Namespace")]
    public partial class Namespace : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Time the Namespace was created in UTC.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Time the Namespace was deleted in UTC.
        /// </summary>
        [Output("deleteTime")]
        public Output<string> DeleteTime { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// Labels for this Namespace.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// The resource name for the namespace
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Namespace-level cluster namespace labels. These labels are applied
        /// to the related namespace of the member clusters bound to the parent
        /// Scope. Scope-level labels (`namespace_labels` in the Fleet Scope
        /// resource) take precedence over Namespace-level labels if they share
        /// a key. Keys and values must be Kubernetes-conformant.
        /// </summary>
        [Output("namespaceLabels")]
        public Output<ImmutableDictionary<string, string>?> NamespaceLabels { get; private set; } = null!;

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
        /// The name of the Scope instance.
        /// </summary>
        [Output("scope")]
        public Output<string> Scope { get; private set; } = null!;

        /// <summary>
        /// Id of the scope
        /// </summary>
        [Output("scopeId")]
        public Output<string> ScopeId { get; private set; } = null!;

        /// <summary>
        /// The client-provided identifier of the namespace.
        /// </summary>
        [Output("scopeNamespaceId")]
        public Output<string> ScopeNamespaceId { get; private set; } = null!;

        /// <summary>
        /// State of the namespace resource.
        /// Structure is documented below.
        /// </summary>
        [Output("states")]
        public Output<ImmutableArray<Outputs.NamespaceState>> States { get; private set; } = null!;

        /// <summary>
        /// Google-generated UUID for this resource.
        /// </summary>
        [Output("uid")]
        public Output<string> Uid { get; private set; } = null!;

        /// <summary>
        /// Time the Namespace was updated in UTC.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a Namespace resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Namespace(string name, NamespaceArgs args, CustomResourceOptions? options = null)
            : base("gcp:gkehub/namespace:Namespace", name, args ?? new NamespaceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Namespace(string name, Input<string> id, NamespaceState? state = null, CustomResourceOptions? options = null)
            : base("gcp:gkehub/namespace:Namespace", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Namespace resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Namespace Get(string name, Input<string> id, NamespaceState? state = null, CustomResourceOptions? options = null)
        {
            return new Namespace(name, id, state, options);
        }
    }

    public sealed class NamespaceArgs : global::Pulumi.ResourceArgs
    {
        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels for this Namespace.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        [Input("namespaceLabels")]
        private InputMap<string>? _namespaceLabels;

        /// <summary>
        /// Namespace-level cluster namespace labels. These labels are applied
        /// to the related namespace of the member clusters bound to the parent
        /// Scope. Scope-level labels (`namespace_labels` in the Fleet Scope
        /// resource) take precedence over Namespace-level labels if they share
        /// a key. Keys and values must be Kubernetes-conformant.
        /// </summary>
        public InputMap<string> NamespaceLabels
        {
            get => _namespaceLabels ?? (_namespaceLabels = new InputMap<string>());
            set => _namespaceLabels = value;
        }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The name of the Scope instance.
        /// </summary>
        [Input("scope", required: true)]
        public Input<string> Scope { get; set; } = null!;

        /// <summary>
        /// Id of the scope
        /// </summary>
        [Input("scopeId", required: true)]
        public Input<string> ScopeId { get; set; } = null!;

        /// <summary>
        /// The client-provided identifier of the namespace.
        /// </summary>
        [Input("scopeNamespaceId", required: true)]
        public Input<string> ScopeNamespaceId { get; set; } = null!;

        public NamespaceArgs()
        {
        }
        public static new NamespaceArgs Empty => new NamespaceArgs();
    }

    public sealed class NamespaceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time the Namespace was created in UTC.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Time the Namespace was deleted in UTC.
        /// </summary>
        [Input("deleteTime")]
        public Input<string>? DeleteTime { get; set; }

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

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels for this Namespace.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The resource name for the namespace
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("namespaceLabels")]
        private InputMap<string>? _namespaceLabels;

        /// <summary>
        /// Namespace-level cluster namespace labels. These labels are applied
        /// to the related namespace of the member clusters bound to the parent
        /// Scope. Scope-level labels (`namespace_labels` in the Fleet Scope
        /// resource) take precedence over Namespace-level labels if they share
        /// a key. Keys and values must be Kubernetes-conformant.
        /// </summary>
        public InputMap<string> NamespaceLabels
        {
            get => _namespaceLabels ?? (_namespaceLabels = new InputMap<string>());
            set => _namespaceLabels = value;
        }

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
        /// The name of the Scope instance.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        /// <summary>
        /// Id of the scope
        /// </summary>
        [Input("scopeId")]
        public Input<string>? ScopeId { get; set; }

        /// <summary>
        /// The client-provided identifier of the namespace.
        /// </summary>
        [Input("scopeNamespaceId")]
        public Input<string>? ScopeNamespaceId { get; set; }

        [Input("states")]
        private InputList<Inputs.NamespaceStateGetArgs>? _states;

        /// <summary>
        /// State of the namespace resource.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.NamespaceStateGetArgs> States
        {
            get => _states ?? (_states = new InputList<Inputs.NamespaceStateGetArgs>());
            set => _states = value;
        }

        /// <summary>
        /// Google-generated UUID for this resource.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        /// <summary>
        /// Time the Namespace was updated in UTC.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public NamespaceState()
        {
        }
        public static new NamespaceState Empty => new NamespaceState();
    }
}
