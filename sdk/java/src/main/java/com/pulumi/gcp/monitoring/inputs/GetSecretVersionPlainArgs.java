// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretVersionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretVersionPlainArgs Empty = new GetSecretVersionPlainArgs();

    /**
     * If set to `false`, the `secret_data`
     * will not be fetched. Default is `true`.
     * 
     */
    @Import(name="fetchSecretData")
    private @Nullable Boolean fetchSecretData;

    /**
     * @return If set to `false`, the `secret_data`
     * will not be fetched. Default is `true`.
     * 
     */
    public Optional<Boolean> fetchSecretData() {
        return Optional.ofNullable(this.fetchSecretData);
    }

    /**
     * If set to `true`, the secret data is
     * expected to be base64-encoded string.
     * 
     */
    @Import(name="isSecretDataBase64")
    private @Nullable Boolean isSecretDataBase64;

    /**
     * @return If set to `true`, the secret data is
     * expected to be base64-encoded string.
     * 
     */
    public Optional<Boolean> isSecretDataBase64() {
        return Optional.ofNullable(this.isSecretDataBase64);
    }

    /**
     * The project to get the secret version for. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The project to get the secret version for. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The secret to get the secret version for.
     * 
     */
    @Import(name="secret", required=true)
    private String secret;

    /**
     * @return The secret to get the secret version for.
     * 
     */
    public String secret() {
        return this.secret;
    }

    /**
     * The version of the secret to get. If it
     * is not provided, the latest version is retrieved.
     * 
     */
    @Import(name="version")
    private @Nullable String version;

    /**
     * @return The version of the secret to get. If it
     * is not provided, the latest version is retrieved.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    private GetSecretVersionPlainArgs() {}

    private GetSecretVersionPlainArgs(GetSecretVersionPlainArgs $) {
        this.fetchSecretData = $.fetchSecretData;
        this.isSecretDataBase64 = $.isSecretDataBase64;
        this.project = $.project;
        this.secret = $.secret;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretVersionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretVersionPlainArgs $;

        public Builder() {
            $ = new GetSecretVersionPlainArgs();
        }

        public Builder(GetSecretVersionPlainArgs defaults) {
            $ = new GetSecretVersionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fetchSecretData If set to `false`, the `secret_data`
         * will not be fetched. Default is `true`.
         * 
         * @return builder
         * 
         */
        public Builder fetchSecretData(@Nullable Boolean fetchSecretData) {
            $.fetchSecretData = fetchSecretData;
            return this;
        }

        /**
         * @param isSecretDataBase64 If set to `true`, the secret data is
         * expected to be base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder isSecretDataBase64(@Nullable Boolean isSecretDataBase64) {
            $.isSecretDataBase64 = isSecretDataBase64;
            return this;
        }

        /**
         * @param project The project to get the secret version for. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param secret The secret to get the secret version for.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param version The version of the secret to get. If it
         * is not provided, the latest version is retrieved.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable String version) {
            $.version = version;
            return this;
        }

        public GetSecretVersionPlainArgs build() {
            if ($.secret == null) {
                throw new MissingRequiredPropertyException("GetSecretVersionPlainArgs", "secret");
            }
            return $;
        }
    }

}
