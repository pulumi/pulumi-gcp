// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.edgecontainer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodePoolLocalDiskEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolLocalDiskEncryptionArgs Empty = new NodePoolLocalDiskEncryptionArgs();

    /**
     * The Cloud KMS CryptoKey e.g. projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{cryptoKey} to use for protecting node local disks.
     * If not specified, a Google-managed key will be used instead.
     * 
     */
    @Import(name="kmsKey")
    private @Nullable Output<String> kmsKey;

    /**
     * @return The Cloud KMS CryptoKey e.g. projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{cryptoKey} to use for protecting node local disks.
     * If not specified, a Google-managed key will be used instead.
     * 
     */
    public Optional<Output<String>> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    /**
     * (Output)
     * The Cloud KMS CryptoKeyVersion currently in use for protecting node local disks. Only applicable if kmsKey is set.
     * 
     */
    @Import(name="kmsKeyActiveVersion")
    private @Nullable Output<String> kmsKeyActiveVersion;

    /**
     * @return (Output)
     * The Cloud KMS CryptoKeyVersion currently in use for protecting node local disks. Only applicable if kmsKey is set.
     * 
     */
    public Optional<Output<String>> kmsKeyActiveVersion() {
        return Optional.ofNullable(this.kmsKeyActiveVersion);
    }

    /**
     * (Output)
     * Availability of the Cloud KMS CryptoKey. If not KEY_AVAILABLE, then nodes may go offline as they cannot access their local data.
     * This can be caused by a lack of permissions to use the key, or if the key is disabled or deleted.
     * 
     */
    @Import(name="kmsKeyState")
    private @Nullable Output<String> kmsKeyState;

    /**
     * @return (Output)
     * Availability of the Cloud KMS CryptoKey. If not KEY_AVAILABLE, then nodes may go offline as they cannot access their local data.
     * This can be caused by a lack of permissions to use the key, or if the key is disabled or deleted.
     * 
     */
    public Optional<Output<String>> kmsKeyState() {
        return Optional.ofNullable(this.kmsKeyState);
    }

    private NodePoolLocalDiskEncryptionArgs() {}

    private NodePoolLocalDiskEncryptionArgs(NodePoolLocalDiskEncryptionArgs $) {
        this.kmsKey = $.kmsKey;
        this.kmsKeyActiveVersion = $.kmsKeyActiveVersion;
        this.kmsKeyState = $.kmsKeyState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolLocalDiskEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolLocalDiskEncryptionArgs $;

        public Builder() {
            $ = new NodePoolLocalDiskEncryptionArgs();
        }

        public Builder(NodePoolLocalDiskEncryptionArgs defaults) {
            $ = new NodePoolLocalDiskEncryptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKey The Cloud KMS CryptoKey e.g. projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{cryptoKey} to use for protecting node local disks.
         * If not specified, a Google-managed key will be used instead.
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            $.kmsKey = kmsKey;
            return this;
        }

        /**
         * @param kmsKey The Cloud KMS CryptoKey e.g. projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{cryptoKey} to use for protecting node local disks.
         * If not specified, a Google-managed key will be used instead.
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(String kmsKey) {
            return kmsKey(Output.of(kmsKey));
        }

        /**
         * @param kmsKeyActiveVersion (Output)
         * The Cloud KMS CryptoKeyVersion currently in use for protecting node local disks. Only applicable if kmsKey is set.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyActiveVersion(@Nullable Output<String> kmsKeyActiveVersion) {
            $.kmsKeyActiveVersion = kmsKeyActiveVersion;
            return this;
        }

        /**
         * @param kmsKeyActiveVersion (Output)
         * The Cloud KMS CryptoKeyVersion currently in use for protecting node local disks. Only applicable if kmsKey is set.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyActiveVersion(String kmsKeyActiveVersion) {
            return kmsKeyActiveVersion(Output.of(kmsKeyActiveVersion));
        }

        /**
         * @param kmsKeyState (Output)
         * Availability of the Cloud KMS CryptoKey. If not KEY_AVAILABLE, then nodes may go offline as they cannot access their local data.
         * This can be caused by a lack of permissions to use the key, or if the key is disabled or deleted.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyState(@Nullable Output<String> kmsKeyState) {
            $.kmsKeyState = kmsKeyState;
            return this;
        }

        /**
         * @param kmsKeyState (Output)
         * Availability of the Cloud KMS CryptoKey. If not KEY_AVAILABLE, then nodes may go offline as they cannot access their local data.
         * This can be caused by a lack of permissions to use the key, or if the key is disabled or deleted.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyState(String kmsKeyState) {
            return kmsKeyState(Output.of(kmsKeyState));
        }

        public NodePoolLocalDiskEncryptionArgs build() {
            return $;
        }
    }

}
