// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigateway.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApiConfigIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiConfigIamPolicyPlainArgs Empty = new GetApiConfigIamPolicyPlainArgs();

    /**
     * The API to attach the config to.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="api", required=true)
    private String api;

    /**
     * @return The API to attach the config to.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String api() {
        return this.api;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="apiConfig", required=true)
    private String apiConfig;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String apiConfig() {
        return this.apiConfig;
    }

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

    private GetApiConfigIamPolicyPlainArgs() {}

    private GetApiConfigIamPolicyPlainArgs(GetApiConfigIamPolicyPlainArgs $) {
        this.api = $.api;
        this.apiConfig = $.apiConfig;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiConfigIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiConfigIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetApiConfigIamPolicyPlainArgs();
        }

        public Builder(GetApiConfigIamPolicyPlainArgs defaults) {
            $ = new GetApiConfigIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param api The API to attach the config to.
         * Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder api(String api) {
            $.api = api;
            return this;
        }

        /**
         * @param apiConfig Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder apiConfig(String apiConfig) {
            $.apiConfig = apiConfig;
            return this;
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

        public GetApiConfigIamPolicyPlainArgs build() {
            if ($.api == null) {
                throw new MissingRequiredPropertyException("GetApiConfigIamPolicyPlainArgs", "api");
            }
            if ($.apiConfig == null) {
                throw new MissingRequiredPropertyException("GetApiConfigIamPolicyPlainArgs", "apiConfig");
            }
            return $;
        }
    }

}
