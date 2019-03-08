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
 * const debian = pulumi.output(gcp.container.getRegistryImage({
 *     name: "debian",
 * }));
 *
 * export const gcrLocation = debian.apply(debian => debian.imageUrl);
 * ```
 */
export declare function getRegistryImage(args: GetRegistryImageArgs, opts?: pulumi.InvokeOptions): Promise<GetRegistryImageResult>;
/**
 * A collection of arguments for invoking getRegistryImage.
 */
export interface GetRegistryImageArgs {
    readonly digest?: string;
    readonly name: string;
    readonly project?: string;
    readonly region?: string;
    readonly tag?: string;
}
/**
 * A collection of values returned by getRegistryImage.
 */
export interface GetRegistryImageResult {
    readonly imageUrl: string;
    readonly project: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
