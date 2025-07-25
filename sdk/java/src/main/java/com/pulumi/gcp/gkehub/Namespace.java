// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.gkehub.NamespaceArgs;
import com.pulumi.gcp.gkehub.outputs.NamespaceState;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Namespace represents a namespace across the Fleet.
 * 
 * To get more information about Namespace, see:
 * 
 * * [API documentation](https://cloud.google.com/anthos/fleet-management/docs/reference/rest/v1/projects.locations.scopes.namespaces)
 * * How-to Guides
 *     * [Registering a Cluster](https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster#register_cluster)
 * 
 * ## Example Usage
 * 
 * ### Gkehub Namespace Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.gkehub.Scope;
 * import com.pulumi.gcp.gkehub.ScopeArgs;
 * import com.pulumi.gcp.gkehub.Namespace;
 * import com.pulumi.gcp.gkehub.NamespaceArgs;
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
 *         var scope = new Scope("scope", ScopeArgs.builder()
 *             .scopeId("tf-test-scope_40289")
 *             .build());
 * 
 *         var namespace = new Namespace("namespace", NamespaceArgs.builder()
 *             .scopeNamespaceId("tf-test-namespace_33395")
 *             .scopeId(scope.scopeId())
 *             .scope(scope.name())
 *             .namespaceLabels(Map.ofEntries(
 *                 Map.entry("keyb", "valueb"),
 *                 Map.entry("keya", "valuea"),
 *                 Map.entry("keyc", "valuec")
 *             ))
 *             .labels(Map.ofEntries(
 *                 Map.entry("keyb", "valueb"),
 *                 Map.entry("keya", "valuea"),
 *                 Map.entry("keyc", "valuec")
 *             ))
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(scope)
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
 * Namespace can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/global/scopes/{{scope_id}}/namespaces/{{scope_namespace_id}}`
 * 
 * * `{{project}}/{{scope_id}}/{{scope_namespace_id}}`
 * 
 * * `{{scope_id}}/{{scope_namespace_id}}`
 * 
 * When using the `pulumi import` command, Namespace can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:gkehub/namespace:Namespace default projects/{{project}}/locations/global/scopes/{{scope_id}}/namespaces/{{scope_namespace_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:gkehub/namespace:Namespace default {{project}}/{{scope_id}}/{{scope_namespace_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:gkehub/namespace:Namespace default {{scope_id}}/{{scope_namespace_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:gkehub/namespace:Namespace")
public class Namespace extends com.pulumi.resources.CustomResource {
    /**
     * Time the Namespace was created in UTC.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Time the Namespace was created in UTC.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Time the Namespace was deleted in UTC.
     * 
     */
    @Export(name="deleteTime", refs={String.class}, tree="[0]")
    private Output<String> deleteTime;

    /**
     * @return Time the Namespace was deleted in UTC.
     * 
     */
    public Output<String> deleteTime() {
        return this.deleteTime;
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
     * Labels for this Namespace.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels for this Namespace.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The resource name for the namespace
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name for the namespace
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Namespace-level cluster namespace labels. These labels are applied
     * to the related namespace of the member clusters bound to the parent
     * Scope. Scope-level labels (`namespace_labels` in the Fleet Scope
     * resource) take precedence over Namespace-level labels if they share
     * a key. Keys and values must be Kubernetes-conformant.
     * 
     */
    @Export(name="namespaceLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> namespaceLabels;

    /**
     * @return Namespace-level cluster namespace labels. These labels are applied
     * to the related namespace of the member clusters bound to the parent
     * Scope. Scope-level labels (`namespace_labels` in the Fleet Scope
     * resource) take precedence over Namespace-level labels if they share
     * a key. Keys and values must be Kubernetes-conformant.
     * 
     */
    public Output<Optional<Map<String,String>>> namespaceLabels() {
        return Codegen.optional(this.namespaceLabels);
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
     * The name of the Scope instance.
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output<String> scope;

    /**
     * @return The name of the Scope instance.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }
    /**
     * Id of the scope
     * 
     */
    @Export(name="scopeId", refs={String.class}, tree="[0]")
    private Output<String> scopeId;

    /**
     * @return Id of the scope
     * 
     */
    public Output<String> scopeId() {
        return this.scopeId;
    }
    /**
     * The client-provided identifier of the namespace.
     * 
     */
    @Export(name="scopeNamespaceId", refs={String.class}, tree="[0]")
    private Output<String> scopeNamespaceId;

    /**
     * @return The client-provided identifier of the namespace.
     * 
     */
    public Output<String> scopeNamespaceId() {
        return this.scopeNamespaceId;
    }
    /**
     * State of the namespace resource.
     * Structure is documented below.
     * 
     */
    @Export(name="states", refs={List.class,NamespaceState.class}, tree="[0,1]")
    private Output<List<NamespaceState>> states;

    /**
     * @return State of the namespace resource.
     * Structure is documented below.
     * 
     */
    public Output<List<NamespaceState>> states() {
        return this.states;
    }
    /**
     * Google-generated UUID for this resource.
     * 
     */
    @Export(name="uid", refs={String.class}, tree="[0]")
    private Output<String> uid;

    /**
     * @return Google-generated UUID for this resource.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * Time the Namespace was updated in UTC.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return Time the Namespace was updated in UTC.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Namespace(java.lang.String name) {
        this(name, NamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Namespace(java.lang.String name, NamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Namespace(java.lang.String name, NamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gkehub/namespace:Namespace", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Namespace(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.gcp.gkehub.inputs.NamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gkehub/namespace:Namespace", name, state, makeResourceOptions(options, id), false);
    }

    private static NamespaceArgs makeArgs(NamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NamespaceArgs.Empty : args;
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
    public static Namespace get(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.gcp.gkehub.inputs.NamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Namespace(name, id, state, options);
    }
}
