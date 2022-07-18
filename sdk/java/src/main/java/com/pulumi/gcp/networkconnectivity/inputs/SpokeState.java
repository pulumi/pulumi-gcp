// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkconnectivity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedInterconnectAttachmentsArgs;
import com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesArgs;
import com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpnTunnelsArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpokeState extends com.pulumi.resources.ResourceArgs {

    public static final SpokeState Empty = new SpokeState();

    /**
     * Output only. The time the spoke was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Output only. The time the spoke was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * An optional description of the spoke.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of the spoke.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Immutable. The URI of the hub that this spoke is attached to.
     * 
     */
    @Import(name="hub")
    private @Nullable Output<String> hub;

    /**
     * @return Immutable. The URI of the hub that this spoke is attached to.
     * 
     */
    public Optional<Output<String>> hub() {
        return Optional.ofNullable(this.hub);
    }

    /**
     * Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * A collection of VLAN attachment resources. These resources should be redundant attachments that all advertise the same prefixes to Google Cloud. Alternatively, in active/passive configurations, all attachments should be capable of advertising the same prefixes.
     * 
     */
    @Import(name="linkedInterconnectAttachments")
    private @Nullable Output<SpokeLinkedInterconnectAttachmentsArgs> linkedInterconnectAttachments;

    /**
     * @return A collection of VLAN attachment resources. These resources should be redundant attachments that all advertise the same prefixes to Google Cloud. Alternatively, in active/passive configurations, all attachments should be capable of advertising the same prefixes.
     * 
     */
    public Optional<Output<SpokeLinkedInterconnectAttachmentsArgs>> linkedInterconnectAttachments() {
        return Optional.ofNullable(this.linkedInterconnectAttachments);
    }

    /**
     * The URIs of linked Router appliance resources
     * 
     */
    @Import(name="linkedRouterApplianceInstances")
    private @Nullable Output<SpokeLinkedRouterApplianceInstancesArgs> linkedRouterApplianceInstances;

    /**
     * @return The URIs of linked Router appliance resources
     * 
     */
    public Optional<Output<SpokeLinkedRouterApplianceInstancesArgs>> linkedRouterApplianceInstances() {
        return Optional.ofNullable(this.linkedRouterApplianceInstances);
    }

    /**
     * The URIs of linked VPN tunnel resources
     * 
     */
    @Import(name="linkedVpnTunnels")
    private @Nullable Output<SpokeLinkedVpnTunnelsArgs> linkedVpnTunnels;

    /**
     * @return The URIs of linked VPN tunnel resources
     * 
     */
    public Optional<Output<SpokeLinkedVpnTunnelsArgs>> linkedVpnTunnels() {
        return Optional.ofNullable(this.linkedVpnTunnels);
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Immutable. The name of the spoke. Spoke names must be unique.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Immutable. The name of the spoke. Spoke names must be unique.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Output only. The current lifecycle state of this spoke. Possible values: STATE_UNSPECIFIED, CREATING, ACTIVE, DELETING
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Output only. The current lifecycle state of this spoke. Possible values: STATE_UNSPECIFIED, CREATING, ACTIVE, DELETING
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Output only. The Google-generated UUID for the spoke. This value is unique across all spoke resources. If a spoke is
     * deleted and another with the same name is created, the new spoke is assigned a different unique_id.
     * 
     */
    @Import(name="uniqueId")
    private @Nullable Output<String> uniqueId;

    /**
     * @return Output only. The Google-generated UUID for the spoke. This value is unique across all spoke resources. If a spoke is
     * deleted and another with the same name is created, the new spoke is assigned a different unique_id.
     * 
     */
    public Optional<Output<String>> uniqueId() {
        return Optional.ofNullable(this.uniqueId);
    }

    /**
     * Output only. The time the spoke was last updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Output only. The time the spoke was last updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private SpokeState() {}

    private SpokeState(SpokeState $) {
        this.createTime = $.createTime;
        this.description = $.description;
        this.hub = $.hub;
        this.labels = $.labels;
        this.linkedInterconnectAttachments = $.linkedInterconnectAttachments;
        this.linkedRouterApplianceInstances = $.linkedRouterApplianceInstances;
        this.linkedVpnTunnels = $.linkedVpnTunnels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.state = $.state;
        this.uniqueId = $.uniqueId;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpokeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpokeState $;

        public Builder() {
            $ = new SpokeState();
        }

        public Builder(SpokeState defaults) {
            $ = new SpokeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Output only. The time the spoke was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Output only. The time the spoke was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description An optional description of the spoke.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of the spoke.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param hub Immutable. The URI of the hub that this spoke is attached to.
         * 
         * @return builder
         * 
         */
        public Builder hub(@Nullable Output<String> hub) {
            $.hub = hub;
            return this;
        }

        /**
         * @param hub Immutable. The URI of the hub that this spoke is attached to.
         * 
         * @return builder
         * 
         */
        public Builder hub(String hub) {
            return hub(Output.of(hub));
        }

        /**
         * @param labels Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param linkedInterconnectAttachments A collection of VLAN attachment resources. These resources should be redundant attachments that all advertise the same prefixes to Google Cloud. Alternatively, in active/passive configurations, all attachments should be capable of advertising the same prefixes.
         * 
         * @return builder
         * 
         */
        public Builder linkedInterconnectAttachments(@Nullable Output<SpokeLinkedInterconnectAttachmentsArgs> linkedInterconnectAttachments) {
            $.linkedInterconnectAttachments = linkedInterconnectAttachments;
            return this;
        }

        /**
         * @param linkedInterconnectAttachments A collection of VLAN attachment resources. These resources should be redundant attachments that all advertise the same prefixes to Google Cloud. Alternatively, in active/passive configurations, all attachments should be capable of advertising the same prefixes.
         * 
         * @return builder
         * 
         */
        public Builder linkedInterconnectAttachments(SpokeLinkedInterconnectAttachmentsArgs linkedInterconnectAttachments) {
            return linkedInterconnectAttachments(Output.of(linkedInterconnectAttachments));
        }

        /**
         * @param linkedRouterApplianceInstances The URIs of linked Router appliance resources
         * 
         * @return builder
         * 
         */
        public Builder linkedRouterApplianceInstances(@Nullable Output<SpokeLinkedRouterApplianceInstancesArgs> linkedRouterApplianceInstances) {
            $.linkedRouterApplianceInstances = linkedRouterApplianceInstances;
            return this;
        }

        /**
         * @param linkedRouterApplianceInstances The URIs of linked Router appliance resources
         * 
         * @return builder
         * 
         */
        public Builder linkedRouterApplianceInstances(SpokeLinkedRouterApplianceInstancesArgs linkedRouterApplianceInstances) {
            return linkedRouterApplianceInstances(Output.of(linkedRouterApplianceInstances));
        }

        /**
         * @param linkedVpnTunnels The URIs of linked VPN tunnel resources
         * 
         * @return builder
         * 
         */
        public Builder linkedVpnTunnels(@Nullable Output<SpokeLinkedVpnTunnelsArgs> linkedVpnTunnels) {
            $.linkedVpnTunnels = linkedVpnTunnels;
            return this;
        }

        /**
         * @param linkedVpnTunnels The URIs of linked VPN tunnel resources
         * 
         * @return builder
         * 
         */
        public Builder linkedVpnTunnels(SpokeLinkedVpnTunnelsArgs linkedVpnTunnels) {
            return linkedVpnTunnels(Output.of(linkedVpnTunnels));
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Immutable. The name of the spoke. Spoke names must be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Immutable. The name of the spoke. Spoke names must be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The project for the resource
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project for the resource
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param state Output only. The current lifecycle state of this spoke. Possible values: STATE_UNSPECIFIED, CREATING, ACTIVE, DELETING
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Output only. The current lifecycle state of this spoke. Possible values: STATE_UNSPECIFIED, CREATING, ACTIVE, DELETING
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param uniqueId Output only. The Google-generated UUID for the spoke. This value is unique across all spoke resources. If a spoke is
         * deleted and another with the same name is created, the new spoke is assigned a different unique_id.
         * 
         * @return builder
         * 
         */
        public Builder uniqueId(@Nullable Output<String> uniqueId) {
            $.uniqueId = uniqueId;
            return this;
        }

        /**
         * @param uniqueId Output only. The Google-generated UUID for the spoke. This value is unique across all spoke resources. If a spoke is
         * deleted and another with the same name is created, the new spoke is assigned a different unique_id.
         * 
         * @return builder
         * 
         */
        public Builder uniqueId(String uniqueId) {
            return uniqueId(Output.of(uniqueId));
        }

        /**
         * @param updateTime Output only. The time the spoke was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Output only. The time the spoke was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public SpokeState build() {
            return $;
        }
    }

}