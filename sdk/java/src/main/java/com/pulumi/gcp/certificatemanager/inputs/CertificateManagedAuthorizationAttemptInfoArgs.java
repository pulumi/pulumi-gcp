// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificatemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateManagedAuthorizationAttemptInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateManagedAuthorizationAttemptInfoArgs Empty = new CertificateManagedAuthorizationAttemptInfoArgs();

    /**
     * Human readable explanation for reaching the state. Provided to help
     * address the configuration issues.
     * Not guaranteed to be stable. For programmatic access use &#39;failure_reason&#39; field.
     * 
     */
    @Import(name="details")
    private @Nullable Output<String> details;

    /**
     * @return Human readable explanation for reaching the state. Provided to help
     * address the configuration issues.
     * Not guaranteed to be stable. For programmatic access use &#39;failure_reason&#39; field.
     * 
     */
    public Optional<Output<String>> details() {
        return Optional.ofNullable(this.details);
    }

    /**
     * Domain name of the authorization attempt.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return Domain name of the authorization attempt.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * Reason for failure of the authorization attempt for the domain.
     * 
     */
    @Import(name="failureReason")
    private @Nullable Output<String> failureReason;

    /**
     * @return Reason for failure of the authorization attempt for the domain.
     * 
     */
    public Optional<Output<String>> failureReason() {
        return Optional.ofNullable(this.failureReason);
    }

    /**
     * State of the domain for managed certificate issuance.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return State of the domain for managed certificate issuance.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private CertificateManagedAuthorizationAttemptInfoArgs() {}

    private CertificateManagedAuthorizationAttemptInfoArgs(CertificateManagedAuthorizationAttemptInfoArgs $) {
        this.details = $.details;
        this.domain = $.domain;
        this.failureReason = $.failureReason;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateManagedAuthorizationAttemptInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateManagedAuthorizationAttemptInfoArgs $;

        public Builder() {
            $ = new CertificateManagedAuthorizationAttemptInfoArgs();
        }

        public Builder(CertificateManagedAuthorizationAttemptInfoArgs defaults) {
            $ = new CertificateManagedAuthorizationAttemptInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param details Human readable explanation for reaching the state. Provided to help
         * address the configuration issues.
         * Not guaranteed to be stable. For programmatic access use &#39;failure_reason&#39; field.
         * 
         * @return builder
         * 
         */
        public Builder details(@Nullable Output<String> details) {
            $.details = details;
            return this;
        }

        /**
         * @param details Human readable explanation for reaching the state. Provided to help
         * address the configuration issues.
         * Not guaranteed to be stable. For programmatic access use &#39;failure_reason&#39; field.
         * 
         * @return builder
         * 
         */
        public Builder details(String details) {
            return details(Output.of(details));
        }

        /**
         * @param domain Domain name of the authorization attempt.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain Domain name of the authorization attempt.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param failureReason Reason for failure of the authorization attempt for the domain.
         * 
         * @return builder
         * 
         */
        public Builder failureReason(@Nullable Output<String> failureReason) {
            $.failureReason = failureReason;
            return this;
        }

        /**
         * @param failureReason Reason for failure of the authorization attempt for the domain.
         * 
         * @return builder
         * 
         */
        public Builder failureReason(String failureReason) {
            return failureReason(Output.of(failureReason));
        }

        /**
         * @param state State of the domain for managed certificate issuance.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state State of the domain for managed certificate issuance.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public CertificateManagedAuthorizationAttemptInfoArgs build() {
            return $;
        }
    }

}
