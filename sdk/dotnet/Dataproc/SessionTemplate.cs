// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dataproc
{
    /// <summary>
    /// A Dataproc Serverless session template defines the configuration settings for
    /// creating one or more Dataproc Serverless interactive sessions.
    /// 
    /// To get more information about SessionTemplate, see:
    /// 
    /// * [API documentation](https://cloud.google.com/dataproc-serverless/docs/reference/rest/v1/projects.locations.sessionTemplates)
    /// * How-to Guides
    ///     * [Dataproc Serverless Session Templates](https://cloud.google.com/dataproc-serverless/docs/guides/create-serverless-sessions-templates#create-dataproc-serverless-session-template)
    /// 
    /// ## Example Usage
    /// 
    /// ### Dataproc Session Templates Jupyter
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleSessionTemplatesJupyter = new Gcp.Dataproc.SessionTemplate("example_session_templates_jupyter", new()
    ///     {
    ///         Name = "projects/my-project-name/locations/us-central1/sessionTemplates/jupyter-session-template",
    ///         Location = "us-central1",
    ///         Labels = 
    ///         {
    ///             { "session_template_test", "terraform" },
    ///         },
    ///         RuntimeConfig = new Gcp.Dataproc.Inputs.SessionTemplateRuntimeConfigArgs
    ///         {
    ///             Properties = 
    ///             {
    ///                 { "spark.dynamicAllocation.enabled", "false" },
    ///                 { "spark.executor.instances", "2" },
    ///             },
    ///         },
    ///         EnvironmentConfig = new Gcp.Dataproc.Inputs.SessionTemplateEnvironmentConfigArgs
    ///         {
    ///             ExecutionConfig = new Gcp.Dataproc.Inputs.SessionTemplateEnvironmentConfigExecutionConfigArgs
    ///             {
    ///                 SubnetworkUri = "default",
    ///                 Ttl = "3600s",
    ///                 NetworkTags = new[]
    ///                 {
    ///                     "tag1",
    ///                 },
    ///             },
    ///         },
    ///         JupyterSession = new Gcp.Dataproc.Inputs.SessionTemplateJupyterSessionArgs
    ///         {
    ///             Kernel = "PYTHON",
    ///             DisplayName = "tf python kernel",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Dataproc Session Templates Jupyter Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = Gcp.Organizations.GetProject.Invoke();
    /// 
    ///     var gcsAccount = Gcp.Storage.GetProjectServiceAccount.Invoke();
    /// 
    ///     var bucket = new Gcp.Storage.Bucket("bucket", new()
    ///     {
    ///         UniformBucketLevelAccess = true,
    ///         Name = "dataproc-bucket",
    ///         Location = "US",
    ///         ForceDestroy = true,
    ///     });
    /// 
    ///     var cryptoKeyMember1 = new Gcp.Kms.CryptoKeyIAMMember("crypto_key_member_1", new()
    ///     {
    ///         CryptoKeyId = "example-key",
    ///         Role = "roles/cloudkms.cryptoKeyEncrypterDecrypter",
    ///         Member = $"serviceAccount:service-{project.Apply(getProjectResult =&gt; getProjectResult.Number)}@dataproc-accounts.iam.gserviceaccount.com",
    ///     });
    /// 
    ///     var ms = new Gcp.Dataproc.MetastoreService("ms", new()
    ///     {
    ///         ServiceId = "jupyter-session-template",
    ///         Location = "us-central1",
    ///         Port = 9080,
    ///         Tier = "DEVELOPER",
    ///         MaintenanceWindow = new Gcp.Dataproc.Inputs.MetastoreServiceMaintenanceWindowArgs
    ///         {
    ///             HourOfDay = 2,
    ///             DayOfWeek = "SUNDAY",
    ///         },
    ///         HiveMetastoreConfig = new Gcp.Dataproc.Inputs.MetastoreServiceHiveMetastoreConfigArgs
    ///         {
    ///             Version = "3.1.2",
    ///         },
    ///         NetworkConfig = new Gcp.Dataproc.Inputs.MetastoreServiceNetworkConfigArgs
    ///         {
    ///             Consumers = new[]
    ///             {
    ///                 new Gcp.Dataproc.Inputs.MetastoreServiceNetworkConfigConsumerArgs
    ///                 {
    ///                     Subnetwork = "projects/my-project-name/regions/us-central1/subnetworks/default",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var basic = new Gcp.Dataproc.Cluster("basic", new()
    ///     {
    ///         Name = "jupyter-session-template",
    ///         Region = "us-central1",
    ///         ClusterConfig = new Gcp.Dataproc.Inputs.ClusterClusterConfigArgs
    ///         {
    ///             SoftwareConfig = new Gcp.Dataproc.Inputs.ClusterClusterConfigSoftwareConfigArgs
    ///             {
    ///                 OverrideProperties = 
    ///                 {
    ///                     { "dataproc:dataproc.allow.zero.workers", "true" },
    ///                     { "spark:spark.history.fs.logDirectory", bucket.Name.Apply(name =&gt; $"gs://{name}/*/spark-job-history") },
    ///                 },
    ///             },
    ///             GceClusterConfig = new Gcp.Dataproc.Inputs.ClusterClusterConfigGceClusterConfigArgs
    ///             {
    ///                 Subnetwork = "default",
    ///             },
    ///             EndpointConfig = new Gcp.Dataproc.Inputs.ClusterClusterConfigEndpointConfigArgs
    ///             {
    ///                 EnableHttpPortAccess = true,
    ///             },
    ///             MasterConfig = new Gcp.Dataproc.Inputs.ClusterClusterConfigMasterConfigArgs
    ///             {
    ///                 NumInstances = 1,
    ///                 MachineType = "e2-standard-2",
    ///                 DiskConfig = new Gcp.Dataproc.Inputs.ClusterClusterConfigMasterConfigDiskConfigArgs
    ///                 {
    ///                     BootDiskSizeGb = 35,
    ///                 },
    ///             },
    ///             MetastoreConfig = new Gcp.Dataproc.Inputs.ClusterClusterConfigMetastoreConfigArgs
    ///             {
    ///                 DataprocMetastoreService = ms.Name,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var dataprocSessionTemplatesJupyterFull = new Gcp.Dataproc.SessionTemplate("dataproc_session_templates_jupyter_full", new()
    ///     {
    ///         Name = "projects/my-project-name/locations/us-central1/sessionTemplates/jupyter-session-template",
    ///         Location = "us-central1",
    ///         Labels = 
    ///         {
    ///             { "session_template_test", "terraform" },
    ///         },
    ///         RuntimeConfig = new Gcp.Dataproc.Inputs.SessionTemplateRuntimeConfigArgs
    ///         {
    ///             Properties = 
    ///             {
    ///                 { "spark.dynamicAllocation.enabled", "false" },
    ///                 { "spark.executor.instances", "2" },
    ///             },
    ///             Version = "2.2",
    ///             ContainerImage = "us-docker.pkg.dev/my-project-name/s8s-spark-test-images/s8s-spark:latest",
    ///         },
    ///         EnvironmentConfig = new Gcp.Dataproc.Inputs.SessionTemplateEnvironmentConfigArgs
    ///         {
    ///             ExecutionConfig = new Gcp.Dataproc.Inputs.SessionTemplateEnvironmentConfigExecutionConfigArgs
    ///             {
    ///                 Ttl = "3600s",
    ///                 NetworkTags = new[]
    ///                 {
    ///                     "tag1",
    ///                 },
    ///                 KmsKey = "example-key",
    ///                 SubnetworkUri = "default",
    ///                 ServiceAccount = $"{project.Apply(getProjectResult =&gt; getProjectResult.Number)}-compute@developer.gserviceaccount.com",
    ///                 StagingBucket = bucket.Name,
    ///             },
    ///             PeripheralsConfig = new Gcp.Dataproc.Inputs.SessionTemplateEnvironmentConfigPeripheralsConfigArgs
    ///             {
    ///                 MetastoreService = ms.Name,
    ///                 SparkHistoryServerConfig = new Gcp.Dataproc.Inputs.SessionTemplateEnvironmentConfigPeripheralsConfigSparkHistoryServerConfigArgs
    ///                 {
    ///                     DataprocCluster = basic.Id,
    ///                 },
    ///             },
    ///         },
    ///         JupyterSession = new Gcp.Dataproc.Inputs.SessionTemplateJupyterSessionArgs
    ///         {
    ///             Kernel = "PYTHON",
    ///             DisplayName = "tf python kernel",
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             cryptoKeyMember1,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Dataproc Session Templates Spark Connect
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleSessionTemplatesSparkConnect = new Gcp.Dataproc.SessionTemplate("example_session_templates_spark_connect", new()
    ///     {
    ///         Name = "projects/my-project-name/locations/us-central1/sessionTemplates/sc-session-template",
    ///         Location = "us-central1",
    ///         Labels = 
    ///         {
    ///             { "session_template_test", "terraform" },
    ///         },
    ///         RuntimeConfig = new Gcp.Dataproc.Inputs.SessionTemplateRuntimeConfigArgs
    ///         {
    ///             Properties = 
    ///             {
    ///                 { "spark.dynamicAllocation.enabled", "false" },
    ///                 { "spark.executor.instances", "2" },
    ///             },
    ///         },
    ///         EnvironmentConfig = new Gcp.Dataproc.Inputs.SessionTemplateEnvironmentConfigArgs
    ///         {
    ///             ExecutionConfig = new Gcp.Dataproc.Inputs.SessionTemplateEnvironmentConfigExecutionConfigArgs
    ///             {
    ///                 SubnetworkUri = "default",
    ///                 Ttl = "3600s",
    ///                 NetworkTags = new[]
    ///                 {
    ///                     "tag1",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// SessionTemplate can be imported using any of these accepted formats:
    /// 
    /// * `{{name}}`
    /// 
    /// When using the `pulumi import` command, SessionTemplate can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:dataproc/sessionTemplate:SessionTemplate default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:dataproc/sessionTemplate:SessionTemplate")]
    public partial class SessionTemplate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The time when the session template was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The email address of the user who created the session template.
        /// </summary>
        [Output("creator")]
        public Output<string> Creator { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, string>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// Environment configuration for the session execution.
        /// Structure is documented below.
        /// </summary>
        [Output("environmentConfig")]
        public Output<Outputs.SessionTemplateEnvironmentConfig?> EnvironmentConfig { get; private set; } = null!;

        /// <summary>
        /// Jupyter configuration for an interactive session.
        /// Structure is documented below.
        /// </summary>
        [Output("jupyterSession")]
        public Output<Outputs.SessionTemplateJupyterSession?> JupyterSession { get; private set; } = null!;

        /// <summary>
        /// The labels to associate with this session template.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// The location in which the session template will be created in.
        /// </summary>
        [Output("location")]
        public Output<string?> Location { get; private set; } = null!;

        /// <summary>
        /// The resource name of the session template in the following format:
        /// projects/{project}/locations/{location}/sessionTemplates/{template_id}
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The combination of labels configured directly on the resource
        /// and default labels configured on the provider.
        /// </summary>
        [Output("pulumiLabels")]
        public Output<ImmutableDictionary<string, string>> PulumiLabels { get; private set; } = null!;

        /// <summary>
        /// Runtime configuration for the session template.
        /// Structure is documented below.
        /// </summary>
        [Output("runtimeConfig")]
        public Output<Outputs.SessionTemplateRuntimeConfig?> RuntimeConfig { get; private set; } = null!;

        /// <summary>
        /// Spark connect configuration for an interactive session.
        /// </summary>
        [Output("sparkConnectSession")]
        public Output<Outputs.SessionTemplateSparkConnectSession?> SparkConnectSession { get; private set; } = null!;

        /// <summary>
        /// The time when the session template was updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;

        /// <summary>
        /// A session template UUID (Unique Universal Identifier). The service generates this value when it creates the session template.
        /// </summary>
        [Output("uuid")]
        public Output<string> Uuid { get; private set; } = null!;


        /// <summary>
        /// Create a SessionTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SessionTemplate(string name, SessionTemplateArgs? args = null, CustomResourceOptions? options = null)
            : base("gcp:dataproc/sessionTemplate:SessionTemplate", name, args ?? new SessionTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SessionTemplate(string name, Input<string> id, SessionTemplateState? state = null, CustomResourceOptions? options = null)
            : base("gcp:dataproc/sessionTemplate:SessionTemplate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SessionTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SessionTemplate Get(string name, Input<string> id, SessionTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new SessionTemplate(name, id, state, options);
        }
    }

    public sealed class SessionTemplateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Environment configuration for the session execution.
        /// Structure is documented below.
        /// </summary>
        [Input("environmentConfig")]
        public Input<Inputs.SessionTemplateEnvironmentConfigArgs>? EnvironmentConfig { get; set; }

        /// <summary>
        /// Jupyter configuration for an interactive session.
        /// Structure is documented below.
        /// </summary>
        [Input("jupyterSession")]
        public Input<Inputs.SessionTemplateJupyterSessionArgs>? JupyterSession { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// The labels to associate with this session template.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The location in which the session template will be created in.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The resource name of the session template in the following format:
        /// projects/{project}/locations/{location}/sessionTemplates/{template_id}
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Runtime configuration for the session template.
        /// Structure is documented below.
        /// </summary>
        [Input("runtimeConfig")]
        public Input<Inputs.SessionTemplateRuntimeConfigArgs>? RuntimeConfig { get; set; }

        /// <summary>
        /// Spark connect configuration for an interactive session.
        /// </summary>
        [Input("sparkConnectSession")]
        public Input<Inputs.SessionTemplateSparkConnectSessionArgs>? SparkConnectSession { get; set; }

        public SessionTemplateArgs()
        {
        }
        public static new SessionTemplateArgs Empty => new SessionTemplateArgs();
    }

    public sealed class SessionTemplateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The time when the session template was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The email address of the user who created the session template.
        /// </summary>
        [Input("creator")]
        public Input<string>? Creator { get; set; }

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
        /// Environment configuration for the session execution.
        /// Structure is documented below.
        /// </summary>
        [Input("environmentConfig")]
        public Input<Inputs.SessionTemplateEnvironmentConfigGetArgs>? EnvironmentConfig { get; set; }

        /// <summary>
        /// Jupyter configuration for an interactive session.
        /// Structure is documented below.
        /// </summary>
        [Input("jupyterSession")]
        public Input<Inputs.SessionTemplateJupyterSessionGetArgs>? JupyterSession { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// The labels to associate with this session template.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The location in which the session template will be created in.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The resource name of the session template in the following format:
        /// projects/{project}/locations/{location}/sessionTemplates/{template_id}
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("pulumiLabels")]
        private InputMap<string>? _pulumiLabels;

        /// <summary>
        /// The combination of labels configured directly on the resource
        /// and default labels configured on the provider.
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
        /// Runtime configuration for the session template.
        /// Structure is documented below.
        /// </summary>
        [Input("runtimeConfig")]
        public Input<Inputs.SessionTemplateRuntimeConfigGetArgs>? RuntimeConfig { get; set; }

        /// <summary>
        /// Spark connect configuration for an interactive session.
        /// </summary>
        [Input("sparkConnectSession")]
        public Input<Inputs.SessionTemplateSparkConnectSessionGetArgs>? SparkConnectSession { get; set; }

        /// <summary>
        /// The time when the session template was updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        /// <summary>
        /// A session template UUID (Unique Universal Identifier). The service generates this value when it creates the session template.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public SessionTemplateState()
        {
        }
        public static new SessionTemplateState Empty => new SessionTemplateState();
    }
}
