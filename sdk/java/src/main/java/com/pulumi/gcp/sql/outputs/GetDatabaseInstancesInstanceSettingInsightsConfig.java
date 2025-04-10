// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetDatabaseInstancesInstanceSettingInsightsConfig {
    /**
     * @return True if Query Insights feature is enabled.
     * 
     */
    private Boolean queryInsightsEnabled;
    /**
     * @return Number of query execution plans captured by Insights per minute for all queries combined. Between 0 and 20. Default to 5. For Enterprise Plus instances, from 0 to 200.
     * 
     */
    private Integer queryPlansPerMinute;
    /**
     * @return Maximum query length stored in bytes. Between 256 and 4500. Default to 1024. For Enterprise Plus instances, from 1 to 1048576.
     * 
     */
    private Integer queryStringLength;
    /**
     * @return True if Query Insights will record application tags from query when enabled.
     * 
     */
    private Boolean recordApplicationTags;
    /**
     * @return True if Query Insights will record client address when enabled.
     * 
     */
    private Boolean recordClientAddress;

    private GetDatabaseInstancesInstanceSettingInsightsConfig() {}
    /**
     * @return True if Query Insights feature is enabled.
     * 
     */
    public Boolean queryInsightsEnabled() {
        return this.queryInsightsEnabled;
    }
    /**
     * @return Number of query execution plans captured by Insights per minute for all queries combined. Between 0 and 20. Default to 5. For Enterprise Plus instances, from 0 to 200.
     * 
     */
    public Integer queryPlansPerMinute() {
        return this.queryPlansPerMinute;
    }
    /**
     * @return Maximum query length stored in bytes. Between 256 and 4500. Default to 1024. For Enterprise Plus instances, from 1 to 1048576.
     * 
     */
    public Integer queryStringLength() {
        return this.queryStringLength;
    }
    /**
     * @return True if Query Insights will record application tags from query when enabled.
     * 
     */
    public Boolean recordApplicationTags() {
        return this.recordApplicationTags;
    }
    /**
     * @return True if Query Insights will record client address when enabled.
     * 
     */
    public Boolean recordClientAddress() {
        return this.recordClientAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstancesInstanceSettingInsightsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean queryInsightsEnabled;
        private Integer queryPlansPerMinute;
        private Integer queryStringLength;
        private Boolean recordApplicationTags;
        private Boolean recordClientAddress;
        public Builder() {}
        public Builder(GetDatabaseInstancesInstanceSettingInsightsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryInsightsEnabled = defaults.queryInsightsEnabled;
    	      this.queryPlansPerMinute = defaults.queryPlansPerMinute;
    	      this.queryStringLength = defaults.queryStringLength;
    	      this.recordApplicationTags = defaults.recordApplicationTags;
    	      this.recordClientAddress = defaults.recordClientAddress;
        }

        @CustomType.Setter
        public Builder queryInsightsEnabled(Boolean queryInsightsEnabled) {
            if (queryInsightsEnabled == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstanceSettingInsightsConfig", "queryInsightsEnabled");
            }
            this.queryInsightsEnabled = queryInsightsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder queryPlansPerMinute(Integer queryPlansPerMinute) {
            if (queryPlansPerMinute == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstanceSettingInsightsConfig", "queryPlansPerMinute");
            }
            this.queryPlansPerMinute = queryPlansPerMinute;
            return this;
        }
        @CustomType.Setter
        public Builder queryStringLength(Integer queryStringLength) {
            if (queryStringLength == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstanceSettingInsightsConfig", "queryStringLength");
            }
            this.queryStringLength = queryStringLength;
            return this;
        }
        @CustomType.Setter
        public Builder recordApplicationTags(Boolean recordApplicationTags) {
            if (recordApplicationTags == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstanceSettingInsightsConfig", "recordApplicationTags");
            }
            this.recordApplicationTags = recordApplicationTags;
            return this;
        }
        @CustomType.Setter
        public Builder recordClientAddress(Boolean recordClientAddress) {
            if (recordClientAddress == null) {
              throw new MissingRequiredPropertyException("GetDatabaseInstancesInstanceSettingInsightsConfig", "recordClientAddress");
            }
            this.recordClientAddress = recordClientAddress;
            return this;
        }
        public GetDatabaseInstancesInstanceSettingInsightsConfig build() {
            final var _resultValue = new GetDatabaseInstancesInstanceSettingInsightsConfig();
            _resultValue.queryInsightsEnabled = queryInsightsEnabled;
            _resultValue.queryPlansPerMinute = queryPlansPerMinute;
            _resultValue.queryStringLength = queryStringLength;
            _resultValue.recordApplicationTags = recordApplicationTags;
            _resultValue.recordClientAddress = recordClientAddress;
            return _resultValue;
        }
    }
}
