// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PublicAdvertisedPrefixArgs extends com.pulumi.resources.ResourceArgs {

    public static final PublicAdvertisedPrefixArgs Empty = new PublicAdvertisedPrefixArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The IPv4 address to be used for reverse DNS verification.
     * 
     */
    @Import(name="dnsVerificationIp", required=true)
    private Output<String> dnsVerificationIp;

    /**
     * @return The IPv4 address to be used for reverse DNS verification.
     * 
     */
    public Output<String> dnsVerificationIp() {
        return this.dnsVerificationIp;
    }

    /**
     * The IPv4 address range, in CIDR format, represented by this public advertised prefix.
     * 
     */
    @Import(name="ipCidrRange", required=true)
    private Output<String> ipCidrRange;

    /**
     * @return The IPv4 address range, in CIDR format, represented by this public advertised prefix.
     * 
     */
    public Output<String> ipCidrRange() {
        return this.ipCidrRange;
    }

    /**
     * Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private PublicAdvertisedPrefixArgs() {}

    private PublicAdvertisedPrefixArgs(PublicAdvertisedPrefixArgs $) {
        this.description = $.description;
        this.dnsVerificationIp = $.dnsVerificationIp;
        this.ipCidrRange = $.ipCidrRange;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublicAdvertisedPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicAdvertisedPrefixArgs $;

        public Builder() {
            $ = new PublicAdvertisedPrefixArgs();
        }

        public Builder(PublicAdvertisedPrefixArgs defaults) {
            $ = new PublicAdvertisedPrefixArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param dnsVerificationIp The IPv4 address to be used for reverse DNS verification.
         * 
         * @return builder
         * 
         */
        public Builder dnsVerificationIp(Output<String> dnsVerificationIp) {
            $.dnsVerificationIp = dnsVerificationIp;
            return this;
        }

        /**
         * @param dnsVerificationIp The IPv4 address to be used for reverse DNS verification.
         * 
         * @return builder
         * 
         */
        public Builder dnsVerificationIp(String dnsVerificationIp) {
            return dnsVerificationIp(Output.of(dnsVerificationIp));
        }

        /**
         * @param ipCidrRange The IPv4 address range, in CIDR format, represented by this public advertised prefix.
         * 
         * @return builder
         * 
         */
        public Builder ipCidrRange(Output<String> ipCidrRange) {
            $.ipCidrRange = ipCidrRange;
            return this;
        }

        /**
         * @param ipCidrRange The IPv4 address range, in CIDR format, represented by this public advertised prefix.
         * 
         * @return builder
         * 
         */
        public Builder ipCidrRange(String ipCidrRange) {
            return ipCidrRange(Output.of(ipCidrRange));
        }

        /**
         * @param name Name of the resource. The name must be 1-63 characters long, and
         * comply with RFC1035. Specifically, the name must be 1-63 characters
         * long and match the regular expression `a-z?`
         * which means the first character must be a lowercase letter, and all
         * following characters must be a dash, lowercase letter, or digit,
         * except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. The name must be 1-63 characters long, and
         * comply with RFC1035. Specifically, the name must be 1-63 characters
         * long and match the regular expression `a-z?`
         * which means the first character must be a lowercase letter, and all
         * following characters must be a dash, lowercase letter, or digit,
         * except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public PublicAdvertisedPrefixArgs build() {
            $.dnsVerificationIp = Objects.requireNonNull($.dnsVerificationIp, "expected parameter 'dnsVerificationIp' to be non-null");
            $.ipCidrRange = Objects.requireNonNull($.ipCidrRange, "expected parameter 'ipCidrRange' to be non-null");
            return $;
        }
    }

}