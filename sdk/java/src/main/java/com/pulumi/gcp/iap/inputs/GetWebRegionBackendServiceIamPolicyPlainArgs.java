// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWebRegionBackendServiceIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebRegionBackendServiceIamPolicyPlainArgs Empty = new GetWebRegionBackendServiceIamPolicyPlainArgs();

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="webRegionBackendService", required=true)
    private String webRegionBackendService;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String webRegionBackendService() {
        return this.webRegionBackendService;
    }

    private GetWebRegionBackendServiceIamPolicyPlainArgs() {}

    private GetWebRegionBackendServiceIamPolicyPlainArgs(GetWebRegionBackendServiceIamPolicyPlainArgs $) {
        this.project = $.project;
        this.region = $.region;
        this.webRegionBackendService = $.webRegionBackendService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebRegionBackendServiceIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebRegionBackendServiceIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetWebRegionBackendServiceIamPolicyPlainArgs();
        }

        public Builder(GetWebRegionBackendServiceIamPolicyPlainArgs defaults) {
            $ = new GetWebRegionBackendServiceIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param region Used to find the parent resource to bind the IAM policy to. If not specified,
         * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
         * region is specified, it is taken from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        /**
         * @param webRegionBackendService Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder webRegionBackendService(String webRegionBackendService) {
            $.webRegionBackendService = webRegionBackendService;
            return this;
        }

        public GetWebRegionBackendServiceIamPolicyPlainArgs build() {
            if ($.webRegionBackendService == null) {
                throw new MissingRequiredPropertyException("GetWebRegionBackendServiceIamPolicyPlainArgs", "webRegionBackendService");
            }
            return $;
        }
    }

}
