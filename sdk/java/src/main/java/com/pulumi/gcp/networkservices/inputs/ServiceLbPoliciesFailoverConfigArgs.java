// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class ServiceLbPoliciesFailoverConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLbPoliciesFailoverConfigArgs Empty = new ServiceLbPoliciesFailoverConfigArgs();

    /**
     * Optional. The percentage threshold that a load balancer will begin to send traffic to failover backends. If the percentage of endpoints in a MIG/NEG is smaller than this value, traffic would be sent to failover backends if possible. This field should be set to a value between 1 and 99. The default value is 50 for Global external HTTP(S) load balancer (classic) and Proxyless service mesh, and 70 for others.
     * 
     */
    @Import(name="failoverHealthThreshold", required=true)
    private Output<Integer> failoverHealthThreshold;

    /**
     * @return Optional. The percentage threshold that a load balancer will begin to send traffic to failover backends. If the percentage of endpoints in a MIG/NEG is smaller than this value, traffic would be sent to failover backends if possible. This field should be set to a value between 1 and 99. The default value is 50 for Global external HTTP(S) load balancer (classic) and Proxyless service mesh, and 70 for others.
     * 
     */
    public Output<Integer> failoverHealthThreshold() {
        return this.failoverHealthThreshold;
    }

    private ServiceLbPoliciesFailoverConfigArgs() {}

    private ServiceLbPoliciesFailoverConfigArgs(ServiceLbPoliciesFailoverConfigArgs $) {
        this.failoverHealthThreshold = $.failoverHealthThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLbPoliciesFailoverConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLbPoliciesFailoverConfigArgs $;

        public Builder() {
            $ = new ServiceLbPoliciesFailoverConfigArgs();
        }

        public Builder(ServiceLbPoliciesFailoverConfigArgs defaults) {
            $ = new ServiceLbPoliciesFailoverConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failoverHealthThreshold Optional. The percentage threshold that a load balancer will begin to send traffic to failover backends. If the percentage of endpoints in a MIG/NEG is smaller than this value, traffic would be sent to failover backends if possible. This field should be set to a value between 1 and 99. The default value is 50 for Global external HTTP(S) load balancer (classic) and Proxyless service mesh, and 70 for others.
         * 
         * @return builder
         * 
         */
        public Builder failoverHealthThreshold(Output<Integer> failoverHealthThreshold) {
            $.failoverHealthThreshold = failoverHealthThreshold;
            return this;
        }

        /**
         * @param failoverHealthThreshold Optional. The percentage threshold that a load balancer will begin to send traffic to failover backends. If the percentage of endpoints in a MIG/NEG is smaller than this value, traffic would be sent to failover backends if possible. This field should be set to a value between 1 and 99. The default value is 50 for Global external HTTP(S) load balancer (classic) and Proxyless service mesh, and 70 for others.
         * 
         * @return builder
         * 
         */
        public Builder failoverHealthThreshold(Integer failoverHealthThreshold) {
            return failoverHealthThreshold(Output.of(failoverHealthThreshold));
        }

        public ServiceLbPoliciesFailoverConfigArgs build() {
            if ($.failoverHealthThreshold == null) {
                throw new MissingRequiredPropertyException("ServiceLbPoliciesFailoverConfigArgs", "failoverHealthThreshold");
            }
            return $;
        }
    }

}
