// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.essentialcontacts.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs Empty = new DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs();

    /**
     * List of possible enum values.
     * 
     */
    @Import(name="possibleValues", required=true)
    private Output<List<String>> possibleValues;

    /**
     * @return List of possible enum values.
     * 
     */
    public Output<List<String>> possibleValues() {
        return this.possibleValues;
    }

    /**
     * Make sure the enum property value provided in the document is in the possile value list during document creation. The validation check runs by default.
     * 
     * ***
     * 
     */
    @Import(name="validationCheckDisabled")
    private @Nullable Output<Boolean> validationCheckDisabled;

    /**
     * @return Make sure the enum property value provided in the document is in the possile value list during document creation. The validation check runs by default.
     * 
     * ***
     * 
     */
    public Optional<Output<Boolean>> validationCheckDisabled() {
        return Optional.ofNullable(this.validationCheckDisabled);
    }

    private DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs() {}

    private DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs(DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs $) {
        this.possibleValues = $.possibleValues;
        this.validationCheckDisabled = $.validationCheckDisabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs $;

        public Builder() {
            $ = new DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs();
        }

        public Builder(DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs defaults) {
            $ = new DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param possibleValues List of possible enum values.
         * 
         * @return builder
         * 
         */
        public Builder possibleValues(Output<List<String>> possibleValues) {
            $.possibleValues = possibleValues;
            return this;
        }

        /**
         * @param possibleValues List of possible enum values.
         * 
         * @return builder
         * 
         */
        public Builder possibleValues(List<String> possibleValues) {
            return possibleValues(Output.of(possibleValues));
        }

        /**
         * @param possibleValues List of possible enum values.
         * 
         * @return builder
         * 
         */
        public Builder possibleValues(String... possibleValues) {
            return possibleValues(List.of(possibleValues));
        }

        /**
         * @param validationCheckDisabled Make sure the enum property value provided in the document is in the possile value list during document creation. The validation check runs by default.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder validationCheckDisabled(@Nullable Output<Boolean> validationCheckDisabled) {
            $.validationCheckDisabled = validationCheckDisabled;
            return this;
        }

        /**
         * @param validationCheckDisabled Make sure the enum property value provided in the document is in the possile value list during document creation. The validation check runs by default.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder validationCheckDisabled(Boolean validationCheckDisabled) {
            return validationCheckDisabled(Output.of(validationCheckDisabled));
        }

        public DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs build() {
            $.possibleValues = Objects.requireNonNull($.possibleValues, "expected parameter 'possibleValues' to be non-null");
            return $;
        }
    }

}