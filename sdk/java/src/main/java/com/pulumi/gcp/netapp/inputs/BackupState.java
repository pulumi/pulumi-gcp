// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.netapp.inputs;

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
     * Region in which backup is stored.
     * 
     */
    @Import(name="backupRegion")
    private @Nullable Output<String> backupRegion;

    /**
     * @return Region in which backup is stored.
     * 
     */
    public Optional<Output<String>> backupRegion() {
        return Optional.ofNullable(this.backupRegion);
    }

    /**
     * Type of backup, manually created or created by a backup policy. Possible Values : [TYPE_UNSPECIFIED, MANUAL, SCHEDULED]
     * 
     */
    @Import(name="backupType")
    private @Nullable Output<String> backupType;

    /**
     * @return Type of backup, manually created or created by a backup policy. Possible Values : [TYPE_UNSPECIFIED, MANUAL, SCHEDULED]
     * 
     */
    public Optional<Output<String>> backupType() {
        return Optional.ofNullable(this.backupType);
    }

    /**
     * Backups of a volume build incrementally on top of each other. They form a &#34;backup chain&#34;.
     * Total size of all backups in a chain in bytes = baseline backup size + sum(incremental backup size)
     * 
     */
    @Import(name="chainStorageBytes")
    private @Nullable Output<String> chainStorageBytes;

    /**
     * @return Backups of a volume build incrementally on top of each other. They form a &#34;backup chain&#34;.
     * Total size of all backups in a chain in bytes = baseline backup size + sum(incremental backup size)
     * 
     */
    public Optional<Output<String>> chainStorageBytes() {
        return Optional.ofNullable(this.chainStorageBytes);
    }

    /**
     * Create time of the backup. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Create time of the backup. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
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
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Import(name="effectiveLabels")
    private @Nullable Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Optional<Output<Map<String,String>>> effectiveLabels() {
        return Optional.ofNullable(this.effectiveLabels);
    }

    /**
     * Labels as key value pairs. Example: `{ &#34;owner&#34;: &#34;Bob&#34;, &#34;department&#34;: &#34;finance&#34;, &#34;purpose&#34;: &#34;testing&#34; }`.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels as key value pairs. Example: `{ &#34;owner&#34;: &#34;Bob&#34;, &#34;department&#34;: &#34;finance&#34;, &#34;purpose&#34;: &#34;testing&#34; }`.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Location of the backup.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Location of the backup.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name of the backup. Needs to be unique per location.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the backup. Needs to be unique per location.
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
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Import(name="pulumiLabels")
    private @Nullable Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Optional<Output<Map<String,String>>> pulumiLabels() {
        return Optional.ofNullable(this.pulumiLabels);
    }

    /**
     * If specified, backup will be created from the given snapshot. If not specified,
     * there will be a new snapshot taken to initiate the backup creation.
     * Format: `projects/{{projectId}}/locations/{{location}}/volumes/{{volumename}}/snapshots/{{snapshotname}}``
     * 
     */
    @Import(name="sourceSnapshot")
    private @Nullable Output<String> sourceSnapshot;

    /**
     * @return If specified, backup will be created from the given snapshot. If not specified,
     * there will be a new snapshot taken to initiate the backup creation.
     * Format: `projects/{{projectId}}/locations/{{location}}/volumes/{{volumename}}/snapshots/{{snapshotname}}``
     * 
     */
    public Optional<Output<String>> sourceSnapshot() {
        return Optional.ofNullable(this.sourceSnapshot);
    }

    /**
     * ID of volumes this backup belongs to. Format: `projects/{{projects_id}}/locations/{{location}}/volumes/{{name}}``
     * 
     */
    @Import(name="sourceVolume")
    private @Nullable Output<String> sourceVolume;

    /**
     * @return ID of volumes this backup belongs to. Format: `projects/{{projects_id}}/locations/{{location}}/volumes/{{name}}``
     * 
     */
    public Optional<Output<String>> sourceVolume() {
        return Optional.ofNullable(this.sourceVolume);
    }

    /**
     * The state of the Backup Vault. Possible Values : [STATE_UNSPECIFIED, CREATING, UPLOADING, READY, DELETING, ERROR, UPDATING]
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the Backup Vault. Possible Values : [STATE_UNSPECIFIED, CREATING, UPLOADING, READY, DELETING, ERROR, UPDATING]
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Name of the backup vault to store the backup in.
     * 
     */
    @Import(name="vaultName")
    private @Nullable Output<String> vaultName;

    /**
     * @return Name of the backup vault to store the backup in.
     * 
     */
    public Optional<Output<String>> vaultName() {
        return Optional.ofNullable(this.vaultName);
    }

    /**
     * Region of the volume from which the backup was created.
     * 
     */
    @Import(name="volumeRegion")
    private @Nullable Output<String> volumeRegion;

    /**
     * @return Region of the volume from which the backup was created.
     * 
     */
    public Optional<Output<String>> volumeRegion() {
        return Optional.ofNullable(this.volumeRegion);
    }

    /**
     * Size of the file system when the backup was created. When creating a new volume from the backup, the volume capacity will have to be at least as big.
     * 
     */
    @Import(name="volumeUsageBytes")
    private @Nullable Output<String> volumeUsageBytes;

    /**
     * @return Size of the file system when the backup was created. When creating a new volume from the backup, the volume capacity will have to be at least as big.
     * 
     */
    public Optional<Output<String>> volumeUsageBytes() {
        return Optional.ofNullable(this.volumeUsageBytes);
    }

    private BackupState() {}

    private BackupState(BackupState $) {
        this.backupRegion = $.backupRegion;
        this.backupType = $.backupType;
        this.chainStorageBytes = $.chainStorageBytes;
        this.createTime = $.createTime;
        this.description = $.description;
        this.effectiveLabels = $.effectiveLabels;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.pulumiLabels = $.pulumiLabels;
        this.sourceSnapshot = $.sourceSnapshot;
        this.sourceVolume = $.sourceVolume;
        this.state = $.state;
        this.vaultName = $.vaultName;
        this.volumeRegion = $.volumeRegion;
        this.volumeUsageBytes = $.volumeUsageBytes;
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
         * @param backupRegion Region in which backup is stored.
         * 
         * @return builder
         * 
         */
        public Builder backupRegion(@Nullable Output<String> backupRegion) {
            $.backupRegion = backupRegion;
            return this;
        }

        /**
         * @param backupRegion Region in which backup is stored.
         * 
         * @return builder
         * 
         */
        public Builder backupRegion(String backupRegion) {
            return backupRegion(Output.of(backupRegion));
        }

        /**
         * @param backupType Type of backup, manually created or created by a backup policy. Possible Values : [TYPE_UNSPECIFIED, MANUAL, SCHEDULED]
         * 
         * @return builder
         * 
         */
        public Builder backupType(@Nullable Output<String> backupType) {
            $.backupType = backupType;
            return this;
        }

        /**
         * @param backupType Type of backup, manually created or created by a backup policy. Possible Values : [TYPE_UNSPECIFIED, MANUAL, SCHEDULED]
         * 
         * @return builder
         * 
         */
        public Builder backupType(String backupType) {
            return backupType(Output.of(backupType));
        }

        /**
         * @param chainStorageBytes Backups of a volume build incrementally on top of each other. They form a &#34;backup chain&#34;.
         * Total size of all backups in a chain in bytes = baseline backup size + sum(incremental backup size)
         * 
         * @return builder
         * 
         */
        public Builder chainStorageBytes(@Nullable Output<String> chainStorageBytes) {
            $.chainStorageBytes = chainStorageBytes;
            return this;
        }

        /**
         * @param chainStorageBytes Backups of a volume build incrementally on top of each other. They form a &#34;backup chain&#34;.
         * Total size of all backups in a chain in bytes = baseline backup size + sum(incremental backup size)
         * 
         * @return builder
         * 
         */
        public Builder chainStorageBytes(String chainStorageBytes) {
            return chainStorageBytes(Output.of(chainStorageBytes));
        }

        /**
         * @param createTime Create time of the backup. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Create time of the backup. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
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
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(@Nullable Output<Map<String,String>> effectiveLabels) {
            $.effectiveLabels = effectiveLabels;
            return this;
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            return effectiveLabels(Output.of(effectiveLabels));
        }

        /**
         * @param labels Labels as key value pairs. Example: `{ &#34;owner&#34;: &#34;Bob&#34;, &#34;department&#34;: &#34;finance&#34;, &#34;purpose&#34;: &#34;testing&#34; }`.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels as key value pairs. Example: `{ &#34;owner&#34;: &#34;Bob&#34;, &#34;department&#34;: &#34;finance&#34;, &#34;purpose&#34;: &#34;testing&#34; }`.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location Location of the backup.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location of the backup.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource name of the backup. Needs to be unique per location.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the backup. Needs to be unique per location.
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
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(@Nullable Output<Map<String,String>> pulumiLabels) {
            $.pulumiLabels = pulumiLabels;
            return this;
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            return pulumiLabels(Output.of(pulumiLabels));
        }

        /**
         * @param sourceSnapshot If specified, backup will be created from the given snapshot. If not specified,
         * there will be a new snapshot taken to initiate the backup creation.
         * Format: `projects/{{projectId}}/locations/{{location}}/volumes/{{volumename}}/snapshots/{{snapshotname}}``
         * 
         * @return builder
         * 
         */
        public Builder sourceSnapshot(@Nullable Output<String> sourceSnapshot) {
            $.sourceSnapshot = sourceSnapshot;
            return this;
        }

        /**
         * @param sourceSnapshot If specified, backup will be created from the given snapshot. If not specified,
         * there will be a new snapshot taken to initiate the backup creation.
         * Format: `projects/{{projectId}}/locations/{{location}}/volumes/{{volumename}}/snapshots/{{snapshotname}}``
         * 
         * @return builder
         * 
         */
        public Builder sourceSnapshot(String sourceSnapshot) {
            return sourceSnapshot(Output.of(sourceSnapshot));
        }

        /**
         * @param sourceVolume ID of volumes this backup belongs to. Format: `projects/{{projects_id}}/locations/{{location}}/volumes/{{name}}``
         * 
         * @return builder
         * 
         */
        public Builder sourceVolume(@Nullable Output<String> sourceVolume) {
            $.sourceVolume = sourceVolume;
            return this;
        }

        /**
         * @param sourceVolume ID of volumes this backup belongs to. Format: `projects/{{projects_id}}/locations/{{location}}/volumes/{{name}}``
         * 
         * @return builder
         * 
         */
        public Builder sourceVolume(String sourceVolume) {
            return sourceVolume(Output.of(sourceVolume));
        }

        /**
         * @param state The state of the Backup Vault. Possible Values : [STATE_UNSPECIFIED, CREATING, UPLOADING, READY, DELETING, ERROR, UPDATING]
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the Backup Vault. Possible Values : [STATE_UNSPECIFIED, CREATING, UPLOADING, READY, DELETING, ERROR, UPDATING]
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param vaultName Name of the backup vault to store the backup in.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(@Nullable Output<String> vaultName) {
            $.vaultName = vaultName;
            return this;
        }

        /**
         * @param vaultName Name of the backup vault to store the backup in.
         * 
         * @return builder
         * 
         */
        public Builder vaultName(String vaultName) {
            return vaultName(Output.of(vaultName));
        }

        /**
         * @param volumeRegion Region of the volume from which the backup was created.
         * 
         * @return builder
         * 
         */
        public Builder volumeRegion(@Nullable Output<String> volumeRegion) {
            $.volumeRegion = volumeRegion;
            return this;
        }

        /**
         * @param volumeRegion Region of the volume from which the backup was created.
         * 
         * @return builder
         * 
         */
        public Builder volumeRegion(String volumeRegion) {
            return volumeRegion(Output.of(volumeRegion));
        }

        /**
         * @param volumeUsageBytes Size of the file system when the backup was created. When creating a new volume from the backup, the volume capacity will have to be at least as big.
         * 
         * @return builder
         * 
         */
        public Builder volumeUsageBytes(@Nullable Output<String> volumeUsageBytes) {
            $.volumeUsageBytes = volumeUsageBytes;
            return this;
        }

        /**
         * @param volumeUsageBytes Size of the file system when the backup was created. When creating a new volume from the backup, the volume capacity will have to be at least as big.
         * 
         * @return builder
         * 
         */
        public Builder volumeUsageBytes(String volumeUsageBytes) {
            return volumeUsageBytes(Output.of(volumeUsageBytes));
        }

        public BackupState build() {
            return $;
        }
    }

}
