// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.edgecontainer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneEncryptionKmsStatusArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterControlPlaneEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterControlPlaneEncryptionArgs Empty = new ClusterControlPlaneEncryptionArgs();

    /**
     * The Cloud KMS CryptoKey e.g.
     * projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{cryptoKey}
     * to use for protecting control plane disks. If not specified, a
     * Google-managed key will be used instead.
     * 
     */
    @Import(name="kmsKey")
    private @Nullable Output<String> kmsKey;

    /**
     * @return The Cloud KMS CryptoKey e.g.
     * projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{cryptoKey}
     * to use for protecting control plane disks. If not specified, a
     * Google-managed key will be used instead.
     * 
     */
    public Optional<Output<String>> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    /**
     * (Output)
     * The Cloud KMS CryptoKeyVersion currently in use for protecting control
     * plane disks. Only applicable if kms_key is set.
     * 
     */
    @Import(name="kmsKeyActiveVersion")
    private @Nullable Output<String> kmsKeyActiveVersion;

    /**
     * @return (Output)
     * The Cloud KMS CryptoKeyVersion currently in use for protecting control
     * plane disks. Only applicable if kms_key is set.
     * 
     */
    public Optional<Output<String>> kmsKeyActiveVersion() {
        return Optional.ofNullable(this.kmsKeyActiveVersion);
    }

    /**
     * (Output)
     * Availability of the Cloud KMS CryptoKey. If not `KEY_AVAILABLE`, then
     * nodes may go offline as they cannot access their local data. This can be
     * caused by a lack of permissions to use the key, or if the key is disabled
     * or deleted.
     * 
     */
    @Import(name="kmsKeyState")
    private @Nullable Output<String> kmsKeyState;

    /**
     * @return (Output)
     * Availability of the Cloud KMS CryptoKey. If not `KEY_AVAILABLE`, then
     * nodes may go offline as they cannot access their local data. This can be
     * caused by a lack of permissions to use the key, or if the key is disabled
     * or deleted.
     * 
     */
    public Optional<Output<String>> kmsKeyState() {
        return Optional.ofNullable(this.kmsKeyState);
    }

    /**
     * (Output)
     * Error status returned by Cloud KMS when using this key. This field may be
     * populated only if `kms_key_state` is not `KMS_KEY_STATE_KEY_AVAILABLE`.
     * If populated, this field contains the error status reported by Cloud KMS.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nested_control_plane_encryption_kms_status&#34;&gt;&lt;/a&gt;The `kms_status` block contains:
     * 
     */
    @Import(name="kmsStatuses")
    private @Nullable Output<List<ClusterControlPlaneEncryptionKmsStatusArgs>> kmsStatuses;

    /**
     * @return (Output)
     * Error status returned by Cloud KMS when using this key. This field may be
     * populated only if `kms_key_state` is not `KMS_KEY_STATE_KEY_AVAILABLE`.
     * If populated, this field contains the error status reported by Cloud KMS.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nested_control_plane_encryption_kms_status&#34;&gt;&lt;/a&gt;The `kms_status` block contains:
     * 
     */
    public Optional<Output<List<ClusterControlPlaneEncryptionKmsStatusArgs>>> kmsStatuses() {
        return Optional.ofNullable(this.kmsStatuses);
    }

    private ClusterControlPlaneEncryptionArgs() {}

    private ClusterControlPlaneEncryptionArgs(ClusterControlPlaneEncryptionArgs $) {
        this.kmsKey = $.kmsKey;
        this.kmsKeyActiveVersion = $.kmsKeyActiveVersion;
        this.kmsKeyState = $.kmsKeyState;
        this.kmsStatuses = $.kmsStatuses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterControlPlaneEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterControlPlaneEncryptionArgs $;

        public Builder() {
            $ = new ClusterControlPlaneEncryptionArgs();
        }

        public Builder(ClusterControlPlaneEncryptionArgs defaults) {
            $ = new ClusterControlPlaneEncryptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKey The Cloud KMS CryptoKey e.g.
         * projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{cryptoKey}
         * to use for protecting control plane disks. If not specified, a
         * Google-managed key will be used instead.
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            $.kmsKey = kmsKey;
            return this;
        }

        /**
         * @param kmsKey The Cloud KMS CryptoKey e.g.
         * projects/{project}/locations/{location}/keyRings/{keyRing}/cryptoKeys/{cryptoKey}
         * to use for protecting control plane disks. If not specified, a
         * Google-managed key will be used instead.
         * 
         * @return builder
         * 
         */
        public Builder kmsKey(String kmsKey) {
            return kmsKey(Output.of(kmsKey));
        }

        /**
         * @param kmsKeyActiveVersion (Output)
         * The Cloud KMS CryptoKeyVersion currently in use for protecting control
         * plane disks. Only applicable if kms_key is set.
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
         * The Cloud KMS CryptoKeyVersion currently in use for protecting control
         * plane disks. Only applicable if kms_key is set.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyActiveVersion(String kmsKeyActiveVersion) {
            return kmsKeyActiveVersion(Output.of(kmsKeyActiveVersion));
        }

        /**
         * @param kmsKeyState (Output)
         * Availability of the Cloud KMS CryptoKey. If not `KEY_AVAILABLE`, then
         * nodes may go offline as they cannot access their local data. This can be
         * caused by a lack of permissions to use the key, or if the key is disabled
         * or deleted.
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
         * Availability of the Cloud KMS CryptoKey. If not `KEY_AVAILABLE`, then
         * nodes may go offline as they cannot access their local data. This can be
         * caused by a lack of permissions to use the key, or if the key is disabled
         * or deleted.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyState(String kmsKeyState) {
            return kmsKeyState(Output.of(kmsKeyState));
        }

        /**
         * @param kmsStatuses (Output)
         * Error status returned by Cloud KMS when using this key. This field may be
         * populated only if `kms_key_state` is not `KMS_KEY_STATE_KEY_AVAILABLE`.
         * If populated, this field contains the error status reported by Cloud KMS.
         * Structure is documented below.
         * 
         * &lt;a name=&#34;nested_control_plane_encryption_kms_status&#34;&gt;&lt;/a&gt;The `kms_status` block contains:
         * 
         * @return builder
         * 
         */
        public Builder kmsStatuses(@Nullable Output<List<ClusterControlPlaneEncryptionKmsStatusArgs>> kmsStatuses) {
            $.kmsStatuses = kmsStatuses;
            return this;
        }

        /**
         * @param kmsStatuses (Output)
         * Error status returned by Cloud KMS when using this key. This field may be
         * populated only if `kms_key_state` is not `KMS_KEY_STATE_KEY_AVAILABLE`.
         * If populated, this field contains the error status reported by Cloud KMS.
         * Structure is documented below.
         * 
         * &lt;a name=&#34;nested_control_plane_encryption_kms_status&#34;&gt;&lt;/a&gt;The `kms_status` block contains:
         * 
         * @return builder
         * 
         */
        public Builder kmsStatuses(List<ClusterControlPlaneEncryptionKmsStatusArgs> kmsStatuses) {
            return kmsStatuses(Output.of(kmsStatuses));
        }

        /**
         * @param kmsStatuses (Output)
         * Error status returned by Cloud KMS when using this key. This field may be
         * populated only if `kms_key_state` is not `KMS_KEY_STATE_KEY_AVAILABLE`.
         * If populated, this field contains the error status reported by Cloud KMS.
         * Structure is documented below.
         * 
         * &lt;a name=&#34;nested_control_plane_encryption_kms_status&#34;&gt;&lt;/a&gt;The `kms_status` block contains:
         * 
         * @return builder
         * 
         */
        public Builder kmsStatuses(ClusterControlPlaneEncryptionKmsStatusArgs... kmsStatuses) {
            return kmsStatuses(List.of(kmsStatuses));
        }

        public ClusterControlPlaneEncryptionArgs build() {
            return $;
        }
    }

}
