// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepositoryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepositoryPlainArgs Empty = new GetRepositoryPlainArgs();

    /**
     * The location of the artifact registry repository. eg us-central1
     * 
     */
    @Import(name="location", required=true)
    private String location;

    /**
     * @return The location of the artifact registry repository. eg us-central1
     * 
     */
    public String location() {
        return this.location;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The last part of the repository name.
     * 
     */
    @Import(name="repositoryId", required=true)
    private String repositoryId;

    /**
     * @return The last part of the repository name.
     * 
     */
    public String repositoryId() {
        return this.repositoryId;
    }

    private GetRepositoryPlainArgs() {}

    private GetRepositoryPlainArgs(GetRepositoryPlainArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.repositoryId = $.repositoryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepositoryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepositoryPlainArgs $;

        public Builder() {
            $ = new GetRepositoryPlainArgs();
        }

        public Builder(GetRepositoryPlainArgs defaults) {
            $ = new GetRepositoryPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The location of the artifact registry repository. eg us-central1
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            $.location = location;
            return this;
        }

        /**
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param repositoryId The last part of the repository name.
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(String repositoryId) {
            $.repositoryId = repositoryId;
            return this;
        }

        public GetRepositoryPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.repositoryId = Objects.requireNonNull($.repositoryId, "expected parameter 'repositoryId' to be non-null");
            return $;
        }
    }

}