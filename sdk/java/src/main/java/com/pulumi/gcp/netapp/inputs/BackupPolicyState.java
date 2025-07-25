// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.netapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final BackupPolicyState Empty = new BackupPolicyState();

    /**
     * The total number of volumes assigned by this backup policy.
     * 
     */
    @Import(name="assignedVolumeCount")
    private @Nullable Output<Integer> assignedVolumeCount;

    /**
     * @return The total number of volumes assigned by this backup policy.
     * 
     */
    public Optional<Output<Integer>> assignedVolumeCount() {
        return Optional.ofNullable(this.assignedVolumeCount);
    }

    /**
     * Create time of the backup policy. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Create time of the backup policy. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Number of daily backups to keep. Note that the minimum daily backup limit is 2.
     * 
     */
    @Import(name="dailyBackupLimit")
    private @Nullable Output<Integer> dailyBackupLimit;

    /**
     * @return Number of daily backups to keep. Note that the minimum daily backup limit is 2.
     * 
     */
    public Optional<Output<Integer>> dailyBackupLimit() {
        return Optional.ofNullable(this.dailyBackupLimit);
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
     * If enabled, make backups automatically according to the schedules.
     * This will be applied to all volumes that have this policy attached and enforced on volume level.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return If enabled, make backups automatically according to the schedules.
     * This will be applied to all volumes that have this policy attached and enforced on volume level.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
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
     * Name of the region for the policy to apply to.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Name of the region for the policy to apply to.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Number of monthly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
     * 
     */
    @Import(name="monthlyBackupLimit")
    private @Nullable Output<Integer> monthlyBackupLimit;

    /**
     * @return Number of monthly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
     * 
     */
    public Optional<Output<Integer>> monthlyBackupLimit() {
        return Optional.ofNullable(this.monthlyBackupLimit);
    }

    /**
     * The name of the backup policy. Needs to be unique per location.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the backup policy. Needs to be unique per location.
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
     * The state of the backup policy.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the backup policy.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Number of weekly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
     * 
     */
    @Import(name="weeklyBackupLimit")
    private @Nullable Output<Integer> weeklyBackupLimit;

    /**
     * @return Number of weekly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
     * 
     */
    public Optional<Output<Integer>> weeklyBackupLimit() {
        return Optional.ofNullable(this.weeklyBackupLimit);
    }

    private BackupPolicyState() {}

    private BackupPolicyState(BackupPolicyState $) {
        this.assignedVolumeCount = $.assignedVolumeCount;
        this.createTime = $.createTime;
        this.dailyBackupLimit = $.dailyBackupLimit;
        this.description = $.description;
        this.effectiveLabels = $.effectiveLabels;
        this.enabled = $.enabled;
        this.labels = $.labels;
        this.location = $.location;
        this.monthlyBackupLimit = $.monthlyBackupLimit;
        this.name = $.name;
        this.project = $.project;
        this.pulumiLabels = $.pulumiLabels;
        this.state = $.state;
        this.weeklyBackupLimit = $.weeklyBackupLimit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPolicyState $;

        public Builder() {
            $ = new BackupPolicyState();
        }

        public Builder(BackupPolicyState defaults) {
            $ = new BackupPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignedVolumeCount The total number of volumes assigned by this backup policy.
         * 
         * @return builder
         * 
         */
        public Builder assignedVolumeCount(@Nullable Output<Integer> assignedVolumeCount) {
            $.assignedVolumeCount = assignedVolumeCount;
            return this;
        }

        /**
         * @param assignedVolumeCount The total number of volumes assigned by this backup policy.
         * 
         * @return builder
         * 
         */
        public Builder assignedVolumeCount(Integer assignedVolumeCount) {
            return assignedVolumeCount(Output.of(assignedVolumeCount));
        }

        /**
         * @param createTime Create time of the backup policy. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Create time of the backup policy. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param dailyBackupLimit Number of daily backups to keep. Note that the minimum daily backup limit is 2.
         * 
         * @return builder
         * 
         */
        public Builder dailyBackupLimit(@Nullable Output<Integer> dailyBackupLimit) {
            $.dailyBackupLimit = dailyBackupLimit;
            return this;
        }

        /**
         * @param dailyBackupLimit Number of daily backups to keep. Note that the minimum daily backup limit is 2.
         * 
         * @return builder
         * 
         */
        public Builder dailyBackupLimit(Integer dailyBackupLimit) {
            return dailyBackupLimit(Output.of(dailyBackupLimit));
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
         * @param enabled If enabled, make backups automatically according to the schedules.
         * This will be applied to all volumes that have this policy attached and enforced on volume level.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled If enabled, make backups automatically according to the schedules.
         * This will be applied to all volumes that have this policy attached and enforced on volume level.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
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
         * @param location Name of the region for the policy to apply to.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Name of the region for the policy to apply to.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param monthlyBackupLimit Number of monthly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
         * 
         * @return builder
         * 
         */
        public Builder monthlyBackupLimit(@Nullable Output<Integer> monthlyBackupLimit) {
            $.monthlyBackupLimit = monthlyBackupLimit;
            return this;
        }

        /**
         * @param monthlyBackupLimit Number of monthly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
         * 
         * @return builder
         * 
         */
        public Builder monthlyBackupLimit(Integer monthlyBackupLimit) {
            return monthlyBackupLimit(Output.of(monthlyBackupLimit));
        }

        /**
         * @param name The name of the backup policy. Needs to be unique per location.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the backup policy. Needs to be unique per location.
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
         * @param state The state of the backup policy.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the backup policy.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param weeklyBackupLimit Number of weekly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
         * 
         * @return builder
         * 
         */
        public Builder weeklyBackupLimit(@Nullable Output<Integer> weeklyBackupLimit) {
            $.weeklyBackupLimit = weeklyBackupLimit;
            return this;
        }

        /**
         * @param weeklyBackupLimit Number of weekly backups to keep. Note that the sum of daily, weekly and monthly backups should be greater than 1.
         * 
         * @return builder
         * 
         */
        public Builder weeklyBackupLimit(Integer weeklyBackupLimit) {
            return weeklyBackupLimit(Output.of(weeklyBackupLimit));
        }

        public BackupPolicyState build() {
            return $;
        }
    }

}
