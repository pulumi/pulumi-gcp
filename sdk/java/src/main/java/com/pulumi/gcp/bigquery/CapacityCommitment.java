// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.bigquery.CapacityCommitmentArgs;
import com.pulumi.gcp.bigquery.inputs.CapacityCommitmentState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Capacity commitment is a way to purchase compute capacity for BigQuery jobs (in the form of slots) with some committed period of usage. Annual commitments renew by default. Commitments can be removed after their commitment end time passes.
 * 
 * In order to remove annual commitment, its plan needs to be changed to monthly or flex first.
 * 
 * To get more information about CapacityCommitment, see:
 * 
 * * [API documentation](https://cloud.google.com/bigquery/docs/reference/reservations/rest/v1/projects.locations.capacityCommitments)
 * * How-to Guides
 *     * [Introduction to Reservations](https://cloud.google.com/bigquery/docs/reservations-intro)
 * 
 * ## Example Usage
 * 
 * ### Bigquery Reservation Capacity Commitment Docs
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigquery.CapacityCommitment;
 * import com.pulumi.gcp.bigquery.CapacityCommitmentArgs;
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
 *         var example = new CapacityCommitment("example", CapacityCommitmentArgs.builder()
 *             .capacityCommitmentId("example-commitment")
 *             .location("us-west2")
 *             .slotCount(100)
 *             .plan("FLEX_FLAT_RATE")
 *             .edition("ENTERPRISE")
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
 * CapacityCommitment can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/capacityCommitments/{{capacity_commitment_id}}`
 * 
 * * `{{project}}/{{location}}/{{capacity_commitment_id}}`
 * 
 * * `{{location}}/{{capacity_commitment_id}}`
 * 
 * When using the `pulumi import` command, CapacityCommitment can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:bigquery/capacityCommitment:CapacityCommitment default projects/{{project}}/locations/{{location}}/capacityCommitments/{{capacity_commitment_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:bigquery/capacityCommitment:CapacityCommitment default {{project}}/{{location}}/{{capacity_commitment_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:bigquery/capacityCommitment:CapacityCommitment default {{location}}/{{capacity_commitment_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:bigquery/capacityCommitment:CapacityCommitment")
public class CapacityCommitment extends com.pulumi.resources.CustomResource {
    /**
     * The optional capacity commitment ID. Capacity commitment name will be generated automatically if this field is
     * empty. This field must only contain lower case alphanumeric characters or dashes. The first and last character
     * cannot be a dash. Max length is 64 characters. NOTE: this ID won&#39;t be kept if the capacity commitment is split
     * or merged.
     * 
     */
    @Export(name="capacityCommitmentId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> capacityCommitmentId;

    /**
     * @return The optional capacity commitment ID. Capacity commitment name will be generated automatically if this field is
     * empty. This field must only contain lower case alphanumeric characters or dashes. The first and last character
     * cannot be a dash. Max length is 64 characters. NOTE: this ID won&#39;t be kept if the capacity commitment is split
     * or merged.
     * 
     */
    public Output<Optional<String>> capacityCommitmentId() {
        return Codegen.optional(this.capacityCommitmentId);
    }
    /**
     * The start of the current commitment period. It is applicable only for ACTIVE capacity commitments.
     * 
     */
    @Export(name="commitmentEndTime", refs={String.class}, tree="[0]")
    private Output<String> commitmentEndTime;

    /**
     * @return The start of the current commitment period. It is applicable only for ACTIVE capacity commitments.
     * 
     */
    public Output<String> commitmentEndTime() {
        return this.commitmentEndTime;
    }
    /**
     * The start of the current commitment period. It is applicable only for ACTIVE capacity commitments.
     * 
     */
    @Export(name="commitmentStartTime", refs={String.class}, tree="[0]")
    private Output<String> commitmentStartTime;

    /**
     * @return The start of the current commitment period. It is applicable only for ACTIVE capacity commitments.
     * 
     */
    public Output<String> commitmentStartTime() {
        return this.commitmentStartTime;
    }
    /**
     * The edition type. Valid values are STANDARD, ENTERPRISE, ENTERPRISE_PLUS
     * 
     */
    @Export(name="edition", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> edition;

    /**
     * @return The edition type. Valid values are STANDARD, ENTERPRISE, ENTERPRISE_PLUS
     * 
     */
    public Output<Optional<String>> edition() {
        return Codegen.optional(this.edition);
    }
    /**
     * If true, fail the request if another project in the organization has a capacity commitment.
     * 
     */
    @Export(name="enforceSingleAdminProjectPerOrg", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> enforceSingleAdminProjectPerOrg;

    /**
     * @return If true, fail the request if another project in the organization has a capacity commitment.
     * 
     */
    public Output<Optional<String>> enforceSingleAdminProjectPerOrg() {
        return Codegen.optional(this.enforceSingleAdminProjectPerOrg);
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
     * The resource name of the capacity commitment, e.g., projects/myproject/locations/US/capacityCommitments/123
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name of the capacity commitment, e.g., projects/myproject/locations/US/capacityCommitments/123
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Capacity commitment plan. Valid values are at https://cloud.google.com/bigquery/docs/reference/reservations/rpc/google.cloud.bigquery.reservation.v1#commitmentplan
     * 
     */
    @Export(name="plan", refs={String.class}, tree="[0]")
    private Output<String> plan;

    /**
     * @return Capacity commitment plan. Valid values are at https://cloud.google.com/bigquery/docs/reference/reservations/rpc/google.cloud.bigquery.reservation.v1#commitmentplan
     * 
     */
    public Output<String> plan() {
        return this.plan;
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
     * The plan this capacity commitment is converted to after commitmentEndTime passes. Once the plan is changed, committed period is extended according to commitment plan. Only applicable for some commitment plans.
     * 
     */
    @Export(name="renewalPlan", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> renewalPlan;

    /**
     * @return The plan this capacity commitment is converted to after commitmentEndTime passes. Once the plan is changed, committed period is extended according to commitment plan. Only applicable for some commitment plans.
     * 
     */
    public Output<Optional<String>> renewalPlan() {
        return Codegen.optional(this.renewalPlan);
    }
    /**
     * Number of slots in this commitment.
     * 
     */
    @Export(name="slotCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> slotCount;

    /**
     * @return Number of slots in this commitment.
     * 
     */
    public Output<Integer> slotCount() {
        return this.slotCount;
    }
    /**
     * State of the commitment
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return State of the commitment
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CapacityCommitment(java.lang.String name) {
        this(name, CapacityCommitmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CapacityCommitment(java.lang.String name, CapacityCommitmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CapacityCommitment(java.lang.String name, CapacityCommitmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/capacityCommitment:CapacityCommitment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private CapacityCommitment(java.lang.String name, Output<java.lang.String> id, @Nullable CapacityCommitmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/capacityCommitment:CapacityCommitment", name, state, makeResourceOptions(options, id), false);
    }

    private static CapacityCommitmentArgs makeArgs(CapacityCommitmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CapacityCommitmentArgs.Empty : args;
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
    public static CapacityCommitment get(java.lang.String name, Output<java.lang.String> id, @Nullable CapacityCommitmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CapacityCommitment(name, id, state, options);
    }
}
