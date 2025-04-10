// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketSoftDeletePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketSoftDeletePolicyArgs Empty = new BucketSoftDeletePolicyArgs();

    /**
     * Server-determined value that indicates the time from which the policy, or one with a greater retention, was effective. This value is in RFC 3339 format.
     * 
     */
    @Import(name="effectiveTime")
    private @Nullable Output<String> effectiveTime;

    /**
     * @return Server-determined value that indicates the time from which the policy, or one with a greater retention, was effective. This value is in RFC 3339 format.
     * 
     */
    public Optional<Output<String>> effectiveTime() {
        return Optional.ofNullable(this.effectiveTime);
    }

    /**
     * The duration in seconds that soft-deleted objects in the bucket will be retained and cannot be permanently deleted. Default value is 604800. The value must be in between 604800(7 days) and 7776000(90 days). **Note**: To disable the soft delete policy on a bucket, This field must be set to 0.
     * 
     */
    @Import(name="retentionDurationSeconds")
    private @Nullable Output<Integer> retentionDurationSeconds;

    /**
     * @return The duration in seconds that soft-deleted objects in the bucket will be retained and cannot be permanently deleted. Default value is 604800. The value must be in between 604800(7 days) and 7776000(90 days). **Note**: To disable the soft delete policy on a bucket, This field must be set to 0.
     * 
     */
    public Optional<Output<Integer>> retentionDurationSeconds() {
        return Optional.ofNullable(this.retentionDurationSeconds);
    }

    private BucketSoftDeletePolicyArgs() {}

    private BucketSoftDeletePolicyArgs(BucketSoftDeletePolicyArgs $) {
        this.effectiveTime = $.effectiveTime;
        this.retentionDurationSeconds = $.retentionDurationSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketSoftDeletePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketSoftDeletePolicyArgs $;

        public Builder() {
            $ = new BucketSoftDeletePolicyArgs();
        }

        public Builder(BucketSoftDeletePolicyArgs defaults) {
            $ = new BucketSoftDeletePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param effectiveTime Server-determined value that indicates the time from which the policy, or one with a greater retention, was effective. This value is in RFC 3339 format.
         * 
         * @return builder
         * 
         */
        public Builder effectiveTime(@Nullable Output<String> effectiveTime) {
            $.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * @param effectiveTime Server-determined value that indicates the time from which the policy, or one with a greater retention, was effective. This value is in RFC 3339 format.
         * 
         * @return builder
         * 
         */
        public Builder effectiveTime(String effectiveTime) {
            return effectiveTime(Output.of(effectiveTime));
        }

        /**
         * @param retentionDurationSeconds The duration in seconds that soft-deleted objects in the bucket will be retained and cannot be permanently deleted. Default value is 604800. The value must be in between 604800(7 days) and 7776000(90 days). **Note**: To disable the soft delete policy on a bucket, This field must be set to 0.
         * 
         * @return builder
         * 
         */
        public Builder retentionDurationSeconds(@Nullable Output<Integer> retentionDurationSeconds) {
            $.retentionDurationSeconds = retentionDurationSeconds;
            return this;
        }

        /**
         * @param retentionDurationSeconds The duration in seconds that soft-deleted objects in the bucket will be retained and cannot be permanently deleted. Default value is 604800. The value must be in between 604800(7 days) and 7776000(90 days). **Note**: To disable the soft delete policy on a bucket, This field must be set to 0.
         * 
         * @return builder
         * 
         */
        public Builder retentionDurationSeconds(Integer retentionDurationSeconds) {
            return retentionDurationSeconds(Output.of(retentionDurationSeconds));
        }

        public BucketSoftDeletePolicyArgs build() {
            return $;
        }
    }

}
