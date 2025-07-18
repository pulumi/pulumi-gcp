// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.spanner.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstancePartitionState extends com.pulumi.resources.ResourceArgs {

    public static final InstancePartitionState Empty = new InstancePartitionState();

    /**
     * The name of the instance partition&#39;s configuration (similar to a region) which
     * defines the geographic placement and replication of data in this instance partition.
     * 
     */
    @Import(name="config")
    private @Nullable Output<String> config;

    /**
     * @return The name of the instance partition&#39;s configuration (similar to a region) which
     * defines the geographic placement and replication of data in this instance partition.
     * 
     */
    public Optional<Output<String>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * The descriptive name for this instance partition as it appears in UIs.
     * Must be unique per project and between 4 and 30 characters in length.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The descriptive name for this instance partition as it appears in UIs.
     * Must be unique per project and between 4 and 30 characters in length.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The instance to create the instance partition in.
     * 
     */
    @Import(name="instance")
    private @Nullable Output<String> instance;

    /**
     * @return The instance to create the instance partition in.
     * 
     */
    public Optional<Output<String>> instance() {
        return Optional.ofNullable(this.instance);
    }

    /**
     * A unique identifier for the instance partition, which cannot be changed after
     * the instance partition is created. The name must be between 2 and 64 characters
     * and match the regular expression [a-z][a-z0-9\\-]{0,61}[a-z0-9].
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique identifier for the instance partition, which cannot be changed after
     * the instance partition is created. The name must be between 2 and 64 characters
     * and match the regular expression [a-z][a-z0-9\\-]{0,61}[a-z0-9].
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The number of nodes allocated to this instance partition. One node equals
     * 1000 processing units. Exactly one of either node_count or processing_units
     * must be present.
     * 
     */
    @Import(name="nodeCount")
    private @Nullable Output<Integer> nodeCount;

    /**
     * @return The number of nodes allocated to this instance partition. One node equals
     * 1000 processing units. Exactly one of either node_count or processing_units
     * must be present.
     * 
     */
    public Optional<Output<Integer>> nodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }

    /**
     * The number of processing units allocated to this instance partition.
     * Exactly one of either node_count or processing_units must be present.
     * 
     */
    @Import(name="processingUnits")
    private @Nullable Output<Integer> processingUnits;

    /**
     * @return The number of processing units allocated to this instance partition.
     * Exactly one of either node_count or processing_units must be present.
     * 
     */
    public Optional<Output<Integer>> processingUnits() {
        return Optional.ofNullable(this.processingUnits);
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
     * The current instance partition state. Possible values are:
     * CREATING: The instance partition is being created. Resources are being
     * allocated for the instance partition.
     * READY: The instance partition has been allocated resources and is ready for use.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current instance partition state. Possible values are:
     * CREATING: The instance partition is being created. Resources are being
     * allocated for the instance partition.
     * READY: The instance partition has been allocated resources and is ready for use.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private InstancePartitionState() {}

    private InstancePartitionState(InstancePartitionState $) {
        this.config = $.config;
        this.displayName = $.displayName;
        this.instance = $.instance;
        this.name = $.name;
        this.nodeCount = $.nodeCount;
        this.processingUnits = $.processingUnits;
        this.project = $.project;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstancePartitionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePartitionState $;

        public Builder() {
            $ = new InstancePartitionState();
        }

        public Builder(InstancePartitionState defaults) {
            $ = new InstancePartitionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param config The name of the instance partition&#39;s configuration (similar to a region) which
         * defines the geographic placement and replication of data in this instance partition.
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<String> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The name of the instance partition&#39;s configuration (similar to a region) which
         * defines the geographic placement and replication of data in this instance partition.
         * 
         * @return builder
         * 
         */
        public Builder config(String config) {
            return config(Output.of(config));
        }

        /**
         * @param displayName The descriptive name for this instance partition as it appears in UIs.
         * Must be unique per project and between 4 and 30 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The descriptive name for this instance partition as it appears in UIs.
         * Must be unique per project and between 4 and 30 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param instance The instance to create the instance partition in.
         * 
         * @return builder
         * 
         */
        public Builder instance(@Nullable Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance The instance to create the instance partition in.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        /**
         * @param name A unique identifier for the instance partition, which cannot be changed after
         * the instance partition is created. The name must be between 2 and 64 characters
         * and match the regular expression [a-z][a-z0-9\\-]{0,61}[a-z0-9].
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique identifier for the instance partition, which cannot be changed after
         * the instance partition is created. The name must be between 2 and 64 characters
         * and match the regular expression [a-z][a-z0-9\\-]{0,61}[a-z0-9].
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeCount The number of nodes allocated to this instance partition. One node equals
         * 1000 processing units. Exactly one of either node_count or processing_units
         * must be present.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(@Nullable Output<Integer> nodeCount) {
            $.nodeCount = nodeCount;
            return this;
        }

        /**
         * @param nodeCount The number of nodes allocated to this instance partition. One node equals
         * 1000 processing units. Exactly one of either node_count or processing_units
         * must be present.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(Integer nodeCount) {
            return nodeCount(Output.of(nodeCount));
        }

        /**
         * @param processingUnits The number of processing units allocated to this instance partition.
         * Exactly one of either node_count or processing_units must be present.
         * 
         * @return builder
         * 
         */
        public Builder processingUnits(@Nullable Output<Integer> processingUnits) {
            $.processingUnits = processingUnits;
            return this;
        }

        /**
         * @param processingUnits The number of processing units allocated to this instance partition.
         * Exactly one of either node_count or processing_units must be present.
         * 
         * @return builder
         * 
         */
        public Builder processingUnits(Integer processingUnits) {
            return processingUnits(Output.of(processingUnits));
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
         * @param state The current instance partition state. Possible values are:
         * CREATING: The instance partition is being created. Resources are being
         * allocated for the instance partition.
         * READY: The instance partition has been allocated resources and is ready for use.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current instance partition state. Possible values are:
         * CREATING: The instance partition is being created. Resources are being
         * allocated for the instance partition.
         * READY: The instance partition has been allocated resources and is ready for use.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public InstancePartitionState build() {
            return $;
        }
    }

}
