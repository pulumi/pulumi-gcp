// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    public static class GetDisk
    {
        /// <summary>
        /// Get information about a Google Compute Persistent disks.
        /// 
        /// [the official documentation](https://cloud.google.com/compute/docs/disks) and its [API](https://cloud.google.com/compute/docs/reference/latest/disks).
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
        ///     var persistent_boot_disk = Gcp.Compute.GetDisk.Invoke(new()
        ///     {
        ///         Name = "persistent-boot-disk",
        ///         Project = "example",
        ///     });
        /// 
        ///     var @default = new Gcp.Compute.Instance("default", new()
        ///     {
        ///         BootDisk = new Gcp.Compute.Inputs.InstanceBootDiskArgs
        ///         {
        ///             Source = persistent_boot_disk.Apply(persistent_boot_disk =&gt; persistent_boot_disk.Apply(getDiskResult =&gt; getDiskResult.SelfLink)),
        ///             AutoDelete = false,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDiskResult> InvokeAsync(GetDiskArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDiskResult>("gcp:compute/getDisk:getDisk", args ?? new GetDiskArgs(), options.WithDefaults());

        /// <summary>
        /// Get information about a Google Compute Persistent disks.
        /// 
        /// [the official documentation](https://cloud.google.com/compute/docs/disks) and its [API](https://cloud.google.com/compute/docs/reference/latest/disks).
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
        ///     var persistent_boot_disk = Gcp.Compute.GetDisk.Invoke(new()
        ///     {
        ///         Name = "persistent-boot-disk",
        ///         Project = "example",
        ///     });
        /// 
        ///     var @default = new Gcp.Compute.Instance("default", new()
        ///     {
        ///         BootDisk = new Gcp.Compute.Inputs.InstanceBootDiskArgs
        ///         {
        ///             Source = persistent_boot_disk.Apply(persistent_boot_disk =&gt; persistent_boot_disk.Apply(getDiskResult =&gt; getDiskResult.SelfLink)),
        ///             AutoDelete = false,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDiskResult> Invoke(GetDiskInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDiskResult>("gcp:compute/getDisk:getDisk", args ?? new GetDiskInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get information about a Google Compute Persistent disks.
        /// 
        /// [the official documentation](https://cloud.google.com/compute/docs/disks) and its [API](https://cloud.google.com/compute/docs/reference/latest/disks).
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
        ///     var persistent_boot_disk = Gcp.Compute.GetDisk.Invoke(new()
        ///     {
        ///         Name = "persistent-boot-disk",
        ///         Project = "example",
        ///     });
        /// 
        ///     var @default = new Gcp.Compute.Instance("default", new()
        ///     {
        ///         BootDisk = new Gcp.Compute.Inputs.InstanceBootDiskArgs
        ///         {
        ///             Source = persistent_boot_disk.Apply(persistent_boot_disk =&gt; persistent_boot_disk.Apply(getDiskResult =&gt; getDiskResult.SelfLink)),
        ///             AutoDelete = false,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDiskResult> Invoke(GetDiskInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDiskResult>("gcp:compute/getDisk:getDisk", args ?? new GetDiskInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDiskArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of a specific disk.
        /// 
        /// - - -
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        /// <summary>
        /// A reference to the zone where the disk resides.
        /// </summary>
        [Input("zone")]
        public string? Zone { get; set; }

        public GetDiskArgs()
        {
        }
        public static new GetDiskArgs Empty => new GetDiskArgs();
    }

    public sealed class GetDiskInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of a specific disk.
        /// 
        /// - - -
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// A reference to the zone where the disk resides.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public GetDiskInvokeArgs()
        {
        }
        public static new GetDiskInvokeArgs Empty => new GetDiskInvokeArgs();
    }


    [OutputType]
    public sealed class GetDiskResult
    {
        public readonly string AccessMode;
        public readonly string Architecture;
        public readonly ImmutableArray<Outputs.GetDiskAsyncPrimaryDiskResult> AsyncPrimaryDisks;
        public readonly bool CreateSnapshotBeforeDestroy;
        public readonly string CreateSnapshotBeforeDestroyPrefix;
        /// <summary>
        /// Creation timestamp in RFC3339 text format.
        /// </summary>
        public readonly string CreationTimestamp;
        /// <summary>
        /// The optional description of this resource.
        /// </summary>
        public readonly string Description;
        public readonly ImmutableArray<Outputs.GetDiskDiskEncryptionKeyResult> DiskEncryptionKeys;
        public readonly string DiskId;
        public readonly ImmutableDictionary<string, string> EffectiveLabels;
        public readonly bool EnableConfidentialCompute;
        public readonly ImmutableArray<Outputs.GetDiskGuestOsFeatureResult> GuestOsFeatures;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The image from which to initialize this disk.
        /// </summary>
        public readonly string Image;
        public readonly string Interface;
        /// <summary>
        /// The fingerprint used for optimistic locking of this resource.  Used
        /// internally during updates.
        /// </summary>
        public readonly string LabelFingerprint;
        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Labels;
        /// <summary>
        /// Last attach timestamp in RFC3339 text format.
        /// </summary>
        public readonly string LastAttachTimestamp;
        /// <summary>
        /// Last detach timestamp in RFC3339 text format.
        /// </summary>
        public readonly string LastDetachTimestamp;
        public readonly ImmutableArray<string> Licenses;
        public readonly bool MultiWriter;
        public readonly string Name;
        public readonly ImmutableArray<Outputs.GetDiskParamResult> Params;
        /// <summary>
        /// Physical block size of the persistent disk, in bytes.
        /// </summary>
        public readonly int PhysicalBlockSizeBytes;
        public readonly string? Project;
        public readonly int ProvisionedIops;
        public readonly int ProvisionedThroughput;
        public readonly ImmutableDictionary<string, string> PulumiLabels;
        public readonly ImmutableArray<string> ResourcePolicies;
        /// <summary>
        /// The URI of the created resource.
        /// </summary>
        public readonly string SelfLink;
        /// <summary>
        /// Size of the persistent disk, specified in GB.
        /// </summary>
        public readonly int Size;
        /// <summary>
        /// The source snapshot used to create this disk.
        /// </summary>
        public readonly string Snapshot;
        public readonly string SourceDisk;
        public readonly string SourceDiskId;
        /// <summary>
        /// The customer-supplied encryption key of the source image.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDiskSourceImageEncryptionKeyResult> SourceImageEncryptionKeys;
        /// <summary>
        /// The ID value of the image used to create this disk. This value
        /// identifies the exact image that was used to create this persistent
        /// disk. For example, if you created the persistent disk from an image
        /// that was later deleted and recreated under the same name, the source
        /// image ID would identify the exact version of the image that was used.
        /// </summary>
        public readonly string SourceImageId;
        public readonly string SourceInstantSnapshot;
        public readonly string SourceInstantSnapshotId;
        /// <summary>
        /// The customer-supplied encryption key of the source snapshot.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDiskSourceSnapshotEncryptionKeyResult> SourceSnapshotEncryptionKeys;
        /// <summary>
        /// The unique ID of the snapshot used to create this disk. This value
        /// identifies the exact snapshot that was used to create this persistent
        /// disk. For example, if you created the persistent disk from a snapshot
        /// that was later deleted and recreated under the same name, the source
        /// snapshot ID would identify the exact version of the snapshot that was
        /// used.
        /// </summary>
        public readonly string SourceSnapshotId;
        public readonly string SourceStorageObject;
        public readonly string StoragePool;
        /// <summary>
        /// URL of the disk type resource describing which disk type to use to
        /// create the disk.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Links to the users of the disk (attached instances) in form:
        /// project/zones/zone/instances/instance
        /// </summary>
        public readonly ImmutableArray<string> Users;
        /// <summary>
        /// A reference to the zone where the disk resides.
        /// </summary>
        public readonly string? Zone;

        [OutputConstructor]
        private GetDiskResult(
            string accessMode,

            string architecture,

            ImmutableArray<Outputs.GetDiskAsyncPrimaryDiskResult> asyncPrimaryDisks,

            bool createSnapshotBeforeDestroy,

            string createSnapshotBeforeDestroyPrefix,

            string creationTimestamp,

            string description,

            ImmutableArray<Outputs.GetDiskDiskEncryptionKeyResult> diskEncryptionKeys,

            string diskId,

            ImmutableDictionary<string, string> effectiveLabels,

            bool enableConfidentialCompute,

            ImmutableArray<Outputs.GetDiskGuestOsFeatureResult> guestOsFeatures,

            string id,

            string image,

            string @interface,

            string labelFingerprint,

            ImmutableDictionary<string, string> labels,

            string lastAttachTimestamp,

            string lastDetachTimestamp,

            ImmutableArray<string> licenses,

            bool multiWriter,

            string name,

            ImmutableArray<Outputs.GetDiskParamResult> @params,

            int physicalBlockSizeBytes,

            string? project,

            int provisionedIops,

            int provisionedThroughput,

            ImmutableDictionary<string, string> pulumiLabels,

            ImmutableArray<string> resourcePolicies,

            string selfLink,

            int size,

            string snapshot,

            string sourceDisk,

            string sourceDiskId,

            ImmutableArray<Outputs.GetDiskSourceImageEncryptionKeyResult> sourceImageEncryptionKeys,

            string sourceImageId,

            string sourceInstantSnapshot,

            string sourceInstantSnapshotId,

            ImmutableArray<Outputs.GetDiskSourceSnapshotEncryptionKeyResult> sourceSnapshotEncryptionKeys,

            string sourceSnapshotId,

            string sourceStorageObject,

            string storagePool,

            string type,

            ImmutableArray<string> users,

            string? zone)
        {
            AccessMode = accessMode;
            Architecture = architecture;
            AsyncPrimaryDisks = asyncPrimaryDisks;
            CreateSnapshotBeforeDestroy = createSnapshotBeforeDestroy;
            CreateSnapshotBeforeDestroyPrefix = createSnapshotBeforeDestroyPrefix;
            CreationTimestamp = creationTimestamp;
            Description = description;
            DiskEncryptionKeys = diskEncryptionKeys;
            DiskId = diskId;
            EffectiveLabels = effectiveLabels;
            EnableConfidentialCompute = enableConfidentialCompute;
            GuestOsFeatures = guestOsFeatures;
            Id = id;
            Image = image;
            Interface = @interface;
            LabelFingerprint = labelFingerprint;
            Labels = labels;
            LastAttachTimestamp = lastAttachTimestamp;
            LastDetachTimestamp = lastDetachTimestamp;
            Licenses = licenses;
            MultiWriter = multiWriter;
            Name = name;
            Params = @params;
            PhysicalBlockSizeBytes = physicalBlockSizeBytes;
            Project = project;
            ProvisionedIops = provisionedIops;
            ProvisionedThroughput = provisionedThroughput;
            PulumiLabels = pulumiLabels;
            ResourcePolicies = resourcePolicies;
            SelfLink = selfLink;
            Size = size;
            Snapshot = snapshot;
            SourceDisk = sourceDisk;
            SourceDiskId = sourceDiskId;
            SourceImageEncryptionKeys = sourceImageEncryptionKeys;
            SourceImageId = sourceImageId;
            SourceInstantSnapshot = sourceInstantSnapshot;
            SourceInstantSnapshotId = sourceInstantSnapshotId;
            SourceSnapshotEncryptionKeys = sourceSnapshotEncryptionKeys;
            SourceSnapshotId = sourceSnapshotId;
            SourceStorageObject = sourceStorageObject;
            StoragePool = storagePool;
            Type = type;
            Users = users;
            Zone = zone;
        }
    }
}
