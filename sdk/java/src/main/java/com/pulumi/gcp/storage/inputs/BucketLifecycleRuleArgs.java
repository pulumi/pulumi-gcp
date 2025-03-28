// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.storage.inputs.BucketLifecycleRuleActionArgs;
import com.pulumi.gcp.storage.inputs.BucketLifecycleRuleConditionArgs;
import java.util.Objects;


public final class BucketLifecycleRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleArgs Empty = new BucketLifecycleRuleArgs();

    /**
     * The Lifecycle Rule&#39;s action configuration. A single block of this type is supported. Structure is documented below.
     * 
     */
    @Import(name="action", required=true)
    private Output<BucketLifecycleRuleActionArgs> action;

    /**
     * @return The Lifecycle Rule&#39;s action configuration. A single block of this type is supported. Structure is documented below.
     * 
     */
    public Output<BucketLifecycleRuleActionArgs> action() {
        return this.action;
    }

    /**
     * The Lifecycle Rule&#39;s condition configuration. A single block of this type is supported. Structure is documented below.
     * 
     */
    @Import(name="condition", required=true)
    private Output<BucketLifecycleRuleConditionArgs> condition;

    /**
     * @return The Lifecycle Rule&#39;s condition configuration. A single block of this type is supported. Structure is documented below.
     * 
     */
    public Output<BucketLifecycleRuleConditionArgs> condition() {
        return this.condition;
    }

    private BucketLifecycleRuleArgs() {}

    private BucketLifecycleRuleArgs(BucketLifecycleRuleArgs $) {
        this.action = $.action;
        this.condition = $.condition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketLifecycleRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketLifecycleRuleArgs $;

        public Builder() {
            $ = new BucketLifecycleRuleArgs();
        }

        public Builder(BucketLifecycleRuleArgs defaults) {
            $ = new BucketLifecycleRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The Lifecycle Rule&#39;s action configuration. A single block of this type is supported. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<BucketLifecycleRuleActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The Lifecycle Rule&#39;s action configuration. A single block of this type is supported. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder action(BucketLifecycleRuleActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param condition The Lifecycle Rule&#39;s condition configuration. A single block of this type is supported. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder condition(Output<BucketLifecycleRuleConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition The Lifecycle Rule&#39;s condition configuration. A single block of this type is supported. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder condition(BucketLifecycleRuleConditionArgs condition) {
            return condition(Output.of(condition));
        }

        public BucketLifecycleRuleArgs build() {
            if ($.action == null) {
                throw new MissingRequiredPropertyException("BucketLifecycleRuleArgs", "action");
            }
            if ($.condition == null) {
                throw new MissingRequiredPropertyException("BucketLifecycleRuleArgs", "condition");
            }
            return $;
        }
    }

}
