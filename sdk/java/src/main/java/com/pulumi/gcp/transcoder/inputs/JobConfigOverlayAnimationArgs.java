// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.transcoder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.transcoder.inputs.JobConfigOverlayAnimationAnimationFadeArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobConfigOverlayAnimationArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobConfigOverlayAnimationArgs Empty = new JobConfigOverlayAnimationArgs();

    /**
     * Display overlay object with fade animation.
     * Structure is documented below.
     * 
     */
    @Import(name="animationFade")
    private @Nullable Output<JobConfigOverlayAnimationAnimationFadeArgs> animationFade;

    /**
     * @return Display overlay object with fade animation.
     * Structure is documented below.
     * 
     */
    public Optional<Output<JobConfigOverlayAnimationAnimationFadeArgs>> animationFade() {
        return Optional.ofNullable(this.animationFade);
    }

    private JobConfigOverlayAnimationArgs() {}

    private JobConfigOverlayAnimationArgs(JobConfigOverlayAnimationArgs $) {
        this.animationFade = $.animationFade;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobConfigOverlayAnimationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobConfigOverlayAnimationArgs $;

        public Builder() {
            $ = new JobConfigOverlayAnimationArgs();
        }

        public Builder(JobConfigOverlayAnimationArgs defaults) {
            $ = new JobConfigOverlayAnimationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param animationFade Display overlay object with fade animation.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder animationFade(@Nullable Output<JobConfigOverlayAnimationAnimationFadeArgs> animationFade) {
            $.animationFade = animationFade;
            return this;
        }

        /**
         * @param animationFade Display overlay object with fade animation.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder animationFade(JobConfigOverlayAnimationAnimationFadeArgs animationFade) {
            return animationFade(Output.of(animationFade));
        }

        public JobConfigOverlayAnimationArgs build() {
            return $;
        }
    }

}
