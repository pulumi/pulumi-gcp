// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudtasks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QueueHttpTargetUriOverridePathOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueueHttpTargetUriOverridePathOverrideArgs Empty = new QueueHttpTargetUriOverridePathOverrideArgs();

    /**
     * The URI path (e.g., /users/1234). Default is an empty string.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The URI path (e.g., /users/1234). Default is an empty string.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    private QueueHttpTargetUriOverridePathOverrideArgs() {}

    private QueueHttpTargetUriOverridePathOverrideArgs(QueueHttpTargetUriOverridePathOverrideArgs $) {
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueueHttpTargetUriOverridePathOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueueHttpTargetUriOverridePathOverrideArgs $;

        public Builder() {
            $ = new QueueHttpTargetUriOverridePathOverrideArgs();
        }

        public Builder(QueueHttpTargetUriOverridePathOverrideArgs defaults) {
            $ = new QueueHttpTargetUriOverridePathOverrideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path The URI path (e.g., /users/1234). Default is an empty string.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The URI path (e.g., /users/1234). Default is an empty string.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public QueueHttpTargetUriOverridePathOverrideArgs build() {
            return $;
        }
    }

}
