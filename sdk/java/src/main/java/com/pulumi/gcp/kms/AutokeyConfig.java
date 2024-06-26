// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.kms.AutokeyConfigArgs;
import com.pulumi.gcp.kms.inputs.AutokeyConfigState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Kms Autokey Config All
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.Folder;
 * import com.pulumi.gcp.organizations.FolderArgs;
 * import com.pulumi.gcp.organizations.Project;
 * import com.pulumi.gcp.organizations.ProjectArgs;
 * import com.pulumi.gcp.projects.Service;
 * import com.pulumi.gcp.projects.ServiceArgs;
 * import com.pulumi.time.sleep;
 * import com.pulumi.time.SleepArgs;
 * import com.pulumi.gcp.projects.ServiceIdentity;
 * import com.pulumi.gcp.projects.ServiceIdentityArgs;
 * import com.pulumi.gcp.projects.IAMMember;
 * import com.pulumi.gcp.projects.IAMMemberArgs;
 * import com.pulumi.gcp.kms.AutokeyConfig;
 * import com.pulumi.gcp.kms.AutokeyConfigArgs;
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
 *         // Create Folder in GCP Organization
 *         var autokmsFolder = new Folder("autokmsFolder", FolderArgs.builder()
 *             .displayName("my-folder")
 *             .parent("organizations/123456789")
 *             .build());
 * 
 *         // Create the key project
 *         var keyProject = new Project("keyProject", ProjectArgs.builder()
 *             .projectId("key-proj")
 *             .name("key-proj")
 *             .folderId(autokmsFolder.folderId())
 *             .billingAccount("000000-0000000-0000000-000000")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(autokmsFolder)
 *                 .build());
 * 
 *         // Enable the Cloud KMS API
 *         var kmsApiService = new Service("kmsApiService", ServiceArgs.builder()
 *             .service("cloudkms.googleapis.com")
 *             .project(keyProject.projectId())
 *             .disableOnDestroy(false)
 *             .disableDependentServices(true)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(keyProject)
 *                 .build());
 * 
 *         // Wait delay after enabling APIs
 *         var waitEnableServiceApi = new Sleep("waitEnableServiceApi", SleepArgs.builder()
 *             .createDuration("30s")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(kmsApiService)
 *                 .build());
 * 
 *         //Create KMS Service Agent
 *         var kmsServiceAgent = new ServiceIdentity("kmsServiceAgent", ServiceIdentityArgs.builder()
 *             .service("cloudkms.googleapis.com")
 *             .project(keyProject.number())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(waitEnableServiceApi)
 *                 .build());
 * 
 *         // Wait delay after creating service agent.
 *         var waitServiceAgent = new Sleep("waitServiceAgent", SleepArgs.builder()
 *             .createDuration("10s")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(kmsServiceAgent)
 *                 .build());
 * 
 *         //Grant the KMS Service Agent the Cloud KMS Admin role
 *         var autokeyProjectAdmin = new IAMMember("autokeyProjectAdmin", IAMMemberArgs.builder()
 *             .project(keyProject.projectId())
 *             .role("roles/cloudkms.admin")
 *             .member(keyProject.number().applyValue(number -> String.format("serviceAccount:service-%s{@literal @}gcp-sa-cloudkms.iam.gserviceaccount.com", number)))
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(waitServiceAgent)
 *                 .build());
 * 
 *         // Wait delay after granting IAM permissions
 *         var waitSrvAccPermissions = new Sleep("waitSrvAccPermissions", SleepArgs.builder()
 *             .createDuration("10s")
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(autokeyProjectAdmin)
 *                 .build());
 * 
 *         var example_autokeyconfig = new AutokeyConfig("example-autokeyconfig", AutokeyConfigArgs.builder()
 *             .folder(autokmsFolder.folderId())
 *             .keyProject(keyProject.projectId().applyValue(projectId -> String.format("projects/%s", projectId)))
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(waitSrvAccPermissions)
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
 * AutokeyConfig can be imported using any of these accepted formats:
 * 
 * * `folders/{{folder}}/autokeyConfig`
 * 
 * * `{{folder}}`
 * 
 * When using the `pulumi import` command, AutokeyConfig can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:kms/autokeyConfig:AutokeyConfig default folders/{{folder}}/autokeyConfig
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:kms/autokeyConfig:AutokeyConfig default {{folder}}
 * ```
 * 
 */
@ResourceType(type="gcp:kms/autokeyConfig:AutokeyConfig")
public class AutokeyConfig extends com.pulumi.resources.CustomResource {
    /**
     * The folder for which to retrieve config.
     * 
     * ***
     * 
     */
    @Export(name="folder", refs={String.class}, tree="[0]")
    private Output<String> folder;

    /**
     * @return The folder for which to retrieve config.
     * 
     * ***
     * 
     */
    public Output<String> folder() {
        return this.folder;
    }
    /**
     * The target key project for a given folder where KMS Autokey will provision a
     * CryptoKey for any new KeyHandle the Developer creates. Should have the form
     * `projects/&lt;project_id_or_number&gt;`.
     * 
     */
    @Export(name="keyProject", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keyProject;

    /**
     * @return The target key project for a given folder where KMS Autokey will provision a
     * CryptoKey for any new KeyHandle the Developer creates. Should have the form
     * `projects/&lt;project_id_or_number&gt;`.
     * 
     */
    public Output<Optional<String>> keyProject() {
        return Codegen.optional(this.keyProject);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutokeyConfig(String name) {
        this(name, AutokeyConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutokeyConfig(String name, AutokeyConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutokeyConfig(String name, AutokeyConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/autokeyConfig:AutokeyConfig", name, args == null ? AutokeyConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AutokeyConfig(String name, Output<String> id, @Nullable AutokeyConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/autokeyConfig:AutokeyConfig", name, state, makeResourceOptions(options, id));
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
    public static AutokeyConfig get(String name, Output<String> id, @Nullable AutokeyConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutokeyConfig(name, id, state, options);
    }
}
