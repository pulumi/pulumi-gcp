// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.bigquery.outputs.GetTableExternalDataConfigurationBigtableOptionColumnFamily;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTableExternalDataConfigurationBigtableOption {
    /**
     * @return A list of column families to expose in the table schema along with their types. This list restricts the column families that can be referenced in queries and specifies their value types. You can use this list to do type conversions - see the &#39;type&#39; field for more details. If you leave this list empty, all column families are present in the table schema and their values are read as BYTES. During a query only the column families referenced in that query are read from Bigtable.
     * 
     */
    private List<GetTableExternalDataConfigurationBigtableOptionColumnFamily> columnFamilies;
    /**
     * @return If field is true, then the column families that are not specified in columnFamilies list are not exposed in the table schema. Otherwise, they are read with BYTES type values. The default value is false.
     * 
     */
    private Boolean ignoreUnspecifiedColumnFamilies;
    /**
     * @return If field is true, then each column family will be read as a single JSON column. Otherwise they are read as a repeated cell structure containing timestamp/value tuples. The default value is false.
     * 
     */
    private Boolean outputColumnFamiliesAsJson;
    /**
     * @return If field is true, then the rowkey column families will be read and converted to string. Otherwise they are read with BYTES type values and users need to manually cast them with CAST if necessary. The default value is false.
     * 
     */
    private Boolean readRowkeyAsString;

    private GetTableExternalDataConfigurationBigtableOption() {}
    /**
     * @return A list of column families to expose in the table schema along with their types. This list restricts the column families that can be referenced in queries and specifies their value types. You can use this list to do type conversions - see the &#39;type&#39; field for more details. If you leave this list empty, all column families are present in the table schema and their values are read as BYTES. During a query only the column families referenced in that query are read from Bigtable.
     * 
     */
    public List<GetTableExternalDataConfigurationBigtableOptionColumnFamily> columnFamilies() {
        return this.columnFamilies;
    }
    /**
     * @return If field is true, then the column families that are not specified in columnFamilies list are not exposed in the table schema. Otherwise, they are read with BYTES type values. The default value is false.
     * 
     */
    public Boolean ignoreUnspecifiedColumnFamilies() {
        return this.ignoreUnspecifiedColumnFamilies;
    }
    /**
     * @return If field is true, then each column family will be read as a single JSON column. Otherwise they are read as a repeated cell structure containing timestamp/value tuples. The default value is false.
     * 
     */
    public Boolean outputColumnFamiliesAsJson() {
        return this.outputColumnFamiliesAsJson;
    }
    /**
     * @return If field is true, then the rowkey column families will be read and converted to string. Otherwise they are read with BYTES type values and users need to manually cast them with CAST if necessary. The default value is false.
     * 
     */
    public Boolean readRowkeyAsString() {
        return this.readRowkeyAsString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableExternalDataConfigurationBigtableOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTableExternalDataConfigurationBigtableOptionColumnFamily> columnFamilies;
        private Boolean ignoreUnspecifiedColumnFamilies;
        private Boolean outputColumnFamiliesAsJson;
        private Boolean readRowkeyAsString;
        public Builder() {}
        public Builder(GetTableExternalDataConfigurationBigtableOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnFamilies = defaults.columnFamilies;
    	      this.ignoreUnspecifiedColumnFamilies = defaults.ignoreUnspecifiedColumnFamilies;
    	      this.outputColumnFamiliesAsJson = defaults.outputColumnFamiliesAsJson;
    	      this.readRowkeyAsString = defaults.readRowkeyAsString;
        }

        @CustomType.Setter
        public Builder columnFamilies(List<GetTableExternalDataConfigurationBigtableOptionColumnFamily> columnFamilies) {
            if (columnFamilies == null) {
              throw new MissingRequiredPropertyException("GetTableExternalDataConfigurationBigtableOption", "columnFamilies");
            }
            this.columnFamilies = columnFamilies;
            return this;
        }
        public Builder columnFamilies(GetTableExternalDataConfigurationBigtableOptionColumnFamily... columnFamilies) {
            return columnFamilies(List.of(columnFamilies));
        }
        @CustomType.Setter
        public Builder ignoreUnspecifiedColumnFamilies(Boolean ignoreUnspecifiedColumnFamilies) {
            if (ignoreUnspecifiedColumnFamilies == null) {
              throw new MissingRequiredPropertyException("GetTableExternalDataConfigurationBigtableOption", "ignoreUnspecifiedColumnFamilies");
            }
            this.ignoreUnspecifiedColumnFamilies = ignoreUnspecifiedColumnFamilies;
            return this;
        }
        @CustomType.Setter
        public Builder outputColumnFamiliesAsJson(Boolean outputColumnFamiliesAsJson) {
            if (outputColumnFamiliesAsJson == null) {
              throw new MissingRequiredPropertyException("GetTableExternalDataConfigurationBigtableOption", "outputColumnFamiliesAsJson");
            }
            this.outputColumnFamiliesAsJson = outputColumnFamiliesAsJson;
            return this;
        }
        @CustomType.Setter
        public Builder readRowkeyAsString(Boolean readRowkeyAsString) {
            if (readRowkeyAsString == null) {
              throw new MissingRequiredPropertyException("GetTableExternalDataConfigurationBigtableOption", "readRowkeyAsString");
            }
            this.readRowkeyAsString = readRowkeyAsString;
            return this;
        }
        public GetTableExternalDataConfigurationBigtableOption build() {
            final var _resultValue = new GetTableExternalDataConfigurationBigtableOption();
            _resultValue.columnFamilies = columnFamilies;
            _resultValue.ignoreUnspecifiedColumnFamilies = ignoreUnspecifiedColumnFamilies;
            _resultValue.outputColumnFamiliesAsJson = outputColumnFamiliesAsJson;
            _resultValue.readRowkeyAsString = readRowkeyAsString;
            return _resultValue;
        }
    }
}
