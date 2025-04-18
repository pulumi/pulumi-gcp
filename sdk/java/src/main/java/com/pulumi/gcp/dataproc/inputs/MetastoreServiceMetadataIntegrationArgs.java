// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.dataproc.inputs.MetastoreServiceMetadataIntegrationDataCatalogConfigArgs;
import java.util.Objects;


public final class MetastoreServiceMetadataIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetastoreServiceMetadataIntegrationArgs Empty = new MetastoreServiceMetadataIntegrationArgs();

    /**
     * The integration config for the Data Catalog service.
     * Structure is documented below.
     * 
     */
    @Import(name="dataCatalogConfig", required=true)
    private Output<MetastoreServiceMetadataIntegrationDataCatalogConfigArgs> dataCatalogConfig;

    /**
     * @return The integration config for the Data Catalog service.
     * Structure is documented below.
     * 
     */
    public Output<MetastoreServiceMetadataIntegrationDataCatalogConfigArgs> dataCatalogConfig() {
        return this.dataCatalogConfig;
    }

    private MetastoreServiceMetadataIntegrationArgs() {}

    private MetastoreServiceMetadataIntegrationArgs(MetastoreServiceMetadataIntegrationArgs $) {
        this.dataCatalogConfig = $.dataCatalogConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetastoreServiceMetadataIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetastoreServiceMetadataIntegrationArgs $;

        public Builder() {
            $ = new MetastoreServiceMetadataIntegrationArgs();
        }

        public Builder(MetastoreServiceMetadataIntegrationArgs defaults) {
            $ = new MetastoreServiceMetadataIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataCatalogConfig The integration config for the Data Catalog service.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataCatalogConfig(Output<MetastoreServiceMetadataIntegrationDataCatalogConfigArgs> dataCatalogConfig) {
            $.dataCatalogConfig = dataCatalogConfig;
            return this;
        }

        /**
         * @param dataCatalogConfig The integration config for the Data Catalog service.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataCatalogConfig(MetastoreServiceMetadataIntegrationDataCatalogConfigArgs dataCatalogConfig) {
            return dataCatalogConfig(Output.of(dataCatalogConfig));
        }

        public MetastoreServiceMetadataIntegrationArgs build() {
            if ($.dataCatalogConfig == null) {
                throw new MissingRequiredPropertyException("MetastoreServiceMetadataIntegrationArgs", "dataCatalogConfig");
            }
            return $;
        }
    }

}
