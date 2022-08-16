// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificatemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateManagedProvisioningIssueArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateManagedProvisioningIssueArgs Empty = new CertificateManagedProvisioningIssueArgs();

    /**
     * - 
     * Human readable explanation for reaching the state. Provided to help
     * address the configuration issues.
     * Not guaranteed to be stable. For programmatic access use `failure_reason` field.
     * 
     */
    @Import(name="details")
    private @Nullable Output<String> details;

    /**
     * @return -
     * Human readable explanation for reaching the state. Provided to help
     * address the configuration issues.
     * Not guaranteed to be stable. For programmatic access use `failure_reason` field.
     * 
     */
    public Optional<Output<String>> details() {
        return Optional.ofNullable(this.details);
    }

    /**
     * - 
     * Reason for provisioning failures.
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return -
     * Reason for provisioning failures.
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    private CertificateManagedProvisioningIssueArgs() {}

    private CertificateManagedProvisioningIssueArgs(CertificateManagedProvisioningIssueArgs $) {
        this.details = $.details;
        this.reason = $.reason;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateManagedProvisioningIssueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateManagedProvisioningIssueArgs $;

        public Builder() {
            $ = new CertificateManagedProvisioningIssueArgs();
        }

        public Builder(CertificateManagedProvisioningIssueArgs defaults) {
            $ = new CertificateManagedProvisioningIssueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param details -
         * Human readable explanation for reaching the state. Provided to help
         * address the configuration issues.
         * Not guaranteed to be stable. For programmatic access use `failure_reason` field.
         * 
         * @return builder
         * 
         */
        public Builder details(@Nullable Output<String> details) {
            $.details = details;
            return this;
        }

        /**
         * @param details -
         * Human readable explanation for reaching the state. Provided to help
         * address the configuration issues.
         * Not guaranteed to be stable. For programmatic access use `failure_reason` field.
         * 
         * @return builder
         * 
         */
        public Builder details(String details) {
            return details(Output.of(details));
        }

        /**
         * @param reason -
         * Reason for provisioning failures.
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason -
         * Reason for provisioning failures.
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        public CertificateManagedProvisioningIssueArgs build() {
            return $;
        }
    }

}