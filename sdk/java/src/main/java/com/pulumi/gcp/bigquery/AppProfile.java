// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.bigquery.AppProfileArgs;
import com.pulumi.gcp.bigquery.inputs.AppProfileState;
import com.pulumi.gcp.bigquery.outputs.AppProfileDataBoostIsolationReadOnly;
import com.pulumi.gcp.bigquery.outputs.AppProfileSingleClusterRouting;
import com.pulumi.gcp.bigquery.outputs.AppProfileStandardIsolation;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * App profile is a configuration object describing how Cloud Bigtable should treat traffic from a particular end user application.
 * 
 * To get more information about AppProfile, see:
 * 
 * * [API documentation](https://cloud.google.com/bigtable/docs/reference/admin/rest/v2/projects.instances.appProfiles)
 * 
 * ## Example Usage
 * 
 * ### Bigtable App Profile Anycluster
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigtable.Instance;
 * import com.pulumi.gcp.bigtable.InstanceArgs;
 * import com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs;
 * import com.pulumi.gcp.bigtable.AppProfile;
 * import com.pulumi.gcp.bigtable.AppProfileArgs;
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
 *         var instance = new Instance("instance", InstanceArgs.builder()
 *             .name("bt-instance")
 *             .clusters(            
 *                 InstanceClusterArgs.builder()
 *                     .clusterId("cluster-1")
 *                     .zone("us-central1-a")
 *                     .numNodes(3)
 *                     .storageType("HDD")
 *                     .build(),
 *                 InstanceClusterArgs.builder()
 *                     .clusterId("cluster-2")
 *                     .zone("us-central1-b")
 *                     .numNodes(3)
 *                     .storageType("HDD")
 *                     .build(),
 *                 InstanceClusterArgs.builder()
 *                     .clusterId("cluster-3")
 *                     .zone("us-central1-c")
 *                     .numNodes(3)
 *                     .storageType("HDD")
 *                     .build())
 *             .deletionProtection(true)
 *             .build());
 * 
 *         var ap = new AppProfile("ap", AppProfileArgs.builder()
 *             .instance(instance.name())
 *             .appProfileId("bt-profile")
 *             .multiClusterRoutingUseAny(true)
 *             .ignoreWarnings(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Bigtable App Profile Singlecluster
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigtable.Instance;
 * import com.pulumi.gcp.bigtable.InstanceArgs;
 * import com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs;
 * import com.pulumi.gcp.bigtable.AppProfile;
 * import com.pulumi.gcp.bigtable.AppProfileArgs;
 * import com.pulumi.gcp.bigtable.inputs.AppProfileSingleClusterRoutingArgs;
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
 *         var instance = new Instance("instance", InstanceArgs.builder()
 *             .name("bt-instance")
 *             .clusters(InstanceClusterArgs.builder()
 *                 .clusterId("cluster-1")
 *                 .zone("us-central1-b")
 *                 .numNodes(3)
 *                 .storageType("HDD")
 *                 .build())
 *             .deletionProtection(true)
 *             .build());
 * 
 *         var ap = new AppProfile("ap", AppProfileArgs.builder()
 *             .instance(instance.name())
 *             .appProfileId("bt-profile")
 *             .singleClusterRouting(AppProfileSingleClusterRoutingArgs.builder()
 *                 .clusterId("cluster-1")
 *                 .allowTransactionalWrites(true)
 *                 .build())
 *             .ignoreWarnings(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Bigtable App Profile Multicluster
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigtable.Instance;
 * import com.pulumi.gcp.bigtable.InstanceArgs;
 * import com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs;
 * import com.pulumi.gcp.bigtable.AppProfile;
 * import com.pulumi.gcp.bigtable.AppProfileArgs;
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
 *         var instance = new Instance("instance", InstanceArgs.builder()
 *             .name("bt-instance")
 *             .clusters(            
 *                 InstanceClusterArgs.builder()
 *                     .clusterId("cluster-1")
 *                     .zone("us-central1-a")
 *                     .numNodes(3)
 *                     .storageType("HDD")
 *                     .build(),
 *                 InstanceClusterArgs.builder()
 *                     .clusterId("cluster-2")
 *                     .zone("us-central1-b")
 *                     .numNodes(3)
 *                     .storageType("HDD")
 *                     .build(),
 *                 InstanceClusterArgs.builder()
 *                     .clusterId("cluster-3")
 *                     .zone("us-central1-c")
 *                     .numNodes(3)
 *                     .storageType("HDD")
 *                     .build())
 *             .deletionProtection(true)
 *             .build());
 * 
 *         var ap = new AppProfile("ap", AppProfileArgs.builder()
 *             .instance(instance.name())
 *             .appProfileId("bt-profile")
 *             .multiClusterRoutingUseAny(true)
 *             .multiClusterRoutingClusterIds(            
 *                 "cluster-1",
 *                 "cluster-2")
 *             .ignoreWarnings(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Bigtable App Profile Priority
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigtable.Instance;
 * import com.pulumi.gcp.bigtable.InstanceArgs;
 * import com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs;
 * import com.pulumi.gcp.bigtable.AppProfile;
 * import com.pulumi.gcp.bigtable.AppProfileArgs;
 * import com.pulumi.gcp.bigtable.inputs.AppProfileSingleClusterRoutingArgs;
 * import com.pulumi.gcp.bigtable.inputs.AppProfileStandardIsolationArgs;
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
 *         var instance = new Instance("instance", InstanceArgs.builder()
 *             .name("bt-instance")
 *             .clusters(InstanceClusterArgs.builder()
 *                 .clusterId("cluster-1")
 *                 .zone("us-central1-b")
 *                 .numNodes(3)
 *                 .storageType("HDD")
 *                 .build())
 *             .deletionProtection(true)
 *             .build());
 * 
 *         var ap = new AppProfile("ap", AppProfileArgs.builder()
 *             .instance(instance.name())
 *             .appProfileId("bt-profile")
 *             .singleClusterRouting(AppProfileSingleClusterRoutingArgs.builder()
 *                 .clusterId("cluster-1")
 *                 .allowTransactionalWrites(true)
 *                 .build())
 *             .standardIsolation(AppProfileStandardIsolationArgs.builder()
 *                 .priority("PRIORITY_LOW")
 *                 .build())
 *             .ignoreWarnings(true)
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
 * AppProfile can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/instances/{{instance}}/appProfiles/{{app_profile_id}}`
 * 
 * * `{{project}}/{{instance}}/{{app_profile_id}}`
 * 
 * * `{{instance}}/{{app_profile_id}}`
 * 
 * When using the `pulumi import` command, AppProfile can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:bigquery/appProfile:AppProfile default projects/{{project}}/instances/{{instance}}/appProfiles/{{app_profile_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:bigquery/appProfile:AppProfile default {{project}}/{{instance}}/{{app_profile_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:bigquery/appProfile:AppProfile default {{instance}}/{{app_profile_id}}
 * ```
 * 
 * @deprecated
 * gcp.bigquery/appprofile.AppProfile has been deprecated in favor of gcp.bigtable/appprofile.AppProfile
 * 
 */
@Deprecated /* gcp.bigquery/appprofile.AppProfile has been deprecated in favor of gcp.bigtable/appprofile.AppProfile */
@ResourceType(type="gcp:bigquery/appProfile:AppProfile")
public class AppProfile extends com.pulumi.resources.CustomResource {
    /**
     * The unique name of the app profile in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
     * 
     */
    @Export(name="appProfileId", refs={String.class}, tree="[0]")
    private Output<String> appProfileId;

    /**
     * @return The unique name of the app profile in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
     * 
     */
    public Output<String> appProfileId() {
        return this.appProfileId;
    }
    /**
     * Specifies that this app profile is intended for read-only usage via the Data Boost feature.
     * Structure is documented below.
     * 
     */
    @Export(name="dataBoostIsolationReadOnly", refs={AppProfileDataBoostIsolationReadOnly.class}, tree="[0]")
    private Output</* @Nullable */ AppProfileDataBoostIsolationReadOnly> dataBoostIsolationReadOnly;

    /**
     * @return Specifies that this app profile is intended for read-only usage via the Data Boost feature.
     * Structure is documented below.
     * 
     */
    public Output<Optional<AppProfileDataBoostIsolationReadOnly>> dataBoostIsolationReadOnly() {
        return Codegen.optional(this.dataBoostIsolationReadOnly);
    }
    /**
     * Long form description of the use case for this app profile.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Long form description of the use case for this app profile.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * If true, ignore safety checks when deleting/updating the app profile.
     * 
     */
    @Export(name="ignoreWarnings", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ignoreWarnings;

    /**
     * @return If true, ignore safety checks when deleting/updating the app profile.
     * 
     */
    public Output<Optional<Boolean>> ignoreWarnings() {
        return Codegen.optional(this.ignoreWarnings);
    }
    /**
     * The name of the instance to create the app profile within.
     * 
     */
    @Export(name="instance", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instance;

    /**
     * @return The name of the instance to create the app profile within.
     * 
     */
    public Output<Optional<String>> instance() {
        return Codegen.optional(this.instance);
    }
    /**
     * The set of clusters to route to. The order is ignored; clusters will be tried in order of distance. If left empty, all
     * clusters are eligible.
     * 
     */
    @Export(name="multiClusterRoutingClusterIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> multiClusterRoutingClusterIds;

    /**
     * @return The set of clusters to route to. The order is ignored; clusters will be tried in order of distance. If left empty, all
     * clusters are eligible.
     * 
     */
    public Output<Optional<List<String>>> multiClusterRoutingClusterIds() {
        return Codegen.optional(this.multiClusterRoutingClusterIds);
    }
    /**
     * If true, read/write requests are routed to the nearest cluster in the instance, and will fail over to the nearest cluster that is available
     * in the event of transient errors or delays. Clusters in a region are considered equidistant. Choosing this option sacrifices read-your-writes
     * consistency to improve availability.
     * 
     */
    @Export(name="multiClusterRoutingUseAny", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> multiClusterRoutingUseAny;

    /**
     * @return If true, read/write requests are routed to the nearest cluster in the instance, and will fail over to the nearest cluster that is available
     * in the event of transient errors or delays. Clusters in a region are considered equidistant. Choosing this option sacrifices read-your-writes
     * consistency to improve availability.
     * 
     */
    public Output<Optional<Boolean>> multiClusterRoutingUseAny() {
        return Codegen.optional(this.multiClusterRoutingUseAny);
    }
    /**
     * The unique name of the requested app profile. Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;/appProfiles/&lt;appProfileId&gt;`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The unique name of the requested app profile. Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;/appProfiles/&lt;appProfileId&gt;`.
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
     * Must be used with multi-cluster routing. If true, then this app profile will use row affinity sticky routing. With row
     * affinity, Bigtable will route single row key requests based on the row key, rather than randomly. Instead, each row key
     * will be assigned to a cluster by Cloud Bigtable, and will stick to that cluster. Choosing this option improves
     * read-your-writes consistency for most requests under most circumstances, without sacrificing availability. Consistency
     * is not guaranteed, as requests may still fail over between clusters in the event of errors or latency.
     * 
     */
    @Export(name="rowAffinity", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> rowAffinity;

    /**
     * @return Must be used with multi-cluster routing. If true, then this app profile will use row affinity sticky routing. With row
     * affinity, Bigtable will route single row key requests based on the row key, rather than randomly. Instead, each row key
     * will be assigned to a cluster by Cloud Bigtable, and will stick to that cluster. Choosing this option improves
     * read-your-writes consistency for most requests under most circumstances, without sacrificing availability. Consistency
     * is not guaranteed, as requests may still fail over between clusters in the event of errors or latency.
     * 
     */
    public Output<Optional<Boolean>> rowAffinity() {
        return Codegen.optional(this.rowAffinity);
    }
    /**
     * Use a single-cluster routing policy.
     * Structure is documented below.
     * 
     */
    @Export(name="singleClusterRouting", refs={AppProfileSingleClusterRouting.class}, tree="[0]")
    private Output</* @Nullable */ AppProfileSingleClusterRouting> singleClusterRouting;

    /**
     * @return Use a single-cluster routing policy.
     * Structure is documented below.
     * 
     */
    public Output<Optional<AppProfileSingleClusterRouting>> singleClusterRouting() {
        return Codegen.optional(this.singleClusterRouting);
    }
    /**
     * The standard options used for isolating this app profile&#39;s traffic from other use cases.
     * Structure is documented below.
     * 
     */
    @Export(name="standardIsolation", refs={AppProfileStandardIsolation.class}, tree="[0]")
    private Output<AppProfileStandardIsolation> standardIsolation;

    /**
     * @return The standard options used for isolating this app profile&#39;s traffic from other use cases.
     * Structure is documented below.
     * 
     */
    public Output<AppProfileStandardIsolation> standardIsolation() {
        return this.standardIsolation;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppProfile(java.lang.String name) {
        this(name, AppProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppProfile(java.lang.String name, AppProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppProfile(java.lang.String name, AppProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/appProfile:AppProfile", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AppProfile(java.lang.String name, Output<java.lang.String> id, @Nullable AppProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/appProfile:AppProfile", name, state, makeResourceOptions(options, id), false);
    }

    private static AppProfileArgs makeArgs(AppProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppProfileArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("gcp:bigquery/appProfile:AppProfile").build())
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
    public static AppProfile get(java.lang.String name, Output<java.lang.String> id, @Nullable AppProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppProfile(name, id, state, options);
    }
}
