// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsArgs;
import com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesArgs;
import com.pulumi.gcp.compute.inputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsTimeWindowArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs Empty = new FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs();

    /**
     * Settings for sharing the future reservation
     * Structure is documented below.
     * 
     */
    @Import(name="shareSettings")
    private @Nullable Output<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsArgs> shareSettings;

    /**
     * @return Settings for sharing the future reservation
     * Structure is documented below.
     * 
     */
    public Optional<Output<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsArgs>> shareSettings() {
        return Optional.ofNullable(this.shareSettings);
    }

    /**
     * Future Reservation configuration to indicate instance properties and total count.
     * Structure is documented below.
     * 
     */
    @Import(name="specificSkuProperties")
    private @Nullable Output<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesArgs> specificSkuProperties;

    /**
     * @return Future Reservation configuration to indicate instance properties and total count.
     * Structure is documented below.
     * 
     */
    public Optional<Output<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesArgs>> specificSkuProperties() {
        return Optional.ofNullable(this.specificSkuProperties);
    }

    /**
     * Time window for this Future Reservation.
     * Structure is documented below.
     * 
     */
    @Import(name="timeWindow")
    private @Nullable Output<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsTimeWindowArgs> timeWindow;

    /**
     * @return Time window for this Future Reservation.
     * Structure is documented below.
     * 
     */
    public Optional<Output<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsTimeWindowArgs>> timeWindow() {
        return Optional.ofNullable(this.timeWindow);
    }

    private FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs() {}

    private FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs(FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs $) {
        this.shareSettings = $.shareSettings;
        this.specificSkuProperties = $.specificSkuProperties;
        this.timeWindow = $.timeWindow;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs $;

        public Builder() {
            $ = new FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs();
        }

        public Builder(FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs defaults) {
            $ = new FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param shareSettings Settings for sharing the future reservation
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder shareSettings(@Nullable Output<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsArgs> shareSettings) {
            $.shareSettings = shareSettings;
            return this;
        }

        /**
         * @param shareSettings Settings for sharing the future reservation
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder shareSettings(FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsArgs shareSettings) {
            return shareSettings(Output.of(shareSettings));
        }

        /**
         * @param specificSkuProperties Future Reservation configuration to indicate instance properties and total count.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder specificSkuProperties(@Nullable Output<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesArgs> specificSkuProperties) {
            $.specificSkuProperties = specificSkuProperties;
            return this;
        }

        /**
         * @param specificSkuProperties Future Reservation configuration to indicate instance properties and total count.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder specificSkuProperties(FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesArgs specificSkuProperties) {
            return specificSkuProperties(Output.of(specificSkuProperties));
        }

        /**
         * @param timeWindow Time window for this Future Reservation.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timeWindow(@Nullable Output<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsTimeWindowArgs> timeWindow) {
            $.timeWindow = timeWindow;
            return this;
        }

        /**
         * @param timeWindow Time window for this Future Reservation.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timeWindow(FutureReservationStatusLastKnownGoodStateFutureReservationSpecsTimeWindowArgs timeWindow) {
            return timeWindow(Output.of(timeWindow));
        }

        public FutureReservationStatusLastKnownGoodStateFutureReservationSpecsArgs build() {
            return $;
        }
    }

}
