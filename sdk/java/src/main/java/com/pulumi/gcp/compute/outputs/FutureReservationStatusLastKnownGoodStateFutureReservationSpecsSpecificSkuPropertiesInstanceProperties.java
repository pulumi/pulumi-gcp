// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesGuestAccelerator;
import com.pulumi.gcp.compute.outputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesLocalSsd;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstanceProperties {
    /**
     * @return Specifies accelerator type and count.
     * Structure is documented below.
     * 
     */
    private @Nullable List<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesGuestAccelerator> guestAccelerators;
    /**
     * @return Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd.
     * Structure is documented below.
     * 
     */
    private @Nullable List<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesLocalSsd> localSsds;
    /**
     * @return An opaque location hint used to place the allocation close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    private @Nullable String locationHint;
    /**
     * @return Specifies type of machine (name only) which has fixed number of vCPUs and fixed amount of memory. This also includes specifying custom machine type following custom-NUMBER_OF_CPUS-AMOUNT_OF_MEMORY pattern.
     * 
     */
    private @Nullable String machineType;
    /**
     * @return Specifies the number of hours after reservation creation where instances using the reservation won&#39;t be scheduled for maintenance.
     * 
     */
    private @Nullable Integer maintenanceFreezeDurationHours;
    /**
     * @return Specifies the frequency of planned maintenance events. The accepted values are: PERIODIC
     * Possible values are: `PERIODIC`.
     * 
     */
    private @Nullable String maintenanceInterval;
    /**
     * @return Minimum cpu platform the reservation.
     * 
     */
    private @Nullable String minCpuPlatform;

    private FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstanceProperties() {}
    /**
     * @return Specifies accelerator type and count.
     * Structure is documented below.
     * 
     */
    public List<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesGuestAccelerator> guestAccelerators() {
        return this.guestAccelerators == null ? List.of() : this.guestAccelerators;
    }
    /**
     * @return Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd.
     * Structure is documented below.
     * 
     */
    public List<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesLocalSsd> localSsds() {
        return this.localSsds == null ? List.of() : this.localSsds;
    }
    /**
     * @return An opaque location hint used to place the allocation close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    public Optional<String> locationHint() {
        return Optional.ofNullable(this.locationHint);
    }
    /**
     * @return Specifies type of machine (name only) which has fixed number of vCPUs and fixed amount of memory. This also includes specifying custom machine type following custom-NUMBER_OF_CPUS-AMOUNT_OF_MEMORY pattern.
     * 
     */
    public Optional<String> machineType() {
        return Optional.ofNullable(this.machineType);
    }
    /**
     * @return Specifies the number of hours after reservation creation where instances using the reservation won&#39;t be scheduled for maintenance.
     * 
     */
    public Optional<Integer> maintenanceFreezeDurationHours() {
        return Optional.ofNullable(this.maintenanceFreezeDurationHours);
    }
    /**
     * @return Specifies the frequency of planned maintenance events. The accepted values are: PERIODIC
     * Possible values are: `PERIODIC`.
     * 
     */
    public Optional<String> maintenanceInterval() {
        return Optional.ofNullable(this.maintenanceInterval);
    }
    /**
     * @return Minimum cpu platform the reservation.
     * 
     */
    public Optional<String> minCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstanceProperties defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesGuestAccelerator> guestAccelerators;
        private @Nullable List<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesLocalSsd> localSsds;
        private @Nullable String locationHint;
        private @Nullable String machineType;
        private @Nullable Integer maintenanceFreezeDurationHours;
        private @Nullable String maintenanceInterval;
        private @Nullable String minCpuPlatform;
        public Builder() {}
        public Builder(FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstanceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.localSsds = defaults.localSsds;
    	      this.locationHint = defaults.locationHint;
    	      this.machineType = defaults.machineType;
    	      this.maintenanceFreezeDurationHours = defaults.maintenanceFreezeDurationHours;
    	      this.maintenanceInterval = defaults.maintenanceInterval;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
        }

        @CustomType.Setter
        public Builder guestAccelerators(@Nullable List<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesGuestAccelerator> guestAccelerators) {

            this.guestAccelerators = guestAccelerators;
            return this;
        }
        public Builder guestAccelerators(FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesGuestAccelerator... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }
        @CustomType.Setter
        public Builder localSsds(@Nullable List<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesLocalSsd> localSsds) {

            this.localSsds = localSsds;
            return this;
        }
        public Builder localSsds(FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstancePropertiesLocalSsd... localSsds) {
            return localSsds(List.of(localSsds));
        }
        @CustomType.Setter
        public Builder locationHint(@Nullable String locationHint) {

            this.locationHint = locationHint;
            return this;
        }
        @CustomType.Setter
        public Builder machineType(@Nullable String machineType) {

            this.machineType = machineType;
            return this;
        }
        @CustomType.Setter
        public Builder maintenanceFreezeDurationHours(@Nullable Integer maintenanceFreezeDurationHours) {

            this.maintenanceFreezeDurationHours = maintenanceFreezeDurationHours;
            return this;
        }
        @CustomType.Setter
        public Builder maintenanceInterval(@Nullable String maintenanceInterval) {

            this.maintenanceInterval = maintenanceInterval;
            return this;
        }
        @CustomType.Setter
        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {

            this.minCpuPlatform = minCpuPlatform;
            return this;
        }
        public FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstanceProperties build() {
            final var _resultValue = new FutureReservationStatusLastKnownGoodStateFutureReservationSpecsSpecificSkuPropertiesInstanceProperties();
            _resultValue.guestAccelerators = guestAccelerators;
            _resultValue.localSsds = localSsds;
            _resultValue.locationHint = locationHint;
            _resultValue.machineType = machineType;
            _resultValue.maintenanceFreezeDurationHours = maintenanceFreezeDurationHours;
            _resultValue.maintenanceInterval = maintenanceInterval;
            _resultValue.minCpuPlatform = minCpuPlatform;
            return _resultValue;
        }
    }
}
