// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Get information about a Google Cloud Pub/Sub Subscription. For more information see
 * the [official documentation](https://cloud.google.com/pubsub/docs/)
 * and [API](https://cloud.google.com/pubsub/docs/apis).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_pubsub_subscription = gcp.pubsub.getSubscription({
 *     name: "my-pubsub-subscription",
 * });
 * ```
 */
export function getSubscription(args: GetSubscriptionArgs, opts?: pulumi.InvokeOptions): Promise<GetSubscriptionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:pubsub/getSubscription:getSubscription", {
        "name": args.name,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getSubscription.
 */
export interface GetSubscriptionArgs {
    /**
     * The name of the Cloud Pub/Sub Subscription.
     *
     * - - -
     */
    name: string;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: string;
}

/**
 * A collection of values returned by getSubscription.
 */
export interface GetSubscriptionResult {
    readonly ackDeadlineSeconds: number;
    readonly bigqueryConfigs: outputs.pubsub.GetSubscriptionBigqueryConfig[];
    readonly cloudStorageConfigs: outputs.pubsub.GetSubscriptionCloudStorageConfig[];
    readonly deadLetterPolicies: outputs.pubsub.GetSubscriptionDeadLetterPolicy[];
    readonly effectiveLabels: {[key: string]: string};
    readonly enableExactlyOnceDelivery: boolean;
    readonly enableMessageOrdering: boolean;
    readonly expirationPolicies: outputs.pubsub.GetSubscriptionExpirationPolicy[];
    readonly filter: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly labels: {[key: string]: string};
    readonly messageRetentionDuration: string;
    readonly messageTransforms: outputs.pubsub.GetSubscriptionMessageTransform[];
    readonly name: string;
    readonly project?: string;
    readonly pulumiLabels: {[key: string]: string};
    readonly pushConfigs: outputs.pubsub.GetSubscriptionPushConfig[];
    readonly retainAckedMessages: boolean;
    readonly retryPolicies: outputs.pubsub.GetSubscriptionRetryPolicy[];
    readonly topic: string;
}
/**
 * Get information about a Google Cloud Pub/Sub Subscription. For more information see
 * the [official documentation](https://cloud.google.com/pubsub/docs/)
 * and [API](https://cloud.google.com/pubsub/docs/apis).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const my_pubsub_subscription = gcp.pubsub.getSubscription({
 *     name: "my-pubsub-subscription",
 * });
 * ```
 */
export function getSubscriptionOutput(args: GetSubscriptionOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSubscriptionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:pubsub/getSubscription:getSubscription", {
        "name": args.name,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getSubscription.
 */
export interface GetSubscriptionOutputArgs {
    /**
     * The name of the Cloud Pub/Sub Subscription.
     *
     * - - -
     */
    name: pulumi.Input<string>;
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
