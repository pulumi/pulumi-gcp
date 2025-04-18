// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetV2OrganizationSourceIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetV2OrganizationSourceIamPolicyPlainArgs Empty = new GetV2OrganizationSourceIamPolicyPlainArgs();

    @Import(name="organization", required=true)
    private String organization;

    public String organization() {
        return this.organization;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="source", required=true)
    private String source;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String source() {
        return this.source;
    }

    private GetV2OrganizationSourceIamPolicyPlainArgs() {}

    private GetV2OrganizationSourceIamPolicyPlainArgs(GetV2OrganizationSourceIamPolicyPlainArgs $) {
        this.organization = $.organization;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetV2OrganizationSourceIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetV2OrganizationSourceIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetV2OrganizationSourceIamPolicyPlainArgs();
        }

        public Builder(GetV2OrganizationSourceIamPolicyPlainArgs defaults) {
            $ = new GetV2OrganizationSourceIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder organization(String organization) {
            $.organization = organization;
            return this;
        }

        /**
         * @param source Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            $.source = source;
            return this;
        }

        public GetV2OrganizationSourceIamPolicyPlainArgs build() {
            if ($.organization == null) {
                throw new MissingRequiredPropertyException("GetV2OrganizationSourceIamPolicyPlainArgs", "organization");
            }
            if ($.source == null) {
                throw new MissingRequiredPropertyException("GetV2OrganizationSourceIamPolicyPlainArgs", "source");
            }
            return $;
        }
    }

}
