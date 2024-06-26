// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs Empty = new ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs();

    /**
     * The resource types to run the detector on.
     * 
     */
    @Import(name="resourceTypes", required=true)
    private Output<List<String>> resourceTypes;

    /**
     * @return The resource types to run the detector on.
     * 
     */
    public Output<List<String>> resourceTypes() {
        return this.resourceTypes;
    }

    private ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs() {}

    private ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs(ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs $) {
        this.resourceTypes = $.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs $;

        public Builder() {
            $ = new ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs();
        }

        public Builder(ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs defaults) {
            $ = new ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceTypes The resource types to run the detector on.
         * 
         * @return builder
         * 
         */
        public Builder resourceTypes(Output<List<String>> resourceTypes) {
            $.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * @param resourceTypes The resource types to run the detector on.
         * 
         * @return builder
         * 
         */
        public Builder resourceTypes(List<String> resourceTypes) {
            return resourceTypes(Output.of(resourceTypes));
        }

        /**
         * @param resourceTypes The resource types to run the detector on.
         * 
         * @return builder
         * 
         */
        public Builder resourceTypes(String... resourceTypes) {
            return resourceTypes(List.of(resourceTypes));
        }

        public ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs build() {
            if ($.resourceTypes == null) {
                throw new MissingRequiredPropertyException("ManagementFolderSecurityHealthAnalyticsCustomModuleCustomConfigResourceSelectorArgs", "resourceTypes");
            }
            return $;
        }
    }

}
