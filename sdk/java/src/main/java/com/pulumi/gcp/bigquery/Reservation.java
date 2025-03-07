// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.bigquery.ReservationArgs;
import com.pulumi.gcp.bigquery.inputs.ReservationState;
import com.pulumi.gcp.bigquery.outputs.ReservationAutoscale;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A reservation is a mechanism used to guarantee BigQuery slots to users.
 * 
 * To get more information about Reservation, see:
 * 
 * * [API documentation](https://cloud.google.com/bigquery/docs/reference/reservations/rest/v1/projects.locations.reservations/create)
 * * How-to Guides
 *     * [Introduction to Reservations](https://cloud.google.com/bigquery/docs/reservations-intro)
 * 
 * ## Example Usage
 * 
 * ### Bigquery Reservation Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigquery.Reservation;
 * import com.pulumi.gcp.bigquery.ReservationArgs;
 * import com.pulumi.gcp.bigquery.inputs.ReservationAutoscaleArgs;
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
 *         var reservation = new Reservation("reservation", ReservationArgs.builder()
 *             .name("my-reservation")
 *             .location("us-west2")
 *             .slotCapacity(0)
 *             .edition("STANDARD")
 *             .ignoreIdleSlots(true)
 *             .concurrency(0)
 *             .autoscale(ReservationAutoscaleArgs.builder()
 *                 .maxSlots(100)
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
 * * `projects/{{project}}/locations/{{location}}/reservations/{{name}}`
 * 
 * * `{{project}}/{{location}}/{{name}}`
 * 
 * * `{{location}}/{{name}}`
 * 
 * When using the `pulumi import` command, Reservation can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:bigquery/reservation:Reservation default projects/{{project}}/locations/{{location}}/reservations/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:bigquery/reservation:Reservation default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:bigquery/reservation:Reservation default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:bigquery/reservation:Reservation")
public class Reservation extends com.pulumi.resources.CustomResource {
    /**
     * The configuration parameters for the auto scaling feature.
     * Structure is documented below.
     * 
     */
    @Export(name="autoscale", refs={ReservationAutoscale.class}, tree="[0]")
    private Output</* @Nullable */ ReservationAutoscale> autoscale;

    /**
     * @return The configuration parameters for the auto scaling feature.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ReservationAutoscale>> autoscale() {
        return Codegen.optional(this.autoscale);
    }
    /**
     * Maximum number of queries that are allowed to run concurrently in this reservation. This is a soft limit due to asynchronous nature of the system and various optimizations for small queries. Default value is 0 which means that concurrency will be automatically set based on the reservation size.
     * 
     */
    @Export(name="concurrency", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> concurrency;

    /**
     * @return Maximum number of queries that are allowed to run concurrently in this reservation. This is a soft limit due to asynchronous nature of the system and various optimizations for small queries. Default value is 0 which means that concurrency will be automatically set based on the reservation size.
     * 
     */
    public Output<Optional<Integer>> concurrency() {
        return Codegen.optional(this.concurrency);
    }
    /**
     * The edition type. Valid values are STANDARD, ENTERPRISE, ENTERPRISE_PLUS
     * 
     */
    @Export(name="edition", refs={String.class}, tree="[0]")
    private Output<String> edition;

    /**
     * @return The edition type. Valid values are STANDARD, ENTERPRISE, ENTERPRISE_PLUS
     * 
     */
    public Output<String> edition() {
        return this.edition;
    }
    /**
     * If false, any query using this reservation will use idle slots from other reservations within
     * the same admin project. If true, a query using this reservation will execute with the slot
     * capacity specified above at most.
     * 
     */
    @Export(name="ignoreIdleSlots", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ignoreIdleSlots;

    /**
     * @return If false, any query using this reservation will use idle slots from other reservations within
     * the same admin project. If true, a query using this reservation will execute with the slot
     * capacity specified above at most.
     * 
     */
    public Output<Optional<Boolean>> ignoreIdleSlots() {
        return Codegen.optional(this.ignoreIdleSlots);
    }
    /**
     * The geographic location where the transfer config should reside.
     * Examples: US, EU, asia-northeast1. The default value is US.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> location;

    /**
     * @return The geographic location where the transfer config should reside.
     * Examples: US, EU, asia-northeast1. The default value is US.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The name of the reservation. This field must only contain alphanumeric characters or dash.
     * 
     * ***
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the reservation. This field must only contain alphanumeric characters or dash.
     * 
     * ***
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
     * Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the
     * unit of parallelism. Queries using this reservation might use more slots during runtime if ignoreIdleSlots is set to false.
     * 
     */
    @Export(name="slotCapacity", refs={Integer.class}, tree="[0]")
    private Output<Integer> slotCapacity;

    /**
     * @return Minimum slots available to this reservation. A slot is a unit of computational power in BigQuery, and serves as the
     * unit of parallelism. Queries using this reservation might use more slots during runtime if ignoreIdleSlots is set to false.
     * 
     */
    public Output<Integer> slotCapacity() {
        return this.slotCapacity;
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
        super("gcp:bigquery/reservation:Reservation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Reservation(java.lang.String name, Output<java.lang.String> id, @Nullable ReservationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/reservation:Reservation", name, state, makeResourceOptions(options, id), false);
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
