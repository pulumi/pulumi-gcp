// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcscConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcscConfigArgs Empty = new VpcscConfigArgs();

    /**
     * The name of the location this config is located in.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The name of the location this config is located in.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
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
     * The VPC SC policy for project and location.
     * Possible values are: `DENY`, `ALLOW`.
     * 
     */
    @Import(name="vpcscPolicy")
    private @Nullable Output<String> vpcscPolicy;

    /**
     * @return The VPC SC policy for project and location.
     * Possible values are: `DENY`, `ALLOW`.
     * 
     */
    public Optional<Output<String>> vpcscPolicy() {
        return Optional.ofNullable(this.vpcscPolicy);
    }

    private VpcscConfigArgs() {}

    private VpcscConfigArgs(VpcscConfigArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.vpcscPolicy = $.vpcscPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcscConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcscConfigArgs $;

        public Builder() {
            $ = new VpcscConfigArgs();
        }

        public Builder(VpcscConfigArgs defaults) {
            $ = new VpcscConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The name of the location this config is located in.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The name of the location this config is located in.
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
         * @param vpcscPolicy The VPC SC policy for project and location.
         * Possible values are: `DENY`, `ALLOW`.
         * 
         * @return builder
         * 
         */
        public Builder vpcscPolicy(@Nullable Output<String> vpcscPolicy) {
            $.vpcscPolicy = vpcscPolicy;
            return this;
        }

        /**
         * @param vpcscPolicy The VPC SC policy for project and location.
         * Possible values are: `DENY`, `ALLOW`.
         * 
         * @return builder
         * 
         */
        public Builder vpcscPolicy(String vpcscPolicy) {
            return vpcscPolicy(Output.of(vpcscPolicy));
        }

        public VpcscConfigArgs build() {
            return $;
        }
    }

}