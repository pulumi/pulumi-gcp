// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterFleetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterFleetArgs Empty = new ClusterFleetArgs();

    @Import(name="membership")
    private @Nullable Output<String> membership;

    public Optional<Output<String>> membership() {
        return Optional.ofNullable(this.membership);
    }

    @Import(name="preRegistered")
    private @Nullable Output<Boolean> preRegistered;

    public Optional<Output<Boolean>> preRegistered() {
        return Optional.ofNullable(this.preRegistered);
    }

    /**
     * The name of the Fleet host project where this cluster will be registered.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The name of the Fleet host project where this cluster will be registered.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private ClusterFleetArgs() {}

    private ClusterFleetArgs(ClusterFleetArgs $) {
        this.membership = $.membership;
        this.preRegistered = $.preRegistered;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterFleetArgs $;

        public Builder() {
            $ = new ClusterFleetArgs();
        }

        public Builder(ClusterFleetArgs defaults) {
            $ = new ClusterFleetArgs(Objects.requireNonNull(defaults));
        }

        public Builder membership(@Nullable Output<String> membership) {
            $.membership = membership;
            return this;
        }

        public Builder membership(String membership) {
            return membership(Output.of(membership));
        }

        public Builder preRegistered(@Nullable Output<Boolean> preRegistered) {
            $.preRegistered = preRegistered;
            return this;
        }

        public Builder preRegistered(Boolean preRegistered) {
            return preRegistered(Output.of(preRegistered));
        }

        /**
         * @param project The name of the Fleet host project where this cluster will be registered.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The name of the Fleet host project where this cluster will be registered.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public ClusterFleetArgs build() {
            return $;
        }
    }

}