// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.firebase.HostingSiteArgs;
import com.pulumi.gcp.firebase.inputs.HostingSiteState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Firebasehosting Site Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.firebase.HostingSite;
 * import com.pulumi.gcp.firebase.HostingSiteArgs;
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
 *         var default_ = new HostingSite("default", HostingSiteArgs.builder()
 *             .project("my-project-name")
 *             .siteId("site-no-app")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Firebasehosting Site Full
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.firebase.WebApp;
 * import com.pulumi.gcp.firebase.WebAppArgs;
 * import com.pulumi.gcp.firebase.HostingSite;
 * import com.pulumi.gcp.firebase.HostingSiteArgs;
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
 *         var default_ = new WebApp("default", WebAppArgs.builder()
 *             .project("my-project-name")
 *             .displayName("Test web app for Firebase Hosting")
 *             .build());
 * 
 *         var full = new HostingSite("full", HostingSiteArgs.builder()
 *             .project("my-project-name")
 *             .siteId("site-with-app")
 *             .appId(default_.appId())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Firebasehosting Site Default
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.firebase.HostingSite;
 * import com.pulumi.gcp.firebase.HostingSiteArgs;
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
 *         var default_ = new HostingSite("default", HostingSiteArgs.builder()
 *             .project("my-project-name")
 *             .siteId("my-project-name")
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
 * Site can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/sites/{{site_id}}`
 * 
 * * `{{project}}/{{site_id}}`
 * 
 * * `sites/{{site_id}}`
 * 
 * * `{{site_id}}`
 * 
 * When using the `pulumi import` command, Site can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:firebase/hostingSite:HostingSite default projects/{{project}}/sites/{{site_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:firebase/hostingSite:HostingSite default {{project}}/{{site_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:firebase/hostingSite:HostingSite default sites/{{site_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:firebase/hostingSite:HostingSite default {{site_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:firebase/hostingSite:HostingSite")
public class HostingSite extends com.pulumi.resources.CustomResource {
    /**
     * Optional. The [ID of a Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id)
     * associated with the Hosting site.
     * 
     */
    @Export(name="appId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> appId;

    /**
     * @return Optional. The [ID of a Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id)
     * associated with the Hosting site.
     * 
     */
    public Output<Optional<String>> appId() {
        return Codegen.optional(this.appId);
    }
    /**
     * The default URL for the site in the form of https://{name}.web.app
     * 
     */
    @Export(name="defaultUrl", refs={String.class}, tree="[0]")
    private Output<String> defaultUrl;

    /**
     * @return The default URL for the site in the form of https://{name}.web.app
     * 
     */
    public Output<String> defaultUrl() {
        return this.defaultUrl;
    }
    /**
     * Output only. The fully-qualified resource name of the Hosting site, in
     * the format: projects/PROJECT_IDENTIFIER/sites/SITE_ID PROJECT_IDENTIFIER: the
     * Firebase project&#39;s
     * [`ProjectNumber`](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its
     * [`ProjectId`](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects#FirebaseProject.FIELDS.project_id).
     * Learn more about using project identifiers in Google&#39;s
     * [AIP 2510 standard](https://google.aip.dev/cloud/2510).
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Output only. The fully-qualified resource name of the Hosting site, in
     * the format: projects/PROJECT_IDENTIFIER/sites/SITE_ID PROJECT_IDENTIFIER: the
     * Firebase project&#39;s
     * [`ProjectNumber`](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its
     * [`ProjectId`](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects#FirebaseProject.FIELDS.project_id).
     * Learn more about using project identifiers in Google&#39;s
     * [AIP 2510 standard](https://google.aip.dev/cloud/2510).
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
     * Required. Immutable. A globally unique identifier for the Hosting site. This identifier is
     * used to construct the Firebase-provisioned subdomains for the site, so it must also be a valid
     * domain name label.
     * 
     */
    @Export(name="siteId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> siteId;

    /**
     * @return Required. Immutable. A globally unique identifier for the Hosting site. This identifier is
     * used to construct the Firebase-provisioned subdomains for the site, so it must also be a valid
     * domain name label.
     * 
     */
    public Output<Optional<String>> siteId() {
        return Codegen.optional(this.siteId);
    }
    /**
     * The type of Hosting site, either &#39;DEFAULT_SITE&#39; or `USER_SITE`
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of Hosting site, either &#39;DEFAULT_SITE&#39; or `USER_SITE`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HostingSite(java.lang.String name) {
        this(name, HostingSiteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostingSite(java.lang.String name, @Nullable HostingSiteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostingSite(java.lang.String name, @Nullable HostingSiteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firebase/hostingSite:HostingSite", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private HostingSite(java.lang.String name, Output<java.lang.String> id, @Nullable HostingSiteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firebase/hostingSite:HostingSite", name, state, makeResourceOptions(options, id), false);
    }

    private static HostingSiteArgs makeArgs(@Nullable HostingSiteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? HostingSiteArgs.Empty : args;
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
    public static HostingSite get(java.lang.String name, Output<java.lang.String> id, @Nullable HostingSiteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HostingSite(name, id, state, options);
    }
}
