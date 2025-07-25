// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.resourcemanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.resourcemanager.CapabilityArgs;
import com.pulumi.gcp.resourcemanager.inputs.CapabilityState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Resource Manager Capability
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.Folder;
 * import com.pulumi.gcp.organizations.FolderArgs;
 * import com.pulumi.time.sleep;
 * import com.pulumi.time.sleepArgs;
 * import com.pulumi.gcp.resourcemanager.Capability;
 * import com.pulumi.gcp.resourcemanager.CapabilityArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var folder = new Folder("folder", FolderArgs.builder()
 *             .displayName("my-folder")
 *             .parent("organizations/123456789")
 *             .deletionProtection(false)
 *             .build());
 * 
 *         var wait60s = new Sleep("wait60s", SleepArgs.builder()
 *             .createDuration("60s")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(List.of(folder))
 *                 .build());
 * 
 *         var capability = new Capability("capability", CapabilityArgs.builder()
 *             .value(true)
 *             .parent(folder.name())
 *             .capabilityName("app-management")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(wait60s)
 *                 .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Capability can be imported using any of these accepted formats:
 * 
 * * `{{parent}}/capabilities/{{capability_name}}`
 * 
 * * `{{parent}}/{{capability_name}}`
 * 
 * When using the `pulumi import` command, Capability can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:resourcemanager/capability:Capability default {{parent}}/capabilities/{{capability_name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:resourcemanager/capability:Capability default {{parent}}/{{capability_name}}
 * ```
 * 
 */
@ResourceType(type="gcp:resourcemanager/capability:Capability")
public class Capability extends com.pulumi.resources.CustomResource {
    /**
     * Capability name that should be updated on the folder.
     * 
     */
    @Export(name="capabilityName", refs={String.class}, tree="[0]")
    private Output<String> capabilityName;

    /**
     * @return Capability name that should be updated on the folder.
     * 
     */
    public Output<String> capabilityName() {
        return this.capabilityName;
    }
    /**
     * Folder on which Capability needs to be updated in the format folders/folder_id.
     * 
     */
    @Export(name="parent", refs={String.class}, tree="[0]")
    private Output<String> parent;

    /**
     * @return Folder on which Capability needs to be updated in the format folders/folder_id.
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }
    /**
     * Capability Value.
     * 
     */
    @Export(name="value", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> value;

    /**
     * @return Capability Value.
     * 
     */
    public Output<Boolean> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Capability(java.lang.String name) {
        this(name, CapabilityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Capability(java.lang.String name, CapabilityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Capability(java.lang.String name, CapabilityArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:resourcemanager/capability:Capability", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Capability(java.lang.String name, Output<java.lang.String> id, @Nullable CapabilityState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:resourcemanager/capability:Capability", name, state, makeResourceOptions(options, id), false);
    }

    private static CapabilityArgs makeArgs(CapabilityArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CapabilityArgs.Empty : args;
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
    public static Capability get(java.lang.String name, Output<java.lang.String> id, @Nullable CapabilityState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Capability(name, id, state, options);
    }
}
