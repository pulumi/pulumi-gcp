// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.firebase.outputs.HostingCustomDomainRequiredDnsUpdateDesired;
import com.pulumi.gcp.firebase.outputs.HostingCustomDomainRequiredDnsUpdateDiscovered;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HostingCustomDomainRequiredDnsUpdate {
    /**
     * @return (Output)
     * The last time Hosting checked your CustomDomain&#39;s DNS records.
     * 
     */
    private @Nullable String checkTime;
    /**
     * @return A text string to serve at the path.
     * 
     */
    private @Nullable List<HostingCustomDomainRequiredDnsUpdateDesired> desireds;
    /**
     * @return Whether Hosting was able to find the required file contents on the
     * specified path during its last check.
     * 
     */
    private @Nullable List<HostingCustomDomainRequiredDnsUpdateDiscovered> discovereds;

    private HostingCustomDomainRequiredDnsUpdate() {}
    /**
     * @return (Output)
     * The last time Hosting checked your CustomDomain&#39;s DNS records.
     * 
     */
    public Optional<String> checkTime() {
        return Optional.ofNullable(this.checkTime);
    }
    /**
     * @return A text string to serve at the path.
     * 
     */
    public List<HostingCustomDomainRequiredDnsUpdateDesired> desireds() {
        return this.desireds == null ? List.of() : this.desireds;
    }
    /**
     * @return Whether Hosting was able to find the required file contents on the
     * specified path during its last check.
     * 
     */
    public List<HostingCustomDomainRequiredDnsUpdateDiscovered> discovereds() {
        return this.discovereds == null ? List.of() : this.discovereds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostingCustomDomainRequiredDnsUpdate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String checkTime;
        private @Nullable List<HostingCustomDomainRequiredDnsUpdateDesired> desireds;
        private @Nullable List<HostingCustomDomainRequiredDnsUpdateDiscovered> discovereds;
        public Builder() {}
        public Builder(HostingCustomDomainRequiredDnsUpdate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkTime = defaults.checkTime;
    	      this.desireds = defaults.desireds;
    	      this.discovereds = defaults.discovereds;
        }

        @CustomType.Setter
        public Builder checkTime(@Nullable String checkTime) {
            this.checkTime = checkTime;
            return this;
        }
        @CustomType.Setter
        public Builder desireds(@Nullable List<HostingCustomDomainRequiredDnsUpdateDesired> desireds) {
            this.desireds = desireds;
            return this;
        }
        public Builder desireds(HostingCustomDomainRequiredDnsUpdateDesired... desireds) {
            return desireds(List.of(desireds));
        }
        @CustomType.Setter
        public Builder discovereds(@Nullable List<HostingCustomDomainRequiredDnsUpdateDiscovered> discovereds) {
            this.discovereds = discovereds;
            return this;
        }
        public Builder discovereds(HostingCustomDomainRequiredDnsUpdateDiscovered... discovereds) {
            return discovereds(List.of(discovereds));
        }
        public HostingCustomDomainRequiredDnsUpdate build() {
            final var o = new HostingCustomDomainRequiredDnsUpdate();
            o.checkTime = checkTime;
            o.desireds = desireds;
            o.discovereds = discovereds;
            return o;
        }
    }
}