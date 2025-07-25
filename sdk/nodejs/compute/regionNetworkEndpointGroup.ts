// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A regional NEG that can support Serverless Products, proxying traffic to
 * external backends and providing traffic to the PSC port mapping endpoints.
 *
 * To get more information about RegionNetworkEndpointGroup, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/regionNetworkEndpointGroups)
 * * How-to Guides
 *     * [Internet NEGs Official Documentation](https://cloud.google.com/load-balancing/docs/negs/internet-neg-concepts)
 *     * [Serverless NEGs Official Documentation](https://cloud.google.com/load-balancing/docs/negs/serverless-neg-concepts)
 *
 * ## Example Usage
 *
 * ### Region Network Endpoint Group Functions
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const bucket = new gcp.storage.Bucket("bucket", {
 *     name: "cloudfunctions-function-example-bucket",
 *     location: "US",
 * });
 * const archive = new gcp.storage.BucketObject("archive", {
 *     name: "index.zip",
 *     bucket: bucket.name,
 *     source: new pulumi.asset.FileAsset("path/to/index.zip"),
 * });
 * const functionNegFunction = new gcp.cloudfunctions.Function("function_neg", {
 *     name: "function-neg",
 *     description: "My function",
 *     runtime: "nodejs20",
 *     availableMemoryMb: 128,
 *     sourceArchiveBucket: bucket.name,
 *     sourceArchiveObject: archive.name,
 *     triggerHttp: true,
 *     timeout: 60,
 *     entryPoint: "helloGET",
 * });
 * // Cloud Functions Example
 * const functionNeg = new gcp.compute.RegionNetworkEndpointGroup("function_neg", {
 *     name: "function-neg",
 *     networkEndpointType: "SERVERLESS",
 *     region: "us-central1",
 *     cloudFunction: {
 *         "function": functionNegFunction.name,
 *     },
 * });
 * ```
 * ### Region Network Endpoint Group Cloudrun
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const cloudrunNegService = new gcp.cloudrun.Service("cloudrun_neg", {
 *     name: "cloudrun-neg",
 *     location: "us-central1",
 *     template: {
 *         spec: {
 *             containers: [{
 *                 image: "us-docker.pkg.dev/cloudrun/container/hello",
 *             }],
 *         },
 *     },
 *     traffics: [{
 *         percent: 100,
 *         latestRevision: true,
 *     }],
 * });
 * // Cloud Run Example
 * const cloudrunNeg = new gcp.compute.RegionNetworkEndpointGroup("cloudrun_neg", {
 *     name: "cloudrun-neg",
 *     networkEndpointType: "SERVERLESS",
 *     region: "us-central1",
 *     cloudRun: {
 *         service: cloudrunNegService.name,
 *     },
 * });
 * ```
 * ### Region Network Endpoint Group Appengine
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const appengineNegBucket = new gcp.storage.Bucket("appengine_neg", {
 *     name: "appengine-neg",
 *     location: "US",
 *     uniformBucketLevelAccess: true,
 * });
 * const appengineNegBucketObject = new gcp.storage.BucketObject("appengine_neg", {
 *     name: "hello-world.zip",
 *     bucket: appengineNegBucket.name,
 *     source: new pulumi.asset.FileAsset("./test-fixtures/hello-world.zip"),
 * });
 * const appengineNegFlexibleAppVersion = new gcp.appengine.FlexibleAppVersion("appengine_neg", {
 *     versionId: "v1",
 *     service: "appengine-neg",
 *     runtime: "nodejs",
 *     flexibleRuntimeSettings: {
 *         operatingSystem: "ubuntu22",
 *         runtimeVersion: "20",
 *     },
 *     entrypoint: {
 *         shell: "node ./app.js",
 *     },
 *     deployment: {
 *         zip: {
 *             sourceUrl: pulumi.interpolate`https://storage.googleapis.com/${appengineNegBucket.name}/${appengineNegBucketObject.name}`,
 *         },
 *     },
 *     livenessCheck: {
 *         path: "/",
 *     },
 *     readinessCheck: {
 *         path: "/",
 *     },
 *     envVariables: {
 *         port: "8080",
 *     },
 *     handlers: [{
 *         urlRegex: ".*\\/my-path\\/*",
 *         securityLevel: "SECURE_ALWAYS",
 *         login: "LOGIN_REQUIRED",
 *         authFailAction: "AUTH_FAIL_ACTION_REDIRECT",
 *         staticFiles: {
 *             path: "my-other-path",
 *             uploadPathRegex: ".*\\/my-path\\/*",
 *         },
 *     }],
 *     automaticScaling: {
 *         coolDownPeriod: "120s",
 *         cpuUtilization: {
 *             targetUtilization: 0.5,
 *         },
 *     },
 *     deleteServiceOnDestroy: true,
 * });
 * // App Engine Example
 * const appengineNeg = new gcp.compute.RegionNetworkEndpointGroup("appengine_neg", {
 *     name: "appengine-neg",
 *     networkEndpointType: "SERVERLESS",
 *     region: "us-central1",
 *     appEngine: {
 *         service: appengineNegFlexibleAppVersion.service,
 *         version: appengineNegFlexibleAppVersion.versionId,
 *     },
 * });
 * ```
 * ### Region Network Endpoint Group Appengine Empty
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * // App Engine Example
 * const appengineNeg = new gcp.compute.RegionNetworkEndpointGroup("appengine_neg", {
 *     name: "appengine-neg",
 *     networkEndpointType: "SERVERLESS",
 *     region: "us-central1",
 *     appEngine: {},
 * });
 * ```
 * ### Region Network Endpoint Group Psc
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const pscNeg = new gcp.compute.RegionNetworkEndpointGroup("psc_neg", {
 *     name: "psc-neg",
 *     region: "asia-northeast3",
 *     networkEndpointType: "PRIVATE_SERVICE_CONNECT",
 *     pscTargetService: "asia-northeast3-cloudkms.googleapis.com",
 * });
 * ```
 * ### Region Network Endpoint Group Psc Service Attachment
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.compute.Network("default", {name: "psc-network"});
 * const defaultSubnetwork = new gcp.compute.Subnetwork("default", {
 *     name: "psc-subnetwork",
 *     ipCidrRange: "10.0.0.0/16",
 *     region: "europe-west4",
 *     network: _default.id,
 * });
 * const pscSubnetwork = new gcp.compute.Subnetwork("psc_subnetwork", {
 *     name: "psc-subnetwork-nat",
 *     ipCidrRange: "10.1.0.0/16",
 *     region: "europe-west4",
 *     purpose: "PRIVATE_SERVICE_CONNECT",
 *     network: _default.id,
 * });
 * const defaultHealthCheck = new gcp.compute.HealthCheck("default", {
 *     name: "psc-healthcheck",
 *     checkIntervalSec: 1,
 *     timeoutSec: 1,
 *     tcpHealthCheck: {
 *         port: 80,
 *     },
 * });
 * const defaultRegionBackendService = new gcp.compute.RegionBackendService("default", {
 *     name: "psc-backend",
 *     region: "europe-west4",
 *     healthChecks: defaultHealthCheck.id,
 * });
 * const defaultForwardingRule = new gcp.compute.ForwardingRule("default", {
 *     name: "psc-forwarding-rule",
 *     region: "europe-west4",
 *     loadBalancingScheme: "INTERNAL",
 *     backendService: defaultRegionBackendService.id,
 *     ports: [
 *         "80",
 *         "88",
 *         "443",
 *     ],
 *     network: _default.name,
 *     subnetwork: defaultSubnetwork.name,
 * });
 * const defaultServiceAttachment = new gcp.compute.ServiceAttachment("default", {
 *     name: "psc-service-attachment",
 *     region: "europe-west4",
 *     description: "A service attachment configured with Terraform",
 *     enableProxyProtocol: false,
 *     connectionPreference: "ACCEPT_AUTOMATIC",
 *     natSubnets: [pscSubnetwork.selfLink],
 *     targetService: defaultForwardingRule.selfLink,
 * });
 * const pscNegServiceAttachment = new gcp.compute.RegionNetworkEndpointGroup("psc_neg_service_attachment", {
 *     name: "psc-neg",
 *     region: "europe-west4",
 *     networkEndpointType: "PRIVATE_SERVICE_CONNECT",
 *     pscTargetService: defaultServiceAttachment.selfLink,
 *     pscData: {
 *         producerPort: "88",
 *     },
 *     network: _default.selfLink,
 *     subnetwork: defaultSubnetwork.selfLink,
 * });
 * ```
 * ### Region Network Endpoint Group Internet Ip Port
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.compute.Network("default", {name: "network"});
 * const regionNetworkEndpointGroupInternetIpPort = new gcp.compute.RegionNetworkEndpointGroup("region_network_endpoint_group_internet_ip_port", {
 *     name: "ip-port-neg",
 *     region: "us-central1",
 *     network: _default.id,
 *     networkEndpointType: "INTERNET_IP_PORT",
 * });
 * ```
 * ### Region Network Endpoint Group Internet Fqdn Port
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.compute.Network("default", {name: "network"});
 * const regionNetworkEndpointGroupInternetFqdnPort = new gcp.compute.RegionNetworkEndpointGroup("region_network_endpoint_group_internet_fqdn_port", {
 *     name: "ip-port-neg",
 *     region: "us-central1",
 *     network: _default.id,
 *     networkEndpointType: "INTERNET_FQDN_PORT",
 * });
 * ```
 * ### Region Network Endpoint Group Portmap
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.compute.Network("default", {name: "network"});
 * const defaultSubnetwork = new gcp.compute.Subnetwork("default", {
 *     name: "subnetwork",
 *     ipCidrRange: "10.0.0.0/16",
 *     region: "us-central1",
 *     network: _default.id,
 * });
 * const regionNetworkEndpointGroupPortmap = new gcp.compute.RegionNetworkEndpointGroup("region_network_endpoint_group_portmap", {
 *     name: "portmap-neg",
 *     region: "us-central1",
 *     network: _default.id,
 *     subnetwork: defaultSubnetwork.id,
 *     networkEndpointType: "GCE_VM_IP_PORTMAP",
 * });
 * ```
 *
 * ## Import
 *
 * RegionNetworkEndpointGroup can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/regions/{{region}}/networkEndpointGroups/{{name}}`
 *
 * * `{{project}}/{{region}}/{{name}}`
 *
 * * `{{region}}/{{name}}`
 *
 * * `{{name}}`
 *
 * When using the `pulumi import` command, RegionNetworkEndpointGroup can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup default projects/{{project}}/regions/{{region}}/networkEndpointGroups/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup default {{project}}/{{region}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup default {{region}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup default {{name}}
 * ```
 */
export class RegionNetworkEndpointGroup extends pulumi.CustomResource {
    /**
     * Get an existing RegionNetworkEndpointGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RegionNetworkEndpointGroupState, opts?: pulumi.CustomResourceOptions): RegionNetworkEndpointGroup {
        return new RegionNetworkEndpointGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup';

    /**
     * Returns true if the given object is an instance of RegionNetworkEndpointGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RegionNetworkEndpointGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RegionNetworkEndpointGroup.__pulumiType;
    }

    /**
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     */
    public readonly appEngine!: pulumi.Output<outputs.compute.RegionNetworkEndpointGroupAppEngine | undefined>;
    /**
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     */
    public readonly cloudFunction!: pulumi.Output<outputs.compute.RegionNetworkEndpointGroupCloudFunction | undefined>;
    /**
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     */
    public readonly cloudRun!: pulumi.Output<outputs.compute.RegionNetworkEndpointGroupCloudRun | undefined>;
    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * This field is only used for PSC and INTERNET NEGs.
     * The URL of the network to which all network endpoints in the NEG belong. Uses
     * "default" project network if unspecified.
     */
    public readonly network!: pulumi.Output<string | undefined>;
    /**
     * Type of network endpoints in this network endpoint group. Defaults to SERVERLESS.
     * Default value is `SERVERLESS`.
     * Possible values are: `SERVERLESS`, `PRIVATE_SERVICE_CONNECT`, `INTERNET_IP_PORT`, `INTERNET_FQDN_PORT`, `GCE_VM_IP_PORTMAP`.
     */
    public readonly networkEndpointType!: pulumi.Output<string | undefined>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * This field is only used for PSC NEGs.
     * Structure is documented below.
     */
    public readonly pscData!: pulumi.Output<outputs.compute.RegionNetworkEndpointGroupPscData>;
    /**
     * This field is only used for PSC and INTERNET NEGs.
     * The target service url used to set up private service connection to
     * a Google API or a PSC Producer Service Attachment.
     */
    public readonly pscTargetService!: pulumi.Output<string | undefined>;
    /**
     * A reference to the region where the regional NEGs reside.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The URI of the created resource.
     */
    public /*out*/ readonly selfLink!: pulumi.Output<string>;
    /**
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     */
    public readonly serverlessDeployment!: pulumi.Output<outputs.compute.RegionNetworkEndpointGroupServerlessDeployment | undefined>;
    /**
     * This field is only used for PSC NEGs.
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     */
    public readonly subnetwork!: pulumi.Output<string | undefined>;

    /**
     * Create a RegionNetworkEndpointGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RegionNetworkEndpointGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RegionNetworkEndpointGroupArgs | RegionNetworkEndpointGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RegionNetworkEndpointGroupState | undefined;
            resourceInputs["appEngine"] = state ? state.appEngine : undefined;
            resourceInputs["cloudFunction"] = state ? state.cloudFunction : undefined;
            resourceInputs["cloudRun"] = state ? state.cloudRun : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["networkEndpointType"] = state ? state.networkEndpointType : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pscData"] = state ? state.pscData : undefined;
            resourceInputs["pscTargetService"] = state ? state.pscTargetService : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["selfLink"] = state ? state.selfLink : undefined;
            resourceInputs["serverlessDeployment"] = state ? state.serverlessDeployment : undefined;
            resourceInputs["subnetwork"] = state ? state.subnetwork : undefined;
        } else {
            const args = argsOrState as RegionNetworkEndpointGroupArgs | undefined;
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            resourceInputs["appEngine"] = args ? args.appEngine : undefined;
            resourceInputs["cloudFunction"] = args ? args.cloudFunction : undefined;
            resourceInputs["cloudRun"] = args ? args.cloudRun : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["networkEndpointType"] = args ? args.networkEndpointType : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["pscData"] = args ? args.pscData : undefined;
            resourceInputs["pscTargetService"] = args ? args.pscTargetService : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["serverlessDeployment"] = args ? args.serverlessDeployment : undefined;
            resourceInputs["subnetwork"] = args ? args.subnetwork : undefined;
            resourceInputs["selfLink"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RegionNetworkEndpointGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RegionNetworkEndpointGroup resources.
 */
export interface RegionNetworkEndpointGroupState {
    /**
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     */
    appEngine?: pulumi.Input<inputs.compute.RegionNetworkEndpointGroupAppEngine>;
    /**
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     */
    cloudFunction?: pulumi.Input<inputs.compute.RegionNetworkEndpointGroupCloudFunction>;
    /**
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     */
    cloudRun?: pulumi.Input<inputs.compute.RegionNetworkEndpointGroupCloudRun>;
    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     */
    name?: pulumi.Input<string>;
    /**
     * This field is only used for PSC and INTERNET NEGs.
     * The URL of the network to which all network endpoints in the NEG belong. Uses
     * "default" project network if unspecified.
     */
    network?: pulumi.Input<string>;
    /**
     * Type of network endpoints in this network endpoint group. Defaults to SERVERLESS.
     * Default value is `SERVERLESS`.
     * Possible values are: `SERVERLESS`, `PRIVATE_SERVICE_CONNECT`, `INTERNET_IP_PORT`, `INTERNET_FQDN_PORT`, `GCE_VM_IP_PORTMAP`.
     */
    networkEndpointType?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * This field is only used for PSC NEGs.
     * Structure is documented below.
     */
    pscData?: pulumi.Input<inputs.compute.RegionNetworkEndpointGroupPscData>;
    /**
     * This field is only used for PSC and INTERNET NEGs.
     * The target service url used to set up private service connection to
     * a Google API or a PSC Producer Service Attachment.
     */
    pscTargetService?: pulumi.Input<string>;
    /**
     * A reference to the region where the regional NEGs reside.
     */
    region?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    selfLink?: pulumi.Input<string>;
    /**
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     */
    serverlessDeployment?: pulumi.Input<inputs.compute.RegionNetworkEndpointGroupServerlessDeployment>;
    /**
     * This field is only used for PSC NEGs.
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     */
    subnetwork?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RegionNetworkEndpointGroup resource.
 */
export interface RegionNetworkEndpointGroupArgs {
    /**
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     */
    appEngine?: pulumi.Input<inputs.compute.RegionNetworkEndpointGroupAppEngine>;
    /**
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     */
    cloudFunction?: pulumi.Input<inputs.compute.RegionNetworkEndpointGroupCloudFunction>;
    /**
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     */
    cloudRun?: pulumi.Input<inputs.compute.RegionNetworkEndpointGroupCloudRun>;
    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     */
    name?: pulumi.Input<string>;
    /**
     * This field is only used for PSC and INTERNET NEGs.
     * The URL of the network to which all network endpoints in the NEG belong. Uses
     * "default" project network if unspecified.
     */
    network?: pulumi.Input<string>;
    /**
     * Type of network endpoints in this network endpoint group. Defaults to SERVERLESS.
     * Default value is `SERVERLESS`.
     * Possible values are: `SERVERLESS`, `PRIVATE_SERVICE_CONNECT`, `INTERNET_IP_PORT`, `INTERNET_FQDN_PORT`, `GCE_VM_IP_PORTMAP`.
     */
    networkEndpointType?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * This field is only used for PSC NEGs.
     * Structure is documented below.
     */
    pscData?: pulumi.Input<inputs.compute.RegionNetworkEndpointGroupPscData>;
    /**
     * This field is only used for PSC and INTERNET NEGs.
     * The target service url used to set up private service connection to
     * a Google API or a PSC Producer Service Attachment.
     */
    pscTargetService?: pulumi.Input<string>;
    /**
     * A reference to the region where the regional NEGs reside.
     */
    region: pulumi.Input<string>;
    /**
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     */
    serverlessDeployment?: pulumi.Input<inputs.compute.RegionNetworkEndpointGroupServerlessDeployment>;
    /**
     * This field is only used for PSC NEGs.
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     */
    subnetwork?: pulumi.Input<string>;
}
