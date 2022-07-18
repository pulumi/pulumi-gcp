// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.monitoring.SloArgs;
import com.pulumi.gcp.monitoring.inputs.SloState;
import com.pulumi.gcp.monitoring.outputs.SloBasicSli;
import com.pulumi.gcp.monitoring.outputs.SloRequestBasedSli;
import com.pulumi.gcp.monitoring.outputs.SloWindowsBasedSli;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Service-Level Objective (SLO) describes the level of desired good
 * service. It consists of a service-level indicator (SLI), a performance
 * goal, and a period over which the objective is to be evaluated against
 * that goal. The SLO can use SLIs defined in a number of different manners.
 * Typical SLOs might include &#34;99% of requests in each rolling week have
 * latency below 200 milliseconds&#34; or &#34;99.5% of requests in each calendar
 * month return successfully.&#34;
 * 
 * To get more information about Slo, see:
 * 
 * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services.serviceLevelObjectives)
 * * How-to Guides
 *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
 *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
 * 
 * ## Example Usage
 * ### Monitoring Slo Appengine
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
 *         final var default = Output.of(MonitoringFunctions.getAppEngineService(GetAppEngineServiceArgs.builder()
 *             .moduleId(&#34;default&#34;)
 *             .build()));
 * 
 *         var appengSlo = new Slo(&#34;appengSlo&#34;, SloArgs.builder()        
 *             .service(default_.serviceId())
 *             .sloId(&#34;ae-slo&#34;)
 *             .displayName(&#34;Test SLO for App Engine&#34;)
 *             .goal(0.9)
 *             .calendarPeriod(&#34;DAY&#34;)
 *             .basicSli(SloBasicSliArgs.builder()
 *                 .latency(SloBasicSliLatencyArgs.builder()
 *                     .threshold(&#34;1s&#34;)
 *                     .build())
 *                 .build())
 *             .userLabels(Map.ofEntries(
 *                 Map.entry(&#34;my_key&#34;, &#34;my_value&#34;),
 *                 Map.entry(&#34;my_other_key&#34;, &#34;my_other_value&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Monitoring Slo Request Based
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
 *         var customsrv = new CustomService(&#34;customsrv&#34;, CustomServiceArgs.builder()        
 *             .serviceId(&#34;custom-srv-request-slos&#34;)
 *             .displayName(&#34;My Custom Service&#34;)
 *             .build());
 * 
 *         var requestBasedSlo = new Slo(&#34;requestBasedSlo&#34;, SloArgs.builder()        
 *             .service(customsrv.serviceId())
 *             .sloId(&#34;consumed-api-slo&#34;)
 *             .displayName(&#34;Test SLO with request based SLI (good total ratio)&#34;)
 *             .goal(0.9)
 *             .rollingPeriodDays(30)
 *             .requestBasedSli(SloRequestBasedSliArgs.builder()
 *                 .distributionCut(SloRequestBasedSliDistributionCutArgs.builder()
 *                     .distributionFilter(&#34;metric.type=\&#34;serviceruntime.googleapis.com/api/request_latencies\&#34; resource.type=\&#34;api\&#34;  &#34;)
 *                     .range(SloRequestBasedSliDistributionCutRangeArgs.builder()
 *                         .max(0.5)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Slo can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:monitoring/slo:Slo default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:monitoring/slo:Slo")
public class Slo extends com.pulumi.resources.CustomResource {
    /**
     * Basic Service-Level Indicator (SLI) on a well-known service type.
     * Performance will be computed on the basis of pre-defined metrics.
     * SLIs are used to measure and calculate the quality of the Service&#39;s
     * performance with respect to a single aspect of service quality.
     * Exactly one of the following must be set:
     * `basic_sli`, `request_based_sli`, `windows_based_sli`
     * Structure is documented below.
     * 
     */
    @Export(name="basicSli", type=SloBasicSli.class, parameters={})
    private Output</* @Nullable */ SloBasicSli> basicSli;

    /**
     * @return Basic Service-Level Indicator (SLI) on a well-known service type.
     * Performance will be computed on the basis of pre-defined metrics.
     * SLIs are used to measure and calculate the quality of the Service&#39;s
     * performance with respect to a single aspect of service quality.
     * Exactly one of the following must be set:
     * `basic_sli`, `request_based_sli`, `windows_based_sli`
     * Structure is documented below.
     * 
     */
    public Output<Optional<SloBasicSli>> basicSli() {
        return Codegen.optional(this.basicSli);
    }
    /**
     * A calendar period, semantically &#34;since the start of the current
     * &lt;calendarPeriod&gt;&#34;.
     * Possible values are `DAY`, `WEEK`, `FORTNIGHT`, and `MONTH`.
     * 
     */
    @Export(name="calendarPeriod", type=String.class, parameters={})
    private Output</* @Nullable */ String> calendarPeriod;

    /**
     * @return A calendar period, semantically &#34;since the start of the current
     * &lt;calendarPeriod&gt;&#34;.
     * Possible values are `DAY`, `WEEK`, `FORTNIGHT`, and `MONTH`.
     * 
     */
    public Output<Optional<String>> calendarPeriod() {
        return Codegen.optional(this.calendarPeriod);
    }
    /**
     * Name used for UI elements listing this SLO.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Name used for UI elements listing this SLO.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * The fraction of service that must be good in order for this objective
     * to be met. 0 &lt; goal &lt;= 0.999
     * 
     */
    @Export(name="goal", type=Double.class, parameters={})
    private Output<Double> goal;

    /**
     * @return The fraction of service that must be good in order for this objective
     * to be met. 0 &lt; goal &lt;= 0.999
     * 
     */
    public Output<Double> goal() {
        return this.goal;
    }
    /**
     * The full resource name for this service. The syntax is:
     * projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The full resource name for this service. The syntax is:
     * projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
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
     * A request-based SLI defines a SLI for which atomic units of
     * service are counted directly.
     * A SLI describes a good service.
     * It is used to measure and calculate the quality of the Service&#39;s
     * performance with respect to a single aspect of service quality.
     * Exactly one of the following must be set:
     * `basic_sli`, `request_based_sli`, `windows_based_sli`
     * Structure is documented below.
     * 
     */
    @Export(name="requestBasedSli", type=SloRequestBasedSli.class, parameters={})
    private Output</* @Nullable */ SloRequestBasedSli> requestBasedSli;

    /**
     * @return A request-based SLI defines a SLI for which atomic units of
     * service are counted directly.
     * A SLI describes a good service.
     * It is used to measure and calculate the quality of the Service&#39;s
     * performance with respect to a single aspect of service quality.
     * Exactly one of the following must be set:
     * `basic_sli`, `request_based_sli`, `windows_based_sli`
     * Structure is documented below.
     * 
     */
    public Output<Optional<SloRequestBasedSli>> requestBasedSli() {
        return Codegen.optional(this.requestBasedSli);
    }
    /**
     * A rolling time period, semantically &#34;in the past X days&#34;.
     * Must be between 1 to 30 days, inclusive.
     * 
     */
    @Export(name="rollingPeriodDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> rollingPeriodDays;

    /**
     * @return A rolling time period, semantically &#34;in the past X days&#34;.
     * Must be between 1 to 30 days, inclusive.
     * 
     */
    public Output<Optional<Integer>> rollingPeriodDays() {
        return Codegen.optional(this.rollingPeriodDays);
    }
    /**
     * ID of the service to which this SLO belongs.
     * 
     */
    @Export(name="service", type=String.class, parameters={})
    private Output<String> service;

    /**
     * @return ID of the service to which this SLO belongs.
     * 
     */
    public Output<String> service() {
        return this.service;
    }
    /**
     * The id to use for this ServiceLevelObjective. If omitted, an id will be generated instead.
     * 
     */
    @Export(name="sloId", type=String.class, parameters={})
    private Output<String> sloId;

    /**
     * @return The id to use for this ServiceLevelObjective. If omitted, an id will be generated instead.
     * 
     */
    public Output<String> sloId() {
        return this.sloId;
    }
    /**
     * This field is intended to be used for organizing and identifying the AlertPolicy
     * objects.The field can contain up to 64 entries. Each key and value is limited
     * to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values
     * can contain only lowercase letters, numerals, underscores, and dashes. Keys
     * must begin with a letter.
     * 
     */
    @Export(name="userLabels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> userLabels;

    /**
     * @return This field is intended to be used for organizing and identifying the AlertPolicy
     * objects.The field can contain up to 64 entries. Each key and value is limited
     * to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values
     * can contain only lowercase letters, numerals, underscores, and dashes. Keys
     * must begin with a letter.
     * 
     */
    public Output<Optional<Map<String,String>>> userLabels() {
        return Codegen.optional(this.userLabels);
    }
    /**
     * A windows-based SLI defines the criteria for time windows.
     * good_service is defined based off the count of these time windows
     * for which the provided service was of good quality.
     * A SLI describes a good service. It is used to measure and calculate
     * the quality of the Service&#39;s performance with respect to a single
     * aspect of service quality.
     * Exactly one of the following must be set:
     * `basic_sli`, `request_based_sli`, `windows_based_sli`
     * Structure is documented below.
     * 
     */
    @Export(name="windowsBasedSli", type=SloWindowsBasedSli.class, parameters={})
    private Output</* @Nullable */ SloWindowsBasedSli> windowsBasedSli;

    /**
     * @return A windows-based SLI defines the criteria for time windows.
     * good_service is defined based off the count of these time windows
     * for which the provided service was of good quality.
     * A SLI describes a good service. It is used to measure and calculate
     * the quality of the Service&#39;s performance with respect to a single
     * aspect of service quality.
     * Exactly one of the following must be set:
     * `basic_sli`, `request_based_sli`, `windows_based_sli`
     * Structure is documented below.
     * 
     */
    public Output<Optional<SloWindowsBasedSli>> windowsBasedSli() {
        return Codegen.optional(this.windowsBasedSli);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Slo(String name) {
        this(name, SloArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Slo(String name, SloArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Slo(String name, SloArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:monitoring/slo:Slo", name, args == null ? SloArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Slo(String name, Output<String> id, @Nullable SloState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:monitoring/slo:Slo", name, state, makeResourceOptions(options, id));
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
    public static Slo get(String name, Output<String> id, @Nullable SloState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Slo(name, id, state, options);
    }
}