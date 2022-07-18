// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctions;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.cloudfunctions.FunctionArgs;
import com.pulumi.gcp.cloudfunctions.inputs.FunctionState;
import com.pulumi.gcp.cloudfunctions.outputs.FunctionEventTrigger;
import com.pulumi.gcp.cloudfunctions.outputs.FunctionSecretEnvironmentVariable;
import com.pulumi.gcp.cloudfunctions.outputs.FunctionSecretVolume;
import com.pulumi.gcp.cloudfunctions.outputs.FunctionSourceRepository;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a new Cloud Function. For more information see:
 * 
 * * [API documentation](https://cloud.google.com/functions/docs/reference/rest/v1/projects.locations.functions)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/functions/docs)
 * 
 * &gt; **Warning:** As of November 1, 2019, newly created Functions are
 * private-by-default and will require [appropriate IAM permissions](https://cloud.google.com/functions/docs/reference/iam/roles)
 * to be invoked. See below examples for how to set up the appropriate permissions,
 * or view the [Cloud Functions IAM resources](https://www.terraform.io/docs/providers/google/r/cloudfunctions_cloud_function_iam.html)
 * for Cloud Functions.
 * 
 * ## Example Usage
 * ### Public Function
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
 *         var bucket = new Bucket(&#34;bucket&#34;, BucketArgs.builder()        
 *             .location(&#34;US&#34;)
 *             .build());
 * 
 *         var archive = new BucketObject(&#34;archive&#34;, BucketObjectArgs.builder()        
 *             .bucket(bucket.name())
 *             .source(new FileAsset(&#34;./path/to/zip/file/which/contains/code&#34;))
 *             .build());
 * 
 *         var function = new Function(&#34;function&#34;, FunctionArgs.builder()        
 *             .description(&#34;My function&#34;)
 *             .runtime(&#34;nodejs16&#34;)
 *             .availableMemoryMb(128)
 *             .sourceArchiveBucket(bucket.name())
 *             .sourceArchiveObject(archive.name())
 *             .triggerHttp(true)
 *             .entryPoint(&#34;helloGET&#34;)
 *             .build());
 * 
 *         var invoker = new FunctionIamMember(&#34;invoker&#34;, FunctionIamMemberArgs.builder()        
 *             .project(function.project())
 *             .region(function.region())
 *             .cloudFunction(function.name())
 *             .role(&#34;roles/cloudfunctions.invoker&#34;)
 *             .member(&#34;allUsers&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Single User
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
 *         var bucket = new Bucket(&#34;bucket&#34;, BucketArgs.builder()        
 *             .location(&#34;US&#34;)
 *             .build());
 * 
 *         var archive = new BucketObject(&#34;archive&#34;, BucketObjectArgs.builder()        
 *             .bucket(bucket.name())
 *             .source(new FileAsset(&#34;./path/to/zip/file/which/contains/code&#34;))
 *             .build());
 * 
 *         var function = new Function(&#34;function&#34;, FunctionArgs.builder()        
 *             .description(&#34;My function&#34;)
 *             .runtime(&#34;nodejs16&#34;)
 *             .availableMemoryMb(128)
 *             .sourceArchiveBucket(bucket.name())
 *             .sourceArchiveObject(archive.name())
 *             .triggerHttp(true)
 *             .httpsTriggerSecurityLevel(&#34;SECURE_ALWAYS&#34;)
 *             .timeout(60)
 *             .entryPoint(&#34;helloGET&#34;)
 *             .labels(Map.of(&#34;my-label&#34;, &#34;my-label-value&#34;))
 *             .environmentVariables(Map.of(&#34;MY_ENV_VAR&#34;, &#34;my-env-var-value&#34;))
 *             .build());
 * 
 *         var invoker = new FunctionIamMember(&#34;invoker&#34;, FunctionIamMemberArgs.builder()        
 *             .project(function.project())
 *             .region(function.region())
 *             .cloudFunction(function.name())
 *             .role(&#34;roles/cloudfunctions.invoker&#34;)
 *             .member(&#34;user:myFunctionInvoker@example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Functions can be imported using the `name` or `{{project}}/{{region}}/name`, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:cloudfunctions/function:Function default function-test
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:cloudfunctions/function:Function default {{project}}/{{region}}/function-test
 * ```
 * 
 */
@ResourceType(type="gcp:cloudfunctions/function:Function")
public class Function extends com.pulumi.resources.CustomResource {
    /**
     * Memory (in MB), available to the function. Default value is `256`. Possible values include `128`, `256`, `512`, `1024`, etc.
     * 
     */
    @Export(name="availableMemoryMb", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> availableMemoryMb;

    /**
     * @return Memory (in MB), available to the function. Default value is `256`. Possible values include `128`, `256`, `512`, `1024`, etc.
     * 
     */
    public Output<Optional<Integer>> availableMemoryMb() {
        return Codegen.optional(this.availableMemoryMb);
    }
    /**
     * A set of key/value environment variable pairs available during build time.
     * 
     */
    @Export(name="buildEnvironmentVariables", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> buildEnvironmentVariables;

    /**
     * @return A set of key/value environment variable pairs available during build time.
     * 
     */
    public Output<Optional<Map<String,Object>>> buildEnvironmentVariables() {
        return Codegen.optional(this.buildEnvironmentVariables);
    }
    /**
     * Description of the function.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the function.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Docker Registry to use for storing the function&#39;s Docker images. Allowed values are CONTAINER_REGISTRY (default) and ARTIFACT_REGISTRY.
     * 
     */
    @Export(name="dockerRegistry", type=String.class, parameters={})
    private Output<String> dockerRegistry;

    /**
     * @return Docker Registry to use for storing the function&#39;s Docker images. Allowed values are CONTAINER_REGISTRY (default) and ARTIFACT_REGISTRY.
     * 
     */
    public Output<String> dockerRegistry() {
        return this.dockerRegistry;
    }
    /**
     * User managed repository created in Artifact Registry optionally with a customer managed encryption key. If specified, deployments will use Artifact Registry. This is the repository to which the function docker image will be pushed after it is built by Cloud Build. If unspecified, Container Registry will be used by default, unless specified otherwise by other means.
     * 
     */
    @Export(name="dockerRepository", type=String.class, parameters={})
    private Output</* @Nullable */ String> dockerRepository;

    /**
     * @return User managed repository created in Artifact Registry optionally with a customer managed encryption key. If specified, deployments will use Artifact Registry. This is the repository to which the function docker image will be pushed after it is built by Cloud Build. If unspecified, Container Registry will be used by default, unless specified otherwise by other means.
     * 
     */
    public Output<Optional<String>> dockerRepository() {
        return Codegen.optional(this.dockerRepository);
    }
    /**
     * Name of the function that will be executed when the Google Cloud Function is triggered.
     * 
     */
    @Export(name="entryPoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> entryPoint;

    /**
     * @return Name of the function that will be executed when the Google Cloud Function is triggered.
     * 
     */
    public Output<Optional<String>> entryPoint() {
        return Codegen.optional(this.entryPoint);
    }
    /**
     * A set of key/value environment variable pairs to assign to the function.
     * 
     */
    @Export(name="environmentVariables", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> environmentVariables;

    /**
     * @return A set of key/value environment variable pairs to assign to the function.
     * 
     */
    public Output<Optional<Map<String,Object>>> environmentVariables() {
        return Codegen.optional(this.environmentVariables);
    }
    /**
     * A source that fires events in response to a condition in another service. Structure is documented below. Cannot be used with `trigger_http`.
     * 
     */
    @Export(name="eventTrigger", type=FunctionEventTrigger.class, parameters={})
    private Output<FunctionEventTrigger> eventTrigger;

    /**
     * @return A source that fires events in response to a condition in another service. Structure is documented below. Cannot be used with `trigger_http`.
     * 
     */
    public Output<FunctionEventTrigger> eventTrigger() {
        return this.eventTrigger;
    }
    /**
     * The security level for the function. The following options are available:
     * 
     */
    @Export(name="httpsTriggerSecurityLevel", type=String.class, parameters={})
    private Output<String> httpsTriggerSecurityLevel;

    /**
     * @return The security level for the function. The following options are available:
     * 
     */
    public Output<String> httpsTriggerSecurityLevel() {
        return this.httpsTriggerSecurityLevel;
    }
    /**
     * URL which triggers function execution. Returned only if `trigger_http` is used.
     * 
     */
    @Export(name="httpsTriggerUrl", type=String.class, parameters={})
    private Output<String> httpsTriggerUrl;

    /**
     * @return URL which triggers function execution. Returned only if `trigger_http` is used.
     * 
     */
    public Output<String> httpsTriggerUrl() {
        return this.httpsTriggerUrl;
    }
    /**
     * String value that controls what traffic can reach the function. Allowed values are `ALLOW_ALL`, `ALLOW_INTERNAL_AND_GCLB` and `ALLOW_INTERNAL_ONLY`. Check [ingress documentation](https://cloud.google.com/functions/docs/networking/network-settings#ingress_settings) to see the impact of each settings value. Changes to this field will recreate the cloud function.
     * 
     */
    @Export(name="ingressSettings", type=String.class, parameters={})
    private Output</* @Nullable */ String> ingressSettings;

    /**
     * @return String value that controls what traffic can reach the function. Allowed values are `ALLOW_ALL`, `ALLOW_INTERNAL_AND_GCLB` and `ALLOW_INTERNAL_ONLY`. Check [ingress documentation](https://cloud.google.com/functions/docs/networking/network-settings#ingress_settings) to see the impact of each settings value. Changes to this field will recreate the cloud function.
     * 
     */
    public Output<Optional<String>> ingressSettings() {
        return Codegen.optional(this.ingressSettings);
    }
    /**
     * Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt function resources. It must match the pattern `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
     * If specified, you must also provide an artifact registry repository using the `docker_repository` field that was created with the same KMS crypto key. Before deploying, please complete all pre-requisites described in https://cloud.google.com/functions/docs/securing/cmek#granting_service_accounts_access_to_the_key
     * 
     */
    @Export(name="kmsKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyName;

    /**
     * @return Resource name of a KMS crypto key (managed by the user) used to encrypt/decrypt function resources. It must match the pattern `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
     * If specified, you must also provide an artifact registry repository using the `docker_repository` field that was created with the same KMS crypto key. Before deploying, please complete all pre-requisites described in https://cloud.google.com/functions/docs/securing/cmek#granting_service_accounts_access_to_the_key
     * 
     */
    public Output<Optional<String>> kmsKeyName() {
        return Codegen.optional(this.kmsKeyName);
    }
    /**
     * A set of key/value label pairs to assign to the function. Label keys must follow the requirements at https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> labels;

    /**
     * @return A set of key/value label pairs to assign to the function. Label keys must follow the requirements at https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements.
     * 
     */
    public Output<Optional<Map<String,Object>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The limit on the maximum number of function instances that may coexist at a given time.
     * 
     */
    @Export(name="maxInstances", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxInstances;

    /**
     * @return The limit on the maximum number of function instances that may coexist at a given time.
     * 
     */
    public Output<Optional<Integer>> maxInstances() {
        return Codegen.optional(this.maxInstances);
    }
    /**
     * The limit on the minimum number of function instances that may coexist at a given time.
     * 
     */
    @Export(name="minInstances", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minInstances;

    /**
     * @return The limit on the minimum number of function instances that may coexist at a given time.
     * 
     */
    public Output<Optional<Integer>> minInstances() {
        return Codegen.optional(this.minInstances);
    }
    /**
     * A user-defined name of the function. Function names must be unique globally.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A user-defined name of the function. Function names must be unique globally.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Project of the function. If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return Project of the function. If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Region of function. If it is not provided, the provider region is used.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Region of function. If it is not provided, the provider region is used.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The runtime in which the function is going to run.
     * Eg. `&#34;nodejs16&#34;`, `&#34;python39&#34;`, `&#34;dotnet3&#34;`, `&#34;go116&#34;`, `&#34;java11&#34;`, `&#34;ruby30&#34;`, `&#34;php74&#34;`, etc. Check the [official doc](https://cloud.google.com/functions/docs/concepts/exec#runtimes) for the up-to-date list.
     * 
     */
    @Export(name="runtime", type=String.class, parameters={})
    private Output<String> runtime;

    /**
     * @return The runtime in which the function is going to run.
     * Eg. `&#34;nodejs16&#34;`, `&#34;python39&#34;`, `&#34;dotnet3&#34;`, `&#34;go116&#34;`, `&#34;java11&#34;`, `&#34;ruby30&#34;`, `&#34;php74&#34;`, etc. Check the [official doc](https://cloud.google.com/functions/docs/concepts/exec#runtimes) for the up-to-date list.
     * 
     */
    public Output<String> runtime() {
        return this.runtime;
    }
    /**
     * Secret environment variables configuration. Structure is documented below.
     * 
     */
    @Export(name="secretEnvironmentVariables", type=List.class, parameters={FunctionSecretEnvironmentVariable.class})
    private Output</* @Nullable */ List<FunctionSecretEnvironmentVariable>> secretEnvironmentVariables;

    /**
     * @return Secret environment variables configuration. Structure is documented below.
     * 
     */
    public Output<Optional<List<FunctionSecretEnvironmentVariable>>> secretEnvironmentVariables() {
        return Codegen.optional(this.secretEnvironmentVariables);
    }
    /**
     * Secret volumes configuration. Structure is documented below.
     * 
     */
    @Export(name="secretVolumes", type=List.class, parameters={FunctionSecretVolume.class})
    private Output</* @Nullable */ List<FunctionSecretVolume>> secretVolumes;

    /**
     * @return Secret volumes configuration. Structure is documented below.
     * 
     */
    public Output<Optional<List<FunctionSecretVolume>>> secretVolumes() {
        return Codegen.optional(this.secretVolumes);
    }
    /**
     * If provided, the self-provided service account to run the function with.
     * 
     */
    @Export(name="serviceAccountEmail", type=String.class, parameters={})
    private Output<String> serviceAccountEmail;

    /**
     * @return If provided, the self-provided service account to run the function with.
     * 
     */
    public Output<String> serviceAccountEmail() {
        return this.serviceAccountEmail;
    }
    /**
     * The GCS bucket containing the zip archive which contains the function.
     * 
     */
    @Export(name="sourceArchiveBucket", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceArchiveBucket;

    /**
     * @return The GCS bucket containing the zip archive which contains the function.
     * 
     */
    public Output<Optional<String>> sourceArchiveBucket() {
        return Codegen.optional(this.sourceArchiveBucket);
    }
    /**
     * The source archive object (file) in archive bucket.
     * 
     */
    @Export(name="sourceArchiveObject", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceArchiveObject;

    /**
     * @return The source archive object (file) in archive bucket.
     * 
     */
    public Output<Optional<String>> sourceArchiveObject() {
        return Codegen.optional(this.sourceArchiveObject);
    }
    /**
     * Represents parameters related to source repository where a function is hosted.
     * Cannot be set alongside `source_archive_bucket` or `source_archive_object`. Structure is documented below. It must match the pattern `projects/{project}/locations/{location}/repositories/{repository}`.*
     * 
     */
    @Export(name="sourceRepository", type=FunctionSourceRepository.class, parameters={})
    private Output</* @Nullable */ FunctionSourceRepository> sourceRepository;

    /**
     * @return Represents parameters related to source repository where a function is hosted.
     * Cannot be set alongside `source_archive_bucket` or `source_archive_object`. Structure is documented below. It must match the pattern `projects/{project}/locations/{location}/repositories/{repository}`.*
     * 
     */
    public Output<Optional<FunctionSourceRepository>> sourceRepository() {
        return Codegen.optional(this.sourceRepository);
    }
    /**
     * Timeout (in seconds) for the function. Default value is 60 seconds. Cannot be more than 540 seconds.
     * 
     */
    @Export(name="timeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeout;

    /**
     * @return Timeout (in seconds) for the function. Default value is 60 seconds. Cannot be more than 540 seconds.
     * 
     */
    public Output<Optional<Integer>> timeout() {
        return Codegen.optional(this.timeout);
    }
    /**
     * Boolean variable. Any HTTP request (of a supported type) to the endpoint will trigger function execution. Supported HTTP request types are: POST, PUT, GET, DELETE, and OPTIONS. Endpoint is returned as `https_trigger_url`. Cannot be used with `event_trigger`.
     * 
     */
    @Export(name="triggerHttp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> triggerHttp;

    /**
     * @return Boolean variable. Any HTTP request (of a supported type) to the endpoint will trigger function execution. Supported HTTP request types are: POST, PUT, GET, DELETE, and OPTIONS. Endpoint is returned as `https_trigger_url`. Cannot be used with `event_trigger`.
     * 
     */
    public Output<Optional<Boolean>> triggerHttp() {
        return Codegen.optional(this.triggerHttp);
    }
    /**
     * The VPC Network Connector that this cloud function can connect to. It should be set up as fully-qualified URI. The format of this field is `projects/*{@literal /}locations/*{@literal /}connectors/*`.
     * 
     */
    @Export(name="vpcConnector", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpcConnector;

    /**
     * @return The VPC Network Connector that this cloud function can connect to. It should be set up as fully-qualified URI. The format of this field is `projects/*{@literal /}locations/*{@literal /}connectors/*`.
     * 
     */
    public Output<Optional<String>> vpcConnector() {
        return Codegen.optional(this.vpcConnector);
    }
    /**
     * The egress settings for the connector, controlling what traffic is diverted through it. Allowed values are `ALL_TRAFFIC` and `PRIVATE_RANGES_ONLY`. Defaults to `PRIVATE_RANGES_ONLY`. If unset, this field preserves the previously set value.
     * 
     */
    @Export(name="vpcConnectorEgressSettings", type=String.class, parameters={})
    private Output<String> vpcConnectorEgressSettings;

    /**
     * @return The egress settings for the connector, controlling what traffic is diverted through it. Allowed values are `ALL_TRAFFIC` and `PRIVATE_RANGES_ONLY`. Defaults to `PRIVATE_RANGES_ONLY`. If unset, this field preserves the previously set value.
     * 
     */
    public Output<String> vpcConnectorEgressSettings() {
        return this.vpcConnectorEgressSettings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Function(String name) {
        this(name, FunctionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Function(String name, FunctionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Function(String name, FunctionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudfunctions/function:Function", name, args == null ? FunctionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Function(String name, Output<String> id, @Nullable FunctionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudfunctions/function:Function", name, state, makeResourceOptions(options, id));
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
    public static Function get(String name, Output<String> id, @Nullable FunctionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Function(name, id, state, options);
    }
}