// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networksecurity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.networksecurity.MirroringDeploymentArgs;
import com.pulumi.gcp.networksecurity.inputs.MirroringDeploymentState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Network Security Mirroring Deployment Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.Network;
 * import com.pulumi.gcp.compute.NetworkArgs;
 * import com.pulumi.gcp.compute.Subnetwork;
 * import com.pulumi.gcp.compute.SubnetworkArgs;
 * import com.pulumi.gcp.compute.RegionHealthCheck;
 * import com.pulumi.gcp.compute.RegionHealthCheckArgs;
 * import com.pulumi.gcp.compute.inputs.RegionHealthCheckHttpHealthCheckArgs;
 * import com.pulumi.gcp.compute.RegionBackendService;
 * import com.pulumi.gcp.compute.RegionBackendServiceArgs;
 * import com.pulumi.gcp.compute.ForwardingRule;
 * import com.pulumi.gcp.compute.ForwardingRuleArgs;
 * import com.pulumi.gcp.networksecurity.MirroringDeploymentGroup;
 * import com.pulumi.gcp.networksecurity.MirroringDeploymentGroupArgs;
 * import com.pulumi.gcp.networksecurity.MirroringDeployment;
 * import com.pulumi.gcp.networksecurity.MirroringDeploymentArgs;
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
 *         var network = new Network("network", NetworkArgs.builder()
 *             .name("example-network")
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var subnetwork = new Subnetwork("subnetwork", SubnetworkArgs.builder()
 *             .name("example-subnet")
 *             .region("us-central1")
 *             .ipCidrRange("10.1.0.0/16")
 *             .network(network.name())
 *             .build());
 * 
 *         var healthCheck = new RegionHealthCheck("healthCheck", RegionHealthCheckArgs.builder()
 *             .name("example-hc")
 *             .region("us-central1")
 *             .httpHealthCheck(RegionHealthCheckHttpHealthCheckArgs.builder()
 *                 .port(80)
 *                 .build())
 *             .build());
 * 
 *         var backendService = new RegionBackendService("backendService", RegionBackendServiceArgs.builder()
 *             .name("example-bs")
 *             .region("us-central1")
 *             .healthChecks(healthCheck.id())
 *             .protocol("UDP")
 *             .loadBalancingScheme("INTERNAL")
 *             .build());
 * 
 *         var forwardingRule = new ForwardingRule("forwardingRule", ForwardingRuleArgs.builder()
 *             .name("example-fwr")
 *             .region("us-central1")
 *             .network(network.name())
 *             .subnetwork(subnetwork.name())
 *             .backendService(backendService.id())
 *             .loadBalancingScheme("INTERNAL")
 *             .ports(6081)
 *             .ipProtocol("UDP")
 *             .isMirroringCollector(true)
 *             .build());
 * 
 *         var deploymentGroup = new MirroringDeploymentGroup("deploymentGroup", MirroringDeploymentGroupArgs.builder()
 *             .mirroringDeploymentGroupId("example-dg")
 *             .location("global")
 *             .network(network.id())
 *             .build());
 * 
 *         var default_ = new MirroringDeployment("default", MirroringDeploymentArgs.builder()
 *             .mirroringDeploymentId("example-deployment")
 *             .location("us-central1-a")
 *             .forwardingRule(forwardingRule.id())
 *             .mirroringDeploymentGroup(deploymentGroup.id())
 *             .labels(Map.of("foo", "bar"))
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
 * MirroringDeployment can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/mirroringDeployments/{{mirroring_deployment_id}}`
 * 
 * * `{{project}}/{{location}}/{{mirroring_deployment_id}}`
 * 
 * * `{{location}}/{{mirroring_deployment_id}}`
 * 
 * When using the `pulumi import` command, MirroringDeployment can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:networksecurity/mirroringDeployment:MirroringDeployment default projects/{{project}}/locations/{{location}}/mirroringDeployments/{{mirroring_deployment_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:networksecurity/mirroringDeployment:MirroringDeployment default {{project}}/{{location}}/{{mirroring_deployment_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:networksecurity/mirroringDeployment:MirroringDeployment default {{location}}/{{mirroring_deployment_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:networksecurity/mirroringDeployment:MirroringDeployment")
public class MirroringDeployment extends com.pulumi.resources.CustomResource {
    /**
     * Output only. [Output only] Create time stamp
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Output only. [Output only] Create time stamp
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
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
     * Required. Immutable. The regional load balancer which the mirrored traffic should be forwarded
     * to. Format is:
     * projects/{project}/regions/{region}/forwardingRules/{forwardingRule}
     * 
     */
    @Export(name="forwardingRule", refs={String.class}, tree="[0]")
    private Output<String> forwardingRule;

    /**
     * @return Required. Immutable. The regional load balancer which the mirrored traffic should be forwarded
     * to. Format is:
     * projects/{project}/regions/{region}/forwardingRules/{forwardingRule}
     * 
     */
    public Output<String> forwardingRule() {
        return this.forwardingRule;
    }
    /**
     * Optional. Labels as key value pairs
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Optional. Labels as key value pairs
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `networksecurity.googleapis.com/MirroringDeployment`.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `networksecurity.googleapis.com/MirroringDeployment`.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Required. Immutable. The Mirroring Deployment Group that this resource is part of. Format is:
     * `projects/{project}/locations/global/mirroringDeploymentGroups/{mirroringDeploymentGroup}`
     * 
     */
    @Export(name="mirroringDeploymentGroup", refs={String.class}, tree="[0]")
    private Output<String> mirroringDeploymentGroup;

    /**
     * @return Required. Immutable. The Mirroring Deployment Group that this resource is part of. Format is:
     * `projects/{project}/locations/global/mirroringDeploymentGroups/{mirroringDeploymentGroup}`
     * 
     */
    public Output<String> mirroringDeploymentGroup() {
        return this.mirroringDeploymentGroup;
    }
    /**
     * Required. Id of the requesting object
     * If auto-generating Id server-side, remove this field and
     * mirroring_deployment_id from the method_signature of Create RPC
     * 
     * ***
     * 
     */
    @Export(name="mirroringDeploymentId", refs={String.class}, tree="[0]")
    private Output<String> mirroringDeploymentId;

    /**
     * @return Required. Id of the requesting object
     * If auto-generating Id server-side, remove this field and
     * mirroring_deployment_id from the method_signature of Create RPC
     * 
     * ***
     * 
     */
    public Output<String> mirroringDeploymentId() {
        return this.mirroringDeploymentId;
    }
    /**
     * Immutable. Identifier. The name of the MirroringDeployment.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Immutable. Identifier. The name of the MirroringDeployment.
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
     * Output only. Whether reconciling is in progress, recommended per
     * https://google.aip.dev/128.
     * 
     */
    @Export(name="reconciling", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> reconciling;

    /**
     * @return Output only. Whether reconciling is in progress, recommended per
     * https://google.aip.dev/128.
     * 
     */
    public Output<Boolean> reconciling() {
        return this.reconciling;
    }
    /**
     * Output only. Current state of the deployment.
     * Possible values:
     * STATE_UNSPECIFIED
     * ACTIVE
     * CREATING
     * DELETING
     * OUT_OF_SYNC
     * DELETE_FAILED
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return Output only. Current state of the deployment.
     * Possible values:
     * STATE_UNSPECIFIED
     * ACTIVE
     * CREATING
     * DELETING
     * OUT_OF_SYNC
     * DELETE_FAILED
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Output only. [Output only] Update time stamp
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return Output only. [Output only] Update time stamp
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MirroringDeployment(java.lang.String name) {
        this(name, MirroringDeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MirroringDeployment(java.lang.String name, MirroringDeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MirroringDeployment(java.lang.String name, MirroringDeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networksecurity/mirroringDeployment:MirroringDeployment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private MirroringDeployment(java.lang.String name, Output<java.lang.String> id, @Nullable MirroringDeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networksecurity/mirroringDeployment:MirroringDeployment", name, state, makeResourceOptions(options, id), false);
    }

    private static MirroringDeploymentArgs makeArgs(MirroringDeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MirroringDeploymentArgs.Empty : args;
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
    public static MirroringDeployment get(java.lang.String name, Output<java.lang.String> id, @Nullable MirroringDeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MirroringDeployment(name, id, state, options);
    }
}
