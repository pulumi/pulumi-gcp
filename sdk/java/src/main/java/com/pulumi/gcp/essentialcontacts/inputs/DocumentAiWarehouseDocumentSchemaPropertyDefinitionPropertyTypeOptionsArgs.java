// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.essentialcontacts.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs;
import java.util.List;
import java.util.Objects;


public final class DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs Empty = new DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs();

    /**
     * Defines the metadata for a schema property.
     * Structure is documented below.
     * 
     */
    @Import(name="propertyDefinitions", required=true)
    private Output<List<DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs>> propertyDefinitions;

    /**
     * @return Defines the metadata for a schema property.
     * Structure is documented below.
     * 
     */
    public Output<List<DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs>> propertyDefinitions() {
        return this.propertyDefinitions;
    }

    private DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs() {}

    private DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs(DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs $) {
        this.propertyDefinitions = $.propertyDefinitions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs $;

        public Builder() {
            $ = new DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs();
        }

        public Builder(DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs defaults) {
            $ = new DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param propertyDefinitions Defines the metadata for a schema property.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder propertyDefinitions(Output<List<DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs>> propertyDefinitions) {
            $.propertyDefinitions = propertyDefinitions;
            return this;
        }

        /**
         * @param propertyDefinitions Defines the metadata for a schema property.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder propertyDefinitions(List<DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs> propertyDefinitions) {
            return propertyDefinitions(Output.of(propertyDefinitions));
        }

        /**
         * @param propertyDefinitions Defines the metadata for a schema property.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder propertyDefinitions(DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs... propertyDefinitions) {
            return propertyDefinitions(List.of(propertyDefinitions));
        }

        public DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs build() {
            $.propertyDefinitions = Objects.requireNonNull($.propertyDefinitions, "expected parameter 'propertyDefinitions' to be non-null");
            return $;
        }
    }

}