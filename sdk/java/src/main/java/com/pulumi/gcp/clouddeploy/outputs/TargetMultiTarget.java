// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TargetMultiTarget {
    /**
     * @return Required. The target_ids of this multiTarget.
     * 
     */
    private List<String> targetIds;

    private TargetMultiTarget() {}
    /**
     * @return Required. The target_ids of this multiTarget.
     * 
     */
    public List<String> targetIds() {
        return this.targetIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetMultiTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> targetIds;
        public Builder() {}
        public Builder(TargetMultiTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetIds = defaults.targetIds;
        }

        @CustomType.Setter
        public Builder targetIds(List<String> targetIds) {
            this.targetIds = Objects.requireNonNull(targetIds);
            return this;
        }
        public Builder targetIds(String... targetIds) {
            return targetIds(List.of(targetIds));
        }
        public TargetMultiTarget build() {
            final var o = new TargetMultiTarget();
            o.targetIds = targetIds;
            return o;
        }
    }
}