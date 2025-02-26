// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.transcoder.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.transcoder.outputs.JobConfigOverlayAnimation;
import com.pulumi.gcp.transcoder.outputs.JobConfigOverlayImage;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobConfigOverlay {
    /**
     * @return List of animations. The list should be chronological, without any time overlap.
     * Structure is documented below.
     * 
     */
    private @Nullable List<JobConfigOverlayAnimation> animations;
    /**
     * @return Image overlay.
     * Structure is documented below.
     * 
     */
    private @Nullable JobConfigOverlayImage image;

    private JobConfigOverlay() {}
    /**
     * @return List of animations. The list should be chronological, without any time overlap.
     * Structure is documented below.
     * 
     */
    public List<JobConfigOverlayAnimation> animations() {
        return this.animations == null ? List.of() : this.animations;
    }
    /**
     * @return Image overlay.
     * Structure is documented below.
     * 
     */
    public Optional<JobConfigOverlayImage> image() {
        return Optional.ofNullable(this.image);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigOverlay defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<JobConfigOverlayAnimation> animations;
        private @Nullable JobConfigOverlayImage image;
        public Builder() {}
        public Builder(JobConfigOverlay defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.animations = defaults.animations;
    	      this.image = defaults.image;
        }

        @CustomType.Setter
        public Builder animations(@Nullable List<JobConfigOverlayAnimation> animations) {

            this.animations = animations;
            return this;
        }
        public Builder animations(JobConfigOverlayAnimation... animations) {
            return animations(List.of(animations));
        }
        @CustomType.Setter
        public Builder image(@Nullable JobConfigOverlayImage image) {

            this.image = image;
            return this;
        }
        public JobConfigOverlay build() {
            final var _resultValue = new JobConfigOverlay();
            _resultValue.animations = animations;
            _resultValue.image = image;
            return _resultValue;
        }
    }
}
