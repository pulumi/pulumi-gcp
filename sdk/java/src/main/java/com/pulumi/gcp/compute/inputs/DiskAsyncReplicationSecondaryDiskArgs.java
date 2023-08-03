// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskAsyncReplicationSecondaryDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskAsyncReplicationSecondaryDiskArgs Empty = new DiskAsyncReplicationSecondaryDiskArgs();

    /**
     * The secondary disk.
     * 
     */
    @Import(name="disk", required=true)
    private Output<String> disk;

    /**
     * @return The secondary disk.
     * 
     */
    public Output<String> disk() {
        return this.disk;
    }

    /**
     * Output-only. Status of replication on the secondary disk.
     * 
     * ***
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Output-only. Status of replication on the secondary disk.
     * 
     * ***
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private DiskAsyncReplicationSecondaryDiskArgs() {}

    private DiskAsyncReplicationSecondaryDiskArgs(DiskAsyncReplicationSecondaryDiskArgs $) {
        this.disk = $.disk;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskAsyncReplicationSecondaryDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskAsyncReplicationSecondaryDiskArgs $;

        public Builder() {
            $ = new DiskAsyncReplicationSecondaryDiskArgs();
        }

        public Builder(DiskAsyncReplicationSecondaryDiskArgs defaults) {
            $ = new DiskAsyncReplicationSecondaryDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disk The secondary disk.
         * 
         * @return builder
         * 
         */
        public Builder disk(Output<String> disk) {
            $.disk = disk;
            return this;
        }

        /**
         * @param disk The secondary disk.
         * 
         * @return builder
         * 
         */
        public Builder disk(String disk) {
            return disk(Output.of(disk));
        }

        /**
         * @param state Output-only. Status of replication on the secondary disk.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Output-only. Status of replication on the secondary disk.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public DiskAsyncReplicationSecondaryDiskArgs build() {
            $.disk = Objects.requireNonNull($.disk, "expected parameter 'disk' to be non-null");
            return $;
        }
    }

}