// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.ReservationArgs;
import com.pulumi.gcp.compute.inputs.ReservationState;
import com.pulumi.gcp.compute.outputs.ReservationShareSettings;
import com.pulumi.gcp.compute.outputs.ReservationSpecificReservation;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a reservation resource. A reservation ensures that capacity is
 * held in a specific zone even if the reserved VMs are not running.
 * 
 * Reservations apply only to Compute Engine, Cloud Dataproc, and Google
 * Kubernetes Engine VM usage.Reservations do not apply to `f1-micro` or
 * `g1-small` machine types, preemptible VMs, sole tenant nodes, or other
 * services not listed above
 * like Cloud SQL and Dataflow.
 * 
 * To get more information about Reservation, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/reservations)
 * * How-to Guides
 *     * [Reserving zonal resources](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources)
 * 
 * ## Example Usage
 * 
 * ### Reservation Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.Reservation;
 * import com.pulumi.gcp.compute.ReservationArgs;
 * import com.pulumi.gcp.compute.inputs.ReservationSpecificReservationArgs;
 * import com.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesArgs;
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
 *         var gceReservation = new Reservation("gceReservation", ReservationArgs.builder()
 *             .name("gce-reservation")
 *             .zone("us-central1-a")
 *             .specificReservation(ReservationSpecificReservationArgs.builder()
 *                 .count(1)
 *                 .instanceProperties(ReservationSpecificReservationInstancePropertiesArgs.builder()
 *                     .minCpuPlatform("Intel Cascade Lake")
 *                     .machineType("n2-standard-2")
 *                     .build())
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
 * Reservation can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/zones/{{zone}}/reservations/{{name}}`
 * 
 * * `{{project}}/{{zone}}/{{name}}`
 * 
 * * `{{zone}}/{{name}}`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, Reservation can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:compute/reservation:Reservation default projects/{{project}}/zones/{{zone}}/reservations/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/reservation:Reservation default {{project}}/{{zone}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/reservation:Reservation default {{zone}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/reservation:Reservation default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/reservation:Reservation")
public class Reservation extends com.pulumi.resources.CustomResource {
    /**
     * Full or partial URL to a parent commitment. This field displays for
     * reservations that are tied to a commitment.
     * 
     */
    @Export(name="commitment", refs={String.class}, tree="[0]")
    private Output<String> commitment;

    /**
     * @return Full or partial URL to a parent commitment. This field displays for
     * reservations that are tied to a commitment.
     * 
     */
    public Output<String> commitment() {
        return this.commitment;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", refs={String.class}, tree="[0]")
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
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
     * characters must be a dash, lowercase letter, or digit, except the last
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
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * The share setting for reservations.
     * Structure is documented below.
     * 
     */
    @Export(name="shareSettings", refs={ReservationShareSettings.class}, tree="[0]")
    private Output<ReservationShareSettings> shareSettings;

    /**
     * @return The share setting for reservations.
     * Structure is documented below.
     * 
     */
    public Output<ReservationShareSettings> shareSettings() {
        return this.shareSettings;
    }
    /**
     * Reservation for instances with specific machine shapes.
     * Structure is documented below.
     * 
     */
    @Export(name="specificReservation", refs={ReservationSpecificReservation.class}, tree="[0]")
    private Output<ReservationSpecificReservation> specificReservation;

    /**
     * @return Reservation for instances with specific machine shapes.
     * Structure is documented below.
     * 
     */
    public Output<ReservationSpecificReservation> specificReservation() {
        return this.specificReservation;
    }
    /**
     * When set to true, only VMs that target this reservation by name can
     * consume this reservation. Otherwise, it can be consumed by VMs with
     * affinity for any reservation. Defaults to false.
     * 
     */
    @Export(name="specificReservationRequired", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> specificReservationRequired;

    /**
     * @return When set to true, only VMs that target this reservation by name can
     * consume this reservation. Otherwise, it can be consumed by VMs with
     * affinity for any reservation. Defaults to false.
     * 
     */
    public Output<Optional<Boolean>> specificReservationRequired() {
        return Codegen.optional(this.specificReservationRequired);
    }
    /**
     * The status of the reservation.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the reservation.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The zone where the reservation is made.
     * 
     */
    @Export(name="zone", refs={String.class}, tree="[0]")
    private Output<String> zone;

    /**
     * @return The zone where the reservation is made.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Reservation(java.lang.String name) {
        this(name, ReservationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Reservation(java.lang.String name, ReservationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Reservation(java.lang.String name, ReservationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/reservation:Reservation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Reservation(java.lang.String name, Output<java.lang.String> id, @Nullable ReservationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/reservation:Reservation", name, state, makeResourceOptions(options, id), false);
    }

    private static ReservationArgs makeArgs(ReservationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ReservationArgs.Empty : args;
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
    public static Reservation get(java.lang.String name, Output<java.lang.String> id, @Nullable ReservationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Reservation(name, id, state, options);
    }
}
