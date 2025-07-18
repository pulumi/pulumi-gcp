// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InstanceTemplateDiskArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The architecture of the attached disk. Valid values are `ARM64` or `x86_64`.
        /// </summary>
        [Input("architecture")]
        public Input<string>? Architecture { get; set; }

        /// <summary>
        /// Whether or not the disk should be auto-deleted.
        /// This defaults to true.
        /// </summary>
        [Input("autoDelete")]
        public Input<bool>? AutoDelete { get; set; }

        /// <summary>
        /// Indicates that this is a boot disk.
        /// </summary>
        [Input("boot")]
        public Input<bool>? Boot { get; set; }

        /// <summary>
        /// A unique device name that is reflected into the
        /// /dev/  tree of a Linux operating system running within the instance. If not
        /// specified, the server chooses a default device name to apply to this disk.
        /// </summary>
        [Input("deviceName")]
        public Input<string>? DeviceName { get; set; }

        /// <summary>
        /// Encrypts or decrypts a disk using a customer-supplied encryption key.
        /// 
        /// If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this field decrypts the disk using the customer-supplied encryption key.
        /// 
        /// If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance.
        /// 
        /// If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later.
        /// 
        /// Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group. Structure documented below.
        /// </summary>
        [Input("diskEncryptionKey")]
        public Input<Inputs.InstanceTemplateDiskDiskEncryptionKeyArgs>? DiskEncryptionKey { get; set; }

        /// <summary>
        /// Name of the disk. When not provided, this defaults
        /// to the name of the instance.
        /// </summary>
        [Input("diskName")]
        public Input<string>? DiskName { get; set; }

        /// <summary>
        /// The size of the image in gigabytes. If not
        /// specified, it will inherit the size of its base image. For SCRATCH disks,
        /// the size must be exactly 375GB.
        /// </summary>
        [Input("diskSizeGb")]
        public Input<int>? DiskSizeGb { get; set; }

        /// <summary>
        /// The GCE disk type. Such as `"pd-ssd"`, `"local-ssd"`,
        /// `"pd-balanced"` or `"pd-standard"`, `"hyperdisk-balanced"`, `"hyperdisk-throughput"` or `"hyperdisk-extreme"`.
        /// </summary>
        [Input("diskType")]
        public Input<string>? DiskType { get; set; }

        [Input("guestOsFeatures")]
        private InputList<string>? _guestOsFeatures;

        /// <summary>
        /// A list of features to enable on the guest operating system. Applicable only for bootable images. Read [Enabling guest operating system features](https://cloud.google.com/compute/docs/images/create-delete-deprecate-private-images#guest-os-features) to see a list of available options.
        /// </summary>
        public InputList<string> GuestOsFeatures
        {
            get => _guestOsFeatures ?? (_guestOsFeatures = new InputList<string>());
            set => _guestOsFeatures = value;
        }

        /// <summary>
        /// Specifies the disk interface to use for attaching this disk,
        /// which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI
        /// and the request will fail if you attempt to attach a persistent disk in any other format
        /// than SCSI. Local SSDs can use either NVME or SCSI.
        /// </summary>
        [Input("interface")]
        public Input<string>? Interface { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// A set of ket/value label pairs to assign to disk created from
        /// this template
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The mode in which to attach this disk, either READ_WRITE
        /// or READ_ONLY. If you are attaching or creating a boot disk, this must
        /// read-write mode.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// Indicates how many IOPS to provision for the disk. This
        /// sets the number of I/O operations per second that the disk can handle.
        /// Values must be between 10,000 and 120,000. For more details, see the
        /// [Extreme persistent disk documentation](https://cloud.google.com/compute/docs/disks/extreme-persistent-disk).
        /// </summary>
        [Input("provisionedIops")]
        public Input<int>? ProvisionedIops { get; set; }

        /// <summary>
        /// Indicates how much throughput to provision for the disk, in MB/s. This sets the amount of data that can be read or written from the disk per second. Values must greater than or equal to 1. For more details, see the [Hyperdisk documentation](https://cloud.google.com/compute/docs/disks/hyperdisks).
        /// </summary>
        [Input("provisionedThroughput")]
        public Input<int>? ProvisionedThroughput { get; set; }

        [Input("resourceManagerTags")]
        private InputMap<string>? _resourceManagerTags;

        /// <summary>
        /// A set of key/value resource manager tag pairs to bind to this disk. Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/456.
        /// </summary>
        public InputMap<string> ResourceManagerTags
        {
            get => _resourceManagerTags ?? (_resourceManagerTags = new InputMap<string>());
            set => _resourceManagerTags = value;
        }

        /// <summary>
        /// - A list (short name or id) of resource policies to attach to this disk for automatic snapshot creations. Currently a max of 1 resource policy is supported.
        /// </summary>
        [Input("resourcePolicies")]
        public Input<string>? ResourcePolicies { get; set; }

        /// <summary>
        /// The name (**not self_link**)
        /// of the disk (such as those managed by `gcp.compute.Disk`) to attach.
        /// &gt; **Note:** Either `source`, `source_image`, or `source_snapshot` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// The image from which to
        /// initialize this disk. This can be one of: the image's `self_link`,
        /// `projects/{project}/global/images/{image}`,
        /// `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
        /// `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
        /// `{project}/{image}`, `{family}`, or `{image}`.
        /// &gt; **Note:** Either `source`, `source_image`, or `source_snapshot` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
        /// </summary>
        [Input("sourceImage")]
        public Input<string>? SourceImage { get; set; }

        /// <summary>
        /// The customer-supplied encryption
        /// key of the source image. Required if the source image is protected by a
        /// customer-supplied encryption key.
        /// 
        /// Instance templates do not store customer-supplied encryption keys, so you
        /// cannot create disks for instances in a managed instance group if the source
        /// images are encrypted with your own keys. Structure
        /// documented below.
        /// </summary>
        [Input("sourceImageEncryptionKey")]
        public Input<Inputs.InstanceTemplateDiskSourceImageEncryptionKeyArgs>? SourceImageEncryptionKey { get; set; }

        /// <summary>
        /// The source snapshot to create this disk.
        /// &gt; **Note:** Either `source`, `source_image`, or `source_snapshot` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
        /// </summary>
        [Input("sourceSnapshot")]
        public Input<string>? SourceSnapshot { get; set; }

        /// <summary>
        /// The customer-supplied encryption
        /// key of the source snapshot. Structure
        /// documented below.
        /// </summary>
        [Input("sourceSnapshotEncryptionKey")]
        public Input<Inputs.InstanceTemplateDiskSourceSnapshotEncryptionKeyArgs>? SourceSnapshotEncryptionKey { get; set; }

        /// <summary>
        /// The type of GCE disk, can be either `"SCRATCH"` or
        /// `"PERSISTENT"`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public InstanceTemplateDiskArgs()
        {
        }
        public static new InstanceTemplateDiskArgs Empty => new InstanceTemplateDiskArgs();
    }
}
