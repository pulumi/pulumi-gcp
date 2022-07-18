// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.redis.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstancePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstancePlainArgs Empty = new GetInstancePlainArgs();

    /**
     * The name of a Redis instance.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of a Redis instance.
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

    /**
     * The region in which the resource belongs. If it
     * is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return The region in which the resource belongs. If it
     * is not provided, the provider region is used.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetInstancePlainArgs() {}

    private GetInstancePlainArgs(GetInstancePlainArgs $) {
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
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

        /**
         * @param name The name of a Redis instance.
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

        /**
         * @param region The region in which the resource belongs. If it
         * is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetInstancePlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}