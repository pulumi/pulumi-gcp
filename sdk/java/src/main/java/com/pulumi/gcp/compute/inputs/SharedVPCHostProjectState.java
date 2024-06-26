// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SharedVPCHostProjectState extends com.pulumi.resources.ResourceArgs {

    public static final SharedVPCHostProjectState Empty = new SharedVPCHostProjectState();

    /**
     * The ID of the project that will serve as a Shared VPC host project
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project that will serve as a Shared VPC host project
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private SharedVPCHostProjectState() {}

    private SharedVPCHostProjectState(SharedVPCHostProjectState $) {
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedVPCHostProjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedVPCHostProjectState $;

        public Builder() {
            $ = new SharedVPCHostProjectState();
        }

        public Builder(SharedVPCHostProjectState defaults) {
            $ = new SharedVPCHostProjectState(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The ID of the project that will serve as a Shared VPC host project
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project that will serve as a Shared VPC host project
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public SharedVPCHostProjectState build() {
            return $;
        }
    }

}
