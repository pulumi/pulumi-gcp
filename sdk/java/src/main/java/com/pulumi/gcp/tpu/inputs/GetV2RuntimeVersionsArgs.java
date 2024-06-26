// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tpu.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetV2RuntimeVersionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetV2RuntimeVersionsArgs Empty = new GetV2RuntimeVersionsArgs();

    /**
     * The project to list versions for. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project to list versions for. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The zone to list versions for. If it
     * is not provided, the provider zone is used.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return The zone to list versions for. If it
     * is not provided, the provider zone is used.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private GetV2RuntimeVersionsArgs() {}

    private GetV2RuntimeVersionsArgs(GetV2RuntimeVersionsArgs $) {
        this.project = $.project;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetV2RuntimeVersionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetV2RuntimeVersionsArgs $;

        public Builder() {
            $ = new GetV2RuntimeVersionsArgs();
        }

        public Builder(GetV2RuntimeVersionsArgs defaults) {
            $ = new GetV2RuntimeVersionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The project to list versions for. If it
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
         * @param project The project to list versions for. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param zone The zone to list versions for. If it
         * is not provided, the provider zone is used.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The zone to list versions for. If it
         * is not provided, the provider zone is used.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public GetV2RuntimeVersionsArgs build() {
            return $;
        }
    }

}
