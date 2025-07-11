// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * An Anthos cluster running on Azure.
 *
 * For more information, see:
 * * [Multicloud overview](https://cloud.google.com/kubernetes-engine/multi-cloud/docs)
 * ## Example Usage
 *
 * ### Basic_azure_cluster
 * A basic example of a containerazure azure cluster
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const versions = gcp.container.getAzureVersions({
 *     project: "my-project-name",
 *     location: "us-west1",
 * });
 * const basic = new gcp.container.AzureClient("basic", {
 *     applicationId: "12345678-1234-1234-1234-123456789111",
 *     location: "us-west1",
 *     name: "client-name",
 *     tenantId: "12345678-1234-1234-1234-123456789111",
 *     project: "my-project-name",
 * });
 * const primary = new gcp.container.AzureCluster("primary", {
 *     authorization: {
 *         adminUsers: [{
 *             username: "mmv2@google.com",
 *         }],
 *         adminGroups: [{
 *             group: "group@domain.com",
 *         }],
 *     },
 *     azureRegion: "westus2",
 *     client: pulumi.interpolate`projects/my-project-number/locations/us-west1/azureClients/${basic.name}`,
 *     controlPlane: {
 *         sshConfig: {
 *             authorizedKey: "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQC8yaayO6lnb2v+SedxUMa2c8vtIEzCzBjM3EJJsv8Vm9zUDWR7dXWKoNGARUb2mNGXASvI6mFIDXTIlkQ0poDEPpMaXR0g2cb5xT8jAAJq7fqXL3+0rcJhY/uigQ+MrT6s+ub0BFVbsmGHNrMQttXX9gtmwkeAEvj3mra9e5pkNf90qlKnZz6U0SVArxVsLx07vHPHDIYrl0OPG4zUREF52igbBPiNrHJFDQJT/4YlDMJmo/QT/A1D6n9ocemvZSzhRx15/Arjowhr+VVKSbaxzPtEfY0oIg2SrqJnnr/l3Du5qIefwh5VmCZe4xopPUaDDoOIEFriZ88sB+3zz8ib8sk8zJJQCgeP78tQvXCgS+4e5W3TUg9mxjB6KjXTyHIVhDZqhqde0OI3Fy1UuVzRUwnBaLjBnAwP5EoFQGRmDYk/rEYe7HTmovLeEBUDQocBQKT4Ripm/xJkkWY7B07K/tfo56dGUCkvyIVXKBInCh+dLK7gZapnd4UWkY0xBYcwo1geMLRq58iFTLA2j/JmpmHXp7m0l7jJii7d44uD3tTIFYThn7NlOnvhLim/YcBK07GMGIN7XwrrKZKmxXaspw6KBWVhzuw1UPxctxshYEaMLfFg/bwOw8HvMPr9VtrElpSB7oiOh91PDIPdPBgHCi7N2QgQ5l/ZDBHieSpNrQ== thomasrodgers",
 *         },
 *         subnetId: "/subscriptions/12345678-1234-1234-1234-123456789111/resourceGroups/my--dev-byo/providers/Microsoft.Network/virtualNetworks/my--dev-vnet/subnets/default",
 *         version: versions.then(versions => versions.validVersions?.[0]),
 *     },
 *     fleet: {
 *         project: "my-project-number",
 *     },
 *     location: "us-west1",
 *     name: "name",
 *     networking: {
 *         podAddressCidrBlocks: ["10.200.0.0/16"],
 *         serviceAddressCidrBlocks: ["10.32.0.0/24"],
 *         virtualNetworkId: "/subscriptions/12345678-1234-1234-1234-123456789111/resourceGroups/my--dev-byo/providers/Microsoft.Network/virtualNetworks/my--dev-vnet",
 *     },
 *     resourceGroupId: "/subscriptions/12345678-1234-1234-1234-123456789111/resourceGroups/my--dev-cluster",
 *     project: "my-project-name",
 * });
 * ```
 * ### Beta_basic_enum_azure_cluster
 * A basic example of a containerazure azure cluster with lowercase enums (beta)
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const versions = gcp.container.getAzureVersions({
 *     project: "my-project-name",
 *     location: "us-west1",
 * });
 * const basic = new gcp.container.AzureClient("basic", {
 *     applicationId: "12345678-1234-1234-1234-123456789111",
 *     location: "us-west1",
 *     name: "client-name",
 *     tenantId: "12345678-1234-1234-1234-123456789111",
 *     project: "my-project-name",
 * });
 * const primary = new gcp.container.AzureCluster("primary", {
 *     authorization: {
 *         adminUsers: [{
 *             username: "mmv2@google.com",
 *         }],
 *     },
 *     azureRegion: "westus2",
 *     client: pulumi.interpolate`projects/my-project-number/locations/us-west1/azureClients/${basic.name}`,
 *     controlPlane: {
 *         sshConfig: {
 *             authorizedKey: "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQC8yaayO6lnb2v+SedxUMa2c8vtIEzCzBjM3EJJsv8Vm9zUDWR7dXWKoNGARUb2mNGXASvI6mFIDXTIlkQ0poDEPpMaXR0g2cb5xT8jAAJq7fqXL3+0rcJhY/uigQ+MrT6s+ub0BFVbsmGHNrMQttXX9gtmwkeAEvj3mra9e5pkNf90qlKnZz6U0SVArxVsLx07vHPHDIYrl0OPG4zUREF52igbBPiNrHJFDQJT/4YlDMJmo/QT/A1D6n9ocemvZSzhRx15/Arjowhr+VVKSbaxzPtEfY0oIg2SrqJnnr/l3Du5qIefwh5VmCZe4xopPUaDDoOIEFriZ88sB+3zz8ib8sk8zJJQCgeP78tQvXCgS+4e5W3TUg9mxjB6KjXTyHIVhDZqhqde0OI3Fy1UuVzRUwnBaLjBnAwP5EoFQGRmDYk/rEYe7HTmovLeEBUDQocBQKT4Ripm/xJkkWY7B07K/tfo56dGUCkvyIVXKBInCh+dLK7gZapnd4UWkY0xBYcwo1geMLRq58iFTLA2j/JmpmHXp7m0l7jJii7d44uD3tTIFYThn7NlOnvhLim/YcBK07GMGIN7XwrrKZKmxXaspw6KBWVhzuw1UPxctxshYEaMLfFg/bwOw8HvMPr9VtrElpSB7oiOh91PDIPdPBgHCi7N2QgQ5l/ZDBHieSpNrQ== thomasrodgers",
 *         },
 *         subnetId: "/subscriptions/12345678-1234-1234-1234-123456789111/resourceGroups/my--dev-byo/providers/Microsoft.Network/virtualNetworks/my--dev-vnet/subnets/default",
 *         version: versions.then(versions => versions.validVersions?.[0]),
 *     },
 *     fleet: {
 *         project: "my-project-number",
 *     },
 *     location: "us-west1",
 *     name: "name",
 *     networking: {
 *         podAddressCidrBlocks: ["10.200.0.0/16"],
 *         serviceAddressCidrBlocks: ["10.32.0.0/24"],
 *         virtualNetworkId: "/subscriptions/12345678-1234-1234-1234-123456789111/resourceGroups/my--dev-byo/providers/Microsoft.Network/virtualNetworks/my--dev-vnet",
 *     },
 *     resourceGroupId: "/subscriptions/12345678-1234-1234-1234-123456789111/resourceGroups/my--dev-cluster",
 *     project: "my-project-name",
 *     loggingConfig: {
 *         componentConfig: {
 *             enableComponents: [
 *                 "system_components",
 *                 "workloads",
 *             ],
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Cluster can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/{{location}}/azureClusters/{{name}}`
 *
 * * `{{project}}/{{location}}/{{name}}`
 *
 * * `{{location}}/{{name}}`
 *
 * When using the `pulumi import` command, Cluster can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:container/azureCluster:AzureCluster default projects/{{project}}/locations/{{location}}/azureClusters/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:container/azureCluster:AzureCluster default {{project}}/{{location}}/{{name}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:container/azureCluster:AzureCluster default {{location}}/{{name}}
 * ```
 */
export class AzureCluster extends pulumi.CustomResource {
    /**
     * Get an existing AzureCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AzureClusterState, opts?: pulumi.CustomResourceOptions): AzureCluster {
        return new AzureCluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:container/azureCluster:AzureCluster';

    /**
     * Returns true if the given object is an instance of AzureCluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AzureCluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AzureCluster.__pulumiType;
    }

    /**
     * Optional. Annotations on the cluster. This field has the same restrictions as Kubernetes annotations. The total size of
     * all keys and values combined is limited to 256k. Keys can have 2 segments: prefix (optional) and name (required),
     * separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with
     * alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between. **Note**: This field is
     * non-authoritative, and will only manage the annotations present in your configuration. Please refer to the field
     * `effectiveAnnotations` for all of the annotations present on the resource.
     */
    public readonly annotations!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Configuration related to the cluster RBAC settings.
     */
    public readonly authorization!: pulumi.Output<outputs.container.AzureClusterAuthorization>;
    /**
     * The Azure region where the cluster runs. Each Google Cloud region supports a subset of nearby Azure regions. You can call to list all supported Azure regions within a given Google Cloud region.
     */
    public readonly azureRegion!: pulumi.Output<string>;
    /**
     * Azure authentication configuration for management of Azure resources
     */
    public readonly azureServicesAuthentication!: pulumi.Output<outputs.container.AzureClusterAzureServicesAuthentication | undefined>;
    /**
     * Name of the AzureClient. The `AzureClient` resource must reside on the same GCP project and region as the
     * `AzureCluster`. `AzureClient` names are formatted as
     * `projects/<project-number>/locations/<region>/azureClients/<client-id>`. See Resource Names
     * (https:cloud.google.com/apis/design/resource_names) for more details on Google Cloud resource names.
     */
    public readonly client!: pulumi.Output<string | undefined>;
    /**
     * Configuration related to the cluster control plane.
     */
    public readonly controlPlane!: pulumi.Output<outputs.container.AzureClusterControlPlane>;
    /**
     * Output only. The time at which this cluster was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Optional. A human readable description of this cluster. Cannot be longer than 255 UTF-8 encoded bytes.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    public /*out*/ readonly effectiveAnnotations!: pulumi.Output<{[key: string]: string}>;
    /**
     * Output only. The endpoint of the cluster's API server.
     */
    public /*out*/ readonly endpoint!: pulumi.Output<string>;
    /**
     * Allows clients to perform consistent read-modify-writes through optimistic concurrency control. May be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     */
    public /*out*/ readonly etag!: pulumi.Output<string>;
    /**
     * Fleet configuration.
     */
    public readonly fleet!: pulumi.Output<outputs.container.AzureClusterFleet>;
    /**
     * The location for the resource
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Logging configuration.
     */
    public readonly loggingConfig!: pulumi.Output<outputs.container.AzureClusterLoggingConfig>;
    /**
     * The name of this resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Cluster-wide networking configuration.
     */
    public readonly networking!: pulumi.Output<outputs.container.AzureClusterNetworking>;
    /**
     * The project for the resource
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * Output only. If set, there are currently changes in flight to the cluster.
     */
    public /*out*/ readonly reconciling!: pulumi.Output<boolean>;
    /**
     * The ARM ID of the resource group where the cluster resources are deployed. For example: `/subscriptions/*&#47;resourceGroups/*`
     */
    public readonly resourceGroupId!: pulumi.Output<string>;
    /**
     * Output only. The current state of the cluster. Possible values: STATE_UNSPECIFIED, PROVISIONING, RUNNING, RECONCILING, STOPPING, ERROR, DEGRADED
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Output only. A globally unique identifier for the cluster.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;
    /**
     * Output only. The time at which this cluster was last updated.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;
    /**
     * Output only. Workload Identity settings.
     */
    public /*out*/ readonly workloadIdentityConfigs!: pulumi.Output<outputs.container.AzureClusterWorkloadIdentityConfig[]>;

    /**
     * Create a AzureCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AzureClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AzureClusterArgs | AzureClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AzureClusterState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["authorization"] = state ? state.authorization : undefined;
            resourceInputs["azureRegion"] = state ? state.azureRegion : undefined;
            resourceInputs["azureServicesAuthentication"] = state ? state.azureServicesAuthentication : undefined;
            resourceInputs["client"] = state ? state.client : undefined;
            resourceInputs["controlPlane"] = state ? state.controlPlane : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["effectiveAnnotations"] = state ? state.effectiveAnnotations : undefined;
            resourceInputs["endpoint"] = state ? state.endpoint : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["fleet"] = state ? state.fleet : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["loggingConfig"] = state ? state.loggingConfig : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networking"] = state ? state.networking : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["reconciling"] = state ? state.reconciling : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
            resourceInputs["workloadIdentityConfigs"] = state ? state.workloadIdentityConfigs : undefined;
        } else {
            const args = argsOrState as AzureClusterArgs | undefined;
            if ((!args || args.authorization === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authorization'");
            }
            if ((!args || args.azureRegion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'azureRegion'");
            }
            if ((!args || args.controlPlane === undefined) && !opts.urn) {
                throw new Error("Missing required property 'controlPlane'");
            }
            if ((!args || args.fleet === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fleet'");
            }
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            if ((!args || args.networking === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networking'");
            }
            if ((!args || args.resourceGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupId'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["authorization"] = args ? args.authorization : undefined;
            resourceInputs["azureRegion"] = args ? args.azureRegion : undefined;
            resourceInputs["azureServicesAuthentication"] = args ? args.azureServicesAuthentication : undefined;
            resourceInputs["client"] = args ? args.client : undefined;
            resourceInputs["controlPlane"] = args ? args.controlPlane : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["fleet"] = args ? args.fleet : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["loggingConfig"] = args ? args.loggingConfig : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networking"] = args ? args.networking : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["effectiveAnnotations"] = undefined /*out*/;
            resourceInputs["endpoint"] = undefined /*out*/;
            resourceInputs["etag"] = undefined /*out*/;
            resourceInputs["reconciling"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
            resourceInputs["workloadIdentityConfigs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AzureCluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AzureCluster resources.
 */
export interface AzureClusterState {
    /**
     * Optional. Annotations on the cluster. This field has the same restrictions as Kubernetes annotations. The total size of
     * all keys and values combined is limited to 256k. Keys can have 2 segments: prefix (optional) and name (required),
     * separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with
     * alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between. **Note**: This field is
     * non-authoritative, and will only manage the annotations present in your configuration. Please refer to the field
     * `effectiveAnnotations` for all of the annotations present on the resource.
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configuration related to the cluster RBAC settings.
     */
    authorization?: pulumi.Input<inputs.container.AzureClusterAuthorization>;
    /**
     * The Azure region where the cluster runs. Each Google Cloud region supports a subset of nearby Azure regions. You can call to list all supported Azure regions within a given Google Cloud region.
     */
    azureRegion?: pulumi.Input<string>;
    /**
     * Azure authentication configuration for management of Azure resources
     */
    azureServicesAuthentication?: pulumi.Input<inputs.container.AzureClusterAzureServicesAuthentication>;
    /**
     * Name of the AzureClient. The `AzureClient` resource must reside on the same GCP project and region as the
     * `AzureCluster`. `AzureClient` names are formatted as
     * `projects/<project-number>/locations/<region>/azureClients/<client-id>`. See Resource Names
     * (https:cloud.google.com/apis/design/resource_names) for more details on Google Cloud resource names.
     */
    client?: pulumi.Input<string>;
    /**
     * Configuration related to the cluster control plane.
     */
    controlPlane?: pulumi.Input<inputs.container.AzureClusterControlPlane>;
    /**
     * Output only. The time at which this cluster was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Optional. A human readable description of this cluster. Cannot be longer than 255 UTF-8 encoded bytes.
     */
    description?: pulumi.Input<string>;
    effectiveAnnotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Output only. The endpoint of the cluster's API server.
     */
    endpoint?: pulumi.Input<string>;
    /**
     * Allows clients to perform consistent read-modify-writes through optimistic concurrency control. May be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     */
    etag?: pulumi.Input<string>;
    /**
     * Fleet configuration.
     */
    fleet?: pulumi.Input<inputs.container.AzureClusterFleet>;
    /**
     * The location for the resource
     */
    location?: pulumi.Input<string>;
    /**
     * Logging configuration.
     */
    loggingConfig?: pulumi.Input<inputs.container.AzureClusterLoggingConfig>;
    /**
     * The name of this resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Cluster-wide networking configuration.
     */
    networking?: pulumi.Input<inputs.container.AzureClusterNetworking>;
    /**
     * The project for the resource
     */
    project?: pulumi.Input<string>;
    /**
     * Output only. If set, there are currently changes in flight to the cluster.
     */
    reconciling?: pulumi.Input<boolean>;
    /**
     * The ARM ID of the resource group where the cluster resources are deployed. For example: `/subscriptions/*&#47;resourceGroups/*`
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * Output only. The current state of the cluster. Possible values: STATE_UNSPECIFIED, PROVISIONING, RUNNING, RECONCILING, STOPPING, ERROR, DEGRADED
     */
    state?: pulumi.Input<string>;
    /**
     * Output only. A globally unique identifier for the cluster.
     */
    uid?: pulumi.Input<string>;
    /**
     * Output only. The time at which this cluster was last updated.
     */
    updateTime?: pulumi.Input<string>;
    /**
     * Output only. Workload Identity settings.
     */
    workloadIdentityConfigs?: pulumi.Input<pulumi.Input<inputs.container.AzureClusterWorkloadIdentityConfig>[]>;
}

/**
 * The set of arguments for constructing a AzureCluster resource.
 */
export interface AzureClusterArgs {
    /**
     * Optional. Annotations on the cluster. This field has the same restrictions as Kubernetes annotations. The total size of
     * all keys and values combined is limited to 256k. Keys can have 2 segments: prefix (optional) and name (required),
     * separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with
     * alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between. **Note**: This field is
     * non-authoritative, and will only manage the annotations present in your configuration. Please refer to the field
     * `effectiveAnnotations` for all of the annotations present on the resource.
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configuration related to the cluster RBAC settings.
     */
    authorization: pulumi.Input<inputs.container.AzureClusterAuthorization>;
    /**
     * The Azure region where the cluster runs. Each Google Cloud region supports a subset of nearby Azure regions. You can call to list all supported Azure regions within a given Google Cloud region.
     */
    azureRegion: pulumi.Input<string>;
    /**
     * Azure authentication configuration for management of Azure resources
     */
    azureServicesAuthentication?: pulumi.Input<inputs.container.AzureClusterAzureServicesAuthentication>;
    /**
     * Name of the AzureClient. The `AzureClient` resource must reside on the same GCP project and region as the
     * `AzureCluster`. `AzureClient` names are formatted as
     * `projects/<project-number>/locations/<region>/azureClients/<client-id>`. See Resource Names
     * (https:cloud.google.com/apis/design/resource_names) for more details on Google Cloud resource names.
     */
    client?: pulumi.Input<string>;
    /**
     * Configuration related to the cluster control plane.
     */
    controlPlane: pulumi.Input<inputs.container.AzureClusterControlPlane>;
    /**
     * Optional. A human readable description of this cluster. Cannot be longer than 255 UTF-8 encoded bytes.
     */
    description?: pulumi.Input<string>;
    /**
     * Fleet configuration.
     */
    fleet: pulumi.Input<inputs.container.AzureClusterFleet>;
    /**
     * The location for the resource
     */
    location: pulumi.Input<string>;
    /**
     * Logging configuration.
     */
    loggingConfig?: pulumi.Input<inputs.container.AzureClusterLoggingConfig>;
    /**
     * The name of this resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Cluster-wide networking configuration.
     */
    networking: pulumi.Input<inputs.container.AzureClusterNetworking>;
    /**
     * The project for the resource
     */
    project?: pulumi.Input<string>;
    /**
     * The ARM ID of the resource group where the cluster resources are deployed. For example: `/subscriptions/*&#47;resourceGroups/*`
     */
    resourceGroupId: pulumi.Input<string>;
}
