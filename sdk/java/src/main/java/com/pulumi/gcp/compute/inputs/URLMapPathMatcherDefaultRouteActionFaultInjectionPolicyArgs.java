// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs Empty = new URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs();

    /**
     * The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * 
     */
    @Import(name="abort")
    private @Nullable Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs> abort;

    /**
     * @return The specification for how client requests are aborted as part of fault injection.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs>> abort() {
        return Optional.ofNullable(this.abort);
    }

    /**
     * The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    @Import(name="delay")
    private @Nullable Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs> delay;

    /**
     * @return The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs>> delay() {
        return Optional.ofNullable(this.delay);
    }

    private URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs() {}

    private URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs $) {
        this.abort = $.abort;
        this.delay = $.delay;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs $;

        public Builder() {
            $ = new URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs();
        }

        public Builder(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs defaults) {
            $ = new URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param abort The specification for how client requests are aborted as part of fault injection.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder abort(@Nullable Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs> abort) {
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
        public Builder abort(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyAbortArgs abort) {
            return abort(Output.of(abort));
        }

        /**
         * @param delay The specification for how client requests are delayed as part of fault injection, before being sent to a backend service.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder delay(@Nullable Output<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs> delay) {
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
        public Builder delay(URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyDelayArgs delay) {
            return delay(Output.of(delay));
        }

        public URLMapPathMatcherDefaultRouteActionFaultInjectionPolicyArgs build() {
            return $;
        }
    }

}
