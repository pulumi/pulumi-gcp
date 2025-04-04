// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class FolderBucketConfigIndexConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FolderBucketConfigIndexConfigArgs Empty = new FolderBucketConfigIndexConfigArgs();

    /**
     * The LogEntry field path to index.
     * Note that some paths are automatically indexed, and other paths are not eligible for indexing. See [indexing documentation](https://cloud.google.com/logging/docs/analyze/custom-index) for details.
     * 
     */
    @Import(name="fieldPath", required=true)
    private Output<String> fieldPath;

    /**
     * @return The LogEntry field path to index.
     * Note that some paths are automatically indexed, and other paths are not eligible for indexing. See [indexing documentation](https://cloud.google.com/logging/docs/analyze/custom-index) for details.
     * 
     */
    public Output<String> fieldPath() {
        return this.fieldPath;
    }

    /**
     * The type of data in this index. Allowed types include `INDEX_TYPE_UNSPECIFIED`, `INDEX_TYPE_STRING` and `INDEX_TYPE_INTEGER`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of data in this index. Allowed types include `INDEX_TYPE_UNSPECIFIED`, `INDEX_TYPE_STRING` and `INDEX_TYPE_INTEGER`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private FolderBucketConfigIndexConfigArgs() {}

    private FolderBucketConfigIndexConfigArgs(FolderBucketConfigIndexConfigArgs $) {
        this.fieldPath = $.fieldPath;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FolderBucketConfigIndexConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FolderBucketConfigIndexConfigArgs $;

        public Builder() {
            $ = new FolderBucketConfigIndexConfigArgs();
        }

        public Builder(FolderBucketConfigIndexConfigArgs defaults) {
            $ = new FolderBucketConfigIndexConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldPath The LogEntry field path to index.
         * Note that some paths are automatically indexed, and other paths are not eligible for indexing. See [indexing documentation](https://cloud.google.com/logging/docs/analyze/custom-index) for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldPath(Output<String> fieldPath) {
            $.fieldPath = fieldPath;
            return this;
        }

        /**
         * @param fieldPath The LogEntry field path to index.
         * Note that some paths are automatically indexed, and other paths are not eligible for indexing. See [indexing documentation](https://cloud.google.com/logging/docs/analyze/custom-index) for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldPath(String fieldPath) {
            return fieldPath(Output.of(fieldPath));
        }

        /**
         * @param type The type of data in this index. Allowed types include `INDEX_TYPE_UNSPECIFIED`, `INDEX_TYPE_STRING` and `INDEX_TYPE_INTEGER`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of data in this index. Allowed types include `INDEX_TYPE_UNSPECIFIED`, `INDEX_TYPE_STRING` and `INDEX_TYPE_INTEGER`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FolderBucketConfigIndexConfigArgs build() {
            if ($.fieldPath == null) {
                throw new MissingRequiredPropertyException("FolderBucketConfigIndexConfigArgs", "fieldPath");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("FolderBucketConfigIndexConfigArgs", "type");
            }
            return $;
        }
    }

}
