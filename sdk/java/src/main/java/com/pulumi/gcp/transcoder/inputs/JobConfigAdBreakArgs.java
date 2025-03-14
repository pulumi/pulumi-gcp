// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.transcoder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobConfigAdBreakArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobConfigAdBreakArgs Empty = new JobConfigAdBreakArgs();

    /**
     * Start time in seconds for the ad break, relative to the output file timeline
     * 
     */
    @Import(name="startTimeOffset")
    private @Nullable Output<String> startTimeOffset;

    /**
     * @return Start time in seconds for the ad break, relative to the output file timeline
     * 
     */
    public Optional<Output<String>> startTimeOffset() {
        return Optional.ofNullable(this.startTimeOffset);
    }

    private JobConfigAdBreakArgs() {}

    private JobConfigAdBreakArgs(JobConfigAdBreakArgs $) {
        this.startTimeOffset = $.startTimeOffset;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobConfigAdBreakArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobConfigAdBreakArgs $;

        public Builder() {
            $ = new JobConfigAdBreakArgs();
        }

        public Builder(JobConfigAdBreakArgs defaults) {
            $ = new JobConfigAdBreakArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param startTimeOffset Start time in seconds for the ad break, relative to the output file timeline
         * 
         * @return builder
         * 
         */
        public Builder startTimeOffset(@Nullable Output<String> startTimeOffset) {
            $.startTimeOffset = startTimeOffset;
            return this;
        }

        /**
         * @param startTimeOffset Start time in seconds for the ad break, relative to the output file timeline
         * 
         * @return builder
         * 
         */
        public Builder startTimeOffset(String startTimeOffset) {
            return startTimeOffset(Output.of(startTimeOffset));
        }

        public JobConfigAdBreakArgs build() {
            return $;
        }
    }

}
