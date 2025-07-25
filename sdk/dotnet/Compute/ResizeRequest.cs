// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    /// <summary>
    /// Represents a Managed Instance Group Resize Request
    /// 
    /// Resize Requests are the Managed Instance Group implementation of Dynamic Workload Scheduler Flex Start.
    /// 
    /// With Dynamic Workload Scheduler in Flex Start mode, you submit a GPU capacity request for your AI/ML jobs by indicating how many you need, a duration, and your preferred zone. Dynamic Workload Scheduler intelligently persists the request; once the capacity becomes available, it automatically provisions your VMs enabling your workloads to run continuously for the entire duration of the capacity allocation.
    /// 
    /// To get more information about ResizeRequest, see:
    /// 
    /// * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/instanceGroupManagerResizeRequests)
    /// * How-to Guides
    ///     * [About resize requests in a MIG](https://cloud.google.com/compute/docs/instance-groups/about-resize-requests-mig)
    /// 
    /// ## Example Usage
    /// 
    /// ### Compute Mig Resize Request
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var a3Dws = new Gcp.Compute.RegionInstanceTemplate("a3_dws", new()
    ///     {
    ///         Name = "a3-dws",
    ///         Region = "us-central1",
    ///         Description = "This template is used to create a mig instance that is compatible with DWS resize requests.",
    ///         InstanceDescription = "A3 GPU",
    ///         MachineType = "a3-highgpu-8g",
    ///         CanIpForward = false,
    ///         Scheduling = new Gcp.Compute.Inputs.RegionInstanceTemplateSchedulingArgs
    ///         {
    ///             AutomaticRestart = false,
    ///             OnHostMaintenance = "TERMINATE",
    ///         },
    ///         Disks = new[]
    ///         {
    ///             new Gcp.Compute.Inputs.RegionInstanceTemplateDiskArgs
    ///             {
    ///                 SourceImage = "cos-cloud/cos-121-lts",
    ///                 AutoDelete = true,
    ///                 Boot = true,
    ///                 DiskType = "pd-ssd",
    ///                 DiskSizeGb = 960,
    ///                 Mode = "READ_WRITE",
    ///             },
    ///         },
    ///         GuestAccelerators = new[]
    ///         {
    ///             new Gcp.Compute.Inputs.RegionInstanceTemplateGuestAcceleratorArgs
    ///             {
    ///                 Type = "nvidia-h100-80gb",
    ///                 Count = 8,
    ///             },
    ///         },
    ///         ReservationAffinity = new Gcp.Compute.Inputs.RegionInstanceTemplateReservationAffinityArgs
    ///         {
    ///             Type = "NO_RESERVATION",
    ///         },
    ///         ShieldedInstanceConfig = new Gcp.Compute.Inputs.RegionInstanceTemplateShieldedInstanceConfigArgs
    ///         {
    ///             EnableVtpm = true,
    ///             EnableIntegrityMonitoring = true,
    ///         },
    ///         NetworkInterfaces = new[]
    ///         {
    ///             new Gcp.Compute.Inputs.RegionInstanceTemplateNetworkInterfaceArgs
    ///             {
    ///                 Network = "default",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var a3DwsInstanceGroupManager = new Gcp.Compute.InstanceGroupManager("a3_dws", new()
    ///     {
    ///         Name = "a3-dws",
    ///         BaseInstanceName = "a3-dws",
    ///         Zone = "us-central1-a",
    ///         Versions = new[]
    ///         {
    ///             new Gcp.Compute.Inputs.InstanceGroupManagerVersionArgs
    ///             {
    ///                 InstanceTemplate = a3Dws.SelfLink,
    ///             },
    ///         },
    ///         InstanceLifecyclePolicy = new Gcp.Compute.Inputs.InstanceGroupManagerInstanceLifecyclePolicyArgs
    ///         {
    ///             DefaultActionOnFailure = "DO_NOTHING",
    ///         },
    ///         WaitForInstances = false,
    ///     });
    /// 
    ///     var a3ResizeRequest = new Gcp.Compute.ResizeRequest("a3_resize_request", new()
    ///     {
    ///         Name = "a3-dws",
    ///         InstanceGroupManager = a3DwsInstanceGroupManager.Name,
    ///         Zone = "us-central1-a",
    ///         Description = "Test resize request resource",
    ///         ResizeBy = 2,
    ///         RequestedRunDuration = new Gcp.Compute.Inputs.ResizeRequestRequestedRunDurationArgs
    ///         {
    ///             Seconds = "14400",
    ///             Nanos = 0,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ResizeRequest can be imported using any of these accepted formats:
    /// 
    /// * `projects/{{project}}/zones/{{zone}}/instanceGroupManagers/{{instance_group_manager}}/resizeRequests/{{name}}`
    /// 
    /// * `{{project}}/{{zone}}/{{instance_group_manager}}/{{name}}`
    /// 
    /// * `{{zone}}/{{instance_group_manager}}/{{name}}`
    /// 
    /// * `{{instance_group_manager}}/{{name}}`
    /// 
    /// When using the `pulumi import` command, ResizeRequest can be imported using one of the formats above. For example:
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/resizeRequest:ResizeRequest default projects/{{project}}/zones/{{zone}}/instanceGroupManagers/{{instance_group_manager}}/resizeRequests/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/resizeRequest:ResizeRequest default {{project}}/{{zone}}/{{instance_group_manager}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/resizeRequest:ResizeRequest default {{zone}}/{{instance_group_manager}}/{{name}}
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import gcp:compute/resizeRequest:ResizeRequest default {{instance_group_manager}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:compute/resizeRequest:ResizeRequest")]
    public partial class ResizeRequest : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The creation timestamp for this resize request in RFC3339 text format.
        /// </summary>
        [Output("creationTimestamp")]
        public Output<string> CreationTimestamp { get; private set; } = null!;

        /// <summary>
        /// An optional description of this resize-request.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The reference of the instance group manager this ResizeRequest is a part of.
        /// </summary>
        [Output("instanceGroupManager")]
        public Output<string> InstanceGroupManager { get; private set; } = null!;

        /// <summary>
        /// The name of this resize request. The name must be 1-63 characters long, and comply with RFC1035.
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
        /// Requested run duration for instances that will be created by this request. At the end of the run duration instance will be deleted.
        /// Structure is documented below.
        /// </summary>
        [Output("requestedRunDuration")]
        public Output<Outputs.ResizeRequestRequestedRunDuration?> RequestedRunDuration { get; private set; } = null!;

        /// <summary>
        /// The number of instances to be created by this resize request. The group's target size will be increased by this number.
        /// </summary>
        [Output("resizeBy")]
        public Output<int> ResizeBy { get; private set; } = null!;

        /// <summary>
        /// Current state of the request.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Status of the request.
        /// Structure is documented below.
        /// </summary>
        [Output("statuses")]
        public Output<ImmutableArray<Outputs.ResizeRequestStatus>> Statuses { get; private set; } = null!;

        /// <summary>
        /// The reference of the compute zone scoping this request. If it is not provided, the provider zone is used.
        /// </summary>
        [Output("zone")]
        public Output<string> Zone { get; private set; } = null!;


        /// <summary>
        /// Create a ResizeRequest resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResizeRequest(string name, ResizeRequestArgs args, CustomResourceOptions? options = null)
            : base("gcp:compute/resizeRequest:ResizeRequest", name, args ?? new ResizeRequestArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResizeRequest(string name, Input<string> id, ResizeRequestState? state = null, CustomResourceOptions? options = null)
            : base("gcp:compute/resizeRequest:ResizeRequest", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ResizeRequest resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResizeRequest Get(string name, Input<string> id, ResizeRequestState? state = null, CustomResourceOptions? options = null)
        {
            return new ResizeRequest(name, id, state, options);
        }
    }

    public sealed class ResizeRequestArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An optional description of this resize-request.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The reference of the instance group manager this ResizeRequest is a part of.
        /// </summary>
        [Input("instanceGroupManager", required: true)]
        public Input<string> InstanceGroupManager { get; set; } = null!;

        /// <summary>
        /// The name of this resize request. The name must be 1-63 characters long, and comply with RFC1035.
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
        /// Requested run duration for instances that will be created by this request. At the end of the run duration instance will be deleted.
        /// Structure is documented below.
        /// </summary>
        [Input("requestedRunDuration")]
        public Input<Inputs.ResizeRequestRequestedRunDurationArgs>? RequestedRunDuration { get; set; }

        /// <summary>
        /// The number of instances to be created by this resize request. The group's target size will be increased by this number.
        /// </summary>
        [Input("resizeBy", required: true)]
        public Input<int> ResizeBy { get; set; } = null!;

        /// <summary>
        /// The reference of the compute zone scoping this request. If it is not provided, the provider zone is used.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public ResizeRequestArgs()
        {
        }
        public static new ResizeRequestArgs Empty => new ResizeRequestArgs();
    }

    public sealed class ResizeRequestState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The creation timestamp for this resize request in RFC3339 text format.
        /// </summary>
        [Input("creationTimestamp")]
        public Input<string>? CreationTimestamp { get; set; }

        /// <summary>
        /// An optional description of this resize-request.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The reference of the instance group manager this ResizeRequest is a part of.
        /// </summary>
        [Input("instanceGroupManager")]
        public Input<string>? InstanceGroupManager { get; set; }

        /// <summary>
        /// The name of this resize request. The name must be 1-63 characters long, and comply with RFC1035.
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
        /// Requested run duration for instances that will be created by this request. At the end of the run duration instance will be deleted.
        /// Structure is documented below.
        /// </summary>
        [Input("requestedRunDuration")]
        public Input<Inputs.ResizeRequestRequestedRunDurationGetArgs>? RequestedRunDuration { get; set; }

        /// <summary>
        /// The number of instances to be created by this resize request. The group's target size will be increased by this number.
        /// </summary>
        [Input("resizeBy")]
        public Input<int>? ResizeBy { get; set; }

        /// <summary>
        /// Current state of the request.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("statuses")]
        private InputList<Inputs.ResizeRequestStatusGetArgs>? _statuses;

        /// <summary>
        /// Status of the request.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.ResizeRequestStatusGetArgs> Statuses
        {
            get => _statuses ?? (_statuses = new InputList<Inputs.ResizeRequestStatusGetArgs>());
            set => _statuses = value;
        }

        /// <summary>
        /// The reference of the compute zone scoping this request. If it is not provided, the provider zone is used.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public ResizeRequestState()
        {
        }
        public static new ResizeRequestState Empty => new ResizeRequestState();
    }
}
