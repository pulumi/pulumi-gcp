// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicIngestionDataSourceSettingsConfluentCloud {
    /**
     * @return The Confluent Cloud bootstrap server. The format is url:port.
     * 
     */
    private String bootstrapServer;
    /**
     * @return The Confluent Cloud cluster ID.
     * 
     */
    private @Nullable String clusterId;
    /**
     * @return The GCP service account to be used for Federated Identity authentication
     * with Confluent Cloud.
     * 
     */
    private String gcpServiceAccount;
    /**
     * @return Identity pool ID to be used for Federated Identity authentication with Confluent Cloud.
     * 
     */
    private String identityPoolId;
    /**
     * @return Name of the Confluent Cloud topic that Pub/Sub will import from.
     * 
     */
    private String topic;

    private TopicIngestionDataSourceSettingsConfluentCloud() {}
    /**
     * @return The Confluent Cloud bootstrap server. The format is url:port.
     * 
     */
    public String bootstrapServer() {
        return this.bootstrapServer;
    }
    /**
     * @return The Confluent Cloud cluster ID.
     * 
     */
    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    /**
     * @return The GCP service account to be used for Federated Identity authentication
     * with Confluent Cloud.
     * 
     */
    public String gcpServiceAccount() {
        return this.gcpServiceAccount;
    }
    /**
     * @return Identity pool ID to be used for Federated Identity authentication with Confluent Cloud.
     * 
     */
    public String identityPoolId() {
        return this.identityPoolId;
    }
    /**
     * @return Name of the Confluent Cloud topic that Pub/Sub will import from.
     * 
     */
    public String topic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicIngestionDataSourceSettingsConfluentCloud defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bootstrapServer;
        private @Nullable String clusterId;
        private String gcpServiceAccount;
        private String identityPoolId;
        private String topic;
        public Builder() {}
        public Builder(TopicIngestionDataSourceSettingsConfluentCloud defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootstrapServer = defaults.bootstrapServer;
    	      this.clusterId = defaults.clusterId;
    	      this.gcpServiceAccount = defaults.gcpServiceAccount;
    	      this.identityPoolId = defaults.identityPoolId;
    	      this.topic = defaults.topic;
        }

        @CustomType.Setter
        public Builder bootstrapServer(String bootstrapServer) {
            if (bootstrapServer == null) {
              throw new MissingRequiredPropertyException("TopicIngestionDataSourceSettingsConfluentCloud", "bootstrapServer");
            }
            this.bootstrapServer = bootstrapServer;
            return this;
        }
        @CustomType.Setter
        public Builder clusterId(@Nullable String clusterId) {

            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder gcpServiceAccount(String gcpServiceAccount) {
            if (gcpServiceAccount == null) {
              throw new MissingRequiredPropertyException("TopicIngestionDataSourceSettingsConfluentCloud", "gcpServiceAccount");
            }
            this.gcpServiceAccount = gcpServiceAccount;
            return this;
        }
        @CustomType.Setter
        public Builder identityPoolId(String identityPoolId) {
            if (identityPoolId == null) {
              throw new MissingRequiredPropertyException("TopicIngestionDataSourceSettingsConfluentCloud", "identityPoolId");
            }
            this.identityPoolId = identityPoolId;
            return this;
        }
        @CustomType.Setter
        public Builder topic(String topic) {
            if (topic == null) {
              throw new MissingRequiredPropertyException("TopicIngestionDataSourceSettingsConfluentCloud", "topic");
            }
            this.topic = topic;
            return this;
        }
        public TopicIngestionDataSourceSettingsConfluentCloud build() {
            final var _resultValue = new TopicIngestionDataSourceSettingsConfluentCloud();
            _resultValue.bootstrapServer = bootstrapServer;
            _resultValue.clusterId = clusterId;
            _resultValue.gcpServiceAccount = gcpServiceAccount;
            _resultValue.identityPoolId = identityPoolId;
            _resultValue.topic = topic;
            return _resultValue;
        }
    }
}
