// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tags;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class TagKeyIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagKeyIamPolicyArgs Empty = new TagKeyIamPolicyArgs();

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
    @Import(name="tagKey", required=true)
    private Output<String> tagKey;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> tagKey() {
        return this.tagKey;
    }

    private TagKeyIamPolicyArgs() {}

    private TagKeyIamPolicyArgs(TagKeyIamPolicyArgs $) {
        this.policyData = $.policyData;
        this.tagKey = $.tagKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagKeyIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagKeyIamPolicyArgs $;

        public Builder() {
            $ = new TagKeyIamPolicyArgs();
        }

        public Builder(TagKeyIamPolicyArgs defaults) {
            $ = new TagKeyIamPolicyArgs(Objects.requireNonNull(defaults));
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
         * @param tagKey Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder tagKey(Output<String> tagKey) {
            $.tagKey = tagKey;
            return this;
        }

        /**
         * @param tagKey Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder tagKey(String tagKey) {
            return tagKey(Output.of(tagKey));
        }

        public TagKeyIamPolicyArgs build() {
            if ($.policyData == null) {
                throw new MissingRequiredPropertyException("TagKeyIamPolicyArgs", "policyData");
            }
            if ($.tagKey == null) {
                throw new MissingRequiredPropertyException("TagKeyIamPolicyArgs", "tagKey");
            }
            return $;
        }
    }

}
