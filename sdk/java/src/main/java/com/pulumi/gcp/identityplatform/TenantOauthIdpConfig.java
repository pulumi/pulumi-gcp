// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.identityplatform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.identityplatform.TenantOauthIdpConfigArgs;
import com.pulumi.gcp.identityplatform.inputs.TenantOauthIdpConfigState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * OIDC IdP configuration for a Identity Toolkit project within a tenant.
 * 
 * You must enable the
 * [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
 * the marketplace prior to using this resource.
 * 
 * ## Example Usage
 * 
 * ### Identity Platform Tenant Oauth Idp Config Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.identityplatform.Tenant;
 * import com.pulumi.gcp.identityplatform.TenantArgs;
 * import com.pulumi.gcp.identityplatform.TenantOauthIdpConfig;
 * import com.pulumi.gcp.identityplatform.TenantOauthIdpConfigArgs;
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
 *         var tenant = new Tenant("tenant", TenantArgs.builder()
 *             .displayName("tenant")
 *             .build());
 * 
 *         var tenantOauthIdpConfig = new TenantOauthIdpConfig("tenantOauthIdpConfig", TenantOauthIdpConfigArgs.builder()
 *             .name("oidc.oauth-idp-config")
 *             .tenant(tenant.name())
 *             .displayName("Display Name")
 *             .clientId("client-id")
 *             .issuer("issuer")
 *             .enabled(true)
 *             .clientSecret("secret")
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
 * TenantOauthIdpConfig can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/tenants/{{tenant}}/oauthIdpConfigs/{{name}}`
 * 
 * * `{{project}}/{{tenant}}/{{name}}`
 * 
 * * `{{tenant}}/{{name}}`
 * 
 * When using the `pulumi import` command, TenantOauthIdpConfig can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig default projects/{{project}}/tenants/{{tenant}}/oauthIdpConfigs/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig default {{project}}/{{tenant}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig default {{tenant}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig")
public class TenantOauthIdpConfig extends com.pulumi.resources.CustomResource {
    /**
     * The client id of an OAuth client.
     * 
     */
    @Export(name="clientId", refs={String.class}, tree="[0]")
    private Output<String> clientId;

    /**
     * @return The client id of an OAuth client.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * The client secret of the OAuth client, to enable OIDC code flow.
     * 
     */
    @Export(name="clientSecret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientSecret;

    /**
     * @return The client secret of the OAuth client, to enable OIDC code flow.
     * 
     */
    public Output<Optional<String>> clientSecret() {
        return Codegen.optional(this.clientSecret);
    }
    /**
     * Human friendly display name.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return Human friendly display name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * If this config allows users to sign in with the provider.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return If this config allows users to sign in with the provider.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * For OIDC Idps, the issuer identifier.
     * 
     */
    @Export(name="issuer", refs={String.class}, tree="[0]")
    private Output<String> issuer;

    /**
     * @return For OIDC Idps, the issuer identifier.
     * 
     */
    public Output<String> issuer() {
        return this.issuer;
    }
    /**
     * The name of the OauthIdpConfig. Must start with `oidc.`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the OauthIdpConfig. Must start with `oidc.`.
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
     * The name of the tenant where this OIDC IDP configuration resource exists
     * 
     */
    @Export(name="tenant", refs={String.class}, tree="[0]")
    private Output<String> tenant;

    /**
     * @return The name of the tenant where this OIDC IDP configuration resource exists
     * 
     */
    public Output<String> tenant() {
        return this.tenant;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TenantOauthIdpConfig(java.lang.String name) {
        this(name, TenantOauthIdpConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TenantOauthIdpConfig(java.lang.String name, TenantOauthIdpConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TenantOauthIdpConfig(java.lang.String name, TenantOauthIdpConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private TenantOauthIdpConfig(java.lang.String name, Output<java.lang.String> id, @Nullable TenantOauthIdpConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:identityplatform/tenantOauthIdpConfig:TenantOauthIdpConfig", name, state, makeResourceOptions(options, id), false);
    }

    private static TenantOauthIdpConfigArgs makeArgs(TenantOauthIdpConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TenantOauthIdpConfigArgs.Empty : args;
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
    public static TenantOauthIdpConfig get(java.lang.String name, Output<java.lang.String> id, @Nullable TenantOauthIdpConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TenantOauthIdpConfig(name, id, state, options);
    }
}
