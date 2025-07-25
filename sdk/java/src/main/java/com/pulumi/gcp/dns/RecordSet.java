// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.dns.RecordSetArgs;
import com.pulumi.gcp.dns.inputs.RecordSetState;
import com.pulumi.gcp.dns.outputs.RecordSetRoutingPolicy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Binding a DNS name to the ephemeral IP of a new instance:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.Instance;
 * import com.pulumi.gcp.compute.InstanceArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceBootDiskArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceBootDiskInitializeParamsArgs;
 * import com.pulumi.gcp.dns.ManagedZone;
 * import com.pulumi.gcp.dns.ManagedZoneArgs;
 * import com.pulumi.gcp.dns.RecordSet;
 * import com.pulumi.gcp.dns.RecordSetArgs;
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
 *         var frontendInstance = new Instance("frontendInstance", InstanceArgs.builder()
 *             .networkInterfaces(InstanceNetworkInterfaceArgs.builder()
 *                 .accessConfigs(InstanceNetworkInterfaceAccessConfigArgs.builder()
 *                     .build())
 *                 .network("default")
 *                 .build())
 *             .name("frontend")
 *             .machineType("g1-small")
 *             .zone("us-central1-b")
 *             .bootDisk(InstanceBootDiskArgs.builder()
 *                 .initializeParams(InstanceBootDiskInitializeParamsArgs.builder()
 *                     .image("debian-cloud/debian-11")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var prod = new ManagedZone("prod", ManagedZoneArgs.builder()
 *             .name("prod-zone")
 *             .dnsName("prod.mydomain.com.")
 *             .build());
 * 
 *         var frontend = new RecordSet("frontend", RecordSetArgs.builder()
 *             .name(prod.dnsName().applyValue(_dnsName -> String.format("frontend.%s", _dnsName)))
 *             .type("A")
 *             .ttl(300)
 *             .managedZone(prod.name())
 *             .rrdatas(frontendInstance.networkInterfaces().applyValue(_networkInterfaces -> _networkInterfaces[0].accessConfigs()[0].natIp()))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Adding an A record
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.dns.ManagedZone;
 * import com.pulumi.gcp.dns.ManagedZoneArgs;
 * import com.pulumi.gcp.dns.RecordSet;
 * import com.pulumi.gcp.dns.RecordSetArgs;
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
 *         var prod = new ManagedZone("prod", ManagedZoneArgs.builder()
 *             .name("prod-zone")
 *             .dnsName("prod.mydomain.com.")
 *             .build());
 * 
 *         var a = new RecordSet("a", RecordSetArgs.builder()
 *             .name(prod.dnsName().applyValue(_dnsName -> String.format("backend.%s", _dnsName)))
 *             .managedZone(prod.name())
 *             .type("A")
 *             .ttl(300)
 *             .rrdatas("8.8.8.8")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Adding an MX record
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.dns.ManagedZone;
 * import com.pulumi.gcp.dns.ManagedZoneArgs;
 * import com.pulumi.gcp.dns.RecordSet;
 * import com.pulumi.gcp.dns.RecordSetArgs;
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
 *         var prod = new ManagedZone("prod", ManagedZoneArgs.builder()
 *             .name("prod-zone")
 *             .dnsName("prod.mydomain.com.")
 *             .build());
 * 
 *         var mx = new RecordSet("mx", RecordSetArgs.builder()
 *             .name(prod.dnsName())
 *             .managedZone(prod.name())
 *             .type("MX")
 *             .ttl(3600)
 *             .rrdatas(            
 *                 "1 aspmx.l.google.com.",
 *                 "5 alt1.aspmx.l.google.com.",
 *                 "5 alt2.aspmx.l.google.com.",
 *                 "10 alt3.aspmx.l.google.com.",
 *                 "10 alt4.aspmx.l.google.com.")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Adding an SPF record
 * 
 * Quotes (`&#34;&#34;`) must be added around your `rrdatas` for a SPF record. Otherwise `rrdatas` string gets split on spaces.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.dns.ManagedZone;
 * import com.pulumi.gcp.dns.ManagedZoneArgs;
 * import com.pulumi.gcp.dns.RecordSet;
 * import com.pulumi.gcp.dns.RecordSetArgs;
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
 *         var prod = new ManagedZone("prod", ManagedZoneArgs.builder()
 *             .name("prod-zone")
 *             .dnsName("prod.mydomain.com.")
 *             .build());
 * 
 *         var spf = new RecordSet("spf", RecordSetArgs.builder()
 *             .name(prod.dnsName().applyValue(_dnsName -> String.format("frontend.%s", _dnsName)))
 *             .managedZone(prod.name())
 *             .type("TXT")
 *             .ttl(300)
 *             .rrdatas("\"v=spf1 ip4:111.111.111.111 include:backoff.email-example.com -all\"")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Adding a CNAME record
 * 
 *  The list of `rrdatas` should only contain a single string corresponding to the Canonical Name intended.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.dns.ManagedZone;
 * import com.pulumi.gcp.dns.ManagedZoneArgs;
 * import com.pulumi.gcp.dns.RecordSet;
 * import com.pulumi.gcp.dns.RecordSetArgs;
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
 *         var prod = new ManagedZone("prod", ManagedZoneArgs.builder()
 *             .name("prod-zone")
 *             .dnsName("prod.mydomain.com.")
 *             .build());
 * 
 *         var cname = new RecordSet("cname", RecordSetArgs.builder()
 *             .name(prod.dnsName().applyValue(_dnsName -> String.format("frontend.%s", _dnsName)))
 *             .managedZone(prod.name())
 *             .type("CNAME")
 *             .ttl(300)
 *             .rrdatas("frontend.mydomain.com.")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Setting Routing Policy instead of using rrdatas
 * ### Geolocation
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.dns.RecordSet;
 * import com.pulumi.gcp.dns.RecordSetArgs;
 * import com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs;
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
 *         var geo = new RecordSet("geo", RecordSetArgs.builder()
 *             .name(String.format("backend.%s", prod.dnsName()))
 *             .managedZone(prod.name())
 *             .type("A")
 *             .ttl(300)
 *             .routingPolicy(RecordSetRoutingPolicyArgs.builder()
 *                 .geos(                
 *                     RecordSetRoutingPolicyGeoArgs.builder()
 *                         .location("asia-east1")
 *                         .rrdatas("10.128.1.1")
 *                         .build(),
 *                     RecordSetRoutingPolicyGeoArgs.builder()
 *                         .location("us-central1")
 *                         .rrdatas("10.130.1.1")
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Failover
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.dns.ManagedZone;
 * import com.pulumi.gcp.dns.ManagedZoneArgs;
 * import com.pulumi.gcp.compute.RegionBackendService;
 * import com.pulumi.gcp.compute.RegionBackendServiceArgs;
 * import com.pulumi.gcp.compute.Network;
 * import com.pulumi.gcp.compute.NetworkArgs;
 * import com.pulumi.gcp.compute.ForwardingRule;
 * import com.pulumi.gcp.compute.ForwardingRuleArgs;
 * import com.pulumi.gcp.dns.RecordSet;
 * import com.pulumi.gcp.dns.RecordSetArgs;
 * import com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs;
 * import com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupArgs;
 * import com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupPrimaryArgs;
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
 *         var prod = new ManagedZone("prod", ManagedZoneArgs.builder()
 *             .name("prod-zone")
 *             .dnsName("prod.mydomain.com.")
 *             .visibility("private")
 *             .build());
 * 
 *         var prodRegionBackendService = new RegionBackendService("prodRegionBackendService", RegionBackendServiceArgs.builder()
 *             .name("prod-backend")
 *             .region("us-central1")
 *             .build());
 * 
 *         var prodNetwork = new Network("prodNetwork", NetworkArgs.builder()
 *             .name("prod-network")
 *             .build());
 * 
 *         var prodForwardingRule = new ForwardingRule("prodForwardingRule", ForwardingRuleArgs.builder()
 *             .name("prod-ilb")
 *             .region("us-central1")
 *             .loadBalancingScheme("INTERNAL")
 *             .backendService(prodRegionBackendService.id())
 *             .allPorts(true)
 *             .network(prodNetwork.name())
 *             .allowGlobalAccess(true)
 *             .build());
 * 
 *         var a = new RecordSet("a", RecordSetArgs.builder()
 *             .name(prod.dnsName().applyValue(_dnsName -> String.format("backend.%s", _dnsName)))
 *             .managedZone(prod.name())
 *             .type("A")
 *             .ttl(300)
 *             .routingPolicy(RecordSetRoutingPolicyArgs.builder()
 *                 .primaryBackup(RecordSetRoutingPolicyPrimaryBackupArgs.builder()
 *                     .trickleRatio(0.1)
 *                     .primary(RecordSetRoutingPolicyPrimaryBackupPrimaryArgs.builder()
 *                         .internalLoadBalancers(RecordSetRoutingPolicyPrimaryBackupPrimaryInternalLoadBalancerArgs.builder()
 *                             .loadBalancerType("regionalL4ilb")
 *                             .ipAddress(prodForwardingRule.ipAddress())
 *                             .port("80")
 *                             .ipProtocol("tcp")
 *                             .networkUrl(prodNetwork.id())
 *                             .project(prodForwardingRule.project())
 *                             .region(prodForwardingRule.region())
 *                             .build())
 *                         .build())
 *                     .backupGeos(                    
 *                         RecordSetRoutingPolicyPrimaryBackupBackupGeoArgs.builder()
 *                             .location("asia-east1")
 *                             .rrdatas("10.128.1.1")
 *                             .build(),
 *                         RecordSetRoutingPolicyPrimaryBackupBackupGeoArgs.builder()
 *                             .location("us-west1")
 *                             .rrdatas("10.130.1.1")
 *                             .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Public zone failover
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.HealthCheck;
 * import com.pulumi.gcp.compute.HealthCheckArgs;
 * import com.pulumi.gcp.compute.inputs.HealthCheckHttpHealthCheckArgs;
 * import com.pulumi.gcp.dns.ManagedZone;
 * import com.pulumi.gcp.dns.ManagedZoneArgs;
 * import com.pulumi.gcp.dns.RecordSet;
 * import com.pulumi.gcp.dns.RecordSetArgs;
 * import com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs;
 * import com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupArgs;
 * import com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupPrimaryArgs;
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
 *         var http_health_check = new HealthCheck("http-health-check", HealthCheckArgs.builder()
 *             .name("http-health-check")
 *             .description("Health check via http")
 *             .timeoutSec(5)
 *             .checkIntervalSec(30)
 *             .healthyThreshold(4)
 *             .unhealthyThreshold(5)
 *             .httpHealthCheck(HealthCheckHttpHealthCheckArgs.builder()
 *                 .portSpecification("USE_SERVING_PORT")
 *                 .build())
 *             .build());
 * 
 *         var prod = new ManagedZone("prod", ManagedZoneArgs.builder()
 *             .name("prod-zone")
 *             .dnsName("prod.mydomain.com.")
 *             .build());
 * 
 *         var a = new RecordSet("a", RecordSetArgs.builder()
 *             .name(prod.dnsName().applyValue(_dnsName -> String.format("backend.%s", _dnsName)))
 *             .managedZone(prod.name())
 *             .type("A")
 *             .ttl(300)
 *             .routingPolicy(RecordSetRoutingPolicyArgs.builder()
 *                 .healthCheck(http_health_check.id())
 *                 .primaryBackup(RecordSetRoutingPolicyPrimaryBackupArgs.builder()
 *                     .trickleRatio(0.1)
 *                     .primary(RecordSetRoutingPolicyPrimaryBackupPrimaryArgs.builder()
 *                         .externalEndpoints("10.128.1.1")
 *                         .build())
 *                     .backupGeos(RecordSetRoutingPolicyPrimaryBackupBackupGeoArgs.builder()
 *                         .location("us-west1")
 *                         .healthCheckedTargets(RecordSetRoutingPolicyPrimaryBackupBackupGeoHealthCheckedTargetsArgs.builder()
 *                             .externalEndpoints("10.130.1.1")
 *                             .build())
 *                         .build())
 *                     .build())
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
 * DNS record sets can be imported using either of these accepted formats:
 * 
 * * `projects/{{project}}/managedZones/{{zone}}/rrsets/{{name}}/{{type}}`
 * 
 * * `{{project}}/{{zone}}/{{name}}/{{type}}`
 * 
 * * `{{zone}}/{{name}}/{{type}}`
 * 
 * When using the `pulumi import` command, DNS record sets can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:dns/recordSet:RecordSet default projects/{{project}}/managedZones/{{zone}}/rrsets/{{name}}/{{type}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:dns/recordSet:RecordSet default {{project}}/{{zone}}/{{name}}/{{type}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:dns/recordSet:RecordSet default {{zone}}/{{name}}/{{type}}
 * ```
 * 
 * Note: The record name must include the trailing dot at the end.
 * 
 */
@ResourceType(type="gcp:dns/recordSet:RecordSet")
public class RecordSet extends com.pulumi.resources.CustomResource {
    /**
     * The name of the zone in which this record set will
     * reside.
     * 
     */
    @Export(name="managedZone", refs={String.class}, tree="[0]")
    private Output<String> managedZone;

    /**
     * @return The name of the zone in which this record set will
     * reside.
     * 
     */
    public Output<String> managedZone() {
        return this.managedZone;
    }
    /**
     * The DNS name this record set will apply to.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The DNS name this record set will apply to.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The configuration for steering traffic based on query.
     * Now you can specify either Weighted Round Robin(WRR) type or Geolocation(GEO) type.
     * Structure is documented below.
     * 
     */
    @Export(name="routingPolicy", refs={RecordSetRoutingPolicy.class}, tree="[0]")
    private Output</* @Nullable */ RecordSetRoutingPolicy> routingPolicy;

    /**
     * @return The configuration for steering traffic based on query.
     * Now you can specify either Weighted Round Robin(WRR) type or Geolocation(GEO) type.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RecordSetRoutingPolicy>> routingPolicy() {
        return Codegen.optional(this.routingPolicy);
    }
    @Export(name="rrdatas", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> rrdatas;

    public Output<Optional<List<String>>> rrdatas() {
        return Codegen.optional(this.rrdatas);
    }
    /**
     * The time-to-live of this record set (seconds).
     * 
     */
    @Export(name="ttl", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> ttl;

    /**
     * @return The time-to-live of this record set (seconds).
     * 
     */
    public Output<Optional<Integer>> ttl() {
        return Codegen.optional(this.ttl);
    }
    /**
     * The DNS record set type.
     * 
     * ***
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The DNS record set type.
     * 
     * ***
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RecordSet(java.lang.String name) {
        this(name, RecordSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RecordSet(java.lang.String name, RecordSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RecordSet(java.lang.String name, RecordSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dns/recordSet:RecordSet", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RecordSet(java.lang.String name, Output<java.lang.String> id, @Nullable RecordSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dns/recordSet:RecordSet", name, state, makeResourceOptions(options, id), false);
    }

    private static RecordSetArgs makeArgs(RecordSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RecordSetArgs.Empty : args;
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
    public static RecordSet get(java.lang.String name, Output<java.lang.String> id, @Nullable RecordSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RecordSet(name, id, state, options);
    }
}
