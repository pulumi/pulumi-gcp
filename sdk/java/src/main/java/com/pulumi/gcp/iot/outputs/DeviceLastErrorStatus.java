// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceLastErrorStatus {
    /**
     * @return A list of messages that carry the error details.
     * 
     */
    private @Nullable List<Map<String,Object>> details;
    /**
     * @return A developer-facing error message, which should be in English.
     * 
     */
    private @Nullable String message;
    /**
     * @return The status code, which should be an enum value of google.rpc.Code.
     * 
     */
    private @Nullable Integer number;

    private DeviceLastErrorStatus() {}
    /**
     * @return A list of messages that carry the error details.
     * 
     */
    public List<Map<String,Object>> details() {
        return this.details == null ? List.of() : this.details;
    }
    /**
     * @return A developer-facing error message, which should be in English.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return The status code, which should be an enum value of google.rpc.Code.
     * 
     */
    public Optional<Integer> number() {
        return Optional.ofNullable(this.number);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceLastErrorStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<Map<String,Object>> details;
        private @Nullable String message;
        private @Nullable Integer number;
        public Builder() {}
        public Builder(DeviceLastErrorStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.number = defaults.number;
        }

        @CustomType.Setter
        public Builder details(@Nullable List<Map<String,Object>> details) {
            this.details = details;
            return this;
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder number(@Nullable Integer number) {
            this.number = number;
            return this;
        }
        public DeviceLastErrorStatus build() {
            final var o = new DeviceLastErrorStatus();
            o.details = details;
            o.message = message;
            o.number = number;
            return o;
        }
    }
}