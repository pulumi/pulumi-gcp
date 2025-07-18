// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.firebase.WebAppArgs;
import com.pulumi.gcp.firebase.inputs.WebAppState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Google Cloud Firebase web application instance
 * 
 * To get more information about WebApp, see:
 * 
 * * [API documentation](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps)
 * * How-to Guides
 *     * [Official Documentation](https://firebase.google.com/)
 * 
 * ## Example Usage
 * 
 * ### Firebase Web App Custom Api Key
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.projects.ApiKey;
 * import com.pulumi.gcp.projects.ApiKeyArgs;
 * import com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsArgs;
 * import com.pulumi.gcp.projects.inputs.ApiKeyRestrictionsBrowserKeyRestrictionsArgs;
 * import com.pulumi.gcp.firebase.WebApp;
 * import com.pulumi.gcp.firebase.WebAppArgs;
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
 *         var web = new ApiKey("web", ApiKeyArgs.builder()
 *             .project("my-project-name")
 *             .name("api-key")
 *             .displayName("Display Name")
 *             .restrictions(ApiKeyRestrictionsArgs.builder()
 *                 .browserKeyRestrictions(ApiKeyRestrictionsBrowserKeyRestrictionsArgs.builder()
 *                     .allowedReferrers("*")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var default_ = new WebApp("default", WebAppArgs.builder()
 *             .project("my-project-name")
 *             .displayName("Display Name")
 *             .apiKeyId(web.uid())
 *             .deletionPolicy("DELETE")
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
 * WebApp can be imported using any of these accepted formats:
 * 
 * * `{{project}} projects/{{project}}/webApps/{{app_id}}`
 * 
 * * `projects/{{project}}/webApps/{{app_id}}`
 * 
 * * `{{project}}/{{project}}/{{app_id}}`
 * 
 * * `webApps/{{app_id}}`
 * 
 * * `{{app_id}}`
 * 
 * When using the `pulumi import` command, WebApp can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:firebase/webApp:WebApp default &#34;{{project}} projects/{{project}}/webApps/{{app_id}}&#34;
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:firebase/webApp:WebApp default projects/{{project}}/webApps/{{app_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:firebase/webApp:WebApp default {{project}}/{{project}}/{{app_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:firebase/webApp:WebApp default webApps/{{app_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:firebase/webApp:WebApp default {{app_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:firebase/webApp:WebApp")
public class WebApp extends com.pulumi.resources.CustomResource {
    /**
     * The globally unique, Google-assigned identifier (UID) for the Firebase API key associated with the WebApp.
     * If apiKeyId is not set during creation, then Firebase automatically associates an apiKeyId with the WebApp.
     * This auto-associated key may be an existing valid key or, if no valid key exists, a new one will be provisioned.
     * 
     */
    @Export(name="apiKeyId", refs={String.class}, tree="[0]")
    private Output<String> apiKeyId;

    /**
     * @return The globally unique, Google-assigned identifier (UID) for the Firebase API key associated with the WebApp.
     * If apiKeyId is not set during creation, then Firebase automatically associates an apiKeyId with the WebApp.
     * This auto-associated key may be an existing valid key or, if no valid key exists, a new one will be provisioned.
     * 
     */
    public Output<String> apiKeyId() {
        return this.apiKeyId;
    }
    /**
     * The globally unique, Firebase-assigned identifier of the App.
     * This identifier should be treated as an opaque token, as the data format is not specified.
     * 
     */
    @Export(name="appId", refs={String.class}, tree="[0]")
    private Output<String> appId;

    /**
     * @return The globally unique, Firebase-assigned identifier of the App.
     * This identifier should be treated as an opaque token, as the data format is not specified.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * The URLs where the `WebApp` is hosted.
     * 
     */
    @Export(name="appUrls", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> appUrls;

    /**
     * @return The URLs where the `WebApp` is hosted.
     * 
     */
    public Output<List<String>> appUrls() {
        return this.appUrls;
    }
    @Export(name="deletionPolicy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deletionPolicy;

    public Output<Optional<String>> deletionPolicy() {
        return Codegen.optional(this.deletionPolicy);
    }
    /**
     * The user-assigned display name of the App.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The user-assigned display name of the App.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The fully qualified resource name of the App, for example:
     * projects/projectId/webApps/appId
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The fully qualified resource name of the App, for example:
     * projects/projectId/webApps/appId
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebApp(java.lang.String name) {
        this(name, WebAppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebApp(java.lang.String name, WebAppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebApp(java.lang.String name, WebAppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firebase/webApp:WebApp", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private WebApp(java.lang.String name, Output<java.lang.String> id, @Nullable WebAppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firebase/webApp:WebApp", name, state, makeResourceOptions(options, id), false);
    }

    private static WebAppArgs makeArgs(WebAppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? WebAppArgs.Empty : args;
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
    public static WebApp get(java.lang.String name, Output<java.lang.String> id, @Nullable WebAppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebApp(name, id, state, options);
    }
}
