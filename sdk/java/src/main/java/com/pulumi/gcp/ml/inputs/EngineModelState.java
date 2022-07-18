// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.ml.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.ml.inputs.EngineModelDefaultVersionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EngineModelState extends com.pulumi.resources.ResourceArgs {

    public static final EngineModelState Empty = new EngineModelState();

    /**
     * The default version of the model. This version will be used to handle
     * prediction requests that do not specify a version.
     * Structure is documented below.
     * 
     */
    @Import(name="defaultVersion")
    private @Nullable Output<EngineModelDefaultVersionArgs> defaultVersion;

    /**
     * @return The default version of the model. This version will be used to handle
     * prediction requests that do not specify a version.
     * Structure is documented below.
     * 
     */
    public Optional<Output<EngineModelDefaultVersionArgs>> defaultVersion() {
        return Optional.ofNullable(this.defaultVersion);
    }

    /**
     * The description specified for the model when it was created.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description specified for the model when it was created.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * One or more labels that you can add, to organize your models.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return One or more labels that you can add, to organize your models.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name specified for the version when it was created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name specified for the version when it was created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * If true, online prediction nodes send stderr and stdout streams to Stackdriver Logging
     * 
     */
    @Import(name="onlinePredictionConsoleLogging")
    private @Nullable Output<Boolean> onlinePredictionConsoleLogging;

    /**
     * @return If true, online prediction nodes send stderr and stdout streams to Stackdriver Logging
     * 
     */
    public Optional<Output<Boolean>> onlinePredictionConsoleLogging() {
        return Optional.ofNullable(this.onlinePredictionConsoleLogging);
    }

    /**
     * If true, online prediction access logs are sent to StackDriver Logging.
     * 
     */
    @Import(name="onlinePredictionLogging")
    private @Nullable Output<Boolean> onlinePredictionLogging;

    /**
     * @return If true, online prediction access logs are sent to StackDriver Logging.
     * 
     */
    public Optional<Output<Boolean>> onlinePredictionLogging() {
        return Optional.ofNullable(this.onlinePredictionLogging);
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
     * The list of regions where the model is going to be deployed.
     * Currently only one region per model is supported
     * 
     */
    @Import(name="regions")
    private @Nullable Output<String> regions;

    /**
     * @return The list of regions where the model is going to be deployed.
     * Currently only one region per model is supported
     * 
     */
    public Optional<Output<String>> regions() {
        return Optional.ofNullable(this.regions);
    }

    private EngineModelState() {}

    private EngineModelState(EngineModelState $) {
        this.defaultVersion = $.defaultVersion;
        this.description = $.description;
        this.labels = $.labels;
        this.name = $.name;
        this.onlinePredictionConsoleLogging = $.onlinePredictionConsoleLogging;
        this.onlinePredictionLogging = $.onlinePredictionLogging;
        this.project = $.project;
        this.regions = $.regions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EngineModelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EngineModelState $;

        public Builder() {
            $ = new EngineModelState();
        }

        public Builder(EngineModelState defaults) {
            $ = new EngineModelState(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultVersion The default version of the model. This version will be used to handle
         * prediction requests that do not specify a version.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder defaultVersion(@Nullable Output<EngineModelDefaultVersionArgs> defaultVersion) {
            $.defaultVersion = defaultVersion;
            return this;
        }

        /**
         * @param defaultVersion The default version of the model. This version will be used to handle
         * prediction requests that do not specify a version.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder defaultVersion(EngineModelDefaultVersionArgs defaultVersion) {
            return defaultVersion(Output.of(defaultVersion));
        }

        /**
         * @param description The description specified for the model when it was created.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description specified for the model when it was created.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels One or more labels that you can add, to organize your models.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels One or more labels that you can add, to organize your models.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name specified for the version when it was created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name specified for the version when it was created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param onlinePredictionConsoleLogging If true, online prediction nodes send stderr and stdout streams to Stackdriver Logging
         * 
         * @return builder
         * 
         */
        public Builder onlinePredictionConsoleLogging(@Nullable Output<Boolean> onlinePredictionConsoleLogging) {
            $.onlinePredictionConsoleLogging = onlinePredictionConsoleLogging;
            return this;
        }

        /**
         * @param onlinePredictionConsoleLogging If true, online prediction nodes send stderr and stdout streams to Stackdriver Logging
         * 
         * @return builder
         * 
         */
        public Builder onlinePredictionConsoleLogging(Boolean onlinePredictionConsoleLogging) {
            return onlinePredictionConsoleLogging(Output.of(onlinePredictionConsoleLogging));
        }

        /**
         * @param onlinePredictionLogging If true, online prediction access logs are sent to StackDriver Logging.
         * 
         * @return builder
         * 
         */
        public Builder onlinePredictionLogging(@Nullable Output<Boolean> onlinePredictionLogging) {
            $.onlinePredictionLogging = onlinePredictionLogging;
            return this;
        }

        /**
         * @param onlinePredictionLogging If true, online prediction access logs are sent to StackDriver Logging.
         * 
         * @return builder
         * 
         */
        public Builder onlinePredictionLogging(Boolean onlinePredictionLogging) {
            return onlinePredictionLogging(Output.of(onlinePredictionLogging));
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
         * @param regions The list of regions where the model is going to be deployed.
         * Currently only one region per model is supported
         * 
         * @return builder
         * 
         */
        public Builder regions(@Nullable Output<String> regions) {
            $.regions = regions;
            return this;
        }

        /**
         * @param regions The list of regions where the model is going to be deployed.
         * Currently only one region per model is supported
         * 
         * @return builder
         * 
         */
        public Builder regions(String regions) {
            return regions(Output.of(regions));
        }

        public EngineModelState build() {
            return $;
        }
    }

}