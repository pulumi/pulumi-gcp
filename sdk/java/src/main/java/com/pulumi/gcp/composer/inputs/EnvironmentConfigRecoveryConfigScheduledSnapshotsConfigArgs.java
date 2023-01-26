// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentConfigRecoveryConfigScheduledSnapshotsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigRecoveryConfigScheduledSnapshotsConfigArgs Empty = new EnvironmentConfigRecoveryConfigScheduledSnapshotsConfigArgs();

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    @Import(name="snapshotCreationSchedule")
    private @Nullable Output<String> snapshotCreationSchedule;

    public Optional<Output<String>> snapshotCreationSchedule() {
        return Optional.ofNullable(this.snapshotCreationSchedule);
    }

    @Import(name="snapshotLocation")
    private @Nullable Output<String> snapshotLocation;

    public Optional<Output<String>> snapshotLocation() {
        return Optional.ofNullable(this.snapshotLocation);
    }

    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private EnvironmentConfigRecoveryConfigScheduledSnapshotsConfigArgs() {}

    private EnvironmentConfigRecoveryConfigScheduledSnapshotsConfigArgs(EnvironmentConfigRecoveryConfigScheduledSnapshotsConfigArgs $) {
        this.enabled = $.enabled;
        this.snapshotCreationSchedule = $.snapshotCreationSchedule;
        this.snapshotLocation = $.snapshotLocation;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentConfigRecoveryConfigScheduledSnapshotsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentConfigRecoveryConfigScheduledSnapshotsConfigArgs $;

        public Builder() {
            $ = new EnvironmentConfigRecoveryConfigScheduledSnapshotsConfigArgs();
        }

        public Builder(EnvironmentConfigRecoveryConfigScheduledSnapshotsConfigArgs defaults) {
            $ = new EnvironmentConfigRecoveryConfigScheduledSnapshotsConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder snapshotCreationSchedule(@Nullable Output<String> snapshotCreationSchedule) {
            $.snapshotCreationSchedule = snapshotCreationSchedule;
            return this;
        }

        public Builder snapshotCreationSchedule(String snapshotCreationSchedule) {
            return snapshotCreationSchedule(Output.of(snapshotCreationSchedule));
        }

        public Builder snapshotLocation(@Nullable Output<String> snapshotLocation) {
            $.snapshotLocation = snapshotLocation;
            return this;
        }

        public Builder snapshotLocation(String snapshotLocation) {
            return snapshotLocation(Output.of(snapshotLocation));
        }

        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public EnvironmentConfigRecoveryConfigScheduledSnapshotsConfigArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}