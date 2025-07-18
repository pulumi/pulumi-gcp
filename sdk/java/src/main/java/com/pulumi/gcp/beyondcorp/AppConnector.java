// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.beyondcorp;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.beyondcorp.AppConnectorArgs;
import com.pulumi.gcp.beyondcorp.inputs.AppConnectorState;
import com.pulumi.gcp.beyondcorp.outputs.AppConnectorPrincipalInfo;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A BeyondCorp AppConnector resource represents an application facing component deployed proximal to
 * and with direct access to the application instances. It is used to establish connectivity between the
 * remote enterprise environment and GCP. It initiates connections to the applications and can proxy the
 * data from users over the connection.
 * 
 * To get more information about AppConnector, see:
 * 
 * * [API documentation](https://cloud.google.com/beyondcorp/docs/reference/rest#rest-resource:-v1.projects.locations.appconnectors)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/beyondcorp-enterprise/docs/enable-app-connector)
 * 
 * ## Example Usage
 * 
 * ### Beyondcorp App Connector Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.serviceaccount.Account;
 * import com.pulumi.gcp.serviceaccount.AccountArgs;
 * import com.pulumi.gcp.beyondcorp.AppConnector;
 * import com.pulumi.gcp.beyondcorp.AppConnectorArgs;
 * import com.pulumi.gcp.beyondcorp.inputs.AppConnectorPrincipalInfoArgs;
 * import com.pulumi.gcp.beyondcorp.inputs.AppConnectorPrincipalInfoServiceAccountArgs;
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
 *         var serviceAccount = new Account("serviceAccount", AccountArgs.builder()
 *             .accountId("my-account")
 *             .displayName("Test Service Account")
 *             .build());
 * 
 *         var appConnector = new AppConnector("appConnector", AppConnectorArgs.builder()
 *             .name("my-app-connector")
 *             .principalInfo(AppConnectorPrincipalInfoArgs.builder()
 *                 .serviceAccount(AppConnectorPrincipalInfoServiceAccountArgs.builder()
 *                     .email(serviceAccount.email())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Beyondcorp App Connector Full
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.serviceaccount.Account;
 * import com.pulumi.gcp.serviceaccount.AccountArgs;
 * import com.pulumi.gcp.beyondcorp.AppConnector;
 * import com.pulumi.gcp.beyondcorp.AppConnectorArgs;
 * import com.pulumi.gcp.beyondcorp.inputs.AppConnectorPrincipalInfoArgs;
 * import com.pulumi.gcp.beyondcorp.inputs.AppConnectorPrincipalInfoServiceAccountArgs;
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
 *         var serviceAccount = new Account("serviceAccount", AccountArgs.builder()
 *             .accountId("my-account")
 *             .displayName("Test Service Account")
 *             .build());
 * 
 *         var appConnector = new AppConnector("appConnector", AppConnectorArgs.builder()
 *             .name("my-app-connector")
 *             .region("us-central1")
 *             .displayName("some display name")
 *             .principalInfo(AppConnectorPrincipalInfoArgs.builder()
 *                 .serviceAccount(AppConnectorPrincipalInfoServiceAccountArgs.builder()
 *                     .email(serviceAccount.email())
 *                     .build())
 *                 .build())
 *             .labels(Map.ofEntries(
 *                 Map.entry("foo", "bar"),
 *                 Map.entry("bar", "baz")
 *             ))
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
 * AppConnector can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{region}}/appConnectors/{{name}}`
 * 
 * * `{{project}}/{{region}}/{{name}}`
 * 
 * * `{{region}}/{{name}}`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, AppConnector can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:beyondcorp/appConnector:AppConnector default projects/{{project}}/locations/{{region}}/appConnectors/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:beyondcorp/appConnector:AppConnector default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:beyondcorp/appConnector:AppConnector default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:beyondcorp/appConnector:AppConnector default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:beyondcorp/appConnector:AppConnector")
public class AppConnector extends com.pulumi.resources.CustomResource {
    /**
     * An arbitrary user-provided name for the AppConnector.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return An arbitrary user-provided name for the AppConnector.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
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
     * Resource labels to represent user provided metadata.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Resource labels to represent user provided metadata.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * ID of the AppConnector.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return ID of the AppConnector.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Principal information about the Identity of the AppConnector.
     * Structure is documented below.
     * 
     */
    @Export(name="principalInfo", refs={AppConnectorPrincipalInfo.class}, tree="[0]")
    private Output<AppConnectorPrincipalInfo> principalInfo;

    /**
     * @return Principal information about the Identity of the AppConnector.
     * Structure is documented below.
     * 
     */
    public Output<AppConnectorPrincipalInfo> principalInfo() {
        return this.principalInfo;
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
     * The region of the AppConnector.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> region;

    /**
     * @return The region of the AppConnector.
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    /**
     * Represents the different states of a AppConnector.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return Represents the different states of a AppConnector.
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppConnector(java.lang.String name) {
        this(name, AppConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppConnector(java.lang.String name, AppConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppConnector(java.lang.String name, AppConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:beyondcorp/appConnector:AppConnector", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AppConnector(java.lang.String name, Output<java.lang.String> id, @Nullable AppConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:beyondcorp/appConnector:AppConnector", name, state, makeResourceOptions(options, id), false);
    }

    private static AppConnectorArgs makeArgs(AppConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppConnectorArgs.Empty : args;
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
    public static AppConnector get(java.lang.String name, Output<java.lang.String> id, @Nullable AppConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppConnector(name, id, state, options);
    }
}
