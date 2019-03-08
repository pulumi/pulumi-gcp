import * as pulumi from "@pulumi/pulumi";
/**
 * UrlMaps are used to route requests to a backend service based on rules
 * that you define for the host and path of an incoming URL.
 *
 *
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=url_map_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Url Map Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultHttpHealthCheck = new gcp.compute.HttpHealthCheck("default", {
 *     checkIntervalSec: 1,
 *     requestPath: "/",
 *     timeoutSec: 1,
 * });
 * const staticBucket = new gcp.storage.Bucket("static", {
 *     location: "US",
 * });
 * const staticBackendBucket = new gcp.compute.BackendBucket("static", {
 *     bucketName: staticBucket.name,
 *     enableCdn: true,
 * });
 * const home = new gcp.compute.BackendService("home", {
 *     healthChecks: defaultHttpHealthCheck.selfLink,
 *     portName: "http",
 *     protocol: "HTTP",
 *     timeoutSec: 10,
 * });
 * const login = new gcp.compute.BackendService("login", {
 *     healthChecks: defaultHttpHealthCheck.selfLink,
 *     portName: "http",
 *     protocol: "HTTP",
 *     timeoutSec: 10,
 * });
 * const urlmap = new gcp.compute.URLMap("urlmap", {
 *     defaultService: home.selfLink,
 *     description: "a description",
 *     hostRules: [{
 *         hosts: ["mysite.com"],
 *         pathMatcher: "allpaths",
 *     }],
 *     pathMatchers: [{
 *         defaultService: home.selfLink,
 *         name: "allpaths",
 *         pathRules: [
 *             {
 *                 paths: ["/home"],
 *                 service: home.selfLink,
 *             },
 *             {
 *                 paths: ["/login"],
 *                 service: login.selfLink,
 *             },
 *             {
 *                 paths: ["/static"],
 *                 service: staticBackendBucket.selfLink,
 *             },
 *         ],
 *     }],
 *     tests: [{
 *         host: "hi.com",
 *         path: "/home",
 *         service: home.selfLink,
 *     }],
 * });
 * ```
 */
export declare class URLMap extends pulumi.CustomResource {
    /**
     * Get an existing URLMap resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: URLMapState, opts?: pulumi.CustomResourceOptions): URLMap;
    readonly creationTimestamp: pulumi.Output<string>;
    readonly defaultService: pulumi.Output<string>;
    readonly description: pulumi.Output<string | undefined>;
    readonly fingerprint: pulumi.Output<string>;
    readonly hostRules: pulumi.Output<{
        description?: string;
        hosts: string[];
        pathMatcher: string;
    }[] | undefined>;
    readonly mapId: pulumi.Output<number>;
    readonly name: pulumi.Output<string>;
    readonly pathMatchers: pulumi.Output<{
        defaultService: string;
        description?: string;
        name: string;
        pathRules?: {
            paths: string[];
            service: string;
        }[];
    }[] | undefined>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    readonly tests: pulumi.Output<{
        description?: string;
        host: string;
        path: string;
        service: string;
    }[] | undefined>;
    /**
     * Create a URLMap resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: URLMapArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering URLMap resources.
 */
export interface URLMapState {
    readonly creationTimestamp?: pulumi.Input<string>;
    readonly defaultService?: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly fingerprint?: pulumi.Input<string>;
    readonly hostRules?: pulumi.Input<pulumi.Input<{
        description?: pulumi.Input<string>;
        hosts: pulumi.Input<pulumi.Input<string>[]>;
        pathMatcher: pulumi.Input<string>;
    }>[]>;
    readonly mapId?: pulumi.Input<number>;
    readonly name?: pulumi.Input<string>;
    readonly pathMatchers?: pulumi.Input<pulumi.Input<{
        defaultService: pulumi.Input<string>;
        description?: pulumi.Input<string>;
        name: pulumi.Input<string>;
        pathRules?: pulumi.Input<pulumi.Input<{
            paths: pulumi.Input<pulumi.Input<string>[]>;
            service: pulumi.Input<string>;
        }>[]>;
    }>[]>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    readonly tests?: pulumi.Input<pulumi.Input<{
        description?: pulumi.Input<string>;
        host: pulumi.Input<string>;
        path: pulumi.Input<string>;
        service: pulumi.Input<string>;
    }>[]>;
}
/**
 * The set of arguments for constructing a URLMap resource.
 */
export interface URLMapArgs {
    readonly defaultService: pulumi.Input<string>;
    readonly description?: pulumi.Input<string>;
    readonly hostRules?: pulumi.Input<pulumi.Input<{
        description?: pulumi.Input<string>;
        hosts: pulumi.Input<pulumi.Input<string>[]>;
        pathMatcher: pulumi.Input<string>;
    }>[]>;
    readonly name?: pulumi.Input<string>;
    readonly pathMatchers?: pulumi.Input<pulumi.Input<{
        defaultService: pulumi.Input<string>;
        description?: pulumi.Input<string>;
        name: pulumi.Input<string>;
        pathRules?: pulumi.Input<pulumi.Input<{
            paths: pulumi.Input<pulumi.Input<string>[]>;
            service: pulumi.Input<string>;
        }>[]>;
    }>[]>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly tests?: pulumi.Input<pulumi.Input<{
        description?: pulumi.Input<string>;
        host: pulumi.Input<string>;
        path: pulumi.Input<string>;
        service: pulumi.Input<string>;
    }>[]>;
}
