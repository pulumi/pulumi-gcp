// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.ReservationDeleteAfterDurationArgs;
import com.pulumi.gcp.compute.inputs.ReservationReservationSharingPolicyArgs;
import com.pulumi.gcp.compute.inputs.ReservationShareSettingsArgs;
import com.pulumi.gcp.compute.inputs.ReservationSpecificReservationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReservationState extends com.pulumi.resources.ResourceArgs {

    public static final ReservationState Empty = new ReservationState();

    /**
     * Full or partial URL to a parent commitment. This field displays for
     * reservations that are tied to a commitment.
     * 
     */
    @Import(name="commitment")
    private @Nullable Output<String> commitment;

    /**
     * @return Full or partial URL to a parent commitment. This field displays for
     * reservations that are tied to a commitment.
     * 
     */
    public Optional<Output<String>> commitment() {
        return Optional.ofNullable(this.commitment);
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
    private @Nullable Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Optional<Output<String>> creationTimestamp() {
        return Optional.ofNullable(this.creationTimestamp);
    }

    /**
     * Duration after which the reservation will be auto-deleted by Compute Engine. Cannot be used with delete_at_time.
     * Structure is documented below.
     * 
     */
    @Import(name="deleteAfterDuration")
    private @Nullable Output<ReservationDeleteAfterDurationArgs> deleteAfterDuration;

    /**
     * @return Duration after which the reservation will be auto-deleted by Compute Engine. Cannot be used with delete_at_time.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ReservationDeleteAfterDurationArgs>> deleteAfterDuration() {
        return Optional.ofNullable(this.deleteAfterDuration);
    }

    /**
     * Absolute time in future when the reservation will be auto-deleted by Compute Engine. Timestamp is represented in RFC3339 text format.
     * Cannot be used with delete_after_duration.
     * 
     */
    @Import(name="deleteAtTime")
    private @Nullable Output<String> deleteAtTime;

    /**
     * @return Absolute time in future when the reservation will be auto-deleted by Compute Engine. Timestamp is represented in RFC3339 text format.
     * Cannot be used with delete_after_duration.
     * 
     */
    public Optional<Output<String>> deleteAtTime() {
        return Optional.ofNullable(this.deleteAtTime);
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Indicates if this group of VMs have emergent maintenance enabled.
     * 
     */
    @Import(name="enableEmergentMaintenance")
    private @Nullable Output<Boolean> enableEmergentMaintenance;

    /**
     * @return Indicates if this group of VMs have emergent maintenance enabled.
     * 
     */
    public Optional<Output<Boolean>> enableEmergentMaintenance() {
        return Optional.ofNullable(this.enableEmergentMaintenance);
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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
     * Sharing policy for reservations with Google Cloud managed services.
     * Structure is documented below.
     * 
     */
    @Import(name="reservationSharingPolicy")
    private @Nullable Output<ReservationReservationSharingPolicyArgs> reservationSharingPolicy;

    /**
     * @return Sharing policy for reservations with Google Cloud managed services.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ReservationReservationSharingPolicyArgs>> reservationSharingPolicy() {
        return Optional.ofNullable(this.reservationSharingPolicy);
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * The share setting for reservations.
     * Structure is documented below.
     * 
     */
    @Import(name="shareSettings")
    private @Nullable Output<ReservationShareSettingsArgs> shareSettings;

    /**
     * @return The share setting for reservations.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ReservationShareSettingsArgs>> shareSettings() {
        return Optional.ofNullable(this.shareSettings);
    }

    /**
     * Reservation for instances with specific machine shapes.
     * Structure is documented below.
     * 
     */
    @Import(name="specificReservation")
    private @Nullable Output<ReservationSpecificReservationArgs> specificReservation;

    /**
     * @return Reservation for instances with specific machine shapes.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ReservationSpecificReservationArgs>> specificReservation() {
        return Optional.ofNullable(this.specificReservation);
    }

    /**
     * When set to true, only VMs that target this reservation by name can
     * consume this reservation. Otherwise, it can be consumed by VMs with
     * affinity for any reservation. Defaults to false.
     * 
     */
    @Import(name="specificReservationRequired")
    private @Nullable Output<Boolean> specificReservationRequired;

    /**
     * @return When set to true, only VMs that target this reservation by name can
     * consume this reservation. Otherwise, it can be consumed by VMs with
     * affinity for any reservation. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> specificReservationRequired() {
        return Optional.ofNullable(this.specificReservationRequired);
    }

    /**
     * The status of the reservation.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the reservation.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The zone where the reservation is made.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return The zone where the reservation is made.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private ReservationState() {}

    private ReservationState(ReservationState $) {
        this.commitment = $.commitment;
        this.creationTimestamp = $.creationTimestamp;
        this.deleteAfterDuration = $.deleteAfterDuration;
        this.deleteAtTime = $.deleteAtTime;
        this.description = $.description;
        this.enableEmergentMaintenance = $.enableEmergentMaintenance;
        this.name = $.name;
        this.project = $.project;
        this.reservationSharingPolicy = $.reservationSharingPolicy;
        this.selfLink = $.selfLink;
        this.shareSettings = $.shareSettings;
        this.specificReservation = $.specificReservation;
        this.specificReservationRequired = $.specificReservationRequired;
        this.status = $.status;
        this.zone = $.zone;
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
         * @param commitment Full or partial URL to a parent commitment. This field displays for
         * reservations that are tied to a commitment.
         * 
         * @return builder
         * 
         */
        public Builder commitment(@Nullable Output<String> commitment) {
            $.commitment = commitment;
            return this;
        }

        /**
         * @param commitment Full or partial URL to a parent commitment. This field displays for
         * reservations that are tied to a commitment.
         * 
         * @return builder
         * 
         */
        public Builder commitment(String commitment) {
            return commitment(Output.of(commitment));
        }

        /**
         * @param creationTimestamp Creation timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            $.creationTimestamp = creationTimestamp;
            return this;
        }

        /**
         * @param creationTimestamp Creation timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder creationTimestamp(String creationTimestamp) {
            return creationTimestamp(Output.of(creationTimestamp));
        }

        /**
         * @param deleteAfterDuration Duration after which the reservation will be auto-deleted by Compute Engine. Cannot be used with delete_at_time.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder deleteAfterDuration(@Nullable Output<ReservationDeleteAfterDurationArgs> deleteAfterDuration) {
            $.deleteAfterDuration = deleteAfterDuration;
            return this;
        }

        /**
         * @param deleteAfterDuration Duration after which the reservation will be auto-deleted by Compute Engine. Cannot be used with delete_at_time.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder deleteAfterDuration(ReservationDeleteAfterDurationArgs deleteAfterDuration) {
            return deleteAfterDuration(Output.of(deleteAfterDuration));
        }

        /**
         * @param deleteAtTime Absolute time in future when the reservation will be auto-deleted by Compute Engine. Timestamp is represented in RFC3339 text format.
         * Cannot be used with delete_after_duration.
         * 
         * @return builder
         * 
         */
        public Builder deleteAtTime(@Nullable Output<String> deleteAtTime) {
            $.deleteAtTime = deleteAtTime;
            return this;
        }

        /**
         * @param deleteAtTime Absolute time in future when the reservation will be auto-deleted by Compute Engine. Timestamp is represented in RFC3339 text format.
         * Cannot be used with delete_after_duration.
         * 
         * @return builder
         * 
         */
        public Builder deleteAtTime(String deleteAtTime) {
            return deleteAtTime(Output.of(deleteAtTime));
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enableEmergentMaintenance Indicates if this group of VMs have emergent maintenance enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableEmergentMaintenance(@Nullable Output<Boolean> enableEmergentMaintenance) {
            $.enableEmergentMaintenance = enableEmergentMaintenance;
            return this;
        }

        /**
         * @param enableEmergentMaintenance Indicates if this group of VMs have emergent maintenance enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableEmergentMaintenance(Boolean enableEmergentMaintenance) {
            return enableEmergentMaintenance(Output.of(enableEmergentMaintenance));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is
         * created. The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param reservationSharingPolicy Sharing policy for reservations with Google Cloud managed services.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder reservationSharingPolicy(@Nullable Output<ReservationReservationSharingPolicyArgs> reservationSharingPolicy) {
            $.reservationSharingPolicy = reservationSharingPolicy;
            return this;
        }

        /**
         * @param reservationSharingPolicy Sharing policy for reservations with Google Cloud managed services.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder reservationSharingPolicy(ReservationReservationSharingPolicyArgs reservationSharingPolicy) {
            return reservationSharingPolicy(Output.of(reservationSharingPolicy));
        }

        /**
         * @param selfLink The URI of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        /**
         * @param selfLink The URI of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        /**
         * @param shareSettings The share setting for reservations.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder shareSettings(@Nullable Output<ReservationShareSettingsArgs> shareSettings) {
            $.shareSettings = shareSettings;
            return this;
        }

        /**
         * @param shareSettings The share setting for reservations.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder shareSettings(ReservationShareSettingsArgs shareSettings) {
            return shareSettings(Output.of(shareSettings));
        }

        /**
         * @param specificReservation Reservation for instances with specific machine shapes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder specificReservation(@Nullable Output<ReservationSpecificReservationArgs> specificReservation) {
            $.specificReservation = specificReservation;
            return this;
        }

        /**
         * @param specificReservation Reservation for instances with specific machine shapes.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder specificReservation(ReservationSpecificReservationArgs specificReservation) {
            return specificReservation(Output.of(specificReservation));
        }

        /**
         * @param specificReservationRequired When set to true, only VMs that target this reservation by name can
         * consume this reservation. Otherwise, it can be consumed by VMs with
         * affinity for any reservation. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder specificReservationRequired(@Nullable Output<Boolean> specificReservationRequired) {
            $.specificReservationRequired = specificReservationRequired;
            return this;
        }

        /**
         * @param specificReservationRequired When set to true, only VMs that target this reservation by name can
         * consume this reservation. Otherwise, it can be consumed by VMs with
         * affinity for any reservation. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder specificReservationRequired(Boolean specificReservationRequired) {
            return specificReservationRequired(Output.of(specificReservationRequired));
        }

        /**
         * @param status The status of the reservation.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the reservation.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param zone The zone where the reservation is made.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone The zone where the reservation is made.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public ReservationState build() {
            return $;
        }
    }

}
