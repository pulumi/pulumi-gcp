// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.workstations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.workstations.WorkstationClusterArgs;
import com.pulumi.gcp.workstations.inputs.WorkstationClusterState;
import com.pulumi.gcp.workstations.outputs.WorkstationClusterCondition;
import com.pulumi.gcp.workstations.outputs.WorkstationClusterPrivateClusterConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Workstation Cluster Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.Network;
 * import com.pulumi.gcp.compute.NetworkArgs;
 * import com.pulumi.gcp.compute.Subnetwork;
 * import com.pulumi.gcp.compute.SubnetworkArgs;
 * import com.pulumi.gcp.workstations.WorkstationCluster;
 * import com.pulumi.gcp.workstations.WorkstationClusterArgs;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
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
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var defaultSubnetwork = new Subnetwork(&#34;defaultSubnetwork&#34;, SubnetworkArgs.builder()        
 *             .ipCidrRange(&#34;10.0.0.0/24&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .network(defaultNetwork.name())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var defaultWorkstationCluster = new WorkstationCluster(&#34;defaultWorkstationCluster&#34;, WorkstationClusterArgs.builder()        
 *             .workstationClusterId(&#34;workstation-cluster&#34;)
 *             .network(defaultNetwork.id())
 *             .subnetwork(defaultSubnetwork.id())
 *             .location(&#34;us-central1&#34;)
 *             .labels(Map.of(&#34;label&#34;, &#34;key&#34;))
 *             .annotations(Map.of(&#34;label-one&#34;, &#34;value-one&#34;))
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         final var project = OrganizationsFunctions.getProject();
 * 
 *     }
 * }
 * ```
 * ### Workstation Cluster Private
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.Network;
 * import com.pulumi.gcp.compute.NetworkArgs;
 * import com.pulumi.gcp.compute.Subnetwork;
 * import com.pulumi.gcp.compute.SubnetworkArgs;
 * import com.pulumi.gcp.workstations.WorkstationCluster;
 * import com.pulumi.gcp.workstations.WorkstationClusterArgs;
 * import com.pulumi.gcp.workstations.inputs.WorkstationClusterPrivateClusterConfigArgs;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
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
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var defaultSubnetwork = new Subnetwork(&#34;defaultSubnetwork&#34;, SubnetworkArgs.builder()        
 *             .ipCidrRange(&#34;10.0.0.0/24&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .network(defaultNetwork.name())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var defaultWorkstationCluster = new WorkstationCluster(&#34;defaultWorkstationCluster&#34;, WorkstationClusterArgs.builder()        
 *             .workstationClusterId(&#34;workstation-cluster-private&#34;)
 *             .network(defaultNetwork.id())
 *             .subnetwork(defaultSubnetwork.id())
 *             .location(&#34;us-central1&#34;)
 *             .privateClusterConfig(WorkstationClusterPrivateClusterConfigArgs.builder()
 *                 .enablePrivateEndpoint(true)
 *                 .build())
 *             .labels(Map.of(&#34;label&#34;, &#34;key&#34;))
 *             .annotations(Map.of(&#34;label-one&#34;, &#34;value-one&#34;))
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         final var project = OrganizationsFunctions.getProject();
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * WorkstationCluster can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:workstations/workstationCluster:WorkstationCluster default projects/{{project}}/locations/{{location}}/workstationClusters/{{workstation_cluster_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:workstations/workstationCluster:WorkstationCluster default {{project}}/{{location}}/{{workstation_cluster_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:workstations/workstationCluster:WorkstationCluster default {{location}}/{{workstation_cluster_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:workstations/workstationCluster:WorkstationCluster default {{workstation_cluster_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:workstations/workstationCluster:WorkstationCluster")
public class WorkstationCluster extends com.pulumi.resources.CustomResource {
    /**
     * Client-specified annotations. This is distinct from labels.
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> annotations;

    /**
     * @return Client-specified annotations. This is distinct from labels.
     * 
     */
    public Output<Optional<Map<String,String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * Status conditions describing the current resource state.
     * Structure is documented below.
     * 
     */
    @Export(name="conditions", type=List.class, parameters={WorkstationClusterCondition.class})
    private Output<List<WorkstationClusterCondition>> conditions;

    /**
     * @return Status conditions describing the current resource state.
     * Structure is documented below.
     * 
     */
    public Output<List<WorkstationClusterCondition>> conditions() {
        return this.conditions;
    }
    /**
     * Time the Instance was created in UTC.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time the Instance was created in UTC.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Whether this resource is in degraded mode, in which case it may require user action to restore full functionality.
     * Details can be found in the conditions field.
     * 
     */
    @Export(name="degraded", type=Boolean.class, parameters={})
    private Output<Boolean> degraded;

    /**
     * @return Whether this resource is in degraded mode, in which case it may require user action to restore full functionality.
     * Details can be found in the conditions field.
     * 
     */
    public Output<Boolean> degraded() {
        return this.degraded;
    }
    /**
     * Human-readable name for this resource.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Human-readable name for this resource.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Checksum computed by the server.
     * May be sent on update and delete requests to ensure that the client has an up-to-date value before proceeding.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Checksum computed by the server.
     * May be sent on update and delete requests to ensure that the client has an up-to-date value before proceeding.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Client-specified labels that are applied to the resource and that are also propagated to the underlying Compute Engine resources.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Client-specified labels that are applied to the resource and that are also propagated to the underlying Compute Engine resources.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The location where the workstation cluster should reside.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location where the workstation cluster should reside.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The name of the cluster resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the cluster resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The relative resource name of the VPC network on which the instance can be accessed.
     * It is specified in the following form: &#34;projects/{projectNumber}/global/networks/{network_id}&#34;.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The relative resource name of the VPC network on which the instance can be accessed.
     * It is specified in the following form: &#34;projects/{projectNumber}/global/networks/{network_id}&#34;.
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * Configuration for private cluster.
     * Structure is documented below.
     * 
     */
    @Export(name="privateClusterConfig", type=WorkstationClusterPrivateClusterConfig.class, parameters={})
    private Output</* @Nullable */ WorkstationClusterPrivateClusterConfig> privateClusterConfig;

    /**
     * @return Configuration for private cluster.
     * Structure is documented below.
     * 
     */
    public Output<Optional<WorkstationClusterPrivateClusterConfig>> privateClusterConfig() {
        return Codegen.optional(this.privateClusterConfig);
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
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
     * Name of the Compute Engine subnetwork in which instances associated with this cluster will be created.
     * Must be part of the subnetwork specified for this cluster.
     * 
     */
    @Export(name="subnetwork", type=String.class, parameters={})
    private Output<String> subnetwork;

    /**
     * @return Name of the Compute Engine subnetwork in which instances associated with this cluster will be created.
     * Must be part of the subnetwork specified for this cluster.
     * 
     */
    public Output<String> subnetwork() {
        return this.subnetwork;
    }
    /**
     * The system-generated UID of the resource.
     * 
     */
    @Export(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return The system-generated UID of the resource.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * The ID of the workstation cluster.
     * 
     */
    @Export(name="workstationClusterId", type=String.class, parameters={})
    private Output<String> workstationClusterId;

    /**
     * @return The ID of the workstation cluster.
     * 
     */
    public Output<String> workstationClusterId() {
        return this.workstationClusterId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkstationCluster(String name) {
        this(name, WorkstationClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkstationCluster(String name, WorkstationClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkstationCluster(String name, WorkstationClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:workstations/workstationCluster:WorkstationCluster", name, args == null ? WorkstationClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkstationCluster(String name, Output<String> id, @Nullable WorkstationClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:workstations/workstationCluster:WorkstationCluster", name, state, makeResourceOptions(options, id));
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
    public static WorkstationCluster get(String name, Output<String> id, @Nullable WorkstationClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkstationCluster(name, id, state, options);
    }
}