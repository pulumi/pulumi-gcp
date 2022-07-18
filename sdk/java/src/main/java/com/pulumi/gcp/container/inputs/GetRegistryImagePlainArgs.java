// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistryImagePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryImagePlainArgs Empty = new GetRegistryImagePlainArgs();

    @Import(name="digest")
    private @Nullable String digest;

    public Optional<String> digest() {
        return Optional.ofNullable(this.digest);
    }

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region")
    private @Nullable String region;

    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    @Import(name="tag")
    private @Nullable String tag;

    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }

    private GetRegistryImagePlainArgs() {}

    private GetRegistryImagePlainArgs(GetRegistryImagePlainArgs $) {
        this.digest = $.digest;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryImagePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryImagePlainArgs $;

        public Builder() {
            $ = new GetRegistryImagePlainArgs();
        }

        public Builder(GetRegistryImagePlainArgs defaults) {
            $ = new GetRegistryImagePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder digest(@Nullable String digest) {
            $.digest = digest;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public Builder tag(@Nullable String tag) {
            $.tag = tag;
            return this;
        }

        public GetRegistryImagePlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}