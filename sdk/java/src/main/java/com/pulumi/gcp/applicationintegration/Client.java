// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.applicationintegration;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.applicationintegration.ClientArgs;
import com.pulumi.gcp.applicationintegration.inputs.ClientState;
import com.pulumi.gcp.applicationintegration.outputs.ClientCloudKmsConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Application Integration Client.
 * 
 * To get more information about Client, see:
 * 
 * * [API documentation](https://cloud.google.com/application-integration/docs/reference/rest/v1/projects.locations.clients)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/application-integration/docs/overview)
 *     * [Set up Application Integration](https://cloud.google.com/application-integration/docs/setup-application-integration)
 * 
 * ## Example Usage
 * 
 * ### Integrations Client Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.applicationintegration.Client;
 * import com.pulumi.gcp.applicationintegration.ClientArgs;
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
 *         var example = new Client("example", ClientArgs.builder()
 *             .location("us-central1")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Integrations Client Full
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
 * import com.pulumi.gcp.kms.KmsFunctions;
 * import com.pulumi.gcp.kms.inputs.GetKMSKeyRingArgs;
 * import com.pulumi.gcp.kms.inputs.GetKMSCryptoKeyArgs;
 * import com.pulumi.gcp.kms.inputs.GetKMSCryptoKeyVersionArgs;
 * import com.pulumi.gcp.applicationintegration.Client;
 * import com.pulumi.gcp.applicationintegration.ClientArgs;
 * import com.pulumi.gcp.applicationintegration.inputs.ClientCloudKmsConfigArgs;
 * import com.pulumi.std.StdFunctions;
 * import com.pulumi.std.inputs.BasenameArgs;
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
 *         final var default = OrganizationsFunctions.getProject(GetProjectArgs.builder()
 *             .build());
 * 
 *         final var keyring = KmsFunctions.getKMSKeyRing(GetKMSKeyRingArgs.builder()
 *             .name("my-keyring")
 *             .location("us-east1")
 *             .build());
 * 
 *         final var cryptokey = KmsFunctions.getKMSCryptoKey(GetKMSCryptoKeyArgs.builder()
 *             .name("my-crypto-key")
 *             .keyRing(keyring.id())
 *             .build());
 * 
 *         final var testKey = KmsFunctions.getKMSCryptoKeyVersion(GetKMSCryptoKeyVersionArgs.builder()
 *             .cryptoKey(cryptokey.id())
 *             .build());
 * 
 *         var example = new Client("example", ClientArgs.builder()
 *             .location("us-east1")
 *             .createSampleIntegrations(true)
 *             .cloudKmsConfig(ClientCloudKmsConfigArgs.builder()
 *                 .kmsLocation("us-east1")
 *                 .kmsRing(StdFunctions.basename(BasenameArgs.builder()
 *                     .input(keyring.id())
 *                     .build()).result())
 *                 .key(StdFunctions.basename(BasenameArgs.builder()
 *                     .input(cryptokey.id())
 *                     .build()).result())
 *                 .keyVersion(StdFunctions.basename(BasenameArgs.builder()
 *                     .input(testKey.id())
 *                     .build()).result())
 *                 .kmsProjectId(default_.projectId())
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
 * Client can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/clients`
 * 
 * * `{{project}}/{{location}}`
 * 
 * * `{{location}}`
 * 
 * When using the `pulumi import` command, Client can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:applicationintegration/client:Client default projects/{{project}}/locations/{{location}}/clients
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:applicationintegration/client:Client default {{project}}/{{location}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:applicationintegration/client:Client default {{location}}
 * ```
 * 
 */
@ResourceType(type="gcp:applicationintegration/client:Client")
public class Client extends com.pulumi.resources.CustomResource {
    /**
     * Cloud KMS config for AuthModule to encrypt/decrypt credentials.
     * Structure is documented below.
     * 
     */
    @Export(name="cloudKmsConfig", refs={ClientCloudKmsConfig.class}, tree="[0]")
    private Output</* @Nullable */ ClientCloudKmsConfig> cloudKmsConfig;

    /**
     * @return Cloud KMS config for AuthModule to encrypt/decrypt credentials.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ClientCloudKmsConfig>> cloudKmsConfig() {
        return Codegen.optional(this.cloudKmsConfig);
    }
    /**
     * Indicates if sample integrations should be created along with provisioning.
     * 
     */
    @Export(name="createSampleIntegrations", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> createSampleIntegrations;

    /**
     * @return Indicates if sample integrations should be created along with provisioning.
     * 
     */
    public Output<Optional<Boolean>> createSampleIntegrations() {
        return Codegen.optional(this.createSampleIntegrations);
    }
    /**
     * Location in which client needs to be provisioned.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Location in which client needs to be provisioned.
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * (Optional, Deprecated)
     * User input run-as service account, if empty, will bring up a new default service account.
     * 
     * &gt; **Warning:** `run_as_service_account` is deprecated and will be removed in a future major release.
     * 
     * @deprecated
     * `run_as_service_account` is deprecated and will be removed in a future major release.
     * 
     */
    @Deprecated /* `run_as_service_account` is deprecated and will be removed in a future major release. */
    @Export(name="runAsServiceAccount", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> runAsServiceAccount;

    /**
     * @return (Optional, Deprecated)
     * User input run-as service account, if empty, will bring up a new default service account.
     * 
     * &gt; **Warning:** `run_as_service_account` is deprecated and will be removed in a future major release.
     * 
     */
    public Output<Optional<String>> runAsServiceAccount() {
        return Codegen.optional(this.runAsServiceAccount);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Client(java.lang.String name) {
        this(name, ClientArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Client(java.lang.String name, ClientArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Client(java.lang.String name, ClientArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:applicationintegration/client:Client", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Client(java.lang.String name, Output<java.lang.String> id, @Nullable ClientState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:applicationintegration/client:Client", name, state, makeResourceOptions(options, id), false);
    }

    private static ClientArgs makeArgs(ClientArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ClientArgs.Empty : args;
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
    public static Client get(java.lang.String name, Output<java.lang.String> id, @Nullable ClientState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Client(name, id, state, options);
    }
}
