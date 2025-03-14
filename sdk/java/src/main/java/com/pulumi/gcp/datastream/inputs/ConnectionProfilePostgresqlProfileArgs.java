// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionProfilePostgresqlProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionProfilePostgresqlProfileArgs Empty = new ConnectionProfilePostgresqlProfileArgs();

    /**
     * Database for the PostgreSQL connection.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return Database for the PostgreSQL connection.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * Hostname for the PostgreSQL connection.
     * 
     */
    @Import(name="hostname", required=true)
    private Output<String> hostname;

    /**
     * @return Hostname for the PostgreSQL connection.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }

    /**
     * Password for the PostgreSQL connection.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Password for the PostgreSQL connection.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * Port for the PostgreSQL connection.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Port for the PostgreSQL connection.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Username for the PostgreSQL connection.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Username for the PostgreSQL connection.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private ConnectionProfilePostgresqlProfileArgs() {}

    private ConnectionProfilePostgresqlProfileArgs(ConnectionProfilePostgresqlProfileArgs $) {
        this.database = $.database;
        this.hostname = $.hostname;
        this.password = $.password;
        this.port = $.port;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionProfilePostgresqlProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionProfilePostgresqlProfileArgs $;

        public Builder() {
            $ = new ConnectionProfilePostgresqlProfileArgs();
        }

        public Builder(ConnectionProfilePostgresqlProfileArgs defaults) {
            $ = new ConnectionProfilePostgresqlProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database Database for the PostgreSQL connection.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Database for the PostgreSQL connection.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param hostname Hostname for the PostgreSQL connection.
         * 
         * @return builder
         * 
         */
        public Builder hostname(Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Hostname for the PostgreSQL connection.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param password Password for the PostgreSQL connection.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for the PostgreSQL connection.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param port Port for the PostgreSQL connection.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port for the PostgreSQL connection.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param username Username for the PostgreSQL connection.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username for the PostgreSQL connection.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ConnectionProfilePostgresqlProfileArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("ConnectionProfilePostgresqlProfileArgs", "database");
            }
            if ($.hostname == null) {
                throw new MissingRequiredPropertyException("ConnectionProfilePostgresqlProfileArgs", "hostname");
            }
            if ($.password == null) {
                throw new MissingRequiredPropertyException("ConnectionProfilePostgresqlProfileArgs", "password");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("ConnectionProfilePostgresqlProfileArgs", "username");
            }
            return $;
        }
    }

}
