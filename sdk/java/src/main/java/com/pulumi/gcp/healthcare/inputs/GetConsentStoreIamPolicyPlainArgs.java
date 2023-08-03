// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConsentStoreIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConsentStoreIamPolicyPlainArgs Empty = new GetConsentStoreIamPolicyPlainArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="consentStoreId", required=true)
    private String consentStoreId;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String consentStoreId() {
        return this.consentStoreId;
    }

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="dataset", required=true)
    private String dataset;

    /**
     * @return Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String dataset() {
        return this.dataset;
    }

    private GetConsentStoreIamPolicyPlainArgs() {}

    private GetConsentStoreIamPolicyPlainArgs(GetConsentStoreIamPolicyPlainArgs $) {
        this.consentStoreId = $.consentStoreId;
        this.dataset = $.dataset;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConsentStoreIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConsentStoreIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetConsentStoreIamPolicyPlainArgs();
        }

        public Builder(GetConsentStoreIamPolicyPlainArgs defaults) {
            $ = new GetConsentStoreIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consentStoreId Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder consentStoreId(String consentStoreId) {
            $.consentStoreId = consentStoreId;
            return this;
        }

        /**
         * @param dataset Identifies the dataset addressed by this request. Must be in the format
         * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
         * Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder dataset(String dataset) {
            $.dataset = dataset;
            return this;
        }

        public GetConsentStoreIamPolicyPlainArgs build() {
            $.consentStoreId = Objects.requireNonNull($.consentStoreId, "expected parameter 'consentStoreId' to be non-null");
            $.dataset = Objects.requireNonNull($.dataset, "expected parameter 'dataset' to be non-null");
            return $;
        }
    }

}