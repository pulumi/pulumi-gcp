// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAwsVersionsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAwsVersionsPlainArgs Empty = new GetAwsVersionsPlainArgs();

    /**
     * The location to list versions for.
     * 
     */
    @Import(name="location")
    private @Nullable String location;

    /**
     * @return The location to list versions for.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * ID of the project to list available cluster versions for. Should match the project the cluster will be deployed to.
     * Defaults to the project that the provider is authenticated with.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return ID of the project to list available cluster versions for. Should match the project the cluster will be deployed to.
     * Defaults to the project that the provider is authenticated with.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetAwsVersionsPlainArgs() {}

    private GetAwsVersionsPlainArgs(GetAwsVersionsPlainArgs $) {
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAwsVersionsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAwsVersionsPlainArgs $;

        public Builder() {
            $ = new GetAwsVersionsPlainArgs();
        }

        public Builder(GetAwsVersionsPlainArgs defaults) {
            $ = new GetAwsVersionsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The location to list versions for.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        /**
         * @param project ID of the project to list available cluster versions for. Should match the project the cluster will be deployed to.
         * Defaults to the project that the provider is authenticated with.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetAwsVersionsPlainArgs build() {
            return $;
        }
    }

}