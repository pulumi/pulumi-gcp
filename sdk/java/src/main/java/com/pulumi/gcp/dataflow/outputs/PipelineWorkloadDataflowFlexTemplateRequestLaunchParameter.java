// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.dataflow.outputs.PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterEnvironment;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineWorkloadDataflowFlexTemplateRequestLaunchParameter {
    /**
     * @return Cloud Storage path to a file with a JSON-serialized ContainerSpec as content.
     * 
     */
    private @Nullable String containerSpecGcsPath;
    /**
     * @return The runtime environment for the Flex Template job.
     * https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#FlexTemplateRuntimeEnvironment
     * Structure is documented below.
     * 
     */
    private @Nullable PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterEnvironment environment;
    /**
     * @return The job name to use for the created job. For an update job request, the job name should be the same as the existing running job.
     * 
     */
    private String jobName;
    /**
     * @return Launch options for this Flex Template job. This is a common set of options across languages and templates. This should not be used to pass job parameters.
     * &#39;An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.&#39;
     * 
     */
    private @Nullable Map<String,String> launchOptions;
    /**
     * @return &#39;The parameters for the Flex Template. Example: {&#34;numWorkers&#34;:&#34;5&#34;}&#39;
     * &#39;An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.&#39;
     * 
     */
    private @Nullable Map<String,String> parameters;
    /**
     * @return &#39;Use this to pass transform name mappings for streaming update jobs. Example: {&#34;oldTransformName&#34;:&#34;newTransformName&#34;,...}&#39;
     * &#39;An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.&#39;
     * 
     */
    private @Nullable Map<String,String> transformNameMappings;
    /**
     * @return Set this to true if you are sending a request to update a running streaming job. When set, the job name should be the same as the running job.
     * 
     */
    private @Nullable Boolean update;

    private PipelineWorkloadDataflowFlexTemplateRequestLaunchParameter() {}
    /**
     * @return Cloud Storage path to a file with a JSON-serialized ContainerSpec as content.
     * 
     */
    public Optional<String> containerSpecGcsPath() {
        return Optional.ofNullable(this.containerSpecGcsPath);
    }
    /**
     * @return The runtime environment for the Flex Template job.
     * https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#FlexTemplateRuntimeEnvironment
     * Structure is documented below.
     * 
     */
    public Optional<PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterEnvironment> environment() {
        return Optional.ofNullable(this.environment);
    }
    /**
     * @return The job name to use for the created job. For an update job request, the job name should be the same as the existing running job.
     * 
     */
    public String jobName() {
        return this.jobName;
    }
    /**
     * @return Launch options for this Flex Template job. This is a common set of options across languages and templates. This should not be used to pass job parameters.
     * &#39;An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.&#39;
     * 
     */
    public Map<String,String> launchOptions() {
        return this.launchOptions == null ? Map.of() : this.launchOptions;
    }
    /**
     * @return &#39;The parameters for the Flex Template. Example: {&#34;numWorkers&#34;:&#34;5&#34;}&#39;
     * &#39;An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.&#39;
     * 
     */
    public Map<String,String> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * @return &#39;Use this to pass transform name mappings for streaming update jobs. Example: {&#34;oldTransformName&#34;:&#34;newTransformName&#34;,...}&#39;
     * &#39;An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.&#39;
     * 
     */
    public Map<String,String> transformNameMappings() {
        return this.transformNameMappings == null ? Map.of() : this.transformNameMappings;
    }
    /**
     * @return Set this to true if you are sending a request to update a running streaming job. When set, the job name should be the same as the running job.
     * 
     */
    public Optional<Boolean> update() {
        return Optional.ofNullable(this.update);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineWorkloadDataflowFlexTemplateRequestLaunchParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String containerSpecGcsPath;
        private @Nullable PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterEnvironment environment;
        private String jobName;
        private @Nullable Map<String,String> launchOptions;
        private @Nullable Map<String,String> parameters;
        private @Nullable Map<String,String> transformNameMappings;
        private @Nullable Boolean update;
        public Builder() {}
        public Builder(PipelineWorkloadDataflowFlexTemplateRequestLaunchParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerSpecGcsPath = defaults.containerSpecGcsPath;
    	      this.environment = defaults.environment;
    	      this.jobName = defaults.jobName;
    	      this.launchOptions = defaults.launchOptions;
    	      this.parameters = defaults.parameters;
    	      this.transformNameMappings = defaults.transformNameMappings;
    	      this.update = defaults.update;
        }

        @CustomType.Setter
        public Builder containerSpecGcsPath(@Nullable String containerSpecGcsPath) {

            this.containerSpecGcsPath = containerSpecGcsPath;
            return this;
        }
        @CustomType.Setter
        public Builder environment(@Nullable PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterEnvironment environment) {

            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder jobName(String jobName) {
            if (jobName == null) {
              throw new MissingRequiredPropertyException("PipelineWorkloadDataflowFlexTemplateRequestLaunchParameter", "jobName");
            }
            this.jobName = jobName;
            return this;
        }
        @CustomType.Setter
        public Builder launchOptions(@Nullable Map<String,String> launchOptions) {

            this.launchOptions = launchOptions;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable Map<String,String> parameters) {

            this.parameters = parameters;
            return this;
        }
        @CustomType.Setter
        public Builder transformNameMappings(@Nullable Map<String,String> transformNameMappings) {

            this.transformNameMappings = transformNameMappings;
            return this;
        }
        @CustomType.Setter
        public Builder update(@Nullable Boolean update) {

            this.update = update;
            return this;
        }
        public PipelineWorkloadDataflowFlexTemplateRequestLaunchParameter build() {
            final var _resultValue = new PipelineWorkloadDataflowFlexTemplateRequestLaunchParameter();
            _resultValue.containerSpecGcsPath = containerSpecGcsPath;
            _resultValue.environment = environment;
            _resultValue.jobName = jobName;
            _resultValue.launchOptions = launchOptions;
            _resultValue.parameters = parameters;
            _resultValue.transformNameMappings = transformNameMappings;
            _resultValue.update = update;
            return _resultValue;
        }
    }
}
