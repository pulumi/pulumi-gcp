// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataflow
{
    /// <summary>
    /// Creates a job on Dataflow, which is an implementation of Apache Beam running on Google Compute Engine. For more information see
    /// the official documentation for
    /// [Beam](https://beam.apache.org) and [Dataflow](https://cloud.google.com/dataflow/).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var bigDataJob = new Gcp.Dataflow.Job("big_data_job", new()
    ///     {
    ///         Name = "dataflow-job",
    ///         TemplateGcsPath = "gs://my-bucket/templates/template_file",
    ///         TempGcsLocation = "gs://my-bucket/tmp_dir",
    ///         Parameters = 
    ///         {
    ///             { "foo", "bar" },
    ///             { "baz", "qux" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Streaming Job
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var topic = new Gcp.PubSub.Topic("topic", new()
    ///     {
    ///         Name = "dataflow-job1",
    ///     });
    /// 
    ///     var bucket1 = new Gcp.Storage.Bucket("bucket1", new()
    ///     {
    ///         Name = "tf-test-bucket1",
    ///         Location = "US",
    ///         ForceDestroy = true,
    ///     });
    /// 
    ///     var bucket2 = new Gcp.Storage.Bucket("bucket2", new()
    ///     {
    ///         Name = "tf-test-bucket2",
    ///         Location = "US",
    ///         ForceDestroy = true,
    ///     });
    /// 
    ///     var pubsubStream = new Gcp.Dataflow.Job("pubsub_stream", new()
    ///     {
    ///         Name = "tf-test-dataflow-job1",
    ///         TemplateGcsPath = "gs://my-bucket/templates/template_file",
    ///         TempGcsLocation = "gs://my-bucket/tmp_dir",
    ///         EnableStreamingEngine = true,
    ///         Parameters = 
    ///         {
    ///             { "inputFilePattern", bucket1.Url.Apply(url =&gt; $"{url}/*.json") },
    ///             { "outputTopic", topic.Id },
    ///         },
    ///         TransformNameMapping = 
    ///         {
    ///             { "name", "test_job" },
    ///             { "env", "test" },
    ///         },
    ///         OnDelete = "cancel",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Note on "destroy" / "apply"
    /// 
    /// There are many types of Dataflow jobs.  Some Dataflow jobs run constantly, getting new data from (e.g.) a GCS bucket, and outputting data continuously.  Some jobs process a set amount of data then terminate.  All jobs can fail while running due to programming errors or other issues.  In this way, Dataflow jobs are different from most other Google resources.
    /// 
    /// The Dataflow resource is considered 'existing' while it is in a nonterminal state.  If it reaches a terminal state (e.g. 'FAILED', 'COMPLETE', 'CANCELLED'), it will be recreated on the next 'apply'.  This is as expected for jobs which run continuously, but may surprise users who use this resource for other kinds of Dataflow jobs.
    /// 
    /// A Dataflow job which is 'destroyed' may be "cancelled" or "drained".  If "cancelled", the job terminates - any data written remains where it is, but no new data will be processed.  If "drained", no new data will enter the pipeline, but any data currently in the pipeline will finish being processed.  The default is "drain". When `on_delete` is set to `"drain"` in the configuration, you may experience a long wait for your `pulumi destroy` to complete.
    /// 
    /// You can potentially short-circuit the wait by setting `skip_wait_on_job_termination` to `true`, but beware that unless you take active steps to ensure that the job `name` parameter changes between instances, the name will conflict and the launch of the new job will fail. One way to do this is with a random_id resource, for example:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// using Random = Pulumi.Random;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var bigDataJobSubscriptionId = config.Get("bigDataJobSubscriptionId") ?? "projects/myproject/subscriptions/messages";
    ///     var bigDataJobNameSuffix = new Random.RandomId("big_data_job_name_suffix", new()
    ///     {
    ///         ByteLength = 4,
    ///         Keepers = 
    ///         {
    ///             { "region", region },
    ///             { "subscription_id", bigDataJobSubscriptionId },
    ///         },
    ///     });
    /// 
    ///     var bigDataJob = new Gcp.Dataflow.FlexTemplateJob("big_data_job", new()
    ///     {
    ///         Name = bigDataJobNameSuffix.Dec.Apply(dec =&gt; $"dataflow-flextemplates-job-{dec}"),
    ///         Region = region,
    ///         ContainerSpecGcsPath = "gs://my-bucket/templates/template.json",
    ///         SkipWaitOnJobTermination = true,
    ///         Parameters = 
    ///         {
    ///             { "inputSubscription", bigDataJobSubscriptionId },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Dataflow jobs can be imported using the job `id` e.g.
    /// 
    /// * `{{id}}`
    /// 
    /// When using the `pulumi import` command, dataflow jobs can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:dataflow/job:Job default {{id}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:dataflow/job:Job")]
    public partial class Job : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of experiments that should be used by the job. An example value is `["enable_stackdriver_agent_metrics"]`.
        /// </summary>
        [Output("additionalExperiments")]
        public Output<ImmutableArray<string>> AdditionalExperiments { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// Enable/disable the use of [Streaming Engine](https://cloud.google.com/dataflow/docs/guides/deploying-a-pipeline#streaming-engine) for the job. Note that Streaming Engine is enabled by default for pipelines developed against the Beam SDK for Python v2.21.0 or later when using Python 3.
        /// </summary>
        [Output("enableStreamingEngine")]
        public Output<bool?> EnableStreamingEngine { get; private set; } = null!;

        /// <summary>
        /// The configuration for VM IPs.  Options are `"WORKER_IP_PUBLIC"` or `"WORKER_IP_PRIVATE"`.
        /// </summary>
        [Output("ipConfiguration")]
        public Output<string?> IpConfiguration { get; private set; } = null!;

        /// <summary>
        /// The unique ID of this job.
        /// </summary>
        [Output("jobId")]
        public Output<string> JobId { get; private set; } = null!;

        /// <summary>
        /// The name for the Cloud KMS key for the job. Key format is: `projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY`
        /// </summary>
        [Output("kmsKeyName")]
        public Output<string?> KmsKeyName { get; private set; } = null!;

        /// <summary>
        /// User labels to be specified for the job. Keys and values should follow the restrictions
        /// specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration. Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// The machine type to use for the job.
        /// </summary>
        [Output("machineType")]
        public Output<string?> MachineType { get; private set; } = null!;

        /// <summary>
        /// The number of workers permitted to work on the job.  More workers may improve processing speed at additional cost.
        /// </summary>
        [Output("maxWorkers")]
        public Output<int?> MaxWorkers { get; private set; } = null!;

        /// <summary>
        /// A unique name for the resource, required by Dataflow.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The network to which VMs will be assigned. If it is not provided, "default" will be used.
        /// </summary>
        [Output("network")]
        public Output<string?> Network { get; private set; } = null!;

        /// <summary>
        /// One of "drain" or "cancel".  Specifies behavior of deletion during `pulumi destroy`.  See above note.
        /// </summary>
        [Output("onDelete")]
        public Output<string?> OnDelete { get; private set; } = null!;

        /// <summary>
        /// **Template specific** Key/Value pairs to be forwarded to the pipeline's options; keys are
        /// case-sensitive based on the language on which the pipeline is coded, mostly Java.
        /// **Note**: do not configure Dataflow options here in parameters.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableDictionary<string, string>?> Parameters { get; private set; } = null!;

        /// <summary>
        /// The project in which the resource belongs. If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The combination of labels configured directly on the resource and default labels configured on the provider.
        /// </summary>
        [Output("pulumiLabels")]
        public Output<ImmutableDictionary<string, string>> PulumiLabels { get; private set; } = null!;

        /// <summary>
        /// The region in which the created job should run.
        /// </summary>
        [Output("region")]
        public Output<string?> Region { get; private set; } = null!;

        /// <summary>
        /// The Service Account email used to create the job. This should be just an email e.g. `myserviceaccount@myproject.iam.gserviceaccount.com`. Do not include any `serviceAccount:` or other prefix.
        /// </summary>
        [Output("serviceAccountEmail")]
        public Output<string?> ServiceAccountEmail { get; private set; } = null!;

        /// <summary>
        /// If set to `true`, Pulumi will treat `DRAINING` and `CANCELLING` as terminal states when deleting the resource, and will remove the resource from Pulumi state and move on.  See above note.
        /// </summary>
        [Output("skipWaitOnJobTermination")]
        public Output<bool?> SkipWaitOnJobTermination { get; private set; } = null!;

        /// <summary>
        /// The current state of the resource, selected from the [JobState enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobState)
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// The subnetwork to which VMs will be assigned. Should be of the form "regions/REGION/subnetworks/SUBNETWORK". If the [subnetwork is located in a Shared VPC network](https://cloud.google.com/dataflow/docs/guides/specifying-networks#shared), you must use the complete URL. For example `"googleapis.com/compute/v1/projects/PROJECT_ID/regions/REGION/subnetworks/SUBNET_NAME"`
        /// </summary>
        [Output("subnetwork")]
        public Output<string?> Subnetwork { get; private set; } = null!;

        /// <summary>
        /// A writeable location on GCS for the Dataflow job to dump its temporary data.
        /// 
        /// - - -
        /// </summary>
        [Output("tempGcsLocation")]
        public Output<string> TempGcsLocation { get; private set; } = null!;

        /// <summary>
        /// The GCS path to the Dataflow job template.
        /// </summary>
        [Output("templateGcsPath")]
        public Output<string> TemplateGcsPath { get; private set; } = null!;

        /// <summary>
        /// Only applicable when updating a pipeline. Map of transform name prefixes of the job to be replaced with the corresponding name prefixes of the new job. This field is not used outside of update.
        /// </summary>
        [Output("transformNameMapping")]
        public Output<ImmutableDictionary<string, string>?> TransformNameMapping { get; private set; } = null!;

        /// <summary>
        /// The type of this job, selected from the [JobType enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobType)
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The zone in which the created job should run. If it is not provided, the provider zone is used.
        /// </summary>
        [Output("zone")]
        public Output<string?> Zone { get; private set; } = null!;


        /// <summary>
        /// Create a Job resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Job(string name, JobArgs args, CustomResourceOptions? options = null)
            : base("gcp:dataflow/job:Job", name, args ?? new JobArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Job(string name, Input<string> id, JobState? state = null, CustomResourceOptions? options = null)
            : base("gcp:dataflow/job:Job", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "effectiveLabels",
                    "pulumiLabels",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Job resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Job Get(string name, Input<string> id, JobState? state = null, CustomResourceOptions? options = null)
        {
            return new Job(name, id, state, options);
        }
    }

    public sealed class JobArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalExperiments")]
        private InputList<string>? _additionalExperiments;

        /// <summary>
        /// List of experiments that should be used by the job. An example value is `["enable_stackdriver_agent_metrics"]`.
        /// </summary>
        public InputList<string> AdditionalExperiments
        {
            get => _additionalExperiments ?? (_additionalExperiments = new InputList<string>());
            set => _additionalExperiments = value;
        }

        /// <summary>
        /// Enable/disable the use of [Streaming Engine](https://cloud.google.com/dataflow/docs/guides/deploying-a-pipeline#streaming-engine) for the job. Note that Streaming Engine is enabled by default for pipelines developed against the Beam SDK for Python v2.21.0 or later when using Python 3.
        /// </summary>
        [Input("enableStreamingEngine")]
        public Input<bool>? EnableStreamingEngine { get; set; }

        /// <summary>
        /// The configuration for VM IPs.  Options are `"WORKER_IP_PUBLIC"` or `"WORKER_IP_PRIVATE"`.
        /// </summary>
        [Input("ipConfiguration")]
        public Input<string>? IpConfiguration { get; set; }

        /// <summary>
        /// The name for the Cloud KMS key for the job. Key format is: `projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY`
        /// </summary>
        [Input("kmsKeyName")]
        public Input<string>? KmsKeyName { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// User labels to be specified for the job. Keys and values should follow the restrictions
        /// specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration. Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The machine type to use for the job.
        /// </summary>
        [Input("machineType")]
        public Input<string>? MachineType { get; set; }

        /// <summary>
        /// The number of workers permitted to work on the job.  More workers may improve processing speed at additional cost.
        /// </summary>
        [Input("maxWorkers")]
        public Input<int>? MaxWorkers { get; set; }

        /// <summary>
        /// A unique name for the resource, required by Dataflow.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The network to which VMs will be assigned. If it is not provided, "default" will be used.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// One of "drain" or "cancel".  Specifies behavior of deletion during `pulumi destroy`.  See above note.
        /// </summary>
        [Input("onDelete")]
        public Input<string>? OnDelete { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// **Template specific** Key/Value pairs to be forwarded to the pipeline's options; keys are
        /// case-sensitive based on the language on which the pipeline is coded, mostly Java.
        /// **Note**: do not configure Dataflow options here in parameters.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// The project in which the resource belongs. If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The region in which the created job should run.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The Service Account email used to create the job. This should be just an email e.g. `myserviceaccount@myproject.iam.gserviceaccount.com`. Do not include any `serviceAccount:` or other prefix.
        /// </summary>
        [Input("serviceAccountEmail")]
        public Input<string>? ServiceAccountEmail { get; set; }

        /// <summary>
        /// If set to `true`, Pulumi will treat `DRAINING` and `CANCELLING` as terminal states when deleting the resource, and will remove the resource from Pulumi state and move on.  See above note.
        /// </summary>
        [Input("skipWaitOnJobTermination")]
        public Input<bool>? SkipWaitOnJobTermination { get; set; }

        /// <summary>
        /// The subnetwork to which VMs will be assigned. Should be of the form "regions/REGION/subnetworks/SUBNETWORK". If the [subnetwork is located in a Shared VPC network](https://cloud.google.com/dataflow/docs/guides/specifying-networks#shared), you must use the complete URL. For example `"googleapis.com/compute/v1/projects/PROJECT_ID/regions/REGION/subnetworks/SUBNET_NAME"`
        /// </summary>
        [Input("subnetwork")]
        public Input<string>? Subnetwork { get; set; }

        /// <summary>
        /// A writeable location on GCS for the Dataflow job to dump its temporary data.
        /// 
        /// - - -
        /// </summary>
        [Input("tempGcsLocation", required: true)]
        public Input<string> TempGcsLocation { get; set; } = null!;

        /// <summary>
        /// The GCS path to the Dataflow job template.
        /// </summary>
        [Input("templateGcsPath", required: true)]
        public Input<string> TemplateGcsPath { get; set; } = null!;

        [Input("transformNameMapping")]
        private InputMap<string>? _transformNameMapping;

        /// <summary>
        /// Only applicable when updating a pipeline. Map of transform name prefixes of the job to be replaced with the corresponding name prefixes of the new job. This field is not used outside of update.
        /// </summary>
        public InputMap<string> TransformNameMapping
        {
            get => _transformNameMapping ?? (_transformNameMapping = new InputMap<string>());
            set => _transformNameMapping = value;
        }

        /// <summary>
        /// The zone in which the created job should run. If it is not provided, the provider zone is used.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public JobArgs()
        {
        }
        public static new JobArgs Empty => new JobArgs();
    }

    public sealed class JobState : global::Pulumi.ResourceArgs
    {
        [Input("additionalExperiments")]
        private InputList<string>? _additionalExperiments;

        /// <summary>
        /// List of experiments that should be used by the job. An example value is `["enable_stackdriver_agent_metrics"]`.
        /// </summary>
        public InputList<string> AdditionalExperiments
        {
            get => _additionalExperiments ?? (_additionalExperiments = new InputList<string>());
            set => _additionalExperiments = value;
        }

        [Input("effectiveLabels")]
        private InputMap<string>? _effectiveLabels;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        public InputMap<string> EffectiveLabels
        {
            get => _effectiveLabels ?? (_effectiveLabels = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _effectiveLabels = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// Enable/disable the use of [Streaming Engine](https://cloud.google.com/dataflow/docs/guides/deploying-a-pipeline#streaming-engine) for the job. Note that Streaming Engine is enabled by default for pipelines developed against the Beam SDK for Python v2.21.0 or later when using Python 3.
        /// </summary>
        [Input("enableStreamingEngine")]
        public Input<bool>? EnableStreamingEngine { get; set; }

        /// <summary>
        /// The configuration for VM IPs.  Options are `"WORKER_IP_PUBLIC"` or `"WORKER_IP_PRIVATE"`.
        /// </summary>
        [Input("ipConfiguration")]
        public Input<string>? IpConfiguration { get; set; }

        /// <summary>
        /// The unique ID of this job.
        /// </summary>
        [Input("jobId")]
        public Input<string>? JobId { get; set; }

        /// <summary>
        /// The name for the Cloud KMS key for the job. Key format is: `projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY`
        /// </summary>
        [Input("kmsKeyName")]
        public Input<string>? KmsKeyName { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// User labels to be specified for the job. Keys and values should follow the restrictions
        /// specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions) page.
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration. Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The machine type to use for the job.
        /// </summary>
        [Input("machineType")]
        public Input<string>? MachineType { get; set; }

        /// <summary>
        /// The number of workers permitted to work on the job.  More workers may improve processing speed at additional cost.
        /// </summary>
        [Input("maxWorkers")]
        public Input<int>? MaxWorkers { get; set; }

        /// <summary>
        /// A unique name for the resource, required by Dataflow.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The network to which VMs will be assigned. If it is not provided, "default" will be used.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// One of "drain" or "cancel".  Specifies behavior of deletion during `pulumi destroy`.  See above note.
        /// </summary>
        [Input("onDelete")]
        public Input<string>? OnDelete { get; set; }

        [Input("parameters")]
        private InputMap<string>? _parameters;

        /// <summary>
        /// **Template specific** Key/Value pairs to be forwarded to the pipeline's options; keys are
        /// case-sensitive based on the language on which the pipeline is coded, mostly Java.
        /// **Note**: do not configure Dataflow options here in parameters.
        /// </summary>
        public InputMap<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputMap<string>());
            set => _parameters = value;
        }

        /// <summary>
        /// The project in which the resource belongs. If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("pulumiLabels")]
        private InputMap<string>? _pulumiLabels;

        /// <summary>
        /// The combination of labels configured directly on the resource and default labels configured on the provider.
        /// </summary>
        public InputMap<string> PulumiLabels
        {
            get => _pulumiLabels ?? (_pulumiLabels = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _pulumiLabels = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// The region in which the created job should run.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The Service Account email used to create the job. This should be just an email e.g. `myserviceaccount@myproject.iam.gserviceaccount.com`. Do not include any `serviceAccount:` or other prefix.
        /// </summary>
        [Input("serviceAccountEmail")]
        public Input<string>? ServiceAccountEmail { get; set; }

        /// <summary>
        /// If set to `true`, Pulumi will treat `DRAINING` and `CANCELLING` as terminal states when deleting the resource, and will remove the resource from Pulumi state and move on.  See above note.
        /// </summary>
        [Input("skipWaitOnJobTermination")]
        public Input<bool>? SkipWaitOnJobTermination { get; set; }

        /// <summary>
        /// The current state of the resource, selected from the [JobState enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobState)
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The subnetwork to which VMs will be assigned. Should be of the form "regions/REGION/subnetworks/SUBNETWORK". If the [subnetwork is located in a Shared VPC network](https://cloud.google.com/dataflow/docs/guides/specifying-networks#shared), you must use the complete URL. For example `"googleapis.com/compute/v1/projects/PROJECT_ID/regions/REGION/subnetworks/SUBNET_NAME"`
        /// </summary>
        [Input("subnetwork")]
        public Input<string>? Subnetwork { get; set; }

        /// <summary>
        /// A writeable location on GCS for the Dataflow job to dump its temporary data.
        /// 
        /// - - -
        /// </summary>
        [Input("tempGcsLocation")]
        public Input<string>? TempGcsLocation { get; set; }

        /// <summary>
        /// The GCS path to the Dataflow job template.
        /// </summary>
        [Input("templateGcsPath")]
        public Input<string>? TemplateGcsPath { get; set; }

        [Input("transformNameMapping")]
        private InputMap<string>? _transformNameMapping;

        /// <summary>
        /// Only applicable when updating a pipeline. Map of transform name prefixes of the job to be replaced with the corresponding name prefixes of the new job. This field is not used outside of update.
        /// </summary>
        public InputMap<string> TransformNameMapping
        {
            get => _transformNameMapping ?? (_transformNameMapping = new InputMap<string>());
            set => _transformNameMapping = value;
        }

        /// <summary>
        /// The type of this job, selected from the [JobType enum](https://cloud.google.com/dataflow/docs/reference/rest/v1b3/projects.jobs#Job.JobType)
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The zone in which the created job should run. If it is not provided, the provider zone is used.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public JobState()
        {
        }
        public static new JobState Empty => new JobState();
    }
}
