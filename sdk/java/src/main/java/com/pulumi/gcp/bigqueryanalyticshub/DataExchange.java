// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigqueryanalyticshub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeArgs;
import com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeState;
import com.pulumi.gcp.bigqueryanalyticshub.outputs.DataExchangeSharingEnvironmentConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Bigquery Analytics Hub data exchange
 * 
 * To get more information about DataExchange, see:
 * 
 * * [API documentation](https://cloud.google.com/bigquery/docs/reference/analytics-hub/rest/v1/projects.locations.dataExchanges)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/bigquery/docs/analytics-hub-introduction)
 * 
 * ## Example Usage
 * 
 * ### Bigquery Analyticshub Data Exchange Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigqueryanalyticshub.DataExchange;
 * import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeArgs;
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
 *         var dataExchange = new DataExchange("dataExchange", DataExchangeArgs.builder()
 *             .location("US")
 *             .dataExchangeId("my_data_exchange")
 *             .displayName("my_data_exchange")
 *             .description("example data exchange")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Bigquery Analyticshub Data Exchange Dcr
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigqueryanalyticshub.DataExchange;
 * import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeArgs;
 * import com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigArgs;
 * import com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigDcrExchangeConfigArgs;
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
 *         var dataExchange = new DataExchange("dataExchange", DataExchangeArgs.builder()
 *             .location("US")
 *             .dataExchangeId("dcr_data_exchange")
 *             .displayName("dcr_data_exchange")
 *             .description("example dcr data exchange")
 *             .sharingEnvironmentConfig(DataExchangeSharingEnvironmentConfigArgs.builder()
 *                 .dcrExchangeConfig(DataExchangeSharingEnvironmentConfigDcrExchangeConfigArgs.builder()
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Bigquery Analyticshub Data Exchange Log Linked Dataset Query User
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigqueryanalyticshub.DataExchange;
 * import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeArgs;
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
 *         var dataExchange = new DataExchange("dataExchange", DataExchangeArgs.builder()
 *             .location("US")
 *             .dataExchangeId("tf_test_log_email_data_exchange")
 *             .displayName("tf_test_log_email_data_exchange")
 *             .description("Example for log email test for data exchange")
 *             .logLinkedDatasetQueryUserEmail(true)
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
 * DataExchange can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}`
 * 
 * * `{{project}}/{{location}}/{{data_exchange_id}}`
 * 
 * * `{{location}}/{{data_exchange_id}}`
 * 
 * * `{{data_exchange_id}}`
 * 
 * When using the `pulumi import` command, DataExchange can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:bigqueryanalyticshub/dataExchange:DataExchange default projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:bigqueryanalyticshub/dataExchange:DataExchange default {{project}}/{{location}}/{{data_exchange_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:bigqueryanalyticshub/dataExchange:DataExchange default {{location}}/{{data_exchange_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:bigqueryanalyticshub/dataExchange:DataExchange default {{data_exchange_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:bigqueryanalyticshub/dataExchange:DataExchange")
public class DataExchange extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces.
     * 
     */
    @Export(name="dataExchangeId", refs={String.class}, tree="[0]")
    private Output<String> dataExchangeId;

    /**
     * @return The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces.
     * 
     */
    public Output<String> dataExchangeId() {
        return this.dataExchangeId;
    }
    /**
     * Description of the data exchange.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the data exchange.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Human-readable display name of the data exchange. The display name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and must not start or end with spaces.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return Human-readable display name of the data exchange. The display name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and must not start or end with spaces.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Documentation describing the data exchange.
     * 
     */
    @Export(name="documentation", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> documentation;

    /**
     * @return Documentation describing the data exchange.
     * 
     */
    public Output<Optional<String>> documentation() {
        return Codegen.optional(this.documentation);
    }
    /**
     * Base64 encoded image representing the data exchange.
     * 
     */
    @Export(name="icon", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> icon;

    /**
     * @return Base64 encoded image representing the data exchange.
     * 
     */
    public Output<Optional<String>> icon() {
        return Codegen.optional(this.icon);
    }
    /**
     * Number of listings contained in the data exchange.
     * 
     */
    @Export(name="listingCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> listingCount;

    /**
     * @return Number of listings contained in the data exchange.
     * 
     */
    public Output<Integer> listingCount() {
        return this.listingCount;
    }
    /**
     * The name of the location this data exchange.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The name of the location this data exchange.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * If true, subscriber email logging is enabled and all queries on the linked dataset will log the email address of the querying user. Once enabled, this setting cannot be turned off.
     * 
     */
    @Export(name="logLinkedDatasetQueryUserEmail", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> logLinkedDatasetQueryUserEmail;

    /**
     * @return If true, subscriber email logging is enabled and all queries on the linked dataset will log the email address of the querying user. Once enabled, this setting cannot be turned off.
     * 
     */
    public Output<Optional<Boolean>> logLinkedDatasetQueryUserEmail() {
        return Codegen.optional(this.logLinkedDatasetQueryUserEmail);
    }
    /**
     * The resource name of the data exchange, for example:
     * &#34;projects/myproject/locations/US/dataExchanges/123&#34;
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name of the data exchange, for example:
     * &#34;projects/myproject/locations/US/dataExchanges/123&#34;
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Email or URL of the primary point of contact of the data exchange.
     * 
     */
    @Export(name="primaryContact", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> primaryContact;

    /**
     * @return Email or URL of the primary point of contact of the data exchange.
     * 
     */
    public Output<Optional<String>> primaryContact() {
        return Codegen.optional(this.primaryContact);
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
     * Configurable data sharing environment option for a data exchange.
     * This field is required for data clean room exchanges.
     * Structure is documented below.
     * 
     */
    @Export(name="sharingEnvironmentConfig", refs={DataExchangeSharingEnvironmentConfig.class}, tree="[0]")
    private Output<DataExchangeSharingEnvironmentConfig> sharingEnvironmentConfig;

    /**
     * @return Configurable data sharing environment option for a data exchange.
     * This field is required for data clean room exchanges.
     * Structure is documented below.
     * 
     */
    public Output<DataExchangeSharingEnvironmentConfig> sharingEnvironmentConfig() {
        return this.sharingEnvironmentConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataExchange(java.lang.String name) {
        this(name, DataExchangeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataExchange(java.lang.String name, DataExchangeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataExchange(java.lang.String name, DataExchangeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigqueryanalyticshub/dataExchange:DataExchange", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DataExchange(java.lang.String name, Output<java.lang.String> id, @Nullable DataExchangeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigqueryanalyticshub/dataExchange:DataExchange", name, state, makeResourceOptions(options, id), false);
    }

    private static DataExchangeArgs makeArgs(DataExchangeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DataExchangeArgs.Empty : args;
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
    public static DataExchange get(java.lang.String name, Output<java.lang.String> id, @Nullable DataExchangeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataExchange(name, id, state, options);
    }
}
