// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tpu.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V2VmSchedulingConfig {
    /**
     * @return Defines whether the node is preemptible.
     * 
     */
    private @Nullable Boolean preemptible;
    /**
     * @return Whether the node is created under a reservation.
     * 
     */
    private @Nullable Boolean reserved;

    private V2VmSchedulingConfig() {}
    /**
     * @return Defines whether the node is preemptible.
     * 
     */
    public Optional<Boolean> preemptible() {
        return Optional.ofNullable(this.preemptible);
    }
    /**
     * @return Whether the node is created under a reservation.
     * 
     */
    public Optional<Boolean> reserved() {
        return Optional.ofNullable(this.reserved);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2VmSchedulingConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean preemptible;
        private @Nullable Boolean reserved;
        public Builder() {}
        public Builder(V2VmSchedulingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preemptible = defaults.preemptible;
    	      this.reserved = defaults.reserved;
        }

        @CustomType.Setter
        public Builder preemptible(@Nullable Boolean preemptible) {
            this.preemptible = preemptible;
            return this;
        }
        @CustomType.Setter
        public Builder reserved(@Nullable Boolean reserved) {
            this.reserved = reserved;
            return this;
        }
        public V2VmSchedulingConfig build() {
            final var o = new V2VmSchedulingConfig();
            o.preemptible = preemptible;
            o.reserved = reserved;
            return o;
        }
    }
}