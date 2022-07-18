// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTransferProjectServieAccountPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransferProjectServieAccountPlainArgs Empty = new GetTransferProjectServieAccountPlainArgs();

    /**
     * The project ID. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The project ID. If it is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetTransferProjectServieAccountPlainArgs() {}

    private GetTransferProjectServieAccountPlainArgs(GetTransferProjectServieAccountPlainArgs $) {
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransferProjectServieAccountPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransferProjectServieAccountPlainArgs $;

        public Builder() {
            $ = new GetTransferProjectServieAccountPlainArgs();
        }

        public Builder(GetTransferProjectServieAccountPlainArgs defaults) {
            $ = new GetTransferProjectServieAccountPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The project ID. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetTransferProjectServieAccountPlainArgs build() {
            return $;
        }
    }

}