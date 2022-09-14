// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.apigee.outputs.OrganizationPropertiesProperty;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class OrganizationProperties {
    /**
     * @return List of all properties in the object.
     * Structure is documented below.
     * 
     */
    private @Nullable List<OrganizationPropertiesProperty> properties;

    private OrganizationProperties() {}
    /**
     * @return List of all properties in the object.
     * Structure is documented below.
     * 
     */
    public List<OrganizationPropertiesProperty> properties() {
        return this.properties == null ? List.of() : this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationProperties defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<OrganizationPropertiesProperty> properties;
        public Builder() {}
        public Builder(OrganizationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
        }

        @CustomType.Setter
        public Builder properties(@Nullable List<OrganizationPropertiesProperty> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(OrganizationPropertiesProperty... properties) {
            return properties(List.of(properties));
        }
        public OrganizationProperties build() {
            final var o = new OrganizationProperties();
            o.properties = properties;
            return o;
        }
    }
}