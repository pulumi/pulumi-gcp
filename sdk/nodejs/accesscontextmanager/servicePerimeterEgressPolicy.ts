// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * EgressPolicies match requests based on egressFrom and egressTo stanzas.
 * For an EgressPolicy to match, both egressFrom and egressTo stanzas must be matched.
 * If an EgressPolicy matches a request, the request is allowed to span the ServicePerimeter
 * boundary. For example, an EgressPolicy can be used to allow VMs on networks
 * within the ServicePerimeter to access a defined set of projects outside the
 * perimeter in certain contexts (e.g. to read data from a Cloud Storage bucket
 * or query against a BigQuery dataset).
 *
 * To get more information about ServicePerimeterEgressPolicy, see:
 *
 * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters#egresspolicy)
 *
 * ## Import
 *
 * ServicePerimeterEgressPolicy can be imported using any of these accepted formats
 *
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/servicePerimeterEgressPolicy:ServicePerimeterEgressPolicy default {{perimeter}}
 * ```
 */
export class ServicePerimeterEgressPolicy extends pulumi.CustomResource {
    /**
     * Get an existing ServicePerimeterEgressPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServicePerimeterEgressPolicyState, opts?: pulumi.CustomResourceOptions): ServicePerimeterEgressPolicy {
        return new ServicePerimeterEgressPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:accesscontextmanager/servicePerimeterEgressPolicy:ServicePerimeterEgressPolicy';

    /**
     * Returns true if the given object is an instance of ServicePerimeterEgressPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServicePerimeterEgressPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServicePerimeterEgressPolicy.__pulumiType;
    }

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     */
    public readonly egressFrom!: pulumi.Output<outputs.accesscontextmanager.ServicePerimeterEgressPolicyEgressFrom | undefined>;
    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     */
    public readonly egressTo!: pulumi.Output<outputs.accesscontextmanager.ServicePerimeterEgressPolicyEgressTo | undefined>;
    /**
     * The name of the Service Perimeter to add this resource to.
     *
     *
     * - - -
     */
    public readonly perimeter!: pulumi.Output<string>;

    /**
     * Create a ServicePerimeterEgressPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServicePerimeterEgressPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServicePerimeterEgressPolicyArgs | ServicePerimeterEgressPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServicePerimeterEgressPolicyState | undefined;
            resourceInputs["egressFrom"] = state ? state.egressFrom : undefined;
            resourceInputs["egressTo"] = state ? state.egressTo : undefined;
            resourceInputs["perimeter"] = state ? state.perimeter : undefined;
        } else {
            const args = argsOrState as ServicePerimeterEgressPolicyArgs | undefined;
            if ((!args || args.perimeter === undefined) && !opts.urn) {
                throw new Error("Missing required property 'perimeter'");
            }
            resourceInputs["egressFrom"] = args ? args.egressFrom : undefined;
            resourceInputs["egressTo"] = args ? args.egressTo : undefined;
            resourceInputs["perimeter"] = args ? args.perimeter : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServicePerimeterEgressPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServicePerimeterEgressPolicy resources.
 */
export interface ServicePerimeterEgressPolicyState {
    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     */
    egressFrom?: pulumi.Input<inputs.accesscontextmanager.ServicePerimeterEgressPolicyEgressFrom>;
    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     */
    egressTo?: pulumi.Input<inputs.accesscontextmanager.ServicePerimeterEgressPolicyEgressTo>;
    /**
     * The name of the Service Perimeter to add this resource to.
     *
     *
     * - - -
     */
    perimeter?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServicePerimeterEgressPolicy resource.
 */
export interface ServicePerimeterEgressPolicyArgs {
    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     */
    egressFrom?: pulumi.Input<inputs.accesscontextmanager.ServicePerimeterEgressPolicyEgressFrom>;
    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     */
    egressTo?: pulumi.Input<inputs.accesscontextmanager.ServicePerimeterEgressPolicyEgressTo>;
    /**
     * The name of the Service Perimeter to add this resource to.
     *
     *
     * - - -
     */
    perimeter: pulumi.Input<string>;
}