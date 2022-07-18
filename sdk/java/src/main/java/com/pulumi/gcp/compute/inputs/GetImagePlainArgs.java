// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImagePlainArgs Empty = new GetImagePlainArgs();

    /**
     * The family name of the image.
     * 
     */
    @Import(name="family")
    private @Nullable String family;

    /**
     * @return The family name of the image.
     * 
     */
    public Optional<String> family() {
        return Optional.ofNullable(this.family);
    }

    @Import(name="filter")
    private @Nullable String filter;

    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The name of the image.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the image.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The project in which the resource belongs. If it is not
     * provided, the provider project is used. If you are using a
     * [public base image][pubimg], be sure to specify the correct Image Project.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The project in which the resource belongs. If it is not
     * provided, the provider project is used. If you are using a
     * [public base image][pubimg], be sure to specify the correct Image Project.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetImagePlainArgs() {}

    private GetImagePlainArgs(GetImagePlainArgs $) {
        this.family = $.family;
        this.filter = $.filter;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagePlainArgs $;

        public Builder() {
            $ = new GetImagePlainArgs();
        }

        public Builder(GetImagePlainArgs defaults) {
            $ = new GetImagePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param family The family name of the image.
         * 
         * @return builder
         * 
         */
        public Builder family(@Nullable String family) {
            $.family = family;
            return this;
        }

        public Builder filter(@Nullable String filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param name The name of the image.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param project The project in which the resource belongs. If it is not
         * provided, the provider project is used. If you are using a
         * [public base image][pubimg], be sure to specify the correct Image Project.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetImagePlainArgs build() {
            return $;
        }
    }

}