// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A Service is a discrete, autonomous, and network-accessible unit,
 * designed to solve an individual concern. In Cloud Monitoring,
 * a Service acts as the root resource under which operational aspects of
 * the service are accessible
 *
 * To get more information about GenericService, see:
 *
 * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
 * * How-to Guides
 *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
 *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
 *     * [Service-orientation on Wikipedia](https://en.wikipedia.org/wiki/Service-orientation)
 *
 * ## Example Usage
 *
 * ### Monitoring Service Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myService = new gcp.monitoring.GenericService("my_service", {
 *     serviceId: "my-service",
 *     displayName: "My Service my-service",
 *     userLabels: {
 *         my_key: "my_value",
 *         my_other_key: "my_other_value",
 *     },
 *     basicService: {
 *         serviceType: "APP_ENGINE",
 *         serviceLabels: {
 *             module_id: "another-module-id",
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * GenericService can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/services/{{service_id}}`
 *
 * * `{{project}}/{{service_id}}`
 *
 * * `{{service_id}}`
 *
 * When using the `pulumi import` command, GenericService can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:monitoring/genericService:GenericService default projects/{{project}}/services/{{service_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:monitoring/genericService:GenericService default {{project}}/{{service_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:monitoring/genericService:GenericService default {{service_id}}
 * ```
 */
export class GenericService extends pulumi.CustomResource {
    /**
     * Get an existing GenericService resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GenericServiceState, opts?: pulumi.CustomResourceOptions): GenericService {
        return new GenericService(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:monitoring/genericService:GenericService';

    /**
     * Returns true if the given object is an instance of GenericService.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GenericService {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GenericService.__pulumiType;
    }

    /**
     * A well-known service type, defined by its service type and service labels.
     * Valid values of service types and services labels are described at
     * https://cloud.google.com/stackdriver/docs/solutions/slo-monitoring/api/api-structures#basic-svc-w-basic-sli
     * Structure is documented below.
     */
    public readonly basicService!: pulumi.Output<outputs.monitoring.GenericServiceBasicService | undefined>;
    /**
     * Name used for UI elements listing this Service.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * The full resource name for this service. The syntax is:
     * projects/[PROJECT_ID]/services/[SERVICE_ID].
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * An optional service ID to use. If not given, the server will generate a
     * service ID.
     */
    public readonly serviceId!: pulumi.Output<string>;
    /**
     * Configuration for how to query telemetry on a Service.
     * Structure is documented below.
     */
    public /*out*/ readonly telemetries!: pulumi.Output<outputs.monitoring.GenericServiceTelemetry[]>;
    /**
     * Labels which have been used to annotate the service. Label keys must start
     * with a letter. Label keys and values may contain lowercase letters,
     * numbers, underscores, and dashes. Label keys and values have a maximum
     * length of 63 characters, and must be less than 128 bytes in size. Up to 64
     * label entries may be stored. For labels which do not have a semantic value,
     * the empty string may be supplied for the label value.
     */
    public readonly userLabels!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a GenericService resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GenericServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GenericServiceArgs | GenericServiceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GenericServiceState | undefined;
            resourceInputs["basicService"] = state ? state.basicService : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["serviceId"] = state ? state.serviceId : undefined;
            resourceInputs["telemetries"] = state ? state.telemetries : undefined;
            resourceInputs["userLabels"] = state ? state.userLabels : undefined;
        } else {
            const args = argsOrState as GenericServiceArgs | undefined;
            if ((!args || args.serviceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceId'");
            }
            resourceInputs["basicService"] = args ? args.basicService : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["serviceId"] = args ? args.serviceId : undefined;
            resourceInputs["userLabels"] = args ? args.userLabels : undefined;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["telemetries"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GenericService.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GenericService resources.
 */
export interface GenericServiceState {
    /**
     * A well-known service type, defined by its service type and service labels.
     * Valid values of service types and services labels are described at
     * https://cloud.google.com/stackdriver/docs/solutions/slo-monitoring/api/api-structures#basic-svc-w-basic-sli
     * Structure is documented below.
     */
    basicService?: pulumi.Input<inputs.monitoring.GenericServiceBasicService>;
    /**
     * Name used for UI elements listing this Service.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The full resource name for this service. The syntax is:
     * projects/[PROJECT_ID]/services/[SERVICE_ID].
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * An optional service ID to use. If not given, the server will generate a
     * service ID.
     */
    serviceId?: pulumi.Input<string>;
    /**
     * Configuration for how to query telemetry on a Service.
     * Structure is documented below.
     */
    telemetries?: pulumi.Input<pulumi.Input<inputs.monitoring.GenericServiceTelemetry>[]>;
    /**
     * Labels which have been used to annotate the service. Label keys must start
     * with a letter. Label keys and values may contain lowercase letters,
     * numbers, underscores, and dashes. Label keys and values have a maximum
     * length of 63 characters, and must be less than 128 bytes in size. Up to 64
     * label entries may be stored. For labels which do not have a semantic value,
     * the empty string may be supplied for the label value.
     */
    userLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a GenericService resource.
 */
export interface GenericServiceArgs {
    /**
     * A well-known service type, defined by its service type and service labels.
     * Valid values of service types and services labels are described at
     * https://cloud.google.com/stackdriver/docs/solutions/slo-monitoring/api/api-structures#basic-svc-w-basic-sli
     * Structure is documented below.
     */
    basicService?: pulumi.Input<inputs.monitoring.GenericServiceBasicService>;
    /**
     * Name used for UI elements listing this Service.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * An optional service ID to use. If not given, the server will generate a
     * service ID.
     */
    serviceId: pulumi.Input<string>;
    /**
     * Labels which have been used to annotate the service. Label keys must start
     * with a letter. Label keys and values may contain lowercase letters,
     * numbers, underscores, and dashes. Label keys and values have a maximum
     * length of 63 characters, and must be less than 128 bytes in size. Up to 64
     * label entries may be stored. For labels which do not have a semantic value,
     * the empty string may be supplied for the label value.
     */
    userLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
