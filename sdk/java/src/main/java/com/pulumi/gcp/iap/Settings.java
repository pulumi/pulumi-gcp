// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.iap.SettingsArgs;
import com.pulumi.gcp.iap.inputs.SettingsState;
import com.pulumi.gcp.iap.outputs.SettingsAccessSettings;
import com.pulumi.gcp.iap.outputs.SettingsApplicationSettings;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * IAP settings - manage IAP settings
 * 
 * To get more information about Settings, see:
 * 
 * * [API documentation](https://cloud.google.com/iap/docs/reference/rest/v1/IapSettings)
 * * How-to Guides
 *     * [Customizing IAP](https://cloud.google.com/iap/docs/customizing)
 * 
 * ## Example Usage
 * 
 * ### Iap Settings Basic
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
 * import com.pulumi.gcp.compute.HealthCheck;
 * import com.pulumi.gcp.compute.HealthCheckArgs;
 * import com.pulumi.gcp.compute.inputs.HealthCheckTcpHealthCheckArgs;
 * import com.pulumi.gcp.compute.RegionBackendService;
 * import com.pulumi.gcp.compute.RegionBackendServiceArgs;
 * import com.pulumi.gcp.iap.Settings;
 * import com.pulumi.gcp.iap.SettingsArgs;
 * import com.pulumi.gcp.iap.inputs.SettingsAccessSettingsArgs;
 * import com.pulumi.gcp.iap.inputs.SettingsAccessSettingsAllowedDomainsSettingsArgs;
 * import com.pulumi.gcp.iap.inputs.SettingsAccessSettingsCorsSettingsArgs;
 * import com.pulumi.gcp.iap.inputs.SettingsAccessSettingsReauthSettingsArgs;
 * import com.pulumi.gcp.iap.inputs.SettingsAccessSettingsGcipSettingsArgs;
 * import com.pulumi.gcp.iap.inputs.SettingsAccessSettingsOauthSettingsArgs;
 * import com.pulumi.gcp.iap.inputs.SettingsAccessSettingsWorkforceIdentitySettingsArgs;
 * import com.pulumi.gcp.iap.inputs.SettingsAccessSettingsWorkforceIdentitySettingsOauth2Args;
 * import com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsArgs;
 * import com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsCsmSettingsArgs;
 * import com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsAccessDeniedPageSettingsArgs;
 * import com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsAttributePropagationSettingsArgs;
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
 *         final var project = OrganizationsFunctions.getProject(GetProjectArgs.builder()
 *             .build());
 * 
 *         var defaultHealthCheck = new HealthCheck("defaultHealthCheck", HealthCheckArgs.builder()
 *             .name("iap-bs-health-check")
 *             .checkIntervalSec(1)
 *             .timeoutSec(1)
 *             .tcpHealthCheck(HealthCheckTcpHealthCheckArgs.builder()
 *                 .port(80)
 *                 .build())
 *             .build());
 * 
 *         var default_ = new RegionBackendService("default", RegionBackendServiceArgs.builder()
 *             .name("iap-settings-tf")
 *             .region("us-central1")
 *             .healthChecks(defaultHealthCheck.id())
 *             .connectionDrainingTimeoutSec(10)
 *             .sessionAffinity("CLIENT_IP")
 *             .build());
 * 
 *         var iapSettings = new Settings("iapSettings", SettingsArgs.builder()
 *             .name(default_.name().applyValue(_name -> String.format("projects/%s/iap_web/compute-us-central1/services/%s", project.number(),_name)))
 *             .accessSettings(SettingsAccessSettingsArgs.builder()
 *                 .identitySources("WORKFORCE_IDENTITY_FEDERATION")
 *                 .allowedDomainsSettings(SettingsAccessSettingsAllowedDomainsSettingsArgs.builder()
 *                     .domains("test.abc.com")
 *                     .enable(true)
 *                     .build())
 *                 .corsSettings(SettingsAccessSettingsCorsSettingsArgs.builder()
 *                     .allowHttpOptions(true)
 *                     .build())
 *                 .reauthSettings(SettingsAccessSettingsReauthSettingsArgs.builder()
 *                     .method("SECURE_KEY")
 *                     .maxAge("305s")
 *                     .policyType("MINIMUM")
 *                     .build())
 *                 .gcipSettings(SettingsAccessSettingsGcipSettingsArgs.builder()
 *                     .loginPageUri("https://test.com/?apiKey=abc")
 *                     .build())
 *                 .oauthSettings(SettingsAccessSettingsOauthSettingsArgs.builder()
 *                     .loginHint("test")
 *                     .build())
 *                 .workforceIdentitySettings(SettingsAccessSettingsWorkforceIdentitySettingsArgs.builder()
 *                     .workforcePools("wif-pool")
 *                     .oauth2(SettingsAccessSettingsWorkforceIdentitySettingsOauth2Args.builder()
 *                         .clientId("test-client-id")
 *                         .clientSecret("test-client-secret")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .applicationSettings(SettingsApplicationSettingsArgs.builder()
 *                 .cookieDomain("test.abc.com")
 *                 .csmSettings(SettingsApplicationSettingsCsmSettingsArgs.builder()
 *                     .rctokenAud("test-aud-set")
 *                     .build())
 *                 .accessDeniedPageSettings(SettingsApplicationSettingsAccessDeniedPageSettingsArgs.builder()
 *                     .accessDeniedPageUri("test-uri")
 *                     .generateTroubleshootingUri(true)
 *                     .remediationTokenGenerationEnabled(false)
 *                     .build())
 *                 .attributePropagationSettings(SettingsApplicationSettingsAttributePropagationSettingsArgs.builder()
 *                     .outputCredentials("HEADER")
 *                     .expression("attributes.saml_attributes.filter(attribute, attribute.name in [\"test1\", \"test2\"])")
 *                     .enable(false)
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
 * ## Import
 * 
 * Settings can be imported using any of these accepted formats:
 * 
 * * `{{name}}/iapSettings`
 * 
 * * `{{name}}`
 * 
 * When using the `pulumi import` command, Settings can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:iap/settings:Settings default {{name}}/iapSettings
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:iap/settings:Settings default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:iap/settings:Settings")
public class Settings extends com.pulumi.resources.CustomResource {
    /**
     * Top level wrapper for all access related setting in IAP.
     * Structure is documented below.
     * 
     */
    @Export(name="accessSettings", refs={SettingsAccessSettings.class}, tree="[0]")
    private Output</* @Nullable */ SettingsAccessSettings> accessSettings;

    /**
     * @return Top level wrapper for all access related setting in IAP.
     * Structure is documented below.
     * 
     */
    public Output<Optional<SettingsAccessSettings>> accessSettings() {
        return Codegen.optional(this.accessSettings);
    }
    /**
     * Top level wrapper for all application related settings in IAP.
     * Structure is documented below.
     * 
     */
    @Export(name="applicationSettings", refs={SettingsApplicationSettings.class}, tree="[0]")
    private Output</* @Nullable */ SettingsApplicationSettings> applicationSettings;

    /**
     * @return Top level wrapper for all application related settings in IAP.
     * Structure is documented below.
     * 
     */
    public Output<Optional<SettingsApplicationSettings>> applicationSettings() {
        return Codegen.optional(this.applicationSettings);
    }
    /**
     * The resource name of the IAP protected resource. Name can have below resources:
     * * organizations/{organization_id}
     * * folders/{folder_id}
     * * projects/{project_id}
     * * projects/{project_id}/iap_web
     * * projects/{project_id}/iap_web/compute
     * * projects/{project_id}/iap_web/compute-{region}
     * * projects/{project_id}/iap_web/compute/services/{service_id}
     * * projects/{project_id}/iap_web/compute-{region}/services/{service_id}
     * * projects/{project_id}/iap_web/appengine-{app_id}
     * * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}
     * * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}/version/{version_id}
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name of the IAP protected resource. Name can have below resources:
     * * organizations/{organization_id}
     * * folders/{folder_id}
     * * projects/{project_id}
     * * projects/{project_id}/iap_web
     * * projects/{project_id}/iap_web/compute
     * * projects/{project_id}/iap_web/compute-{region}
     * * projects/{project_id}/iap_web/compute/services/{service_id}
     * * projects/{project_id}/iap_web/compute-{region}/services/{service_id}
     * * projects/{project_id}/iap_web/appengine-{app_id}
     * * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}
     * * projects/{project_id}/iap_web/appengine-{app_id}/services/{service_id}/version/{version_id}
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Settings(java.lang.String name) {
        this(name, SettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Settings(java.lang.String name, @Nullable SettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Settings(java.lang.String name, @Nullable SettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iap/settings:Settings", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Settings(java.lang.String name, Output<java.lang.String> id, @Nullable SettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iap/settings:Settings", name, state, makeResourceOptions(options, id), false);
    }

    private static SettingsArgs makeArgs(@Nullable SettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SettingsArgs.Empty : args;
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
    public static Settings get(java.lang.String name, Output<java.lang.String> id, @Nullable SettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Settings(name, id, state, options);
    }
}
