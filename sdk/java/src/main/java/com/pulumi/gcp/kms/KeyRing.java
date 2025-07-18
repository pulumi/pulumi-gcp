// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.kms.KeyRingArgs;
import com.pulumi.gcp.kms.inputs.KeyRingState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A `KeyRing` is a toplevel logical grouping of `CryptoKeys`.
 * 
 * &gt; **Note:** KeyRings cannot be deleted from Google Cloud Platform.
 * Destroying a provider-managed KeyRing will remove it from state but
 * *will not delete the resource from the project.*
 * 
 * To get more information about KeyRing, see:
 * 
 * * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings)
 * * How-to Guides
 *     * [Creating a key ring](https://cloud.google.com/kms/docs/creating-keys#create_a_key_ring)
 * 
 * ## Example Usage
 * 
 * ### Kms Key Ring Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.kms.KeyRing;
 * import com.pulumi.gcp.kms.KeyRingArgs;
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
 *         var example_keyring = new KeyRing("example-keyring", KeyRingArgs.builder()
 *             .name("keyring-example")
 *             .location("global")
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
 * KeyRing can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/keyRings/{{name}}`
 * 
 * * `{{project}}/{{location}}/{{name}}`
 * 
 * * `{{location}}/{{name}}`
 * 
 * When using the `pulumi import` command, KeyRing can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:kms/keyRing:KeyRing default projects/{{project}}/locations/{{location}}/keyRings/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:kms/keyRing:KeyRing default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:kms/keyRing:KeyRing default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:kms/keyRing:KeyRing")
public class KeyRing extends com.pulumi.resources.CustomResource {
    /**
     * The location for the KeyRing.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location for the KeyRing.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name for the KeyRing.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name for the KeyRing.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KeyRing(java.lang.String name) {
        this(name, KeyRingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KeyRing(java.lang.String name, KeyRingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KeyRing(java.lang.String name, KeyRingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/keyRing:KeyRing", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private KeyRing(java.lang.String name, Output<java.lang.String> id, @Nullable KeyRingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/keyRing:KeyRing", name, state, makeResourceOptions(options, id), false);
    }

    private static KeyRingArgs makeArgs(KeyRingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? KeyRingArgs.Empty : args;
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
    public static KeyRing get(java.lang.String name, Output<java.lang.String> id, @Nullable KeyRingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KeyRing(name, id, state, options);
    }
}
