// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.ml.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EngineModelDefaultVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EngineModelDefaultVersionArgs Empty = new EngineModelDefaultVersionArgs();

    /**
     * The name specified for the version when it was created.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name specified for the version when it was created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private EngineModelDefaultVersionArgs() {}

    private EngineModelDefaultVersionArgs(EngineModelDefaultVersionArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EngineModelDefaultVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EngineModelDefaultVersionArgs $;

        public Builder() {
            $ = new EngineModelDefaultVersionArgs();
        }

        public Builder(EngineModelDefaultVersionArgs defaults) {
            $ = new EngineModelDefaultVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name specified for the version when it was created.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name specified for the version when it was created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public EngineModelDefaultVersionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}