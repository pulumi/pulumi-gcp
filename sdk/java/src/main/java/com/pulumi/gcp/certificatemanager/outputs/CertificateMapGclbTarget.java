// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificatemanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.certificatemanager.outputs.CertificateMapGclbTargetIpConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateMapGclbTarget {
    /**
     * @return An IP configuration where this Certificate Map is serving
     * Structure is documented below.
     * 
     */
    private @Nullable List<CertificateMapGclbTargetIpConfig> ipConfigs;
    /**
     * @return Proxy name must be in the format projects/*&#47;locations/*&#47;targetHttpsProxies/*.
     * This field is part of a union field `target_proxy`: Only one of `targetHttpsProxy` or
     * `targetSslProxy` may be set.
     * 
     */
    private @Nullable String targetHttpsProxy;
    /**
     * @return Proxy name must be in the format projects/*&#47;locations/*&#47;targetSslProxies/*.
     * This field is part of a union field `target_proxy`: Only one of `targetHttpsProxy` or
     * `targetSslProxy` may be set.
     * 
     */
    private @Nullable String targetSslProxy;

    private CertificateMapGclbTarget() {}
    /**
     * @return An IP configuration where this Certificate Map is serving
     * Structure is documented below.
     * 
     */
    public List<CertificateMapGclbTargetIpConfig> ipConfigs() {
        return this.ipConfigs == null ? List.of() : this.ipConfigs;
    }
    /**
     * @return Proxy name must be in the format projects/*&#47;locations/*&#47;targetHttpsProxies/*.
     * This field is part of a union field `target_proxy`: Only one of `targetHttpsProxy` or
     * `targetSslProxy` may be set.
     * 
     */
    public Optional<String> targetHttpsProxy() {
        return Optional.ofNullable(this.targetHttpsProxy);
    }
    /**
     * @return Proxy name must be in the format projects/*&#47;locations/*&#47;targetSslProxies/*.
     * This field is part of a union field `target_proxy`: Only one of `targetHttpsProxy` or
     * `targetSslProxy` may be set.
     * 
     */
    public Optional<String> targetSslProxy() {
        return Optional.ofNullable(this.targetSslProxy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateMapGclbTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<CertificateMapGclbTargetIpConfig> ipConfigs;
        private @Nullable String targetHttpsProxy;
        private @Nullable String targetSslProxy;
        public Builder() {}
        public Builder(CertificateMapGclbTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipConfigs = defaults.ipConfigs;
    	      this.targetHttpsProxy = defaults.targetHttpsProxy;
    	      this.targetSslProxy = defaults.targetSslProxy;
        }

        @CustomType.Setter
        public Builder ipConfigs(@Nullable List<CertificateMapGclbTargetIpConfig> ipConfigs) {

            this.ipConfigs = ipConfigs;
            return this;
        }
        public Builder ipConfigs(CertificateMapGclbTargetIpConfig... ipConfigs) {
            return ipConfigs(List.of(ipConfigs));
        }
        @CustomType.Setter
        public Builder targetHttpsProxy(@Nullable String targetHttpsProxy) {

            this.targetHttpsProxy = targetHttpsProxy;
            return this;
        }
        @CustomType.Setter
        public Builder targetSslProxy(@Nullable String targetSslProxy) {

            this.targetSslProxy = targetSslProxy;
            return this;
        }
        public CertificateMapGclbTarget build() {
            final var _resultValue = new CertificateMapGclbTarget();
            _resultValue.ipConfigs = ipConfigs;
            _resultValue.targetHttpsProxy = targetHttpsProxy;
            _resultValue.targetSslProxy = targetSslProxy;
            return _resultValue;
        }
    }
}
