// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.storage.outputs.BucketLifecycleRuleAction;
import com.pulumi.gcp.storage.outputs.BucketLifecycleRuleCondition;
import java.util.Objects;

@CustomType
public final class BucketLifecycleRule {
    /**
     * @return The Lifecycle Rule&#39;s action configuration. A single block of this type is supported. Structure is documented below.
     * 
     */
    private final BucketLifecycleRuleAction action;
    /**
     * @return The Lifecycle Rule&#39;s condition configuration. A single block of this type is supported. Structure is documented below.
     * 
     */
    private final BucketLifecycleRuleCondition condition;

    @CustomType.Constructor
    private BucketLifecycleRule(
        @CustomType.Parameter("action") BucketLifecycleRuleAction action,
        @CustomType.Parameter("condition") BucketLifecycleRuleCondition condition) {
        this.action = action;
        this.condition = condition;
    }

    /**
     * @return The Lifecycle Rule&#39;s action configuration. A single block of this type is supported. Structure is documented below.
     * 
     */
    public BucketLifecycleRuleAction action() {
        return this.action;
    }
    /**
     * @return The Lifecycle Rule&#39;s condition configuration. A single block of this type is supported. Structure is documented below.
     * 
     */
    public BucketLifecycleRuleCondition condition() {
        return this.condition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketLifecycleRuleAction action;
        private BucketLifecycleRuleCondition condition;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.condition = defaults.condition;
        }

        public Builder action(BucketLifecycleRuleAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder condition(BucketLifecycleRuleCondition condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }        public BucketLifecycleRule build() {
            return new BucketLifecycleRule(action, condition);
        }
    }
}