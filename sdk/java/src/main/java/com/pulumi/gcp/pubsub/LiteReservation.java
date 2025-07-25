// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.pubsub.LiteReservationArgs;
import com.pulumi.gcp.pubsub.inputs.LiteReservationState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A named resource representing a shared pool of capacity.
 * 
 * To get more information about Reservation, see:
 * 
 * * [API documentation](https://cloud.google.com/pubsub/lite/docs/reference/rest/v1/admin.projects.locations.reservations)
 * * How-to Guides
 *     * [Managing Reservations](https://cloud.google.com/pubsub/lite/docs/reservations)
 * 
 * ## Example Usage
 * 
 * ### Pubsub Lite Reservation Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
 * import com.pulumi.gcp.pubsub.LiteReservation;
 * import com.pulumi.gcp.pubsub.LiteReservationArgs;
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
 *         final var project = OrganizationsFunctions.getProject(GetProjectArgs.builder()
 *             .build());
 * 
 *         var example = new LiteReservation("example", LiteReservationArgs.builder()
 *             .name("example-reservation")
 *             .project(project.number())
 *             .throughputCapacity(2)
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
 * * `projects/{{project}}/locations/{{region}}/reservations/{{name}}`
 * 
 * * `{{project}}/{{region}}/{{name}}`
 * 
 * * `{{region}}/{{name}}`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, Reservation can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:pubsub/liteReservation:LiteReservation default projects/{{project}}/locations/{{region}}/reservations/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:pubsub/liteReservation:LiteReservation default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:pubsub/liteReservation:LiteReservation default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:pubsub/liteReservation:LiteReservation default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:pubsub/liteReservation:LiteReservation")
public class LiteReservation extends com.pulumi.resources.CustomResource {
    /**
     * Name of the reservation.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the reservation.
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
     * The region of the pubsub lite reservation.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> region;

    /**
     * @return The region of the pubsub lite reservation.
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    /**
     * The reserved throughput capacity. Every unit of throughput capacity is
     * equivalent to 1 MiB/s of published messages or 2 MiB/s of subscribed
     * messages.
     * 
     */
    @Export(name="throughputCapacity", refs={Integer.class}, tree="[0]")
    private Output<Integer> throughputCapacity;

    /**
     * @return The reserved throughput capacity. Every unit of throughput capacity is
     * equivalent to 1 MiB/s of published messages or 2 MiB/s of subscribed
     * messages.
     * 
     */
    public Output<Integer> throughputCapacity() {
        return this.throughputCapacity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LiteReservation(java.lang.String name) {
        this(name, LiteReservationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LiteReservation(java.lang.String name, LiteReservationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LiteReservation(java.lang.String name, LiteReservationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/liteReservation:LiteReservation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LiteReservation(java.lang.String name, Output<java.lang.String> id, @Nullable LiteReservationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:pubsub/liteReservation:LiteReservation", name, state, makeResourceOptions(options, id), false);
    }

    private static LiteReservationArgs makeArgs(LiteReservationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LiteReservationArgs.Empty : args;
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
    public static LiteReservation get(java.lang.String name, Output<java.lang.String> id, @Nullable LiteReservationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LiteReservation(name, id, state, options);
    }
}
