// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepositoryIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepositoryIamPolicyArgs Empty = new GetRepositoryIamPolicyArgs();

    /**
     * The name of the repository&#39;s location. In addition to specific regions,
     * special values for multi-region locations are `asia`, `europe`, and `us`.
     * See [here](https://cloud.google.com/artifact-registry/docs/repositories/repo-locations),
     * or use the
     * gcp.artifactregistry.getLocations
     * data source for possible values. Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The name of the repository&#39;s location. In addition to specific regions,
     * special values for multi-region locations are `asia`, `europe`, and `us`.
     * See [here](https://cloud.google.com/artifact-registry/docs/repositories/repo-locations),
     * or use the
     * gcp.artifactregistry.getLocations
     * data source for possible values. Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="repository", required=true)
    private Output<String> repository;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> repository() {
        return this.repository;
    }

    private GetRepositoryIamPolicyArgs() {}

    private GetRepositoryIamPolicyArgs(GetRepositoryIamPolicyArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.repository = $.repository;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepositoryIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepositoryIamPolicyArgs $;

        public Builder() {
            $ = new GetRepositoryIamPolicyArgs();
        }

        public Builder(GetRepositoryIamPolicyArgs defaults) {
            $ = new GetRepositoryIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The name of the repository&#39;s location. In addition to specific regions,
         * special values for multi-region locations are `asia`, `europe`, and `us`.
         * See [here](https://cloud.google.com/artifact-registry/docs/repositories/repo-locations),
         * or use the
         * gcp.artifactregistry.getLocations
         * data source for possible values. Used to find the parent resource to bind the IAM policy to. If not specified,
         * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
         * location is specified, it is taken from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The name of the repository&#39;s location. In addition to specific regions,
         * special values for multi-region locations are `asia`, `europe`, and `us`.
         * See [here](https://cloud.google.com/artifact-registry/docs/repositories/repo-locations),
         * or use the
         * gcp.artifactregistry.getLocations
         * data source for possible values. Used to find the parent resource to bind the IAM policy to. If not specified,
         * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
         * location is specified, it is taken from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
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
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param repository Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder repository(Output<String> repository) {
            $.repository = repository;
            return this;
        }

        /**
         * @param repository Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public GetRepositoryIamPolicyArgs build() {
            if ($.repository == null) {
                throw new MissingRequiredPropertyException("GetRepositoryIamPolicyArgs", "repository");
            }
            return $;
        }
    }

}
