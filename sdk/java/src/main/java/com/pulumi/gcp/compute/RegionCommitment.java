// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.RegionCommitmentArgs;
import com.pulumi.gcp.compute.inputs.RegionCommitmentState;
import com.pulumi.gcp.compute.outputs.RegionCommitmentLicenseResource;
import com.pulumi.gcp.compute.outputs.RegionCommitmentResource;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a regional Commitment resource.
 * 
 * Creating a commitment resource means that you are purchasing a committed
 * use contract with an explicit start and end time. You can create commitments
 * based on vCPUs and memory usage and receive discounted rates.
 * 
 * To get more information about RegionCommitment, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/regionCommitments)
 * * How-to Guides
 *     * [Committed use discounts for Compute Engine](https://cloud.google.com/compute/docs/instances/committed-use-discounts-overview)
 * 
 * ## Example Usage
 * ### Compute Region Commitment Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.RegionCommitment;
 * import com.pulumi.gcp.compute.RegionCommitmentArgs;
 * import com.pulumi.gcp.compute.inputs.RegionCommitmentResourceArgs;
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
 *         var foobar = new RegionCommitment(&#34;foobar&#34;, RegionCommitmentArgs.builder()        
 *             .plan(&#34;THIRTY_SIX_MONTH&#34;)
 *             .resources(            
 *                 RegionCommitmentResourceArgs.builder()
 *                     .amount(&#34;4&#34;)
 *                     .type(&#34;VCPU&#34;)
 *                     .build(),
 *                 RegionCommitmentResourceArgs.builder()
 *                     .amount(&#34;9&#34;)
 *                     .type(&#34;MEMORY&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Compute Region Commitment Full
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.RegionCommitment;
 * import com.pulumi.gcp.compute.RegionCommitmentArgs;
 * import com.pulumi.gcp.compute.inputs.RegionCommitmentResourceArgs;
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
 *         var foobar = new RegionCommitment(&#34;foobar&#34;, RegionCommitmentArgs.builder()        
 *             .autoRenew(true)
 *             .category(&#34;MACHINE&#34;)
 *             .description(&#34;some description&#34;)
 *             .plan(&#34;THIRTY_SIX_MONTH&#34;)
 *             .resources(            
 *                 RegionCommitmentResourceArgs.builder()
 *                     .amount(&#34;4&#34;)
 *                     .type(&#34;VCPU&#34;)
 *                     .build(),
 *                 RegionCommitmentResourceArgs.builder()
 *                     .amount(&#34;9&#34;)
 *                     .type(&#34;MEMORY&#34;)
 *                     .build())
 *             .type(&#34;MEMORY_OPTIMIZED&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * RegionCommitment can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionCommitment:RegionCommitment default projects/{{project}}/regions/{{region}}/commitments/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionCommitment:RegionCommitment default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionCommitment:RegionCommitment default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionCommitment:RegionCommitment default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionCommitment:RegionCommitment")
public class RegionCommitment extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether to enable automatic renewal for the commitment.
     * The default value is false if not specified.
     * If the field is set to true, the commitment will be automatically renewed for either
     * one or three years according to the terms of the existing commitment.
     * 
     */
    @Export(name="autoRenew", type=Boolean.class, parameters={})
    private Output<Boolean> autoRenew;

    /**
     * @return Specifies whether to enable automatic renewal for the commitment.
     * The default value is false if not specified.
     * If the field is set to true, the commitment will be automatically renewed for either
     * one or three years according to the terms of the existing commitment.
     * 
     */
    public Output<Boolean> autoRenew() {
        return this.autoRenew;
    }
    /**
     * The category of the commitment. Category MACHINE specifies commitments composed of
     * machine resources such as VCPU or MEMORY, listed in resources. Category LICENSE
     * specifies commitments composed of software licenses, listed in licenseResources.
     * Note that only MACHINE commitments should have a Type specified.
     * Possible values are: `LICENSE`, `MACHINE`.
     * 
     */
    @Export(name="category", type=String.class, parameters={})
    private Output<String> category;

    /**
     * @return The category of the commitment. Category MACHINE specifies commitments composed of
     * machine resources such as VCPU or MEMORY, listed in resources. Category LICENSE
     * specifies commitments composed of software licenses, listed in licenseResources.
     * Note that only MACHINE commitments should have a Type specified.
     * Possible values are: `LICENSE`, `MACHINE`.
     * 
     */
    public Output<String> category() {
        return this.category;
    }
    /**
     * Unique identifier for the resource.
     * 
     */
    @Export(name="commitmentId", type=Integer.class, parameters={})
    private Output<Integer> commitmentId;

    /**
     * @return Unique identifier for the resource.
     * 
     */
    public Output<Integer> commitmentId() {
        return this.commitmentId;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
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
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Commitment end time in RFC3339 text format.
     * 
     */
    @Export(name="endTimestamp", type=String.class, parameters={})
    private Output<String> endTimestamp;

    /**
     * @return Commitment end time in RFC3339 text format.
     * 
     */
    public Output<String> endTimestamp() {
        return this.endTimestamp;
    }
    /**
     * The license specification required as part of a license commitment.
     * Structure is documented below.
     * 
     */
    @Export(name="licenseResource", type=RegionCommitmentLicenseResource.class, parameters={})
    private Output</* @Nullable */ RegionCommitmentLicenseResource> licenseResource;

    /**
     * @return The license specification required as part of a license commitment.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RegionCommitmentLicenseResource>> licenseResource() {
        return Codegen.optional(this.licenseResource);
    }
    /**
     * Name of the resource. The name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. The name must be 1-63 characters long and match
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
     * The plan for this commitment, which determines duration and discount rate.
     * The currently supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
     * Possible values are: `TWELVE_MONTH`, `THIRTY_SIX_MONTH`.
     * 
     */
    @Export(name="plan", type=String.class, parameters={})
    private Output<String> plan;

    /**
     * @return The plan for this commitment, which determines duration and discount rate.
     * The currently supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
     * Possible values are: `TWELVE_MONTH`, `THIRTY_SIX_MONTH`.
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
    @Export(name="project", type=String.class, parameters={})
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
     * URL of the region where this commitment may be used.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URL of the region where this commitment may be used.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * A list of commitment amounts for particular resources.
     * Note that VCPU and MEMORY resource commitments must occur together.
     * Structure is documented below.
     * 
     */
    @Export(name="resources", type=List.class, parameters={RegionCommitmentResource.class})
    private Output</* @Nullable */ List<RegionCommitmentResource>> resources;

    /**
     * @return A list of commitment amounts for particular resources.
     * Note that VCPU and MEMORY resource commitments must occur together.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<RegionCommitmentResource>>> resources() {
        return Codegen.optional(this.resources);
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Commitment start time in RFC3339 text format.
     * 
     */
    @Export(name="startTimestamp", type=String.class, parameters={})
    private Output<String> startTimestamp;

    /**
     * @return Commitment start time in RFC3339 text format.
     * 
     */
    public Output<String> startTimestamp() {
        return this.startTimestamp;
    }
    /**
     * Status of the commitment with regards to eventual expiration
     * (each commitment has an end date defined).
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the commitment with regards to eventual expiration
     * (each commitment has an end date defined).
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A human-readable explanation of the status.
     * 
     */
    @Export(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    /**
     * @return A human-readable explanation of the status.
     * 
     */
    public Output<String> statusMessage() {
        return this.statusMessage;
    }
    /**
     * The type of commitment, which affects the discount rate and the eligible resources.
     * Type MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized
     * machines. Type ACCELERATOR_OPTIMIZED specifies a commitment that will only apply to
     * accelerator optimized machines.
     * Possible values are: `MEMORY_OPTIMIZED`, `ACCELERATOR_OPTIMIZED`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of commitment, which affects the discount rate and the eligible resources.
     * Type MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized
     * machines. Type ACCELERATOR_OPTIMIZED specifies a commitment that will only apply to
     * accelerator optimized machines.
     * Possible values are: `MEMORY_OPTIMIZED`, `ACCELERATOR_OPTIMIZED`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionCommitment(String name) {
        this(name, RegionCommitmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionCommitment(String name, RegionCommitmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionCommitment(String name, RegionCommitmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionCommitment:RegionCommitment", name, args == null ? RegionCommitmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegionCommitment(String name, Output<String> id, @Nullable RegionCommitmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionCommitment:RegionCommitment", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static RegionCommitment get(String name, Output<String> id, @Nullable RegionCommitmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegionCommitment(name, id, state, options);
    }
}