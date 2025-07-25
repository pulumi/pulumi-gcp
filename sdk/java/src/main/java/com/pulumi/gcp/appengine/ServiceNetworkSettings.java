// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.appengine.ServiceNetworkSettingsArgs;
import com.pulumi.gcp.appengine.inputs.ServiceNetworkSettingsState;
import com.pulumi.gcp.appengine.outputs.ServiceNetworkSettingsNetworkSettings;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A NetworkSettings resource is a container for ingress settings for a version or service.
 * 
 * To get more information about ServiceNetworkSettings, see:
 * 
 * * [API documentation](https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services)
 * 
 * ## Example Usage
 * 
 * ### App Engine Service Network Settings
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.storage.Bucket;
 * import com.pulumi.gcp.storage.BucketArgs;
 * import com.pulumi.gcp.storage.BucketObject;
 * import com.pulumi.gcp.storage.BucketObjectArgs;
 * import com.pulumi.gcp.appengine.StandardAppVersion;
 * import com.pulumi.gcp.appengine.StandardAppVersionArgs;
 * import com.pulumi.gcp.appengine.inputs.StandardAppVersionEntrypointArgs;
 * import com.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentArgs;
 * import com.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentZipArgs;
 * import com.pulumi.gcp.appengine.ServiceNetworkSettings;
 * import com.pulumi.gcp.appengine.ServiceNetworkSettingsArgs;
 * import com.pulumi.gcp.appengine.inputs.ServiceNetworkSettingsNetworkSettingsArgs;
 * import com.pulumi.asset.FileAsset;
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
 *         var bucket = new Bucket("bucket", BucketArgs.builder()
 *             .name("appengine-static-content")
 *             .location("US")
 *             .build());
 * 
 *         var object = new BucketObject("object", BucketObjectArgs.builder()
 *             .name("hello-world.zip")
 *             .bucket(bucket.name())
 *             .source(new FileAsset("./test-fixtures/hello-world.zip"))
 *             .build());
 * 
 *         var internalapp = new StandardAppVersion("internalapp", StandardAppVersionArgs.builder()
 *             .versionId("v1")
 *             .service("internalapp")
 *             .deleteServiceOnDestroy(true)
 *             .runtime("nodejs20")
 *             .entrypoint(StandardAppVersionEntrypointArgs.builder()
 *                 .shell("node ./app.js")
 *                 .build())
 *             .deployment(StandardAppVersionDeploymentArgs.builder()
 *                 .zip(StandardAppVersionDeploymentZipArgs.builder()
 *                     .sourceUrl(Output.tuple(bucket.name(), object.name()).applyValue(values -> {
 *                         var bucketName = values.t1;
 *                         var objectName = values.t2;
 *                         return String.format("https://storage.googleapis.com/%s/%s", bucketName,objectName);
 *                     }))
 *                     .build())
 *                 .build())
 *             .envVariables(Map.of("port", "8080"))
 *             .build());
 * 
 *         var internalappServiceNetworkSettings = new ServiceNetworkSettings("internalappServiceNetworkSettings", ServiceNetworkSettingsArgs.builder()
 *             .service(internalapp.service())
 *             .networkSettings(ServiceNetworkSettingsNetworkSettingsArgs.builder()
 *                 .ingressTrafficAllowed("INGRESS_TRAFFIC_ALLOWED_INTERNAL_ONLY")
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
 * ServiceNetworkSettings can be imported using any of these accepted formats:
 * 
 * * `apps/{{project}}/services/{{service}}`
 * 
 * * `{{project}}/{{service}}`
 * 
 * * `{{service}}`
 * 
 * When using the `pulumi import` command, ServiceNetworkSettings can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:appengine/serviceNetworkSettings:ServiceNetworkSettings default apps/{{project}}/services/{{service}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:appengine/serviceNetworkSettings:ServiceNetworkSettings default {{project}}/{{service}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:appengine/serviceNetworkSettings:ServiceNetworkSettings default {{service}}
 * ```
 * 
 */
@ResourceType(type="gcp:appengine/serviceNetworkSettings:ServiceNetworkSettings")
public class ServiceNetworkSettings extends com.pulumi.resources.CustomResource {
    /**
     * Ingress settings for this service. Will apply to all versions.
     * Structure is documented below.
     * 
     */
    @Export(name="networkSettings", refs={ServiceNetworkSettingsNetworkSettings.class}, tree="[0]")
    private Output<ServiceNetworkSettingsNetworkSettings> networkSettings;

    /**
     * @return Ingress settings for this service. Will apply to all versions.
     * Structure is documented below.
     * 
     */
    public Output<ServiceNetworkSettingsNetworkSettings> networkSettings() {
        return this.networkSettings;
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
     * The name of the service these settings apply to.
     * 
     */
    @Export(name="service", refs={String.class}, tree="[0]")
    private Output<String> service;

    /**
     * @return The name of the service these settings apply to.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceNetworkSettings(java.lang.String name) {
        this(name, ServiceNetworkSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceNetworkSettings(java.lang.String name, ServiceNetworkSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceNetworkSettings(java.lang.String name, ServiceNetworkSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:appengine/serviceNetworkSettings:ServiceNetworkSettings", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ServiceNetworkSettings(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceNetworkSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:appengine/serviceNetworkSettings:ServiceNetworkSettings", name, state, makeResourceOptions(options, id), false);
    }

    private static ServiceNetworkSettingsArgs makeArgs(ServiceNetworkSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ServiceNetworkSettingsArgs.Empty : args;
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
    public static ServiceNetworkSettings get(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceNetworkSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceNetworkSettings(name, id, state, options);
    }
}
