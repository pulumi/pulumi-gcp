import * as pulumi from "@pulumi/pulumi";
/**
 * A scheduled job that can publish a pubsub message or a http request
 * every X interval of time, using crontab format string
 *
 * > **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
 * See [Provider Versions](https://terraform.io/docs/providers/google/provider_versions.html) for more details on beta resources.
 *
 * To get more information about Job, see:
 *
 * * [API documentation](https://cloud.google.com/scheduler/docs/reference/rest/)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/scheduler/)
 */
export declare class Job extends pulumi.CustomResource {
    /**
     * Get an existing Job resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: JobState, opts?: pulumi.CustomResourceOptions): Job;
    readonly appEngineHttpTarget: pulumi.Output<{
        appEngineRouting?: {
            instance?: string;
            service?: string;
            version?: string;
        };
        body?: string;
        headers?: {
            [key: string]: string;
        };
        httpMethod?: string;
        relativeUri: string;
    } | undefined>;
    readonly description: pulumi.Output<string | undefined>;
    readonly httpTarget: pulumi.Output<{
        body?: string;
        headers?: {
            [key: string]: string;
        };
        httpMethod?: string;
        uri: string;
    } | undefined>;
    readonly name: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly pubsubTarget: pulumi.Output<{
        attributes?: {
            [key: string]: string;
        };
        data?: string;
        topicName: string;
    } | undefined>;
    readonly region: pulumi.Output<string>;
    readonly retryConfig: pulumi.Output<{
        maxBackoffDuration?: string;
        maxDoublings?: number;
        maxRetryDuration?: string;
        minBackoffDuration?: string;
        retryCount?: number;
    } | undefined>;
    readonly schedule: pulumi.Output<string | undefined>;
    readonly timeZone: pulumi.Output<string | undefined>;
    /**
     * Create a Job resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: JobArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Job resources.
 */
export interface JobState {
    readonly appEngineHttpTarget?: pulumi.Input<{
        appEngineRouting?: pulumi.Input<{
            instance?: pulumi.Input<string>;
            service?: pulumi.Input<string>;
            version?: pulumi.Input<string>;
        }>;
        body?: pulumi.Input<string>;
        headers?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        httpMethod?: pulumi.Input<string>;
        relativeUri: pulumi.Input<string>;
    }>;
    readonly description?: pulumi.Input<string>;
    readonly httpTarget?: pulumi.Input<{
        body?: pulumi.Input<string>;
        headers?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        httpMethod?: pulumi.Input<string>;
        uri: pulumi.Input<string>;
    }>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly pubsubTarget?: pulumi.Input<{
        attributes?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        data?: pulumi.Input<string>;
        topicName: pulumi.Input<string>;
    }>;
    readonly region?: pulumi.Input<string>;
    readonly retryConfig?: pulumi.Input<{
        maxBackoffDuration?: pulumi.Input<string>;
        maxDoublings?: pulumi.Input<number>;
        maxRetryDuration?: pulumi.Input<string>;
        minBackoffDuration?: pulumi.Input<string>;
        retryCount?: pulumi.Input<number>;
    }>;
    readonly schedule?: pulumi.Input<string>;
    readonly timeZone?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Job resource.
 */
export interface JobArgs {
    readonly appEngineHttpTarget?: pulumi.Input<{
        appEngineRouting?: pulumi.Input<{
            instance?: pulumi.Input<string>;
            service?: pulumi.Input<string>;
            version?: pulumi.Input<string>;
        }>;
        body?: pulumi.Input<string>;
        headers?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        httpMethod?: pulumi.Input<string>;
        relativeUri: pulumi.Input<string>;
    }>;
    readonly description?: pulumi.Input<string>;
    readonly httpTarget?: pulumi.Input<{
        body?: pulumi.Input<string>;
        headers?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        httpMethod?: pulumi.Input<string>;
        uri: pulumi.Input<string>;
    }>;
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly pubsubTarget?: pulumi.Input<{
        attributes?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        data?: pulumi.Input<string>;
        topicName: pulumi.Input<string>;
    }>;
    readonly region?: pulumi.Input<string>;
    readonly retryConfig?: pulumi.Input<{
        maxBackoffDuration?: pulumi.Input<string>;
        maxDoublings?: pulumi.Input<number>;
        maxRetryDuration?: pulumi.Input<string>;
        minBackoffDuration?: pulumi.Input<string>;
        retryCount?: pulumi.Input<number>;
    }>;
    readonly schedule?: pulumi.Input<string>;
    readonly timeZone?: pulumi.Input<string>;
}
