// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.contactcenterinsights;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ViewArgs extends com.pulumi.resources.ResourceArgs {

    public static final ViewArgs Empty = new ViewArgs();

    /**
     * The human-readable display name of the view.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The human-readable display name of the view.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Location of the resource.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return Location of the resource.
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
     * A filter to reduce conversation results to a specific subset.
     * Refer to https://cloud.google.com/contact-center/insights/docs/filtering
     * for details.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return A filter to reduce conversation results to a specific subset.
     * Refer to https://cloud.google.com/contact-center/insights/docs/filtering
     * for details.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ViewArgs() {}

    private ViewArgs(ViewArgs $) {
        this.displayName = $.displayName;
        this.location = $.location;
        this.project = $.project;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ViewArgs $;

        public Builder() {
            $ = new ViewArgs();
        }

        public Builder(ViewArgs defaults) {
            $ = new ViewArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName The human-readable display name of the view.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The human-readable display name of the view.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param location Location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location of the resource.
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
         * @param value A filter to reduce conversation results to a specific subset.
         * Refer to https://cloud.google.com/contact-center/insights/docs/filtering
         * for details.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value A filter to reduce conversation results to a specific subset.
         * Refer to https://cloud.google.com/contact-center/insights/docs/filtering
         * for details.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ViewArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("ViewArgs", "location");
            }
            return $;
        }
    }

}
