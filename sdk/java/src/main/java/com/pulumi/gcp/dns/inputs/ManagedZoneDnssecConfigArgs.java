// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigDefaultKeySpecArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedZoneDnssecConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedZoneDnssecConfigArgs Empty = new ManagedZoneDnssecConfigArgs();

    /**
     * Specifies parameters that will be used for generating initial DnsKeys
     * for this ManagedZone. If you provide a spec for keySigning or zoneSigning,
     * you must also provide one for the other.
     * default_key_specs can only be updated when the state is `off`.
     * Structure is documented below.
     * 
     */
    @Import(name="defaultKeySpecs")
    private @Nullable Output<List<ManagedZoneDnssecConfigDefaultKeySpecArgs>> defaultKeySpecs;

    /**
     * @return Specifies parameters that will be used for generating initial DnsKeys
     * for this ManagedZone. If you provide a spec for keySigning or zoneSigning,
     * you must also provide one for the other.
     * default_key_specs can only be updated when the state is `off`.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ManagedZoneDnssecConfigDefaultKeySpecArgs>>> defaultKeySpecs() {
        return Optional.ofNullable(this.defaultKeySpecs);
    }

    /**
     * Identifies what kind of resource this is
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Identifies what kind of resource this is
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Specifies the mechanism used to provide authenticated denial-of-existence responses.
     * non_existence can only be updated when the state is `off`.
     * Possible values are `nsec` and `nsec3`.
     * 
     */
    @Import(name="nonExistence")
    private @Nullable Output<String> nonExistence;

    /**
     * @return Specifies the mechanism used to provide authenticated denial-of-existence responses.
     * non_existence can only be updated when the state is `off`.
     * Possible values are `nsec` and `nsec3`.
     * 
     */
    public Optional<Output<String>> nonExistence() {
        return Optional.ofNullable(this.nonExistence);
    }

    /**
     * Specifies whether DNSSEC is enabled, and what mode it is in
     * Possible values are `off`, `on`, and `transfer`.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Specifies whether DNSSEC is enabled, and what mode it is in
     * Possible values are `off`, `on`, and `transfer`.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private ManagedZoneDnssecConfigArgs() {}

    private ManagedZoneDnssecConfigArgs(ManagedZoneDnssecConfigArgs $) {
        this.defaultKeySpecs = $.defaultKeySpecs;
        this.kind = $.kind;
        this.nonExistence = $.nonExistence;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZoneDnssecConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZoneDnssecConfigArgs $;

        public Builder() {
            $ = new ManagedZoneDnssecConfigArgs();
        }

        public Builder(ManagedZoneDnssecConfigArgs defaults) {
            $ = new ManagedZoneDnssecConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultKeySpecs Specifies parameters that will be used for generating initial DnsKeys
         * for this ManagedZone. If you provide a spec for keySigning or zoneSigning,
         * you must also provide one for the other.
         * default_key_specs can only be updated when the state is `off`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder defaultKeySpecs(@Nullable Output<List<ManagedZoneDnssecConfigDefaultKeySpecArgs>> defaultKeySpecs) {
            $.defaultKeySpecs = defaultKeySpecs;
            return this;
        }

        /**
         * @param defaultKeySpecs Specifies parameters that will be used for generating initial DnsKeys
         * for this ManagedZone. If you provide a spec for keySigning or zoneSigning,
         * you must also provide one for the other.
         * default_key_specs can only be updated when the state is `off`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder defaultKeySpecs(List<ManagedZoneDnssecConfigDefaultKeySpecArgs> defaultKeySpecs) {
            return defaultKeySpecs(Output.of(defaultKeySpecs));
        }

        /**
         * @param defaultKeySpecs Specifies parameters that will be used for generating initial DnsKeys
         * for this ManagedZone. If you provide a spec for keySigning or zoneSigning,
         * you must also provide one for the other.
         * default_key_specs can only be updated when the state is `off`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder defaultKeySpecs(ManagedZoneDnssecConfigDefaultKeySpecArgs... defaultKeySpecs) {
            return defaultKeySpecs(List.of(defaultKeySpecs));
        }

        /**
         * @param kind Identifies what kind of resource this is
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Identifies what kind of resource this is
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param nonExistence Specifies the mechanism used to provide authenticated denial-of-existence responses.
         * non_existence can only be updated when the state is `off`.
         * Possible values are `nsec` and `nsec3`.
         * 
         * @return builder
         * 
         */
        public Builder nonExistence(@Nullable Output<String> nonExistence) {
            $.nonExistence = nonExistence;
            return this;
        }

        /**
         * @param nonExistence Specifies the mechanism used to provide authenticated denial-of-existence responses.
         * non_existence can only be updated when the state is `off`.
         * Possible values are `nsec` and `nsec3`.
         * 
         * @return builder
         * 
         */
        public Builder nonExistence(String nonExistence) {
            return nonExistence(Output.of(nonExistence));
        }

        /**
         * @param state Specifies whether DNSSEC is enabled, and what mode it is in
         * Possible values are `off`, `on`, and `transfer`.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Specifies whether DNSSEC is enabled, and what mode it is in
         * Possible values are `off`, `on`, and `transfer`.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public ManagedZoneDnssecConfigArgs build() {
            return $;
        }
    }

}