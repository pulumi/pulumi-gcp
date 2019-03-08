import * as pulumi from "@pulumi/pulumi";
/**
 * This data source fetches the project name, and provides the appropriate URLs to use for container registry for this project.
 *
 * The URLs are computed entirely offline - as long as the project exists, they will be valid, but this data source does not contact Google Container Registry (GCR) at any point.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const foo = pulumi.output(gcp.container.getRegistryRepository({}));
 *
 * export const gcrLocation = foo.apply(foo => foo.repositoryUrl);
 * ```
 */
export declare function getRegistryRepository(args?: GetRegistryRepositoryArgs, opts?: pulumi.InvokeOptions): Promise<GetRegistryRepositoryResult>;
/**
 * A collection of arguments for invoking getRegistryRepository.
 */
export interface GetRegistryRepositoryArgs {
    readonly project?: string;
    readonly region?: string;
}
/**
 * A collection of values returned by getRegistryRepository.
 */
export interface GetRegistryRepositoryResult {
    readonly project: string;
    readonly repositoryUrl: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
