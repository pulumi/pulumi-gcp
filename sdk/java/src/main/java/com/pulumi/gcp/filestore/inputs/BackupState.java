// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.filestore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupState extends com.pulumi.resources.ResourceArgs {

    public static final BackupState Empty = new BackupState();

    /**
     * The amount of bytes needed to allocate a full copy of the snapshot content.
     * 
     */
    @Import(name="capacityGb")
    private @Nullable Output<String> capacityGb;

    /**
     * @return The amount of bytes needed to allocate a full copy of the snapshot content.
     * 
     */
    public Optional<Output<String>> capacityGb() {
        return Optional.ofNullable(this.capacityGb);
    }

    /**
     * The time when the snapshot was created in RFC3339 text format.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time when the snapshot was created in RFC3339 text format.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Amount of bytes that will be downloaded if the backup is restored.
     * 
     */
    @Import(name="downloadBytes")
    private @Nullable Output<String> downloadBytes;

    /**
     * @return Amount of bytes that will be downloaded if the backup is restored.
     * 
     */
    public Optional<Output<String>> downloadBytes() {
        return Optional.ofNullable(this.downloadBytes);
    }

    /**
     * KMS key name used for data encryption.
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    /**
     * @return KMS key name used for data encryption.
     * 
     */
    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name of the backup. The name must be unique within the specified instance.
     * The name must be 1-63 characters long, and comply with
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
     * @return The resource name of the backup. The name must be unique within the specified instance.
     * The name must be 1-63 characters long, and comply with
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
     * Name of the file share in the source Cloud Filestore instance that the backup is created from.
     * 
     */
    @Import(name="sourceFileShare")
    private @Nullable Output<String> sourceFileShare;

    /**
     * @return Name of the file share in the source Cloud Filestore instance that the backup is created from.
     * 
     */
    public Optional<Output<String>> sourceFileShare() {
        return Optional.ofNullable(this.sourceFileShare);
    }

    /**
     * The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
     * 
     */
    @Import(name="sourceInstance")
    private @Nullable Output<String> sourceInstance;

    /**
     * @return The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
     * 
     */
    public Optional<Output<String>> sourceInstance() {
        return Optional.ofNullable(this.sourceInstance);
    }

    /**
     * The service tier of the source Cloud Filestore instance that this backup is created from.
     * 
     */
    @Import(name="sourceInstanceTier")
    private @Nullable Output<String> sourceInstanceTier;

    /**
     * @return The service tier of the source Cloud Filestore instance that this backup is created from.
     * 
     */
    public Optional<Output<String>> sourceInstanceTier() {
        return Optional.ofNullable(this.sourceInstanceTier);
    }

    /**
     * The backup state.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The backup state.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion.
     * 
     */
    @Import(name="storageBytes")
    private @Nullable Output<String> storageBytes;

    /**
     * @return The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion.
     * 
     */
    public Optional<Output<String>> storageBytes() {
        return Optional.ofNullable(this.storageBytes);
    }

    private BackupState() {}

    private BackupState(BackupState $) {
        this.capacityGb = $.capacityGb;
        this.createTime = $.createTime;
        this.description = $.description;
        this.downloadBytes = $.downloadBytes;
        this.kmsKeyName = $.kmsKeyName;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.sourceFileShare = $.sourceFileShare;
        this.sourceInstance = $.sourceInstance;
        this.sourceInstanceTier = $.sourceInstanceTier;
        this.state = $.state;
        this.storageBytes = $.storageBytes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupState $;

        public Builder() {
            $ = new BackupState();
        }

        public Builder(BackupState defaults) {
            $ = new BackupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacityGb The amount of bytes needed to allocate a full copy of the snapshot content.
         * 
         * @return builder
         * 
         */
        public Builder capacityGb(@Nullable Output<String> capacityGb) {
            $.capacityGb = capacityGb;
            return this;
        }

        /**
         * @param capacityGb The amount of bytes needed to allocate a full copy of the snapshot content.
         * 
         * @return builder
         * 
         */
        public Builder capacityGb(String capacityGb) {
            return capacityGb(Output.of(capacityGb));
        }

        /**
         * @param createTime The time when the snapshot was created in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time when the snapshot was created in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param downloadBytes Amount of bytes that will be downloaded if the backup is restored.
         * 
         * @return builder
         * 
         */
        public Builder downloadBytes(@Nullable Output<String> downloadBytes) {
            $.downloadBytes = downloadBytes;
            return this;
        }

        /**
         * @param downloadBytes Amount of bytes that will be downloaded if the backup is restored.
         * 
         * @return builder
         * 
         */
        public Builder downloadBytes(String downloadBytes) {
            return downloadBytes(Output.of(downloadBytes));
        }

        /**
         * @param kmsKeyName KMS key name used for data encryption.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName KMS key name used for data encryption.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        /**
         * @param labels Resource labels to represent user-provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Resource labels to represent user-provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource name of the backup. The name must be unique within the specified instance.
         * The name must be 1-63 characters long, and comply with
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
         * @param name The resource name of the backup. The name must be unique within the specified instance.
         * The name must be 1-63 characters long, and comply with
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
         * @param sourceFileShare Name of the file share in the source Cloud Filestore instance that the backup is created from.
         * 
         * @return builder
         * 
         */
        public Builder sourceFileShare(@Nullable Output<String> sourceFileShare) {
            $.sourceFileShare = sourceFileShare;
            return this;
        }

        /**
         * @param sourceFileShare Name of the file share in the source Cloud Filestore instance that the backup is created from.
         * 
         * @return builder
         * 
         */
        public Builder sourceFileShare(String sourceFileShare) {
            return sourceFileShare(Output.of(sourceFileShare));
        }

        /**
         * @param sourceInstance The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
         * 
         * @return builder
         * 
         */
        public Builder sourceInstance(@Nullable Output<String> sourceInstance) {
            $.sourceInstance = sourceInstance;
            return this;
        }

        /**
         * @param sourceInstance The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
         * 
         * @return builder
         * 
         */
        public Builder sourceInstance(String sourceInstance) {
            return sourceInstance(Output.of(sourceInstance));
        }

        /**
         * @param sourceInstanceTier The service tier of the source Cloud Filestore instance that this backup is created from.
         * 
         * @return builder
         * 
         */
        public Builder sourceInstanceTier(@Nullable Output<String> sourceInstanceTier) {
            $.sourceInstanceTier = sourceInstanceTier;
            return this;
        }

        /**
         * @param sourceInstanceTier The service tier of the source Cloud Filestore instance that this backup is created from.
         * 
         * @return builder
         * 
         */
        public Builder sourceInstanceTier(String sourceInstanceTier) {
            return sourceInstanceTier(Output.of(sourceInstanceTier));
        }

        /**
         * @param state The backup state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The backup state.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param storageBytes The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion.
         * 
         * @return builder
         * 
         */
        public Builder storageBytes(@Nullable Output<String> storageBytes) {
            $.storageBytes = storageBytes;
            return this;
        }

        /**
         * @param storageBytes The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion.
         * 
         * @return builder
         * 
         */
        public Builder storageBytes(String storageBytes) {
            return storageBytes(Output.of(storageBytes));
        }

        public BackupState build() {
            return $;
        }
    }

}