// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.serviceusage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.serviceusage.ConsumerQuotaOverrideArgs;
import com.pulumi.gcp.serviceusage.inputs.ConsumerQuotaOverrideState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A consumer override is applied to the consumer on its own authority to limit its own quota usage.
 * Consumer overrides cannot be used to grant more quota than would be allowed by admin overrides,
 * producer overrides, or the default limit of the service.
 * 
 * To get more information about ConsumerQuotaOverride, see:
 * * How-to Guides
 *     * [Managing Service Quota](https://cloud.google.com/service-usage/docs/manage-quota)
 *     * [REST API documentation](https://cloud.google.com/service-usage/docs/reference/rest/v1beta1/services.consumerQuotaMetrics.limits.consumerOverrides)
 * 
 * ## Example Usage
 * 
 * ### Consumer Quota Override
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.Project;
 * import com.pulumi.gcp.organizations.ProjectArgs;
 * import com.pulumi.gcp.serviceusage.ConsumerQuotaOverride;
 * import com.pulumi.gcp.serviceusage.ConsumerQuotaOverrideArgs;
 * import com.pulumi.std.StdFunctions;
 * import com.pulumi.std.inputs.UrlencodeArgs;
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
 *         var myProject = new Project("myProject", ProjectArgs.builder()
 *             .name("tf-test-project")
 *             .projectId("quota")
 *             .orgId("123456789")
 *             .deletionPolicy("DELETE")
 *             .build());
 * 
 *         var override = new ConsumerQuotaOverride("override", ConsumerQuotaOverrideArgs.builder()
 *             .project(myProject.projectId())
 *             .service("servicemanagement.googleapis.com")
 *             .metric(StdFunctions.urlencode(UrlencodeArgs.builder()
 *                 .input("servicemanagement.googleapis.com/default_requests")
 *                 .build()).result())
 *             .limit(StdFunctions.urlencode(UrlencodeArgs.builder()
 *                 .input("/min/project")
 *                 .build()).result())
 *             .overrideValue("95")
 *             .force(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Region Consumer Quota Override
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.Project;
 * import com.pulumi.gcp.organizations.ProjectArgs;
 * import com.pulumi.gcp.serviceusage.ConsumerQuotaOverride;
 * import com.pulumi.gcp.serviceusage.ConsumerQuotaOverrideArgs;
 * import com.pulumi.std.StdFunctions;
 * import com.pulumi.std.inputs.UrlencodeArgs;
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
 *         var myProject = new Project("myProject", ProjectArgs.builder()
 *             .name("tf-test-project")
 *             .projectId("quota")
 *             .orgId("123456789")
 *             .deletionPolicy("DELETE")
 *             .build());
 * 
 *         var override = new ConsumerQuotaOverride("override", ConsumerQuotaOverrideArgs.builder()
 *             .dimensions(Map.of("region", "us-central1"))
 *             .project(myProject.projectId())
 *             .service("compute.googleapis.com")
 *             .metric(StdFunctions.urlencode(UrlencodeArgs.builder()
 *                 .input("compute.googleapis.com/n2_cpus")
 *                 .build()).result())
 *             .limit(StdFunctions.urlencode(UrlencodeArgs.builder()
 *                 .input("/project/region")
 *                 .build()).result())
 *             .overrideValue("8")
 *             .force(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Consumer Quota Override Custom Dimension
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.Project;
 * import com.pulumi.gcp.organizations.ProjectArgs;
 * import com.pulumi.gcp.serviceusage.ConsumerQuotaOverride;
 * import com.pulumi.gcp.serviceusage.ConsumerQuotaOverrideArgs;
 * import com.pulumi.std.StdFunctions;
 * import com.pulumi.std.inputs.UrlencodeArgs;
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
 *         var myProject = new Project("myProject", ProjectArgs.builder()
 *             .name("tf-test-project")
 *             .projectId("quota")
 *             .orgId("123456789")
 *             .deletionPolicy("DELETE")
 *             .build());
 * 
 *         var override = new ConsumerQuotaOverride("override", ConsumerQuotaOverrideArgs.builder()
 *             .project(myProject.projectId())
 *             .service("libraryagent.googleapis.com")
 *             .metric(StdFunctions.urlencode(UrlencodeArgs.builder()
 *                 .input("libraryagent.googleapis.com/borrows")
 *                 .build()).result())
 *             .limit(StdFunctions.urlencode(UrlencodeArgs.builder()
 *                 .input("/author/project")
 *                 .build()).result())
 *             .overrideValue("1")
 *             .force(true)
 *             .dimensions(Map.of("author", "larry"))
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
 * ConsumerQuotaOverride can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/services/{{service}}/consumerQuotaMetrics/{{metric}}/limits/{{limit}}/consumerOverrides/{{name}}`
 * 
 * * `services/{{service}}/consumerQuotaMetrics/{{metric}}/limits/{{limit}}/consumerOverrides/{{name}}`
 * 
 * * `{{service}}/{{metric}}/{{limit}}/{{name}}`
 * 
 * When using the `pulumi import` command, ConsumerQuotaOverride can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:serviceusage/consumerQuotaOverride:ConsumerQuotaOverride default projects/{{project}}/services/{{service}}/consumerQuotaMetrics/{{metric}}/limits/{{limit}}/consumerOverrides/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:serviceusage/consumerQuotaOverride:ConsumerQuotaOverride default services/{{service}}/consumerQuotaMetrics/{{metric}}/limits/{{limit}}/consumerOverrides/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:serviceusage/consumerQuotaOverride:ConsumerQuotaOverride default {{service}}/{{metric}}/{{limit}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:serviceusage/consumerQuotaOverride:ConsumerQuotaOverride")
public class ConsumerQuotaOverride extends com.pulumi.resources.CustomResource {
    /**
     * If this map is nonempty, then this override applies only to specific values for dimensions defined in the limit unit.
     * 
     */
    @Export(name="dimensions", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> dimensions;

    /**
     * @return If this map is nonempty, then this override applies only to specific values for dimensions defined in the limit unit.
     * 
     */
    public Output<Optional<Map<String,String>>> dimensions() {
        return Codegen.optional(this.dimensions);
    }
    /**
     * If the new quota would decrease the existing quota by more than 10%, the request is rejected.
     * If `force` is `true`, that safety check is ignored.
     * 
     */
    @Export(name="force", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> force;

    /**
     * @return If the new quota would decrease the existing quota by more than 10%, the request is rejected.
     * If `force` is `true`, that safety check is ignored.
     * 
     */
    public Output<Optional<Boolean>> force() {
        return Codegen.optional(this.force);
    }
    /**
     * The limit on the metric, e.g. `/project/region`.
     * &gt; Make sure that `limit` is in a format that doesn&#39;t start with `1/` or contain curly braces.
     * E.g. use `/project/user` instead of `1/{project}/{user}`.
     * 
     */
    @Export(name="limit", refs={String.class}, tree="[0]")
    private Output<String> limit;

    /**
     * @return The limit on the metric, e.g. `/project/region`.
     * &gt; Make sure that `limit` is in a format that doesn&#39;t start with `1/` or contain curly braces.
     * E.g. use `/project/user` instead of `1/{project}/{user}`.
     * 
     */
    public Output<String> limit() {
        return this.limit;
    }
    /**
     * The metric that should be limited, e.g. `compute.googleapis.com/cpus`.
     * 
     */
    @Export(name="metric", refs={String.class}, tree="[0]")
    private Output<String> metric;

    /**
     * @return The metric that should be limited, e.g. `compute.googleapis.com/cpus`.
     * 
     */
    public Output<String> metric() {
        return this.metric;
    }
    /**
     * The server-generated name of the quota override.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The server-generated name of the quota override.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The overriding quota limit value. Can be any nonnegative integer, or -1 (unlimited quota).
     * 
     */
    @Export(name="overrideValue", refs={String.class}, tree="[0]")
    private Output<String> overrideValue;

    /**
     * @return The overriding quota limit value. Can be any nonnegative integer, or -1 (unlimited quota).
     * 
     */
    public Output<String> overrideValue() {
        return this.overrideValue;
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
     * The service that the metrics belong to, e.g. `compute.googleapis.com`.
     * 
     */
    @Export(name="service", refs={String.class}, tree="[0]")
    private Output<String> service;

    /**
     * @return The service that the metrics belong to, e.g. `compute.googleapis.com`.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConsumerQuotaOverride(java.lang.String name) {
        this(name, ConsumerQuotaOverrideArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConsumerQuotaOverride(java.lang.String name, ConsumerQuotaOverrideArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConsumerQuotaOverride(java.lang.String name, ConsumerQuotaOverrideArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:serviceusage/consumerQuotaOverride:ConsumerQuotaOverride", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ConsumerQuotaOverride(java.lang.String name, Output<java.lang.String> id, @Nullable ConsumerQuotaOverrideState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:serviceusage/consumerQuotaOverride:ConsumerQuotaOverride", name, state, makeResourceOptions(options, id), false);
    }

    private static ConsumerQuotaOverrideArgs makeArgs(ConsumerQuotaOverrideArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ConsumerQuotaOverrideArgs.Empty : args;
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
    public static ConsumerQuotaOverride get(java.lang.String name, Output<java.lang.String> id, @Nullable ConsumerQuotaOverrideState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConsumerQuotaOverride(name, id, state, options);
    }
}
