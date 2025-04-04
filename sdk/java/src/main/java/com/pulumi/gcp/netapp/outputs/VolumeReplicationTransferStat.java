// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.netapp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeReplicationTransferStat {
    /**
     * @return (Output)
     * The elapsed time since the creation of the snapshot on the source volume that was last replicated
     * to the destination volume. Lag time represents the difference in age of the destination volume
     * data in relation to the source volume data.
     * 
     */
    private @Nullable String lagDuration;
    /**
     * @return (Output)
     * Size of last completed transfer in bytes.
     * 
     */
    private @Nullable String lastTransferBytes;
    /**
     * @return (Output)
     * Time taken during last completed transfer.
     * 
     */
    private @Nullable String lastTransferDuration;
    /**
     * @return (Output)
     * Time when last transfer completed. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
     * 
     */
    private @Nullable String lastTransferEndTime;
    /**
     * @return (Output)
     * A message describing the cause of the last transfer failure.
     * 
     */
    private @Nullable String lastTransferError;
    /**
     * @return (Output)
     * Cumulative time taken across all transfers for the replication relationship.
     * 
     */
    private @Nullable String totalTransferDuration;
    /**
     * @return (Output)
     * Cumulative bytes transferred so far for the replication relationship.
     * 
     */
    private @Nullable String transferBytes;
    /**
     * @return (Output)
     * Time when progress was updated last. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
     * 
     */
    private @Nullable String updateTime;

    private VolumeReplicationTransferStat() {}
    /**
     * @return (Output)
     * The elapsed time since the creation of the snapshot on the source volume that was last replicated
     * to the destination volume. Lag time represents the difference in age of the destination volume
     * data in relation to the source volume data.
     * 
     */
    public Optional<String> lagDuration() {
        return Optional.ofNullable(this.lagDuration);
    }
    /**
     * @return (Output)
     * Size of last completed transfer in bytes.
     * 
     */
    public Optional<String> lastTransferBytes() {
        return Optional.ofNullable(this.lastTransferBytes);
    }
    /**
     * @return (Output)
     * Time taken during last completed transfer.
     * 
     */
    public Optional<String> lastTransferDuration() {
        return Optional.ofNullable(this.lastTransferDuration);
    }
    /**
     * @return (Output)
     * Time when last transfer completed. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
     * 
     */
    public Optional<String> lastTransferEndTime() {
        return Optional.ofNullable(this.lastTransferEndTime);
    }
    /**
     * @return (Output)
     * A message describing the cause of the last transfer failure.
     * 
     */
    public Optional<String> lastTransferError() {
        return Optional.ofNullable(this.lastTransferError);
    }
    /**
     * @return (Output)
     * Cumulative time taken across all transfers for the replication relationship.
     * 
     */
    public Optional<String> totalTransferDuration() {
        return Optional.ofNullable(this.totalTransferDuration);
    }
    /**
     * @return (Output)
     * Cumulative bytes transferred so far for the replication relationship.
     * 
     */
    public Optional<String> transferBytes() {
        return Optional.ofNullable(this.transferBytes);
    }
    /**
     * @return (Output)
     * Time when progress was updated last. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
     * 
     */
    public Optional<String> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeReplicationTransferStat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String lagDuration;
        private @Nullable String lastTransferBytes;
        private @Nullable String lastTransferDuration;
        private @Nullable String lastTransferEndTime;
        private @Nullable String lastTransferError;
        private @Nullable String totalTransferDuration;
        private @Nullable String transferBytes;
        private @Nullable String updateTime;
        public Builder() {}
        public Builder(VolumeReplicationTransferStat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lagDuration = defaults.lagDuration;
    	      this.lastTransferBytes = defaults.lastTransferBytes;
    	      this.lastTransferDuration = defaults.lastTransferDuration;
    	      this.lastTransferEndTime = defaults.lastTransferEndTime;
    	      this.lastTransferError = defaults.lastTransferError;
    	      this.totalTransferDuration = defaults.totalTransferDuration;
    	      this.transferBytes = defaults.transferBytes;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder lagDuration(@Nullable String lagDuration) {

            this.lagDuration = lagDuration;
            return this;
        }
        @CustomType.Setter
        public Builder lastTransferBytes(@Nullable String lastTransferBytes) {

            this.lastTransferBytes = lastTransferBytes;
            return this;
        }
        @CustomType.Setter
        public Builder lastTransferDuration(@Nullable String lastTransferDuration) {

            this.lastTransferDuration = lastTransferDuration;
            return this;
        }
        @CustomType.Setter
        public Builder lastTransferEndTime(@Nullable String lastTransferEndTime) {

            this.lastTransferEndTime = lastTransferEndTime;
            return this;
        }
        @CustomType.Setter
        public Builder lastTransferError(@Nullable String lastTransferError) {

            this.lastTransferError = lastTransferError;
            return this;
        }
        @CustomType.Setter
        public Builder totalTransferDuration(@Nullable String totalTransferDuration) {

            this.totalTransferDuration = totalTransferDuration;
            return this;
        }
        @CustomType.Setter
        public Builder transferBytes(@Nullable String transferBytes) {

            this.transferBytes = transferBytes;
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(@Nullable String updateTime) {

            this.updateTime = updateTime;
            return this;
        }
        public VolumeReplicationTransferStat build() {
            final var _resultValue = new VolumeReplicationTransferStat();
            _resultValue.lagDuration = lagDuration;
            _resultValue.lastTransferBytes = lastTransferBytes;
            _resultValue.lastTransferDuration = lastTransferDuration;
            _resultValue.lastTransferEndTime = lastTransferEndTime;
            _resultValue.lastTransferError = lastTransferError;
            _resultValue.totalTransferDuration = totalTransferDuration;
            _resultValue.transferBytes = transferBytes;
            _resultValue.updateTime = updateTime;
            return _resultValue;
        }
    }
}
