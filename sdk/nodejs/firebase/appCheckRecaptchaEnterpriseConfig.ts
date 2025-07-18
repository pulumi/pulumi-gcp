// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * An app's reCAPTCHA Enterprise configuration object.
 *
 * To get more information about RecaptchaEnterpriseConfig, see:
 *
 * * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.apps.recaptchaEnterpriseConfig)
 * * How-to Guides
 *     * [Official Documentation](https://firebase.google.com/docs/app-check)
 *
 * ## Example Usage
 *
 * ### Firebase App Check Recaptcha Enterprise Config Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 * import * as time from "@pulumiverse/time";
 *
 * // Enables the reCAPTCHA Enterprise API
 * const recaptchaEnterprise = new gcp.projects.Service("recaptcha_enterprise", {
 *     project: "my-project-name",
 *     service: "recaptchaenterprise.googleapis.com",
 *     disableOnDestroy: false,
 * });
 * const _default = new gcp.firebase.WebApp("default", {
 *     project: "my-project-name",
 *     displayName: "Web App for reCAPTCHA Enterprise",
 * });
 * // It takes a while for App Check to recognize the new app
 * // If your app already exists, you don't have to wait 30 seconds.
 * const wait30s = new time.index.Sleep("wait_30s", {createDuration: "30s"}, {
 *     dependsOn: [_default],
 * });
 * const defaultAppCheckRecaptchaEnterpriseConfig = new gcp.firebase.AppCheckRecaptchaEnterpriseConfig("default", {
 *     project: "my-project-name",
 *     appId: _default.appId,
 *     siteKey: "6LdpMXIpAAAAANkwWQPgEdjEhal7ugkH9RK9ytuw",
 *     tokenTtl: "7200s",
 * }, {
 *     dependsOn: [wait30s],
 * });
 * ```
 *
 * ## Import
 *
 * RecaptchaEnterpriseConfig can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/apps/{{app_id}}/recaptchaEnterpriseConfig`
 *
 * * `{{project}}/{{app_id}}`
 *
 * * `{{app_id}}`
 *
 * When using the `pulumi import` command, RecaptchaEnterpriseConfig can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:firebase/appCheckRecaptchaEnterpriseConfig:AppCheckRecaptchaEnterpriseConfig default projects/{{project}}/apps/{{app_id}}/recaptchaEnterpriseConfig
 * ```
 *
 * ```sh
 * $ pulumi import gcp:firebase/appCheckRecaptchaEnterpriseConfig:AppCheckRecaptchaEnterpriseConfig default {{project}}/{{app_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:firebase/appCheckRecaptchaEnterpriseConfig:AppCheckRecaptchaEnterpriseConfig default {{app_id}}
 * ```
 */
export class AppCheckRecaptchaEnterpriseConfig extends pulumi.CustomResource {
    /**
     * Get an existing AppCheckRecaptchaEnterpriseConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppCheckRecaptchaEnterpriseConfigState, opts?: pulumi.CustomResourceOptions): AppCheckRecaptchaEnterpriseConfig {
        return new AppCheckRecaptchaEnterpriseConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:firebase/appCheckRecaptchaEnterpriseConfig:AppCheckRecaptchaEnterpriseConfig';

    /**
     * Returns true if the given object is an instance of AppCheckRecaptchaEnterpriseConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppCheckRecaptchaEnterpriseConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppCheckRecaptchaEnterpriseConfig.__pulumiType;
    }

    /**
     * The ID of an
     * [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id).
     */
    public readonly appId!: pulumi.Output<string>;
    /**
     * The relative resource name of the reCAPTCHA Enterprise configuration object
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The score-based site key created in reCAPTCHA Enterprise used to invoke reCAPTCHA and generate the reCAPTCHA tokens for your application.
     * **Important**: This is not the siteSecret (as it is in reCAPTCHA v3), but rather your score-based reCAPTCHA Enterprise site key.
     */
    public readonly siteKey!: pulumi.Output<string>;
    /**
     * Specifies the duration for which App Check tokens exchanged from reCAPTCHA Enterprise artifacts will be valid.
     * If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days, inclusive.
     * A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
     */
    public readonly tokenTtl!: pulumi.Output<string>;

    /**
     * Create a AppCheckRecaptchaEnterpriseConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppCheckRecaptchaEnterpriseConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppCheckRecaptchaEnterpriseConfigArgs | AppCheckRecaptchaEnterpriseConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppCheckRecaptchaEnterpriseConfigState | undefined;
            resourceInputs["appId"] = state ? state.appId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["siteKey"] = state ? state.siteKey : undefined;
            resourceInputs["tokenTtl"] = state ? state.tokenTtl : undefined;
        } else {
            const args = argsOrState as AppCheckRecaptchaEnterpriseConfigArgs | undefined;
            if ((!args || args.appId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appId'");
            }
            if ((!args || args.siteKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'siteKey'");
            }
            resourceInputs["appId"] = args ? args.appId : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["siteKey"] = args ? args.siteKey : undefined;
            resourceInputs["tokenTtl"] = args ? args.tokenTtl : undefined;
            resourceInputs["name"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AppCheckRecaptchaEnterpriseConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppCheckRecaptchaEnterpriseConfig resources.
 */
export interface AppCheckRecaptchaEnterpriseConfigState {
    /**
     * The ID of an
     * [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id).
     */
    appId?: pulumi.Input<string>;
    /**
     * The relative resource name of the reCAPTCHA Enterprise configuration object
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The score-based site key created in reCAPTCHA Enterprise used to invoke reCAPTCHA and generate the reCAPTCHA tokens for your application.
     * **Important**: This is not the siteSecret (as it is in reCAPTCHA v3), but rather your score-based reCAPTCHA Enterprise site key.
     */
    siteKey?: pulumi.Input<string>;
    /**
     * Specifies the duration for which App Check tokens exchanged from reCAPTCHA Enterprise artifacts will be valid.
     * If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days, inclusive.
     * A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
     */
    tokenTtl?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AppCheckRecaptchaEnterpriseConfig resource.
 */
export interface AppCheckRecaptchaEnterpriseConfigArgs {
    /**
     * The ID of an
     * [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id).
     */
    appId: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The score-based site key created in reCAPTCHA Enterprise used to invoke reCAPTCHA and generate the reCAPTCHA tokens for your application.
     * **Important**: This is not the siteSecret (as it is in reCAPTCHA v3), but rather your score-based reCAPTCHA Enterprise site key.
     */
    siteKey: pulumi.Input<string>;
    /**
     * Specifies the duration for which App Check tokens exchanged from reCAPTCHA Enterprise artifacts will be valid.
     * If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days, inclusive.
     * A duration in seconds with up to nine fractional digits, ending with 's'. Example: "3.5s".
     */
    tokenTtl?: pulumi.Input<string>;
}
