// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs Empty = new SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs();

    /**
     * External redirection target when &#34;EXTERNAL_302&#34; is set in &#39;type&#39;.
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    /**
     * @return External redirection target when &#34;EXTERNAL_302&#34; is set in &#39;type&#39;.
     * 
     */
    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    /**
     * Type of redirect action.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of redirect action.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs() {}

    private SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs(SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs $) {
        this.target = $.target;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs $;

        public Builder() {
            $ = new SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs();
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs defaults) {
            $ = new SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param target External redirection target when &#34;EXTERNAL_302&#34; is set in &#39;type&#39;.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target External redirection target when &#34;EXTERNAL_302&#34; is set in &#39;type&#39;.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param type Type of redirect action.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of redirect action.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}