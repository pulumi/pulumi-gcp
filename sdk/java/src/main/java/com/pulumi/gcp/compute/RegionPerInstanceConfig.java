// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.RegionPerInstanceConfigArgs;
import com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigState;
import com.pulumi.gcp.compute.outputs.RegionPerInstanceConfigPreservedState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A config defined for a single managed instance that belongs to an instance group manager. It preserves the instance name
 * across instance group manager operations and can define stateful disks or metadata that are unique to the instance.
 * This resource works with regional instance group managers.
 * 
 * To get more information about RegionPerInstanceConfig, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/instanceGroupManagers)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/instance-groups/stateful-migs#per-instance_configs)
 * 
 * ## Example Usage
 * 
 * ### Stateful Rigm
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.ComputeFunctions;
 * import com.pulumi.gcp.compute.inputs.GetImageArgs;
 * import com.pulumi.gcp.compute.InstanceTemplate;
 * import com.pulumi.gcp.compute.InstanceTemplateArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceTemplateDiskArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceTemplateServiceAccountArgs;
 * import com.pulumi.gcp.compute.RegionInstanceGroupManager;
 * import com.pulumi.gcp.compute.RegionInstanceGroupManagerArgs;
 * import com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerVersionArgs;
 * import com.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerUpdatePolicyArgs;
 * import com.pulumi.gcp.compute.Disk;
 * import com.pulumi.gcp.compute.DiskArgs;
 * import com.pulumi.gcp.compute.RegionPerInstanceConfig;
 * import com.pulumi.gcp.compute.RegionPerInstanceConfigArgs;
 * import com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateArgs;
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
 *         final var myImage = ComputeFunctions.getImage(GetImageArgs.builder()
 *             .family("debian-11")
 *             .project("debian-cloud")
 *             .build());
 * 
 *         var igm_basic = new InstanceTemplate("igm-basic", InstanceTemplateArgs.builder()
 *             .name("my-template")
 *             .machineType("e2-medium")
 *             .canIpForward(false)
 *             .tags(            
 *                 "foo",
 *                 "bar")
 *             .disks(InstanceTemplateDiskArgs.builder()
 *                 .sourceImage(myImage.selfLink())
 *                 .autoDelete(true)
 *                 .boot(true)
 *                 .build())
 *             .networkInterfaces(InstanceTemplateNetworkInterfaceArgs.builder()
 *                 .network("default")
 *                 .build())
 *             .serviceAccount(InstanceTemplateServiceAccountArgs.builder()
 *                 .scopes(                
 *                     "userinfo-email",
 *                     "compute-ro",
 *                     "storage-ro")
 *                 .build())
 *             .build());
 * 
 *         var rigm = new RegionInstanceGroupManager("rigm", RegionInstanceGroupManagerArgs.builder()
 *             .description("Demo test instance group manager")
 *             .name("my-rigm")
 *             .versions(RegionInstanceGroupManagerVersionArgs.builder()
 *                 .name("prod")
 *                 .instanceTemplate(igm_basic.selfLink())
 *                 .build())
 *             .updatePolicy(RegionInstanceGroupManagerUpdatePolicyArgs.builder()
 *                 .type("OPPORTUNISTIC")
 *                 .instanceRedistributionType("NONE")
 *                 .minimalAction("RESTART")
 *                 .build())
 *             .baseInstanceName("rigm")
 *             .region("us-central1")
 *             .targetSize(2)
 *             .build());
 * 
 *         var default_ = new Disk("default", DiskArgs.builder()
 *             .name("my-disk-name")
 *             .type("pd-ssd")
 *             .zone("us-central1-a")
 *             .image("debian-11-bullseye-v20220719")
 *             .physicalBlockSizeBytes(4096)
 *             .build());
 * 
 *         var withDisk = new RegionPerInstanceConfig("withDisk", RegionPerInstanceConfigArgs.builder()
 *             .region(igm.region())
 *             .regionInstanceGroupManager(rigm.name())
 *             .name("instance-1")
 *             .preservedState(RegionPerInstanceConfigPreservedStateArgs.builder()
 *                 .metadata(Map.ofEntries(
 *                     Map.entry("foo", "bar"),
 *                     Map.entry("instance_template", igm_basic.selfLink())
 *                 ))
 *                 .disks(RegionPerInstanceConfigPreservedStateDiskArgs.builder()
 *                     .deviceName("my-stateful-disk")
 *                     .source(default_.id())
 *                     .mode("READ_ONLY")
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
 * RegionPerInstanceConfig can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/regions/{{region}}/instanceGroupManagers/{{region_instance_group_manager}}/{{name}}`
 * 
 * * `{{project}}/{{region}}/{{region_instance_group_manager}}/{{name}}`
 * 
 * * `{{region}}/{{region_instance_group_manager}}/{{name}}`
 * 
 * * `{{region_instance_group_manager}}/{{name}}`
 * 
 * When using the `pulumi import` command, RegionPerInstanceConfig can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionPerInstanceConfig:RegionPerInstanceConfig default projects/{{project}}/regions/{{region}}/instanceGroupManagers/{{region_instance_group_manager}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionPerInstanceConfig:RegionPerInstanceConfig default {{project}}/{{region}}/{{region_instance_group_manager}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionPerInstanceConfig:RegionPerInstanceConfig default {{region}}/{{region_instance_group_manager}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionPerInstanceConfig:RegionPerInstanceConfig default {{region_instance_group_manager}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionPerInstanceConfig:RegionPerInstanceConfig")
public class RegionPerInstanceConfig extends com.pulumi.resources.CustomResource {
    /**
     * The minimal action to perform on the instance during an update.
     * Default is `NONE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    @Export(name="minimalAction", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> minimalAction;

    /**
     * @return The minimal action to perform on the instance during an update.
     * Default is `NONE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    public Output<Optional<String>> minimalAction() {
        return Codegen.optional(this.minimalAction);
    }
    /**
     * The most disruptive action to perform on the instance during an update.
     * Default is `REPLACE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    @Export(name="mostDisruptiveAllowedAction", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mostDisruptiveAllowedAction;

    /**
     * @return The most disruptive action to perform on the instance during an update.
     * Default is `REPLACE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    public Output<Optional<String>> mostDisruptiveAllowedAction() {
        return Codegen.optional(this.mostDisruptiveAllowedAction);
    }
    /**
     * The name for this per-instance config and its corresponding instance.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for this per-instance config and its corresponding instance.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The preserved state for this instance.
     * Structure is documented below.
     * 
     */
    @Export(name="preservedState", refs={RegionPerInstanceConfigPreservedState.class}, tree="[0]")
    private Output</* @Nullable */ RegionPerInstanceConfigPreservedState> preservedState;

    /**
     * @return The preserved state for this instance.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RegionPerInstanceConfigPreservedState>> preservedState() {
        return Codegen.optional(this.preservedState);
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
     * Region where the containing instance group manager is located
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return Region where the containing instance group manager is located
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The region instance group manager this instance config is part of.
     * 
     */
    @Export(name="regionInstanceGroupManager", refs={String.class}, tree="[0]")
    private Output<String> regionInstanceGroupManager;

    /**
     * @return The region instance group manager this instance config is part of.
     * 
     */
    public Output<String> regionInstanceGroupManager() {
        return this.regionInstanceGroupManager;
    }
    /**
     * When true, deleting this config will immediately remove the underlying instance.
     * When false, deleting this config will use the behavior as determined by remove_instance_on_destroy.
     * 
     */
    @Export(name="removeInstanceOnDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> removeInstanceOnDestroy;

    /**
     * @return When true, deleting this config will immediately remove the underlying instance.
     * When false, deleting this config will use the behavior as determined by remove_instance_on_destroy.
     * 
     */
    public Output<Optional<Boolean>> removeInstanceOnDestroy() {
        return Codegen.optional(this.removeInstanceOnDestroy);
    }
    /**
     * When true, deleting this config will immediately remove any specified state from the underlying instance.
     * When false, deleting this config will *not* immediately remove any state from the underlying instance.
     * State will be removed on the next instance recreation or update.
     * 
     */
    @Export(name="removeInstanceStateOnDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> removeInstanceStateOnDestroy;

    /**
     * @return When true, deleting this config will immediately remove any specified state from the underlying instance.
     * When false, deleting this config will *not* immediately remove any state from the underlying instance.
     * State will be removed on the next instance recreation or update.
     * 
     */
    public Output<Optional<Boolean>> removeInstanceStateOnDestroy() {
        return Codegen.optional(this.removeInstanceStateOnDestroy);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionPerInstanceConfig(java.lang.String name) {
        this(name, RegionPerInstanceConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionPerInstanceConfig(java.lang.String name, RegionPerInstanceConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionPerInstanceConfig(java.lang.String name, RegionPerInstanceConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionPerInstanceConfig:RegionPerInstanceConfig", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RegionPerInstanceConfig(java.lang.String name, Output<java.lang.String> id, @Nullable RegionPerInstanceConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionPerInstanceConfig:RegionPerInstanceConfig", name, state, makeResourceOptions(options, id), false);
    }

    private static RegionPerInstanceConfigArgs makeArgs(RegionPerInstanceConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RegionPerInstanceConfigArgs.Empty : args;
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
    public static RegionPerInstanceConfig get(java.lang.String name, Output<java.lang.String> id, @Nullable RegionPerInstanceConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegionPerInstanceConfig(name, id, state, options);
    }
}
