// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.gkehub.outputs.GetFeatureStateState;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFeatureState {
    /**
     * @return Output only. The &#34;running state&#34; of the Feature in this Hub.
     * 
     */
    private List<GetFeatureStateState> states;

    private GetFeatureState() {}
    /**
     * @return Output only. The &#34;running state&#34; of the Feature in this Hub.
     * 
     */
    public List<GetFeatureStateState> states() {
        return this.states;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFeatureState defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetFeatureStateState> states;
        public Builder() {}
        public Builder(GetFeatureState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.states = defaults.states;
        }

        @CustomType.Setter
        public Builder states(List<GetFeatureStateState> states) {
            if (states == null) {
              throw new MissingRequiredPropertyException("GetFeatureState", "states");
            }
            this.states = states;
            return this;
        }
        public Builder states(GetFeatureStateState... states) {
            return states(List.of(states));
        }
        public GetFeatureState build() {
            final var _resultValue = new GetFeatureState();
            _resultValue.states = states;
            return _resultValue;
        }
    }
}
