// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicIngestionDataSourceSettingsAzureEventHubs {
    /**
     * @return The Azure event hub client ID to use for ingestion.
     * 
     */
    private @Nullable String clientId;
    /**
     * @return The Azure event hub to ingest data from.
     * 
     */
    private @Nullable String eventHub;
    /**
     * @return The GCP service account to be used for Federated Identity authentication
     * with Azure (via a `AssumeRoleWithWebIdentity` call for the provided
     * role).
     * 
     */
    private @Nullable String gcpServiceAccount;
    /**
     * @return The Azure event hub namespace to ingest data from.
     * 
     */
    private @Nullable String namespace;
    /**
     * @return The name of the resource group within an Azure subscription.
     * 
     */
    private @Nullable String resourceGroup;
    /**
     * @return The Azure event hub subscription ID to use for ingestion.
     * 
     */
    private @Nullable String subscriptionId;
    /**
     * @return The Azure event hub tenant ID to use for ingestion.
     * 
     */
    private @Nullable String tenantId;

    private TopicIngestionDataSourceSettingsAzureEventHubs() {}
    /**
     * @return The Azure event hub client ID to use for ingestion.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The Azure event hub to ingest data from.
     * 
     */
    public Optional<String> eventHub() {
        return Optional.ofNullable(this.eventHub);
    }
    /**
     * @return The GCP service account to be used for Federated Identity authentication
     * with Azure (via a `AssumeRoleWithWebIdentity` call for the provided
     * role).
     * 
     */
    public Optional<String> gcpServiceAccount() {
        return Optional.ofNullable(this.gcpServiceAccount);
    }
    /**
     * @return The Azure event hub namespace to ingest data from.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return The name of the resource group within an Azure subscription.
     * 
     */
    public Optional<String> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * @return The Azure event hub subscription ID to use for ingestion.
     * 
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }
    /**
     * @return The Azure event hub tenant ID to use for ingestion.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicIngestionDataSourceSettingsAzureEventHubs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String eventHub;
        private @Nullable String gcpServiceAccount;
        private @Nullable String namespace;
        private @Nullable String resourceGroup;
        private @Nullable String subscriptionId;
        private @Nullable String tenantId;
        public Builder() {}
        public Builder(TopicIngestionDataSourceSettingsAzureEventHubs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.eventHub = defaults.eventHub;
    	      this.gcpServiceAccount = defaults.gcpServiceAccount;
    	      this.namespace = defaults.namespace;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
        }

        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {

            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder eventHub(@Nullable String eventHub) {

            this.eventHub = eventHub;
            return this;
        }
        @CustomType.Setter
        public Builder gcpServiceAccount(@Nullable String gcpServiceAccount) {

            this.gcpServiceAccount = gcpServiceAccount;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroup(@Nullable String resourceGroup) {

            this.resourceGroup = resourceGroup;
            return this;
        }
        @CustomType.Setter
        public Builder subscriptionId(@Nullable String subscriptionId) {

            this.subscriptionId = subscriptionId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(@Nullable String tenantId) {

            this.tenantId = tenantId;
            return this;
        }
        public TopicIngestionDataSourceSettingsAzureEventHubs build() {
            final var _resultValue = new TopicIngestionDataSourceSettingsAzureEventHubs();
            _resultValue.clientId = clientId;
            _resultValue.eventHub = eventHub;
            _resultValue.gcpServiceAccount = gcpServiceAccount;
            _resultValue.namespace = namespace;
            _resultValue.resourceGroup = resourceGroup;
            _resultValue.subscriptionId = subscriptionId;
            _resultValue.tenantId = tenantId;
            return _resultValue;
        }
    }
}
