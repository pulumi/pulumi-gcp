// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.ProjectMetadataArgs;
import com.pulumi.gcp.compute.inputs.ProjectMetadataState;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Authoritatively manages metadata common to all instances for a project in GCE. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/storing-retrieving-metadata)
 * and
 * [API](https://cloud.google.com/compute/docs/reference/latest/projects/setCommonInstanceMetadata).
 * 
 * &gt; **Note:**  This resource manages all project-level metadata including project-level ssh keys.
 * Keys unset in config but set on the server will be removed. If you want to manage only single
 * key/value pairs within the project metadata rather than the entire set, then use
 * google_compute_project_metadata_item.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var default_ = new ProjectMetadata(&#34;default&#34;, ProjectMetadataArgs.builder()        
 *             .metadata(Map.ofEntries(
 *                 Map.entry(&#34;13&#34;, &#34;42&#34;),
 *                 Map.entry(&#34;fizz&#34;, &#34;buzz&#34;),
 *                 Map.entry(&#34;foo&#34;, &#34;bar&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Adding An SSH Key
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var mySshKey = new ProjectMetadata(&#34;mySshKey&#34;, ProjectMetadataArgs.builder()        
 *             .metadata(Map.of(&#34;ssh-keys&#34;, &#34;&#34;&#34;
 *       dev:ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAILg6UtHDNyMNAh0GjaytsJdrUxjtLy3APXqZfNZhvCeT dev
 *       foo:ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAILg6UtHDNyMNAh0GjaytsJdrUxjtLy3APXqZfNZhvCeT bar
 *     
 *             &#34;&#34;&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported using the project ID
 * 
 * ```sh
 *  $ pulumi import gcp:compute/projectMetadata:ProjectMetadata foo my-project-id`
 * ```
 * 
 */
@ResourceType(type="gcp:compute/projectMetadata:ProjectMetadata")
public class ProjectMetadata extends com.pulumi.resources.CustomResource {
    /**
     * A series of key value pairs.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> metadata;

    /**
     * @return A series of key value pairs.
     * 
     */
    public Output<Map<String,String>> metadata() {
        return this.metadata;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProjectMetadata(String name) {
        this(name, ProjectMetadataArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProjectMetadata(String name, ProjectMetadataArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectMetadata(String name, ProjectMetadataArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/projectMetadata:ProjectMetadata", name, args == null ? ProjectMetadataArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProjectMetadata(String name, Output<String> id, @Nullable ProjectMetadataState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/projectMetadata:ProjectMetadata", name, state, makeResourceOptions(options, id));
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
    public static ProjectMetadata get(String name, Output<String> id, @Nullable ProjectMetadataState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProjectMetadata(name, id, state, options);
    }
}