// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class PolicyTagIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyTagIamPolicyArgs Empty = new PolicyTagIamPolicyArgs();

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
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="policyTag", required=true)
    private Output<String> policyTag;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> policyTag() {
        return this.policyTag;
    }

    private PolicyTagIamPolicyArgs() {}

    private PolicyTagIamPolicyArgs(PolicyTagIamPolicyArgs $) {
        this.policyData = $.policyData;
        this.policyTag = $.policyTag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyTagIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyTagIamPolicyArgs $;

        public Builder() {
            $ = new PolicyTagIamPolicyArgs();
        }

        public Builder(PolicyTagIamPolicyArgs defaults) {
            $ = new PolicyTagIamPolicyArgs(Objects.requireNonNull(defaults));
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
         * @param policyTag Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder policyTag(Output<String> policyTag) {
            $.policyTag = policyTag;
            return this;
        }

        /**
         * @param policyTag Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder policyTag(String policyTag) {
            return policyTag(Output.of(policyTag));
        }

        public PolicyTagIamPolicyArgs build() {
            if ($.policyData == null) {
                throw new MissingRequiredPropertyException("PolicyTagIamPolicyArgs", "policyData");
            }
            if ($.policyTag == null) {
                throw new MissingRequiredPropertyException("PolicyTagIamPolicyArgs", "policyTag");
            }
            return $;
        }
    }

}
