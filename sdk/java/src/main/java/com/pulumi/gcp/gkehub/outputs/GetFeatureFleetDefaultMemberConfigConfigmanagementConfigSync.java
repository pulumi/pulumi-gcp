// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.gkehub.outputs.GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGit;
import com.pulumi.gcp.gkehub.outputs.GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOci;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSync {
    /**
     * @return Enables the installation of ConfigSync. If set to true, ConfigSync resources will be created and the other ConfigSync fields will be applied if exist. If set to false, all other ConfigSync fields will be ignored, ConfigSync resources will be deleted. If omitted, ConfigSync resources will be managed depends on the presence of the git or oci field.
     * 
     */
    private Boolean enabled;
    /**
     * @return Git repo configuration for the cluster
     * 
     */
    private List<GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGit> gits;
    /**
     * @return The Email of the Google Cloud Service Account (GSA) used for exporting Config Sync metrics to Cloud Monitoring. The GSA should have the Monitoring Metric Writer(roles/monitoring.metricWriter) IAM role. The Kubernetes ServiceAccount &#39;default&#39; in the namespace &#39;config-management-monitoring&#39; should be bound to the GSA.
     * 
     */
    private String metricsGcpServiceAccountEmail;
    /**
     * @return OCI repo configuration for the cluster
     * 
     */
    private List<GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOci> ocis;
    /**
     * @return Set to true to enable the Config Sync admission webhook to prevent drifts. If set to &#39;false&#39;, disables the Config Sync admission webhook and does not prevent drifts.
     * 
     */
    private Boolean preventDrift;
    /**
     * @return Specifies whether the Config Sync Repo is in hierarchical or unstructured mode
     * 
     */
    private String sourceFormat;

    private GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSync() {}
    /**
     * @return Enables the installation of ConfigSync. If set to true, ConfigSync resources will be created and the other ConfigSync fields will be applied if exist. If set to false, all other ConfigSync fields will be ignored, ConfigSync resources will be deleted. If omitted, ConfigSync resources will be managed depends on the presence of the git or oci field.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Git repo configuration for the cluster
     * 
     */
    public List<GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGit> gits() {
        return this.gits;
    }
    /**
     * @return The Email of the Google Cloud Service Account (GSA) used for exporting Config Sync metrics to Cloud Monitoring. The GSA should have the Monitoring Metric Writer(roles/monitoring.metricWriter) IAM role. The Kubernetes ServiceAccount &#39;default&#39; in the namespace &#39;config-management-monitoring&#39; should be bound to the GSA.
     * 
     */
    public String metricsGcpServiceAccountEmail() {
        return this.metricsGcpServiceAccountEmail;
    }
    /**
     * @return OCI repo configuration for the cluster
     * 
     */
    public List<GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOci> ocis() {
        return this.ocis;
    }
    /**
     * @return Set to true to enable the Config Sync admission webhook to prevent drifts. If set to &#39;false&#39;, disables the Config Sync admission webhook and does not prevent drifts.
     * 
     */
    public Boolean preventDrift() {
        return this.preventDrift;
    }
    /**
     * @return Specifies whether the Config Sync Repo is in hierarchical or unstructured mode
     * 
     */
    public String sourceFormat() {
        return this.sourceFormat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSync defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private List<GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGit> gits;
        private String metricsGcpServiceAccountEmail;
        private List<GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOci> ocis;
        private Boolean preventDrift;
        private String sourceFormat;
        public Builder() {}
        public Builder(GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSync defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.gits = defaults.gits;
    	      this.metricsGcpServiceAccountEmail = defaults.metricsGcpServiceAccountEmail;
    	      this.ocis = defaults.ocis;
    	      this.preventDrift = defaults.preventDrift;
    	      this.sourceFormat = defaults.sourceFormat;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSync", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder gits(List<GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGit> gits) {
            if (gits == null) {
              throw new MissingRequiredPropertyException("GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSync", "gits");
            }
            this.gits = gits;
            return this;
        }
        public Builder gits(GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGit... gits) {
            return gits(List.of(gits));
        }
        @CustomType.Setter
        public Builder metricsGcpServiceAccountEmail(String metricsGcpServiceAccountEmail) {
            if (metricsGcpServiceAccountEmail == null) {
              throw new MissingRequiredPropertyException("GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSync", "metricsGcpServiceAccountEmail");
            }
            this.metricsGcpServiceAccountEmail = metricsGcpServiceAccountEmail;
            return this;
        }
        @CustomType.Setter
        public Builder ocis(List<GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOci> ocis) {
            if (ocis == null) {
              throw new MissingRequiredPropertyException("GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSync", "ocis");
            }
            this.ocis = ocis;
            return this;
        }
        public Builder ocis(GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOci... ocis) {
            return ocis(List.of(ocis));
        }
        @CustomType.Setter
        public Builder preventDrift(Boolean preventDrift) {
            if (preventDrift == null) {
              throw new MissingRequiredPropertyException("GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSync", "preventDrift");
            }
            this.preventDrift = preventDrift;
            return this;
        }
        @CustomType.Setter
        public Builder sourceFormat(String sourceFormat) {
            if (sourceFormat == null) {
              throw new MissingRequiredPropertyException("GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSync", "sourceFormat");
            }
            this.sourceFormat = sourceFormat;
            return this;
        }
        public GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSync build() {
            final var _resultValue = new GetFeatureFleetDefaultMemberConfigConfigmanagementConfigSync();
            _resultValue.enabled = enabled;
            _resultValue.gits = gits;
            _resultValue.metricsGcpServiceAccountEmail = metricsGcpServiceAccountEmail;
            _resultValue.ocis = ocis;
            _resultValue.preventDrift = preventDrift;
            _resultValue.sourceFormat = sourceFormat;
            return _resultValue;
        }
    }
}
