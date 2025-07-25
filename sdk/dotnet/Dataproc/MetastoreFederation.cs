// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc
{
    /// <summary>
    /// A managed metastore federation.
    /// 
    /// ## Example Usage
    /// 
    /// ### Dataproc Metastore Federation Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var defaultMetastoreService = new Gcp.Dataproc.MetastoreService("default", new()
    ///     {
    ///         ServiceId = "metastore-service",
    ///         Location = "us-central1",
    ///         Tier = "DEVELOPER",
    ///         HiveMetastoreConfig = new Gcp.Dataproc.Inputs.MetastoreServiceHiveMetastoreConfigArgs
    ///         {
    ///             Version = "3.1.2",
    ///             EndpointProtocol = "GRPC",
    ///         },
    ///         DeletionProtection = false,
    ///     });
    /// 
    ///     var @default = new Gcp.Dataproc.MetastoreFederation("default", new()
    ///     {
    ///         Location = "us-central1",
    ///         FederationId = "metastore-fed",
    ///         Version = "3.1.2",
    ///         BackendMetastores = new[]
    ///         {
    ///             new Gcp.Dataproc.Inputs.MetastoreFederationBackendMetastoreArgs
    ///             {
    ///                 Rank = "1",
    ///                 Name = defaultMetastoreService.Id,
    ///                 MetastoreType = "DATAPROC_METASTORE",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Dataproc Metastore Federation Bigquery
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var defaultMetastoreService = new Gcp.Dataproc.MetastoreService("default", new()
    ///     {
    ///         ServiceId = "metastore-service",
    ///         Location = "us-central1",
    ///         Tier = "DEVELOPER",
    ///         HiveMetastoreConfig = new Gcp.Dataproc.Inputs.MetastoreServiceHiveMetastoreConfigArgs
    ///         {
    ///             Version = "3.1.2",
    ///             EndpointProtocol = "GRPC",
    ///         },
    ///     });
    /// 
    ///     var project = Gcp.Organizations.GetProject.Invoke();
    /// 
    ///     var @default = new Gcp.Dataproc.MetastoreFederation("default", new()
    ///     {
    ///         Location = "us-central1",
    ///         FederationId = "metastore-fed",
    ///         Version = "3.1.2",
    ///         BackendMetastores = new[]
    ///         {
    ///             new Gcp.Dataproc.Inputs.MetastoreFederationBackendMetastoreArgs
    ///             {
    ///                 Rank = "2",
    ///                 Name = project.Apply(getProjectResult =&gt; getProjectResult.Id),
    ///                 MetastoreType = "BIGQUERY",
    ///             },
    ///             new Gcp.Dataproc.Inputs.MetastoreFederationBackendMetastoreArgs
    ///             {
    ///                 Rank = "1",
    ///                 Name = defaultMetastoreService.Id,
    ///                 MetastoreType = "DATAPROC_METASTORE",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Federation can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/federations/{{federation_id}}`
    /// 
    /// * `{{project}}/{{location}}/{{federation_id}}`
    /// 
    /// * `{{location}}/{{federation_id}}`
    /// 
    /// When using the `pulumi import` command, Federation can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:dataproc/metastoreFederation:MetastoreFederation default projects/{{project}}/locations/{{location}}/federations/{{federation_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:dataproc/metastoreFederation:MetastoreFederation default {{project}}/{{location}}/{{federation_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:dataproc/metastoreFederation:MetastoreFederation default {{location}}/{{federation_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:dataproc/metastoreFederation:MetastoreFederation")]
    public partial class MetastoreFederation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A map from BackendMetastore rank to BackendMetastores from which the federation service serves metadata at query time. The map key represents the order in which BackendMetastores should be evaluated to resolve database names at query time and should be greater than or equal to zero. A BackendMetastore with a lower number will be evaluated before a BackendMetastore with a higher number.
        /// Structure is documented below.
        /// </summary>
        [Output("backendMetastores")]
        public Output<ImmutableArray<Outputs.MetastoreFederationBackendMetastore>> BackendMetastores { get; private set; } = null!;

        /// <summary>
        /// Output only. The time when the metastore federation was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        [Output("deletionProtection")]
        public Output<bool?> DeletionProtection { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// The URI of the endpoint used to access the metastore federation.
        /// </summary>
        [Output("endpointUri")]
        public Output<string> EndpointUri { get; private set; } = null!;

        /// <summary>
        /// The ID of the metastore federation. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
        /// and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
        /// 3 and 63 characters.
        /// </summary>
        [Output("federationId")]
        public Output<string> FederationId { get; private set; } = null!;

        /// <summary>
        /// User-defined labels for the metastore federation.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// The location where the metastore federation should reside.
        /// </summary>
        [Output("location")]
        public Output<string?> Location { get; private set; } = null!;

        /// <summary>
        /// The relative resource name of the metastore federation.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

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
        /// The current state of the metastore federation.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Additional information about the current state of the metastore federation, if available.
        /// </summary>
        [Output("stateMessage")]
        public Output<string> StateMessage { get; private set; } = null!;

        /// <summary>
        /// The globally unique resource identifier of the metastore federation.
        /// </summary>
        [Output("uid")]
        public Output<string> Uid { get; private set; } = null!;

        /// <summary>
        /// Output only. The time when the metastore federation was last updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;

        /// <summary>
        /// The Apache Hive metastore version of the federation. All backend metastore versions must be compatible with the federation version.
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;


        /// <summary>
        /// Create a MetastoreFederation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MetastoreFederation(string name, MetastoreFederationArgs args, CustomResourceOptions? options = null)
            : base("gcp:dataproc/metastoreFederation:MetastoreFederation", name, args ?? new MetastoreFederationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MetastoreFederation(string name, Input<string> id, MetastoreFederationState? state = null, CustomResourceOptions? options = null)
            : base("gcp:dataproc/metastoreFederation:MetastoreFederation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MetastoreFederation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MetastoreFederation Get(string name, Input<string> id, MetastoreFederationState? state = null, CustomResourceOptions? options = null)
        {
            return new MetastoreFederation(name, id, state, options);
        }
    }

    public sealed class MetastoreFederationArgs : global::Pulumi.ResourceArgs
    {
        [Input("backendMetastores", required: true)]
        private InputList<Inputs.MetastoreFederationBackendMetastoreArgs>? _backendMetastores;

        /// <summary>
        /// A map from BackendMetastore rank to BackendMetastores from which the federation service serves metadata at query time. The map key represents the order in which BackendMetastores should be evaluated to resolve database names at query time and should be greater than or equal to zero. A BackendMetastore with a lower number will be evaluated before a BackendMetastore with a higher number.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.MetastoreFederationBackendMetastoreArgs> BackendMetastores
        {
            get => _backendMetastores ?? (_backendMetastores = new InputList<Inputs.MetastoreFederationBackendMetastoreArgs>());
            set => _backendMetastores = value;
        }

        [Input("deletionProtection")]
        public Input<bool>? DeletionProtection { get; set; }

        /// <summary>
        /// The ID of the metastore federation. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
        /// and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
        /// 3 and 63 characters.
        /// </summary>
        [Input("federationId", required: true)]
        public Input<string> FederationId { get; set; } = null!;

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// User-defined labels for the metastore federation.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The location where the metastore federation should reside.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The Apache Hive metastore version of the federation. All backend metastore versions must be compatible with the federation version.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public MetastoreFederationArgs()
        {
        }
        public static new MetastoreFederationArgs Empty => new MetastoreFederationArgs();
    }

    public sealed class MetastoreFederationState : global::Pulumi.ResourceArgs
    {
        [Input("backendMetastores")]
        private InputList<Inputs.MetastoreFederationBackendMetastoreGetArgs>? _backendMetastores;

        /// <summary>
        /// A map from BackendMetastore rank to BackendMetastores from which the federation service serves metadata at query time. The map key represents the order in which BackendMetastores should be evaluated to resolve database names at query time and should be greater than or equal to zero. A BackendMetastore with a lower number will be evaluated before a BackendMetastore with a higher number.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.MetastoreFederationBackendMetastoreGetArgs> BackendMetastores
        {
            get => _backendMetastores ?? (_backendMetastores = new InputList<Inputs.MetastoreFederationBackendMetastoreGetArgs>());
            set => _backendMetastores = value;
        }

        /// <summary>
        /// Output only. The time when the metastore federation was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        [Input("deletionProtection")]
        public Input<bool>? DeletionProtection { get; set; }

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
        /// The URI of the endpoint used to access the metastore federation.
        /// </summary>
        [Input("endpointUri")]
        public Input<string>? EndpointUri { get; set; }

        /// <summary>
        /// The ID of the metastore federation. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
        /// and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
        /// 3 and 63 characters.
        /// </summary>
        [Input("federationId")]
        public Input<string>? FederationId { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// User-defined labels for the metastore federation.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The location where the metastore federation should reside.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The relative resource name of the metastore federation.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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
        /// The current state of the metastore federation.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// Additional information about the current state of the metastore federation, if available.
        /// </summary>
        [Input("stateMessage")]
        public Input<string>? StateMessage { get; set; }

        /// <summary>
        /// The globally unique resource identifier of the metastore federation.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        /// <summary>
        /// Output only. The time when the metastore federation was last updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        /// <summary>
        /// The Apache Hive metastore version of the federation. All backend metastore versions must be compatible with the federation version.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public MetastoreFederationState()
        {
        }
        public static new MetastoreFederationState Empty => new MetastoreFederationState();
    }
}
