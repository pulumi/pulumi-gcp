// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apphub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkloadAttributesCriticality {
    /**
     * @return Criticality type.
     * Possible values are: `MISSION_CRITICAL`, `HIGH`, `MEDIUM`, `LOW`.
     * 
     */
    private String type;

    private WorkloadAttributesCriticality() {}
    /**
     * @return Criticality type.
     * Possible values are: `MISSION_CRITICAL`, `HIGH`, `MEDIUM`, `LOW`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadAttributesCriticality defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        public Builder() {}
        public Builder(WorkloadAttributesCriticality defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("WorkloadAttributesCriticality", "type");
            }
            this.type = type;
            return this;
        }
        public WorkloadAttributesCriticality build() {
            final var _resultValue = new WorkloadAttributesCriticality();
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
