// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigqueryanalyticshub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListingIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListingIamPolicyArgs Empty = new ListingIamPolicyArgs();

    /**
     * The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="dataExchangeId", required=true)
    private Output<String> dataExchangeId;

    /**
     * @return The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> dataExchangeId() {
        return this.dataExchangeId;
    }

    /**
     * The ID of the listing. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="listingId", required=true)
    private Output<String> listingId;

    /**
     * @return The ID of the listing. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> listingId() {
        return this.listingId;
    }

    /**
     * The name of the location this data exchange listing.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The name of the location this data exchange listing.
     * Used to find the parent resource to bind the IAM policy to
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

    private ListingIamPolicyArgs() {}

    private ListingIamPolicyArgs(ListingIamPolicyArgs $) {
        this.dataExchangeId = $.dataExchangeId;
        this.listingId = $.listingId;
        this.location = $.location;
        this.policyData = $.policyData;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListingIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListingIamPolicyArgs $;

        public Builder() {
            $ = new ListingIamPolicyArgs();
        }

        public Builder(ListingIamPolicyArgs defaults) {
            $ = new ListingIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataExchangeId The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder dataExchangeId(Output<String> dataExchangeId) {
            $.dataExchangeId = dataExchangeId;
            return this;
        }

        /**
         * @param dataExchangeId The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder dataExchangeId(String dataExchangeId) {
            return dataExchangeId(Output.of(dataExchangeId));
        }

        /**
         * @param listingId The ID of the listing. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder listingId(Output<String> listingId) {
            $.listingId = listingId;
            return this;
        }

        /**
         * @param listingId The ID of the listing. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder listingId(String listingId) {
            return listingId(Output.of(listingId));
        }

        /**
         * @param location The name of the location this data exchange listing.
         * Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The name of the location this data exchange listing.
         * Used to find the parent resource to bind the IAM policy to
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

        public ListingIamPolicyArgs build() {
            $.dataExchangeId = Objects.requireNonNull($.dataExchangeId, "expected parameter 'dataExchangeId' to be non-null");
            $.listingId = Objects.requireNonNull($.listingId, "expected parameter 'listingId' to be non-null");
            $.policyData = Objects.requireNonNull($.policyData, "expected parameter 'policyData' to be non-null");
            return $;
        }
    }

}