// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionConnectorVersionInfraConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionConnectorVersionInfraConfigArgs Empty = new ConnectionConnectorVersionInfraConfigArgs();

    /**
     * (Output)
     * Max QPS supported by the connector version before throttling of requests.
     * 
     */
    @Import(name="ratelimitThreshold")
    private @Nullable Output<String> ratelimitThreshold;

    /**
     * @return (Output)
     * Max QPS supported by the connector version before throttling of requests.
     * 
     */
    public Optional<Output<String>> ratelimitThreshold() {
        return Optional.ofNullable(this.ratelimitThreshold);
    }

    private ConnectionConnectorVersionInfraConfigArgs() {}

    private ConnectionConnectorVersionInfraConfigArgs(ConnectionConnectorVersionInfraConfigArgs $) {
        this.ratelimitThreshold = $.ratelimitThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionConnectorVersionInfraConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionConnectorVersionInfraConfigArgs $;

        public Builder() {
            $ = new ConnectionConnectorVersionInfraConfigArgs();
        }

        public Builder(ConnectionConnectorVersionInfraConfigArgs defaults) {
            $ = new ConnectionConnectorVersionInfraConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ratelimitThreshold (Output)
         * Max QPS supported by the connector version before throttling of requests.
         * 
         * @return builder
         * 
         */
        public Builder ratelimitThreshold(@Nullable Output<String> ratelimitThreshold) {
            $.ratelimitThreshold = ratelimitThreshold;
            return this;
        }

        /**
         * @param ratelimitThreshold (Output)
         * Max QPS supported by the connector version before throttling of requests.
         * 
         * @return builder
         * 
         */
        public Builder ratelimitThreshold(String ratelimitThreshold) {
            return ratelimitThreshold(Output.of(ratelimitThreshold));
        }

        public ConnectionConnectorVersionInfraConfigArgs build() {
            return $;
        }
    }

}