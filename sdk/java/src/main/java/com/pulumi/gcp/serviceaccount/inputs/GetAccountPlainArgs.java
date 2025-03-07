// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.serviceaccount.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountPlainArgs Empty = new GetAccountPlainArgs();

    /**
     * The Google service account ID. This be one of:
     * 
     * * The name of the service account within the project (e.g. `my-service`)
     * 
     * * The fully-qualified path to a service account resource (e.g.
     * `projects/my-project/serviceAccounts/...`)
     * 
     * * The email address of the service account (e.g.
     * `my-service{@literal @}my-project.iam.gserviceaccount.com`)
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return The Google service account ID. This be one of:
     * 
     * * The name of the service account within the project (e.g. `my-service`)
     * 
     * * The fully-qualified path to a service account resource (e.g.
     * `projects/my-project/serviceAccounts/...`)
     * 
     * * The email address of the service account (e.g.
     * `my-service{@literal @}my-project.iam.gserviceaccount.com`)
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * The ID of the project that the service account is present in.
     * Defaults to the provider project configuration.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project that the service account is present in.
     * Defaults to the provider project configuration.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetAccountPlainArgs() {}

    private GetAccountPlainArgs(GetAccountPlainArgs $) {
        this.accountId = $.accountId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountPlainArgs $;

        public Builder() {
            $ = new GetAccountPlainArgs();
        }

        public Builder(GetAccountPlainArgs defaults) {
            $ = new GetAccountPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The Google service account ID. This be one of:
         * 
         * * The name of the service account within the project (e.g. `my-service`)
         * 
         * * The fully-qualified path to a service account resource (e.g.
         * `projects/my-project/serviceAccounts/...`)
         * 
         * * The email address of the service account (e.g.
         * `my-service{@literal @}my-project.iam.gserviceaccount.com`)
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param project The ID of the project that the service account is present in.
         * Defaults to the provider project configuration.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetAccountPlainArgs build() {
            if ($.accountId == null) {
                throw new MissingRequiredPropertyException("GetAccountPlainArgs", "accountId");
            }
            return $;
        }
    }

}
