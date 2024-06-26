// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.securitycenter.inputs.ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs Empty = new ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs();

    /**
     * A list of custom output properties to add to the finding.
     * Structure is documented below.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<List<ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs>> properties;

    /**
     * @return A list of custom output properties to add to the finding.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs() {}

    private ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs(ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs $) {
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs $;

        public Builder() {
            $ = new ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs();
        }

        public Builder(ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs defaults) {
            $ = new ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param properties A list of custom output properties to add to the finding.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<List<ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties A list of custom output properties to add to the finding.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder properties(List<ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param properties A list of custom output properties to add to the finding.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder properties(ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputPropertyArgs... properties) {
            return properties(List.of(properties));
        }

        public ManagementOrganizationSecurityHealthAnalyticsCustomModuleCustomConfigCustomOutputArgs build() {
            return $;
        }
    }

}
