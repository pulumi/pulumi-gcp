// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 * ### Firebase Apple App Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.firebase.AppleApp("default", {
 *     project: "my-project-name",
 *     displayName: "Display Name Basic",
 *     bundleId: "apple.app.12345",
 * }, {
 *     provider: google_beta,
 * });
 * ```
 * ### Firebase Apple App Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const full = new gcp.firebase.AppleApp("full", {
 *     project: "my-project-name",
 *     displayName: "Display Name Full",
 *     bundleId: "apple.app.12345",
 *     appStoreId: "12345",
 *     teamId: "9987654321",
 * }, {
 *     provider: google_beta,
 * });
 * ```
 *
 * ## Import
 *
 * AppleApp can be imported using any of these accepted formats
 *
 * ```sh
 *  $ pulumi import gcp:firebase/appleApp:AppleApp default projects/{{project}}/iosApps/{{appId}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:firebase/appleApp:AppleApp default {{project}}/{{appId}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:firebase/appleApp:AppleApp default iosApps/{{appId}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:firebase/appleApp:AppleApp default {{appId}}
 * ```
 */
export class AppleApp extends pulumi.CustomResource {
    /**
     * Get an existing AppleApp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppleAppState, opts?: pulumi.CustomResourceOptions): AppleApp {
        return new AppleApp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:firebase/appleApp:AppleApp';

    /**
     * Returns true if the given object is an instance of AppleApp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AppleApp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AppleApp.__pulumiType;
    }

    /**
     * The globally unique, Firebase-assigned identifier of the App. This identifier should be treated as an opaque token, as
     * the data format is not specified.
     */
    public /*out*/ readonly appId!: pulumi.Output<string>;
    /**
     * The automatically generated Apple ID assigned to the Apple app by Apple in the Apple App Store.
     */
    public readonly appStoreId!: pulumi.Output<string | undefined>;
    /**
     * The canonical bundle ID of the Apple app as it would appear in the Apple AppStore.
     */
    public readonly bundleId!: pulumi.Output<string | undefined>;
    /**
     * (Optional) Set to 'ABANDON' to allow the AppleApp to be untracked from terraform state rather than deleted upon
     * 'terraform destroy'. This is useful because the AppleApp may be serving traffic. Set to 'DELETE' to delete the AppleApp.
     * Default to 'DELETE'.
     */
    public readonly deletionPolicy!: pulumi.Output<string | undefined>;
    /**
     * The user-assigned display name of the App.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * The fully qualified resource name of the App, for example: projects/projectId/iosApps/appId
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The Apple Developer Team ID associated with the App in the App Store.
     */
    public readonly teamId!: pulumi.Output<string | undefined>;

    /**
     * Create a AppleApp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AppleAppArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppleAppArgs | AppleAppState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppleAppState | undefined;
            resourceInputs["appId"] = state ? state.appId : undefined;
            resourceInputs["appStoreId"] = state ? state.appStoreId : undefined;
            resourceInputs["bundleId"] = state ? state.bundleId : undefined;
            resourceInputs["deletionPolicy"] = state ? state.deletionPolicy : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["teamId"] = state ? state.teamId : undefined;
        } else {
            const args = argsOrState as AppleAppArgs | undefined;
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            resourceInputs["appStoreId"] = args ? args.appStoreId : undefined;
            resourceInputs["bundleId"] = args ? args.bundleId : undefined;
            resourceInputs["deletionPolicy"] = args ? args.deletionPolicy : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["teamId"] = args ? args.teamId : undefined;
            resourceInputs["appId"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AppleApp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AppleApp resources.
 */
export interface AppleAppState {
    /**
     * The globally unique, Firebase-assigned identifier of the App. This identifier should be treated as an opaque token, as
     * the data format is not specified.
     */
    appId?: pulumi.Input<string>;
    /**
     * The automatically generated Apple ID assigned to the Apple app by Apple in the Apple App Store.
     */
    appStoreId?: pulumi.Input<string>;
    /**
     * The canonical bundle ID of the Apple app as it would appear in the Apple AppStore.
     */
    bundleId?: pulumi.Input<string>;
    /**
     * (Optional) Set to 'ABANDON' to allow the AppleApp to be untracked from terraform state rather than deleted upon
     * 'terraform destroy'. This is useful because the AppleApp may be serving traffic. Set to 'DELETE' to delete the AppleApp.
     * Default to 'DELETE'.
     */
    deletionPolicy?: pulumi.Input<string>;
    /**
     * The user-assigned display name of the App.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The fully qualified resource name of the App, for example: projects/projectId/iosApps/appId
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The Apple Developer Team ID associated with the App in the App Store.
     */
    teamId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AppleApp resource.
 */
export interface AppleAppArgs {
    /**
     * The automatically generated Apple ID assigned to the Apple app by Apple in the Apple App Store.
     */
    appStoreId?: pulumi.Input<string>;
    /**
     * The canonical bundle ID of the Apple app as it would appear in the Apple AppStore.
     */
    bundleId?: pulumi.Input<string>;
    /**
     * (Optional) Set to 'ABANDON' to allow the AppleApp to be untracked from terraform state rather than deleted upon
     * 'terraform destroy'. This is useful because the AppleApp may be serving traffic. Set to 'DELETE' to delete the AppleApp.
     * Default to 'DELETE'.
     */
    deletionPolicy?: pulumi.Input<string>;
    /**
     * The user-assigned display name of the App.
     */
    displayName: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The Apple Developer Team ID associated with the App in the App Store.
     */
    teamId?: pulumi.Input<string>;
}