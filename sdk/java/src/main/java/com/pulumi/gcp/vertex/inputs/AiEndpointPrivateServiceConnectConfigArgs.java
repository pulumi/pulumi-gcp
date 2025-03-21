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


public final class AiEndpointPrivateServiceConnectConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AiEndpointPrivateServiceConnectConfigArgs Empty = new AiEndpointPrivateServiceConnectConfigArgs();

    /**
     * Required. If true, expose the IndexEndpoint via private service connect.
     * 
     */
    @Import(name="enablePrivateServiceConnect", required=true)
    private Output<Boolean> enablePrivateServiceConnect;

    /**
     * @return Required. If true, expose the IndexEndpoint via private service connect.
     * 
     */
    public Output<Boolean> enablePrivateServiceConnect() {
        return this.enablePrivateServiceConnect;
    }

    /**
     * If set to true, enable secure private service connect with IAM authorization. Otherwise, private service connect will be done without authorization. Note latency will be slightly increased if authorization is enabled.
     * 
     */
    @Import(name="enableSecurePrivateServiceConnect")
    private @Nullable Output<Boolean> enableSecurePrivateServiceConnect;

    /**
     * @return If set to true, enable secure private service connect with IAM authorization. Otherwise, private service connect will be done without authorization. Note latency will be slightly increased if authorization is enabled.
     * 
     */
    public Optional<Output<Boolean>> enableSecurePrivateServiceConnect() {
        return Optional.ofNullable(this.enableSecurePrivateServiceConnect);
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

    private AiEndpointPrivateServiceConnectConfigArgs() {}

    private AiEndpointPrivateServiceConnectConfigArgs(AiEndpointPrivateServiceConnectConfigArgs $) {
        this.enablePrivateServiceConnect = $.enablePrivateServiceConnect;
        this.enableSecurePrivateServiceConnect = $.enableSecurePrivateServiceConnect;
        this.projectAllowlists = $.projectAllowlists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AiEndpointPrivateServiceConnectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AiEndpointPrivateServiceConnectConfigArgs $;

        public Builder() {
            $ = new AiEndpointPrivateServiceConnectConfigArgs();
        }

        public Builder(AiEndpointPrivateServiceConnectConfigArgs defaults) {
            $ = new AiEndpointPrivateServiceConnectConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enablePrivateServiceConnect Required. If true, expose the IndexEndpoint via private service connect.
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateServiceConnect(Output<Boolean> enablePrivateServiceConnect) {
            $.enablePrivateServiceConnect = enablePrivateServiceConnect;
            return this;
        }

        /**
         * @param enablePrivateServiceConnect Required. If true, expose the IndexEndpoint via private service connect.
         * 
         * @return builder
         * 
         */
        public Builder enablePrivateServiceConnect(Boolean enablePrivateServiceConnect) {
            return enablePrivateServiceConnect(Output.of(enablePrivateServiceConnect));
        }

        /**
         * @param enableSecurePrivateServiceConnect If set to true, enable secure private service connect with IAM authorization. Otherwise, private service connect will be done without authorization. Note latency will be slightly increased if authorization is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableSecurePrivateServiceConnect(@Nullable Output<Boolean> enableSecurePrivateServiceConnect) {
            $.enableSecurePrivateServiceConnect = enableSecurePrivateServiceConnect;
            return this;
        }

        /**
         * @param enableSecurePrivateServiceConnect If set to true, enable secure private service connect with IAM authorization. Otherwise, private service connect will be done without authorization. Note latency will be slightly increased if authorization is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableSecurePrivateServiceConnect(Boolean enableSecurePrivateServiceConnect) {
            return enableSecurePrivateServiceConnect(Output.of(enableSecurePrivateServiceConnect));
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

        public AiEndpointPrivateServiceConnectConfigArgs build() {
            if ($.enablePrivateServiceConnect == null) {
                throw new MissingRequiredPropertyException("AiEndpointPrivateServiceConnectConfigArgs", "enablePrivateServiceConnect");
            }
            return $;
        }
    }

}
