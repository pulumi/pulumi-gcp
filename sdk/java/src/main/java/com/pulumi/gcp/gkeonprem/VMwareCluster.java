// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.gkeonprem.VMwareClusterArgs;
import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterState;
import com.pulumi.gcp.gkeonprem.outputs.VMwareClusterAntiAffinityGroups;
import com.pulumi.gcp.gkeonprem.outputs.VMwareClusterAuthorization;
import com.pulumi.gcp.gkeonprem.outputs.VMwareClusterAutoRepairConfig;
import com.pulumi.gcp.gkeonprem.outputs.VMwareClusterControlPlaneNode;
import com.pulumi.gcp.gkeonprem.outputs.VMwareClusterDataplaneV2;
import com.pulumi.gcp.gkeonprem.outputs.VMwareClusterFleet;
import com.pulumi.gcp.gkeonprem.outputs.VMwareClusterLoadBalancer;
import com.pulumi.gcp.gkeonprem.outputs.VMwareClusterNetworkConfig;
import com.pulumi.gcp.gkeonprem.outputs.VMwareClusterStatus;
import com.pulumi.gcp.gkeonprem.outputs.VMwareClusterStorage;
import com.pulumi.gcp.gkeonprem.outputs.VMwareClusterValidationCheck;
import com.pulumi.gcp.gkeonprem.outputs.VMwareClusterVcenter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Gkeonprem Vmware Cluster Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.gkeonprem.VMwareCluster;
 * import com.pulumi.gcp.gkeonprem.VMwareClusterArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigDhcpIpConfigArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterControlPlaneNodeArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerVipConfigArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerMetalLbConfigArgs;
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
 *         var cluster_basic = new VMwareCluster(&#34;cluster-basic&#34;, VMwareClusterArgs.builder()        
 *             .location(&#34;us-west1&#34;)
 *             .adminClusterMembership(&#34;projects/870316890899/locations/global/memberships/gkeonprem-terraform-test&#34;)
 *             .description(&#34;test cluster&#34;)
 *             .onPremVersion(&#34;1.13.1-gke.35&#34;)
 *             .annotations()
 *             .networkConfig(VMwareClusterNetworkConfigArgs.builder()
 *                 .serviceAddressCidrBlocks(&#34;10.96.0.0/12&#34;)
 *                 .podAddressCidrBlocks(&#34;192.168.0.0/16&#34;)
 *                 .dhcpIpConfig(VMwareClusterNetworkConfigDhcpIpConfigArgs.builder()
 *                     .enabled(true)
 *                     .build())
 *                 .build())
 *             .controlPlaneNode(VMwareClusterControlPlaneNodeArgs.builder()
 *                 .cpus(4)
 *                 .memory(8192)
 *                 .replicas(1)
 *                 .build())
 *             .loadBalancer(VMwareClusterLoadBalancerArgs.builder()
 *                 .vipConfig(VMwareClusterLoadBalancerVipConfigArgs.builder()
 *                     .controlPlaneVip(&#34;10.251.133.5&#34;)
 *                     .ingressVip(&#34;10.251.135.19&#34;)
 *                     .build())
 *                 .metalLbConfig(VMwareClusterLoadBalancerMetalLbConfigArgs.builder()
 *                     .addressPools(                    
 *                         VMwareClusterLoadBalancerMetalLbConfigAddressPoolArgs.builder()
 *                             .pool(&#34;ingress-ip&#34;)
 *                             .manualAssign(&#34;true&#34;)
 *                             .addresses(&#34;10.251.135.19&#34;)
 *                             .avoidBuggyIps(true)
 *                             .build(),
 *                         VMwareClusterLoadBalancerMetalLbConfigAddressPoolArgs.builder()
 *                             .pool(&#34;lb-test-ip&#34;)
 *                             .manualAssign(&#34;true&#34;)
 *                             .addresses(&#34;10.251.135.19&#34;)
 *                             .avoidBuggyIps(true)
 *                             .build())
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Gkeonprem Vmware Cluster F5lb
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.gkeonprem.VMwareCluster;
 * import com.pulumi.gcp.gkeonprem.VMwareClusterArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigDhcpIpConfigArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigControlPlaneV2ConfigArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigControlPlaneV2ConfigControlPlaneIpBlockArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterControlPlaneNodeArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterControlPlaneNodeAutoResizeConfigArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerVipConfigArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerF5ConfigArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterDataplaneV2Args;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAuthorizationArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAntiAffinityGroupsArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAutoRepairConfigArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterStorageArgs;
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
 *         var cluster_f5lb = new VMwareCluster(&#34;cluster-f5lb&#34;, VMwareClusterArgs.builder()        
 *             .location(&#34;us-west1&#34;)
 *             .adminClusterMembership(&#34;projects/870316890899/locations/global/memberships/gkeonprem-terraform-test&#34;)
 *             .description(&#34;test cluster&#34;)
 *             .onPremVersion(&#34;1.13.1-gke.35&#34;)
 *             .annotations()
 *             .networkConfig(VMwareClusterNetworkConfigArgs.builder()
 *                 .serviceAddressCidrBlocks(&#34;10.96.0.0/12&#34;)
 *                 .podAddressCidrBlocks(&#34;192.168.0.0/16&#34;)
 *                 .dhcpIpConfig(VMwareClusterNetworkConfigDhcpIpConfigArgs.builder()
 *                     .enabled(true)
 *                     .build())
 *                 .controlPlaneV2Config(VMwareClusterNetworkConfigControlPlaneV2ConfigArgs.builder()
 *                     .controlPlaneIpBlock(VMwareClusterNetworkConfigControlPlaneV2ConfigControlPlaneIpBlockArgs.builder()
 *                         .ips(VMwareClusterNetworkConfigControlPlaneV2ConfigControlPlaneIpBlockIpArgs.builder()
 *                             .hostname(&#34;test-hostname&#34;)
 *                             .ip(&#34;10.0.0.1&#34;)
 *                             .build())
 *                         .netmask(&#34;10.0.0.1/32&#34;)
 *                         .gateway(&#34;test-gateway&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .controlPlaneNode(VMwareClusterControlPlaneNodeArgs.builder()
 *                 .cpus(4)
 *                 .memory(8192)
 *                 .replicas(1)
 *                 .autoResizeConfig(VMwareClusterControlPlaneNodeAutoResizeConfigArgs.builder()
 *                     .enabled(true)
 *                     .build())
 *                 .build())
 *             .loadBalancer(VMwareClusterLoadBalancerArgs.builder()
 *                 .vipConfig(VMwareClusterLoadBalancerVipConfigArgs.builder()
 *                     .controlPlaneVip(&#34;10.251.133.5&#34;)
 *                     .ingressVip(&#34;10.251.135.19&#34;)
 *                     .build())
 *                 .f5Config(VMwareClusterLoadBalancerF5ConfigArgs.builder()
 *                     .address(&#34;10.0.0.1&#34;)
 *                     .partition(&#34;test-partition&#34;)
 *                     .snatPool(&#34;test-snap-pool&#34;)
 *                     .build())
 *                 .build())
 *             .dataplaneV2(VMwareClusterDataplaneV2Args.builder()
 *                 .dataplaneV2Enabled(true)
 *                 .windowsDataplaneV2Enabled(true)
 *                 .advancedNetworking(true)
 *                 .build())
 *             .vmTrackingEnabled(true)
 *             .enableControlPlaneV2(true)
 *             .authorization(VMwareClusterAuthorizationArgs.builder()
 *                 .adminUsers(VMwareClusterAuthorizationAdminUserArgs.builder()
 *                     .username(&#34;testuser@gmail.com&#34;)
 *                     .build())
 *                 .build())
 *             .antiAffinityGroups(VMwareClusterAntiAffinityGroupsArgs.builder()
 *                 .aagConfigDisabled(true)
 *                 .build())
 *             .autoRepairConfig(VMwareClusterAutoRepairConfigArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .storage(VMwareClusterStorageArgs.builder()
 *                 .vsphereCsiDisabled(true)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Gkeonprem Vmware Cluster Manuallb
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.gkeonprem.VMwareCluster;
 * import com.pulumi.gcp.gkeonprem.VMwareClusterArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigHostConfigArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigStaticIpConfigArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterControlPlaneNodeArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterControlPlaneNodeAutoResizeConfigArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerVipConfigArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerManualLbConfigArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterDataplaneV2Args;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAuthorizationArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAntiAffinityGroupsArgs;
 * import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAutoRepairConfigArgs;
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
 *         var cluster_manuallb = new VMwareCluster(&#34;cluster-manuallb&#34;, VMwareClusterArgs.builder()        
 *             .location(&#34;us-west1&#34;)
 *             .adminClusterMembership(&#34;projects/870316890899/locations/global/memberships/gkeonprem-terraform-test&#34;)
 *             .description(&#34;test cluster&#34;)
 *             .onPremVersion(&#34;1.13.1-gke.35&#34;)
 *             .annotations()
 *             .networkConfig(VMwareClusterNetworkConfigArgs.builder()
 *                 .serviceAddressCidrBlocks(&#34;10.96.0.0/12&#34;)
 *                 .podAddressCidrBlocks(&#34;192.168.0.0/16&#34;)
 *                 .hostConfig(VMwareClusterNetworkConfigHostConfigArgs.builder()
 *                     .dnsServers(&#34;10.254.41.1&#34;)
 *                     .ntpServers(&#34;216.239.35.8&#34;)
 *                     .dnsSearchDomains(&#34;test-domain&#34;)
 *                     .build())
 *                 .staticIpConfig(VMwareClusterNetworkConfigStaticIpConfigArgs.builder()
 *                     .ipBlocks(VMwareClusterNetworkConfigStaticIpConfigIpBlockArgs.builder()
 *                         .netmask(&#34;255.255.252.0&#34;)
 *                         .gateway(&#34;10.251.31.254&#34;)
 *                         .ips(                        
 *                             VMwareClusterNetworkConfigStaticIpConfigIpBlockIpArgs.builder()
 *                                 .ip(&#34;10.251.30.153&#34;)
 *                                 .hostname(&#34;test-hostname1&#34;)
 *                                 .build(),
 *                             VMwareClusterNetworkConfigStaticIpConfigIpBlockIpArgs.builder()
 *                                 .ip(&#34;10.251.31.206&#34;)
 *                                 .hostname(&#34;test-hostname2&#34;)
 *                                 .build(),
 *                             VMwareClusterNetworkConfigStaticIpConfigIpBlockIpArgs.builder()
 *                                 .ip(&#34;10.251.31.193&#34;)
 *                                 .hostname(&#34;test-hostname3&#34;)
 *                                 .build(),
 *                             VMwareClusterNetworkConfigStaticIpConfigIpBlockIpArgs.builder()
 *                                 .ip(&#34;10.251.30.230&#34;)
 *                                 .hostname(&#34;test-hostname4&#34;)
 *                                 .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .controlPlaneNode(VMwareClusterControlPlaneNodeArgs.builder()
 *                 .cpus(4)
 *                 .memory(8192)
 *                 .replicas(1)
 *                 .autoResizeConfig(VMwareClusterControlPlaneNodeAutoResizeConfigArgs.builder()
 *                     .enabled(true)
 *                     .build())
 *                 .build())
 *             .loadBalancer(VMwareClusterLoadBalancerArgs.builder()
 *                 .vipConfig(VMwareClusterLoadBalancerVipConfigArgs.builder()
 *                     .controlPlaneVip(&#34;10.251.133.5&#34;)
 *                     .ingressVip(&#34;10.251.135.19&#34;)
 *                     .build())
 *                 .manualLbConfig(VMwareClusterLoadBalancerManualLbConfigArgs.builder()
 *                     .ingressHttpNodePort(30005)
 *                     .ingressHttpsNodePort(30006)
 *                     .controlPlaneNodePort(30007)
 *                     .konnectivityServerNodePort(30008)
 *                     .build())
 *                 .build())
 *             .dataplaneV2(VMwareClusterDataplaneV2Args.builder()
 *                 .dataplaneV2Enabled(true)
 *                 .windowsDataplaneV2Enabled(true)
 *                 .advancedNetworking(true)
 *                 .build())
 *             .vmTrackingEnabled(true)
 *             .enableControlPlaneV2(true)
 *             .authorization(VMwareClusterAuthorizationArgs.builder()
 *                 .adminUsers(VMwareClusterAuthorizationAdminUserArgs.builder()
 *                     .username(&#34;testuser@gmail.com&#34;)
 *                     .build())
 *                 .build())
 *             .antiAffinityGroups(VMwareClusterAntiAffinityGroupsArgs.builder()
 *                 .aagConfigDisabled(true)
 *                 .build())
 *             .autoRepairConfig(VMwareClusterAutoRepairConfigArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * VmwareCluster can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:gkeonprem/vMwareCluster:VMwareCluster default projects/{{project}}/locations/{{location}}/vmwareClusters/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gkeonprem/vMwareCluster:VMwareCluster default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gkeonprem/vMwareCluster:VMwareCluster default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:gkeonprem/vMwareCluster:VMwareCluster")
public class VMwareCluster extends com.pulumi.resources.CustomResource {
    /**
     * The admin cluster this VMware User Cluster belongs to.
     * This is the full resource name of the admin cluster&#39;s hub membership.
     * In the future, references to other resource types might be allowed if
     * admin clusters are modeled as their own resources.
     * 
     */
    @Export(name="adminClusterMembership", type=String.class, parameters={})
    private Output<String> adminClusterMembership;

    /**
     * @return The admin cluster this VMware User Cluster belongs to.
     * This is the full resource name of the admin cluster&#39;s hub membership.
     * In the future, references to other resource types might be allowed if
     * admin clusters are modeled as their own resources.
     * 
     */
    public Output<String> adminClusterMembership() {
        return this.adminClusterMembership;
    }
    /**
     * Annotations on the VMware User Cluster.
     * This field has the same restrictions as Kubernetes annotations.
     * The total size of all keys and values combined is limited to 256k.
     * Key can have 2 segments: prefix (optional) and name (required),
     * separated by a slash (/).
     * Prefix must be a DNS subdomain.
     * Name must be 63 characters or less, begin and end with alphanumerics,
     * with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> annotations;

    /**
     * @return Annotations on the VMware User Cluster.
     * This field has the same restrictions as Kubernetes annotations.
     * The total size of all keys and values combined is limited to 256k.
     * Key can have 2 segments: prefix (optional) and name (required),
     * separated by a slash (/).
     * Prefix must be a DNS subdomain.
     * Name must be 63 characters or less, begin and end with alphanumerics,
     * with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    public Output<Map<String,String>> annotations() {
        return this.annotations;
    }
    /**
     * AAGConfig specifies whether to spread VMware User Cluster nodes across at
     * least three physical hosts in the datacenter.
     * Structure is documented below.
     * 
     */
    @Export(name="antiAffinityGroups", type=VMwareClusterAntiAffinityGroups.class, parameters={})
    private Output<VMwareClusterAntiAffinityGroups> antiAffinityGroups;

    /**
     * @return AAGConfig specifies whether to spread VMware User Cluster nodes across at
     * least three physical hosts in the datacenter.
     * Structure is documented below.
     * 
     */
    public Output<VMwareClusterAntiAffinityGroups> antiAffinityGroups() {
        return this.antiAffinityGroups;
    }
    /**
     * RBAC policy that will be applied and managed by GKE On-Prem.
     * Structure is documented below.
     * 
     */
    @Export(name="authorization", type=VMwareClusterAuthorization.class, parameters={})
    private Output</* @Nullable */ VMwareClusterAuthorization> authorization;

    /**
     * @return RBAC policy that will be applied and managed by GKE On-Prem.
     * Structure is documented below.
     * 
     */
    public Output<Optional<VMwareClusterAuthorization>> authorization() {
        return Codegen.optional(this.authorization);
    }
    /**
     * Configuration for auto repairing.
     * Structure is documented below.
     * 
     */
    @Export(name="autoRepairConfig", type=VMwareClusterAutoRepairConfig.class, parameters={})
    private Output<VMwareClusterAutoRepairConfig> autoRepairConfig;

    /**
     * @return Configuration for auto repairing.
     * Structure is documented below.
     * 
     */
    public Output<VMwareClusterAutoRepairConfig> autoRepairConfig() {
        return this.autoRepairConfig;
    }
    /**
     * VMware User Cluster control plane nodes must have either 1 or 3 replicas.
     * Structure is documented below.
     * 
     */
    @Export(name="controlPlaneNode", type=VMwareClusterControlPlaneNode.class, parameters={})
    private Output<VMwareClusterControlPlaneNode> controlPlaneNode;

    /**
     * @return VMware User Cluster control plane nodes must have either 1 or 3 replicas.
     * Structure is documented below.
     * 
     */
    public Output<VMwareClusterControlPlaneNode> controlPlaneNode() {
        return this.controlPlaneNode;
    }
    /**
     * The time at which VMware User Cluster was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which VMware User Cluster was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * VmwareDataplaneV2Config specifies configuration for Dataplane V2.
     * Structure is documented below.
     * 
     */
    @Export(name="dataplaneV2", type=VMwareClusterDataplaneV2.class, parameters={})
    private Output<VMwareClusterDataplaneV2> dataplaneV2;

    /**
     * @return VmwareDataplaneV2Config specifies configuration for Dataplane V2.
     * Structure is documented below.
     * 
     */
    public Output<VMwareClusterDataplaneV2> dataplaneV2() {
        return this.dataplaneV2;
    }
    /**
     * The time at which VMware User Cluster was deleted.
     * 
     */
    @Export(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    /**
     * @return The time at which VMware User Cluster was deleted.
     * 
     */
    public Output<String> deleteTime() {
        return this.deleteTime;
    }
    /**
     * A human readable description of this VMware User Cluster.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A human readable description of this VMware User Cluster.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Enable control plane V2. Default to false.
     * 
     */
    @Export(name="enableControlPlaneV2", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableControlPlaneV2;

    /**
     * @return Enable control plane V2. Default to false.
     * 
     */
    public Output<Optional<Boolean>> enableControlPlaneV2() {
        return Codegen.optional(this.enableControlPlaneV2);
    }
    /**
     * The DNS name of VMware User Cluster&#39;s API server.
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The DNS name of VMware User Cluster&#39;s API server.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     * Allows clients to perform consistent read-modify-writes
     * through optimistic concurrency control.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     * Allows clients to perform consistent read-modify-writes
     * through optimistic concurrency control.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Fleet configuration for the cluster.
     * Structure is documented below.
     * 
     */
    @Export(name="fleets", type=List.class, parameters={VMwareClusterFleet.class})
    private Output<List<VMwareClusterFleet>> fleets;

    /**
     * @return Fleet configuration for the cluster.
     * Structure is documented below.
     * 
     */
    public Output<List<VMwareClusterFleet>> fleets() {
        return this.fleets;
    }
    /**
     * Load Balancer configuration.
     * Structure is documented below.
     * 
     */
    @Export(name="loadBalancer", type=VMwareClusterLoadBalancer.class, parameters={})
    private Output</* @Nullable */ VMwareClusterLoadBalancer> loadBalancer;

    /**
     * @return Load Balancer configuration.
     * Structure is documented below.
     * 
     */
    public Output<Optional<VMwareClusterLoadBalancer>> loadBalancer() {
        return Codegen.optional(this.loadBalancer);
    }
    /**
     * The object name of the VMware OnPremUserCluster custom resource on the
     * associated admin cluster. This field is used to support conflicting
     * names when enrolling existing clusters to the API. When used as a part of
     * cluster enrollment, this field will differ from the ID in the resource
     * name. For new clusters, this field will match the user provided cluster ID
     * and be visible in the last component of the resource name. It is not
     * modifiable.
     * All users should use this name to access their cluster using gkectl or
     * kubectl and should expect to see the local name when viewing admin
     * cluster controller logs.
     * 
     */
    @Export(name="localName", type=String.class, parameters={})
    private Output<String> localName;

    /**
     * @return The object name of the VMware OnPremUserCluster custom resource on the
     * associated admin cluster. This field is used to support conflicting
     * names when enrolling existing clusters to the API. When used as a part of
     * cluster enrollment, this field will differ from the ID in the resource
     * name. For new clusters, this field will match the user provided cluster ID
     * and be visible in the last component of the resource name. It is not
     * modifiable.
     * All users should use this name to access their cluster using gkectl or
     * kubectl and should expect to see the local name when viewing admin
     * cluster controller logs.
     * 
     */
    public Output<String> localName() {
        return this.localName;
    }
    /**
     * The location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The VMware cluster name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The VMware cluster name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The VMware User Cluster network configuration.
     * Structure is documented below.
     * 
     */
    @Export(name="networkConfig", type=VMwareClusterNetworkConfig.class, parameters={})
    private Output</* @Nullable */ VMwareClusterNetworkConfig> networkConfig;

    /**
     * @return The VMware User Cluster network configuration.
     * Structure is documented below.
     * 
     */
    public Output<Optional<VMwareClusterNetworkConfig>> networkConfig() {
        return Codegen.optional(this.networkConfig);
    }
    /**
     * The Anthos clusters on the VMware version for your user cluster.
     * 
     */
    @Export(name="onPremVersion", type=String.class, parameters={})
    private Output<String> onPremVersion;

    /**
     * @return The Anthos clusters on the VMware version for your user cluster.
     * 
     */
    public Output<String> onPremVersion() {
        return this.onPremVersion;
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
     * If set, there are currently changes in flight to the VMware User Cluster.
     * 
     */
    @Export(name="reconciling", type=Boolean.class, parameters={})
    private Output<Boolean> reconciling;

    /**
     * @return If set, there are currently changes in flight to the VMware User Cluster.
     * 
     */
    public Output<Boolean> reconciling() {
        return this.reconciling;
    }
    /**
     * (Output)
     * The lifecycle state of the condition.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return (Output)
     * The lifecycle state of the condition.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * (Output)
     * Specifies the detailed validation check status
     * Structure is documented below.
     * 
     */
    @Export(name="statuses", type=List.class, parameters={VMwareClusterStatus.class})
    private Output<List<VMwareClusterStatus>> statuses;

    /**
     * @return (Output)
     * Specifies the detailed validation check status
     * Structure is documented below.
     * 
     */
    public Output<List<VMwareClusterStatus>> statuses() {
        return this.statuses;
    }
    /**
     * Storage configuration.
     * Structure is documented below.
     * 
     */
    @Export(name="storage", type=VMwareClusterStorage.class, parameters={})
    private Output<VMwareClusterStorage> storage;

    /**
     * @return Storage configuration.
     * Structure is documented below.
     * 
     */
    public Output<VMwareClusterStorage> storage() {
        return this.storage;
    }
    /**
     * The unique identifier of the VMware User Cluster.
     * 
     */
    @Export(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return The unique identifier of the VMware User Cluster.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * The time at which VMware User Cluster was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time at which VMware User Cluster was last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * ValidationCheck represents the result of the preflight check job.
     * Structure is documented below.
     * 
     */
    @Export(name="validationChecks", type=List.class, parameters={VMwareClusterValidationCheck.class})
    private Output<List<VMwareClusterValidationCheck>> validationChecks;

    /**
     * @return ValidationCheck represents the result of the preflight check job.
     * Structure is documented below.
     * 
     */
    public Output<List<VMwareClusterValidationCheck>> validationChecks() {
        return this.validationChecks;
    }
    /**
     * VmwareVCenterConfig specifies vCenter config for the user cluster.
     * Inherited from the admin cluster.
     * Structure is documented below.
     * 
     */
    @Export(name="vcenters", type=List.class, parameters={VMwareClusterVcenter.class})
    private Output<List<VMwareClusterVcenter>> vcenters;

    /**
     * @return VmwareVCenterConfig specifies vCenter config for the user cluster.
     * Inherited from the admin cluster.
     * Structure is documented below.
     * 
     */
    public Output<List<VMwareClusterVcenter>> vcenters() {
        return this.vcenters;
    }
    /**
     * Enable VM tracking.
     * 
     */
    @Export(name="vmTrackingEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> vmTrackingEnabled;

    /**
     * @return Enable VM tracking.
     * 
     */
    public Output<Boolean> vmTrackingEnabled() {
        return this.vmTrackingEnabled;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VMwareCluster(String name) {
        this(name, VMwareClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VMwareCluster(String name, VMwareClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VMwareCluster(String name, VMwareClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gkeonprem/vMwareCluster:VMwareCluster", name, args == null ? VMwareClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VMwareCluster(String name, Output<String> id, @Nullable VMwareClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gkeonprem/vMwareCluster:VMwareCluster", name, state, makeResourceOptions(options, id));
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
    public static VMwareCluster get(String name, Output<String> id, @Nullable VMwareClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VMwareCluster(name, id, state, options);
    }
}