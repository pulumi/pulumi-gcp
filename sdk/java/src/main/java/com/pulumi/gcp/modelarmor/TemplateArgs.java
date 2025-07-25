// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.modelarmor;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.modelarmor.inputs.TemplateFilterConfigArgs;
import com.pulumi.gcp.modelarmor.inputs.TemplateTemplateMetadataArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final TemplateArgs Empty = new TemplateArgs();

    /**
     * Filters configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="filterConfig", required=true)
    private Output<TemplateFilterConfigArgs> filterConfig;

    /**
     * @return Filters configuration.
     * Structure is documented below.
     * 
     */
    public Output<TemplateFilterConfigArgs> filterConfig() {
        return this.filterConfig;
    }

    /**
     * Labels as key value pairs
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels as key value pairs
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * Id of the requesting object
     * If auto-generating Id server-side, remove this field and
     * template_id from the method_signature of Create RPC
     * 
     */
    @Import(name="templateId", required=true)
    private Output<String> templateId;

    /**
     * @return Id of the requesting object
     * If auto-generating Id server-side, remove this field and
     * template_id from the method_signature of Create RPC
     * 
     */
    public Output<String> templateId() {
        return this.templateId;
    }

    /**
     * Message describing TemplateMetadata
     * Structure is documented below.
     * 
     */
    @Import(name="templateMetadata")
    private @Nullable Output<TemplateTemplateMetadataArgs> templateMetadata;

    /**
     * @return Message describing TemplateMetadata
     * Structure is documented below.
     * 
     */
    public Optional<Output<TemplateTemplateMetadataArgs>> templateMetadata() {
        return Optional.ofNullable(this.templateMetadata);
    }

    private TemplateArgs() {}

    private TemplateArgs(TemplateArgs $) {
        this.filterConfig = $.filterConfig;
        this.labels = $.labels;
        this.location = $.location;
        this.project = $.project;
        this.templateId = $.templateId;
        this.templateMetadata = $.templateMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateArgs $;

        public Builder() {
            $ = new TemplateArgs();
        }

        public Builder(TemplateArgs defaults) {
            $ = new TemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filterConfig Filters configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filterConfig(Output<TemplateFilterConfigArgs> filterConfig) {
            $.filterConfig = filterConfig;
            return this;
        }

        /**
         * @param filterConfig Filters configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filterConfig(TemplateFilterConfigArgs filterConfig) {
            return filterConfig(Output.of(filterConfig));
        }

        /**
         * @param labels Labels as key value pairs
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
         * @param labels Labels as key value pairs
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
         * @param location Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
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
         * @param templateId Id of the requesting object
         * If auto-generating Id server-side, remove this field and
         * template_id from the method_signature of Create RPC
         * 
         * @return builder
         * 
         */
        public Builder templateId(Output<String> templateId) {
            $.templateId = templateId;
            return this;
        }

        /**
         * @param templateId Id of the requesting object
         * If auto-generating Id server-side, remove this field and
         * template_id from the method_signature of Create RPC
         * 
         * @return builder
         * 
         */
        public Builder templateId(String templateId) {
            return templateId(Output.of(templateId));
        }

        /**
         * @param templateMetadata Message describing TemplateMetadata
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder templateMetadata(@Nullable Output<TemplateTemplateMetadataArgs> templateMetadata) {
            $.templateMetadata = templateMetadata;
            return this;
        }

        /**
         * @param templateMetadata Message describing TemplateMetadata
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder templateMetadata(TemplateTemplateMetadataArgs templateMetadata) {
            return templateMetadata(Output.of(templateMetadata));
        }

        public TemplateArgs build() {
            if ($.filterConfig == null) {
                throw new MissingRequiredPropertyException("TemplateArgs", "filterConfig");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("TemplateArgs", "location");
            }
            if ($.templateId == null) {
                throw new MissingRequiredPropertyException("TemplateArgs", "templateId");
            }
            return $;
        }
    }

}
