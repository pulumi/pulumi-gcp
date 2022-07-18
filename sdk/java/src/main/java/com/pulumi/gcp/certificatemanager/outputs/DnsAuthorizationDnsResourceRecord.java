// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificatemanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DnsAuthorizationDnsResourceRecord {
    private final @Nullable String data;
    /**
     * @return Name of the resource; provided by the client when the resource is created.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    private final @Nullable String name;
    private final @Nullable String type;

    @CustomType.Constructor
    private DnsAuthorizationDnsResourceRecord(
        @CustomType.Parameter("data") @Nullable String data,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("type") @Nullable String type) {
        this.data = data;
        this.name = name;
        this.type = type;
    }

    public Optional<String> data() {
        return Optional.ofNullable(this.data);
    }
    /**
     * @return Name of the resource; provided by the client when the resource is created.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsAuthorizationDnsResourceRecord defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String data;
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsAuthorizationDnsResourceRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder data(@Nullable String data) {
            this.data = data;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public DnsAuthorizationDnsResourceRecord build() {
            return new DnsAuthorizationDnsResourceRecord(data, name, type);
        }
    }
}