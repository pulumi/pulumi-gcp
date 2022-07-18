// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionIamPolicyArgs Empty = new ConnectionIamPolicyArgs();

    /**
     * Optional connection id that should be assigned to the created connection.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="connectionId", required=true)
    private Output<String> connectionId;

    /**
     * @return Optional connection id that should be assigned to the created connection.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }

    /**
     * The geographic location where the connection should reside.
     * Cloud SQL instance must be in the same location as the connection
     * with following exceptions: Cloud SQL us-central1 maps to BigQuery US, Cloud SQL europe-west1 maps to BigQuery EU.
     * Examples: US, EU, asia-northeast1, us-central1, europe-west1.
     * Spanner Connections same as spanner region
     * AWS allowed regions are aws-us-east-1
     * Azure allowed regions are azure-eastus2 Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geographic location where the connection should reside.
     * Cloud SQL instance must be in the same location as the connection
     * with following exceptions: Cloud SQL us-central1 maps to BigQuery US, Cloud SQL europe-west1 maps to BigQuery EU.
     * Examples: US, EU, asia-northeast1, us-central1, europe-west1.
     * Spanner Connections same as spanner region
     * AWS allowed regions are aws-us-east-1
     * Azure allowed regions are azure-eastus2 Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> policyData() {
        return this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private ConnectionIamPolicyArgs() {}

    private ConnectionIamPolicyArgs(ConnectionIamPolicyArgs $) {
        this.connectionId = $.connectionId;
        this.location = $.location;
        this.policyData = $.policyData;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionIamPolicyArgs $;

        public Builder() {
            $ = new ConnectionIamPolicyArgs();
        }

        public Builder(ConnectionIamPolicyArgs defaults) {
            $ = new ConnectionIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionId Optional connection id that should be assigned to the created connection.
         * Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder connectionId(Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param connectionId Optional connection id that should be assigned to the created connection.
         * Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        /**
         * @param location The geographic location where the connection should reside.
         * Cloud SQL instance must be in the same location as the connection
         * with following exceptions: Cloud SQL us-central1 maps to BigQuery US, Cloud SQL europe-west1 maps to BigQuery EU.
         * Examples: US, EU, asia-northeast1, us-central1, europe-west1.
         * Spanner Connections same as spanner region
         * AWS allowed regions are aws-us-east-1
         * Azure allowed regions are azure-eastus2 Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geographic location where the connection should reside.
         * Cloud SQL instance must be in the same location as the connection
         * with following exceptions: Cloud SQL us-central1 maps to BigQuery US, Cloud SQL europe-west1 maps to BigQuery EU.
         * Examples: US, EU, asia-northeast1, us-central1, europe-west1.
         * Spanner Connections same as spanner region
         * AWS allowed regions are aws-us-east-1
         * Azure allowed regions are azure-eastus2 Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public ConnectionIamPolicyArgs build() {
            $.connectionId = Objects.requireNonNull($.connectionId, "expected parameter 'connectionId' to be non-null");
            $.policyData = Objects.requireNonNull($.policyData, "expected parameter 'policyData' to be non-null");
            return $;
        }
    }

}