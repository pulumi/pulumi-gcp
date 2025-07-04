// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    public static class GetInstanceTemplate
    {
        /// <summary>
        /// &gt; **Note**: Global instance templates can be used in any region. To lower the impact of outages outside your region and gain data residency within your region, use google_compute_region_instance_template.
        /// 
        /// Get information about a VM instance template resource within GCE. For more information see
        /// [the official documentation](https://cloud.google.com/compute/docs/instance-templates)
        /// and
        /// [API](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates).
        /// </summary>
        public static Task<GetInstanceTemplateResult> InvokeAsync(GetInstanceTemplateArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceTemplateResult>("gcp:compute/getInstanceTemplate:getInstanceTemplate", args ?? new GetInstanceTemplateArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Note**: Global instance templates can be used in any region. To lower the impact of outages outside your region and gain data residency within your region, use google_compute_region_instance_template.
        /// 
        /// Get information about a VM instance template resource within GCE. For more information see
        /// [the official documentation](https://cloud.google.com/compute/docs/instance-templates)
        /// and
        /// [API](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates).
        /// </summary>
        public static Output<GetInstanceTemplateResult> Invoke(GetInstanceTemplateInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceTemplateResult>("gcp:compute/getInstanceTemplate:getInstanceTemplate", args ?? new GetInstanceTemplateInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Note**: Global instance templates can be used in any region. To lower the impact of outages outside your region and gain data residency within your region, use google_compute_region_instance_template.
        /// 
        /// Get information about a VM instance template resource within GCE. For more information see
        /// [the official documentation](https://cloud.google.com/compute/docs/instance-templates)
        /// and
        /// [API](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates).
        /// </summary>
        public static Output<GetInstanceTemplateResult> Invoke(GetInstanceTemplateInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceTemplateResult>("gcp:compute/getInstanceTemplate:getInstanceTemplate", args ?? new GetInstanceTemplateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceTemplateArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A filter to retrieve the instance templates.
        /// See [API filter parameter documentation](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/list#body.QUERY_PARAMETERS.filter) for reference.
        /// If multiple instance templates match, either adjust the filter or specify `most_recent`.
        /// One of `name`, `filter` or `self_link_unique` must be provided.
        /// </summary>
        [Input("filter")]
        public string? Filter { get; set; }

        /// <summary>
        /// If `filter` is provided, ensures the most recent template is returned when multiple instance templates match. One of `name`, `filter` or `self_link_unique` must be provided.
        /// </summary>
        [Input("mostRecent")]
        public bool? MostRecent { get; set; }

        /// <summary>
        /// The name of the instance template. One of `name`, `filter` or `self_link_unique` must be provided.
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
        /// The self_link_unique URI of the instance template. One of `name`, `filter` or `self_link_unique` must be provided.
        /// </summary>
        [Input("selfLinkUnique")]
        public string? SelfLinkUnique { get; set; }

        public GetInstanceTemplateArgs()
        {
        }
        public static new GetInstanceTemplateArgs Empty => new GetInstanceTemplateArgs();
    }

    public sealed class GetInstanceTemplateInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A filter to retrieve the instance templates.
        /// See [API filter parameter documentation](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/list#body.QUERY_PARAMETERS.filter) for reference.
        /// If multiple instance templates match, either adjust the filter or specify `most_recent`.
        /// One of `name`, `filter` or `self_link_unique` must be provided.
        /// </summary>
        [Input("filter")]
        public Input<string>? Filter { get; set; }

        /// <summary>
        /// If `filter` is provided, ensures the most recent template is returned when multiple instance templates match. One of `name`, `filter` or `self_link_unique` must be provided.
        /// </summary>
        [Input("mostRecent")]
        public Input<bool>? MostRecent { get; set; }

        /// <summary>
        /// The name of the instance template. One of `name`, `filter` or `self_link_unique` must be provided.
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
        /// The self_link_unique URI of the instance template. One of `name`, `filter` or `self_link_unique` must be provided.
        /// </summary>
        [Input("selfLinkUnique")]
        public Input<string>? SelfLinkUnique { get; set; }

        public GetInstanceTemplateInvokeArgs()
        {
        }
        public static new GetInstanceTemplateInvokeArgs Empty => new GetInstanceTemplateInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceTemplateResult
    {
        public readonly ImmutableArray<Outputs.GetInstanceTemplateAdvancedMachineFeatureResult> AdvancedMachineFeatures;
        /// <summary>
        /// Whether to allow sending and receiving of
        /// packets with non-matching source or destination IPs. This defaults to false.
        /// </summary>
        public readonly bool CanIpForward;
        /// <summary>
        /// Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceTemplateConfidentialInstanceConfigResult> ConfidentialInstanceConfigs;
        /// <summary>
        /// Creation timestamp in RFC3339 text format.
        /// </summary>
        public readonly string CreationTimestamp;
        /// <summary>
        /// A brief description of this resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Disks to attach to instances created from this template.
        /// This can be specified multiple times for multiple disks. Structure is
        /// documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceTemplateDiskResult> Disks;
        public readonly ImmutableDictionary<string, string> EffectiveLabels;
        /// <summary>
        /// Enable [Virtual Displays](https://cloud.google.com/compute/docs/instances/enable-instance-virtual-display#verify_display_driver) on this instance.
        /// **Note**: `allow_stopping_for_update` must be set to true in order to update this field.
        /// </summary>
        public readonly bool EnableDisplay;
        public readonly string? Filter;
        /// <summary>
        /// List of the type and count of accelerator cards attached to the instance. Structure documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceTemplateGuestAcceleratorResult> GuestAccelerators;
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
        /// Action to be taken when a customer's encryption key is revoked.
        /// </summary>
        public readonly string KeyRevocationActionType;
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
        public readonly ImmutableDictionary<string, string> Metadata;
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
        /// <summary>
        /// The name of the instance template. If you leave
        /// this blank, the provider will auto-generate a unique name.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Creates a unique name beginning with the specified
        /// prefix. Conflicts with `name`.
        /// </summary>
        public readonly string NamePrefix;
        /// <summary>
        /// The URL of the network attachment that this interface should connect to in the following format: projects/{projectNumber}/regions/{region_name}/networkAttachments/{network_attachment_name}.  s
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceTemplateNetworkInterfaceResult> NetworkInterfaces;
        /// <summary>
        /// The network performance configuration setting
        /// for the instance, if set. Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceTemplateNetworkPerformanceConfigResult> NetworkPerformanceConfigs;
        public readonly string NumericId;
        public readonly ImmutableDictionary<string, string> PartnerMetadata;
        /// <summary>
        /// The ID of the project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        public readonly string? Project;
        public readonly ImmutableDictionary<string, string> PulumiLabels;
        /// <summary>
        /// An instance template is a global resource that is not
        /// bound to a zone or a region. However, you can still specify some regional
        /// resources in an instance template, which restricts the template to the
        /// region where that resource resides. For example, a custom `subnetwork`
        /// resource is tied to a specific region. Defaults to the region of the
        /// Provider if no value is given.
        /// </summary>
        public readonly string Region;
        public readonly ImmutableArray<Outputs.GetInstanceTemplateReservationAffinityResult> ReservationAffinities;
        public readonly ImmutableDictionary<string, string> ResourceManagerTags;
        /// <summary>
        /// (Optional) -- A list of short names of resource policies to attach to this disk for automatic snapshot creations. Currently a max of 1 resource policy is supported.
        /// </summary>
        public readonly ImmutableArray<string> ResourcePolicies;
        /// <summary>
        /// The scheduling strategy to use. More details about
        /// this configuration option are detailed below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceTemplateSchedulingResult> Schedulings;
        /// <summary>
        /// The URI of the created resource.
        /// </summary>
        public readonly string SelfLink;
        /// <summary>
        /// A special URI of the created resource that uniquely identifies this instance template with the following format: `projects/{{project}}/global/instanceTemplates/{{name}}?uniqueId={{uniqueId}}`
        /// Referencing an instance template via this attribute prevents Time of Check to Time of Use attacks when the instance template resides in a shared/untrusted environment.
        /// </summary>
        public readonly string? SelfLinkUnique;
        /// <summary>
        /// Service account to attach to the instance. Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceTemplateServiceAccountResult> ServiceAccounts;
        /// <summary>
        /// Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
        /// **Note**: `shielded_instance_config` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceTemplateShieldedInstanceConfigResult> ShieldedInstanceConfigs;
        /// <summary>
        /// Tags to attach to the instance.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// The unique fingerprint of the tags.
        /// </summary>
        public readonly string TagsFingerprint;

        [OutputConstructor]
        private GetInstanceTemplateResult(
            ImmutableArray<Outputs.GetInstanceTemplateAdvancedMachineFeatureResult> advancedMachineFeatures,

            bool canIpForward,

            ImmutableArray<Outputs.GetInstanceTemplateConfidentialInstanceConfigResult> confidentialInstanceConfigs,

            string creationTimestamp,

            string description,

            ImmutableArray<Outputs.GetInstanceTemplateDiskResult> disks,

            ImmutableDictionary<string, string> effectiveLabels,

            bool enableDisplay,

            string? filter,

            ImmutableArray<Outputs.GetInstanceTemplateGuestAcceleratorResult> guestAccelerators,

            string id,

            string instanceDescription,

            string keyRevocationActionType,

            ImmutableDictionary<string, string> labels,

            string machineType,

            ImmutableDictionary<string, string> metadata,

            string metadataFingerprint,

            string metadataStartupScript,

            string minCpuPlatform,

            bool? mostRecent,

            string? name,

            string namePrefix,

            ImmutableArray<Outputs.GetInstanceTemplateNetworkInterfaceResult> networkInterfaces,

            ImmutableArray<Outputs.GetInstanceTemplateNetworkPerformanceConfigResult> networkPerformanceConfigs,

            string numericId,

            ImmutableDictionary<string, string> partnerMetadata,

            string? project,

            ImmutableDictionary<string, string> pulumiLabels,

            string region,

            ImmutableArray<Outputs.GetInstanceTemplateReservationAffinityResult> reservationAffinities,

            ImmutableDictionary<string, string> resourceManagerTags,

            ImmutableArray<string> resourcePolicies,

            ImmutableArray<Outputs.GetInstanceTemplateSchedulingResult> schedulings,

            string selfLink,

            string? selfLinkUnique,

            ImmutableArray<Outputs.GetInstanceTemplateServiceAccountResult> serviceAccounts,

            ImmutableArray<Outputs.GetInstanceTemplateShieldedInstanceConfigResult> shieldedInstanceConfigs,

            ImmutableArray<string> tags,

            string tagsFingerprint)
        {
            AdvancedMachineFeatures = advancedMachineFeatures;
            CanIpForward = canIpForward;
            ConfidentialInstanceConfigs = confidentialInstanceConfigs;
            CreationTimestamp = creationTimestamp;
            Description = description;
            Disks = disks;
            EffectiveLabels = effectiveLabels;
            EnableDisplay = enableDisplay;
            Filter = filter;
            GuestAccelerators = guestAccelerators;
            Id = id;
            InstanceDescription = instanceDescription;
            KeyRevocationActionType = keyRevocationActionType;
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
            NumericId = numericId;
            PartnerMetadata = partnerMetadata;
            Project = project;
            PulumiLabels = pulumiLabels;
            Region = region;
            ReservationAffinities = reservationAffinities;
            ResourceManagerTags = resourceManagerTags;
            ResourcePolicies = resourcePolicies;
            Schedulings = schedulings;
            SelfLink = selfLink;
            SelfLinkUnique = selfLinkUnique;
            ServiceAccounts = serviceAccounts;
            ShieldedInstanceConfigs = shieldedInstanceConfigs;
            Tags = tags;
            TagsFingerprint = tagsFingerprint;
        }
    }
}
