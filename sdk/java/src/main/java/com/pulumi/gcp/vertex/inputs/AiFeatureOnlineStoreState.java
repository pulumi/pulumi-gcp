// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableArgs;
import com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreDedicatedServingEndpointArgs;
import com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreEmbeddingManagementArgs;
import com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreOptimizedArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AiFeatureOnlineStoreState extends com.pulumi.resources.ResourceArgs {

    public static final AiFeatureOnlineStoreState Empty = new AiFeatureOnlineStoreState();

    /**
     * Settings for Cloud Bigtable instance that will be created to serve featureValues for all FeatureViews under this FeatureOnlineStore.
     * Structure is documented below.
     * 
     */
    @Import(name="bigtable")
    private @Nullable Output<AiFeatureOnlineStoreBigtableArgs> bigtable;

    /**
     * @return Settings for Cloud Bigtable instance that will be created to serve featureValues for all FeatureViews under this FeatureOnlineStore.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AiFeatureOnlineStoreBigtableArgs>> bigtable() {
        return Optional.ofNullable(this.bigtable);
    }

    /**
     * The timestamp of when the feature online store was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The timestamp of when the feature online store was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The dedicated serving endpoint for this FeatureOnlineStore, which is different from common vertex service endpoint. Only
     * need to set when you choose Optimized storage type or enable EmbeddingManagement. Will use public endpoint by default.
     * 
     */
    @Import(name="dedicatedServingEndpoint")
    private @Nullable Output<AiFeatureOnlineStoreDedicatedServingEndpointArgs> dedicatedServingEndpoint;

    /**
     * @return The dedicated serving endpoint for this FeatureOnlineStore, which is different from common vertex service endpoint. Only
     * need to set when you choose Optimized storage type or enable EmbeddingManagement. Will use public endpoint by default.
     * 
     */
    public Optional<Output<AiFeatureOnlineStoreDedicatedServingEndpointArgs>> dedicatedServingEndpoint() {
        return Optional.ofNullable(this.dedicatedServingEndpoint);
    }

    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Import(name="effectiveLabels")
    private @Nullable Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Optional<Output<Map<String,String>>> effectiveLabels() {
        return Optional.ofNullable(this.effectiveLabels);
    }

    /**
     * The settings for embedding management in FeatureOnlineStore. Embedding management can only be used with BigTable.
     * 
     */
    @Import(name="embeddingManagement")
    private @Nullable Output<AiFeatureOnlineStoreEmbeddingManagementArgs> embeddingManagement;

    /**
     * @return The settings for embedding management in FeatureOnlineStore. Embedding management can only be used with BigTable.
     * 
     */
    public Optional<Output<AiFeatureOnlineStoreEmbeddingManagementArgs>> embeddingManagement() {
        return Optional.ofNullable(this.embeddingManagement);
    }

    /**
     * Used to perform consistent read-modify-write updates.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return Used to perform consistent read-modify-write updates.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * If set to true, any FeatureViews and Features for this FeatureOnlineStore will also be deleted.
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    /**
     * @return If set to true, any FeatureViews and Features for this FeatureOnlineStore will also be deleted.
     * 
     */
    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    /**
     * The labels with user-defined metadata to organize your feature online stores.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The labels with user-defined metadata to organize your feature online stores.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The resource name of the Feature Online Store. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
     * 
     * ***
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the Feature Online Store. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
     * 
     * ***
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Settings for the Optimized store that will be created to serve featureValues for all FeatureViews under this
     * FeatureOnlineStore
     * 
     */
    @Import(name="optimized")
    private @Nullable Output<AiFeatureOnlineStoreOptimizedArgs> optimized;

    /**
     * @return Settings for the Optimized store that will be created to serve featureValues for all FeatureViews under this
     * FeatureOnlineStore
     * 
     */
    public Optional<Output<AiFeatureOnlineStoreOptimizedArgs>> optimized() {
        return Optional.ofNullable(this.optimized);
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
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Import(name="pulumiLabels")
    private @Nullable Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Optional<Output<Map<String,String>>> pulumiLabels() {
        return Optional.ofNullable(this.pulumiLabels);
    }

    /**
     * The region of feature online store. eg us-central1
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region of feature online store. eg us-central1
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The state of the Feature Online Store. See the possible states in [this link](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featureOnlineStores#state).
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the Feature Online Store. See the possible states in [this link](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featureOnlineStores#state).
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The timestamp of when the feature online store was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The timestamp of when the feature online store was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private AiFeatureOnlineStoreState() {}

    private AiFeatureOnlineStoreState(AiFeatureOnlineStoreState $) {
        this.bigtable = $.bigtable;
        this.createTime = $.createTime;
        this.dedicatedServingEndpoint = $.dedicatedServingEndpoint;
        this.effectiveLabels = $.effectiveLabels;
        this.embeddingManagement = $.embeddingManagement;
        this.etag = $.etag;
        this.forceDestroy = $.forceDestroy;
        this.labels = $.labels;
        this.name = $.name;
        this.optimized = $.optimized;
        this.project = $.project;
        this.pulumiLabels = $.pulumiLabels;
        this.region = $.region;
        this.state = $.state;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AiFeatureOnlineStoreState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AiFeatureOnlineStoreState $;

        public Builder() {
            $ = new AiFeatureOnlineStoreState();
        }

        public Builder(AiFeatureOnlineStoreState defaults) {
            $ = new AiFeatureOnlineStoreState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bigtable Settings for Cloud Bigtable instance that will be created to serve featureValues for all FeatureViews under this FeatureOnlineStore.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bigtable(@Nullable Output<AiFeatureOnlineStoreBigtableArgs> bigtable) {
            $.bigtable = bigtable;
            return this;
        }

        /**
         * @param bigtable Settings for Cloud Bigtable instance that will be created to serve featureValues for all FeatureViews under this FeatureOnlineStore.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bigtable(AiFeatureOnlineStoreBigtableArgs bigtable) {
            return bigtable(Output.of(bigtable));
        }

        /**
         * @param createTime The timestamp of when the feature online store was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The timestamp of when the feature online store was created in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param dedicatedServingEndpoint The dedicated serving endpoint for this FeatureOnlineStore, which is different from common vertex service endpoint. Only
         * need to set when you choose Optimized storage type or enable EmbeddingManagement. Will use public endpoint by default.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedServingEndpoint(@Nullable Output<AiFeatureOnlineStoreDedicatedServingEndpointArgs> dedicatedServingEndpoint) {
            $.dedicatedServingEndpoint = dedicatedServingEndpoint;
            return this;
        }

        /**
         * @param dedicatedServingEndpoint The dedicated serving endpoint for this FeatureOnlineStore, which is different from common vertex service endpoint. Only
         * need to set when you choose Optimized storage type or enable EmbeddingManagement. Will use public endpoint by default.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedServingEndpoint(AiFeatureOnlineStoreDedicatedServingEndpointArgs dedicatedServingEndpoint) {
            return dedicatedServingEndpoint(Output.of(dedicatedServingEndpoint));
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(@Nullable Output<Map<String,String>> effectiveLabels) {
            $.effectiveLabels = effectiveLabels;
            return this;
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            return effectiveLabels(Output.of(effectiveLabels));
        }

        /**
         * @param embeddingManagement The settings for embedding management in FeatureOnlineStore. Embedding management can only be used with BigTable.
         * 
         * @return builder
         * 
         */
        public Builder embeddingManagement(@Nullable Output<AiFeatureOnlineStoreEmbeddingManagementArgs> embeddingManagement) {
            $.embeddingManagement = embeddingManagement;
            return this;
        }

        /**
         * @param embeddingManagement The settings for embedding management in FeatureOnlineStore. Embedding management can only be used with BigTable.
         * 
         * @return builder
         * 
         */
        public Builder embeddingManagement(AiFeatureOnlineStoreEmbeddingManagementArgs embeddingManagement) {
            return embeddingManagement(Output.of(embeddingManagement));
        }

        /**
         * @param etag Used to perform consistent read-modify-write updates.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag Used to perform consistent read-modify-write updates.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param forceDestroy If set to true, any FeatureViews and Features for this FeatureOnlineStore will also be deleted.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * @param forceDestroy If set to true, any FeatureViews and Features for this FeatureOnlineStore will also be deleted.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        /**
         * @param labels The labels with user-defined metadata to organize your feature online stores.
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
         * @param labels The labels with user-defined metadata to organize your feature online stores.
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
         * @param name The resource name of the Feature Online Store. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the Feature Online Store. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param optimized Settings for the Optimized store that will be created to serve featureValues for all FeatureViews under this
         * FeatureOnlineStore
         * 
         * @return builder
         * 
         */
        public Builder optimized(@Nullable Output<AiFeatureOnlineStoreOptimizedArgs> optimized) {
            $.optimized = optimized;
            return this;
        }

        /**
         * @param optimized Settings for the Optimized store that will be created to serve featureValues for all FeatureViews under this
         * FeatureOnlineStore
         * 
         * @return builder
         * 
         */
        public Builder optimized(AiFeatureOnlineStoreOptimizedArgs optimized) {
            return optimized(Output.of(optimized));
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
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(@Nullable Output<Map<String,String>> pulumiLabels) {
            $.pulumiLabels = pulumiLabels;
            return this;
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            return pulumiLabels(Output.of(pulumiLabels));
        }

        /**
         * @param region The region of feature online store. eg us-central1
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region of feature online store. eg us-central1
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param state The state of the Feature Online Store. See the possible states in [this link](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featureOnlineStores#state).
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the Feature Online Store. See the possible states in [this link](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featureOnlineStores#state).
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param updateTime The timestamp of when the feature online store was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The timestamp of when the feature online store was last updated in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public AiFeatureOnlineStoreState build() {
            return $;
        }
    }

}