// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.outputs.GetReservationShareSettingProjectMap;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetReservationShareSetting {
    private List<GetReservationShareSettingProjectMap> projectMaps;
    private String shareType;

    private GetReservationShareSetting() {}
    public List<GetReservationShareSettingProjectMap> projectMaps() {
        return this.projectMaps;
    }
    public String shareType() {
        return this.shareType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReservationShareSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetReservationShareSettingProjectMap> projectMaps;
        private String shareType;
        public Builder() {}
        public Builder(GetReservationShareSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectMaps = defaults.projectMaps;
    	      this.shareType = defaults.shareType;
        }

        @CustomType.Setter
        public Builder projectMaps(List<GetReservationShareSettingProjectMap> projectMaps) {
            if (projectMaps == null) {
              throw new MissingRequiredPropertyException("GetReservationShareSetting", "projectMaps");
            }
            this.projectMaps = projectMaps;
            return this;
        }
        public Builder projectMaps(GetReservationShareSettingProjectMap... projectMaps) {
            return projectMaps(List.of(projectMaps));
        }
        @CustomType.Setter
        public Builder shareType(String shareType) {
            if (shareType == null) {
              throw new MissingRequiredPropertyException("GetReservationShareSetting", "shareType");
            }
            this.shareType = shareType;
            return this;
        }
        public GetReservationShareSetting build() {
            final var _resultValue = new GetReservationShareSetting();
            _resultValue.projectMaps = projectMaps;
            _resultValue.shareType = shareType;
            return _resultValue;
        }
    }
}