// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * Resource name of the API Config for this Gateway. Format: projects/{project}/locations/global/apis/{api}/configs/{apiConfig}.
     * When changing api configs please ensure the new config is a new resource and the lifecycle rule `create_before_destroy` is set.
     * 
     */
    @Import(name="apiConfig", required=true)
    private Output<String> apiConfig;

    /**
     * @return Resource name of the API Config for this Gateway. Format: projects/{project}/locations/global/apis/{api}/configs/{apiConfig}.
     * When changing api configs please ensure the new config is a new resource and the lifecycle rule `create_before_destroy` is set.
     * 
     */
    public Output<String> apiConfig() {
        return this.apiConfig;
    }

    /**
     * A user-visible name for the API.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A user-visible name for the API.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Identifier to assign to the Gateway. Must be unique within scope of the parent resource(project).
     * 
     */
    @Import(name="gatewayId", required=true)
    private Output<String> gatewayId;

    /**
     * @return Identifier to assign to the Gateway. Must be unique within scope of the parent resource(project).
     * 
     */
    public Output<String> gatewayId() {
        return this.gatewayId;
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
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
     * The region of the gateway for the API.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region of the gateway for the API.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private GatewayArgs() {}

    private GatewayArgs(GatewayArgs $) {
        this.apiConfig = $.apiConfig;
        this.displayName = $.displayName;
        this.gatewayId = $.gatewayId;
        this.labels = $.labels;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayArgs $;

        public Builder() {
            $ = new GatewayArgs();
        }

        public Builder(GatewayArgs defaults) {
            $ = new GatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiConfig Resource name of the API Config for this Gateway. Format: projects/{project}/locations/global/apis/{api}/configs/{apiConfig}.
         * When changing api configs please ensure the new config is a new resource and the lifecycle rule `create_before_destroy` is set.
         * 
         * @return builder
         * 
         */
        public Builder apiConfig(Output<String> apiConfig) {
            $.apiConfig = apiConfig;
            return this;
        }

        /**
         * @param apiConfig Resource name of the API Config for this Gateway. Format: projects/{project}/locations/global/apis/{api}/configs/{apiConfig}.
         * When changing api configs please ensure the new config is a new resource and the lifecycle rule `create_before_destroy` is set.
         * 
         * @return builder
         * 
         */
        public Builder apiConfig(String apiConfig) {
            return apiConfig(Output.of(apiConfig));
        }

        /**
         * @param displayName A user-visible name for the API.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A user-visible name for the API.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param gatewayId Identifier to assign to the Gateway. Must be unique within scope of the parent resource(project).
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(Output<String> gatewayId) {
            $.gatewayId = gatewayId;
            return this;
        }

        /**
         * @param gatewayId Identifier to assign to the Gateway. Must be unique within scope of the parent resource(project).
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(String gatewayId) {
            return gatewayId(Output.of(gatewayId));
        }

        /**
         * @param labels Resource labels to represent user-provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Resource labels to represent user-provided metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
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
         * @param region The region of the gateway for the API.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region of the gateway for the API.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GatewayArgs build() {
            $.apiConfig = Objects.requireNonNull($.apiConfig, "expected parameter 'apiConfig' to be non-null");
            $.gatewayId = Objects.requireNonNull($.gatewayId, "expected parameter 'gatewayId' to be non-null");
            return $;
        }
    }

}