// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.spanner.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * The name of the instance&#39;s configuration (similar but not
     * quite the same as a region) which defines the geographic placement and
     * replication of your databases in this instance. It determines where your data
     * is stored. Values are typically of the form `regional-europe-west1` , `us-central` etc.
     * In order to obtain a valid list please consult the
     * [Configuration section of the docs](https://cloud.google.com/spanner/docs/instances).
     * 
     */
    @Import(name="config")
    private @Nullable Output<String> config;

    /**
     * @return The name of the instance&#39;s configuration (similar but not
     * quite the same as a region) which defines the geographic placement and
     * replication of your databases in this instance. It determines where your data
     * is stored. Values are typically of the form `regional-europe-west1` , `us-central` etc.
     * In order to obtain a valid list please consult the
     * [Configuration section of the docs](https://cloud.google.com/spanner/docs/instances).
     * 
     */
    public Optional<Output<String>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * The descriptive name for this instance as it appears in UIs. Must be
     * unique per project and between 4 and 30 characters in length.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The descriptive name for this instance as it appears in UIs. Must be
     * unique per project and between 4 and 30 characters in length.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * When deleting a spanner instance, this boolean option will delete all backups of this instance.
     * This must be set to true if you created a backup manually in the console.
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    /**
     * @return When deleting a spanner instance, this boolean option will delete all backups of this instance.
     * This must be set to true if you created a backup manually in the console.
     * 
     */
    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    /**
     * An object containing a list of &#34;key&#34;: value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return An object containing a list of &#34;key&#34;: value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * A unique identifier for the instance, which cannot be changed after
     * the instance is created. The name must be between 6 and 30 characters
     * in length.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique identifier for the instance, which cannot be changed after
     * the instance is created. The name must be between 6 and 30 characters
     * in length.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The number of nodes allocated to this instance. Exactly one of either node_count or processing_units must be present in
     * terraform.
     * 
     */
    @Import(name="numNodes")
    private @Nullable Output<Integer> numNodes;

    /**
     * @return The number of nodes allocated to this instance. Exactly one of either node_count or processing_units must be present in
     * terraform.
     * 
     */
    public Optional<Output<Integer>> numNodes() {
        return Optional.ofNullable(this.numNodes);
    }

    /**
     * The number of processing units allocated to this instance. Exactly one of processing_units or node_count must be present
     * in terraform.
     * 
     */
    @Import(name="processingUnits")
    private @Nullable Output<Integer> processingUnits;

    /**
     * @return The number of processing units allocated to this instance. Exactly one of processing_units or node_count must be present
     * in terraform.
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
     * Instance status: &#39;CREATING&#39; or &#39;READY&#39;.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Instance status: &#39;CREATING&#39; or &#39;READY&#39;.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private InstanceState() {}

    private InstanceState(InstanceState $) {
        this.config = $.config;
        this.displayName = $.displayName;
        this.forceDestroy = $.forceDestroy;
        this.labels = $.labels;
        this.name = $.name;
        this.numNodes = $.numNodes;
        this.processingUnits = $.processingUnits;
        this.project = $.project;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceState $;

        public Builder() {
            $ = new InstanceState();
        }

        public Builder(InstanceState defaults) {
            $ = new InstanceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param config The name of the instance&#39;s configuration (similar but not
         * quite the same as a region) which defines the geographic placement and
         * replication of your databases in this instance. It determines where your data
         * is stored. Values are typically of the form `regional-europe-west1` , `us-central` etc.
         * In order to obtain a valid list please consult the
         * [Configuration section of the docs](https://cloud.google.com/spanner/docs/instances).
         * 
         * @return builder
         * 
         */
        public Builder config(@Nullable Output<String> config) {
            $.config = config;
            return this;
        }

        /**
         * @param config The name of the instance&#39;s configuration (similar but not
         * quite the same as a region) which defines the geographic placement and
         * replication of your databases in this instance. It determines where your data
         * is stored. Values are typically of the form `regional-europe-west1` , `us-central` etc.
         * In order to obtain a valid list please consult the
         * [Configuration section of the docs](https://cloud.google.com/spanner/docs/instances).
         * 
         * @return builder
         * 
         */
        public Builder config(String config) {
            return config(Output.of(config));
        }

        /**
         * @param displayName The descriptive name for this instance as it appears in UIs. Must be
         * unique per project and between 4 and 30 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The descriptive name for this instance as it appears in UIs. Must be
         * unique per project and between 4 and 30 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param forceDestroy When deleting a spanner instance, this boolean option will delete all backups of this instance.
         * This must be set to true if you created a backup manually in the console.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * @param forceDestroy When deleting a spanner instance, this boolean option will delete all backups of this instance.
         * This must be set to true if you created a backup manually in the console.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        /**
         * @param labels An object containing a list of &#34;key&#34;: value pairs.
         * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels An object containing a list of &#34;key&#34;: value pairs.
         * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name A unique identifier for the instance, which cannot be changed after
         * the instance is created. The name must be between 6 and 30 characters
         * in length.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique identifier for the instance, which cannot be changed after
         * the instance is created. The name must be between 6 and 30 characters
         * in length.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param numNodes The number of nodes allocated to this instance. Exactly one of either node_count or processing_units must be present in
         * terraform.
         * 
         * @return builder
         * 
         */
        public Builder numNodes(@Nullable Output<Integer> numNodes) {
            $.numNodes = numNodes;
            return this;
        }

        /**
         * @param numNodes The number of nodes allocated to this instance. Exactly one of either node_count or processing_units must be present in
         * terraform.
         * 
         * @return builder
         * 
         */
        public Builder numNodes(Integer numNodes) {
            return numNodes(Output.of(numNodes));
        }

        /**
         * @param processingUnits The number of processing units allocated to this instance. Exactly one of processing_units or node_count must be present
         * in terraform.
         * 
         * @return builder
         * 
         */
        public Builder processingUnits(@Nullable Output<Integer> processingUnits) {
            $.processingUnits = processingUnits;
            return this;
        }

        /**
         * @param processingUnits The number of processing units allocated to this instance. Exactly one of processing_units or node_count must be present
         * in terraform.
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
         * @param state Instance status: &#39;CREATING&#39; or &#39;READY&#39;.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Instance status: &#39;CREATING&#39; or &#39;READY&#39;.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public InstanceState build() {
            return $;
        }
    }

}