// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTableExternalDataConfigurationBigtableOptionColumnFamilyColumn {
    /**
     * @return The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. &#39;encoding&#39; can also be set at the column family level. However, the setting at this level takes precedence if &#39;encoding&#39; is set at both levels.
     * 
     */
    private String encoding;
    /**
     * @return If the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as the column field name and is used as field name in queries.
     * 
     */
    private String fieldName;
    /**
     * @return If this is set, only the latest version of value in this column are exposed. &#39;onlyReadLatest&#39; can also be set at the column family level. However, the setting at this level takes precedence if &#39;onlyReadLatest&#39; is set at both levels.
     * 
     */
    private Boolean onlyReadLatest;
    /**
     * @return Qualifier of the column. Columns in the parent column family that has this exact qualifier are exposed as . field. If the qualifier is valid UTF-8 string, it can be specified in the qualifierString field. Otherwise, a base-64 encoded value must be set to qualifierEncoded. The column field name is the same as the column qualifier. However, if the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as fieldName.
     * 
     */
    private String qualifierEncoded;
    /**
     * @return Qualifier string.
     * 
     */
    private String qualifierString;
    /**
     * @return The type to convert the value in cells of this column. The values are expected to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value. Following BigQuery types are allowed (case-sensitive): &#34;BYTES&#34;, &#34;STRING&#34;, &#34;INTEGER&#34;, &#34;FLOAT&#34;, &#34;BOOLEAN&#34;, &#34;JSON&#34;, Default type is &#34;BYTES&#34;. &#39;type&#39; can also be set at the column family level. However, the setting at this level takes precedence if &#39;type&#39; is set at both levels.
     * 
     */
    private String type;

    private GetTableExternalDataConfigurationBigtableOptionColumnFamilyColumn() {}
    /**
     * @return The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. &#39;encoding&#39; can also be set at the column family level. However, the setting at this level takes precedence if &#39;encoding&#39; is set at both levels.
     * 
     */
    public String encoding() {
        return this.encoding;
    }
    /**
     * @return If the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as the column field name and is used as field name in queries.
     * 
     */
    public String fieldName() {
        return this.fieldName;
    }
    /**
     * @return If this is set, only the latest version of value in this column are exposed. &#39;onlyReadLatest&#39; can also be set at the column family level. However, the setting at this level takes precedence if &#39;onlyReadLatest&#39; is set at both levels.
     * 
     */
    public Boolean onlyReadLatest() {
        return this.onlyReadLatest;
    }
    /**
     * @return Qualifier of the column. Columns in the parent column family that has this exact qualifier are exposed as . field. If the qualifier is valid UTF-8 string, it can be specified in the qualifierString field. Otherwise, a base-64 encoded value must be set to qualifierEncoded. The column field name is the same as the column qualifier. However, if the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as fieldName.
     * 
     */
    public String qualifierEncoded() {
        return this.qualifierEncoded;
    }
    /**
     * @return Qualifier string.
     * 
     */
    public String qualifierString() {
        return this.qualifierString;
    }
    /**
     * @return The type to convert the value in cells of this column. The values are expected to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value. Following BigQuery types are allowed (case-sensitive): &#34;BYTES&#34;, &#34;STRING&#34;, &#34;INTEGER&#34;, &#34;FLOAT&#34;, &#34;BOOLEAN&#34;, &#34;JSON&#34;, Default type is &#34;BYTES&#34;. &#39;type&#39; can also be set at the column family level. However, the setting at this level takes precedence if &#39;type&#39; is set at both levels.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableExternalDataConfigurationBigtableOptionColumnFamilyColumn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String encoding;
        private String fieldName;
        private Boolean onlyReadLatest;
        private String qualifierEncoded;
        private String qualifierString;
        private String type;
        public Builder() {}
        public Builder(GetTableExternalDataConfigurationBigtableOptionColumnFamilyColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.fieldName = defaults.fieldName;
    	      this.onlyReadLatest = defaults.onlyReadLatest;
    	      this.qualifierEncoded = defaults.qualifierEncoded;
    	      this.qualifierString = defaults.qualifierString;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder encoding(String encoding) {
            if (encoding == null) {
              throw new MissingRequiredPropertyException("GetTableExternalDataConfigurationBigtableOptionColumnFamilyColumn", "encoding");
            }
            this.encoding = encoding;
            return this;
        }
        @CustomType.Setter
        public Builder fieldName(String fieldName) {
            if (fieldName == null) {
              throw new MissingRequiredPropertyException("GetTableExternalDataConfigurationBigtableOptionColumnFamilyColumn", "fieldName");
            }
            this.fieldName = fieldName;
            return this;
        }
        @CustomType.Setter
        public Builder onlyReadLatest(Boolean onlyReadLatest) {
            if (onlyReadLatest == null) {
              throw new MissingRequiredPropertyException("GetTableExternalDataConfigurationBigtableOptionColumnFamilyColumn", "onlyReadLatest");
            }
            this.onlyReadLatest = onlyReadLatest;
            return this;
        }
        @CustomType.Setter
        public Builder qualifierEncoded(String qualifierEncoded) {
            if (qualifierEncoded == null) {
              throw new MissingRequiredPropertyException("GetTableExternalDataConfigurationBigtableOptionColumnFamilyColumn", "qualifierEncoded");
            }
            this.qualifierEncoded = qualifierEncoded;
            return this;
        }
        @CustomType.Setter
        public Builder qualifierString(String qualifierString) {
            if (qualifierString == null) {
              throw new MissingRequiredPropertyException("GetTableExternalDataConfigurationBigtableOptionColumnFamilyColumn", "qualifierString");
            }
            this.qualifierString = qualifierString;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetTableExternalDataConfigurationBigtableOptionColumnFamilyColumn", "type");
            }
            this.type = type;
            return this;
        }
        public GetTableExternalDataConfigurationBigtableOptionColumnFamilyColumn build() {
            final var _resultValue = new GetTableExternalDataConfigurationBigtableOptionColumnFamilyColumn();
            _resultValue.encoding = encoding;
            _resultValue.fieldName = fieldName;
            _resultValue.onlyReadLatest = onlyReadLatest;
            _resultValue.qualifierEncoded = qualifierEncoded;
            _resultValue.qualifierString = qualifierString;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
