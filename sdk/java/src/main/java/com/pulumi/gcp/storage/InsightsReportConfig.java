// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.storage.InsightsReportConfigArgs;
import com.pulumi.gcp.storage.inputs.InsightsReportConfigState;
import com.pulumi.gcp.storage.outputs.InsightsReportConfigCsvOptions;
import com.pulumi.gcp.storage.outputs.InsightsReportConfigFrequencyOptions;
import com.pulumi.gcp.storage.outputs.InsightsReportConfigObjectMetadataReportOptions;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents an inventory report configuration.
 * 
 * To get more information about ReportConfig, see:
 * 
 * * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/reportConfig)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/storage/docs/insights/using-storage-insights)
 * 
 * ## Example Usage
 * ### Storage Insights Report Config
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
 * import com.pulumi.gcp.storage.Bucket;
 * import com.pulumi.gcp.storage.BucketArgs;
 * import com.pulumi.gcp.storage.InsightsReportConfig;
 * import com.pulumi.gcp.storage.InsightsReportConfigArgs;
 * import com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsArgs;
 * import com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsStartDateArgs;
 * import com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsEndDateArgs;
 * import com.pulumi.gcp.storage.inputs.InsightsReportConfigCsvOptionsArgs;
 * import com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsArgs;
 * import com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsStorageFiltersArgs;
 * import com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsStorageDestinationOptionsArgs;
 * import com.pulumi.gcp.storage.BucketIAMMember;
 * import com.pulumi.gcp.storage.BucketIAMMemberArgs;
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
 *         final var project = OrganizationsFunctions.getProject();
 * 
 *         var reportBucket = new Bucket(&#34;reportBucket&#34;, BucketArgs.builder()        
 *             .location(&#34;us-central1&#34;)
 *             .forceDestroy(true)
 *             .uniformBucketLevelAccess(true)
 *             .build());
 * 
 *         var config = new InsightsReportConfig(&#34;config&#34;, InsightsReportConfigArgs.builder()        
 *             .displayName(&#34;Test Report Config&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .frequencyOptions(InsightsReportConfigFrequencyOptionsArgs.builder()
 *                 .frequency(&#34;WEEKLY&#34;)
 *                 .startDate(InsightsReportConfigFrequencyOptionsStartDateArgs.builder()
 *                     .day(15)
 *                     .month(3)
 *                     .year(2050)
 *                     .build())
 *                 .endDate(InsightsReportConfigFrequencyOptionsEndDateArgs.builder()
 *                     .day(15)
 *                     .month(4)
 *                     .year(2050)
 *                     .build())
 *                 .build())
 *             .csvOptions(InsightsReportConfigCsvOptionsArgs.builder()
 *                 .recordSeparator(&#34;&#34;&#34;
 * 
 *                 &#34;&#34;&#34;)
 *                 .delimiter(&#34;,&#34;)
 *                 .headerRequired(false)
 *                 .build())
 *             .objectMetadataReportOptions(InsightsReportConfigObjectMetadataReportOptionsArgs.builder()
 *                 .metadataFields(                
 *                     &#34;bucket&#34;,
 *                     &#34;name&#34;,
 *                     &#34;project&#34;)
 *                 .storageFilters(InsightsReportConfigObjectMetadataReportOptionsStorageFiltersArgs.builder()
 *                     .bucket(reportBucket.name())
 *                     .build())
 *                 .storageDestinationOptions(InsightsReportConfigObjectMetadataReportOptionsStorageDestinationOptionsArgs.builder()
 *                     .bucket(reportBucket.name())
 *                     .destinationPath(&#34;test-insights-reports&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var admin = new BucketIAMMember(&#34;admin&#34;, BucketIAMMemberArgs.builder()        
 *             .bucket(reportBucket.name())
 *             .role(&#34;roles/storage.admin&#34;)
 *             .member(String.format(&#34;serviceAccount:service-%s@gcp-sa-storageinsights.iam.gserviceaccount.com&#34;, project.applyValue(getProjectResult -&gt; getProjectResult.number())))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ReportConfig can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:storage/insightsReportConfig:InsightsReportConfig default projects/{{project}}/locations/{{location}}/reportConfigs/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:storage/insightsReportConfig:InsightsReportConfig default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:storage/insightsReportConfig:InsightsReportConfig default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:storage/insightsReportConfig:InsightsReportConfig")
public class InsightsReportConfig extends com.pulumi.resources.CustomResource {
    /**
     * Options for configuring the format of the inventory report CSV file.
     * Structure is documented below.
     * 
     */
    @Export(name="csvOptions", refs={InsightsReportConfigCsvOptions.class}, tree="[0]")
    private Output<InsightsReportConfigCsvOptions> csvOptions;

    /**
     * @return Options for configuring the format of the inventory report CSV file.
     * Structure is documented below.
     * 
     */
    public Output<InsightsReportConfigCsvOptions> csvOptions() {
        return this.csvOptions;
    }
    /**
     * The editable display name of the inventory report configuration. Has a limit of 256 characters. Can be empty.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The editable display name of the inventory report configuration. Has a limit of 256 characters. Can be empty.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Options for configuring how inventory reports are generated.
     * Structure is documented below.
     * 
     */
    @Export(name="frequencyOptions", refs={InsightsReportConfigFrequencyOptions.class}, tree="[0]")
    private Output</* @Nullable */ InsightsReportConfigFrequencyOptions> frequencyOptions;

    /**
     * @return Options for configuring how inventory reports are generated.
     * Structure is documented below.
     * 
     */
    public Output<Optional<InsightsReportConfigFrequencyOptions>> frequencyOptions() {
        return Codegen.optional(this.frequencyOptions);
    }
    /**
     * The location of the ReportConfig. The source and destination buckets specified in the ReportConfig
     * must be in the same location.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location of the ReportConfig. The source and destination buckets specified in the ReportConfig
     * must be in the same location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The UUID of the inventory report configuration.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The UUID of the inventory report configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Options for including metadata in an inventory report.
     * Structure is documented below.
     * 
     */
    @Export(name="objectMetadataReportOptions", refs={InsightsReportConfigObjectMetadataReportOptions.class}, tree="[0]")
    private Output</* @Nullable */ InsightsReportConfigObjectMetadataReportOptions> objectMetadataReportOptions;

    /**
     * @return Options for including metadata in an inventory report.
     * Structure is documented below.
     * 
     */
    public Output<Optional<InsightsReportConfigObjectMetadataReportOptions>> objectMetadataReportOptions() {
        return Codegen.optional(this.objectMetadataReportOptions);
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InsightsReportConfig(String name) {
        this(name, InsightsReportConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InsightsReportConfig(String name, InsightsReportConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InsightsReportConfig(String name, InsightsReportConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/insightsReportConfig:InsightsReportConfig", name, args == null ? InsightsReportConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InsightsReportConfig(String name, Output<String> id, @Nullable InsightsReportConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/insightsReportConfig:InsightsReportConfig", name, state, makeResourceOptions(options, id));
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
    public static InsightsReportConfig get(String name, Output<String> id, @Nullable InsightsReportConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InsightsReportConfig(name, id, state, options);
    }
}