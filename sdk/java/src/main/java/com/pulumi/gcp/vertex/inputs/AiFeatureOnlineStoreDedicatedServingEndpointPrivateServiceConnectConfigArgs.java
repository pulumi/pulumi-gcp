// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfigArgs Empty = new AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfigArgs();

    /**
     * If set to true, customers will use private service connection to send request. Otherwise, the connection will set to public endpoint.
     * 
     */
    @Import(name="enablePrivateServiceConnect", required=true)
    private Output<Boolean> enablePrivateServiceConnect;

    /**
     * @return If set to true, customers will use private service connection to send request. Otherwise, the connection will set to public endpoint.
     * 
     */
    public Output<Boolean> enablePrivateServiceConnect() {
        return this.enablePrivateServiceConnect;
    }

    /**
     * A list of Projects from which the forwarding rule will target the service attachment.
     * 
     */
    @Import(name="projectAllowlists")
    private @Nullable Output<List<String>> projectAllowlists;

    /**
     * @return A list of Projects from which the forwarding rule will target the service attachment.
     * 
     */
    public Optional<Output<List<String>>> projectAllowlists() {
        return Optional.ofNullable(this.projectAllowlists);
    }

    private AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfigArgs() {}

    private AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfigArgs(AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfigArgs $) {
        this.enablePrivateServiceConnect = $.enablePrivateServiceConnect;
        this.projectAllowlists = $.projectAllowlists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfigArgs $;

        public Builder() {
            $ = new AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfigArgs();
        }

        public Builder(AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfigArgs defaults) {
            $ = new AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enablePrivateServiceConnect If set to true, customers will use private service connection to send request. Otherwise, the connection will set to public endpoint.
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateServiceConnect(Output<Boolean> enablePrivateServiceConnect) {
            $.enablePrivateServiceConnect = enablePrivateServiceConnect;
            return this;
        }

        /**
         * @param enablePrivateServiceConnect If set to true, customers will use private service connection to send request. Otherwise, the connection will set to public endpoint.
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateServiceConnect(Boolean enablePrivateServiceConnect) {
            return enablePrivateServiceConnect(Output.of(enablePrivateServiceConnect));
        }

        /**
         * @param projectAllowlists A list of Projects from which the forwarding rule will target the service attachment.
         * 
         * @return builder
         * 
         */
        public Builder projectAllowlists(@Nullable Output<List<String>> projectAllowlists) {
            $.projectAllowlists = projectAllowlists;
            return this;
        }

        /**
         * @param projectAllowlists A list of Projects from which the forwarding rule will target the service attachment.
         * 
         * @return builder
         * 
         */
        public Builder projectAllowlists(List<String> projectAllowlists) {
            return projectAllowlists(Output.of(projectAllowlists));
        }

        /**
         * @param projectAllowlists A list of Projects from which the forwarding rule will target the service attachment.
         * 
         * @return builder
         * 
         */
        public Builder projectAllowlists(String... projectAllowlists) {
            return projectAllowlists(List.of(projectAllowlists));
        }

        public AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfigArgs build() {
            if ($.enablePrivateServiceConnect == null) {
                throw new MissingRequiredPropertyException("AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfigArgs", "enablePrivateServiceConnect");
            }
            return $;
        }
    }

}