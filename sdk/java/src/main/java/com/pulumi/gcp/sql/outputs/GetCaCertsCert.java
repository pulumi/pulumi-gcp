// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCaCertsCert {
    /**
     * @return The CA certificate used to connect to the SQL instance via SSL.
     * 
     */
    private String cert;
    /**
     * @return The CN valid for the CA cert.
     * 
     */
    private String commonName;
    /**
     * @return Creation time of the CA cert.
     * 
     */
    private String createTime;
    /**
     * @return Expiration time of the CA cert.
     * 
     */
    private String expirationTime;
    /**
     * @return SHA1 fingerprint of the CA cert.
     * 
     */
    private String sha1Fingerprint;

    private GetCaCertsCert() {}
    /**
     * @return The CA certificate used to connect to the SQL instance via SSL.
     * 
     */
    public String cert() {
        return this.cert;
    }
    /**
     * @return The CN valid for the CA cert.
     * 
     */
    public String commonName() {
        return this.commonName;
    }
    /**
     * @return Creation time of the CA cert.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Expiration time of the CA cert.
     * 
     */
    public String expirationTime() {
        return this.expirationTime;
    }
    /**
     * @return SHA1 fingerprint of the CA cert.
     * 
     */
    public String sha1Fingerprint() {
        return this.sha1Fingerprint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCaCertsCert defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cert;
        private String commonName;
        private String createTime;
        private String expirationTime;
        private String sha1Fingerprint;
        public Builder() {}
        public Builder(GetCaCertsCert defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.commonName = defaults.commonName;
    	      this.createTime = defaults.createTime;
    	      this.expirationTime = defaults.expirationTime;
    	      this.sha1Fingerprint = defaults.sha1Fingerprint;
        }

        @CustomType.Setter
        public Builder cert(String cert) {
            if (cert == null) {
              throw new MissingRequiredPropertyException("GetCaCertsCert", "cert");
            }
            this.cert = cert;
            return this;
        }
        @CustomType.Setter
        public Builder commonName(String commonName) {
            if (commonName == null) {
              throw new MissingRequiredPropertyException("GetCaCertsCert", "commonName");
            }
            this.commonName = commonName;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetCaCertsCert", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder expirationTime(String expirationTime) {
            if (expirationTime == null) {
              throw new MissingRequiredPropertyException("GetCaCertsCert", "expirationTime");
            }
            this.expirationTime = expirationTime;
            return this;
        }
        @CustomType.Setter
        public Builder sha1Fingerprint(String sha1Fingerprint) {
            if (sha1Fingerprint == null) {
              throw new MissingRequiredPropertyException("GetCaCertsCert", "sha1Fingerprint");
            }
            this.sha1Fingerprint = sha1Fingerprint;
            return this;
        }
        public GetCaCertsCert build() {
            final var _resultValue = new GetCaCertsCert();
            _resultValue.cert = cert;
            _resultValue.commonName = commonName;
            _resultValue.createTime = createTime;
            _resultValue.expirationTime = expirationTime;
            _resultValue.sha1Fingerprint = sha1Fingerprint;
            return _resultValue;
        }
    }
}
