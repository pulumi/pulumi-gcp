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
    /// An Anthos node pool running on Azure.
    /// 
    /// For more information, see:
    /// * [Multicloud overview](https://cloud.google.com/kubernetes-engine/multi-cloud/docs)
    /// ## Example Usage
    /// 
    /// ### Basic_azure_node_pool
    /// A basic example of a containerazure azure node pool
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var versions = Gcp.Container.GetAzureVersions.Invoke(new()
    ///     {
    ///         Project = "my-project-name",
    ///         Location = "us-west1",
    ///     });
    /// 
    ///     var basic = new Gcp.Container.AzureClient("basic", new()
    ///     {
    ///         ApplicationId = "12345678-1234-1234-1234-123456789111",
    ///         Location = "us-west1",
    ///         Name = "client-name",
    ///         TenantId = "12345678-1234-1234-1234-123456789111",
    ///         Project = "my-project-name",
    ///     });
    /// 
    ///     var primary = new Gcp.Container.AzureCluster("primary", new()
    ///     {
    ///         Authorization = new Gcp.Container.Inputs.AzureClusterAuthorizationArgs
    ///         {
    ///             AdminUsers = new[]
    ///             {
    ///                 new Gcp.Container.Inputs.AzureClusterAuthorizationAdminUserArgs
    ///                 {
    ///                     Username = "mmv2@google.com",
    ///                 },
    ///             },
    ///         },
    ///         AzureRegion = "westus2",
    ///         Client = basic.Name.Apply(name =&gt; $"projects/my-project-number/locations/us-west1/azureClients/{name}"),
    ///         ControlPlane = new Gcp.Container.Inputs.AzureClusterControlPlaneArgs
    ///         {
    ///             SshConfig = new Gcp.Container.Inputs.AzureClusterControlPlaneSshConfigArgs
    ///             {
    ///                 AuthorizedKey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQC8yaayO6lnb2v+SedxUMa2c8vtIEzCzBjM3EJJsv8Vm9zUDWR7dXWKoNGARUb2mNGXASvI6mFIDXTIlkQ0poDEPpMaXR0g2cb5xT8jAAJq7fqXL3+0rcJhY/uigQ+MrT6s+ub0BFVbsmGHNrMQttXX9gtmwkeAEvj3mra9e5pkNf90qlKnZz6U0SVArxVsLx07vHPHDIYrl0OPG4zUREF52igbBPiNrHJFDQJT/4YlDMJmo/QT/A1D6n9ocemvZSzhRx15/Arjowhr+VVKSbaxzPtEfY0oIg2SrqJnnr/l3Du5qIefwh5VmCZe4xopPUaDDoOIEFriZ88sB+3zz8ib8sk8zJJQCgeP78tQvXCgS+4e5W3TUg9mxjB6KjXTyHIVhDZqhqde0OI3Fy1UuVzRUwnBaLjBnAwP5EoFQGRmDYk/rEYe7HTmovLeEBUDQocBQKT4Ripm/xJkkWY7B07K/tfo56dGUCkvyIVXKBInCh+dLK7gZapnd4UWkY0xBYcwo1geMLRq58iFTLA2j/JmpmHXp7m0l7jJii7d44uD3tTIFYThn7NlOnvhLim/YcBK07GMGIN7XwrrKZKmxXaspw6KBWVhzuw1UPxctxshYEaMLfFg/bwOw8HvMPr9VtrElpSB7oiOh91PDIPdPBgHCi7N2QgQ5l/ZDBHieSpNrQ== thomasrodgers",
    ///             },
    ///             SubnetId = "/subscriptions/12345678-1234-1234-1234-123456789111/resourceGroups/my--dev-byo/providers/Microsoft.Network/virtualNetworks/my--dev-vnet/subnets/default",
    ///             Version = versions.Apply(getAzureVersionsResult =&gt; getAzureVersionsResult.ValidVersions[0]),
    ///         },
    ///         Fleet = new Gcp.Container.Inputs.AzureClusterFleetArgs
    ///         {
    ///             Project = "my-project-number",
    ///         },
    ///         Location = "us-west1",
    ///         Name = "name",
    ///         Networking = new Gcp.Container.Inputs.AzureClusterNetworkingArgs
    ///         {
    ///             PodAddressCidrBlocks = new[]
    ///             {
    ///                 "10.200.0.0/16",
    ///             },
    ///             ServiceAddressCidrBlocks = new[]
    ///             {
    ///                 "10.32.0.0/24",
    ///             },
    ///             VirtualNetworkId = "/subscriptions/12345678-1234-1234-1234-123456789111/resourceGroups/my--dev-byo/providers/Microsoft.Network/virtualNetworks/my--dev-vnet",
    ///         },
    ///         ResourceGroupId = "/subscriptions/12345678-1234-1234-1234-123456789111/resourceGroups/my--dev-cluster",
    ///         Project = "my-project-name",
    ///     });
    /// 
    ///     var primaryAzureNodePool = new Gcp.Container.AzureNodePool("primary", new()
    ///     {
    ///         Autoscaling = new Gcp.Container.Inputs.AzureNodePoolAutoscalingArgs
    ///         {
    ///             MaxNodeCount = 3,
    ///             MinNodeCount = 2,
    ///         },
    ///         Cluster = primary.Name,
    ///         Config = new Gcp.Container.Inputs.AzureNodePoolConfigArgs
    ///         {
    ///             SshConfig = new Gcp.Container.Inputs.AzureNodePoolConfigSshConfigArgs
    ///             {
    ///                 AuthorizedKey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQC8yaayO6lnb2v+SedxUMa2c8vtIEzCzBjM3EJJsv8Vm9zUDWR7dXWKoNGARUb2mNGXASvI6mFIDXTIlkQ0poDEPpMaXR0g2cb5xT8jAAJq7fqXL3+0rcJhY/uigQ+MrT6s+ub0BFVbsmGHNrMQttXX9gtmwkeAEvj3mra9e5pkNf90qlKnZz6U0SVArxVsLx07vHPHDIYrl0OPG4zUREF52igbBPiNrHJFDQJT/4YlDMJmo/QT/A1D6n9ocemvZSzhRx15/Arjowhr+VVKSbaxzPtEfY0oIg2SrqJnnr/l3Du5qIefwh5VmCZe4xopPUaDDoOIEFriZ88sB+3zz8ib8sk8zJJQCgeP78tQvXCgS+4e5W3TUg9mxjB6KjXTyHIVhDZqhqde0OI3Fy1UuVzRUwnBaLjBnAwP5EoFQGRmDYk/rEYe7HTmovLeEBUDQocBQKT4Ripm/xJkkWY7B07K/tfo56dGUCkvyIVXKBInCh+dLK7gZapnd4UWkY0xBYcwo1geMLRq58iFTLA2j/JmpmHXp7m0l7jJii7d44uD3tTIFYThn7NlOnvhLim/YcBK07GMGIN7XwrrKZKmxXaspw6KBWVhzuw1UPxctxshYEaMLfFg/bwOw8HvMPr9VtrElpSB7oiOh91PDIPdPBgHCi7N2QgQ5l/ZDBHieSpNrQ== thomasrodgers",
    ///             },
    ///             ProxyConfig = new Gcp.Container.Inputs.AzureNodePoolConfigProxyConfigArgs
    ///             {
    ///                 ResourceGroupId = "/subscriptions/12345678-1234-1234-1234-123456789111/resourceGroups/my--dev-cluster",
    ///                 SecretId = "https://my--dev-keyvault.vault.azure.net/secrets/my--dev-secret/0000000000000000000000000000000000",
    ///             },
    ///             RootVolume = new Gcp.Container.Inputs.AzureNodePoolConfigRootVolumeArgs
    ///             {
    ///                 SizeGib = 32,
    ///             },
    ///             Tags = 
    ///             {
    ///                 { "owner", "mmv2" },
    ///             },
    ///             Labels = 
    ///             {
    ///                 { "key_one", "label_one" },
    ///             },
    ///             VmSize = "Standard_DS2_v2",
    ///         },
    ///         Location = "us-west1",
    ///         MaxPodsConstraint = new Gcp.Container.Inputs.AzureNodePoolMaxPodsConstraintArgs
    ///         {
    ///             MaxPodsPerNode = 110,
    ///         },
    ///         Name = "node-pool-name",
    ///         SubnetId = "/subscriptions/12345678-1234-1234-1234-123456789111/resourceGroups/my--dev-byo/providers/Microsoft.Network/virtualNetworks/my--dev-vnet/subnets/default",
    ///         Version = versions.Apply(getAzureVersionsResult =&gt; getAzureVersionsResult.ValidVersions[0]),
    ///         Annotations = 
    ///         {
    ///             { "annotation-one", "value-one" },
    ///         },
    ///         Management = new Gcp.Container.Inputs.AzureNodePoolManagementArgs
    ///         {
    ///             AutoRepair = true,
    ///         },
    ///         Project = "my-project-name",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// NodePool can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/locations/{{location}}/azureClusters/{{cluster}}/azureNodePools/{{name}}`
    /// 
    /// * `{{project}}/{{location}}/{{cluster}}/{{name}}`
    /// 
    /// * `{{location}}/{{cluster}}/{{name}}`
    /// 
    /// When using the `pulumi import` command, NodePool can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:container/azureNodePool:AzureNodePool default projects/{{project}}/locations/{{location}}/azureClusters/{{cluster}}/azureNodePools/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:container/azureNodePool:AzureNodePool default {{project}}/{{location}}/{{cluster}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:container/azureNodePool:AzureNodePool default {{location}}/{{cluster}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:container/azureNodePool:AzureNodePool")]
    public partial class AzureNodePool : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Optional. Annotations on the node pool. This field has the same restrictions as Kubernetes annotations. The total size
        /// of all keys and values combined is limited to 256k. Keys can have 2 segments: prefix (optional) and name (required),
        /// separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with
        /// alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between. **Note**: This field is
        /// non-authoritative, and will only manage the annotations present in your configuration. Please refer to the field
        /// `effective_annotations` for all of the annotations present on the resource.
        /// </summary>
        [Output("annotations")]
        public Output<ImmutableDictionary<string, string>?> Annotations { get; private set; } = null!;

        /// <summary>
        /// Autoscaler configuration for this node pool.
        /// </summary>
        [Output("autoscaling")]
        public Output<Outputs.AzureNodePoolAutoscaling> Autoscaling { get; private set; } = null!;

        /// <summary>
        /// Optional. The Azure availability zone of the nodes in this nodepool. When unspecified, it defaults to `1`.
        /// </summary>
        [Output("azureAvailabilityZone")]
        public Output<string> AzureAvailabilityZone { get; private set; } = null!;

        /// <summary>
        /// The azureCluster for the resource
        /// </summary>
        [Output("cluster")]
        public Output<string> Cluster { get; private set; } = null!;

        /// <summary>
        /// The node configuration of the node pool.
        /// </summary>
        [Output("config")]
        public Output<Outputs.AzureNodePoolConfig> Config { get; private set; } = null!;

        /// <summary>
        /// Output only. The time at which this node pool was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        [Output("effectiveAnnotations")]
        public Output<ImmutableDictionary<string, string>> EffectiveAnnotations { get; private set; } = null!;

        /// <summary>
        /// Allows clients to perform consistent read-modify-writes through optimistic concurrency control. May be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The Management configuration for this node pool.
        /// </summary>
        [Output("management")]
        public Output<Outputs.AzureNodePoolManagement> Management { get; private set; } = null!;

        /// <summary>
        /// The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
        /// </summary>
        [Output("maxPodsConstraint")]
        public Output<Outputs.AzureNodePoolMaxPodsConstraint> MaxPodsConstraint { get; private set; } = null!;

        /// <summary>
        /// The name of this resource.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The project for the resource
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Output only. If set, there are currently pending changes to the node pool.
        /// </summary>
        [Output("reconciling")]
        public Output<bool> Reconciling { get; private set; } = null!;

        /// <summary>
        /// Output only. The current state of the node pool. Possible values: STATE_UNSPECIFIED, PROVISIONING, RUNNING, RECONCILING, STOPPING, ERROR, DEGRADED
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// The ARM ID of the subnet where the node pool VMs run. Make sure it's a subnet under the virtual network in the cluster configuration.
        /// </summary>
        [Output("subnetId")]
        public Output<string> SubnetId { get; private set; } = null!;

        /// <summary>
        /// Output only. A globally unique identifier for the node pool.
        /// </summary>
        [Output("uid")]
        public Output<string> Uid { get; private set; } = null!;

        /// <summary>
        /// Output only. The time at which this node pool was last updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;

        /// <summary>
        /// The Kubernetes version (e.g. `1.19.10-gke.1000`) running on this node pool.
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;


        /// <summary>
        /// Create a AzureNodePool resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AzureNodePool(string name, AzureNodePoolArgs args, CustomResourceOptions? options = null)
            : base("gcp:container/azureNodePool:AzureNodePool", name, args ?? new AzureNodePoolArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AzureNodePool(string name, Input<string> id, AzureNodePoolState? state = null, CustomResourceOptions? options = null)
            : base("gcp:container/azureNodePool:AzureNodePool", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AzureNodePool resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AzureNodePool Get(string name, Input<string> id, AzureNodePoolState? state = null, CustomResourceOptions? options = null)
        {
            return new AzureNodePool(name, id, state, options);
        }
    }

    public sealed class AzureNodePoolArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Optional. Annotations on the node pool. This field has the same restrictions as Kubernetes annotations. The total size
        /// of all keys and values combined is limited to 256k. Keys can have 2 segments: prefix (optional) and name (required),
        /// separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with
        /// alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between. **Note**: This field is
        /// non-authoritative, and will only manage the annotations present in your configuration. Please refer to the field
        /// `effective_annotations` for all of the annotations present on the resource.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// Autoscaler configuration for this node pool.
        /// </summary>
        [Input("autoscaling", required: true)]
        public Input<Inputs.AzureNodePoolAutoscalingArgs> Autoscaling { get; set; } = null!;

        /// <summary>
        /// Optional. The Azure availability zone of the nodes in this nodepool. When unspecified, it defaults to `1`.
        /// </summary>
        [Input("azureAvailabilityZone")]
        public Input<string>? AzureAvailabilityZone { get; set; }

        /// <summary>
        /// The azureCluster for the resource
        /// </summary>
        [Input("cluster", required: true)]
        public Input<string> Cluster { get; set; } = null!;

        /// <summary>
        /// The node configuration of the node pool.
        /// </summary>
        [Input("config", required: true)]
        public Input<Inputs.AzureNodePoolConfigArgs> Config { get; set; } = null!;

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The Management configuration for this node pool.
        /// </summary>
        [Input("management")]
        public Input<Inputs.AzureNodePoolManagementArgs>? Management { get; set; }

        /// <summary>
        /// The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
        /// </summary>
        [Input("maxPodsConstraint", required: true)]
        public Input<Inputs.AzureNodePoolMaxPodsConstraintArgs> MaxPodsConstraint { get; set; } = null!;

        /// <summary>
        /// The name of this resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project for the resource
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The ARM ID of the subnet where the node pool VMs run. Make sure it's a subnet under the virtual network in the cluster configuration.
        /// </summary>
        [Input("subnetId", required: true)]
        public Input<string> SubnetId { get; set; } = null!;

        /// <summary>
        /// The Kubernetes version (e.g. `1.19.10-gke.1000`) running on this node pool.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public AzureNodePoolArgs()
        {
        }
        public static new AzureNodePoolArgs Empty => new AzureNodePoolArgs();
    }

    public sealed class AzureNodePoolState : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;

        /// <summary>
        /// Optional. Annotations on the node pool. This field has the same restrictions as Kubernetes annotations. The total size
        /// of all keys and values combined is limited to 256k. Keys can have 2 segments: prefix (optional) and name (required),
        /// separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with
        /// alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between. **Note**: This field is
        /// non-authoritative, and will only manage the annotations present in your configuration. Please refer to the field
        /// `effective_annotations` for all of the annotations present on the resource.
        /// </summary>
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        /// <summary>
        /// Autoscaler configuration for this node pool.
        /// </summary>
        [Input("autoscaling")]
        public Input<Inputs.AzureNodePoolAutoscalingGetArgs>? Autoscaling { get; set; }

        /// <summary>
        /// Optional. The Azure availability zone of the nodes in this nodepool. When unspecified, it defaults to `1`.
        /// </summary>
        [Input("azureAvailabilityZone")]
        public Input<string>? AzureAvailabilityZone { get; set; }

        /// <summary>
        /// The azureCluster for the resource
        /// </summary>
        [Input("cluster")]
        public Input<string>? Cluster { get; set; }

        /// <summary>
        /// The node configuration of the node pool.
        /// </summary>
        [Input("config")]
        public Input<Inputs.AzureNodePoolConfigGetArgs>? Config { get; set; }

        /// <summary>
        /// Output only. The time at which this node pool was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        [Input("effectiveAnnotations")]
        private InputMap<string>? _effectiveAnnotations;
        public InputMap<string> EffectiveAnnotations
        {
            get => _effectiveAnnotations ?? (_effectiveAnnotations = new InputMap<string>());
            set => _effectiveAnnotations = value;
        }

        /// <summary>
        /// Allows clients to perform consistent read-modify-writes through optimistic concurrency control. May be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The Management configuration for this node pool.
        /// </summary>
        [Input("management")]
        public Input<Inputs.AzureNodePoolManagementGetArgs>? Management { get; set; }

        /// <summary>
        /// The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
        /// </summary>
        [Input("maxPodsConstraint")]
        public Input<Inputs.AzureNodePoolMaxPodsConstraintGetArgs>? MaxPodsConstraint { get; set; }

        /// <summary>
        /// The name of this resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project for the resource
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Output only. If set, there are currently pending changes to the node pool.
        /// </summary>
        [Input("reconciling")]
        public Input<bool>? Reconciling { get; set; }

        /// <summary>
        /// Output only. The current state of the node pool. Possible values: STATE_UNSPECIFIED, PROVISIONING, RUNNING, RECONCILING, STOPPING, ERROR, DEGRADED
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The ARM ID of the subnet where the node pool VMs run. Make sure it's a subnet under the virtual network in the cluster configuration.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        /// <summary>
        /// Output only. A globally unique identifier for the node pool.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        /// <summary>
        /// Output only. The time at which this node pool was last updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        /// <summary>
        /// The Kubernetes version (e.g. `1.19.10-gke.1000`) running on this node pool.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public AzureNodePoolState()
        {
        }
        public static new AzureNodePoolState Empty => new AzureNodePoolState();
    }
}
