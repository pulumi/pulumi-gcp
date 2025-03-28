// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class TopicIngestionDataSourceSettingsAwsMskArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicIngestionDataSourceSettingsAwsMskArgs Empty = new TopicIngestionDataSourceSettingsAwsMskArgs();

    /**
     * AWS role ARN to be used for Federated Identity authentication with
     * MSK. Check the Pub/Sub docs for how to set up this role and the
     * required permissions that need to be attached to it.
     * 
     */
    @Import(name="awsRoleArn", required=true)
    private Output<String> awsRoleArn;

    /**
     * @return AWS role ARN to be used for Federated Identity authentication with
     * MSK. Check the Pub/Sub docs for how to set up this role and the
     * required permissions that need to be attached to it.
     * 
     */
    public Output<String> awsRoleArn() {
        return this.awsRoleArn;
    }

    /**
     * ARN that uniquely identifies the MSK cluster.
     * 
     */
    @Import(name="clusterArn", required=true)
    private Output<String> clusterArn;

    /**
     * @return ARN that uniquely identifies the MSK cluster.
     * 
     */
    public Output<String> clusterArn() {
        return this.clusterArn;
    }

    /**
     * The GCP service account to be used for Federated Identity authentication
     * with MSK (via a `AssumeRoleWithWebIdentity` call for the provided
     * role). The `awsRoleArn` must be set up with `accounts.google.com:sub`
     * equals to this service account number.
     * 
     */
    @Import(name="gcpServiceAccount", required=true)
    private Output<String> gcpServiceAccount;

    /**
     * @return The GCP service account to be used for Federated Identity authentication
     * with MSK (via a `AssumeRoleWithWebIdentity` call for the provided
     * role). The `awsRoleArn` must be set up with `accounts.google.com:sub`
     * equals to this service account number.
     * 
     */
    public Output<String> gcpServiceAccount() {
        return this.gcpServiceAccount;
    }

    /**
     * The name of the MSK topic that Pub/Sub will import from.
     * 
     */
    @Import(name="topic", required=true)
    private Output<String> topic;

    /**
     * @return The name of the MSK topic that Pub/Sub will import from.
     * 
     */
    public Output<String> topic() {
        return this.topic;
    }

    private TopicIngestionDataSourceSettingsAwsMskArgs() {}

    private TopicIngestionDataSourceSettingsAwsMskArgs(TopicIngestionDataSourceSettingsAwsMskArgs $) {
        this.awsRoleArn = $.awsRoleArn;
        this.clusterArn = $.clusterArn;
        this.gcpServiceAccount = $.gcpServiceAccount;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicIngestionDataSourceSettingsAwsMskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicIngestionDataSourceSettingsAwsMskArgs $;

        public Builder() {
            $ = new TopicIngestionDataSourceSettingsAwsMskArgs();
        }

        public Builder(TopicIngestionDataSourceSettingsAwsMskArgs defaults) {
            $ = new TopicIngestionDataSourceSettingsAwsMskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsRoleArn AWS role ARN to be used for Federated Identity authentication with
         * MSK. Check the Pub/Sub docs for how to set up this role and the
         * required permissions that need to be attached to it.
         * 
         * @return builder
         * 
         */
        public Builder awsRoleArn(Output<String> awsRoleArn) {
            $.awsRoleArn = awsRoleArn;
            return this;
        }

        /**
         * @param awsRoleArn AWS role ARN to be used for Federated Identity authentication with
         * MSK. Check the Pub/Sub docs for how to set up this role and the
         * required permissions that need to be attached to it.
         * 
         * @return builder
         * 
         */
        public Builder awsRoleArn(String awsRoleArn) {
            return awsRoleArn(Output.of(awsRoleArn));
        }

        /**
         * @param clusterArn ARN that uniquely identifies the MSK cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterArn(Output<String> clusterArn) {
            $.clusterArn = clusterArn;
            return this;
        }

        /**
         * @param clusterArn ARN that uniquely identifies the MSK cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterArn(String clusterArn) {
            return clusterArn(Output.of(clusterArn));
        }

        /**
         * @param gcpServiceAccount The GCP service account to be used for Federated Identity authentication
         * with MSK (via a `AssumeRoleWithWebIdentity` call for the provided
         * role). The `awsRoleArn` must be set up with `accounts.google.com:sub`
         * equals to this service account number.
         * 
         * @return builder
         * 
         */
        public Builder gcpServiceAccount(Output<String> gcpServiceAccount) {
            $.gcpServiceAccount = gcpServiceAccount;
            return this;
        }

        /**
         * @param gcpServiceAccount The GCP service account to be used for Federated Identity authentication
         * with MSK (via a `AssumeRoleWithWebIdentity` call for the provided
         * role). The `awsRoleArn` must be set up with `accounts.google.com:sub`
         * equals to this service account number.
         * 
         * @return builder
         * 
         */
        public Builder gcpServiceAccount(String gcpServiceAccount) {
            return gcpServiceAccount(Output.of(gcpServiceAccount));
        }

        /**
         * @param topic The name of the MSK topic that Pub/Sub will import from.
         * 
         * @return builder
         * 
         */
        public Builder topic(Output<String> topic) {
            $.topic = topic;
            return this;
        }

        /**
         * @param topic The name of the MSK topic that Pub/Sub will import from.
         * 
         * @return builder
         * 
         */
        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public TopicIngestionDataSourceSettingsAwsMskArgs build() {
            if ($.awsRoleArn == null) {
                throw new MissingRequiredPropertyException("TopicIngestionDataSourceSettingsAwsMskArgs", "awsRoleArn");
            }
            if ($.clusterArn == null) {
                throw new MissingRequiredPropertyException("TopicIngestionDataSourceSettingsAwsMskArgs", "clusterArn");
            }
            if ($.gcpServiceAccount == null) {
                throw new MissingRequiredPropertyException("TopicIngestionDataSourceSettingsAwsMskArgs", "gcpServiceAccount");
            }
            if ($.topic == null) {
                throw new MissingRequiredPropertyException("TopicIngestionDataSourceSettingsAwsMskArgs", "topic");
            }
            return $;
        }
    }

}
