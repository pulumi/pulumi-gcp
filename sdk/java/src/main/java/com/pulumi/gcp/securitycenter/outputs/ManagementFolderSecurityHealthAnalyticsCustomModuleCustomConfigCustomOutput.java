// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.securitycenter.outputs.ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputProperty;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutput {
    /**
     * @return A list of custom output properties to add to the finding.
     * Structure is documented below.
     * 
     */
    private @Nullable List<ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputProperty> properties;

    private ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutput() {}
    /**
     * @return A list of custom output properties to add to the finding.
     * Structure is documented below.
     * 
     */
    public List<ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputProperty> properties() {
        return this.properties == null ? List.of() : this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputProperty> properties;
        public Builder() {}
        public Builder(ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
        }

        @CustomType.Setter
        public Builder properties(@Nullable List<ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputProperty> properties) {

            this.properties = properties;
            return this;
        }
        public Builder properties(ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputProperty... properties) {
            return properties(List.of(properties));
        }
        public ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutput build() {
            final var _resultValue = new ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutput();
            _resultValue.properties = properties;
            return _resultValue;
        }
    }
}
