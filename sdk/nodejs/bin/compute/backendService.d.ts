import * as pulumi from "@pulumi/pulumi";
/**
 * A Backend Service defines a group of virtual machines that will serve traffic for load balancing. For more information
 * see [the official documentation](https://cloud.google.com/compute/docs/load-balancing/http/backend-service)
 * and the [API](https://cloud.google.com/compute/docs/reference/latest/backendServices).
 *
 * For internal load balancing, use a [google_compute_region_backend_service](https://www.terraform.io/docs/providers/google/r/compute_region_backend_service.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultHttpHealthCheck = new gcp.compute.HttpHealthCheck("default", {
 *     checkIntervalSec: 1,
 *     requestPath: "/",
 *     timeoutSec: 1,
 * });
 * const webserver = new gcp.compute.InstanceTemplate("webserver", {
 *     disks: [{
 *         autoDelete: true,
 *         boot: true,
 *         sourceImage: "debian-cloud/debian-9",
 *     }],
 *     machineType: "n1-standard-1",
 *     networkInterfaces: [{
 *         network: "default",
 *     }],
 * });
 * const webservers = new gcp.compute.InstanceGroupManager("webservers", {
 *     baseInstanceName: "webserver",
 *     instanceTemplate: webserver.selfLink,
 *     targetSize: 1,
 *     zone: "us-central1-f",
 * });
 * const website = new gcp.compute.BackendService("website", {
 *     backends: [{
 *         group: webservers.instanceGroup,
 *     }],
 *     description: "Our company website",
 *     enableCdn: false,
 *     healthChecks: defaultHttpHealthCheck.selfLink,
 *     portName: "http",
 *     protocol: "HTTP",
 *     timeoutSec: 10,
 * });
 * ```
 */
export declare class BackendService extends pulumi.CustomResource {
    /**
     * Get an existing BackendService resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BackendServiceState, opts?: pulumi.CustomResourceOptions): BackendService;
    /**
     * Lifetime of cookies in seconds if session_affinity is
     * `GENERATED_COOKIE`. If set to 0, the cookie is non-persistent and lasts only until the end of
     * the browser session (or equivalent). The maximum allowed value for TTL is one day.
     */
    readonly affinityCookieTtlSec: pulumi.Output<number | undefined>;
    /**
     * The list of backends that serve this BackendService. Structure is documented below.
     */
    readonly backends: pulumi.Output<{
        balancingMode?: string;
        capacityScaler?: number;
        description?: string;
        group?: string;
        maxConnections?: number;
        maxConnectionsPerInstance?: number;
        maxRate?: number;
        maxRatePerInstance?: number;
        maxUtilization?: number;
    }[] | undefined>;
    /**
     * Cloud CDN configuration for this BackendService. Structure is documented below.
     */
    readonly cdnPolicy: pulumi.Output<{
        cacheKeyPolicy?: {
            includeHost?: boolean;
            includeProtocol?: boolean;
            includeQueryString?: boolean;
            queryStringBlacklists?: string[];
            queryStringWhitelists?: string[];
        };
    }>;
    /**
     * Time for which instance will be drained (not accept new connections,
     * but still work to finish started ones). Defaults to `300`.
     */
    readonly connectionDrainingTimeoutSec: pulumi.Output<number | undefined>;
    /**
     * ) Headers that the
     * HTTP/S load balancer should add to proxied requests. See [guide](https://cloud.google.com/compute/docs/load-balancing/http/backend-service#user-defined-request-headers) for details.
     */
    readonly customRequestHeaders: pulumi.Output<string[] | undefined>;
    /**
     * The textual description for the backend service.
     */
    readonly description: pulumi.Output<string | undefined>;
    /**
     * Whether or not to enable the Cloud CDN on the backend service.
     */
    readonly enableCdn: pulumi.Output<boolean | undefined>;
    /**
     * The fingerprint of the backend service.
     */
    readonly fingerprint: pulumi.Output<string>;
    /**
     * Specifies a list of HTTP/HTTPS health checks
     * for checking the health of the backend service. Currently at most one health
     * check can be specified, and a health check is required.
     */
    readonly healthChecks: pulumi.Output<string>;
    /**
     * Specification for the Identity-Aware proxy. Disabled if not specified. Structure is documented below.
     */
    readonly iap: pulumi.Output<{
        oauth2ClientId: string;
        oauth2ClientSecret: string;
        oauth2ClientSecretSha256: string;
    } | undefined>;
    /**
     * The name of the backend service.
     */
    readonly name: pulumi.Output<string>;
    /**
     * The name of a service that has been added to an
     * instance group in this backend. See [related docs](https://cloud.google.com/compute/docs/instance-groups/#specifying_service_endpoints) for details. Defaults to http.
     */
    readonly portName: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    /**
     * The protocol for incoming requests. Defaults to
     * `HTTP`.
     */
    readonly protocol: pulumi.Output<string>;
    /**
     * Name or URI of a
     * [security policy](https://cloud.google.com/armor/docs/security-policy-concepts) to add to the backend service.
     */
    readonly securityPolicy: pulumi.Output<string | undefined>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink: pulumi.Output<string>;
    /**
     * How to distribute load. Options are `NONE` (no
     * affinity), `CLIENT_IP` (hash of the source/dest addresses / ports), and
     * `GENERATED_COOKIE` (distribute load using a generated session cookie).
     */
    readonly sessionAffinity: pulumi.Output<string>;
    /**
     * The number of secs to wait for a backend to respond
     * to a request before considering the request failed. Defaults to `30`.
     */
    readonly timeoutSec: pulumi.Output<number>;
    /**
     * Create a BackendService resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BackendServiceArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering BackendService resources.
 */
export interface BackendServiceState {
    /**
     * Lifetime of cookies in seconds if session_affinity is
     * `GENERATED_COOKIE`. If set to 0, the cookie is non-persistent and lasts only until the end of
     * the browser session (or equivalent). The maximum allowed value for TTL is one day.
     */
    readonly affinityCookieTtlSec?: pulumi.Input<number>;
    /**
     * The list of backends that serve this BackendService. Structure is documented below.
     */
    readonly backends?: pulumi.Input<pulumi.Input<{
        balancingMode?: pulumi.Input<string>;
        capacityScaler?: pulumi.Input<number>;
        description?: pulumi.Input<string>;
        group?: pulumi.Input<string>;
        maxConnections?: pulumi.Input<number>;
        maxConnectionsPerInstance?: pulumi.Input<number>;
        maxRate?: pulumi.Input<number>;
        maxRatePerInstance?: pulumi.Input<number>;
        maxUtilization?: pulumi.Input<number>;
    }>[]>;
    /**
     * Cloud CDN configuration for this BackendService. Structure is documented below.
     */
    readonly cdnPolicy?: pulumi.Input<{
        cacheKeyPolicy?: pulumi.Input<{
            includeHost?: pulumi.Input<boolean>;
            includeProtocol?: pulumi.Input<boolean>;
            includeQueryString?: pulumi.Input<boolean>;
            queryStringBlacklists?: pulumi.Input<pulumi.Input<string>[]>;
            queryStringWhitelists?: pulumi.Input<pulumi.Input<string>[]>;
        }>;
    }>;
    /**
     * Time for which instance will be drained (not accept new connections,
     * but still work to finish started ones). Defaults to `300`.
     */
    readonly connectionDrainingTimeoutSec?: pulumi.Input<number>;
    /**
     * ) Headers that the
     * HTTP/S load balancer should add to proxied requests. See [guide](https://cloud.google.com/compute/docs/load-balancing/http/backend-service#user-defined-request-headers) for details.
     */
    readonly customRequestHeaders?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The textual description for the backend service.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Whether or not to enable the Cloud CDN on the backend service.
     */
    readonly enableCdn?: pulumi.Input<boolean>;
    /**
     * The fingerprint of the backend service.
     */
    readonly fingerprint?: pulumi.Input<string>;
    /**
     * Specifies a list of HTTP/HTTPS health checks
     * for checking the health of the backend service. Currently at most one health
     * check can be specified, and a health check is required.
     */
    readonly healthChecks?: pulumi.Input<string>;
    /**
     * Specification for the Identity-Aware proxy. Disabled if not specified. Structure is documented below.
     */
    readonly iap?: pulumi.Input<{
        oauth2ClientId: pulumi.Input<string>;
        oauth2ClientSecret: pulumi.Input<string>;
        oauth2ClientSecretSha256?: pulumi.Input<string>;
    }>;
    /**
     * The name of the backend service.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The name of a service that has been added to an
     * instance group in this backend. See [related docs](https://cloud.google.com/compute/docs/instance-groups/#specifying_service_endpoints) for details. Defaults to http.
     */
    readonly portName?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The protocol for incoming requests. Defaults to
     * `HTTP`.
     */
    readonly protocol?: pulumi.Input<string>;
    /**
     * Name or URI of a
     * [security policy](https://cloud.google.com/armor/docs/security-policy-concepts) to add to the backend service.
     */
    readonly securityPolicy?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    readonly selfLink?: pulumi.Input<string>;
    /**
     * How to distribute load. Options are `NONE` (no
     * affinity), `CLIENT_IP` (hash of the source/dest addresses / ports), and
     * `GENERATED_COOKIE` (distribute load using a generated session cookie).
     */
    readonly sessionAffinity?: pulumi.Input<string>;
    /**
     * The number of secs to wait for a backend to respond
     * to a request before considering the request failed. Defaults to `30`.
     */
    readonly timeoutSec?: pulumi.Input<number>;
}
/**
 * The set of arguments for constructing a BackendService resource.
 */
export interface BackendServiceArgs {
    /**
     * Lifetime of cookies in seconds if session_affinity is
     * `GENERATED_COOKIE`. If set to 0, the cookie is non-persistent and lasts only until the end of
     * the browser session (or equivalent). The maximum allowed value for TTL is one day.
     */
    readonly affinityCookieTtlSec?: pulumi.Input<number>;
    /**
     * The list of backends that serve this BackendService. Structure is documented below.
     */
    readonly backends?: pulumi.Input<pulumi.Input<{
        balancingMode?: pulumi.Input<string>;
        capacityScaler?: pulumi.Input<number>;
        description?: pulumi.Input<string>;
        group?: pulumi.Input<string>;
        maxConnections?: pulumi.Input<number>;
        maxConnectionsPerInstance?: pulumi.Input<number>;
        maxRate?: pulumi.Input<number>;
        maxRatePerInstance?: pulumi.Input<number>;
        maxUtilization?: pulumi.Input<number>;
    }>[]>;
    /**
     * Cloud CDN configuration for this BackendService. Structure is documented below.
     */
    readonly cdnPolicy?: pulumi.Input<{
        cacheKeyPolicy?: pulumi.Input<{
            includeHost?: pulumi.Input<boolean>;
            includeProtocol?: pulumi.Input<boolean>;
            includeQueryString?: pulumi.Input<boolean>;
            queryStringBlacklists?: pulumi.Input<pulumi.Input<string>[]>;
            queryStringWhitelists?: pulumi.Input<pulumi.Input<string>[]>;
        }>;
    }>;
    /**
     * Time for which instance will be drained (not accept new connections,
     * but still work to finish started ones). Defaults to `300`.
     */
    readonly connectionDrainingTimeoutSec?: pulumi.Input<number>;
    /**
     * ) Headers that the
     * HTTP/S load balancer should add to proxied requests. See [guide](https://cloud.google.com/compute/docs/load-balancing/http/backend-service#user-defined-request-headers) for details.
     */
    readonly customRequestHeaders?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The textual description for the backend service.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Whether or not to enable the Cloud CDN on the backend service.
     */
    readonly enableCdn?: pulumi.Input<boolean>;
    /**
     * Specifies a list of HTTP/HTTPS health checks
     * for checking the health of the backend service. Currently at most one health
     * check can be specified, and a health check is required.
     */
    readonly healthChecks: pulumi.Input<string>;
    /**
     * Specification for the Identity-Aware proxy. Disabled if not specified. Structure is documented below.
     */
    readonly iap?: pulumi.Input<{
        oauth2ClientId: pulumi.Input<string>;
        oauth2ClientSecret: pulumi.Input<string>;
        oauth2ClientSecretSha256?: pulumi.Input<string>;
    }>;
    /**
     * The name of the backend service.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The name of a service that has been added to an
     * instance group in this backend. See [related docs](https://cloud.google.com/compute/docs/instance-groups/#specifying_service_endpoints) for details. Defaults to http.
     */
    readonly portName?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    /**
     * The protocol for incoming requests. Defaults to
     * `HTTP`.
     */
    readonly protocol?: pulumi.Input<string>;
    /**
     * Name or URI of a
     * [security policy](https://cloud.google.com/armor/docs/security-policy-concepts) to add to the backend service.
     */
    readonly securityPolicy?: pulumi.Input<string>;
    /**
     * How to distribute load. Options are `NONE` (no
     * affinity), `CLIENT_IP` (hash of the source/dest addresses / ports), and
     * `GENERATED_COOKIE` (distribute load using a generated session cookie).
     */
    readonly sessionAffinity?: pulumi.Input<string>;
    /**
     * The number of secs to wait for a backend to respond
     * to a request before considering the request failed. Defaults to `30`.
     */
    readonly timeoutSec?: pulumi.Input<number>;
}
