// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OrganizationCustomModuleCustomConfigResourceSelector {
    /**
     * @return The resource types to run the detector on.
     * 
     * ***
     * 
     */
    private List<String> resourceTypes;

    private OrganizationCustomModuleCustomConfigResourceSelector() {}
    /**
     * @return The resource types to run the detector on.
     * 
     * ***
     * 
     */
    public List<String> resourceTypes() {
        return this.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationCustomModuleCustomConfigResourceSelector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> resourceTypes;
        public Builder() {}
        public Builder(OrganizationCustomModuleCustomConfigResourceSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceTypes = defaults.resourceTypes;
        }

        @CustomType.Setter
        public Builder resourceTypes(List<String> resourceTypes) {
            this.resourceTypes = Objects.requireNonNull(resourceTypes);
            return this;
        }
        public Builder resourceTypes(String... resourceTypes) {
            return resourceTypes(List.of(resourceTypes));
        }
        public OrganizationCustomModuleCustomConfigResourceSelector build() {
            final var o = new OrganizationCustomModuleCustomConfigResourceSelector();
            o.resourceTypes = resourceTypes;
            return o;
        }
    }
}