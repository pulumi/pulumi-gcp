// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.gkehub.outputs.GetMembershipBindingState;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMembershipBindingResult {
    private String createTime;
    private String deleteTime;
    private Map<String,String> effectiveLabels;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Map<String,String> labels;
    private String location;
    private String membershipBindingId;
    private String membershipId;
    private String name;
    private @Nullable String project;
    private Map<String,String> pulumiLabels;
    private String scope;
    private List<GetMembershipBindingState> states;
    private String uid;
    private String updateTime;

    private GetMembershipBindingResult() {}
    public String createTime() {
        return this.createTime;
    }
    public String deleteTime() {
        return this.deleteTime;
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
    public String location() {
        return this.location;
    }
    public String membershipBindingId() {
        return this.membershipBindingId;
    }
    public String membershipId() {
        return this.membershipId;
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
    public String scope() {
        return this.scope;
    }
    public List<GetMembershipBindingState> states() {
        return this.states;
    }
    public String uid() {
        return this.uid;
    }
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMembershipBindingResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String deleteTime;
        private Map<String,String> effectiveLabels;
        private String id;
        private Map<String,String> labels;
        private String location;
        private String membershipBindingId;
        private String membershipId;
        private String name;
        private @Nullable String project;
        private Map<String,String> pulumiLabels;
        private String scope;
        private List<GetMembershipBindingState> states;
        private String uid;
        private String updateTime;
        public Builder() {}
        public Builder(GetMembershipBindingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.deleteTime = defaults.deleteTime;
    	      this.effectiveLabels = defaults.effectiveLabels;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.membershipBindingId = defaults.membershipBindingId;
    	      this.membershipId = defaults.membershipId;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pulumiLabels = defaults.pulumiLabels;
    	      this.scope = defaults.scope;
    	      this.states = defaults.states;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetMembershipBindingResult", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder deleteTime(String deleteTime) {
            if (deleteTime == null) {
              throw new MissingRequiredPropertyException("GetMembershipBindingResult", "deleteTime");
            }
            this.deleteTime = deleteTime;
            return this;
        }
        @CustomType.Setter
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            if (effectiveLabels == null) {
              throw new MissingRequiredPropertyException("GetMembershipBindingResult", "effectiveLabels");
            }
            this.effectiveLabels = effectiveLabels;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetMembershipBindingResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetMembershipBindingResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetMembershipBindingResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder membershipBindingId(String membershipBindingId) {
            if (membershipBindingId == null) {
              throw new MissingRequiredPropertyException("GetMembershipBindingResult", "membershipBindingId");
            }
            this.membershipBindingId = membershipBindingId;
            return this;
        }
        @CustomType.Setter
        public Builder membershipId(String membershipId) {
            if (membershipId == null) {
              throw new MissingRequiredPropertyException("GetMembershipBindingResult", "membershipId");
            }
            this.membershipId = membershipId;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetMembershipBindingResult", "name");
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
              throw new MissingRequiredPropertyException("GetMembershipBindingResult", "pulumiLabels");
            }
            this.pulumiLabels = pulumiLabels;
            return this;
        }
        @CustomType.Setter
        public Builder scope(String scope) {
            if (scope == null) {
              throw new MissingRequiredPropertyException("GetMembershipBindingResult", "scope");
            }
            this.scope = scope;
            return this;
        }
        @CustomType.Setter
        public Builder states(List<GetMembershipBindingState> states) {
            if (states == null) {
              throw new MissingRequiredPropertyException("GetMembershipBindingResult", "states");
            }
            this.states = states;
            return this;
        }
        public Builder states(GetMembershipBindingState... states) {
            return states(List.of(states));
        }
        @CustomType.Setter
        public Builder uid(String uid) {
            if (uid == null) {
              throw new MissingRequiredPropertyException("GetMembershipBindingResult", "uid");
            }
            this.uid = uid;
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            if (updateTime == null) {
              throw new MissingRequiredPropertyException("GetMembershipBindingResult", "updateTime");
            }
            this.updateTime = updateTime;
            return this;
        }
        public GetMembershipBindingResult build() {
            final var _resultValue = new GetMembershipBindingResult();
            _resultValue.createTime = createTime;
            _resultValue.deleteTime = deleteTime;
            _resultValue.effectiveLabels = effectiveLabels;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.location = location;
            _resultValue.membershipBindingId = membershipBindingId;
            _resultValue.membershipId = membershipId;
            _resultValue.name = name;
            _resultValue.project = project;
            _resultValue.pulumiLabels = pulumiLabels;
            _resultValue.scope = scope;
            _resultValue.states = states;
            _resultValue.uid = uid;
            _resultValue.updateTime = updateTime;
            return _resultValue;
        }
    }
}
