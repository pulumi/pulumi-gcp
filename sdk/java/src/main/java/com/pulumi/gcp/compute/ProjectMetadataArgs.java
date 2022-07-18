// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectMetadataArgs Empty = new ProjectMetadataArgs();

    /**
     * A series of key value pairs.
     * 
     */
    @Import(name="metadata", required=true)
    private Output<Map<String,String>> metadata;

    /**
     * @return A series of key value pairs.
     * 
     */
    public Output<Map<String,String>> metadata() {
        return this.metadata;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private ProjectMetadataArgs() {}

    private ProjectMetadataArgs(ProjectMetadataArgs $) {
        this.metadata = $.metadata;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectMetadataArgs $;

        public Builder() {
            $ = new ProjectMetadataArgs();
        }

        public Builder(ProjectMetadataArgs defaults) {
            $ = new ProjectMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metadata A series of key value pairs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata A series of key value pairs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public ProjectMetadataArgs build() {
            $.metadata = Objects.requireNonNull($.metadata, "expected parameter 'metadata' to be non-null");
            return $;
        }
    }

}