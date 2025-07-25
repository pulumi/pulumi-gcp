// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.vertex.inputs.AiEndpointEncryptionSpecArgs;
import com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigArgs;
import com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AiEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final AiEndpointArgs Empty = new AiEndpointArgs();

    /**
     * If true, the endpoint will be exposed through a dedicated DNS [Endpoint.dedicated_endpoint_dns]. Your request to the dedicated DNS will be isolated from other users&#39; traffic and will have better performance and reliability. Note: Once you enabled dedicated endpoint, you won&#39;t be able to send request to the shared DNS {region}-aiplatform.googleapis.com. The limitation will be removed soon.
     * 
     */
    @Import(name="dedicatedEndpointEnabled")
    private @Nullable Output<Boolean> dedicatedEndpointEnabled;

    /**
     * @return If true, the endpoint will be exposed through a dedicated DNS [Endpoint.dedicated_endpoint_dns]. Your request to the dedicated DNS will be isolated from other users&#39; traffic and will have better performance and reliability. Note: Once you enabled dedicated endpoint, you won&#39;t be able to send request to the shared DNS {region}-aiplatform.googleapis.com. The limitation will be removed soon.
     * 
     */
    public Optional<Output<Boolean>> dedicatedEndpointEnabled() {
        return Optional.ofNullable(this.dedicatedEndpointEnabled);
    }

    /**
     * The description of the Endpoint.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Endpoint.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Required. The display name of the Endpoint. The name can be up to 128 characters long and can consist of any UTF-8 characters.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return Required. The display name of the Endpoint. The name can be up to 128 characters long and can consist of any UTF-8 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Customer-managed encryption key spec for an Endpoint. If set, this Endpoint and all sub-resources of this Endpoint will be secured by this key.
     * Structure is documented below.
     * 
     */
    @Import(name="encryptionSpec")
    private @Nullable Output<AiEndpointEncryptionSpecArgs> encryptionSpec;

    /**
     * @return Customer-managed encryption key spec for an Endpoint. If set, this Endpoint and all sub-resources of this Endpoint will be secured by this key.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AiEndpointEncryptionSpecArgs>> encryptionSpec() {
        return Optional.ofNullable(this.encryptionSpec);
    }

    /**
     * The labels with user-defined metadata to organize your Endpoints. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The labels with user-defined metadata to organize your Endpoints. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The resource name of the Endpoint. The name must be numeric with no leading zeros and can be at most 10 digits.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the Endpoint. The name must be numeric with no leading zeros and can be at most 10 digits.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The full name of the Google Compute Engine [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks) to which the Endpoint should be peered. Private services access must already be configured for the network. If left unspecified, the Endpoint is not peered with any network. Only one of the fields, network or enable_private_service_connect, can be set. [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/insert): `projects/{project}/global/networks/{network}`. Where `{project}` is a project number, as in `12345`, and `{network}` is network name. Only one of the fields, `network` or `privateServiceConnectConfig`, can be set.
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return The full name of the Google Compute Engine [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks) to which the Endpoint should be peered. Private services access must already be configured for the network. If left unspecified, the Endpoint is not peered with any network. Only one of the fields, network or enable_private_service_connect, can be set. [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/insert): `projects/{project}/global/networks/{network}`. Where `{project}` is a project number, as in `12345`, and `{network}` is network name. Only one of the fields, `network` or `privateServiceConnectConfig`, can be set.
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * Configures the request-response logging for online prediction.
     * Structure is documented below.
     * 
     */
    @Import(name="predictRequestResponseLoggingConfig")
    private @Nullable Output<AiEndpointPredictRequestResponseLoggingConfigArgs> predictRequestResponseLoggingConfig;

    /**
     * @return Configures the request-response logging for online prediction.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AiEndpointPredictRequestResponseLoggingConfigArgs>> predictRequestResponseLoggingConfig() {
        return Optional.ofNullable(this.predictRequestResponseLoggingConfig);
    }

    /**
     * Configuration for private service connect. `network` and `privateServiceConnectConfig` are mutually exclusive.
     * Structure is documented below.
     * 
     */
    @Import(name="privateServiceConnectConfig")
    private @Nullable Output<AiEndpointPrivateServiceConnectConfigArgs> privateServiceConnectConfig;

    /**
     * @return Configuration for private service connect. `network` and `privateServiceConnectConfig` are mutually exclusive.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AiEndpointPrivateServiceConnectConfigArgs>> privateServiceConnectConfig() {
        return Optional.ofNullable(this.privateServiceConnectConfig);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region for the resource
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region for the resource
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
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
    @Import(name="trafficSplit")
    private @Nullable Output<String> trafficSplit;

    /**
     * @return A map from a DeployedModel&#39;s id to the percentage of this Endpoint&#39;s traffic that should be forwarded to that DeployedModel.
     * If a DeployedModel&#39;s id is not listed in this map, then it receives no traffic.
     * The traffic percentage values must add up to 100, or map must be empty if the Endpoint is to not accept any traffic at a moment. See
     * the `deployModel` [example](https://cloud.google.com/vertex-ai/docs/general/deployment#deploy_a_model_to_an_endpoint) and
     * [documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1beta1/projects.locations.endpoints/deployModel) for more information.
     * &gt; **Note:** To set the map to empty, set `&#34;{}&#34;`, apply, and then remove the field from your config.
     * 
     */
    public Optional<Output<String>> trafficSplit() {
        return Optional.ofNullable(this.trafficSplit);
    }

    private AiEndpointArgs() {}

    private AiEndpointArgs(AiEndpointArgs $) {
        this.dedicatedEndpointEnabled = $.dedicatedEndpointEnabled;
        this.description = $.description;
        this.displayName = $.displayName;
        this.encryptionSpec = $.encryptionSpec;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.network = $.network;
        this.predictRequestResponseLoggingConfig = $.predictRequestResponseLoggingConfig;
        this.privateServiceConnectConfig = $.privateServiceConnectConfig;
        this.project = $.project;
        this.region = $.region;
        this.trafficSplit = $.trafficSplit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AiEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AiEndpointArgs $;

        public Builder() {
            $ = new AiEndpointArgs();
        }

        public Builder(AiEndpointArgs defaults) {
            $ = new AiEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dedicatedEndpointEnabled If true, the endpoint will be exposed through a dedicated DNS [Endpoint.dedicated_endpoint_dns]. Your request to the dedicated DNS will be isolated from other users&#39; traffic and will have better performance and reliability. Note: Once you enabled dedicated endpoint, you won&#39;t be able to send request to the shared DNS {region}-aiplatform.googleapis.com. The limitation will be removed soon.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedEndpointEnabled(@Nullable Output<Boolean> dedicatedEndpointEnabled) {
            $.dedicatedEndpointEnabled = dedicatedEndpointEnabled;
            return this;
        }

        /**
         * @param dedicatedEndpointEnabled If true, the endpoint will be exposed through a dedicated DNS [Endpoint.dedicated_endpoint_dns]. Your request to the dedicated DNS will be isolated from other users&#39; traffic and will have better performance and reliability. Note: Once you enabled dedicated endpoint, you won&#39;t be able to send request to the shared DNS {region}-aiplatform.googleapis.com. The limitation will be removed soon.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedEndpointEnabled(Boolean dedicatedEndpointEnabled) {
            return dedicatedEndpointEnabled(Output.of(dedicatedEndpointEnabled));
        }

        /**
         * @param description The description of the Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Required. The display name of the Endpoint. The name can be up to 128 characters long and can consist of any UTF-8 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Required. The display name of the Endpoint. The name can be up to 128 characters long and can consist of any UTF-8 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param encryptionSpec Customer-managed encryption key spec for an Endpoint. If set, this Endpoint and all sub-resources of this Endpoint will be secured by this key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionSpec(@Nullable Output<AiEndpointEncryptionSpecArgs> encryptionSpec) {
            $.encryptionSpec = encryptionSpec;
            return this;
        }

        /**
         * @param encryptionSpec Customer-managed encryption key spec for an Endpoint. If set, this Endpoint and all sub-resources of this Endpoint will be secured by this key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionSpec(AiEndpointEncryptionSpecArgs encryptionSpec) {
            return encryptionSpec(Output.of(encryptionSpec));
        }

        /**
         * @param labels The labels with user-defined metadata to organize your Endpoints. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels.
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The labels with user-defined metadata to organize your Endpoints. Label keys and values can be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. See https://goo.gl/xmQnxf for more information and examples of labels.
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource name of the Endpoint. The name must be numeric with no leading zeros and can be at most 10 digits.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the Endpoint. The name must be numeric with no leading zeros and can be at most 10 digits.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network The full name of the Google Compute Engine [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks) to which the Endpoint should be peered. Private services access must already be configured for the network. If left unspecified, the Endpoint is not peered with any network. Only one of the fields, network or enable_private_service_connect, can be set. [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/insert): `projects/{project}/global/networks/{network}`. Where `{project}` is a project number, as in `12345`, and `{network}` is network name. Only one of the fields, `network` or `privateServiceConnectConfig`, can be set.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The full name of the Google Compute Engine [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks) to which the Endpoint should be peered. Private services access must already be configured for the network. If left unspecified, the Endpoint is not peered with any network. Only one of the fields, network or enable_private_service_connect, can be set. [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/insert): `projects/{project}/global/networks/{network}`. Where `{project}` is a project number, as in `12345`, and `{network}` is network name. Only one of the fields, `network` or `privateServiceConnectConfig`, can be set.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param predictRequestResponseLoggingConfig Configures the request-response logging for online prediction.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder predictRequestResponseLoggingConfig(@Nullable Output<AiEndpointPredictRequestResponseLoggingConfigArgs> predictRequestResponseLoggingConfig) {
            $.predictRequestResponseLoggingConfig = predictRequestResponseLoggingConfig;
            return this;
        }

        /**
         * @param predictRequestResponseLoggingConfig Configures the request-response logging for online prediction.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder predictRequestResponseLoggingConfig(AiEndpointPredictRequestResponseLoggingConfigArgs predictRequestResponseLoggingConfig) {
            return predictRequestResponseLoggingConfig(Output.of(predictRequestResponseLoggingConfig));
        }

        /**
         * @param privateServiceConnectConfig Configuration for private service connect. `network` and `privateServiceConnectConfig` are mutually exclusive.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder privateServiceConnectConfig(@Nullable Output<AiEndpointPrivateServiceConnectConfigArgs> privateServiceConnectConfig) {
            $.privateServiceConnectConfig = privateServiceConnectConfig;
            return this;
        }

        /**
         * @param privateServiceConnectConfig Configuration for private service connect. `network` and `privateServiceConnectConfig` are mutually exclusive.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder privateServiceConnectConfig(AiEndpointPrivateServiceConnectConfigArgs privateServiceConnectConfig) {
            return privateServiceConnectConfig(Output.of(privateServiceConnectConfig));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region The region for the resource
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region for the resource
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param trafficSplit A map from a DeployedModel&#39;s id to the percentage of this Endpoint&#39;s traffic that should be forwarded to that DeployedModel.
         * If a DeployedModel&#39;s id is not listed in this map, then it receives no traffic.
         * The traffic percentage values must add up to 100, or map must be empty if the Endpoint is to not accept any traffic at a moment. See
         * the `deployModel` [example](https://cloud.google.com/vertex-ai/docs/general/deployment#deploy_a_model_to_an_endpoint) and
         * [documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1beta1/projects.locations.endpoints/deployModel) for more information.
         * &gt; **Note:** To set the map to empty, set `&#34;{}&#34;`, apply, and then remove the field from your config.
         * 
         * @return builder
         * 
         */
        public Builder trafficSplit(@Nullable Output<String> trafficSplit) {
            $.trafficSplit = trafficSplit;
            return this;
        }

        /**
         * @param trafficSplit A map from a DeployedModel&#39;s id to the percentage of this Endpoint&#39;s traffic that should be forwarded to that DeployedModel.
         * If a DeployedModel&#39;s id is not listed in this map, then it receives no traffic.
         * The traffic percentage values must add up to 100, or map must be empty if the Endpoint is to not accept any traffic at a moment. See
         * the `deployModel` [example](https://cloud.google.com/vertex-ai/docs/general/deployment#deploy_a_model_to_an_endpoint) and
         * [documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1beta1/projects.locations.endpoints/deployModel) for more information.
         * &gt; **Note:** To set the map to empty, set `&#34;{}&#34;`, apply, and then remove the field from your config.
         * 
         * @return builder
         * 
         */
        public Builder trafficSplit(String trafficSplit) {
            return trafficSplit(Output.of(trafficSplit));
        }

        public AiEndpointArgs build() {
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("AiEndpointArgs", "displayName");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("AiEndpointArgs", "location");
            }
            return $;
        }
    }

}
