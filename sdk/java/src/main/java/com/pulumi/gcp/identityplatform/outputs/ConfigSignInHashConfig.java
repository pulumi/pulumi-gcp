// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.identityplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigSignInHashConfig {
    /**
     * @return (Output)
     * Different password hash algorithms used in Identity Toolkit.
     * 
     */
    private @Nullable String algorithm;
    /**
     * @return (Output)
     * Memory cost for hash calculation. Used by scrypt and other similar password derivation algorithms. See https://tools.ietf.org/html/rfc7914 for explanation of field.
     * 
     */
    private @Nullable Integer memoryCost;
    /**
     * @return (Output)
     * How many rounds for hash calculation. Used by scrypt and other similar password derivation algorithms.
     * 
     */
    private @Nullable Integer rounds;
    /**
     * @return (Output)
     * Non-printable character to be inserted between the salt and plain text password in base64.
     * 
     */
    private @Nullable String saltSeparator;
    /**
     * @return (Output)
     * Signer key in base64.
     * 
     */
    private @Nullable String signerKey;

    private ConfigSignInHashConfig() {}
    /**
     * @return (Output)
     * Different password hash algorithms used in Identity Toolkit.
     * 
     */
    public Optional<String> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }
    /**
     * @return (Output)
     * Memory cost for hash calculation. Used by scrypt and other similar password derivation algorithms. See https://tools.ietf.org/html/rfc7914 for explanation of field.
     * 
     */
    public Optional<Integer> memoryCost() {
        return Optional.ofNullable(this.memoryCost);
    }
    /**
     * @return (Output)
     * How many rounds for hash calculation. Used by scrypt and other similar password derivation algorithms.
     * 
     */
    public Optional<Integer> rounds() {
        return Optional.ofNullable(this.rounds);
    }
    /**
     * @return (Output)
     * Non-printable character to be inserted between the salt and plain text password in base64.
     * 
     */
    public Optional<String> saltSeparator() {
        return Optional.ofNullable(this.saltSeparator);
    }
    /**
     * @return (Output)
     * Signer key in base64.
     * 
     */
    public Optional<String> signerKey() {
        return Optional.ofNullable(this.signerKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigSignInHashConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String algorithm;
        private @Nullable Integer memoryCost;
        private @Nullable Integer rounds;
        private @Nullable String saltSeparator;
        private @Nullable String signerKey;
        public Builder() {}
        public Builder(ConfigSignInHashConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.memoryCost = defaults.memoryCost;
    	      this.rounds = defaults.rounds;
    	      this.saltSeparator = defaults.saltSeparator;
    	      this.signerKey = defaults.signerKey;
        }

        @CustomType.Setter
        public Builder algorithm(@Nullable String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        @CustomType.Setter
        public Builder memoryCost(@Nullable Integer memoryCost) {
            this.memoryCost = memoryCost;
            return this;
        }
        @CustomType.Setter
        public Builder rounds(@Nullable Integer rounds) {
            this.rounds = rounds;
            return this;
        }
        @CustomType.Setter
        public Builder saltSeparator(@Nullable String saltSeparator) {
            this.saltSeparator = saltSeparator;
            return this;
        }
        @CustomType.Setter
        public Builder signerKey(@Nullable String signerKey) {
            this.signerKey = signerKey;
            return this;
        }
        public ConfigSignInHashConfig build() {
            final var o = new ConfigSignInHashConfig();
            o.algorithm = algorithm;
            o.memoryCost = memoryCost;
            o.rounds = rounds;
            o.saltSeparator = saltSeparator;
            o.signerKey = signerKey;
            return o;
        }
    }
}