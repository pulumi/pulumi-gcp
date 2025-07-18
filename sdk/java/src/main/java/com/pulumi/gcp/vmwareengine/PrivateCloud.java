// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vmwareengine;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.vmwareengine.PrivateCloudArgs;
import com.pulumi.gcp.vmwareengine.inputs.PrivateCloudState;
import com.pulumi.gcp.vmwareengine.outputs.PrivateCloudHcx;
import com.pulumi.gcp.vmwareengine.outputs.PrivateCloudManagementCluster;
import com.pulumi.gcp.vmwareengine.outputs.PrivateCloudNetworkConfig;
import com.pulumi.gcp.vmwareengine.outputs.PrivateCloudNsx;
import com.pulumi.gcp.vmwareengine.outputs.PrivateCloudVcenter;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a private cloud resource. Private clouds are zonal resources.
 * 
 * To get more information about PrivateCloud, see:
 * 
 * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds)
 * 
 * ## Example Usage
 * 
 * ### Vmware Engine Private Cloud Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.vmwareengine.Network;
 * import com.pulumi.gcp.vmwareengine.NetworkArgs;
 * import com.pulumi.gcp.vmwareengine.PrivateCloud;
 * import com.pulumi.gcp.vmwareengine.PrivateCloudArgs;
 * import com.pulumi.gcp.vmwareengine.inputs.PrivateCloudNetworkConfigArgs;
 * import com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs;
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
 *         var pc_nw = new Network("pc-nw", NetworkArgs.builder()
 *             .name("pc-nw")
 *             .location("global")
 *             .type("STANDARD")
 *             .description("PC network description.")
 *             .build());
 * 
 *         var vmw_engine_pc = new PrivateCloud("vmw-engine-pc", PrivateCloudArgs.builder()
 *             .location("us-west1-a")
 *             .name("sample-pc")
 *             .description("Sample test PC.")
 *             .networkConfig(PrivateCloudNetworkConfigArgs.builder()
 *                 .managementCidr("192.168.30.0/24")
 *                 .vmwareEngineNetwork(pc_nw.id())
 *                 .build())
 *             .managementCluster(PrivateCloudManagementClusterArgs.builder()
 *                 .clusterId("sample-mgmt-cluster")
 *                 .nodeTypeConfigs(PrivateCloudManagementClusterNodeTypeConfigArgs.builder()
 *                     .nodeTypeId("standard-72")
 *                     .nodeCount(3)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Vmware Engine Private Cloud Full
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.vmwareengine.Network;
 * import com.pulumi.gcp.vmwareengine.NetworkArgs;
 * import com.pulumi.gcp.vmwareengine.PrivateCloud;
 * import com.pulumi.gcp.vmwareengine.PrivateCloudArgs;
 * import com.pulumi.gcp.vmwareengine.inputs.PrivateCloudNetworkConfigArgs;
 * import com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs;
 * import com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsArgs;
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
 *         var pc_nw = new Network("pc-nw", NetworkArgs.builder()
 *             .name("pc-nw")
 *             .location("global")
 *             .type("STANDARD")
 *             .description("PC network description.")
 *             .build());
 * 
 *         var vmw_engine_pc = new PrivateCloud("vmw-engine-pc", PrivateCloudArgs.builder()
 *             .location("us-west1-a")
 *             .name("sample-pc")
 *             .description("Sample test PC.")
 *             .type("TIME_LIMITED")
 *             .networkConfig(PrivateCloudNetworkConfigArgs.builder()
 *                 .managementCidr("192.168.30.0/24")
 *                 .vmwareEngineNetwork(pc_nw.id())
 *                 .build())
 *             .managementCluster(PrivateCloudManagementClusterArgs.builder()
 *                 .clusterId("sample-mgmt-cluster")
 *                 .nodeTypeConfigs(PrivateCloudManagementClusterNodeTypeConfigArgs.builder()
 *                     .nodeTypeId("standard-72")
 *                     .nodeCount(1)
 *                     .customCoreCount(32)
 *                     .build())
 *                 .autoscalingSettings(PrivateCloudManagementClusterAutoscalingSettingsArgs.builder()
 *                     .autoscalingPolicies(PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs.builder()
 *                         .autoscalePolicyId("autoscaling-policy")
 *                         .nodeTypeId("standard-72")
 *                         .scaleOutSize(1)
 *                         .cpuThresholds(PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyCpuThresholdsArgs.builder()
 *                             .scaleOut(80)
 *                             .scaleIn(15)
 *                             .build())
 *                         .consumedMemoryThresholds(PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholdsArgs.builder()
 *                             .scaleOut(75)
 *                             .scaleIn(20)
 *                             .build())
 *                         .storageThresholds(PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs.builder()
 *                             .scaleOut(80)
 *                             .scaleIn(20)
 *                             .build())
 *                         .build())
 *                     .minClusterNodeCount(3)
 *                     .maxClusterNodeCount(8)
 *                     .coolDownPeriod("1800s")
 *                     .build())
 *                 .build())
 *             .deletionDelayHours(0)
 *             .sendDeletionDelayHoursIfZero(true)
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
 * PrivateCloud can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/privateClouds/{{name}}`
 * 
 * * `{{project}}/{{location}}/{{name}}`
 * 
 * * `{{location}}/{{name}}`
 * 
 * When using the `pulumi import` command, PrivateCloud can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:vmwareengine/privateCloud:PrivateCloud default projects/{{project}}/locations/{{location}}/privateClouds/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:vmwareengine/privateCloud:PrivateCloud default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:vmwareengine/privateCloud:PrivateCloud default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:vmwareengine/privateCloud:PrivateCloud")
public class PrivateCloud extends com.pulumi.resources.CustomResource {
    /**
     * The number of hours to delay this request. You can set this value to an hour between 0 to 8, where setting it to 0 starts the deletion request immediately. If no value is set, a default value is set at the API Level.
     * 
     */
    @Export(name="deletionDelayHours", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> deletionDelayHours;

    /**
     * @return The number of hours to delay this request. You can set this value to an hour between 0 to 8, where setting it to 0 starts the deletion request immediately. If no value is set, a default value is set at the API Level.
     * 
     */
    public Output<Optional<Integer>> deletionDelayHours() {
        return Codegen.optional(this.deletionDelayHours);
    }
    /**
     * User-provided description for this private cloud.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return User-provided description for this private cloud.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Details about a HCX Cloud Manager appliance.
     * Structure is documented below.
     * 
     */
    @Export(name="hcxes", refs={List.class,PrivateCloudHcx.class}, tree="[0,1]")
    private Output<List<PrivateCloudHcx>> hcxes;

    /**
     * @return Details about a HCX Cloud Manager appliance.
     * Structure is documented below.
     * 
     */
    public Output<List<PrivateCloudHcx>> hcxes() {
        return this.hcxes;
    }
    /**
     * The location where the PrivateCloud should reside.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location where the PrivateCloud should reside.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The management cluster for this private cloud. This used for creating and managing the default cluster.
     * Structure is documented below.
     * 
     */
    @Export(name="managementCluster", refs={PrivateCloudManagementCluster.class}, tree="[0]")
    private Output<PrivateCloudManagementCluster> managementCluster;

    /**
     * @return The management cluster for this private cloud. This used for creating and managing the default cluster.
     * Structure is documented below.
     * 
     */
    public Output<PrivateCloudManagementCluster> managementCluster() {
        return this.managementCluster;
    }
    /**
     * The ID of the PrivateCloud.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The ID of the PrivateCloud.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Network configuration in the consumer project with which the peering has to be done.
     * Structure is documented below.
     * 
     */
    @Export(name="networkConfig", refs={PrivateCloudNetworkConfig.class}, tree="[0]")
    private Output<PrivateCloudNetworkConfig> networkConfig;

    /**
     * @return Network configuration in the consumer project with which the peering has to be done.
     * Structure is documented below.
     * 
     */
    public Output<PrivateCloudNetworkConfig> networkConfig() {
        return this.networkConfig;
    }
    /**
     * Details about a NSX Manager appliance.
     * Structure is documented below.
     * 
     */
    @Export(name="nsxes", refs={List.class,PrivateCloudNsx.class}, tree="[0,1]")
    private Output<List<PrivateCloudNsx>> nsxes;

    /**
     * @return Details about a NSX Manager appliance.
     * Structure is documented below.
     * 
     */
    public Output<List<PrivateCloudNsx>> nsxes() {
        return this.nsxes;
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
     * While set true, deletion_delay_hours value will be sent in the request even for zero value of the field. This field is only useful for setting 0 value to the deletion_delay_hours field. It can be used both alone and together with deletion_delay_hours.
     * 
     */
    @Export(name="sendDeletionDelayHoursIfZero", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> sendDeletionDelayHoursIfZero;

    /**
     * @return While set true, deletion_delay_hours value will be sent in the request even for zero value of the field. This field is only useful for setting 0 value to the deletion_delay_hours field. It can be used both alone and together with deletion_delay_hours.
     * 
     */
    public Output<Optional<Boolean>> sendDeletionDelayHoursIfZero() {
        return Codegen.optional(this.sendDeletionDelayHoursIfZero);
    }
    /**
     * State of the appliance.
     * Possible values are: `ACTIVE`, `CREATING`.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return State of the appliance.
     * Possible values are: `ACTIVE`, `CREATING`.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Initial type of the private cloud.
     * Possible values are: `STANDARD`, `TIME_LIMITED`, `STRETCHED`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return Initial type of the private cloud.
     * Possible values are: `STANDARD`, `TIME_LIMITED`, `STRETCHED`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * System-generated unique identifier for the resource.
     * 
     */
    @Export(name="uid", refs={String.class}, tree="[0]")
    private Output<String> uid;

    /**
     * @return System-generated unique identifier for the resource.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * Details about a vCenter Server management appliance.
     * Structure is documented below.
     * 
     */
    @Export(name="vcenters", refs={List.class,PrivateCloudVcenter.class}, tree="[0,1]")
    private Output<List<PrivateCloudVcenter>> vcenters;

    /**
     * @return Details about a vCenter Server management appliance.
     * Structure is documented below.
     * 
     */
    public Output<List<PrivateCloudVcenter>> vcenters() {
        return this.vcenters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateCloud(java.lang.String name) {
        this(name, PrivateCloudArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateCloud(java.lang.String name, PrivateCloudArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateCloud(java.lang.String name, PrivateCloudArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vmwareengine/privateCloud:PrivateCloud", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private PrivateCloud(java.lang.String name, Output<java.lang.String> id, @Nullable PrivateCloudState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vmwareengine/privateCloud:PrivateCloud", name, state, makeResourceOptions(options, id), false);
    }

    private static PrivateCloudArgs makeArgs(PrivateCloudArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PrivateCloudArgs.Empty : args;
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
    public static PrivateCloud get(java.lang.String name, Output<java.lang.String> id, @Nullable PrivateCloudState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateCloud(name, id, state, options);
    }
}
