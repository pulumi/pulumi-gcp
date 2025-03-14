// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.spanner.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstancePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstancePlainArgs Empty = new GetInstancePlainArgs();

    @Import(name="config")
    private @Nullable String config;

    public Optional<String> config() {
        return Optional.ofNullable(this.config);
    }

    @Import(name="displayName")
    private @Nullable String displayName;

    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The name of the spanner instance.
     * 
     * ***
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the spanner instance.
     * 
     * ***
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetInstancePlainArgs() {}

    private GetInstancePlainArgs(GetInstancePlainArgs $) {
        this.config = $.config;
        this.displayName = $.displayName;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstancePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstancePlainArgs $;

        public Builder() {
            $ = new GetInstancePlainArgs();
        }

        public Builder(GetInstancePlainArgs defaults) {
            $ = new GetInstancePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder config(@Nullable String config) {
            $.config = config;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param name The name of the spanner instance.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetInstancePlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetInstancePlainArgs", "name");
            }
            return $;
        }
    }

}
