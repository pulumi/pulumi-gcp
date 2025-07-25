// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReservationReservationSharingPolicy {
    /**
     * @return Sharing config for all Google Cloud services.
     * Possible values are: `ALLOW_ALL`, `DISALLOW_ALL`.
     * 
     */
    private @Nullable String serviceShareType;

    private ReservationReservationSharingPolicy() {}
    /**
     * @return Sharing config for all Google Cloud services.
     * Possible values are: `ALLOW_ALL`, `DISALLOW_ALL`.
     * 
     */
    public Optional<String> serviceShareType() {
        return Optional.ofNullable(this.serviceShareType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationReservationSharingPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String serviceShareType;
        public Builder() {}
        public Builder(ReservationReservationSharingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceShareType = defaults.serviceShareType;
        }

        @CustomType.Setter
        public Builder serviceShareType(@Nullable String serviceShareType) {

            this.serviceShareType = serviceShareType;
            return this;
        }
        public ReservationReservationSharingPolicy build() {
            final var _resultValue = new ReservationReservationSharingPolicy();
            _resultValue.serviceShareType = serviceShareType;
            return _resultValue;
        }
    }
}
