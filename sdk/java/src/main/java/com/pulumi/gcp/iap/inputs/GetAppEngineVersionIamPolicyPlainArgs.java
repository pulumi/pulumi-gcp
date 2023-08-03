// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppEngineVersionIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppEngineVersionIamPolicyPlainArgs Empty = new GetAppEngineVersionIamPolicyPlainArgs();

    /**
     * Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="appId", required=true)
    private String appId;

    /**
     * @return Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String appId() {
        return this.appId;
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

    /**
     * Service id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="service", required=true)
    private String service;

    /**
     * @return Service id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String service() {
        return this.service;
    }

    /**
     * Version id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="versionId", required=true)
    private String versionId;

    /**
     * @return Version id of the App Engine application Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String versionId() {
        return this.versionId;
    }

    private GetAppEngineVersionIamPolicyPlainArgs() {}

    private GetAppEngineVersionIamPolicyPlainArgs(GetAppEngineVersionIamPolicyPlainArgs $) {
        this.appId = $.appId;
        this.project = $.project;
        this.service = $.service;
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppEngineVersionIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppEngineVersionIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetAppEngineVersionIamPolicyPlainArgs();
        }

        public Builder(GetAppEngineVersionIamPolicyPlainArgs defaults) {
            $ = new GetAppEngineVersionIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId Id of the App Engine application. Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            $.appId = appId;
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

        /**
         * @param service Service id of the App Engine application Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            $.service = service;
            return this;
        }

        /**
         * @param versionId Version id of the App Engine application Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder versionId(String versionId) {
            $.versionId = versionId;
            return this;
        }

        public GetAppEngineVersionIamPolicyPlainArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            $.versionId = Objects.requireNonNull($.versionId, "expected parameter 'versionId' to be non-null");
            return $;
        }
    }

}