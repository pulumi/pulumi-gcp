// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectLocationArgs Empty = new ProjectLocationArgs();

    /**
     * The ID of the default GCP resource location for the Project. The location must be one of the available GCP
     * resource locations.
     * 
     * ***
     * 
     */
    @Import(name="locationId", required=true)
    private Output<String> locationId;

    /**
     * @return The ID of the default GCP resource location for the Project. The location must be one of the available GCP
     * resource locations.
     * 
     * ***
     * 
     */
    public Output<String> locationId() {
        return this.locationId;
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

    private ProjectLocationArgs() {}

    private ProjectLocationArgs(ProjectLocationArgs $) {
        this.locationId = $.locationId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectLocationArgs $;

        public Builder() {
            $ = new ProjectLocationArgs();
        }

        public Builder(ProjectLocationArgs defaults) {
            $ = new ProjectLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param locationId The ID of the default GCP resource location for the Project. The location must be one of the available GCP
         * resource locations.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder locationId(Output<String> locationId) {
            $.locationId = locationId;
            return this;
        }

        /**
         * @param locationId The ID of the default GCP resource location for the Project. The location must be one of the available GCP
         * resource locations.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder locationId(String locationId) {
            return locationId(Output.of(locationId));
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

        public ProjectLocationArgs build() {
            $.locationId = Objects.requireNonNull($.locationId, "expected parameter 'locationId' to be non-null");
            return $;
        }
    }

}