// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.essentialcontacts.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class DocumentAiWarehouseDocumentSchemaPropertyDefinitionIntegerTypeOptions {
    private DocumentAiWarehouseDocumentSchemaPropertyDefinitionIntegerTypeOptions() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentAiWarehouseDocumentSchemaPropertyDefinitionIntegerTypeOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(DocumentAiWarehouseDocumentSchemaPropertyDefinitionIntegerTypeOptions defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public DocumentAiWarehouseDocumentSchemaPropertyDefinitionIntegerTypeOptions build() {
            final var _resultValue = new DocumentAiWarehouseDocumentSchemaPropertyDefinitionIntegerTypeOptions();
            return _resultValue;
        }
    }
}
