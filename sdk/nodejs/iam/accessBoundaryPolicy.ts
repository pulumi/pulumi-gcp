// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Represents a collection of access boundary policies to apply to a given resource.
 * **NOTE**: This is a private feature and users should contact GCP support
 * if they would like to test it.
 *
 * ## Example Usage
 *
 * ### Iam Access Boundary Policy Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 * import * as std from "@pulumi/std";
 *
 * const project = new gcp.organizations.Project("project", {
 *     projectId: "my-project",
 *     name: "my-project",
 *     orgId: "123456789",
 *     billingAccount: "000000-0000000-0000000-000000",
 *     deletionPolicy: "DELETE",
 * });
 * const access_policy = new gcp.accesscontextmanager.AccessPolicy("access-policy", {
 *     parent: project.orgId.apply(orgId => `organizations/${orgId}`),
 *     title: "my policy",
 * });
 * const test_access = new gcp.accesscontextmanager.AccessLevel("test-access", {
 *     parent: pulumi.interpolate`accessPolicies/${access_policy.name}`,
 *     name: pulumi.interpolate`accessPolicies/${access_policy.name}/accessLevels/chromeos_no_lock`,
 *     title: "chromeos_no_lock",
 *     basic: {
 *         conditions: [{
 *             devicePolicy: {
 *                 requireScreenLock: true,
 *                 osConstraints: [{
 *                     osType: "DESKTOP_CHROME_OS",
 *                 }],
 *             },
 *             regions: [
 *                 "CH",
 *                 "IT",
 *                 "US",
 *             ],
 *         }],
 *     },
 * });
 * const example = new gcp.iam.AccessBoundaryPolicy("example", {
 *     parent: std.urlencodeOutput({
 *         input: pulumi.interpolate`cloudresourcemanager.googleapis.com/projects/${project.projectId}`,
 *     }).apply(invoke => invoke.result),
 *     name: "my-ab-policy",
 *     displayName: "My AB policy",
 *     rules: [{
 *         description: "AB rule",
 *         accessBoundaryRule: {
 *             availableResource: "*",
 *             availablePermissions: ["*"],
 *             availabilityCondition: {
 *                 title: "Access level expr",
 *                 expression: pulumi.all([project.orgId, test_access.name]).apply(([orgId, name]) => `request.matchAccessLevels('${orgId}', ['${name}'])`),
 *             },
 *         },
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * AccessBoundaryPolicy can be imported using any of these accepted formats:
 *
 * * `{{parent}}/{{name}}`
 *
 * When using the `pulumi import` command, AccessBoundaryPolicy can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:iam/accessBoundaryPolicy:AccessBoundaryPolicy default {{parent}}/{{name}}
 * ```
 */
export class AccessBoundaryPolicy extends pulumi.CustomResource {
    /**
     * Get an existing AccessBoundaryPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessBoundaryPolicyState, opts?: pulumi.CustomResourceOptions): AccessBoundaryPolicy {
        return new AccessBoundaryPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:iam/accessBoundaryPolicy:AccessBoundaryPolicy';

    /**
     * Returns true if the given object is an instance of AccessBoundaryPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessBoundaryPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessBoundaryPolicy.__pulumiType;
    }

    /**
     * The display name of the rule.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * The hash of the resource. Used internally during updates.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * The name of the policy.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The attachment point is identified by its URL-encoded full resource name.
     */
    public readonly parent!: pulumi.Output<string>;
    /**
     * Rules to be applied.
     * Structure is documented below.
     */
    public readonly rules!: pulumi.Output<outputs.iam.AccessBoundaryPolicyRule[]>;

    /**
     * Create a AccessBoundaryPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessBoundaryPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessBoundaryPolicyArgs | AccessBoundaryPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessBoundaryPolicyState | undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parent"] = state ? state.parent : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
        } else {
            const args = argsOrState as AccessBoundaryPolicyArgs | undefined;
            if ((!args || args.parent === undefined) && !opts.urn) {
                throw new Error("Missing required property 'parent'");
            }
            if ((!args || args.rules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rules'");
            }
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parent"] = args ? args.parent : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
            resourceInputs["etag"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccessBoundaryPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessBoundaryPolicy resources.
 */
export interface AccessBoundaryPolicyState {
    /**
     * The display name of the rule.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The hash of the resource. Used internally during updates.
     */
    etag?: pulumi.Input<string>;
    /**
     * The name of the policy.
     */
    name?: pulumi.Input<string>;
    /**
     * The attachment point is identified by its URL-encoded full resource name.
     */
    parent?: pulumi.Input<string>;
    /**
     * Rules to be applied.
     * Structure is documented below.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.iam.AccessBoundaryPolicyRule>[]>;
}

/**
 * The set of arguments for constructing a AccessBoundaryPolicy resource.
 */
export interface AccessBoundaryPolicyArgs {
    /**
     * The display name of the rule.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The name of the policy.
     */
    name?: pulumi.Input<string>;
    /**
     * The attachment point is identified by its URL-encoded full resource name.
     */
    parent: pulumi.Input<string>;
    /**
     * Rules to be applied.
     * Structure is documented below.
     */
    rules: pulumi.Input<pulumi.Input<inputs.iam.AccessBoundaryPolicyRule>[]>;
}
