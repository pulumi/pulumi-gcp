// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMap;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettings {
    /**
     * @return A map of project id and project config. This is only valid when shareType&#39;s value is SPECIFIC_PROJECTS.
     * Structure is documented below.
     * 
     */
    private @Nullable List<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMap> projectMaps;
    /**
     * @return list of Project names to specify consumer projects for this shared-reservation. This is only valid when shareType&#39;s value is SPECIFIC_PROJECTS.
     * 
     */
    private @Nullable List<String> projects;
    /**
     * @return Type of sharing for this future reservation.
     * Possible values are: `LOCAL`, `SPECIFIC_PROJECTS`.
     * 
     */
    private @Nullable String shareType;

    private FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettings() {}
    /**
     * @return A map of project id and project config. This is only valid when shareType&#39;s value is SPECIFIC_PROJECTS.
     * Structure is documented below.
     * 
     */
    public List<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMap> projectMaps() {
        return this.projectMaps == null ? List.of() : this.projectMaps;
    }
    /**
     * @return list of Project names to specify consumer projects for this shared-reservation. This is only valid when shareType&#39;s value is SPECIFIC_PROJECTS.
     * 
     */
    public List<String> projects() {
        return this.projects == null ? List.of() : this.projects;
    }
    /**
     * @return Type of sharing for this future reservation.
     * Possible values are: `LOCAL`, `SPECIFIC_PROJECTS`.
     * 
     */
    public Optional<String> shareType() {
        return Optional.ofNullable(this.shareType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMap> projectMaps;
        private @Nullable List<String> projects;
        private @Nullable String shareType;
        public Builder() {}
        public Builder(FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectMaps = defaults.projectMaps;
    	      this.projects = defaults.projects;
    	      this.shareType = defaults.shareType;
        }

        @CustomType.Setter
        public Builder projectMaps(@Nullable List<FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMap> projectMaps) {

            this.projectMaps = projectMaps;
            return this;
        }
        public Builder projectMaps(FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMap... projectMaps) {
            return projectMaps(List.of(projectMaps));
        }
        @CustomType.Setter
        public Builder projects(@Nullable List<String> projects) {

            this.projects = projects;
            return this;
        }
        public Builder projects(String... projects) {
            return projects(List.of(projects));
        }
        @CustomType.Setter
        public Builder shareType(@Nullable String shareType) {

            this.shareType = shareType;
            return this;
        }
        public FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettings build() {
            final var _resultValue = new FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettings();
            _resultValue.projectMaps = projectMaps;
            _resultValue.projects = projects;
            _resultValue.shareType = shareType;
            return _resultValue;
        }
    }
}
