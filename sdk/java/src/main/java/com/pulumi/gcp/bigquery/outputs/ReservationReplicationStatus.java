// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.bigquery.outputs.ReservationReplicationStatusError;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReservationReplicationStatus {
    /**
     * @return (Output)
     * The last error encountered while trying to replicate changes from the primary to the
     * secondary. This field is only available if the replication has not succeeded since.
     * Structure is documented below.
     * 
     */
    private @Nullable List<ReservationReplicationStatusError> errors;
    /**
     * @return (Output)
     * The time at which the last error was encountered while trying to replicate changes from
     * the primary to the secondary. This field is only available if the replication has not
     * succeeded since.
     * 
     */
    private @Nullable String lastErrorTime;
    /**
     * @return (Output)
     * A timestamp corresponding to the last change on the primary that was successfully
     * replicated to the secondary.
     * 
     */
    private @Nullable String lastReplicationTime;

    private ReservationReplicationStatus() {}
    /**
     * @return (Output)
     * The last error encountered while trying to replicate changes from the primary to the
     * secondary. This field is only available if the replication has not succeeded since.
     * Structure is documented below.
     * 
     */
    public List<ReservationReplicationStatusError> errors() {
        return this.errors == null ? List.of() : this.errors;
    }
    /**
     * @return (Output)
     * The time at which the last error was encountered while trying to replicate changes from
     * the primary to the secondary. This field is only available if the replication has not
     * succeeded since.
     * 
     */
    public Optional<String> lastErrorTime() {
        return Optional.ofNullable(this.lastErrorTime);
    }
    /**
     * @return (Output)
     * A timestamp corresponding to the last change on the primary that was successfully
     * replicated to the secondary.
     * 
     */
    public Optional<String> lastReplicationTime() {
        return Optional.ofNullable(this.lastReplicationTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationReplicationStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ReservationReplicationStatusError> errors;
        private @Nullable String lastErrorTime;
        private @Nullable String lastReplicationTime;
        public Builder() {}
        public Builder(ReservationReplicationStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.lastErrorTime = defaults.lastErrorTime;
    	      this.lastReplicationTime = defaults.lastReplicationTime;
        }

        @CustomType.Setter
        public Builder errors(@Nullable List<ReservationReplicationStatusError> errors) {

            this.errors = errors;
            return this;
        }
        public Builder errors(ReservationReplicationStatusError... errors) {
            return errors(List.of(errors));
        }
        @CustomType.Setter
        public Builder lastErrorTime(@Nullable String lastErrorTime) {

            this.lastErrorTime = lastErrorTime;
            return this;
        }
        @CustomType.Setter
        public Builder lastReplicationTime(@Nullable String lastReplicationTime) {

            this.lastReplicationTime = lastReplicationTime;
            return this;
        }
        public ReservationReplicationStatus build() {
            final var _resultValue = new ReservationReplicationStatus();
            _resultValue.errors = errors;
            _resultValue.lastErrorTime = lastErrorTime;
            _resultValue.lastReplicationTime = lastReplicationTime;
            return _resultValue;
        }
    }
}
