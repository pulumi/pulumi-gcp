// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.FutureReservationArgs;
import com.pulumi.gcp.compute.inputs.FutureReservationState;
import com.pulumi.gcp.compute.outputs.FutureReservationAggregateReservation;
import com.pulumi.gcp.compute.outputs.FutureReservationAutoCreatedReservationsDuration;
import com.pulumi.gcp.compute.outputs.FutureReservationCommitmentInfo;
import com.pulumi.gcp.compute.outputs.FutureReservationShareSettings;
import com.pulumi.gcp.compute.outputs.FutureReservationSpecificSkuProperties;
import com.pulumi.gcp.compute.outputs.FutureReservationStatus;
import com.pulumi.gcp.compute.outputs.FutureReservationTimeWindow;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Future Reservation Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.FutureReservation;
 * import com.pulumi.gcp.compute.FutureReservationArgs;
 * import com.pulumi.gcp.compute.inputs.FutureReservationTimeWindowArgs;
 * import com.pulumi.gcp.compute.inputs.FutureReservationSpecificSkuPropertiesArgs;
 * import com.pulumi.gcp.compute.inputs.FutureReservationSpecificSkuPropertiesInstancePropertiesArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var gceFutureReservation = new FutureReservation("gceFutureReservation", FutureReservationArgs.builder()
 *             .name("gce-future-reservation")
 *             .project("my-project-name")
 *             .autoDeleteAutoCreatedReservations(true)
 *             .planningStatus("DRAFT")
 *             .namePrefix("fr-basic")
 *             .timeWindow(FutureReservationTimeWindowArgs.builder()
 *                 .startTime("2025-11-01T00:00:00Z")
 *                 .endTime("2025-11-02T00:00:00Z")
 *                 .build())
 *             .specificSkuProperties(FutureReservationSpecificSkuPropertiesArgs.builder()
 *                 .totalCount("1")
 *                 .instanceProperties(FutureReservationSpecificSkuPropertiesInstancePropertiesArgs.builder()
 *                     .machineType("e2-standard-2")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Future Reservation Aggregate Reservation
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.FutureReservation;
 * import com.pulumi.gcp.compute.FutureReservationArgs;
 * import com.pulumi.gcp.compute.inputs.FutureReservationTimeWindowArgs;
 * import com.pulumi.gcp.compute.inputs.FutureReservationAggregateReservationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var gceFutureReservation = new FutureReservation("gceFutureReservation", FutureReservationArgs.builder()
 *             .name("gce-future-reservation-aggregate-reservation")
 *             .project("my-project-name")
 *             .autoDeleteAutoCreatedReservations(true)
 *             .planningStatus("DRAFT")
 *             .namePrefix("fr-basic")
 *             .timeWindow(FutureReservationTimeWindowArgs.builder()
 *                 .startTime("2025-11-01T00:00:00Z")
 *                 .endTime("2025-11-02T00:00:00Z")
 *                 .build())
 *             .aggregateReservation(FutureReservationAggregateReservationArgs.builder()
 *                 .vmFamily("VM_FAMILY_CLOUD_TPU_DEVICE_CT3")
 *                 .workloadType("UNSPECIFIED")
 *                 .reservedResources(                
 *                     FutureReservationAggregateReservationReservedResourceArgs.builder()
 *                         .accelerator(FutureReservationAggregateReservationReservedResourceAcceleratorArgs.builder()
 *                             .acceleratorCount(32)
 *                             .acceleratorType("projects/my-project-name/zones/us-central1-a/acceleratorTypes/ct3")
 *                             .build())
 *                         .build(),
 *                     FutureReservationAggregateReservationReservedResourceArgs.builder()
 *                         .accelerator(FutureReservationAggregateReservationReservedResourceAcceleratorArgs.builder()
 *                             .acceleratorCount(2)
 *                             .acceleratorType("projects/my-project-name/zones/us-central1-a/acceleratorTypes/ct3")
 *                             .build())
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * FutureReservation can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/zones/{{zone}}/futureReservations/{{name}}`
 * 
 * * `{{project}}/{{zone}}/{{name}}`
 * 
 * * `{{zone}}/{{name}}`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, FutureReservation can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:compute/futureReservation:FutureReservation default projects/{{project}}/zones/{{zone}}/futureReservations/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/futureReservation:FutureReservation default {{project}}/{{zone}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/futureReservation:FutureReservation default {{zone}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/futureReservation:FutureReservation default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/futureReservation:FutureReservation")
public class FutureReservation extends com.pulumi.resources.CustomResource {
    /**
     * Aggregate reservation details for the future reservation.
     * Structure is documented below.
     * 
     */
    @Export(name="aggregateReservation", refs={FutureReservationAggregateReservation.class}, tree="[0]")
    private Output</* @Nullable */ FutureReservationAggregateReservation> aggregateReservation;

    /**
     * @return Aggregate reservation details for the future reservation.
     * Structure is documented below.
     * 
     */
    public Output<Optional<FutureReservationAggregateReservation>> aggregateReservation() {
        return Codegen.optional(this.aggregateReservation);
    }
    /**
     * Future timestamp when the FR auto-created reservations will be deleted by Compute Engine.
     * 
     */
    @Export(name="autoCreatedReservationsDeleteTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> autoCreatedReservationsDeleteTime;

    /**
     * @return Future timestamp when the FR auto-created reservations will be deleted by Compute Engine.
     * 
     */
    public Output<Optional<String>> autoCreatedReservationsDeleteTime() {
        return Codegen.optional(this.autoCreatedReservationsDeleteTime);
    }
    /**
     * Specifies the duration of auto-created reservations. It represents relative time to future reservation startTime when auto-created reservations will be automatically deleted by Compute Engine. Duration time unit is represented as a count of seconds and fractions of seconds at nanosecond resolution.
     * Structure is documented below.
     * 
     */
    @Export(name="autoCreatedReservationsDuration", refs={FutureReservationAutoCreatedReservationsDuration.class}, tree="[0]")
    private Output</* @Nullable */ FutureReservationAutoCreatedReservationsDuration> autoCreatedReservationsDuration;

    /**
     * @return Specifies the duration of auto-created reservations. It represents relative time to future reservation startTime when auto-created reservations will be automatically deleted by Compute Engine. Duration time unit is represented as a count of seconds and fractions of seconds at nanosecond resolution.
     * Structure is documented below.
     * 
     */
    public Output<Optional<FutureReservationAutoCreatedReservationsDuration>> autoCreatedReservationsDuration() {
        return Codegen.optional(this.autoCreatedReservationsDuration);
    }
    /**
     * Setting for enabling or disabling automatic deletion for auto-created reservation. If set to true, auto-created reservations will be deleted at Future Reservation&#39;s end time (default) or at user&#39;s defined timestamp if any of the [autoCreatedReservationsDeleteTime, autoCreatedReservationsDuration] values is specified. For keeping auto-created reservation indefinitely, this value should be set to false.
     * 
     */
    @Export(name="autoDeleteAutoCreatedReservations", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoDeleteAutoCreatedReservations;

    /**
     * @return Setting for enabling or disabling automatic deletion for auto-created reservation. If set to true, auto-created reservations will be deleted at Future Reservation&#39;s end time (default) or at user&#39;s defined timestamp if any of the [autoCreatedReservationsDeleteTime, autoCreatedReservationsDuration] values is specified. For keeping auto-created reservation indefinitely, this value should be set to false.
     * 
     */
    public Output<Optional<Boolean>> autoDeleteAutoCreatedReservations() {
        return Codegen.optional(this.autoDeleteAutoCreatedReservations);
    }
    /**
     * If not present, then FR will not deliver a new commitment or update an existing commitment.
     * Structure is documented below.
     * 
     */
    @Export(name="commitmentInfo", refs={FutureReservationCommitmentInfo.class}, tree="[0]")
    private Output</* @Nullable */ FutureReservationCommitmentInfo> commitmentInfo;

    /**
     * @return If not present, then FR will not deliver a new commitment or update an existing commitment.
     * Structure is documented below.
     * 
     */
    public Output<Optional<FutureReservationCommitmentInfo>> commitmentInfo() {
        return Codegen.optional(this.commitmentInfo);
    }
    /**
     * The creation timestamp for this future reservation in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", refs={String.class}, tree="[0]")
    private Output<String> creationTimestamp;

    /**
     * @return The creation timestamp for this future reservation in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * Type of the deployment requested as part of future reservation.
     * Possible values are: `DENSE`, `FLEXIBLE`.
     * 
     */
    @Export(name="deploymentType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deploymentType;

    /**
     * @return Type of the deployment requested as part of future reservation.
     * Possible values are: `DENSE`, `FLEXIBLE`.
     * 
     */
    public Output<Optional<String>> deploymentType() {
        return Codegen.optional(this.deploymentType);
    }
    /**
     * An optional description of this resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the las
     * character, which cannot be a dash.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the las
     * character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Name prefix for the reservations to be created at the time of delivery. The name prefix must comply with RFC1035. Maximum allowed length for name prefix is 20. Automatically created reservations name format will be -date-####.
     * 
     */
    @Export(name="namePrefix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> namePrefix;

    /**
     * @return Name prefix for the reservations to be created at the time of delivery. The name prefix must comply with RFC1035. Maximum allowed length for name prefix is 20. Automatically created reservations name format will be -date-####.
     * 
     */
    public Output<Optional<String>> namePrefix() {
        return Codegen.optional(this.namePrefix);
    }
    /**
     * Planning state before being submitted for evaluation
     * Possible values are: `DRAFT`, `SUBMITTED`.
     * 
     */
    @Export(name="planningStatus", refs={String.class}, tree="[0]")
    private Output<String> planningStatus;

    /**
     * @return Planning state before being submitted for evaluation
     * Possible values are: `DRAFT`, `SUBMITTED`.
     * 
     */
    public Output<String> planningStatus() {
        return this.planningStatus;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The reservation mode which determines reservation-termination behavior and expected pricing.
     * Possible values are: `CALENDAR`, `DEFAULT`.
     * 
     */
    @Export(name="reservationMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> reservationMode;

    /**
     * @return The reservation mode which determines reservation-termination behavior and expected pricing.
     * Possible values are: `CALENDAR`, `DEFAULT`.
     * 
     */
    public Output<Optional<String>> reservationMode() {
        return Codegen.optional(this.reservationMode);
    }
    /**
     * Name of reservations where the capacity is provisioned at the time of delivery of future reservations. If the reservation with the given name does not exist already, it is created automatically at the time of Approval with INACTIVE state till specified start-time. Either provide the reservationName or a namePrefix.
     * 
     */
    @Export(name="reservationName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> reservationName;

    /**
     * @return Name of reservations where the capacity is provisioned at the time of delivery of future reservations. If the reservation with the given name does not exist already, it is created automatically at the time of Approval with INACTIVE state till specified start-time. Either provide the reservationName or a namePrefix.
     * 
     */
    public Output<Optional<String>> reservationName() {
        return Codegen.optional(this.reservationName);
    }
    /**
     * Maintenance information for this reservation
     * Possible values are: `GROUPED`, `INDEPENDENT`.
     * 
     */
    @Export(name="schedulingType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> schedulingType;

    /**
     * @return Maintenance information for this reservation
     * Possible values are: `GROUPED`, `INDEPENDENT`.
     * 
     */
    public Output<Optional<String>> schedulingType() {
        return Codegen.optional(this.schedulingType);
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", refs={String.class}, tree="[0]")
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @Export(name="selfLinkWithId", refs={String.class}, tree="[0]")
    private Output<String> selfLinkWithId;

    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public Output<String> selfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * Settings for sharing the future reservation
     * Structure is documented below.
     * 
     */
    @Export(name="shareSettings", refs={FutureReservationShareSettings.class}, tree="[0]")
    private Output</* @Nullable */ FutureReservationShareSettings> shareSettings;

    /**
     * @return Settings for sharing the future reservation
     * Structure is documented below.
     * 
     */
    public Output<Optional<FutureReservationShareSettings>> shareSettings() {
        return Codegen.optional(this.shareSettings);
    }
    /**
     * Indicates whether the auto-created reservation can be consumed by VMs with affinity for &#34;any&#34; reservation. If the field is set, then only VMs that target the reservation by name can consume from the delivered reservation.
     * 
     */
    @Export(name="specificReservationRequired", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> specificReservationRequired;

    /**
     * @return Indicates whether the auto-created reservation can be consumed by VMs with affinity for &#34;any&#34; reservation. If the field is set, then only VMs that target the reservation by name can consume from the delivered reservation.
     * 
     */
    public Output<Optional<Boolean>> specificReservationRequired() {
        return Codegen.optional(this.specificReservationRequired);
    }
    /**
     * Future Reservation configuration to indicate instance properties and total count.
     * Structure is documented below.
     * 
     */
    @Export(name="specificSkuProperties", refs={FutureReservationSpecificSkuProperties.class}, tree="[0]")
    private Output</* @Nullable */ FutureReservationSpecificSkuProperties> specificSkuProperties;

    /**
     * @return Future Reservation configuration to indicate instance properties and total count.
     * Structure is documented below.
     * 
     */
    public Output<Optional<FutureReservationSpecificSkuProperties>> specificSkuProperties() {
        return Codegen.optional(this.specificSkuProperties);
    }
    /**
     * [Output only] Status of the Future Reservation
     * Structure is documented below.
     * 
     */
    @Export(name="statuses", refs={List.class,FutureReservationStatus.class}, tree="[0,1]")
    private Output<List<FutureReservationStatus>> statuses;

    /**
     * @return [Output only] Status of the Future Reservation
     * Structure is documented below.
     * 
     */
    public Output<List<FutureReservationStatus>> statuses() {
        return this.statuses;
    }
    /**
     * Time window for this Future Reservation.
     * Structure is documented below.
     * 
     */
    @Export(name="timeWindow", refs={FutureReservationTimeWindow.class}, tree="[0]")
    private Output<FutureReservationTimeWindow> timeWindow;

    /**
     * @return Time window for this Future Reservation.
     * Structure is documented below.
     * 
     */
    public Output<FutureReservationTimeWindow> timeWindow() {
        return this.timeWindow;
    }
    /**
     * URL of the Zone where this future reservation resides.
     * 
     */
    @Export(name="zone", refs={String.class}, tree="[0]")
    private Output<String> zone;

    /**
     * @return URL of the Zone where this future reservation resides.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FutureReservation(java.lang.String name) {
        this(name, FutureReservationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FutureReservation(java.lang.String name, FutureReservationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FutureReservation(java.lang.String name, FutureReservationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/futureReservation:FutureReservation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FutureReservation(java.lang.String name, Output<java.lang.String> id, @Nullable FutureReservationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/futureReservation:FutureReservation", name, state, makeResourceOptions(options, id), false);
    }

    private static FutureReservationArgs makeArgs(FutureReservationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FutureReservationArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FutureReservation get(java.lang.String name, Output<java.lang.String> id, @Nullable FutureReservationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FutureReservation(name, id, state, options);
    }
}
