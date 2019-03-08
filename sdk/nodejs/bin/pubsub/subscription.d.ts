import * as pulumi from "@pulumi/pulumi";
/**
 * A named resource representing the stream of messages from a single,
 * specific topic, to be delivered to the subscribing application.
 *
 *
 * To get more information about Subscription, see:
 *
 * * [API documentation](https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.subscriptions)
 * * How-to Guides
 *     * [Managing Subscriptions](https://cloud.google.com/pubsub/docs/admin#managing_subscriptions)
 *
 * ## Example Usage - Pubsub Subscription Push
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const exampleTopic = new gcp.pubsub.Topic("example", {});
 * const exampleSubscription = new gcp.pubsub.Subscription("example", {
 *     ackDeadlineSeconds: 20,
 *     labels: {
 *         foo: "bar",
 *     },
 *     pushConfig: {
 *         attributes: {
 *             "x-goog-version": "v1",
 *         },
 *         pushEndpoint: "https://example.com/push",
 *     },
 *     topic: exampleTopic.name,
 * });
 * ```
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=pubsub_subscription_pull&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Pubsub Subscription Pull
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const exampleTopic = new gcp.pubsub.Topic("example", {});
 * const exampleSubscription = new gcp.pubsub.Subscription("example", {
 *     ackDeadlineSeconds: 20,
 *     labels: {
 *         foo: "bar",
 *     },
 *     topic: exampleTopic.name,
 * });
 * ```
 * ## Example Usage - Pubsub Subscription Different Project
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const exampleTopic = new gcp.pubsub.Topic("example", {
 *     project: "topic-project",
 * });
 * const exampleSubscription = new gcp.pubsub.Subscription("example", {
 *     project: "subscription-project",
 *     topic: exampleTopic.id,
 * });
 * ```
 */
export declare class Subscription extends pulumi.CustomResource {
    /**
     * Get an existing Subscription resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SubscriptionState, opts?: pulumi.CustomResourceOptions): Subscription;
    readonly ackDeadlineSeconds: pulumi.Output<number>;
    readonly labels: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    readonly name: pulumi.Output<string>;
    readonly path: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly pushConfig: pulumi.Output<{
        attributes?: {
            [key: string]: string;
        };
        pushEndpoint: string;
    } | undefined>;
    readonly topic: pulumi.Output<string>;
    /**
     * Create a Subscription resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SubscriptionArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Subscription resources.
 */
export interface SubscriptionState {
    readonly ackDeadlineSeconds?: pulumi.Input<number>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly name?: pulumi.Input<string>;
    readonly path?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly pushConfig?: pulumi.Input<{
        attributes?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        pushEndpoint: pulumi.Input<string>;
    }>;
    readonly topic?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Subscription resource.
 */
export interface SubscriptionArgs {
    readonly ackDeadlineSeconds?: pulumi.Input<number>;
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly pushConfig?: pulumi.Input<{
        attributes?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        pushEndpoint: pulumi.Input<string>;
    }>;
    readonly topic: pulumi.Input<string>;
}
