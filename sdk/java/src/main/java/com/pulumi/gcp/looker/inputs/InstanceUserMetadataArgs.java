// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.looker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceUserMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceUserMetadataArgs Empty = new InstanceUserMetadataArgs();

    /**
     * Number of additional Developer Users to allocate to the Looker Instance.
     * 
     */
    @Import(name="additionalDeveloperUserCount")
    private @Nullable Output<Integer> additionalDeveloperUserCount;

    /**
     * @return Number of additional Developer Users to allocate to the Looker Instance.
     * 
     */
    public Optional<Output<Integer>> additionalDeveloperUserCount() {
        return Optional.ofNullable(this.additionalDeveloperUserCount);
    }

    /**
     * Number of additional Standard Users to allocate to the Looker Instance.
     * 
     */
    @Import(name="additionalStandardUserCount")
    private @Nullable Output<Integer> additionalStandardUserCount;

    /**
     * @return Number of additional Standard Users to allocate to the Looker Instance.
     * 
     */
    public Optional<Output<Integer>> additionalStandardUserCount() {
        return Optional.ofNullable(this.additionalStandardUserCount);
    }

    /**
     * Number of additional Viewer Users to allocate to the Looker Instance.
     * 
     */
    @Import(name="additionalViewerUserCount")
    private @Nullable Output<Integer> additionalViewerUserCount;

    /**
     * @return Number of additional Viewer Users to allocate to the Looker Instance.
     * 
     */
    public Optional<Output<Integer>> additionalViewerUserCount() {
        return Optional.ofNullable(this.additionalViewerUserCount);
    }

    private InstanceUserMetadataArgs() {}

    private InstanceUserMetadataArgs(InstanceUserMetadataArgs $) {
        this.additionalDeveloperUserCount = $.additionalDeveloperUserCount;
        this.additionalStandardUserCount = $.additionalStandardUserCount;
        this.additionalViewerUserCount = $.additionalViewerUserCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceUserMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceUserMetadataArgs $;

        public Builder() {
            $ = new InstanceUserMetadataArgs();
        }

        public Builder(InstanceUserMetadataArgs defaults) {
            $ = new InstanceUserMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalDeveloperUserCount Number of additional Developer Users to allocate to the Looker Instance.
         * 
         * @return builder
         * 
         */
        public Builder additionalDeveloperUserCount(@Nullable Output<Integer> additionalDeveloperUserCount) {
            $.additionalDeveloperUserCount = additionalDeveloperUserCount;
            return this;
        }

        /**
         * @param additionalDeveloperUserCount Number of additional Developer Users to allocate to the Looker Instance.
         * 
         * @return builder
         * 
         */
        public Builder additionalDeveloperUserCount(Integer additionalDeveloperUserCount) {
            return additionalDeveloperUserCount(Output.of(additionalDeveloperUserCount));
        }

        /**
         * @param additionalStandardUserCount Number of additional Standard Users to allocate to the Looker Instance.
         * 
         * @return builder
         * 
         */
        public Builder additionalStandardUserCount(@Nullable Output<Integer> additionalStandardUserCount) {
            $.additionalStandardUserCount = additionalStandardUserCount;
            return this;
        }

        /**
         * @param additionalStandardUserCount Number of additional Standard Users to allocate to the Looker Instance.
         * 
         * @return builder
         * 
         */
        public Builder additionalStandardUserCount(Integer additionalStandardUserCount) {
            return additionalStandardUserCount(Output.of(additionalStandardUserCount));
        }

        /**
         * @param additionalViewerUserCount Number of additional Viewer Users to allocate to the Looker Instance.
         * 
         * @return builder
         * 
         */
        public Builder additionalViewerUserCount(@Nullable Output<Integer> additionalViewerUserCount) {
            $.additionalViewerUserCount = additionalViewerUserCount;
            return this;
        }

        /**
         * @param additionalViewerUserCount Number of additional Viewer Users to allocate to the Looker Instance.
         * 
         * @return builder
         * 
         */
        public Builder additionalViewerUserCount(Integer additionalViewerUserCount) {
            return additionalViewerUserCount(Output.of(additionalViewerUserCount));
        }

        public InstanceUserMetadataArgs build() {
            return $;
        }
    }

}