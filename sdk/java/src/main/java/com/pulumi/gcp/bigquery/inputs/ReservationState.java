// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigquery.inputs.ReservationAutoscaleArgs;
import com.pulumi.gcp.bigquery.inputs.ReservationReplicationStatusArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReservationState extends com.pulumi.resources.ResourceArgs {

    public static final ReservationState Empty = new ReservationState();

    /**
     * The configuration parameters for the auto scaling feature.
     * Structure is documented below.
     * 
     */
    @Import(name="autoscale")
    private @Nullable Output<ReservationAutoscaleArgs> autoscale;

    /**
     * @return The configuration parameters for the auto scaling feature.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ReservationAutoscaleArgs>> autoscale() {
        return Optional.ofNullable(this.autoscale);
    }

    /**
     * Maximum number of queries that are allowed to run concurrently in this reservation. This is a soft limit due to asynchronous nature of the system and various optimizations for small queries. Default value is 0 which means that concurrency will be automatically set based on the reservation size.
     * 
     */
    @Import(name="concurrency")
    private @Nullable Output<Integer> concurrency;

    /**
     * @return Maximum number of queries that are allowed to run concurrently in this reservation. This is a soft limit due to asynchronous nature of the system and various optimizations for small queries. Default value is 0 which means that concurrency will be automatically set based on the reservation size.
     * 
     */
    public Optional<Output<Integer>> concurrency() {
        return Optional.ofNullable(this.concurrency);
    }

    /**
     * The edition type. Valid values are STANDARD, ENTERPRISE, ENTERPRISE_PLUS
     * 
     */
    @Import(name="edition")
    private @Nullable Output<String> edition;

    /**
     * @return The edition type. Valid values are STANDARD, ENTERPRISE, ENTERPRISE_PLUS
     * 
     */
    public Optional<Output<String>> edition() {
        return Optional.ofNullable(this.edition);
    }

    /**
     * If false, any query using this reservation will use idle slots from other reservations within
     * the same admin project. If true, a query using this reservation will execute with the slot
     * capacity specified above at most.
     * 
     */
    @Import(name="ignoreIdleSlots")
    private @Nullable Output<Boolean> ignoreIdleSlots;

    /**
     * @return If false, any query using this reservation will use idle slots from other reservations within
     * the same admin project. If true, a query using this reservation will execute with the slot
     * capacity specified above at most.
     * 
     */
    public Optional<Output<Boolean>> ignoreIdleSlots() {
        return Optional.ofNullable(this.ignoreIdleSlots);
    }

    /**
     * The geographic location where the transfer config should reside.
     * Examples: US, EU, asia-northeast1. The default value is US.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geographic location where the transfer config should reside.
     * Examples: US, EU, asia-northeast1. The default value is US.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the reservation. This field must only contain alphanumeric characters or dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the reservation. This field must only contain alphanumeric characters or dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The location where the reservation was originally created. This is set only during the
     * failover reservation&#39;s creation. All billing charges for the failover reservation will be
     * applied to this location.
     * 
     */
    @Import(name="originalPrimaryLocation")
    private @Nullable Output<String> originalPrimaryLocation;

    /**
     * @return The location where the reservation was originally created. This is set only during the
     * failover reservation&#39;s creation. All billing charges for the failover reservation will be
     * applied to this location.
     * 
     */
    public Optional<Output<String>> originalPrimaryLocation() {
        return Optional.ofNullable(this.originalPrimaryLocation);
    }

    /**
     * The current location of the reservation&#39;s primary replica. This field is only set for
     * reservations using the managed disaster recovery feature.
     * 
     */
    @Import(name="primaryLocation")
    private @Nullable Output<String> primaryLocation;

    /**
     * @return The current location of the reservation&#39;s primary replica. This field is only set for
     * reservations using the managed disaster recovery feature.
     * 
     */
    public Optional<Output<String>> primaryLocation() {
        return Optional.ofNullable(this.primaryLocation);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The Disaster Recovery(DR) replication status of the reservation. This is only available for
     * the primary replicas of DR/failover reservations and provides information about the both the
     * staleness of the secondary and the last error encountered while trying to replicate changes
     * from the primary to the secondary. If this field is blank, it means that the reservation is
     * either not a DR reservation or the reservation is a DR secondary or that any replication
     * operations on the reservation have succeeded.
     * Structure is documented below.
     * 
     */
    @Import(name="replicationStatuses")
    private @Nullable Output<List<ReservationReplicationStatusArgs>> replicationStatuses;

    /**
     * @return The Disaster Recovery(DR) replication status of the reservation. This is only available for
     * the primary replicas of DR/failover reservations and provides information about the both the
     * staleness of the secondary and the last error encountered while trying to replicate changes
     * from the primary to the secondary. If this field is blank, it means that the reservation is
     * either not a DR reservation or the reservation is a DR secondary or that any replication
     * operations on the reservation have succeeded.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ReservationReplicationStatusArgs>>> replicationStatuses() {
        return Optional.ofNullable(this.replicationStatuses);
    }

    /**
     * The current location of the reservation&#39;s secondary replica. This field is only set for
     * reservations using the managed disaster recovery feature. Users can set this in create
     * reservation calls to create a failover reservation or in update reservation calls to convert
     * a non-failover reservation to a failover reservation(or vice versa).
     * 
     */
    @Import(name="secondaryLocation")
    private @Nullable Output<String> secondaryLocation;

    /**
     * @return The current location of the reservation&#39;s secondary replica. This field is only set for
     * reservations using the managed disaster recovery feature. Users can set this in create
     * reservation calls to create a failover reservation or in update reservation calls to convert
     * a non-failover reservation to a failover reservation(or vice versa).
     * 
     */
    public Optional<Output<String>> secondaryLocation() {
        return Optional.ofNullable(this.secondaryLocation);
    }

    /**
     * Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the
     * unit of parallelism. Queries using this reservation might use more slots during runtime if ignoreIdleSlots is set to false.
     * 
     */
    @Import(name="slotCapacity")
    private @Nullable Output<Integer> slotCapacity;

    /**
     * @return Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the
     * unit of parallelism. Queries using this reservation might use more slots during runtime if ignoreIdleSlots is set to false.
     * 
     */
    public Optional<Output<Integer>> slotCapacity() {
        return Optional.ofNullable(this.slotCapacity);
    }

    private ReservationState() {}

    private ReservationState(ReservationState $) {
        this.autoscale = $.autoscale;
        this.concurrency = $.concurrency;
        this.edition = $.edition;
        this.ignoreIdleSlots = $.ignoreIdleSlots;
        this.location = $.location;
        this.name = $.name;
        this.originalPrimaryLocation = $.originalPrimaryLocation;
        this.primaryLocation = $.primaryLocation;
        this.project = $.project;
        this.replicationStatuses = $.replicationStatuses;
        this.secondaryLocation = $.secondaryLocation;
        this.slotCapacity = $.slotCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservationState $;

        public Builder() {
            $ = new ReservationState();
        }

        public Builder(ReservationState defaults) {
            $ = new ReservationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscale The configuration parameters for the auto scaling feature.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder autoscale(@Nullable Output<ReservationAutoscaleArgs> autoscale) {
            $.autoscale = autoscale;
            return this;
        }

        /**
         * @param autoscale The configuration parameters for the auto scaling feature.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder autoscale(ReservationAutoscaleArgs autoscale) {
            return autoscale(Output.of(autoscale));
        }

        /**
         * @param concurrency Maximum number of queries that are allowed to run concurrently in this reservation. This is a soft limit due to asynchronous nature of the system and various optimizations for small queries. Default value is 0 which means that concurrency will be automatically set based on the reservation size.
         * 
         * @return builder
         * 
         */
        public Builder concurrency(@Nullable Output<Integer> concurrency) {
            $.concurrency = concurrency;
            return this;
        }

        /**
         * @param concurrency Maximum number of queries that are allowed to run concurrently in this reservation. This is a soft limit due to asynchronous nature of the system and various optimizations for small queries. Default value is 0 which means that concurrency will be automatically set based on the reservation size.
         * 
         * @return builder
         * 
         */
        public Builder concurrency(Integer concurrency) {
            return concurrency(Output.of(concurrency));
        }

        /**
         * @param edition The edition type. Valid values are STANDARD, ENTERPRISE, ENTERPRISE_PLUS
         * 
         * @return builder
         * 
         */
        public Builder edition(@Nullable Output<String> edition) {
            $.edition = edition;
            return this;
        }

        /**
         * @param edition The edition type. Valid values are STANDARD, ENTERPRISE, ENTERPRISE_PLUS
         * 
         * @return builder
         * 
         */
        public Builder edition(String edition) {
            return edition(Output.of(edition));
        }

        /**
         * @param ignoreIdleSlots If false, any query using this reservation will use idle slots from other reservations within
         * the same admin project. If true, a query using this reservation will execute with the slot
         * capacity specified above at most.
         * 
         * @return builder
         * 
         */
        public Builder ignoreIdleSlots(@Nullable Output<Boolean> ignoreIdleSlots) {
            $.ignoreIdleSlots = ignoreIdleSlots;
            return this;
        }

        /**
         * @param ignoreIdleSlots If false, any query using this reservation will use idle slots from other reservations within
         * the same admin project. If true, a query using this reservation will execute with the slot
         * capacity specified above at most.
         * 
         * @return builder
         * 
         */
        public Builder ignoreIdleSlots(Boolean ignoreIdleSlots) {
            return ignoreIdleSlots(Output.of(ignoreIdleSlots));
        }

        /**
         * @param location The geographic location where the transfer config should reside.
         * Examples: US, EU, asia-northeast1. The default value is US.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geographic location where the transfer config should reside.
         * Examples: US, EU, asia-northeast1. The default value is US.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the reservation. This field must only contain alphanumeric characters or dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the reservation. This field must only contain alphanumeric characters or dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param originalPrimaryLocation The location where the reservation was originally created. This is set only during the
         * failover reservation&#39;s creation. All billing charges for the failover reservation will be
         * applied to this location.
         * 
         * @return builder
         * 
         */
        public Builder originalPrimaryLocation(@Nullable Output<String> originalPrimaryLocation) {
            $.originalPrimaryLocation = originalPrimaryLocation;
            return this;
        }

        /**
         * @param originalPrimaryLocation The location where the reservation was originally created. This is set only during the
         * failover reservation&#39;s creation. All billing charges for the failover reservation will be
         * applied to this location.
         * 
         * @return builder
         * 
         */
        public Builder originalPrimaryLocation(String originalPrimaryLocation) {
            return originalPrimaryLocation(Output.of(originalPrimaryLocation));
        }

        /**
         * @param primaryLocation The current location of the reservation&#39;s primary replica. This field is only set for
         * reservations using the managed disaster recovery feature.
         * 
         * @return builder
         * 
         */
        public Builder primaryLocation(@Nullable Output<String> primaryLocation) {
            $.primaryLocation = primaryLocation;
            return this;
        }

        /**
         * @param primaryLocation The current location of the reservation&#39;s primary replica. This field is only set for
         * reservations using the managed disaster recovery feature.
         * 
         * @return builder
         * 
         */
        public Builder primaryLocation(String primaryLocation) {
            return primaryLocation(Output.of(primaryLocation));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param replicationStatuses The Disaster Recovery(DR) replication status of the reservation. This is only available for
         * the primary replicas of DR/failover reservations and provides information about the both the
         * staleness of the secondary and the last error encountered while trying to replicate changes
         * from the primary to the secondary. If this field is blank, it means that the reservation is
         * either not a DR reservation or the reservation is a DR secondary or that any replication
         * operations on the reservation have succeeded.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder replicationStatuses(@Nullable Output<List<ReservationReplicationStatusArgs>> replicationStatuses) {
            $.replicationStatuses = replicationStatuses;
            return this;
        }

        /**
         * @param replicationStatuses The Disaster Recovery(DR) replication status of the reservation. This is only available for
         * the primary replicas of DR/failover reservations and provides information about the both the
         * staleness of the secondary and the last error encountered while trying to replicate changes
         * from the primary to the secondary. If this field is blank, it means that the reservation is
         * either not a DR reservation or the reservation is a DR secondary or that any replication
         * operations on the reservation have succeeded.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder replicationStatuses(List<ReservationReplicationStatusArgs> replicationStatuses) {
            return replicationStatuses(Output.of(replicationStatuses));
        }

        /**
         * @param replicationStatuses The Disaster Recovery(DR) replication status of the reservation. This is only available for
         * the primary replicas of DR/failover reservations and provides information about the both the
         * staleness of the secondary and the last error encountered while trying to replicate changes
         * from the primary to the secondary. If this field is blank, it means that the reservation is
         * either not a DR reservation or the reservation is a DR secondary or that any replication
         * operations on the reservation have succeeded.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder replicationStatuses(ReservationReplicationStatusArgs... replicationStatuses) {
            return replicationStatuses(List.of(replicationStatuses));
        }

        /**
         * @param secondaryLocation The current location of the reservation&#39;s secondary replica. This field is only set for
         * reservations using the managed disaster recovery feature. Users can set this in create
         * reservation calls to create a failover reservation or in update reservation calls to convert
         * a non-failover reservation to a failover reservation(or vice versa).
         * 
         * @return builder
         * 
         */
        public Builder secondaryLocation(@Nullable Output<String> secondaryLocation) {
            $.secondaryLocation = secondaryLocation;
            return this;
        }

        /**
         * @param secondaryLocation The current location of the reservation&#39;s secondary replica. This field is only set for
         * reservations using the managed disaster recovery feature. Users can set this in create
         * reservation calls to create a failover reservation or in update reservation calls to convert
         * a non-failover reservation to a failover reservation(or vice versa).
         * 
         * @return builder
         * 
         */
        public Builder secondaryLocation(String secondaryLocation) {
            return secondaryLocation(Output.of(secondaryLocation));
        }

        /**
         * @param slotCapacity Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the
         * unit of parallelism. Queries using this reservation might use more slots during runtime if ignoreIdleSlots is set to false.
         * 
         * @return builder
         * 
         */
        public Builder slotCapacity(@Nullable Output<Integer> slotCapacity) {
            $.slotCapacity = slotCapacity;
            return this;
        }

        /**
         * @param slotCapacity Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the
         * unit of parallelism. Queries using this reservation might use more slots during runtime if ignoreIdleSlots is set to false.
         * 
         * @return builder
         * 
         */
        public Builder slotCapacity(Integer slotCapacity) {
            return slotCapacity(Output.of(slotCapacity));
        }

        public ReservationState build() {
            return $;
        }
    }

}
