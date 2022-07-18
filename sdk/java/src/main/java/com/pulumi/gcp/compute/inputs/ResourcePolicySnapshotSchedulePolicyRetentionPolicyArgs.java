// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs Empty = new ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs();

    /**
     * Maximum age of the snapshot that is allowed to be kept.
     * 
     */
    @Import(name="maxRetentionDays", required=true)
    private Output<Integer> maxRetentionDays;

    /**
     * @return Maximum age of the snapshot that is allowed to be kept.
     * 
     */
    public Output<Integer> maxRetentionDays() {
        return this.maxRetentionDays;
    }

    /**
     * Specifies the behavior to apply to scheduled snapshots when
     * the source disk is deleted.
     * Default value is `KEEP_AUTO_SNAPSHOTS`.
     * Possible values are `KEEP_AUTO_SNAPSHOTS` and `APPLY_RETENTION_POLICY`.
     * 
     */
    @Import(name="onSourceDiskDelete")
    private @Nullable Output<String> onSourceDiskDelete;

    /**
     * @return Specifies the behavior to apply to scheduled snapshots when
     * the source disk is deleted.
     * Default value is `KEEP_AUTO_SNAPSHOTS`.
     * Possible values are `KEEP_AUTO_SNAPSHOTS` and `APPLY_RETENTION_POLICY`.
     * 
     */
    public Optional<Output<String>> onSourceDiskDelete() {
        return Optional.ofNullable(this.onSourceDiskDelete);
    }

    private ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs() {}

    private ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs(ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs $) {
        this.maxRetentionDays = $.maxRetentionDays;
        this.onSourceDiskDelete = $.onSourceDiskDelete;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs $;

        public Builder() {
            $ = new ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs();
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs defaults) {
            $ = new ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxRetentionDays Maximum age of the snapshot that is allowed to be kept.
         * 
         * @return builder
         * 
         */
        public Builder maxRetentionDays(Output<Integer> maxRetentionDays) {
            $.maxRetentionDays = maxRetentionDays;
            return this;
        }

        /**
         * @param maxRetentionDays Maximum age of the snapshot that is allowed to be kept.
         * 
         * @return builder
         * 
         */
        public Builder maxRetentionDays(Integer maxRetentionDays) {
            return maxRetentionDays(Output.of(maxRetentionDays));
        }

        /**
         * @param onSourceDiskDelete Specifies the behavior to apply to scheduled snapshots when
         * the source disk is deleted.
         * Default value is `KEEP_AUTO_SNAPSHOTS`.
         * Possible values are `KEEP_AUTO_SNAPSHOTS` and `APPLY_RETENTION_POLICY`.
         * 
         * @return builder
         * 
         */
        public Builder onSourceDiskDelete(@Nullable Output<String> onSourceDiskDelete) {
            $.onSourceDiskDelete = onSourceDiskDelete;
            return this;
        }

        /**
         * @param onSourceDiskDelete Specifies the behavior to apply to scheduled snapshots when
         * the source disk is deleted.
         * Default value is `KEEP_AUTO_SNAPSHOTS`.
         * Possible values are `KEEP_AUTO_SNAPSHOTS` and `APPLY_RETENTION_POLICY`.
         * 
         * @return builder
         * 
         */
        public Builder onSourceDiskDelete(String onSourceDiskDelete) {
            return onSourceDiskDelete(Output.of(onSourceDiskDelete));
        }

        public ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs build() {
            $.maxRetentionDays = Objects.requireNonNull($.maxRetentionDays, "expected parameter 'maxRetentionDays' to be non-null");
            return $;
        }
    }

}