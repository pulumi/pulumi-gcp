// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.memorystore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigMembershipArgs;
import com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs;
import com.pulumi.gcp.memorystore.inputs.InstanceCrossInstanceReplicationConfigSecondaryInstanceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceCrossInstanceReplicationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceCrossInstanceReplicationConfigArgs Empty = new InstanceCrossInstanceReplicationConfigArgs();

    /**
     * The instance role supports the following values:
     * 1. `INSTANCE_ROLE_UNSPECIFIED`: This is an independent instance that has never participated in cross instance replication. It allows both reads and writes.
     * 2. `NONE`: This is an independent instance that previously participated in cross instance replication(either as a `PRIMARY` or `SECONDARY` cluster). It allows both reads and writes.
     * 3. `PRIMARY`: This instance serves as the replication source for secondary instance that are replicating from it. Any data written to it is automatically replicated to its secondary clusters. It allows both reads and writes.
     * 4. `SECONDARY`: This instance replicates data from the primary instance. It allows only reads.
     *    Possible values are: `INSTANCE_ROLE_UNSPECIFIED`, `NONE`, `PRIMARY`, `SECONDARY`.
     * 
     */
    @Import(name="instanceRole")
    private @Nullable Output<String> instanceRole;

    /**
     * @return The instance role supports the following values:
     * 1. `INSTANCE_ROLE_UNSPECIFIED`: This is an independent instance that has never participated in cross instance replication. It allows both reads and writes.
     * 2. `NONE`: This is an independent instance that previously participated in cross instance replication(either as a `PRIMARY` or `SECONDARY` cluster). It allows both reads and writes.
     * 3. `PRIMARY`: This instance serves as the replication source for secondary instance that are replicating from it. Any data written to it is automatically replicated to its secondary clusters. It allows both reads and writes.
     * 4. `SECONDARY`: This instance replicates data from the primary instance. It allows only reads.
     *    Possible values are: `INSTANCE_ROLE_UNSPECIFIED`, `NONE`, `PRIMARY`, `SECONDARY`.
     * 
     */
    public Optional<Output<String>> instanceRole() {
        return Optional.ofNullable(this.instanceRole);
    }

    /**
     * (Output)
     * An output only view of all the member instance participating in cross instance replication. This field is populated for all the member clusters irrespective of their cluster role.
     * Structure is documented below.
     * 
     */
    @Import(name="memberships")
    private @Nullable Output<List<InstanceCrossInstanceReplicationConfigMembershipArgs>> memberships;

    /**
     * @return (Output)
     * An output only view of all the member instance participating in cross instance replication. This field is populated for all the member clusters irrespective of their cluster role.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<InstanceCrossInstanceReplicationConfigMembershipArgs>>> memberships() {
        return Optional.ofNullable(this.memberships);
    }

    /**
     * This field is only set for a secondary instance. Details of the primary instance that is used as the replication source for this secondary instance. This is allowed to be set only for clusters whose cluster role is of type `SECONDARY`.
     * Structure is documented below.
     * 
     */
    @Import(name="primaryInstance")
    private @Nullable Output<InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs> primaryInstance;

    /**
     * @return This field is only set for a secondary instance. Details of the primary instance that is used as the replication source for this secondary instance. This is allowed to be set only for clusters whose cluster role is of type `SECONDARY`.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs>> primaryInstance() {
        return Optional.ofNullable(this.primaryInstance);
    }

    /**
     * List of secondary instances that are replicating from this primary cluster. This is allowed to be set only for instances whose cluster role is of type `PRIMARY`.
     * Structure is documented below.
     * 
     */
    @Import(name="secondaryInstances")
    private @Nullable Output<List<InstanceCrossInstanceReplicationConfigSecondaryInstanceArgs>> secondaryInstances;

    /**
     * @return List of secondary instances that are replicating from this primary cluster. This is allowed to be set only for instances whose cluster role is of type `PRIMARY`.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<InstanceCrossInstanceReplicationConfigSecondaryInstanceArgs>>> secondaryInstances() {
        return Optional.ofNullable(this.secondaryInstances);
    }

    /**
     * (Output)
     * The last time cross instance replication config was updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return (Output)
     * The last time cross instance replication config was updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private InstanceCrossInstanceReplicationConfigArgs() {}

    private InstanceCrossInstanceReplicationConfigArgs(InstanceCrossInstanceReplicationConfigArgs $) {
        this.instanceRole = $.instanceRole;
        this.memberships = $.memberships;
        this.primaryInstance = $.primaryInstance;
        this.secondaryInstances = $.secondaryInstances;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceCrossInstanceReplicationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceCrossInstanceReplicationConfigArgs $;

        public Builder() {
            $ = new InstanceCrossInstanceReplicationConfigArgs();
        }

        public Builder(InstanceCrossInstanceReplicationConfigArgs defaults) {
            $ = new InstanceCrossInstanceReplicationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceRole The instance role supports the following values:
         * 1. `INSTANCE_ROLE_UNSPECIFIED`: This is an independent instance that has never participated in cross instance replication. It allows both reads and writes.
         * 2. `NONE`: This is an independent instance that previously participated in cross instance replication(either as a `PRIMARY` or `SECONDARY` cluster). It allows both reads and writes.
         * 3. `PRIMARY`: This instance serves as the replication source for secondary instance that are replicating from it. Any data written to it is automatically replicated to its secondary clusters. It allows both reads and writes.
         * 4. `SECONDARY`: This instance replicates data from the primary instance. It allows only reads.
         *    Possible values are: `INSTANCE_ROLE_UNSPECIFIED`, `NONE`, `PRIMARY`, `SECONDARY`.
         * 
         * @return builder
         * 
         */
        public Builder instanceRole(@Nullable Output<String> instanceRole) {
            $.instanceRole = instanceRole;
            return this;
        }

        /**
         * @param instanceRole The instance role supports the following values:
         * 1. `INSTANCE_ROLE_UNSPECIFIED`: This is an independent instance that has never participated in cross instance replication. It allows both reads and writes.
         * 2. `NONE`: This is an independent instance that previously participated in cross instance replication(either as a `PRIMARY` or `SECONDARY` cluster). It allows both reads and writes.
         * 3. `PRIMARY`: This instance serves as the replication source for secondary instance that are replicating from it. Any data written to it is automatically replicated to its secondary clusters. It allows both reads and writes.
         * 4. `SECONDARY`: This instance replicates data from the primary instance. It allows only reads.
         *    Possible values are: `INSTANCE_ROLE_UNSPECIFIED`, `NONE`, `PRIMARY`, `SECONDARY`.
         * 
         * @return builder
         * 
         */
        public Builder instanceRole(String instanceRole) {
            return instanceRole(Output.of(instanceRole));
        }

        /**
         * @param memberships (Output)
         * An output only view of all the member instance participating in cross instance replication. This field is populated for all the member clusters irrespective of their cluster role.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder memberships(@Nullable Output<List<InstanceCrossInstanceReplicationConfigMembershipArgs>> memberships) {
            $.memberships = memberships;
            return this;
        }

        /**
         * @param memberships (Output)
         * An output only view of all the member instance participating in cross instance replication. This field is populated for all the member clusters irrespective of their cluster role.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder memberships(List<InstanceCrossInstanceReplicationConfigMembershipArgs> memberships) {
            return memberships(Output.of(memberships));
        }

        /**
         * @param memberships (Output)
         * An output only view of all the member instance participating in cross instance replication. This field is populated for all the member clusters irrespective of their cluster role.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder memberships(InstanceCrossInstanceReplicationConfigMembershipArgs... memberships) {
            return memberships(List.of(memberships));
        }

        /**
         * @param primaryInstance This field is only set for a secondary instance. Details of the primary instance that is used as the replication source for this secondary instance. This is allowed to be set only for clusters whose cluster role is of type `SECONDARY`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder primaryInstance(@Nullable Output<InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs> primaryInstance) {
            $.primaryInstance = primaryInstance;
            return this;
        }

        /**
         * @param primaryInstance This field is only set for a secondary instance. Details of the primary instance that is used as the replication source for this secondary instance. This is allowed to be set only for clusters whose cluster role is of type `SECONDARY`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder primaryInstance(InstanceCrossInstanceReplicationConfigPrimaryInstanceArgs primaryInstance) {
            return primaryInstance(Output.of(primaryInstance));
        }

        /**
         * @param secondaryInstances List of secondary instances that are replicating from this primary cluster. This is allowed to be set only for instances whose cluster role is of type `PRIMARY`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder secondaryInstances(@Nullable Output<List<InstanceCrossInstanceReplicationConfigSecondaryInstanceArgs>> secondaryInstances) {
            $.secondaryInstances = secondaryInstances;
            return this;
        }

        /**
         * @param secondaryInstances List of secondary instances that are replicating from this primary cluster. This is allowed to be set only for instances whose cluster role is of type `PRIMARY`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder secondaryInstances(List<InstanceCrossInstanceReplicationConfigSecondaryInstanceArgs> secondaryInstances) {
            return secondaryInstances(Output.of(secondaryInstances));
        }

        /**
         * @param secondaryInstances List of secondary instances that are replicating from this primary cluster. This is allowed to be set only for instances whose cluster role is of type `PRIMARY`.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder secondaryInstances(InstanceCrossInstanceReplicationConfigSecondaryInstanceArgs... secondaryInstances) {
            return secondaryInstances(List.of(secondaryInstances));
        }

        /**
         * @param updateTime (Output)
         * The last time cross instance replication config was updated.
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
         * The last time cross instance replication config was updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public InstanceCrossInstanceReplicationConfigArgs build() {
            return $;
        }
    }

}
