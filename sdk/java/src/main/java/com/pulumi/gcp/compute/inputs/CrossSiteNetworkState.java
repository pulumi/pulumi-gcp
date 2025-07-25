// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CrossSiteNetworkState extends com.pulumi.resources.ResourceArgs {

    public static final CrossSiteNetworkState Empty = new CrossSiteNetworkState();

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be
     * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?` which means the first
     * character must be a lowercase letter, and all following characters must be a dash,
     * lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be
     * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?` which means the first
     * character must be a lowercase letter, and all following characters must be a dash,
     * lowercase letter, or digit, except the last character, which cannot be a dash.
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

    private CrossSiteNetworkState() {}

    private CrossSiteNetworkState(CrossSiteNetworkState $) {
        this.description = $.description;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CrossSiteNetworkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CrossSiteNetworkState $;

        public Builder() {
            $ = new CrossSiteNetworkState();
        }

        public Builder(CrossSiteNetworkState defaults) {
            $ = new CrossSiteNetworkState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be
         * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
         * long and match the regular expression `a-z?` which means the first
         * character must be a lowercase letter, and all following characters must be a dash,
         * lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be
         * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
         * long and match the regular expression `a-z?` which means the first
         * character must be a lowercase letter, and all following characters must be a dash,
         * lowercase letter, or digit, except the last character, which cannot be a dash.
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

        public CrossSiteNetworkState build() {
            return $;
        }
    }

}
