// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    public static class GetRegionInstanceTemplate
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var generic = Gcp.Compute.GetRegionInstanceTemplate.Invoke(new()
        ///     {
        ///         Name = "generic-tpl-20200107",
        ///     });
        /// 
        ///     var generic_regex = Gcp.Compute.GetRegionInstanceTemplate.Invoke(new()
        ///     {
        ///         Filter = "name != generic-tpl-20200107",
        ///         MostRecent = true,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetRegionInstanceTemplateResult> InvokeAsync(GetRegionInstanceTemplateArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRegionInstanceTemplateResult>("gcp:compute/getRegionInstanceTemplate:getRegionInstanceTemplate", args ?? new GetRegionInstanceTemplateArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var generic = Gcp.Compute.GetRegionInstanceTemplate.Invoke(new()
        ///     {
        ///         Name = "generic-tpl-20200107",
        ///     });
        /// 
        ///     var generic_regex = Gcp.Compute.GetRegionInstanceTemplate.Invoke(new()
        ///     {
        ///         Filter = "name != generic-tpl-20200107",
        ///         MostRecent = true,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetRegionInstanceTemplateResult> Invoke(GetRegionInstanceTemplateInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRegionInstanceTemplateResult>("gcp:compute/getRegionInstanceTemplate:getRegionInstanceTemplate", args ?? new GetRegionInstanceTemplateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRegionInstanceTemplateArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A filter to retrieve the instance templates.
        /// See [gcloud topic filters](https://cloud.google.com/sdk/gcloud/reference/topic/filters) for reference.
        /// If multiple instance templates match, either adjust the filter or specify `most_recent`. One of `name` or `filter` must be provided.
        /// </summary>
        [Input("filter")]
        public string? Filter { get; set; }

        /// <summary>
        /// If `filter` is provided, ensures the most recent template is returned when multiple instance templates match. One of `name` or `filter` must be provided.
        /// </summary>
        [Input("mostRecent")]
        public bool? MostRecent { get; set; }

        /// <summary>
        /// The name of the instance template. One of `name` or `filter` must be provided.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If `project` is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        /// <summary>
        /// The Region in which the resource belongs.
        /// If `region` is not provided, the provider region is used.
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        public GetRegionInstanceTemplateArgs()
        {
        }
        public static new GetRegionInstanceTemplateArgs Empty => new GetRegionInstanceTemplateArgs();
    }

    public sealed class GetRegionInstanceTemplateInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A filter to retrieve the instance templates.
        /// See [gcloud topic filters](https://cloud.google.com/sdk/gcloud/reference/topic/filters) for reference.
        /// If multiple instance templates match, either adjust the filter or specify `most_recent`. One of `name` or `filter` must be provided.
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        /// <summary>
        /// If `filter` is provided, ensures the most recent template is returned when multiple instance templates match. One of `name` or `filter` must be provided.
        /// </summary>
        [Input("mostRecent")]
        public Input<bool>? MostRecent { get; set; }

        /// <summary>
        /// The name of the instance template. One of `name` or `filter` must be provided.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If `project` is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The Region in which the resource belongs.
        /// If `region` is not provided, the provider region is used.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public GetRegionInstanceTemplateInvokeArgs()
        {
        }
        public static new GetRegionInstanceTemplateInvokeArgs Empty => new GetRegionInstanceTemplateInvokeArgs();
    }


    [OutputType]
    public sealed class GetRegionInstanceTemplateResult
    {
        public readonly ImmutableArray<Outputs.GetRegionInstanceTemplateAdvancedMachineFeatureResult> AdvancedMachineFeatures;
        /// <summary>
        /// Whether to allow sending and receiving of
        /// packets with non-matching source or destination IPs. This defaults to false.
        /// </summary>
        public readonly bool CanIpForward;
        /// <summary>
        /// Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRegionInstanceTemplateConfidentialInstanceConfigResult> ConfidentialInstanceConfigs;
        /// <summary>
        /// A brief description of this resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Disks to attach to instances created from this template.
        /// This can be specified multiple times for multiple disks. Structure is
        /// documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRegionInstanceTemplateDiskResult> Disks;
        /// <summary>
        /// Enable [Virtual Displays](https://cloud.google.com/compute/docs/instances/enable-instance-virtual-display#verify_display_driver) on this instance.
        /// **Note**: `allow_stopping_for_update` must be set to true in order to update this field.
        /// </summary>
        public readonly bool EnableDisplay;
        public readonly string? Filter;
        /// <summary>
        /// List of the type and count of accelerator cards attached to the instance. Structure documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRegionInstanceTemplateGuestAcceleratorResult> GuestAccelerators;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A brief description to use for instances
        /// created from this template.
        /// </summary>
        public readonly string InstanceDescription;
        /// <summary>
        /// (Optional) A set of ket/value label pairs to assign to disk created from
        /// this template
        /// </summary>
        public readonly ImmutableDictionary<string, string> Labels;
        /// <summary>
        /// The machine type to create.
        /// </summary>
        public readonly string MachineType;
        /// <summary>
        /// Metadata key/value pairs to make available from
        /// within instances created from this template.
        /// </summary>
        public readonly ImmutableDictionary<string, object> Metadata;
        /// <summary>
        /// The unique fingerprint of the metadata.
        /// </summary>
        public readonly string MetadataFingerprint;
        /// <summary>
        /// An alternative to using the
        /// startup-script metadata key, mostly to match the compute_instance resource.
        /// This replaces the startup-script metadata key on the created instance and
        /// thus the two mechanisms are not allowed to be used simultaneously.
        /// </summary>
        public readonly string MetadataStartupScript;
        /// <summary>
        /// Specifies a minimum CPU platform. Applicable values are the friendly names of CPU platforms, such as
        /// `Intel Haswell` or `Intel Skylake`. See the complete list [here](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform).
        /// </summary>
        public readonly string MinCpuPlatform;
        public readonly bool? MostRecent;
        public readonly string? Name;
        /// <summary>
        /// Creates a unique name beginning with the specified
        /// prefix. Conflicts with `name`.
        /// </summary>
        public readonly string NamePrefix;
        /// <summary>
        /// Networks to attach to instances created from
        /// this template. This can be specified multiple times for multiple networks.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRegionInstanceTemplateNetworkInterfaceResult> NetworkInterfaces;
        /// <summary>
        /// The network performance configuration setting
        /// for the instance, if set. Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRegionInstanceTemplateNetworkPerformanceConfigResult> NetworkPerformanceConfigs;
        /// <summary>
        /// The ID of the project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        public readonly string? Project;
        public readonly string? Region;
        public readonly ImmutableArray<Outputs.GetRegionInstanceTemplateReservationAffinityResult> ReservationAffinities;
        /// <summary>
        /// (Optional) -- A list of short names of resource policies to attach to this disk for automatic snapshot creations. Currently a max of 1 resource policy is supported.
        /// </summary>
        public readonly ImmutableArray<string> ResourcePolicies;
        /// <summary>
        /// The scheduling strategy to use. More details about
        /// this configuration option are detailed below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRegionInstanceTemplateSchedulingResult> Schedulings;
        /// <summary>
        /// The URI of the created resource.
        /// </summary>
        public readonly string SelfLink;
        /// <summary>
        /// Service account to attach to the instance. Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRegionInstanceTemplateServiceAccountResult> ServiceAccounts;
        /// <summary>
        /// Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
        /// **Note**: `shielded_instance_config` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRegionInstanceTemplateShieldedInstanceConfigResult> ShieldedInstanceConfigs;
        /// <summary>
        /// Tags to attach to the instance.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// The unique fingerprint of the tags.
        /// </summary>
        public readonly string TagsFingerprint;

        [OutputConstructor]
        private GetRegionInstanceTemplateResult(
            ImmutableArray<Outputs.GetRegionInstanceTemplateAdvancedMachineFeatureResult> advancedMachineFeatures,

            bool canIpForward,

            ImmutableArray<Outputs.GetRegionInstanceTemplateConfidentialInstanceConfigResult> confidentialInstanceConfigs,

            string description,

            ImmutableArray<Outputs.GetRegionInstanceTemplateDiskResult> disks,

            bool enableDisplay,

            string? filter,

            ImmutableArray<Outputs.GetRegionInstanceTemplateGuestAcceleratorResult> guestAccelerators,

            string id,

            string instanceDescription,

            ImmutableDictionary<string, string> labels,

            string machineType,

            ImmutableDictionary<string, object> metadata,

            string metadataFingerprint,

            string metadataStartupScript,

            string minCpuPlatform,

            bool? mostRecent,

            string? name,

            string namePrefix,

            ImmutableArray<Outputs.GetRegionInstanceTemplateNetworkInterfaceResult> networkInterfaces,

            ImmutableArray<Outputs.GetRegionInstanceTemplateNetworkPerformanceConfigResult> networkPerformanceConfigs,

            string? project,

            string? region,

            ImmutableArray<Outputs.GetRegionInstanceTemplateReservationAffinityResult> reservationAffinities,

            ImmutableArray<string> resourcePolicies,

            ImmutableArray<Outputs.GetRegionInstanceTemplateSchedulingResult> schedulings,

            string selfLink,

            ImmutableArray<Outputs.GetRegionInstanceTemplateServiceAccountResult> serviceAccounts,

            ImmutableArray<Outputs.GetRegionInstanceTemplateShieldedInstanceConfigResult> shieldedInstanceConfigs,

            ImmutableArray<string> tags,

            string tagsFingerprint)
        {
            AdvancedMachineFeatures = advancedMachineFeatures;
            CanIpForward = canIpForward;
            ConfidentialInstanceConfigs = confidentialInstanceConfigs;
            Description = description;
            Disks = disks;
            EnableDisplay = enableDisplay;
            Filter = filter;
            GuestAccelerators = guestAccelerators;
            Id = id;
            InstanceDescription = instanceDescription;
            Labels = labels;
            MachineType = machineType;
            Metadata = metadata;
            MetadataFingerprint = metadataFingerprint;
            MetadataStartupScript = metadataStartupScript;
            MinCpuPlatform = minCpuPlatform;
            MostRecent = mostRecent;
            Name = name;
            NamePrefix = namePrefix;
            NetworkInterfaces = networkInterfaces;
            NetworkPerformanceConfigs = networkPerformanceConfigs;
            Project = project;
            Region = region;
            ReservationAffinities = reservationAffinities;
            ResourcePolicies = resourcePolicies;
            Schedulings = schedulings;
            SelfLink = selfLink;
            ServiceAccounts = serviceAccounts;
            ShieldedInstanceConfigs = shieldedInstanceConfigs;
            Tags = tags;
            TagsFingerprint = tagsFingerprint;
        }
    }
}