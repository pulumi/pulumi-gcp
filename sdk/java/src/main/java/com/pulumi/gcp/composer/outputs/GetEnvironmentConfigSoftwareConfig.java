// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigSoftwareConfigCloudDataLineageIntegration;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetEnvironmentConfigSoftwareConfig {
    /**
     * @return Apache Airflow configuration properties to override. Property keys contain the section and property names, separated by a hyphen, for example &#34;core-dags_are_paused_at_creation&#34;. Section names must not contain hyphens (&#34;-&#34;), opening square brackets (&#34;[&#34;), or closing square brackets (&#34;]&#34;). The property name must not be empty and cannot contain &#34;=&#34; or &#34;;&#34;. Section and property names cannot contain characters: &#34;.&#34; Apache Airflow configuration property names must be written in snake_case. Property values can contain any character, and can be written in any lower/upper case format. Certain Apache Airflow configuration property values are blacklisted, and cannot be overridden.
     * 
     */
    private Map<String,String> airflowConfigOverrides;
    /**
     * @return The configuration for Cloud Data Lineage integration. Supported for Cloud Composer environments in versions composer-2.1.2-airflow-*.*.* and newer
     * 
     */
    private List<GetEnvironmentConfigSoftwareConfigCloudDataLineageIntegration> cloudDataLineageIntegrations;
    /**
     * @return Additional environment variables to provide to the Apache Airflow scheduler, worker, and webserver processes. Environment variable names must match the regular expression [a-zA-Z_][a-zA-Z0-9_]*. They cannot specify Apache Airflow software configuration overrides (they cannot match the regular expression AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+), and they cannot match any of the following reserved names: AIRFLOW_HOME C_FORCE_ROOT CONTAINER_NAME DAGS_FOLDER GCP_PROJECT GCS_BUCKET GKE_CLUSTER_NAME SQL_DATABASE SQL_INSTANCE SQL_PASSWORD SQL_PROJECT SQL_REGION SQL_USER.
     * 
     */
    private Map<String,String> envVariables;
    /**
     * @return The version of the software running in the environment. This encapsulates both the version of Cloud Composer functionality and the version of Apache Airflow. It must match the regular expression composer-([0-9]+(\.[0-9]+\.[0-9]+(-preview\.[0-9]+)?)?|latest)-airflow-([0-9]+(\.[0-9]+(\.[0-9]+)?)?). The Cloud Composer portion of the image version is a full semantic version, or an alias in the form of major version number or &#39;latest&#39;. The Apache Airflow portion of the image version is a full semantic version that points to one of the supported Apache Airflow versions, or an alias in the form of only major or major.minor versions specified. See documentation for more details and version list.
     * 
     */
    private String imageVersion;
    /**
     * @return Custom Python Package Index (PyPI) packages to be installed in the environment. Keys refer to the lowercase package name (e.g. &#34;numpy&#34;). Values are the lowercase extras and version specifier (e.g. &#34;==1.12.0&#34;, &#34;[devel,gcp_api]&#34;, &#34;[devel]&gt;=1.8.2, &lt;1.9.2&#34;). To specify a package without pinning it to a version specifier, use the empty string as the value.
     * 
     */
    private Map<String,String> pypiPackages;
    /**
     * @return The major version of Python used to run the Apache Airflow scheduler, worker, and webserver processes. Can be set to &#39;2&#39; or &#39;3&#39;. If not specified, the default is &#39;2&#39;. Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. Environments in newer versions always use Python major version 3.
     * 
     */
    private String pythonVersion;
    /**
     * @return The number of schedulers for Airflow. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-2.*.*.
     * 
     */
    private Integer schedulerCount;
    /**
     * @return Should be either &#39;ENABLED&#39; or &#39;DISABLED&#39;. Defaults to &#39;ENABLED&#39;. Used in Composer 3.
     * 
     */
    private String webServerPluginsMode;

    private GetEnvironmentConfigSoftwareConfig() {}
    /**
     * @return Apache Airflow configuration properties to override. Property keys contain the section and property names, separated by a hyphen, for example &#34;core-dags_are_paused_at_creation&#34;. Section names must not contain hyphens (&#34;-&#34;), opening square brackets (&#34;[&#34;), or closing square brackets (&#34;]&#34;). The property name must not be empty and cannot contain &#34;=&#34; or &#34;;&#34;. Section and property names cannot contain characters: &#34;.&#34; Apache Airflow configuration property names must be written in snake_case. Property values can contain any character, and can be written in any lower/upper case format. Certain Apache Airflow configuration property values are blacklisted, and cannot be overridden.
     * 
     */
    public Map<String,String> airflowConfigOverrides() {
        return this.airflowConfigOverrides;
    }
    /**
     * @return The configuration for Cloud Data Lineage integration. Supported for Cloud Composer environments in versions composer-2.1.2-airflow-*.*.* and newer
     * 
     */
    public List<GetEnvironmentConfigSoftwareConfigCloudDataLineageIntegration> cloudDataLineageIntegrations() {
        return this.cloudDataLineageIntegrations;
    }
    /**
     * @return Additional environment variables to provide to the Apache Airflow scheduler, worker, and webserver processes. Environment variable names must match the regular expression [a-zA-Z_][a-zA-Z0-9_]*. They cannot specify Apache Airflow software configuration overrides (they cannot match the regular expression AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+), and they cannot match any of the following reserved names: AIRFLOW_HOME C_FORCE_ROOT CONTAINER_NAME DAGS_FOLDER GCP_PROJECT GCS_BUCKET GKE_CLUSTER_NAME SQL_DATABASE SQL_INSTANCE SQL_PASSWORD SQL_PROJECT SQL_REGION SQL_USER.
     * 
     */
    public Map<String,String> envVariables() {
        return this.envVariables;
    }
    /**
     * @return The version of the software running in the environment. This encapsulates both the version of Cloud Composer functionality and the version of Apache Airflow. It must match the regular expression composer-([0-9]+(\.[0-9]+\.[0-9]+(-preview\.[0-9]+)?)?|latest)-airflow-([0-9]+(\.[0-9]+(\.[0-9]+)?)?). The Cloud Composer portion of the image version is a full semantic version, or an alias in the form of major version number or &#39;latest&#39;. The Apache Airflow portion of the image version is a full semantic version that points to one of the supported Apache Airflow versions, or an alias in the form of only major or major.minor versions specified. See documentation for more details and version list.
     * 
     */
    public String imageVersion() {
        return this.imageVersion;
    }
    /**
     * @return Custom Python Package Index (PyPI) packages to be installed in the environment. Keys refer to the lowercase package name (e.g. &#34;numpy&#34;). Values are the lowercase extras and version specifier (e.g. &#34;==1.12.0&#34;, &#34;[devel,gcp_api]&#34;, &#34;[devel]&gt;=1.8.2, &lt;1.9.2&#34;). To specify a package without pinning it to a version specifier, use the empty string as the value.
     * 
     */
    public Map<String,String> pypiPackages() {
        return this.pypiPackages;
    }
    /**
     * @return The major version of Python used to run the Apache Airflow scheduler, worker, and webserver processes. Can be set to &#39;2&#39; or &#39;3&#39;. If not specified, the default is &#39;2&#39;. Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. Environments in newer versions always use Python major version 3.
     * 
     */
    public String pythonVersion() {
        return this.pythonVersion;
    }
    /**
     * @return The number of schedulers for Airflow. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-2.*.*.
     * 
     */
    public Integer schedulerCount() {
        return this.schedulerCount;
    }
    /**
     * @return Should be either &#39;ENABLED&#39; or &#39;DISABLED&#39;. Defaults to &#39;ENABLED&#39;. Used in Composer 3.
     * 
     */
    public String webServerPluginsMode() {
        return this.webServerPluginsMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigSoftwareConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> airflowConfigOverrides;
        private List<GetEnvironmentConfigSoftwareConfigCloudDataLineageIntegration> cloudDataLineageIntegrations;
        private Map<String,String> envVariables;
        private String imageVersion;
        private Map<String,String> pypiPackages;
        private String pythonVersion;
        private Integer schedulerCount;
        private String webServerPluginsMode;
        public Builder() {}
        public Builder(GetEnvironmentConfigSoftwareConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowConfigOverrides = defaults.airflowConfigOverrides;
    	      this.cloudDataLineageIntegrations = defaults.cloudDataLineageIntegrations;
    	      this.envVariables = defaults.envVariables;
    	      this.imageVersion = defaults.imageVersion;
    	      this.pypiPackages = defaults.pypiPackages;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.schedulerCount = defaults.schedulerCount;
    	      this.webServerPluginsMode = defaults.webServerPluginsMode;
        }

        @CustomType.Setter
        public Builder airflowConfigOverrides(Map<String,String> airflowConfigOverrides) {
            if (airflowConfigOverrides == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentConfigSoftwareConfig", "airflowConfigOverrides");
            }
            this.airflowConfigOverrides = airflowConfigOverrides;
            return this;
        }
        @CustomType.Setter
        public Builder cloudDataLineageIntegrations(List<GetEnvironmentConfigSoftwareConfigCloudDataLineageIntegration> cloudDataLineageIntegrations) {
            if (cloudDataLineageIntegrations == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentConfigSoftwareConfig", "cloudDataLineageIntegrations");
            }
            this.cloudDataLineageIntegrations = cloudDataLineageIntegrations;
            return this;
        }
        public Builder cloudDataLineageIntegrations(GetEnvironmentConfigSoftwareConfigCloudDataLineageIntegration... cloudDataLineageIntegrations) {
            return cloudDataLineageIntegrations(List.of(cloudDataLineageIntegrations));
        }
        @CustomType.Setter
        public Builder envVariables(Map<String,String> envVariables) {
            if (envVariables == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentConfigSoftwareConfig", "envVariables");
            }
            this.envVariables = envVariables;
            return this;
        }
        @CustomType.Setter
        public Builder imageVersion(String imageVersion) {
            if (imageVersion == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentConfigSoftwareConfig", "imageVersion");
            }
            this.imageVersion = imageVersion;
            return this;
        }
        @CustomType.Setter
        public Builder pypiPackages(Map<String,String> pypiPackages) {
            if (pypiPackages == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentConfigSoftwareConfig", "pypiPackages");
            }
            this.pypiPackages = pypiPackages;
            return this;
        }
        @CustomType.Setter
        public Builder pythonVersion(String pythonVersion) {
            if (pythonVersion == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentConfigSoftwareConfig", "pythonVersion");
            }
            this.pythonVersion = pythonVersion;
            return this;
        }
        @CustomType.Setter
        public Builder schedulerCount(Integer schedulerCount) {
            if (schedulerCount == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentConfigSoftwareConfig", "schedulerCount");
            }
            this.schedulerCount = schedulerCount;
            return this;
        }
        @CustomType.Setter
        public Builder webServerPluginsMode(String webServerPluginsMode) {
            if (webServerPluginsMode == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentConfigSoftwareConfig", "webServerPluginsMode");
            }
            this.webServerPluginsMode = webServerPluginsMode;
            return this;
        }
        public GetEnvironmentConfigSoftwareConfig build() {
            final var _resultValue = new GetEnvironmentConfigSoftwareConfig();
            _resultValue.airflowConfigOverrides = airflowConfigOverrides;
            _resultValue.cloudDataLineageIntegrations = cloudDataLineageIntegrations;
            _resultValue.envVariables = envVariables;
            _resultValue.imageVersion = imageVersion;
            _resultValue.pypiPackages = pypiPackages;
            _resultValue.pythonVersion = pythonVersion;
            _resultValue.schedulerCount = schedulerCount;
            _resultValue.webServerPluginsMode = webServerPluginsMode;
            return _resultValue;
        }
    }
}
