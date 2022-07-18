// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionNetworkEndpointGroupCloudFunctionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionNetworkEndpointGroupCloudFunctionArgs Empty = new RegionNetworkEndpointGroupCloudFunctionArgs();

    /**
     * A user-defined name of the Cloud Function.
     * The function name is case-sensitive and must be 1-63 characters long.
     * Example value: &#34;func1&#34;.
     * 
     */
    @Import(name="function")
    private @Nullable Output<String> function;

    /**
     * @return A user-defined name of the Cloud Function.
     * The function name is case-sensitive and must be 1-63 characters long.
     * Example value: &#34;func1&#34;.
     * 
     */
    public Optional<Output<String>> function() {
        return Optional.ofNullable(this.function);
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

    private RegionNetworkEndpointGroupCloudFunctionArgs() {}

    private RegionNetworkEndpointGroupCloudFunctionArgs(RegionNetworkEndpointGroupCloudFunctionArgs $) {
        this.function = $.function;
        this.urlMask = $.urlMask;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionNetworkEndpointGroupCloudFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionNetworkEndpointGroupCloudFunctionArgs $;

        public Builder() {
            $ = new RegionNetworkEndpointGroupCloudFunctionArgs();
        }

        public Builder(RegionNetworkEndpointGroupCloudFunctionArgs defaults) {
            $ = new RegionNetworkEndpointGroupCloudFunctionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param function A user-defined name of the Cloud Function.
         * The function name is case-sensitive and must be 1-63 characters long.
         * Example value: &#34;func1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder function(@Nullable Output<String> function) {
            $.function = function;
            return this;
        }

        /**
         * @param function A user-defined name of the Cloud Function.
         * The function name is case-sensitive and must be 1-63 characters long.
         * Example value: &#34;func1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder function(String function) {
            return function(Output.of(function));
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

        public RegionNetworkEndpointGroupCloudFunctionArgs build() {
            return $;
        }
    }

}