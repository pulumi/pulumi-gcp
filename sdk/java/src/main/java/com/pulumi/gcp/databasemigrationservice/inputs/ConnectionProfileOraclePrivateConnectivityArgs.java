// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.databasemigrationservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectionProfileOraclePrivateConnectivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionProfileOraclePrivateConnectivityArgs Empty = new ConnectionProfileOraclePrivateConnectivityArgs();

    /**
     * Required. The resource name (URI) of the private connection.
     * 
     */
    @Import(name="privateConnection", required=true)
    private Output<String> privateConnection;

    /**
     * @return Required. The resource name (URI) of the private connection.
     * 
     */
    public Output<String> privateConnection() {
        return this.privateConnection;
    }

    private ConnectionProfileOraclePrivateConnectivityArgs() {}

    private ConnectionProfileOraclePrivateConnectivityArgs(ConnectionProfileOraclePrivateConnectivityArgs $) {
        this.privateConnection = $.privateConnection;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionProfileOraclePrivateConnectivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionProfileOraclePrivateConnectivityArgs $;

        public Builder() {
            $ = new ConnectionProfileOraclePrivateConnectivityArgs();
        }

        public Builder(ConnectionProfileOraclePrivateConnectivityArgs defaults) {
            $ = new ConnectionProfileOraclePrivateConnectivityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateConnection Required. The resource name (URI) of the private connection.
         * 
         * @return builder
         * 
         */
        public Builder privateConnection(Output<String> privateConnection) {
            $.privateConnection = privateConnection;
            return this;
        }

        /**
         * @param privateConnection Required. The resource name (URI) of the private connection.
         * 
         * @return builder
         * 
         */
        public Builder privateConnection(String privateConnection) {
            return privateConnection(Output.of(privateConnection));
        }

        public ConnectionProfileOraclePrivateConnectivityArgs build() {
            $.privateConnection = Objects.requireNonNull($.privateConnection, "expected parameter 'privateConnection' to be non-null");
            return $;
        }
    }

}