// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.outputs.GetDiskAsyncPrimaryDisk;
import com.pulumi.gcp.compute.outputs.GetDiskDiskEncryptionKey;
import com.pulumi.gcp.compute.outputs.GetDiskGuestOsFeature;
import com.pulumi.gcp.compute.outputs.GetDiskParam;
import com.pulumi.gcp.compute.outputs.GetDiskSourceImageEncryptionKey;
import com.pulumi.gcp.compute.outputs.GetDiskSourceSnapshotEncryptionKey;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDiskResult {
    private String accessMode;
    private String architecture;
    private List<GetDiskAsyncPrimaryDisk> asyncPrimaryDisks;
    private Boolean createSnapshotBeforeDestroy;
    private String createSnapshotBeforeDestroyPrefix;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private String creationTimestamp;
    /**
     * @return The optional description of this resource.
     * 
     */
    private String description;
    private List<GetDiskDiskEncryptionKey> diskEncryptionKeys;
    private String diskId;
    private Map<String,String> effectiveLabels;
    private Boolean enableConfidentialCompute;
    private List<GetDiskGuestOsFeature> guestOsFeatures;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The image from which to initialize this disk.
     * 
     */
    private String image;
    private String interface_;
    /**
     * @return The fingerprint used for optimistic locking of this resource.  Used
     * internally during updates.
     * 
     */
    private String labelFingerprint;
    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return Last attach timestamp in RFC3339 text format.
     * 
     */
    private String lastAttachTimestamp;
    /**
     * @return Last detach timestamp in RFC3339 text format.
     * 
     */
    private String lastDetachTimestamp;
    private List<String> licenses;
    private Boolean multiWriter;
    private String name;
    private List<GetDiskParam> params;
    /**
     * @return Physical block size of the persistent disk, in bytes.
     * 
     */
    private Integer physicalBlockSizeBytes;
    private @Nullable String project;
    private Integer provisionedIops;
    private Integer provisionedThroughput;
    private Map<String,String> pulumiLabels;
    private List<String> resourcePolicies;
    /**
     * @return The URI of the created resource.
     * 
     */
    private String selfLink;
    /**
     * @return Size of the persistent disk, specified in GB.
     * 
     */
    private Integer size;
    /**
     * @return The source snapshot used to create this disk.
     * 
     */
    private String snapshot;
    private String sourceDisk;
    private String sourceDiskId;
    /**
     * @return The customer-supplied encryption key of the source image.
     * 
     */
    private List<GetDiskSourceImageEncryptionKey> sourceImageEncryptionKeys;
    /**
     * @return The ID value of the image used to create this disk. This value
     * identifies the exact image that was used to create this persistent
     * disk. For example, if you created the persistent disk from an image
     * that was later deleted and recreated under the same name, the source
     * image ID would identify the exact version of the image that was used.
     * 
     */
    private String sourceImageId;
    private String sourceInstantSnapshot;
    private String sourceInstantSnapshotId;
    /**
     * @return The customer-supplied encryption key of the source snapshot.
     * 
     */
    private List<GetDiskSourceSnapshotEncryptionKey> sourceSnapshotEncryptionKeys;
    /**
     * @return The unique ID of the snapshot used to create this disk. This value
     * identifies the exact snapshot that was used to create this persistent
     * disk. For example, if you created the persistent disk from a snapshot
     * that was later deleted and recreated under the same name, the source
     * snapshot ID would identify the exact version of the snapshot that was
     * used.
     * 
     */
    private String sourceSnapshotId;
    private String sourceStorageObject;
    private String storagePool;
    /**
     * @return URL of the disk type resource describing which disk type to use to
     * create the disk.
     * 
     */
    private String type;
    /**
     * @return Links to the users of the disk (attached instances) in form:
     * project/zones/zone/instances/instance
     * 
     */
    private List<String> users;
    /**
     * @return A reference to the zone where the disk resides.
     * 
     */
    private @Nullable String zone;

    private GetDiskResult() {}
    public String accessMode() {
        return this.accessMode;
    }
    public String architecture() {
        return this.architecture;
    }
    public List<GetDiskAsyncPrimaryDisk> asyncPrimaryDisks() {
        return this.asyncPrimaryDisks;
    }
    public Boolean createSnapshotBeforeDestroy() {
        return this.createSnapshotBeforeDestroy;
    }
    public String createSnapshotBeforeDestroyPrefix() {
        return this.createSnapshotBeforeDestroyPrefix;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return The optional description of this resource.
     * 
     */
    public String description() {
        return this.description;
    }
    public List<GetDiskDiskEncryptionKey> diskEncryptionKeys() {
        return this.diskEncryptionKeys;
    }
    public String diskId() {
        return this.diskId;
    }
    public Map<String,String> effectiveLabels() {
        return this.effectiveLabels;
    }
    public Boolean enableConfidentialCompute() {
        return this.enableConfidentialCompute;
    }
    public List<GetDiskGuestOsFeature> guestOsFeatures() {
        return this.guestOsFeatures;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The image from which to initialize this disk.
     * 
     */
    public String image() {
        return this.image;
    }
    public String interface_() {
        return this.interface_;
    }
    /**
     * @return The fingerprint used for optimistic locking of this resource.  Used
     * internally during updates.
     * 
     */
    public String labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Last attach timestamp in RFC3339 text format.
     * 
     */
    public String lastAttachTimestamp() {
        return this.lastAttachTimestamp;
    }
    /**
     * @return Last detach timestamp in RFC3339 text format.
     * 
     */
    public String lastDetachTimestamp() {
        return this.lastDetachTimestamp;
    }
    public List<String> licenses() {
        return this.licenses;
    }
    public Boolean multiWriter() {
        return this.multiWriter;
    }
    public String name() {
        return this.name;
    }
    public List<GetDiskParam> params() {
        return this.params;
    }
    /**
     * @return Physical block size of the persistent disk, in bytes.
     * 
     */
    public Integer physicalBlockSizeBytes() {
        return this.physicalBlockSizeBytes;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public Integer provisionedIops() {
        return this.provisionedIops;
    }
    public Integer provisionedThroughput() {
        return this.provisionedThroughput;
    }
    public Map<String,String> pulumiLabels() {
        return this.pulumiLabels;
    }
    public List<String> resourcePolicies() {
        return this.resourcePolicies;
    }
    /**
     * @return The URI of the created resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Size of the persistent disk, specified in GB.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return The source snapshot used to create this disk.
     * 
     */
    public String snapshot() {
        return this.snapshot;
    }
    public String sourceDisk() {
        return this.sourceDisk;
    }
    public String sourceDiskId() {
        return this.sourceDiskId;
    }
    /**
     * @return The customer-supplied encryption key of the source image.
     * 
     */
    public List<GetDiskSourceImageEncryptionKey> sourceImageEncryptionKeys() {
        return this.sourceImageEncryptionKeys;
    }
    /**
     * @return The ID value of the image used to create this disk. This value
     * identifies the exact image that was used to create this persistent
     * disk. For example, if you created the persistent disk from an image
     * that was later deleted and recreated under the same name, the source
     * image ID would identify the exact version of the image that was used.
     * 
     */
    public String sourceImageId() {
        return this.sourceImageId;
    }
    public String sourceInstantSnapshot() {
        return this.sourceInstantSnapshot;
    }
    public String sourceInstantSnapshotId() {
        return this.sourceInstantSnapshotId;
    }
    /**
     * @return The customer-supplied encryption key of the source snapshot.
     * 
     */
    public List<GetDiskSourceSnapshotEncryptionKey> sourceSnapshotEncryptionKeys() {
        return this.sourceSnapshotEncryptionKeys;
    }
    /**
     * @return The unique ID of the snapshot used to create this disk. This value
     * identifies the exact snapshot that was used to create this persistent
     * disk. For example, if you created the persistent disk from a snapshot
     * that was later deleted and recreated under the same name, the source
     * snapshot ID would identify the exact version of the snapshot that was
     * used.
     * 
     */
    public String sourceSnapshotId() {
        return this.sourceSnapshotId;
    }
    public String sourceStorageObject() {
        return this.sourceStorageObject;
    }
    public String storagePool() {
        return this.storagePool;
    }
    /**
     * @return URL of the disk type resource describing which disk type to use to
     * create the disk.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Links to the users of the disk (attached instances) in form:
     * project/zones/zone/instances/instance
     * 
     */
    public List<String> users() {
        return this.users;
    }
    /**
     * @return A reference to the zone where the disk resides.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessMode;
        private String architecture;
        private List<GetDiskAsyncPrimaryDisk> asyncPrimaryDisks;
        private Boolean createSnapshotBeforeDestroy;
        private String createSnapshotBeforeDestroyPrefix;
        private String creationTimestamp;
        private String description;
        private List<GetDiskDiskEncryptionKey> diskEncryptionKeys;
        private String diskId;
        private Map<String,String> effectiveLabels;
        private Boolean enableConfidentialCompute;
        private List<GetDiskGuestOsFeature> guestOsFeatures;
        private String id;
        private String image;
        private String interface_;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String lastAttachTimestamp;
        private String lastDetachTimestamp;
        private List<String> licenses;
        private Boolean multiWriter;
        private String name;
        private List<GetDiskParam> params;
        private Integer physicalBlockSizeBytes;
        private @Nullable String project;
        private Integer provisionedIops;
        private Integer provisionedThroughput;
        private Map<String,String> pulumiLabels;
        private List<String> resourcePolicies;
        private String selfLink;
        private Integer size;
        private String snapshot;
        private String sourceDisk;
        private String sourceDiskId;
        private List<GetDiskSourceImageEncryptionKey> sourceImageEncryptionKeys;
        private String sourceImageId;
        private String sourceInstantSnapshot;
        private String sourceInstantSnapshotId;
        private List<GetDiskSourceSnapshotEncryptionKey> sourceSnapshotEncryptionKeys;
        private String sourceSnapshotId;
        private String sourceStorageObject;
        private String storagePool;
        private String type;
        private List<String> users;
        private @Nullable String zone;
        public Builder() {}
        public Builder(GetDiskResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessMode = defaults.accessMode;
    	      this.architecture = defaults.architecture;
    	      this.asyncPrimaryDisks = defaults.asyncPrimaryDisks;
    	      this.createSnapshotBeforeDestroy = defaults.createSnapshotBeforeDestroy;
    	      this.createSnapshotBeforeDestroyPrefix = defaults.createSnapshotBeforeDestroyPrefix;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.diskEncryptionKeys = defaults.diskEncryptionKeys;
    	      this.diskId = defaults.diskId;
    	      this.effectiveLabels = defaults.effectiveLabels;
    	      this.enableConfidentialCompute = defaults.enableConfidentialCompute;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.id = defaults.id;
    	      this.image = defaults.image;
    	      this.interface_ = defaults.interface_;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.lastAttachTimestamp = defaults.lastAttachTimestamp;
    	      this.lastDetachTimestamp = defaults.lastDetachTimestamp;
    	      this.licenses = defaults.licenses;
    	      this.multiWriter = defaults.multiWriter;
    	      this.name = defaults.name;
    	      this.params = defaults.params;
    	      this.physicalBlockSizeBytes = defaults.physicalBlockSizeBytes;
    	      this.project = defaults.project;
    	      this.provisionedIops = defaults.provisionedIops;
    	      this.provisionedThroughput = defaults.provisionedThroughput;
    	      this.pulumiLabels = defaults.pulumiLabels;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.selfLink = defaults.selfLink;
    	      this.size = defaults.size;
    	      this.snapshot = defaults.snapshot;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.sourceDiskId = defaults.sourceDiskId;
    	      this.sourceImageEncryptionKeys = defaults.sourceImageEncryptionKeys;
    	      this.sourceImageId = defaults.sourceImageId;
    	      this.sourceInstantSnapshot = defaults.sourceInstantSnapshot;
    	      this.sourceInstantSnapshotId = defaults.sourceInstantSnapshotId;
    	      this.sourceSnapshotEncryptionKeys = defaults.sourceSnapshotEncryptionKeys;
    	      this.sourceSnapshotId = defaults.sourceSnapshotId;
    	      this.sourceStorageObject = defaults.sourceStorageObject;
    	      this.storagePool = defaults.storagePool;
    	      this.type = defaults.type;
    	      this.users = defaults.users;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder accessMode(String accessMode) {
            if (accessMode == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "accessMode");
            }
            this.accessMode = accessMode;
            return this;
        }
        @CustomType.Setter
        public Builder architecture(String architecture) {
            if (architecture == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "architecture");
            }
            this.architecture = architecture;
            return this;
        }
        @CustomType.Setter
        public Builder asyncPrimaryDisks(List<GetDiskAsyncPrimaryDisk> asyncPrimaryDisks) {
            if (asyncPrimaryDisks == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "asyncPrimaryDisks");
            }
            this.asyncPrimaryDisks = asyncPrimaryDisks;
            return this;
        }
        public Builder asyncPrimaryDisks(GetDiskAsyncPrimaryDisk... asyncPrimaryDisks) {
            return asyncPrimaryDisks(List.of(asyncPrimaryDisks));
        }
        @CustomType.Setter
        public Builder createSnapshotBeforeDestroy(Boolean createSnapshotBeforeDestroy) {
            if (createSnapshotBeforeDestroy == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "createSnapshotBeforeDestroy");
            }
            this.createSnapshotBeforeDestroy = createSnapshotBeforeDestroy;
            return this;
        }
        @CustomType.Setter
        public Builder createSnapshotBeforeDestroyPrefix(String createSnapshotBeforeDestroyPrefix) {
            if (createSnapshotBeforeDestroyPrefix == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "createSnapshotBeforeDestroyPrefix");
            }
            this.createSnapshotBeforeDestroyPrefix = createSnapshotBeforeDestroyPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder creationTimestamp(String creationTimestamp) {
            if (creationTimestamp == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "creationTimestamp");
            }
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder diskEncryptionKeys(List<GetDiskDiskEncryptionKey> diskEncryptionKeys) {
            if (diskEncryptionKeys == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "diskEncryptionKeys");
            }
            this.diskEncryptionKeys = diskEncryptionKeys;
            return this;
        }
        public Builder diskEncryptionKeys(GetDiskDiskEncryptionKey... diskEncryptionKeys) {
            return diskEncryptionKeys(List.of(diskEncryptionKeys));
        }
        @CustomType.Setter
        public Builder diskId(String diskId) {
            if (diskId == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "diskId");
            }
            this.diskId = diskId;
            return this;
        }
        @CustomType.Setter
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            if (effectiveLabels == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "effectiveLabels");
            }
            this.effectiveLabels = effectiveLabels;
            return this;
        }
        @CustomType.Setter
        public Builder enableConfidentialCompute(Boolean enableConfidentialCompute) {
            if (enableConfidentialCompute == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "enableConfidentialCompute");
            }
            this.enableConfidentialCompute = enableConfidentialCompute;
            return this;
        }
        @CustomType.Setter
        public Builder guestOsFeatures(List<GetDiskGuestOsFeature> guestOsFeatures) {
            if (guestOsFeatures == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "guestOsFeatures");
            }
            this.guestOsFeatures = guestOsFeatures;
            return this;
        }
        public Builder guestOsFeatures(GetDiskGuestOsFeature... guestOsFeatures) {
            return guestOsFeatures(List.of(guestOsFeatures));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder image(String image) {
            if (image == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "image");
            }
            this.image = image;
            return this;
        }
        @CustomType.Setter("interface")
        public Builder interface_(String interface_) {
            if (interface_ == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "interface_");
            }
            this.interface_ = interface_;
            return this;
        }
        @CustomType.Setter
        public Builder labelFingerprint(String labelFingerprint) {
            if (labelFingerprint == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "labelFingerprint");
            }
            this.labelFingerprint = labelFingerprint;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder lastAttachTimestamp(String lastAttachTimestamp) {
            if (lastAttachTimestamp == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "lastAttachTimestamp");
            }
            this.lastAttachTimestamp = lastAttachTimestamp;
            return this;
        }
        @CustomType.Setter
        public Builder lastDetachTimestamp(String lastDetachTimestamp) {
            if (lastDetachTimestamp == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "lastDetachTimestamp");
            }
            this.lastDetachTimestamp = lastDetachTimestamp;
            return this;
        }
        @CustomType.Setter
        public Builder licenses(List<String> licenses) {
            if (licenses == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "licenses");
            }
            this.licenses = licenses;
            return this;
        }
        public Builder licenses(String... licenses) {
            return licenses(List.of(licenses));
        }
        @CustomType.Setter
        public Builder multiWriter(Boolean multiWriter) {
            if (multiWriter == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "multiWriter");
            }
            this.multiWriter = multiWriter;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder params(List<GetDiskParam> params) {
            if (params == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "params");
            }
            this.params = params;
            return this;
        }
        public Builder params(GetDiskParam... params) {
            return params(List.of(params));
        }
        @CustomType.Setter
        public Builder physicalBlockSizeBytes(Integer physicalBlockSizeBytes) {
            if (physicalBlockSizeBytes == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "physicalBlockSizeBytes");
            }
            this.physicalBlockSizeBytes = physicalBlockSizeBytes;
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {

            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder provisionedIops(Integer provisionedIops) {
            if (provisionedIops == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "provisionedIops");
            }
            this.provisionedIops = provisionedIops;
            return this;
        }
        @CustomType.Setter
        public Builder provisionedThroughput(Integer provisionedThroughput) {
            if (provisionedThroughput == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "provisionedThroughput");
            }
            this.provisionedThroughput = provisionedThroughput;
            return this;
        }
        @CustomType.Setter
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            if (pulumiLabels == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "pulumiLabels");
            }
            this.pulumiLabels = pulumiLabels;
            return this;
        }
        @CustomType.Setter
        public Builder resourcePolicies(List<String> resourcePolicies) {
            if (resourcePolicies == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "resourcePolicies");
            }
            this.resourcePolicies = resourcePolicies;
            return this;
        }
        public Builder resourcePolicies(String... resourcePolicies) {
            return resourcePolicies(List.of(resourcePolicies));
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            if (selfLink == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "selfLink");
            }
            this.selfLink = selfLink;
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            if (size == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "size");
            }
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder snapshot(String snapshot) {
            if (snapshot == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "snapshot");
            }
            this.snapshot = snapshot;
            return this;
        }
        @CustomType.Setter
        public Builder sourceDisk(String sourceDisk) {
            if (sourceDisk == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "sourceDisk");
            }
            this.sourceDisk = sourceDisk;
            return this;
        }
        @CustomType.Setter
        public Builder sourceDiskId(String sourceDiskId) {
            if (sourceDiskId == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "sourceDiskId");
            }
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceImageEncryptionKeys(List<GetDiskSourceImageEncryptionKey> sourceImageEncryptionKeys) {
            if (sourceImageEncryptionKeys == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "sourceImageEncryptionKeys");
            }
            this.sourceImageEncryptionKeys = sourceImageEncryptionKeys;
            return this;
        }
        public Builder sourceImageEncryptionKeys(GetDiskSourceImageEncryptionKey... sourceImageEncryptionKeys) {
            return sourceImageEncryptionKeys(List.of(sourceImageEncryptionKeys));
        }
        @CustomType.Setter
        public Builder sourceImageId(String sourceImageId) {
            if (sourceImageId == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "sourceImageId");
            }
            this.sourceImageId = sourceImageId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceInstantSnapshot(String sourceInstantSnapshot) {
            if (sourceInstantSnapshot == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "sourceInstantSnapshot");
            }
            this.sourceInstantSnapshot = sourceInstantSnapshot;
            return this;
        }
        @CustomType.Setter
        public Builder sourceInstantSnapshotId(String sourceInstantSnapshotId) {
            if (sourceInstantSnapshotId == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "sourceInstantSnapshotId");
            }
            this.sourceInstantSnapshotId = sourceInstantSnapshotId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceSnapshotEncryptionKeys(List<GetDiskSourceSnapshotEncryptionKey> sourceSnapshotEncryptionKeys) {
            if (sourceSnapshotEncryptionKeys == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "sourceSnapshotEncryptionKeys");
            }
            this.sourceSnapshotEncryptionKeys = sourceSnapshotEncryptionKeys;
            return this;
        }
        public Builder sourceSnapshotEncryptionKeys(GetDiskSourceSnapshotEncryptionKey... sourceSnapshotEncryptionKeys) {
            return sourceSnapshotEncryptionKeys(List.of(sourceSnapshotEncryptionKeys));
        }
        @CustomType.Setter
        public Builder sourceSnapshotId(String sourceSnapshotId) {
            if (sourceSnapshotId == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "sourceSnapshotId");
            }
            this.sourceSnapshotId = sourceSnapshotId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceStorageObject(String sourceStorageObject) {
            if (sourceStorageObject == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "sourceStorageObject");
            }
            this.sourceStorageObject = sourceStorageObject;
            return this;
        }
        @CustomType.Setter
        public Builder storagePool(String storagePool) {
            if (storagePool == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "storagePool");
            }
            this.storagePool = storagePool;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder users(List<String> users) {
            if (users == null) {
              throw new MissingRequiredPropertyException("GetDiskResult", "users");
            }
            this.users = users;
            return this;
        }
        public Builder users(String... users) {
            return users(List.of(users));
        }
        @CustomType.Setter
        public Builder zone(@Nullable String zone) {

            this.zone = zone;
            return this;
        }
        public GetDiskResult build() {
            final var _resultValue = new GetDiskResult();
            _resultValue.accessMode = accessMode;
            _resultValue.architecture = architecture;
            _resultValue.asyncPrimaryDisks = asyncPrimaryDisks;
            _resultValue.createSnapshotBeforeDestroy = createSnapshotBeforeDestroy;
            _resultValue.createSnapshotBeforeDestroyPrefix = createSnapshotBeforeDestroyPrefix;
            _resultValue.creationTimestamp = creationTimestamp;
            _resultValue.description = description;
            _resultValue.diskEncryptionKeys = diskEncryptionKeys;
            _resultValue.diskId = diskId;
            _resultValue.effectiveLabels = effectiveLabels;
            _resultValue.enableConfidentialCompute = enableConfidentialCompute;
            _resultValue.guestOsFeatures = guestOsFeatures;
            _resultValue.id = id;
            _resultValue.image = image;
            _resultValue.interface_ = interface_;
            _resultValue.labelFingerprint = labelFingerprint;
            _resultValue.labels = labels;
            _resultValue.lastAttachTimestamp = lastAttachTimestamp;
            _resultValue.lastDetachTimestamp = lastDetachTimestamp;
            _resultValue.licenses = licenses;
            _resultValue.multiWriter = multiWriter;
            _resultValue.name = name;
            _resultValue.params = params;
            _resultValue.physicalBlockSizeBytes = physicalBlockSizeBytes;
            _resultValue.project = project;
            _resultValue.provisionedIops = provisionedIops;
            _resultValue.provisionedThroughput = provisionedThroughput;
            _resultValue.pulumiLabels = pulumiLabels;
            _resultValue.resourcePolicies = resourcePolicies;
            _resultValue.selfLink = selfLink;
            _resultValue.size = size;
            _resultValue.snapshot = snapshot;
            _resultValue.sourceDisk = sourceDisk;
            _resultValue.sourceDiskId = sourceDiskId;
            _resultValue.sourceImageEncryptionKeys = sourceImageEncryptionKeys;
            _resultValue.sourceImageId = sourceImageId;
            _resultValue.sourceInstantSnapshot = sourceInstantSnapshot;
            _resultValue.sourceInstantSnapshotId = sourceInstantSnapshotId;
            _resultValue.sourceSnapshotEncryptionKeys = sourceSnapshotEncryptionKeys;
            _resultValue.sourceSnapshotId = sourceSnapshotId;
            _resultValue.sourceStorageObject = sourceStorageObject;
            _resultValue.storagePool = storagePool;
            _resultValue.type = type;
            _resultValue.users = users;
            _resultValue.zone = zone;
            return _resultValue;
        }
    }
}
