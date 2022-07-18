// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.dataproc.ClusterArgs;
import com.pulumi.gcp.dataproc.inputs.ClusterState;
import com.pulumi.gcp.dataproc.outputs.ClusterClusterConfig;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Cloud Dataproc cluster resource within GCP.
 * 
 * * [API documentation](https://cloud.google.com/dataproc/docs/reference/rest/v1/projects.regions.clusters)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dataproc/docs)
 * 
 * !&gt; **Warning:** Due to limitations of the API, all arguments except
 * `labels`,`cluster_config.worker_config.num_instances` and `cluster_config.preemptible_worker_config.num_instances` are non-updatable. Changing others will cause recreation of the
 * whole cluster!
 * 
 * ## Example Usage
 * ### Basic
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
 *         var simplecluster = new Cluster(&#34;simplecluster&#34;, ClusterArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Advanced
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
 *         var default_ = new Account(&#34;default&#34;, AccountArgs.builder()        
 *             .accountId(&#34;service-account-id&#34;)
 *             .displayName(&#34;Service Account&#34;)
 *             .build());
 * 
 *         var mycluster = new Cluster(&#34;mycluster&#34;, ClusterArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .gracefulDecommissionTimeout(&#34;120s&#34;)
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .clusterConfig(ClusterClusterConfigArgs.builder()
 *                 .stagingBucket(&#34;dataproc-staging-bucket&#34;)
 *                 .masterConfig(ClusterClusterConfigMasterConfigArgs.builder()
 *                     .numInstances(1)
 *                     .machineType(&#34;e2-medium&#34;)
 *                     .diskConfig(ClusterClusterConfigMasterConfigDiskConfigArgs.builder()
 *                         .bootDiskType(&#34;pd-ssd&#34;)
 *                         .bootDiskSizeGb(30)
 *                         .build())
 *                     .build())
 *                 .workerConfig(ClusterClusterConfigWorkerConfigArgs.builder()
 *                     .numInstances(2)
 *                     .machineType(&#34;e2-medium&#34;)
 *                     .minCpuPlatform(&#34;Intel Skylake&#34;)
 *                     .diskConfig(ClusterClusterConfigWorkerConfigDiskConfigArgs.builder()
 *                         .bootDiskSizeGb(30)
 *                         .numLocalSsds(1)
 *                         .build())
 *                     .build())
 *                 .preemptibleWorkerConfig(ClusterClusterConfigPreemptibleWorkerConfigArgs.builder()
 *                     .numInstances(0)
 *                     .build())
 *                 .softwareConfig(ClusterClusterConfigSoftwareConfigArgs.builder()
 *                     .imageVersion(&#34;2.0.35-debian10&#34;)
 *                     .overrideProperties(Map.of(&#34;dataproc:dataproc.allow.zero.workers&#34;, &#34;true&#34;))
 *                     .build())
 *                 .gceClusterConfig(ClusterClusterConfigGceClusterConfigArgs.builder()
 *                     .tags(                    
 *                         &#34;foo&#34;,
 *                         &#34;bar&#34;)
 *                     .serviceAccount(default_.email())
 *                     .serviceAccountScopes(&#34;cloud-platform&#34;)
 *                     .build())
 *                 .initializationActions(ClusterClusterConfigInitializationActionArgs.builder()
 *                     .script(&#34;gs://dataproc-initialization-actions/stackdriver/stackdriver.sh&#34;)
 *                     .timeoutSec(500)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Using A GPU Accelerator
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
 *         var acceleratedCluster = new Cluster(&#34;acceleratedCluster&#34;, ClusterArgs.builder()        
 *             .clusterConfig(ClusterClusterConfigArgs.builder()
 *                 .gceClusterConfig(ClusterClusterConfigGceClusterConfigArgs.builder()
 *                     .zone(&#34;us-central1-a&#34;)
 *                     .build())
 *                 .masterConfig(ClusterClusterConfigMasterConfigArgs.builder()
 *                     .accelerators(ClusterClusterConfigMasterConfigAcceleratorArgs.builder()
 *                         .acceleratorCount(&#34;1&#34;)
 *                         .acceleratorType(&#34;nvidia-tesla-k80&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .region(&#34;us-central1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:dataproc/cluster:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * Allows you to configure various aspects of the cluster.
     * Structure defined below.
     * 
     */
    @Export(name="clusterConfig", type=ClusterClusterConfig.class, parameters={})
    private Output<ClusterClusterConfig> clusterConfig;

    /**
     * @return Allows you to configure various aspects of the cluster.
     * Structure defined below.
     * 
     */
    public Output<ClusterClusterConfig> clusterConfig() {
        return this.clusterConfig;
    }
    /**
     * The timeout duration which allows graceful decomissioning when you change the number of worker nodes directly through a
     * terraform apply
     * 
     */
    @Export(name="gracefulDecommissionTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> gracefulDecommissionTimeout;

    /**
     * @return The timeout duration which allows graceful decomissioning when you change the number of worker nodes directly through a
     * terraform apply
     * 
     */
    public Output<Optional<String>> gracefulDecommissionTimeout() {
        return Codegen.optional(this.gracefulDecommissionTimeout);
    }
    /**
     * The list of labels (key/value pairs) to be applied to
     * instances in the cluster. GCP generates some itself including `goog-dataproc-cluster-name`
     * which is the name of the cluster.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The list of labels (key/value pairs) to be applied to
     * instances in the cluster. GCP generates some itself including `goog-dataproc-cluster-name`
     * which is the name of the cluster.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The name of the cluster, unique within the project and
     * zone.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the cluster, unique within the project and
     * zone.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the `cluster` will exist. If it
     * is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the `cluster` will exist. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The region in which the cluster and associated nodes will be created in.
     * Defaults to `global`.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    /**
     * @return The region in which the cluster and associated nodes will be created in.
     * Defaults to `global`.
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, @Nullable ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, @Nullable ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/cluster:Cluster", name, state, makeResourceOptions(options, id));
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
    public static Cluster get(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}