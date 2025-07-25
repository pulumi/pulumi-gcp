// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.monitoring.UptimeCheckConfigArgs;
import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigState;
import com.pulumi.gcp.monitoring.outputs.UptimeCheckConfigContentMatcher;
import com.pulumi.gcp.monitoring.outputs.UptimeCheckConfigHttpCheck;
import com.pulumi.gcp.monitoring.outputs.UptimeCheckConfigMonitoredResource;
import com.pulumi.gcp.monitoring.outputs.UptimeCheckConfigResourceGroup;
import com.pulumi.gcp.monitoring.outputs.UptimeCheckConfigSyntheticMonitor;
import com.pulumi.gcp.monitoring.outputs.UptimeCheckConfigTcpCheck;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This message configures which resources and services to monitor for availability.
 * 
 * To get more information about UptimeCheckConfig, see:
 * 
 * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.uptimeCheckConfigs)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/monitoring/uptime-checks/)
 * 
 * ## Example Usage
 * 
 * ### Uptime Check Config Http
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.monitoring.UptimeCheckConfig;
 * import com.pulumi.gcp.monitoring.UptimeCheckConfigArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckPingConfigArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigMonitoredResourceArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigContentMatcherArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigContentMatcherJsonPathMatcherArgs;
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
 *         var http = new UptimeCheckConfig("http", UptimeCheckConfigArgs.builder()
 *             .displayName("http-uptime-check")
 *             .timeout("60s")
 *             .logCheckFailures(true)
 *             .userLabels(Map.of("example-key", "example-value"))
 *             .httpCheck(UptimeCheckConfigHttpCheckArgs.builder()
 *                 .path("some-path")
 *                 .port(8010)
 *                 .requestMethod("POST")
 *                 .contentType("USER_PROVIDED")
 *                 .customContentType("application/json")
 *                 .body("Zm9vJTI1M0RiYXI=")
 *                 .pingConfig(UptimeCheckConfigHttpCheckPingConfigArgs.builder()
 *                     .pingsCount(1)
 *                     .build())
 *                 .build())
 *             .monitoredResource(UptimeCheckConfigMonitoredResourceArgs.builder()
 *                 .type("uptime_url")
 *                 .labels(Map.ofEntries(
 *                     Map.entry("project_id", "my-project-name"),
 *                     Map.entry("host", "192.168.1.1")
 *                 ))
 *                 .build())
 *             .contentMatchers(UptimeCheckConfigContentMatcherArgs.builder()
 *                 .content("\"example\"")
 *                 .matcher("MATCHES_JSON_PATH")
 *                 .jsonPathMatcher(UptimeCheckConfigContentMatcherJsonPathMatcherArgs.builder()
 *                     .jsonPath("$.path")
 *                     .jsonMatcher("EXACT_MATCH")
 *                     .build())
 *                 .build())
 *             .checkerType("STATIC_IP_CHECKERS")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Uptime Check Config Http Password Wo
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Uptime Check Config Status Code
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.monitoring.UptimeCheckConfig;
 * import com.pulumi.gcp.monitoring.UptimeCheckConfigArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigMonitoredResourceArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigContentMatcherArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigContentMatcherJsonPathMatcherArgs;
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
 *         var statusCode = new UptimeCheckConfig("statusCode", UptimeCheckConfigArgs.builder()
 *             .displayName("http-uptime-check")
 *             .timeout("60s")
 *             .httpCheck(UptimeCheckConfigHttpCheckArgs.builder()
 *                 .path("some-path")
 *                 .port(8010)
 *                 .requestMethod("POST")
 *                 .contentType("URL_ENCODED")
 *                 .body("Zm9vJTI1M0RiYXI=")
 *                 .acceptedResponseStatusCodes(                
 *                     UptimeCheckConfigHttpCheckAcceptedResponseStatusCodeArgs.builder()
 *                         .statusClass("STATUS_CLASS_2XX")
 *                         .build(),
 *                     UptimeCheckConfigHttpCheckAcceptedResponseStatusCodeArgs.builder()
 *                         .statusValue(301)
 *                         .build(),
 *                     UptimeCheckConfigHttpCheckAcceptedResponseStatusCodeArgs.builder()
 *                         .statusValue(302)
 *                         .build())
 *                 .build())
 *             .monitoredResource(UptimeCheckConfigMonitoredResourceArgs.builder()
 *                 .type("uptime_url")
 *                 .labels(Map.ofEntries(
 *                     Map.entry("project_id", "my-project-name"),
 *                     Map.entry("host", "192.168.1.1")
 *                 ))
 *                 .build())
 *             .contentMatchers(UptimeCheckConfigContentMatcherArgs.builder()
 *                 .content("\"example\"")
 *                 .matcher("MATCHES_JSON_PATH")
 *                 .jsonPathMatcher(UptimeCheckConfigContentMatcherJsonPathMatcherArgs.builder()
 *                     .jsonPath("$.path")
 *                     .jsonMatcher("EXACT_MATCH")
 *                     .build())
 *                 .build())
 *             .checkerType("STATIC_IP_CHECKERS")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Uptime Check Config Https
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.monitoring.UptimeCheckConfig;
 * import com.pulumi.gcp.monitoring.UptimeCheckConfigArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigHttpCheckServiceAgentAuthenticationArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigMonitoredResourceArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigContentMatcherArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigContentMatcherJsonPathMatcherArgs;
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
 *         var https = new UptimeCheckConfig("https", UptimeCheckConfigArgs.builder()
 *             .displayName("https-uptime-check")
 *             .timeout("60s")
 *             .httpCheck(UptimeCheckConfigHttpCheckArgs.builder()
 *                 .path("/some-path")
 *                 .port(443)
 *                 .useSsl(true)
 *                 .validateSsl(true)
 *                 .serviceAgentAuthentication(UptimeCheckConfigHttpCheckServiceAgentAuthenticationArgs.builder()
 *                     .type("OIDC_TOKEN")
 *                     .build())
 *                 .build())
 *             .monitoredResource(UptimeCheckConfigMonitoredResourceArgs.builder()
 *                 .type("uptime_url")
 *                 .labels(Map.ofEntries(
 *                     Map.entry("project_id", "my-project-name"),
 *                     Map.entry("host", "192.168.1.1")
 *                 ))
 *                 .build())
 *             .contentMatchers(UptimeCheckConfigContentMatcherArgs.builder()
 *                 .content("example")
 *                 .matcher("MATCHES_JSON_PATH")
 *                 .jsonPathMatcher(UptimeCheckConfigContentMatcherJsonPathMatcherArgs.builder()
 *                     .jsonPath("$.path")
 *                     .jsonMatcher("REGEX_MATCH")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Uptime Check Tcp
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.monitoring.Group;
 * import com.pulumi.gcp.monitoring.GroupArgs;
 * import com.pulumi.gcp.monitoring.UptimeCheckConfig;
 * import com.pulumi.gcp.monitoring.UptimeCheckConfigArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigTcpCheckArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigTcpCheckPingConfigArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigResourceGroupArgs;
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
 *         var check = new Group("check", GroupArgs.builder()
 *             .displayName("uptime-check-group")
 *             .filter("resource.metadata.name=has_substring(\"foo\")")
 *             .build());
 * 
 *         var tcpGroup = new UptimeCheckConfig("tcpGroup", UptimeCheckConfigArgs.builder()
 *             .displayName("tcp-uptime-check")
 *             .timeout("60s")
 *             .tcpCheck(UptimeCheckConfigTcpCheckArgs.builder()
 *                 .port(888)
 *                 .pingConfig(UptimeCheckConfigTcpCheckPingConfigArgs.builder()
 *                     .pingsCount(2)
 *                     .build())
 *                 .build())
 *             .resourceGroup(UptimeCheckConfigResourceGroupArgs.builder()
 *                 .resourceType("INSTANCE")
 *                 .groupId(check.name())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Uptime Check Config Synthetic Monitor
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
 * import com.pulumi.gcp.cloudfunctionsv2.Function;
 * import com.pulumi.gcp.cloudfunctionsv2.FunctionArgs;
 * import com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigArgs;
 * import com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceArgs;
 * import com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionBuildConfigSourceStorageSourceArgs;
 * import com.pulumi.gcp.cloudfunctionsv2.inputs.FunctionServiceConfigArgs;
 * import com.pulumi.gcp.monitoring.UptimeCheckConfig;
 * import com.pulumi.gcp.monitoring.UptimeCheckConfigArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigSyntheticMonitorArgs;
 * import com.pulumi.gcp.monitoring.inputs.UptimeCheckConfigSyntheticMonitorCloudFunctionV2Args;
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
 *             .name("my-project-name-gcf-source")
 *             .location("US")
 *             .uniformBucketLevelAccess(true)
 *             .build());
 * 
 *         var object = new BucketObject("object", BucketObjectArgs.builder()
 *             .name("function-source.zip")
 *             .bucket(bucket.name())
 *             .source(new FileAsset("synthetic-fn-source.zip"))
 *             .build());
 * 
 *         var function = new Function("function", FunctionArgs.builder()
 *             .name("synthetic_function")
 *             .location("us-central1")
 *             .buildConfig(FunctionBuildConfigArgs.builder()
 *                 .runtime("nodejs20")
 *                 .entryPoint("SyntheticFunction")
 *                 .source(FunctionBuildConfigSourceArgs.builder()
 *                     .storageSource(FunctionBuildConfigSourceStorageSourceArgs.builder()
 *                         .bucket(bucket.name())
 *                         .object(object.name())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .serviceConfig(FunctionServiceConfigArgs.builder()
 *                 .maxInstanceCount(1)
 *                 .availableMemory("256M")
 *                 .timeoutSeconds(60)
 *                 .build())
 *             .build());
 * 
 *         var syntheticMonitor = new UptimeCheckConfig("syntheticMonitor", UptimeCheckConfigArgs.builder()
 *             .displayName("synthetic_monitor")
 *             .timeout("60s")
 *             .syntheticMonitor(UptimeCheckConfigSyntheticMonitorArgs.builder()
 *                 .cloudFunctionV2(UptimeCheckConfigSyntheticMonitorCloudFunctionV2Args.builder()
 *                     .name(function.id())
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
 * ## Ephemeral Attributes Reference
 * 
 * The following write-only attributes are supported:
 * 
 * ## Import
 * 
 * UptimeCheckConfig can be imported using any of these accepted formats:
 * 
 * * `{{project}}/{{name}}`
 * 
 * * `{{project}} {{name}}`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, UptimeCheckConfig can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:monitoring/uptimeCheckConfig:UptimeCheckConfig default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:monitoring/uptimeCheckConfig:UptimeCheckConfig default &#34;{{project}} {{name}}&#34;
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:monitoring/uptimeCheckConfig:UptimeCheckConfig default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:monitoring/uptimeCheckConfig:UptimeCheckConfig")
public class UptimeCheckConfig extends com.pulumi.resources.CustomResource {
    /**
     * The checker type to use for the check. If the monitored resource type is `servicedirectory_service`, `checker_type` must be set to `VPC_CHECKERS`.
     * Possible values are: `STATIC_IP_CHECKERS`, `VPC_CHECKERS`.
     * 
     */
    @Export(name="checkerType", refs={String.class}, tree="[0]")
    private Output<String> checkerType;

    /**
     * @return The checker type to use for the check. If the monitored resource type is `servicedirectory_service`, `checker_type` must be set to `VPC_CHECKERS`.
     * Possible values are: `STATIC_IP_CHECKERS`, `VPC_CHECKERS`.
     * 
     */
    public Output<String> checkerType() {
        return this.checkerType;
    }
    /**
     * The expected content on the page the check is run against. Currently, only the first entry in the list is supported, and other entries will be ignored. The server will look for an exact match of the string in the page response&#39;s content. This field is optional and should only be specified if a content match is required.
     * Structure is documented below.
     * 
     */
    @Export(name="contentMatchers", refs={List.class,UptimeCheckConfigContentMatcher.class}, tree="[0,1]")
    private Output</* @Nullable */ List<UptimeCheckConfigContentMatcher>> contentMatchers;

    /**
     * @return The expected content on the page the check is run against. Currently, only the first entry in the list is supported, and other entries will be ignored. The server will look for an exact match of the string in the page response&#39;s content. This field is optional and should only be specified if a content match is required.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<UptimeCheckConfigContentMatcher>>> contentMatchers() {
        return Codegen.optional(this.contentMatchers);
    }
    /**
     * A human-friendly name for the uptime check configuration. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return A human-friendly name for the uptime check configuration. The display name should be unique within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is not enforced.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Contains information needed to make an HTTP or HTTPS check.
     * Structure is documented below.
     * 
     */
    @Export(name="httpCheck", refs={UptimeCheckConfigHttpCheck.class}, tree="[0]")
    private Output</* @Nullable */ UptimeCheckConfigHttpCheck> httpCheck;

    /**
     * @return Contains information needed to make an HTTP or HTTPS check.
     * Structure is documented below.
     * 
     */
    public Output<Optional<UptimeCheckConfigHttpCheck>> httpCheck() {
        return Codegen.optional(this.httpCheck);
    }
    /**
     * Specifies whether to log the results of failed probes to Cloud Logging.
     * 
     */
    @Export(name="logCheckFailures", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> logCheckFailures;

    /**
     * @return Specifies whether to log the results of failed probes to Cloud Logging.
     * 
     */
    public Output<Optional<Boolean>> logCheckFailures() {
        return Codegen.optional(this.logCheckFailures);
    }
    /**
     * The [monitored resource]
     * (https://cloud.google.com/monitoring/api/resources) associated with the
     * configuration. The following monitored resource types are supported for
     * uptime checks:
     * 
     */
    @Export(name="monitoredResource", refs={UptimeCheckConfigMonitoredResource.class}, tree="[0]")
    private Output</* @Nullable */ UptimeCheckConfigMonitoredResource> monitoredResource;

    /**
     * @return The [monitored resource]
     * (https://cloud.google.com/monitoring/api/resources) associated with the
     * configuration. The following monitored resource types are supported for
     * uptime checks:
     * 
     */
    public Output<Optional<UptimeCheckConfigMonitoredResource>> monitoredResource() {
        return Codegen.optional(this.monitoredResource);
    }
    /**
     * A unique resource name for this UptimeCheckConfig. The format is `projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID]`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A unique resource name for this UptimeCheckConfig. The format is `projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID]`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * How often, in seconds, the uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 300s.
     * 
     */
    @Export(name="period", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> period;

    /**
     * @return How often, in seconds, the uptime check is performed. Currently, the only supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults to 300s.
     * 
     */
    public Output<Optional<String>> period() {
        return Codegen.optional(this.period);
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
     * The group resource associated with the configuration.
     * Structure is documented below.
     * 
     */
    @Export(name="resourceGroup", refs={UptimeCheckConfigResourceGroup.class}, tree="[0]")
    private Output</* @Nullable */ UptimeCheckConfigResourceGroup> resourceGroup;

    /**
     * @return The group resource associated with the configuration.
     * Structure is documented below.
     * 
     */
    public Output<Optional<UptimeCheckConfigResourceGroup>> resourceGroup() {
        return Codegen.optional(this.resourceGroup);
    }
    /**
     * The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions to include a minimum of 3 locations must be provided, or an error message is returned. Not specifying this field will result in uptime checks running from all regions.
     * 
     */
    @Export(name="selectedRegions", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> selectedRegions;

    /**
     * @return The list of regions from which the check will be run. Some regions contain one location, and others contain more than one. If this field is specified, enough regions to include a minimum of 3 locations must be provided, or an error message is returned. Not specifying this field will result in uptime checks running from all regions.
     * 
     */
    public Output<Optional<List<String>>> selectedRegions() {
        return Codegen.optional(this.selectedRegions);
    }
    /**
     * A Synthetic Monitor deployed to a Cloud Functions V2 instance.
     * Structure is documented below.
     * 
     */
    @Export(name="syntheticMonitor", refs={UptimeCheckConfigSyntheticMonitor.class}, tree="[0]")
    private Output</* @Nullable */ UptimeCheckConfigSyntheticMonitor> syntheticMonitor;

    /**
     * @return A Synthetic Monitor deployed to a Cloud Functions V2 instance.
     * Structure is documented below.
     * 
     */
    public Output<Optional<UptimeCheckConfigSyntheticMonitor>> syntheticMonitor() {
        return Codegen.optional(this.syntheticMonitor);
    }
    /**
     * Contains information needed to make a TCP check.
     * Structure is documented below.
     * 
     */
    @Export(name="tcpCheck", refs={UptimeCheckConfigTcpCheck.class}, tree="[0]")
    private Output</* @Nullable */ UptimeCheckConfigTcpCheck> tcpCheck;

    /**
     * @return Contains information needed to make a TCP check.
     * Structure is documented below.
     * 
     */
    public Output<Optional<UptimeCheckConfigTcpCheck>> tcpCheck() {
        return Codegen.optional(this.tcpCheck);
    }
    /**
     * The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). See the accepted formats
     * 
     */
    @Export(name="timeout", refs={String.class}, tree="[0]")
    private Output<String> timeout;

    /**
     * @return The maximum amount of time to wait for the request to complete (must be between 1 and 60 seconds). See the accepted formats
     * 
     */
    public Output<String> timeout() {
        return this.timeout;
    }
    /**
     * The id of the uptime check
     * 
     */
    @Export(name="uptimeCheckId", refs={String.class}, tree="[0]")
    private Output<String> uptimeCheckId;

    /**
     * @return The id of the uptime check
     * 
     */
    public Output<String> uptimeCheckId() {
        return this.uptimeCheckId;
    }
    /**
     * User-supplied key/value data to be used for organizing and identifying the `UptimeCheckConfig` objects. The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
     */
    @Export(name="userLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> userLabels;

    /**
     * @return User-supplied key/value data to be used for organizing and identifying the `UptimeCheckConfig` objects. The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
     * 
     */
    public Output<Optional<Map<String,String>>> userLabels() {
        return Codegen.optional(this.userLabels);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UptimeCheckConfig(java.lang.String name) {
        this(name, UptimeCheckConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UptimeCheckConfig(java.lang.String name, UptimeCheckConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UptimeCheckConfig(java.lang.String name, UptimeCheckConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:monitoring/uptimeCheckConfig:UptimeCheckConfig", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private UptimeCheckConfig(java.lang.String name, Output<java.lang.String> id, @Nullable UptimeCheckConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:monitoring/uptimeCheckConfig:UptimeCheckConfig", name, state, makeResourceOptions(options, id), false);
    }

    private static UptimeCheckConfigArgs makeArgs(UptimeCheckConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? UptimeCheckConfigArgs.Empty : args;
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
    public static UptimeCheckConfig get(java.lang.String name, Output<java.lang.String> id, @Nullable UptimeCheckConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UptimeCheckConfig(name, id, state, options);
    }
}
