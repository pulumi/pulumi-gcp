// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * A Cloud Security Command Center's (Cloud SCC) finding source. A finding
 * source is an entity or a mechanism that can produce a finding. A source is
 * like a container of findings that come from the same scanner, logger,
 * monitor, etc.
 *
 * To get more information about Source, see:
 *
 * * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1/organizations.sources)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/security-command-center/docs)
 *
 * ## Example Usage
 *
 * ### Scc Source Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const customSource = new gcp.securitycenter.Source("custom_source", {
 *     displayName: "My Source",
 *     organization: "123456789",
 *     description: "My custom Cloud Security Command Center Finding Source",
 * });
 * ```
 *
 * ## Import
 *
 * Source can be imported using any of these accepted formats:
 *
 * * `organizations/{{organization}}/sources/{{name}}`
 *
 * * `{{organization}}/{{name}}`
 *
 * When using the `pulumi import` command, Source can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:securitycenter/sourceIamPolicy:SourceIamPolicy default organizations/{{organization}}/sources/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:securitycenter/sourceIamPolicy:SourceIamPolicy default {{organization}}/{{name}}
 * ```
 */
export class SourceIamPolicy extends pulumi.CustomResource {
    /**
     * Get an existing SourceIamPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SourceIamPolicyState, opts?: pulumi.CustomResourceOptions): SourceIamPolicy {
        return new SourceIamPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:securitycenter/sourceIamPolicy:SourceIamPolicy';

    /**
     * Returns true if the given object is an instance of SourceIamPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SourceIamPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SourceIamPolicy.__pulumiType;
    }

    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * The organization whose Cloud Security Command Center the Source
     * lives in.
     */
    public readonly organization!: pulumi.Output<string>;
    public readonly policyData!: pulumi.Output<string>;
    public readonly source!: pulumi.Output<string>;

    /**
     * Create a SourceIamPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SourceIamPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SourceIamPolicyArgs | SourceIamPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SourceIamPolicyState | undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["organization"] = state ? state.organization : undefined;
            resourceInputs["policyData"] = state ? state.policyData : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
        } else {
            const args = argsOrState as SourceIamPolicyArgs | undefined;
            if ((!args || args.organization === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organization'");
            }
            if ((!args || args.policyData === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyData'");
            }
            if ((!args || args.source === undefined) && !opts.urn) {
                throw new Error("Missing required property 'source'");
            }
            resourceInputs["organization"] = args ? args.organization : undefined;
            resourceInputs["policyData"] = args ? args.policyData : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["etag"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SourceIamPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SourceIamPolicy resources.
 */
export interface SourceIamPolicyState {
    etag?: pulumi.Input<string>;
    /**
     * The organization whose Cloud Security Command Center the Source
     * lives in.
     */
    organization?: pulumi.Input<string>;
    policyData?: pulumi.Input<string>;
    source?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SourceIamPolicy resource.
 */
export interface SourceIamPolicyArgs {
    /**
     * The organization whose Cloud Security Command Center the Source
     * lives in.
     */
    organization: pulumi.Input<string>;
    policyData: pulumi.Input<string>;
    source: pulumi.Input<string>;
}
