// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.outputs.GetRegionInstanceGroupInstanceNamedPort;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRegionInstanceGroupInstance {
    /**
     * @return URL to the instance.
     * 
     */
    private String instance;
    /**
     * @return List of named ports in the group, as a list of resources, each containing:
     * 
     */
    private List<GetRegionInstanceGroupInstanceNamedPort> namedPorts;
    /**
     * @return String description of current state of the instance.
     * 
     */
    private String status;

    private GetRegionInstanceGroupInstance() {}
    /**
     * @return URL to the instance.
     * 
     */
    public String instance() {
        return this.instance;
    }
    /**
     * @return List of named ports in the group, as a list of resources, each containing:
     * 
     */
    public List<GetRegionInstanceGroupInstanceNamedPort> namedPorts() {
        return this.namedPorts;
    }
    /**
     * @return String description of current state of the instance.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstanceGroupInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String instance;
        private List<GetRegionInstanceGroupInstanceNamedPort> namedPorts;
        private String status;
        public Builder() {}
        public Builder(GetRegionInstanceGroupInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.namedPorts = defaults.namedPorts;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder instance(String instance) {
            if (instance == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceGroupInstance", "instance");
            }
            this.instance = instance;
            return this;
        }
        @CustomType.Setter
        public Builder namedPorts(List<GetRegionInstanceGroupInstanceNamedPort> namedPorts) {
            if (namedPorts == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceGroupInstance", "namedPorts");
            }
            this.namedPorts = namedPorts;
            return this;
        }
        public Builder namedPorts(GetRegionInstanceGroupInstanceNamedPort... namedPorts) {
            return namedPorts(List.of(namedPorts));
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetRegionInstanceGroupInstance", "status");
            }
            this.status = status;
            return this;
        }
        public GetRegionInstanceGroupInstance build() {
            final var _resultValue = new GetRegionInstanceGroupInstance();
            _resultValue.instance = instance;
            _resultValue.namedPorts = namedPorts;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
