// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference {
    /**
     * @return Name of the referent.
     * 
     */
    private String name;

    private ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference() {}
    /**
     * @return Name of the referent.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        public Builder() {}
        public Builder(ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference", "name");
            }
            this.name = name;
            return this;
        }
        public ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference build() {
            final var _resultValue = new ServiceTemplateSpecContainerEnvFromConfigMapRefLocalObjectReference();
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
