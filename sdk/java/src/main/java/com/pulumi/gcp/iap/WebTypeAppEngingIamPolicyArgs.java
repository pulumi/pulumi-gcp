// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebTypeAppEngingIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebTypeAppEngingIamPolicyArgs Empty = new WebTypeAppEngingIamPolicyArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> appId() {
        return this.appId;
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

    private WebTypeAppEngingIamPolicyArgs() {}

    private WebTypeAppEngingIamPolicyArgs(WebTypeAppEngingIamPolicyArgs $) {
        this.appId = $.appId;
        this.policyData = $.policyData;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebTypeAppEngingIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebTypeAppEngingIamPolicyArgs $;

        public Builder() {
            $ = new WebTypeAppEngingIamPolicyArgs();
        }

        public Builder(WebTypeAppEngingIamPolicyArgs defaults) {
            $ = new WebTypeAppEngingIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
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

        public WebTypeAppEngingIamPolicyArgs build() {
            if ($.appId == null) {
                throw new MissingRequiredPropertyException("WebTypeAppEngingIamPolicyArgs", "appId");
            }
            if ($.policyData == null) {
                throw new MissingRequiredPropertyException("WebTypeAppEngingIamPolicyArgs", "policyData");
            }
            return $;
        }
    }

}
