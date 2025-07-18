// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.apigateway.ApiConfigArgs;
import com.pulumi.gcp.apigateway.inputs.ApiConfigState;
import com.pulumi.gcp.apigateway.outputs.ApiConfigGatewayConfig;
import com.pulumi.gcp.apigateway.outputs.ApiConfigGrpcService;
import com.pulumi.gcp.apigateway.outputs.ApiConfigManagedServiceConfig;
import com.pulumi.gcp.apigateway.outputs.ApiConfigOpenapiDocument;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An API Configuration is an association of an API Controller Config and a Gateway Config
 * 
 * To get more information about ApiConfig, see:
 * 
 * * [API documentation](https://cloud.google.com/api-gateway/docs/reference/rest/v1beta/projects.locations.apis.configs)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/api-gateway/docs/creating-api-config)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ApiConfig can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config_id}}`
 * 
 * * `{{project}}/{{api}}/{{api_config_id}}`
 * 
 * * `{{api}}/{{api_config_id}}`
 * 
 * When using the `pulumi import` command, ApiConfig can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:apigateway/apiConfig:ApiConfig default projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:apigateway/apiConfig:ApiConfig default {{project}}/{{api}}/{{api_config_id}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:apigateway/apiConfig:ApiConfig default {{api}}/{{api_config_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:apigateway/apiConfig:ApiConfig")
public class ApiConfig extends com.pulumi.resources.CustomResource {
    /**
     * The API to attach the config to.
     * 
     */
    @Export(name="api", refs={String.class}, tree="[0]")
    private Output<String> api;

    /**
     * @return The API to attach the config to.
     * 
     */
    public Output<String> api() {
        return this.api;
    }
    /**
     * Identifier to assign to the API Config. Must be unique within scope of the parent resource(api).
     * 
     */
    @Export(name="apiConfigId", refs={String.class}, tree="[0]")
    private Output<String> apiConfigId;

    /**
     * @return Identifier to assign to the API Config. Must be unique within scope of the parent resource(api).
     * 
     */
    public Output<String> apiConfigId() {
        return this.apiConfigId;
    }
    /**
     * Creates a unique name beginning with the
     * specified prefix. If this and api_config_id are unspecified, a random value is chosen for the name.
     * 
     */
    @Export(name="apiConfigIdPrefix", refs={String.class}, tree="[0]")
    private Output<String> apiConfigIdPrefix;

    /**
     * @return Creates a unique name beginning with the
     * specified prefix. If this and api_config_id are unspecified, a random value is chosen for the name.
     * 
     */
    public Output<String> apiConfigIdPrefix() {
        return this.apiConfigIdPrefix;
    }
    /**
     * A user-visible name for the API.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return A user-visible name for the API.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
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
     * Immutable. Gateway specific configuration.
     * If not specified, backend authentication will be set to use OIDC authentication using the default compute service account
     * Structure is documented below.
     * 
     */
    @Export(name="gatewayConfig", refs={ApiConfigGatewayConfig.class}, tree="[0]")
    private Output</* @Nullable */ ApiConfigGatewayConfig> gatewayConfig;

    /**
     * @return Immutable. Gateway specific configuration.
     * If not specified, backend authentication will be set to use OIDC authentication using the default compute service account
     * Structure is documented below.
     * 
     */
    public Output<Optional<ApiConfigGatewayConfig>> gatewayConfig() {
        return Codegen.optional(this.gatewayConfig);
    }
    /**
     * gRPC service definition files. If specified, openapiDocuments must not be included.
     * Structure is documented below.
     * 
     */
    @Export(name="grpcServices", refs={List.class,ApiConfigGrpcService.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ApiConfigGrpcService>> grpcServices;

    /**
     * @return gRPC service definition files. If specified, openapiDocuments must not be included.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<ApiConfigGrpcService>>> grpcServices() {
        return Codegen.optional(this.grpcServices);
    }
    /**
     * Resource labels to represent user-provided metadata.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview for the expected file contents.
     * If multiple files are specified, the files are merged with the following rules: * All singular scalar fields are merged using &#34;last one wins&#34; semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these rules for nested fields.
     * Structure is documented below.
     * 
     */
    @Export(name="managedServiceConfigs", refs={List.class,ApiConfigManagedServiceConfig.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ApiConfigManagedServiceConfig>> managedServiceConfigs;

    /**
     * @return Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview for the expected file contents.
     * If multiple files are specified, the files are merged with the following rules: * All singular scalar fields are merged using &#34;last one wins&#34; semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these rules for nested fields.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<ApiConfigManagedServiceConfig>>> managedServiceConfigs() {
        return Codegen.optional(this.managedServiceConfigs);
    }
    /**
     * The resource name of the API Config.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name of the API Config.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * OpenAPI specification documents. If specified, grpcServices and managedServiceConfigs must not be included.
     * Structure is documented below.
     * 
     */
    @Export(name="openapiDocuments", refs={List.class,ApiConfigOpenapiDocument.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ApiConfigOpenapiDocument>> openapiDocuments;

    /**
     * @return OpenAPI specification documents. If specified, grpcServices and managedServiceConfigs must not be included.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<ApiConfigOpenapiDocument>>> openapiDocuments() {
        return Codegen.optional(this.openapiDocuments);
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
     * The ID of the associated Service Config (https://cloud.google.com/service-infrastructure/docs/glossary#config).
     * 
     */
    @Export(name="serviceConfigId", refs={String.class}, tree="[0]")
    private Output<String> serviceConfigId;

    /**
     * @return The ID of the associated Service Config (https://cloud.google.com/service-infrastructure/docs/glossary#config).
     * 
     */
    public Output<String> serviceConfigId() {
        return this.serviceConfigId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiConfig(java.lang.String name) {
        this(name, ApiConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiConfig(java.lang.String name, ApiConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiConfig(java.lang.String name, ApiConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigateway/apiConfig:ApiConfig", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ApiConfig(java.lang.String name, Output<java.lang.String> id, @Nullable ApiConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigateway/apiConfig:ApiConfig", name, state, makeResourceOptions(options, id), false);
    }

    private static ApiConfigArgs makeArgs(ApiConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ApiConfigArgs.Empty : args;
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
    public static ApiConfig get(java.lang.String name, Output<java.lang.String> id, @Nullable ApiConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiConfig(name, id, state, options);
    }
}
