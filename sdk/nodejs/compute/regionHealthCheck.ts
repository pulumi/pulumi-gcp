// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Health Checks determine whether instances are responsive and able to do work.
 * They are an important part of a comprehensive load balancing configuration,
 * as they enable monitoring instances behind load balancers.
 *
 * Health Checks poll instances at a specified interval. Instances that
 * do not respond successfully to some number of probes in a row are marked
 * as unhealthy. No new connections are sent to unhealthy instances,
 * though existing connections will continue. The health check will
 * continue to poll unhealthy instances. If an instance later responds
 * successfully to some number of consecutive probes, it is marked
 * healthy again and can receive new connections.
 *
 * To get more information about RegionHealthCheck, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/regionHealthChecks)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/load-balancing/docs/health-checks)
 *
 * ## Example Usage
 *
 * ### Region Health Check Tcp
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const tcp_region_health_check = new gcp.compute.RegionHealthCheck("tcp-region-health-check", {
 *     name: "tcp-region-health-check",
 *     timeoutSec: 1,
 *     checkIntervalSec: 1,
 *     tcpHealthCheck: {
 *         port: 80,
 *     },
 * });
 * ```
 * ### Region Health Check Tcp Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const tcp_region_health_check = new gcp.compute.RegionHealthCheck("tcp-region-health-check", {
 *     name: "tcp-region-health-check",
 *     description: "Health check via tcp",
 *     timeoutSec: 1,
 *     checkIntervalSec: 1,
 *     healthyThreshold: 4,
 *     unhealthyThreshold: 5,
 *     tcpHealthCheck: {
 *         portName: "health-check-port",
 *         portSpecification: "USE_NAMED_PORT",
 *         request: "ARE YOU HEALTHY?",
 *         proxyHeader: "NONE",
 *         response: "I AM HEALTHY",
 *     },
 * });
 * ```
 * ### Region Health Check Ssl
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const ssl_region_health_check = new gcp.compute.RegionHealthCheck("ssl-region-health-check", {
 *     name: "ssl-region-health-check",
 *     timeoutSec: 1,
 *     checkIntervalSec: 1,
 *     sslHealthCheck: {
 *         port: 443,
 *     },
 * });
 * ```
 * ### Region Health Check Ssl Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const ssl_region_health_check = new gcp.compute.RegionHealthCheck("ssl-region-health-check", {
 *     name: "ssl-region-health-check",
 *     description: "Health check via ssl",
 *     timeoutSec: 1,
 *     checkIntervalSec: 1,
 *     healthyThreshold: 4,
 *     unhealthyThreshold: 5,
 *     sslHealthCheck: {
 *         portName: "health-check-port",
 *         portSpecification: "USE_NAMED_PORT",
 *         request: "ARE YOU HEALTHY?",
 *         proxyHeader: "NONE",
 *         response: "I AM HEALTHY",
 *     },
 * });
 * ```
 * ### Region Health Check Http
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const http_region_health_check = new gcp.compute.RegionHealthCheck("http-region-health-check", {
 *     name: "http-region-health-check",
 *     timeoutSec: 1,
 *     checkIntervalSec: 1,
 *     httpHealthCheck: {
 *         port: 80,
 *     },
 * });
 * ```
 * ### Region Health Check Http Logs
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const http_region_health_check = new gcp.compute.RegionHealthCheck("http-region-health-check", {
 *     name: "http-region-health-check",
 *     timeoutSec: 1,
 *     checkIntervalSec: 1,
 *     httpHealthCheck: {
 *         port: 80,
 *     },
 *     logConfig: {
 *         enable: true,
 *     },
 * });
 * ```
 * ### Region Health Check Http Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const http_region_health_check = new gcp.compute.RegionHealthCheck("http-region-health-check", {
 *     name: "http-region-health-check",
 *     description: "Health check via http",
 *     timeoutSec: 1,
 *     checkIntervalSec: 1,
 *     healthyThreshold: 4,
 *     unhealthyThreshold: 5,
 *     httpHealthCheck: {
 *         portName: "health-check-port",
 *         portSpecification: "USE_NAMED_PORT",
 *         host: "1.2.3.4",
 *         requestPath: "/mypath",
 *         proxyHeader: "NONE",
 *         response: "I AM HEALTHY",
 *     },
 * });
 * ```
 * ### Region Health Check Https
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const https_region_health_check = new gcp.compute.RegionHealthCheck("https-region-health-check", {
 *     name: "https-region-health-check",
 *     timeoutSec: 1,
 *     checkIntervalSec: 1,
 *     httpsHealthCheck: {
 *         port: 443,
 *     },
 * });
 * ```
 * ### Region Health Check Https Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const https_region_health_check = new gcp.compute.RegionHealthCheck("https-region-health-check", {
 *     name: "https-region-health-check",
 *     description: "Health check via https",
 *     timeoutSec: 1,
 *     checkIntervalSec: 1,
 *     healthyThreshold: 4,
 *     unhealthyThreshold: 5,
 *     httpsHealthCheck: {
 *         portName: "health-check-port",
 *         portSpecification: "USE_NAMED_PORT",
 *         host: "1.2.3.4",
 *         requestPath: "/mypath",
 *         proxyHeader: "NONE",
 *         response: "I AM HEALTHY",
 *     },
 * });
 * ```
 * ### Region Health Check Http2
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const http2_region_health_check = new gcp.compute.RegionHealthCheck("http2-region-health-check", {
 *     name: "http2-region-health-check",
 *     timeoutSec: 1,
 *     checkIntervalSec: 1,
 *     http2HealthCheck: {
 *         port: 443,
 *     },
 * });
 * ```
 * ### Region Health Check Http2 Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const http2_region_health_check = new gcp.compute.RegionHealthCheck("http2-region-health-check", {
 *     name: "http2-region-health-check",
 *     description: "Health check via http2",
 *     timeoutSec: 1,
 *     checkIntervalSec: 1,
 *     healthyThreshold: 4,
 *     unhealthyThreshold: 5,
 *     http2HealthCheck: {
 *         portName: "health-check-port",
 *         portSpecification: "USE_NAMED_PORT",
 *         host: "1.2.3.4",
 *         requestPath: "/mypath",
 *         proxyHeader: "NONE",
 *         response: "I AM HEALTHY",
 *     },
 * });
 * ```
 * ### Region Health Check Grpc
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const grpc_region_health_check = new gcp.compute.RegionHealthCheck("grpc-region-health-check", {
 *     name: "grpc-region-health-check",
 *     timeoutSec: 1,
 *     checkIntervalSec: 1,
 *     grpcHealthCheck: {
 *         port: 443,
 *     },
 * });
 * ```
 * ### Region Health Check Grpc Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const grpc_region_health_check = new gcp.compute.RegionHealthCheck("grpc-region-health-check", {
 *     name: "grpc-region-health-check",
 *     timeoutSec: 1,
 *     checkIntervalSec: 1,
 *     grpcHealthCheck: {
 *         portName: "health-check-port",
 *         portSpecification: "USE_NAMED_PORT",
 *         grpcServiceName: "testservice",
 *     },
 * });
 * ```
 * ### Region Health Check Grpc With Tls
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const grpc_with_tls_region_health_check = new gcp.compute.RegionHealthCheck("grpc-with-tls-region-health-check", {
 *     name: "grpc-with-tls-region-health-check",
 *     timeoutSec: 1,
 *     checkIntervalSec: 1,
 *     grpcTlsHealthCheck: {
 *         port: 443,
 *     },
 * });
 * ```
 * ### Region Health Check Grpc With Tls Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const grpc_with_tls_region_health_check = new gcp.compute.RegionHealthCheck("grpc-with-tls-region-health-check", {
 *     name: "grpc-with-tls-region-health-check",
 *     description: "regional health check via GRPC with TLS",
 *     timeoutSec: 1,
 *     checkIntervalSec: 1,
 *     healthyThreshold: 4,
 *     unhealthyThreshold: 5,
 *     grpcTlsHealthCheck: {
 *         portSpecification: "USE_FIXED_PORT",
 *         port: 443,
 *         grpcServiceName: "testservice",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * RegionHealthCheck can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/regions/{{region}}/healthChecks/{{name}}`
 *
 * * `{{project}}/{{region}}/{{name}}`
 *
 * * `{{region}}/{{name}}`
 *
 * * `{{name}}`
 *
 * When using the `pulumi import` command, RegionHealthCheck can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:compute/regionHealthCheck:RegionHealthCheck default projects/{{project}}/regions/{{region}}/healthChecks/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:compute/regionHealthCheck:RegionHealthCheck default {{project}}/{{region}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:compute/regionHealthCheck:RegionHealthCheck default {{region}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:compute/regionHealthCheck:RegionHealthCheck default {{name}}
 * ```
 */
export class RegionHealthCheck extends pulumi.CustomResource {
    /**
     * Get an existing RegionHealthCheck resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RegionHealthCheckState, opts?: pulumi.CustomResourceOptions): RegionHealthCheck {
        return new RegionHealthCheck(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:compute/regionHealthCheck:RegionHealthCheck';

    /**
     * Returns true if the given object is an instance of RegionHealthCheck.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RegionHealthCheck {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RegionHealthCheck.__pulumiType;
    }

    /**
     * How often (in seconds) to send a health check. The default value is 5
     * seconds.
     */
    public readonly checkIntervalSec!: pulumi.Output<number | undefined>;
    /**
     * Creation timestamp in RFC3339 text format.
     */
    public /*out*/ readonly creationTimestamp!: pulumi.Output<string>;
    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    public readonly grpcHealthCheck!: pulumi.Output<outputs.compute.RegionHealthCheckGrpcHealthCheck | undefined>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    public readonly grpcTlsHealthCheck!: pulumi.Output<outputs.compute.RegionHealthCheckGrpcTlsHealthCheck | undefined>;
    /**
     * The unique identifier number for the resource. This identifier is defined by the server.
     */
    public /*out*/ readonly healthCheckId!: pulumi.Output<number>;
    /**
     * A so-far unhealthy instance will be marked healthy after this many
     * consecutive successes. The default value is 2.
     */
    public readonly healthyThreshold!: pulumi.Output<number | undefined>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    public readonly http2HealthCheck!: pulumi.Output<outputs.compute.RegionHealthCheckHttp2HealthCheck | undefined>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    public readonly httpHealthCheck!: pulumi.Output<outputs.compute.RegionHealthCheckHttpHealthCheck | undefined>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    public readonly httpsHealthCheck!: pulumi.Output<outputs.compute.RegionHealthCheckHttpsHealthCheck | undefined>;
    /**
     * Configure logging on this health check.
     * Structure is documented below.
     */
    public readonly logConfig!: pulumi.Output<outputs.compute.RegionHealthCheckLogConfig>;
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The Region in which the created health check should reside.
     * If it is not provided, the provider region is used.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    public /*out*/ readonly selfLink!: pulumi.Output<string>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    public readonly sslHealthCheck!: pulumi.Output<outputs.compute.RegionHealthCheckSslHealthCheck | undefined>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    public readonly tcpHealthCheck!: pulumi.Output<outputs.compute.RegionHealthCheckTcpHealthCheck | undefined>;
    /**
     * How long (in seconds) to wait before claiming failure.
     * The default value is 5 seconds.  It is invalid for timeoutSec to have
     * greater value than checkIntervalSec.
     */
    public readonly timeoutSec!: pulumi.Output<number | undefined>;
    /**
     * The type of the health check. One of HTTP, HTTP2, HTTPS, TCP, or SSL.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    /**
     * A so-far healthy instance will be marked unhealthy after this many
     * consecutive failures. The default value is 2.
     */
    public readonly unhealthyThreshold!: pulumi.Output<number | undefined>;

    /**
     * Create a RegionHealthCheck resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: RegionHealthCheckArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RegionHealthCheckArgs | RegionHealthCheckState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RegionHealthCheckState | undefined;
            resourceInputs["checkIntervalSec"] = state ? state.checkIntervalSec : undefined;
            resourceInputs["creationTimestamp"] = state ? state.creationTimestamp : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["grpcHealthCheck"] = state ? state.grpcHealthCheck : undefined;
            resourceInputs["grpcTlsHealthCheck"] = state ? state.grpcTlsHealthCheck : undefined;
            resourceInputs["healthCheckId"] = state ? state.healthCheckId : undefined;
            resourceInputs["healthyThreshold"] = state ? state.healthyThreshold : undefined;
            resourceInputs["http2HealthCheck"] = state ? state.http2HealthCheck : undefined;
            resourceInputs["httpHealthCheck"] = state ? state.httpHealthCheck : undefined;
            resourceInputs["httpsHealthCheck"] = state ? state.httpsHealthCheck : undefined;
            resourceInputs["logConfig"] = state ? state.logConfig : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["selfLink"] = state ? state.selfLink : undefined;
            resourceInputs["sslHealthCheck"] = state ? state.sslHealthCheck : undefined;
            resourceInputs["tcpHealthCheck"] = state ? state.tcpHealthCheck : undefined;
            resourceInputs["timeoutSec"] = state ? state.timeoutSec : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["unhealthyThreshold"] = state ? state.unhealthyThreshold : undefined;
        } else {
            const args = argsOrState as RegionHealthCheckArgs | undefined;
            resourceInputs["checkIntervalSec"] = args ? args.checkIntervalSec : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["grpcHealthCheck"] = args ? args.grpcHealthCheck : undefined;
            resourceInputs["grpcTlsHealthCheck"] = args ? args.grpcTlsHealthCheck : undefined;
            resourceInputs["healthyThreshold"] = args ? args.healthyThreshold : undefined;
            resourceInputs["http2HealthCheck"] = args ? args.http2HealthCheck : undefined;
            resourceInputs["httpHealthCheck"] = args ? args.httpHealthCheck : undefined;
            resourceInputs["httpsHealthCheck"] = args ? args.httpsHealthCheck : undefined;
            resourceInputs["logConfig"] = args ? args.logConfig : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["sslHealthCheck"] = args ? args.sslHealthCheck : undefined;
            resourceInputs["tcpHealthCheck"] = args ? args.tcpHealthCheck : undefined;
            resourceInputs["timeoutSec"] = args ? args.timeoutSec : undefined;
            resourceInputs["unhealthyThreshold"] = args ? args.unhealthyThreshold : undefined;
            resourceInputs["creationTimestamp"] = undefined /*out*/;
            resourceInputs["healthCheckId"] = undefined /*out*/;
            resourceInputs["selfLink"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RegionHealthCheck.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RegionHealthCheck resources.
 */
export interface RegionHealthCheckState {
    /**
     * How often (in seconds) to send a health check. The default value is 5
     * seconds.
     */
    checkIntervalSec?: pulumi.Input<number>;
    /**
     * Creation timestamp in RFC3339 text format.
     */
    creationTimestamp?: pulumi.Input<string>;
    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    grpcHealthCheck?: pulumi.Input<inputs.compute.RegionHealthCheckGrpcHealthCheck>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    grpcTlsHealthCheck?: pulumi.Input<inputs.compute.RegionHealthCheckGrpcTlsHealthCheck>;
    /**
     * The unique identifier number for the resource. This identifier is defined by the server.
     */
    healthCheckId?: pulumi.Input<number>;
    /**
     * A so-far unhealthy instance will be marked healthy after this many
     * consecutive successes. The default value is 2.
     */
    healthyThreshold?: pulumi.Input<number>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    http2HealthCheck?: pulumi.Input<inputs.compute.RegionHealthCheckHttp2HealthCheck>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    httpHealthCheck?: pulumi.Input<inputs.compute.RegionHealthCheckHttpHealthCheck>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    httpsHealthCheck?: pulumi.Input<inputs.compute.RegionHealthCheckHttpsHealthCheck>;
    /**
     * Configure logging on this health check.
     * Structure is documented below.
     */
    logConfig?: pulumi.Input<inputs.compute.RegionHealthCheckLogConfig>;
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The Region in which the created health check should reside.
     * If it is not provided, the provider region is used.
     */
    region?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    selfLink?: pulumi.Input<string>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    sslHealthCheck?: pulumi.Input<inputs.compute.RegionHealthCheckSslHealthCheck>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    tcpHealthCheck?: pulumi.Input<inputs.compute.RegionHealthCheckTcpHealthCheck>;
    /**
     * How long (in seconds) to wait before claiming failure.
     * The default value is 5 seconds.  It is invalid for timeoutSec to have
     * greater value than checkIntervalSec.
     */
    timeoutSec?: pulumi.Input<number>;
    /**
     * The type of the health check. One of HTTP, HTTP2, HTTPS, TCP, or SSL.
     */
    type?: pulumi.Input<string>;
    /**
     * A so-far healthy instance will be marked unhealthy after this many
     * consecutive failures. The default value is 2.
     */
    unhealthyThreshold?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a RegionHealthCheck resource.
 */
export interface RegionHealthCheckArgs {
    /**
     * How often (in seconds) to send a health check. The default value is 5
     * seconds.
     */
    checkIntervalSec?: pulumi.Input<number>;
    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    grpcHealthCheck?: pulumi.Input<inputs.compute.RegionHealthCheckGrpcHealthCheck>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    grpcTlsHealthCheck?: pulumi.Input<inputs.compute.RegionHealthCheckGrpcTlsHealthCheck>;
    /**
     * A so-far unhealthy instance will be marked healthy after this many
     * consecutive successes. The default value is 2.
     */
    healthyThreshold?: pulumi.Input<number>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    http2HealthCheck?: pulumi.Input<inputs.compute.RegionHealthCheckHttp2HealthCheck>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    httpHealthCheck?: pulumi.Input<inputs.compute.RegionHealthCheckHttpHealthCheck>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    httpsHealthCheck?: pulumi.Input<inputs.compute.RegionHealthCheckHttpsHealthCheck>;
    /**
     * Configure logging on this health check.
     * Structure is documented below.
     */
    logConfig?: pulumi.Input<inputs.compute.RegionHealthCheckLogConfig>;
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The Region in which the created health check should reside.
     * If it is not provided, the provider region is used.
     */
    region?: pulumi.Input<string>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    sslHealthCheck?: pulumi.Input<inputs.compute.RegionHealthCheckSslHealthCheck>;
    /**
     * A nested object resource.
     * Structure is documented below.
     */
    tcpHealthCheck?: pulumi.Input<inputs.compute.RegionHealthCheckTcpHealthCheck>;
    /**
     * How long (in seconds) to wait before claiming failure.
     * The default value is 5 seconds.  It is invalid for timeoutSec to have
     * greater value than checkIntervalSec.
     */
    timeoutSec?: pulumi.Input<number>;
    /**
     * A so-far healthy instance will be marked unhealthy after this many
     * consecutive failures. The default value is 2.
     */
    unhealthyThreshold?: pulumi.Input<number>;
}
