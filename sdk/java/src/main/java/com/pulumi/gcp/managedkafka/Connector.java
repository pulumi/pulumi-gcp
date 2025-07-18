// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.managedkafka;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.managedkafka.ConnectorArgs;
import com.pulumi.gcp.managedkafka.inputs.ConnectorState;
import com.pulumi.gcp.managedkafka.outputs.ConnectorTaskRestartPolicy;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Managedkafka Connector Basic
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
 * import com.pulumi.time.sleep;
 * import com.pulumi.time.sleepArgs;
 * import com.pulumi.gcp.projects.Service;
 * import com.pulumi.gcp.projects.ServiceArgs;
 * import com.pulumi.gcp.compute.Subnetwork;
 * import com.pulumi.gcp.compute.SubnetworkArgs;
 * import com.pulumi.gcp.managedkafka.Cluster;
 * import com.pulumi.gcp.managedkafka.ClusterArgs;
 * import com.pulumi.gcp.managedkafka.inputs.ClusterCapacityConfigArgs;
 * import com.pulumi.gcp.managedkafka.inputs.ClusterGcpConfigArgs;
 * import com.pulumi.gcp.managedkafka.inputs.ClusterGcpConfigAccessConfigArgs;
 * import com.pulumi.gcp.managedkafka.ConnectCluster;
 * import com.pulumi.gcp.managedkafka.ConnectClusterArgs;
 * import com.pulumi.gcp.managedkafka.inputs.ConnectClusterCapacityConfigArgs;
 * import com.pulumi.gcp.managedkafka.inputs.ConnectClusterGcpConfigArgs;
 * import com.pulumi.gcp.managedkafka.inputs.ConnectClusterGcpConfigAccessConfigArgs;
 * import com.pulumi.gcp.managedkafka.Connector;
 * import com.pulumi.gcp.managedkafka.ConnectorArgs;
 * import com.pulumi.gcp.managedkafka.inputs.ConnectorTaskRestartPolicyArgs;
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
 *         var project = new Project("project", ProjectArgs.builder()
 *             .projectId("tf-test_32706")
 *             .name("tf-test_49082")
 *             .orgId("123456789")
 *             .billingAccount("000000-0000000-0000000-000000")
 *             .deletionPolicy("DELETE")
 *             .build());
 * 
 *         var wait60Seconds = new Sleep("wait60Seconds", SleepArgs.builder()
 *             .createDuration("60s")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(List.of(project))
 *                 .build());
 * 
 *         var compute = new Service("compute", ServiceArgs.builder()
 *             .project(project.projectId())
 *             .service("compute.googleapis.com")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(wait60Seconds)
 *                 .build());
 * 
 *         var managedkafka = new Service("managedkafka", ServiceArgs.builder()
 *             .project(project.projectId())
 *             .service("managedkafka.googleapis.com")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(compute)
 *                 .build());
 * 
 *         var wait120Seconds = new Sleep("wait120Seconds", SleepArgs.builder()
 *             .createDuration("120s")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(List.of(managedkafka))
 *                 .build());
 * 
 *         var mkcSecondarySubnet = new Subnetwork("mkcSecondarySubnet", SubnetworkArgs.builder()
 *             .project(project.projectId())
 *             .name("my-secondary-subnetwork-00")
 *             .ipCidrRange("10.5.0.0/16")
 *             .region("us-central1")
 *             .network("default")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(wait120Seconds)
 *                 .build());
 * 
 *         var cpsTopic = new com.pulumi.gcp.pubsub.Topic("cpsTopic", com.pulumi.gcp.pubsub.TopicArgs.builder()
 *             .project(project.projectId())
 *             .name("my-cps-topic")
 *             .messageRetentionDuration("86600s")
 *             .build());
 * 
 *         var gmkCluster = new Cluster("gmkCluster", ClusterArgs.builder()
 *             .project(project.projectId())
 *             .clusterId("my-cluster")
 *             .location("us-central1")
 *             .capacityConfig(ClusterCapacityConfigArgs.builder()
 *                 .vcpuCount("3")
 *                 .memoryBytes("3221225472")
 *                 .build())
 *             .gcpConfig(ClusterGcpConfigArgs.builder()
 *                 .accessConfig(ClusterGcpConfigAccessConfigArgs.builder()
 *                     .networkConfigs(ClusterGcpConfigAccessConfigNetworkConfigArgs.builder()
 *                         .subnet(project.projectId().applyValue(_projectId -> String.format("projects/%s/regions/us-central1/subnetworks/default", _projectId)))
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(managedkafka)
 *                 .build());
 * 
 *         var gmkTopic = new com.pulumi.gcp.managedkafka.Topic("gmkTopic", com.pulumi.gcp.managedkafka.TopicArgs.builder()
 *             .project(project.projectId())
 *             .topicId("my-topic")
 *             .cluster(gmkCluster.clusterId())
 *             .location("us-central1")
 *             .partitionCount(2)
 *             .replicationFactor(3)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(managedkafka)
 *                 .build());
 * 
 *         var mkcCluster = new ConnectCluster("mkcCluster", ConnectClusterArgs.builder()
 *             .project(project.projectId())
 *             .connectClusterId("my-connect-cluster")
 *             .kafkaCluster(Output.tuple(project.projectId(), gmkCluster.clusterId()).applyValue(values -> {
 *                 var projectId = values.t1;
 *                 var clusterId = values.t2;
 *                 return String.format("projects/%s/locations/us-central1/clusters/%s", projectId,clusterId);
 *             }))
 *             .location("us-central1")
 *             .capacityConfig(ConnectClusterCapacityConfigArgs.builder()
 *                 .vcpuCount("12")
 *                 .memoryBytes("21474836480")
 *                 .build())
 *             .gcpConfig(ConnectClusterGcpConfigArgs.builder()
 *                 .accessConfig(ConnectClusterGcpConfigAccessConfigArgs.builder()
 *                     .networkConfigs(ConnectClusterGcpConfigAccessConfigNetworkConfigArgs.builder()
 *                         .primarySubnet(project.projectId().applyValue(_projectId -> String.format("projects/%s/regions/us-central1/subnetworks/default", _projectId)))
 *                         .additionalSubnets(mkcSecondarySubnet.id())
 *                         .dnsDomainNames(Output.tuple(gmkCluster.clusterId(), project.projectId()).applyValue(values -> {
 *                             var clusterId = values.t1;
 *                             var projectId = values.t2;
 *                             return String.format("%s.us-central1.managedkafka.%s.cloud.goog", clusterId,projectId);
 *                         }))
 *                         .build())
 *                     .build())
 *                 .build())
 *             .labels(Map.of("key", "value"))
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(managedkafka)
 *                 .build());
 * 
 *         var example = new Connector("example", ConnectorArgs.builder()
 *             .project(project.projectId())
 *             .connectorId("my-connector")
 *             .connectCluster(mkcCluster.connectClusterId())
 *             .location("us-central1")
 *             .configs(Map.ofEntries(
 *                 Map.entry("connector.class", "com.google.pubsub.kafka.sink.CloudPubSubSinkConnector"),
 *                 Map.entry("name", "my-connector"),
 *                 Map.entry("tasks.max", "1"),
 *                 Map.entry("topics", gmkTopic.topicId()),
 *                 Map.entry("cps.topic", cpsTopic.name()),
 *                 Map.entry("cps.project", project.projectId()),
 *                 Map.entry("value.converter", "org.apache.kafka.connect.storage.StringConverter"),
 *                 Map.entry("key.converter", "org.apache.kafka.connect.storage.StringConverter")
 *             ))
 *             .taskRestartPolicy(ConnectorTaskRestartPolicyArgs.builder()
 *                 .minimumBackoff("60s")
 *                 .maximumBackoff("1800s")
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(managedkafka)
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
 * Connector can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/connectClusters/{{connect_cluster}}/connectors/{{connector_id}}`
 * 
 * * `{{project}}/{{location}}/{{connect_cluster}}/{{connector_id}}`
 * 
 * * `{{location}}/{{connect_cluster}}/{{connector_id}}`
 * 
 * When using the `pulumi import` command, Connector can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:managedkafka/connector:Connector default projects/{{project}}/locations/{{location}}/connectClusters/{{connect_cluster}}/connectors/{{connector_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:managedkafka/connector:Connector default {{project}}/{{location}}/{{connect_cluster}}/{{connector_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:managedkafka/connector:Connector default {{location}}/{{connect_cluster}}/{{connector_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:managedkafka/connector:Connector")
public class Connector extends com.pulumi.resources.CustomResource {
    /**
     * Connector config as keys/values. The keys of the map are connector property names, for example: `connector.class`, `tasks.max`, `key.converter`.
     * 
     */
    @Export(name="configs", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> configs;

    /**
     * @return Connector config as keys/values. The keys of the map are connector property names, for example: `connector.class`, `tasks.max`, `key.converter`.
     * 
     */
    public Output<Optional<Map<String,String>>> configs() {
        return Codegen.optional(this.configs);
    }
    /**
     * The connect cluster name.
     * 
     */
    @Export(name="connectCluster", refs={String.class}, tree="[0]")
    private Output<String> connectCluster;

    /**
     * @return The connect cluster name.
     * 
     */
    public Output<String> connectCluster() {
        return this.connectCluster;
    }
    /**
     * The ID to use for the connector, which will become the final component of the connector&#39;s name. This value is structured like: `my-connector-id`.
     * 
     */
    @Export(name="connectorId", refs={String.class}, tree="[0]")
    private Output<String> connectorId;

    /**
     * @return The ID to use for the connector, which will become the final component of the connector&#39;s name. This value is structured like: `my-connector-id`.
     * 
     */
    public Output<String> connectorId() {
        return this.connectorId;
    }
    /**
     * ID of the location of the Kafka Connect resource. See https://cloud.google.com/managed-kafka/docs/locations for a list of supported locations.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return ID of the location of the Kafka Connect resource. See https://cloud.google.com/managed-kafka/docs/locations for a list of supported locations.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the connector. The `connector` segment is used when connecting directly to the connect cluster. Structured like: `projects/PROJECT_ID/locations/LOCATION/connectClusters/CONNECT_CLUSTER/connectors/CONNECTOR_ID`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the connector. The `connector` segment is used when connecting directly to the connect cluster. Structured like: `projects/PROJECT_ID/locations/LOCATION/connectClusters/CONNECT_CLUSTER/connectors/CONNECTOR_ID`.
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
     * The current state of the connect. Possible values: `STATE_UNSPECIFIED`, `UNASSIGNED`, `RUNNING`, `PAUSED`, `FAILED`, `RESTARTING`, and `STOPPED`.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The current state of the connect. Possible values: `STATE_UNSPECIFIED`, `UNASSIGNED`, `RUNNING`, `PAUSED`, `FAILED`, `RESTARTING`, and `STOPPED`.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * A policy that specifies how to restart the failed connectors/tasks in a Cluster resource. If not set, the failed connectors/tasks won&#39;t be restarted.
     * Structure is documented below.
     * 
     */
    @Export(name="taskRestartPolicy", refs={ConnectorTaskRestartPolicy.class}, tree="[0]")
    private Output</* @Nullable */ ConnectorTaskRestartPolicy> taskRestartPolicy;

    /**
     * @return A policy that specifies how to restart the failed connectors/tasks in a Cluster resource. If not set, the failed connectors/tasks won&#39;t be restarted.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ConnectorTaskRestartPolicy>> taskRestartPolicy() {
        return Codegen.optional(this.taskRestartPolicy);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connector(java.lang.String name) {
        this(name, ConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connector(java.lang.String name, ConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connector(java.lang.String name, ConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:managedkafka/connector:Connector", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Connector(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:managedkafka/connector:Connector", name, state, makeResourceOptions(options, id), false);
    }

    private static ConnectorArgs makeArgs(ConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ConnectorArgs.Empty : args;
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
    public static Connector get(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connector(name, id, state, options);
    }
}
