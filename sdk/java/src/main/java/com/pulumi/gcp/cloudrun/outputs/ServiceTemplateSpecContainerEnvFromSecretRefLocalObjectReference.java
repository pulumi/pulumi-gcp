// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference {
    /**
     * @return Volume&#39;s name.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference(@CustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * @return Volume&#39;s name.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference build() {
            return new ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference(name);
        }
    }
}