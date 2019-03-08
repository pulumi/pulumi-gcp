import * as pulumi from "@pulumi/pulumi";
/**
 * Manages a job resource within a Dataproc cluster within GCE. For more information see
 * [the official dataproc documentation](https://cloud.google.com/dataproc/).
 *
 * !> **Note:** This resource does not support 'update' and changing any attributes will cause the resource to be recreated.
 *
 * ## Example usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const mycluster = new gcp.dataproc.Cluster("mycluster", {
 *     region: "us-central1",
 * });
 * // Submit an example pyspark job to a dataproc cluster
 * const pyspark = new gcp.dataproc.Job("pyspark", {
 *     forceDelete: true,
 *     placement: {
 *         clusterName: mycluster.name,
 *     },
 *     pysparkConfig: {
 *         mainPythonFileUri: "gs://dataproc-examples-2f10d78d114f6aaec76462e3c310f31f/src/pyspark/hello-world/hello-world.py",
 *         properties: {
 *             "spark.logConf": "true",
 *         },
 *     },
 *     region: mycluster.region,
 * });
 * // Submit an example spark job to a dataproc cluster
 * const spark = new gcp.dataproc.Job("spark", {
 *     forceDelete: true,
 *     placement: {
 *         clusterName: mycluster.name,
 *     },
 *     region: mycluster.region,
 *     sparkConfig: {
 *         args: ["1000"],
 *         jarFileUris: ["file:///usr/lib/spark/examples/jars/spark-examples.jar"],
 *         loggingConfig: {
 *             driverLogLevels: {
 *                 root: "INFO",
 *             },
 *         },
 *         mainClass: "org.apache.spark.examples.SparkPi",
 *         properties: {
 *             "spark.logConf": "true",
 *         },
 *     },
 * });
 *
 * export const pysparkStatus = pyspark.status.apply(status => status.state);
 * // Check out current state of the jobs
 * export const sparkStatus = spark.status.apply(status => status.state);
 * ```
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
    /**
     * If present, the location of miscellaneous control files which may be used as part of job setup and handling. If not present, control files may be placed in the same location as driver_output_uri.
     */
    readonly driverControlsFilesUri: pulumi.Output<string>;
    /**
     * A URI pointing to the location of the stdout of the job's driver program.
     */
    readonly driverOutputResourceUri: pulumi.Output<string>;
    /**
     * By default, you can only delete inactive jobs within
     * Dataproc. Setting this to true, and calling destroy, will ensure that the
     * job is first cancelled before issuing the delete.
     */
    readonly forceDelete: pulumi.Output<boolean | undefined>;
    readonly hadoopConfig: pulumi.Output<{
        archiveUris?: string[];
        args?: string[];
        fileUris?: string[];
        jarFileUris?: string[];
        loggingConfig: {
            driverLogLevels?: {
                [key: string]: string;
            };
        };
        mainClass?: string;
        mainJarFileUri?: string;
        properties?: {
            [key: string]: string;
        };
    } | undefined>;
    readonly hiveConfig: pulumi.Output<{
        continueOnFailure?: boolean;
        jarFileUris?: string[];
        properties?: {
            [key: string]: string;
        };
        queryFileUri?: string;
        queryLists?: string[];
        scriptVariables?: {
            [key: string]: string;
        };
    } | undefined>;
    /**
     * The list of labels (key/value pairs) to add to the job.
     */
    readonly labels: pulumi.Output<{
        [key: string]: string;
    } | undefined>;
    readonly pigConfig: pulumi.Output<{
        continueOnFailure?: boolean;
        jarFileUris?: string[];
        loggingConfig: {
            driverLogLevels?: {
                [key: string]: string;
            };
        };
        properties?: {
            [key: string]: string;
        };
        queryFileUri?: string;
        queryLists?: string[];
        scriptVariables?: {
            [key: string]: string;
        };
    } | undefined>;
    readonly placement: pulumi.Output<{
        clusterName: string;
        clusterUuid: string;
    }>;
    /**
     * The project in which the `cluster` can be found and jobs
     * subsequently run against. If it is not provided, the provider project is used.
     */
    readonly project: pulumi.Output<string>;
    readonly pysparkConfig: pulumi.Output<{
        archiveUris?: string[];
        args?: string[];
        fileUris?: string[];
        jarFileUris?: string[];
        loggingConfig: {
            driverLogLevels?: {
                [key: string]: string;
            };
        };
        mainPythonFileUri: string;
        properties?: {
            [key: string]: string;
        };
        pythonFileUris?: string[];
    } | undefined>;
    readonly reference: pulumi.Output<{
        jobId: string;
    }>;
    /**
     * The Cloud Dataproc region. This essentially determines which clusters are available
     * for this job to be submitted to. If not specified, defaults to `global`.
     */
    readonly region: pulumi.Output<string | undefined>;
    /**
     * Optional. Job scheduling configuration.
     */
    readonly scheduling: pulumi.Output<{
        maxFailuresPerHour?: number;
    } | undefined>;
    readonly sparkConfig: pulumi.Output<{
        archiveUris?: string[];
        args?: string[];
        fileUris?: string[];
        jarFileUris?: string[];
        loggingConfig: {
            driverLogLevels?: {
                [key: string]: string;
            };
        };
        mainClass?: string;
        mainJarFileUri?: string;
        properties?: {
            [key: string]: string;
        };
    } | undefined>;
    readonly sparksqlConfig: pulumi.Output<{
        jarFileUris?: string[];
        loggingConfig: {
            driverLogLevels?: {
                [key: string]: string;
            };
        };
        properties?: {
            [key: string]: string;
        };
        queryFileUri?: string;
        queryLists?: string[];
        scriptVariables?: {
            [key: string]: string;
        };
    } | undefined>;
    readonly status: pulumi.Output<{
        details: string;
        state: string;
        stateStartTime: string;
        substate: string;
    }>;
    /**
     * Create a Job resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: JobArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Job resources.
 */
export interface JobState {
    /**
     * If present, the location of miscellaneous control files which may be used as part of job setup and handling. If not present, control files may be placed in the same location as driver_output_uri.
     */
    readonly driverControlsFilesUri?: pulumi.Input<string>;
    /**
     * A URI pointing to the location of the stdout of the job's driver program.
     */
    readonly driverOutputResourceUri?: pulumi.Input<string>;
    /**
     * By default, you can only delete inactive jobs within
     * Dataproc. Setting this to true, and calling destroy, will ensure that the
     * job is first cancelled before issuing the delete.
     */
    readonly forceDelete?: pulumi.Input<boolean>;
    readonly hadoopConfig?: pulumi.Input<{
        archiveUris?: pulumi.Input<pulumi.Input<string>[]>;
        args?: pulumi.Input<pulumi.Input<string>[]>;
        fileUris?: pulumi.Input<pulumi.Input<string>[]>;
        jarFileUris?: pulumi.Input<pulumi.Input<string>[]>;
        loggingConfig?: pulumi.Input<{
            driverLogLevels?: pulumi.Input<{
                [key: string]: pulumi.Input<string>;
            }>;
        }>;
        mainClass?: pulumi.Input<string>;
        mainJarFileUri?: pulumi.Input<string>;
        properties?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
    }>;
    readonly hiveConfig?: pulumi.Input<{
        continueOnFailure?: pulumi.Input<boolean>;
        jarFileUris?: pulumi.Input<pulumi.Input<string>[]>;
        properties?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        queryFileUri?: pulumi.Input<string>;
        queryLists?: pulumi.Input<pulumi.Input<string>[]>;
        scriptVariables?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
    }>;
    /**
     * The list of labels (key/value pairs) to add to the job.
     */
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly pigConfig?: pulumi.Input<{
        continueOnFailure?: pulumi.Input<boolean>;
        jarFileUris?: pulumi.Input<pulumi.Input<string>[]>;
        loggingConfig?: pulumi.Input<{
            driverLogLevels?: pulumi.Input<{
                [key: string]: pulumi.Input<string>;
            }>;
        }>;
        properties?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        queryFileUri?: pulumi.Input<string>;
        queryLists?: pulumi.Input<pulumi.Input<string>[]>;
        scriptVariables?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
    }>;
    readonly placement?: pulumi.Input<{
        clusterName: pulumi.Input<string>;
        clusterUuid?: pulumi.Input<string>;
    }>;
    /**
     * The project in which the `cluster` can be found and jobs
     * subsequently run against. If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly pysparkConfig?: pulumi.Input<{
        archiveUris?: pulumi.Input<pulumi.Input<string>[]>;
        args?: pulumi.Input<pulumi.Input<string>[]>;
        fileUris?: pulumi.Input<pulumi.Input<string>[]>;
        jarFileUris?: pulumi.Input<pulumi.Input<string>[]>;
        loggingConfig?: pulumi.Input<{
            driverLogLevels?: pulumi.Input<{
                [key: string]: pulumi.Input<string>;
            }>;
        }>;
        mainPythonFileUri: pulumi.Input<string>;
        properties?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        pythonFileUris?: pulumi.Input<pulumi.Input<string>[]>;
    }>;
    readonly reference?: pulumi.Input<{
        jobId?: pulumi.Input<string>;
    }>;
    /**
     * The Cloud Dataproc region. This essentially determines which clusters are available
     * for this job to be submitted to. If not specified, defaults to `global`.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * Optional. Job scheduling configuration.
     */
    readonly scheduling?: pulumi.Input<{
        maxFailuresPerHour?: pulumi.Input<number>;
    }>;
    readonly sparkConfig?: pulumi.Input<{
        archiveUris?: pulumi.Input<pulumi.Input<string>[]>;
        args?: pulumi.Input<pulumi.Input<string>[]>;
        fileUris?: pulumi.Input<pulumi.Input<string>[]>;
        jarFileUris?: pulumi.Input<pulumi.Input<string>[]>;
        loggingConfig?: pulumi.Input<{
            driverLogLevels?: pulumi.Input<{
                [key: string]: pulumi.Input<string>;
            }>;
        }>;
        mainClass?: pulumi.Input<string>;
        mainJarFileUri?: pulumi.Input<string>;
        properties?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
    }>;
    readonly sparksqlConfig?: pulumi.Input<{
        jarFileUris?: pulumi.Input<pulumi.Input<string>[]>;
        loggingConfig?: pulumi.Input<{
            driverLogLevels?: pulumi.Input<{
                [key: string]: pulumi.Input<string>;
            }>;
        }>;
        properties?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        queryFileUri?: pulumi.Input<string>;
        queryLists?: pulumi.Input<pulumi.Input<string>[]>;
        scriptVariables?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
    }>;
    readonly status?: pulumi.Input<{
        details?: pulumi.Input<string>;
        state?: pulumi.Input<string>;
        stateStartTime?: pulumi.Input<string>;
        substate?: pulumi.Input<string>;
    }>;
}
/**
 * The set of arguments for constructing a Job resource.
 */
export interface JobArgs {
    /**
     * By default, you can only delete inactive jobs within
     * Dataproc. Setting this to true, and calling destroy, will ensure that the
     * job is first cancelled before issuing the delete.
     */
    readonly forceDelete?: pulumi.Input<boolean>;
    readonly hadoopConfig?: pulumi.Input<{
        archiveUris?: pulumi.Input<pulumi.Input<string>[]>;
        args?: pulumi.Input<pulumi.Input<string>[]>;
        fileUris?: pulumi.Input<pulumi.Input<string>[]>;
        jarFileUris?: pulumi.Input<pulumi.Input<string>[]>;
        loggingConfig?: pulumi.Input<{
            driverLogLevels?: pulumi.Input<{
                [key: string]: pulumi.Input<string>;
            }>;
        }>;
        mainClass?: pulumi.Input<string>;
        mainJarFileUri?: pulumi.Input<string>;
        properties?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
    }>;
    readonly hiveConfig?: pulumi.Input<{
        continueOnFailure?: pulumi.Input<boolean>;
        jarFileUris?: pulumi.Input<pulumi.Input<string>[]>;
        properties?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        queryFileUri?: pulumi.Input<string>;
        queryLists?: pulumi.Input<pulumi.Input<string>[]>;
        scriptVariables?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
    }>;
    /**
     * The list of labels (key/value pairs) to add to the job.
     */
    readonly labels?: pulumi.Input<{
        [key: string]: pulumi.Input<string>;
    }>;
    readonly pigConfig?: pulumi.Input<{
        continueOnFailure?: pulumi.Input<boolean>;
        jarFileUris?: pulumi.Input<pulumi.Input<string>[]>;
        loggingConfig?: pulumi.Input<{
            driverLogLevels?: pulumi.Input<{
                [key: string]: pulumi.Input<string>;
            }>;
        }>;
        properties?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        queryFileUri?: pulumi.Input<string>;
        queryLists?: pulumi.Input<pulumi.Input<string>[]>;
        scriptVariables?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
    }>;
    readonly placement: pulumi.Input<{
        clusterName: pulumi.Input<string>;
        clusterUuid?: pulumi.Input<string>;
    }>;
    /**
     * The project in which the `cluster` can be found and jobs
     * subsequently run against. If it is not provided, the provider project is used.
     */
    readonly project?: pulumi.Input<string>;
    readonly pysparkConfig?: pulumi.Input<{
        archiveUris?: pulumi.Input<pulumi.Input<string>[]>;
        args?: pulumi.Input<pulumi.Input<string>[]>;
        fileUris?: pulumi.Input<pulumi.Input<string>[]>;
        jarFileUris?: pulumi.Input<pulumi.Input<string>[]>;
        loggingConfig?: pulumi.Input<{
            driverLogLevels?: pulumi.Input<{
                [key: string]: pulumi.Input<string>;
            }>;
        }>;
        mainPythonFileUri: pulumi.Input<string>;
        properties?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        pythonFileUris?: pulumi.Input<pulumi.Input<string>[]>;
    }>;
    readonly reference?: pulumi.Input<{
        jobId?: pulumi.Input<string>;
    }>;
    /**
     * The Cloud Dataproc region. This essentially determines which clusters are available
     * for this job to be submitted to. If not specified, defaults to `global`.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * Optional. Job scheduling configuration.
     */
    readonly scheduling?: pulumi.Input<{
        maxFailuresPerHour?: pulumi.Input<number>;
    }>;
    readonly sparkConfig?: pulumi.Input<{
        archiveUris?: pulumi.Input<pulumi.Input<string>[]>;
        args?: pulumi.Input<pulumi.Input<string>[]>;
        fileUris?: pulumi.Input<pulumi.Input<string>[]>;
        jarFileUris?: pulumi.Input<pulumi.Input<string>[]>;
        loggingConfig?: pulumi.Input<{
            driverLogLevels?: pulumi.Input<{
                [key: string]: pulumi.Input<string>;
            }>;
        }>;
        mainClass?: pulumi.Input<string>;
        mainJarFileUri?: pulumi.Input<string>;
        properties?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
    }>;
    readonly sparksqlConfig?: pulumi.Input<{
        jarFileUris?: pulumi.Input<pulumi.Input<string>[]>;
        loggingConfig?: pulumi.Input<{
            driverLogLevels?: pulumi.Input<{
                [key: string]: pulumi.Input<string>;
            }>;
        }>;
        properties?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
        queryFileUri?: pulumi.Input<string>;
        queryLists?: pulumi.Input<pulumi.Input<string>[]>;
        scriptVariables?: pulumi.Input<{
            [key: string]: pulumi.Input<string>;
        }>;
    }>;
}
