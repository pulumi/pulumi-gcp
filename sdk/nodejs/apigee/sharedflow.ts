// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * You can combine policies and resources into a shared flow that you can consume from multiple API proxies, and even from other shared flows. Although it's like a proxy, a shared flow has no endpoint. It can be used only from an API proxy or shared flow that's in the same organization as the shared flow itself.
 *
 * To get more information about SharedFlow, see:
 *
 * * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.sharedflows)
 * * How-to Guides
 *     * [Sharedflows](https://cloud.google.com/apigee/docs/resources)
 *
 * ## Import
 *
 * SharedFlow can be imported using any of these accepted formats
 *
 * ```sh
 *  $ pulumi import gcp:apigee/sharedflow:Sharedflow default {{org_id}}/sharedflows/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:apigee/sharedflow:Sharedflow default {{org_id}}/{{name}}
 * ```
 */
export class Sharedflow extends pulumi.CustomResource {
    /**
     * Get an existing Sharedflow resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SharedflowState, opts?: pulumi.CustomResourceOptions): Sharedflow {
        return new Sharedflow(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:apigee/sharedflow:Sharedflow';

    /**
     * Returns true if the given object is an instance of Sharedflow.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Sharedflow {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Sharedflow.__pulumiType;
    }

    /**
     * Path to the config zip bundle.
     */
    public readonly configBundle!: pulumi.Output<string>;
    /**
     * A hash of local config bundle in string, user needs to use a Terraform Hash function of their choice. A change in hash
     * will trigger an update.
     */
    public readonly detectMd5hash!: pulumi.Output<string | undefined>;
    /**
     * The id of the most recently created revision for this shared flow.
     */
    public /*out*/ readonly latestRevisionId!: pulumi.Output<string>;
    /**
     * (Computed) Base 64 MD5 hash of the uploaded data. It is speculative as remote does not return hash of the bundle. Remote changes are detected using returned lastModified timestamp.
     */
    public /*out*/ readonly md5hash!: pulumi.Output<string>;
    /**
     * Metadata describing the shared flow.
     * Structure is documented below.
     */
    public /*out*/ readonly metaDatas!: pulumi.Output<outputs.apigee.SharedflowMetaData[]>;
    /**
     * The ID of the shared flow.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The Apigee Organization name associated with the Apigee instance.
     */
    public readonly orgId!: pulumi.Output<string>;
    /**
     * A list of revisions of this shared flow.
     */
    public /*out*/ readonly revisions!: pulumi.Output<string[]>;

    /**
     * Create a Sharedflow resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SharedflowArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SharedflowArgs | SharedflowState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SharedflowState | undefined;
            resourceInputs["configBundle"] = state ? state.configBundle : undefined;
            resourceInputs["detectMd5hash"] = state ? state.detectMd5hash : undefined;
            resourceInputs["latestRevisionId"] = state ? state.latestRevisionId : undefined;
            resourceInputs["md5hash"] = state ? state.md5hash : undefined;
            resourceInputs["metaDatas"] = state ? state.metaDatas : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["revisions"] = state ? state.revisions : undefined;
        } else {
            const args = argsOrState as SharedflowArgs | undefined;
            if ((!args || args.configBundle === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configBundle'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            resourceInputs["configBundle"] = args ? args.configBundle : undefined;
            resourceInputs["detectMd5hash"] = args ? args.detectMd5hash : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["latestRevisionId"] = undefined /*out*/;
            resourceInputs["md5hash"] = undefined /*out*/;
            resourceInputs["metaDatas"] = undefined /*out*/;
            resourceInputs["revisions"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Sharedflow.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Sharedflow resources.
 */
export interface SharedflowState {
    /**
     * Path to the config zip bundle.
     */
    configBundle?: pulumi.Input<string>;
    /**
     * A hash of local config bundle in string, user needs to use a Terraform Hash function of their choice. A change in hash
     * will trigger an update.
     */
    detectMd5hash?: pulumi.Input<string>;
    /**
     * The id of the most recently created revision for this shared flow.
     */
    latestRevisionId?: pulumi.Input<string>;
    /**
     * (Computed) Base 64 MD5 hash of the uploaded data. It is speculative as remote does not return hash of the bundle. Remote changes are detected using returned lastModified timestamp.
     */
    md5hash?: pulumi.Input<string>;
    /**
     * Metadata describing the shared flow.
     * Structure is documented below.
     */
    metaDatas?: pulumi.Input<pulumi.Input<inputs.apigee.SharedflowMetaData>[]>;
    /**
     * The ID of the shared flow.
     */
    name?: pulumi.Input<string>;
    /**
     * The Apigee Organization name associated with the Apigee instance.
     */
    orgId?: pulumi.Input<string>;
    /**
     * A list of revisions of this shared flow.
     */
    revisions?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Sharedflow resource.
 */
export interface SharedflowArgs {
    /**
     * Path to the config zip bundle.
     */
    configBundle: pulumi.Input<string>;
    /**
     * A hash of local config bundle in string, user needs to use a Terraform Hash function of their choice. A change in hash
     * will trigger an update.
     */
    detectMd5hash?: pulumi.Input<string>;
    /**
     * The ID of the shared flow.
     */
    name?: pulumi.Input<string>;
    /**
     * The Apigee Organization name associated with the Apigee instance.
     */
    orgId: pulumi.Input<string>;
}