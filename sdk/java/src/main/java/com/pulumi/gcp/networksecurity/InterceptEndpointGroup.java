// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networksecurity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.networksecurity.InterceptEndpointGroupArgs;
import com.pulumi.gcp.networksecurity.inputs.InterceptEndpointGroupState;
import com.pulumi.gcp.networksecurity.outputs.InterceptEndpointGroupAssociation;
import com.pulumi.gcp.networksecurity.outputs.InterceptEndpointGroupConnectedDeploymentGroup;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An endpoint group is a consumer frontend for a deployment group (backend).
 * In order to configure intercept for a network, consumers must create:
 * - An association between their network and the endpoint group.
 * - A security profile that points to the endpoint group.
 * - A firewall rule that references the security profile (group).
 * 
 * ## Example Usage
 * 
 * ### Network Security Intercept Endpoint Group Basic
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
 * import com.pulumi.gcp.networksecurity.InterceptDeploymentGroup;
 * import com.pulumi.gcp.networksecurity.InterceptDeploymentGroupArgs;
 * import com.pulumi.gcp.networksecurity.InterceptEndpointGroup;
 * import com.pulumi.gcp.networksecurity.InterceptEndpointGroupArgs;
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
 *         var deploymentGroup = new InterceptDeploymentGroup("deploymentGroup", InterceptDeploymentGroupArgs.builder()
 *             .interceptDeploymentGroupId("example-dg")
 *             .location("global")
 *             .network(network.id())
 *             .build());
 * 
 *         var default_ = new InterceptEndpointGroup("default", InterceptEndpointGroupArgs.builder()
 *             .interceptEndpointGroupId("example-eg")
 *             .location("global")
 *             .interceptDeploymentGroup(deploymentGroup.id())
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
 * InterceptEndpointGroup can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/interceptEndpointGroups/{{intercept_endpoint_group_id}}`
 * 
 * * `{{project}}/{{location}}/{{intercept_endpoint_group_id}}`
 * 
 * * `{{location}}/{{intercept_endpoint_group_id}}`
 * 
 * When using the `pulumi import` command, InterceptEndpointGroup can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:networksecurity/interceptEndpointGroup:InterceptEndpointGroup default projects/{{project}}/locations/{{location}}/interceptEndpointGroups/{{intercept_endpoint_group_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:networksecurity/interceptEndpointGroup:InterceptEndpointGroup default {{project}}/{{location}}/{{intercept_endpoint_group_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:networksecurity/interceptEndpointGroup:InterceptEndpointGroup default {{location}}/{{intercept_endpoint_group_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:networksecurity/interceptEndpointGroup:InterceptEndpointGroup")
public class InterceptEndpointGroup extends com.pulumi.resources.CustomResource {
    /**
     * List of associations to this endpoint group.
     * Structure is documented below.
     * 
     */
    @Export(name="associations", refs={List.class,InterceptEndpointGroupAssociation.class}, tree="[0,1]")
    private Output<List<InterceptEndpointGroupAssociation>> associations;

    /**
     * @return List of associations to this endpoint group.
     * Structure is documented below.
     * 
     */
    public Output<List<InterceptEndpointGroupAssociation>> associations() {
        return this.associations;
    }
    /**
     * The endpoint group&#39;s view of a connected deployment group.
     * Structure is documented below.
     * 
     */
    @Export(name="connectedDeploymentGroups", refs={List.class,InterceptEndpointGroupConnectedDeploymentGroup.class}, tree="[0,1]")
    private Output<List<InterceptEndpointGroupConnectedDeploymentGroup>> connectedDeploymentGroups;

    /**
     * @return The endpoint group&#39;s view of a connected deployment group.
     * Structure is documented below.
     * 
     */
    public Output<List<InterceptEndpointGroupConnectedDeploymentGroup>> connectedDeploymentGroups() {
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
     * The deployment group that this endpoint group is connected to, for example:
     * `projects/123456789/locations/global/interceptDeploymentGroups/my-dg`.
     * See https://google.aip.dev/124.
     * 
     */
    @Export(name="interceptDeploymentGroup", refs={String.class}, tree="[0]")
    private Output<String> interceptDeploymentGroup;

    /**
     * @return The deployment group that this endpoint group is connected to, for example:
     * `projects/123456789/locations/global/interceptDeploymentGroups/my-dg`.
     * See https://google.aip.dev/124.
     * 
     */
    public Output<String> interceptDeploymentGroup() {
        return this.interceptDeploymentGroup;
    }
    /**
     * The ID to use for the endpoint group, which will become the final component
     * of the endpoint group&#39;s resource name.
     * 
     */
    @Export(name="interceptEndpointGroupId", refs={String.class}, tree="[0]")
    private Output<String> interceptEndpointGroupId;

    /**
     * @return The ID to use for the endpoint group, which will become the final component
     * of the endpoint group&#39;s resource name.
     * 
     */
    public Output<String> interceptEndpointGroupId() {
        return this.interceptEndpointGroupId;
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
     * (Output)
     * The connected deployment group&#39;s resource name, for example:
     * `projects/123456789/locations/global/interceptDeploymentGroups/my-dg`.
     * See https://google.aip.dev/124.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return (Output)
     * The connected deployment group&#39;s resource name, for example:
     * `projects/123456789/locations/global/interceptDeploymentGroups/my-dg`.
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
    public InterceptEndpointGroup(java.lang.String name) {
        this(name, InterceptEndpointGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InterceptEndpointGroup(java.lang.String name, InterceptEndpointGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InterceptEndpointGroup(java.lang.String name, InterceptEndpointGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networksecurity/interceptEndpointGroup:InterceptEndpointGroup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private InterceptEndpointGroup(java.lang.String name, Output<java.lang.String> id, @Nullable InterceptEndpointGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networksecurity/interceptEndpointGroup:InterceptEndpointGroup", name, state, makeResourceOptions(options, id), false);
    }

    private static InterceptEndpointGroupArgs makeArgs(InterceptEndpointGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? InterceptEndpointGroupArgs.Empty : args;
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
    public static InterceptEndpointGroup get(java.lang.String name, Output<java.lang.String> id, @Nullable InterceptEndpointGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InterceptEndpointGroup(name, id, state, options);
    }
}
