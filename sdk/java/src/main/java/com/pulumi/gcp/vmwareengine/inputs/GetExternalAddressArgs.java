// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vmwareengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetExternalAddressArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExternalAddressArgs Empty = new GetExternalAddressArgs();

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The resource name of the private cloud that this cluster belongs.
     * 
     */
    @Import(name="parent", required=true)
    private Output<String> parent;

    /**
     * @return The resource name of the private cloud that this cluster belongs.
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }

    private GetExternalAddressArgs() {}

    private GetExternalAddressArgs(GetExternalAddressArgs $) {
        this.name = $.name;
        this.parent = $.parent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExternalAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExternalAddressArgs $;

        public Builder() {
            $ = new GetExternalAddressArgs();
        }

        public Builder(GetExternalAddressArgs defaults) {
            $ = new GetExternalAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parent The resource name of the private cloud that this cluster belongs.
         * 
         * @return builder
         * 
         */
        public Builder parent(Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The resource name of the private cloud that this cluster belongs.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        public GetExternalAddressArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetExternalAddressArgs", "name");
            }
            if ($.parent == null) {
                throw new MissingRequiredPropertyException("GetExternalAddressArgs", "parent");
            }
            return $;
        }
    }

}