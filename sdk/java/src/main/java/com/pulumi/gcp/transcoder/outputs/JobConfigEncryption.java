// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.transcoder.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.transcoder.outputs.JobConfigEncryptionAes128;
import com.pulumi.gcp.transcoder.outputs.JobConfigEncryptionDrmSystems;
import com.pulumi.gcp.transcoder.outputs.JobConfigEncryptionMpegCenc;
import com.pulumi.gcp.transcoder.outputs.JobConfigEncryptionSampleAes;
import com.pulumi.gcp.transcoder.outputs.JobConfigEncryptionSecretManagerKeySource;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobConfigEncryption {
    /**
     * @return Configuration for AES-128 encryption.
     * 
     */
    private @Nullable JobConfigEncryptionAes128 aes128;
    /**
     * @return DRM system(s) to use; at least one must be specified. If a DRM system is omitted, it is considered disabled.
     * Structure is documented below.
     * 
     */
    private @Nullable JobConfigEncryptionDrmSystems drmSystems;
    /**
     * @return Identifier for this set of encryption options.
     * 
     */
    private String id;
    /**
     * @return Configuration for MPEG Common Encryption (MPEG-CENC).
     * Structure is documented below.
     * 
     */
    private @Nullable JobConfigEncryptionMpegCenc mpegCenc;
    /**
     * @return Configuration for SAMPLE-AES encryption.
     * 
     */
    private @Nullable JobConfigEncryptionSampleAes sampleAes;
    /**
     * @return Configuration for secrets stored in Google Secret Manager.
     * Structure is documented below.
     * 
     */
    private @Nullable JobConfigEncryptionSecretManagerKeySource secretManagerKeySource;

    private JobConfigEncryption() {}
    /**
     * @return Configuration for AES-128 encryption.
     * 
     */
    public Optional<JobConfigEncryptionAes128> aes128() {
        return Optional.ofNullable(this.aes128);
    }
    /**
     * @return DRM system(s) to use; at least one must be specified. If a DRM system is omitted, it is considered disabled.
     * Structure is documented below.
     * 
     */
    public Optional<JobConfigEncryptionDrmSystems> drmSystems() {
        return Optional.ofNullable(this.drmSystems);
    }
    /**
     * @return Identifier for this set of encryption options.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Configuration for MPEG Common Encryption (MPEG-CENC).
     * Structure is documented below.
     * 
     */
    public Optional<JobConfigEncryptionMpegCenc> mpegCenc() {
        return Optional.ofNullable(this.mpegCenc);
    }
    /**
     * @return Configuration for SAMPLE-AES encryption.
     * 
     */
    public Optional<JobConfigEncryptionSampleAes> sampleAes() {
        return Optional.ofNullable(this.sampleAes);
    }
    /**
     * @return Configuration for secrets stored in Google Secret Manager.
     * Structure is documented below.
     * 
     */
    public Optional<JobConfigEncryptionSecretManagerKeySource> secretManagerKeySource() {
        return Optional.ofNullable(this.secretManagerKeySource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigEncryption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable JobConfigEncryptionAes128 aes128;
        private @Nullable JobConfigEncryptionDrmSystems drmSystems;
        private String id;
        private @Nullable JobConfigEncryptionMpegCenc mpegCenc;
        private @Nullable JobConfigEncryptionSampleAes sampleAes;
        private @Nullable JobConfigEncryptionSecretManagerKeySource secretManagerKeySource;
        public Builder() {}
        public Builder(JobConfigEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aes128 = defaults.aes128;
    	      this.drmSystems = defaults.drmSystems;
    	      this.id = defaults.id;
    	      this.mpegCenc = defaults.mpegCenc;
    	      this.sampleAes = defaults.sampleAes;
    	      this.secretManagerKeySource = defaults.secretManagerKeySource;
        }

        @CustomType.Setter
        public Builder aes128(@Nullable JobConfigEncryptionAes128 aes128) {

            this.aes128 = aes128;
            return this;
        }
        @CustomType.Setter
        public Builder drmSystems(@Nullable JobConfigEncryptionDrmSystems drmSystems) {

            this.drmSystems = drmSystems;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("JobConfigEncryption", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mpegCenc(@Nullable JobConfigEncryptionMpegCenc mpegCenc) {

            this.mpegCenc = mpegCenc;
            return this;
        }
        @CustomType.Setter
        public Builder sampleAes(@Nullable JobConfigEncryptionSampleAes sampleAes) {

            this.sampleAes = sampleAes;
            return this;
        }
        @CustomType.Setter
        public Builder secretManagerKeySource(@Nullable JobConfigEncryptionSecretManagerKeySource secretManagerKeySource) {

            this.secretManagerKeySource = secretManagerKeySource;
            return this;
        }
        public JobConfigEncryption build() {
            final var _resultValue = new JobConfigEncryption();
            _resultValue.aes128 = aes128;
            _resultValue.drmSystems = drmSystems;
            _resultValue.id = id;
            _resultValue.mpegCenc = mpegCenc;
            _resultValue.sampleAes = sampleAes;
            _resultValue.secretManagerKeySource = secretManagerKeySource;
            return _resultValue;
        }
    }
}
