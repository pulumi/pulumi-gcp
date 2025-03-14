// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAncestryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAncestryPlainArgs Empty = new GetAncestryPlainArgs();

    /**
     * The ID of the project. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project. If it is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetAncestryPlainArgs() {}

    private GetAncestryPlainArgs(GetAncestryPlainArgs $) {
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAncestryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAncestryPlainArgs $;

        public Builder() {
            $ = new GetAncestryPlainArgs();
        }

        public Builder(GetAncestryPlainArgs defaults) {
            $ = new GetAncestryPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The ID of the project. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetAncestryPlainArgs build() {
            return $;
        }
    }

}
