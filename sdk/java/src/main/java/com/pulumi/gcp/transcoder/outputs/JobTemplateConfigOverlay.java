// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.transcoder.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.transcoder.outputs.JobTemplateConfigOverlayAnimation;
import com.pulumi.gcp.transcoder.outputs.JobTemplateConfigOverlayImage;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTemplateConfigOverlay {
    /**
     * @return List of animations. The list should be chronological, without any time overlap.
     * Structure is documented below.
     * 
     */
    private @Nullable List<JobTemplateConfigOverlayAnimation> animations;
    /**
     * @return Image overlay.
     * Structure is documented below.
     * 
     */
    private @Nullable JobTemplateConfigOverlayImage image;

    private JobTemplateConfigOverlay() {}
    /**
     * @return List of animations. The list should be chronological, without any time overlap.
     * Structure is documented below.
     * 
     */
    public List<JobTemplateConfigOverlayAnimation> animations() {
        return this.animations == null ? List.of() : this.animations;
    }
    /**
     * @return Image overlay.
     * Structure is documented below.
     * 
     */
    public Optional<JobTemplateConfigOverlayImage> image() {
        return Optional.ofNullable(this.image);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateConfigOverlay defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<JobTemplateConfigOverlayAnimation> animations;
        private @Nullable JobTemplateConfigOverlayImage image;
        public Builder() {}
        public Builder(JobTemplateConfigOverlay defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.animations = defaults.animations;
    	      this.image = defaults.image;
        }

        @CustomType.Setter
        public Builder animations(@Nullable List<JobTemplateConfigOverlayAnimation> animations) {

            this.animations = animations;
            return this;
        }
        public Builder animations(JobTemplateConfigOverlayAnimation... animations) {
            return animations(List.of(animations));
        }
        @CustomType.Setter
        public Builder image(@Nullable JobTemplateConfigOverlayImage image) {

            this.image = image;
            return this;
        }
        public JobTemplateConfigOverlay build() {
            final var _resultValue = new JobTemplateConfigOverlay();
            _resultValue.animations = animations;
            _resultValue.image = image;
            return _resultValue;
        }
    }
}
