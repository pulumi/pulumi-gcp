// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiConfigIamPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final ApiConfigIamPolicyState Empty = new ApiConfigIamPolicyState();

    /**
     * The API to attach the config to.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="api")
    private @Nullable Output<String> api;

    /**
     * @return The API to attach the config to.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Optional<Output<String>> api() {
        return Optional.ofNullable(this.api);
    }

    @Import(name="apiConfig")
    private @Nullable Output<String> apiConfig;

    public Optional<Output<String>> apiConfig() {
        return Optional.ofNullable(this.apiConfig);
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData")
    private @Nullable Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Optional<Output<String>> policyData() {
        return Optional.ofNullable(this.policyData);
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

    private ApiConfigIamPolicyState() {}

    private ApiConfigIamPolicyState(ApiConfigIamPolicyState $) {
        this.api = $.api;
        this.apiConfig = $.apiConfig;
        this.etag = $.etag;
        this.policyData = $.policyData;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiConfigIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiConfigIamPolicyState $;

        public Builder() {
            $ = new ApiConfigIamPolicyState();
        }

        public Builder(ApiConfigIamPolicyState defaults) {
            $ = new ApiConfigIamPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param api The API to attach the config to.
         * Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder api(@Nullable Output<String> api) {
            $.api = api;
            return this;
        }

        /**
         * @param api The API to attach the config to.
         * Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder api(String api) {
            return api(Output.of(api));
        }

        public Builder apiConfig(@Nullable Output<String> apiConfig) {
            $.apiConfig = apiConfig;
            return this;
        }

        public Builder apiConfig(String apiConfig) {
            return apiConfig(Output.of(apiConfig));
        }

        /**
         * @param etag (Computed) The etag of the IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag (Computed) The etag of the IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(@Nullable Output<String> policyData) {
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

        public ApiConfigIamPolicyState build() {
            return $;
        }
    }

}