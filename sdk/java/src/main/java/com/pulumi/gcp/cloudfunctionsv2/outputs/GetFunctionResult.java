// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctionsv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.cloudfunctionsv2.outputs.GetFunctionBuildConfig;
import com.pulumi.gcp.cloudfunctionsv2.outputs.GetFunctionEventTrigger;
import com.pulumi.gcp.cloudfunctionsv2.outputs.GetFunctionServiceConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFunctionResult {
    private List<GetFunctionBuildConfig> buildConfigs;
    private String description;
    private Map<String,String> effectiveLabels;
    private String environment;
    private List<GetFunctionEventTrigger> eventTriggers;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String kmsKeyName;
    private Map<String,String> labels;
    private String location;
    private String name;
    private @Nullable String project;
    private Map<String,String> pulumiLabels;
    private List<GetFunctionServiceConfig> serviceConfigs;
    private String state;
    private String updateTime;
    private String url;

    private GetFunctionResult() {}
    public List<GetFunctionBuildConfig> buildConfigs() {
        return this.buildConfigs;
    }
    public String description() {
        return this.description;
    }
    public Map<String,String> effectiveLabels() {
        return this.effectiveLabels;
    }
    public String environment() {
        return this.environment;
    }
    public List<GetFunctionEventTrigger> eventTriggers() {
        return this.eventTriggers;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    public Map<String,String> labels() {
        return this.labels;
    }
    public String location() {
        return this.location;
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
    public List<GetFunctionServiceConfig> serviceConfigs() {
        return this.serviceConfigs;
    }
    public String state() {
        return this.state;
    }
    public String updateTime() {
        return this.updateTime;
    }
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetFunctionBuildConfig> buildConfigs;
        private String description;
        private Map<String,String> effectiveLabels;
        private String environment;
        private List<GetFunctionEventTrigger> eventTriggers;
        private String id;
        private String kmsKeyName;
        private Map<String,String> labels;
        private String location;
        private String name;
        private @Nullable String project;
        private Map<String,String> pulumiLabels;
        private List<GetFunctionServiceConfig> serviceConfigs;
        private String state;
        private String updateTime;
        private String url;
        public Builder() {}
        public Builder(GetFunctionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildConfigs = defaults.buildConfigs;
    	      this.description = defaults.description;
    	      this.effectiveLabels = defaults.effectiveLabels;
    	      this.environment = defaults.environment;
    	      this.eventTriggers = defaults.eventTriggers;
    	      this.id = defaults.id;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pulumiLabels = defaults.pulumiLabels;
    	      this.serviceConfigs = defaults.serviceConfigs;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder buildConfigs(List<GetFunctionBuildConfig> buildConfigs) {
            if (buildConfigs == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "buildConfigs");
            }
            this.buildConfigs = buildConfigs;
            return this;
        }
        public Builder buildConfigs(GetFunctionBuildConfig... buildConfigs) {
            return buildConfigs(List.of(buildConfigs));
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
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            if (effectiveLabels == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "effectiveLabels");
            }
            this.effectiveLabels = effectiveLabels;
            return this;
        }
        @CustomType.Setter
        public Builder environment(String environment) {
            if (environment == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "environment");
            }
            this.environment = environment;
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
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "id");
            }
            this.id = id;
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
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "location");
            }
            this.location = location;
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
        public Builder serviceConfigs(List<GetFunctionServiceConfig> serviceConfigs) {
            if (serviceConfigs == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "serviceConfigs");
            }
            this.serviceConfigs = serviceConfigs;
            return this;
        }
        public Builder serviceConfigs(GetFunctionServiceConfig... serviceConfigs) {
            return serviceConfigs(List.of(serviceConfigs));
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            if (updateTime == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "updateTime");
            }
            this.updateTime = updateTime;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetFunctionResult", "url");
            }
            this.url = url;
            return this;
        }
        public GetFunctionResult build() {
            final var _resultValue = new GetFunctionResult();
            _resultValue.buildConfigs = buildConfigs;
            _resultValue.description = description;
            _resultValue.effectiveLabels = effectiveLabels;
            _resultValue.environment = environment;
            _resultValue.eventTriggers = eventTriggers;
            _resultValue.id = id;
            _resultValue.kmsKeyName = kmsKeyName;
            _resultValue.labels = labels;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.project = project;
            _resultValue.pulumiLabels = pulumiLabels;
            _resultValue.serviceConfigs = serviceConfigs;
            _resultValue.state = state;
            _resultValue.updateTime = updateTime;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
