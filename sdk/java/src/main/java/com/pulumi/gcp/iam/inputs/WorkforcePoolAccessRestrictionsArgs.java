// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.iam.inputs.WorkforcePoolAccessRestrictionsAllowedServiceArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkforcePoolAccessRestrictionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkforcePoolAccessRestrictionsArgs Empty = new WorkforcePoolAccessRestrictionsArgs();

    /**
     * Services allowed for web sign-in with the workforce pool.
     * If not set by default there are no restrictions.
     * Structure is documented below.
     * 
     */
    @Import(name="allowedServices")
    private @Nullable Output<List<WorkforcePoolAccessRestrictionsAllowedServiceArgs>> allowedServices;

    /**
     * @return Services allowed for web sign-in with the workforce pool.
     * If not set by default there are no restrictions.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<WorkforcePoolAccessRestrictionsAllowedServiceArgs>>> allowedServices() {
        return Optional.ofNullable(this.allowedServices);
    }

    /**
     * Disable programmatic sign-in by disabling token issue via the Security Token API endpoint.
     * See [Security Token Service API](https://cloud.google.com/iam/docs/reference/sts/rest).
     * 
     */
    @Import(name="disableProgrammaticSignin")
    private @Nullable Output<Boolean> disableProgrammaticSignin;

    /**
     * @return Disable programmatic sign-in by disabling token issue via the Security Token API endpoint.
     * See [Security Token Service API](https://cloud.google.com/iam/docs/reference/sts/rest).
     * 
     */
    public Optional<Output<Boolean>> disableProgrammaticSignin() {
        return Optional.ofNullable(this.disableProgrammaticSignin);
    }

    private WorkforcePoolAccessRestrictionsArgs() {}

    private WorkforcePoolAccessRestrictionsArgs(WorkforcePoolAccessRestrictionsArgs $) {
        this.allowedServices = $.allowedServices;
        this.disableProgrammaticSignin = $.disableProgrammaticSignin;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkforcePoolAccessRestrictionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkforcePoolAccessRestrictionsArgs $;

        public Builder() {
            $ = new WorkforcePoolAccessRestrictionsArgs();
        }

        public Builder(WorkforcePoolAccessRestrictionsArgs defaults) {
            $ = new WorkforcePoolAccessRestrictionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedServices Services allowed for web sign-in with the workforce pool.
         * If not set by default there are no restrictions.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder allowedServices(@Nullable Output<List<WorkforcePoolAccessRestrictionsAllowedServiceArgs>> allowedServices) {
            $.allowedServices = allowedServices;
            return this;
        }

        /**
         * @param allowedServices Services allowed for web sign-in with the workforce pool.
         * If not set by default there are no restrictions.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder allowedServices(List<WorkforcePoolAccessRestrictionsAllowedServiceArgs> allowedServices) {
            return allowedServices(Output.of(allowedServices));
        }

        /**
         * @param allowedServices Services allowed for web sign-in with the workforce pool.
         * If not set by default there are no restrictions.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder allowedServices(WorkforcePoolAccessRestrictionsAllowedServiceArgs... allowedServices) {
            return allowedServices(List.of(allowedServices));
        }

        /**
         * @param disableProgrammaticSignin Disable programmatic sign-in by disabling token issue via the Security Token API endpoint.
         * See [Security Token Service API](https://cloud.google.com/iam/docs/reference/sts/rest).
         * 
         * @return builder
         * 
         */
        public Builder disableProgrammaticSignin(@Nullable Output<Boolean> disableProgrammaticSignin) {
            $.disableProgrammaticSignin = disableProgrammaticSignin;
            return this;
        }

        /**
         * @param disableProgrammaticSignin Disable programmatic sign-in by disabling token issue via the Security Token API endpoint.
         * See [Security Token Service API](https://cloud.google.com/iam/docs/reference/sts/rest).
         * 
         * @return builder
         * 
         */
        public Builder disableProgrammaticSignin(Boolean disableProgrammaticSignin) {
            return disableProgrammaticSignin(Output.of(disableProgrammaticSignin));
        }

        public WorkforcePoolAccessRestrictionsArgs build() {
            return $;
        }
    }

}
