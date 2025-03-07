// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AspectTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final AspectTypeArgs Empty = new AspectTypeArgs();

    /**
     * The aspect type id of the aspect type.
     * 
     */
    @Import(name="aspectTypeId")
    private @Nullable Output<String> aspectTypeId;

    /**
     * @return The aspect type id of the aspect type.
     * 
     */
    public Optional<Output<String>> aspectTypeId() {
        return Optional.ofNullable(this.aspectTypeId);
    }

    /**
     * Description of the AspectType.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the AspectType.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User friendly display name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return User friendly display name.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * User-defined labels for the AspectType.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-defined labels for the AspectType.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location where aspect type will be created in.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location where aspect type will be created in.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * MetadataTemplate of the Aspect.
     * 
     */
    @Import(name="metadataTemplate")
    private @Nullable Output<String> metadataTemplate;

    /**
     * @return MetadataTemplate of the Aspect.
     * 
     */
    public Optional<Output<String>> metadataTemplate() {
        return Optional.ofNullable(this.metadataTemplate);
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

    private AspectTypeArgs() {}

    private AspectTypeArgs(AspectTypeArgs $) {
        this.aspectTypeId = $.aspectTypeId;
        this.description = $.description;
        this.displayName = $.displayName;
        this.labels = $.labels;
        this.location = $.location;
        this.metadataTemplate = $.metadataTemplate;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AspectTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AspectTypeArgs $;

        public Builder() {
            $ = new AspectTypeArgs();
        }

        public Builder(AspectTypeArgs defaults) {
            $ = new AspectTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aspectTypeId The aspect type id of the aspect type.
         * 
         * @return builder
         * 
         */
        public Builder aspectTypeId(@Nullable Output<String> aspectTypeId) {
            $.aspectTypeId = aspectTypeId;
            return this;
        }

        /**
         * @param aspectTypeId The aspect type id of the aspect type.
         * 
         * @return builder
         * 
         */
        public Builder aspectTypeId(String aspectTypeId) {
            return aspectTypeId(Output.of(aspectTypeId));
        }

        /**
         * @param description Description of the AspectType.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the AspectType.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName User friendly display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName User friendly display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param labels User-defined labels for the AspectType.
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
         * @param labels User-defined labels for the AspectType.
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
         * @param location The location where aspect type will be created in.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location where aspect type will be created in.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param metadataTemplate MetadataTemplate of the Aspect.
         * 
         * @return builder
         * 
         */
        public Builder metadataTemplate(@Nullable Output<String> metadataTemplate) {
            $.metadataTemplate = metadataTemplate;
            return this;
        }

        /**
         * @param metadataTemplate MetadataTemplate of the Aspect.
         * 
         * @return builder
         * 
         */
        public Builder metadataTemplate(String metadataTemplate) {
            return metadataTemplate(Output.of(metadataTemplate));
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

        public AspectTypeArgs build() {
            return $;
        }
    }

}
