// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrunv2.outputs.JobTemplateTemplateContainer;
import com.pulumi.gcp.cloudrunv2.outputs.JobTemplateTemplateNodeSelector;
import com.pulumi.gcp.cloudrunv2.outputs.JobTemplateTemplateVolume;
import com.pulumi.gcp.cloudrunv2.outputs.JobTemplateTemplateVpcAccess;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTemplateTemplate {
    /**
     * @return Holds the single container that defines the unit of execution for this task.
     * Structure is documented below.
     * 
     */
    private @Nullable List<JobTemplateTemplateContainer> containers;
    /**
     * @return A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to https://cloud.google.com/run/docs/securing/using-cmek
     * 
     */
    private @Nullable String encryptionKey;
    /**
     * @return The execution environment being used to host this Task.
     * Possible values are: `EXECUTION_ENVIRONMENT_GEN1`, `EXECUTION_ENVIRONMENT_GEN2`.
     * 
     */
    private @Nullable String executionEnvironment;
    /**
     * @return Number of retries allowed per Task, before marking this Task failed. Defaults to 3. Minimum value is 0.
     * 
     */
    private @Nullable Integer maxRetries;
    /**
     * @return Node Selector describes the hardware requirements of the resources.
     * Structure is documented below.
     * 
     */
    private @Nullable JobTemplateTemplateNodeSelector nodeSelector;
    /**
     * @return Email address of the IAM service account associated with the Task of a Job. The service account represents the identity of the running task, and determines what permissions the task has. If not provided, the task will use the project&#39;s default service account.
     * 
     */
    private @Nullable String serviceAccount;
    /**
     * @return Max allowed time duration the Task may be active before the system will actively try to mark it failed and kill associated containers. This applies per attempt of a task, meaning each retry can run for the full timeout.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    private @Nullable String timeout;
    /**
     * @return A list of Volumes to make available to containers.
     * Structure is documented below.
     * 
     */
    private @Nullable List<JobTemplateTemplateVolume> volumes;
    /**
     * @return VPC Access configuration to use for this Task. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * Structure is documented below.
     * 
     */
    private @Nullable JobTemplateTemplateVpcAccess vpcAccess;

    private JobTemplateTemplate() {}
    /**
     * @return Holds the single container that defines the unit of execution for this task.
     * Structure is documented below.
     * 
     */
    public List<JobTemplateTemplateContainer> containers() {
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
     * @return The execution environment being used to host this Task.
     * Possible values are: `EXECUTION_ENVIRONMENT_GEN1`, `EXECUTION_ENVIRONMENT_GEN2`.
     * 
     */
    public Optional<String> executionEnvironment() {
        return Optional.ofNullable(this.executionEnvironment);
    }
    /**
     * @return Number of retries allowed per Task, before marking this Task failed. Defaults to 3. Minimum value is 0.
     * 
     */
    public Optional<Integer> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }
    /**
     * @return Node Selector describes the hardware requirements of the resources.
     * Structure is documented below.
     * 
     */
    public Optional<JobTemplateTemplateNodeSelector> nodeSelector() {
        return Optional.ofNullable(this.nodeSelector);
    }
    /**
     * @return Email address of the IAM service account associated with the Task of a Job. The service account represents the identity of the running task, and determines what permissions the task has. If not provided, the task will use the project&#39;s default service account.
     * 
     */
    public Optional<String> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }
    /**
     * @return Max allowed time duration the Task may be active before the system will actively try to mark it failed and kill associated containers. This applies per attempt of a task, meaning each retry can run for the full timeout.
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
    public List<JobTemplateTemplateVolume> volumes() {
        return this.volumes == null ? List.of() : this.volumes;
    }
    /**
     * @return VPC Access configuration to use for this Task. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
     * Structure is documented below.
     * 
     */
    public Optional<JobTemplateTemplateVpcAccess> vpcAccess() {
        return Optional.ofNullable(this.vpcAccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<JobTemplateTemplateContainer> containers;
        private @Nullable String encryptionKey;
        private @Nullable String executionEnvironment;
        private @Nullable Integer maxRetries;
        private @Nullable JobTemplateTemplateNodeSelector nodeSelector;
        private @Nullable String serviceAccount;
        private @Nullable String timeout;
        private @Nullable List<JobTemplateTemplateVolume> volumes;
        private @Nullable JobTemplateTemplateVpcAccess vpcAccess;
        public Builder() {}
        public Builder(JobTemplateTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containers = defaults.containers;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.executionEnvironment = defaults.executionEnvironment;
    	      this.maxRetries = defaults.maxRetries;
    	      this.nodeSelector = defaults.nodeSelector;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.timeout = defaults.timeout;
    	      this.volumes = defaults.volumes;
    	      this.vpcAccess = defaults.vpcAccess;
        }

        @CustomType.Setter
        public Builder containers(@Nullable List<JobTemplateTemplateContainer> containers) {

            this.containers = containers;
            return this;
        }
        public Builder containers(JobTemplateTemplateContainer... containers) {
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
        public Builder maxRetries(@Nullable Integer maxRetries) {

            this.maxRetries = maxRetries;
            return this;
        }
        @CustomType.Setter
        public Builder nodeSelector(@Nullable JobTemplateTemplateNodeSelector nodeSelector) {

            this.nodeSelector = nodeSelector;
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccount(@Nullable String serviceAccount) {

            this.serviceAccount = serviceAccount;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable String timeout) {

            this.timeout = timeout;
            return this;
        }
        @CustomType.Setter
        public Builder volumes(@Nullable List<JobTemplateTemplateVolume> volumes) {

            this.volumes = volumes;
            return this;
        }
        public Builder volumes(JobTemplateTemplateVolume... volumes) {
            return volumes(List.of(volumes));
        }
        @CustomType.Setter
        public Builder vpcAccess(@Nullable JobTemplateTemplateVpcAccess vpcAccess) {

            this.vpcAccess = vpcAccess;
            return this;
        }
        public JobTemplateTemplate build() {
            final var _resultValue = new JobTemplateTemplate();
            _resultValue.containers = containers;
            _resultValue.encryptionKey = encryptionKey;
            _resultValue.executionEnvironment = executionEnvironment;
            _resultValue.maxRetries = maxRetries;
            _resultValue.nodeSelector = nodeSelector;
            _resultValue.serviceAccount = serviceAccount;
            _resultValue.timeout = timeout;
            _resultValue.volumes = volumes;
            _resultValue.vpcAccess = vpcAccess;
            return _resultValue;
        }
    }
}
