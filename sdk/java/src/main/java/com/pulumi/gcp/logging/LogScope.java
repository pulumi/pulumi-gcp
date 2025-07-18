// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.logging.LogScopeArgs;
import com.pulumi.gcp.logging.inputs.LogScopeState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Describes a group of resources to read log entries from
 * 
 * To get more information about LogScope, see:
 * 
 * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.locations.logScopes)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/logging/docs/apis)
 * 
 * ## Example Usage
 * 
 * ### Logging Log Scope Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.logging.LogScope;
 * import com.pulumi.gcp.logging.LogScopeArgs;
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
 *         var loggingLogScope = new LogScope("loggingLogScope", LogScopeArgs.builder()
 *             .parent("projects/my-project-name")
 *             .location("global")
 *             .name("projects/my-project-name/locations/global/logScopes/my-log-scope")
 *             .resourceNames(            
 *                 "projects/my-project-name",
 *                 "projects/my-project-name/locations/global/buckets/_Default/views/view1",
 *                 "projects/my-project-name/locations/global/buckets/_Default/views/view2")
 *             .description("A log scope configured with Terraform")
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
 * LogScope can be imported using any of these accepted formats:
 * 
 * * `{{parent}}/locations/{{location}}/logScopes/{{name}}`
 * 
 * When using the `pulumi import` command, LogScope can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:logging/logScope:LogScope default {{parent}}/locations/{{location}}/logScopes/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:logging/logScope:LogScope")
public class LogScope extends com.pulumi.resources.CustomResource {
    /**
     * Output only. The creation timestamp of the log scopes.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Output only. The creation timestamp of the log scopes.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Describes this log scopes.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Describes this log scopes.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The location of the resource. The only supported location is global so far.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location of the resource. The only supported location is global so far.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name of the log scope. For example: \`projects/my-project/locations/global/logScopes/my-log-scope\`
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name of the log scope. For example: \`projects/my-project/locations/global/logScopes/my-log-scope\`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The parent of the resource.
     * 
     */
    @Export(name="parent", refs={String.class}, tree="[0]")
    private Output<String> parent;

    /**
     * @return The parent of the resource.
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }
    /**
     * Names of one or more parent resources : *  \`projects/[PROJECT_ID]\` May alternatively be one or more views : * \`projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]\` A log scope can include a maximum of 50 projects and a maximum of 100 resources in total.
     * 
     */
    @Export(name="resourceNames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> resourceNames;

    /**
     * @return Names of one or more parent resources : *  \`projects/[PROJECT_ID]\` May alternatively be one or more views : * \`projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]\` A log scope can include a maximum of 50 projects and a maximum of 100 resources in total.
     * 
     */
    public Output<List<String>> resourceNames() {
        return this.resourceNames;
    }
    /**
     * Output only. The last update timestamp of the log scopes.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return Output only. The last update timestamp of the log scopes.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogScope(java.lang.String name) {
        this(name, LogScopeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogScope(java.lang.String name, LogScopeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogScope(java.lang.String name, LogScopeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/logScope:LogScope", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LogScope(java.lang.String name, Output<java.lang.String> id, @Nullable LogScopeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/logScope:LogScope", name, state, makeResourceOptions(options, id), false);
    }

    private static LogScopeArgs makeArgs(LogScopeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LogScopeArgs.Empty : args;
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
    public static LogScope get(java.lang.String name, Output<java.lang.String> id, @Nullable LogScopeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogScope(name, id, state, options);
    }
}
