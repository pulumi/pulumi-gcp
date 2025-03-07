// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.gkehub.outputs.GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfig;
import com.pulumi.gcp.gkehub.outputs.GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigMonitoring;
import com.pulumi.gcp.gkehub.outputs.GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContent;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig {
    /**
     * @return Interval for Policy Controller Audit scans (in seconds). When set to 0, this disables audit functionality altogether.
     * 
     */
    private Integer auditIntervalSeconds;
    /**
     * @return The maximum number of audit violations to be stored in a constraint. If not set, the internal default of 20 will be used.
     * 
     */
    private Integer constraintViolationLimit;
    /**
     * @return Map of deployment configs to deployments (&#34;admission&#34;, &#34;audit&#34;, &#34;mutation&#34;).
     * 
     */
    private List<GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfig> deploymentConfigs;
    /**
     * @return The set of namespaces that are excluded from Policy Controller checks. Namespaces do not need to currently exist on the cluster.
     * 
     */
    private List<String> exemptableNamespaces;
    /**
     * @return Configures the mode of the Policy Controller installation Possible values: [&#34;INSTALL_SPEC_UNSPECIFIED&#34;, &#34;INSTALL_SPEC_NOT_INSTALLED&#34;, &#34;INSTALL_SPEC_ENABLED&#34;, &#34;INSTALL_SPEC_SUSPENDED&#34;, &#34;INSTALL_SPEC_DETACHED&#34;]
     * 
     */
    private String installSpec;
    /**
     * @return Logs all denies and dry run failures.
     * 
     */
    private Boolean logDeniesEnabled;
    /**
     * @return Monitoring specifies the configuration of monitoring Policy Controller.
     * 
     */
    private List<GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigMonitoring> monitorings;
    /**
     * @return Enables the ability to mutate resources using Policy Controller.
     * 
     */
    private Boolean mutationEnabled;
    /**
     * @return Specifies the desired policy content on the cluster.
     * 
     */
    private List<GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContent> policyContents;
    /**
     * @return Enables the ability to use Constraint Templates that reference to objects other than the object currently being evaluated.
     * 
     */
    private Boolean referentialRulesEnabled;

    private GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig() {}
    /**
     * @return Interval for Policy Controller Audit scans (in seconds). When set to 0, this disables audit functionality altogether.
     * 
     */
    public Integer auditIntervalSeconds() {
        return this.auditIntervalSeconds;
    }
    /**
     * @return The maximum number of audit violations to be stored in a constraint. If not set, the internal default of 20 will be used.
     * 
     */
    public Integer constraintViolationLimit() {
        return this.constraintViolationLimit;
    }
    /**
     * @return Map of deployment configs to deployments (&#34;admission&#34;, &#34;audit&#34;, &#34;mutation&#34;).
     * 
     */
    public List<GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfig> deploymentConfigs() {
        return this.deploymentConfigs;
    }
    /**
     * @return The set of namespaces that are excluded from Policy Controller checks. Namespaces do not need to currently exist on the cluster.
     * 
     */
    public List<String> exemptableNamespaces() {
        return this.exemptableNamespaces;
    }
    /**
     * @return Configures the mode of the Policy Controller installation Possible values: [&#34;INSTALL_SPEC_UNSPECIFIED&#34;, &#34;INSTALL_SPEC_NOT_INSTALLED&#34;, &#34;INSTALL_SPEC_ENABLED&#34;, &#34;INSTALL_SPEC_SUSPENDED&#34;, &#34;INSTALL_SPEC_DETACHED&#34;]
     * 
     */
    public String installSpec() {
        return this.installSpec;
    }
    /**
     * @return Logs all denies and dry run failures.
     * 
     */
    public Boolean logDeniesEnabled() {
        return this.logDeniesEnabled;
    }
    /**
     * @return Monitoring specifies the configuration of monitoring Policy Controller.
     * 
     */
    public List<GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigMonitoring> monitorings() {
        return this.monitorings;
    }
    /**
     * @return Enables the ability to mutate resources using Policy Controller.
     * 
     */
    public Boolean mutationEnabled() {
        return this.mutationEnabled;
    }
    /**
     * @return Specifies the desired policy content on the cluster.
     * 
     */
    public List<GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContent> policyContents() {
        return this.policyContents;
    }
    /**
     * @return Enables the ability to use Constraint Templates that reference to objects other than the object currently being evaluated.
     * 
     */
    public Boolean referentialRulesEnabled() {
        return this.referentialRulesEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer auditIntervalSeconds;
        private Integer constraintViolationLimit;
        private List<GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfig> deploymentConfigs;
        private List<String> exemptableNamespaces;
        private String installSpec;
        private Boolean logDeniesEnabled;
        private List<GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigMonitoring> monitorings;
        private Boolean mutationEnabled;
        private List<GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContent> policyContents;
        private Boolean referentialRulesEnabled;
        public Builder() {}
        public Builder(GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditIntervalSeconds = defaults.auditIntervalSeconds;
    	      this.constraintViolationLimit = defaults.constraintViolationLimit;
    	      this.deploymentConfigs = defaults.deploymentConfigs;
    	      this.exemptableNamespaces = defaults.exemptableNamespaces;
    	      this.installSpec = defaults.installSpec;
    	      this.logDeniesEnabled = defaults.logDeniesEnabled;
    	      this.monitorings = defaults.monitorings;
    	      this.mutationEnabled = defaults.mutationEnabled;
    	      this.policyContents = defaults.policyContents;
    	      this.referentialRulesEnabled = defaults.referentialRulesEnabled;
        }

        @CustomType.Setter
        public Builder auditIntervalSeconds(Integer auditIntervalSeconds) {
            if (auditIntervalSeconds == null) {
              throw new MissingRequiredPropertyException("GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig", "auditIntervalSeconds");
            }
            this.auditIntervalSeconds = auditIntervalSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder constraintViolationLimit(Integer constraintViolationLimit) {
            if (constraintViolationLimit == null) {
              throw new MissingRequiredPropertyException("GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig", "constraintViolationLimit");
            }
            this.constraintViolationLimit = constraintViolationLimit;
            return this;
        }
        @CustomType.Setter
        public Builder deploymentConfigs(List<GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfig> deploymentConfigs) {
            if (deploymentConfigs == null) {
              throw new MissingRequiredPropertyException("GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig", "deploymentConfigs");
            }
            this.deploymentConfigs = deploymentConfigs;
            return this;
        }
        public Builder deploymentConfigs(GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfig... deploymentConfigs) {
            return deploymentConfigs(List.of(deploymentConfigs));
        }
        @CustomType.Setter
        public Builder exemptableNamespaces(List<String> exemptableNamespaces) {
            if (exemptableNamespaces == null) {
              throw new MissingRequiredPropertyException("GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig", "exemptableNamespaces");
            }
            this.exemptableNamespaces = exemptableNamespaces;
            return this;
        }
        public Builder exemptableNamespaces(String... exemptableNamespaces) {
            return exemptableNamespaces(List.of(exemptableNamespaces));
        }
        @CustomType.Setter
        public Builder installSpec(String installSpec) {
            if (installSpec == null) {
              throw new MissingRequiredPropertyException("GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig", "installSpec");
            }
            this.installSpec = installSpec;
            return this;
        }
        @CustomType.Setter
        public Builder logDeniesEnabled(Boolean logDeniesEnabled) {
            if (logDeniesEnabled == null) {
              throw new MissingRequiredPropertyException("GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig", "logDeniesEnabled");
            }
            this.logDeniesEnabled = logDeniesEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder monitorings(List<GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigMonitoring> monitorings) {
            if (monitorings == null) {
              throw new MissingRequiredPropertyException("GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig", "monitorings");
            }
            this.monitorings = monitorings;
            return this;
        }
        public Builder monitorings(GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigMonitoring... monitorings) {
            return monitorings(List.of(monitorings));
        }
        @CustomType.Setter
        public Builder mutationEnabled(Boolean mutationEnabled) {
            if (mutationEnabled == null) {
              throw new MissingRequiredPropertyException("GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig", "mutationEnabled");
            }
            this.mutationEnabled = mutationEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder policyContents(List<GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContent> policyContents) {
            if (policyContents == null) {
              throw new MissingRequiredPropertyException("GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig", "policyContents");
            }
            this.policyContents = policyContents;
            return this;
        }
        public Builder policyContents(GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContent... policyContents) {
            return policyContents(List.of(policyContents));
        }
        @CustomType.Setter
        public Builder referentialRulesEnabled(Boolean referentialRulesEnabled) {
            if (referentialRulesEnabled == null) {
              throw new MissingRequiredPropertyException("GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig", "referentialRulesEnabled");
            }
            this.referentialRulesEnabled = referentialRulesEnabled;
            return this;
        }
        public GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig build() {
            final var _resultValue = new GetFeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfig();
            _resultValue.auditIntervalSeconds = auditIntervalSeconds;
            _resultValue.constraintViolationLimit = constraintViolationLimit;
            _resultValue.deploymentConfigs = deploymentConfigs;
            _resultValue.exemptableNamespaces = exemptableNamespaces;
            _resultValue.installSpec = installSpec;
            _resultValue.logDeniesEnabled = logDeniesEnabled;
            _resultValue.monitorings = monitorings;
            _resultValue.mutationEnabled = mutationEnabled;
            _resultValue.policyContents = policyContents;
            _resultValue.referentialRulesEnabled = referentialRulesEnabled;
            return _resultValue;
        }
    }
}
