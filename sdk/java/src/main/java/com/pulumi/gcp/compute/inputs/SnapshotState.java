// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.SnapshotSnapshotEncryptionKeyArgs;
import com.pulumi.gcp.compute.inputs.SnapshotSourceDiskEncryptionKeyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotState extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotState Empty = new SnapshotState();

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
    private @Nullable Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Optional<Output<String>> creationTimestamp() {
        return Optional.ofNullable(this.creationTimestamp);
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Size of the snapshot, specified in GB.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<Integer> diskSizeGb;

    /**
     * @return Size of the snapshot, specified in GB.
     * 
     */
    public Optional<Output<Integer>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * The fingerprint used for optimistic locking of this resource. Used internally during updates.
     * 
     */
    @Import(name="labelFingerprint")
    private @Nullable Output<String> labelFingerprint;

    /**
     * @return The fingerprint used for optimistic locking of this resource. Used internally during updates.
     * 
     */
    public Optional<Output<String>> labelFingerprint() {
        return Optional.ofNullable(this.labelFingerprint);
    }

    /**
     * Labels to apply to this Snapshot.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels to apply to this Snapshot.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses
     * attached (such as a Windows image). snapshotEncryptionKey nested object Encrypts the snapshot using a customer-supplied
     * encryption key.
     * 
     */
    @Import(name="licenses")
    private @Nullable Output<List<String>> licenses;

    /**
     * @return A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses
     * attached (such as a Windows image). snapshotEncryptionKey nested object Encrypts the snapshot using a customer-supplied
     * encryption key.
     * 
     */
    public Optional<Output<List<String>>> licenses() {
        return Optional.ofNullable(this.licenses);
    }

    /**
     * Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * The customer-supplied encryption key of the snapshot. Required if the
     * source snapshot is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * 
     */
    @Import(name="snapshotEncryptionKey")
    private @Nullable Output<SnapshotSnapshotEncryptionKeyArgs> snapshotEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the snapshot. Required if the
     * source snapshot is protected by a customer-supplied encryption key.
     * Structure is documented below.
     * 
     */
    public Optional<Output<SnapshotSnapshotEncryptionKeyArgs>> snapshotEncryptionKey() {
        return Optional.ofNullable(this.snapshotEncryptionKey);
    }

    /**
     * The unique identifier for the resource.
     * 
     */
    @Import(name="snapshotId")
    private @Nullable Output<Integer> snapshotId;

    /**
     * @return The unique identifier for the resource.
     * 
     */
    public Optional<Output<Integer>> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }

    /**
     * A reference to the disk used to create this snapshot.
     * 
     */
    @Import(name="sourceDisk")
    private @Nullable Output<String> sourceDisk;

    /**
     * @return A reference to the disk used to create this snapshot.
     * 
     */
    public Optional<Output<String>> sourceDisk() {
        return Optional.ofNullable(this.sourceDisk);
    }

    /**
     * The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * 
     */
    @Import(name="sourceDiskEncryptionKey")
    private @Nullable Output<SnapshotSourceDiskEncryptionKeyArgs> sourceDiskEncryptionKey;

    /**
     * @return The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * 
     */
    public Optional<Output<SnapshotSourceDiskEncryptionKeyArgs>> sourceDiskEncryptionKey() {
        return Optional.ofNullable(this.sourceDiskEncryptionKey);
    }

    /**
     * A size of the storage used by the snapshot. As snapshots share storage, this number is expected to change with snapshot
     * creation/deletion.
     * 
     */
    @Import(name="storageBytes")
    private @Nullable Output<Integer> storageBytes;

    /**
     * @return A size of the storage used by the snapshot. As snapshots share storage, this number is expected to change with snapshot
     * creation/deletion.
     * 
     */
    public Optional<Output<Integer>> storageBytes() {
        return Optional.ofNullable(this.storageBytes);
    }

    /**
     * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
     * 
     */
    @Import(name="storageLocations")
    private @Nullable Output<List<String>> storageLocations;

    /**
     * @return Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
     * 
     */
    public Optional<Output<List<String>>> storageLocations() {
        return Optional.ofNullable(this.storageLocations);
    }

    /**
     * A reference to the zone where the disk is hosted.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return A reference to the zone where the disk is hosted.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private SnapshotState() {}

    private SnapshotState(SnapshotState $) {
        this.creationTimestamp = $.creationTimestamp;
        this.description = $.description;
        this.diskSizeGb = $.diskSizeGb;
        this.labelFingerprint = $.labelFingerprint;
        this.labels = $.labels;
        this.licenses = $.licenses;
        this.name = $.name;
        this.project = $.project;
        this.selfLink = $.selfLink;
        this.snapshotEncryptionKey = $.snapshotEncryptionKey;
        this.snapshotId = $.snapshotId;
        this.sourceDisk = $.sourceDisk;
        this.sourceDiskEncryptionKey = $.sourceDiskEncryptionKey;
        this.storageBytes = $.storageBytes;
        this.storageLocations = $.storageLocations;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotState $;

        public Builder() {
            $ = new SnapshotState();
        }

        public Builder(SnapshotState defaults) {
            $ = new SnapshotState(Objects.requireNonNull(defaults));
        }

        /**
         * @param creationTimestamp Creation timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            $.creationTimestamp = creationTimestamp;
            return this;
        }

        /**
         * @param creationTimestamp Creation timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder creationTimestamp(String creationTimestamp) {
            return creationTimestamp(Output.of(creationTimestamp));
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param diskSizeGb Size of the snapshot, specified in GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb Size of the snapshot, specified in GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Integer diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param labelFingerprint The fingerprint used for optimistic locking of this resource. Used internally during updates.
         * 
         * @return builder
         * 
         */
        public Builder labelFingerprint(@Nullable Output<String> labelFingerprint) {
            $.labelFingerprint = labelFingerprint;
            return this;
        }

        /**
         * @param labelFingerprint The fingerprint used for optimistic locking of this resource. Used internally during updates.
         * 
         * @return builder
         * 
         */
        public Builder labelFingerprint(String labelFingerprint) {
            return labelFingerprint(Output.of(labelFingerprint));
        }

        /**
         * @param labels Labels to apply to this Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels to apply to this Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param licenses A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses
         * attached (such as a Windows image). snapshotEncryptionKey nested object Encrypts the snapshot using a customer-supplied
         * encryption key.
         * 
         * @return builder
         * 
         */
        public Builder licenses(@Nullable Output<List<String>> licenses) {
            $.licenses = licenses;
            return this;
        }

        /**
         * @param licenses A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses
         * attached (such as a Windows image). snapshotEncryptionKey nested object Encrypts the snapshot using a customer-supplied
         * encryption key.
         * 
         * @return builder
         * 
         */
        public Builder licenses(List<String> licenses) {
            return licenses(Output.of(licenses));
        }

        /**
         * @param licenses A list of public visible licenses that apply to this snapshot. This can be because the original image had licenses
         * attached (such as a Windows image). snapshotEncryptionKey nested object Encrypts the snapshot using a customer-supplied
         * encryption key.
         * 
         * @return builder
         * 
         */
        public Builder licenses(String... licenses) {
            return licenses(List.of(licenses));
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param selfLink The URI of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        /**
         * @param selfLink The URI of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        /**
         * @param snapshotEncryptionKey The customer-supplied encryption key of the snapshot. Required if the
         * source snapshot is protected by a customer-supplied encryption key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder snapshotEncryptionKey(@Nullable Output<SnapshotSnapshotEncryptionKeyArgs> snapshotEncryptionKey) {
            $.snapshotEncryptionKey = snapshotEncryptionKey;
            return this;
        }

        /**
         * @param snapshotEncryptionKey The customer-supplied encryption key of the snapshot. Required if the
         * source snapshot is protected by a customer-supplied encryption key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder snapshotEncryptionKey(SnapshotSnapshotEncryptionKeyArgs snapshotEncryptionKey) {
            return snapshotEncryptionKey(Output.of(snapshotEncryptionKey));
        }

        /**
         * @param snapshotId The unique identifier for the resource.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(@Nullable Output<Integer> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param snapshotId The unique identifier for the resource.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(Integer snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        /**
         * @param sourceDisk A reference to the disk used to create this snapshot.
         * 
         * @return builder
         * 
         */
        public Builder sourceDisk(@Nullable Output<String> sourceDisk) {
            $.sourceDisk = sourceDisk;
            return this;
        }

        /**
         * @param sourceDisk A reference to the disk used to create this snapshot.
         * 
         * @return builder
         * 
         */
        public Builder sourceDisk(String sourceDisk) {
            return sourceDisk(Output.of(sourceDisk));
        }

        /**
         * @param sourceDiskEncryptionKey The customer-supplied encryption key of the source snapshot. Required
         * if the source snapshot is protected by a customer-supplied encryption
         * key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sourceDiskEncryptionKey(@Nullable Output<SnapshotSourceDiskEncryptionKeyArgs> sourceDiskEncryptionKey) {
            $.sourceDiskEncryptionKey = sourceDiskEncryptionKey;
            return this;
        }

        /**
         * @param sourceDiskEncryptionKey The customer-supplied encryption key of the source snapshot. Required
         * if the source snapshot is protected by a customer-supplied encryption
         * key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sourceDiskEncryptionKey(SnapshotSourceDiskEncryptionKeyArgs sourceDiskEncryptionKey) {
            return sourceDiskEncryptionKey(Output.of(sourceDiskEncryptionKey));
        }

        /**
         * @param storageBytes A size of the storage used by the snapshot. As snapshots share storage, this number is expected to change with snapshot
         * creation/deletion.
         * 
         * @return builder
         * 
         */
        public Builder storageBytes(@Nullable Output<Integer> storageBytes) {
            $.storageBytes = storageBytes;
            return this;
        }

        /**
         * @param storageBytes A size of the storage used by the snapshot. As snapshots share storage, this number is expected to change with snapshot
         * creation/deletion.
         * 
         * @return builder
         * 
         */
        public Builder storageBytes(Integer storageBytes) {
            return storageBytes(Output.of(storageBytes));
        }

        /**
         * @param storageLocations Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
         * 
         * @return builder
         * 
         */
        public Builder storageLocations(@Nullable Output<List<String>> storageLocations) {
            $.storageLocations = storageLocations;
            return this;
        }

        /**
         * @param storageLocations Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
         * 
         * @return builder
         * 
         */
        public Builder storageLocations(List<String> storageLocations) {
            return storageLocations(Output.of(storageLocations));
        }

        /**
         * @param storageLocations Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
         * 
         * @return builder
         * 
         */
        public Builder storageLocations(String... storageLocations) {
            return storageLocations(List.of(storageLocations));
        }

        /**
         * @param zone A reference to the zone where the disk is hosted.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone A reference to the zone where the disk is hosted.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public SnapshotState build() {
            return $;
        }
    }

}