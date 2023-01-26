// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatabaseInstancesInstanceSettingMaintenanceWindow {
    private Integer day;
    private Integer hour;
    private String updateTrack;

    private GetDatabaseInstancesInstanceSettingMaintenanceWindow() {}
    public Integer day() {
        return this.day;
    }
    public Integer hour() {
        return this.hour;
    }
    public String updateTrack() {
        return this.updateTrack;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstancesInstanceSettingMaintenanceWindow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer day;
        private Integer hour;
        private String updateTrack;
        public Builder() {}
        public Builder(GetDatabaseInstancesInstanceSettingMaintenanceWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.hour = defaults.hour;
    	      this.updateTrack = defaults.updateTrack;
        }

        @CustomType.Setter
        public Builder day(Integer day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }
        @CustomType.Setter
        public Builder hour(Integer hour) {
            this.hour = Objects.requireNonNull(hour);
            return this;
        }
        @CustomType.Setter
        public Builder updateTrack(String updateTrack) {
            this.updateTrack = Objects.requireNonNull(updateTrack);
            return this;
        }
        public GetDatabaseInstancesInstanceSettingMaintenanceWindow build() {
            final var o = new GetDatabaseInstancesInstanceSettingMaintenanceWindow();
            o.day = day;
            o.hour = hour;
            o.updateTrack = updateTrack;
            return o;
        }
    }
}