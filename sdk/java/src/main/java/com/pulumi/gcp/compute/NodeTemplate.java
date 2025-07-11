// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.NodeTemplateArgs;
import com.pulumi.gcp.compute.inputs.NodeTemplateState;
import com.pulumi.gcp.compute.outputs.NodeTemplateAccelerator;
import com.pulumi.gcp.compute.outputs.NodeTemplateDisk;
import com.pulumi.gcp.compute.outputs.NodeTemplateNodeTypeFlexibility;
import com.pulumi.gcp.compute.outputs.NodeTemplateServerBinding;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a NodeTemplate resource. Node templates specify properties
 * for creating sole-tenant nodes, such as node type, vCPU and memory
 * requirements, node affinity labels, and region.
 * 
 * To get more information about NodeTemplate, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/nodeTemplates)
 * * How-to Guides
 *     * [Sole-Tenant Nodes](https://cloud.google.com/compute/docs/nodes/)
 * 
 * ## Example Usage
 * 
 * ### Node Template Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.NodeTemplate;
 * import com.pulumi.gcp.compute.NodeTemplateArgs;
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
 *         var template = new NodeTemplate("template", NodeTemplateArgs.builder()
 *             .name("soletenant-tmpl")
 *             .region("us-central1")
 *             .nodeType("n1-node-96-624")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Node Template Server Binding
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
 * import com.pulumi.gcp.compute.inputs.GetNodeTypesArgs;
 * import com.pulumi.gcp.compute.NodeTemplate;
 * import com.pulumi.gcp.compute.NodeTemplateArgs;
 * import com.pulumi.gcp.compute.inputs.NodeTemplateServerBindingArgs;
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
 *         final var central1a = ComputeFunctions.getNodeTypes(GetNodeTypesArgs.builder()
 *             .zone("us-central1-a")
 *             .build());
 * 
 *         var template = new NodeTemplate("template", NodeTemplateArgs.builder()
 *             .name("soletenant-with-licenses")
 *             .region("us-central1")
 *             .nodeType("n1-node-96-624")
 *             .nodeAffinityLabels(Map.of("foo", "baz"))
 *             .serverBinding(NodeTemplateServerBindingArgs.builder()
 *                 .type("RESTART_NODE_ON_MINIMAL_SERVERS")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Node Template Accelerators
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
 * import com.pulumi.gcp.compute.inputs.GetNodeTypesArgs;
 * import com.pulumi.gcp.compute.NodeTemplate;
 * import com.pulumi.gcp.compute.NodeTemplateArgs;
 * import com.pulumi.gcp.compute.inputs.NodeTemplateAcceleratorArgs;
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
 *         final var central1a = ComputeFunctions.getNodeTypes(GetNodeTypesArgs.builder()
 *             .zone("us-central1-a")
 *             .build());
 * 
 *         var template = new NodeTemplate("template", NodeTemplateArgs.builder()
 *             .name("soletenant-with-accelerators")
 *             .region("us-central1")
 *             .nodeType("n1-node-96-624")
 *             .accelerators(NodeTemplateAcceleratorArgs.builder()
 *                 .acceleratorType("nvidia-tesla-t4")
 *                 .acceleratorCount(4)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Node Template Disks
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
 * import com.pulumi.gcp.compute.inputs.GetNodeTypesArgs;
 * import com.pulumi.gcp.compute.NodeTemplate;
 * import com.pulumi.gcp.compute.NodeTemplateArgs;
 * import com.pulumi.gcp.compute.inputs.NodeTemplateDiskArgs;
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
 *         final var central1a = ComputeFunctions.getNodeTypes(GetNodeTypesArgs.builder()
 *             .zone("us-central1-a")
 *             .build());
 * 
 *         var template = new NodeTemplate("template", NodeTemplateArgs.builder()
 *             .name("soletenant-with-disks")
 *             .region("us-central1")
 *             .nodeType("n2-node-80-640")
 *             .disks(NodeTemplateDiskArgs.builder()
 *                 .diskCount(16)
 *                 .diskSizeGb(375)
 *                 .diskType("local-ssd")
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
 * NodeTemplate can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/regions/{{region}}/nodeTemplates/{{name}}`
 * 
 * * `{{project}}/{{region}}/{{name}}`
 * 
 * * `{{region}}/{{name}}`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, NodeTemplate can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:compute/nodeTemplate:NodeTemplate default projects/{{project}}/regions/{{region}}/nodeTemplates/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/nodeTemplate:NodeTemplate default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/nodeTemplate:NodeTemplate default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/nodeTemplate:NodeTemplate default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/nodeTemplate:NodeTemplate")
public class NodeTemplate extends com.pulumi.resources.CustomResource {
    /**
     * List of the type and count of accelerator cards attached to the
     * node template
     * Structure is documented below.
     * 
     */
    @Export(name="accelerators", refs={List.class,NodeTemplateAccelerator.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NodeTemplateAccelerator>> accelerators;

    /**
     * @return List of the type and count of accelerator cards attached to the
     * node template
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<NodeTemplateAccelerator>>> accelerators() {
        return Codegen.optional(this.accelerators);
    }
    /**
     * CPU overcommit.
     * Default value is `NONE`.
     * Possible values are: `ENABLED`, `NONE`.
     * 
     */
    @Export(name="cpuOvercommitType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cpuOvercommitType;

    /**
     * @return CPU overcommit.
     * Default value is `NONE`.
     * Possible values are: `ENABLED`, `NONE`.
     * 
     */
    public Output<Optional<String>> cpuOvercommitType() {
        return Codegen.optional(this.cpuOvercommitType);
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", refs={String.class}, tree="[0]")
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional textual description of the resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional textual description of the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * List of the type, size and count of disks attached to the
     * node template
     * Structure is documented below.
     * 
     */
    @Export(name="disks", refs={List.class,NodeTemplateDisk.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NodeTemplateDisk>> disks;

    /**
     * @return List of the type, size and count of disks attached to the
     * node template
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<NodeTemplateDisk>>> disks() {
        return Codegen.optional(this.disks);
    }
    /**
     * Name of the resource.
     * 
     * ***
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the resource.
     * 
     * ***
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Labels to use for node affinity, which will be used in
     * instance scheduling.
     * 
     */
    @Export(name="nodeAffinityLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> nodeAffinityLabels;

    /**
     * @return Labels to use for node affinity, which will be used in
     * instance scheduling.
     * 
     */
    public Output<Optional<Map<String,String>>> nodeAffinityLabels() {
        return Codegen.optional(this.nodeAffinityLabels);
    }
    /**
     * Node type to use for nodes group that are created from this template.
     * Only one of nodeTypeFlexibility and nodeType can be specified.
     * 
     */
    @Export(name="nodeType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> nodeType;

    /**
     * @return Node type to use for nodes group that are created from this template.
     * Only one of nodeTypeFlexibility and nodeType can be specified.
     * 
     */
    public Output<Optional<String>> nodeType() {
        return Codegen.optional(this.nodeType);
    }
    /**
     * Flexible properties for the desired node type. Node groups that
     * use this node template will create nodes of a type that matches
     * these properties. Only one of nodeTypeFlexibility and nodeType can
     * be specified.
     * Structure is documented below.
     * 
     */
    @Export(name="nodeTypeFlexibility", refs={NodeTemplateNodeTypeFlexibility.class}, tree="[0]")
    private Output</* @Nullable */ NodeTemplateNodeTypeFlexibility> nodeTypeFlexibility;

    /**
     * @return Flexible properties for the desired node type. Node groups that
     * use this node template will create nodes of a type that matches
     * these properties. Only one of nodeTypeFlexibility and nodeType can
     * be specified.
     * Structure is documented below.
     * 
     */
    public Output<Optional<NodeTemplateNodeTypeFlexibility>> nodeTypeFlexibility() {
        return Codegen.optional(this.nodeTypeFlexibility);
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
     * Region where nodes using the node template will be created.
     * If it is not provided, the provider region is used.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return Region where nodes using the node template will be created.
     * If it is not provided, the provider region is used.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", refs={String.class}, tree="[0]")
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * The server binding policy for nodes using this template. Determines
     * where the nodes should restart following a maintenance event.
     * Structure is documented below.
     * 
     */
    @Export(name="serverBinding", refs={NodeTemplateServerBinding.class}, tree="[0]")
    private Output<NodeTemplateServerBinding> serverBinding;

    /**
     * @return The server binding policy for nodes using this template. Determines
     * where the nodes should restart following a maintenance event.
     * Structure is documented below.
     * 
     */
    public Output<NodeTemplateServerBinding> serverBinding() {
        return this.serverBinding;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NodeTemplate(java.lang.String name) {
        this(name, NodeTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NodeTemplate(java.lang.String name, @Nullable NodeTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NodeTemplate(java.lang.String name, @Nullable NodeTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/nodeTemplate:NodeTemplate", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NodeTemplate(java.lang.String name, Output<java.lang.String> id, @Nullable NodeTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/nodeTemplate:NodeTemplate", name, state, makeResourceOptions(options, id), false);
    }

    private static NodeTemplateArgs makeArgs(@Nullable NodeTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NodeTemplateArgs.Empty : args;
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
    public static NodeTemplate get(java.lang.String name, Output<java.lang.String> id, @Nullable NodeTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NodeTemplate(name, id, state, options);
    }
}
