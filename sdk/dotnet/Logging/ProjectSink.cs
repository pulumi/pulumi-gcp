// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Logging
{
    /// <summary>
    /// ## Import
    /// 
    /// Project-level logging sinks can be imported using their URI, e.g.
    /// 
    /// * `projects/{{project_id}}/sinks/{{name}}`
    /// 
    /// When using the `pulumi import` command, project-level logging sinks can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:logging/projectSink:ProjectSink default projects/{{project_id}}/sinks/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:logging/projectSink:ProjectSink")]
    public partial class ProjectSink : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Options that affect sinks exporting data to BigQuery. Structure documented below.
        /// </summary>
        [Output("bigqueryOptions")]
        public Output<Outputs.ProjectSinkBigqueryOptions> BigqueryOptions { get; private set; } = null!;

        /// <summary>
        /// A user managed service account that will be used to write
        /// the log entries. The format must be `serviceAccount:some@email`. This field can only be specified if you are
        /// routing logs to a destination outside this sink's project. If not specified, a Logging service account
        /// will automatically be generated.
        /// </summary>
        [Output("customWriterIdentity")]
        public Output<string?> CustomWriterIdentity { get; private set; } = null!;

        /// <summary>
        /// A description of this sink. The maximum length of the description is 8000 characters.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The destination of the sink (or, in other words, where logs are written to). Can be a Cloud Storage bucket, a PubSub topic, a BigQuery dataset, a Cloud Logging bucket, or a Google Cloud project. Examples:
        /// 
        /// - `storage.googleapis.com/[GCS_BUCKET]`
        /// - `bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]`
        /// - `pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]`
        /// - `logging.googleapis.com/projects/[PROJECT_ID]/locations/global/buckets/[BUCKET_ID]`
        /// - `logging.googleapis.com/projects/[PROJECT_ID]`
        /// 
        /// The writer associated with the sink must have access to write to the above resource.
        /// </summary>
        [Output("destination")]
        public Output<string> Destination { get; private set; } = null!;

        /// <summary>
        /// If set to True, then this sink is disabled and it does not export any log entries.
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
        /// </summary>
        [Output("exclusions")]
        public Output<ImmutableArray<Outputs.ProjectSinkExclusion>> Exclusions { get; private set; } = null!;

        /// <summary>
        /// The filter to apply when exporting logs. Only log entries that match the filter are exported.
        /// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
        /// write a filter.
        /// </summary>
        [Output("filter")]
        public Output<string?> Filter { get; private set; } = null!;

        /// <summary>
        /// The name of the logging sink. Logging automatically creates two sinks: `_Required` and `_Default`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the project to create the sink in. If omitted, the project associated with the provider is
        /// used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Whether or not to create a unique identity associated with this sink. If `false`, then the `writer_identity` used is `serviceAccount:cloud-logs@system.gserviceaccount.com`. If `true` (the default),
        /// then a unique service account is created and used for this sink. If you wish to publish logs across projects or utilize
        /// `bigquery_options`, you must set `unique_writer_identity` to true.
        /// </summary>
        [Output("uniqueWriterIdentity")]
        public Output<bool?> UniqueWriterIdentity { get; private set; } = null!;

        /// <summary>
        /// The identity associated with this sink. This identity must be granted write access to the
        /// configured `destination`.
        /// </summary>
        [Output("writerIdentity")]
        public Output<string> WriterIdentity { get; private set; } = null!;


        /// <summary>
        /// Create a ProjectSink resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ProjectSink(string name, ProjectSinkArgs args, CustomResourceOptions? options = null)
            : base("gcp:logging/projectSink:ProjectSink", name, args ?? new ProjectSinkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ProjectSink(string name, Input<string> id, ProjectSinkState? state = null, CustomResourceOptions? options = null)
            : base("gcp:logging/projectSink:ProjectSink", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ProjectSink resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ProjectSink Get(string name, Input<string> id, ProjectSinkState? state = null, CustomResourceOptions? options = null)
        {
            return new ProjectSink(name, id, state, options);
        }
    }

    public sealed class ProjectSinkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Options that affect sinks exporting data to BigQuery. Structure documented below.
        /// </summary>
        [Input("bigqueryOptions")]
        public Input<Inputs.ProjectSinkBigqueryOptionsArgs>? BigqueryOptions { get; set; }

        /// <summary>
        /// A user managed service account that will be used to write
        /// the log entries. The format must be `serviceAccount:some@email`. This field can only be specified if you are
        /// routing logs to a destination outside this sink's project. If not specified, a Logging service account
        /// will automatically be generated.
        /// </summary>
        [Input("customWriterIdentity")]
        public Input<string>? CustomWriterIdentity { get; set; }

        /// <summary>
        /// A description of this sink. The maximum length of the description is 8000 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The destination of the sink (or, in other words, where logs are written to). Can be a Cloud Storage bucket, a PubSub topic, a BigQuery dataset, a Cloud Logging bucket, or a Google Cloud project. Examples:
        /// 
        /// - `storage.googleapis.com/[GCS_BUCKET]`
        /// - `bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]`
        /// - `pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]`
        /// - `logging.googleapis.com/projects/[PROJECT_ID]/locations/global/buckets/[BUCKET_ID]`
        /// - `logging.googleapis.com/projects/[PROJECT_ID]`
        /// 
        /// The writer associated with the sink must have access to write to the above resource.
        /// </summary>
        [Input("destination", required: true)]
        public Input<string> Destination { get; set; } = null!;

        /// <summary>
        /// If set to True, then this sink is disabled and it does not export any log entries.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("exclusions")]
        private InputList<Inputs.ProjectSinkExclusionArgs>? _exclusions;

        /// <summary>
        /// Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
        /// </summary>
        public InputList<Inputs.ProjectSinkExclusionArgs> Exclusions
        {
            get => _exclusions ?? (_exclusions = new InputList<Inputs.ProjectSinkExclusionArgs>());
            set => _exclusions = value;
        }

        /// <summary>
        /// The filter to apply when exporting logs. Only log entries that match the filter are exported.
        /// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
        /// write a filter.
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        /// <summary>
        /// The name of the logging sink. Logging automatically creates two sinks: `_Required` and `_Default`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project to create the sink in. If omitted, the project associated with the provider is
        /// used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Whether or not to create a unique identity associated with this sink. If `false`, then the `writer_identity` used is `serviceAccount:cloud-logs@system.gserviceaccount.com`. If `true` (the default),
        /// then a unique service account is created and used for this sink. If you wish to publish logs across projects or utilize
        /// `bigquery_options`, you must set `unique_writer_identity` to true.
        /// </summary>
        [Input("uniqueWriterIdentity")]
        public Input<bool>? UniqueWriterIdentity { get; set; }

        public ProjectSinkArgs()
        {
        }
        public static new ProjectSinkArgs Empty => new ProjectSinkArgs();
    }

    public sealed class ProjectSinkState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Options that affect sinks exporting data to BigQuery. Structure documented below.
        /// </summary>
        [Input("bigqueryOptions")]
        public Input<Inputs.ProjectSinkBigqueryOptionsGetArgs>? BigqueryOptions { get; set; }

        /// <summary>
        /// A user managed service account that will be used to write
        /// the log entries. The format must be `serviceAccount:some@email`. This field can only be specified if you are
        /// routing logs to a destination outside this sink's project. If not specified, a Logging service account
        /// will automatically be generated.
        /// </summary>
        [Input("customWriterIdentity")]
        public Input<string>? CustomWriterIdentity { get; set; }

        /// <summary>
        /// A description of this sink. The maximum length of the description is 8000 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The destination of the sink (or, in other words, where logs are written to). Can be a Cloud Storage bucket, a PubSub topic, a BigQuery dataset, a Cloud Logging bucket, or a Google Cloud project. Examples:
        /// 
        /// - `storage.googleapis.com/[GCS_BUCKET]`
        /// - `bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]`
        /// - `pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]`
        /// - `logging.googleapis.com/projects/[PROJECT_ID]/locations/global/buckets/[BUCKET_ID]`
        /// - `logging.googleapis.com/projects/[PROJECT_ID]`
        /// 
        /// The writer associated with the sink must have access to write to the above resource.
        /// </summary>
        [Input("destination")]
        public Input<string>? Destination { get; set; }

        /// <summary>
        /// If set to True, then this sink is disabled and it does not export any log entries.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("exclusions")]
        private InputList<Inputs.ProjectSinkExclusionGetArgs>? _exclusions;

        /// <summary>
        /// Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
        /// </summary>
        public InputList<Inputs.ProjectSinkExclusionGetArgs> Exclusions
        {
            get => _exclusions ?? (_exclusions = new InputList<Inputs.ProjectSinkExclusionGetArgs>());
            set => _exclusions = value;
        }

        /// <summary>
        /// The filter to apply when exporting logs. Only log entries that match the filter are exported.
        /// See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
        /// write a filter.
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        /// <summary>
        /// The name of the logging sink. Logging automatically creates two sinks: `_Required` and `_Default`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project to create the sink in. If omitted, the project associated with the provider is
        /// used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Whether or not to create a unique identity associated with this sink. If `false`, then the `writer_identity` used is `serviceAccount:cloud-logs@system.gserviceaccount.com`. If `true` (the default),
        /// then a unique service account is created and used for this sink. If you wish to publish logs across projects or utilize
        /// `bigquery_options`, you must set `unique_writer_identity` to true.
        /// </summary>
        [Input("uniqueWriterIdentity")]
        public Input<bool>? UniqueWriterIdentity { get; set; }

        /// <summary>
        /// The identity associated with this sink. This identity must be granted write access to the
        /// configured `destination`.
        /// </summary>
        [Input("writerIdentity")]
        public Input<string>? WriterIdentity { get; set; }

        public ProjectSinkState()
        {
        }
        public static new ProjectSinkState Empty => new ProjectSinkState();
    }
}
