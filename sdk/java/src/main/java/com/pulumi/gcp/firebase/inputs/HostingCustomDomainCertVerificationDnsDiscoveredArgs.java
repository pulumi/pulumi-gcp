// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationDnsDiscoveredRecordArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostingCustomDomainCertVerificationDnsDiscoveredArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostingCustomDomainCertVerificationDnsDiscoveredArgs Empty = new HostingCustomDomainCertVerificationDnsDiscoveredArgs();

    /**
     * The domain name the record pertains to, e.g. `foo.bar.com.`.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return The domain name the record pertains to, e.g. `foo.bar.com.`.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * Records on the domain
     * Structure is documented below.
     * 
     */
    @Import(name="records")
    private @Nullable Output<List<HostingCustomDomainCertVerificationDnsDiscoveredRecordArgs>> records;

    /**
     * @return Records on the domain
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<HostingCustomDomainCertVerificationDnsDiscoveredRecordArgs>>> records() {
        return Optional.ofNullable(this.records);
    }

    private HostingCustomDomainCertVerificationDnsDiscoveredArgs() {}

    private HostingCustomDomainCertVerificationDnsDiscoveredArgs(HostingCustomDomainCertVerificationDnsDiscoveredArgs $) {
        this.domainName = $.domainName;
        this.records = $.records;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostingCustomDomainCertVerificationDnsDiscoveredArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostingCustomDomainCertVerificationDnsDiscoveredArgs $;

        public Builder() {
            $ = new HostingCustomDomainCertVerificationDnsDiscoveredArgs();
        }

        public Builder(HostingCustomDomainCertVerificationDnsDiscoveredArgs defaults) {
            $ = new HostingCustomDomainCertVerificationDnsDiscoveredArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName The domain name the record pertains to, e.g. `foo.bar.com.`.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The domain name the record pertains to, e.g. `foo.bar.com.`.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param records Records on the domain
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder records(@Nullable Output<List<HostingCustomDomainCertVerificationDnsDiscoveredRecordArgs>> records) {
            $.records = records;
            return this;
        }

        /**
         * @param records Records on the domain
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder records(List<HostingCustomDomainCertVerificationDnsDiscoveredRecordArgs> records) {
            return records(Output.of(records));
        }

        /**
         * @param records Records on the domain
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder records(HostingCustomDomainCertVerificationDnsDiscoveredRecordArgs... records) {
            return records(List.of(records));
        }

        public HostingCustomDomainCertVerificationDnsDiscoveredArgs build() {
            return $;
        }
    }

}