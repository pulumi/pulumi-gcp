// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.redis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigMembershipArgs;
import com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigPrimaryClusterArgs;
import com.pulumi.gcp.redis.inputs.ClusterCrossClusterReplicationConfigSecondaryClusterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCrossClusterReplicationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCrossClusterReplicationConfigArgs Empty = new ClusterCrossClusterReplicationConfigArgs();

    /**
     * The role of the cluster in cross cluster replication. Supported values are:
     * 1. `CLUSTER_ROLE_UNSPECIFIED`: This is an independent cluster that has never participated in cross cluster replication. It allows both reads and writes.
     * 2. `NONE`: This is an independent cluster that previously participated in cross cluster replication(either as a `PRIMARY` or `SECONDARY` cluster). It allows both reads and writes.
     * 3. `PRIMARY`: This cluster serves as the replication source for secondary clusters that are replicating from it. Any data written to it is automatically replicated to its secondary clusters. It allows both reads and writes.
     * 4. `SECONDARY`: This cluster replicates data from the primary cluster. It allows only reads.
     *    Possible values are: `CLUSTER_ROLE_UNSPECIFIED`, `NONE`, `PRIMARY`, `SECONDARY`.
     * 
     */
    @Import(name="clusterRole")
    private @Nullable Output<String> clusterRole;

    /**
     * @return The role of the cluster in cross cluster replication. Supported values are:
     * 1. `CLUSTER_ROLE_UNSPECIFIED`: This is an independent cluster that has never participated in cross cluster replication. It allows both reads and writes.
     * 2. `NONE`: This is an independent cluster that previously participated in cross cluster replication(either as a `PRIMARY` or `SECONDARY` cluster). It allows both reads and writes.
     * 3. `PRIMARY`: This cluster serves as the replication source for secondary clusters that are replicating from it. Any data written to it is automatically replicated to its secondary clusters. It allows both reads and writes.
     * 4. `SECONDARY`: This cluster replicates data from the primary cluster. It allows only reads.
     *    Possible values are: `CLUSTER_ROLE_UNSPECIFIED`, `NONE`, `PRIMARY`, `SECONDARY`.
     * 
     */
    public Optional<Output<String>> clusterRole() {
        return Optional.ofNullable(this.clusterRole);
    }

    /**
     * (Output)
     * An output only view of all the member clusters participating in cross cluster replication. This field is populated for all the member clusters irrespective of their cluster role.
     * Structure is documented below.
     * 
     */
    @Import(name="memberships")
    private @Nullable Output<List<ClusterCrossClusterReplicationConfigMembershipArgs>> memberships;

    /**
     * @return (Output)
     * An output only view of all the member clusters participating in cross cluster replication. This field is populated for all the member clusters irrespective of their cluster role.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ClusterCrossClusterReplicationConfigMembershipArgs>>> memberships() {
        return Optional.ofNullable(this.memberships);
    }

    /**
     * Details of the primary cluster that is used as the replication source for this secondary cluster. This is allowed to be set only for clusters whose cluster role is of type `SECONDARY`.
     * Structure is documented below.
     * 
     */
    @Import(name="primaryCluster")
    private @Nullable Output<ClusterCrossClusterReplicationConfigPrimaryClusterArgs> primaryCluster;

    /**
     * @return Details of the primary cluster that is used as the replication source for this secondary cluster. This is allowed to be set only for clusters whose cluster role is of type `SECONDARY`.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ClusterCrossClusterReplicationConfigPrimaryClusterArgs>> primaryCluster() {
        return Optional.ofNullable(this.primaryCluster);
    }

    /**
     * List of secondary clusters that are replicating from this primary cluster. This is allowed to be set only for clusters whose cluster role is of type `PRIMARY`.
     * Structure is documented below.
     * 
     */
    @Import(name="secondaryClusters")
    private @Nullable Output<List<ClusterCrossClusterReplicationConfigSecondaryClusterArgs>> secondaryClusters;

    /**
     * @return List of secondary clusters that are replicating from this primary cluster. This is allowed to be set only for clusters whose cluster role is of type `PRIMARY`.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ClusterCrossClusterReplicationConfigSecondaryClusterArgs>>> secondaryClusters() {
        return Optional.ofNullable(this.secondaryClusters);
    }

    /**
     * (Output)
     * The last time cross cluster replication config was updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return (Output)
     * The last time cross cluster replication config was updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private ClusterCrossClusterReplicationConfigArgs() {}

    private ClusterCrossClusterReplicationConfigArgs(ClusterCrossClusterReplicationConfigArgs $) {
        this.clusterRole = $.clusterRole;
        this.memberships = $.memberships;
        this.primaryCluster = $.primaryCluster;
        this.secondaryClusters = $.secondaryClusters;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCrossClusterReplicationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCrossClusterReplicationConfigArgs $;

        public Builder() {
            $ = new ClusterCrossClusterReplicationConfigArgs();
        }

        public Builder(ClusterCrossClusterReplicationConfigArgs defaults) {
            $ = new ClusterCrossClusterReplicationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterRole The role of the cluster in cross cluster replication. Supported values are:
         * 1. `CLUSTER_ROLE_UNSPECIFIED`: This is an independent cluster that has never participated in cross cluster replication. It allows both reads and writes.
         * 2. `NONE`: This is an independent cluster that previously participated in cross cluster replication(either as a `PRIMARY` or `SECONDARY` cluster). It allows both reads and writes.
         * 3. `PRIMARY`: This cluster serves as the replication source for secondary clusters that are replicating from it. Any data written to it is automatically replicated to its secondary clusters. It allows both reads and writes.
         * 4. `SECONDARY`: This cluster replicates data from the primary cluster. It allows only reads.
         *    Possible values are: `CLUSTER_ROLE_UNSPECIFIED`, `NONE`, `PRIMARY`, `SECONDARY`.
         * 
         * @return builder
         * 
         */
        public Builder clusterRole(@Nullable Output<String> clusterRole) {
            $.clusterRole = clusterRole;
            return this;
        }

        /**
         * @param clusterRole The role of the cluster in cross cluster replication. Supported values are:
         * 1. `CLUSTER_ROLE_UNSPECIFIED`: This is an independent cluster that has never participated in cross cluster replication. It allows both reads and writes.
         * 2. `NONE`: This is an independent cluster that previously participated in cross cluster replication(either as a `PRIMARY` or `SECONDARY` cluster). It allows both reads and writes.
         * 3. `PRIMARY`: This cluster serves as the replication source for secondary clusters that are replicating from it. Any data written to it is automatically replicated to its secondary clusters. It allows both reads and writes.
         * 4. `SECONDARY`: This cluster replicates data from the primary cluster. It allows only reads.
         *    Possible values are: `CLUSTER_ROLE_UNSPECIFIED`, `NONE`, `PRIMARY`, `SECONDARY`.
         * 
         * @return builder
         * 
         */
        public Builder clusterRole(String clusterRole) {
            return clusterRole(Output.of(clusterRole));
        }

        /**
         * @param memberships (Output)
         * An output only view of all the member clusters participating in cross cluster replication. This field is populated for all the member clusters irrespective of their cluster role.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder memberships(@Nullable Output<List<ClusterCrossClusterReplicationConfigMembershipArgs>> memberships) {
            $.memberships = memberships;
            return this;
        }

        /**
         * @param memberships (Output)
         * An output only view of all the member clusters participating in cross cluster replication. This field is populated for all the member clusters irrespective of their cluster role.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder memberships(List<ClusterCrossClusterReplicationConfigMembershipArgs> memberships) {
            return memberships(Output.of(memberships));
        }

        /**
         * @param memberships (Output)
         * An output only view of all the member clusters participating in cross cluster replication. This field is populated for all the member clusters irrespective of their cluster role.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder memberships(ClusterCrossClusterReplicationConfigMembershipArgs... memberships) {
            return memberships(List.of(memberships));
        }

        /**
         * @param primaryCluster Details of the primary cluster that is used as the replication source for this secondary cluster. This is allowed to be set only for clusters whose cluster role is of type `SECONDARY`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder primaryCluster(@Nullable Output<ClusterCrossClusterReplicationConfigPrimaryClusterArgs> primaryCluster) {
            $.primaryCluster = primaryCluster;
            return this;
        }

        /**
         * @param primaryCluster Details of the primary cluster that is used as the replication source for this secondary cluster. This is allowed to be set only for clusters whose cluster role is of type `SECONDARY`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder primaryCluster(ClusterCrossClusterReplicationConfigPrimaryClusterArgs primaryCluster) {
            return primaryCluster(Output.of(primaryCluster));
        }

        /**
         * @param secondaryClusters List of secondary clusters that are replicating from this primary cluster. This is allowed to be set only for clusters whose cluster role is of type `PRIMARY`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder secondaryClusters(@Nullable Output<List<ClusterCrossClusterReplicationConfigSecondaryClusterArgs>> secondaryClusters) {
            $.secondaryClusters = secondaryClusters;
            return this;
        }

        /**
         * @param secondaryClusters List of secondary clusters that are replicating from this primary cluster. This is allowed to be set only for clusters whose cluster role is of type `PRIMARY`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder secondaryClusters(List<ClusterCrossClusterReplicationConfigSecondaryClusterArgs> secondaryClusters) {
            return secondaryClusters(Output.of(secondaryClusters));
        }

        /**
         * @param secondaryClusters List of secondary clusters that are replicating from this primary cluster. This is allowed to be set only for clusters whose cluster role is of type `PRIMARY`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder secondaryClusters(ClusterCrossClusterReplicationConfigSecondaryClusterArgs... secondaryClusters) {
            return secondaryClusters(List.of(secondaryClusters));
        }

        /**
         * @param updateTime (Output)
         * The last time cross cluster replication config was updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime (Output)
         * The last time cross cluster replication config was updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public ClusterCrossClusterReplicationConfigArgs build() {
            return $;
        }
    }

}
