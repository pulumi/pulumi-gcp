// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.serviceaccount;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.serviceaccount.AccountArgs;
import com.pulumi.gcp.serviceaccount.inputs.AccountState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Allows management of a Google Cloud service account.
 * 
 * * [API documentation](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/access/service-accounts)
 * 
 * &gt; **Warning:**  If you delete and recreate a service account, you must reapply any IAM roles that it had before.
 * 
 * &gt; Creation of service accounts is eventually consistent, and that can lead to
 * errors when you try to apply ACLs to service accounts immediately after
 * creation.
 * 
 * ## Example Usage
 * 
 * This snippet creates a service account in a project.
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
 *             .accountId("service-account-id")
 *             .displayName("Service Account")
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
 * Service accounts can be imported using their URI, e.g.
 * 
 * * `projects/{{project_id}}/serviceAccounts/{{email}}`
 * 
 * When using the `pulumi import` command, service accounts can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:serviceaccount/account:Account default projects/{{project_id}}/serviceAccounts/{{email}}
 * ```
 * 
 */
@ResourceType(type="gcp:serviceaccount/account:Account")
public class Account extends com.pulumi.resources.CustomResource {
    /**
     * The account id that is used to generate the service
     * account email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression `a-z`
     * to comply with RFC1035. Changing this forces a new service account to be created.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account id that is used to generate the service
     * account email address and a stable unique id. It is unique within a project,
     * must be 6-30 characters long, and match the regular expression `a-z`
     * to comply with RFC1035. Changing this forces a new service account to be created.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * If set to true, skip service account creation if a service account with the same email already exists.
     * 
     */
    @Export(name="createIgnoreAlreadyExists", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> createIgnoreAlreadyExists;

    /**
     * @return If set to true, skip service account creation if a service account with the same email already exists.
     * 
     */
    public Output<Optional<Boolean>> createIgnoreAlreadyExists() {
        return Codegen.optional(this.createIgnoreAlreadyExists);
    }
    /**
     * A text description of the service account.
     * Must be less than or equal to 256 UTF-8 bytes.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A text description of the service account.
     * Must be less than or equal to 256 UTF-8 bytes.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether a service account is disabled or not. Defaults to `false`. This field has no effect during creation.
     * Must be set after creation to disable a service account.
     * 
     */
    @Export(name="disabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return Whether a service account is disabled or not. Defaults to `false`. This field has no effect during creation.
     * Must be set after creation to disable a service account.
     * 
     */
    public Output<Optional<Boolean>> disabled() {
        return Codegen.optional(this.disabled);
    }
    /**
     * The display name for the service account.
     * Can be updated without creating a new resource.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name for the service account.
     * Can be updated without creating a new resource.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * The e-mail address of the service account. This value
     * should be referenced from any `gcp.organizations.getIAMPolicy` data sources
     * that would grant the service account privileges.
     * 
     */
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output<String> email;

    /**
     * @return The e-mail address of the service account. This value
     * should be referenced from any `gcp.organizations.getIAMPolicy` data sources
     * that would grant the service account privileges.
     * 
     */
    public Output<String> email() {
        return this.email;
    }
    /**
     * The Identity of the service account in the form `serviceAccount:{email}`. This value is often used to refer to the service account in order to grant IAM permissions.
     * 
     */
    @Export(name="member", refs={String.class}, tree="[0]")
    private Output<String> member;

    /**
     * @return The Identity of the service account in the form `serviceAccount:{email}`. This value is often used to refer to the service account in order to grant IAM permissions.
     * 
     */
    public Output<String> member() {
        return this.member;
    }
    /**
     * The fully-qualified name of the service account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The fully-qualified name of the service account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project that the service account will be created in.
     * Defaults to the provider project configuration.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The ID of the project that the service account will be created in.
     * Defaults to the provider project configuration.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The unique id of the service account.
     * 
     */
    @Export(name="uniqueId", refs={String.class}, tree="[0]")
    private Output<String> uniqueId;

    /**
     * @return The unique id of the service account.
     * 
     */
    public Output<String> uniqueId() {
        return this.uniqueId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Account(java.lang.String name) {
        this(name, AccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Account(java.lang.String name, @Nullable AccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Account(java.lang.String name, @Nullable AccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:serviceaccount/account:Account", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Account(java.lang.String name, Output<java.lang.String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:serviceaccount/account:Account", name, state, makeResourceOptions(options, id), false);
    }

    private static AccountArgs makeArgs(@Nullable AccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AccountArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("gcp:serviceAccount/account:Account").build())
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
    public static Account get(java.lang.String name, Output<java.lang.String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, state, options);
    }
}
