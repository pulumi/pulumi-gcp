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
 * ### Firebasehosting Site Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.firebase.HostingSite;
 * import com.pulumi.gcp.firebase.HostingSiteArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var default_ = new HostingSite(&#34;default&#34;, HostingSiteArgs.builder()        
 *             .project(&#34;my-project-name&#34;)
 *             .siteId(&#34;site-no-app&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Firebasehosting Site Full
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.firebase.WebApp;
 * import com.pulumi.gcp.firebase.WebAppArgs;
 * import com.pulumi.gcp.firebase.HostingSite;
 * import com.pulumi.gcp.firebase.HostingSiteArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var default_ = new WebApp(&#34;default&#34;, WebAppArgs.builder()        
 *             .project(&#34;my-project-name&#34;)
 *             .displayName(&#34;Test web app for Firebase Hosting&#34;)
 *             .deletionPolicy(&#34;DELETE&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var full = new HostingSite(&#34;full&#34;, HostingSiteArgs.builder()        
 *             .project(&#34;my-project-name&#34;)
 *             .siteId(&#34;site-with-app&#34;)
 *             .appId(default_.appId())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Site can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:firebase/hostingSite:HostingSite default projects/{{project}}/sites/{{site_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:firebase/hostingSite:HostingSite default {{project}}/{{site_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:firebase/hostingSite:HostingSite default sites/{{site_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:firebase/hostingSite:HostingSite default {{site_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:firebase/hostingSite:HostingSite")
public class HostingSite extends com.pulumi.resources.CustomResource {
    /**
     * Optional. The [ID of a Web App](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id)
     * associated with the Hosting site.
     * 
     */
    @Export(name="appId", type=String.class, parameters={})
    private Output</* @Nullable */ String> appId;

    /**
     * @return Optional. The [ID of a Web App](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id)
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
    @Export(name="defaultUrl", type=String.class, parameters={})
    private Output<String> defaultUrl;

    /**
     * @return The default URL for the site in the form of https://{name}.web.app
     * 
     */
    public Output<String> defaultUrl() {
        return this.defaultUrl;
    }
    /**
     * Output only. The fully-qualified resource name of the Hosting site, in the format:
     * projects/PROJECT_IDENTIFIER/sites/SITE_ID PROJECT_IDENTIFIER: the Firebase project&#39;s
     * [&#39;ProjectNumber&#39;](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_number)
     * ***(recommended)*** or its
     * [&#39;ProjectId&#39;](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_id).
     * Learn more about using project identifiers in Google&#39;s [AIP 2510 standard](https://google.aip.dev/cloud/2510).
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Output only. The fully-qualified resource name of the Hosting site, in the format:
     * projects/PROJECT_IDENTIFIER/sites/SITE_ID PROJECT_IDENTIFIER: the Firebase project&#39;s
     * [&#39;ProjectNumber&#39;](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_number)
     * ***(recommended)*** or its
     * [&#39;ProjectId&#39;](https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects#FirebaseProject.FIELDS.project_id).
     * Learn more about using project identifiers in Google&#39;s [AIP 2510 standard](https://google.aip.dev/cloud/2510).
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
     * Required. Immutable. A globally unique identifier for the Hosting site. This identifier is
     * used to construct the Firebase-provisioned subdomains for the site, so it must also be a valid
     * domain name label.
     * 
     */
    @Export(name="siteId", type=String.class, parameters={})
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HostingSite(String name) {
        this(name, HostingSiteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostingSite(String name, @Nullable HostingSiteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostingSite(String name, @Nullable HostingSiteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firebase/hostingSite:HostingSite", name, args == null ? HostingSiteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HostingSite(String name, Output<String> id, @Nullable HostingSiteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firebase/hostingSite:HostingSite", name, state, makeResourceOptions(options, id));
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
    public static HostingSite get(String name, Output<String> id, @Nullable HostingSiteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HostingSite(name, id, state, options);
    }
}