// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.storage.outputs.GetControlFolderIntelligenceConfigEffectiveIntelligenceConfig;
import com.pulumi.gcp.storage.outputs.GetControlFolderIntelligenceConfigFilter;
import com.pulumi.gcp.storage.outputs.GetControlFolderIntelligenceConfigTrialConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetControlFolderIntelligenceConfigResult {
    private String editionConfig;
    private List<GetControlFolderIntelligenceConfigEffectiveIntelligenceConfig> effectiveIntelligenceConfigs;
    private List<GetControlFolderIntelligenceConfigFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    private List<GetControlFolderIntelligenceConfigTrialConfig> trialConfigs;
    private String updateTime;

    private GetControlFolderIntelligenceConfigResult() {}
    public String editionConfig() {
        return this.editionConfig;
    }
    public List<GetControlFolderIntelligenceConfigEffectiveIntelligenceConfig> effectiveIntelligenceConfigs() {
        return this.effectiveIntelligenceConfigs;
    }
    public List<GetControlFolderIntelligenceConfigFilter> filters() {
        return this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public List<GetControlFolderIntelligenceConfigTrialConfig> trialConfigs() {
        return this.trialConfigs;
    }
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetControlFolderIntelligenceConfigResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String editionConfig;
        private List<GetControlFolderIntelligenceConfigEffectiveIntelligenceConfig> effectiveIntelligenceConfigs;
        private List<GetControlFolderIntelligenceConfigFilter> filters;
        private String id;
        private String name;
        private List<GetControlFolderIntelligenceConfigTrialConfig> trialConfigs;
        private String updateTime;
        public Builder() {}
        public Builder(GetControlFolderIntelligenceConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.editionConfig = defaults.editionConfig;
    	      this.effectiveIntelligenceConfigs = defaults.effectiveIntelligenceConfigs;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.trialConfigs = defaults.trialConfigs;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder editionConfig(String editionConfig) {
            if (editionConfig == null) {
              throw new MissingRequiredPropertyException("GetControlFolderIntelligenceConfigResult", "editionConfig");
            }
            this.editionConfig = editionConfig;
            return this;
        }
        @CustomType.Setter
        public Builder effectiveIntelligenceConfigs(List<GetControlFolderIntelligenceConfigEffectiveIntelligenceConfig> effectiveIntelligenceConfigs) {
            if (effectiveIntelligenceConfigs == null) {
              throw new MissingRequiredPropertyException("GetControlFolderIntelligenceConfigResult", "effectiveIntelligenceConfigs");
            }
            this.effectiveIntelligenceConfigs = effectiveIntelligenceConfigs;
            return this;
        }
        public Builder effectiveIntelligenceConfigs(GetControlFolderIntelligenceConfigEffectiveIntelligenceConfig... effectiveIntelligenceConfigs) {
            return effectiveIntelligenceConfigs(List.of(effectiveIntelligenceConfigs));
        }
        @CustomType.Setter
        public Builder filters(List<GetControlFolderIntelligenceConfigFilter> filters) {
            if (filters == null) {
              throw new MissingRequiredPropertyException("GetControlFolderIntelligenceConfigResult", "filters");
            }
            this.filters = filters;
            return this;
        }
        public Builder filters(GetControlFolderIntelligenceConfigFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetControlFolderIntelligenceConfigResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetControlFolderIntelligenceConfigResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder trialConfigs(List<GetControlFolderIntelligenceConfigTrialConfig> trialConfigs) {
            if (trialConfigs == null) {
              throw new MissingRequiredPropertyException("GetControlFolderIntelligenceConfigResult", "trialConfigs");
            }
            this.trialConfigs = trialConfigs;
            return this;
        }
        public Builder trialConfigs(GetControlFolderIntelligenceConfigTrialConfig... trialConfigs) {
            return trialConfigs(List.of(trialConfigs));
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            if (updateTime == null) {
              throw new MissingRequiredPropertyException("GetControlFolderIntelligenceConfigResult", "updateTime");
            }
            this.updateTime = updateTime;
            return this;
        }
        public GetControlFolderIntelligenceConfigResult build() {
            final var _resultValue = new GetControlFolderIntelligenceConfigResult();
            _resultValue.editionConfig = editionConfig;
            _resultValue.effectiveIntelligenceConfigs = effectiveIntelligenceConfigs;
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.trialConfigs = trialConfigs;
            _resultValue.updateTime = updateTime;
            return _resultValue;
        }
    }
}
