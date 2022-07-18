// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedIssuanceModesArgs;
import com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedKeyTypeArgs;
import com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesArgs;
import com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyIdentityConstraintsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CaPoolIssuancePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CaPoolIssuancePolicyArgs Empty = new CaPoolIssuancePolicyArgs();

    /**
     * IssuanceModes specifies the allowed ways in which Certificates may be requested from this CaPool.
     * Structure is documented below.
     * 
     */
    @Import(name="allowedIssuanceModes")
    private @Nullable Output<CaPoolIssuancePolicyAllowedIssuanceModesArgs> allowedIssuanceModes;

    /**
     * @return IssuanceModes specifies the allowed ways in which Certificates may be requested from this CaPool.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CaPoolIssuancePolicyAllowedIssuanceModesArgs>> allowedIssuanceModes() {
        return Optional.ofNullable(this.allowedIssuanceModes);
    }

    /**
     * If any AllowedKeyType is specified, then the certificate request&#39;s public key must match one of the key types listed here.
     * Otherwise, any key may be used.
     * Structure is documented below.
     * 
     */
    @Import(name="allowedKeyTypes")
    private @Nullable Output<List<CaPoolIssuancePolicyAllowedKeyTypeArgs>> allowedKeyTypes;

    /**
     * @return If any AllowedKeyType is specified, then the certificate request&#39;s public key must match one of the key types listed here.
     * Otherwise, any key may be used.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CaPoolIssuancePolicyAllowedKeyTypeArgs>>> allowedKeyTypes() {
        return Optional.ofNullable(this.allowedKeyTypes);
    }

    /**
     * A set of X.509 values that will be applied to all certificates issued through this CaPool. If a certificate request
     * includes conflicting values for the same properties, they will be overwritten by the values defined here. If a certificate
     * request uses a CertificateTemplate that defines conflicting predefinedValues for the same properties, the certificate
     * issuance request will fail.
     * Structure is documented below.
     * 
     */
    @Import(name="baselineValues")
    private @Nullable Output<CaPoolIssuancePolicyBaselineValuesArgs> baselineValues;

    /**
     * @return A set of X.509 values that will be applied to all certificates issued through this CaPool. If a certificate request
     * includes conflicting values for the same properties, they will be overwritten by the values defined here. If a certificate
     * request uses a CertificateTemplate that defines conflicting predefinedValues for the same properties, the certificate
     * issuance request will fail.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CaPoolIssuancePolicyBaselineValuesArgs>> baselineValues() {
        return Optional.ofNullable(this.baselineValues);
    }

    /**
     * Describes constraints on identities that may appear in Certificates issued through this CaPool.
     * If this is omitted, then this CaPool will not add restrictions on a certificate&#39;s identity.
     * Structure is documented below.
     * 
     */
    @Import(name="identityConstraints")
    private @Nullable Output<CaPoolIssuancePolicyIdentityConstraintsArgs> identityConstraints;

    /**
     * @return Describes constraints on identities that may appear in Certificates issued through this CaPool.
     * If this is omitted, then this CaPool will not add restrictions on a certificate&#39;s identity.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CaPoolIssuancePolicyIdentityConstraintsArgs>> identityConstraints() {
        return Optional.ofNullable(this.identityConstraints);
    }

    /**
     * The maximum lifetime allowed for issued Certificates. Note that if the issuing CertificateAuthority
     * expires before a Certificate&#39;s requested maximumLifetime, the effective lifetime will be explicitly truncated to match it.
     * 
     */
    @Import(name="maximumLifetime")
    private @Nullable Output<String> maximumLifetime;

    /**
     * @return The maximum lifetime allowed for issued Certificates. Note that if the issuing CertificateAuthority
     * expires before a Certificate&#39;s requested maximumLifetime, the effective lifetime will be explicitly truncated to match it.
     * 
     */
    public Optional<Output<String>> maximumLifetime() {
        return Optional.ofNullable(this.maximumLifetime);
    }

    private CaPoolIssuancePolicyArgs() {}

    private CaPoolIssuancePolicyArgs(CaPoolIssuancePolicyArgs $) {
        this.allowedIssuanceModes = $.allowedIssuanceModes;
        this.allowedKeyTypes = $.allowedKeyTypes;
        this.baselineValues = $.baselineValues;
        this.identityConstraints = $.identityConstraints;
        this.maximumLifetime = $.maximumLifetime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CaPoolIssuancePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CaPoolIssuancePolicyArgs $;

        public Builder() {
            $ = new CaPoolIssuancePolicyArgs();
        }

        public Builder(CaPoolIssuancePolicyArgs defaults) {
            $ = new CaPoolIssuancePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedIssuanceModes IssuanceModes specifies the allowed ways in which Certificates may be requested from this CaPool.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder allowedIssuanceModes(@Nullable Output<CaPoolIssuancePolicyAllowedIssuanceModesArgs> allowedIssuanceModes) {
            $.allowedIssuanceModes = allowedIssuanceModes;
            return this;
        }

        /**
         * @param allowedIssuanceModes IssuanceModes specifies the allowed ways in which Certificates may be requested from this CaPool.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder allowedIssuanceModes(CaPoolIssuancePolicyAllowedIssuanceModesArgs allowedIssuanceModes) {
            return allowedIssuanceModes(Output.of(allowedIssuanceModes));
        }

        /**
         * @param allowedKeyTypes If any AllowedKeyType is specified, then the certificate request&#39;s public key must match one of the key types listed here.
         * Otherwise, any key may be used.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder allowedKeyTypes(@Nullable Output<List<CaPoolIssuancePolicyAllowedKeyTypeArgs>> allowedKeyTypes) {
            $.allowedKeyTypes = allowedKeyTypes;
            return this;
        }

        /**
         * @param allowedKeyTypes If any AllowedKeyType is specified, then the certificate request&#39;s public key must match one of the key types listed here.
         * Otherwise, any key may be used.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder allowedKeyTypes(List<CaPoolIssuancePolicyAllowedKeyTypeArgs> allowedKeyTypes) {
            return allowedKeyTypes(Output.of(allowedKeyTypes));
        }

        /**
         * @param allowedKeyTypes If any AllowedKeyType is specified, then the certificate request&#39;s public key must match one of the key types listed here.
         * Otherwise, any key may be used.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder allowedKeyTypes(CaPoolIssuancePolicyAllowedKeyTypeArgs... allowedKeyTypes) {
            return allowedKeyTypes(List.of(allowedKeyTypes));
        }

        /**
         * @param baselineValues A set of X.509 values that will be applied to all certificates issued through this CaPool. If a certificate request
         * includes conflicting values for the same properties, they will be overwritten by the values defined here. If a certificate
         * request uses a CertificateTemplate that defines conflicting predefinedValues for the same properties, the certificate
         * issuance request will fail.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder baselineValues(@Nullable Output<CaPoolIssuancePolicyBaselineValuesArgs> baselineValues) {
            $.baselineValues = baselineValues;
            return this;
        }

        /**
         * @param baselineValues A set of X.509 values that will be applied to all certificates issued through this CaPool. If a certificate request
         * includes conflicting values for the same properties, they will be overwritten by the values defined here. If a certificate
         * request uses a CertificateTemplate that defines conflicting predefinedValues for the same properties, the certificate
         * issuance request will fail.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder baselineValues(CaPoolIssuancePolicyBaselineValuesArgs baselineValues) {
            return baselineValues(Output.of(baselineValues));
        }

        /**
         * @param identityConstraints Describes constraints on identities that may appear in Certificates issued through this CaPool.
         * If this is omitted, then this CaPool will not add restrictions on a certificate&#39;s identity.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder identityConstraints(@Nullable Output<CaPoolIssuancePolicyIdentityConstraintsArgs> identityConstraints) {
            $.identityConstraints = identityConstraints;
            return this;
        }

        /**
         * @param identityConstraints Describes constraints on identities that may appear in Certificates issued through this CaPool.
         * If this is omitted, then this CaPool will not add restrictions on a certificate&#39;s identity.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder identityConstraints(CaPoolIssuancePolicyIdentityConstraintsArgs identityConstraints) {
            return identityConstraints(Output.of(identityConstraints));
        }

        /**
         * @param maximumLifetime The maximum lifetime allowed for issued Certificates. Note that if the issuing CertificateAuthority
         * expires before a Certificate&#39;s requested maximumLifetime, the effective lifetime will be explicitly truncated to match it.
         * 
         * @return builder
         * 
         */
        public Builder maximumLifetime(@Nullable Output<String> maximumLifetime) {
            $.maximumLifetime = maximumLifetime;
            return this;
        }

        /**
         * @param maximumLifetime The maximum lifetime allowed for issued Certificates. Note that if the issuing CertificateAuthority
         * expires before a Certificate&#39;s requested maximumLifetime, the effective lifetime will be explicitly truncated to match it.
         * 
         * @return builder
         * 
         */
        public Builder maximumLifetime(String maximumLifetime) {
            return maximumLifetime(Output.of(maximumLifetime));
        }

        public CaPoolIssuancePolicyArgs build() {
            return $;
        }
    }

}