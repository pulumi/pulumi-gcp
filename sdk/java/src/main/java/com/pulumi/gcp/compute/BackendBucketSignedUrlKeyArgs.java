// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendBucketSignedUrlKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendBucketSignedUrlKeyArgs Empty = new BackendBucketSignedUrlKeyArgs();

    /**
     * The backend bucket this signed URL key belongs.
     * 
     */
    @Import(name="backendBucket", required=true)
    private Output<String> backendBucket;

    /**
     * @return The backend bucket this signed URL key belongs.
     * 
     */
    public Output<String> backendBucket() {
        return this.backendBucket;
    }

    /**
     * 128-bit key value used for signing the URL. The key value must be a
     * valid RFC 4648 Section 5 base64url encoded string.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="keyValue", required=true)
    private Output<String> keyValue;

    /**
     * @return 128-bit key value used for signing the URL. The key value must be a
     * valid RFC 4648 Section 5 base64url encoded string.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Output<String> keyValue() {
        return this.keyValue;
    }

    /**
     * Name of the signed URL key.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the signed URL key.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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

    private BackendBucketSignedUrlKeyArgs() {}

    private BackendBucketSignedUrlKeyArgs(BackendBucketSignedUrlKeyArgs $) {
        this.backendBucket = $.backendBucket;
        this.keyValue = $.keyValue;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendBucketSignedUrlKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendBucketSignedUrlKeyArgs $;

        public Builder() {
            $ = new BackendBucketSignedUrlKeyArgs();
        }

        public Builder(BackendBucketSignedUrlKeyArgs defaults) {
            $ = new BackendBucketSignedUrlKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendBucket The backend bucket this signed URL key belongs.
         * 
         * @return builder
         * 
         */
        public Builder backendBucket(Output<String> backendBucket) {
            $.backendBucket = backendBucket;
            return this;
        }

        /**
         * @param backendBucket The backend bucket this signed URL key belongs.
         * 
         * @return builder
         * 
         */
        public Builder backendBucket(String backendBucket) {
            return backendBucket(Output.of(backendBucket));
        }

        /**
         * @param keyValue 128-bit key value used for signing the URL. The key value must be a
         * valid RFC 4648 Section 5 base64url encoded string.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder keyValue(Output<String> keyValue) {
            $.keyValue = keyValue;
            return this;
        }

        /**
         * @param keyValue 128-bit key value used for signing the URL. The key value must be a
         * valid RFC 4648 Section 5 base64url encoded string.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder keyValue(String keyValue) {
            return keyValue(Output.of(keyValue));
        }

        /**
         * @param name Name of the signed URL key.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the signed URL key.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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

        public BackendBucketSignedUrlKeyArgs build() {
            $.backendBucket = Objects.requireNonNull($.backendBucket, "expected parameter 'backendBucket' to be non-null");
            $.keyValue = Objects.requireNonNull($.keyValue, "expected parameter 'keyValue' to be non-null");
            return $;
        }
    }

}