// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A Dataplex task represents the work that you want Dataplex to do on a schedule. It encapsulates code, parameters, and the schedule.
 *
 * To get more information about Task, see:
 *
 * * [API documentation](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.lakes.tasks)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dataplex/docs)
 *
 * ## Example Usage
 *
 * ### Dataplex Task Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const project = gcp.organizations.getProject({});
 * const example = new gcp.dataplex.Lake("example", {
 *     name: "tf-test-lake_8493",
 *     location: "us-central1",
 *     project: "my-project-name",
 * });
 * const exampleTask = new gcp.dataplex.Task("example", {
 *     taskId: "tf-test-task_9106",
 *     location: "us-central1",
 *     lake: example.name,
 *     description: "Test Task Basic",
 *     displayName: "task-basic",
 *     labels: {
 *         count: "3",
 *     },
 *     triggerSpec: {
 *         type: "RECURRING",
 *         disabled: false,
 *         maxRetries: 3,
 *         startTime: "2023-10-02T15:01:23Z",
 *         schedule: "1 * * * *",
 *     },
 *     executionSpec: {
 *         serviceAccount: project.then(project => `${project.number}-compute@developer.gserviceaccount.com`),
 *         project: "my-project-name",
 *         maxJobExecutionLifetime: "100s",
 *         kmsKey: "234jn2kjn42k3n423",
 *     },
 *     spark: {
 *         pythonScriptFile: "gs://dataproc-examples/pyspark/hello-world/hello-world.py",
 *     },
 *     project: "my-project-name",
 * });
 * ```
 * ### Dataplex Task Spark
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * // VPC network
 * const _default = new gcp.compute.Network("default", {
 *     name: "tf-test-workstation-cluster_27169",
 *     autoCreateSubnetworks: true,
 * });
 * const project = gcp.organizations.getProject({});
 * const exampleSpark = new gcp.dataplex.Lake("example_spark", {
 *     name: "tf-test-lake_75223",
 *     location: "us-central1",
 *     project: "my-project-name",
 * });
 * const exampleSparkTask = new gcp.dataplex.Task("example_spark", {
 *     taskId: "tf-test-task_41819",
 *     location: "us-central1",
 *     lake: exampleSpark.name,
 *     triggerSpec: {
 *         type: "ON_DEMAND",
 *     },
 *     description: "task-spark-terraform",
 *     executionSpec: {
 *         serviceAccount: project.then(project => `${project.number}-compute@developer.gserviceaccount.com`),
 *         args: {
 *             TASK_ARGS: "--output_location,gs://spark-job/task-result, --output_format, json",
 *         },
 *     },
 *     spark: {
 *         infrastructureSpec: {
 *             batch: {
 *                 executorsCount: 2,
 *                 maxExecutorsCount: 100,
 *             },
 *             containerImage: {
 *                 image: "test-image",
 *                 javaJars: ["test-java-jars.jar"],
 *                 pythonPackages: ["gs://bucket-name/my/path/to/lib.tar.gz"],
 *                 properties: {
 *                     name: "wrench",
 *                     mass: "1.3kg",
 *                     count: "3",
 *                 },
 *             },
 *             vpcNetwork: {
 *                 networkTags: ["test-network-tag"],
 *                 subNetwork: _default.id,
 *             },
 *         },
 *         fileUris: ["gs://terrafrom-test/test.csv"],
 *         archiveUris: ["gs://terraform-test/test.csv"],
 *         sqlScript: "show databases",
 *     },
 *     project: "my-project-name",
 * });
 * ```
 * ### Dataplex Task Notebook
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * // VPC network
 * const _default = new gcp.compute.Network("default", {
 *     name: "tf-test-workstation-cluster_75092",
 *     autoCreateSubnetworks: true,
 * });
 * const project = gcp.organizations.getProject({});
 * const exampleNotebook = new gcp.dataplex.Lake("example_notebook", {
 *     name: "tf-test-lake_2605",
 *     location: "us-central1",
 *     project: "my-project-name",
 * });
 * const exampleNotebookTask = new gcp.dataplex.Task("example_notebook", {
 *     taskId: "tf-test-task_34535",
 *     location: "us-central1",
 *     lake: exampleNotebook.name,
 *     triggerSpec: {
 *         type: "RECURRING",
 *         schedule: "1 * * * *",
 *     },
 *     executionSpec: {
 *         serviceAccount: project.then(project => `${project.number}-compute@developer.gserviceaccount.com`),
 *         args: {
 *             TASK_ARGS: "--output_location,gs://spark-job-jars-anrajitha/task-result, --output_format, json",
 *         },
 *     },
 *     notebook: {
 *         notebook: "gs://terraform-test/test-notebook.ipynb",
 *         infrastructureSpec: {
 *             batch: {
 *                 executorsCount: 2,
 *                 maxExecutorsCount: 100,
 *             },
 *             containerImage: {
 *                 image: "test-image",
 *                 javaJars: ["test-java-jars.jar"],
 *                 pythonPackages: ["gs://bucket-name/my/path/to/lib.tar.gz"],
 *                 properties: {
 *                     name: "wrench",
 *                     mass: "1.3kg",
 *                     count: "3",
 *                 },
 *             },
 *             vpcNetwork: {
 *                 networkTags: ["test-network-tag"],
 *                 network: _default.id,
 *             },
 *         },
 *         fileUris: ["gs://terraform-test/test.csv"],
 *         archiveUris: ["gs://terraform-test/test.csv"],
 *     },
 *     project: "my-project-name",
 * });
 * ```
 *
 * ## Import
 *
 * Task can be imported using any of these accepted formats:
 *
 * * `projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}`
 *
 * * `{{project}}/{{location}}/{{lake}}/{{task_id}}`
 *
 * * `{{location}}/{{lake}}/{{task_id}}`
 *
 * When using the `pulumi import` command, Task can be imported using one of the formats above. For example:
 *
 * ```sh
 * $ pulumi import gcp:dataplex/task:Task default projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:dataplex/task:Task default {{project}}/{{location}}/{{lake}}/{{task_id}}
 * ```
 *
 * ```sh
 * $ pulumi import gcp:dataplex/task:Task default {{location}}/{{lake}}/{{task_id}}
 * ```
 */
export class Task extends pulumi.CustomResource {
    /**
     * Get an existing Task resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TaskState, opts?: pulumi.CustomResourceOptions): Task {
        return new Task(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:dataplex/task:Task';

    /**
     * Returns true if the given object is an instance of Task.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Task {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Task.__pulumiType;
    }

    /**
     * The time when the task was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * User-provided description of the task.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * User friendly display name.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Configuration for the cluster
     * Structure is documented below.
     */
    public readonly executionSpec!: pulumi.Output<outputs.dataplex.TaskExecutionSpec>;
    /**
     * Configuration for the cluster
     * Structure is documented below.
     */
    public /*out*/ readonly executionStatuses!: pulumi.Output<outputs.dataplex.TaskExecutionStatus[]>;
    /**
     * User-defined labels for the task.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The lake in which the task will be created in.
     */
    public readonly lake!: pulumi.Output<string | undefined>;
    /**
     * The location in which the task will be created in.
     */
    public readonly location!: pulumi.Output<string | undefined>;
    /**
     * (Output)
     * The relative resource name of the job, of the form: projects/{project_number}/locations/{locationId}/lakes/{lakeId}/tasks/{taskId}/jobs/{jobId}.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     */
    public readonly notebook!: pulumi.Output<outputs.dataplex.TaskNotebook | undefined>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    public /*out*/ readonly pulumiLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     */
    public readonly spark!: pulumi.Output<outputs.dataplex.TaskSpark | undefined>;
    /**
     * (Output)
     * Execution state for the job.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The task Id of the task.
     */
    public readonly taskId!: pulumi.Output<string | undefined>;
    /**
     * Configuration for the cluster
     * Structure is documented below.
     */
    public readonly triggerSpec!: pulumi.Output<outputs.dataplex.TaskTriggerSpec>;
    /**
     * (Output)
     * System generated globally unique ID for the job.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;
    /**
     * (Output)
     * Last update time of the status.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a Task resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TaskArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TaskArgs | TaskState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TaskState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["executionSpec"] = state ? state.executionSpec : undefined;
            resourceInputs["executionStatuses"] = state ? state.executionStatuses : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["lake"] = state ? state.lake : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notebook"] = state ? state.notebook : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["spark"] = state ? state.spark : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["taskId"] = state ? state.taskId : undefined;
            resourceInputs["triggerSpec"] = state ? state.triggerSpec : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as TaskArgs | undefined;
            if ((!args || args.executionSpec === undefined) && !opts.urn) {
                throw new Error("Missing required property 'executionSpec'");
            }
            if ((!args || args.triggerSpec === undefined) && !opts.urn) {
                throw new Error("Missing required property 'triggerSpec'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["executionSpec"] = args ? args.executionSpec : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["lake"] = args ? args.lake : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["notebook"] = args ? args.notebook : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["spark"] = args ? args.spark : undefined;
            resourceInputs["taskId"] = args ? args.taskId : undefined;
            resourceInputs["triggerSpec"] = args ? args.triggerSpec : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["executionStatuses"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Task.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Task resources.
 */
export interface TaskState {
    /**
     * The time when the task was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * User-provided description of the task.
     */
    description?: pulumi.Input<string>;
    /**
     * User friendly display name.
     */
    displayName?: pulumi.Input<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Configuration for the cluster
     * Structure is documented below.
     */
    executionSpec?: pulumi.Input<inputs.dataplex.TaskExecutionSpec>;
    /**
     * Configuration for the cluster
     * Structure is documented below.
     */
    executionStatuses?: pulumi.Input<pulumi.Input<inputs.dataplex.TaskExecutionStatus>[]>;
    /**
     * User-defined labels for the task.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The lake in which the task will be created in.
     */
    lake?: pulumi.Input<string>;
    /**
     * The location in which the task will be created in.
     */
    location?: pulumi.Input<string>;
    /**
     * (Output)
     * The relative resource name of the job, of the form: projects/{project_number}/locations/{locationId}/lakes/{lakeId}/tasks/{taskId}/jobs/{jobId}.
     */
    name?: pulumi.Input<string>;
    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     */
    notebook?: pulumi.Input<inputs.dataplex.TaskNotebook>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    pulumiLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     */
    spark?: pulumi.Input<inputs.dataplex.TaskSpark>;
    /**
     * (Output)
     * Execution state for the job.
     */
    state?: pulumi.Input<string>;
    /**
     * The task Id of the task.
     */
    taskId?: pulumi.Input<string>;
    /**
     * Configuration for the cluster
     * Structure is documented below.
     */
    triggerSpec?: pulumi.Input<inputs.dataplex.TaskTriggerSpec>;
    /**
     * (Output)
     * System generated globally unique ID for the job.
     */
    uid?: pulumi.Input<string>;
    /**
     * (Output)
     * Last update time of the status.
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Task resource.
 */
export interface TaskArgs {
    /**
     * User-provided description of the task.
     */
    description?: pulumi.Input<string>;
    /**
     * User friendly display name.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Configuration for the cluster
     * Structure is documented below.
     */
    executionSpec: pulumi.Input<inputs.dataplex.TaskExecutionSpec>;
    /**
     * User-defined labels for the task.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The lake in which the task will be created in.
     */
    lake?: pulumi.Input<string>;
    /**
     * The location in which the task will be created in.
     */
    location?: pulumi.Input<string>;
    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     */
    notebook?: pulumi.Input<inputs.dataplex.TaskNotebook>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     */
    spark?: pulumi.Input<inputs.dataplex.TaskSpark>;
    /**
     * The task Id of the task.
     */
    taskId?: pulumi.Input<string>;
    /**
     * Configuration for the cluster
     * Structure is documented below.
     */
    triggerSpec: pulumi.Input<inputs.dataplex.TaskTriggerSpec>;
}
