// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 * ### Iam Workforce Pool Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const example = new gcp.iam.WorkforcePool("example", {
 *     workforcePoolId: "example-pool",
 *     parent: "organizations/123456789",
 *     location: "global",
 * }, {
 *     provider: google_beta,
 * });
 * ```
 * ### Iam Workforce Pool Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const example = new gcp.iam.WorkforcePool("example", {
 *     workforcePoolId: "example-pool",
 *     parent: "organizations/123456789",
 *     location: "global",
 *     displayName: "Display name",
 *     description: "A sample workforce pool.",
 *     disabled: false,
 *     sessionDuration: "7200s",
 * }, {
 *     provider: google_beta,
 * });
 * ```
 *
 * ## Import
 *
 * WorkforcePool can be imported using any of these accepted formats
 *
 * ```sh
 *  $ pulumi import gcp:iam/workforcePool:WorkforcePool default locations/{{location}}/workforcePools/{{workforce_pool_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:iam/workforcePool:WorkforcePool default {{location}}/{{workforce_pool_id}}
 * ```
 */
export class WorkforcePool extends pulumi.CustomResource {
    /**
     * Get an existing WorkforcePool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkforcePoolState, opts?: pulumi.CustomResourceOptions): WorkforcePool {
        return new WorkforcePool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:iam/workforcePool:WorkforcePool';

    /**
     * Returns true if the given object is an instance of WorkforcePool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkforcePool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkforcePool.__pulumiType;
    }

    /**
     * A user-specified description of the pool. Cannot exceed 256 characters.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether the pool is disabled. You cannot use a disabled pool to exchange tokens,
     * or use existing tokens to access resources. If the pool is re-enabled, existing tokens grant access again.
     */
    public readonly disabled!: pulumi.Output<boolean | undefined>;
    /**
     * A user-specified display name of the pool in Google Cloud Console. Cannot exceed 32 characters.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * The location for the resource.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Output only. The resource name of the pool. Format: 'locations/{location}/workforcePools/{workforcePoolId}'
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Immutable. The resource name of the parent. Format: `organizations/{org-id}`.
     */
    public readonly parent!: pulumi.Output<string>;
    /**
     * Duration that the Google Cloud access tokens, console sign-in sessions,
     * and `gcloud` sign-in sessions from this pool are valid.
     * Must be greater than 15 minutes (900s) and less than 12 hours (43200s).
     * If `sessionDuration` is not configured, minted credentials have a default duration of one hour (3600s).
     * A duration in seconds with up to nine fractional digits, ending with '`s`'. Example: "`3.5s`".
     */
    public readonly sessionDuration!: pulumi.Output<string | undefined>;
    /**
     * Output only. The state of the pool. * STATE_UNSPECIFIED: State unspecified. * ACTIVE: The pool is active, and may be
     * used in Google Cloud policies. * DELETED: The pool is soft-deleted. Soft-deleted pools are permanently deleted after
     * approximately 30 days. You can restore a soft-deleted pool using
     * [UndeleteWorkforcePool][WorkforcePools.UndeleteWorkforcePool]. You cannot reuse the ID of a soft-deleted pool until it
     * is permanently deleted. While a pool is deleted, you cannot use it to exchange tokens, or use existing tokens to access
     * resources. If the pool is undeleted, existing tokens grant access again.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The name of the pool. The ID must be a globally unique string of 6 to 63 lowercase letters,
     * digits, or hyphens. It must start with a letter, and cannot have a trailing hyphen.
     * The prefix `gcp-` is reserved for use by Google, and may not be specified.
     */
    public readonly workforcePoolId!: pulumi.Output<string>;

    /**
     * Create a WorkforcePool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkforcePoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkforcePoolArgs | WorkforcePoolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkforcePoolState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parent"] = state ? state.parent : undefined;
            resourceInputs["sessionDuration"] = state ? state.sessionDuration : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["workforcePoolId"] = state ? state.workforcePoolId : undefined;
        } else {
            const args = argsOrState as WorkforcePoolArgs | undefined;
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            if ((!args || args.parent === undefined) && !opts.urn) {
                throw new Error("Missing required property 'parent'");
            }
            if ((!args || args.workforcePoolId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workforcePoolId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["disabled"] = args ? args.disabled : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["parent"] = args ? args.parent : undefined;
            resourceInputs["sessionDuration"] = args ? args.sessionDuration : undefined;
            resourceInputs["workforcePoolId"] = args ? args.workforcePoolId : undefined;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkforcePool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkforcePool resources.
 */
export interface WorkforcePoolState {
    /**
     * A user-specified description of the pool. Cannot exceed 256 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the pool is disabled. You cannot use a disabled pool to exchange tokens,
     * or use existing tokens to access resources. If the pool is re-enabled, existing tokens grant access again.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * A user-specified display name of the pool in Google Cloud Console. Cannot exceed 32 characters.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The location for the resource.
     */
    location?: pulumi.Input<string>;
    /**
     * Output only. The resource name of the pool. Format: 'locations/{location}/workforcePools/{workforcePoolId}'
     */
    name?: pulumi.Input<string>;
    /**
     * Immutable. The resource name of the parent. Format: `organizations/{org-id}`.
     */
    parent?: pulumi.Input<string>;
    /**
     * Duration that the Google Cloud access tokens, console sign-in sessions,
     * and `gcloud` sign-in sessions from this pool are valid.
     * Must be greater than 15 minutes (900s) and less than 12 hours (43200s).
     * If `sessionDuration` is not configured, minted credentials have a default duration of one hour (3600s).
     * A duration in seconds with up to nine fractional digits, ending with '`s`'. Example: "`3.5s`".
     */
    sessionDuration?: pulumi.Input<string>;
    /**
     * Output only. The state of the pool. * STATE_UNSPECIFIED: State unspecified. * ACTIVE: The pool is active, and may be
     * used in Google Cloud policies. * DELETED: The pool is soft-deleted. Soft-deleted pools are permanently deleted after
     * approximately 30 days. You can restore a soft-deleted pool using
     * [UndeleteWorkforcePool][WorkforcePools.UndeleteWorkforcePool]. You cannot reuse the ID of a soft-deleted pool until it
     * is permanently deleted. While a pool is deleted, you cannot use it to exchange tokens, or use existing tokens to access
     * resources. If the pool is undeleted, existing tokens grant access again.
     */
    state?: pulumi.Input<string>;
    /**
     * The name of the pool. The ID must be a globally unique string of 6 to 63 lowercase letters,
     * digits, or hyphens. It must start with a letter, and cannot have a trailing hyphen.
     * The prefix `gcp-` is reserved for use by Google, and may not be specified.
     */
    workforcePoolId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkforcePool resource.
 */
export interface WorkforcePoolArgs {
    /**
     * A user-specified description of the pool. Cannot exceed 256 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the pool is disabled. You cannot use a disabled pool to exchange tokens,
     * or use existing tokens to access resources. If the pool is re-enabled, existing tokens grant access again.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * A user-specified display name of the pool in Google Cloud Console. Cannot exceed 32 characters.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The location for the resource.
     */
    location: pulumi.Input<string>;
    /**
     * Immutable. The resource name of the parent. Format: `organizations/{org-id}`.
     */
    parent: pulumi.Input<string>;
    /**
     * Duration that the Google Cloud access tokens, console sign-in sessions,
     * and `gcloud` sign-in sessions from this pool are valid.
     * Must be greater than 15 minutes (900s) and less than 12 hours (43200s).
     * If `sessionDuration` is not configured, minted credentials have a default duration of one hour (3600s).
     * A duration in seconds with up to nine fractional digits, ending with '`s`'. Example: "`3.5s`".
     */
    sessionDuration?: pulumi.Input<string>;
    /**
     * The name of the pool. The ID must be a globally unique string of 6 to 63 lowercase letters,
     * digits, or hyphens. It must start with a letter, and cannot have a trailing hyphen.
     * The prefix `gcp-` is reserved for use by Google, and may not be specified.
     */
    workforcePoolId: pulumi.Input<string>;
}