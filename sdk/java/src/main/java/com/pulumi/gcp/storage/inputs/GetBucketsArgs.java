// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBucketsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBucketsArgs Empty = new GetBucketsArgs();

    /**
     * Filter results to buckets whose names begin with this prefix.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return Filter results to buckets whose names begin with this prefix.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * The ID of the project. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project. If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetBucketsArgs() {}

    private GetBucketsArgs(GetBucketsArgs $) {
        this.prefix = $.prefix;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBucketsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBucketsArgs $;

        public Builder() {
            $ = new GetBucketsArgs();
        }

        public Builder(GetBucketsArgs defaults) {
            $ = new GetBucketsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param prefix Filter results to buckets whose names begin with this prefix.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix Filter results to buckets whose names begin with this prefix.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param project The ID of the project. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetBucketsArgs build() {
            return $;
        }
    }

}
