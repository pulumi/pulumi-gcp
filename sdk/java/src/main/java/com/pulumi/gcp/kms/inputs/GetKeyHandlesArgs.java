// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKeyHandlesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyHandlesArgs Empty = new GetKeyHandlesArgs();

    /**
     * The Google Cloud Platform location for the KeyHandle.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The Google Cloud Platform location for the KeyHandle.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The resource type by which to filter KeyHandle e.g. {SERVICE}.googleapis.com/{TYPE}. See documentation for supported resource types.
     * 
     * ***
     * 
     */
    @Import(name="resourceTypeSelector", required=true)
    private Output<String> resourceTypeSelector;

    /**
     * @return The resource type by which to filter KeyHandle e.g. {SERVICE}.googleapis.com/{TYPE}. See documentation for supported resource types.
     * 
     * ***
     * 
     */
    public Output<String> resourceTypeSelector() {
        return this.resourceTypeSelector;
    }

    private GetKeyHandlesArgs() {}

    private GetKeyHandlesArgs(GetKeyHandlesArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.resourceTypeSelector = $.resourceTypeSelector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyHandlesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyHandlesArgs $;

        public Builder() {
            $ = new GetKeyHandlesArgs();
        }

        public Builder(GetKeyHandlesArgs defaults) {
            $ = new GetKeyHandlesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The Google Cloud Platform location for the KeyHandle.
         * A full list of valid locations can be found by running `gcloud kms locations list`.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Google Cloud Platform location for the KeyHandle.
         * A full list of valid locations can be found by running `gcloud kms locations list`.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param project The project in which the resource belongs. If it
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
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param resourceTypeSelector The resource type by which to filter KeyHandle e.g. {SERVICE}.googleapis.com/{TYPE}. See documentation for supported resource types.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder resourceTypeSelector(Output<String> resourceTypeSelector) {
            $.resourceTypeSelector = resourceTypeSelector;
            return this;
        }

        /**
         * @param resourceTypeSelector The resource type by which to filter KeyHandle e.g. {SERVICE}.googleapis.com/{TYPE}. See documentation for supported resource types.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder resourceTypeSelector(String resourceTypeSelector) {
            return resourceTypeSelector(Output.of(resourceTypeSelector));
        }

        public GetKeyHandlesArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("GetKeyHandlesArgs", "location");
            }
            if ($.resourceTypeSelector == null) {
                throw new MissingRequiredPropertyException("GetKeyHandlesArgs", "resourceTypeSelector");
            }
            return $;
        }
    }

}
