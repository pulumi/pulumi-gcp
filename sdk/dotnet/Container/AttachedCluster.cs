// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container
{
    /// <summary>
    /// An Anthos cluster running on customer owned infrastructure.
    /// 
    /// To get more information about Cluster, see:
    /// 
    /// * [API documentation](https://cloud.google.com/anthos/clusters/docs/multi-cloud/reference/rest)
    /// * How-to Guides
    ///     * [API reference](https://cloud.google.com/anthos/clusters/docs/multi-cloud/reference/rest/v1/projects.locations.attachedClusters)
    ///     * [Multicloud overview](https://cloud.google.com/anthos/clusters/docs/multi-cloud)
    /// 
    /// ## Example Usage
    /// 
    /// ### Container Attached Cluster Basic
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
    ///     var versions = Gcp.Container.GetAttachedVersions.Invoke(new()
    ///     {
    ///         Location = "us-west1",
    ///         Project = project.Apply(getProjectResult =&gt; getProjectResult.ProjectId),
    ///     });
    /// 
    ///     var primary = new Gcp.Container.AttachedCluster("primary", new()
    ///     {
    ///         Name = "basic",
    ///         Location = "us-west1",
    ///         Project = project.Apply(getProjectResult =&gt; getProjectResult.ProjectId),
    ///         Description = "Test cluster",
    ///         Distribution = "aks",
    ///         OidcConfig = new Gcp.Container.Inputs.AttachedClusterOidcConfigArgs
    ///         {
    ///             IssuerUrl = "https://oidc.issuer.url",
    ///         },
    ///         PlatformVersion = versions.Apply(getAttachedVersionsResult =&gt; getAttachedVersionsResult.ValidVersions[0]),
    ///         Fleet = new Gcp.Container.Inputs.AttachedClusterFleetArgs
    ///         {
    ///             Project = $"projects/{project.Apply(getProjectResult =&gt; getProjectResult.Number)}",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Container Attached Cluster Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var project = Gcp.Organizations.GetProject.Invoke();
    /// 
    ///     var versions = Gcp.Container.GetAttachedVersions.Invoke(new()
    ///     {
    ///         Location = "us-west1",
    ///         Project = project.Apply(getProjectResult =&gt; getProjectResult.ProjectId),
    ///     });
    /// 
    ///     var primary = new Gcp.Container.AttachedCluster("primary", new()
    ///     {
    ///         Name = "basic",
    ///         Project = project.Apply(getProjectResult =&gt; getProjectResult.ProjectId),
    ///         Location = "us-west1",
    ///         Description = "Test cluster",
    ///         Distribution = "aks",
    ///         Annotations = 
    ///         {
    ///             { "label-one", "value-one" },
    ///         },
    ///         Authorization = new Gcp.Container.Inputs.AttachedClusterAuthorizationArgs
    ///         {
    ///             AdminUsers = new[]
    ///             {
    ///                 "user1@example.com",
    ///                 "user2@example.com",
    ///             },
    ///             AdminGroups = new[]
    ///             {
    ///                 "group1@example.com",
    ///                 "group2@example.com",
    ///             },
    ///         },
    ///         OidcConfig = new Gcp.Container.Inputs.AttachedClusterOidcConfigArgs
    ///         {
    ///             IssuerUrl = "https://oidc.issuer.url",
    ///             Jwks = Std.Base64encode.Invoke(new()
    ///             {
    ///                 Input = "{\"keys\":[{\"use\":\"sig\",\"kty\":\"RSA\",\"kid\":\"testid\",\"alg\":\"RS256\",\"n\":\"somedata\",\"e\":\"AQAB\"}]}",
    ///             }).Apply(invoke =&gt; invoke.Result),
    ///         },
    ///         PlatformVersion = versions.Apply(getAttachedVersionsResult =&gt; getAttachedVersionsResult.ValidVersions[0]),
    ///         Fleet = new Gcp.Container.Inputs.AttachedClusterFleetArgs
    ///         {
    ///             Project = $"projects/{project.Apply(getProjectResult =&gt; getProjectResult.Number)}",
    ///         },
    ///         LoggingConfig = new Gcp.Container.Inputs.AttachedClusterLoggingConfigArgs
    ///         {
    ///             ComponentConfig = new Gcp.Container.Inputs.AttachedClusterLoggingConfigComponentConfigArgs
    ///             {
    ///                 EnableComponents = new[]
    ///                 {
    ///                     "SYSTEM_COMPONENTS",
    ///                     "WORKLOADS",
    ///                 },
    ///             },
    ///         },
    ///         MonitoringConfig = new Gcp.Container.Inputs.AttachedClusterMonitoringConfigArgs
    ///         {
    ///             ManagedPrometheusConfig = new Gcp.Container.Inputs.AttachedClusterMonitoringConfigManagedPrometheusConfigArgs
    ///             {
    ///                 Enabled = true,
    ///             },
    ///         },
    ///         BinaryAuthorization = new Gcp.Container.Inputs.AttachedClusterBinaryAuthorizationArgs
    ///         {
    ///             EvaluationMode = "PROJECT_SINGLETON_POLICY_ENFORCE",
    ///         },
    ///         ProxyConfig = new Gcp.Container.Inputs.AttachedClusterProxyConfigArgs
    ///         {
    ///             KubernetesSecret = new Gcp.Container.Inputs.AttachedClusterProxyConfigKubernetesSecretArgs
    ///             {
    ///                 Name = "proxy-config",
    ///                 Namespace = "default",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Container Attached Cluster Ignore Errors
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
    ///     var versions = Gcp.Container.GetAttachedVersions.Invoke(new()
    ///     {
    ///         Location = "us-west1",
    ///         Project = project.Apply(getProjectResult =&gt; getProjectResult.ProjectId),
    ///     });
    /// 
    ///     var primary = new Gcp.Container.AttachedCluster("primary", new()
    ///     {
    ///         Name = "basic",
    ///         Location = "us-west1",
    ///         Project = project.Apply(getProjectResult =&gt; getProjectResult.ProjectId),
    ///         Description = "Test cluster",
    ///         Distribution = "aks",
    ///         OidcConfig = new Gcp.Container.Inputs.AttachedClusterOidcConfigArgs
    ///         {
    ///             IssuerUrl = "https://oidc.issuer.url",
    ///         },
    ///         PlatformVersion = versions.Apply(getAttachedVersionsResult =&gt; getAttachedVersionsResult.ValidVersions[0]),
    ///         Fleet = new Gcp.Container.Inputs.AttachedClusterFleetArgs
    ///         {
    ///             Project = $"projects/{project.Apply(getProjectResult =&gt; getProjectResult.Number)}",
    ///         },
    ///         DeletionPolicy = "DELETE_IGNORE_ERRORS",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Cluster can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/attachedClusters/{{name}}`
    /// 
    /// * `{{project}}/{{location}}/{{name}}`
    /// 
    /// * `{{location}}/{{name}}`
    /// 
    /// When using the `pulumi import` command, Cluster can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:container/attachedCluster:AttachedCluster default projects/{{project}}/locations/{{location}}/attachedClusters/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:container/attachedCluster:AttachedCluster default {{project}}/{{location}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:container/attachedCluster:AttachedCluster default {{location}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:container/attachedCluster:AttachedCluster")]
    public partial class AttachedCluster : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Optional. Annotations on the cluster. This field has the same
        /// restrictions as Kubernetes annotations. The total size of all keys and
        /// values combined is limited to 256k. Key can have 2 segments: prefix (optional)
        /// and name (required), separated by a slash (/). Prefix must be a DNS subdomain.
        /// Name must be 63 characters or less, begin and end with alphanumerics,
        /// with dashes (-), underscores (_), dots (.), and alphanumerics between.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
        /// Please refer to the field `effective_annotations` for all of the annotations present on the resource.
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, string>?> Annotations { get; private set; } = null!;

        /// <summary>
        /// Configuration related to the cluster RBAC settings.
        /// Structure is documented below.
        /// </summary>
        [Output("authorization")]
        public Output<Outputs.AttachedClusterAuthorization?> Authorization { get; private set; } = null!;

        /// <summary>
        /// Binary Authorization configuration.
        /// Structure is documented below.
        /// </summary>
        [Output("binaryAuthorization")]
        public Output<Outputs.AttachedClusterBinaryAuthorization> BinaryAuthorization { get; private set; } = null!;

        /// <summary>
        /// Output only. The region where this cluster runs.
        /// For EKS clusters, this is an AWS region. For AKS clusters,
        /// this is an Azure region.
        /// </summary>
        [Output("clusterRegion")]
        public Output<string> ClusterRegion { get; private set; } = null!;

        /// <summary>
        /// Output only. The time at which this cluster was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Policy to determine what flags to send on delete. Possible values: DELETE, DELETE_IGNORE_ERRORS
        /// </summary>
        [Output("deletionPolicy")]
        public Output<string?> DeletionPolicy { get; private set; } = null!;

        /// <summary>
        /// A human readable description of this attached cluster. Cannot be longer
        /// than 255 UTF-8 encoded bytes.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The Kubernetes distribution of the underlying attached cluster. Supported values:
        /// "eks", "aks", "generic". The generic distribution provides the ability to register
        /// or migrate any CNCF conformant cluster.
        /// </summary>
        [Output("distribution")]
        public Output<string> Distribution { get; private set; } = null!;

        [Output("effectiveAnnotations")]
        public Output<ImmutableDictionary<string, string>> EffectiveAnnotations { get; private set; } = null!;

        /// <summary>
        /// A set of errors found in the cluster.
        /// Structure is documented below.
        /// </summary>
        [Output("errors")]
        public Output<ImmutableArray<Outputs.AttachedClusterError>> Errors { get; private set; } = null!;

        /// <summary>
        /// Fleet configuration.
        /// Structure is documented below.
        /// </summary>
        [Output("fleet")]
        public Output<Outputs.AttachedClusterFleet> Fleet { get; private set; } = null!;

        /// <summary>
        /// The Kubernetes version of the cluster.
        /// </summary>
        [Output("kubernetesVersion")]
        public Output<string> KubernetesVersion { get; private set; } = null!;

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Logging configuration.
        /// Structure is documented below.
        /// </summary>
        [Output("loggingConfig")]
        public Output<Outputs.AttachedClusterLoggingConfig?> LoggingConfig { get; private set; } = null!;

        /// <summary>
        /// Monitoring configuration.
        /// Structure is documented below.
        /// </summary>
        [Output("monitoringConfig")]
        public Output<Outputs.AttachedClusterMonitoringConfig> MonitoringConfig { get; private set; } = null!;

        /// <summary>
        /// The name of this resource.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// OIDC discovery information of the target cluster.
        /// Kubernetes Service Account (KSA) tokens are JWT tokens signed by the cluster
        /// API server. This fields indicates how GCP services
        /// validate KSA tokens in order to allow system workloads (such as GKE Connect
        /// and telemetry agents) to authenticate back to GCP.
        /// Both clusters with public and private issuer URLs are supported.
        /// Clusters with public issuers only need to specify the `issuer_url` field
        /// while clusters with private issuers need to provide both
        /// `issuer_url` and `jwks`.
        /// Structure is documented below.
        /// </summary>
        [Output("oidcConfig")]
        public Output<Outputs.AttachedClusterOidcConfig> OidcConfig { get; private set; } = null!;

        /// <summary>
        /// The platform version for the cluster (e.g. `1.23.0-gke.1`).
        /// </summary>
        [Output("platformVersion")]
        public Output<string> PlatformVersion { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Support for proxy configuration.
        /// Structure is documented below.
        /// </summary>
        [Output("proxyConfig")]
        public Output<Outputs.AttachedClusterProxyConfig?> ProxyConfig { get; private set; } = null!;

        /// <summary>
        /// If set, there are currently changes in flight to the cluster.
        /// </summary>
        [Output("reconciling")]
        public Output<bool> Reconciling { get; private set; } = null!;

        /// <summary>
        /// (Optional, Deprecated)
        /// Enable/Disable Security Posture API features for the cluster.
        /// Structure is documented below.
        /// 
        /// &gt; **Warning:** `security_posture_config` is deprecated and will be removed in a future major release.
        /// </summary>
        [Output("securityPostureConfig")]
        public Output<Outputs.AttachedClusterSecurityPostureConfig> SecurityPostureConfig { get; private set; } = null!;

        /// <summary>
        /// The current state of the cluster. Possible values:
        /// STATE_UNSPECIFIED, PROVISIONING, RUNNING, RECONCILING, STOPPING, ERROR,
        /// DEGRADED
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// A globally unique identifier for the cluster.
        /// </summary>
        [Output("uid")]
        public Output<string> Uid { get; private set; } = null!;

        /// <summary>
        /// The time at which this cluster was last updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;

        /// <summary>
        /// Workload Identity settings.
        /// Structure is documented below.
        /// </summary>
        [Output("workloadIdentityConfigs")]
        public Output<ImmutableArray<Outputs.AttachedClusterWorkloadIdentityConfig>> WorkloadIdentityConfigs { get; private set; } = null!;


        /// <summary>
        /// Create a AttachedCluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AttachedCluster(string name, AttachedClusterArgs args, CustomResourceOptions? options = null)
            : base("gcp:container/attachedCluster:AttachedCluster", name, args ?? new AttachedClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AttachedCluster(string name, Input<string> id, AttachedClusterState? state = null, CustomResourceOptions? options = null)
            : base("gcp:container/attachedCluster:AttachedCluster", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AttachedCluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AttachedCluster Get(string name, Input<string> id, AttachedClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new AttachedCluster(name, id, state, options);
        }
    }

    public sealed class AttachedClusterArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Optional. Annotations on the cluster. This field has the same
        /// restrictions as Kubernetes annotations. The total size of all keys and
        /// values combined is limited to 256k. Key can have 2 segments: prefix (optional)
        /// and name (required), separated by a slash (/). Prefix must be a DNS subdomain.
        /// Name must be 63 characters or less, begin and end with alphanumerics,
        /// with dashes (-), underscores (_), dots (.), and alphanumerics between.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
        /// Please refer to the field `effective_annotations` for all of the annotations present on the resource.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// Configuration related to the cluster RBAC settings.
        /// Structure is documented below.
        /// </summary>
        [Input("authorization")]
        public Input<Inputs.AttachedClusterAuthorizationArgs>? Authorization { get; set; }

        /// <summary>
        /// Binary Authorization configuration.
        /// Structure is documented below.
        /// </summary>
        [Input("binaryAuthorization")]
        public Input<Inputs.AttachedClusterBinaryAuthorizationArgs>? BinaryAuthorization { get; set; }

        /// <summary>
        /// Policy to determine what flags to send on delete. Possible values: DELETE, DELETE_IGNORE_ERRORS
        /// </summary>
        [Input("deletionPolicy")]
        public Input<string>? DeletionPolicy { get; set; }

        /// <summary>
        /// A human readable description of this attached cluster. Cannot be longer
        /// than 255 UTF-8 encoded bytes.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Kubernetes distribution of the underlying attached cluster. Supported values:
        /// "eks", "aks", "generic". The generic distribution provides the ability to register
        /// or migrate any CNCF conformant cluster.
        /// </summary>
        [Input("distribution", required: true)]
        public Input<string> Distribution { get; set; } = null!;

        /// <summary>
        /// Fleet configuration.
        /// Structure is documented below.
        /// </summary>
        [Input("fleet", required: true)]
        public Input<Inputs.AttachedClusterFleetArgs> Fleet { get; set; } = null!;

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// Logging configuration.
        /// Structure is documented below.
        /// </summary>
        [Input("loggingConfig")]
        public Input<Inputs.AttachedClusterLoggingConfigArgs>? LoggingConfig { get; set; }

        /// <summary>
        /// Monitoring configuration.
        /// Structure is documented below.
        /// </summary>
        [Input("monitoringConfig")]
        public Input<Inputs.AttachedClusterMonitoringConfigArgs>? MonitoringConfig { get; set; }

        /// <summary>
        /// The name of this resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// OIDC discovery information of the target cluster.
        /// Kubernetes Service Account (KSA) tokens are JWT tokens signed by the cluster
        /// API server. This fields indicates how GCP services
        /// validate KSA tokens in order to allow system workloads (such as GKE Connect
        /// and telemetry agents) to authenticate back to GCP.
        /// Both clusters with public and private issuer URLs are supported.
        /// Clusters with public issuers only need to specify the `issuer_url` field
        /// while clusters with private issuers need to provide both
        /// `issuer_url` and `jwks`.
        /// Structure is documented below.
        /// </summary>
        [Input("oidcConfig", required: true)]
        public Input<Inputs.AttachedClusterOidcConfigArgs> OidcConfig { get; set; } = null!;

        /// <summary>
        /// The platform version for the cluster (e.g. `1.23.0-gke.1`).
        /// </summary>
        [Input("platformVersion", required: true)]
        public Input<string> PlatformVersion { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Support for proxy configuration.
        /// Structure is documented below.
        /// </summary>
        [Input("proxyConfig")]
        public Input<Inputs.AttachedClusterProxyConfigArgs>? ProxyConfig { get; set; }

        /// <summary>
        /// (Optional, Deprecated)
        /// Enable/Disable Security Posture API features for the cluster.
        /// Structure is documented below.
        /// 
        /// &gt; **Warning:** `security_posture_config` is deprecated and will be removed in a future major release.
        /// </summary>
        [Input("securityPostureConfig")]
        public Input<Inputs.AttachedClusterSecurityPostureConfigArgs>? SecurityPostureConfig { get; set; }

        public AttachedClusterArgs()
        {
        }
        public static new AttachedClusterArgs Empty => new AttachedClusterArgs();
    }

    public sealed class AttachedClusterState : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Optional. Annotations on the cluster. This field has the same
        /// restrictions as Kubernetes annotations. The total size of all keys and
        /// values combined is limited to 256k. Key can have 2 segments: prefix (optional)
        /// and name (required), separated by a slash (/). Prefix must be a DNS subdomain.
        /// Name must be 63 characters or less, begin and end with alphanumerics,
        /// with dashes (-), underscores (_), dots (.), and alphanumerics between.
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
        /// Please refer to the field `effective_annotations` for all of the annotations present on the resource.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// Configuration related to the cluster RBAC settings.
        /// Structure is documented below.
        /// </summary>
        [Input("authorization")]
        public Input<Inputs.AttachedClusterAuthorizationGetArgs>? Authorization { get; set; }

        /// <summary>
        /// Binary Authorization configuration.
        /// Structure is documented below.
        /// </summary>
        [Input("binaryAuthorization")]
        public Input<Inputs.AttachedClusterBinaryAuthorizationGetArgs>? BinaryAuthorization { get; set; }

        /// <summary>
        /// Output only. The region where this cluster runs.
        /// For EKS clusters, this is an AWS region. For AKS clusters,
        /// this is an Azure region.
        /// </summary>
        [Input("clusterRegion")]
        public Input<string>? ClusterRegion { get; set; }

        /// <summary>
        /// Output only. The time at which this cluster was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Policy to determine what flags to send on delete. Possible values: DELETE, DELETE_IGNORE_ERRORS
        /// </summary>
        [Input("deletionPolicy")]
        public Input<string>? DeletionPolicy { get; set; }

        /// <summary>
        /// A human readable description of this attached cluster. Cannot be longer
        /// than 255 UTF-8 encoded bytes.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Kubernetes distribution of the underlying attached cluster. Supported values:
        /// "eks", "aks", "generic". The generic distribution provides the ability to register
        /// or migrate any CNCF conformant cluster.
        /// </summary>
        [Input("distribution")]
        public Input<string>? Distribution { get; set; }

        [Input("effectiveAnnotations")]
        private InputMap<string>? _effectiveAnnotations;
        public InputMap<string> EffectiveAnnotations
        {
            get => _effectiveAnnotations ?? (_effectiveAnnotations = new InputMap<string>());
            set => _effectiveAnnotations = value;
        }

        [Input("errors")]
        private InputList<Inputs.AttachedClusterErrorGetArgs>? _errors;

        /// <summary>
        /// A set of errors found in the cluster.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.AttachedClusterErrorGetArgs> Errors
        {
            get => _errors ?? (_errors = new InputList<Inputs.AttachedClusterErrorGetArgs>());
            set => _errors = value;
        }

        /// <summary>
        /// Fleet configuration.
        /// Structure is documented below.
        /// </summary>
        [Input("fleet")]
        public Input<Inputs.AttachedClusterFleetGetArgs>? Fleet { get; set; }

        /// <summary>
        /// The Kubernetes version of the cluster.
        /// </summary>
        [Input("kubernetesVersion")]
        public Input<string>? KubernetesVersion { get; set; }

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Logging configuration.
        /// Structure is documented below.
        /// </summary>
        [Input("loggingConfig")]
        public Input<Inputs.AttachedClusterLoggingConfigGetArgs>? LoggingConfig { get; set; }

        /// <summary>
        /// Monitoring configuration.
        /// Structure is documented below.
        /// </summary>
        [Input("monitoringConfig")]
        public Input<Inputs.AttachedClusterMonitoringConfigGetArgs>? MonitoringConfig { get; set; }

        /// <summary>
        /// The name of this resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// OIDC discovery information of the target cluster.
        /// Kubernetes Service Account (KSA) tokens are JWT tokens signed by the cluster
        /// API server. This fields indicates how GCP services
        /// validate KSA tokens in order to allow system workloads (such as GKE Connect
        /// and telemetry agents) to authenticate back to GCP.
        /// Both clusters with public and private issuer URLs are supported.
        /// Clusters with public issuers only need to specify the `issuer_url` field
        /// while clusters with private issuers need to provide both
        /// `issuer_url` and `jwks`.
        /// Structure is documented below.
        /// </summary>
        [Input("oidcConfig")]
        public Input<Inputs.AttachedClusterOidcConfigGetArgs>? OidcConfig { get; set; }

        /// <summary>
        /// The platform version for the cluster (e.g. `1.23.0-gke.1`).
        /// </summary>
        [Input("platformVersion")]
        public Input<string>? PlatformVersion { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Support for proxy configuration.
        /// Structure is documented below.
        /// </summary>
        [Input("proxyConfig")]
        public Input<Inputs.AttachedClusterProxyConfigGetArgs>? ProxyConfig { get; set; }

        /// <summary>
        /// If set, there are currently changes in flight to the cluster.
        /// </summary>
        [Input("reconciling")]
        public Input<bool>? Reconciling { get; set; }

        /// <summary>
        /// (Optional, Deprecated)
        /// Enable/Disable Security Posture API features for the cluster.
        /// Structure is documented below.
        /// 
        /// &gt; **Warning:** `security_posture_config` is deprecated and will be removed in a future major release.
        /// </summary>
        [Input("securityPostureConfig")]
        public Input<Inputs.AttachedClusterSecurityPostureConfigGetArgs>? SecurityPostureConfig { get; set; }

        /// <summary>
        /// The current state of the cluster. Possible values:
        /// STATE_UNSPECIFIED, PROVISIONING, RUNNING, RECONCILING, STOPPING, ERROR,
        /// DEGRADED
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// A globally unique identifier for the cluster.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        /// <summary>
        /// The time at which this cluster was last updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        [Input("workloadIdentityConfigs")]
        private InputList<Inputs.AttachedClusterWorkloadIdentityConfigGetArgs>? _workloadIdentityConfigs;

        /// <summary>
        /// Workload Identity settings.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.AttachedClusterWorkloadIdentityConfigGetArgs> WorkloadIdentityConfigs
        {
            get => _workloadIdentityConfigs ?? (_workloadIdentityConfigs = new InputList<Inputs.AttachedClusterWorkloadIdentityConfigGetArgs>());
            set => _workloadIdentityConfigs = value;
        }

        public AttachedClusterState()
        {
        }
        public static new AttachedClusterState Empty => new AttachedClusterState();
    }
}
