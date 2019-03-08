import * as pulumi from "@pulumi/pulumi";
/**
 * A description of the conditions under which some aspect of your system is
 * considered to be "unhealthy" and the ways to notify people or services
 * about this state.
 *
 *
 * To get more information about AlertPolicy, see:
 *
 * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.alertPolicies)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/monitoring/alerts/)
 *
 * <div class = "oics-button" style="float: right; margin: 0 0 -15px">
 *   <a href="https://console.cloud.google.com/cloudshell/open?cloudshell_git_repo=https%3A%2F%2Fgithub.com%2Fterraform-google-modules%2Fdocs-examples.git&cloudshell_working_dir=monitoring_alert_policy_basic&cloudshell_image=gcr.io%2Fgraphite-cloud-shell-images%2Fterraform%3Alatest&open_in_editor=main.tf&cloudshell_print=.%2Fmotd&cloudshell_tutorial=.%2Ftutorial.md" target="_blank">
 *     <img alt="Open in Cloud Shell" src="//gstatic.com/cloudssh/images/open-btn.svg" style="max-height: 44px; margin: 32px auto; max-width: 100%;">
 *   </a>
 * </div>
 * ## Example Usage - Monitoring Alert Policy Basic
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const alertPolicy = new gcp.monitoring.AlertPolicy("alert_policy", {
 *     combiner: "OR",
 *     conditions: [{
 *         conditionThreshold: {
 *             aggregations: [{
 *                 alignmentPeriod: "60s",
 *                 perSeriesAligner: "ALIGN_RATE",
 *             }],
 *             comparison: "COMPARISON_GT",
 *             duration: "60s",
 *             filter: "metric.type=\"compute.googleapis.com/instance/disk/write_bytes_count\" AND resource.type=\"gce_instance\"",
 *         },
 *         displayName: "test condition",
 *     }],
 *     displayName: "My Alert Policy",
 * });
 * ```
 */
export declare class AlertPolicy extends pulumi.CustomResource {
    /**
     * Get an existing AlertPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlertPolicyState, opts?: pulumi.CustomResourceOptions): AlertPolicy;
    readonly combiner: pulumi.Output<string>;
    readonly conditions: pulumi.Output<{
        conditionAbsent?: {
            aggregations?: {
                alignmentPeriod?: string;
                crossSeriesReducer?: string;
                groupByFields?: string[];
                perSeriesAligner?: string;
            }[];
            duration: string;
            filter?: string;
            trigger?: {
                count?: number;
                percent?: number;
            };
        };
        conditionThreshold?: {
            aggregations?: {
                alignmentPeriod?: string;
                crossSeriesReducer?: string;
                groupByFields?: string[];
                perSeriesAligner?: string;
            }[];
            comparison: string;
            denominatorAggregations?: {
                alignmentPeriod?: string;
                crossSeriesReducer?: string;
                groupByFields?: string[];
                perSeriesAligner?: string;
            }[];
            denominatorFilter?: string;
            duration: string;
            filter?: string;
            thresholdValue?: number;
            trigger?: {
                count?: number;
                percent?: number;
            };
        };
        displayName: string;
        name: string;
    }[]>;
    readonly creationRecord: pulumi.Output<{
        mutateTime: string;
        mutatedBy: string;
    }>;
    readonly displayName: pulumi.Output<string>;
    readonly documentation: pulumi.Output<{
        content?: string;
        mimeType?: string;
    } | undefined>;
    readonly enabled: pulumi.Output<boolean | undefined>;
    readonly labels: pulumi.Output<string[] | undefined>;
    readonly name: pulumi.Output<string>;
    readonly notificationChannels: pulumi.Output<string[] | undefined>;
    readonly project: pulumi.Output<string>;
    /**
     * Create a AlertPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlertPolicyArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering AlertPolicy resources.
 */
export interface AlertPolicyState {
    readonly combiner?: pulumi.Input<string>;
    readonly conditions?: pulumi.Input<pulumi.Input<{
        conditionAbsent?: pulumi.Input<{
            aggregations?: pulumi.Input<pulumi.Input<{
                alignmentPeriod?: pulumi.Input<string>;
                crossSeriesReducer?: pulumi.Input<string>;
                groupByFields?: pulumi.Input<pulumi.Input<string>[]>;
                perSeriesAligner?: pulumi.Input<string>;
            }>[]>;
            duration: pulumi.Input<string>;
            filter?: pulumi.Input<string>;
            trigger?: pulumi.Input<{
                count?: pulumi.Input<number>;
                percent?: pulumi.Input<number>;
            }>;
        }>;
        conditionThreshold?: pulumi.Input<{
            aggregations?: pulumi.Input<pulumi.Input<{
                alignmentPeriod?: pulumi.Input<string>;
                crossSeriesReducer?: pulumi.Input<string>;
                groupByFields?: pulumi.Input<pulumi.Input<string>[]>;
                perSeriesAligner?: pulumi.Input<string>;
            }>[]>;
            comparison: pulumi.Input<string>;
            denominatorAggregations?: pulumi.Input<pulumi.Input<{
                alignmentPeriod?: pulumi.Input<string>;
                crossSeriesReducer?: pulumi.Input<string>;
                groupByFields?: pulumi.Input<pulumi.Input<string>[]>;
                perSeriesAligner?: pulumi.Input<string>;
            }>[]>;
            denominatorFilter?: pulumi.Input<string>;
            duration: pulumi.Input<string>;
            filter?: pulumi.Input<string>;
            thresholdValue?: pulumi.Input<number>;
            trigger?: pulumi.Input<{
                count?: pulumi.Input<number>;
                percent?: pulumi.Input<number>;
            }>;
        }>;
        displayName: pulumi.Input<string>;
        name?: pulumi.Input<string>;
    }>[]>;
    readonly creationRecord?: pulumi.Input<{
        mutateTime?: pulumi.Input<string>;
        mutatedBy?: pulumi.Input<string>;
    }>;
    readonly displayName?: pulumi.Input<string>;
    readonly documentation?: pulumi.Input<{
        content?: pulumi.Input<string>;
        mimeType?: pulumi.Input<string>;
    }>;
    readonly enabled?: pulumi.Input<boolean>;
    readonly labels?: pulumi.Input<pulumi.Input<string>[]>;
    readonly name?: pulumi.Input<string>;
    readonly notificationChannels?: pulumi.Input<pulumi.Input<string>[]>;
    readonly project?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a AlertPolicy resource.
 */
export interface AlertPolicyArgs {
    readonly combiner: pulumi.Input<string>;
    readonly conditions: pulumi.Input<pulumi.Input<{
        conditionAbsent?: pulumi.Input<{
            aggregations?: pulumi.Input<pulumi.Input<{
                alignmentPeriod?: pulumi.Input<string>;
                crossSeriesReducer?: pulumi.Input<string>;
                groupByFields?: pulumi.Input<pulumi.Input<string>[]>;
                perSeriesAligner?: pulumi.Input<string>;
            }>[]>;
            duration: pulumi.Input<string>;
            filter?: pulumi.Input<string>;
            trigger?: pulumi.Input<{
                count?: pulumi.Input<number>;
                percent?: pulumi.Input<number>;
            }>;
        }>;
        conditionThreshold?: pulumi.Input<{
            aggregations?: pulumi.Input<pulumi.Input<{
                alignmentPeriod?: pulumi.Input<string>;
                crossSeriesReducer?: pulumi.Input<string>;
                groupByFields?: pulumi.Input<pulumi.Input<string>[]>;
                perSeriesAligner?: pulumi.Input<string>;
            }>[]>;
            comparison: pulumi.Input<string>;
            denominatorAggregations?: pulumi.Input<pulumi.Input<{
                alignmentPeriod?: pulumi.Input<string>;
                crossSeriesReducer?: pulumi.Input<string>;
                groupByFields?: pulumi.Input<pulumi.Input<string>[]>;
                perSeriesAligner?: pulumi.Input<string>;
            }>[]>;
            denominatorFilter?: pulumi.Input<string>;
            duration: pulumi.Input<string>;
            filter?: pulumi.Input<string>;
            thresholdValue?: pulumi.Input<number>;
            trigger?: pulumi.Input<{
                count?: pulumi.Input<number>;
                percent?: pulumi.Input<number>;
            }>;
        }>;
        displayName: pulumi.Input<string>;
        name?: pulumi.Input<string>;
    }>[]>;
    readonly displayName: pulumi.Input<string>;
    readonly documentation?: pulumi.Input<{
        content?: pulumi.Input<string>;
        mimeType?: pulumi.Input<string>;
    }>;
    readonly enabled?: pulumi.Input<boolean>;
    readonly labels?: pulumi.Input<pulumi.Input<string>[]>;
    readonly notificationChannels?: pulumi.Input<pulumi.Input<string>[]>;
    readonly project?: pulumi.Input<string>;
}
