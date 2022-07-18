// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastore.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataStoreIndexProperty {
    /**
     * @return The direction the index should optimize for sorting.
     * Possible values are `ASCENDING` and `DESCENDING`.
     * 
     */
    private final String direction;
    /**
     * @return The property name to index.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private DataStoreIndexProperty(
        @CustomType.Parameter("direction") String direction,
        @CustomType.Parameter("name") String name) {
        this.direction = direction;
        this.name = name;
    }

    /**
     * @return The direction the index should optimize for sorting.
     * Possible values are `ASCENDING` and `DESCENDING`.
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return The property name to index.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataStoreIndexProperty defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String direction;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataStoreIndexProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.name = defaults.name;
        }

        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public DataStoreIndexProperty build() {
            return new DataStoreIndexProperty(direction, name);
        }
    }
}