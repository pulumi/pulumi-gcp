// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CryptoKeyVersionAttestationExternalProtectionLevelOptions {
    private @Nullable String ekmConnectionKeyPath;
    private @Nullable String externalKeyUri;

    private CryptoKeyVersionAttestationExternalProtectionLevelOptions() {}
    public Optional<String> ekmConnectionKeyPath() {
        return Optional.ofNullable(this.ekmConnectionKeyPath);
    }
    public Optional<String> externalKeyUri() {
        return Optional.ofNullable(this.externalKeyUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyVersionAttestationExternalProtectionLevelOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String ekmConnectionKeyPath;
        private @Nullable String externalKeyUri;
        public Builder() {}
        public Builder(CryptoKeyVersionAttestationExternalProtectionLevelOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ekmConnectionKeyPath = defaults.ekmConnectionKeyPath;
    	      this.externalKeyUri = defaults.externalKeyUri;
        }

        @CustomType.Setter
        public Builder ekmConnectionKeyPath(@Nullable String ekmConnectionKeyPath) {
            this.ekmConnectionKeyPath = ekmConnectionKeyPath;
            return this;
        }
        @CustomType.Setter
        public Builder externalKeyUri(@Nullable String externalKeyUri) {
            this.externalKeyUri = externalKeyUri;
            return this;
        }
        public CryptoKeyVersionAttestationExternalProtectionLevelOptions build() {
            final var o = new CryptoKeyVersionAttestationExternalProtectionLevelOptions();
            o.ekmConnectionKeyPath = ekmConnectionKeyPath;
            o.externalKeyUri = externalKeyUri;
            return o;
        }
    }
}