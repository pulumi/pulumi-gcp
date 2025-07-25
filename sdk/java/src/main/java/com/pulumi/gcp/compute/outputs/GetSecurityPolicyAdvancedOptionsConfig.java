// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.outputs.GetSecurityPolicyAdvancedOptionsConfigJsonCustomConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSecurityPolicyAdvancedOptionsConfig {
    /**
     * @return Custom configuration to apply the JSON parsing. Only applicable when JSON parsing is set to STANDARD.
     * 
     */
    private List<GetSecurityPolicyAdvancedOptionsConfigJsonCustomConfig> jsonCustomConfigs;
    /**
     * @return JSON body parsing. Supported values include: &#34;DISABLED&#34;, &#34;STANDARD&#34;.
     * 
     */
    private String jsonParsing;
    /**
     * @return Logging level. Supported values include: &#34;NORMAL&#34;, &#34;VERBOSE&#34;.
     * 
     */
    private String logLevel;
    /**
     * @return The maximum request size chosen by the customer with Waf enabled. Values supported are &#34;8KB&#34;, &#34;16KB, &#34;32KB&#34;, &#34;48KB&#34; and &#34;64KB&#34;. Values are case insensitive.
     * 
     */
    private String requestBodyInspectionSize;
    /**
     * @return An optional list of case-insensitive request header names to use for resolving the callers client IP address.
     * 
     */
    private List<String> userIpRequestHeaders;

    private GetSecurityPolicyAdvancedOptionsConfig() {}
    /**
     * @return Custom configuration to apply the JSON parsing. Only applicable when JSON parsing is set to STANDARD.
     * 
     */
    public List<GetSecurityPolicyAdvancedOptionsConfigJsonCustomConfig> jsonCustomConfigs() {
        return this.jsonCustomConfigs;
    }
    /**
     * @return JSON body parsing. Supported values include: &#34;DISABLED&#34;, &#34;STANDARD&#34;.
     * 
     */
    public String jsonParsing() {
        return this.jsonParsing;
    }
    /**
     * @return Logging level. Supported values include: &#34;NORMAL&#34;, &#34;VERBOSE&#34;.
     * 
     */
    public String logLevel() {
        return this.logLevel;
    }
    /**
     * @return The maximum request size chosen by the customer with Waf enabled. Values supported are &#34;8KB&#34;, &#34;16KB, &#34;32KB&#34;, &#34;48KB&#34; and &#34;64KB&#34;. Values are case insensitive.
     * 
     */
    public String requestBodyInspectionSize() {
        return this.requestBodyInspectionSize;
    }
    /**
     * @return An optional list of case-insensitive request header names to use for resolving the callers client IP address.
     * 
     */
    public List<String> userIpRequestHeaders() {
        return this.userIpRequestHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityPolicyAdvancedOptionsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetSecurityPolicyAdvancedOptionsConfigJsonCustomConfig> jsonCustomConfigs;
        private String jsonParsing;
        private String logLevel;
        private String requestBodyInspectionSize;
        private List<String> userIpRequestHeaders;
        public Builder() {}
        public Builder(GetSecurityPolicyAdvancedOptionsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonCustomConfigs = defaults.jsonCustomConfigs;
    	      this.jsonParsing = defaults.jsonParsing;
    	      this.logLevel = defaults.logLevel;
    	      this.requestBodyInspectionSize = defaults.requestBodyInspectionSize;
    	      this.userIpRequestHeaders = defaults.userIpRequestHeaders;
        }

        @CustomType.Setter
        public Builder jsonCustomConfigs(List<GetSecurityPolicyAdvancedOptionsConfigJsonCustomConfig> jsonCustomConfigs) {
            if (jsonCustomConfigs == null) {
              throw new MissingRequiredPropertyException("GetSecurityPolicyAdvancedOptionsConfig", "jsonCustomConfigs");
            }
            this.jsonCustomConfigs = jsonCustomConfigs;
            return this;
        }
        public Builder jsonCustomConfigs(GetSecurityPolicyAdvancedOptionsConfigJsonCustomConfig... jsonCustomConfigs) {
            return jsonCustomConfigs(List.of(jsonCustomConfigs));
        }
        @CustomType.Setter
        public Builder jsonParsing(String jsonParsing) {
            if (jsonParsing == null) {
              throw new MissingRequiredPropertyException("GetSecurityPolicyAdvancedOptionsConfig", "jsonParsing");
            }
            this.jsonParsing = jsonParsing;
            return this;
        }
        @CustomType.Setter
        public Builder logLevel(String logLevel) {
            if (logLevel == null) {
              throw new MissingRequiredPropertyException("GetSecurityPolicyAdvancedOptionsConfig", "logLevel");
            }
            this.logLevel = logLevel;
            return this;
        }
        @CustomType.Setter
        public Builder requestBodyInspectionSize(String requestBodyInspectionSize) {
            if (requestBodyInspectionSize == null) {
              throw new MissingRequiredPropertyException("GetSecurityPolicyAdvancedOptionsConfig", "requestBodyInspectionSize");
            }
            this.requestBodyInspectionSize = requestBodyInspectionSize;
            return this;
        }
        @CustomType.Setter
        public Builder userIpRequestHeaders(List<String> userIpRequestHeaders) {
            if (userIpRequestHeaders == null) {
              throw new MissingRequiredPropertyException("GetSecurityPolicyAdvancedOptionsConfig", "userIpRequestHeaders");
            }
            this.userIpRequestHeaders = userIpRequestHeaders;
            return this;
        }
        public Builder userIpRequestHeaders(String... userIpRequestHeaders) {
            return userIpRequestHeaders(List.of(userIpRequestHeaders));
        }
        public GetSecurityPolicyAdvancedOptionsConfig build() {
            final var _resultValue = new GetSecurityPolicyAdvancedOptionsConfig();
            _resultValue.jsonCustomConfigs = jsonCustomConfigs;
            _resultValue.jsonParsing = jsonParsing;
            _resultValue.logLevel = logLevel;
            _resultValue.requestBodyInspectionSize = requestBodyInspectionSize;
            _resultValue.userIpRequestHeaders = userIpRequestHeaders;
            return _resultValue;
        }
    }
}
