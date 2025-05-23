// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetWorkloadIdentityPoolInlineCertificateIssuanceConfig {
    /**
     * @return A required mapping of a cloud region to the CA pool resource located in that region used
     * for certificate issuance, adhering to these constraints:
     * 
     * * **Key format:** A supported cloud region name equivalent to the location identifier in
     *   the corresponding map entry&#39;s value.
     * * **Value format:** A valid CA pool resource path format like:
     *   &#39;projects/{project}/locations/{location}/caPools/{ca_pool}&#39;
     * * **Region Matching:** Workloads are ONLY issued certificates from CA pools within the
     *   same region. Also the CA pool region (in value) must match the workload&#39;s region (key).
     * 
     */
    private Map<String,String> caPools;
    /**
     * @return Key algorithm to use when generating the key pair. This key pair will be used to create
     * the certificate. If unspecified, this will default to &#39;ECDSA_P256&#39;.
     * 
     * * &#39;RSA_2048&#39;: Specifies RSA with a 2048-bit modulus.
     * * &#39;RSA_3072&#39;: Specifies RSA with a 3072-bit modulus.
     * * &#39;RSA_4096&#39;: Specifies RSA with a 4096-bit modulus.
     * * &#39;ECDSA_P256&#39;: Specifies ECDSA with curve P256.
     * * &#39;ECDSA_P384&#39;: Specifies ECDSA with curve P384. Possible values: [&#34;RSA_2048&#34;, &#34;RSA_3072&#34;, &#34;RSA_4096&#34;, &#34;ECDSA_P256&#34;, &#34;ECDSA_P384&#34;]
     * 
     */
    private String keyAlgorithm;
    /**
     * @return Lifetime of the workload certificates issued by the CA pool in seconds. Must be between
     * &#39;86400s&#39; (24 hours) to &#39;2592000s&#39; (30 days), ends in the suffix &#34;&#39;s&#39;&#34; (indicating seconds)
     * and is preceded by the number of seconds. If unspecified, this will be defaulted to
     * &#39;86400s&#39; (24 hours).
     * 
     */
    private String lifetime;
    /**
     * @return Rotation window percentage indicating when certificate rotation should be initiated based
     * on remaining lifetime. Must be between &#39;50&#39; - &#39;80&#39;. If unspecified, this will be defaulted
     * to &#39;50&#39;.
     * 
     */
    private Integer rotationWindowPercentage;

    private GetWorkloadIdentityPoolInlineCertificateIssuanceConfig() {}
    /**
     * @return A required mapping of a cloud region to the CA pool resource located in that region used
     * for certificate issuance, adhering to these constraints:
     * 
     * * **Key format:** A supported cloud region name equivalent to the location identifier in
     *   the corresponding map entry&#39;s value.
     * * **Value format:** A valid CA pool resource path format like:
     *   &#39;projects/{project}/locations/{location}/caPools/{ca_pool}&#39;
     * * **Region Matching:** Workloads are ONLY issued certificates from CA pools within the
     *   same region. Also the CA pool region (in value) must match the workload&#39;s region (key).
     * 
     */
    public Map<String,String> caPools() {
        return this.caPools;
    }
    /**
     * @return Key algorithm to use when generating the key pair. This key pair will be used to create
     * the certificate. If unspecified, this will default to &#39;ECDSA_P256&#39;.
     * 
     * * &#39;RSA_2048&#39;: Specifies RSA with a 2048-bit modulus.
     * * &#39;RSA_3072&#39;: Specifies RSA with a 3072-bit modulus.
     * * &#39;RSA_4096&#39;: Specifies RSA with a 4096-bit modulus.
     * * &#39;ECDSA_P256&#39;: Specifies ECDSA with curve P256.
     * * &#39;ECDSA_P384&#39;: Specifies ECDSA with curve P384. Possible values: [&#34;RSA_2048&#34;, &#34;RSA_3072&#34;, &#34;RSA_4096&#34;, &#34;ECDSA_P256&#34;, &#34;ECDSA_P384&#34;]
     * 
     */
    public String keyAlgorithm() {
        return this.keyAlgorithm;
    }
    /**
     * @return Lifetime of the workload certificates issued by the CA pool in seconds. Must be between
     * &#39;86400s&#39; (24 hours) to &#39;2592000s&#39; (30 days), ends in the suffix &#34;&#39;s&#39;&#34; (indicating seconds)
     * and is preceded by the number of seconds. If unspecified, this will be defaulted to
     * &#39;86400s&#39; (24 hours).
     * 
     */
    public String lifetime() {
        return this.lifetime;
    }
    /**
     * @return Rotation window percentage indicating when certificate rotation should be initiated based
     * on remaining lifetime. Must be between &#39;50&#39; - &#39;80&#39;. If unspecified, this will be defaulted
     * to &#39;50&#39;.
     * 
     */
    public Integer rotationWindowPercentage() {
        return this.rotationWindowPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadIdentityPoolInlineCertificateIssuanceConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> caPools;
        private String keyAlgorithm;
        private String lifetime;
        private Integer rotationWindowPercentage;
        public Builder() {}
        public Builder(GetWorkloadIdentityPoolInlineCertificateIssuanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caPools = defaults.caPools;
    	      this.keyAlgorithm = defaults.keyAlgorithm;
    	      this.lifetime = defaults.lifetime;
    	      this.rotationWindowPercentage = defaults.rotationWindowPercentage;
        }

        @CustomType.Setter
        public Builder caPools(Map<String,String> caPools) {
            if (caPools == null) {
              throw new MissingRequiredPropertyException("GetWorkloadIdentityPoolInlineCertificateIssuanceConfig", "caPools");
            }
            this.caPools = caPools;
            return this;
        }
        @CustomType.Setter
        public Builder keyAlgorithm(String keyAlgorithm) {
            if (keyAlgorithm == null) {
              throw new MissingRequiredPropertyException("GetWorkloadIdentityPoolInlineCertificateIssuanceConfig", "keyAlgorithm");
            }
            this.keyAlgorithm = keyAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder lifetime(String lifetime) {
            if (lifetime == null) {
              throw new MissingRequiredPropertyException("GetWorkloadIdentityPoolInlineCertificateIssuanceConfig", "lifetime");
            }
            this.lifetime = lifetime;
            return this;
        }
        @CustomType.Setter
        public Builder rotationWindowPercentage(Integer rotationWindowPercentage) {
            if (rotationWindowPercentage == null) {
              throw new MissingRequiredPropertyException("GetWorkloadIdentityPoolInlineCertificateIssuanceConfig", "rotationWindowPercentage");
            }
            this.rotationWindowPercentage = rotationWindowPercentage;
            return this;
        }
        public GetWorkloadIdentityPoolInlineCertificateIssuanceConfig build() {
            final var _resultValue = new GetWorkloadIdentityPoolInlineCertificateIssuanceConfig();
            _resultValue.caPools = caPools;
            _resultValue.keyAlgorithm = keyAlgorithm;
            _resultValue.lifetime = lifetime;
            _resultValue.rotationWindowPercentage = rotationWindowPercentage;
            return _resultValue;
        }
    }
}
