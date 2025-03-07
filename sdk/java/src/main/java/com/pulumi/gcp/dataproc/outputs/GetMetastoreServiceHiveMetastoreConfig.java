// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.dataproc.outputs.GetMetastoreServiceHiveMetastoreConfigAuxiliaryVersion;
import com.pulumi.gcp.dataproc.outputs.GetMetastoreServiceHiveMetastoreConfigKerberosConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetMetastoreServiceHiveMetastoreConfig {
    /**
     * @return A mapping of Hive metastore version to the auxiliary version configuration.
     * When specified, a secondary Hive metastore service is created along with the primary service.
     * All auxiliary versions must be less than the service&#39;s primary version.
     * The key is the auxiliary service name and it must match the regular expression a-z?.
     * This means that the first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
     * 
     */
    private List<GetMetastoreServiceHiveMetastoreConfigAuxiliaryVersion> auxiliaryVersions;
    /**
     * @return A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore (configured in hive-site.xml).
     * The mappings override system defaults (some keys cannot be overridden)
     * 
     */
    private Map<String,String> configOverrides;
    /**
     * @return The protocol to use for the metastore service endpoint. If unspecified, defaults to &#39;THRIFT&#39;. Default value: &#34;THRIFT&#34; Possible values: [&#34;THRIFT&#34;, &#34;GRPC&#34;]
     * 
     */
    private String endpointProtocol;
    /**
     * @return Information used to configure the Hive metastore service as a service principal in a Kerberos realm.
     * 
     */
    private List<GetMetastoreServiceHiveMetastoreConfigKerberosConfig> kerberosConfigs;
    /**
     * @return The Hive metastore schema version.
     * 
     */
    private String version;

    private GetMetastoreServiceHiveMetastoreConfig() {}
    /**
     * @return A mapping of Hive metastore version to the auxiliary version configuration.
     * When specified, a secondary Hive metastore service is created along with the primary service.
     * All auxiliary versions must be less than the service&#39;s primary version.
     * The key is the auxiliary service name and it must match the regular expression a-z?.
     * This means that the first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
     * 
     */
    public List<GetMetastoreServiceHiveMetastoreConfigAuxiliaryVersion> auxiliaryVersions() {
        return this.auxiliaryVersions;
    }
    /**
     * @return A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore (configured in hive-site.xml).
     * The mappings override system defaults (some keys cannot be overridden)
     * 
     */
    public Map<String,String> configOverrides() {
        return this.configOverrides;
    }
    /**
     * @return The protocol to use for the metastore service endpoint. If unspecified, defaults to &#39;THRIFT&#39;. Default value: &#34;THRIFT&#34; Possible values: [&#34;THRIFT&#34;, &#34;GRPC&#34;]
     * 
     */
    public String endpointProtocol() {
        return this.endpointProtocol;
    }
    /**
     * @return Information used to configure the Hive metastore service as a service principal in a Kerberos realm.
     * 
     */
    public List<GetMetastoreServiceHiveMetastoreConfigKerberosConfig> kerberosConfigs() {
        return this.kerberosConfigs;
    }
    /**
     * @return The Hive metastore schema version.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetastoreServiceHiveMetastoreConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetMetastoreServiceHiveMetastoreConfigAuxiliaryVersion> auxiliaryVersions;
        private Map<String,String> configOverrides;
        private String endpointProtocol;
        private List<GetMetastoreServiceHiveMetastoreConfigKerberosConfig> kerberosConfigs;
        private String version;
        public Builder() {}
        public Builder(GetMetastoreServiceHiveMetastoreConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auxiliaryVersions = defaults.auxiliaryVersions;
    	      this.configOverrides = defaults.configOverrides;
    	      this.endpointProtocol = defaults.endpointProtocol;
    	      this.kerberosConfigs = defaults.kerberosConfigs;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder auxiliaryVersions(List<GetMetastoreServiceHiveMetastoreConfigAuxiliaryVersion> auxiliaryVersions) {
            if (auxiliaryVersions == null) {
              throw new MissingRequiredPropertyException("GetMetastoreServiceHiveMetastoreConfig", "auxiliaryVersions");
            }
            this.auxiliaryVersions = auxiliaryVersions;
            return this;
        }
        public Builder auxiliaryVersions(GetMetastoreServiceHiveMetastoreConfigAuxiliaryVersion... auxiliaryVersions) {
            return auxiliaryVersions(List.of(auxiliaryVersions));
        }
        @CustomType.Setter
        public Builder configOverrides(Map<String,String> configOverrides) {
            if (configOverrides == null) {
              throw new MissingRequiredPropertyException("GetMetastoreServiceHiveMetastoreConfig", "configOverrides");
            }
            this.configOverrides = configOverrides;
            return this;
        }
        @CustomType.Setter
        public Builder endpointProtocol(String endpointProtocol) {
            if (endpointProtocol == null) {
              throw new MissingRequiredPropertyException("GetMetastoreServiceHiveMetastoreConfig", "endpointProtocol");
            }
            this.endpointProtocol = endpointProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder kerberosConfigs(List<GetMetastoreServiceHiveMetastoreConfigKerberosConfig> kerberosConfigs) {
            if (kerberosConfigs == null) {
              throw new MissingRequiredPropertyException("GetMetastoreServiceHiveMetastoreConfig", "kerberosConfigs");
            }
            this.kerberosConfigs = kerberosConfigs;
            return this;
        }
        public Builder kerberosConfigs(GetMetastoreServiceHiveMetastoreConfigKerberosConfig... kerberosConfigs) {
            return kerberosConfigs(List.of(kerberosConfigs));
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetMetastoreServiceHiveMetastoreConfig", "version");
            }
            this.version = version;
            return this;
        }
        public GetMetastoreServiceHiveMetastoreConfig build() {
            final var _resultValue = new GetMetastoreServiceHiveMetastoreConfig();
            _resultValue.auxiliaryVersions = auxiliaryVersions;
            _resultValue.configOverrides = configOverrides;
            _resultValue.endpointProtocol = endpointProtocol;
            _resultValue.kerberosConfigs = kerberosConfigs;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
