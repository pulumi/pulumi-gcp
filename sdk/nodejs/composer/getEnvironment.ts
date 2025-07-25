// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides access to Cloud Composer environment configuration in a region for a given project.
 *
 * To get more information about Composer Environment, see:
 *
 * * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.environments)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/composer/docs/concepts/overview)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const composerEnvEnvironment = new gcp.composer.Environment("composer_env", {name: "composer-environment"});
 * const composerEnv = gcp.composer.getEnvironment({
 *     name: test.name,
 * });
 * export const debug = composerEnv.then(composerEnv => composerEnv.configs);
 * ```
 */
export function getEnvironment(args: GetEnvironmentArgs, opts?: pulumi.InvokeOptions): Promise<GetEnvironmentResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:composer/getEnvironment:getEnvironment", {
        "name": args.name,
        "project": args.project,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getEnvironment.
 */
export interface GetEnvironmentArgs {
    /**
     * Name of the environment.
     */
    name: string;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: string;
    /**
     * The location or Compute Engine region of the environment.
     */
    region?: string;
}

/**
 * A collection of values returned by getEnvironment.
 */
export interface GetEnvironmentResult {
    /**
     * Configuration parameters for the environment.
     */
    readonly configs: outputs.composer.GetEnvironmentConfig[];
    readonly effectiveLabels: {[key: string]: string};
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly labels: {[key: string]: string};
    readonly name: string;
    readonly project?: string;
    readonly pulumiLabels: {[key: string]: string};
    readonly region?: string;
    readonly storageConfigs: outputs.composer.GetEnvironmentStorageConfig[];
}
/**
 * Provides access to Cloud Composer environment configuration in a region for a given project.
 *
 * To get more information about Composer Environment, see:
 *
 * * [API documentation](https://cloud.google.com/composer/docs/reference/rest/v1/projects.locations.environments)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/composer/docs/concepts/overview)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const composerEnvEnvironment = new gcp.composer.Environment("composer_env", {name: "composer-environment"});
 * const composerEnv = gcp.composer.getEnvironment({
 *     name: test.name,
 * });
 * export const debug = composerEnv.then(composerEnv => composerEnv.configs);
 * ```
 */
export function getEnvironmentOutput(args: GetEnvironmentOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetEnvironmentResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:composer/getEnvironment:getEnvironment", {
        "name": args.name,
        "project": args.project,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getEnvironment.
 */
export interface GetEnvironmentOutputArgs {
    /**
     * Name of the environment.
     */
    name: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The location or Compute Engine region of the environment.
     */
    region?: pulumi.Input<string>;
}
