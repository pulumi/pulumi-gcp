// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.firebase.outputs.HostingCustomDomainCertVerificationDnsDiscoveredRecord;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HostingCustomDomainCertVerificationDnsDiscovered {
    /**
     * @return The domain name the record pertains to, e.g. `foo.bar.com.`.
     * 
     */
    private @Nullable String domainName;
    /**
     * @return Records on the domain
     * Structure is documented below.
     * 
     */
    private @Nullable List<HostingCustomDomainCertVerificationDnsDiscoveredRecord> records;

    private HostingCustomDomainCertVerificationDnsDiscovered() {}
    /**
     * @return The domain name the record pertains to, e.g. `foo.bar.com.`.
     * 
     */
    public Optional<String> domainName() {
        return Optional.ofNullable(this.domainName);
    }
    /**
     * @return Records on the domain
     * Structure is documented below.
     * 
     */
    public List<HostingCustomDomainCertVerificationDnsDiscoveredRecord> records() {
        return this.records == null ? List.of() : this.records;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostingCustomDomainCertVerificationDnsDiscovered defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String domainName;
        private @Nullable List<HostingCustomDomainCertVerificationDnsDiscoveredRecord> records;
        public Builder() {}
        public Builder(HostingCustomDomainCertVerificationDnsDiscovered defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.records = defaults.records;
        }

        @CustomType.Setter
        public Builder domainName(@Nullable String domainName) {
            this.domainName = domainName;
            return this;
        }
        @CustomType.Setter
        public Builder records(@Nullable List<HostingCustomDomainCertVerificationDnsDiscoveredRecord> records) {
            this.records = records;
            return this;
        }
        public Builder records(HostingCustomDomainCertVerificationDnsDiscoveredRecord... records) {
            return records(List.of(records));
        }
        public HostingCustomDomainCertVerificationDnsDiscovered build() {
            final var o = new HostingCustomDomainCertVerificationDnsDiscovered();
            o.domainName = domainName;
            o.records = records;
            return o;
        }
    }
}