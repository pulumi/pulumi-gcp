// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelAutomaticResourceArgs;
import com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceArgs;
import com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelPrivateEndpointArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AiEndpointDeployedModelArgs extends com.pulumi.resources.ResourceArgs {

    public static final AiEndpointDeployedModelArgs Empty = new AiEndpointDeployedModelArgs();

    @Import(name="automaticResources")
    private @Nullable Output<List<AiEndpointDeployedModelAutomaticResourceArgs>> automaticResources;

    public Optional<Output<List<AiEndpointDeployedModelAutomaticResourceArgs>>> automaticResources() {
        return Optional.ofNullable(this.automaticResources);
    }

    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    @Import(name="dedicatedResources")
    private @Nullable Output<List<AiEndpointDeployedModelDedicatedResourceArgs>> dedicatedResources;

    public Optional<Output<List<AiEndpointDeployedModelDedicatedResourceArgs>>> dedicatedResources() {
        return Optional.ofNullable(this.dedicatedResources);
    }

    /**
     * Required. The display name of the Endpoint. The name can be up to 128 characters long and can consist of any UTF-8 characters.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Required. The display name of the Endpoint. The name can be up to 128 characters long and can consist of any UTF-8 characters.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="enableAccessLogging")
    private @Nullable Output<Boolean> enableAccessLogging;

    public Optional<Output<Boolean>> enableAccessLogging() {
        return Optional.ofNullable(this.enableAccessLogging);
    }

    @Import(name="enableContainerLogging")
    private @Nullable Output<Boolean> enableContainerLogging;

    public Optional<Output<Boolean>> enableContainerLogging() {
        return Optional.ofNullable(this.enableContainerLogging);
    }

    /**
     * an identifier for the resource with format `projects/{{project}}/locations/{{location}}/endpoints/{{name}}`
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return an identifier for the resource with format `projects/{{project}}/locations/{{location}}/endpoints/{{name}}`
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="model")
    private @Nullable Output<String> model;

    public Optional<Output<String>> model() {
        return Optional.ofNullable(this.model);
    }

    @Import(name="modelVersionId")
    private @Nullable Output<String> modelVersionId;

    public Optional<Output<String>> modelVersionId() {
        return Optional.ofNullable(this.modelVersionId);
    }

    @Import(name="privateEndpoints")
    private @Nullable Output<List<AiEndpointDeployedModelPrivateEndpointArgs>> privateEndpoints;

    public Optional<Output<List<AiEndpointDeployedModelPrivateEndpointArgs>>> privateEndpoints() {
        return Optional.ofNullable(this.privateEndpoints);
    }

    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    @Import(name="sharedResources")
    private @Nullable Output<String> sharedResources;

    public Optional<Output<String>> sharedResources() {
        return Optional.ofNullable(this.sharedResources);
    }

    private AiEndpointDeployedModelArgs() {}

    private AiEndpointDeployedModelArgs(AiEndpointDeployedModelArgs $) {
        this.automaticResources = $.automaticResources;
        this.createTime = $.createTime;
        this.dedicatedResources = $.dedicatedResources;
        this.displayName = $.displayName;
        this.enableAccessLogging = $.enableAccessLogging;
        this.enableContainerLogging = $.enableContainerLogging;
        this.id = $.id;
        this.model = $.model;
        this.modelVersionId = $.modelVersionId;
        this.privateEndpoints = $.privateEndpoints;
        this.serviceAccount = $.serviceAccount;
        this.sharedResources = $.sharedResources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AiEndpointDeployedModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AiEndpointDeployedModelArgs $;

        public Builder() {
            $ = new AiEndpointDeployedModelArgs();
        }

        public Builder(AiEndpointDeployedModelArgs defaults) {
            $ = new AiEndpointDeployedModelArgs(Objects.requireNonNull(defaults));
        }

        public Builder automaticResources(@Nullable Output<List<AiEndpointDeployedModelAutomaticResourceArgs>> automaticResources) {
            $.automaticResources = automaticResources;
            return this;
        }

        public Builder automaticResources(List<AiEndpointDeployedModelAutomaticResourceArgs> automaticResources) {
            return automaticResources(Output.of(automaticResources));
        }

        public Builder automaticResources(AiEndpointDeployedModelAutomaticResourceArgs... automaticResources) {
            return automaticResources(List.of(automaticResources));
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        public Builder dedicatedResources(@Nullable Output<List<AiEndpointDeployedModelDedicatedResourceArgs>> dedicatedResources) {
            $.dedicatedResources = dedicatedResources;
            return this;
        }

        public Builder dedicatedResources(List<AiEndpointDeployedModelDedicatedResourceArgs> dedicatedResources) {
            return dedicatedResources(Output.of(dedicatedResources));
        }

        public Builder dedicatedResources(AiEndpointDeployedModelDedicatedResourceArgs... dedicatedResources) {
            return dedicatedResources(List.of(dedicatedResources));
        }

        /**
         * @param displayName Required. The display name of the Endpoint. The name can be up to 128 characters long and can consist of any UTF-8 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
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

        public Builder enableAccessLogging(@Nullable Output<Boolean> enableAccessLogging) {
            $.enableAccessLogging = enableAccessLogging;
            return this;
        }

        public Builder enableAccessLogging(Boolean enableAccessLogging) {
            return enableAccessLogging(Output.of(enableAccessLogging));
        }

        public Builder enableContainerLogging(@Nullable Output<Boolean> enableContainerLogging) {
            $.enableContainerLogging = enableContainerLogging;
            return this;
        }

        public Builder enableContainerLogging(Boolean enableContainerLogging) {
            return enableContainerLogging(Output.of(enableContainerLogging));
        }

        /**
         * @param id an identifier for the resource with format `projects/{{project}}/locations/{{location}}/endpoints/{{name}}`
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id an identifier for the resource with format `projects/{{project}}/locations/{{location}}/endpoints/{{name}}`
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder model(@Nullable Output<String> model) {
            $.model = model;
            return this;
        }

        public Builder model(String model) {
            return model(Output.of(model));
        }

        public Builder modelVersionId(@Nullable Output<String> modelVersionId) {
            $.modelVersionId = modelVersionId;
            return this;
        }

        public Builder modelVersionId(String modelVersionId) {
            return modelVersionId(Output.of(modelVersionId));
        }

        public Builder privateEndpoints(@Nullable Output<List<AiEndpointDeployedModelPrivateEndpointArgs>> privateEndpoints) {
            $.privateEndpoints = privateEndpoints;
            return this;
        }

        public Builder privateEndpoints(List<AiEndpointDeployedModelPrivateEndpointArgs> privateEndpoints) {
            return privateEndpoints(Output.of(privateEndpoints));
        }

        public Builder privateEndpoints(AiEndpointDeployedModelPrivateEndpointArgs... privateEndpoints) {
            return privateEndpoints(List.of(privateEndpoints));
        }

        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        public Builder sharedResources(@Nullable Output<String> sharedResources) {
            $.sharedResources = sharedResources;
            return this;
        }

        public Builder sharedResources(String sharedResources) {
            return sharedResources(Output.of(sharedResources));
        }

        public AiEndpointDeployedModelArgs build() {
            return $;
        }
    }

}