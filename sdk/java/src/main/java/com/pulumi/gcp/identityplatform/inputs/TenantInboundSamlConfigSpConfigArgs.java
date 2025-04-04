// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.identityplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigSpConfigSpCertificateArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TenantInboundSamlConfigSpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final TenantInboundSamlConfigSpConfigArgs Empty = new TenantInboundSamlConfigSpConfigArgs();

    /**
     * Callback URI where responses from IDP are handled. Must start with `https://`.
     * 
     */
    @Import(name="callbackUri", required=true)
    private Output<String> callbackUri;

    /**
     * @return Callback URI where responses from IDP are handled. Must start with `https://`.
     * 
     */
    public Output<String> callbackUri() {
        return this.callbackUri;
    }

    /**
     * (Output)
     * The IDP&#39;s certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nested_sp_config_sp_certificates&#34;&gt;&lt;/a&gt;The `sp_certificates` block contains:
     * 
     */
    @Import(name="spCertificates")
    private @Nullable Output<List<TenantInboundSamlConfigSpConfigSpCertificateArgs>> spCertificates;

    /**
     * @return (Output)
     * The IDP&#39;s certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nested_sp_config_sp_certificates&#34;&gt;&lt;/a&gt;The `sp_certificates` block contains:
     * 
     */
    public Optional<Output<List<TenantInboundSamlConfigSpConfigSpCertificateArgs>>> spCertificates() {
        return Optional.ofNullable(this.spCertificates);
    }

    /**
     * Unique identifier for all SAML entities.
     * 
     */
    @Import(name="spEntityId", required=true)
    private Output<String> spEntityId;

    /**
     * @return Unique identifier for all SAML entities.
     * 
     */
    public Output<String> spEntityId() {
        return this.spEntityId;
    }

    private TenantInboundSamlConfigSpConfigArgs() {}

    private TenantInboundSamlConfigSpConfigArgs(TenantInboundSamlConfigSpConfigArgs $) {
        this.callbackUri = $.callbackUri;
        this.spCertificates = $.spCertificates;
        this.spEntityId = $.spEntityId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TenantInboundSamlConfigSpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TenantInboundSamlConfigSpConfigArgs $;

        public Builder() {
            $ = new TenantInboundSamlConfigSpConfigArgs();
        }

        public Builder(TenantInboundSamlConfigSpConfigArgs defaults) {
            $ = new TenantInboundSamlConfigSpConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param callbackUri Callback URI where responses from IDP are handled. Must start with `https://`.
         * 
         * @return builder
         * 
         */
        public Builder callbackUri(Output<String> callbackUri) {
            $.callbackUri = callbackUri;
            return this;
        }

        /**
         * @param callbackUri Callback URI where responses from IDP are handled. Must start with `https://`.
         * 
         * @return builder
         * 
         */
        public Builder callbackUri(String callbackUri) {
            return callbackUri(Output.of(callbackUri));
        }

        /**
         * @param spCertificates (Output)
         * The IDP&#39;s certificate data to verify the signature in the SAMLResponse issued by the IDP.
         * Structure is documented below.
         * 
         * &lt;a name=&#34;nested_sp_config_sp_certificates&#34;&gt;&lt;/a&gt;The `sp_certificates` block contains:
         * 
         * @return builder
         * 
         */
        public Builder spCertificates(@Nullable Output<List<TenantInboundSamlConfigSpConfigSpCertificateArgs>> spCertificates) {
            $.spCertificates = spCertificates;
            return this;
        }

        /**
         * @param spCertificates (Output)
         * The IDP&#39;s certificate data to verify the signature in the SAMLResponse issued by the IDP.
         * Structure is documented below.
         * 
         * &lt;a name=&#34;nested_sp_config_sp_certificates&#34;&gt;&lt;/a&gt;The `sp_certificates` block contains:
         * 
         * @return builder
         * 
         */
        public Builder spCertificates(List<TenantInboundSamlConfigSpConfigSpCertificateArgs> spCertificates) {
            return spCertificates(Output.of(spCertificates));
        }

        /**
         * @param spCertificates (Output)
         * The IDP&#39;s certificate data to verify the signature in the SAMLResponse issued by the IDP.
         * Structure is documented below.
         * 
         * &lt;a name=&#34;nested_sp_config_sp_certificates&#34;&gt;&lt;/a&gt;The `sp_certificates` block contains:
         * 
         * @return builder
         * 
         */
        public Builder spCertificates(TenantInboundSamlConfigSpConfigSpCertificateArgs... spCertificates) {
            return spCertificates(List.of(spCertificates));
        }

        /**
         * @param spEntityId Unique identifier for all SAML entities.
         * 
         * @return builder
         * 
         */
        public Builder spEntityId(Output<String> spEntityId) {
            $.spEntityId = spEntityId;
            return this;
        }

        /**
         * @param spEntityId Unique identifier for all SAML entities.
         * 
         * @return builder
         * 
         */
        public Builder spEntityId(String spEntityId) {
            return spEntityId(Output.of(spEntityId));
        }

        public TenantInboundSamlConfigSpConfigArgs build() {
            if ($.callbackUri == null) {
                throw new MissingRequiredPropertyException("TenantInboundSamlConfigSpConfigArgs", "callbackUri");
            }
            if ($.spEntityId == null) {
                throw new MissingRequiredPropertyException("TenantInboundSamlConfigSpConfigArgs", "spEntityId");
            }
            return $;
        }
    }

}
