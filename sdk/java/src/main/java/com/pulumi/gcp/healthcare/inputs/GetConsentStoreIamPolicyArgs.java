// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetConsentStoreIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConsentStoreIamPolicyArgs Empty = new GetConsentStoreIamPolicyArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="consentStoreId", required=true)
    private Output<String> consentStoreId;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> consentStoreId() {
        return this.consentStoreId;
    }

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="dataset", required=true)
    private Output<String> dataset;

    /**
     * @return Identifies the dataset addressed by this request. Must be in the format
     * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> dataset() {
        return this.dataset;
    }

    private GetConsentStoreIamPolicyArgs() {}

    private GetConsentStoreIamPolicyArgs(GetConsentStoreIamPolicyArgs $) {
        this.consentStoreId = $.consentStoreId;
        this.dataset = $.dataset;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConsentStoreIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConsentStoreIamPolicyArgs $;

        public Builder() {
            $ = new GetConsentStoreIamPolicyArgs();
        }

        public Builder(GetConsentStoreIamPolicyArgs defaults) {
            $ = new GetConsentStoreIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consentStoreId Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder consentStoreId(Output<String> consentStoreId) {
            $.consentStoreId = consentStoreId;
            return this;
        }

        /**
         * @param consentStoreId Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder consentStoreId(String consentStoreId) {
            return consentStoreId(Output.of(consentStoreId));
        }

        /**
         * @param dataset Identifies the dataset addressed by this request. Must be in the format
         * &#39;projects/{project}/locations/{location}/datasets/{dataset}&#39;
         * Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder dataset(Output<String> dataset) {
            $.dataset = dataset;
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
            return dataset(Output.of(dataset));
        }

        public GetConsentStoreIamPolicyArgs build() {
            if ($.consentStoreId == null) {
                throw new MissingRequiredPropertyException("GetConsentStoreIamPolicyArgs", "consentStoreId");
            }
            if ($.dataset == null) {
                throw new MissingRequiredPropertyException("GetConsentStoreIamPolicyArgs", "dataset");
            }
            return $;
        }
    }

}
