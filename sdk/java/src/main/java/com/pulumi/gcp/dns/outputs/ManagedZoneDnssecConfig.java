// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dns.outputs.ManagedZoneDnssecConfigDefaultKeySpec;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedZoneDnssecConfig {
    /**
     * @return Specifies parameters that will be used for generating initial DnsKeys
     * for this ManagedZone. If you provide a spec for keySigning or zoneSigning,
     * you must also provide one for the other.
     * default_key_specs can only be updated when the state is `off`.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<ManagedZoneDnssecConfigDefaultKeySpec> defaultKeySpecs;
    /**
     * @return Identifies what kind of resource this is
     * 
     */
    private final @Nullable String kind;
    /**
     * @return Specifies the mechanism used to provide authenticated denial-of-existence responses.
     * non_existence can only be updated when the state is `off`.
     * Possible values are `nsec` and `nsec3`.
     * 
     */
    private final @Nullable String nonExistence;
    /**
     * @return Specifies whether DNSSEC is enabled, and what mode it is in
     * Possible values are `off`, `on`, and `transfer`.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private ManagedZoneDnssecConfig(
        @CustomType.Parameter("defaultKeySpecs") @Nullable List<ManagedZoneDnssecConfigDefaultKeySpec> defaultKeySpecs,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("nonExistence") @Nullable String nonExistence,
        @CustomType.Parameter("state") @Nullable String state) {
        this.defaultKeySpecs = defaultKeySpecs;
        this.kind = kind;
        this.nonExistence = nonExistence;
        this.state = state;
    }

    /**
     * @return Specifies parameters that will be used for generating initial DnsKeys
     * for this ManagedZone. If you provide a spec for keySigning or zoneSigning,
     * you must also provide one for the other.
     * default_key_specs can only be updated when the state is `off`.
     * Structure is documented below.
     * 
     */
    public List<ManagedZoneDnssecConfigDefaultKeySpec> defaultKeySpecs() {
        return this.defaultKeySpecs == null ? List.of() : this.defaultKeySpecs;
    }
    /**
     * @return Identifies what kind of resource this is
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Specifies the mechanism used to provide authenticated denial-of-existence responses.
     * non_existence can only be updated when the state is `off`.
     * Possible values are `nsec` and `nsec3`.
     * 
     */
    public Optional<String> nonExistence() {
        return Optional.ofNullable(this.nonExistence);
    }
    /**
     * @return Specifies whether DNSSEC is enabled, and what mode it is in
     * Possible values are `off`, `on`, and `transfer`.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneDnssecConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ManagedZoneDnssecConfigDefaultKeySpec> defaultKeySpecs;
        private @Nullable String kind;
        private @Nullable String nonExistence;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneDnssecConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultKeySpecs = defaults.defaultKeySpecs;
    	      this.kind = defaults.kind;
    	      this.nonExistence = defaults.nonExistence;
    	      this.state = defaults.state;
        }

        public Builder defaultKeySpecs(@Nullable List<ManagedZoneDnssecConfigDefaultKeySpec> defaultKeySpecs) {
            this.defaultKeySpecs = defaultKeySpecs;
            return this;
        }
        public Builder defaultKeySpecs(ManagedZoneDnssecConfigDefaultKeySpec... defaultKeySpecs) {
            return defaultKeySpecs(List.of(defaultKeySpecs));
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder nonExistence(@Nullable String nonExistence) {
            this.nonExistence = nonExistence;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public ManagedZoneDnssecConfig build() {
            return new ManagedZoneDnssecConfig(defaultKeySpecs, kind, nonExistence, state);
        }
    }
}