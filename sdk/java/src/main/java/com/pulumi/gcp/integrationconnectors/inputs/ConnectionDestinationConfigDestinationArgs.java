// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionDestinationConfigDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionDestinationConfigDestinationArgs Empty = new ConnectionDestinationConfigDestinationArgs();

    /**
     * Host
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return Host
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * port number
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return port number
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Service Attachment
     * 
     */
    @Import(name="serviceAttachment")
    private @Nullable Output<String> serviceAttachment;

    /**
     * @return Service Attachment
     * 
     */
    public Optional<Output<String>> serviceAttachment() {
        return Optional.ofNullable(this.serviceAttachment);
    }

    private ConnectionDestinationConfigDestinationArgs() {}

    private ConnectionDestinationConfigDestinationArgs(ConnectionDestinationConfigDestinationArgs $) {
        this.host = $.host;
        this.port = $.port;
        this.serviceAttachment = $.serviceAttachment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionDestinationConfigDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionDestinationConfigDestinationArgs $;

        public Builder() {
            $ = new ConnectionDestinationConfigDestinationArgs();
        }

        public Builder(ConnectionDestinationConfigDestinationArgs defaults) {
            $ = new ConnectionDestinationConfigDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param host Host
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Host
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param port port number
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port port number
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param serviceAttachment Service Attachment
         * 
         * @return builder
         * 
         */
        public Builder serviceAttachment(@Nullable Output<String> serviceAttachment) {
            $.serviceAttachment = serviceAttachment;
            return this;
        }

        /**
         * @param serviceAttachment Service Attachment
         * 
         * @return builder
         * 
         */
        public Builder serviceAttachment(String serviceAttachment) {
            return serviceAttachment(Output.of(serviceAttachment));
        }

        public ConnectionDestinationConfigDestinationArgs build() {
            return $;
        }
    }

}
