// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolConfigArgs;
import com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolNodePoolAutoscalingArgs;
import com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolStatusArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VMwareNodePoolState extends com.pulumi.resources.ResourceArgs {

    public static final VMwareNodePoolState Empty = new VMwareNodePoolState();

    /**
     * Annotations on the node Pool.
     * This field has the same restrictions as Kubernetes annotations.
     * The total size of all keys and values combined is limited to 256k.
     * Key can have 2 segments: prefix (optional) and name (required),
     * separated by a slash (/).
     * Prefix must be a DNS subdomain.
     * Name must be 63 characters or less, begin and end with alphanumerics,
     * with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Annotations on the node Pool.
     * This field has the same restrictions as Kubernetes annotations.
     * The total size of all keys and values combined is limited to 256k.
     * Key can have 2 segments: prefix (optional) and name (required),
     * separated by a slash (/).
     * Prefix must be a DNS subdomain.
     * Name must be 63 characters or less, begin and end with alphanumerics,
     * with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The node configuration of the node pool.
     * Structure is documented below.
     * 
     */
    @Import(name="config")
    private @Nullable Output<VMwareNodePoolConfigArgs> config;

    /**
     * @return The node configuration of the node pool.
     * Structure is documented below.
     * 
     */
    public Optional<Output<VMwareNodePoolConfigArgs>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * The time the cluster was created, in RFC3339 text format.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time the cluster was created, in RFC3339 text format.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The time the cluster was deleted, in RFC3339 text format.
     * 
     */
    @Import(name="deleteTime")
    private @Nullable Output<String> deleteTime;

    /**
     * @return The time the cluster was deleted, in RFC3339 text format.
     * 
     */
    public Optional<Output<String>> deleteTime() {
        return Optional.ofNullable(this.deleteTime);
    }

    /**
     * The display name for the node pool.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name for the node pool.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     * Allows clients to perform consistent read-modify-writes
     * through optimistic concurrency control.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     * Allows clients to perform consistent read-modify-writes
     * through optimistic concurrency control.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The vmware node pool name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The vmware node pool name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Node Pool autoscaling config for the node pool.
     * Structure is documented below.
     * 
     */
    @Import(name="nodePoolAutoscaling")
    private @Nullable Output<VMwareNodePoolNodePoolAutoscalingArgs> nodePoolAutoscaling;

    /**
     * @return Node Pool autoscaling config for the node pool.
     * Structure is documented below.
     * 
     */
    public Optional<Output<VMwareNodePoolNodePoolAutoscalingArgs>> nodePoolAutoscaling() {
        return Optional.ofNullable(this.nodePoolAutoscaling);
    }

    /**
     * Anthos version for the node pool. Defaults to the user cluster version.
     * 
     */
    @Import(name="onPremVersion")
    private @Nullable Output<String> onPremVersion;

    /**
     * @return Anthos version for the node pool. Defaults to the user cluster version.
     * 
     */
    public Optional<Output<String>> onPremVersion() {
        return Optional.ofNullable(this.onPremVersion);
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
     * If set, there are currently changes in flight to the node pool.
     * 
     */
    @Import(name="reconciling")
    private @Nullable Output<Boolean> reconciling;

    /**
     * @return If set, there are currently changes in flight to the node pool.
     * 
     */
    public Optional<Output<Boolean>> reconciling() {
        return Optional.ofNullable(this.reconciling);
    }

    /**
     * (Output)
     * The lifecycle state of the condition.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return (Output)
     * The lifecycle state of the condition.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * ResourceStatus representing detailed cluster state.
     * Structure is documented below.
     * 
     */
    @Import(name="statuses")
    private @Nullable Output<List<VMwareNodePoolStatusArgs>> statuses;

    /**
     * @return ResourceStatus representing detailed cluster state.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<VMwareNodePoolStatusArgs>>> statuses() {
        return Optional.ofNullable(this.statuses);
    }

    /**
     * The unique identifier of the node pool.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return The unique identifier of the node pool.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    /**
     * The time the cluster was last updated, in RFC3339 text format.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The time the cluster was last updated, in RFC3339 text format.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    /**
     * The cluster this node pool belongs to.
     * 
     */
    @Import(name="vmwareCluster")
    private @Nullable Output<String> vmwareCluster;

    /**
     * @return The cluster this node pool belongs to.
     * 
     */
    public Optional<Output<String>> vmwareCluster() {
        return Optional.ofNullable(this.vmwareCluster);
    }

    private VMwareNodePoolState() {}

    private VMwareNodePoolState(VMwareNodePoolState $) {
        this.annotations = $.annotations;
        this.config = $.config;
        this.createTime = $.createTime;
        this.deleteTime = $.deleteTime;
        this.displayName = $.displayName;
        this.etag = $.etag;
        this.location = $.location;
        this.name = $.name;
        this.nodePoolAutoscaling = $.nodePoolAutoscaling;
        this.onPremVersion = $.onPremVersion;
        this.project = $.project;
        this.reconciling = $.reconciling;
        this.state = $.state;
        this.statuses = $.statuses;
        this.uid = $.uid;
        this.updateTime = $.updateTime;
        this.vmwareCluster = $.vmwareCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VMwareNodePoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMwareNodePoolState $;

        public Builder() {
            $ = new VMwareNodePoolState();
        }

        public Builder(VMwareNodePoolState defaults) {
            $ = new VMwareNodePoolState(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations on the node Pool.
         * This field has the same restrictions as Kubernetes annotations.
         * The total size of all keys and values combined is limited to 256k.
         * Key can have 2 segments: prefix (optional) and name (required),
         * separated by a slash (/).
         * Prefix must be a DNS subdomain.
         * Name must be 63 characters or less, begin and end with alphanumerics,
         * with dashes (-), underscores (_), dots (.), and alphanumerics between.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations on the node Pool.
         * This field has the same restrictions as Kubernetes annotations.
         * The total size of all keys and values combined is limited to 256k.
         * Key can have 2 segments: prefix (optional) and name (required),
         * separated by a slash (/).
         * Prefix must be a DNS subdomain.
         * Name must be 63 characters or less, begin and end with alphanumerics,
         * with dashes (-), underscores (_), dots (.), and alphanumerics between.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param config The node configuration of the node pool.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<VMwareNodePoolConfigArgs> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The node configuration of the node pool.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder config(VMwareNodePoolConfigArgs config) {
            return config(Output.of(config));
        }

        /**
         * @param createTime The time the cluster was created, in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time the cluster was created, in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param deleteTime The time the cluster was deleted, in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder deleteTime(@Nullable Output<String> deleteTime) {
            $.deleteTime = deleteTime;
            return this;
        }

        /**
         * @param deleteTime The time the cluster was deleted, in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder deleteTime(String deleteTime) {
            return deleteTime(Output.of(deleteTime));
        }

        /**
         * @param displayName The display name for the node pool.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name for the node pool.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param etag This checksum is computed by the server based on the value of other
         * fields, and may be sent on update and delete requests to ensure the
         * client has an up-to-date value before proceeding.
         * Allows clients to perform consistent read-modify-writes
         * through optimistic concurrency control.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag This checksum is computed by the server based on the value of other
         * fields, and may be sent on update and delete requests to ensure the
         * client has an up-to-date value before proceeding.
         * Allows clients to perform consistent read-modify-writes
         * through optimistic concurrency control.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The vmware node pool name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The vmware node pool name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodePoolAutoscaling Node Pool autoscaling config for the node pool.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder nodePoolAutoscaling(@Nullable Output<VMwareNodePoolNodePoolAutoscalingArgs> nodePoolAutoscaling) {
            $.nodePoolAutoscaling = nodePoolAutoscaling;
            return this;
        }

        /**
         * @param nodePoolAutoscaling Node Pool autoscaling config for the node pool.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder nodePoolAutoscaling(VMwareNodePoolNodePoolAutoscalingArgs nodePoolAutoscaling) {
            return nodePoolAutoscaling(Output.of(nodePoolAutoscaling));
        }

        /**
         * @param onPremVersion Anthos version for the node pool. Defaults to the user cluster version.
         * 
         * @return builder
         * 
         */
        public Builder onPremVersion(@Nullable Output<String> onPremVersion) {
            $.onPremVersion = onPremVersion;
            return this;
        }

        /**
         * @param onPremVersion Anthos version for the node pool. Defaults to the user cluster version.
         * 
         * @return builder
         * 
         */
        public Builder onPremVersion(String onPremVersion) {
            return onPremVersion(Output.of(onPremVersion));
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
         * @param reconciling If set, there are currently changes in flight to the node pool.
         * 
         * @return builder
         * 
         */
        public Builder reconciling(@Nullable Output<Boolean> reconciling) {
            $.reconciling = reconciling;
            return this;
        }

        /**
         * @param reconciling If set, there are currently changes in flight to the node pool.
         * 
         * @return builder
         * 
         */
        public Builder reconciling(Boolean reconciling) {
            return reconciling(Output.of(reconciling));
        }

        /**
         * @param state (Output)
         * The lifecycle state of the condition.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state (Output)
         * The lifecycle state of the condition.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param statuses ResourceStatus representing detailed cluster state.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder statuses(@Nullable Output<List<VMwareNodePoolStatusArgs>> statuses) {
            $.statuses = statuses;
            return this;
        }

        /**
         * @param statuses ResourceStatus representing detailed cluster state.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder statuses(List<VMwareNodePoolStatusArgs> statuses) {
            return statuses(Output.of(statuses));
        }

        /**
         * @param statuses ResourceStatus representing detailed cluster state.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder statuses(VMwareNodePoolStatusArgs... statuses) {
            return statuses(List.of(statuses));
        }

        /**
         * @param uid The unique identifier of the node pool.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid The unique identifier of the node pool.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        /**
         * @param updateTime The time the cluster was last updated, in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The time the cluster was last updated, in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        /**
         * @param vmwareCluster The cluster this node pool belongs to.
         * 
         * @return builder
         * 
         */
        public Builder vmwareCluster(@Nullable Output<String> vmwareCluster) {
            $.vmwareCluster = vmwareCluster;
            return this;
        }

        /**
         * @param vmwareCluster The cluster this node pool belongs to.
         * 
         * @return builder
         * 
         */
        public Builder vmwareCluster(String vmwareCluster) {
            return vmwareCluster(Output.of(vmwareCluster));
        }

        public VMwareNodePoolState build() {
            return $;
        }
    }

}