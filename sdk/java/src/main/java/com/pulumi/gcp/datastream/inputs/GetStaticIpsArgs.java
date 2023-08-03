// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStaticIpsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStaticIpsArgs Empty = new GetStaticIpsArgs();

    /**
     * The location to list Datastream IPs for. For example: `us-east1`.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location to list Datastream IPs for. For example: `us-east1`.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * Project from which to list static IP addresses. Defaults to project declared in the provider.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return Project from which to list static IP addresses. Defaults to project declared in the provider.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetStaticIpsArgs() {}

    private GetStaticIpsArgs(GetStaticIpsArgs $) {
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStaticIpsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStaticIpsArgs $;

        public Builder() {
            $ = new GetStaticIpsArgs();
        }

        public Builder(GetStaticIpsArgs defaults) {
            $ = new GetStaticIpsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The location to list Datastream IPs for. For example: `us-east1`.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location to list Datastream IPs for. For example: `us-east1`.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param project Project from which to list static IP addresses. Defaults to project declared in the provider.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Project from which to list static IP addresses. Defaults to project declared in the provider.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetStaticIpsArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}