// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfig;
import com.pulumi.gcp.composer.outputs.GetEnvironmentStorageConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEnvironmentResult {
    /**
     * @return Configuration parameters for the environment.
     * 
     */
    private List<GetEnvironmentConfig> configs;
    private Map<String,String> effectiveLabels;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Map<String,String> labels;
    private String name;
    private @Nullable String project;
    private Map<String,String> pulumiLabels;
    private @Nullable String region;
    private List<GetEnvironmentStorageConfig> storageConfigs;

    private GetEnvironmentResult() {}
    /**
     * @return Configuration parameters for the environment.
     * 
     */
    public List<GetEnvironmentConfig> configs() {
        return this.configs;
    }
    public Map<String,String> effectiveLabels() {
        return this.effectiveLabels;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Map<String,String> labels() {
        return this.labels;
    }
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
    public List<GetEnvironmentStorageConfig> storageConfigs() {
        return this.storageConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetEnvironmentConfig> configs;
        private Map<String,String> effectiveLabels;
        private String id;
        private Map<String,String> labels;
        private String name;
        private @Nullable String project;
        private Map<String,String> pulumiLabels;
        private @Nullable String region;
        private List<GetEnvironmentStorageConfig> storageConfigs;
        public Builder() {}
        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configs = defaults.configs;
    	      this.effectiveLabels = defaults.effectiveLabels;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pulumiLabels = defaults.pulumiLabels;
    	      this.region = defaults.region;
    	      this.storageConfigs = defaults.storageConfigs;
        }

        @CustomType.Setter
        public Builder configs(List<GetEnvironmentConfig> configs) {
            if (configs == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentResult", "configs");
            }
            this.configs = configs;
            return this;
        }
        public Builder configs(GetEnvironmentConfig... configs) {
            return configs(List.of(configs));
        }
        @CustomType.Setter
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            if (effectiveLabels == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentResult", "effectiveLabels");
            }
            this.effectiveLabels = effectiveLabels;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentResult", "name");
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
              throw new MissingRequiredPropertyException("GetEnvironmentResult", "pulumiLabels");
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
        public Builder storageConfigs(List<GetEnvironmentStorageConfig> storageConfigs) {
            if (storageConfigs == null) {
              throw new MissingRequiredPropertyException("GetEnvironmentResult", "storageConfigs");
            }
            this.storageConfigs = storageConfigs;
            return this;
        }
        public Builder storageConfigs(GetEnvironmentStorageConfig... storageConfigs) {
            return storageConfigs(List.of(storageConfigs));
        }
        public GetEnvironmentResult build() {
            final var _resultValue = new GetEnvironmentResult();
            _resultValue.configs = configs;
            _resultValue.effectiveLabels = effectiveLabels;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.name = name;
            _resultValue.project = project;
            _resultValue.pulumiLabels = pulumiLabels;
            _resultValue.region = region;
            _resultValue.storageConfigs = storageConfigs;
            return _resultValue;
        }
    }
}
