// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeOnPrem
{
    /// <summary>
    /// ## Example Usage
    /// ### Gkeonprem Bare Metal Node Pool Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var default_basic = new Gcp.GkeOnPrem.BareMetalCluster("default-basic", new()
    ///     {
    ///         Location = "us-west1",
    ///         AdminClusterMembership = "projects/870316890899/locations/global/memberships/gkeonprem-terraform-test",
    ///         BareMetalVersion = "1.12.3",
    ///         NetworkConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterNetworkConfigArgs
    ///         {
    ///             IslandModeCidr = new Gcp.GkeOnPrem.Inputs.BareMetalClusterNetworkConfigIslandModeCidrArgs
    ///             {
    ///                 ServiceAddressCidrBlocks = new[]
    ///                 {
    ///                     "172.26.0.0/16",
    ///                 },
    ///                 PodAddressCidrBlocks = new[]
    ///                 {
    ///                     "10.240.0.0/13",
    ///                 },
    ///             },
    ///         },
    ///         ControlPlane = new Gcp.GkeOnPrem.Inputs.BareMetalClusterControlPlaneArgs
    ///         {
    ///             ControlPlaneNodePoolConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigArgs
    ///             {
    ///                 NodePoolConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs
    ///                 {
    ///                     Labels = null,
    ///                     OperatingSystem = "LINUX",
    ///                     NodeConfigs = new[]
    ///                     {
    ///                         new Gcp.GkeOnPrem.Inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigNodeConfigArgs
    ///                         {
    ///                             Labels = null,
    ///                             NodeIp = "10.200.0.9",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         LoadBalancer = new Gcp.GkeOnPrem.Inputs.BareMetalClusterLoadBalancerArgs
    ///         {
    ///             PortConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterLoadBalancerPortConfigArgs
    ///             {
    ///                 ControlPlaneLoadBalancerPort = 443,
    ///             },
    ///             VipConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterLoadBalancerVipConfigArgs
    ///             {
    ///                 ControlPlaneVip = "10.200.0.13",
    ///                 IngressVip = "10.200.0.14",
    ///             },
    ///             MetalLbConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterLoadBalancerMetalLbConfigArgs
    ///             {
    ///                 AddressPools = new[]
    ///                 {
    ///                     new Gcp.GkeOnPrem.Inputs.BareMetalClusterLoadBalancerMetalLbConfigAddressPoolArgs
    ///                     {
    ///                         Pool = "pool1",
    ///                         Addresses = new[]
    ///                         {
    ///                             "10.200.0.14/32",
    ///                             "10.200.0.15/32",
    ///                             "10.200.0.16/32",
    ///                             "10.200.0.17/32",
    ///                             "10.200.0.18/32",
    ///                             "fd00:1::f/128",
    ///                             "fd00:1::10/128",
    ///                             "fd00:1::11/128",
    ///                             "fd00:1::12/128",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Storage = new Gcp.GkeOnPrem.Inputs.BareMetalClusterStorageArgs
    ///         {
    ///             LvpShareConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterStorageLvpShareConfigArgs
    ///             {
    ///                 LvpConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterStorageLvpShareConfigLvpConfigArgs
    ///                 {
    ///                     Path = "/mnt/localpv-share",
    ///                     StorageClass = "local-shared",
    ///                 },
    ///                 SharedPathPvCount = 5,
    ///             },
    ///             LvpNodeMountsConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterStorageLvpNodeMountsConfigArgs
    ///             {
    ///                 Path = "/mnt/localpv-disk",
    ///                 StorageClass = "local-disks",
    ///             },
    ///         },
    ///         SecurityConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterSecurityConfigArgs
    ///         {
    ///             Authorization = new Gcp.GkeOnPrem.Inputs.BareMetalClusterSecurityConfigAuthorizationArgs
    ///             {
    ///                 AdminUsers = new[]
    ///                 {
    ///                     new Gcp.GkeOnPrem.Inputs.BareMetalClusterSecurityConfigAuthorizationAdminUserArgs
    ///                     {
    ///                         Username = "admin@hashicorptest.com",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var nodepool_basic = new Gcp.GkeOnPrem.BareMetalNodePool("nodepool-basic", new()
    ///     {
    ///         BareMetalCluster = default_basic.Name,
    ///         Location = "us-west1",
    ///         NodePoolConfig = new Gcp.GkeOnPrem.Inputs.BareMetalNodePoolNodePoolConfigArgs
    ///         {
    ///             OperatingSystem = "LINUX",
    ///             NodeConfigs = new[]
    ///             {
    ///                 new Gcp.GkeOnPrem.Inputs.BareMetalNodePoolNodePoolConfigNodeConfigArgs
    ///                 {
    ///                     NodeIp = "10.200.0.11",
    ///                 },
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Gkeonprem Bare Metal Node Pool Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var default_full = new Gcp.GkeOnPrem.BareMetalCluster("default-full", new()
    ///     {
    ///         Location = "us-west1",
    ///         AdminClusterMembership = "projects/870316890899/locations/global/memberships/gkeonprem-terraform-test",
    ///         BareMetalVersion = "1.12.3",
    ///         NetworkConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterNetworkConfigArgs
    ///         {
    ///             IslandModeCidr = new Gcp.GkeOnPrem.Inputs.BareMetalClusterNetworkConfigIslandModeCidrArgs
    ///             {
    ///                 ServiceAddressCidrBlocks = new[]
    ///                 {
    ///                     "172.26.0.0/16",
    ///                 },
    ///                 PodAddressCidrBlocks = new[]
    ///                 {
    ///                     "10.240.0.0/13",
    ///                 },
    ///             },
    ///         },
    ///         ControlPlane = new Gcp.GkeOnPrem.Inputs.BareMetalClusterControlPlaneArgs
    ///         {
    ///             ControlPlaneNodePoolConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigArgs
    ///             {
    ///                 NodePoolConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs
    ///                 {
    ///                     Labels = null,
    ///                     OperatingSystem = "LINUX",
    ///                     NodeConfigs = new[]
    ///                     {
    ///                         new Gcp.GkeOnPrem.Inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigNodeConfigArgs
    ///                         {
    ///                             Labels = null,
    ///                             NodeIp = "10.200.0.9",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         LoadBalancer = new Gcp.GkeOnPrem.Inputs.BareMetalClusterLoadBalancerArgs
    ///         {
    ///             PortConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterLoadBalancerPortConfigArgs
    ///             {
    ///                 ControlPlaneLoadBalancerPort = 443,
    ///             },
    ///             VipConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterLoadBalancerVipConfigArgs
    ///             {
    ///                 ControlPlaneVip = "10.200.0.13",
    ///                 IngressVip = "10.200.0.14",
    ///             },
    ///             MetalLbConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterLoadBalancerMetalLbConfigArgs
    ///             {
    ///                 AddressPools = new[]
    ///                 {
    ///                     new Gcp.GkeOnPrem.Inputs.BareMetalClusterLoadBalancerMetalLbConfigAddressPoolArgs
    ///                     {
    ///                         Pool = "pool1",
    ///                         Addresses = new[]
    ///                         {
    ///                             "10.200.0.14/32",
    ///                             "10.200.0.15/32",
    ///                             "10.200.0.16/32",
    ///                             "10.200.0.17/32",
    ///                             "10.200.0.18/32",
    ///                             "fd00:1::f/128",
    ///                             "fd00:1::10/128",
    ///                             "fd00:1::11/128",
    ///                             "fd00:1::12/128",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Storage = new Gcp.GkeOnPrem.Inputs.BareMetalClusterStorageArgs
    ///         {
    ///             LvpShareConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterStorageLvpShareConfigArgs
    ///             {
    ///                 LvpConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterStorageLvpShareConfigLvpConfigArgs
    ///                 {
    ///                     Path = "/mnt/localpv-share",
    ///                     StorageClass = "local-shared",
    ///                 },
    ///                 SharedPathPvCount = 5,
    ///             },
    ///             LvpNodeMountsConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterStorageLvpNodeMountsConfigArgs
    ///             {
    ///                 Path = "/mnt/localpv-disk",
    ///                 StorageClass = "local-disks",
    ///             },
    ///         },
    ///         SecurityConfig = new Gcp.GkeOnPrem.Inputs.BareMetalClusterSecurityConfigArgs
    ///         {
    ///             Authorization = new Gcp.GkeOnPrem.Inputs.BareMetalClusterSecurityConfigAuthorizationArgs
    ///             {
    ///                 AdminUsers = new[]
    ///                 {
    ///                     new Gcp.GkeOnPrem.Inputs.BareMetalClusterSecurityConfigAuthorizationAdminUserArgs
    ///                     {
    ///                         Username = "admin@hashicorptest.com",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var nodepool_full = new Gcp.GkeOnPrem.BareMetalNodePool("nodepool-full", new()
    ///     {
    ///         DisplayName = "test-name",
    ///         BareMetalCluster = default_full.Name,
    ///         Location = "us-west1",
    ///         Annotations = null,
    ///         NodePoolConfig = new Gcp.GkeOnPrem.Inputs.BareMetalNodePoolNodePoolConfigArgs
    ///         {
    ///             OperatingSystem = "LINUX",
    ///             Labels = null,
    ///             NodeConfigs = new[]
    ///             {
    ///                 new Gcp.GkeOnPrem.Inputs.BareMetalNodePoolNodePoolConfigNodeConfigArgs
    ///                 {
    ///                     NodeIp = "10.200.0.11",
    ///                     Labels = null,
    ///                 },
    ///             },
    ///             Taints = new[]
    ///             {
    ///                 new Gcp.GkeOnPrem.Inputs.BareMetalNodePoolNodePoolConfigTaintArgs
    ///                 {
    ///                     Key = "test-key",
    ///                     Value = "test-value",
    ///                     Effect = "NO_EXECUTE",
    ///                 },
    ///             },
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// BareMetalNodePool can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:gkeonprem/bareMetalNodePool:BareMetalNodePool default projects/{{project}}/locations/{{location}}/bareMetalClusters/{{bare_metal_cluster}}/bareMetalNodePools/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:gkeonprem/bareMetalNodePool:BareMetalNodePool default {{project}}/{{location}}/{{bare_metal_cluster}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:gkeonprem/bareMetalNodePool:BareMetalNodePool default {{location}}/{{bare_metal_cluster}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:gkeonprem/bareMetalNodePool:BareMetalNodePool")]
    public partial class BareMetalNodePool : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Annotations on the Bare Metal Node Pool.
        /// This field has the same restrictions as Kubernetes annotations.
        /// The total size of all keys and values combined is limited to 256k.
        /// Key can have 2 segments: prefix (optional) and name (required),
        /// separated by a slash (/).
        /// Prefix must be a DNS subdomain.
        /// Name must be 63 characters or less, begin and end with alphanumerics,
        /// with dashes (-), underscores (_), dots (.), and alphanumerics between.
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, string>> Annotations { get; private set; } = null!;

        /// <summary>
        /// The cluster this node pool belongs to.
        /// </summary>
        [Output("bareMetalCluster")]
        public Output<string> BareMetalCluster { get; private set; } = null!;

        /// <summary>
        /// The time the cluster was created, in RFC3339 text format.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The time the cluster was deleted, in RFC3339 text format.
        /// </summary>
        [Output("deleteTime")]
        public Output<string> DeleteTime { get; private set; } = null!;

        /// <summary>
        /// The display name for the Bare Metal Node Pool.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// This checksum is computed by the server based on the value of other
        /// fields, and may be sent on update and delete requests to ensure the
        /// client has an up-to-date value before proceeding.
        /// Allows clients to perform consistent read-modify-writes
        /// through optimistic concurrency control.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The location of the resource.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The bare metal node pool name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Node pool configuration.
        /// Structure is documented below.
        /// </summary>
        [Output("nodePoolConfig")]
        public Output<Outputs.BareMetalNodePoolNodePoolConfig> NodePoolConfig { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// If set, there are currently changes in flight to the Bare Metal User Cluster.
        /// </summary>
        [Output("reconciling")]
        public Output<bool> Reconciling { get; private set; } = null!;

        /// <summary>
        /// (Output)
        /// The lifecycle state of the condition.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Specifies detailed node pool status.
        /// Structure is documented below.
        /// </summary>
        [Output("statuses")]
        public Output<ImmutableArray<Outputs.BareMetalNodePoolStatus>> Statuses { get; private set; } = null!;

        /// <summary>
        /// The unique identifier of the Bare Metal Node Pool.
        /// </summary>
        [Output("uid")]
        public Output<string> Uid { get; private set; } = null!;

        /// <summary>
        /// The time the cluster was last updated, in RFC3339 text format.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a BareMetalNodePool resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BareMetalNodePool(string name, BareMetalNodePoolArgs args, CustomResourceOptions? options = null)
            : base("gcp:gkeonprem/bareMetalNodePool:BareMetalNodePool", name, args ?? new BareMetalNodePoolArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BareMetalNodePool(string name, Input<string> id, BareMetalNodePoolState? state = null, CustomResourceOptions? options = null)
            : base("gcp:gkeonprem/bareMetalNodePool:BareMetalNodePool", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BareMetalNodePool resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BareMetalNodePool Get(string name, Input<string> id, BareMetalNodePoolState? state = null, CustomResourceOptions? options = null)
        {
            return new BareMetalNodePool(name, id, state, options);
        }
    }

    public sealed class BareMetalNodePoolArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations on the Bare Metal Node Pool.
        /// This field has the same restrictions as Kubernetes annotations.
        /// The total size of all keys and values combined is limited to 256k.
        /// Key can have 2 segments: prefix (optional) and name (required),
        /// separated by a slash (/).
        /// Prefix must be a DNS subdomain.
        /// Name must be 63 characters or less, begin and end with alphanumerics,
        /// with dashes (-), underscores (_), dots (.), and alphanumerics between.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// The cluster this node pool belongs to.
        /// </summary>
        [Input("bareMetalCluster", required: true)]
        public Input<string> BareMetalCluster { get; set; } = null!;

        /// <summary>
        /// The display name for the Bare Metal Node Pool.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The location of the resource.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The bare metal node pool name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Node pool configuration.
        /// Structure is documented below.
        /// </summary>
        [Input("nodePoolConfig", required: true)]
        public Input<Inputs.BareMetalNodePoolNodePoolConfigArgs> NodePoolConfig { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public BareMetalNodePoolArgs()
        {
        }
        public static new BareMetalNodePoolArgs Empty => new BareMetalNodePoolArgs();
    }

    public sealed class BareMetalNodePoolState : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Annotations on the Bare Metal Node Pool.
        /// This field has the same restrictions as Kubernetes annotations.
        /// The total size of all keys and values combined is limited to 256k.
        /// Key can have 2 segments: prefix (optional) and name (required),
        /// separated by a slash (/).
        /// Prefix must be a DNS subdomain.
        /// Name must be 63 characters or less, begin and end with alphanumerics,
        /// with dashes (-), underscores (_), dots (.), and alphanumerics between.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// The cluster this node pool belongs to.
        /// </summary>
        [Input("bareMetalCluster")]
        public Input<string>? BareMetalCluster { get; set; }

        /// <summary>
        /// The time the cluster was created, in RFC3339 text format.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The time the cluster was deleted, in RFC3339 text format.
        /// </summary>
        [Input("deleteTime")]
        public Input<string>? DeleteTime { get; set; }

        /// <summary>
        /// The display name for the Bare Metal Node Pool.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// This checksum is computed by the server based on the value of other
        /// fields, and may be sent on update and delete requests to ensure the
        /// client has an up-to-date value before proceeding.
        /// Allows clients to perform consistent read-modify-writes
        /// through optimistic concurrency control.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The location of the resource.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The bare metal node pool name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Node pool configuration.
        /// Structure is documented below.
        /// </summary>
        [Input("nodePoolConfig")]
        public Input<Inputs.BareMetalNodePoolNodePoolConfigGetArgs>? NodePoolConfig { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// If set, there are currently changes in flight to the Bare Metal User Cluster.
        /// </summary>
        [Input("reconciling")]
        public Input<bool>? Reconciling { get; set; }

        /// <summary>
        /// (Output)
        /// The lifecycle state of the condition.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("statuses")]
        private InputList<Inputs.BareMetalNodePoolStatusGetArgs>? _statuses;

        /// <summary>
        /// Specifies detailed node pool status.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.BareMetalNodePoolStatusGetArgs> Statuses
        {
            get => _statuses ?? (_statuses = new InputList<Inputs.BareMetalNodePoolStatusGetArgs>());
            set => _statuses = value;
        }

        /// <summary>
        /// The unique identifier of the Bare Metal Node Pool.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        /// <summary>
        /// The time the cluster was last updated, in RFC3339 text format.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public BareMetalNodePoolState()
        {
        }
        public static new BareMetalNodePoolState Empty => new BareMetalNodePoolState();
    }
}