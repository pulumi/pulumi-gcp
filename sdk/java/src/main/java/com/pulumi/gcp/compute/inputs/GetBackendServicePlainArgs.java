// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBackendServicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackendServicePlainArgs Empty = new GetBackendServicePlainArgs();

    /**
     * The name of the Backend Service.
     * 
     * ***
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Backend Service.
     * 
     * ***
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetBackendServicePlainArgs() {}

    private GetBackendServicePlainArgs(GetBackendServicePlainArgs $) {
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackendServicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackendServicePlainArgs $;

        public Builder() {
            $ = new GetBackendServicePlainArgs();
        }

        public Builder(GetBackendServicePlainArgs defaults) {
            $ = new GetBackendServicePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Backend Service.
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
         * @param project The project in which the resource belongs. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetBackendServicePlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetBackendServicePlainArgs", "name");
            }
            return $;
        }
    }

}
