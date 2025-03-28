// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReservationReplicationStatusError {
    /**
     * @return (Output)
     * The status code, which should be an enum value of [google.rpc.Code](https://cloud.google.com/bigquery/docs/reference/reservations/rpc/google.rpc#google.rpc.Code).
     * 
     */
    private @Nullable Integer code;
    /**
     * @return (Output)
     * A developer-facing error message, which should be in English.
     * 
     */
    private @Nullable String message;

    private ReservationReplicationStatusError() {}
    /**
     * @return (Output)
     * The status code, which should be an enum value of [google.rpc.Code](https://cloud.google.com/bigquery/docs/reference/reservations/rpc/google.rpc#google.rpc.Code).
     * 
     */
    public Optional<Integer> code() {
        return Optional.ofNullable(this.code);
    }
    /**
     * @return (Output)
     * A developer-facing error message, which should be in English.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationReplicationStatusError defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer code;
        private @Nullable String message;
        public Builder() {}
        public Builder(ReservationReplicationStatusError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        @CustomType.Setter
        public Builder code(@Nullable Integer code) {

            this.code = code;
            return this;
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {

            this.message = message;
            return this;
        }
        public ReservationReplicationStatusError build() {
            final var _resultValue = new ReservationReplicationStatusError();
            _resultValue.code = code;
            _resultValue.message = message;
            return _resultValue;
        }
    }
}
