import * as pulumi from "@pulumi/pulumi";
/**
 * Provides access to available Google Container Engine versions in a zone or region for a given project.
 *
 * > If you are using the `google_container_engine_versions` datasource with a regional cluster, ensure that you have provided a `region`
 * to the datasource. A `region` can have a different set of supported versions than its corresponding `zone`s, and not all `zone`s in a
 * `region` are guaranteed to support the same version.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const central1b = pulumi.output(gcp.container.getEngineVersions({
 *     zone: "us-central1-b",
 * }));
 * const foo = new gcp.container.Cluster("foo", {
 *     initialNodeCount: 1,
 *     masterAuth: {
 *         password: "adoy.rm",
 *         username: "mr.yoda",
 *     },
 *     nodeVersion: central1b.apply(central1b => central1b.latestNodeVersion),
 *     zone: "us-central1-b",
 * });
 * ```
 */
export declare function getEngineVersions(args?: GetEngineVersionsArgs, opts?: pulumi.InvokeOptions): Promise<GetEngineVersionsResult>;
/**
 * A collection of arguments for invoking getEngineVersions.
 */
export interface GetEngineVersionsArgs {
    /**
     * ID of the project to list available cluster versions for. Should match the project the cluster will be deployed to.
     * Defaults to the project that the provider is authenticated with.
     */
    readonly project?: string;
    readonly region?: string;
    /**
     * Zone to list available cluster versions for. Should match the zone the cluster will be deployed in.
     * If not specified, the provider-level zone is used. One of zone or provider-level zone is required.
     */
    readonly zone?: string;
}
/**
 * A collection of values returned by getEngineVersions.
 */
export interface GetEngineVersionsResult {
    /**
     * Version of Kubernetes the service deploys by default.
     */
    readonly defaultClusterVersion: string;
    /**
     * The latest version available in the given zone for use with master instances.
     */
    readonly latestMasterVersion: string;
    /**
     * The latest version available in the given zone for use with node instances.
     */
    readonly latestNodeVersion: string;
    /**
     * A list of versions available in the given zone for use with master instances.
     */
    readonly validMasterVersions: string[];
    /**
     * A list of versions available in the given zone for use with node instances.
     */
    readonly validNodeVersions: string[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
