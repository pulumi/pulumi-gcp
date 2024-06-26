// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWorkloadIdentityPoolProviderOidc {
    /**
     * @return Acceptable values for the &#39;aud&#39; field (audience) in the OIDC token. Token exchange
     * requests are rejected if the token audience does not match one of the configured
     * values. Each audience may be at most 256 characters. A maximum of 10 audiences may
     * be configured.
     * 
     * If this list is empty, the OIDC token audience must be equal to the full canonical
     * resource name of the WorkloadIdentityPoolProvider, with or without the HTTPS prefix.
     * For example:
     * &#39;&#39;&#39;
     * //iam.googleapis.com/projects/&lt;project-number&gt;/locations/&lt;location&gt;/workloadIdentityPools/&lt;pool-id&gt;/providers/&lt;provider-id&gt;
     * https://iam.googleapis.com/projects/&lt;project-number&gt;/locations/&lt;location&gt;/workloadIdentityPools/&lt;pool-id&gt;/providers/&lt;provider-id&gt;
     * &#39;&#39;&#39;
     * 
     */
    private List<String> allowedAudiences;
    /**
     * @return The OIDC issuer URL.
     * 
     */
    private String issuerUri;
    /**
     * @return OIDC JWKs in JSON String format. For details on definition of a
     * JWK, see https:tools.ietf.org/html/rfc7517. If not set, then we
     * use the &#39;jwks_uri&#39; from the discovery document fetched from the
     * .well-known path for the &#39;issuer_uri&#39;. Currently, RSA and EC asymmetric
     * keys are supported. The JWK must use following format and include only
     * the following fields:
     * &#39;&#39;&#39;
     * {
     *   &#34;keys&#34;: [
     *     {
     *           &#34;kty&#34;: &#34;RSA/EC&#34;,
     *           &#34;alg&#34;: &#34;&lt;algorithm&gt;&#34;,
     *           &#34;use&#34;: &#34;sig&#34;,
     *           &#34;kid&#34;: &#34;&lt;key-id&gt;&#34;,
     *           &#34;n&#34;: &#34;&#34;,
     *           &#34;e&#34;: &#34;&#34;,
     *           &#34;x&#34;: &#34;&#34;,
     *           &#34;y&#34;: &#34;&#34;,
     *           &#34;crv&#34;: &#34;&#34;
     *     }
     *   ]
     * }
     * &#39;&#39;&#39;
     * 
     */
    private String jwksJson;

    private GetWorkloadIdentityPoolProviderOidc() {}
    /**
     * @return Acceptable values for the &#39;aud&#39; field (audience) in the OIDC token. Token exchange
     * requests are rejected if the token audience does not match one of the configured
     * values. Each audience may be at most 256 characters. A maximum of 10 audiences may
     * be configured.
     * 
     * If this list is empty, the OIDC token audience must be equal to the full canonical
     * resource name of the WorkloadIdentityPoolProvider, with or without the HTTPS prefix.
     * For example:
     * &#39;&#39;&#39;
     * //iam.googleapis.com/projects/&lt;project-number&gt;/locations/&lt;location&gt;/workloadIdentityPools/&lt;pool-id&gt;/providers/&lt;provider-id&gt;
     * https://iam.googleapis.com/projects/&lt;project-number&gt;/locations/&lt;location&gt;/workloadIdentityPools/&lt;pool-id&gt;/providers/&lt;provider-id&gt;
     * &#39;&#39;&#39;
     * 
     */
    public List<String> allowedAudiences() {
        return this.allowedAudiences;
    }
    /**
     * @return The OIDC issuer URL.
     * 
     */
    public String issuerUri() {
        return this.issuerUri;
    }
    /**
     * @return OIDC JWKs in JSON String format. For details on definition of a
     * JWK, see https:tools.ietf.org/html/rfc7517. If not set, then we
     * use the &#39;jwks_uri&#39; from the discovery document fetched from the
     * .well-known path for the &#39;issuer_uri&#39;. Currently, RSA and EC asymmetric
     * keys are supported. The JWK must use following format and include only
     * the following fields:
     * &#39;&#39;&#39;
     * {
     *   &#34;keys&#34;: [
     *     {
     *           &#34;kty&#34;: &#34;RSA/EC&#34;,
     *           &#34;alg&#34;: &#34;&lt;algorithm&gt;&#34;,
     *           &#34;use&#34;: &#34;sig&#34;,
     *           &#34;kid&#34;: &#34;&lt;key-id&gt;&#34;,
     *           &#34;n&#34;: &#34;&#34;,
     *           &#34;e&#34;: &#34;&#34;,
     *           &#34;x&#34;: &#34;&#34;,
     *           &#34;y&#34;: &#34;&#34;,
     *           &#34;crv&#34;: &#34;&#34;
     *     }
     *   ]
     * }
     * &#39;&#39;&#39;
     * 
     */
    public String jwksJson() {
        return this.jwksJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadIdentityPoolProviderOidc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedAudiences;
        private String issuerUri;
        private String jwksJson;
        public Builder() {}
        public Builder(GetWorkloadIdentityPoolProviderOidc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
    	      this.issuerUri = defaults.issuerUri;
    	      this.jwksJson = defaults.jwksJson;
        }

        @CustomType.Setter
        public Builder allowedAudiences(List<String> allowedAudiences) {
            if (allowedAudiences == null) {
              throw new MissingRequiredPropertyException("GetWorkloadIdentityPoolProviderOidc", "allowedAudiences");
            }
            this.allowedAudiences = allowedAudiences;
            return this;
        }
        public Builder allowedAudiences(String... allowedAudiences) {
            return allowedAudiences(List.of(allowedAudiences));
        }
        @CustomType.Setter
        public Builder issuerUri(String issuerUri) {
            if (issuerUri == null) {
              throw new MissingRequiredPropertyException("GetWorkloadIdentityPoolProviderOidc", "issuerUri");
            }
            this.issuerUri = issuerUri;
            return this;
        }
        @CustomType.Setter
        public Builder jwksJson(String jwksJson) {
            if (jwksJson == null) {
              throw new MissingRequiredPropertyException("GetWorkloadIdentityPoolProviderOidc", "jwksJson");
            }
            this.jwksJson = jwksJson;
            return this;
        }
        public GetWorkloadIdentityPoolProviderOidc build() {
            final var _resultValue = new GetWorkloadIdentityPoolProviderOidc();
            _resultValue.allowedAudiences = allowedAudiences;
            _resultValue.issuerUri = issuerUri;
            _resultValue.jwksJson = jwksJson;
            return _resultValue;
        }
    }
}
