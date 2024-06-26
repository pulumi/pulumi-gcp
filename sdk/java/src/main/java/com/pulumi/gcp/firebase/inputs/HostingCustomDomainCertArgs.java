// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.firebase.inputs.HostingCustomDomainCertVerificationArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostingCustomDomainCertArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostingCustomDomainCertArgs Empty = new HostingCustomDomainCertArgs();

    /**
     * The state of the certificate. Only the `CERT_ACTIVE` and
     * `CERT_EXPIRING_SOON` states provide SSL coverage for a domain name. If the
     * state is `PROPAGATING` and Hosting had an active cert for the domain name
     * before, that formerly-active cert provides SSL coverage for the domain name
     * until the current cert propagates.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the certificate. Only the `CERT_ACTIVE` and
     * `CERT_EXPIRING_SOON` states provide SSL coverage for a domain name. If the
     * state is `PROPAGATING` and Hosting had an active cert for the domain name
     * before, that formerly-active cert provides SSL coverage for the domain name
     * until the current cert propagates.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The record&#39;s type, which determines what data the record contains.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The record&#39;s type, which determines what data the record contains.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * A set of ACME challenges you can add to your DNS records or existing,
     * non-Hosting hosting provider to allow Hosting to create an SSL certificate
     * for your domain name before you point traffic toward hosting. You can use
     * thse challenges as part of a zero downtime transition from your old
     * provider to Hosting.
     * Structure is documented below.
     * 
     */
    @Import(name="verification")
    private @Nullable Output<HostingCustomDomainCertVerificationArgs> verification;

    /**
     * @return A set of ACME challenges you can add to your DNS records or existing,
     * non-Hosting hosting provider to allow Hosting to create an SSL certificate
     * for your domain name before you point traffic toward hosting. You can use
     * thse challenges as part of a zero downtime transition from your old
     * provider to Hosting.
     * Structure is documented below.
     * 
     */
    public Optional<Output<HostingCustomDomainCertVerificationArgs>> verification() {
        return Optional.ofNullable(this.verification);
    }

    private HostingCustomDomainCertArgs() {}

    private HostingCustomDomainCertArgs(HostingCustomDomainCertArgs $) {
        this.state = $.state;
        this.type = $.type;
        this.verification = $.verification;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostingCustomDomainCertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostingCustomDomainCertArgs $;

        public Builder() {
            $ = new HostingCustomDomainCertArgs();
        }

        public Builder(HostingCustomDomainCertArgs defaults) {
            $ = new HostingCustomDomainCertArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param state The state of the certificate. Only the `CERT_ACTIVE` and
         * `CERT_EXPIRING_SOON` states provide SSL coverage for a domain name. If the
         * state is `PROPAGATING` and Hosting had an active cert for the domain name
         * before, that formerly-active cert provides SSL coverage for the domain name
         * until the current cert propagates.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the certificate. Only the `CERT_ACTIVE` and
         * `CERT_EXPIRING_SOON` states provide SSL coverage for a domain name. If the
         * state is `PROPAGATING` and Hosting had an active cert for the domain name
         * before, that formerly-active cert provides SSL coverage for the domain name
         * until the current cert propagates.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param type The record&#39;s type, which determines what data the record contains.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The record&#39;s type, which determines what data the record contains.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param verification A set of ACME challenges you can add to your DNS records or existing,
         * non-Hosting hosting provider to allow Hosting to create an SSL certificate
         * for your domain name before you point traffic toward hosting. You can use
         * thse challenges as part of a zero downtime transition from your old
         * provider to Hosting.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder verification(@Nullable Output<HostingCustomDomainCertVerificationArgs> verification) {
            $.verification = verification;
            return this;
        }

        /**
         * @param verification A set of ACME challenges you can add to your DNS records or existing,
         * non-Hosting hosting provider to allow Hosting to create an SSL certificate
         * for your domain name before you point traffic toward hosting. You can use
         * thse challenges as part of a zero downtime transition from your old
         * provider to Hosting.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder verification(HostingCustomDomainCertVerificationArgs verification) {
            return verification(Output.of(verification));
        }

        public HostingCustomDomainCertArgs build() {
            return $;
        }
    }

}
