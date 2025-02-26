// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.applicationintegration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientCloudKmsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientCloudKmsConfigArgs Empty = new ClientCloudKmsConfigArgs();

    /**
     * A Cloud KMS key is a named object containing one or more key versions, along
     * with metadata for the key. A key exists on exactly one key ring tied to a
     * specific location.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return A Cloud KMS key is a named object containing one or more key versions, along
     * with metadata for the key. A key exists on exactly one key ring tied to a
     * specific location.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Each version of a key contains key material used for encryption or signing.
     * A key&#39;s version is represented by an integer, starting at 1. To decrypt data
     * or verify a signature, you must use the same key version that was used to
     * encrypt or sign the data.
     * 
     */
    @Import(name="keyVersion")
    private @Nullable Output<String> keyVersion;

    /**
     * @return Each version of a key contains key material used for encryption or signing.
     * A key&#39;s version is represented by an integer, starting at 1. To decrypt data
     * or verify a signature, you must use the same key version that was used to
     * encrypt or sign the data.
     * 
     */
    public Optional<Output<String>> keyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }

    /**
     * Location name of the key ring, e.g. &#34;us-west1&#34;.
     * 
     */
    @Import(name="kmsLocation", required=true)
    private Output<String> kmsLocation;

    /**
     * @return Location name of the key ring, e.g. &#34;us-west1&#34;.
     * 
     */
    public Output<String> kmsLocation() {
        return this.kmsLocation;
    }

    /**
     * The Google Cloud project id of the project where the kms key stored. If empty,
     * the kms key is stored at the same project as customer&#39;s project and ecrypted
     * with CMEK, otherwise, the kms key is stored in the tenant project and
     * encrypted with GMEK.
     * 
     */
    @Import(name="kmsProjectId")
    private @Nullable Output<String> kmsProjectId;

    /**
     * @return The Google Cloud project id of the project where the kms key stored. If empty,
     * the kms key is stored at the same project as customer&#39;s project and ecrypted
     * with CMEK, otherwise, the kms key is stored in the tenant project and
     * encrypted with GMEK.
     * 
     */
    public Optional<Output<String>> kmsProjectId() {
        return Optional.ofNullable(this.kmsProjectId);
    }

    /**
     * A key ring organizes keys in a specific Google Cloud location and allows you to
     * manage access control on groups of keys. A key ring&#39;s name does not need to be
     * unique across a Google Cloud project, but must be unique within a given location.
     * 
     */
    @Import(name="kmsRing", required=true)
    private Output<String> kmsRing;

    /**
     * @return A key ring organizes keys in a specific Google Cloud location and allows you to
     * manage access control on groups of keys. A key ring&#39;s name does not need to be
     * unique across a Google Cloud project, but must be unique within a given location.
     * 
     */
    public Output<String> kmsRing() {
        return this.kmsRing;
    }

    private ClientCloudKmsConfigArgs() {}

    private ClientCloudKmsConfigArgs(ClientCloudKmsConfigArgs $) {
        this.key = $.key;
        this.keyVersion = $.keyVersion;
        this.kmsLocation = $.kmsLocation;
        this.kmsProjectId = $.kmsProjectId;
        this.kmsRing = $.kmsRing;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientCloudKmsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientCloudKmsConfigArgs $;

        public Builder() {
            $ = new ClientCloudKmsConfigArgs();
        }

        public Builder(ClientCloudKmsConfigArgs defaults) {
            $ = new ClientCloudKmsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key A Cloud KMS key is a named object containing one or more key versions, along
         * with metadata for the key. A key exists on exactly one key ring tied to a
         * specific location.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key A Cloud KMS key is a named object containing one or more key versions, along
         * with metadata for the key. A key exists on exactly one key ring tied to a
         * specific location.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param keyVersion Each version of a key contains key material used for encryption or signing.
         * A key&#39;s version is represented by an integer, starting at 1. To decrypt data
         * or verify a signature, you must use the same key version that was used to
         * encrypt or sign the data.
         * 
         * @return builder
         * 
         */
        public Builder keyVersion(@Nullable Output<String> keyVersion) {
            $.keyVersion = keyVersion;
            return this;
        }

        /**
         * @param keyVersion Each version of a key contains key material used for encryption or signing.
         * A key&#39;s version is represented by an integer, starting at 1. To decrypt data
         * or verify a signature, you must use the same key version that was used to
         * encrypt or sign the data.
         * 
         * @return builder
         * 
         */
        public Builder keyVersion(String keyVersion) {
            return keyVersion(Output.of(keyVersion));
        }

        /**
         * @param kmsLocation Location name of the key ring, e.g. &#34;us-west1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder kmsLocation(Output<String> kmsLocation) {
            $.kmsLocation = kmsLocation;
            return this;
        }

        /**
         * @param kmsLocation Location name of the key ring, e.g. &#34;us-west1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder kmsLocation(String kmsLocation) {
            return kmsLocation(Output.of(kmsLocation));
        }

        /**
         * @param kmsProjectId The Google Cloud project id of the project where the kms key stored. If empty,
         * the kms key is stored at the same project as customer&#39;s project and ecrypted
         * with CMEK, otherwise, the kms key is stored in the tenant project and
         * encrypted with GMEK.
         * 
         * @return builder
         * 
         */
        public Builder kmsProjectId(@Nullable Output<String> kmsProjectId) {
            $.kmsProjectId = kmsProjectId;
            return this;
        }

        /**
         * @param kmsProjectId The Google Cloud project id of the project where the kms key stored. If empty,
         * the kms key is stored at the same project as customer&#39;s project and ecrypted
         * with CMEK, otherwise, the kms key is stored in the tenant project and
         * encrypted with GMEK.
         * 
         * @return builder
         * 
         */
        public Builder kmsProjectId(String kmsProjectId) {
            return kmsProjectId(Output.of(kmsProjectId));
        }

        /**
         * @param kmsRing A key ring organizes keys in a specific Google Cloud location and allows you to
         * manage access control on groups of keys. A key ring&#39;s name does not need to be
         * unique across a Google Cloud project, but must be unique within a given location.
         * 
         * @return builder
         * 
         */
        public Builder kmsRing(Output<String> kmsRing) {
            $.kmsRing = kmsRing;
            return this;
        }

        /**
         * @param kmsRing A key ring organizes keys in a specific Google Cloud location and allows you to
         * manage access control on groups of keys. A key ring&#39;s name does not need to be
         * unique across a Google Cloud project, but must be unique within a given location.
         * 
         * @return builder
         * 
         */
        public Builder kmsRing(String kmsRing) {
            return kmsRing(Output.of(kmsRing));
        }

        public ClientCloudKmsConfigArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("ClientCloudKmsConfigArgs", "key");
            }
            if ($.kmsLocation == null) {
                throw new MissingRequiredPropertyException("ClientCloudKmsConfigArgs", "kmsLocation");
            }
            if ($.kmsRing == null) {
                throw new MissingRequiredPropertyException("ClientCloudKmsConfigArgs", "kmsRing");
            }
            return $;
        }
    }

}
