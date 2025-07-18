// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.discoveryengine.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.discoveryengine.outputs.DataStoreDocumentProcessingConfigDefaultParsingConfigDigitalParsingConfig;
import com.pulumi.gcp.discoveryengine.outputs.DataStoreDocumentProcessingConfigDefaultParsingConfigLayoutParsingConfig;
import com.pulumi.gcp.discoveryengine.outputs.DataStoreDocumentProcessingConfigDefaultParsingConfigOcrParsingConfig;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataStoreDocumentProcessingConfigDefaultParsingConfig {
    /**
     * @return Configurations applied to digital parser.
     * 
     */
    private @Nullable DataStoreDocumentProcessingConfigDefaultParsingConfigDigitalParsingConfig digitalParsingConfig;
    /**
     * @return Configurations applied to layout parser.
     * Structure is documented below.
     * 
     */
    private @Nullable DataStoreDocumentProcessingConfigDefaultParsingConfigLayoutParsingConfig layoutParsingConfig;
    /**
     * @return Configurations applied to OCR parser. Currently it only applies to PDFs.
     * Structure is documented below.
     * 
     */
    private @Nullable DataStoreDocumentProcessingConfigDefaultParsingConfigOcrParsingConfig ocrParsingConfig;

    private DataStoreDocumentProcessingConfigDefaultParsingConfig() {}
    /**
     * @return Configurations applied to digital parser.
     * 
     */
    public Optional<DataStoreDocumentProcessingConfigDefaultParsingConfigDigitalParsingConfig> digitalParsingConfig() {
        return Optional.ofNullable(this.digitalParsingConfig);
    }
    /**
     * @return Configurations applied to layout parser.
     * Structure is documented below.
     * 
     */
    public Optional<DataStoreDocumentProcessingConfigDefaultParsingConfigLayoutParsingConfig> layoutParsingConfig() {
        return Optional.ofNullable(this.layoutParsingConfig);
    }
    /**
     * @return Configurations applied to OCR parser. Currently it only applies to PDFs.
     * Structure is documented below.
     * 
     */
    public Optional<DataStoreDocumentProcessingConfigDefaultParsingConfigOcrParsingConfig> ocrParsingConfig() {
        return Optional.ofNullable(this.ocrParsingConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataStoreDocumentProcessingConfigDefaultParsingConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DataStoreDocumentProcessingConfigDefaultParsingConfigDigitalParsingConfig digitalParsingConfig;
        private @Nullable DataStoreDocumentProcessingConfigDefaultParsingConfigLayoutParsingConfig layoutParsingConfig;
        private @Nullable DataStoreDocumentProcessingConfigDefaultParsingConfigOcrParsingConfig ocrParsingConfig;
        public Builder() {}
        public Builder(DataStoreDocumentProcessingConfigDefaultParsingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digitalParsingConfig = defaults.digitalParsingConfig;
    	      this.layoutParsingConfig = defaults.layoutParsingConfig;
    	      this.ocrParsingConfig = defaults.ocrParsingConfig;
        }

        @CustomType.Setter
        public Builder digitalParsingConfig(@Nullable DataStoreDocumentProcessingConfigDefaultParsingConfigDigitalParsingConfig digitalParsingConfig) {

            this.digitalParsingConfig = digitalParsingConfig;
            return this;
        }
        @CustomType.Setter
        public Builder layoutParsingConfig(@Nullable DataStoreDocumentProcessingConfigDefaultParsingConfigLayoutParsingConfig layoutParsingConfig) {

            this.layoutParsingConfig = layoutParsingConfig;
            return this;
        }
        @CustomType.Setter
        public Builder ocrParsingConfig(@Nullable DataStoreDocumentProcessingConfigDefaultParsingConfigOcrParsingConfig ocrParsingConfig) {

            this.ocrParsingConfig = ocrParsingConfig;
            return this;
        }
        public DataStoreDocumentProcessingConfigDefaultParsingConfig build() {
            final var _resultValue = new DataStoreDocumentProcessingConfigDefaultParsingConfig();
            _resultValue.digitalParsingConfig = digitalParsingConfig;
            _resultValue.layoutParsingConfig = layoutParsingConfig;
            _resultValue.ocrParsingConfig = ocrParsingConfig;
            return _resultValue;
        }
    }
}
