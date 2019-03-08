import * as pulumi from "@pulumi/pulumi";
/**
 * Manages a project-level logging sink. For more information see
 * [the official documentation](https://cloud.google.com/logging/docs/),
 * [Exporting Logs in the API](https://cloud.google.com/logging/docs/api/tasks/exporting-logs)
 * and
 * [API](https://cloud.google.com/logging/docs/reference/v2/rest/).
 *
 * > **Note:** You must have [granted the "Logs Configuration Writer"](https://cloud.google.com/logging/docs/access-control) IAM role (`roles/logging.configWriter`) to the credentials used with terraform.
 *
 * > **Note** You must [enable the Cloud Resource Manager API](https://console.cloud.google.com/apis/library/cloudresourcemanager.googleapis.com)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_sink = new gcp.logging.ProjectSink("my-sink", {
 *     // Can export to pubsub, cloud storage, or bigtable
 *     destination: "pubsub.googleapis.com/projects/my-project/topics/instance-activity",
 *     // Log all WARN or higher severity messages relating to instances
 *     filter: "resource.type = gce_instance AND severity >= WARN",
 *     // Use a unique writer (creates a unique service account used for writing)
 *     uniqueWriterIdentity: true,
 * });
 * ```
 *
 * A more complete example follows: this creates a compute instance, as well as a log sink that logs all activity to a
 * cloud storage bucket. Because we are using `unique_writer_identity`, we must grant it access to the bucket. Note that
 * this grant requires the "Project IAM Admin" IAM role (`roles/resourcemanager.projectIamAdmin`) granted to the credentials
 * used with terraform.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * // Our logged compute instance
 * const my_logged_instance = new gcp.compute.Instance("my-logged-instance", {
 *     bootDisk: {
 *         initializeParams: {
 *             image: "debian-cloud/debian-9",
 *         },
 *     },
 *     machineType: "n1-standard-1",
 *     networkInterfaces: [{
 *         accessConfigs: [{}],
 *         network: "default",
 *     }],
 *     zone: "us-central1-a",
 * });
 * // A bucket to store logs in
 * const log_bucket = new gcp.storage.Bucket("log-bucket", {});
 * // Our sink; this logs all activity related to our "my-logged-instance" instance
 * const instance_sink = new gcp.logging.ProjectSink("instance-sink", {
 *     destination: log_bucket.name.apply(name => `storage.googleapis.com/${name}`),
 *     filter: my_logged_instance.instanceId.apply(instanceId => `resource.type = gce_instance AND resource.labels.instance_id = "${instanceId}"`),
 *     uniqueWriterIdentity: true,
 * });
 * // Because our sink uses a unique_writer, we must grant that writer access to the bucket.
 * const log_writer = new gcp.projects.IAMBinding("log-writer", {
 *     members: [instance_sink.writerIdentity],
 *     role: "roles/storage.objectCreator",
 * });
 * ```
 */
export declare class ProjectSink extends pulumi.CustomResource {
    /**
     * Get an existing ProjectSink resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectSinkState, opts?: pulumi.CustomResourceOptions): ProjectSink;
    /**
     * The destination of the sink (or, in other words, where logs are written to). Can be a
     * Cloud Storage bucket, a PubSub topic, or a BigQuery dataset. Examples:
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * ```
     * The writer associated with the sink must have access to write to the above resource.
     */
    readonly destination: pulumi.Output<string>;
    /**
     * The filter to apply when exporting logs. Only log entries that match the filter are exported.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     */
    readonly filter: pulumi.Output<string | undefined>;
    /**
     * The name of the logging sink.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project to create the sink in. If omitted, the project associated with the provider is
     * used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * Whether or not to create a unique identity associated with this sink. If `false`
     * (the default), then the `writer_identity` used is `serviceAccount:cloud-logs@system.gserviceaccount.com`. If `true`,
     * then a unique service account is created and used for this sink. If you wish to publish logs across projects, you
     * must set `unique_writer_identity` to true.
     */
    readonly uniqueWriterIdentity: pulumi.Output<boolean | undefined>;
    /**
     * The identity associated with this sink. This identity must be granted write access to the
     * configured `destination`.
     */
    readonly writerIdentity: pulumi.Output<string>;
    /**
     * Create a ProjectSink resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProjectSinkArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering ProjectSink resources.
 */
export interface ProjectSinkState {
    /**
     * The destination of the sink (or, in other words, where logs are written to). Can be a
     * Cloud Storage bucket, a PubSub topic, or a BigQuery dataset. Examples:
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * ```
     * The writer associated with the sink must have access to write to the above resource.
     */
    readonly destination?: pulumi.Input<string>;
    /**
     * The filter to apply when exporting logs. Only log entries that match the filter are exported.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     */
    readonly filter?: pulumi.Input<string>;
    /**
     * The name of the logging sink.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project to create the sink in. If omitted, the project associated with the provider is
     * used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * Whether or not to create a unique identity associated with this sink. If `false`
     * (the default), then the `writer_identity` used is `serviceAccount:cloud-logs@system.gserviceaccount.com`. If `true`,
     * then a unique service account is created and used for this sink. If you wish to publish logs across projects, you
     * must set `unique_writer_identity` to true.
     */
    readonly uniqueWriterIdentity?: pulumi.Input<boolean>;
    /**
     * The identity associated with this sink. This identity must be granted write access to the
     * configured `destination`.
     */
    readonly writerIdentity?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a ProjectSink resource.
 */
export interface ProjectSinkArgs {
    /**
     * The destination of the sink (or, in other words, where logs are written to). Can be a
     * Cloud Storage bucket, a PubSub topic, or a BigQuery dataset. Examples:
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * ```
     * The writer associated with the sink must have access to write to the above resource.
     */
    readonly destination: pulumi.Input<string>;
    /**
     * The filter to apply when exporting logs. Only log entries that match the filter are exported.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     */
    readonly filter?: pulumi.Input<string>;
    /**
     * The name of the logging sink.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project to create the sink in. If omitted, the project associated with the provider is
     * used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * Whether or not to create a unique identity associated with this sink. If `false`
     * (the default), then the `writer_identity` used is `serviceAccount:cloud-logs@system.gserviceaccount.com`. If `true`,
     * then a unique service account is created and used for this sink. If you wish to publish logs across projects, you
     * must set `unique_writer_identity` to true.
     */
    readonly uniqueWriterIdentity?: pulumi.Input<boolean>;
}
