// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.netapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeQuotaRuleState extends com.pulumi.resources.ResourceArgs {

    public static final VolumeQuotaRuleState Empty = new VolumeQuotaRuleState();

    /**
     * Create time of the quota rule. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Create time of the quota rule. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Description for the quota rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description for the quota rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The maximum allowed capacity in MiB.
     * 
     */
    @Import(name="diskLimitMib")
    private @Nullable Output<Integer> diskLimitMib;

    /**
     * @return The maximum allowed capacity in MiB.
     * 
     */
    public Optional<Output<Integer>> diskLimitMib() {
        return Optional.ofNullable(this.diskLimitMib);
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
     * Labels as key value pairs of the quota rule. Example: `{ &#34;owner&#34;: &#34;Bob&#34;, &#34;department&#34;: &#34;finance&#34;, &#34;purpose&#34;: &#34;testing&#34; }`.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels as key value pairs of the quota rule. Example: `{ &#34;owner&#34;: &#34;Bob&#34;, &#34;department&#34;: &#34;finance&#34;, &#34;purpose&#34;: &#34;testing&#34; }`.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Loction of the quotaRule. QuotaRules are child resources of volumes and live in the same location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Loction of the quotaRule. QuotaRules are child resources of volumes and live in the same location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name of the quotaRule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the quotaRule.
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
     * The state of the quota rule. Possible Values : [STATE_UNSPECIFIED, CREATING, UPDATING, READY, DELETING, ERROR]
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the quota rule. Possible Values : [STATE_UNSPECIFIED, CREATING, UPDATING, READY, DELETING, ERROR]
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * State details of the quota rule
     * 
     */
    @Import(name="stateDetails")
    private @Nullable Output<String> stateDetails;

    /**
     * @return State details of the quota rule
     * 
     */
    public Optional<Output<String>> stateDetails() {
        return Optional.ofNullable(this.stateDetails);
    }

    /**
     * The quota rule applies to the specified user or group.
     * Valid targets for volumes with NFS protocol enabled:
     * - UNIX UID for individual user quota
     * - UNIX GID for individual group quota
     *   Valid targets for volumes with SMB protocol enabled:
     * - Windows SID for individual user quota
     *   Leave empty for default quotas
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    /**
     * @return The quota rule applies to the specified user or group.
     * Valid targets for volumes with NFS protocol enabled:
     * - UNIX UID for individual user quota
     * - UNIX GID for individual group quota
     *   Valid targets for volumes with SMB protocol enabled:
     * - Windows SID for individual user quota
     *   Leave empty for default quotas
     * 
     */
    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    /**
     * Types of Quota Rule.
     * Possible values are: `INDIVIDUAL_USER_QUOTA`, `INDIVIDUAL_GROUP_QUOTA`, `DEFAULT_USER_QUOTA`, `DEFAULT_GROUP_QUOTA`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Types of Quota Rule.
     * Possible values are: `INDIVIDUAL_USER_QUOTA`, `INDIVIDUAL_GROUP_QUOTA`, `DEFAULT_USER_QUOTA`, `DEFAULT_GROUP_QUOTA`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Name of the volume to create the quotaRule in.
     * 
     */
    @Import(name="volumeName")
    private @Nullable Output<String> volumeName;

    /**
     * @return Name of the volume to create the quotaRule in.
     * 
     */
    public Optional<Output<String>> volumeName() {
        return Optional.ofNullable(this.volumeName);
    }

    private VolumeQuotaRuleState() {}

    private VolumeQuotaRuleState(VolumeQuotaRuleState $) {
        this.createTime = $.createTime;
        this.description = $.description;
        this.diskLimitMib = $.diskLimitMib;
        this.effectiveLabels = $.effectiveLabels;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.pulumiLabels = $.pulumiLabels;
        this.state = $.state;
        this.stateDetails = $.stateDetails;
        this.target = $.target;
        this.type = $.type;
        this.volumeName = $.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeQuotaRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeQuotaRuleState $;

        public Builder() {
            $ = new VolumeQuotaRuleState();
        }

        public Builder(VolumeQuotaRuleState defaults) {
            $ = new VolumeQuotaRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Create time of the quota rule. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Create time of the quota rule. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description Description for the quota rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description for the quota rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param diskLimitMib The maximum allowed capacity in MiB.
         * 
         * @return builder
         * 
         */
        public Builder diskLimitMib(@Nullable Output<Integer> diskLimitMib) {
            $.diskLimitMib = diskLimitMib;
            return this;
        }

        /**
         * @param diskLimitMib The maximum allowed capacity in MiB.
         * 
         * @return builder
         * 
         */
        public Builder diskLimitMib(Integer diskLimitMib) {
            return diskLimitMib(Output.of(diskLimitMib));
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
         * @param labels Labels as key value pairs of the quota rule. Example: `{ &#34;owner&#34;: &#34;Bob&#34;, &#34;department&#34;: &#34;finance&#34;, &#34;purpose&#34;: &#34;testing&#34; }`.
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
         * @param labels Labels as key value pairs of the quota rule. Example: `{ &#34;owner&#34;: &#34;Bob&#34;, &#34;department&#34;: &#34;finance&#34;, &#34;purpose&#34;: &#34;testing&#34; }`.
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
         * @param location Loction of the quotaRule. QuotaRules are child resources of volumes and live in the same location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Loction of the quotaRule. QuotaRules are child resources of volumes and live in the same location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource name of the quotaRule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the quotaRule.
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
         * @param state The state of the quota rule. Possible Values : [STATE_UNSPECIFIED, CREATING, UPDATING, READY, DELETING, ERROR]
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the quota rule. Possible Values : [STATE_UNSPECIFIED, CREATING, UPDATING, READY, DELETING, ERROR]
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param stateDetails State details of the quota rule
         * 
         * @return builder
         * 
         */
        public Builder stateDetails(@Nullable Output<String> stateDetails) {
            $.stateDetails = stateDetails;
            return this;
        }

        /**
         * @param stateDetails State details of the quota rule
         * 
         * @return builder
         * 
         */
        public Builder stateDetails(String stateDetails) {
            return stateDetails(Output.of(stateDetails));
        }

        /**
         * @param target The quota rule applies to the specified user or group.
         * Valid targets for volumes with NFS protocol enabled:
         * - UNIX UID for individual user quota
         * - UNIX GID for individual group quota
         *   Valid targets for volumes with SMB protocol enabled:
         * - Windows SID for individual user quota
         *   Leave empty for default quotas
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The quota rule applies to the specified user or group.
         * Valid targets for volumes with NFS protocol enabled:
         * - UNIX UID for individual user quota
         * - UNIX GID for individual group quota
         *   Valid targets for volumes with SMB protocol enabled:
         * - Windows SID for individual user quota
         *   Leave empty for default quotas
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param type Types of Quota Rule.
         * Possible values are: `INDIVIDUAL_USER_QUOTA`, `INDIVIDUAL_GROUP_QUOTA`, `DEFAULT_USER_QUOTA`, `DEFAULT_GROUP_QUOTA`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Types of Quota Rule.
         * Possible values are: `INDIVIDUAL_USER_QUOTA`, `INDIVIDUAL_GROUP_QUOTA`, `DEFAULT_USER_QUOTA`, `DEFAULT_GROUP_QUOTA`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param volumeName Name of the volume to create the quotaRule in.
         * 
         * @return builder
         * 
         */
        public Builder volumeName(@Nullable Output<String> volumeName) {
            $.volumeName = volumeName;
            return this;
        }

        /**
         * @param volumeName Name of the volume to create the quotaRule in.
         * 
         * @return builder
         * 
         */
        public Builder volumeName(String volumeName) {
            return volumeName(Output.of(volumeName));
        }

        public VolumeQuotaRuleState build() {
            return $;
        }
    }

}
