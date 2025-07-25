// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs;
import com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupState;
import com.pulumi.gcp.compute.outputs.RegionNetworkEndpointGroupAppEngine;
import com.pulumi.gcp.compute.outputs.RegionNetworkEndpointGroupCloudFunction;
import com.pulumi.gcp.compute.outputs.RegionNetworkEndpointGroupCloudRun;
import com.pulumi.gcp.compute.outputs.RegionNetworkEndpointGroupPscData;
import com.pulumi.gcp.compute.outputs.RegionNetworkEndpointGroupServerlessDeployment;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A regional NEG that can support Serverless Products, proxying traffic to
 * external backends and providing traffic to the PSC port mapping endpoints.
 * 
 * To get more information about RegionNetworkEndpointGroup, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/regionNetworkEndpointGroups)
 * * How-to Guides
 *     * [Internet NEGs Official Documentation](https://cloud.google.com/load-balancing/docs/negs/internet-neg-concepts)
 *     * [Serverless NEGs Official Documentation](https://cloud.google.com/load-balancing/docs/negs/serverless-neg-concepts)
 * 
 * ## Example Usage
 * 
 * ### Region Network Endpoint Group Functions
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.storage.Bucket;
 * import com.pulumi.gcp.storage.BucketArgs;
 * import com.pulumi.gcp.storage.BucketObject;
 * import com.pulumi.gcp.storage.BucketObjectArgs;
 * import com.pulumi.gcp.cloudfunctions.Function;
 * import com.pulumi.gcp.cloudfunctions.FunctionArgs;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroup;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs;
 * import com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupCloudFunctionArgs;
 * import com.pulumi.asset.FileAsset;
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
 *         var bucket = new Bucket("bucket", BucketArgs.builder()
 *             .name("cloudfunctions-function-example-bucket")
 *             .location("US")
 *             .build());
 * 
 *         var archive = new BucketObject("archive", BucketObjectArgs.builder()
 *             .name("index.zip")
 *             .bucket(bucket.name())
 *             .source(new FileAsset("path/to/index.zip"))
 *             .build());
 * 
 *         var functionNegFunction = new Function("functionNegFunction", FunctionArgs.builder()
 *             .name("function-neg")
 *             .description("My function")
 *             .runtime("nodejs20")
 *             .availableMemoryMb(128)
 *             .sourceArchiveBucket(bucket.name())
 *             .sourceArchiveObject(archive.name())
 *             .triggerHttp(true)
 *             .timeout(60)
 *             .entryPoint("helloGET")
 *             .build());
 * 
 *         // Cloud Functions Example
 *         var functionNeg = new RegionNetworkEndpointGroup("functionNeg", RegionNetworkEndpointGroupArgs.builder()
 *             .name("function-neg")
 *             .networkEndpointType("SERVERLESS")
 *             .region("us-central1")
 *             .cloudFunction(RegionNetworkEndpointGroupCloudFunctionArgs.builder()
 *                 .function(functionNegFunction.name())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Region Network Endpoint Group Cloudrun
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.cloudrun.Service;
 * import com.pulumi.gcp.cloudrun.ServiceArgs;
 * import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateArgs;
 * import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecArgs;
 * import com.pulumi.gcp.cloudrun.inputs.ServiceTrafficArgs;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroup;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs;
 * import com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupCloudRunArgs;
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
 *         var cloudrunNegService = new Service("cloudrunNegService", ServiceArgs.builder()
 *             .name("cloudrun-neg")
 *             .location("us-central1")
 *             .template(ServiceTemplateArgs.builder()
 *                 .spec(ServiceTemplateSpecArgs.builder()
 *                     .containers(ServiceTemplateSpecContainerArgs.builder()
 *                         .image("us-docker.pkg.dev/cloudrun/container/hello")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .traffics(ServiceTrafficArgs.builder()
 *                 .percent(100)
 *                 .latestRevision(true)
 *                 .build())
 *             .build());
 * 
 *         // Cloud Run Example
 *         var cloudrunNeg = new RegionNetworkEndpointGroup("cloudrunNeg", RegionNetworkEndpointGroupArgs.builder()
 *             .name("cloudrun-neg")
 *             .networkEndpointType("SERVERLESS")
 *             .region("us-central1")
 *             .cloudRun(RegionNetworkEndpointGroupCloudRunArgs.builder()
 *                 .service(cloudrunNegService.name())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Region Network Endpoint Group Appengine
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.storage.Bucket;
 * import com.pulumi.gcp.storage.BucketArgs;
 * import com.pulumi.gcp.storage.BucketObject;
 * import com.pulumi.gcp.storage.BucketObjectArgs;
 * import com.pulumi.gcp.appengine.FlexibleAppVersion;
 * import com.pulumi.gcp.appengine.FlexibleAppVersionArgs;
 * import com.pulumi.gcp.appengine.inputs.FlexibleAppVersionFlexibleRuntimeSettingsArgs;
 * import com.pulumi.gcp.appengine.inputs.FlexibleAppVersionEntrypointArgs;
 * import com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentArgs;
 * import com.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentZipArgs;
 * import com.pulumi.gcp.appengine.inputs.FlexibleAppVersionLivenessCheckArgs;
 * import com.pulumi.gcp.appengine.inputs.FlexibleAppVersionReadinessCheckArgs;
 * import com.pulumi.gcp.appengine.inputs.FlexibleAppVersionHandlerArgs;
 * import com.pulumi.gcp.appengine.inputs.FlexibleAppVersionHandlerStaticFilesArgs;
 * import com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingArgs;
 * import com.pulumi.gcp.appengine.inputs.FlexibleAppVersionAutomaticScalingCpuUtilizationArgs;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroup;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs;
 * import com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupAppEngineArgs;
 * import com.pulumi.asset.FileAsset;
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
 *         var appengineNegBucket = new Bucket("appengineNegBucket", BucketArgs.builder()
 *             .name("appengine-neg")
 *             .location("US")
 *             .uniformBucketLevelAccess(true)
 *             .build());
 * 
 *         var appengineNegBucketObject = new BucketObject("appengineNegBucketObject", BucketObjectArgs.builder()
 *             .name("hello-world.zip")
 *             .bucket(appengineNegBucket.name())
 *             .source(new FileAsset("./test-fixtures/hello-world.zip"))
 *             .build());
 * 
 *         var appengineNegFlexibleAppVersion = new FlexibleAppVersion("appengineNegFlexibleAppVersion", FlexibleAppVersionArgs.builder()
 *             .versionId("v1")
 *             .service("appengine-neg")
 *             .runtime("nodejs")
 *             .flexibleRuntimeSettings(FlexibleAppVersionFlexibleRuntimeSettingsArgs.builder()
 *                 .operatingSystem("ubuntu22")
 *                 .runtimeVersion("20")
 *                 .build())
 *             .entrypoint(FlexibleAppVersionEntrypointArgs.builder()
 *                 .shell("node ./app.js")
 *                 .build())
 *             .deployment(FlexibleAppVersionDeploymentArgs.builder()
 *                 .zip(FlexibleAppVersionDeploymentZipArgs.builder()
 *                     .sourceUrl(Output.tuple(appengineNegBucket.name(), appengineNegBucketObject.name()).applyValue(values -> {
 *                         var appengineNegBucketName = values.t1;
 *                         var appengineNegBucketObjectName = values.t2;
 *                         return String.format("https://storage.googleapis.com/%s/%s", appengineNegBucketName,appengineNegBucketObjectName);
 *                     }))
 *                     .build())
 *                 .build())
 *             .livenessCheck(FlexibleAppVersionLivenessCheckArgs.builder()
 *                 .path("/")
 *                 .build())
 *             .readinessCheck(FlexibleAppVersionReadinessCheckArgs.builder()
 *                 .path("/")
 *                 .build())
 *             .envVariables(Map.of("port", "8080"))
 *             .handlers(FlexibleAppVersionHandlerArgs.builder()
 *                 .urlRegex(".*\\/my-path\\/*")
 *                 .securityLevel("SECURE_ALWAYS")
 *                 .login("LOGIN_REQUIRED")
 *                 .authFailAction("AUTH_FAIL_ACTION_REDIRECT")
 *                 .staticFiles(FlexibleAppVersionHandlerStaticFilesArgs.builder()
 *                     .path("my-other-path")
 *                     .uploadPathRegex(".*\\/my-path\\/*")
 *                     .build())
 *                 .build())
 *             .automaticScaling(FlexibleAppVersionAutomaticScalingArgs.builder()
 *                 .coolDownPeriod("120s")
 *                 .cpuUtilization(FlexibleAppVersionAutomaticScalingCpuUtilizationArgs.builder()
 *                     .targetUtilization(0.5)
 *                     .build())
 *                 .build())
 *             .deleteServiceOnDestroy(true)
 *             .build());
 * 
 *         // App Engine Example
 *         var appengineNeg = new RegionNetworkEndpointGroup("appengineNeg", RegionNetworkEndpointGroupArgs.builder()
 *             .name("appengine-neg")
 *             .networkEndpointType("SERVERLESS")
 *             .region("us-central1")
 *             .appEngine(RegionNetworkEndpointGroupAppEngineArgs.builder()
 *                 .service(appengineNegFlexibleAppVersion.service())
 *                 .version(appengineNegFlexibleAppVersion.versionId())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Region Network Endpoint Group Appengine Empty
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroup;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs;
 * import com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupAppEngineArgs;
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
 *         // App Engine Example
 *         var appengineNeg = new RegionNetworkEndpointGroup("appengineNeg", RegionNetworkEndpointGroupArgs.builder()
 *             .name("appengine-neg")
 *             .networkEndpointType("SERVERLESS")
 *             .region("us-central1")
 *             .appEngine(RegionNetworkEndpointGroupAppEngineArgs.builder()
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Region Network Endpoint Group Psc
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroup;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs;
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
 *         var pscNeg = new RegionNetworkEndpointGroup("pscNeg", RegionNetworkEndpointGroupArgs.builder()
 *             .name("psc-neg")
 *             .region("asia-northeast3")
 *             .networkEndpointType("PRIVATE_SERVICE_CONNECT")
 *             .pscTargetService("asia-northeast3-cloudkms.googleapis.com")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Region Network Endpoint Group Psc Service Attachment
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
 * import com.pulumi.gcp.compute.HealthCheck;
 * import com.pulumi.gcp.compute.HealthCheckArgs;
 * import com.pulumi.gcp.compute.inputs.HealthCheckTcpHealthCheckArgs;
 * import com.pulumi.gcp.compute.RegionBackendService;
 * import com.pulumi.gcp.compute.RegionBackendServiceArgs;
 * import com.pulumi.gcp.compute.ForwardingRule;
 * import com.pulumi.gcp.compute.ForwardingRuleArgs;
 * import com.pulumi.gcp.compute.ServiceAttachment;
 * import com.pulumi.gcp.compute.ServiceAttachmentArgs;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroup;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs;
 * import com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupPscDataArgs;
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
 *         var default_ = new Network("default", NetworkArgs.builder()
 *             .name("psc-network")
 *             .build());
 * 
 *         var defaultSubnetwork = new Subnetwork("defaultSubnetwork", SubnetworkArgs.builder()
 *             .name("psc-subnetwork")
 *             .ipCidrRange("10.0.0.0/16")
 *             .region("europe-west4")
 *             .network(default_.id())
 *             .build());
 * 
 *         var pscSubnetwork = new Subnetwork("pscSubnetwork", SubnetworkArgs.builder()
 *             .name("psc-subnetwork-nat")
 *             .ipCidrRange("10.1.0.0/16")
 *             .region("europe-west4")
 *             .purpose("PRIVATE_SERVICE_CONNECT")
 *             .network(default_.id())
 *             .build());
 * 
 *         var defaultHealthCheck = new HealthCheck("defaultHealthCheck", HealthCheckArgs.builder()
 *             .name("psc-healthcheck")
 *             .checkIntervalSec(1)
 *             .timeoutSec(1)
 *             .tcpHealthCheck(HealthCheckTcpHealthCheckArgs.builder()
 *                 .port(80)
 *                 .build())
 *             .build());
 * 
 *         var defaultRegionBackendService = new RegionBackendService("defaultRegionBackendService", RegionBackendServiceArgs.builder()
 *             .name("psc-backend")
 *             .region("europe-west4")
 *             .healthChecks(defaultHealthCheck.id())
 *             .build());
 * 
 *         var defaultForwardingRule = new ForwardingRule("defaultForwardingRule", ForwardingRuleArgs.builder()
 *             .name("psc-forwarding-rule")
 *             .region("europe-west4")
 *             .loadBalancingScheme("INTERNAL")
 *             .backendService(defaultRegionBackendService.id())
 *             .ports(            
 *                 "80",
 *                 "88",
 *                 "443")
 *             .network(default_.name())
 *             .subnetwork(defaultSubnetwork.name())
 *             .build());
 * 
 *         var defaultServiceAttachment = new ServiceAttachment("defaultServiceAttachment", ServiceAttachmentArgs.builder()
 *             .name("psc-service-attachment")
 *             .region("europe-west4")
 *             .description("A service attachment configured with Terraform")
 *             .enableProxyProtocol(false)
 *             .connectionPreference("ACCEPT_AUTOMATIC")
 *             .natSubnets(pscSubnetwork.selfLink())
 *             .targetService(defaultForwardingRule.selfLink())
 *             .build());
 * 
 *         var pscNegServiceAttachment = new RegionNetworkEndpointGroup("pscNegServiceAttachment", RegionNetworkEndpointGroupArgs.builder()
 *             .name("psc-neg")
 *             .region("europe-west4")
 *             .networkEndpointType("PRIVATE_SERVICE_CONNECT")
 *             .pscTargetService(defaultServiceAttachment.selfLink())
 *             .pscData(RegionNetworkEndpointGroupPscDataArgs.builder()
 *                 .producerPort("88")
 *                 .build())
 *             .network(default_.selfLink())
 *             .subnetwork(defaultSubnetwork.selfLink())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Region Network Endpoint Group Internet Ip Port
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
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroup;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs;
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
 *         var default_ = new Network("default", NetworkArgs.builder()
 *             .name("network")
 *             .build());
 * 
 *         var regionNetworkEndpointGroupInternetIpPort = new RegionNetworkEndpointGroup("regionNetworkEndpointGroupInternetIpPort", RegionNetworkEndpointGroupArgs.builder()
 *             .name("ip-port-neg")
 *             .region("us-central1")
 *             .network(default_.id())
 *             .networkEndpointType("INTERNET_IP_PORT")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Region Network Endpoint Group Internet Fqdn Port
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
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroup;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs;
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
 *         var default_ = new Network("default", NetworkArgs.builder()
 *             .name("network")
 *             .build());
 * 
 *         var regionNetworkEndpointGroupInternetFqdnPort = new RegionNetworkEndpointGroup("regionNetworkEndpointGroupInternetFqdnPort", RegionNetworkEndpointGroupArgs.builder()
 *             .name("ip-port-neg")
 *             .region("us-central1")
 *             .network(default_.id())
 *             .networkEndpointType("INTERNET_FQDN_PORT")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Region Network Endpoint Group Portmap
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
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroup;
 * import com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs;
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
 *         var default_ = new Network("default", NetworkArgs.builder()
 *             .name("network")
 *             .build());
 * 
 *         var defaultSubnetwork = new Subnetwork("defaultSubnetwork", SubnetworkArgs.builder()
 *             .name("subnetwork")
 *             .ipCidrRange("10.0.0.0/16")
 *             .region("us-central1")
 *             .network(default_.id())
 *             .build());
 * 
 *         var regionNetworkEndpointGroupPortmap = new RegionNetworkEndpointGroup("regionNetworkEndpointGroupPortmap", RegionNetworkEndpointGroupArgs.builder()
 *             .name("portmap-neg")
 *             .region("us-central1")
 *             .network(default_.id())
 *             .subnetwork(defaultSubnetwork.id())
 *             .networkEndpointType("GCE_VM_IP_PORTMAP")
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
 * RegionNetworkEndpointGroup can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/regions/{{region}}/networkEndpointGroups/{{name}}`
 * 
 * * `{{project}}/{{region}}/{{name}}`
 * 
 * * `{{region}}/{{name}}`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, RegionNetworkEndpointGroup can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup default projects/{{project}}/regions/{{region}}/networkEndpointGroups/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup")
public class RegionNetworkEndpointGroup extends com.pulumi.resources.CustomResource {
    /**
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloud_function or serverless_deployment may be set.
     * Structure is documented below.
     * 
     */
    @Export(name="appEngine", refs={RegionNetworkEndpointGroupAppEngine.class}, tree="[0]")
    private Output</* @Nullable */ RegionNetworkEndpointGroupAppEngine> appEngine;

    /**
     * @return This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloud_function or serverless_deployment may be set.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RegionNetworkEndpointGroupAppEngine>> appEngine() {
        return Codegen.optional(this.appEngine);
    }
    /**
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloud_function or serverless_deployment may be set.
     * Structure is documented below.
     * 
     */
    @Export(name="cloudFunction", refs={RegionNetworkEndpointGroupCloudFunction.class}, tree="[0]")
    private Output</* @Nullable */ RegionNetworkEndpointGroupCloudFunction> cloudFunction;

    /**
     * @return This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloud_function or serverless_deployment may be set.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RegionNetworkEndpointGroupCloudFunction>> cloudFunction() {
        return Codegen.optional(this.cloudFunction);
    }
    /**
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloud_function or serverless_deployment may be set.
     * Structure is documented below.
     * 
     */
    @Export(name="cloudRun", refs={RegionNetworkEndpointGroupCloudRun.class}, tree="[0]")
    private Output</* @Nullable */ RegionNetworkEndpointGroupCloudRun> cloudRun;

    /**
     * @return This field is only used for SERVERLESS NEGs.
     * Only one of cloud_run, app_engine, cloud_function or serverless_deployment may be set.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RegionNetworkEndpointGroupCloudRun>> cloudRun() {
        return Codegen.optional(this.cloudRun);
    }
    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * This field is only used for PSC and INTERNET NEGs.
     * The URL of the network to which all network endpoints in the NEG belong. Uses
     * &#34;default&#34; project network if unspecified.
     * 
     */
    @Export(name="network", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> network;

    /**
     * @return This field is only used for PSC and INTERNET NEGs.
     * The URL of the network to which all network endpoints in the NEG belong. Uses
     * &#34;default&#34; project network if unspecified.
     * 
     */
    public Output<Optional<String>> network() {
        return Codegen.optional(this.network);
    }
    /**
     * Type of network endpoints in this network endpoint group. Defaults to SERVERLESS.
     * Default value is `SERVERLESS`.
     * Possible values are: `SERVERLESS`, `PRIVATE_SERVICE_CONNECT`, `INTERNET_IP_PORT`, `INTERNET_FQDN_PORT`, `GCE_VM_IP_PORTMAP`.
     * 
     */
    @Export(name="networkEndpointType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> networkEndpointType;

    /**
     * @return Type of network endpoints in this network endpoint group. Defaults to SERVERLESS.
     * Default value is `SERVERLESS`.
     * Possible values are: `SERVERLESS`, `PRIVATE_SERVICE_CONNECT`, `INTERNET_IP_PORT`, `INTERNET_FQDN_PORT`, `GCE_VM_IP_PORTMAP`.
     * 
     */
    public Output<Optional<String>> networkEndpointType() {
        return Codegen.optional(this.networkEndpointType);
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
     * This field is only used for PSC NEGs.
     * Structure is documented below.
     * 
     */
    @Export(name="pscData", refs={RegionNetworkEndpointGroupPscData.class}, tree="[0]")
    private Output<RegionNetworkEndpointGroupPscData> pscData;

    /**
     * @return This field is only used for PSC NEGs.
     * Structure is documented below.
     * 
     */
    public Output<RegionNetworkEndpointGroupPscData> pscData() {
        return this.pscData;
    }
    /**
     * This field is only used for PSC and INTERNET NEGs.
     * The target service url used to set up private service connection to
     * a Google API or a PSC Producer Service Attachment.
     * 
     */
    @Export(name="pscTargetService", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pscTargetService;

    /**
     * @return This field is only used for PSC and INTERNET NEGs.
     * The target service url used to set up private service connection to
     * a Google API or a PSC Producer Service Attachment.
     * 
     */
    public Output<Optional<String>> pscTargetService() {
        return Codegen.optional(this.pscTargetService);
    }
    /**
     * A reference to the region where the regional NEGs reside.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return A reference to the region where the regional NEGs reside.
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
     * This field is only used for SERVERLESS NEGs.
     * Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     * 
     */
    @Export(name="serverlessDeployment", refs={RegionNetworkEndpointGroupServerlessDeployment.class}, tree="[0]")
    private Output</* @Nullable */ RegionNetworkEndpointGroupServerlessDeployment> serverlessDeployment;

    /**
     * @return This field is only used for SERVERLESS NEGs.
     * Only one of cloudRun, appEngine, cloudFunction or serverlessDeployment may be set.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RegionNetworkEndpointGroupServerlessDeployment>> serverlessDeployment() {
        return Codegen.optional(this.serverlessDeployment);
    }
    /**
     * This field is only used for PSC NEGs.
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    @Export(name="subnetwork", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subnetwork;

    /**
     * @return This field is only used for PSC NEGs.
     * Optional URL of the subnetwork to which all network endpoints in the NEG belong.
     * 
     */
    public Output<Optional<String>> subnetwork() {
        return Codegen.optional(this.subnetwork);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionNetworkEndpointGroup(java.lang.String name) {
        this(name, RegionNetworkEndpointGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionNetworkEndpointGroup(java.lang.String name, RegionNetworkEndpointGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionNetworkEndpointGroup(java.lang.String name, RegionNetworkEndpointGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RegionNetworkEndpointGroup(java.lang.String name, Output<java.lang.String> id, @Nullable RegionNetworkEndpointGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup", name, state, makeResourceOptions(options, id), false);
    }

    private static RegionNetworkEndpointGroupArgs makeArgs(RegionNetworkEndpointGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RegionNetworkEndpointGroupArgs.Empty : args;
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
    public static RegionNetworkEndpointGroup get(java.lang.String name, Output<java.lang.String> id, @Nullable RegionNetworkEndpointGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegionNetworkEndpointGroup(name, id, state, options);
    }
}
