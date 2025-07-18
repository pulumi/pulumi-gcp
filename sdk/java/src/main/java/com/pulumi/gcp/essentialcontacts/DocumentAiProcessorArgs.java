// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.essentialcontacts;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DocumentAiProcessorArgs extends com.pulumi.resources.ResourceArgs {

    public static final DocumentAiProcessorArgs Empty = new DocumentAiProcessorArgs();

    /**
     * The display name. Must be unique.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The display name. Must be unique.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The KMS key used for encryption/decryption in CMEK scenarios. See https://cloud.google.com/security-key-management.
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    /**
     * @return The KMS key used for encryption/decryption in CMEK scenarios. See https://cloud.google.com/security-key-management.
     * 
     */
    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location of the resource.
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
     * The type of processor. For possible types see the [official list](https://cloud.google.com/document-ai/docs/reference/rest/v1/projects.locations/fetchProcessorTypes#google.cloud.documentai.v1.DocumentProcessorService.FetchProcessorTypes)
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of processor. For possible types see the [official list](https://cloud.google.com/document-ai/docs/reference/rest/v1/projects.locations/fetchProcessorTypes#google.cloud.documentai.v1.DocumentProcessorService.FetchProcessorTypes)
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private DocumentAiProcessorArgs() {}

    private DocumentAiProcessorArgs(DocumentAiProcessorArgs $) {
        this.displayName = $.displayName;
        this.kmsKeyName = $.kmsKeyName;
        this.location = $.location;
        this.project = $.project;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentAiProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentAiProcessorArgs $;

        public Builder() {
            $ = new DocumentAiProcessorArgs();
        }

        public Builder(DocumentAiProcessorArgs defaults) {
            $ = new DocumentAiProcessorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName The display name. Must be unique.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name. Must be unique.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param kmsKeyName The KMS key used for encryption/decryption in CMEK scenarios. See https://cloud.google.com/security-key-management.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName The KMS key used for encryption/decryption in CMEK scenarios. See https://cloud.google.com/security-key-management.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
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
         * @param type The type of processor. For possible types see the [official list](https://cloud.google.com/document-ai/docs/reference/rest/v1/projects.locations/fetchProcessorTypes#google.cloud.documentai.v1.DocumentProcessorService.FetchProcessorTypes)
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of processor. For possible types see the [official list](https://cloud.google.com/document-ai/docs/reference/rest/v1/projects.locations/fetchProcessorTypes#google.cloud.documentai.v1.DocumentProcessorService.FetchProcessorTypes)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DocumentAiProcessorArgs build() {
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("DocumentAiProcessorArgs", "displayName");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("DocumentAiProcessorArgs", "location");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("DocumentAiProcessorArgs", "type");
            }
            return $;
        }
    }

}
