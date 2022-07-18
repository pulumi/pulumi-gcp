// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.organizations.ProjectArgs;
import com.pulumi.gcp.organizations.inputs.ProjectState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Allows creation and management of a Google Cloud Platform project.
 * 
 * Projects created with this resource must be associated with an Organization.
 * See the [Organization documentation](https://cloud.google.com/resource-manager/docs/quickstarts) for more details.
 * 
 * The user or service account that is running this provider when creating a `gcp.organizations.Project`
 * resource must have `roles/resourcemanager.projectCreator` on the specified organization. See the
 * [Access Control for Organizations Using IAM](https://cloud.google.com/resource-manager/docs/access-control-org)
 * doc for more information.
 * 
 * &gt; This resource reads the specified billing account on every provider apply and plan operation so you must have permissions on the specified billing account.
 * 
 * To get more information about projects, see:
 * 
 * * [API documentation](https://cloud.google.com/resource-manager/reference/rest/v1/projects)
 * * How-to Guides
 *     * [Creating and managing projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects)
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var myProject = new Project(&#34;myProject&#34;, ProjectArgs.builder()        
 *             .orgId(&#34;1234567&#34;)
 *             .projectId(&#34;your-project-id&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * To create a project under a specific folder
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var department1 = new Folder(&#34;department1&#34;, FolderArgs.builder()        
 *             .displayName(&#34;Department 1&#34;)
 *             .parent(&#34;organizations/1234567&#34;)
 *             .build());
 * 
 *         var myProject_in_a_folder = new Project(&#34;myProject-in-a-folder&#34;, ProjectArgs.builder()        
 *             .projectId(&#34;your-project-id&#34;)
 *             .folderId(department1.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Projects can be imported using the `project_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:organizations/project:Project my_project your-project-id
 * ```
 * 
 */
@ResourceType(type="gcp:organizations/project:Project")
public class Project extends com.pulumi.resources.CustomResource {
    /**
     * Create the &#39;default&#39; network automatically.  Default `true`.
     * If set to `false`, the default network will be deleted.  Note that, for quota purposes, you
     * will still need to have 1 network slot available to create the project successfully, even if
     * you set `auto_create_network` to `false`, since the network will exist momentarily.
     * 
     */
    @Export(name="autoCreateNetwork", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoCreateNetwork;

    /**
     * @return Create the &#39;default&#39; network automatically.  Default `true`.
     * If set to `false`, the default network will be deleted.  Note that, for quota purposes, you
     * will still need to have 1 network slot available to create the project successfully, even if
     * you set `auto_create_network` to `false`, since the network will exist momentarily.
     * 
     */
    public Output<Optional<Boolean>> autoCreateNetwork() {
        return Codegen.optional(this.autoCreateNetwork);
    }
    /**
     * The alphanumeric ID of the billing account this project
     * belongs to. The user or service account performing this operation with the provider
     * must have at mininum Billing Account User privileges (`roles/billing.user`) on the billing account.
     * See [Google Cloud Billing API Access Control](https://cloud.google.com/billing/docs/how-to/billing-access)
     * for more details.
     * 
     */
    @Export(name="billingAccount", type=String.class, parameters={})
    private Output</* @Nullable */ String> billingAccount;

    /**
     * @return The alphanumeric ID of the billing account this project
     * belongs to. The user or service account performing this operation with the provider
     * must have at mininum Billing Account User privileges (`roles/billing.user`) on the billing account.
     * See [Google Cloud Billing API Access Control](https://cloud.google.com/billing/docs/how-to/billing-access)
     * for more details.
     * 
     */
    public Output<Optional<String>> billingAccount() {
        return Codegen.optional(this.billingAccount);
    }
    /**
     * The numeric ID of the folder this project should be
     * created under. Only one of `org_id` or `folder_id` may be
     * specified. If the `folder_id` is specified, then the project is
     * created under the specified folder. Changing this forces the
     * project to be migrated to the newly specified folder.
     * 
     */
    @Export(name="folderId", type=String.class, parameters={})
    private Output</* @Nullable */ String> folderId;

    /**
     * @return The numeric ID of the folder this project should be
     * created under. Only one of `org_id` or `folder_id` may be
     * specified. If the `folder_id` is specified, then the project is
     * created under the specified folder. Changing this forces the
     * project to be migrated to the newly specified folder.
     * 
     */
    public Output<Optional<String>> folderId() {
        return Codegen.optional(this.folderId);
    }
    /**
     * A set of key/value label pairs to assign to the project.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs to assign to the project.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The display name of the project.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The display name of the project.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The numeric identifier of the project.
     * 
     */
    @Export(name="number", type=String.class, parameters={})
    private Output<String> number;

    /**
     * @return The numeric identifier of the project.
     * 
     */
    public Output<String> number() {
        return this.number;
    }
    /**
     * The numeric ID of the organization this project belongs to.
     * Changing this forces a new project to be created.  Only one of
     * `org_id` or `folder_id` may be specified. If the `org_id` is
     * specified then the project is created at the top level. Changing
     * this forces the project to be migrated to the newly specified
     * organization.
     * 
     */
    @Export(name="orgId", type=String.class, parameters={})
    private Output</* @Nullable */ String> orgId;

    /**
     * @return The numeric ID of the organization this project belongs to.
     * Changing this forces a new project to be created.  Only one of
     * `org_id` or `folder_id` may be specified. If the `org_id` is
     * specified then the project is created at the top level. Changing
     * this forces the project to be migrated to the newly specified
     * organization.
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    /**
     * The project ID. Changing this forces a new project to be created.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return The project ID. Changing this forces a new project to be created.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * If true, the resource can be deleted
     * without deleting the Project via the Google API.
     * 
     */
    @Export(name="skipDelete", type=Boolean.class, parameters={})
    private Output<Boolean> skipDelete;

    /**
     * @return If true, the resource can be deleted
     * without deleting the Project via the Google API.
     * 
     */
    public Output<Boolean> skipDelete() {
        return this.skipDelete;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Project(String name) {
        this(name, ProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Project(String name, ProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Project(String name, ProjectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/project:Project", name, args == null ? ProjectArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Project(String name, Output<String> id, @Nullable ProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/project:Project", name, state, makeResourceOptions(options, id));
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
    public static Project get(String name, Output<String> id, @Nullable ProjectState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, state, options);
    }
}