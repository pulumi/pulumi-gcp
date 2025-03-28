// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.eventarc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.eventarc.outputs.PipelineMediationTransformation;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineMediation {
    /**
     * @return Transformation defines the way to transform an incoming message.
     * Structure is documented below.
     * 
     */
    private @Nullable PipelineMediationTransformation transformation;

    private PipelineMediation() {}
    /**
     * @return Transformation defines the way to transform an incoming message.
     * Structure is documented below.
     * 
     */
    public Optional<PipelineMediationTransformation> transformation() {
        return Optional.ofNullable(this.transformation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineMediation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PipelineMediationTransformation transformation;
        public Builder() {}
        public Builder(PipelineMediation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transformation = defaults.transformation;
        }

        @CustomType.Setter
        public Builder transformation(@Nullable PipelineMediationTransformation transformation) {

            this.transformation = transformation;
            return this;
        }
        public PipelineMediation build() {
            final var _resultValue = new PipelineMediation();
            _resultValue.transformation = transformation;
            return _resultValue;
        }
    }
}
