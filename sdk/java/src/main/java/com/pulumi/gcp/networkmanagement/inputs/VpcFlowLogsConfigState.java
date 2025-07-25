// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkmanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcFlowLogsConfigState extends com.pulumi.resources.ResourceArgs {

    public static final VpcFlowLogsConfigState Empty = new VpcFlowLogsConfigState();

    /**
     * Optional. The aggregation interval for the logs. Default value is
     * INTERVAL_5_SEC.   Possible values:  AGGREGATION_INTERVAL_UNSPECIFIED INTERVAL_5_SEC INTERVAL_30_SEC INTERVAL_1_MIN INTERVAL_5_MIN INTERVAL_10_MIN INTERVAL_15_MIN&#34;
     * 
     */
    @Import(name="aggregationInterval")
    private @Nullable Output<String> aggregationInterval;

    /**
     * @return Optional. The aggregation interval for the logs. Default value is
     * INTERVAL_5_SEC.   Possible values:  AGGREGATION_INTERVAL_UNSPECIFIED INTERVAL_5_SEC INTERVAL_30_SEC INTERVAL_1_MIN INTERVAL_5_MIN INTERVAL_10_MIN INTERVAL_15_MIN&#34;
     * 
     */
    public Optional<Output<String>> aggregationInterval() {
        return Optional.ofNullable(this.aggregationInterval);
    }

    /**
     * Output only. The time the config was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Output only. The time the config was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Optional. The user-supplied description of the VPC Flow Logs configuration. Maximum
     * of 512 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. The user-supplied description of the VPC Flow Logs configuration. Maximum
     * of 512 characters.
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
     * Optional. Export filter used to define which VPC Flow Logs should be logged.
     * 
     */
    @Import(name="filterExpr")
    private @Nullable Output<String> filterExpr;

    /**
     * @return Optional. Export filter used to define which VPC Flow Logs should be logged.
     * 
     */
    public Optional<Output<String>> filterExpr() {
        return Optional.ofNullable(this.filterExpr);
    }

    /**
     * Optional. The value of the field must be in (0, 1]. The sampling rate
     * of VPC Flow Logs where 1.0 means all collected logs are reported. Setting the
     * sampling rate to 0.0 is not allowed. If you want to disable VPC Flow Logs, use
     * the state field instead. Default value is 1.0.
     * 
     */
    @Import(name="flowSampling")
    private @Nullable Output<Double> flowSampling;

    /**
     * @return Optional. The value of the field must be in (0, 1]. The sampling rate
     * of VPC Flow Logs where 1.0 means all collected logs are reported. Setting the
     * sampling rate to 0.0 is not allowed. If you want to disable VPC Flow Logs, use
     * the state field instead. Default value is 1.0.
     * 
     */
    public Optional<Output<Double>> flowSampling() {
        return Optional.ofNullable(this.flowSampling);
    }

    /**
     * Traffic will be logged from the Interconnect Attachment. Format: projects/{project_id}/regions/{region}/interconnectAttachments/{name}
     * 
     */
    @Import(name="interconnectAttachment")
    private @Nullable Output<String> interconnectAttachment;

    /**
     * @return Traffic will be logged from the Interconnect Attachment. Format: projects/{project_id}/regions/{region}/interconnectAttachments/{name}
     * 
     */
    public Optional<Output<String>> interconnectAttachment() {
        return Optional.ofNullable(this.interconnectAttachment);
    }

    /**
     * Optional. Resource labels to represent user-provided metadata.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Resource labels to represent user-provided metadata.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Resource ID segment making up resource `name`. It identifies the resource
     * within its parent collection as described in https://google.aip.dev/122. See documentation
     * for resource type `networkmanagement.googleapis.com/VpcFlowLogsConfig`.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource ID segment making up resource `name`. It identifies the resource
     * within its parent collection as described in https://google.aip.dev/122. See documentation
     * for resource type `networkmanagement.googleapis.com/VpcFlowLogsConfig`.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Optional. Configures whether all, none or a subset of metadata fields
     * should be added to the reported VPC flow logs. Default value is INCLUDE_ALL_METADATA.
     * Possible values:  METADATA_UNSPECIFIED INCLUDE_ALL_METADATA EXCLUDE_ALL_METADATA CUSTOM_METADATA
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<String> metadata;

    /**
     * @return Optional. Configures whether all, none or a subset of metadata fields
     * should be added to the reported VPC flow logs. Default value is INCLUDE_ALL_METADATA.
     * Possible values:  METADATA_UNSPECIFIED INCLUDE_ALL_METADATA EXCLUDE_ALL_METADATA CUSTOM_METADATA
     * 
     */
    public Optional<Output<String>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Optional. Custom metadata fields to include in the reported VPC flow
     * logs. Can only be specified if \&#34;metadata\&#34; was set to CUSTOM_METADATA.
     * 
     */
    @Import(name="metadataFields")
    private @Nullable Output<List<String>> metadataFields;

    /**
     * @return Optional. Custom metadata fields to include in the reported VPC flow
     * logs. Can only be specified if \&#34;metadata\&#34; was set to CUSTOM_METADATA.
     * 
     */
    public Optional<Output<List<String>>> metadataFields() {
        return Optional.ofNullable(this.metadataFields);
    }

    /**
     * Identifier. Unique name of the configuration using the form:     `projects/{project_id}/locations/global/vpcFlowLogsConfigs/{vpc_flow_logs_config_id}`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Identifier. Unique name of the configuration using the form:     `projects/{project_id}/locations/global/vpcFlowLogsConfigs/{vpc_flow_logs_config_id}`
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
     * Optional. The state of the VPC Flow Log configuration. Default value
     * is ENABLED. When creating a new configuration, it must be enabled.   Possible
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Optional. The state of the VPC Flow Log configuration. Default value
     * is ENABLED. When creating a new configuration, it must be enabled.   Possible
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Output only. The time the config was updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Output only. The time the config was updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    /**
     * Required. ID of the `VpcFlowLogsConfig`.
     * 
     */
    @Import(name="vpcFlowLogsConfigId")
    private @Nullable Output<String> vpcFlowLogsConfigId;

    /**
     * @return Required. ID of the `VpcFlowLogsConfig`.
     * 
     */
    public Optional<Output<String>> vpcFlowLogsConfigId() {
        return Optional.ofNullable(this.vpcFlowLogsConfigId);
    }

    /**
     * Traffic will be logged from the VPN Tunnel. Format: projects/{project_id}/regions/{region}/vpnTunnels/{name}
     * 
     */
    @Import(name="vpnTunnel")
    private @Nullable Output<String> vpnTunnel;

    /**
     * @return Traffic will be logged from the VPN Tunnel. Format: projects/{project_id}/regions/{region}/vpnTunnels/{name}
     * 
     */
    public Optional<Output<String>> vpnTunnel() {
        return Optional.ofNullable(this.vpnTunnel);
    }

    private VpcFlowLogsConfigState() {}

    private VpcFlowLogsConfigState(VpcFlowLogsConfigState $) {
        this.aggregationInterval = $.aggregationInterval;
        this.createTime = $.createTime;
        this.description = $.description;
        this.effectiveLabels = $.effectiveLabels;
        this.filterExpr = $.filterExpr;
        this.flowSampling = $.flowSampling;
        this.interconnectAttachment = $.interconnectAttachment;
        this.labels = $.labels;
        this.location = $.location;
        this.metadata = $.metadata;
        this.metadataFields = $.metadataFields;
        this.name = $.name;
        this.project = $.project;
        this.pulumiLabels = $.pulumiLabels;
        this.state = $.state;
        this.updateTime = $.updateTime;
        this.vpcFlowLogsConfigId = $.vpcFlowLogsConfigId;
        this.vpnTunnel = $.vpnTunnel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcFlowLogsConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcFlowLogsConfigState $;

        public Builder() {
            $ = new VpcFlowLogsConfigState();
        }

        public Builder(VpcFlowLogsConfigState defaults) {
            $ = new VpcFlowLogsConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregationInterval Optional. The aggregation interval for the logs. Default value is
         * INTERVAL_5_SEC.   Possible values:  AGGREGATION_INTERVAL_UNSPECIFIED INTERVAL_5_SEC INTERVAL_30_SEC INTERVAL_1_MIN INTERVAL_5_MIN INTERVAL_10_MIN INTERVAL_15_MIN&#34;
         * 
         * @return builder
         * 
         */
        public Builder aggregationInterval(@Nullable Output<String> aggregationInterval) {
            $.aggregationInterval = aggregationInterval;
            return this;
        }

        /**
         * @param aggregationInterval Optional. The aggregation interval for the logs. Default value is
         * INTERVAL_5_SEC.   Possible values:  AGGREGATION_INTERVAL_UNSPECIFIED INTERVAL_5_SEC INTERVAL_30_SEC INTERVAL_1_MIN INTERVAL_5_MIN INTERVAL_10_MIN INTERVAL_15_MIN&#34;
         * 
         * @return builder
         * 
         */
        public Builder aggregationInterval(String aggregationInterval) {
            return aggregationInterval(Output.of(aggregationInterval));
        }

        /**
         * @param createTime Output only. The time the config was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Output only. The time the config was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description Optional. The user-supplied description of the VPC Flow Logs configuration. Maximum
         * of 512 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. The user-supplied description of the VPC Flow Logs configuration. Maximum
         * of 512 characters.
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
         * @param filterExpr Optional. Export filter used to define which VPC Flow Logs should be logged.
         * 
         * @return builder
         * 
         */
        public Builder filterExpr(@Nullable Output<String> filterExpr) {
            $.filterExpr = filterExpr;
            return this;
        }

        /**
         * @param filterExpr Optional. Export filter used to define which VPC Flow Logs should be logged.
         * 
         * @return builder
         * 
         */
        public Builder filterExpr(String filterExpr) {
            return filterExpr(Output.of(filterExpr));
        }

        /**
         * @param flowSampling Optional. The value of the field must be in (0, 1]. The sampling rate
         * of VPC Flow Logs where 1.0 means all collected logs are reported. Setting the
         * sampling rate to 0.0 is not allowed. If you want to disable VPC Flow Logs, use
         * the state field instead. Default value is 1.0.
         * 
         * @return builder
         * 
         */
        public Builder flowSampling(@Nullable Output<Double> flowSampling) {
            $.flowSampling = flowSampling;
            return this;
        }

        /**
         * @param flowSampling Optional. The value of the field must be in (0, 1]. The sampling rate
         * of VPC Flow Logs where 1.0 means all collected logs are reported. Setting the
         * sampling rate to 0.0 is not allowed. If you want to disable VPC Flow Logs, use
         * the state field instead. Default value is 1.0.
         * 
         * @return builder
         * 
         */
        public Builder flowSampling(Double flowSampling) {
            return flowSampling(Output.of(flowSampling));
        }

        /**
         * @param interconnectAttachment Traffic will be logged from the Interconnect Attachment. Format: projects/{project_id}/regions/{region}/interconnectAttachments/{name}
         * 
         * @return builder
         * 
         */
        public Builder interconnectAttachment(@Nullable Output<String> interconnectAttachment) {
            $.interconnectAttachment = interconnectAttachment;
            return this;
        }

        /**
         * @param interconnectAttachment Traffic will be logged from the Interconnect Attachment. Format: projects/{project_id}/regions/{region}/interconnectAttachments/{name}
         * 
         * @return builder
         * 
         */
        public Builder interconnectAttachment(String interconnectAttachment) {
            return interconnectAttachment(Output.of(interconnectAttachment));
        }

        /**
         * @param labels Optional. Resource labels to represent user-provided metadata.
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
         * @param labels Optional. Resource labels to represent user-provided metadata.
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
         * @param location Resource ID segment making up resource `name`. It identifies the resource
         * within its parent collection as described in https://google.aip.dev/122. See documentation
         * for resource type `networkmanagement.googleapis.com/VpcFlowLogsConfig`.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource ID segment making up resource `name`. It identifies the resource
         * within its parent collection as described in https://google.aip.dev/122. See documentation
         * for resource type `networkmanagement.googleapis.com/VpcFlowLogsConfig`.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param metadata Optional. Configures whether all, none or a subset of metadata fields
         * should be added to the reported VPC flow logs. Default value is INCLUDE_ALL_METADATA.
         * Possible values:  METADATA_UNSPECIFIED INCLUDE_ALL_METADATA EXCLUDE_ALL_METADATA CUSTOM_METADATA
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<String> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Optional. Configures whether all, none or a subset of metadata fields
         * should be added to the reported VPC flow logs. Default value is INCLUDE_ALL_METADATA.
         * Possible values:  METADATA_UNSPECIFIED INCLUDE_ALL_METADATA EXCLUDE_ALL_METADATA CUSTOM_METADATA
         * 
         * @return builder
         * 
         */
        public Builder metadata(String metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param metadataFields Optional. Custom metadata fields to include in the reported VPC flow
         * logs. Can only be specified if \&#34;metadata\&#34; was set to CUSTOM_METADATA.
         * 
         * @return builder
         * 
         */
        public Builder metadataFields(@Nullable Output<List<String>> metadataFields) {
            $.metadataFields = metadataFields;
            return this;
        }

        /**
         * @param metadataFields Optional. Custom metadata fields to include in the reported VPC flow
         * logs. Can only be specified if \&#34;metadata\&#34; was set to CUSTOM_METADATA.
         * 
         * @return builder
         * 
         */
        public Builder metadataFields(List<String> metadataFields) {
            return metadataFields(Output.of(metadataFields));
        }

        /**
         * @param metadataFields Optional. Custom metadata fields to include in the reported VPC flow
         * logs. Can only be specified if \&#34;metadata\&#34; was set to CUSTOM_METADATA.
         * 
         * @return builder
         * 
         */
        public Builder metadataFields(String... metadataFields) {
            return metadataFields(List.of(metadataFields));
        }

        /**
         * @param name Identifier. Unique name of the configuration using the form:     `projects/{project_id}/locations/global/vpcFlowLogsConfigs/{vpc_flow_logs_config_id}`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Identifier. Unique name of the configuration using the form:     `projects/{project_id}/locations/global/vpcFlowLogsConfigs/{vpc_flow_logs_config_id}`
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
         * @param state Optional. The state of the VPC Flow Log configuration. Default value
         * is ENABLED. When creating a new configuration, it must be enabled.   Possible
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Optional. The state of the VPC Flow Log configuration. Default value
         * is ENABLED. When creating a new configuration, it must be enabled.   Possible
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param updateTime Output only. The time the config was updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Output only. The time the config was updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        /**
         * @param vpcFlowLogsConfigId Required. ID of the `VpcFlowLogsConfig`.
         * 
         * @return builder
         * 
         */
        public Builder vpcFlowLogsConfigId(@Nullable Output<String> vpcFlowLogsConfigId) {
            $.vpcFlowLogsConfigId = vpcFlowLogsConfigId;
            return this;
        }

        /**
         * @param vpcFlowLogsConfigId Required. ID of the `VpcFlowLogsConfig`.
         * 
         * @return builder
         * 
         */
        public Builder vpcFlowLogsConfigId(String vpcFlowLogsConfigId) {
            return vpcFlowLogsConfigId(Output.of(vpcFlowLogsConfigId));
        }

        /**
         * @param vpnTunnel Traffic will be logged from the VPN Tunnel. Format: projects/{project_id}/regions/{region}/vpnTunnels/{name}
         * 
         * @return builder
         * 
         */
        public Builder vpnTunnel(@Nullable Output<String> vpnTunnel) {
            $.vpnTunnel = vpnTunnel;
            return this;
        }

        /**
         * @param vpnTunnel Traffic will be logged from the VPN Tunnel. Format: projects/{project_id}/regions/{region}/vpnTunnels/{name}
         * 
         * @return builder
         * 
         */
        public Builder vpnTunnel(String vpnTunnel) {
            return vpnTunnel(Output.of(vpnTunnel));
        }

        public VpcFlowLogsConfigState build() {
            return $;
        }
    }

}
