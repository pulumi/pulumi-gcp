// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CryptoKeyPrimaryArgs extends com.pulumi.resources.ResourceArgs {

    public static final CryptoKeyPrimaryArgs Empty = new CryptoKeyPrimaryArgs();

    /**
     * The resource name for the CryptoKey.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name for the CryptoKey.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (Output)
     * The current state of the CryptoKeyVersion.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return (Output)
     * The current state of the CryptoKeyVersion.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private CryptoKeyPrimaryArgs() {}

    private CryptoKeyPrimaryArgs(CryptoKeyPrimaryArgs $) {
        this.name = $.name;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CryptoKeyPrimaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CryptoKeyPrimaryArgs $;

        public Builder() {
            $ = new CryptoKeyPrimaryArgs();
        }

        public Builder(CryptoKeyPrimaryArgs defaults) {
            $ = new CryptoKeyPrimaryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The resource name for the CryptoKey.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name for the CryptoKey.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param state (Output)
         * The current state of the CryptoKeyVersion.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state (Output)
         * The current state of the CryptoKeyVersion.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public CryptoKeyPrimaryArgs build() {
            return $;
        }
    }

}
