// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.redis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceNodeArgs Empty = new InstanceNodeArgs();

    /**
     * an identifier for the resource with format `projects/{{project}}/locations/{{region}}/instances/{{name}}`
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return an identifier for the resource with format `projects/{{project}}/locations/{{region}}/instances/{{name}}`
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private InstanceNodeArgs() {}

    private InstanceNodeArgs(InstanceNodeArgs $) {
        this.id = $.id;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceNodeArgs $;

        public Builder() {
            $ = new InstanceNodeArgs();
        }

        public Builder(InstanceNodeArgs defaults) {
            $ = new InstanceNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id an identifier for the resource with format `projects/{{project}}/locations/{{region}}/instances/{{name}}`
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id an identifier for the resource with format `projects/{{project}}/locations/{{region}}/instances/{{name}}`
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public InstanceNodeArgs build() {
            return $;
        }
    }

}