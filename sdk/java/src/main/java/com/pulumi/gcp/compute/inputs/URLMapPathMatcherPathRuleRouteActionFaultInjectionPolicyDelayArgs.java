// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs;
import java.lang.Double;
import java.util.Objects;


public final class URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs Empty = new URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs();

    /**
     * Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    @Import(name="fixedDelay", required=true)
    private Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay;

    /**
     * @return Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    public Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay() {
        return this.fixedDelay;
    }

    /**
     * The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    @Import(name="percentage", required=true)
    private Output<Double> percentage;

    /**
     * @return The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    public Output<Double> percentage() {
        return this.percentage;
    }

    private URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs() {}

    private URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs $) {
        this.fixedDelay = $.fixedDelay;
        this.percentage = $.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs $;

        public Builder() {
            $ = new URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs();
        }

        public Builder(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs defaults) {
            $ = new URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fixedDelay Specifies the value of the fixed delay interval.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fixedDelay(Output<URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay) {
            $.fixedDelay = fixedDelay;
            return this;
        }

        /**
         * @param fixedDelay Specifies the value of the fixed delay interval.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fixedDelay(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs fixedDelay) {
            return fixedDelay(Output.of(fixedDelay));
        }

        /**
         * @param percentage The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
         * The value must be between 0.0 and 100.0 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder percentage(Output<Double> percentage) {
            $.percentage = percentage;
            return this;
        }

        /**
         * @param percentage The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
         * The value must be between 0.0 and 100.0 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder percentage(Double percentage) {
            return percentage(Output.of(percentage));
        }

        public URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs build() {
            $.fixedDelay = Objects.requireNonNull($.fixedDelay, "expected parameter 'fixedDelay' to be non-null");
            $.percentage = Objects.requireNonNull($.percentage, "expected parameter 'percentage' to be non-null");
            return $;
        }
    }

}