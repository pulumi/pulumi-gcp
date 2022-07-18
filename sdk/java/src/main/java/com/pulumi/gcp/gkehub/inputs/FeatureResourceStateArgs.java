// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureResourceStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeatureResourceStateArgs Empty = new FeatureResourceStateArgs();

    @Import(name="hasResources")
    private @Nullable Output<Boolean> hasResources;

    public Optional<Output<Boolean>> hasResources() {
        return Optional.ofNullable(this.hasResources);
    }

    @Import(name="state")
    private @Nullable Output<String> state;

    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private FeatureResourceStateArgs() {}

    private FeatureResourceStateArgs(FeatureResourceStateArgs $) {
        this.hasResources = $.hasResources;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureResourceStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureResourceStateArgs $;

        public Builder() {
            $ = new FeatureResourceStateArgs();
        }

        public Builder(FeatureResourceStateArgs defaults) {
            $ = new FeatureResourceStateArgs(Objects.requireNonNull(defaults));
        }

        public Builder hasResources(@Nullable Output<Boolean> hasResources) {
            $.hasResources = hasResources;
            return this;
        }

        public Builder hasResources(Boolean hasResources) {
            return hasResources(Output.of(hasResources));
        }

        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public FeatureResourceStateArgs build() {
            return $;
        }
    }

}