// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.storage.ControlFolderIntelligenceConfigArgs;
import com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigState;
import com.pulumi.gcp.storage.outputs.ControlFolderIntelligenceConfigEffectiveIntelligenceConfig;
import com.pulumi.gcp.storage.outputs.ControlFolderIntelligenceConfigFilter;
import com.pulumi.gcp.storage.outputs.ControlFolderIntelligenceConfigTrialConfig;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Storage Control Folder Intelligence Config Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.storage.ControlFolderIntelligenceConfig;
 * import com.pulumi.gcp.storage.ControlFolderIntelligenceConfigArgs;
 * import com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs;
 * import com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterIncludedCloudStorageBucketsArgs;
 * import com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterExcludedCloudStorageLocationsArgs;
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
 *         var example = new ControlFolderIntelligenceConfig("example", ControlFolderIntelligenceConfigArgs.builder()
 *             .name("12345678")
 *             .editionConfig("STANDARD")
 *             .filter(ControlFolderIntelligenceConfigFilterArgs.builder()
 *                 .includedCloudStorageBuckets(ControlFolderIntelligenceConfigFilterIncludedCloudStorageBucketsArgs.builder()
 *                     .bucketIdRegexes(                    
 *                         "test-id-1*",
 *                         "test-id-2*")
 *                     .build())
 *                 .excludedCloudStorageLocations(ControlFolderIntelligenceConfigFilterExcludedCloudStorageLocationsArgs.builder()
 *                     .locations(                    
 *                         "test-location-1*",
 *                         "test-locations-2*")
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
 * FolderIntelligenceConfig can be imported using any of these accepted formats:
 * 
 * * `folders/{{name}}/locations/global/intelligenceConfig`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, FolderIntelligenceConfig can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:storage/controlFolderIntelligenceConfig:ControlFolderIntelligenceConfig default folders/{{name}}/locations/global/intelligenceConfig
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:storage/controlFolderIntelligenceConfig:ControlFolderIntelligenceConfig default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:storage/controlFolderIntelligenceConfig:ControlFolderIntelligenceConfig")
public class ControlFolderIntelligenceConfig extends com.pulumi.resources.CustomResource {
    /**
     * Edition configuration of the Storage Intelligence resource. Valid values are INHERIT, TRIAL, DISABLED and STANDARD.
     * 
     */
    @Export(name="editionConfig", refs={String.class}, tree="[0]")
    private Output<String> editionConfig;

    /**
     * @return Edition configuration of the Storage Intelligence resource. Valid values are INHERIT, TRIAL, DISABLED and STANDARD.
     * 
     */
    public Output<String> editionConfig() {
        return this.editionConfig;
    }
    /**
     * The Intelligence config that is effective for the resource.
     * Structure is documented below.
     * 
     */
    @Export(name="effectiveIntelligenceConfigs", refs={List.class,ControlFolderIntelligenceConfigEffectiveIntelligenceConfig.class}, tree="[0,1]")
    private Output<List<ControlFolderIntelligenceConfigEffectiveIntelligenceConfig>> effectiveIntelligenceConfigs;

    /**
     * @return The Intelligence config that is effective for the resource.
     * Structure is documented below.
     * 
     */
    public Output<List<ControlFolderIntelligenceConfigEffectiveIntelligenceConfig>> effectiveIntelligenceConfigs() {
        return this.effectiveIntelligenceConfigs;
    }
    /**
     * Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    @Export(name="filter", refs={ControlFolderIntelligenceConfigFilter.class}, tree="[0]")
    private Output</* @Nullable */ ControlFolderIntelligenceConfigFilter> filter;

    /**
     * @return Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ControlFolderIntelligenceConfigFilter>> filter() {
        return Codegen.optional(this.filter);
    }
    /**
     * Identifier of the GCP Folder. For GCP Folder, this field can be folder number.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Identifier of the GCP Folder. For GCP Folder, this field can be folder number.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The trial configuration of the Storage Intelligence resource.
     * Structure is documented below.
     * 
     */
    @Export(name="trialConfigs", refs={List.class,ControlFolderIntelligenceConfigTrialConfig.class}, tree="[0,1]")
    private Output<List<ControlFolderIntelligenceConfigTrialConfig>> trialConfigs;

    /**
     * @return The trial configuration of the Storage Intelligence resource.
     * Structure is documented below.
     * 
     */
    public Output<List<ControlFolderIntelligenceConfigTrialConfig>> trialConfigs() {
        return this.trialConfigs;
    }
    /**
     * The time at which the Storage Intelligence Config resource is last updated.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return The time at which the Storage Intelligence Config resource is last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ControlFolderIntelligenceConfig(java.lang.String name) {
        this(name, ControlFolderIntelligenceConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ControlFolderIntelligenceConfig(java.lang.String name, @Nullable ControlFolderIntelligenceConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ControlFolderIntelligenceConfig(java.lang.String name, @Nullable ControlFolderIntelligenceConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/controlFolderIntelligenceConfig:ControlFolderIntelligenceConfig", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ControlFolderIntelligenceConfig(java.lang.String name, Output<java.lang.String> id, @Nullable ControlFolderIntelligenceConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/controlFolderIntelligenceConfig:ControlFolderIntelligenceConfig", name, state, makeResourceOptions(options, id), false);
    }

    private static ControlFolderIntelligenceConfigArgs makeArgs(@Nullable ControlFolderIntelligenceConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ControlFolderIntelligenceConfigArgs.Empty : args;
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
    public static ControlFolderIntelligenceConfig get(java.lang.String name, Output<java.lang.String> id, @Nullable ControlFolderIntelligenceConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ControlFolderIntelligenceConfig(name, id, state, options);
    }
}
