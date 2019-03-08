import * as pulumi from "@pulumi/pulumi";
/**
 * Manages a billing account logging sink. For more information see
 * [the official documentation](https://cloud.google.com/logging/docs/) and
 * [Exporting Logs in the API](https://cloud.google.com/logging/docs/api/tasks/exporting-logs).
 *
 * > **Note** You must have the "Logs Configuration Writer" IAM role (`roles/logging.configWriter`)
 * [granted on the billing account](https://cloud.google.com/billing/reference/rest/v1/billingAccounts/getIamPolicy) to
 * the credentials used with Terraform. [IAM roles granted on a billing account](https://cloud.google.com/billing/docs/how-to/billing-access) are separate from the
 * typical IAM roles granted on a project.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const log_bucket = new gcp.storage.Bucket("log-bucket", {});
 * const my_sink = new gcp.logging.BillingAccountSink("my-sink", {
 *     billingAccount: "ABCDEF-012345-GHIJKL",
 *     destination: log_bucket.name.apply(name => `storage.googleapis.com/${name}`),
 * });
 * const log_writer = new gcp.projects.IAMBinding("log-writer", {
 *     members: [my_sink.writerIdentity],
 *     role: "roles/storage.objectCreator",
 * });
 * ```
 */
export declare class BillingAccountSink extends pulumi.CustomResource {
    /**
     * Get an existing BillingAccountSink resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BillingAccountSinkState, opts?: pulumi.CustomResourceOptions): BillingAccountSink;
    /**
     * The billing account exported to the sink.
     */
    readonly billingAccount: pulumi.Output<string>;
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
     * The identity associated with this sink. This identity must be granted write access to the
     * configured `destination`.
     */
    readonly writerIdentity: pulumi.Output<string>;
    /**
     * Create a BillingAccountSink resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BillingAccountSinkArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering BillingAccountSink resources.
 */
export interface BillingAccountSinkState {
    /**
     * The billing account exported to the sink.
     */
    readonly billingAccount?: pulumi.Input<string>;
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
     * The identity associated with this sink. This identity must be granted write access to the
     * configured `destination`.
     */
    readonly writerIdentity?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a BillingAccountSink resource.
 */
export interface BillingAccountSinkArgs {
    /**
     * The billing account exported to the sink.
     */
    readonly billingAccount: pulumi.Input<string>;
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
}
