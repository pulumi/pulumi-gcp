// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.cloudrunv2.outputs.GetWorkerPoolTemplateContainerEnvValueSource;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWorkerPoolTemplateContainerEnv {
    /**
     * @return The name of the Cloud Run v2 Worker Pool.
     * 
     */
    private String name;
    /**
     * @return Literal value of the environment variable. Defaults to &#34;&#34; and the maximum allowed length is 32768 characters. Variable references are not supported in Cloud Run.
     * 
     */
    private String value;
    /**
     * @return Source for the environment variable&#39;s value.
     * 
     */
    private List<GetWorkerPoolTemplateContainerEnvValueSource> valueSources;

    private GetWorkerPoolTemplateContainerEnv() {}
    /**
     * @return The name of the Cloud Run v2 Worker Pool.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Literal value of the environment variable. Defaults to &#34;&#34; and the maximum allowed length is 32768 characters. Variable references are not supported in Cloud Run.
     * 
     */
    public String value() {
        return this.value;
    }
    /**
     * @return Source for the environment variable&#39;s value.
     * 
     */
    public List<GetWorkerPoolTemplateContainerEnvValueSource> valueSources() {
        return this.valueSources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkerPoolTemplateContainerEnv defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        private List<GetWorkerPoolTemplateContainerEnvValueSource> valueSources;
        public Builder() {}
        public Builder(GetWorkerPoolTemplateContainerEnv defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
    	      this.valueSources = defaults.valueSources;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolTemplateContainerEnv", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolTemplateContainerEnv", "value");
            }
            this.value = value;
            return this;
        }
        @CustomType.Setter
        public Builder valueSources(List<GetWorkerPoolTemplateContainerEnvValueSource> valueSources) {
            if (valueSources == null) {
              throw new MissingRequiredPropertyException("GetWorkerPoolTemplateContainerEnv", "valueSources");
            }
            this.valueSources = valueSources;
            return this;
        }
        public Builder valueSources(GetWorkerPoolTemplateContainerEnvValueSource... valueSources) {
            return valueSources(List.of(valueSources));
        }
        public GetWorkerPoolTemplateContainerEnv build() {
            final var _resultValue = new GetWorkerPoolTemplateContainerEnv();
            _resultValue.name = name;
            _resultValue.value = value;
            _resultValue.valueSources = valueSources;
            return _resultValue;
        }
    }
}
