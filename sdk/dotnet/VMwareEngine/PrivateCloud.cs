// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.VMwareEngine
{
    /// <summary>
    /// ## Example Usage
    /// ### Vmware Engine Private Cloud Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var pc_nw = new Gcp.VMwareEngine.Network("pc-nw", new()
    ///     {
    ///         Location = "us-west1",
    ///         Type = "LEGACY",
    ///         Description = "PC network description.",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var vmw_engine_pc = new Gcp.VMwareEngine.PrivateCloud("vmw-engine-pc", new()
    ///     {
    ///         Location = "us-west1-a",
    ///         Description = "Sample test PC.",
    ///         NetworkConfig = new Gcp.VMwareEngine.Inputs.PrivateCloudNetworkConfigArgs
    ///         {
    ///             ManagementCidr = "192.168.30.0/24",
    ///             VmwareEngineNetwork = pc_nw.Id,
    ///         },
    ///         ManagementCluster = new Gcp.VMwareEngine.Inputs.PrivateCloudManagementClusterArgs
    ///         {
    ///             ClusterId = "sample-mgmt-cluster",
    ///             NodeTypeConfigs = new[]
    ///             {
    ///                 new Gcp.VMwareEngine.Inputs.PrivateCloudManagementClusterNodeTypeConfigArgs
    ///                 {
    ///                     NodeTypeId = "standard-72",
    ///                     NodeCount = 3,
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
    /// ### Vmware Engine Private Cloud Full
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var pc_nw = new Gcp.VMwareEngine.Network("pc-nw", new()
    ///     {
    ///         Location = "us-west1",
    ///         Type = "LEGACY",
    ///         Description = "PC network description.",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = google_beta,
    ///     });
    /// 
    ///     var vmw_engine_pc = new Gcp.VMwareEngine.PrivateCloud("vmw-engine-pc", new()
    ///     {
    ///         Location = "us-west1-a",
    ///         Description = "Sample test PC.",
    ///         NetworkConfig = new Gcp.VMwareEngine.Inputs.PrivateCloudNetworkConfigArgs
    ///         {
    ///             ManagementCidr = "192.168.30.0/24",
    ///             VmwareEngineNetwork = pc_nw.Id,
    ///         },
    ///         ManagementCluster = new Gcp.VMwareEngine.Inputs.PrivateCloudManagementClusterArgs
    ///         {
    ///             ClusterId = "sample-mgmt-cluster",
    ///             NodeTypeConfigs = new[]
    ///             {
    ///                 new Gcp.VMwareEngine.Inputs.PrivateCloudManagementClusterNodeTypeConfigArgs
    ///                 {
    ///                     NodeTypeId = "standard-72",
    ///                     NodeCount = 3,
    ///                     CustomCoreCount = 32,
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
    /// PrivateCloud can be imported using any of these accepted formats
    /// 
    /// ```sh
    ///  $ pulumi import gcp:vmwareengine/privateCloud:PrivateCloud default projects/{{project}}/locations/{{location}}/privateClouds/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:vmwareengine/privateCloud:PrivateCloud default {{project}}/{{location}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:vmwareengine/privateCloud:PrivateCloud default {{location}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:vmwareengine/privateCloud:PrivateCloud")]
    public partial class PrivateCloud : global::Pulumi.CustomResource
    {
        /// <summary>
        /// User-provided description for this private cloud.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Details about a HCX Cloud Manager appliance.
        /// Structure is documented below.
        /// </summary>
        [Output("hcxes")]
        public Output<ImmutableArray<Outputs.PrivateCloudHcx>> Hcxes { get; private set; } = null!;

        /// <summary>
        /// The location where the PrivateCloud should reside.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The management cluster for this private cloud. This used for creating and managing the default cluster.
        /// Structure is documented below.
        /// </summary>
        [Output("managementCluster")]
        public Output<Outputs.PrivateCloudManagementCluster> ManagementCluster { get; private set; } = null!;

        /// <summary>
        /// The ID of the PrivateCloud.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Network configuration in the consumer project with which the peering has to be done.
        /// Structure is documented below.
        /// </summary>
        [Output("networkConfig")]
        public Output<Outputs.PrivateCloudNetworkConfig> NetworkConfig { get; private set; } = null!;

        /// <summary>
        /// Details about a NSX Manager appliance.
        /// Structure is documented below.
        /// </summary>
        [Output("nsxes")]
        public Output<ImmutableArray<Outputs.PrivateCloudNsx>> Nsxes { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// State of the appliance.
        /// Possible values are: `ACTIVE`, `CREATING`.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// System-generated unique identifier for the resource.
        /// </summary>
        [Output("uid")]
        public Output<string> Uid { get; private set; } = null!;

        /// <summary>
        /// Details about a vCenter Server management appliance.
        /// Structure is documented below.
        /// </summary>
        [Output("vcenters")]
        public Output<ImmutableArray<Outputs.PrivateCloudVcenter>> Vcenters { get; private set; } = null!;


        /// <summary>
        /// Create a PrivateCloud resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PrivateCloud(string name, PrivateCloudArgs args, CustomResourceOptions? options = null)
            : base("gcp:vmwareengine/privateCloud:PrivateCloud", name, args ?? new PrivateCloudArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PrivateCloud(string name, Input<string> id, PrivateCloudState? state = null, CustomResourceOptions? options = null)
            : base("gcp:vmwareengine/privateCloud:PrivateCloud", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PrivateCloud resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PrivateCloud Get(string name, Input<string> id, PrivateCloudState? state = null, CustomResourceOptions? options = null)
        {
            return new PrivateCloud(name, id, state, options);
        }
    }

    public sealed class PrivateCloudArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User-provided description for this private cloud.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The location where the PrivateCloud should reside.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The management cluster for this private cloud. This used for creating and managing the default cluster.
        /// Structure is documented below.
        /// </summary>
        [Input("managementCluster", required: true)]
        public Input<Inputs.PrivateCloudManagementClusterArgs> ManagementCluster { get; set; } = null!;

        /// <summary>
        /// The ID of the PrivateCloud.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Network configuration in the consumer project with which the peering has to be done.
        /// Structure is documented below.
        /// </summary>
        [Input("networkConfig", required: true)]
        public Input<Inputs.PrivateCloudNetworkConfigArgs> NetworkConfig { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public PrivateCloudArgs()
        {
        }
        public static new PrivateCloudArgs Empty => new PrivateCloudArgs();
    }

    public sealed class PrivateCloudState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User-provided description for this private cloud.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("hcxes")]
        private InputList<Inputs.PrivateCloudHcxGetArgs>? _hcxes;

        /// <summary>
        /// Details about a HCX Cloud Manager appliance.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PrivateCloudHcxGetArgs> Hcxes
        {
            get => _hcxes ?? (_hcxes = new InputList<Inputs.PrivateCloudHcxGetArgs>());
            set => _hcxes = value;
        }

        /// <summary>
        /// The location where the PrivateCloud should reside.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The management cluster for this private cloud. This used for creating and managing the default cluster.
        /// Structure is documented below.
        /// </summary>
        [Input("managementCluster")]
        public Input<Inputs.PrivateCloudManagementClusterGetArgs>? ManagementCluster { get; set; }

        /// <summary>
        /// The ID of the PrivateCloud.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Network configuration in the consumer project with which the peering has to be done.
        /// Structure is documented below.
        /// </summary>
        [Input("networkConfig")]
        public Input<Inputs.PrivateCloudNetworkConfigGetArgs>? NetworkConfig { get; set; }

        [Input("nsxes")]
        private InputList<Inputs.PrivateCloudNsxGetArgs>? _nsxes;

        /// <summary>
        /// Details about a NSX Manager appliance.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PrivateCloudNsxGetArgs> Nsxes
        {
            get => _nsxes ?? (_nsxes = new InputList<Inputs.PrivateCloudNsxGetArgs>());
            set => _nsxes = value;
        }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// State of the appliance.
        /// Possible values are: `ACTIVE`, `CREATING`.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// System-generated unique identifier for the resource.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        [Input("vcenters")]
        private InputList<Inputs.PrivateCloudVcenterGetArgs>? _vcenters;

        /// <summary>
        /// Details about a vCenter Server management appliance.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PrivateCloudVcenterGetArgs> Vcenters
        {
            get => _vcenters ?? (_vcenters = new InputList<Inputs.PrivateCloudVcenterGetArgs>());
            set => _vcenters = value;
        }

        public PrivateCloudState()
        {
        }
        public static new PrivateCloudState Empty => new PrivateCloudState();
    }
}