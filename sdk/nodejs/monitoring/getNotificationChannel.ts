// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A NotificationChannel is a medium through which an alert is delivered
 * when a policy violation is detected. Examples of channels include email, SMS,
 * and third-party messaging applications. Fields containing sensitive information
 * like authentication tokens or contact info are only partially populated on retrieval.
 *
 * To get more information about NotificationChannel, see:
 *
 * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannels)
 * * How-to Guides
 *     * [Notification Options](https://cloud.google.com/monitoring/support/notification-options)
 *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
 *
 * ## Example Usage
 *
 * ### Notification Channel Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const basic = gcp.monitoring.getNotificationChannel({
 *     displayName: "Test Notification Channel",
 * });
 * const alertPolicy = new gcp.monitoring.AlertPolicy("alert_policy", {
 *     displayName: "My Alert Policy",
 *     notificationChannels: [basic.then(basic => basic.name)],
 *     combiner: "OR",
 *     conditions: [{
 *         displayName: "test condition",
 *         conditionThreshold: {
 *             filter: "metric.type=\"compute.googleapis.com/instance/disk/write_bytes_count\" AND resource.type=\"gce_instance\"",
 *             duration: "60s",
 *             comparison: "COMPARISON_GT",
 *             aggregations: [{
 *                 alignmentPeriod: "60s",
 *                 perSeriesAligner: "ALIGN_RATE",
 *             }],
 *         },
 *     }],
 * });
 * ```
 */
export function getNotificationChannel(args?: GetNotificationChannelArgs, opts?: pulumi.InvokeOptions): Promise<GetNotificationChannelResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:monitoring/getNotificationChannel:getNotificationChannel", {
        "displayName": args.displayName,
        "labels": args.labels,
        "project": args.project,
        "type": args.type,
        "userLabels": args.userLabels,
    }, opts);
}

/**
 * A collection of arguments for invoking getNotificationChannel.
 */
export interface GetNotificationChannelArgs {
    /**
     * The display name for this notification channel.
     */
    displayName?: string;
    /**
     * Labels (corresponding to the
     * NotificationChannelDescriptor schema) to filter the notification channels by.
     */
    labels?: {[key: string]: string};
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: string;
    /**
     * The type of the notification channel.
     *
     * - - -
     *
     * Other optional fields include:
     */
    type?: string;
    /**
     * User-provided key-value labels to filter by.
     */
    userLabels?: {[key: string]: string};
}

/**
 * A collection of values returned by getNotificationChannel.
 */
export interface GetNotificationChannelResult {
    /**
     * An optional human-readable description of this notification channel.
     */
    readonly description: string;
    readonly displayName?: string;
    /**
     * Whether notifications are forwarded to the described channel.
     */
    readonly enabled: boolean;
    readonly forceDelete: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Configuration fields that define the channel and its behavior.
     */
    readonly labels?: {[key: string]: string};
    /**
     * The full REST resource name for this channel. The syntax is:
     * `projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]`.
     */
    readonly name: string;
    readonly project?: string;
    readonly sensitiveLabels: outputs.monitoring.GetNotificationChannelSensitiveLabel[];
    readonly type?: string;
    /**
     * User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor's schema, unlike the labels field.
     */
    readonly userLabels?: {[key: string]: string};
    /**
     * Indicates whether this channel has been verified or not.
     */
    readonly verificationStatus: string;
}
/**
 * A NotificationChannel is a medium through which an alert is delivered
 * when a policy violation is detected. Examples of channels include email, SMS,
 * and third-party messaging applications. Fields containing sensitive information
 * like authentication tokens or contact info are only partially populated on retrieval.
 *
 * To get more information about NotificationChannel, see:
 *
 * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannels)
 * * How-to Guides
 *     * [Notification Options](https://cloud.google.com/monitoring/support/notification-options)
 *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
 *
 * ## Example Usage
 *
 * ### Notification Channel Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const basic = gcp.monitoring.getNotificationChannel({
 *     displayName: "Test Notification Channel",
 * });
 * const alertPolicy = new gcp.monitoring.AlertPolicy("alert_policy", {
 *     displayName: "My Alert Policy",
 *     notificationChannels: [basic.then(basic => basic.name)],
 *     combiner: "OR",
 *     conditions: [{
 *         displayName: "test condition",
 *         conditionThreshold: {
 *             filter: "metric.type=\"compute.googleapis.com/instance/disk/write_bytes_count\" AND resource.type=\"gce_instance\"",
 *             duration: "60s",
 *             comparison: "COMPARISON_GT",
 *             aggregations: [{
 *                 alignmentPeriod: "60s",
 *                 perSeriesAligner: "ALIGN_RATE",
 *             }],
 *         },
 *     }],
 * });
 * ```
 */
export function getNotificationChannelOutput(args?: GetNotificationChannelOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetNotificationChannelResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("gcp:monitoring/getNotificationChannel:getNotificationChannel", {
        "displayName": args.displayName,
        "labels": args.labels,
        "project": args.project,
        "type": args.type,
        "userLabels": args.userLabels,
    }, opts);
}

/**
 * A collection of arguments for invoking getNotificationChannel.
 */
export interface GetNotificationChannelOutputArgs {
    /**
     * The display name for this notification channel.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Labels (corresponding to the
     * NotificationChannelDescriptor schema) to filter the notification channels by.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The type of the notification channel.
     *
     * - - -
     *
     * Other optional fields include:
     */
    type?: pulumi.Input<string>;
    /**
     * User-provided key-value labels to filter by.
     */
    userLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
