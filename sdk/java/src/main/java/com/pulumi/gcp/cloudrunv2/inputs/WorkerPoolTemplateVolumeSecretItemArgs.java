// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkerPoolTemplateVolumeSecretItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkerPoolTemplateVolumeSecretItemArgs Empty = new WorkerPoolTemplateVolumeSecretItemArgs();

    /**
     * Integer octal mode bits to use on this file, must be a value between 01 and 0777 (octal). If 0 or not set, the Volume&#39;s default mode will be used.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<Integer> mode;

    /**
     * @return Integer octal mode bits to use on this file, must be a value between 01 and 0777 (octal). If 0 or not set, the Volume&#39;s default mode will be used.
     * 
     */
    public Optional<Output<Integer>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The relative path of the secret in the container.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return The relative path of the secret in the container.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * The Cloud Secret Manager secret version. Can be &#39;latest&#39; for the latest value or an integer for a specific version
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The Cloud Secret Manager secret version. Can be &#39;latest&#39; for the latest value or an integer for a specific version
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private WorkerPoolTemplateVolumeSecretItemArgs() {}

    private WorkerPoolTemplateVolumeSecretItemArgs(WorkerPoolTemplateVolumeSecretItemArgs $) {
        this.mode = $.mode;
        this.path = $.path;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkerPoolTemplateVolumeSecretItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkerPoolTemplateVolumeSecretItemArgs $;

        public Builder() {
            $ = new WorkerPoolTemplateVolumeSecretItemArgs();
        }

        public Builder(WorkerPoolTemplateVolumeSecretItemArgs defaults) {
            $ = new WorkerPoolTemplateVolumeSecretItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mode Integer octal mode bits to use on this file, must be a value between 01 and 0777 (octal). If 0 or not set, the Volume&#39;s default mode will be used.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<Integer> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Integer octal mode bits to use on this file, must be a value between 01 and 0777 (octal). If 0 or not set, the Volume&#39;s default mode will be used.
         * 
         * @return builder
         * 
         */
        public Builder mode(Integer mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param path The relative path of the secret in the container.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The relative path of the secret in the container.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param version The Cloud Secret Manager secret version. Can be &#39;latest&#39; for the latest value or an integer for a specific version
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The Cloud Secret Manager secret version. Can be &#39;latest&#39; for the latest value or an integer for a specific version
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public WorkerPoolTemplateVolumeSecretItemArgs build() {
            if ($.path == null) {
                throw new MissingRequiredPropertyException("WorkerPoolTemplateVolumeSecretItemArgs", "path");
            }
            return $;
        }
    }

}
