// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PreventionInspectTemplateInspectConfigInfoTypeSensitivityScore {
    /**
     * @return The sensitivity score applied to the resource.
     * Possible values are: `SENSITIVITY_LOW`, `SENSITIVITY_MODERATE`, `SENSITIVITY_HIGH`.
     * 
     */
    private String score;

    private PreventionInspectTemplateInspectConfigInfoTypeSensitivityScore() {}
    /**
     * @return The sensitivity score applied to the resource.
     * Possible values are: `SENSITIVITY_LOW`, `SENSITIVITY_MODERATE`, `SENSITIVITY_HIGH`.
     * 
     */
    public String score() {
        return this.score;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigInfoTypeSensitivityScore defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String score;
        public Builder() {}
        public Builder(PreventionInspectTemplateInspectConfigInfoTypeSensitivityScore defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.score = defaults.score;
        }

        @CustomType.Setter
        public Builder score(String score) {
            this.score = Objects.requireNonNull(score);
            return this;
        }
        public PreventionInspectTemplateInspectConfigInfoTypeSensitivityScore build() {
            final var o = new PreventionInspectTemplateInspectConfigInfoTypeSensitivityScore();
            o.score = score;
            return o;
        }
    }
}