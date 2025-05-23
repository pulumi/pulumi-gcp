// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListArgs;
import com.pulumi.gcp.storage.inputs.BatchOperationsJobDeleteObjectArgs;
import com.pulumi.gcp.storage.inputs.BatchOperationsJobPutMetadataArgs;
import com.pulumi.gcp.storage.inputs.BatchOperationsJobPutObjectHoldArgs;
import com.pulumi.gcp.storage.inputs.BatchOperationsJobRewriteObjectArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BatchOperationsJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final BatchOperationsJobArgs Empty = new BatchOperationsJobArgs();

    /**
     * List of buckets and their objects to be transformed. Currently, only one bucket configuration is supported. If multiple buckets are specified, an error will be returned
     * Structure is documented below.
     * 
     */
    @Import(name="bucketList")
    private @Nullable Output<BatchOperationsJobBucketListArgs> bucketList;

    /**
     * @return List of buckets and their objects to be transformed. Currently, only one bucket configuration is supported. If multiple buckets are specified, an error will be returned
     * Structure is documented below.
     * 
     */
    public Optional<Output<BatchOperationsJobBucketListArgs>> bucketList() {
        return Optional.ofNullable(this.bucketList);
    }

    /**
     * allows batch operations to delete objects in bucket
     * Structure is documented below.
     * 
     */
    @Import(name="deleteObject")
    private @Nullable Output<BatchOperationsJobDeleteObjectArgs> deleteObject;

    /**
     * @return allows batch operations to delete objects in bucket
     * Structure is documented below.
     * 
     */
    public Optional<Output<BatchOperationsJobDeleteObjectArgs>> deleteObject() {
        return Optional.ofNullable(this.deleteObject);
    }

    /**
     * If set to `true`, the storage batch operation job will not be deleted and new job will be created.
     * 
     */
    @Import(name="deleteProtection")
    private @Nullable Output<Boolean> deleteProtection;

    /**
     * @return If set to `true`, the storage batch operation job will not be deleted and new job will be created.
     * 
     */
    public Optional<Output<Boolean>> deleteProtection() {
        return Optional.ofNullable(this.deleteProtection);
    }

    /**
     * The ID of the job.
     * 
     */
    @Import(name="jobId")
    private @Nullable Output<String> jobId;

    /**
     * @return The ID of the job.
     * 
     */
    public Optional<Output<String>> jobId() {
        return Optional.ofNullable(this.jobId);
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

    /**
     * allows batch operations to update metadata for objects in bucket
     * Structure is documented below.
     * 
     */
    @Import(name="putMetadata")
    private @Nullable Output<BatchOperationsJobPutMetadataArgs> putMetadata;

    /**
     * @return allows batch operations to update metadata for objects in bucket
     * Structure is documented below.
     * 
     */
    public Optional<Output<BatchOperationsJobPutMetadataArgs>> putMetadata() {
        return Optional.ofNullable(this.putMetadata);
    }

    /**
     * allows to update temporary hold or eventBased hold for objects in bucket.
     * Structure is documented below.
     * 
     */
    @Import(name="putObjectHold")
    private @Nullable Output<BatchOperationsJobPutObjectHoldArgs> putObjectHold;

    /**
     * @return allows to update temporary hold or eventBased hold for objects in bucket.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BatchOperationsJobPutObjectHoldArgs>> putObjectHold() {
        return Optional.ofNullable(this.putObjectHold);
    }

    /**
     * allows to update encryption key for objects in bucket.
     * Structure is documented below.
     * 
     */
    @Import(name="rewriteObject")
    private @Nullable Output<BatchOperationsJobRewriteObjectArgs> rewriteObject;

    /**
     * @return allows to update encryption key for objects in bucket.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BatchOperationsJobRewriteObjectArgs>> rewriteObject() {
        return Optional.ofNullable(this.rewriteObject);
    }

    private BatchOperationsJobArgs() {}

    private BatchOperationsJobArgs(BatchOperationsJobArgs $) {
        this.bucketList = $.bucketList;
        this.deleteObject = $.deleteObject;
        this.deleteProtection = $.deleteProtection;
        this.jobId = $.jobId;
        this.project = $.project;
        this.putMetadata = $.putMetadata;
        this.putObjectHold = $.putObjectHold;
        this.rewriteObject = $.rewriteObject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BatchOperationsJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BatchOperationsJobArgs $;

        public Builder() {
            $ = new BatchOperationsJobArgs();
        }

        public Builder(BatchOperationsJobArgs defaults) {
            $ = new BatchOperationsJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketList List of buckets and their objects to be transformed. Currently, only one bucket configuration is supported. If multiple buckets are specified, an error will be returned
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bucketList(@Nullable Output<BatchOperationsJobBucketListArgs> bucketList) {
            $.bucketList = bucketList;
            return this;
        }

        /**
         * @param bucketList List of buckets and their objects to be transformed. Currently, only one bucket configuration is supported. If multiple buckets are specified, an error will be returned
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bucketList(BatchOperationsJobBucketListArgs bucketList) {
            return bucketList(Output.of(bucketList));
        }

        /**
         * @param deleteObject allows batch operations to delete objects in bucket
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder deleteObject(@Nullable Output<BatchOperationsJobDeleteObjectArgs> deleteObject) {
            $.deleteObject = deleteObject;
            return this;
        }

        /**
         * @param deleteObject allows batch operations to delete objects in bucket
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder deleteObject(BatchOperationsJobDeleteObjectArgs deleteObject) {
            return deleteObject(Output.of(deleteObject));
        }

        /**
         * @param deleteProtection If set to `true`, the storage batch operation job will not be deleted and new job will be created.
         * 
         * @return builder
         * 
         */
        public Builder deleteProtection(@Nullable Output<Boolean> deleteProtection) {
            $.deleteProtection = deleteProtection;
            return this;
        }

        /**
         * @param deleteProtection If set to `true`, the storage batch operation job will not be deleted and new job will be created.
         * 
         * @return builder
         * 
         */
        public Builder deleteProtection(Boolean deleteProtection) {
            return deleteProtection(Output.of(deleteProtection));
        }

        /**
         * @param jobId The ID of the job.
         * 
         * @return builder
         * 
         */
        public Builder jobId(@Nullable Output<String> jobId) {
            $.jobId = jobId;
            return this;
        }

        /**
         * @param jobId The ID of the job.
         * 
         * @return builder
         * 
         */
        public Builder jobId(String jobId) {
            return jobId(Output.of(jobId));
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

        /**
         * @param putMetadata allows batch operations to update metadata for objects in bucket
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder putMetadata(@Nullable Output<BatchOperationsJobPutMetadataArgs> putMetadata) {
            $.putMetadata = putMetadata;
            return this;
        }

        /**
         * @param putMetadata allows batch operations to update metadata for objects in bucket
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder putMetadata(BatchOperationsJobPutMetadataArgs putMetadata) {
            return putMetadata(Output.of(putMetadata));
        }

        /**
         * @param putObjectHold allows to update temporary hold or eventBased hold for objects in bucket.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder putObjectHold(@Nullable Output<BatchOperationsJobPutObjectHoldArgs> putObjectHold) {
            $.putObjectHold = putObjectHold;
            return this;
        }

        /**
         * @param putObjectHold allows to update temporary hold or eventBased hold for objects in bucket.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder putObjectHold(BatchOperationsJobPutObjectHoldArgs putObjectHold) {
            return putObjectHold(Output.of(putObjectHold));
        }

        /**
         * @param rewriteObject allows to update encryption key for objects in bucket.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rewriteObject(@Nullable Output<BatchOperationsJobRewriteObjectArgs> rewriteObject) {
            $.rewriteObject = rewriteObject;
            return this;
        }

        /**
         * @param rewriteObject allows to update encryption key for objects in bucket.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rewriteObject(BatchOperationsJobRewriteObjectArgs rewriteObject) {
            return rewriteObject(Output.of(rewriteObject));
        }

        public BatchOperationsJobArgs build() {
            return $;
        }
    }

}
