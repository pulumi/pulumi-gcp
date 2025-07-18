// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.secretmanager.outputs.GetRegionalSecretCustomerManagedEncryption;
import com.pulumi.gcp.secretmanager.outputs.GetRegionalSecretRotation;
import com.pulumi.gcp.secretmanager.outputs.GetRegionalSecretTopic;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRegionalSecretResult {
    private Map<String,String> annotations;
    private String createTime;
    private List<GetRegionalSecretCustomerManagedEncryption> customerManagedEncryptions;
    private Boolean deletionProtection;
    private Map<String,String> effectiveAnnotations;
    private Map<String,String> effectiveLabels;
    private String expireTime;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Map<String,String> labels;
    private String location;
    private String name;
    private @Nullable String project;
    private Map<String,String> pulumiLabels;
    private List<GetRegionalSecretRotation> rotations;
    private String secretId;
    private List<GetRegionalSecretTopic> topics;
    private String ttl;
    private Map<String,String> versionAliases;
    private String versionDestroyTtl;

    private GetRegionalSecretResult() {}
    public Map<String,String> annotations() {
        return this.annotations;
    }
    public String createTime() {
        return this.createTime;
    }
    public List<GetRegionalSecretCustomerManagedEncryption> customerManagedEncryptions() {
        return this.customerManagedEncryptions;
    }
    public Boolean deletionProtection() {
        return this.deletionProtection;
    }
    public Map<String,String> effectiveAnnotations() {
        return this.effectiveAnnotations;
    }
    public Map<String,String> effectiveLabels() {
        return this.effectiveLabels;
    }
    public String expireTime() {
        return this.expireTime;
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
    public List<GetRegionalSecretRotation> rotations() {
        return this.rotations;
    }
    public String secretId() {
        return this.secretId;
    }
    public List<GetRegionalSecretTopic> topics() {
        return this.topics;
    }
    public String ttl() {
        return this.ttl;
    }
    public Map<String,String> versionAliases() {
        return this.versionAliases;
    }
    public String versionDestroyTtl() {
        return this.versionDestroyTtl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionalSecretResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> annotations;
        private String createTime;
        private List<GetRegionalSecretCustomerManagedEncryption> customerManagedEncryptions;
        private Boolean deletionProtection;
        private Map<String,String> effectiveAnnotations;
        private Map<String,String> effectiveLabels;
        private String expireTime;
        private String id;
        private Map<String,String> labels;
        private String location;
        private String name;
        private @Nullable String project;
        private Map<String,String> pulumiLabels;
        private List<GetRegionalSecretRotation> rotations;
        private String secretId;
        private List<GetRegionalSecretTopic> topics;
        private String ttl;
        private Map<String,String> versionAliases;
        private String versionDestroyTtl;
        public Builder() {}
        public Builder(GetRegionalSecretResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.createTime = defaults.createTime;
    	      this.customerManagedEncryptions = defaults.customerManagedEncryptions;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.effectiveAnnotations = defaults.effectiveAnnotations;
    	      this.effectiveLabels = defaults.effectiveLabels;
    	      this.expireTime = defaults.expireTime;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pulumiLabels = defaults.pulumiLabels;
    	      this.rotations = defaults.rotations;
    	      this.secretId = defaults.secretId;
    	      this.topics = defaults.topics;
    	      this.ttl = defaults.ttl;
    	      this.versionAliases = defaults.versionAliases;
    	      this.versionDestroyTtl = defaults.versionDestroyTtl;
        }

        @CustomType.Setter
        public Builder annotations(Map<String,String> annotations) {
            if (annotations == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "annotations");
            }
            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder customerManagedEncryptions(List<GetRegionalSecretCustomerManagedEncryption> customerManagedEncryptions) {
            if (customerManagedEncryptions == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "customerManagedEncryptions");
            }
            this.customerManagedEncryptions = customerManagedEncryptions;
            return this;
        }
        public Builder customerManagedEncryptions(GetRegionalSecretCustomerManagedEncryption... customerManagedEncryptions) {
            return customerManagedEncryptions(List.of(customerManagedEncryptions));
        }
        @CustomType.Setter
        public Builder deletionProtection(Boolean deletionProtection) {
            if (deletionProtection == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "deletionProtection");
            }
            this.deletionProtection = deletionProtection;
            return this;
        }
        @CustomType.Setter
        public Builder effectiveAnnotations(Map<String,String> effectiveAnnotations) {
            if (effectiveAnnotations == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "effectiveAnnotations");
            }
            this.effectiveAnnotations = effectiveAnnotations;
            return this;
        }
        @CustomType.Setter
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            if (effectiveLabels == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "effectiveLabels");
            }
            this.effectiveLabels = effectiveLabels;
            return this;
        }
        @CustomType.Setter
        public Builder expireTime(String expireTime) {
            if (expireTime == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "expireTime");
            }
            this.expireTime = expireTime;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "name");
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
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "pulumiLabels");
            }
            this.pulumiLabels = pulumiLabels;
            return this;
        }
        @CustomType.Setter
        public Builder rotations(List<GetRegionalSecretRotation> rotations) {
            if (rotations == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "rotations");
            }
            this.rotations = rotations;
            return this;
        }
        public Builder rotations(GetRegionalSecretRotation... rotations) {
            return rotations(List.of(rotations));
        }
        @CustomType.Setter
        public Builder secretId(String secretId) {
            if (secretId == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "secretId");
            }
            this.secretId = secretId;
            return this;
        }
        @CustomType.Setter
        public Builder topics(List<GetRegionalSecretTopic> topics) {
            if (topics == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "topics");
            }
            this.topics = topics;
            return this;
        }
        public Builder topics(GetRegionalSecretTopic... topics) {
            return topics(List.of(topics));
        }
        @CustomType.Setter
        public Builder ttl(String ttl) {
            if (ttl == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "ttl");
            }
            this.ttl = ttl;
            return this;
        }
        @CustomType.Setter
        public Builder versionAliases(Map<String,String> versionAliases) {
            if (versionAliases == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "versionAliases");
            }
            this.versionAliases = versionAliases;
            return this;
        }
        @CustomType.Setter
        public Builder versionDestroyTtl(String versionDestroyTtl) {
            if (versionDestroyTtl == null) {
              throw new MissingRequiredPropertyException("GetRegionalSecretResult", "versionDestroyTtl");
            }
            this.versionDestroyTtl = versionDestroyTtl;
            return this;
        }
        public GetRegionalSecretResult build() {
            final var _resultValue = new GetRegionalSecretResult();
            _resultValue.annotations = annotations;
            _resultValue.createTime = createTime;
            _resultValue.customerManagedEncryptions = customerManagedEncryptions;
            _resultValue.deletionProtection = deletionProtection;
            _resultValue.effectiveAnnotations = effectiveAnnotations;
            _resultValue.effectiveLabels = effectiveLabels;
            _resultValue.expireTime = expireTime;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.project = project;
            _resultValue.pulumiLabels = pulumiLabels;
            _resultValue.rotations = rotations;
            _resultValue.secretId = secretId;
            _resultValue.topics = topics;
            _resultValue.ttl = ttl;
            _resultValue.versionAliases = versionAliases;
            _resultValue.versionDestroyTtl = versionDestroyTtl;
            return _resultValue;
        }
    }
}
