// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.firebase.outputs.HostingCustomDomainRequiredDnsUpdateDesiredRecord;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HostingCustomDomainRequiredDnsUpdateDesired {
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
    private @Nullable List<HostingCustomDomainRequiredDnsUpdateDesiredRecord> records;

    private HostingCustomDomainRequiredDnsUpdateDesired() {}
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
    public List<HostingCustomDomainRequiredDnsUpdateDesiredRecord> records() {
        return this.records == null ? List.of() : this.records;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostingCustomDomainRequiredDnsUpdateDesired defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String domainName;
        private @Nullable List<HostingCustomDomainRequiredDnsUpdateDesiredRecord> records;
        public Builder() {}
        public Builder(HostingCustomDomainRequiredDnsUpdateDesired defaults) {
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
        public Builder records(@Nullable List<HostingCustomDomainRequiredDnsUpdateDesiredRecord> records) {
            this.records = records;
            return this;
        }
        public Builder records(HostingCustomDomainRequiredDnsUpdateDesiredRecord... records) {
            return records(List.of(records));
        }
        public HostingCustomDomainRequiredDnsUpdateDesired build() {
            final var o = new HostingCustomDomainRequiredDnsUpdateDesired();
            o.domainName = domainName;
            o.records = records;
            return o;
        }
    }
}