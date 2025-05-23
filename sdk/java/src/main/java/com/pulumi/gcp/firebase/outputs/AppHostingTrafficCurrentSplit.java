// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppHostingTrafficCurrentSplit {
    /**
     * @return The build that traffic is being routed to.
     * 
     */
    private @Nullable String build;
    /**
     * @return The percentage of traffic to send to the build. Currently must be 100 or 0.
     * 
     */
    private @Nullable Integer percent;

    private AppHostingTrafficCurrentSplit() {}
    /**
     * @return The build that traffic is being routed to.
     * 
     */
    public Optional<String> build() {
        return Optional.ofNullable(this.build);
    }
    /**
     * @return The percentage of traffic to send to the build. Currently must be 100 or 0.
     * 
     */
    public Optional<Integer> percent() {
        return Optional.ofNullable(this.percent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppHostingTrafficCurrentSplit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String build;
        private @Nullable Integer percent;
        public Builder() {}
        public Builder(AppHostingTrafficCurrentSplit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.build = defaults.build;
    	      this.percent = defaults.percent;
        }

        @CustomType.Setter
        public Builder build(@Nullable String build) {

            this.build = build;
            return this;
        }
        @CustomType.Setter
        public Builder percent(@Nullable Integer percent) {

            this.percent = percent;
            return this;
        }
        public AppHostingTrafficCurrentSplit build() {
            final var _resultValue = new AppHostingTrafficCurrentSplit();
            _resultValue.build = build;
            _resultValue.percent = percent;
            return _resultValue;
        }
    }
}
