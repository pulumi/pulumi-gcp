// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sourcerepo.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepositoryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepositoryPlainArgs Empty = new GetRepositoryPlainArgs();

    /**
     * Resource name of the repository. The repo name may contain slashes. eg, `name/with/slash`
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Resource name of the repository. The repo name may contain slashes. eg, `name/with/slash`
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetRepositoryPlainArgs() {}

    private GetRepositoryPlainArgs(GetRepositoryPlainArgs $) {
        this.name = $.name;
        this.project = $.project;
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
         * @param name Resource name of the repository. The repo name may contain slashes. eg, `name/with/slash`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetRepositoryPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}