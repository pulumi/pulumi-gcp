import * as pulumi from "@pulumi/pulumi";
/**
 * This resource creates and rolls out a Cloud Endpoints service using OpenAPI or gRPC.  View the relevant docs for [OpenAPI](https://cloud.google.com/endpoints/docs/openapi/) and [gRPC](https://cloud.google.com/endpoints/docs/grpc/).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fs from "fs";
 * import * as gcp from "@pulumi/gcp";
 *
 * const grpcService = new gcp.endpoints.Service("grpc_service", {
 *     grpcConfig: fs.readFileSync("service_spec.yml", "utf-8"),
 *     project: "project-id",
 *     protocOutputBase64: Buffer.from(fs.readFileSync("compiled_descriptor_file.pb", "utf-8")).toString("base64"),
 *     serviceName: "api-name.endpoints.project-id.cloud.goog",
 * });
 * const openapiService = new gcp.endpoints.Service("openapi_service", {
 *     openapiConfig: fs.readFileSync("openapi_spec.yml", "utf-8"),
 *     project: "project-id",
 *     serviceName: "api-name.endpoints.project-id.cloud.goog",
 * });
 * ```
 *
 * The example in `examples/endpoints_on_compute_engine` shows the API from the quickstart running on a Compute Engine VM and reachable through Cloud Endpoints, which may also be useful.
 */
export declare class Service extends pulumi.CustomResource {
    /**
     * Get an existing Service resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceState, opts?: pulumi.CustomResourceOptions): Service;
    readonly apis: pulumi.Output<{
        methods: {
            name: string;
            requestType: string;
            responseType: string;
            syntax: string;
        }[];
        name: string;
        syntax: string;
        version: string;
    }[]>;
    readonly configId: pulumi.Output<string>;
    readonly dnsAddress: pulumi.Output<string>;
    readonly endpoints: pulumi.Output<{
        address: string;
        name: string;
    }[]>;
    readonly grpcConfig: pulumi.Output<string | undefined>;
    readonly openapiConfig: pulumi.Output<string | undefined>;
    readonly project: pulumi.Output<string>;
    readonly protocOutputBase64: pulumi.Output<string | undefined>;
    readonly serviceName: pulumi.Output<string>;
    /**
     * Create a Service resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Service resources.
 */
export interface ServiceState {
    readonly apis?: pulumi.Input<pulumi.Input<{
        methods?: pulumi.Input<pulumi.Input<{
            name?: pulumi.Input<string>;
            requestType?: pulumi.Input<string>;
            responseType?: pulumi.Input<string>;
            syntax?: pulumi.Input<string>;
        }>[]>;
        name?: pulumi.Input<string>;
        syntax?: pulumi.Input<string>;
        version?: pulumi.Input<string>;
    }>[]>;
    readonly configId?: pulumi.Input<string>;
    readonly dnsAddress?: pulumi.Input<string>;
    readonly endpoints?: pulumi.Input<pulumi.Input<{
        address?: pulumi.Input<string>;
        name?: pulumi.Input<string>;
    }>[]>;
    readonly grpcConfig?: pulumi.Input<string>;
    readonly openapiConfig?: pulumi.Input<string>;
    readonly project?: pulumi.Input<string>;
    readonly protocOutputBase64?: pulumi.Input<string>;
    readonly serviceName?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Service resource.
 */
export interface ServiceArgs {
    readonly grpcConfig?: pulumi.Input<string>;
    readonly openapiConfig?: pulumi.Input<string>;
    readonly project?: pulumi.Input<string>;
    readonly protocOutputBase64?: pulumi.Input<string>;
    readonly serviceName: pulumi.Input<string>;
}
