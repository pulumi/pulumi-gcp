// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.spanner.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.spanner.inputs.InstanceConfigReplicaArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceConfigState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceConfigState Empty = new InstanceConfigState();

    /**
     * Base configuration name, e.g. nam3, based on which this configuration is created.
     * Only set for user managed configurations.
     * baseConfig must refer to a configuration of type GOOGLE_MANAGED in the same project as this configuration.
     * 
     */
    @Import(name="baseConfig")
    private @Nullable Output<String> baseConfig;

    /**
     * @return Base configuration name, e.g. nam3, based on which this configuration is created.
     * Only set for user managed configurations.
     * baseConfig must refer to a configuration of type GOOGLE_MANAGED in the same project as this configuration.
     * 
     */
    public Optional<Output<String>> baseConfig() {
        return Optional.ofNullable(this.baseConfig);
    }

    /**
     * Output only. Whether this instance config is a Google or User Managed Configuration.
     * 
     */
    @Import(name="configType")
    private @Nullable Output<String> configType;

    /**
     * @return Output only. Whether this instance config is a Google or User Managed Configuration.
     * 
     */
    public Optional<Output<String>> configType() {
        return Optional.ofNullable(this.configType);
    }

    /**
     * The name of this instance configuration as it appears in UIs.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The name of this instance configuration as it appears in UIs.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
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
     * An object containing a list of &#34;key&#34;: value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return An object containing a list of &#34;key&#34;: value pairs.
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
     * A unique identifier for the instance configuration. Values are of the
     * form projects/&lt;project&gt;/instanceConfigs/[a-z][-a-z0-9]*
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique identifier for the instance configuration. Values are of the
     * form projects/&lt;project&gt;/instanceConfigs/[a-z][-a-z0-9]*
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
     * The geographic placement of nodes in this instance configuration and their replication properties.
     * Structure is documented below.
     * 
     */
    @Import(name="replicas")
    private @Nullable Output<List<InstanceConfigReplicaArgs>> replicas;

    /**
     * @return The geographic placement of nodes in this instance configuration and their replication properties.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<InstanceConfigReplicaArgs>>> replicas() {
        return Optional.ofNullable(this.replicas);
    }

    private InstanceConfigState() {}

    private InstanceConfigState(InstanceConfigState $) {
        this.baseConfig = $.baseConfig;
        this.configType = $.configType;
        this.displayName = $.displayName;
        this.effectiveLabels = $.effectiveLabels;
        this.labels = $.labels;
        this.name = $.name;
        this.project = $.project;
        this.pulumiLabels = $.pulumiLabels;
        this.replicas = $.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceConfigState $;

        public Builder() {
            $ = new InstanceConfigState();
        }

        public Builder(InstanceConfigState defaults) {
            $ = new InstanceConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseConfig Base configuration name, e.g. nam3, based on which this configuration is created.
         * Only set for user managed configurations.
         * baseConfig must refer to a configuration of type GOOGLE_MANAGED in the same project as this configuration.
         * 
         * @return builder
         * 
         */
        public Builder baseConfig(@Nullable Output<String> baseConfig) {
            $.baseConfig = baseConfig;
            return this;
        }

        /**
         * @param baseConfig Base configuration name, e.g. nam3, based on which this configuration is created.
         * Only set for user managed configurations.
         * baseConfig must refer to a configuration of type GOOGLE_MANAGED in the same project as this configuration.
         * 
         * @return builder
         * 
         */
        public Builder baseConfig(String baseConfig) {
            return baseConfig(Output.of(baseConfig));
        }

        /**
         * @param configType Output only. Whether this instance config is a Google or User Managed Configuration.
         * 
         * @return builder
         * 
         */
        public Builder configType(@Nullable Output<String> configType) {
            $.configType = configType;
            return this;
        }

        /**
         * @param configType Output only. Whether this instance config is a Google or User Managed Configuration.
         * 
         * @return builder
         * 
         */
        public Builder configType(String configType) {
            return configType(Output.of(configType));
        }

        /**
         * @param displayName The name of this instance configuration as it appears in UIs.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of this instance configuration as it appears in UIs.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
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
         * @param labels An object containing a list of &#34;key&#34;: value pairs.
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
         * @param labels An object containing a list of &#34;key&#34;: value pairs.
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
         * @param name A unique identifier for the instance configuration. Values are of the
         * form projects/&lt;project&gt;/instanceConfigs/[a-z][-a-z0-9]*
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique identifier for the instance configuration. Values are of the
         * form projects/&lt;project&gt;/instanceConfigs/[a-z][-a-z0-9]*
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
         * @param replicas The geographic placement of nodes in this instance configuration and their replication properties.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder replicas(@Nullable Output<List<InstanceConfigReplicaArgs>> replicas) {
            $.replicas = replicas;
            return this;
        }

        /**
         * @param replicas The geographic placement of nodes in this instance configuration and their replication properties.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder replicas(List<InstanceConfigReplicaArgs> replicas) {
            return replicas(Output.of(replicas));
        }

        /**
         * @param replicas The geographic placement of nodes in this instance configuration and their replication properties.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder replicas(InstanceConfigReplicaArgs... replicas) {
            return replicas(List.of(replicas));
        }

        public InstanceConfigState build() {
            return $;
        }
    }

}
