// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUserWorkloadsSecretPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserWorkloadsSecretPlainArgs Empty = new GetUserWorkloadsSecretPlainArgs();

    /**
     * Environment where the Secret is stored.
     * 
     */
    @Import(name="environment", required=true)
    private String environment;

    /**
     * @return Environment where the Secret is stored.
     * 
     */
    public String environment() {
        return this.environment;
    }

    /**
     * Name of the Secret.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the Secret.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The location or Compute Engine region of the environment.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return The location or Compute Engine region of the environment.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetUserWorkloadsSecretPlainArgs() {}

    private GetUserWorkloadsSecretPlainArgs(GetUserWorkloadsSecretPlainArgs $) {
        this.environment = $.environment;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserWorkloadsSecretPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserWorkloadsSecretPlainArgs $;

        public Builder() {
            $ = new GetUserWorkloadsSecretPlainArgs();
        }

        public Builder(GetUserWorkloadsSecretPlainArgs defaults) {
            $ = new GetUserWorkloadsSecretPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param environment Environment where the Secret is stored.
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param name Name of the Secret.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param region The location or Compute Engine region of the environment.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetUserWorkloadsSecretPlainArgs build() {
            if ($.environment == null) {
                throw new MissingRequiredPropertyException("GetUserWorkloadsSecretPlainArgs", "environment");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetUserWorkloadsSecretPlainArgs", "name");
            }
            return $;
        }
    }

}
