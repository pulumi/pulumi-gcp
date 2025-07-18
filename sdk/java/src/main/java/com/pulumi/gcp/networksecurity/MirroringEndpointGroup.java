// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networksecurity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.networksecurity.MirroringEndpointGroupArgs;
import com.pulumi.gcp.networksecurity.inputs.MirroringEndpointGroupState;
import com.pulumi.gcp.networksecurity.outputs.MirroringEndpointGroupAssociation;
import com.pulumi.gcp.networksecurity.outputs.MirroringEndpointGroupConnectedDeploymentGroup;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An endpoint group is a consumer frontend for a deployment group (backend).
 * In order to configure mirroring for a network, consumers must create:
 * - An association between their network and the endpoint group.
 * - A security profile that points to the endpoint group.
 * - A mirroring rule that references the security profile (group).
 * 
 * To get more information about MirroringEndpointGroup, see:
 * 
 * * [API documentation](https://cloud.google.com/network-security-integration/docs/reference/rest/v1/projects.locations.mirroringEndpointGroups)
 * * How-to Guides
 *     * [Mirroring endpoint group overview](https://cloud.google.com/network-security-integration/docs/out-of-band/endpoint-groups-overview)
 * 
 * ## Example Usage
 * 
 * ### Network Security Mirroring Endpoint Group Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.Network;
 * import com.pulumi.gcp.compute.NetworkArgs;
 * import com.pulumi.gcp.networksecurity.MirroringDeploymentGroup;
 * import com.pulumi.gcp.networksecurity.MirroringDeploymentGroupArgs;
 * import com.pulumi.gcp.networksecurity.MirroringEndpointGroup;
 * import com.pulumi.gcp.networksecurity.MirroringEndpointGroupArgs;
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
 *         var network = new Network("network", NetworkArgs.builder()
 *             .name("example-network")
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var deploymentGroup = new MirroringDeploymentGroup("deploymentGroup", MirroringDeploymentGroupArgs.builder()
 *             .mirroringDeploymentGroupId("example-dg")
 *             .location("global")
 *             .network(network.id())
 *             .build());
 * 
 *         var default_ = new MirroringEndpointGroup("default", MirroringEndpointGroupArgs.builder()
 *             .mirroringEndpointGroupId("example-eg")
 *             .location("global")
 *             .mirroringDeploymentGroup(deploymentGroup.id())
 *             .description("some description")
 *             .labels(Map.of("foo", "bar"))
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
 * MirroringEndpointGroup can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/mirroringEndpointGroups/{{mirroring_endpoint_group_id}}`
 * 
 * * `{{project}}/{{location}}/{{mirroring_endpoint_group_id}}`
 * 
 * * `{{location}}/{{mirroring_endpoint_group_id}}`
 * 
 * When using the `pulumi import` command, MirroringEndpointGroup can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:networksecurity/mirroringEndpointGroup:MirroringEndpointGroup default projects/{{project}}/locations/{{location}}/mirroringEndpointGroups/{{mirroring_endpoint_group_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:networksecurity/mirroringEndpointGroup:MirroringEndpointGroup default {{project}}/{{location}}/{{mirroring_endpoint_group_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:networksecurity/mirroringEndpointGroup:MirroringEndpointGroup default {{location}}/{{mirroring_endpoint_group_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:networksecurity/mirroringEndpointGroup:MirroringEndpointGroup")
public class MirroringEndpointGroup extends com.pulumi.resources.CustomResource {
    /**
     * List of associations to this endpoint group.
     * Structure is documented below.
     * 
     */
    @Export(name="associations", refs={List.class,MirroringEndpointGroupAssociation.class}, tree="[0,1]")
    private Output<List<MirroringEndpointGroupAssociation>> associations;

    /**
     * @return List of associations to this endpoint group.
     * Structure is documented below.
     * 
     */
    public Output<List<MirroringEndpointGroupAssociation>> associations() {
        return this.associations;
    }
    /**
     * List of details about the connected deployment groups to this endpoint
     * group.
     * Structure is documented below.
     * 
     */
    @Export(name="connectedDeploymentGroups", refs={List.class,MirroringEndpointGroupConnectedDeploymentGroup.class}, tree="[0,1]")
    private Output<List<MirroringEndpointGroupConnectedDeploymentGroup>> connectedDeploymentGroups;

    /**
     * @return List of details about the connected deployment groups to this endpoint
     * group.
     * Structure is documented below.
     * 
     */
    public Output<List<MirroringEndpointGroupConnectedDeploymentGroup>> connectedDeploymentGroups() {
        return this.connectedDeploymentGroups;
    }
    /**
     * The timestamp when the resource was created.
     * See https://google.aip.dev/148#timestamps.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The timestamp when the resource was created.
     * See https://google.aip.dev/148#timestamps.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * User-provided description of the endpoint group.
     * Used as additional context for the endpoint group.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return User-provided description of the endpoint group.
     * Used as additional context for the endpoint group.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Export(name="effectiveLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Output<Map<String,String>> effectiveLabels() {
        return this.effectiveLabels;
    }
    /**
     * Labels are key/value pairs that help to organize and filter resources.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels are key/value pairs that help to organize and filter resources.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The cloud location of the endpoint group, currently restricted to `global`.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The cloud location of the endpoint group, currently restricted to `global`.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The deployment group that this DIRECT endpoint group is connected to, for example:
     * `projects/123456789/locations/global/mirroringDeploymentGroups/my-dg`.
     * See https://google.aip.dev/124.
     * 
     */
    @Export(name="mirroringDeploymentGroup", refs={String.class}, tree="[0]")
    private Output<String> mirroringDeploymentGroup;

    /**
     * @return The deployment group that this DIRECT endpoint group is connected to, for example:
     * `projects/123456789/locations/global/mirroringDeploymentGroups/my-dg`.
     * See https://google.aip.dev/124.
     * 
     */
    public Output<String> mirroringDeploymentGroup() {
        return this.mirroringDeploymentGroup;
    }
    /**
     * The ID to use for the endpoint group, which will become the final component
     * of the endpoint group&#39;s resource name.
     * 
     */
    @Export(name="mirroringEndpointGroupId", refs={String.class}, tree="[0]")
    private Output<String> mirroringEndpointGroupId;

    /**
     * @return The ID to use for the endpoint group, which will become the final component
     * of the endpoint group&#39;s resource name.
     * 
     */
    public Output<String> mirroringEndpointGroupId() {
        return this.mirroringEndpointGroupId;
    }
    /**
     * (Output)
     * The connected deployment group&#39;s resource name, for example:
     * `projects/123456789/locations/global/mirroringDeploymentGroups/my-dg`.
     * See https://google.aip.dev/124.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return (Output)
     * The connected deployment group&#39;s resource name, for example:
     * `projects/123456789/locations/global/mirroringDeploymentGroups/my-dg`.
     * See https://google.aip.dev/124.
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
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Export(name="pulumiLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Output<Map<String,String>> pulumiLabels() {
        return this.pulumiLabels;
    }
    /**
     * The current state of the resource does not match the user&#39;s intended state,
     * and the system is working to reconcile them. This is part of the normal
     * operation (e.g. adding a new association to the group).
     * See https://google.aip.dev/128.
     * 
     */
    @Export(name="reconciling", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> reconciling;

    /**
     * @return The current state of the resource does not match the user&#39;s intended state,
     * and the system is working to reconcile them. This is part of the normal
     * operation (e.g. adding a new association to the group).
     * See https://google.aip.dev/128.
     * 
     */
    public Output<Boolean> reconciling() {
        return this.reconciling;
    }
    /**
     * (Output)
     * The current state of the association in this location.
     * Possible values:
     * STATE_UNSPECIFIED
     * ACTIVE
     * OUT_OF_SYNC
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return (Output)
     * The current state of the association in this location.
     * Possible values:
     * STATE_UNSPECIFIED
     * ACTIVE
     * OUT_OF_SYNC
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The timestamp when the resource was most recently updated.
     * See https://google.aip.dev/148#timestamps.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return The timestamp when the resource was most recently updated.
     * See https://google.aip.dev/148#timestamps.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MirroringEndpointGroup(java.lang.String name) {
        this(name, MirroringEndpointGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MirroringEndpointGroup(java.lang.String name, MirroringEndpointGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MirroringEndpointGroup(java.lang.String name, MirroringEndpointGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networksecurity/mirroringEndpointGroup:MirroringEndpointGroup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private MirroringEndpointGroup(java.lang.String name, Output<java.lang.String> id, @Nullable MirroringEndpointGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networksecurity/mirroringEndpointGroup:MirroringEndpointGroup", name, state, makeResourceOptions(options, id), false);
    }

    private static MirroringEndpointGroupArgs makeArgs(MirroringEndpointGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MirroringEndpointGroupArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "effectiveLabels",
                "pulumiLabels"
            ))
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
    public static MirroringEndpointGroup get(java.lang.String name, Output<java.lang.String> id, @Nullable MirroringEndpointGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MirroringEndpointGroup(name, id, state, options);
    }
}
