// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.cloudrunv2.outputs.GetServiceTemplateContainer;
import com.pulumi.gcp.cloudrunv2.outputs.GetServiceTemplateNodeSelector;
import com.pulumi.gcp.cloudrunv2.outputs.GetServiceTemplateScaling;
import com.pulumi.gcp.cloudrunv2.outputs.GetServiceTemplateServiceMesh;
import com.pulumi.gcp.cloudrunv2.outputs.GetServiceTemplateVolume;
import com.pulumi.gcp.cloudrunv2.outputs.GetServiceTemplateVpcAccess;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetServiceTemplate {
    /**
     * @return Unstructured key value map that may be set by external tools to store and arbitrary metadata. They are not queryable and should be preserved when modifying objects.
     * 
     * Cloud Run API v2 does not support annotations with &#39;run.googleapis.com&#39;, &#39;cloud.googleapis.com&#39;, &#39;serving.knative.dev&#39;, or &#39;autoscaling.knative.dev&#39; namespaces, and they will be rejected.
     * All system annotations in v1 now have a corresponding field in v2 RevisionTemplate.
     * 
     * This field follows Kubernetes annotations&#39; namespacing, limits, and rules.
     * 
     */
    private Map<String,String> annotations;
    /**
     * @return Holds the containers that define the unit of execution for this Service.
     * 
     */
    private List<GetServiceTemplateContainer> containers;
    /**
     * @return A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
     * 
     */
    private String encryptionKey;
    /**
     * @return The sandbox environment to host this Revision. Possible values: [&#34;EXECUTION_ENVIRONMENT_GEN1&#34;, &#34;EXECUTION_ENVIRONMENT_GEN2&#34;]
     * 
     */
    private String executionEnvironment;
    /**
     * @return True if GPU zonal redundancy is disabled on this revision.
     * 
     */
    private Boolean gpuZonalRedundancyDisabled;
    /**
     * @return Unstructured key value map that can be used to organize and categorize objects. User-provided labels are shared with Google&#39;s billing system, so they can be used to filter, or break down billing charges by team, component, environment, state, etc.
     * For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or https://cloud.google.com/run/docs/configuring/labels.
     * 
     * Cloud Run API v2 does not support labels with &#39;run.googleapis.com&#39;, &#39;cloud.googleapis.com&#39;, &#39;serving.knative.dev&#39;, or &#39;autoscaling.knative.dev&#39; namespaces, and they will be rejected.
     * All system labels in v1 now have a corresponding field in v2 RevisionTemplate.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return Sets the maximum number of requests that each serving instance can receive.
     * If not specified or 0, defaults to 80 when requested CPU &gt;= 1 and defaults to 1 when requested CPU &lt; 1.
     * 
     */
    private Integer maxInstanceRequestConcurrency;
    /**
     * @return Node Selector describes the hardware requirements of the resources.
     * 
     */
    private List<GetServiceTemplateNodeSelector> nodeSelectors;
    /**
     * @return The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name.
     * 
     */
    private String revision;
    /**
     * @return Scaling settings for this Revision.
     * 
     */
    private List<GetServiceTemplateScaling> scalings;
    /**
     * @return Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project&#39;s default service account.
     * 
     */
    private String serviceAccount;
    /**
     * @return Enables Cloud Service Mesh for this Revision.
     * 
     */
    private List<GetServiceTemplateServiceMesh> serviceMeshes;
    /**
     * @return Enables session affinity. For more information, go to https://cloud.google.com/run/docs/configuring/session-affinity
     * 
     */
    private Boolean sessionAffinity;
    /**
     * @return Max allowed time for an instance to respond to a request.
     * 
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    private String timeout;
    /**
     * @return A list of Volumes to make available to containers.
     * 
     */
    private List<GetServiceTemplateVolume> volumes;
    /**
     * @return VPC Access configuration to use for this Task. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * 
     */
    private List<GetServiceTemplateVpcAccess> vpcAccesses;

    private GetServiceTemplate() {}
    /**
     * @return Unstructured key value map that may be set by external tools to store and arbitrary metadata. They are not queryable and should be preserved when modifying objects.
     * 
     * Cloud Run API v2 does not support annotations with &#39;run.googleapis.com&#39;, &#39;cloud.googleapis.com&#39;, &#39;serving.knative.dev&#39;, or &#39;autoscaling.knative.dev&#39; namespaces, and they will be rejected.
     * All system annotations in v1 now have a corresponding field in v2 RevisionTemplate.
     * 
     * This field follows Kubernetes annotations&#39; namespacing, limits, and rules.
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }
    /**
     * @return Holds the containers that define the unit of execution for this Service.
     * 
     */
    public List<GetServiceTemplateContainer> containers() {
        return this.containers;
    }
    /**
     * @return A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
     * 
     */
    public String encryptionKey() {
        return this.encryptionKey;
    }
    /**
     * @return The sandbox environment to host this Revision. Possible values: [&#34;EXECUTION_ENVIRONMENT_GEN1&#34;, &#34;EXECUTION_ENVIRONMENT_GEN2&#34;]
     * 
     */
    public String executionEnvironment() {
        return this.executionEnvironment;
    }
    /**
     * @return True if GPU zonal redundancy is disabled on this revision.
     * 
     */
    public Boolean gpuZonalRedundancyDisabled() {
        return this.gpuZonalRedundancyDisabled;
    }
    /**
     * @return Unstructured key value map that can be used to organize and categorize objects. User-provided labels are shared with Google&#39;s billing system, so they can be used to filter, or break down billing charges by team, component, environment, state, etc.
     * For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or https://cloud.google.com/run/docs/configuring/labels.
     * 
     * Cloud Run API v2 does not support labels with &#39;run.googleapis.com&#39;, &#39;cloud.googleapis.com&#39;, &#39;serving.knative.dev&#39;, or &#39;autoscaling.knative.dev&#39; namespaces, and they will be rejected.
     * All system labels in v1 now have a corresponding field in v2 RevisionTemplate.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Sets the maximum number of requests that each serving instance can receive.
     * If not specified or 0, defaults to 80 when requested CPU &gt;= 1 and defaults to 1 when requested CPU &lt; 1.
     * 
     */
    public Integer maxInstanceRequestConcurrency() {
        return this.maxInstanceRequestConcurrency;
    }
    /**
     * @return Node Selector describes the hardware requirements of the resources.
     * 
     */
    public List<GetServiceTemplateNodeSelector> nodeSelectors() {
        return this.nodeSelectors;
    }
    /**
     * @return The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name.
     * 
     */
    public String revision() {
        return this.revision;
    }
    /**
     * @return Scaling settings for this Revision.
     * 
     */
    public List<GetServiceTemplateScaling> scalings() {
        return this.scalings;
    }
    /**
     * @return Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project&#39;s default service account.
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return Enables Cloud Service Mesh for this Revision.
     * 
     */
    public List<GetServiceTemplateServiceMesh> serviceMeshes() {
        return this.serviceMeshes;
    }
    /**
     * @return Enables session affinity. For more information, go to https://cloud.google.com/run/docs/configuring/session-affinity
     * 
     */
    public Boolean sessionAffinity() {
        return this.sessionAffinity;
    }
    /**
     * @return Max allowed time for an instance to respond to a request.
     * 
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public String timeout() {
        return this.timeout;
    }
    /**
     * @return A list of Volumes to make available to containers.
     * 
     */
    public List<GetServiceTemplateVolume> volumes() {
        return this.volumes;
    }
    /**
     * @return VPC Access configuration to use for this Task. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * 
     */
    public List<GetServiceTemplateVpcAccess> vpcAccesses() {
        return this.vpcAccesses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> annotations;
        private List<GetServiceTemplateContainer> containers;
        private String encryptionKey;
        private String executionEnvironment;
        private Boolean gpuZonalRedundancyDisabled;
        private Map<String,String> labels;
        private Integer maxInstanceRequestConcurrency;
        private List<GetServiceTemplateNodeSelector> nodeSelectors;
        private String revision;
        private List<GetServiceTemplateScaling> scalings;
        private String serviceAccount;
        private List<GetServiceTemplateServiceMesh> serviceMeshes;
        private Boolean sessionAffinity;
        private String timeout;
        private List<GetServiceTemplateVolume> volumes;
        private List<GetServiceTemplateVpcAccess> vpcAccesses;
        public Builder() {}
        public Builder(GetServiceTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.containers = defaults.containers;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.executionEnvironment = defaults.executionEnvironment;
    	      this.gpuZonalRedundancyDisabled = defaults.gpuZonalRedundancyDisabled;
    	      this.labels = defaults.labels;
    	      this.maxInstanceRequestConcurrency = defaults.maxInstanceRequestConcurrency;
    	      this.nodeSelectors = defaults.nodeSelectors;
    	      this.revision = defaults.revision;
    	      this.scalings = defaults.scalings;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceMeshes = defaults.serviceMeshes;
    	      this.sessionAffinity = defaults.sessionAffinity;
    	      this.timeout = defaults.timeout;
    	      this.volumes = defaults.volumes;
    	      this.vpcAccesses = defaults.vpcAccesses;
        }

        @CustomType.Setter
        public Builder annotations(Map<String,String> annotations) {
            if (annotations == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplate", "annotations");
            }
            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder containers(List<GetServiceTemplateContainer> containers) {
            if (containers == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplate", "containers");
            }
            this.containers = containers;
            return this;
        }
        public Builder containers(GetServiceTemplateContainer... containers) {
            return containers(List.of(containers));
        }
        @CustomType.Setter
        public Builder encryptionKey(String encryptionKey) {
            if (encryptionKey == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplate", "encryptionKey");
            }
            this.encryptionKey = encryptionKey;
            return this;
        }
        @CustomType.Setter
        public Builder executionEnvironment(String executionEnvironment) {
            if (executionEnvironment == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplate", "executionEnvironment");
            }
            this.executionEnvironment = executionEnvironment;
            return this;
        }
        @CustomType.Setter
        public Builder gpuZonalRedundancyDisabled(Boolean gpuZonalRedundancyDisabled) {
            if (gpuZonalRedundancyDisabled == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplate", "gpuZonalRedundancyDisabled");
            }
            this.gpuZonalRedundancyDisabled = gpuZonalRedundancyDisabled;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplate", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder maxInstanceRequestConcurrency(Integer maxInstanceRequestConcurrency) {
            if (maxInstanceRequestConcurrency == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplate", "maxInstanceRequestConcurrency");
            }
            this.maxInstanceRequestConcurrency = maxInstanceRequestConcurrency;
            return this;
        }
        @CustomType.Setter
        public Builder nodeSelectors(List<GetServiceTemplateNodeSelector> nodeSelectors) {
            if (nodeSelectors == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplate", "nodeSelectors");
            }
            this.nodeSelectors = nodeSelectors;
            return this;
        }
        public Builder nodeSelectors(GetServiceTemplateNodeSelector... nodeSelectors) {
            return nodeSelectors(List.of(nodeSelectors));
        }
        @CustomType.Setter
        public Builder revision(String revision) {
            if (revision == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplate", "revision");
            }
            this.revision = revision;
            return this;
        }
        @CustomType.Setter
        public Builder scalings(List<GetServiceTemplateScaling> scalings) {
            if (scalings == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplate", "scalings");
            }
            this.scalings = scalings;
            return this;
        }
        public Builder scalings(GetServiceTemplateScaling... scalings) {
            return scalings(List.of(scalings));
        }
        @CustomType.Setter
        public Builder serviceAccount(String serviceAccount) {
            if (serviceAccount == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplate", "serviceAccount");
            }
            this.serviceAccount = serviceAccount;
            return this;
        }
        @CustomType.Setter
        public Builder serviceMeshes(List<GetServiceTemplateServiceMesh> serviceMeshes) {
            if (serviceMeshes == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplate", "serviceMeshes");
            }
            this.serviceMeshes = serviceMeshes;
            return this;
        }
        public Builder serviceMeshes(GetServiceTemplateServiceMesh... serviceMeshes) {
            return serviceMeshes(List.of(serviceMeshes));
        }
        @CustomType.Setter
        public Builder sessionAffinity(Boolean sessionAffinity) {
            if (sessionAffinity == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplate", "sessionAffinity");
            }
            this.sessionAffinity = sessionAffinity;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(String timeout) {
            if (timeout == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplate", "timeout");
            }
            this.timeout = timeout;
            return this;
        }
        @CustomType.Setter
        public Builder volumes(List<GetServiceTemplateVolume> volumes) {
            if (volumes == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplate", "volumes");
            }
            this.volumes = volumes;
            return this;
        }
        public Builder volumes(GetServiceTemplateVolume... volumes) {
            return volumes(List.of(volumes));
        }
        @CustomType.Setter
        public Builder vpcAccesses(List<GetServiceTemplateVpcAccess> vpcAccesses) {
            if (vpcAccesses == null) {
              throw new MissingRequiredPropertyException("GetServiceTemplate", "vpcAccesses");
            }
            this.vpcAccesses = vpcAccesses;
            return this;
        }
        public Builder vpcAccesses(GetServiceTemplateVpcAccess... vpcAccesses) {
            return vpcAccesses(List.of(vpcAccesses));
        }
        public GetServiceTemplate build() {
            final var _resultValue = new GetServiceTemplate();
            _resultValue.annotations = annotations;
            _resultValue.containers = containers;
            _resultValue.encryptionKey = encryptionKey;
            _resultValue.executionEnvironment = executionEnvironment;
            _resultValue.gpuZonalRedundancyDisabled = gpuZonalRedundancyDisabled;
            _resultValue.labels = labels;
            _resultValue.maxInstanceRequestConcurrency = maxInstanceRequestConcurrency;
            _resultValue.nodeSelectors = nodeSelectors;
            _resultValue.revision = revision;
            _resultValue.scalings = scalings;
            _resultValue.serviceAccount = serviceAccount;
            _resultValue.serviceMeshes = serviceMeshes;
            _resultValue.sessionAffinity = sessionAffinity;
            _resultValue.timeout = timeout;
            _resultValue.volumes = volumes;
            _resultValue.vpcAccesses = vpcAccesses;
            return _resultValue;
        }
    }
}
