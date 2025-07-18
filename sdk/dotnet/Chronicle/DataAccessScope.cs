// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Chronicle
{
    /// <summary>
    /// A DataAccessScope is a boolean expression of data access labels used to restrict access to data for users.
    /// 
    /// To get more information about DataAccessScope, see:
    /// 
    /// * [API documentation](https://cloud.google.com/chronicle/docs/reference/rest/v1/projects.locations.instances.dataAccessScopes)
    /// * How-to Guides
    ///     * [Introduction to data RBAC](https://cloud.google.com/chronicle/docs/onboard/onboard-datarbac)
    /// 
    /// ## Example Usage
    /// 
    /// ### Chronicle Dataaccessscope With Logtype
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Gcp.Chronicle.DataAccessScope("example", new()
    ///     {
    ///         Location = "us",
    ///         Instance = "00000000-0000-0000-0000-000000000000",
    ///         DataAccessScopeId = "scope-id",
    ///         Description = "scope-description",
    ///         AllowedDataAccessLabels = new[]
    ///         {
    ///             new Gcp.Chronicle.Inputs.DataAccessScopeAllowedDataAccessLabelArgs
    ///             {
    ///                 LogType = "GCP_CLOUDAUDIT",
    ///             },
    ///             new Gcp.Chronicle.Inputs.DataAccessScopeAllowedDataAccessLabelArgs
    ///             {
    ///                 LogType = "GITHUB",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Chronicle Dataaccessscope With Dataaccesslabel
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var customDataAccessLabel = new Gcp.Chronicle.DataAccessLabel("custom_data_access_label", new()
    ///     {
    ///         Location = "us",
    ///         Instance = "00000000-0000-0000-0000-000000000000",
    ///         DataAccessLabelId = "label-id",
    ///         UdmQuery = "principal.hostname=\"google.com\"",
    ///     });
    /// 
    ///     var example = new Gcp.Chronicle.DataAccessScope("example", new()
    ///     {
    ///         Location = "us",
    ///         Instance = "00000000-0000-0000-0000-000000000000",
    ///         DataAccessScopeId = "scope-id",
    ///         Description = "scope-description",
    ///         AllowedDataAccessLabels = new[]
    ///         {
    ///             new Gcp.Chronicle.Inputs.DataAccessScopeAllowedDataAccessLabelArgs
    ///             {
    ///                 DataAccessLabel = googleChronicleDataAccessLabel.CustomDataAccessLabel.DataAccessLabelId,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Chronicle Dataaccessscope With Asset Namespace
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Gcp.Chronicle.DataAccessScope("example", new()
    ///     {
    ///         Location = "us",
    ///         Instance = "00000000-0000-0000-0000-000000000000",
    ///         DataAccessScopeId = "scope-id",
    ///         Description = "scope-description",
    ///         AllowedDataAccessLabels = new[]
    ///         {
    ///             new Gcp.Chronicle.Inputs.DataAccessScopeAllowedDataAccessLabelArgs
    ///             {
    ///                 AssetNamespace = "my-namespace",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Chronicle Dataaccessscope With Ingestion Label
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Gcp.Chronicle.DataAccessScope("example", new()
    ///     {
    ///         Location = "us",
    ///         Instance = "00000000-0000-0000-0000-000000000000",
    ///         DataAccessScopeId = "scope-id",
    ///         Description = "scope-description",
    ///         AllowedDataAccessLabels = new[]
    ///         {
    ///             new Gcp.Chronicle.Inputs.DataAccessScopeAllowedDataAccessLabelArgs
    ///             {
    ///                 IngestionLabel = new Gcp.Chronicle.Inputs.DataAccessScopeAllowedDataAccessLabelIngestionLabelArgs
    ///                 {
    ///                     IngestionLabelKey = "ingestion_key",
    ///                     IngestionLabelValue = "ingestion_value",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Chronicle Dataaccessscope With Denied Labels
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var customDataAccessLabel = new Gcp.Chronicle.DataAccessLabel("custom_data_access_label", new()
    ///     {
    ///         Location = "us",
    ///         Instance = "00000000-0000-0000-0000-000000000000",
    ///         DataAccessLabelId = "label-id",
    ///         UdmQuery = "principal.hostname=\"google.com\"",
    ///     });
    /// 
    ///     var example = new Gcp.Chronicle.DataAccessScope("example", new()
    ///     {
    ///         Location = "us",
    ///         Instance = "00000000-0000-0000-0000-000000000000",
    ///         DataAccessScopeId = "scope-id",
    ///         Description = "scope-description",
    ///         AllowAll = true,
    ///         DeniedDataAccessLabels = new[]
    ///         {
    ///             new Gcp.Chronicle.Inputs.DataAccessScopeDeniedDataAccessLabelArgs
    ///             {
    ///                 LogType = "GCP_CLOUDAUDIT",
    ///             },
    ///             new Gcp.Chronicle.Inputs.DataAccessScopeDeniedDataAccessLabelArgs
    ///             {
    ///                 DataAccessLabel = googleChronicleDataAccessLabel.CustomDataAccessLabel.DataAccessLabelId,
    ///             },
    ///             new Gcp.Chronicle.Inputs.DataAccessScopeDeniedDataAccessLabelArgs
    ///             {
    ///                 IngestionLabel = new Gcp.Chronicle.Inputs.DataAccessScopeDeniedDataAccessLabelIngestionLabelArgs
    ///                 {
    ///                     IngestionLabelKey = "ingestion_key",
    ///                     IngestionLabelValue = "ingestion_value",
    ///                 },
    ///             },
    ///             new Gcp.Chronicle.Inputs.DataAccessScopeDeniedDataAccessLabelArgs
    ///             {
    ///                 AssetNamespace = "my-namespace",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// DataAccessScope can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/instances/{{instance}}/dataAccessScopes/{{data_access_scope_id}}`
    /// 
    /// * `{{project}}/{{location}}/{{instance}}/{{data_access_scope_id}}`
    /// 
    /// * `{{location}}/{{instance}}/{{data_access_scope_id}}`
    /// 
    /// When using the `pulumi import` command, DataAccessScope can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:chronicle/dataAccessScope:DataAccessScope default projects/{{project}}/locations/{{location}}/instances/{{instance}}/dataAccessScopes/{{data_access_scope_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:chronicle/dataAccessScope:DataAccessScope default {{project}}/{{location}}/{{instance}}/{{data_access_scope_id}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:chronicle/dataAccessScope:DataAccessScope default {{location}}/{{instance}}/{{data_access_scope_id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:chronicle/dataAccessScope:DataAccessScope")]
    public partial class DataAccessScope : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Optional. Whether or not the scope allows all labels, allow_all and
        /// allowed_data_access_labels are mutually exclusive and one of them must be
        /// present. denied_data_access_labels can still be used along with allow_all.
        /// When combined with denied_data_access_labels, access will be granted to all
        /// data that doesn't have labels mentioned in denied_data_access_labels. E.g.:
        /// A customer with scope with denied labels A and B and allow_all will be able
        /// to see all data except data labeled with A and data labeled with B and data
        /// with labels A and B.
        /// </summary>
        [Output("allowAll")]
        public Output<bool?> AllowAll { get; private set; } = null!;

        /// <summary>
        /// The allowed labels for the scope. There has to be at
        /// least one label allowed for the scope to be valid.
        /// The logical operator for evaluation of the allowed labels is OR.
        /// Either allow_all or allowed_data_access_labels needs to be provided.
        /// E.g.: A customer with scope with allowed labels A and B will be able
        /// to see data with labeled with A or B or (A and B).
        /// Structure is documented below.
        /// </summary>
        [Output("allowedDataAccessLabels")]
        public Output<ImmutableArray<Outputs.DataAccessScopeAllowedDataAccessLabel>> AllowedDataAccessLabels { get; private set; } = null!;

        /// <summary>
        /// Output only. The user who created the data access scope.
        /// </summary>
        [Output("author")]
        public Output<string> Author { get; private set; } = null!;

        /// <summary>
        /// Output only. The time at which the data access scope was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Required. The user provided scope id which will become the last part of the name
        /// of the scope resource.
        /// Needs to be compliant with https://google.aip.dev/122
        /// </summary>
        [Output("dataAccessScopeId")]
        public Output<string> DataAccessScopeId { get; private set; } = null!;

        /// <summary>
        /// Optional. The denied labels for the scope.
        /// The logical operator for evaluation of the denied labels is AND.
        /// E.g.: A customer with scope with denied labels A and B won't be able
        /// to see data labeled with A and data labeled with B
        /// and data with labels A and B.
        /// Structure is documented below.
        /// </summary>
        [Output("deniedDataAccessLabels")]
        public Output<ImmutableArray<Outputs.DataAccessScopeDeniedDataAccessLabel>> DeniedDataAccessLabels { get; private set; } = null!;

        /// <summary>
        /// Optional. A description of the data access scope for a human reader.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Output only. The name to be used for display to customers of the data access scope.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the Chronicle instance, which is the same as the customer ID.
        /// </summary>
        [Output("instance")]
        public Output<string> Instance { get; private set; } = null!;

        /// <summary>
        /// Output only. The user who last updated the data access scope.
        /// </summary>
        [Output("lastEditor")]
        public Output<string> LastEditor { get; private set; } = null!;

        /// <summary>
        /// The location of the resource. This is the geographical region where the Chronicle instance resides, such as "us" or "europe-west2".
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The unique full name of the data access scope. This unique identifier is generated using values provided for the URL parameters.
        /// Format:
        /// projects/{project}/locations/{location}/instances/{instance}/dataAccessScopes/{data_access_scope_id}
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
        /// Output only. The time at which the data access scope was last updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a DataAccessScope resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DataAccessScope(string name, DataAccessScopeArgs args, CustomResourceOptions? options = null)
            : base("gcp:chronicle/dataAccessScope:DataAccessScope", name, args ?? new DataAccessScopeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DataAccessScope(string name, Input<string> id, DataAccessScopeState? state = null, CustomResourceOptions? options = null)
            : base("gcp:chronicle/dataAccessScope:DataAccessScope", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DataAccessScope resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DataAccessScope Get(string name, Input<string> id, DataAccessScopeState? state = null, CustomResourceOptions? options = null)
        {
            return new DataAccessScope(name, id, state, options);
        }
    }

    public sealed class DataAccessScopeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. Whether or not the scope allows all labels, allow_all and
        /// allowed_data_access_labels are mutually exclusive and one of them must be
        /// present. denied_data_access_labels can still be used along with allow_all.
        /// When combined with denied_data_access_labels, access will be granted to all
        /// data that doesn't have labels mentioned in denied_data_access_labels. E.g.:
        /// A customer with scope with denied labels A and B and allow_all will be able
        /// to see all data except data labeled with A and data labeled with B and data
        /// with labels A and B.
        /// </summary>
        [Input("allowAll")]
        public Input<bool>? AllowAll { get; set; }

        [Input("allowedDataAccessLabels")]
        private InputList<Inputs.DataAccessScopeAllowedDataAccessLabelArgs>? _allowedDataAccessLabels;

        /// <summary>
        /// The allowed labels for the scope. There has to be at
        /// least one label allowed for the scope to be valid.
        /// The logical operator for evaluation of the allowed labels is OR.
        /// Either allow_all or allowed_data_access_labels needs to be provided.
        /// E.g.: A customer with scope with allowed labels A and B will be able
        /// to see data with labeled with A or B or (A and B).
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.DataAccessScopeAllowedDataAccessLabelArgs> AllowedDataAccessLabels
        {
            get => _allowedDataAccessLabels ?? (_allowedDataAccessLabels = new InputList<Inputs.DataAccessScopeAllowedDataAccessLabelArgs>());
            set => _allowedDataAccessLabels = value;
        }

        /// <summary>
        /// Required. The user provided scope id which will become the last part of the name
        /// of the scope resource.
        /// Needs to be compliant with https://google.aip.dev/122
        /// </summary>
        [Input("dataAccessScopeId", required: true)]
        public Input<string> DataAccessScopeId { get; set; } = null!;

        [Input("deniedDataAccessLabels")]
        private InputList<Inputs.DataAccessScopeDeniedDataAccessLabelArgs>? _deniedDataAccessLabels;

        /// <summary>
        /// Optional. The denied labels for the scope.
        /// The logical operator for evaluation of the denied labels is AND.
        /// E.g.: A customer with scope with denied labels A and B won't be able
        /// to see data labeled with A and data labeled with B
        /// and data with labels A and B.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.DataAccessScopeDeniedDataAccessLabelArgs> DeniedDataAccessLabels
        {
            get => _deniedDataAccessLabels ?? (_deniedDataAccessLabels = new InputList<Inputs.DataAccessScopeDeniedDataAccessLabelArgs>());
            set => _deniedDataAccessLabels = value;
        }

        /// <summary>
        /// Optional. A description of the data access scope for a human reader.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The unique identifier for the Chronicle instance, which is the same as the customer ID.
        /// </summary>
        [Input("instance", required: true)]
        public Input<string> Instance { get; set; } = null!;

        /// <summary>
        /// The location of the resource. This is the geographical region where the Chronicle instance resides, such as "us" or "europe-west2".
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public DataAccessScopeArgs()
        {
        }
        public static new DataAccessScopeArgs Empty => new DataAccessScopeArgs();
    }

    public sealed class DataAccessScopeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional. Whether or not the scope allows all labels, allow_all and
        /// allowed_data_access_labels are mutually exclusive and one of them must be
        /// present. denied_data_access_labels can still be used along with allow_all.
        /// When combined with denied_data_access_labels, access will be granted to all
        /// data that doesn't have labels mentioned in denied_data_access_labels. E.g.:
        /// A customer with scope with denied labels A and B and allow_all will be able
        /// to see all data except data labeled with A and data labeled with B and data
        /// with labels A and B.
        /// </summary>
        [Input("allowAll")]
        public Input<bool>? AllowAll { get; set; }

        [Input("allowedDataAccessLabels")]
        private InputList<Inputs.DataAccessScopeAllowedDataAccessLabelGetArgs>? _allowedDataAccessLabels;

        /// <summary>
        /// The allowed labels for the scope. There has to be at
        /// least one label allowed for the scope to be valid.
        /// The logical operator for evaluation of the allowed labels is OR.
        /// Either allow_all or allowed_data_access_labels needs to be provided.
        /// E.g.: A customer with scope with allowed labels A and B will be able
        /// to see data with labeled with A or B or (A and B).
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.DataAccessScopeAllowedDataAccessLabelGetArgs> AllowedDataAccessLabels
        {
            get => _allowedDataAccessLabels ?? (_allowedDataAccessLabels = new InputList<Inputs.DataAccessScopeAllowedDataAccessLabelGetArgs>());
            set => _allowedDataAccessLabels = value;
        }

        /// <summary>
        /// Output only. The user who created the data access scope.
        /// </summary>
        [Input("author")]
        public Input<string>? Author { get; set; }

        /// <summary>
        /// Output only. The time at which the data access scope was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Required. The user provided scope id which will become the last part of the name
        /// of the scope resource.
        /// Needs to be compliant with https://google.aip.dev/122
        /// </summary>
        [Input("dataAccessScopeId")]
        public Input<string>? DataAccessScopeId { get; set; }

        [Input("deniedDataAccessLabels")]
        private InputList<Inputs.DataAccessScopeDeniedDataAccessLabelGetArgs>? _deniedDataAccessLabels;

        /// <summary>
        /// Optional. The denied labels for the scope.
        /// The logical operator for evaluation of the denied labels is AND.
        /// E.g.: A customer with scope with denied labels A and B won't be able
        /// to see data labeled with A and data labeled with B
        /// and data with labels A and B.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.DataAccessScopeDeniedDataAccessLabelGetArgs> DeniedDataAccessLabels
        {
            get => _deniedDataAccessLabels ?? (_deniedDataAccessLabels = new InputList<Inputs.DataAccessScopeDeniedDataAccessLabelGetArgs>());
            set => _deniedDataAccessLabels = value;
        }

        /// <summary>
        /// Optional. A description of the data access scope for a human reader.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Output only. The name to be used for display to customers of the data access scope.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The unique identifier for the Chronicle instance, which is the same as the customer ID.
        /// </summary>
        [Input("instance")]
        public Input<string>? Instance { get; set; }

        /// <summary>
        /// Output only. The user who last updated the data access scope.
        /// </summary>
        [Input("lastEditor")]
        public Input<string>? LastEditor { get; set; }

        /// <summary>
        /// The location of the resource. This is the geographical region where the Chronicle instance resides, such as "us" or "europe-west2".
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The unique full name of the data access scope. This unique identifier is generated using values provided for the URL parameters.
        /// Format:
        /// projects/{project}/locations/{location}/instances/{instance}/dataAccessScopes/{data_access_scope_id}
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Output only. The time at which the data access scope was last updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public DataAccessScopeState()
        {
        }
        public static new DataAccessScopeState Empty => new DataAccessScopeState();
    }
}
