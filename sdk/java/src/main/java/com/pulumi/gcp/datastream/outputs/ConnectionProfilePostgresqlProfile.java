// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionProfilePostgresqlProfile {
    /**
     * @return Database for the PostgreSQL connection.
     * 
     */
    private String database;
    /**
     * @return Hostname for the PostgreSQL connection.
     * 
     */
    private String hostname;
    /**
     * @return Password for the PostgreSQL connection.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    private @Nullable String password;
    /**
     * @return Port for the PostgreSQL connection.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return A reference to a Secret Manager resource name storing the user&#39;s password.
     * 
     */
    private @Nullable String secretManagerStoredPassword;
    /**
     * @return Username for the PostgreSQL connection.
     * 
     */
    private String username;

    private ConnectionProfilePostgresqlProfile() {}
    /**
     * @return Database for the PostgreSQL connection.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return Hostname for the PostgreSQL connection.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return Password for the PostgreSQL connection.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Port for the PostgreSQL connection.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return A reference to a Secret Manager resource name storing the user&#39;s password.
     * 
     */
    public Optional<String> secretManagerStoredPassword() {
        return Optional.ofNullable(this.secretManagerStoredPassword);
    }
    /**
     * @return Username for the PostgreSQL connection.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionProfilePostgresqlProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String database;
        private String hostname;
        private @Nullable String password;
        private @Nullable Integer port;
        private @Nullable String secretManagerStoredPassword;
        private String username;
        public Builder() {}
        public Builder(ConnectionProfilePostgresqlProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.hostname = defaults.hostname;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.secretManagerStoredPassword = defaults.secretManagerStoredPassword;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder database(String database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("ConnectionProfilePostgresqlProfile", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            if (hostname == null) {
              throw new MissingRequiredPropertyException("ConnectionProfilePostgresqlProfile", "hostname");
            }
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder secretManagerStoredPassword(@Nullable String secretManagerStoredPassword) {

            this.secretManagerStoredPassword = secretManagerStoredPassword;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("ConnectionProfilePostgresqlProfile", "username");
            }
            this.username = username;
            return this;
        }
        public ConnectionProfilePostgresqlProfile build() {
            final var _resultValue = new ConnectionProfilePostgresqlProfile();
            _resultValue.database = database;
            _resultValue.hostname = hostname;
            _resultValue.password = password;
            _resultValue.port = port;
            _resultValue.secretManagerStoredPassword = secretManagerStoredPassword;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
