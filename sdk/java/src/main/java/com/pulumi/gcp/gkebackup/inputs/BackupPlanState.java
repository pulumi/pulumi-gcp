// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkebackup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs;
import com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleArgs;
import com.pulumi.gcp.gkebackup.inputs.BackupPlanRetentionPolicyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupPlanState extends com.pulumi.resources.ResourceArgs {

    public static final BackupPlanState Empty = new BackupPlanState();

    /**
     * Defines the configuration of Backups created via this BackupPlan.
     * Structure is documented below.
     * 
     */
    @Import(name="backupConfig")
    private @Nullable Output<BackupPlanBackupConfigArgs> backupConfig;

    /**
     * @return Defines the configuration of Backups created via this BackupPlan.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BackupPlanBackupConfigArgs>> backupConfig() {
        return Optional.ofNullable(this.backupConfig);
    }

    /**
     * Defines a schedule for automatic Backup creation via this BackupPlan.
     * Structure is documented below.
     * 
     */
    @Import(name="backupSchedule")
    private @Nullable Output<BackupPlanBackupScheduleArgs> backupSchedule;

    /**
     * @return Defines a schedule for automatic Backup creation via this BackupPlan.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BackupPlanBackupScheduleArgs>> backupSchedule() {
        return Optional.ofNullable(this.backupSchedule);
    }

    /**
     * The source cluster from which Backups will be created via this BackupPlan.
     * 
     */
    @Import(name="cluster")
    private @Nullable Output<String> cluster;

    /**
     * @return The source cluster from which Backups will be created via this BackupPlan.
     * 
     */
    public Optional<Output<String>> cluster() {
        return Optional.ofNullable(this.cluster);
    }

    /**
     * This flag indicates whether this BackupPlan has been deactivated.
     * Setting this field to True locks the BackupPlan such that no further updates will be allowed
     * (except deletes), including the deactivated field itself. It also prevents any new Backups
     * from being created via this BackupPlan (including scheduled Backups).
     * 
     */
    @Import(name="deactivated")
    private @Nullable Output<Boolean> deactivated;

    /**
     * @return This flag indicates whether this BackupPlan has been deactivated.
     * Setting this field to True locks the BackupPlan such that no further updates will be allowed
     * (except deletes), including the deactivated field itself. It also prevents any new Backups
     * from being created via this BackupPlan (including scheduled Backups).
     * 
     */
    public Optional<Output<Boolean>> deactivated() {
        return Optional.ofNullable(this.deactivated);
    }

    /**
     * User specified descriptive string for this BackupPlan.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return User specified descriptive string for this BackupPlan.
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
     * etag is used for optimistic concurrency control as a way to help prevent simultaneous
     * updates of a backup plan from overwriting each other. It is strongly suggested that
     * systems make use of the &#39;etag&#39; in the read-modify-write cycle to perform BackupPlan updates
     * in order to avoid race conditions: An etag is returned in the response to backupPlans.get,
     * and systems are expected to put that etag in the request to backupPlans.patch or
     * backupPlans.delete to ensure that their change will be applied to the same version of the resource.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return etag is used for optimistic concurrency control as a way to help prevent simultaneous
     * updates of a backup plan from overwriting each other. It is strongly suggested that
     * systems make use of the &#39;etag&#39; in the read-modify-write cycle to perform BackupPlan updates
     * in order to avoid race conditions: An etag is returned in the response to backupPlans.get,
     * and systems are expected to put that etag in the request to backupPlans.patch or
     * backupPlans.delete to ensure that their change will be applied to the same version of the resource.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Description: A set of custom labels supplied by the user.
     * A list of key-&gt;value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Description: A set of custom labels supplied by the user.
     * A list of key-&gt;value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The region of the Backup Plan.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The region of the Backup Plan.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The full name of the BackupPlan Resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The full name of the BackupPlan Resource.
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
     * The number of Kubernetes Pods backed up in the last successful Backup created via this BackupPlan.
     * 
     */
    @Import(name="protectedPodCount")
    private @Nullable Output<Integer> protectedPodCount;

    /**
     * @return The number of Kubernetes Pods backed up in the last successful Backup created via this BackupPlan.
     * 
     */
    public Optional<Output<Integer>> protectedPodCount() {
        return Optional.ofNullable(this.protectedPodCount);
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
     * RetentionPolicy governs lifecycle of Backups created under this plan.
     * Structure is documented below.
     * 
     */
    @Import(name="retentionPolicy")
    private @Nullable Output<BackupPlanRetentionPolicyArgs> retentionPolicy;

    /**
     * @return RetentionPolicy governs lifecycle of Backups created under this plan.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BackupPlanRetentionPolicyArgs>> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }

    /**
     * The State of the BackupPlan.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The State of the BackupPlan.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Detailed description of why BackupPlan is in its current state.
     * 
     */
    @Import(name="stateReason")
    private @Nullable Output<String> stateReason;

    /**
     * @return Detailed description of why BackupPlan is in its current state.
     * 
     */
    public Optional<Output<String>> stateReason() {
        return Optional.ofNullable(this.stateReason);
    }

    /**
     * Server generated, unique identifier of UUID format.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return Server generated, unique identifier of UUID format.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    private BackupPlanState() {}

    private BackupPlanState(BackupPlanState $) {
        this.backupConfig = $.backupConfig;
        this.backupSchedule = $.backupSchedule;
        this.cluster = $.cluster;
        this.deactivated = $.deactivated;
        this.description = $.description;
        this.effectiveLabels = $.effectiveLabels;
        this.etag = $.etag;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.protectedPodCount = $.protectedPodCount;
        this.pulumiLabels = $.pulumiLabels;
        this.retentionPolicy = $.retentionPolicy;
        this.state = $.state;
        this.stateReason = $.stateReason;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPlanState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPlanState $;

        public Builder() {
            $ = new BackupPlanState();
        }

        public Builder(BackupPlanState defaults) {
            $ = new BackupPlanState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupConfig Defines the configuration of Backups created via this BackupPlan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder backupConfig(@Nullable Output<BackupPlanBackupConfigArgs> backupConfig) {
            $.backupConfig = backupConfig;
            return this;
        }

        /**
         * @param backupConfig Defines the configuration of Backups created via this BackupPlan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder backupConfig(BackupPlanBackupConfigArgs backupConfig) {
            return backupConfig(Output.of(backupConfig));
        }

        /**
         * @param backupSchedule Defines a schedule for automatic Backup creation via this BackupPlan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder backupSchedule(@Nullable Output<BackupPlanBackupScheduleArgs> backupSchedule) {
            $.backupSchedule = backupSchedule;
            return this;
        }

        /**
         * @param backupSchedule Defines a schedule for automatic Backup creation via this BackupPlan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder backupSchedule(BackupPlanBackupScheduleArgs backupSchedule) {
            return backupSchedule(Output.of(backupSchedule));
        }

        /**
         * @param cluster The source cluster from which Backups will be created via this BackupPlan.
         * 
         * @return builder
         * 
         */
        public Builder cluster(@Nullable Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster The source cluster from which Backups will be created via this BackupPlan.
         * 
         * @return builder
         * 
         */
        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        /**
         * @param deactivated This flag indicates whether this BackupPlan has been deactivated.
         * Setting this field to True locks the BackupPlan such that no further updates will be allowed
         * (except deletes), including the deactivated field itself. It also prevents any new Backups
         * from being created via this BackupPlan (including scheduled Backups).
         * 
         * @return builder
         * 
         */
        public Builder deactivated(@Nullable Output<Boolean> deactivated) {
            $.deactivated = deactivated;
            return this;
        }

        /**
         * @param deactivated This flag indicates whether this BackupPlan has been deactivated.
         * Setting this field to True locks the BackupPlan such that no further updates will be allowed
         * (except deletes), including the deactivated field itself. It also prevents any new Backups
         * from being created via this BackupPlan (including scheduled Backups).
         * 
         * @return builder
         * 
         */
        public Builder deactivated(Boolean deactivated) {
            return deactivated(Output.of(deactivated));
        }

        /**
         * @param description User specified descriptive string for this BackupPlan.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description User specified descriptive string for this BackupPlan.
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
         * @param etag etag is used for optimistic concurrency control as a way to help prevent simultaneous
         * updates of a backup plan from overwriting each other. It is strongly suggested that
         * systems make use of the &#39;etag&#39; in the read-modify-write cycle to perform BackupPlan updates
         * in order to avoid race conditions: An etag is returned in the response to backupPlans.get,
         * and systems are expected to put that etag in the request to backupPlans.patch or
         * backupPlans.delete to ensure that their change will be applied to the same version of the resource.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag etag is used for optimistic concurrency control as a way to help prevent simultaneous
         * updates of a backup plan from overwriting each other. It is strongly suggested that
         * systems make use of the &#39;etag&#39; in the read-modify-write cycle to perform BackupPlan updates
         * in order to avoid race conditions: An etag is returned in the response to backupPlans.get,
         * and systems are expected to put that etag in the request to backupPlans.patch or
         * backupPlans.delete to ensure that their change will be applied to the same version of the resource.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param labels Description: A set of custom labels supplied by the user.
         * A list of key-&gt;value pairs.
         * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
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
         * @param labels Description: A set of custom labels supplied by the user.
         * A list of key-&gt;value pairs.
         * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
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
         * @param location The region of the Backup Plan.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The region of the Backup Plan.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The full name of the BackupPlan Resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The full name of the BackupPlan Resource.
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
         * @param protectedPodCount The number of Kubernetes Pods backed up in the last successful Backup created via this BackupPlan.
         * 
         * @return builder
         * 
         */
        public Builder protectedPodCount(@Nullable Output<Integer> protectedPodCount) {
            $.protectedPodCount = protectedPodCount;
            return this;
        }

        /**
         * @param protectedPodCount The number of Kubernetes Pods backed up in the last successful Backup created via this BackupPlan.
         * 
         * @return builder
         * 
         */
        public Builder protectedPodCount(Integer protectedPodCount) {
            return protectedPodCount(Output.of(protectedPodCount));
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
         * @param retentionPolicy RetentionPolicy governs lifecycle of Backups created under this plan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(@Nullable Output<BackupPlanRetentionPolicyArgs> retentionPolicy) {
            $.retentionPolicy = retentionPolicy;
            return this;
        }

        /**
         * @param retentionPolicy RetentionPolicy governs lifecycle of Backups created under this plan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(BackupPlanRetentionPolicyArgs retentionPolicy) {
            return retentionPolicy(Output.of(retentionPolicy));
        }

        /**
         * @param state The State of the BackupPlan.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The State of the BackupPlan.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param stateReason Detailed description of why BackupPlan is in its current state.
         * 
         * @return builder
         * 
         */
        public Builder stateReason(@Nullable Output<String> stateReason) {
            $.stateReason = stateReason;
            return this;
        }

        /**
         * @param stateReason Detailed description of why BackupPlan is in its current state.
         * 
         * @return builder
         * 
         */
        public Builder stateReason(String stateReason) {
            return stateReason(Output.of(stateReason));
        }

        /**
         * @param uid Server generated, unique identifier of UUID format.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid Server generated, unique identifier of UUID format.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        public BackupPlanState build() {
            return $;
        }
    }

}
