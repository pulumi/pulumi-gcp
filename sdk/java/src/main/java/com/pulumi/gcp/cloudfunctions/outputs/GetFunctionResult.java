// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctions.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.cloudfunctions.outputs.GetFunctionEventTrigger;
import com.pulumi.gcp.cloudfunctions.outputs.GetFunctionSecretEnvironmentVariable;
import com.pulumi.gcp.cloudfunctions.outputs.GetFunctionSecretVolume;
import com.pulumi.gcp.cloudfunctions.outputs.GetFunctionSourceRepository;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFunctionResult {
    /**
     * @return Available memory (in MB) to the function.
     * 
     */
    private Integer availableMemoryMb;
    private Map<String,String> buildEnvironmentVariables;
    private String buildServiceAccount;
    private String buildWorkerPool;
    /**
     * @return Description of the function.
     * 
     */
    private String description;
    private String dockerRegistry;
    private String dockerRepository;
    private Map<String,String> effectiveLabels;
    /**
     * @return Name of a JavaScript function that will be executed when the Google Cloud Function is triggered.
     * 
     */
    private String entryPoint;
    private Map<String,String> environmentVariables;
    /**
     * @return A source that fires events in response to a condition in another service. Structure is documented below.
     * 
     */
    private List<GetFunctionEventTrigger> eventTriggers;
    private String httpsTriggerSecurityLevel;
    /**
     * @return If function is triggered by HTTP, trigger URL is set here.
     * 
     */
    private String httpsTriggerUrl;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Controls what traffic can reach the function.
     * 
     */
    private String ingressSettings;
    private String kmsKeyName;
    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return The limit on the maximum number of function instances that may coexist at a given time. If unset or set to `0`, the API default will be used.
     * 
     */
    private Integer maxInstances;
    private Integer minInstances;
    /**
     * @return The name of the Cloud Function.
     * 
     */
    private String name;
    private @Nullable String project;
    private Map<String,String> pulumiLabels;
    private @Nullable String region;
    /**
     * @return The runtime in which the function is running.
     * 
     */
    private String runtime;
    private List<GetFunctionSecretEnvironmentVariable> secretEnvironmentVariables;
    private List<GetFunctionSecretVolume> secretVolumes;
    /**
     * @return The service account email to be assumed by the cloud function.
     * 
     */
    private String serviceAccountEmail;
    /**
     * @return The GCS bucket containing the zip archive which contains the function.
     * 
     */
    private String sourceArchiveBucket;
    /**
     * @return The source archive object (file) in archive bucket.
     * 
     */
    private String sourceArchiveObject;
    /**
     * @return The URL of the Cloud Source Repository that the function is deployed from. Structure is documented below.
     * 
     */
    private List<GetFunctionSourceRepository> sourceRepositories;
    private String status;
    /**
     * @return Function execution timeout (in seconds).
     * 
     */
    private Integer timeout;
    /**
     * @return If function is triggered by HTTP, this boolean is set.
     * 
     */
    private Boolean triggerHttp;
    private String versionId;
    /**
     * @return The VPC Network Connector that this cloud function can connect to.
     * 
     */
    private String vpcConnector;
    /**
     * @return The egress settings for the connector, controlling what traffic is diverted through it.
     * 
     */
    private String vpcConnectorEgressSettings;

    private GetFunctionResult() {}
    /**
     * @return Available memory (in MB) to the function.
     * 
     */
    public Integer availableMemoryMb() {
        return this.availableMemoryMb;
    }
    public Map<String,String> buildEnvironmentVariables() {
        return this.buildEnvironmentVariables;
    }
    public String buildServiceAccount() {
        return this.buildServiceAccount;
    }
    public String buildWorkerPool() {
        return this.buildWorkerPool;
    }
    /**
     * @return Description of the function.
     * 
     */
    public String description() {
        return this.description;
    }
    public String dockerRegistry() {
        return this.dockerRegistry;
    }
    public String dockerRepository() {
        return this.dockerRepository;
    }
    public Map<String,String> effectiveLabels() {
        return this.effectiveLabels;
    }
    /**
     * @return Name of a JavaScript function that will be executed when the Google Cloud Function is triggered.
     * 
     */
    public String entryPoint() {
        return this.entryPoint;
    }
    public Map<String,String> environmentVariables() {
        return this.environmentVariables;
    }
    /**
     * @return A source that fires events in response to a condition in another service. Structure is documented below.
     * 
     */
    public List<GetFunctionEventTrigger> eventTriggers() {
        return this.eventTriggers;
    }
    public String httpsTriggerSecurityLevel() {
        return this.httpsTriggerSecurityLevel;
    }
    /**
     * @return If function is triggered by HTTP, trigger URL is set here.
     * 
     */
    public String httpsTriggerUrl() {
        return this.httpsTriggerUrl;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Controls what traffic can reach the function.
     * 
     */
    public String ingressSettings() {
        return this.ingressSettings;
    }
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The limit on the maximum number of function instances that may coexist at a given time. If unset or set to `0`, the API default will be used.
     * 
     */
    public Integer maxInstances() {
        return this.maxInstances;
    }
    public Integer minInstances() {
        return this.minInstances;
    }
    /**
     * @return The name of the Cloud Function.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public Map<String,String> pulumiLabels() {
        return this.pulumiLabels;
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return The runtime in which the function is running.
     * 
     */
    public String runtime() {
        return this.runtime;
    }
    public List<GetFunctionSecretEnvironmentVariable> secretEnvironmentVariables() {
        return this.secretEnvironmentVariables;
    }
    public List<GetFunctionSecretVolume> secretVolumes() {
        return this.secretVolumes;
    }
    /**
     * @return The service account email to be assumed by the cloud function.
     * 
     */
    public String serviceAccountEmail() {
        return this.serviceAccountEmail;
    }
    /**
     * @return The GCS bucket containing the zip archive which contains the function.
     * 
     */
    public String sourceArchiveBucket() {
        return this.sourceArchiveBucket;
    }
    /**
     * @return The source archive object (file) in archive bucket.
     * 
     */
    public String sourceArchiveObject() {
        return this.sourceArchiveObject;
    }
    /**
     * @return The URL of the Cloud Source Repository that the function is deployed from. Structure is documented below.
     * 
     */
    public List<GetFunctionSourceRepository> sourceRepositories() {
        return this.sourceRepositories;
    }
    public String status() {
        return this.status;
    }
    /**
     * @return Function execution timeout (in seconds).
     * 
     */
    public Integer timeout() {
        return this.timeout;
    }
    /**
     * @return If function is triggered by HTTP, this boolean is set.
     * 
     */
    public Boolean triggerHttp() {
        return this.triggerHttp;
    }
    public String versionId() {
        return this.versionId;
    }
    /**
     * @return The VPC Network Connector that this cloud function can connect to.
     * 
     */
    public String vpcConnector() {
        return this.vpcConnector;
    }
    /**
     * @return The egress settings for the connector, controlling what traffic is diverted through it.
     * 
     */
    public String vpcConnectorEgressSettings() {
        return this.vpcConnectorEgressSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer availableMemoryMb;
        private Map<String,String> buildEnvironmentVariables;
        private String buildServiceAccount;
        private String buildWorkerPool;
        private String description;
        private String dockerRegistry;
        private String dockerRepository;
        private Map<String,String> effectiveLabels;
        private String entryPoint;
        private Map<String,String> environmentVariables;
        private List<GetFunctionEventTrigger> eventTriggers;
        private String httpsTriggerSecurityLevel;
        private String httpsTriggerUrl;
        private String id;
        private String ingressSettings;
        private String kmsKeyName;
        private Map<String,String> labels;
        private Integer maxInstances;
        private Integer minInstances;
        private String name;
        private @Nullable String project;
        private Map<String,String> pulumiLabels;
        private @Nullable String region;
        private String runtime;
        private List<GetFunctionSecretEnvironmentVariable> secretEnvironmentVariables;
        private List<GetFunctionSecretVolume> secretVolumes;
        private String serviceAccountEmail;
        private String sourceArchiveBucket;
        private String sourceArchiveObject;
        private List<GetFunctionSourceRepository> sourceRepositories;
        private String status;
        private Integer timeout;
        private Boolean triggerHttp;
        private String versionId;
        private String vpcConnector;
        private String vpcConnectorEgressSettings;
        public Builder() {}
        public Builder(GetFunctionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableMemoryMb = defaults.availableMemoryMb;
    	      this.buildEnvironmentVariables = defaults.buildEnvironmentVariables;
    	      this.buildServiceAccount = defaults.buildServiceAccount;
    	      this.buildWorkerPool = defaults.buildWorkerPool;
    	      this.description = defaults.description;
    	      this.dockerRegistry = defaults.dockerRegistry;
    	      this.dockerRepository = defaults.dockerRepository;
    	      this.effectiveLabels = defaults.effectiveLabels;
    	      this.entryPoint = defaults.entryPoint;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.eventTriggers = defaults.eventTriggers;
    	      this.httpsTriggerSecurityLevel = defaults.httpsTriggerSecurityLevel;
    	      this.httpsTriggerUrl = defaults.httpsTriggerUrl;
    	      this.id = defaults.id;
    	      this.ingressSettings = defaults.ingressSettings;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.labels = defaults.labels;
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pulumiLabels = defaults.pulumiLabels;
    	      this.region = defaults.region;
    	      this.runtime = defaults.runtime;
    	      this.secretEnvironmentVariables = defaults.secretEnvironmentVariables;
    	      this.secretVolumes = defaults.secretVolumes;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.sourceArchiveBucket = defaults.sourceArchiveBucket;
    	      this.sourceArchiveObject = defaults.sourceArchiveObject;
    	      this.sourceRepositories = defaults.sourceRepositories;
    	      this.status = defaults.status;
    	      this.timeout = defaults.timeout;
    	      this.triggerHttp = defaults.triggerHttp;
    	      this.versionId = defaults.versionId;
    	      this.vpcConnector = defaults.vpcConnector;
    	      this.vpcConnectorEgressSettings = defaults.vpcConnectorEgressSettings;
        }

        @CustomType.Setter
        public Builder availableMemoryMb(Integer availableMemoryMb) {
            if (availableMemoryMb == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "availableMemoryMb");
            }
            this.availableMemoryMb = availableMemoryMb;
            return this;
        }
        @CustomType.Setter
        public Builder buildEnvironmentVariables(Map<String,String> buildEnvironmentVariables) {
            if (buildEnvironmentVariables == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "buildEnvironmentVariables");
            }
            this.buildEnvironmentVariables = buildEnvironmentVariables;
            return this;
        }
        @CustomType.Setter
        public Builder buildServiceAccount(String buildServiceAccount) {
            if (buildServiceAccount == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "buildServiceAccount");
            }
            this.buildServiceAccount = buildServiceAccount;
            return this;
        }
        @CustomType.Setter
        public Builder buildWorkerPool(String buildWorkerPool) {
            if (buildWorkerPool == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "buildWorkerPool");
            }
            this.buildWorkerPool = buildWorkerPool;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder dockerRegistry(String dockerRegistry) {
            if (dockerRegistry == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "dockerRegistry");
            }
            this.dockerRegistry = dockerRegistry;
            return this;
        }
        @CustomType.Setter
        public Builder dockerRepository(String dockerRepository) {
            if (dockerRepository == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "dockerRepository");
            }
            this.dockerRepository = dockerRepository;
            return this;
        }
        @CustomType.Setter
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            if (effectiveLabels == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "effectiveLabels");
            }
            this.effectiveLabels = effectiveLabels;
            return this;
        }
        @CustomType.Setter
        public Builder entryPoint(String entryPoint) {
            if (entryPoint == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "entryPoint");
            }
            this.entryPoint = entryPoint;
            return this;
        }
        @CustomType.Setter
        public Builder environmentVariables(Map<String,String> environmentVariables) {
            if (environmentVariables == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "environmentVariables");
            }
            this.environmentVariables = environmentVariables;
            return this;
        }
        @CustomType.Setter
        public Builder eventTriggers(List<GetFunctionEventTrigger> eventTriggers) {
            if (eventTriggers == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "eventTriggers");
            }
            this.eventTriggers = eventTriggers;
            return this;
        }
        public Builder eventTriggers(GetFunctionEventTrigger... eventTriggers) {
            return eventTriggers(List.of(eventTriggers));
        }
        @CustomType.Setter
        public Builder httpsTriggerSecurityLevel(String httpsTriggerSecurityLevel) {
            if (httpsTriggerSecurityLevel == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "httpsTriggerSecurityLevel");
            }
            this.httpsTriggerSecurityLevel = httpsTriggerSecurityLevel;
            return this;
        }
        @CustomType.Setter
        public Builder httpsTriggerUrl(String httpsTriggerUrl) {
            if (httpsTriggerUrl == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "httpsTriggerUrl");
            }
            this.httpsTriggerUrl = httpsTriggerUrl;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ingressSettings(String ingressSettings) {
            if (ingressSettings == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "ingressSettings");
            }
            this.ingressSettings = ingressSettings;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyName(String kmsKeyName) {
            if (kmsKeyName == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "kmsKeyName");
            }
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder maxInstances(Integer maxInstances) {
            if (maxInstances == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "maxInstances");
            }
            this.maxInstances = maxInstances;
            return this;
        }
        @CustomType.Setter
        public Builder minInstances(Integer minInstances) {
            if (minInstances == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "minInstances");
            }
            this.minInstances = minInstances;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {

            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            if (pulumiLabels == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "pulumiLabels");
            }
            this.pulumiLabels = pulumiLabels;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder runtime(String runtime) {
            if (runtime == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "runtime");
            }
            this.runtime = runtime;
            return this;
        }
        @CustomType.Setter
        public Builder secretEnvironmentVariables(List<GetFunctionSecretEnvironmentVariable> secretEnvironmentVariables) {
            if (secretEnvironmentVariables == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "secretEnvironmentVariables");
            }
            this.secretEnvironmentVariables = secretEnvironmentVariables;
            return this;
        }
        public Builder secretEnvironmentVariables(GetFunctionSecretEnvironmentVariable... secretEnvironmentVariables) {
            return secretEnvironmentVariables(List.of(secretEnvironmentVariables));
        }
        @CustomType.Setter
        public Builder secretVolumes(List<GetFunctionSecretVolume> secretVolumes) {
            if (secretVolumes == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "secretVolumes");
            }
            this.secretVolumes = secretVolumes;
            return this;
        }
        public Builder secretVolumes(GetFunctionSecretVolume... secretVolumes) {
            return secretVolumes(List.of(secretVolumes));
        }
        @CustomType.Setter
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            if (serviceAccountEmail == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "serviceAccountEmail");
            }
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }
        @CustomType.Setter
        public Builder sourceArchiveBucket(String sourceArchiveBucket) {
            if (sourceArchiveBucket == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "sourceArchiveBucket");
            }
            this.sourceArchiveBucket = sourceArchiveBucket;
            return this;
        }
        @CustomType.Setter
        public Builder sourceArchiveObject(String sourceArchiveObject) {
            if (sourceArchiveObject == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "sourceArchiveObject");
            }
            this.sourceArchiveObject = sourceArchiveObject;
            return this;
        }
        @CustomType.Setter
        public Builder sourceRepositories(List<GetFunctionSourceRepository> sourceRepositories) {
            if (sourceRepositories == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "sourceRepositories");
            }
            this.sourceRepositories = sourceRepositories;
            return this;
        }
        public Builder sourceRepositories(GetFunctionSourceRepository... sourceRepositories) {
            return sourceRepositories(List.of(sourceRepositories));
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(Integer timeout) {
            if (timeout == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "timeout");
            }
            this.timeout = timeout;
            return this;
        }
        @CustomType.Setter
        public Builder triggerHttp(Boolean triggerHttp) {
            if (triggerHttp == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "triggerHttp");
            }
            this.triggerHttp = triggerHttp;
            return this;
        }
        @CustomType.Setter
        public Builder versionId(String versionId) {
            if (versionId == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "versionId");
            }
            this.versionId = versionId;
            return this;
        }
        @CustomType.Setter
        public Builder vpcConnector(String vpcConnector) {
            if (vpcConnector == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "vpcConnector");
            }
            this.vpcConnector = vpcConnector;
            return this;
        }
        @CustomType.Setter
        public Builder vpcConnectorEgressSettings(String vpcConnectorEgressSettings) {
            if (vpcConnectorEgressSettings == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "vpcConnectorEgressSettings");
            }
            this.vpcConnectorEgressSettings = vpcConnectorEgressSettings;
            return this;
        }
        public GetFunctionResult build() {
            final var _resultValue = new GetFunctionResult();
            _resultValue.availableMemoryMb = availableMemoryMb;
            _resultValue.buildEnvironmentVariables = buildEnvironmentVariables;
            _resultValue.buildServiceAccount = buildServiceAccount;
            _resultValue.buildWorkerPool = buildWorkerPool;
            _resultValue.description = description;
            _resultValue.dockerRegistry = dockerRegistry;
            _resultValue.dockerRepository = dockerRepository;
            _resultValue.effectiveLabels = effectiveLabels;
            _resultValue.entryPoint = entryPoint;
            _resultValue.environmentVariables = environmentVariables;
            _resultValue.eventTriggers = eventTriggers;
            _resultValue.httpsTriggerSecurityLevel = httpsTriggerSecurityLevel;
            _resultValue.httpsTriggerUrl = httpsTriggerUrl;
            _resultValue.id = id;
            _resultValue.ingressSettings = ingressSettings;
            _resultValue.kmsKeyName = kmsKeyName;
            _resultValue.labels = labels;
            _resultValue.maxInstances = maxInstances;
            _resultValue.minInstances = minInstances;
            _resultValue.name = name;
            _resultValue.project = project;
            _resultValue.pulumiLabels = pulumiLabels;
            _resultValue.region = region;
            _resultValue.runtime = runtime;
            _resultValue.secretEnvironmentVariables = secretEnvironmentVariables;
            _resultValue.secretVolumes = secretVolumes;
            _resultValue.serviceAccountEmail = serviceAccountEmail;
            _resultValue.sourceArchiveBucket = sourceArchiveBucket;
            _resultValue.sourceArchiveObject = sourceArchiveObject;
            _resultValue.sourceRepositories = sourceRepositories;
            _resultValue.status = status;
            _resultValue.timeout = timeout;
            _resultValue.triggerHttp = triggerHttp;
            _resultValue.versionId = versionId;
            _resultValue.vpcConnector = vpcConnector;
            _resultValue.vpcConnectorEgressSettings = vpcConnectorEgressSettings;
            return _resultValue;
        }
    }
}
