// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrunv2.outputs.ServiceTemplateContainer;
import com.pulumi.gcp.cloudrunv2.outputs.ServiceTemplateNodeSelector;
import com.pulumi.gcp.cloudrunv2.outputs.ServiceTemplateScaling;
import com.pulumi.gcp.cloudrunv2.outputs.ServiceTemplateServiceMesh;
import com.pulumi.gcp.cloudrunv2.outputs.ServiceTemplateVolume;
import com.pulumi.gcp.cloudrunv2.outputs.ServiceTemplateVpcAccess;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTemplate {
    /**
     * @return Unstructured key value map that may be set by external tools to store and arbitrary metadata. They are not queryable and should be preserved when modifying objects.
     * Cloud Run API v2 does not support annotations with `run.googleapis.com`, `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev` namespaces, and they will be rejected.
     * All system annotations in v1 now have a corresponding field in v2 RevisionTemplate.
     * This field follows Kubernetes annotations&#39; namespacing, limits, and rules.
     * 
     */
    private @Nullable Map<String,String> annotations;
    /**
     * @return Holds the containers that define the unit of execution for this Service.
     * Structure is documented below.
     * 
     */
    private @Nullable List<ServiceTemplateContainer> containers;
    /**
     * @return A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
     * 
     */
    private @Nullable String encryptionKey;
    /**
     * @return The sandbox environment to host this Revision.
     * Possible values are: `EXECUTION_ENVIRONMENT_GEN1`, `EXECUTION_ENVIRONMENT_GEN2`.
     * 
     */
    private @Nullable String executionEnvironment;
    /**
     * @return True if GPU zonal redundancy is disabled on this revision.
     * 
     */
    private @Nullable Boolean gpuZonalRedundancyDisabled;
    /**
     * @return Unstructured key value map that can be used to organize and categorize objects. User-provided labels are shared with Google&#39;s billing system, so they can be used to filter, or break down billing charges by team, component, environment, state, etc.
     * For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or https://cloud.google.com/run/docs/configuring/labels.
     * Cloud Run API v2 does not support labels with `run.googleapis.com`, `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev` namespaces, and they will be rejected.
     * All system labels in v1 now have a corresponding field in v2 RevisionTemplate.
     * 
     */
    private @Nullable Map<String,String> labels;
    /**
     * @return Sets the maximum number of requests that each serving instance can receive.
     * If not specified or 0, defaults to 80 when requested CPU &gt;= 1 and defaults to 1 when requested CPU &lt; 1.
     * 
     */
    private @Nullable Integer maxInstanceRequestConcurrency;
    /**
     * @return Node Selector describes the hardware requirements of the resources.
     * Structure is documented below.
     * 
     */
    private @Nullable ServiceTemplateNodeSelector nodeSelector;
    /**
     * @return The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name.
     * 
     */
    private @Nullable String revision;
    /**
     * @return Scaling settings for this Revision.
     * Structure is documented below.
     * 
     */
    private @Nullable ServiceTemplateScaling scaling;
    /**
     * @return Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project&#39;s default service account.
     * 
     */
    private @Nullable String serviceAccount;
    /**
     * @return Enables Cloud Service Mesh for this Revision.
     * Structure is documented below.
     * 
     */
    private @Nullable ServiceTemplateServiceMesh serviceMesh;
    /**
     * @return Enables session affinity. For more information, go to https://cloud.google.com/run/docs/configuring/session-affinity
     * 
     */
    private @Nullable Boolean sessionAffinity;
    /**
     * @return Max allowed time for an instance to respond to a request.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    private @Nullable String timeout;
    /**
     * @return A list of Volumes to make available to containers.
     * Structure is documented below.
     * 
     */
    private @Nullable List<ServiceTemplateVolume> volumes;
    /**
     * @return VPC Access configuration to use for this Task. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * Structure is documented below.
     * 
     */
    private @Nullable ServiceTemplateVpcAccess vpcAccess;

    private ServiceTemplate() {}
    /**
     * @return Unstructured key value map that may be set by external tools to store and arbitrary metadata. They are not queryable and should be preserved when modifying objects.
     * Cloud Run API v2 does not support annotations with `run.googleapis.com`, `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev` namespaces, and they will be rejected.
     * All system annotations in v1 now have a corresponding field in v2 RevisionTemplate.
     * This field follows Kubernetes annotations&#39; namespacing, limits, and rules.
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations == null ? Map.of() : this.annotations;
    }
    /**
     * @return Holds the containers that define the unit of execution for this Service.
     * Structure is documented below.
     * 
     */
    public List<ServiceTemplateContainer> containers() {
        return this.containers == null ? List.of() : this.containers;
    }
    /**
     * @return A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
     * 
     */
    public Optional<String> encryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }
    /**
     * @return The sandbox environment to host this Revision.
     * Possible values are: `EXECUTION_ENVIRONMENT_GEN1`, `EXECUTION_ENVIRONMENT_GEN2`.
     * 
     */
    public Optional<String> executionEnvironment() {
        return Optional.ofNullable(this.executionEnvironment);
    }
    /**
     * @return True if GPU zonal redundancy is disabled on this revision.
     * 
     */
    public Optional<Boolean> gpuZonalRedundancyDisabled() {
        return Optional.ofNullable(this.gpuZonalRedundancyDisabled);
    }
    /**
     * @return Unstructured key value map that can be used to organize and categorize objects. User-provided labels are shared with Google&#39;s billing system, so they can be used to filter, or break down billing charges by team, component, environment, state, etc.
     * For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or https://cloud.google.com/run/docs/configuring/labels.
     * Cloud Run API v2 does not support labels with `run.googleapis.com`, `cloud.googleapis.com`, `serving.knative.dev`, or `autoscaling.knative.dev` namespaces, and they will be rejected.
     * All system labels in v1 now have a corresponding field in v2 RevisionTemplate.
     * 
     */
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * @return Sets the maximum number of requests that each serving instance can receive.
     * If not specified or 0, defaults to 80 when requested CPU &gt;= 1 and defaults to 1 when requested CPU &lt; 1.
     * 
     */
    public Optional<Integer> maxInstanceRequestConcurrency() {
        return Optional.ofNullable(this.maxInstanceRequestConcurrency);
    }
    /**
     * @return Node Selector describes the hardware requirements of the resources.
     * Structure is documented below.
     * 
     */
    public Optional<ServiceTemplateNodeSelector> nodeSelector() {
        return Optional.ofNullable(this.nodeSelector);
    }
    /**
     * @return The unique name for the revision. If this field is omitted, it will be automatically generated based on the Service name.
     * 
     */
    public Optional<String> revision() {
        return Optional.ofNullable(this.revision);
    }
    /**
     * @return Scaling settings for this Revision.
     * Structure is documented below.
     * 
     */
    public Optional<ServiceTemplateScaling> scaling() {
        return Optional.ofNullable(this.scaling);
    }
    /**
     * @return Email address of the IAM service account associated with the revision of the service. The service account represents the identity of the running revision, and determines what permissions the revision has. If not provided, the revision will use the project&#39;s default service account.
     * 
     */
    public Optional<String> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }
    /**
     * @return Enables Cloud Service Mesh for this Revision.
     * Structure is documented below.
     * 
     */
    public Optional<ServiceTemplateServiceMesh> serviceMesh() {
        return Optional.ofNullable(this.serviceMesh);
    }
    /**
     * @return Enables session affinity. For more information, go to https://cloud.google.com/run/docs/configuring/session-affinity
     * 
     */
    public Optional<Boolean> sessionAffinity() {
        return Optional.ofNullable(this.sessionAffinity);
    }
    /**
     * @return Max allowed time for an instance to respond to a request.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * @return A list of Volumes to make available to containers.
     * Structure is documented below.
     * 
     */
    public List<ServiceTemplateVolume> volumes() {
        return this.volumes == null ? List.of() : this.volumes;
    }
    /**
     * @return VPC Access configuration to use for this Task. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * Structure is documented below.
     * 
     */
    public Optional<ServiceTemplateVpcAccess> vpcAccess() {
        return Optional.ofNullable(this.vpcAccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> annotations;
        private @Nullable List<ServiceTemplateContainer> containers;
        private @Nullable String encryptionKey;
        private @Nullable String executionEnvironment;
        private @Nullable Boolean gpuZonalRedundancyDisabled;
        private @Nullable Map<String,String> labels;
        private @Nullable Integer maxInstanceRequestConcurrency;
        private @Nullable ServiceTemplateNodeSelector nodeSelector;
        private @Nullable String revision;
        private @Nullable ServiceTemplateScaling scaling;
        private @Nullable String serviceAccount;
        private @Nullable ServiceTemplateServiceMesh serviceMesh;
        private @Nullable Boolean sessionAffinity;
        private @Nullable String timeout;
        private @Nullable List<ServiceTemplateVolume> volumes;
        private @Nullable ServiceTemplateVpcAccess vpcAccess;
        public Builder() {}
        public Builder(ServiceTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.containers = defaults.containers;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.executionEnvironment = defaults.executionEnvironment;
    	      this.gpuZonalRedundancyDisabled = defaults.gpuZonalRedundancyDisabled;
    	      this.labels = defaults.labels;
    	      this.maxInstanceRequestConcurrency = defaults.maxInstanceRequestConcurrency;
    	      this.nodeSelector = defaults.nodeSelector;
    	      this.revision = defaults.revision;
    	      this.scaling = defaults.scaling;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceMesh = defaults.serviceMesh;
    	      this.sessionAffinity = defaults.sessionAffinity;
    	      this.timeout = defaults.timeout;
    	      this.volumes = defaults.volumes;
    	      this.vpcAccess = defaults.vpcAccess;
        }

        @CustomType.Setter
        public Builder annotations(@Nullable Map<String,String> annotations) {

            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder containers(@Nullable List<ServiceTemplateContainer> containers) {

            this.containers = containers;
            return this;
        }
        public Builder containers(ServiceTemplateContainer... containers) {
            return containers(List.of(containers));
        }
        @CustomType.Setter
        public Builder encryptionKey(@Nullable String encryptionKey) {

            this.encryptionKey = encryptionKey;
            return this;
        }
        @CustomType.Setter
        public Builder executionEnvironment(@Nullable String executionEnvironment) {

            this.executionEnvironment = executionEnvironment;
            return this;
        }
        @CustomType.Setter
        public Builder gpuZonalRedundancyDisabled(@Nullable Boolean gpuZonalRedundancyDisabled) {

            this.gpuZonalRedundancyDisabled = gpuZonalRedundancyDisabled;
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable Map<String,String> labels) {

            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder maxInstanceRequestConcurrency(@Nullable Integer maxInstanceRequestConcurrency) {

            this.maxInstanceRequestConcurrency = maxInstanceRequestConcurrency;
            return this;
        }
        @CustomType.Setter
        public Builder nodeSelector(@Nullable ServiceTemplateNodeSelector nodeSelector) {

            this.nodeSelector = nodeSelector;
            return this;
        }
        @CustomType.Setter
        public Builder revision(@Nullable String revision) {

            this.revision = revision;
            return this;
        }
        @CustomType.Setter
        public Builder scaling(@Nullable ServiceTemplateScaling scaling) {

            this.scaling = scaling;
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccount(@Nullable String serviceAccount) {

            this.serviceAccount = serviceAccount;
            return this;
        }
        @CustomType.Setter
        public Builder serviceMesh(@Nullable ServiceTemplateServiceMesh serviceMesh) {

            this.serviceMesh = serviceMesh;
            return this;
        }
        @CustomType.Setter
        public Builder sessionAffinity(@Nullable Boolean sessionAffinity) {

            this.sessionAffinity = sessionAffinity;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable String timeout) {

            this.timeout = timeout;
            return this;
        }
        @CustomType.Setter
        public Builder volumes(@Nullable List<ServiceTemplateVolume> volumes) {

            this.volumes = volumes;
            return this;
        }
        public Builder volumes(ServiceTemplateVolume... volumes) {
            return volumes(List.of(volumes));
        }
        @CustomType.Setter
        public Builder vpcAccess(@Nullable ServiceTemplateVpcAccess vpcAccess) {

            this.vpcAccess = vpcAccess;
            return this;
        }
        public ServiceTemplate build() {
            final var _resultValue = new ServiceTemplate();
            _resultValue.annotations = annotations;
            _resultValue.containers = containers;
            _resultValue.encryptionKey = encryptionKey;
            _resultValue.executionEnvironment = executionEnvironment;
            _resultValue.gpuZonalRedundancyDisabled = gpuZonalRedundancyDisabled;
            _resultValue.labels = labels;
            _resultValue.maxInstanceRequestConcurrency = maxInstanceRequestConcurrency;
            _resultValue.nodeSelector = nodeSelector;
            _resultValue.revision = revision;
            _resultValue.scaling = scaling;
            _resultValue.serviceAccount = serviceAccount;
            _resultValue.serviceMesh = serviceMesh;
            _resultValue.sessionAffinity = sessionAffinity;
            _resultValue.timeout = timeout;
            _resultValue.volumes = volumes;
            _resultValue.vpcAccess = vpcAccess;
            return _resultValue;
        }
    }
}
