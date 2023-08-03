// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vmwareengine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateCloudVcenter {
    /**
     * @return Fully qualified domain name of the appliance.
     * 
     */
    private @Nullable String fqdn;
    /**
     * @return Internal IP address of the appliance.
     * 
     */
    private @Nullable String internalIp;
    /**
     * @return State of the appliance.
     * Possible values are: `ACTIVE`, `CREATING`.
     * 
     */
    private @Nullable String state;
    /**
     * @return Version of the appliance.
     * 
     */
    private @Nullable String version;

    private PrivateCloudVcenter() {}
    /**
     * @return Fully qualified domain name of the appliance.
     * 
     */
    public Optional<String> fqdn() {
        return Optional.ofNullable(this.fqdn);
    }
    /**
     * @return Internal IP address of the appliance.
     * 
     */
    public Optional<String> internalIp() {
        return Optional.ofNullable(this.internalIp);
    }
    /**
     * @return State of the appliance.
     * Possible values are: `ACTIVE`, `CREATING`.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return Version of the appliance.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateCloudVcenter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fqdn;
        private @Nullable String internalIp;
        private @Nullable String state;
        private @Nullable String version;
        public Builder() {}
        public Builder(PrivateCloudVcenter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdn = defaults.fqdn;
    	      this.internalIp = defaults.internalIp;
    	      this.state = defaults.state;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder fqdn(@Nullable String fqdn) {
            this.fqdn = fqdn;
            return this;
        }
        @CustomType.Setter
        public Builder internalIp(@Nullable String internalIp) {
            this.internalIp = internalIp;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public PrivateCloudVcenter build() {
            final var o = new PrivateCloudVcenter();
            o.fqdn = fqdn;
            o.internalIp = internalIp;
            o.state = state;
            o.version = version;
            return o;
        }
    }
}