import * as pulumi from "@pulumi/pulumi";
/**
 * Provides access to Google Cloud Platform KMS KeyRing. For more information see
 * [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key_ring)
 * and
 * [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings).
 *
 * A KeyRing is a grouping of CryptoKeys for organizational purposes. A KeyRing belongs to a Google Cloud Platform Project
 * and resides in a specific location.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myKeyRing = pulumi.output(gcp.kms.getKMSKeyRing({
 *     location: "us-central1",
 *     name: "my-key-ring",
 * }));
 * ```
 */
export declare function getKMSKeyRing(args: GetKMSKeyRingArgs, opts?: pulumi.InvokeOptions): Promise<GetKMSKeyRingResult>;
/**
 * A collection of arguments for invoking getKMSKeyRing.
 */
export interface GetKMSKeyRingArgs {
    /**
     * The Google Cloud Platform location for the KeyRing.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     */
    readonly location: string;
    /**
     * The KeyRing's name.
     * A KeyRing name must exist within the provided location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
     */
    readonly name: string;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: string;
}
/**
 * A collection of values returned by getKMSKeyRing.
 */
export interface GetKMSKeyRingResult {
    /**
     * The self link of the created KeyRing. Its format is `projects/{projectId}/locations/{location}/keyRings/{keyRingName}`.
     */
    readonly selfLink: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
