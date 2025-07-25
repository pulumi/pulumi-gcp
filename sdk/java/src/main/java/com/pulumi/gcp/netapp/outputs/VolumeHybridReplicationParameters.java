// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.netapp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeHybridReplicationParameters {
    /**
     * @return Optional. Name of source cluster location associated with the Hybrid replication. This is a free-form field for the display purpose only.
     * 
     */
    private @Nullable String clusterLocation;
    /**
     * @return Optional. Description of the replication.
     * 
     */
    private @Nullable String description;
    /**
     * @return Optional. Labels to be added to the replication as the key value pairs.
     * An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    private @Nullable Map<String,String> labels;
    /**
     * @return Required. Name of the user&#39;s local source cluster to be peered with the destination cluster.
     * 
     */
    private @Nullable String peerClusterName;
    /**
     * @return Required. List of node ip addresses to be peered with.
     * 
     */
    private @Nullable String peerIpAddresses;
    /**
     * @return Required. Name of the user&#39;s local source vserver svm to be peered with the destination vserver svm.
     * 
     */
    private @Nullable String peerSvmName;
    /**
     * @return Required. Name of the user&#39;s local source volume to be peered with the destination volume.
     * 
     */
    private @Nullable String peerVolumeName;
    /**
     * @return Required. Desired name for the replication of this volume.
     * 
     */
    private @Nullable String replication;

    private VolumeHybridReplicationParameters() {}
    /**
     * @return Optional. Name of source cluster location associated with the Hybrid replication. This is a free-form field for the display purpose only.
     * 
     */
    public Optional<String> clusterLocation() {
        return Optional.ofNullable(this.clusterLocation);
    }
    /**
     * @return Optional. Description of the replication.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Optional. Labels to be added to the replication as the key value pairs.
     * An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * @return Required. Name of the user&#39;s local source cluster to be peered with the destination cluster.
     * 
     */
    public Optional<String> peerClusterName() {
        return Optional.ofNullable(this.peerClusterName);
    }
    /**
     * @return Required. List of node ip addresses to be peered with.
     * 
     */
    public Optional<String> peerIpAddresses() {
        return Optional.ofNullable(this.peerIpAddresses);
    }
    /**
     * @return Required. Name of the user&#39;s local source vserver svm to be peered with the destination vserver svm.
     * 
     */
    public Optional<String> peerSvmName() {
        return Optional.ofNullable(this.peerSvmName);
    }
    /**
     * @return Required. Name of the user&#39;s local source volume to be peered with the destination volume.
     * 
     */
    public Optional<String> peerVolumeName() {
        return Optional.ofNullable(this.peerVolumeName);
    }
    /**
     * @return Required. Desired name for the replication of this volume.
     * 
     */
    public Optional<String> replication() {
        return Optional.ofNullable(this.replication);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeHybridReplicationParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clusterLocation;
        private @Nullable String description;
        private @Nullable Map<String,String> labels;
        private @Nullable String peerClusterName;
        private @Nullable String peerIpAddresses;
        private @Nullable String peerSvmName;
        private @Nullable String peerVolumeName;
        private @Nullable String replication;
        public Builder() {}
        public Builder(VolumeHybridReplicationParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterLocation = defaults.clusterLocation;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.peerClusterName = defaults.peerClusterName;
    	      this.peerIpAddresses = defaults.peerIpAddresses;
    	      this.peerSvmName = defaults.peerSvmName;
    	      this.peerVolumeName = defaults.peerVolumeName;
    	      this.replication = defaults.replication;
        }

        @CustomType.Setter
        public Builder clusterLocation(@Nullable String clusterLocation) {

            this.clusterLocation = clusterLocation;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable Map<String,String> labels) {

            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder peerClusterName(@Nullable String peerClusterName) {

            this.peerClusterName = peerClusterName;
            return this;
        }
        @CustomType.Setter
        public Builder peerIpAddresses(@Nullable String peerIpAddresses) {

            this.peerIpAddresses = peerIpAddresses;
            return this;
        }
        @CustomType.Setter
        public Builder peerSvmName(@Nullable String peerSvmName) {

            this.peerSvmName = peerSvmName;
            return this;
        }
        @CustomType.Setter
        public Builder peerVolumeName(@Nullable String peerVolumeName) {

            this.peerVolumeName = peerVolumeName;
            return this;
        }
        @CustomType.Setter
        public Builder replication(@Nullable String replication) {

            this.replication = replication;
            return this;
        }
        public VolumeHybridReplicationParameters build() {
            final var _resultValue = new VolumeHybridReplicationParameters();
            _resultValue.clusterLocation = clusterLocation;
            _resultValue.description = description;
            _resultValue.labels = labels;
            _resultValue.peerClusterName = peerClusterName;
            _resultValue.peerIpAddresses = peerIpAddresses;
            _resultValue.peerSvmName = peerSvmName;
            _resultValue.peerVolumeName = peerVolumeName;
            _resultValue.replication = replication;
            return _resultValue;
        }
    }
}
