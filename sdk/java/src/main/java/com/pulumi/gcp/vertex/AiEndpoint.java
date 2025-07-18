// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.vertex.AiEndpointArgs;
import com.pulumi.gcp.vertex.inputs.AiEndpointState;
import com.pulumi.gcp.vertex.outputs.AiEndpointDeployedModel;
import com.pulumi.gcp.vertex.outputs.AiEndpointEncryptionSpec;
import com.pulumi.gcp.vertex.outputs.AiEndpointPredictRequestResponseLoggingConfig;
import com.pulumi.gcp.vertex.outputs.AiEndpointPrivateServiceConnectConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Models are deployed into it, and afterwards Endpoint is called to obtain predictions and explanations.
 * 
 * To get more information about Endpoint, see:
 * 
 * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1beta1/projects.locations.endpoints)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
 * 
 * ## Example Usage
 * 
 * ### Vertex Ai Endpoint Network
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.Network;
 * import com.pulumi.gcp.compute.NetworkArgs;
 * import com.pulumi.gcp.compute.GlobalAddress;
 * import com.pulumi.gcp.compute.GlobalAddressArgs;
 * import com.pulumi.gcp.servicenetworking.Connection;
 * import com.pulumi.gcp.servicenetworking.ConnectionArgs;
 * import com.pulumi.gcp.bigquery.Dataset;
 * import com.pulumi.gcp.bigquery.DatasetArgs;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
 * import com.pulumi.gcp.vertex.AiEndpoint;
 * import com.pulumi.gcp.vertex.AiEndpointArgs;
 * import com.pulumi.gcp.vertex.inputs.AiEndpointEncryptionSpecArgs;
 * import com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigArgs;
 * import com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigBigqueryDestinationArgs;
 * import com.pulumi.gcp.kms.CryptoKeyIAMMember;
 * import com.pulumi.gcp.kms.CryptoKeyIAMMemberArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var vertexNetwork = new Network("vertexNetwork", NetworkArgs.builder()
 *             .name("network-name")
 *             .build());
 * 
 *         var vertexRange = new GlobalAddress("vertexRange", GlobalAddressArgs.builder()
 *             .name("address-name")
 *             .purpose("VPC_PEERING")
 *             .addressType("INTERNAL")
 *             .prefixLength(24)
 *             .network(vertexNetwork.id())
 *             .build());
 * 
 *         var vertexVpcConnection = new Connection("vertexVpcConnection", ConnectionArgs.builder()
 *             .network(vertexNetwork.id())
 *             .service("servicenetworking.googleapis.com")
 *             .reservedPeeringRanges(vertexRange.name())
 *             .build());
 * 
 *         var bqDataset = new Dataset("bqDataset", DatasetArgs.builder()
 *             .datasetId("some_dataset")
 *             .friendlyName("logging dataset")
 *             .description("This is a dataset that requests are logged to")
 *             .location("US")
 *             .deleteContentsOnDestroy(true)
 *             .build());
 * 
 *         final var project = OrganizationsFunctions.getProject(GetProjectArgs.builder()
 *             .build());
 * 
 *         var endpoint = new AiEndpoint("endpoint", AiEndpointArgs.builder()
 *             .name("endpoint-name")
 *             .displayName("sample-endpoint")
 *             .description("A sample vertex endpoint")
 *             .location("us-central1")
 *             .region("us-central1")
 *             .labels(Map.of("label-one", "value-one"))
 *             .network(vertexNetwork.name().applyValue(_name -> String.format("projects/%s/global/networks/%s", project.number(),_name)))
 *             .encryptionSpec(AiEndpointEncryptionSpecArgs.builder()
 *                 .kmsKeyName("kms-name")
 *                 .build())
 *             .predictRequestResponseLoggingConfig(AiEndpointPredictRequestResponseLoggingConfigArgs.builder()
 *                 .bigqueryDestination(AiEndpointPredictRequestResponseLoggingConfigBigqueryDestinationArgs.builder()
 *                     .outputUri(bqDataset.datasetId().applyValue(_datasetId -> String.format("bq://%s.%s.request_response_logging", project.projectId(),_datasetId)))
 *                     .build())
 *                 .enabled(true)
 *                 .samplingRate(0.1)
 *                 .build())
 *             .trafficSplit(serializeJson(
 *                 jsonObject(
 *                     jsonProperty("12345", 100)
 *                 )))
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(vertexVpcConnection)
 *                 .build());
 * 
 *         var cryptoKey = new CryptoKeyIAMMember("cryptoKey", CryptoKeyIAMMemberArgs.builder()
 *             .cryptoKeyId("kms-name")
 *             .role("roles/cloudkms.cryptoKeyEncrypterDecrypter")
 *             .member(String.format("serviceAccount:service-%s}{@literal @}{@code gcp-sa-aiplatform.iam.gserviceaccount.com", project.number()))
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Vertex Ai Endpoint Private Service Connect
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
 * import com.pulumi.gcp.vertex.AiEndpoint;
 * import com.pulumi.gcp.vertex.AiEndpointArgs;
 * import com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigArgs;
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
 *         final var project = OrganizationsFunctions.getProject(GetProjectArgs.builder()
 *             .build());
 * 
 *         var endpoint = new AiEndpoint("endpoint", AiEndpointArgs.builder()
 *             .name("endpoint-name_77124")
 *             .displayName("sample-endpoint")
 *             .description("A sample vertex endpoint")
 *             .location("us-central1")
 *             .region("us-central1")
 *             .labels(Map.of("label-one", "value-one"))
 *             .privateServiceConnectConfig(AiEndpointPrivateServiceConnectConfigArgs.builder()
 *                 .enablePrivateServiceConnect(true)
 *                 .projectAllowlists(project.projectId())
 *                 .enableSecurePrivateServiceConnect(false)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * ### Vertex Ai Endpoint Dedicated Endpoint
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.vertex.AiEndpoint;
 * import com.pulumi.gcp.vertex.AiEndpointArgs;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
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
 *         var endpoint = new AiEndpoint("endpoint", AiEndpointArgs.builder()
 *             .name("endpoint-name_15335")
 *             .displayName("sample-endpoint")
 *             .description("A sample vertex endpoint")
 *             .location("us-central1")
 *             .region("us-central1")
 *             .labels(Map.of("label-one", "value-one"))
 *             .dedicatedEndpointEnabled(true)
 *             .build());
 * 
 *         final var project = OrganizationsFunctions.getProject(GetProjectArgs.builder()
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
 * Endpoint can be imported using any of these accepted formats:
 * 
 * * `projects/{{project}}/locations/{{location}}/endpoints/{{name}}`
 * 
 * * `{{project}}/{{location}}/{{name}}`
 * 
 * * `{{location}}/{{name}}`
 * 
 * When using the `pulumi import` command, Endpoint can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:vertex/aiEndpoint:AiEndpoint default projects/{{project}}/locations/{{location}}/endpoints/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:vertex/aiEndpoint:AiEndpoint default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:vertex/aiEndpoint:AiEndpoint default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:vertex/aiEndpoint:AiEndpoint")
public class AiEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * (Output)
     * Output only. Timestamp when the DeployedModel was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return (Output)
     * Output only. Timestamp when the DeployedModel was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Output only. DNS of the dedicated endpoint. Will only be populated if dedicatedEndpointEnabled is true. Format: `https://{endpointId}.{region}-{projectNumber}.prediction.vertexai.goog`.
     * 
     */
    @Export(name="dedicatedEndpointDns", refs={String.class}, tree="[0]")
    private Output<String> dedicatedEndpointDns;

    /**
     * @return Output only. DNS of the dedicated endpoint. Will only be populated if dedicatedEndpointEnabled is true. Format: `https://{endpointId}.{region}-{projectNumber}.prediction.vertexai.goog`.
     * 
     */
    public Output<String> dedicatedEndpointDns() {
        return this.dedicatedEndpointDns;
    }
    /**
     * If true, the endpoint will be exposed through a dedicated DNS [Endpoint.dedicated_endpoint_dns]. Your request to the dedicated DNS will be isolated from other users&#39; traffic and will have better performance and reliability. Note: Once you enabled dedicated endpoint, you won&#39;t be able to send request to the shared DNS {region}-aiplatform.googleapis.com. The limitation will be removed soon.
     * 
     */
    @Export(name="dedicatedEndpointEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dedicatedEndpointEnabled;

    /**
     * @return If true, the endpoint will be exposed through a dedicated DNS [Endpoint.dedicated_endpoint_dns]. Your request to the dedicated DNS will be isolated from other users&#39; traffic and will have better performance and reliability. Note: Once you enabled dedicated endpoint, you won&#39;t be able to send request to the shared DNS {region}-aiplatform.googleapis.com. The limitation will be removed soon.
     * 
     */
    public Output<Optional<Boolean>> dedicatedEndpointEnabled() {
        return Codegen.optional(this.dedicatedEndpointEnabled);
    }
    /**
     * Output only. The models deployed in this Endpoint. To add or remove DeployedModels use EndpointService.DeployModel and EndpointService.UndeployModel respectively. Models can also be deployed and undeployed using the [Cloud Console](https://console.cloud.google.com/vertex-ai/).
     * Structure is documented below.
     * 
     */
    @Export(name="deployedModels", refs={List.class,AiEndpointDeployedModel.class}, tree="[0,1]")
    private Output<List<AiEndpointDeployedModel>> deployedModels;

    /**
     * @return Output only. The models deployed in this Endpoint. To add or remove DeployedModels use EndpointService.DeployModel and EndpointService.UndeployModel respectively. Models can also be deployed and undeployed using the [Cloud Console](https://console.cloud.google.com/vertex-ai/).
     * Structure is documented below.
     * 
     */
    public Output<List<AiEndpointDeployedModel>> deployedModels() {
        return this.deployedModels;
    }
    /**
     * The description of the Endpoint.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Endpoint.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Required. The display name of the Endpoint. The name can be up to 128 characters long and can consist of any UTF-8 characters.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return Required. The display name of the Endpoint. The name can be up to 128 characters long and can consist of any UTF-8 characters.
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
     * Customer-managed encryption key spec for an Endpoint. If set, this Endpoint and all sub-resources of this Endpoint will be secured by this key.
     * Structure is documented below.
     * 
     */
    @Export(name="encryptionSpec", refs={AiEndpointEncryptionSpec.class}, tree="[0]")
    private Output</* @Nullable */ AiEndpointEncryptionSpec> encryptionSpec;

    /**
     * @return Customer-managed encryption key spec for an Endpoint. If set, this Endpoint and all sub-resources of this Endpoint will be secured by this key.
     * Structure is documented below.
     * 
     */
    public Output<Optional<AiEndpointEncryptionSpec>> encryptionSpec() {
        return Codegen.optional(this.encryptionSpec);
    }
    /**
     * Used to perform consistent read-modify-write updates. If not set, a blind &#34;overwrite&#34; update happens.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return Used to perform consistent read-modify-write updates. If not set, a blind &#34;overwrite&#34; update happens.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The labels with user-defined metadata to organize your Endpoints. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return The labels with user-defined metadata to organize your Endpoints. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The location for the resource
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Output only. Resource name of the Model Monitoring job associated with this Endpoint if monitoring is enabled by CreateModelDeploymentMonitoringJob. Format: `projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}`
     * 
     */
    @Export(name="modelDeploymentMonitoringJob", refs={String.class}, tree="[0]")
    private Output<String> modelDeploymentMonitoringJob;

    /**
     * @return Output only. Resource name of the Model Monitoring job associated with this Endpoint if monitoring is enabled by CreateModelDeploymentMonitoringJob. Format: `projects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}`
     * 
     */
    public Output<String> modelDeploymentMonitoringJob() {
        return this.modelDeploymentMonitoringJob;
    }
    /**
     * The resource name of the Endpoint. The name must be numeric with no leading zeros and can be at most 10 digits.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name of the Endpoint. The name must be numeric with no leading zeros and can be at most 10 digits.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The full name of the Google Compute Engine [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks) to which the Endpoint should be peered. Private services access must already be configured for the network. If left unspecified, the Endpoint is not peered with any network. Only one of the fields, network or enable_private_service_connect, can be set. [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/insert): `projects/{project}/global/networks/{network}`. Where `{project}` is a project number, as in `12345`, and `{network}` is network name. Only one of the fields, `network` or `privateServiceConnectConfig`, can be set.
     * 
     */
    @Export(name="network", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> network;

    /**
     * @return The full name of the Google Compute Engine [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks) to which the Endpoint should be peered. Private services access must already be configured for the network. If left unspecified, the Endpoint is not peered with any network. Only one of the fields, network or enable_private_service_connect, can be set. [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/insert): `projects/{project}/global/networks/{network}`. Where `{project}` is a project number, as in `12345`, and `{network}` is network name. Only one of the fields, `network` or `privateServiceConnectConfig`, can be set.
     * 
     */
    public Output<Optional<String>> network() {
        return Codegen.optional(this.network);
    }
    /**
     * Configures the request-response logging for online prediction.
     * Structure is documented below.
     * 
     */
    @Export(name="predictRequestResponseLoggingConfig", refs={AiEndpointPredictRequestResponseLoggingConfig.class}, tree="[0]")
    private Output</* @Nullable */ AiEndpointPredictRequestResponseLoggingConfig> predictRequestResponseLoggingConfig;

    /**
     * @return Configures the request-response logging for online prediction.
     * Structure is documented below.
     * 
     */
    public Output<Optional<AiEndpointPredictRequestResponseLoggingConfig>> predictRequestResponseLoggingConfig() {
        return Codegen.optional(this.predictRequestResponseLoggingConfig);
    }
    /**
     * Configuration for private service connect. `network` and `privateServiceConnectConfig` are mutually exclusive.
     * Structure is documented below.
     * 
     */
    @Export(name="privateServiceConnectConfig", refs={AiEndpointPrivateServiceConnectConfig.class}, tree="[0]")
    private Output</* @Nullable */ AiEndpointPrivateServiceConnectConfig> privateServiceConnectConfig;

    /**
     * @return Configuration for private service connect. `network` and `privateServiceConnectConfig` are mutually exclusive.
     * Structure is documented below.
     * 
     */
    public Output<Optional<AiEndpointPrivateServiceConnectConfig>> privateServiceConnectConfig() {
        return Codegen.optional(this.privateServiceConnectConfig);
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
     * The region for the resource
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> region;

    /**
     * @return The region for the resource
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    /**
     * A map from a DeployedModel&#39;s id to the percentage of this Endpoint&#39;s traffic that should be forwarded to that DeployedModel.
     * If a DeployedModel&#39;s id is not listed in this map, then it receives no traffic.
     * The traffic percentage values must add up to 100, or map must be empty if the Endpoint is to not accept any traffic at a moment. See
     * the `deployModel` [example](https://cloud.google.com/vertex-ai/docs/general/deployment#deploy_a_model_to_an_endpoint) and
     * [documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1beta1/projects.locations.endpoints/deployModel) for more information.
     * &gt; **Note:** To set the map to empty, set `&#34;{}&#34;`, apply, and then remove the field from your config.
     * 
     */
    @Export(name="trafficSplit", refs={String.class}, tree="[0]")
    private Output<String> trafficSplit;

    /**
     * @return A map from a DeployedModel&#39;s id to the percentage of this Endpoint&#39;s traffic that should be forwarded to that DeployedModel.
     * If a DeployedModel&#39;s id is not listed in this map, then it receives no traffic.
     * The traffic percentage values must add up to 100, or map must be empty if the Endpoint is to not accept any traffic at a moment. See
     * the `deployModel` [example](https://cloud.google.com/vertex-ai/docs/general/deployment#deploy_a_model_to_an_endpoint) and
     * [documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1beta1/projects.locations.endpoints/deployModel) for more information.
     * &gt; **Note:** To set the map to empty, set `&#34;{}&#34;`, apply, and then remove the field from your config.
     * 
     */
    public Output<String> trafficSplit() {
        return this.trafficSplit;
    }
    /**
     * Output only. Timestamp when this Endpoint was last updated.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return Output only. Timestamp when this Endpoint was last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AiEndpoint(java.lang.String name) {
        this(name, AiEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AiEndpoint(java.lang.String name, AiEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AiEndpoint(java.lang.String name, AiEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiEndpoint:AiEndpoint", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AiEndpoint(java.lang.String name, Output<java.lang.String> id, @Nullable AiEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vertex/aiEndpoint:AiEndpoint", name, state, makeResourceOptions(options, id), false);
    }

    private static AiEndpointArgs makeArgs(AiEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AiEndpointArgs.Empty : args;
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
    public static AiEndpoint get(java.lang.String name, Output<java.lang.String> id, @Nullable AiEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AiEndpoint(name, id, state, options);
    }
}
