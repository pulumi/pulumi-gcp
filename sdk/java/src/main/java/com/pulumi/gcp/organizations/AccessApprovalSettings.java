// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.organizations.AccessApprovalSettingsArgs;
import com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsState;
import com.pulumi.gcp.organizations.outputs.AccessApprovalSettingsEnrolledService;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Access Approval enables you to require your explicit approval whenever Google support and engineering need to access your customer content.
 * 
 * To get more information about OrganizationSettings, see:
 * 
 * * [API documentation](https://cloud.google.com/access-approval/docs/reference/rest/v1/organizations)
 * 
 * ## Example Usage
 * 
 * ### Organization Access Approval Full
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.AccessApprovalSettings;
 * import com.pulumi.gcp.organizations.AccessApprovalSettingsArgs;
 * import com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsEnrolledServiceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var organizationAccessApproval = new AccessApprovalSettings("organizationAccessApproval", AccessApprovalSettingsArgs.builder()
 *             .organizationId("123456789")
 *             .notificationEmails(            
 *                 "testuser}{@literal @}{@code example.com",
 *                 "example.user}{@literal @}{@code example.com")
 *             .enrolledServices(            
 *                 AccessApprovalSettingsEnrolledServiceArgs.builder()
 *                     .cloudProduct("appengine.googleapis.com")
 *                     .build(),
 *                 AccessApprovalSettingsEnrolledServiceArgs.builder()
 *                     .cloudProduct("dataflow.googleapis.com")
 *                     .enrollmentLevel("BLOCK_ALL")
 *                     .build())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Organization Access Approval Active Key Version
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.Project;
 * import com.pulumi.gcp.organizations.ProjectArgs;
 * import com.pulumi.gcp.kms.KeyRing;
 * import com.pulumi.gcp.kms.KeyRingArgs;
 * import com.pulumi.gcp.kms.CryptoKey;
 * import com.pulumi.gcp.kms.CryptoKeyArgs;
 * import com.pulumi.gcp.kms.inputs.CryptoKeyVersionTemplateArgs;
 * import com.pulumi.gcp.accessapproval.AccessapprovalFunctions;
 * import com.pulumi.gcp.accessapproval.inputs.GetOrganizationServiceAccountArgs;
 * import com.pulumi.gcp.kms.CryptoKeyIAMMember;
 * import com.pulumi.gcp.kms.CryptoKeyIAMMemberArgs;
 * import com.pulumi.gcp.kms.KmsFunctions;
 * import com.pulumi.gcp.kms.inputs.GetKMSCryptoKeyVersionArgs;
 * import com.pulumi.gcp.organizations.AccessApprovalSettings;
 * import com.pulumi.gcp.organizations.AccessApprovalSettingsArgs;
 * import com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsEnrolledServiceArgs;
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
 *         var myProject = new Project("myProject", ProjectArgs.builder()
 *             .name("My Project")
 *             .projectId("your-project-id")
 *             .orgId("123456789")
 *             .deletionPolicy("DELETE")
 *             .build());
 * 
 *         var keyRing = new KeyRing("keyRing", KeyRingArgs.builder()
 *             .name("key-ring")
 *             .location("global")
 *             .project(myProject.projectId())
 *             .build());
 * 
 *         var cryptoKey = new CryptoKey("cryptoKey", CryptoKeyArgs.builder()
 *             .name("crypto-key")
 *             .keyRing(keyRing.id())
 *             .purpose("ASYMMETRIC_SIGN")
 *             .versionTemplate(CryptoKeyVersionTemplateArgs.builder()
 *                 .algorithm("EC_SIGN_P384_SHA384")
 *                 .build())
 *             .build());
 * 
 *         final var serviceAccount = AccessapprovalFunctions.getOrganizationServiceAccount(GetOrganizationServiceAccountArgs.builder()
 *             .organizationId("123456789")
 *             .build());
 * 
 *         var iam = new CryptoKeyIAMMember("iam", CryptoKeyIAMMemberArgs.builder()
 *             .cryptoKeyId(cryptoKey.id())
 *             .role("roles/cloudkms.signerVerifier")
 *             .member(String.format("serviceAccount:%s", serviceAccount.accountEmail()))
 *             .build());
 * 
 *         final var cryptoKeyVersion = KmsFunctions.getKMSCryptoKeyVersion(GetKMSCryptoKeyVersionArgs.builder()
 *             .cryptoKey(cryptoKey.id())
 *             .build());
 * 
 *         var organizationAccessApproval = new AccessApprovalSettings("organizationAccessApproval", AccessApprovalSettingsArgs.builder()
 *             .organizationId("123456789")
 *             .activeKeyVersion(cryptoKeyVersion.applyValue(_cryptoKeyVersion -> _cryptoKeyVersion.name()))
 *             .enrolledServices(AccessApprovalSettingsEnrolledServiceArgs.builder()
 *                 .cloudProduct("all")
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(iam)
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
 * OrganizationSettings can be imported using any of these accepted formats:
 * 
 * * `organizations/{{organization_id}}/accessApprovalSettings`
 * 
 * * `{{organization_id}}`
 * 
 * When using the `pulumi import` command, OrganizationSettings can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:organizations/accessApprovalSettings:AccessApprovalSettings default organizations/{{organization_id}}/accessApprovalSettings
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:organizations/accessApprovalSettings:AccessApprovalSettings default {{organization_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:organizations/accessApprovalSettings:AccessApprovalSettings")
public class AccessApprovalSettings extends com.pulumi.resources.CustomResource {
    /**
     * The asymmetric crypto key version to use for signing approval requests.
     * Empty active_key_version indicates that a Google-managed key should be used for signing.
     * 
     */
    @Export(name="activeKeyVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> activeKeyVersion;

    /**
     * @return The asymmetric crypto key version to use for signing approval requests.
     * Empty active_key_version indicates that a Google-managed key should be used for signing.
     * 
     */
    public Output<Optional<String>> activeKeyVersion() {
        return Codegen.optional(this.activeKeyVersion);
    }
    /**
     * This field will always be unset for the organization since organizations do not have ancestors.
     * 
     */
    @Export(name="ancestorHasActiveKeyVersion", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> ancestorHasActiveKeyVersion;

    /**
     * @return This field will always be unset for the organization since organizations do not have ancestors.
     * 
     */
    public Output<Boolean> ancestorHasActiveKeyVersion() {
        return this.ancestorHasActiveKeyVersion;
    }
    /**
     * This field will always be unset for the organization since organizations do not have ancestors.
     * 
     */
    @Export(name="enrolledAncestor", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enrolledAncestor;

    /**
     * @return This field will always be unset for the organization since organizations do not have ancestors.
     * 
     */
    public Output<Boolean> enrolledAncestor() {
        return this.enrolledAncestor;
    }
    /**
     * A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can be done for individual services.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    @Export(name="enrolledServices", refs={List.class,AccessApprovalSettingsEnrolledService.class}, tree="[0,1]")
    private Output<List<AccessApprovalSettingsEnrolledService>> enrolledServices;

    /**
     * @return A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can be done for individual services.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    public Output<List<AccessApprovalSettingsEnrolledService>> enrolledServices() {
        return this.enrolledServices;
    }
    /**
     * If the field is true, that indicates that there is some configuration issue with the active_key_version
     * configured on this Organization (e.g. it doesn&#39;t exist or the Access Approval service account doesn&#39;t have the
     * correct permissions on it, etc.).
     * 
     */
    @Export(name="invalidKeyVersion", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> invalidKeyVersion;

    /**
     * @return If the field is true, that indicates that there is some configuration issue with the active_key_version
     * configured on this Organization (e.g. it doesn&#39;t exist or the Access Approval service account doesn&#39;t have the
     * correct permissions on it, etc.).
     * 
     */
    public Output<Boolean> invalidKeyVersion() {
        return this.invalidKeyVersion;
    }
    /**
     * The resource name of the settings. Format is &#34;organizations/{organization_id}/accessApprovalSettings&#34;
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name of the settings. Format is &#34;organizations/{organization_id}/accessApprovalSettings&#34;
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of email addresses to which notifications relating to approval requests should be sent.
     * Notifications relating to a resource will be sent to all emails in the settings of ancestor
     * resources of that resource. A maximum of 50 email addresses are allowed.
     * 
     */
    @Export(name="notificationEmails", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> notificationEmails;

    /**
     * @return A list of email addresses to which notifications relating to approval requests should be sent.
     * Notifications relating to a resource will be sent to all emails in the settings of ancestor
     * resources of that resource. A maximum of 50 email addresses are allowed.
     * 
     */
    public Output<List<String>> notificationEmails() {
        return this.notificationEmails;
    }
    /**
     * ID of the organization of the access approval settings.
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return ID of the organization of the access approval settings.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessApprovalSettings(java.lang.String name) {
        this(name, AccessApprovalSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessApprovalSettings(java.lang.String name, AccessApprovalSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessApprovalSettings(java.lang.String name, AccessApprovalSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/accessApprovalSettings:AccessApprovalSettings", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AccessApprovalSettings(java.lang.String name, Output<java.lang.String> id, @Nullable AccessApprovalSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/accessApprovalSettings:AccessApprovalSettings", name, state, makeResourceOptions(options, id), false);
    }

    private static AccessApprovalSettingsArgs makeArgs(AccessApprovalSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AccessApprovalSettingsArgs.Empty : args;
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
    public static AccessApprovalSettings get(java.lang.String name, Output<java.lang.String> id, @Nullable AccessApprovalSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessApprovalSettings(name, id, state, options);
    }
}
