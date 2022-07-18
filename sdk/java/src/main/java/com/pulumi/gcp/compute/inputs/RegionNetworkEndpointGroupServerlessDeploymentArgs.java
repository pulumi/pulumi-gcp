// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionNetworkEndpointGroupServerlessDeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionNetworkEndpointGroupServerlessDeploymentArgs Empty = new RegionNetworkEndpointGroupServerlessDeploymentArgs();

    /**
     * The platform of the NEG backend target(s). Possible values:
     * API Gateway: apigateway.googleapis.com
     * 
     */
    @Import(name="platform", required=true)
    private Output<String> platform;

    /**
     * @return The platform of the NEG backend target(s). Possible values:
     * API Gateway: apigateway.googleapis.com
     * 
     */
    public Output<String> platform() {
        return this.platform;
    }

    /**
     * The user-defined name of the workload/instance. This value must be provided explicitly or in the urlMask.
     * The resource identified by this value is platform-specific and is as follows: API Gateway: The gateway ID, App Engine: The service name,
     * Cloud Functions: The function name, Cloud Run: The service name
     * 
     */
    @Import(name="resource")
    private @Nullable Output<String> resource;

    /**
     * @return The user-defined name of the workload/instance. This value must be provided explicitly or in the urlMask.
     * The resource identified by this value is platform-specific and is as follows: API Gateway: The gateway ID, App Engine: The service name,
     * Cloud Functions: The function name, Cloud Run: The service name
     * 
     */
    public Optional<Output<String>> resource() {
        return Optional.ofNullable(this.resource);
    }

    /**
     * A template to parse platform-specific fields from a request URL. URL mask allows for routing to multiple resources
     * on the same serverless platform without having to create multiple Network Endpoint Groups and backend resources.
     * The fields parsed by this template are platform-specific and are as follows: API Gateway: The gateway ID,
     * App Engine: The service and version, Cloud Functions: The function name, Cloud Run: The service and tag
     * 
     */
    @Import(name="urlMask")
    private @Nullable Output<String> urlMask;

    /**
     * @return A template to parse platform-specific fields from a request URL. URL mask allows for routing to multiple resources
     * on the same serverless platform without having to create multiple Network Endpoint Groups and backend resources.
     * The fields parsed by this template are platform-specific and are as follows: API Gateway: The gateway ID,
     * App Engine: The service and version, Cloud Functions: The function name, Cloud Run: The service and tag
     * 
     */
    public Optional<Output<String>> urlMask() {
        return Optional.ofNullable(this.urlMask);
    }

    /**
     * The optional resource version. The version identified by this value is platform-specific and is follows:
     * API Gateway: Unused, App Engine: The service version, Cloud Functions: Unused, Cloud Run: The service tag
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The optional resource version. The version identified by this value is platform-specific and is follows:
     * API Gateway: Unused, App Engine: The service version, Cloud Functions: Unused, Cloud Run: The service tag
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private RegionNetworkEndpointGroupServerlessDeploymentArgs() {}

    private RegionNetworkEndpointGroupServerlessDeploymentArgs(RegionNetworkEndpointGroupServerlessDeploymentArgs $) {
        this.platform = $.platform;
        this.resource = $.resource;
        this.urlMask = $.urlMask;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionNetworkEndpointGroupServerlessDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionNetworkEndpointGroupServerlessDeploymentArgs $;

        public Builder() {
            $ = new RegionNetworkEndpointGroupServerlessDeploymentArgs();
        }

        public Builder(RegionNetworkEndpointGroupServerlessDeploymentArgs defaults) {
            $ = new RegionNetworkEndpointGroupServerlessDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param platform The platform of the NEG backend target(s). Possible values:
         * API Gateway: apigateway.googleapis.com
         * 
         * @return builder
         * 
         */
        public Builder platform(Output<String> platform) {
            $.platform = platform;
            return this;
        }

        /**
         * @param platform The platform of the NEG backend target(s). Possible values:
         * API Gateway: apigateway.googleapis.com
         * 
         * @return builder
         * 
         */
        public Builder platform(String platform) {
            return platform(Output.of(platform));
        }

        /**
         * @param resource The user-defined name of the workload/instance. This value must be provided explicitly or in the urlMask.
         * The resource identified by this value is platform-specific and is as follows: API Gateway: The gateway ID, App Engine: The service name,
         * Cloud Functions: The function name, Cloud Run: The service name
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource The user-defined name of the workload/instance. This value must be provided explicitly or in the urlMask.
         * The resource identified by this value is platform-specific and is as follows: API Gateway: The gateway ID, App Engine: The service name,
         * Cloud Functions: The function name, Cloud Run: The service name
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param urlMask A template to parse platform-specific fields from a request URL. URL mask allows for routing to multiple resources
         * on the same serverless platform without having to create multiple Network Endpoint Groups and backend resources.
         * The fields parsed by this template are platform-specific and are as follows: API Gateway: The gateway ID,
         * App Engine: The service and version, Cloud Functions: The function name, Cloud Run: The service and tag
         * 
         * @return builder
         * 
         */
        public Builder urlMask(@Nullable Output<String> urlMask) {
            $.urlMask = urlMask;
            return this;
        }

        /**
         * @param urlMask A template to parse platform-specific fields from a request URL. URL mask allows for routing to multiple resources
         * on the same serverless platform without having to create multiple Network Endpoint Groups and backend resources.
         * The fields parsed by this template are platform-specific and are as follows: API Gateway: The gateway ID,
         * App Engine: The service and version, Cloud Functions: The function name, Cloud Run: The service and tag
         * 
         * @return builder
         * 
         */
        public Builder urlMask(String urlMask) {
            return urlMask(Output.of(urlMask));
        }

        /**
         * @param version The optional resource version. The version identified by this value is platform-specific and is follows:
         * API Gateway: Unused, App Engine: The service version, Cloud Functions: Unused, Cloud Run: The service tag
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The optional resource version. The version identified by this value is platform-specific and is follows:
         * API Gateway: Unused, App Engine: The service version, Cloud Functions: Unused, Cloud Run: The service tag
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public RegionNetworkEndpointGroupServerlessDeploymentArgs build() {
            $.platform = Objects.requireNonNull($.platform, "expected parameter 'platform' to be non-null");
            return $;
        }
    }

}