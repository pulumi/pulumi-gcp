// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFeatureSpecClusterupgradeGkeUpgradeOverrideUpgrade {
    /**
     * @return The name of the feature you want to know the status of.
     * 
     */
    private String name;
    /**
     * @return Version of the upgrade, e.g., &#34;1.22.1-gke.100&#34;. It should be a valid version. It must not exceet 99 characters.
     * 
     */
    private String version;

    private GetFeatureSpecClusterupgradeGkeUpgradeOverrideUpgrade() {}
    /**
     * @return The name of the feature you want to know the status of.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Version of the upgrade, e.g., &#34;1.22.1-gke.100&#34;. It should be a valid version. It must not exceet 99 characters.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFeatureSpecClusterupgradeGkeUpgradeOverrideUpgrade defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String version;
        public Builder() {}
        public Builder(GetFeatureSpecClusterupgradeGkeUpgradeOverrideUpgrade defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFeatureSpecClusterupgradeGkeUpgradeOverrideUpgrade", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetFeatureSpecClusterupgradeGkeUpgradeOverrideUpgrade", "version");
            }
            this.version = version;
            return this;
        }
        public GetFeatureSpecClusterupgradeGkeUpgradeOverrideUpgrade build() {
            final var _resultValue = new GetFeatureSpecClusterupgradeGkeUpgradeOverrideUpgrade();
            _resultValue.name = name;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
