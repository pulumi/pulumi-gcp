import * as pulumi from "@pulumi/pulumi";
/**
 * Backend buckets allow you to use Google Cloud Storage buckets with HTTP(S)
 * load balancing.
 *
 * An HTTP(S) load balancer can direct traffic to specified URLs to a
 * backend bucket rather than a backend service. It can send requests for
 * static content to a Cloud Storage bucket and requests for dynamic content
 * a virtual machine instance.
 *
 *
 * To get more information about BackendBucket, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/latest/backendBuckets)
 * * How-to Guides
 *     * [Using a Cloud Storage bucket as a load balancer backend](https://cloud.google.com/compute/docs/load-balancing/http/backend-bucket)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=backend_bucket_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Backend Bucket Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const imageBucket = new gcp.storage.Bucket("image_bucket", {
 *     location: "EU",
 * });
 * const imageBackend = new gcp.compute.BackendBucket("image_backend", {
 *     bucketName: imageBucket.name,
 *     description: "Contains beautiful images",
 *     enableCdn: true,
 * });
 * ```
 */
export declare class BackendBucket extends pulumi.CustomResource {
    /**
     * Get an existing BackendBucket resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BackendBucketState, opts?: pulumi.CustomResourceOptions): BackendBucket;
    readonly bucketName: pulumi.Output<string>;
    readonly creationTimestamp: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly enableCdn: pulumi.Output<boolean | undefined>;
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    /**
     * Create a BackendBucket resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BackendBucketArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering BackendBucket resources.
 */
export interface BackendBucketState {
    readonly bucketName?: pulumi.Input<string>;
    readonly creationTimestamp?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly enableCdn?: pulumi.Input<boolean>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a BackendBucket resource.
 */
export interface BackendBucketArgs {
    readonly bucketName: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly enableCdn?: pulumi.Input<boolean>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
}
