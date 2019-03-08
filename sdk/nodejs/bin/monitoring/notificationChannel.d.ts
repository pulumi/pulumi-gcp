import * as pulumi from "@pulumi/pulumi";
/**
 * A NotificationChannel is a medium through which an alert is delivered
 * when a policy violation is detected. Examples of channels include email, SMS,
 * and third-party messaging applications. Fields containing sensitive information
 * like authentication tokens or contact info are only partially populated on retrieval.
 *
 *
 * To get more information about NotificationChannel, see:
 *
 * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.notificationChannels)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/monitoring/api/v3/)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=notification_channel_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Notification Channel Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const basic = new gcp.monitoring.NotificationChannel("basic", {
 *     displayName: "Test Notification Channel",
 *     labels: {
 *         email_address: "fake_email@blahblah.com",
 *     },
 *     type: "email",
 * });
 * ```
 */
export declare class NotificationChannel extends pulumi.CustomResource {
    /**
     * Get an existing NotificationChannel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NotificationChannelState, opts?: pulumi.CustomResourceOptions): NotificationChannel;
    readonly description: pulumi.Output<string | undefined>;
    readonly displayName: pulumi.Output<string>;
    readonly enabled: pulumi.Output<boolean | undefined>;
    readonly labels: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly type: pulumi.Output<string>;
    readonly userLabels: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    readonly verificationStatus: pulumi.Output<string>;
    /**
     * Create a NotificationChannel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NotificationChannelArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering NotificationChannel resources.
 */
export interface NotificationChannelState {
    readonly description?: pulumi.Input<string>;
    readonly displayName?: pulumi.Input<string>;
    readonly enabled?: pulumi.Input<boolean>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly type?: pulumi.Input<string>;
    readonly userLabels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly verificationStatus?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a NotificationChannel resource.
 */
export interface NotificationChannelArgs {
    readonly description?: pulumi.Input<string>;
    readonly displayName: pulumi.Input<string>;
    readonly enabled?: pulumi.Input<boolean>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly type: pulumi.Input<string>;
    readonly userLabels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
}
