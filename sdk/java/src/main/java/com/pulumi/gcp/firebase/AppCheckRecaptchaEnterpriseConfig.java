// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.firebase.AppCheckRecaptchaEnterpriseConfigArgs;
import com.pulumi.gcp.firebase.inputs.AppCheckRecaptchaEnterpriseConfigState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * An app&#39;s reCAPTCHA Enterprise configuration object.
 * 
 * To get more information about RecaptchaEnterpriseConfig, see:
 * 
 * * [API documentation](https://firebase.google.com/docs/reference/appcheck/rest/v1/projects.apps.recaptchaEnterpriseConfig)
 * * How-to Guides
 *     * [Official Documentation](https://firebase.google.com/docs/app-check)
 * 
 * ## Example Usage
 * 
 * ### Firebase App Check Recaptcha Enterprise Config Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.projects.Service;
 * import com.pulumi.gcp.projects.ServiceArgs;
 * import com.pulumi.gcp.firebase.WebApp;
 * import com.pulumi.gcp.firebase.WebAppArgs;
 * import com.pulumi.time.sleep;
 * import com.pulumi.time.sleepArgs;
 * import com.pulumi.gcp.firebase.AppCheckRecaptchaEnterpriseConfig;
 * import com.pulumi.gcp.firebase.AppCheckRecaptchaEnterpriseConfigArgs;
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
 *         // Enables the reCAPTCHA Enterprise API
 *         var recaptchaEnterprise = new Service("recaptchaEnterprise", ServiceArgs.builder()
 *             .project("my-project-name")
 *             .service("recaptchaenterprise.googleapis.com")
 *             .disableOnDestroy(false)
 *             .build());
 * 
 *         var default_ = new WebApp("default", WebAppArgs.builder()
 *             .project("my-project-name")
 *             .displayName("Web App for reCAPTCHA Enterprise")
 *             .build());
 * 
 *         // It takes a while for App Check to recognize the new app
 *         // If your app already exists, you don't have to wait 30 seconds.
 *         var wait30s = new Sleep("wait30s", SleepArgs.builder()
 *             .createDuration("30s")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(List.of(default_))
 *                 .build());
 * 
 *         var defaultAppCheckRecaptchaEnterpriseConfig = new AppCheckRecaptchaEnterpriseConfig("defaultAppCheckRecaptchaEnterpriseConfig", AppCheckRecaptchaEnterpriseConfigArgs.builder()
 *             .project("my-project-name")
 *             .appId(default_.appId())
 *             .siteKey("6LdpMXIpAAAAANkwWQPgEdjEhal7ugkH9RK9ytuw")
 *             .tokenTtl("7200s")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(wait30s)
 *                 .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * RecaptchaEnterpriseConfig can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/apps/{{app_id}}/recaptchaEnterpriseConfig`
 * 
 * * `{{project}}/{{app_id}}`
 * 
 * * `{{app_id}}`
 * 
 * When using the `pulumi import` command, RecaptchaEnterpriseConfig can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:firebase/appCheckRecaptchaEnterpriseConfig:AppCheckRecaptchaEnterpriseConfig default projects/{{project}}/apps/{{app_id}}/recaptchaEnterpriseConfig
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:firebase/appCheckRecaptchaEnterpriseConfig:AppCheckRecaptchaEnterpriseConfig default {{project}}/{{app_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:firebase/appCheckRecaptchaEnterpriseConfig:AppCheckRecaptchaEnterpriseConfig default {{app_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:firebase/appCheckRecaptchaEnterpriseConfig:AppCheckRecaptchaEnterpriseConfig")
public class AppCheckRecaptchaEnterpriseConfig extends com.pulumi.resources.CustomResource {
    /**
     * The ID of an
     * [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id).
     * 
     */
    @Export(name="appId", refs={String.class}, tree="[0]")
    private Output<String> appId;

    /**
     * @return The ID of an
     * [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id).
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * The relative resource name of the reCAPTCHA Enterprise configuration object
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The relative resource name of the reCAPTCHA Enterprise configuration object
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
     * The score-based site key created in reCAPTCHA Enterprise used to invoke reCAPTCHA and generate the reCAPTCHA tokens for your application.
     * **Important**: This is not the siteSecret (as it is in reCAPTCHA v3), but rather your score-based reCAPTCHA Enterprise site key.
     * 
     */
    @Export(name="siteKey", refs={String.class}, tree="[0]")
    private Output<String> siteKey;

    /**
     * @return The score-based site key created in reCAPTCHA Enterprise used to invoke reCAPTCHA and generate the reCAPTCHA tokens for your application.
     * **Important**: This is not the siteSecret (as it is in reCAPTCHA v3), but rather your score-based reCAPTCHA Enterprise site key.
     * 
     */
    public Output<String> siteKey() {
        return this.siteKey;
    }
    /**
     * Specifies the duration for which App Check tokens exchanged from reCAPTCHA Enterprise artifacts will be valid.
     * If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days, inclusive.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Export(name="tokenTtl", refs={String.class}, tree="[0]")
    private Output<String> tokenTtl;

    /**
     * @return Specifies the duration for which App Check tokens exchanged from reCAPTCHA Enterprise artifacts will be valid.
     * If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days, inclusive.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Output<String> tokenTtl() {
        return this.tokenTtl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppCheckRecaptchaEnterpriseConfig(java.lang.String name) {
        this(name, AppCheckRecaptchaEnterpriseConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppCheckRecaptchaEnterpriseConfig(java.lang.String name, AppCheckRecaptchaEnterpriseConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppCheckRecaptchaEnterpriseConfig(java.lang.String name, AppCheckRecaptchaEnterpriseConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firebase/appCheckRecaptchaEnterpriseConfig:AppCheckRecaptchaEnterpriseConfig", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AppCheckRecaptchaEnterpriseConfig(java.lang.String name, Output<java.lang.String> id, @Nullable AppCheckRecaptchaEnterpriseConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firebase/appCheckRecaptchaEnterpriseConfig:AppCheckRecaptchaEnterpriseConfig", name, state, makeResourceOptions(options, id), false);
    }

    private static AppCheckRecaptchaEnterpriseConfigArgs makeArgs(AppCheckRecaptchaEnterpriseConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppCheckRecaptchaEnterpriseConfigArgs.Empty : args;
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
    public static AppCheckRecaptchaEnterpriseConfig get(java.lang.String name, Output<java.lang.String> id, @Nullable AppCheckRecaptchaEnterpriseConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppCheckRecaptchaEnterpriseConfig(name, id, state, options);
    }
}
