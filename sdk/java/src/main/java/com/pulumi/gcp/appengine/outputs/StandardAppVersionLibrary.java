// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StandardAppVersionLibrary {
    /**
     * @return Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Version of the library to select, or &#34;latest&#34;.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private StandardAppVersionLibrary(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("version") @Nullable String version) {
        this.name = name;
        this.version = version;
    }

    /**
     * @return Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Version of the library to select, or &#34;latest&#34;.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardAppVersionLibrary defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionLibrary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public StandardAppVersionLibrary build() {
            return new StandardAppVersionLibrary(name, version);
        }
    }
}