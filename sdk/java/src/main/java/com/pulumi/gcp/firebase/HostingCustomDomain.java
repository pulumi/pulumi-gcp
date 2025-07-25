// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.firebase.HostingCustomDomainArgs;
import com.pulumi.gcp.firebase.inputs.HostingCustomDomainState;
import com.pulumi.gcp.firebase.outputs.HostingCustomDomainCert;
import com.pulumi.gcp.firebase.outputs.HostingCustomDomainIssue;
import com.pulumi.gcp.firebase.outputs.HostingCustomDomainRequiredDnsUpdate;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Firebasehosting Customdomain Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.firebase.HostingCustomDomain;
 * import com.pulumi.gcp.firebase.HostingCustomDomainArgs;
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
 *         var default_ = new HostingCustomDomain("default", HostingCustomDomainArgs.builder()
 *             .project("my-project-name")
 *             .siteId("site-id")
 *             .customDomain("custom.domain.com")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Firebasehosting Customdomain Full
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
 * import com.pulumi.gcp.firebase.HostingCustomDomain;
 * import com.pulumi.gcp.firebase.HostingCustomDomainArgs;
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
 *             .siteId("site-id-full")
 *             .build());
 * 
 *         var defaultHostingCustomDomain = new HostingCustomDomain("defaultHostingCustomDomain", HostingCustomDomainArgs.builder()
 *             .project("my-project-name")
 *             .siteId(default_.siteId())
 *             .customDomain("source.domain.com")
 *             .certPreference("GROUPED")
 *             .redirectTarget("destination.domain.com")
 *             .waitDnsVerification(false)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Firebasehosting Customdomain Cloud Run
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
 * import com.pulumi.gcp.cloudrunv2.Service;
 * import com.pulumi.gcp.cloudrunv2.ServiceArgs;
 * import com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateArgs;
 * import com.pulumi.gcp.firebase.HostingVersion;
 * import com.pulumi.gcp.firebase.HostingVersionArgs;
 * import com.pulumi.gcp.firebase.inputs.HostingVersionConfigArgs;
 * import com.pulumi.gcp.firebase.HostingRelease;
 * import com.pulumi.gcp.firebase.HostingReleaseArgs;
 * import com.pulumi.gcp.firebase.HostingCustomDomain;
 * import com.pulumi.gcp.firebase.HostingCustomDomainArgs;
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
 *             .siteId("site-id")
 *             .build());
 * 
 *         var defaultService = new Service("defaultService", ServiceArgs.builder()
 *             .project("my-project-name")
 *             .name("cloud-run-service-via-hosting")
 *             .location("us-central1")
 *             .ingress("INGRESS_TRAFFIC_ALL")
 *             .template(ServiceTemplateArgs.builder()
 *                 .containers(ServiceTemplateContainerArgs.builder()
 *                     .image("us-docker.pkg.dev/cloudrun/container/hello")
 *                     .build())
 *                 .build())
 *             .deletionProtection(true)
 *             .build());
 * 
 *         var defaultHostingVersion = new HostingVersion("defaultHostingVersion", HostingVersionArgs.builder()
 *             .siteId(default_.siteId())
 *             .config(HostingVersionConfigArgs.builder()
 *                 .rewrites(HostingVersionConfigRewriteArgs.builder()
 *                     .glob("/hello/**")
 *                     .run(HostingVersionConfigRewriteRunArgs.builder()
 *                         .serviceId(defaultService.name())
 *                         .region(defaultService.location())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var defaultHostingRelease = new HostingRelease("defaultHostingRelease", HostingReleaseArgs.builder()
 *             .siteId(default_.siteId())
 *             .versionName(defaultHostingVersion.name())
 *             .message("Cloud Run Integration")
 *             .build());
 * 
 *         var defaultHostingCustomDomain = new HostingCustomDomain("defaultHostingCustomDomain", HostingCustomDomainArgs.builder()
 *             .project("my-project-name")
 *             .siteId(default_.siteId())
 *             .customDomain("run.custom.domain.com")
 *             .waitDnsVerification(false)
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
 * CustomDomain can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/sites/{{site_id}}/customDomains/{{custom_domain}}`
 * 
 * * `sites/{{site_id}}/customDomains/{{custom_domain}}`
 * 
 * * `{{project}}/{{site_id}}/{{custom_domain}}`
 * 
 * * `{{site_id}}/{{custom_domain}}`
 * 
 * When using the `pulumi import` command, CustomDomain can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:firebase/hostingCustomDomain:HostingCustomDomain default projects/{{project}}/sites/{{site_id}}/customDomains/{{custom_domain}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:firebase/hostingCustomDomain:HostingCustomDomain default sites/{{site_id}}/customDomains/{{custom_domain}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:firebase/hostingCustomDomain:HostingCustomDomain default {{project}}/{{site_id}}/{{custom_domain}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:firebase/hostingCustomDomain:HostingCustomDomain default {{site_id}}/{{custom_domain}}
 * ```
 * 
 */
@ResourceType(type="gcp:firebase/hostingCustomDomain:HostingCustomDomain")
public class HostingCustomDomain extends com.pulumi.resources.CustomResource {
    /**
     * A field that lets you specify which SSL certificate type Hosting creates
     * for your domain name. Spark plan `CustomDomain`s only have access to the
     * `GROUPED` cert type, while Blaze plan can select any option.
     * Possible values are: `GROUPED`, `PROJECT_GROUPED`, `DEDICATED`.
     * 
     */
    @Export(name="certPreference", refs={String.class}, tree="[0]")
    private Output<String> certPreference;

    /**
     * @return A field that lets you specify which SSL certificate type Hosting creates
     * for your domain name. Spark plan `CustomDomain`s only have access to the
     * `GROUPED` cert type, while Blaze plan can select any option.
     * Possible values are: `GROUPED`, `PROJECT_GROUPED`, `DEDICATED`.
     * 
     */
    public Output<String> certPreference() {
        return this.certPreference;
    }
    /**
     * The SSL certificate Hosting has for this `CustomDomain`&#39;s domain name.
     * For new `CustomDomain`s, this often represents Hosting&#39;s intent to create
     * a certificate, rather than an actual cert. Check the `state` field for
     * more.
     * Structure is documented below.
     * 
     */
    @Export(name="certs", refs={List.class,HostingCustomDomainCert.class}, tree="[0,1]")
    private Output<List<HostingCustomDomainCert>> certs;

    /**
     * @return The SSL certificate Hosting has for this `CustomDomain`&#39;s domain name.
     * For new `CustomDomain`s, this often represents Hosting&#39;s intent to create
     * a certificate, rather than an actual cert. Check the `state` field for
     * more.
     * Structure is documented below.
     * 
     */
    public Output<List<HostingCustomDomainCert>> certs() {
        return this.certs;
    }
    /**
     * The `CustomDomain`&#39;s create time.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The `CustomDomain`&#39;s create time.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The ID of the `CustomDomain`, which is the domain name you&#39;d like to use with Firebase Hosting.
     * 
     */
    @Export(name="customDomain", refs={String.class}, tree="[0]")
    private Output<String> customDomain;

    /**
     * @return The ID of the `CustomDomain`, which is the domain name you&#39;d like to use with Firebase Hosting.
     * 
     */
    public Output<String> customDomain() {
        return this.customDomain;
    }
    /**
     * The time the `CustomDomain` was deleted; null for `CustomDomains` that
     * haven&#39;t been deleted. Deleted `CustomDomains` persist for approximately 30
     * days, after which time Hosting removes them completely.
     * 
     */
    @Export(name="deleteTime", refs={String.class}, tree="[0]")
    private Output<String> deleteTime;

    /**
     * @return The time the `CustomDomain` was deleted; null for `CustomDomains` that
     * haven&#39;t been deleted. Deleted `CustomDomains` persist for approximately 30
     * days, after which time Hosting removes them completely.
     * 
     */
    public Output<String> deleteTime() {
        return this.deleteTime;
    }
    /**
     * A string that represents the current state of the `CustomDomain` and
     * allows you to confirm its initial state in requests that would modify it.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return A string that represents the current state of the `CustomDomain` and
     * allows you to confirm its initial state in requests that would modify it.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The minimum time before a soft-deleted `CustomDomain` is completely removed
     * from Hosting; null for `CustomDomains` that haven&#39;t been deleted.
     * 
     */
    @Export(name="expireTime", refs={String.class}, tree="[0]")
    private Output<String> expireTime;

    /**
     * @return The minimum time before a soft-deleted `CustomDomain` is completely removed
     * from Hosting; null for `CustomDomains` that haven&#39;t been deleted.
     * 
     */
    public Output<String> expireTime() {
        return this.expireTime;
    }
    /**
     * The host state of your domain name. Host state is determined by checking each
     * IP address associated with your domain name to see if it&#39;s serving
     * Hosting content.
     * HOST_UNHOSTED:
     * Your `CustomDomain`&#39;s domain name isn&#39;t associated with any IP addresses.
     * HOST_UNREACHABLE:
     * Your `CustomDomain`&#39;s domain name can&#39;t be reached. Hosting services&#39; DNS
     * queries to find your domain name&#39;s IP addresses resulted in errors. See
     * your `CustomDomain`&#39;s `issues` field for more details.
     * HOST_MISMATCH:
     * Your `CustomDomain`&#39;s domain name has IP addresses that don&#39;t ultimately
     * resolve to Hosting.
     * HOST_CONFLICT:
     * Your `CustomDomain`&#39;s domain name has IP addresses that resolve to both
     * Hosting and other services. To ensure consistent results, remove `A` and
     * `AAAA` records related to non-Hosting services.
     * HOST_ACTIVE:
     * All requests against your `CustomDomain`&#39;s domain name are served by
     * Hosting. If the `CustomDomain`&#39;s `OwnershipState` is also `ACTIVE`, Hosting
     * serves your Hosting Site&#39;s content on the domain name.
     * 
     */
    @Export(name="hostState", refs={String.class}, tree="[0]")
    private Output<String> hostState;

    /**
     * @return The host state of your domain name. Host state is determined by checking each
     * IP address associated with your domain name to see if it&#39;s serving
     * Hosting content.
     * HOST_UNHOSTED:
     * Your `CustomDomain`&#39;s domain name isn&#39;t associated with any IP addresses.
     * HOST_UNREACHABLE:
     * Your `CustomDomain`&#39;s domain name can&#39;t be reached. Hosting services&#39; DNS
     * queries to find your domain name&#39;s IP addresses resulted in errors. See
     * your `CustomDomain`&#39;s `issues` field for more details.
     * HOST_MISMATCH:
     * Your `CustomDomain`&#39;s domain name has IP addresses that don&#39;t ultimately
     * resolve to Hosting.
     * HOST_CONFLICT:
     * Your `CustomDomain`&#39;s domain name has IP addresses that resolve to both
     * Hosting and other services. To ensure consistent results, remove `A` and
     * `AAAA` records related to non-Hosting services.
     * HOST_ACTIVE:
     * All requests against your `CustomDomain`&#39;s domain name are served by
     * Hosting. If the `CustomDomain`&#39;s `OwnershipState` is also `ACTIVE`, Hosting
     * serves your Hosting Site&#39;s content on the domain name.
     * 
     */
    public Output<String> hostState() {
        return this.hostState;
    }
    /**
     * A set of errors Hosting systems encountered when trying to establish
     * Hosting&#39;s ability to serve secure content for your domain name. Resolve
     * these issues to ensure your `CustomDomain` behaves properly.
     * Structure is documented below.
     * 
     */
    @Export(name="issues", refs={List.class,HostingCustomDomainIssue.class}, tree="[0,1]")
    private Output<List<HostingCustomDomainIssue>> issues;

    /**
     * @return A set of errors Hosting systems encountered when trying to establish
     * Hosting&#39;s ability to serve secure content for your domain name. Resolve
     * these issues to ensure your `CustomDomain` behaves properly.
     * Structure is documented below.
     * 
     */
    public Output<List<HostingCustomDomainIssue>> issues() {
        return this.issues;
    }
    /**
     * The fully-qualified name of the `CustomDomain`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The fully-qualified name of the `CustomDomain`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ownership state of your domain name. Ownership is determined at a
     * Firebase project level, and established by adding `TXT` records to your
     * domain name&#39;s DNS records.
     * Ownership cascades to subdomains. Granting a project ownership of `foo.com`
     * also grants that project ownership over `bar.foo.com`, unless you add
     * specific `TXT` records to `bar.foo.com` that grant a different project
     * ownership.
     * If your `CustomDomain` is in an `OwnershipState` other than
     * `OWNERSHIP_ACTIVE` for more than 30 days and it hasn&#39;t been updated in at
     * least 30 days, Hosting&#39;s ownership systems delete the `CustomDomain`.
     * OWNERSHIP_MISSING:
     * Your `CustomDomain`&#39;s domain name has no Hosting-related ownership records;
     * no Firebase project has permission to act on the domain name&#39;s behalf.
     * OWNERSHIP_UNREACHABLE:
     * Your `CustomDomain`&#39;s domain name can&#39;t be reached. Hosting services&#39; DNS
     * queries to find your domain name&#39;s ownership records resulted in errors.
     * See your `CustomDomain`&#39;s `issues` field for more details.
     * OWNERSHIP_MISMATCH:
     * Your `CustomDomain`&#39;s domain name is owned by another Firebase project.
     * Remove the conflicting `TXT` records and replace them with project-specific
     * records for your current Firebase project.
     * OWNERSHIP_CONFLICT:
     * Your `CustomDomain`&#39;s domain name has conflicting `TXT` records that
     * indicate ownership by both your current Firebase project and another
     * project. Remove the other project&#39;s ownership records to grant the current
     * project ownership.
     * OWNERSHIP_PENDING:
     * Your `CustomDomain`&#39;s DNS records are configured correctly. Hosting will
     * transfer ownership of your domain to this `CustomDomain` within 24 hours.
     * OWNERSHIP_ACTIVE:
     * Your `CustomDomain`&#39;s domain name has `TXT` records that grant its project
     * permission to act on its behalf.
     * 
     */
    @Export(name="ownershipState", refs={String.class}, tree="[0]")
    private Output<String> ownershipState;

    /**
     * @return The ownership state of your domain name. Ownership is determined at a
     * Firebase project level, and established by adding `TXT` records to your
     * domain name&#39;s DNS records.
     * Ownership cascades to subdomains. Granting a project ownership of `foo.com`
     * also grants that project ownership over `bar.foo.com`, unless you add
     * specific `TXT` records to `bar.foo.com` that grant a different project
     * ownership.
     * If your `CustomDomain` is in an `OwnershipState` other than
     * `OWNERSHIP_ACTIVE` for more than 30 days and it hasn&#39;t been updated in at
     * least 30 days, Hosting&#39;s ownership systems delete the `CustomDomain`.
     * OWNERSHIP_MISSING:
     * Your `CustomDomain`&#39;s domain name has no Hosting-related ownership records;
     * no Firebase project has permission to act on the domain name&#39;s behalf.
     * OWNERSHIP_UNREACHABLE:
     * Your `CustomDomain`&#39;s domain name can&#39;t be reached. Hosting services&#39; DNS
     * queries to find your domain name&#39;s ownership records resulted in errors.
     * See your `CustomDomain`&#39;s `issues` field for more details.
     * OWNERSHIP_MISMATCH:
     * Your `CustomDomain`&#39;s domain name is owned by another Firebase project.
     * Remove the conflicting `TXT` records and replace them with project-specific
     * records for your current Firebase project.
     * OWNERSHIP_CONFLICT:
     * Your `CustomDomain`&#39;s domain name has conflicting `TXT` records that
     * indicate ownership by both your current Firebase project and another
     * project. Remove the other project&#39;s ownership records to grant the current
     * project ownership.
     * OWNERSHIP_PENDING:
     * Your `CustomDomain`&#39;s DNS records are configured correctly. Hosting will
     * transfer ownership of your domain to this `CustomDomain` within 24 hours.
     * OWNERSHIP_ACTIVE:
     * Your `CustomDomain`&#39;s domain name has `TXT` records that grant its project
     * permission to act on its behalf.
     * 
     */
    public Output<String> ownershipState() {
        return this.ownershipState;
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
     * if true, indicates that Hosting&#39;s systems are attempting to
     * make the `CustomDomain`&#39;s state match your preferred state. This is most
     * frequently `true` when initially provisioning a `CustomDomain` or when creating
     * a new SSL certificate to match an updated `cert_preference`
     * 
     */
    @Export(name="reconciling", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> reconciling;

    /**
     * @return if true, indicates that Hosting&#39;s systems are attempting to
     * make the `CustomDomain`&#39;s state match your preferred state. This is most
     * frequently `true` when initially provisioning a `CustomDomain` or when creating
     * a new SSL certificate to match an updated `cert_preference`
     * 
     */
    public Output<Boolean> reconciling() {
        return this.reconciling;
    }
    /**
     * A domain name that this CustomDomain should direct traffic towards. If
     * specified, Hosting will respond to requests against this CustomDomain
     * with an HTTP 301 code, and route traffic to the specified `redirect_target`
     * instead.
     * 
     */
    @Export(name="redirectTarget", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> redirectTarget;

    /**
     * @return A domain name that this CustomDomain should direct traffic towards. If
     * specified, Hosting will respond to requests against this CustomDomain
     * with an HTTP 301 code, and route traffic to the specified `redirect_target`
     * instead.
     * 
     */
    public Output<Optional<String>> redirectTarget() {
        return Codegen.optional(this.redirectTarget);
    }
    /**
     * A set of updates you should make to the domain name&#39;s DNS records to
     * let Hosting serve secure content on its behalf.
     * Structure is documented below.
     * 
     */
    @Export(name="requiredDnsUpdates", refs={List.class,HostingCustomDomainRequiredDnsUpdate.class}, tree="[0,1]")
    private Output<List<HostingCustomDomainRequiredDnsUpdate>> requiredDnsUpdates;

    /**
     * @return A set of updates you should make to the domain name&#39;s DNS records to
     * let Hosting serve secure content on its behalf.
     * Structure is documented below.
     * 
     */
    public Output<List<HostingCustomDomainRequiredDnsUpdate>> requiredDnsUpdates() {
        return this.requiredDnsUpdates;
    }
    /**
     * The ID of the site in which to create this custom domain association.
     * 
     */
    @Export(name="siteId", refs={String.class}, tree="[0]")
    private Output<String> siteId;

    /**
     * @return The ID of the site in which to create this custom domain association.
     * 
     */
    public Output<String> siteId() {
        return this.siteId;
    }
    /**
     * The last time the `CustomDomain` was updated.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return The last time the `CustomDomain` was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    @Export(name="waitDnsVerification", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> waitDnsVerification;

    public Output<Optional<Boolean>> waitDnsVerification() {
        return Codegen.optional(this.waitDnsVerification);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HostingCustomDomain(java.lang.String name) {
        this(name, HostingCustomDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HostingCustomDomain(java.lang.String name, HostingCustomDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HostingCustomDomain(java.lang.String name, HostingCustomDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firebase/hostingCustomDomain:HostingCustomDomain", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private HostingCustomDomain(java.lang.String name, Output<java.lang.String> id, @Nullable HostingCustomDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firebase/hostingCustomDomain:HostingCustomDomain", name, state, makeResourceOptions(options, id), false);
    }

    private static HostingCustomDomainArgs makeArgs(HostingCustomDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? HostingCustomDomainArgs.Empty : args;
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
    public static HostingCustomDomain get(java.lang.String name, Output<java.lang.String> id, @Nullable HostingCustomDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HostingCustomDomain(name, id, state, options);
    }
}
