// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretVersionAccessPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretVersionAccessPlainArgs Empty = new GetSecretVersionAccessPlainArgs();

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

    private GetSecretVersionAccessPlainArgs() {}

    private GetSecretVersionAccessPlainArgs(GetSecretVersionAccessPlainArgs $) {
        this.project = $.project;
        this.secret = $.secret;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretVersionAccessPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretVersionAccessPlainArgs $;

        public Builder() {
            $ = new GetSecretVersionAccessPlainArgs();
        }

        public Builder(GetSecretVersionAccessPlainArgs defaults) {
            $ = new GetSecretVersionAccessPlainArgs(Objects.requireNonNull(defaults));
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

        public GetSecretVersionAccessPlainArgs build() {
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            return $;
        }
    }

}