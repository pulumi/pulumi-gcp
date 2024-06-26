// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.outputs.GetInstanceGroupManagerStatusAllInstancesConfig;
import com.pulumi.gcp.compute.outputs.GetInstanceGroupManagerStatusStateful;
import com.pulumi.gcp.compute.outputs.GetInstanceGroupManagerStatusVersionTarget;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceGroupManagerStatus {
    /**
     * @return Status of all-instances configuration on the group.
     * 
     */
    private List<GetInstanceGroupManagerStatusAllInstancesConfig> allInstancesConfigs;
    /**
     * @return A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
     * 
     */
    private Boolean isStable;
    /**
     * @return Stateful status of the given Instance Group Manager.
     * 
     */
    private List<GetInstanceGroupManagerStatusStateful> statefuls;
    /**
     * @return A status of consistency of Instances&#39; versions with their target version specified by version field on Instance Group Manager.
     * 
     */
    private List<GetInstanceGroupManagerStatusVersionTarget> versionTargets;

    private GetInstanceGroupManagerStatus() {}
    /**
     * @return Status of all-instances configuration on the group.
     * 
     */
    public List<GetInstanceGroupManagerStatusAllInstancesConfig> allInstancesConfigs() {
        return this.allInstancesConfigs;
    }
    /**
     * @return A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
     * 
     */
    public Boolean isStable() {
        return this.isStable;
    }
    /**
     * @return Stateful status of the given Instance Group Manager.
     * 
     */
    public List<GetInstanceGroupManagerStatusStateful> statefuls() {
        return this.statefuls;
    }
    /**
     * @return A status of consistency of Instances&#39; versions with their target version specified by version field on Instance Group Manager.
     * 
     */
    public List<GetInstanceGroupManagerStatusVersionTarget> versionTargets() {
        return this.versionTargets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceGroupManagerStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetInstanceGroupManagerStatusAllInstancesConfig> allInstancesConfigs;
        private Boolean isStable;
        private List<GetInstanceGroupManagerStatusStateful> statefuls;
        private List<GetInstanceGroupManagerStatusVersionTarget> versionTargets;
        public Builder() {}
        public Builder(GetInstanceGroupManagerStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allInstancesConfigs = defaults.allInstancesConfigs;
    	      this.isStable = defaults.isStable;
    	      this.statefuls = defaults.statefuls;
    	      this.versionTargets = defaults.versionTargets;
        }

        @CustomType.Setter
        public Builder allInstancesConfigs(List<GetInstanceGroupManagerStatusAllInstancesConfig> allInstancesConfigs) {
            if (allInstancesConfigs == null) {
              throw new MissingRequiredPropertyException("GetInstanceGroupManagerStatus", "allInstancesConfigs");
            }
            this.allInstancesConfigs = allInstancesConfigs;
            return this;
        }
        public Builder allInstancesConfigs(GetInstanceGroupManagerStatusAllInstancesConfig... allInstancesConfigs) {
            return allInstancesConfigs(List.of(allInstancesConfigs));
        }
        @CustomType.Setter
        public Builder isStable(Boolean isStable) {
            if (isStable == null) {
              throw new MissingRequiredPropertyException("GetInstanceGroupManagerStatus", "isStable");
            }
            this.isStable = isStable;
            return this;
        }
        @CustomType.Setter
        public Builder statefuls(List<GetInstanceGroupManagerStatusStateful> statefuls) {
            if (statefuls == null) {
              throw new MissingRequiredPropertyException("GetInstanceGroupManagerStatus", "statefuls");
            }
            this.statefuls = statefuls;
            return this;
        }
        public Builder statefuls(GetInstanceGroupManagerStatusStateful... statefuls) {
            return statefuls(List.of(statefuls));
        }
        @CustomType.Setter
        public Builder versionTargets(List<GetInstanceGroupManagerStatusVersionTarget> versionTargets) {
            if (versionTargets == null) {
              throw new MissingRequiredPropertyException("GetInstanceGroupManagerStatus", "versionTargets");
            }
            this.versionTargets = versionTargets;
            return this;
        }
        public Builder versionTargets(GetInstanceGroupManagerStatusVersionTarget... versionTargets) {
            return versionTargets(List.of(versionTargets));
        }
        public GetInstanceGroupManagerStatus build() {
            final var _resultValue = new GetInstanceGroupManagerStatus();
            _resultValue.allInstancesConfigs = allInstancesConfigs;
            _resultValue.isStable = isStable;
            _resultValue.statefuls = statefuls;
            _resultValue.versionTargets = versionTargets;
            return _resultValue;
        }
    }
}
