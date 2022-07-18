// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterConfigPreemptibleWorkerConfigDiskConfig {
    /**
     * @return Size of the primary disk attached to each preemptible worker node, specified
     * in GB. The smallest allowed disk size is 10GB. GCP will default to a predetermined
     * computed value if not set (currently 500GB). Note: If SSDs are not
     * attached, it also contains the HDFS data blocks and Hadoop working directories.
     * 
     */
    private final @Nullable Integer bootDiskSizeGb;
    /**
     * @return The disk type of the primary disk attached to each preemptible worker node.
     * One of `&#34;pd-ssd&#34;` or `&#34;pd-standard&#34;`. Defaults to `&#34;pd-standard&#34;`.
     * 
     */
    private final @Nullable String bootDiskType;
    /**
     * @return The amount of local SSD disks that will be
     * attached to each preemptible worker node. Defaults to 0.
     * 
     */
    private final @Nullable Integer numLocalSsds;

    @CustomType.Constructor
    private ClusterClusterConfigPreemptibleWorkerConfigDiskConfig(
        @CustomType.Parameter("bootDiskSizeGb") @Nullable Integer bootDiskSizeGb,
        @CustomType.Parameter("bootDiskType") @Nullable String bootDiskType,
        @CustomType.Parameter("numLocalSsds") @Nullable Integer numLocalSsds) {
        this.bootDiskSizeGb = bootDiskSizeGb;
        this.bootDiskType = bootDiskType;
        this.numLocalSsds = numLocalSsds;
    }

    /**
     * @return Size of the primary disk attached to each preemptible worker node, specified
     * in GB. The smallest allowed disk size is 10GB. GCP will default to a predetermined
     * computed value if not set (currently 500GB). Note: If SSDs are not
     * attached, it also contains the HDFS data blocks and Hadoop working directories.
     * 
     */
    public Optional<Integer> bootDiskSizeGb() {
        return Optional.ofNullable(this.bootDiskSizeGb);
    }
    /**
     * @return The disk type of the primary disk attached to each preemptible worker node.
     * One of `&#34;pd-ssd&#34;` or `&#34;pd-standard&#34;`. Defaults to `&#34;pd-standard&#34;`.
     * 
     */
    public Optional<String> bootDiskType() {
        return Optional.ofNullable(this.bootDiskType);
    }
    /**
     * @return The amount of local SSD disks that will be
     * attached to each preemptible worker node. Defaults to 0.
     * 
     */
    public Optional<Integer> numLocalSsds() {
        return Optional.ofNullable(this.numLocalSsds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigPreemptibleWorkerConfigDiskConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bootDiskSizeGb;
        private @Nullable String bootDiskType;
        private @Nullable Integer numLocalSsds;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigPreemptibleWorkerConfigDiskConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.bootDiskType = defaults.bootDiskType;
    	      this.numLocalSsds = defaults.numLocalSsds;
        }

        public Builder bootDiskSizeGb(@Nullable Integer bootDiskSizeGb) {
            this.bootDiskSizeGb = bootDiskSizeGb;
            return this;
        }
        public Builder bootDiskType(@Nullable String bootDiskType) {
            this.bootDiskType = bootDiskType;
            return this;
        }
        public Builder numLocalSsds(@Nullable Integer numLocalSsds) {
            this.numLocalSsds = numLocalSsds;
            return this;
        }        public ClusterClusterConfigPreemptibleWorkerConfigDiskConfig build() {
            return new ClusterClusterConfigPreemptibleWorkerConfigDiskConfig(bootDiskSizeGb, bootDiskType, numLocalSsds);
        }
    }
}