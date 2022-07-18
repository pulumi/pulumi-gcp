// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionCloudSpanner {
    /**
     * @return Cloud Spanner database in the form `project/instance/database&#39;
     * 
     */
    private final String database;
    /**
     * @return If parallelism should be used when reading from Cloud Spanner
     * 
     */
    private final @Nullable Boolean useParallelism;

    @CustomType.Constructor
    private ConnectionCloudSpanner(
        @CustomType.Parameter("database") String database,
        @CustomType.Parameter("useParallelism") @Nullable Boolean useParallelism) {
        this.database = database;
        this.useParallelism = useParallelism;
    }

    /**
     * @return Cloud Spanner database in the form `project/instance/database&#39;
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return If parallelism should be used when reading from Cloud Spanner
     * 
     */
    public Optional<Boolean> useParallelism() {
        return Optional.ofNullable(this.useParallelism);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionCloudSpanner defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private @Nullable Boolean useParallelism;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionCloudSpanner defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.useParallelism = defaults.useParallelism;
        }

        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder useParallelism(@Nullable Boolean useParallelism) {
            this.useParallelism = useParallelism;
            return this;
        }        public ConnectionCloudSpanner build() {
            return new ConnectionCloudSpanner(database, useParallelism);
        }
    }
}