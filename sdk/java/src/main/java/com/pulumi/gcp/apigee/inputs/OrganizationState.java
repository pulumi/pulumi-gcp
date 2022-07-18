// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationState extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationState Empty = new OrganizationState();

    /**
     * Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
     * 
     */
    @Import(name="analyticsRegion")
    private @Nullable Output<String> analyticsRegion;

    /**
     * @return Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
     * 
     */
    public Optional<Output<String>> analyticsRegion() {
        return Optional.ofNullable(this.analyticsRegion);
    }

    /**
     * Compute Engine network used for Service Networking to be peered with Apigee runtime instances.
     * See [Getting started with the Service Networking API](https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started).
     * Valid only when `RuntimeType` is set to CLOUD. The value can be updated only when there are no runtime instances. For example: &#34;default&#34;.
     * 
     */
    @Import(name="authorizedNetwork")
    private @Nullable Output<String> authorizedNetwork;

    /**
     * @return Compute Engine network used for Service Networking to be peered with Apigee runtime instances.
     * See [Getting started with the Service Networking API](https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started).
     * Valid only when `RuntimeType` is set to CLOUD. The value can be updated only when there are no runtime instances. For example: &#34;default&#34;.
     * 
     */
    public Optional<Output<String>> authorizedNetwork() {
        return Optional.ofNullable(this.authorizedNetwork);
    }

    /**
     * Billing type of the Apigee organization. See [Apigee pricing](https://cloud.google.com/apigee/pricing).
     * 
     */
    @Import(name="billingType")
    private @Nullable Output<String> billingType;

    /**
     * @return Billing type of the Apigee organization. See [Apigee pricing](https://cloud.google.com/apigee/pricing).
     * 
     */
    public Optional<Output<String>> billingType() {
        return Optional.ofNullable(this.billingType);
    }

    /**
     * Output only. Base64-encoded public certificate for the root CA of the Apigee organization. Valid only when &#39;RuntimeType&#39;
     * is CLOUD. A base64-encoded string.
     * 
     */
    @Import(name="caCertificate")
    private @Nullable Output<String> caCertificate;

    /**
     * @return Output only. Base64-encoded public certificate for the root CA of the Apigee organization. Valid only when &#39;RuntimeType&#39;
     * is CLOUD. A base64-encoded string.
     * 
     */
    public Optional<Output<String>> caCertificate() {
        return Optional.ofNullable(this.caCertificate);
    }

    /**
     * Description of the Apigee organization.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the Apigee organization.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name of the Apigee organization.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name of the Apigee organization.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Output only. Name of the Apigee organization.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Output only. Name of the Apigee organization.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The project ID associated with the Apigee organization.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The project ID associated with the Apigee organization.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Cloud KMS key name used for encrypting the data that is stored and replicated across runtime instances.
     * Update is not allowed after the organization is created.
     * If not specified, a Google-Managed encryption key will be used.
     * Valid only when `RuntimeType` is CLOUD. For example: `projects/foo/locations/us/keyRings/bar/cryptoKeys/baz`.
     * 
     */
    @Import(name="runtimeDatabaseEncryptionKeyName")
    private @Nullable Output<String> runtimeDatabaseEncryptionKeyName;

    /**
     * @return Cloud KMS key name used for encrypting the data that is stored and replicated across runtime instances.
     * Update is not allowed after the organization is created.
     * If not specified, a Google-Managed encryption key will be used.
     * Valid only when `RuntimeType` is CLOUD. For example: `projects/foo/locations/us/keyRings/bar/cryptoKeys/baz`.
     * 
     */
    public Optional<Output<String>> runtimeDatabaseEncryptionKeyName() {
        return Optional.ofNullable(this.runtimeDatabaseEncryptionKeyName);
    }

    /**
     * Runtime type of the Apigee organization based on the Apigee subscription purchased.
     * Default value is `CLOUD`.
     * Possible values are `CLOUD` and `HYBRID`.
     * 
     */
    @Import(name="runtimeType")
    private @Nullable Output<String> runtimeType;

    /**
     * @return Runtime type of the Apigee organization based on the Apigee subscription purchased.
     * Default value is `CLOUD`.
     * Possible values are `CLOUD` and `HYBRID`.
     * 
     */
    public Optional<Output<String>> runtimeType() {
        return Optional.ofNullable(this.runtimeType);
    }

    /**
     * Output only. Subscription type of the Apigee organization. Valid values include trial (free, limited, and for evaluation
     * purposes only) or paid (full subscription has been purchased).
     * 
     */
    @Import(name="subscriptionType")
    private @Nullable Output<String> subscriptionType;

    /**
     * @return Output only. Subscription type of the Apigee organization. Valid values include trial (free, limited, and for evaluation
     * purposes only) or paid (full subscription has been purchased).
     * 
     */
    public Optional<Output<String>> subscriptionType() {
        return Optional.ofNullable(this.subscriptionType);
    }

    private OrganizationState() {}

    private OrganizationState(OrganizationState $) {
        this.analyticsRegion = $.analyticsRegion;
        this.authorizedNetwork = $.authorizedNetwork;
        this.billingType = $.billingType;
        this.caCertificate = $.caCertificate;
        this.description = $.description;
        this.displayName = $.displayName;
        this.name = $.name;
        this.projectId = $.projectId;
        this.runtimeDatabaseEncryptionKeyName = $.runtimeDatabaseEncryptionKeyName;
        this.runtimeType = $.runtimeType;
        this.subscriptionType = $.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationState $;

        public Builder() {
            $ = new OrganizationState();
        }

        public Builder(OrganizationState defaults) {
            $ = new OrganizationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param analyticsRegion Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
         * 
         * @return builder
         * 
         */
        public Builder analyticsRegion(@Nullable Output<String> analyticsRegion) {
            $.analyticsRegion = analyticsRegion;
            return this;
        }

        /**
         * @param analyticsRegion Primary GCP region for analytics data storage. For valid values, see [Create an Apigee organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org).
         * 
         * @return builder
         * 
         */
        public Builder analyticsRegion(String analyticsRegion) {
            return analyticsRegion(Output.of(analyticsRegion));
        }

        /**
         * @param authorizedNetwork Compute Engine network used for Service Networking to be peered with Apigee runtime instances.
         * See [Getting started with the Service Networking API](https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started).
         * Valid only when `RuntimeType` is set to CLOUD. The value can be updated only when there are no runtime instances. For example: &#34;default&#34;.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetwork(@Nullable Output<String> authorizedNetwork) {
            $.authorizedNetwork = authorizedNetwork;
            return this;
        }

        /**
         * @param authorizedNetwork Compute Engine network used for Service Networking to be peered with Apigee runtime instances.
         * See [Getting started with the Service Networking API](https://cloud.google.com/service-infrastructure/docs/service-networking/getting-started).
         * Valid only when `RuntimeType` is set to CLOUD. The value can be updated only when there are no runtime instances. For example: &#34;default&#34;.
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetwork(String authorizedNetwork) {
            return authorizedNetwork(Output.of(authorizedNetwork));
        }

        /**
         * @param billingType Billing type of the Apigee organization. See [Apigee pricing](https://cloud.google.com/apigee/pricing).
         * 
         * @return builder
         * 
         */
        public Builder billingType(@Nullable Output<String> billingType) {
            $.billingType = billingType;
            return this;
        }

        /**
         * @param billingType Billing type of the Apigee organization. See [Apigee pricing](https://cloud.google.com/apigee/pricing).
         * 
         * @return builder
         * 
         */
        public Builder billingType(String billingType) {
            return billingType(Output.of(billingType));
        }

        /**
         * @param caCertificate Output only. Base64-encoded public certificate for the root CA of the Apigee organization. Valid only when &#39;RuntimeType&#39;
         * is CLOUD. A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder caCertificate(@Nullable Output<String> caCertificate) {
            $.caCertificate = caCertificate;
            return this;
        }

        /**
         * @param caCertificate Output only. Base64-encoded public certificate for the root CA of the Apigee organization. Valid only when &#39;RuntimeType&#39;
         * is CLOUD. A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder caCertificate(String caCertificate) {
            return caCertificate(Output.of(caCertificate));
        }

        /**
         * @param description Description of the Apigee organization.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the Apigee organization.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The display name of the Apigee organization.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the Apigee organization.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param name Output only. Name of the Apigee organization.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Output only. Name of the Apigee organization.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId The project ID associated with the Apigee organization.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The project ID associated with the Apigee organization.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param runtimeDatabaseEncryptionKeyName Cloud KMS key name used for encrypting the data that is stored and replicated across runtime instances.
         * Update is not allowed after the organization is created.
         * If not specified, a Google-Managed encryption key will be used.
         * Valid only when `RuntimeType` is CLOUD. For example: `projects/foo/locations/us/keyRings/bar/cryptoKeys/baz`.
         * 
         * @return builder
         * 
         */
        public Builder runtimeDatabaseEncryptionKeyName(@Nullable Output<String> runtimeDatabaseEncryptionKeyName) {
            $.runtimeDatabaseEncryptionKeyName = runtimeDatabaseEncryptionKeyName;
            return this;
        }

        /**
         * @param runtimeDatabaseEncryptionKeyName Cloud KMS key name used for encrypting the data that is stored and replicated across runtime instances.
         * Update is not allowed after the organization is created.
         * If not specified, a Google-Managed encryption key will be used.
         * Valid only when `RuntimeType` is CLOUD. For example: `projects/foo/locations/us/keyRings/bar/cryptoKeys/baz`.
         * 
         * @return builder
         * 
         */
        public Builder runtimeDatabaseEncryptionKeyName(String runtimeDatabaseEncryptionKeyName) {
            return runtimeDatabaseEncryptionKeyName(Output.of(runtimeDatabaseEncryptionKeyName));
        }

        /**
         * @param runtimeType Runtime type of the Apigee organization based on the Apigee subscription purchased.
         * Default value is `CLOUD`.
         * Possible values are `CLOUD` and `HYBRID`.
         * 
         * @return builder
         * 
         */
        public Builder runtimeType(@Nullable Output<String> runtimeType) {
            $.runtimeType = runtimeType;
            return this;
        }

        /**
         * @param runtimeType Runtime type of the Apigee organization based on the Apigee subscription purchased.
         * Default value is `CLOUD`.
         * Possible values are `CLOUD` and `HYBRID`.
         * 
         * @return builder
         * 
         */
        public Builder runtimeType(String runtimeType) {
            return runtimeType(Output.of(runtimeType));
        }

        /**
         * @param subscriptionType Output only. Subscription type of the Apigee organization. Valid values include trial (free, limited, and for evaluation
         * purposes only) or paid (full subscription has been purchased).
         * 
         * @return builder
         * 
         */
        public Builder subscriptionType(@Nullable Output<String> subscriptionType) {
            $.subscriptionType = subscriptionType;
            return this;
        }

        /**
         * @param subscriptionType Output only. Subscription type of the Apigee organization. Valid values include trial (free, limited, and for evaluation
         * purposes only) or paid (full subscription has been purchased).
         * 
         * @return builder
         * 
         */
        public Builder subscriptionType(String subscriptionType) {
            return subscriptionType(Output.of(subscriptionType));
        }

        public OrganizationState build() {
            return $;
        }
    }

}