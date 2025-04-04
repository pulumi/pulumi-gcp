// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.transcoder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionAes128Args;
import com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionDrmSystemsArgs;
import com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionMpegCencArgs;
import com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionSampleAesArgs;
import com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionSecretManagerKeySourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTemplateConfigEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTemplateConfigEncryptionArgs Empty = new JobTemplateConfigEncryptionArgs();

    /**
     * Configuration for AES-128 encryption.
     * 
     */
    @Import(name="aes128")
    private @Nullable Output<JobTemplateConfigEncryptionAes128Args> aes128;

    /**
     * @return Configuration for AES-128 encryption.
     * 
     */
    public Optional<Output<JobTemplateConfigEncryptionAes128Args>> aes128() {
        return Optional.ofNullable(this.aes128);
    }

    /**
     * DRM system(s) to use; at least one must be specified. If a DRM system is omitted, it is considered disabled.
     * Structure is documented below.
     * 
     */
    @Import(name="drmSystems")
    private @Nullable Output<JobTemplateConfigEncryptionDrmSystemsArgs> drmSystems;

    /**
     * @return DRM system(s) to use; at least one must be specified. If a DRM system is omitted, it is considered disabled.
     * Structure is documented below.
     * 
     */
    public Optional<Output<JobTemplateConfigEncryptionDrmSystemsArgs>> drmSystems() {
        return Optional.ofNullable(this.drmSystems);
    }

    /**
     * Identifier for this set of encryption options.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Identifier for this set of encryption options.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Configuration for MPEG Common Encryption (MPEG-CENC).
     * Structure is documented below.
     * 
     */
    @Import(name="mpegCenc")
    private @Nullable Output<JobTemplateConfigEncryptionMpegCencArgs> mpegCenc;

    /**
     * @return Configuration for MPEG Common Encryption (MPEG-CENC).
     * Structure is documented below.
     * 
     */
    public Optional<Output<JobTemplateConfigEncryptionMpegCencArgs>> mpegCenc() {
        return Optional.ofNullable(this.mpegCenc);
    }

    /**
     * Configuration for SAMPLE-AES encryption.
     * 
     */
    @Import(name="sampleAes")
    private @Nullable Output<JobTemplateConfigEncryptionSampleAesArgs> sampleAes;

    /**
     * @return Configuration for SAMPLE-AES encryption.
     * 
     */
    public Optional<Output<JobTemplateConfigEncryptionSampleAesArgs>> sampleAes() {
        return Optional.ofNullable(this.sampleAes);
    }

    /**
     * Configuration for secrets stored in Google Secret Manager.
     * Structure is documented below.
     * 
     */
    @Import(name="secretManagerKeySource")
    private @Nullable Output<JobTemplateConfigEncryptionSecretManagerKeySourceArgs> secretManagerKeySource;

    /**
     * @return Configuration for secrets stored in Google Secret Manager.
     * Structure is documented below.
     * 
     */
    public Optional<Output<JobTemplateConfigEncryptionSecretManagerKeySourceArgs>> secretManagerKeySource() {
        return Optional.ofNullable(this.secretManagerKeySource);
    }

    private JobTemplateConfigEncryptionArgs() {}

    private JobTemplateConfigEncryptionArgs(JobTemplateConfigEncryptionArgs $) {
        this.aes128 = $.aes128;
        this.drmSystems = $.drmSystems;
        this.id = $.id;
        this.mpegCenc = $.mpegCenc;
        this.sampleAes = $.sampleAes;
        this.secretManagerKeySource = $.secretManagerKeySource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTemplateConfigEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTemplateConfigEncryptionArgs $;

        public Builder() {
            $ = new JobTemplateConfigEncryptionArgs();
        }

        public Builder(JobTemplateConfigEncryptionArgs defaults) {
            $ = new JobTemplateConfigEncryptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aes128 Configuration for AES-128 encryption.
         * 
         * @return builder
         * 
         */
        public Builder aes128(@Nullable Output<JobTemplateConfigEncryptionAes128Args> aes128) {
            $.aes128 = aes128;
            return this;
        }

        /**
         * @param aes128 Configuration for AES-128 encryption.
         * 
         * @return builder
         * 
         */
        public Builder aes128(JobTemplateConfigEncryptionAes128Args aes128) {
            return aes128(Output.of(aes128));
        }

        /**
         * @param drmSystems DRM system(s) to use; at least one must be specified. If a DRM system is omitted, it is considered disabled.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder drmSystems(@Nullable Output<JobTemplateConfigEncryptionDrmSystemsArgs> drmSystems) {
            $.drmSystems = drmSystems;
            return this;
        }

        /**
         * @param drmSystems DRM system(s) to use; at least one must be specified. If a DRM system is omitted, it is considered disabled.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder drmSystems(JobTemplateConfigEncryptionDrmSystemsArgs drmSystems) {
            return drmSystems(Output.of(drmSystems));
        }

        /**
         * @param id Identifier for this set of encryption options.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Identifier for this set of encryption options.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param mpegCenc Configuration for MPEG Common Encryption (MPEG-CENC).
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder mpegCenc(@Nullable Output<JobTemplateConfigEncryptionMpegCencArgs> mpegCenc) {
            $.mpegCenc = mpegCenc;
            return this;
        }

        /**
         * @param mpegCenc Configuration for MPEG Common Encryption (MPEG-CENC).
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder mpegCenc(JobTemplateConfigEncryptionMpegCencArgs mpegCenc) {
            return mpegCenc(Output.of(mpegCenc));
        }

        /**
         * @param sampleAes Configuration for SAMPLE-AES encryption.
         * 
         * @return builder
         * 
         */
        public Builder sampleAes(@Nullable Output<JobTemplateConfigEncryptionSampleAesArgs> sampleAes) {
            $.sampleAes = sampleAes;
            return this;
        }

        /**
         * @param sampleAes Configuration for SAMPLE-AES encryption.
         * 
         * @return builder
         * 
         */
        public Builder sampleAes(JobTemplateConfigEncryptionSampleAesArgs sampleAes) {
            return sampleAes(Output.of(sampleAes));
        }

        /**
         * @param secretManagerKeySource Configuration for secrets stored in Google Secret Manager.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder secretManagerKeySource(@Nullable Output<JobTemplateConfigEncryptionSecretManagerKeySourceArgs> secretManagerKeySource) {
            $.secretManagerKeySource = secretManagerKeySource;
            return this;
        }

        /**
         * @param secretManagerKeySource Configuration for secrets stored in Google Secret Manager.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder secretManagerKeySource(JobTemplateConfigEncryptionSecretManagerKeySourceArgs secretManagerKeySource) {
            return secretManagerKeySource(Output.of(secretManagerKeySource));
        }

        public JobTemplateConfigEncryptionArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("JobTemplateConfigEncryptionArgs", "id");
            }
            return $;
        }
    }

}
