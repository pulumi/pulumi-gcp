// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.firebase.AppHostingBuildArgs;
import com.pulumi.gcp.firebase.inputs.AppHostingBuildState;
import com.pulumi.gcp.firebase.outputs.AppHostingBuildError;
import com.pulumi.gcp.firebase.outputs.AppHostingBuildSource;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A single build for a backend, at a specific point codebase reference tag
 * and point in time. Encapsulates several resources, including an Artifact Registry
 * container image, a Cloud Build invocation that built the image, and the
 * Cloud Run revision that uses that image.
 * 
 * ## Example Usage
 * 
 * ### Firebase App Hosting Build Minimal
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
 * import com.pulumi.gcp.projects.Service;
 * import com.pulumi.gcp.projects.ServiceArgs;
 * import com.pulumi.gcp.firebase.AppHostingBackend;
 * import com.pulumi.gcp.firebase.AppHostingBackendArgs;
 * import com.pulumi.gcp.firebase.AppHostingBuild;
 * import com.pulumi.gcp.firebase.AppHostingBuildArgs;
 * import com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceArgs;
 * import com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceContainerArgs;
 * import com.pulumi.gcp.projects.IAMMember;
 * import com.pulumi.gcp.projects.IAMMemberArgs;
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
 *         //## Include these blocks only once per project if you are starting from scratch ###
 *         var serviceAccount = new Account("serviceAccount", AccountArgs.builder()
 *             .project("my-project-name")
 *             .accountId("firebase-app-hosting-compute")
 *             .displayName("Firebase App Hosting compute service account")
 *             .createIgnoreAlreadyExists(true)
 *             .build());
 * 
 *         var fah = new Service("fah", ServiceArgs.builder()
 *             .project("my-project-name")
 *             .service("firebaseapphosting.googleapis.com")
 *             .disableOnDestroy(false)
 *             .build());
 * 
 *         var exampleAppHostingBackend = new AppHostingBackend("exampleAppHostingBackend", AppHostingBackendArgs.builder()
 *             .project("my-project-name")
 *             .location("us-central1")
 *             .backendId("mini")
 *             .appId("1:0000000000:web:674cde32020e16fbce9dbd")
 *             .servingLocality("GLOBAL_ACCESS")
 *             .serviceAccount(serviceAccount.email())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(fah)
 *                 .build());
 * 
 *         var example = new AppHostingBuild("example", AppHostingBuildArgs.builder()
 *             .project(exampleAppHostingBackend.project())
 *             .location(exampleAppHostingBackend.location())
 *             .backend(exampleAppHostingBackend.backendId())
 *             .buildId("mini-build")
 *             .source(AppHostingBuildSourceArgs.builder()
 *                 .container(AppHostingBuildSourceContainerArgs.builder()
 *                     .image("us-docker.pkg.dev/cloudrun/container/hello")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var appHostingSaRunner = new IAMMember("appHostingSaRunner", IAMMemberArgs.builder()
 *             .project("my-project-name")
 *             .role("roles/firebaseapphosting.computeRunner")
 *             .member(serviceAccount.member())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Firebase App Hosting Build Full
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
 * import com.pulumi.gcp.projects.Service;
 * import com.pulumi.gcp.projects.ServiceArgs;
 * import com.pulumi.gcp.firebase.AppHostingBackend;
 * import com.pulumi.gcp.firebase.AppHostingBackendArgs;
 * import com.pulumi.gcp.firebase.AppHostingBuild;
 * import com.pulumi.gcp.firebase.AppHostingBuildArgs;
 * import com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceArgs;
 * import com.pulumi.gcp.firebase.inputs.AppHostingBuildSourceContainerArgs;
 * import com.pulumi.gcp.projects.IAMMember;
 * import com.pulumi.gcp.projects.IAMMemberArgs;
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
 *         //## Include these blocks only once per project if you are starting from scratch ###
 *         var serviceAccount = new Account("serviceAccount", AccountArgs.builder()
 *             .project("my-project-name")
 *             .accountId("firebase-app-hosting-compute")
 *             .displayName("Firebase App Hosting compute service account")
 *             .createIgnoreAlreadyExists(true)
 *             .build());
 * 
 *         var fah = new Service("fah", ServiceArgs.builder()
 *             .project("my-project-name")
 *             .service("firebaseapphosting.googleapis.com")
 *             .disableOnDestroy(false)
 *             .build());
 * 
 *         var exampleAppHostingBackend = new AppHostingBackend("exampleAppHostingBackend", AppHostingBackendArgs.builder()
 *             .project("my-project-name")
 *             .location("us-central1")
 *             .backendId("full")
 *             .appId("1:0000000000:web:674cde32020e16fbce9dbd")
 *             .servingLocality("GLOBAL_ACCESS")
 *             .serviceAccount(serviceAccount.email())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(fah)
 *                 .build());
 * 
 *         var example = new AppHostingBuild("example", AppHostingBuildArgs.builder()
 *             .project(exampleAppHostingBackend.project())
 *             .location(exampleAppHostingBackend.location())
 *             .backend(exampleAppHostingBackend.backendId())
 *             .buildId("full-build")
 *             .displayName("My Build")
 *             .annotations(Map.of("key", "value"))
 *             .labels(Map.of("key", "value"))
 *             .source(AppHostingBuildSourceArgs.builder()
 *                 .container(AppHostingBuildSourceContainerArgs.builder()
 *                     .image("us-docker.pkg.dev/cloudrun/container/hello")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var appHostingSaRunner = new IAMMember("appHostingSaRunner", IAMMemberArgs.builder()
 *             .project("my-project-name")
 *             .role("roles/firebaseapphosting.computeRunner")
 *             .member(serviceAccount.member())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Firebase App Hosting Build Github
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Build can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/backends/{{backend}}/builds/{{build_id}}`
 * 
 * * `{{project}}/{{location}}/{{backend}}/{{build_id}}`
 * 
 * * `{{location}}/{{backend}}/{{build_id}}`
 * 
 * When using the `pulumi import` command, Build can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:firebase/appHostingBuild:AppHostingBuild default projects/{{project}}/locations/{{location}}/backends/{{backend}}/builds/{{build_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:firebase/appHostingBuild:AppHostingBuild default {{project}}/{{location}}/{{backend}}/{{build_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:firebase/appHostingBuild:AppHostingBuild default {{location}}/{{backend}}/{{build_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:firebase/appHostingBuild:AppHostingBuild")
public class AppHostingBuild extends com.pulumi.resources.CustomResource {
    /**
     * Unstructured key value map that may be set by external tools to
     * store and arbitrary metadata. They are not queryable and should be
     * preserved when modifying objects.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> annotations;

    /**
     * @return Unstructured key value map that may be set by external tools to
     * store and arbitrary metadata. They are not queryable and should be
     * preserved when modifying objects.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * The ID of the Backend that this Build applies to
     * 
     */
    @Export(name="backend", refs={String.class}, tree="[0]")
    private Output<String> backend;

    /**
     * @return The ID of the Backend that this Build applies to
     * 
     */
    public Output<String> backend() {
        return this.backend;
    }
    /**
     * The user-specified ID of the build being created.
     * 
     */
    @Export(name="buildId", refs={String.class}, tree="[0]")
    private Output<String> buildId;

    /**
     * @return The user-specified ID of the build being created.
     * 
     */
    public Output<String> buildId() {
        return this.buildId;
    }
    /**
     * The location of the [Cloud Build
     * logs](https://cloud.google.com/build/docs/view-build-results) for the build
     * process.
     * 
     */
    @Export(name="buildLogsUri", refs={String.class}, tree="[0]")
    private Output<String> buildLogsUri;

    /**
     * @return The location of the [Cloud Build
     * logs](https://cloud.google.com/build/docs/view-build-results) for the build
     * process.
     * 
     */
    public Output<String> buildLogsUri() {
        return this.buildLogsUri;
    }
    /**
     * Time at which the build was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Time at which the build was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Human-readable name. 63 character limit.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Human-readable name. 63 character limit.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    @Export(name="effectiveAnnotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> effectiveAnnotations;

    public Output<Map<String,String>> effectiveAnnotations() {
        return this.effectiveAnnotations;
    }
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Export(name="effectiveLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Output<Map<String,String>> effectiveLabels() {
        return this.effectiveLabels;
    }
    /**
     * The environment name of the backend when this build was created.
     * 
     */
    @Export(name="environment", refs={String.class}, tree="[0]")
    private Output<String> environment;

    /**
     * @return The environment name of the backend when this build was created.
     * 
     */
    public Output<String> environment() {
        return this.environment;
    }
    /**
     * The source of the error for the build, if in a `FAILED` state.
     * Possible values:
     * CLOUD_BUILD
     * CLOUD_RUN
     * 
     */
    @Export(name="errorSource", refs={String.class}, tree="[0]")
    private Output<String> errorSource;

    /**
     * @return The source of the error for the build, if in a `FAILED` state.
     * Possible values:
     * CLOUD_BUILD
     * CLOUD_RUN
     * 
     */
    public Output<String> errorSource() {
        return this.errorSource;
    }
    /**
     * The `Status` type defines a logical error model that is suitable for
     * different programming environments, including REST APIs and RPC APIs. It is
     * used by [gRPC](https://github.com/grpc). Each `Status` message contains
     * three pieces of data: error code, error message, and error details.
     * You can find out more about this error model and how to work with it in the
     * [API Design Guide](https://cloud.google.com/apis/design/errors).
     * Structure is documented below.
     * 
     */
    @Export(name="errors", refs={List.class,AppHostingBuildError.class}, tree="[0,1]")
    private Output<List<AppHostingBuildError>> errors;

    /**
     * @return The `Status` type defines a logical error model that is suitable for
     * different programming environments, including REST APIs and RPC APIs. It is
     * used by [gRPC](https://github.com/grpc). Each `Status` message contains
     * three pieces of data: error code, error message, and error details.
     * You can find out more about this error model and how to work with it in the
     * [API Design Guide](https://cloud.google.com/apis/design/errors).
     * Structure is documented below.
     * 
     */
    public Output<List<AppHostingBuildError>> errors() {
        return this.errors;
    }
    /**
     * Server-computed checksum based on other values; may be sent
     * on update or delete to ensure operation is done on expected resource.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return Server-computed checksum based on other values; may be sent
     * on update or delete to ensure operation is done on expected resource.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The Artifact Registry
     * [container
     * image](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.dockerImages)
     * URI, used by the Cloud Run
     * [`revision`](https://cloud.google.com/run/docs/reference/rest/v2/projects.locations.services.revisions)
     * for this build.
     * 
     */
    @Export(name="image", refs={String.class}, tree="[0]")
    private Output<String> image;

    /**
     * @return The Artifact Registry
     * [container
     * image](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.dockerImages)
     * URI, used by the Cloud Run
     * [`revision`](https://cloud.google.com/run/docs/reference/rest/v2/projects.locations.services.revisions)
     * for this build.
     * 
     */
    public Output<String> image() {
        return this.image;
    }
    /**
     * Unstructured key value map that can be used to organize and categorize
     * objects.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Unstructured key value map that can be used to organize and categorize
     * objects.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The location of the Backend that this Build applies to
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location of the Backend that this Build applies to
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Identifier. The resource name of the build.
     * Format:
     * `projects/{project}/locations/{locationId}/backends/{backendId}/builds/{buildId}`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Identifier. The resource name of the build.
     * Format:
     * `projects/{project}/locations/{locationId}/backends/{backendId}/builds/{buildId}`.
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
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Export(name="pulumiLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Output<Map<String,String>> pulumiLabels() {
        return this.pulumiLabels;
    }
    /**
     * The source for the build.
     * Structure is documented below.
     * 
     */
    @Export(name="source", refs={AppHostingBuildSource.class}, tree="[0]")
    private Output<AppHostingBuildSource> source;

    /**
     * @return The source for the build.
     * Structure is documented below.
     * 
     */
    public Output<AppHostingBuildSource> source() {
        return this.source;
    }
    /**
     * The state of the build.
     * Possible values:
     * BUILDING
     * BUILT
     * DEPLOYING
     * READY
     * FAILED
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The state of the build.
     * Possible values:
     * BUILDING
     * BUILT
     * DEPLOYING
     * READY
     * FAILED
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * System-assigned, unique identifier.
     * 
     */
    @Export(name="uid", refs={String.class}, tree="[0]")
    private Output<String> uid;

    /**
     * @return System-assigned, unique identifier.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * Time at which the build was last updated.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return Time at which the build was last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppHostingBuild(java.lang.String name) {
        this(name, AppHostingBuildArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppHostingBuild(java.lang.String name, AppHostingBuildArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppHostingBuild(java.lang.String name, AppHostingBuildArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firebase/appHostingBuild:AppHostingBuild", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AppHostingBuild(java.lang.String name, Output<java.lang.String> id, @Nullable AppHostingBuildState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firebase/appHostingBuild:AppHostingBuild", name, state, makeResourceOptions(options, id), false);
    }

    private static AppHostingBuildArgs makeArgs(AppHostingBuildArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppHostingBuildArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "effectiveLabels",
                "pulumiLabels"
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
    public static AppHostingBuild get(java.lang.String name, Output<java.lang.String> id, @Nullable AppHostingBuildState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppHostingBuild(name, id, state, options);
    }
}
