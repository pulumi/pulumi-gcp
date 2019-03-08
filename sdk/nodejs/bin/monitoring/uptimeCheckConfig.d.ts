import * as pulumi from "@pulumi/pulumi";
/**
 * This message configures which resources and services to monitor for availability.
 *
 *
 * To get more information about UptimeCheckConfig, see:
 *
 * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.uptimeCheckConfigs)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/monitoring/uptime-checks/)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=uptime_check_config_http&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Uptime Check Config Http
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const http = new gcp.monitoring.UptimeCheckConfig("http", {
 *     contentMatchers: [{
 *         content: "example",
 *     }],
 *     displayName: "http-uptime-check",
 *     httpCheck: {
 *         path: "/some-path",
 *         port: 8010,
 *     },
 *     monitoredResource: {
 *         labels: {
 *             host: "192.168.1.1",
 *             project_id: "example",
 *         },
 *         type: "uptime_url",
 *     },
 *     timeout: "60s",
 * });
 * ```
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=uptime_check_tcp&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Uptime Check Tcp
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const check = new gcp.monitoring.Group("check", {
 *     displayName: "uptime-check-group",
 *     filter: "resource.metadata.name=has_substring(\"foo\")",
 * });
 * const tcpGroup = new gcp.monitoring.UptimeCheckConfig("tcp_group", {
 *     displayName: "tcp-uptime-check",
 *     resourceGroup: {
 *         groupId: check.name,
 *         resourceType: "INSTANCE",
 *     },
 *     tcpCheck: {
 *         port: 888,
 *     },
 *     timeout: "60s",
 * });
 * ```
 */
export declare class UptimeCheckConfig extends pulumi.CustomResource {
    /**
     * Get an existing UptimeCheckConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UptimeCheckConfigState, opts?: pulumi.CustomResourceOptions): UptimeCheckConfig;
    readonly contentMatchers: pulumi.Output<{
        content?: string;
    }[] | undefined>;
    readonly displayName: pulumi.Output<string>;
    readonly httpCheck: pulumi.Output<{
        authInfo?: {
            password?: string;
            username?: string;
        };
        headers?: {
            [key: string]: string;
        };
        maskHeaders?: boolean;
        path?: string;
        port: number;
        useSsl?: boolean;
    } | undefined>;
    readonly internalCheckers: pulumi.Output<{
        displayName?: string;
        gcpZone?: string;
        name?: string;
        network?: string;
        peerProjectId?: string;
    }[] | undefined>;
    readonly isInternal: pulumi.Output<boolean | undefined>;
    readonly monitoredResource: pulumi.Output<{
        labels: {
            [key: string]: string;
        };
        type: string;
    } | undefined>;
    readonly name: pulumi.Output<string>;
    readonly period: pulumi.Output<string | undefined>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly resourceGroup: pulumi.Output<{
        groupId?: string;
        resourceType?: string;
    } | undefined>;
    readonly selectedRegions: pulumi.Output<string[] | undefined>;
    readonly tcpCheck: pulumi.Output<{
        port: number;
    } | undefined>;
    readonly timeout: pulumi.Output<string>;
    /**
     * Create a UptimeCheckConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UptimeCheckConfigArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering UptimeCheckConfig resources.
 */
export interface UptimeCheckConfigState {
    readonly contentMatchers?: pulumi.Input<pulumi.Input<{
        content?: pulumi.Input<string>;
    }>[]>;
    readonly displayName?: pulumi.Input<string>;
    readonly httpCheck?: pulumi.Input<{
        authInfo?: pulumi.Input<{
            password?: pulumi.Input<string>;
            username?: pulumi.Input<string>;
        }>;
        headers?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        maskHeaders?: pulumi.Input<boolean>;
        path?: pulumi.Input<string>;
        port?: pulumi.Input<number>;
        useSsl?: pulumi.Input<boolean>;
    }>;
    readonly internalCheckers?: pulumi.Input<pulumi.Input<{
        displayName?: pulumi.Input<string>;
        gcpZone?: pulumi.Input<string>;
        name?: pulumi.Input<string>;
        network?: pulumi.Input<string>;
        peerProjectId?: pulumi.Input<string>;
    }>[]>;
    readonly isInternal?: pulumi.Input<boolean>;
    readonly monitoredResource?: pulumi.Input<{
        labels: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        type: pulumi.Input<string>;
    }>;
    readonly name?: pulumi.Input<string>;
    readonly period?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly resourceGroup?: pulumi.Input<{
        groupId?: pulumi.Input<string>;
        resourceType?: pulumi.Input<string>;
    }>;
    readonly selectedRegions?: pulumi.Input<pulumi.Input<string>[]>;
    readonly tcpCheck?: pulumi.Input<{
        port: pulumi.Input<number>;
    }>;
    readonly timeout?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a UptimeCheckConfig resource.
 */
export interface UptimeCheckConfigArgs {
    readonly contentMatchers?: pulumi.Input<pulumi.Input<{
        content?: pulumi.Input<string>;
    }>[]>;
    readonly displayName: pulumi.Input<string>;
    readonly httpCheck?: pulumi.Input<{
        authInfo?: pulumi.Input<{
            password?: pulumi.Input<string>;
            username?: pulumi.Input<string>;
        }>;
        headers?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        maskHeaders?: pulumi.Input<boolean>;
        path?: pulumi.Input<string>;
        port?: pulumi.Input<number>;
        useSsl?: pulumi.Input<boolean>;
    }>;
    readonly internalCheckers?: pulumi.Input<pulumi.Input<{
        displayName?: pulumi.Input<string>;
        gcpZone?: pulumi.Input<string>;
        name?: pulumi.Input<string>;
        network?: pulumi.Input<string>;
        peerProjectId?: pulumi.Input<string>;
    }>[]>;
    readonly isInternal?: pulumi.Input<boolean>;
    readonly monitoredResource?: pulumi.Input<{
        labels: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        type: pulumi.Input<string>;
    }>;
    readonly period?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly resourceGroup?: pulumi.Input<{
        groupId?: pulumi.Input<string>;
        resourceType?: pulumi.Input<string>;
    }>;
    readonly selectedRegions?: pulumi.Input<pulumi.Input<string>[]>;
    readonly tcpCheck?: pulumi.Input<{
        port: pulumi.Input<number>;
    }>;
    readonly timeout: pulumi.Input<string>;
}
