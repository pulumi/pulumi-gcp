// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsEnrolledServiceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessApprovalSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessApprovalSettingsArgs Empty = new AccessApprovalSettingsArgs();

    /**
     * The asymmetric crypto key version to use for signing approval requests.
     * Empty active_key_version indicates that a Google-managed key should be used for signing.
     * 
     */
    @Import(name="activeKeyVersion")
    private @Nullable Output<String> activeKeyVersion;

    /**
     * @return The asymmetric crypto key version to use for signing approval requests.
     * Empty active_key_version indicates that a Google-managed key should be used for signing.
     * 
     */
    public Optional<Output<String>> activeKeyVersion() {
        return Optional.ofNullable(this.activeKeyVersion);
    }

    /**
     * A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can be done for individual services.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    @Import(name="enrolledServices", required=true)
    private Output<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices;

    /**
     * @return A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can be done for individual services.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    public Output<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices() {
        return this.enrolledServices;
    }

    /**
     * A list of email addresses to which notifications relating to approval requests should be sent.
     * Notifications relating to a resource will be sent to all emails in the settings of ancestor
     * resources of that resource. A maximum of 50 email addresses are allowed.
     * 
     */
    @Import(name="notificationEmails")
    private @Nullable Output<List<String>> notificationEmails;

    /**
     * @return A list of email addresses to which notifications relating to approval requests should be sent.
     * Notifications relating to a resource will be sent to all emails in the settings of ancestor
     * resources of that resource. A maximum of 50 email addresses are allowed.
     * 
     */
    public Optional<Output<List<String>>> notificationEmails() {
        return Optional.ofNullable(this.notificationEmails);
    }

    /**
     * ID of the organization of the access approval settings.
     * 
     */
    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    /**
     * @return ID of the organization of the access approval settings.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    private AccessApprovalSettingsArgs() {}

    private AccessApprovalSettingsArgs(AccessApprovalSettingsArgs $) {
        this.activeKeyVersion = $.activeKeyVersion;
        this.enrolledServices = $.enrolledServices;
        this.notificationEmails = $.notificationEmails;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessApprovalSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessApprovalSettingsArgs $;

        public Builder() {
            $ = new AccessApprovalSettingsArgs();
        }

        public Builder(AccessApprovalSettingsArgs defaults) {
            $ = new AccessApprovalSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activeKeyVersion The asymmetric crypto key version to use for signing approval requests.
         * Empty active_key_version indicates that a Google-managed key should be used for signing.
         * 
         * @return builder
         * 
         */
        public Builder activeKeyVersion(@Nullable Output<String> activeKeyVersion) {
            $.activeKeyVersion = activeKeyVersion;
            return this;
        }

        /**
         * @param activeKeyVersion The asymmetric crypto key version to use for signing approval requests.
         * Empty active_key_version indicates that a Google-managed key should be used for signing.
         * 
         * @return builder
         * 
         */
        public Builder activeKeyVersion(String activeKeyVersion) {
            return activeKeyVersion(Output.of(activeKeyVersion));
        }

        /**
         * @param enrolledServices A list of Google Cloud Services for which the given resource has Access Approval enrolled.
         * Access requests for the resource given by name against any of these services contained here will be required
         * to have explicit approval. Enrollment can be done for individual services.
         * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder enrolledServices(Output<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices) {
            $.enrolledServices = enrolledServices;
            return this;
        }

        /**
         * @param enrolledServices A list of Google Cloud Services for which the given resource has Access Approval enrolled.
         * Access requests for the resource given by name against any of these services contained here will be required
         * to have explicit approval. Enrollment can be done for individual services.
         * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder enrolledServices(List<AccessApprovalSettingsEnrolledServiceArgs> enrolledServices) {
            return enrolledServices(Output.of(enrolledServices));
        }

        /**
         * @param enrolledServices A list of Google Cloud Services for which the given resource has Access Approval enrolled.
         * Access requests for the resource given by name against any of these services contained here will be required
         * to have explicit approval. Enrollment can be done for individual services.
         * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder enrolledServices(AccessApprovalSettingsEnrolledServiceArgs... enrolledServices) {
            return enrolledServices(List.of(enrolledServices));
        }

        /**
         * @param notificationEmails A list of email addresses to which notifications relating to approval requests should be sent.
         * Notifications relating to a resource will be sent to all emails in the settings of ancestor
         * resources of that resource. A maximum of 50 email addresses are allowed.
         * 
         * @return builder
         * 
         */
        public Builder notificationEmails(@Nullable Output<List<String>> notificationEmails) {
            $.notificationEmails = notificationEmails;
            return this;
        }

        /**
         * @param notificationEmails A list of email addresses to which notifications relating to approval requests should be sent.
         * Notifications relating to a resource will be sent to all emails in the settings of ancestor
         * resources of that resource. A maximum of 50 email addresses are allowed.
         * 
         * @return builder
         * 
         */
        public Builder notificationEmails(List<String> notificationEmails) {
            return notificationEmails(Output.of(notificationEmails));
        }

        /**
         * @param notificationEmails A list of email addresses to which notifications relating to approval requests should be sent.
         * Notifications relating to a resource will be sent to all emails in the settings of ancestor
         * resources of that resource. A maximum of 50 email addresses are allowed.
         * 
         * @return builder
         * 
         */
        public Builder notificationEmails(String... notificationEmails) {
            return notificationEmails(List.of(notificationEmails));
        }

        /**
         * @param organizationId ID of the organization of the access approval settings.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId ID of the organization of the access approval settings.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public AccessApprovalSettingsArgs build() {
            $.enrolledServices = Objects.requireNonNull($.enrolledServices, "expected parameter 'enrolledServices' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}