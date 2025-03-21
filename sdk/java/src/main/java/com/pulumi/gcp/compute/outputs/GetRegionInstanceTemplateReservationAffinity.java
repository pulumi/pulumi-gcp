// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.outputs.GetRegionInstanceTemplateReservationAffinitySpecificReservation;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRegionInstanceTemplateReservationAffinity {
    /**
     * @return Specifies the label selector for the reservation to use.
     * 
     */
    private List<GetRegionInstanceTemplateReservationAffinitySpecificReservation> specificReservations;
    /**
     * @return The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    private String type;

    private GetRegionInstanceTemplateReservationAffinity() {}
    /**
     * @return Specifies the label selector for the reservation to use.
     * 
     */
    public List<GetRegionInstanceTemplateReservationAffinitySpecificReservation> specificReservations() {
        return this.specificReservations;
    }
    /**
     * @return The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstanceTemplateReservationAffinity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetRegionInstanceTemplateReservationAffinitySpecificReservation> specificReservations;
        private String type;
        public Builder() {}
        public Builder(GetRegionInstanceTemplateReservationAffinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.specificReservations = defaults.specificReservations;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder specificReservations(List<GetRegionInstanceTemplateReservationAffinitySpecificReservation> specificReservations) {
            if (specificReservations == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceTemplateReservationAffinity", "specificReservations");
            }
            this.specificReservations = specificReservations;
            return this;
        }
        public Builder specificReservations(GetRegionInstanceTemplateReservationAffinitySpecificReservation... specificReservations) {
            return specificReservations(List.of(specificReservations));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceTemplateReservationAffinity", "type");
            }
            this.type = type;
            return this;
        }
        public GetRegionInstanceTemplateReservationAffinity build() {
            final var _resultValue = new GetRegionInstanceTemplateReservationAffinity();
            _resultValue.specificReservations = specificReservations;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
