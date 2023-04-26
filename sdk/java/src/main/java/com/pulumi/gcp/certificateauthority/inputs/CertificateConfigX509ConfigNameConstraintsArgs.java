// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateConfigX509ConfigNameConstraintsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateConfigX509ConfigNameConstraintsArgs Empty = new CertificateConfigX509ConfigNameConstraintsArgs();

    /**
     * Indicates whether or not the name constraints are marked critical.
     * 
     */
    @Import(name="critical", required=true)
    private Output<Boolean> critical;

    /**
     * @return Indicates whether or not the name constraints are marked critical.
     * 
     */
    public Output<Boolean> critical() {
        return this.critical;
    }

    /**
     * Contains excluded DNS names. Any DNS name that can be
     * constructed by simply adding zero or more labels to
     * the left-hand side of the name satisfies the name constraint.
     * For example, `example.com`, `www.example.com`, `www.sub.example.com`
     * would satisfy `example.com` while `example1.com` does not.
     * 
     */
    @Import(name="excludedDnsNames")
    private @Nullable Output<List<String>> excludedDnsNames;

    /**
     * @return Contains excluded DNS names. Any DNS name that can be
     * constructed by simply adding zero or more labels to
     * the left-hand side of the name satisfies the name constraint.
     * For example, `example.com`, `www.example.com`, `www.sub.example.com`
     * would satisfy `example.com` while `example1.com` does not.
     * 
     */
    public Optional<Output<List<String>>> excludedDnsNames() {
        return Optional.ofNullable(this.excludedDnsNames);
    }

    /**
     * Contains the excluded email addresses. The value can be a particular
     * email address, a hostname to indicate all email addresses on that host or
     * a domain with a leading period (e.g. `.example.com`) to indicate
     * all email addresses in that domain.
     * 
     */
    @Import(name="excludedEmailAddresses")
    private @Nullable Output<List<String>> excludedEmailAddresses;

    /**
     * @return Contains the excluded email addresses. The value can be a particular
     * email address, a hostname to indicate all email addresses on that host or
     * a domain with a leading period (e.g. `.example.com`) to indicate
     * all email addresses in that domain.
     * 
     */
    public Optional<Output<List<String>>> excludedEmailAddresses() {
        return Optional.ofNullable(this.excludedEmailAddresses);
    }

    /**
     * Contains the excluded IP ranges. For IPv4 addresses, the ranges
     * are expressed using CIDR notation as specified in RFC 4632.
     * For IPv6 addresses, the ranges are expressed in similar encoding as IPv4
     * addresses.
     * 
     */
    @Import(name="excludedIpRanges")
    private @Nullable Output<List<String>> excludedIpRanges;

    /**
     * @return Contains the excluded IP ranges. For IPv4 addresses, the ranges
     * are expressed using CIDR notation as specified in RFC 4632.
     * For IPv6 addresses, the ranges are expressed in similar encoding as IPv4
     * addresses.
     * 
     */
    public Optional<Output<List<String>>> excludedIpRanges() {
        return Optional.ofNullable(this.excludedIpRanges);
    }

    /**
     * Contains the excluded URIs that apply to the host part of the name.
     * The value can be a hostname or a domain with a
     * leading period (like `.example.com`)
     * 
     */
    @Import(name="excludedUris")
    private @Nullable Output<List<String>> excludedUris;

    /**
     * @return Contains the excluded URIs that apply to the host part of the name.
     * The value can be a hostname or a domain with a
     * leading period (like `.example.com`)
     * 
     */
    public Optional<Output<List<String>>> excludedUris() {
        return Optional.ofNullable(this.excludedUris);
    }

    /**
     * Contains permitted DNS names. Any DNS name that can be
     * constructed by simply adding zero or more labels to
     * the left-hand side of the name satisfies the name constraint.
     * For example, `example.com`, `www.example.com`, `www.sub.example.com`
     * would satisfy `example.com` while `example1.com` does not.
     * 
     */
    @Import(name="permittedDnsNames")
    private @Nullable Output<List<String>> permittedDnsNames;

    /**
     * @return Contains permitted DNS names. Any DNS name that can be
     * constructed by simply adding zero or more labels to
     * the left-hand side of the name satisfies the name constraint.
     * For example, `example.com`, `www.example.com`, `www.sub.example.com`
     * would satisfy `example.com` while `example1.com` does not.
     * 
     */
    public Optional<Output<List<String>>> permittedDnsNames() {
        return Optional.ofNullable(this.permittedDnsNames);
    }

    /**
     * Contains the permitted email addresses. The value can be a particular
     * email address, a hostname to indicate all email addresses on that host or
     * a domain with a leading period (e.g. `.example.com`) to indicate
     * all email addresses in that domain.
     * 
     */
    @Import(name="permittedEmailAddresses")
    private @Nullable Output<List<String>> permittedEmailAddresses;

    /**
     * @return Contains the permitted email addresses. The value can be a particular
     * email address, a hostname to indicate all email addresses on that host or
     * a domain with a leading period (e.g. `.example.com`) to indicate
     * all email addresses in that domain.
     * 
     */
    public Optional<Output<List<String>>> permittedEmailAddresses() {
        return Optional.ofNullable(this.permittedEmailAddresses);
    }

    /**
     * Contains the permitted IP ranges. For IPv4 addresses, the ranges
     * are expressed using CIDR notation as specified in RFC 4632.
     * For IPv6 addresses, the ranges are expressed in similar encoding as IPv4
     * addresses.
     * 
     */
    @Import(name="permittedIpRanges")
    private @Nullable Output<List<String>> permittedIpRanges;

    /**
     * @return Contains the permitted IP ranges. For IPv4 addresses, the ranges
     * are expressed using CIDR notation as specified in RFC 4632.
     * For IPv6 addresses, the ranges are expressed in similar encoding as IPv4
     * addresses.
     * 
     */
    public Optional<Output<List<String>>> permittedIpRanges() {
        return Optional.ofNullable(this.permittedIpRanges);
    }

    /**
     * Contains the permitted URIs that apply to the host part of the name.
     * The value can be a hostname or a domain with a
     * leading period (like `.example.com`)
     * 
     */
    @Import(name="permittedUris")
    private @Nullable Output<List<String>> permittedUris;

    /**
     * @return Contains the permitted URIs that apply to the host part of the name.
     * The value can be a hostname or a domain with a
     * leading period (like `.example.com`)
     * 
     */
    public Optional<Output<List<String>>> permittedUris() {
        return Optional.ofNullable(this.permittedUris);
    }

    private CertificateConfigX509ConfigNameConstraintsArgs() {}

    private CertificateConfigX509ConfigNameConstraintsArgs(CertificateConfigX509ConfigNameConstraintsArgs $) {
        this.critical = $.critical;
        this.excludedDnsNames = $.excludedDnsNames;
        this.excludedEmailAddresses = $.excludedEmailAddresses;
        this.excludedIpRanges = $.excludedIpRanges;
        this.excludedUris = $.excludedUris;
        this.permittedDnsNames = $.permittedDnsNames;
        this.permittedEmailAddresses = $.permittedEmailAddresses;
        this.permittedIpRanges = $.permittedIpRanges;
        this.permittedUris = $.permittedUris;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateConfigX509ConfigNameConstraintsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateConfigX509ConfigNameConstraintsArgs $;

        public Builder() {
            $ = new CertificateConfigX509ConfigNameConstraintsArgs();
        }

        public Builder(CertificateConfigX509ConfigNameConstraintsArgs defaults) {
            $ = new CertificateConfigX509ConfigNameConstraintsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param critical Indicates whether or not the name constraints are marked critical.
         * 
         * @return builder
         * 
         */
        public Builder critical(Output<Boolean> critical) {
            $.critical = critical;
            return this;
        }

        /**
         * @param critical Indicates whether or not the name constraints are marked critical.
         * 
         * @return builder
         * 
         */
        public Builder critical(Boolean critical) {
            return critical(Output.of(critical));
        }

        /**
         * @param excludedDnsNames Contains excluded DNS names. Any DNS name that can be
         * constructed by simply adding zero or more labels to
         * the left-hand side of the name satisfies the name constraint.
         * For example, `example.com`, `www.example.com`, `www.sub.example.com`
         * would satisfy `example.com` while `example1.com` does not.
         * 
         * @return builder
         * 
         */
        public Builder excludedDnsNames(@Nullable Output<List<String>> excludedDnsNames) {
            $.excludedDnsNames = excludedDnsNames;
            return this;
        }

        /**
         * @param excludedDnsNames Contains excluded DNS names. Any DNS name that can be
         * constructed by simply adding zero or more labels to
         * the left-hand side of the name satisfies the name constraint.
         * For example, `example.com`, `www.example.com`, `www.sub.example.com`
         * would satisfy `example.com` while `example1.com` does not.
         * 
         * @return builder
         * 
         */
        public Builder excludedDnsNames(List<String> excludedDnsNames) {
            return excludedDnsNames(Output.of(excludedDnsNames));
        }

        /**
         * @param excludedDnsNames Contains excluded DNS names. Any DNS name that can be
         * constructed by simply adding zero or more labels to
         * the left-hand side of the name satisfies the name constraint.
         * For example, `example.com`, `www.example.com`, `www.sub.example.com`
         * would satisfy `example.com` while `example1.com` does not.
         * 
         * @return builder
         * 
         */
        public Builder excludedDnsNames(String... excludedDnsNames) {
            return excludedDnsNames(List.of(excludedDnsNames));
        }

        /**
         * @param excludedEmailAddresses Contains the excluded email addresses. The value can be a particular
         * email address, a hostname to indicate all email addresses on that host or
         * a domain with a leading period (e.g. `.example.com`) to indicate
         * all email addresses in that domain.
         * 
         * @return builder
         * 
         */
        public Builder excludedEmailAddresses(@Nullable Output<List<String>> excludedEmailAddresses) {
            $.excludedEmailAddresses = excludedEmailAddresses;
            return this;
        }

        /**
         * @param excludedEmailAddresses Contains the excluded email addresses. The value can be a particular
         * email address, a hostname to indicate all email addresses on that host or
         * a domain with a leading period (e.g. `.example.com`) to indicate
         * all email addresses in that domain.
         * 
         * @return builder
         * 
         */
        public Builder excludedEmailAddresses(List<String> excludedEmailAddresses) {
            return excludedEmailAddresses(Output.of(excludedEmailAddresses));
        }

        /**
         * @param excludedEmailAddresses Contains the excluded email addresses. The value can be a particular
         * email address, a hostname to indicate all email addresses on that host or
         * a domain with a leading period (e.g. `.example.com`) to indicate
         * all email addresses in that domain.
         * 
         * @return builder
         * 
         */
        public Builder excludedEmailAddresses(String... excludedEmailAddresses) {
            return excludedEmailAddresses(List.of(excludedEmailAddresses));
        }

        /**
         * @param excludedIpRanges Contains the excluded IP ranges. For IPv4 addresses, the ranges
         * are expressed using CIDR notation as specified in RFC 4632.
         * For IPv6 addresses, the ranges are expressed in similar encoding as IPv4
         * addresses.
         * 
         * @return builder
         * 
         */
        public Builder excludedIpRanges(@Nullable Output<List<String>> excludedIpRanges) {
            $.excludedIpRanges = excludedIpRanges;
            return this;
        }

        /**
         * @param excludedIpRanges Contains the excluded IP ranges. For IPv4 addresses, the ranges
         * are expressed using CIDR notation as specified in RFC 4632.
         * For IPv6 addresses, the ranges are expressed in similar encoding as IPv4
         * addresses.
         * 
         * @return builder
         * 
         */
        public Builder excludedIpRanges(List<String> excludedIpRanges) {
            return excludedIpRanges(Output.of(excludedIpRanges));
        }

        /**
         * @param excludedIpRanges Contains the excluded IP ranges. For IPv4 addresses, the ranges
         * are expressed using CIDR notation as specified in RFC 4632.
         * For IPv6 addresses, the ranges are expressed in similar encoding as IPv4
         * addresses.
         * 
         * @return builder
         * 
         */
        public Builder excludedIpRanges(String... excludedIpRanges) {
            return excludedIpRanges(List.of(excludedIpRanges));
        }

        /**
         * @param excludedUris Contains the excluded URIs that apply to the host part of the name.
         * The value can be a hostname or a domain with a
         * leading period (like `.example.com`)
         * 
         * @return builder
         * 
         */
        public Builder excludedUris(@Nullable Output<List<String>> excludedUris) {
            $.excludedUris = excludedUris;
            return this;
        }

        /**
         * @param excludedUris Contains the excluded URIs that apply to the host part of the name.
         * The value can be a hostname or a domain with a
         * leading period (like `.example.com`)
         * 
         * @return builder
         * 
         */
        public Builder excludedUris(List<String> excludedUris) {
            return excludedUris(Output.of(excludedUris));
        }

        /**
         * @param excludedUris Contains the excluded URIs that apply to the host part of the name.
         * The value can be a hostname or a domain with a
         * leading period (like `.example.com`)
         * 
         * @return builder
         * 
         */
        public Builder excludedUris(String... excludedUris) {
            return excludedUris(List.of(excludedUris));
        }

        /**
         * @param permittedDnsNames Contains permitted DNS names. Any DNS name that can be
         * constructed by simply adding zero or more labels to
         * the left-hand side of the name satisfies the name constraint.
         * For example, `example.com`, `www.example.com`, `www.sub.example.com`
         * would satisfy `example.com` while `example1.com` does not.
         * 
         * @return builder
         * 
         */
        public Builder permittedDnsNames(@Nullable Output<List<String>> permittedDnsNames) {
            $.permittedDnsNames = permittedDnsNames;
            return this;
        }

        /**
         * @param permittedDnsNames Contains permitted DNS names. Any DNS name that can be
         * constructed by simply adding zero or more labels to
         * the left-hand side of the name satisfies the name constraint.
         * For example, `example.com`, `www.example.com`, `www.sub.example.com`
         * would satisfy `example.com` while `example1.com` does not.
         * 
         * @return builder
         * 
         */
        public Builder permittedDnsNames(List<String> permittedDnsNames) {
            return permittedDnsNames(Output.of(permittedDnsNames));
        }

        /**
         * @param permittedDnsNames Contains permitted DNS names. Any DNS name that can be
         * constructed by simply adding zero or more labels to
         * the left-hand side of the name satisfies the name constraint.
         * For example, `example.com`, `www.example.com`, `www.sub.example.com`
         * would satisfy `example.com` while `example1.com` does not.
         * 
         * @return builder
         * 
         */
        public Builder permittedDnsNames(String... permittedDnsNames) {
            return permittedDnsNames(List.of(permittedDnsNames));
        }

        /**
         * @param permittedEmailAddresses Contains the permitted email addresses. The value can be a particular
         * email address, a hostname to indicate all email addresses on that host or
         * a domain with a leading period (e.g. `.example.com`) to indicate
         * all email addresses in that domain.
         * 
         * @return builder
         * 
         */
        public Builder permittedEmailAddresses(@Nullable Output<List<String>> permittedEmailAddresses) {
            $.permittedEmailAddresses = permittedEmailAddresses;
            return this;
        }

        /**
         * @param permittedEmailAddresses Contains the permitted email addresses. The value can be a particular
         * email address, a hostname to indicate all email addresses on that host or
         * a domain with a leading period (e.g. `.example.com`) to indicate
         * all email addresses in that domain.
         * 
         * @return builder
         * 
         */
        public Builder permittedEmailAddresses(List<String> permittedEmailAddresses) {
            return permittedEmailAddresses(Output.of(permittedEmailAddresses));
        }

        /**
         * @param permittedEmailAddresses Contains the permitted email addresses. The value can be a particular
         * email address, a hostname to indicate all email addresses on that host or
         * a domain with a leading period (e.g. `.example.com`) to indicate
         * all email addresses in that domain.
         * 
         * @return builder
         * 
         */
        public Builder permittedEmailAddresses(String... permittedEmailAddresses) {
            return permittedEmailAddresses(List.of(permittedEmailAddresses));
        }

        /**
         * @param permittedIpRanges Contains the permitted IP ranges. For IPv4 addresses, the ranges
         * are expressed using CIDR notation as specified in RFC 4632.
         * For IPv6 addresses, the ranges are expressed in similar encoding as IPv4
         * addresses.
         * 
         * @return builder
         * 
         */
        public Builder permittedIpRanges(@Nullable Output<List<String>> permittedIpRanges) {
            $.permittedIpRanges = permittedIpRanges;
            return this;
        }

        /**
         * @param permittedIpRanges Contains the permitted IP ranges. For IPv4 addresses, the ranges
         * are expressed using CIDR notation as specified in RFC 4632.
         * For IPv6 addresses, the ranges are expressed in similar encoding as IPv4
         * addresses.
         * 
         * @return builder
         * 
         */
        public Builder permittedIpRanges(List<String> permittedIpRanges) {
            return permittedIpRanges(Output.of(permittedIpRanges));
        }

        /**
         * @param permittedIpRanges Contains the permitted IP ranges. For IPv4 addresses, the ranges
         * are expressed using CIDR notation as specified in RFC 4632.
         * For IPv6 addresses, the ranges are expressed in similar encoding as IPv4
         * addresses.
         * 
         * @return builder
         * 
         */
        public Builder permittedIpRanges(String... permittedIpRanges) {
            return permittedIpRanges(List.of(permittedIpRanges));
        }

        /**
         * @param permittedUris Contains the permitted URIs that apply to the host part of the name.
         * The value can be a hostname or a domain with a
         * leading period (like `.example.com`)
         * 
         * @return builder
         * 
         */
        public Builder permittedUris(@Nullable Output<List<String>> permittedUris) {
            $.permittedUris = permittedUris;
            return this;
        }

        /**
         * @param permittedUris Contains the permitted URIs that apply to the host part of the name.
         * The value can be a hostname or a domain with a
         * leading period (like `.example.com`)
         * 
         * @return builder
         * 
         */
        public Builder permittedUris(List<String> permittedUris) {
            return permittedUris(Output.of(permittedUris));
        }

        /**
         * @param permittedUris Contains the permitted URIs that apply to the host part of the name.
         * The value can be a hostname or a domain with a
         * leading period (like `.example.com`)
         * 
         * @return builder
         * 
         */
        public Builder permittedUris(String... permittedUris) {
            return permittedUris(List.of(permittedUris));
        }

        public CertificateConfigX509ConfigNameConstraintsArgs build() {
            $.critical = Objects.requireNonNull($.critical, "expected parameter 'critical' to be non-null");
            return $;
        }
    }

}