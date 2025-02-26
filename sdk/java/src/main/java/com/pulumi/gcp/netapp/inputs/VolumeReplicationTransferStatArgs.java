// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.netapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeReplicationTransferStatArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeReplicationTransferStatArgs Empty = new VolumeReplicationTransferStatArgs();

    /**
     * (Output)
     * The elapsed time since the creation of the snapshot on the source volume that was last replicated
     * to the destination volume. Lag time represents the difference in age of the destination volume
     * data in relation to the source volume data.
     * 
     */
    @Import(name="lagDuration")
    private @Nullable Output<String> lagDuration;

    /**
     * @return (Output)
     * The elapsed time since the creation of the snapshot on the source volume that was last replicated
     * to the destination volume. Lag time represents the difference in age of the destination volume
     * data in relation to the source volume data.
     * 
     */
    public Optional<Output<String>> lagDuration() {
        return Optional.ofNullable(this.lagDuration);
    }

    /**
     * (Output)
     * Size of last completed transfer in bytes.
     * 
     */
    @Import(name="lastTransferBytes")
    private @Nullable Output<String> lastTransferBytes;

    /**
     * @return (Output)
     * Size of last completed transfer in bytes.
     * 
     */
    public Optional<Output<String>> lastTransferBytes() {
        return Optional.ofNullable(this.lastTransferBytes);
    }

    /**
     * (Output)
     * Time taken during last completed transfer.
     * 
     */
    @Import(name="lastTransferDuration")
    private @Nullable Output<String> lastTransferDuration;

    /**
     * @return (Output)
     * Time taken during last completed transfer.
     * 
     */
    public Optional<Output<String>> lastTransferDuration() {
        return Optional.ofNullable(this.lastTransferDuration);
    }

    /**
     * (Output)
     * Time when last transfer completed. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
     * 
     */
    @Import(name="lastTransferEndTime")
    private @Nullable Output<String> lastTransferEndTime;

    /**
     * @return (Output)
     * Time when last transfer completed. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
     * 
     */
    public Optional<Output<String>> lastTransferEndTime() {
        return Optional.ofNullable(this.lastTransferEndTime);
    }

    /**
     * (Output)
     * A message describing the cause of the last transfer failure.
     * 
     */
    @Import(name="lastTransferError")
    private @Nullable Output<String> lastTransferError;

    /**
     * @return (Output)
     * A message describing the cause of the last transfer failure.
     * 
     */
    public Optional<Output<String>> lastTransferError() {
        return Optional.ofNullable(this.lastTransferError);
    }

    /**
     * (Output)
     * Cumulative time taken across all transfers for the replication relationship.
     * 
     */
    @Import(name="totalTransferDuration")
    private @Nullable Output<String> totalTransferDuration;

    /**
     * @return (Output)
     * Cumulative time taken across all transfers for the replication relationship.
     * 
     */
    public Optional<Output<String>> totalTransferDuration() {
        return Optional.ofNullable(this.totalTransferDuration);
    }

    /**
     * (Output)
     * Cumulative bytes transferred so far for the replication relationship.
     * 
     */
    @Import(name="transferBytes")
    private @Nullable Output<String> transferBytes;

    /**
     * @return (Output)
     * Cumulative bytes transferred so far for the replication relationship.
     * 
     */
    public Optional<Output<String>> transferBytes() {
        return Optional.ofNullable(this.transferBytes);
    }

    /**
     * (Output)
     * Time when progress was updated last. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return (Output)
     * Time when progress was updated last. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private VolumeReplicationTransferStatArgs() {}

    private VolumeReplicationTransferStatArgs(VolumeReplicationTransferStatArgs $) {
        this.lagDuration = $.lagDuration;
        this.lastTransferBytes = $.lastTransferBytes;
        this.lastTransferDuration = $.lastTransferDuration;
        this.lastTransferEndTime = $.lastTransferEndTime;
        this.lastTransferError = $.lastTransferError;
        this.totalTransferDuration = $.totalTransferDuration;
        this.transferBytes = $.transferBytes;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeReplicationTransferStatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeReplicationTransferStatArgs $;

        public Builder() {
            $ = new VolumeReplicationTransferStatArgs();
        }

        public Builder(VolumeReplicationTransferStatArgs defaults) {
            $ = new VolumeReplicationTransferStatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lagDuration (Output)
         * The elapsed time since the creation of the snapshot on the source volume that was last replicated
         * to the destination volume. Lag time represents the difference in age of the destination volume
         * data in relation to the source volume data.
         * 
         * @return builder
         * 
         */
        public Builder lagDuration(@Nullable Output<String> lagDuration) {
            $.lagDuration = lagDuration;
            return this;
        }

        /**
         * @param lagDuration (Output)
         * The elapsed time since the creation of the snapshot on the source volume that was last replicated
         * to the destination volume. Lag time represents the difference in age of the destination volume
         * data in relation to the source volume data.
         * 
         * @return builder
         * 
         */
        public Builder lagDuration(String lagDuration) {
            return lagDuration(Output.of(lagDuration));
        }

        /**
         * @param lastTransferBytes (Output)
         * Size of last completed transfer in bytes.
         * 
         * @return builder
         * 
         */
        public Builder lastTransferBytes(@Nullable Output<String> lastTransferBytes) {
            $.lastTransferBytes = lastTransferBytes;
            return this;
        }

        /**
         * @param lastTransferBytes (Output)
         * Size of last completed transfer in bytes.
         * 
         * @return builder
         * 
         */
        public Builder lastTransferBytes(String lastTransferBytes) {
            return lastTransferBytes(Output.of(lastTransferBytes));
        }

        /**
         * @param lastTransferDuration (Output)
         * Time taken during last completed transfer.
         * 
         * @return builder
         * 
         */
        public Builder lastTransferDuration(@Nullable Output<String> lastTransferDuration) {
            $.lastTransferDuration = lastTransferDuration;
            return this;
        }

        /**
         * @param lastTransferDuration (Output)
         * Time taken during last completed transfer.
         * 
         * @return builder
         * 
         */
        public Builder lastTransferDuration(String lastTransferDuration) {
            return lastTransferDuration(Output.of(lastTransferDuration));
        }

        /**
         * @param lastTransferEndTime (Output)
         * Time when last transfer completed. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder lastTransferEndTime(@Nullable Output<String> lastTransferEndTime) {
            $.lastTransferEndTime = lastTransferEndTime;
            return this;
        }

        /**
         * @param lastTransferEndTime (Output)
         * Time when last transfer completed. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder lastTransferEndTime(String lastTransferEndTime) {
            return lastTransferEndTime(Output.of(lastTransferEndTime));
        }

        /**
         * @param lastTransferError (Output)
         * A message describing the cause of the last transfer failure.
         * 
         * @return builder
         * 
         */
        public Builder lastTransferError(@Nullable Output<String> lastTransferError) {
            $.lastTransferError = lastTransferError;
            return this;
        }

        /**
         * @param lastTransferError (Output)
         * A message describing the cause of the last transfer failure.
         * 
         * @return builder
         * 
         */
        public Builder lastTransferError(String lastTransferError) {
            return lastTransferError(Output.of(lastTransferError));
        }

        /**
         * @param totalTransferDuration (Output)
         * Cumulative time taken across all transfers for the replication relationship.
         * 
         * @return builder
         * 
         */
        public Builder totalTransferDuration(@Nullable Output<String> totalTransferDuration) {
            $.totalTransferDuration = totalTransferDuration;
            return this;
        }

        /**
         * @param totalTransferDuration (Output)
         * Cumulative time taken across all transfers for the replication relationship.
         * 
         * @return builder
         * 
         */
        public Builder totalTransferDuration(String totalTransferDuration) {
            return totalTransferDuration(Output.of(totalTransferDuration));
        }

        /**
         * @param transferBytes (Output)
         * Cumulative bytes transferred so far for the replication relationship.
         * 
         * @return builder
         * 
         */
        public Builder transferBytes(@Nullable Output<String> transferBytes) {
            $.transferBytes = transferBytes;
            return this;
        }

        /**
         * @param transferBytes (Output)
         * Cumulative bytes transferred so far for the replication relationship.
         * 
         * @return builder
         * 
         */
        public Builder transferBytes(String transferBytes) {
            return transferBytes(Output.of(transferBytes));
        }

        /**
         * @param updateTime (Output)
         * Time when progress was updated last. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime (Output)
         * Time when progress was updated last. A timestamp in RFC3339 UTC &#34;Zulu&#34; format. Examples: &#34;2023-06-22T09:13:01.617Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public VolumeReplicationTransferStatArgs build() {
            return $;
        }
    }

}
