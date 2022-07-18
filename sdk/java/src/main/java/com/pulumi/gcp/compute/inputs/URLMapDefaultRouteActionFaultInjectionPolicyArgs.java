// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs;
import com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyDelayArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapDefaultRouteActionFaultInjectionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapDefaultRouteActionFaultInjectionPolicyArgs Empty = new URLMapDefaultRouteActionFaultInjectionPolicyArgs();

    /**
     * The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * 
     */
    @Import(name="abort")
    private @Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs> abort;

    /**
     * @return The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs>> abort() {
        return Optional.ofNullable(this.abort);
    }

    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    @Import(name="delay")
    private @Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyDelayArgs> delay;

    /**
     * @return The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapDefaultRouteActionFaultInjectionPolicyDelayArgs>> delay() {
        return Optional.ofNullable(this.delay);
    }

    private URLMapDefaultRouteActionFaultInjectionPolicyArgs() {}

    private URLMapDefaultRouteActionFaultInjectionPolicyArgs(URLMapDefaultRouteActionFaultInjectionPolicyArgs $) {
        this.abort = $.abort;
        this.delay = $.delay;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapDefaultRouteActionFaultInjectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapDefaultRouteActionFaultInjectionPolicyArgs $;

        public Builder() {
            $ = new URLMapDefaultRouteActionFaultInjectionPolicyArgs();
        }

        public Builder(URLMapDefaultRouteActionFaultInjectionPolicyArgs defaults) {
            $ = new URLMapDefaultRouteActionFaultInjectionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param abort The specification for how client requests are aborted as part of fault injection.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder abort(@Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs> abort) {
            $.abort = abort;
            return this;
        }

        /**
         * @param abort The specification for how client requests are aborted as part of fault injection.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder abort(URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs abort) {
            return abort(Output.of(abort));
        }

        /**
         * @param delay The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder delay(@Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyDelayArgs> delay) {
            $.delay = delay;
            return this;
        }

        /**
         * @param delay The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder delay(URLMapDefaultRouteActionFaultInjectionPolicyDelayArgs delay) {
            return delay(Output.of(delay));
        }

        public URLMapDefaultRouteActionFaultInjectionPolicyArgs build() {
            return $;
        }
    }

}