// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.apigee.inputs.TargetServerSSlInfoCommonNameArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TargetServerSSlInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetServerSSlInfoArgs Empty = new TargetServerSSlInfoArgs();

    /**
     * The SSL/TLS cipher suites to be used. For programmable proxies, it must be one of the cipher suite names listed in: http://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#ciphersuites. For configurable proxies, it must follow the configuration specified in: https://commondatastorage.googleapis.com/chromium-boringssl-docs/ssl.h.html#Cipher-suite-configuration. This setting has no effect for configurable proxies when negotiating TLS 1.3.
     * 
     */
    @Import(name="ciphers")
    private @Nullable Output<List<String>> ciphers;

    /**
     * @return The SSL/TLS cipher suites to be used. For programmable proxies, it must be one of the cipher suite names listed in: http://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#ciphersuites. For configurable proxies, it must follow the configuration specified in: https://commondatastorage.googleapis.com/chromium-boringssl-docs/ssl.h.html#Cipher-suite-configuration. This setting has no effect for configurable proxies when negotiating TLS 1.3.
     * 
     */
    public Optional<Output<List<String>>> ciphers() {
        return Optional.ofNullable(this.ciphers);
    }

    /**
     * Enables two-way TLS.
     * 
     */
    @Import(name="clientAuthEnabled")
    private @Nullable Output<Boolean> clientAuthEnabled;

    /**
     * @return Enables two-way TLS.
     * 
     */
    public Optional<Output<Boolean>> clientAuthEnabled() {
        return Optional.ofNullable(this.clientAuthEnabled);
    }

    /**
     * The TLS Common Name of the certificate.
     * Structure is documented below.
     * 
     */
    @Import(name="commonName")
    private @Nullable Output<TargetServerSSlInfoCommonNameArgs> commonName;

    /**
     * @return The TLS Common Name of the certificate.
     * Structure is documented below.
     * 
     */
    public Optional<Output<TargetServerSSlInfoCommonNameArgs>> commonName() {
        return Optional.ofNullable(this.commonName);
    }

    /**
     * Enables TLS. If false, neither one-way nor two-way TLS will be enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Enables TLS. If false, neither one-way nor two-way TLS will be enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * If true, Edge ignores TLS certificate errors. Valid when configuring TLS for target servers and target endpoints, and when configuring virtual hosts that use 2-way TLS. When used with a target endpoint/target server, if the backend system uses SNI and returns a cert with a subject Distinguished Name (DN) that does not match the hostname, there is no way to ignore the error and the connection fails.
     * 
     */
    @Import(name="ignoreValidationErrors")
    private @Nullable Output<Boolean> ignoreValidationErrors;

    /**
     * @return If true, Edge ignores TLS certificate errors. Valid when configuring TLS for target servers and target endpoints, and when configuring virtual hosts that use 2-way TLS. When used with a target endpoint/target server, if the backend system uses SNI and returns a cert with a subject Distinguished Name (DN) that does not match the hostname, there is no way to ignore the error and the connection fails.
     * 
     */
    public Optional<Output<Boolean>> ignoreValidationErrors() {
        return Optional.ofNullable(this.ignoreValidationErrors);
    }

    /**
     * Required if clientAuthEnabled is true. The resource ID for the alias containing the private key and cert.
     * 
     */
    @Import(name="keyAlias")
    private @Nullable Output<String> keyAlias;

    /**
     * @return Required if clientAuthEnabled is true. The resource ID for the alias containing the private key and cert.
     * 
     */
    public Optional<Output<String>> keyAlias() {
        return Optional.ofNullable(this.keyAlias);
    }

    /**
     * Required if clientAuthEnabled is true. The resource ID of the keystore.
     * 
     */
    @Import(name="keyStore")
    private @Nullable Output<String> keyStore;

    /**
     * @return Required if clientAuthEnabled is true. The resource ID of the keystore.
     * 
     */
    public Optional<Output<String>> keyStore() {
        return Optional.ofNullable(this.keyStore);
    }

    /**
     * The TLS versioins to be used.
     * 
     */
    @Import(name="protocols")
    private @Nullable Output<List<String>> protocols;

    /**
     * @return The TLS versioins to be used.
     * 
     */
    public Optional<Output<List<String>>> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    /**
     * The resource ID of the truststore.
     * 
     */
    @Import(name="trustStore")
    private @Nullable Output<String> trustStore;

    /**
     * @return The resource ID of the truststore.
     * 
     */
    public Optional<Output<String>> trustStore() {
        return Optional.ofNullable(this.trustStore);
    }

    private TargetServerSSlInfoArgs() {}

    private TargetServerSSlInfoArgs(TargetServerSSlInfoArgs $) {
        this.ciphers = $.ciphers;
        this.clientAuthEnabled = $.clientAuthEnabled;
        this.commonName = $.commonName;
        this.enabled = $.enabled;
        this.ignoreValidationErrors = $.ignoreValidationErrors;
        this.keyAlias = $.keyAlias;
        this.keyStore = $.keyStore;
        this.protocols = $.protocols;
        this.trustStore = $.trustStore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetServerSSlInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetServerSSlInfoArgs $;

        public Builder() {
            $ = new TargetServerSSlInfoArgs();
        }

        public Builder(TargetServerSSlInfoArgs defaults) {
            $ = new TargetServerSSlInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ciphers The SSL/TLS cipher suites to be used. For programmable proxies, it must be one of the cipher suite names listed in: http://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#ciphersuites. For configurable proxies, it must follow the configuration specified in: https://commondatastorage.googleapis.com/chromium-boringssl-docs/ssl.h.html#Cipher-suite-configuration. This setting has no effect for configurable proxies when negotiating TLS 1.3.
         * 
         * @return builder
         * 
         */
        public Builder ciphers(@Nullable Output<List<String>> ciphers) {
            $.ciphers = ciphers;
            return this;
        }

        /**
         * @param ciphers The SSL/TLS cipher suites to be used. For programmable proxies, it must be one of the cipher suite names listed in: http://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#ciphersuites. For configurable proxies, it must follow the configuration specified in: https://commondatastorage.googleapis.com/chromium-boringssl-docs/ssl.h.html#Cipher-suite-configuration. This setting has no effect for configurable proxies when negotiating TLS 1.3.
         * 
         * @return builder
         * 
         */
        public Builder ciphers(List<String> ciphers) {
            return ciphers(Output.of(ciphers));
        }

        /**
         * @param ciphers The SSL/TLS cipher suites to be used. For programmable proxies, it must be one of the cipher suite names listed in: http://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#ciphersuites. For configurable proxies, it must follow the configuration specified in: https://commondatastorage.googleapis.com/chromium-boringssl-docs/ssl.h.html#Cipher-suite-configuration. This setting has no effect for configurable proxies when negotiating TLS 1.3.
         * 
         * @return builder
         * 
         */
        public Builder ciphers(String... ciphers) {
            return ciphers(List.of(ciphers));
        }

        /**
         * @param clientAuthEnabled Enables two-way TLS.
         * 
         * @return builder
         * 
         */
        public Builder clientAuthEnabled(@Nullable Output<Boolean> clientAuthEnabled) {
            $.clientAuthEnabled = clientAuthEnabled;
            return this;
        }

        /**
         * @param clientAuthEnabled Enables two-way TLS.
         * 
         * @return builder
         * 
         */
        public Builder clientAuthEnabled(Boolean clientAuthEnabled) {
            return clientAuthEnabled(Output.of(clientAuthEnabled));
        }

        /**
         * @param commonName The TLS Common Name of the certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder commonName(@Nullable Output<TargetServerSSlInfoCommonNameArgs> commonName) {
            $.commonName = commonName;
            return this;
        }

        /**
         * @param commonName The TLS Common Name of the certificate.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder commonName(TargetServerSSlInfoCommonNameArgs commonName) {
            return commonName(Output.of(commonName));
        }

        /**
         * @param enabled Enables TLS. If false, neither one-way nor two-way TLS will be enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enables TLS. If false, neither one-way nor two-way TLS will be enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param ignoreValidationErrors If true, Edge ignores TLS certificate errors. Valid when configuring TLS for target servers and target endpoints, and when configuring virtual hosts that use 2-way TLS. When used with a target endpoint/target server, if the backend system uses SNI and returns a cert with a subject Distinguished Name (DN) that does not match the hostname, there is no way to ignore the error and the connection fails.
         * 
         * @return builder
         * 
         */
        public Builder ignoreValidationErrors(@Nullable Output<Boolean> ignoreValidationErrors) {
            $.ignoreValidationErrors = ignoreValidationErrors;
            return this;
        }

        /**
         * @param ignoreValidationErrors If true, Edge ignores TLS certificate errors. Valid when configuring TLS for target servers and target endpoints, and when configuring virtual hosts that use 2-way TLS. When used with a target endpoint/target server, if the backend system uses SNI and returns a cert with a subject Distinguished Name (DN) that does not match the hostname, there is no way to ignore the error and the connection fails.
         * 
         * @return builder
         * 
         */
        public Builder ignoreValidationErrors(Boolean ignoreValidationErrors) {
            return ignoreValidationErrors(Output.of(ignoreValidationErrors));
        }

        /**
         * @param keyAlias Required if clientAuthEnabled is true. The resource ID for the alias containing the private key and cert.
         * 
         * @return builder
         * 
         */
        public Builder keyAlias(@Nullable Output<String> keyAlias) {
            $.keyAlias = keyAlias;
            return this;
        }

        /**
         * @param keyAlias Required if clientAuthEnabled is true. The resource ID for the alias containing the private key and cert.
         * 
         * @return builder
         * 
         */
        public Builder keyAlias(String keyAlias) {
            return keyAlias(Output.of(keyAlias));
        }

        /**
         * @param keyStore Required if clientAuthEnabled is true. The resource ID of the keystore.
         * 
         * @return builder
         * 
         */
        public Builder keyStore(@Nullable Output<String> keyStore) {
            $.keyStore = keyStore;
            return this;
        }

        /**
         * @param keyStore Required if clientAuthEnabled is true. The resource ID of the keystore.
         * 
         * @return builder
         * 
         */
        public Builder keyStore(String keyStore) {
            return keyStore(Output.of(keyStore));
        }

        /**
         * @param protocols The TLS versioins to be used.
         * 
         * @return builder
         * 
         */
        public Builder protocols(@Nullable Output<List<String>> protocols) {
            $.protocols = protocols;
            return this;
        }

        /**
         * @param protocols The TLS versioins to be used.
         * 
         * @return builder
         * 
         */
        public Builder protocols(List<String> protocols) {
            return protocols(Output.of(protocols));
        }

        /**
         * @param protocols The TLS versioins to be used.
         * 
         * @return builder
         * 
         */
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }

        /**
         * @param trustStore The resource ID of the truststore.
         * 
         * @return builder
         * 
         */
        public Builder trustStore(@Nullable Output<String> trustStore) {
            $.trustStore = trustStore;
            return this;
        }

        /**
         * @param trustStore The resource ID of the truststore.
         * 
         * @return builder
         * 
         */
        public Builder trustStore(String trustStore) {
            return trustStore(Output.of(trustStore));
        }

        public TargetServerSSlInfoArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}