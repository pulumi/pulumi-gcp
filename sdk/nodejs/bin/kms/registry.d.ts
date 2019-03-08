import * as pulumi from "@pulumi/pulumi";
/**
 *  Creates a device registry in Google's Cloud IoT Core platform. For more information see
 * [the official documentation](https://cloud.google.com/iot/docs/) and
 * [API](https://cloud.google.com/iot/docs/reference/cloudiot/rest/v1/projects.locations.registries).
 *
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fs from "fs";
 * import * as gcp from "@pulumi/gcp";
 *
 * const default_devicestatus = new gcp.pubsub.Topic("default-devicestatus", {});
 * const default_telemetry = new gcp.pubsub.Topic("default-telemetry", {});
 * const default_registry = new gcp.kms.Registry("default-registry", {
 *     credentials: [{
 *         publicKeyCertificate: {
 *             certificate: fs.readFileSync("rsa_cert.pem", "utf-8"),
 *             format: "X509_CERTIFICATE_PEM",
 *         },
 *     }],
 *     eventNotificationConfig: {
 *         pubsub_topic_name: default_telemetry.id,
 *     },
 *     httpConfig: {
 *         http_enabled_state: "HTTP_ENABLED",
 *     },
 *     mqttConfig: {
 *         mqtt_enabled_state: "MQTT_ENABLED",
 *     },
 *     stateNotificationConfig: {
 *         pubsub_topic_name: default_devicestatus.id,
 *     },
 * });
 * ```
 */
export declare class Registry extends pulumi.CustomResource {
    /**
     * Get an existing Registry resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RegistryState, opts?: pulumi.CustomResourceOptions): Registry;
    /**
     * List of public key certificates to authenticate devices. Structure is documented below.
     */
    readonly credentials: pulumi.Output<{
        publicKeyCertificate?: {
            certificate: string;
            format: string;
        };
    }[] | undefined>;
    /**
     * A PubSub topics to publish device events. Structure is documented below.
     */
    readonly eventNotificationConfig: pulumi.Output<{
        pubsubTopicName: string;
    } | undefined>;
    /**
     * Activate or deactivate HTTP. Structure is documented below.
     */
    readonly httpConfig: pulumi.Output<{
        httpEnabledState: string;
    }>;
    /**
     * Activate or deactivate MQTT. Structure is documented below.
     */
    readonly mqttConfig: pulumi.Output<{
        mqttEnabledState: string;
    }>;
    /**
     * A unique name for the resource, required by device registry.
     * Changing this forces a new resource to be created.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The project in which the resource belongs. If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The Region in which the created address should reside. If it is not provided, the provider region is used.
     */
    readonly region: pulumi.Output<string>;
    /**
     * A PubSub topic to publish device state updates. Structure is documented below.
     */
    readonly stateNotificationConfig: pulumi.Output<{
        pubsubTopicName: string;
    } | undefined>;
    /**
     * Create a Registry resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: RegistryArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Registry resources.
 */
export interface RegistryState {
    /**
     * List of public key certificates to authenticate devices. Structure is documented below.
     */
    readonly credentials?: pulumi.Input<pulumi.Input<{
        publicKeyCertificate?: pulumi.Input<{
            certificate: pulumi.Input<string>;
            format: pulumi.Input<string>;
        }>;
    }>[]>;
    /**
     * A PubSub topics to publish device events. Structure is documented below.
     */
    readonly eventNotificationConfig?: pulumi.Input<{
        pubsubTopicName: pulumi.Input<string>;
    }>;
    /**
     * Activate or deactivate HTTP. Structure is documented below.
     */
    readonly httpConfig?: pulumi.Input<{
        httpEnabledState: pulumi.Input<string>;
    }>;
    /**
     * Activate or deactivate MQTT. Structure is documented below.
     */
    readonly mqttConfig?: pulumi.Input<{
        mqttEnabledState: pulumi.Input<string>;
    }>;
    /**
     * A unique name for the resource, required by device registry.
     * Changing this forces a new resource to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project in which the resource belongs. If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The Region in which the created address should reside. If it is not provided, the provider region is used.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * A PubSub topic to publish device state updates. Structure is documented below.
     */
    readonly stateNotificationConfig?: pulumi.Input<{
        pubsubTopicName: pulumi.Input<string>;
    }>;
}
/**
 * The set of arguments for constructing a Registry resource.
 */
export interface RegistryArgs {
    /**
     * List of public key certificates to authenticate devices. Structure is documented below.
     */
    readonly credentials?: pulumi.Input<pulumi.Input<{
        publicKeyCertificate?: pulumi.Input<{
            certificate: pulumi.Input<string>;
            format: pulumi.Input<string>;
        }>;
    }>[]>;
    /**
     * A PubSub topics to publish device events. Structure is documented below.
     */
    readonly eventNotificationConfig?: pulumi.Input<{
        pubsubTopicName: pulumi.Input<string>;
    }>;
    /**
     * Activate or deactivate HTTP. Structure is documented below.
     */
    readonly httpConfig?: pulumi.Input<{
        httpEnabledState: pulumi.Input<string>;
    }>;
    /**
     * Activate or deactivate MQTT. Structure is documented below.
     */
    readonly mqttConfig?: pulumi.Input<{
        mqttEnabledState: pulumi.Input<string>;
    }>;
    /**
     * A unique name for the resource, required by device registry.
     * Changing this forces a new resource to be created.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The project in which the resource belongs. If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The Region in which the created address should reside. If it is not provided, the provider region is used.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * A PubSub topic to publish device state updates. Structure is documented below.
     */
    readonly stateNotificationConfig?: pulumi.Input<{
        pubsubTopicName: pulumi.Input<string>;
    }>;
}
