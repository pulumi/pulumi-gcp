// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostingCustomDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostingCustomDomainArgs Empty = new HostingCustomDomainArgs();

    /**
     * A field that lets you specify which SSL certificate type Hosting creates
     * for your domain name. Spark plan `CustomDomain`s only have access to the
     * `GROUPED` cert type, while Blaze plan can select any option.
     * Possible values are: `GROUPED`, `PROJECT_GROUPED`, `DEDICATED`.
     * 
     */
    @Import(name="certPreference")
    private @Nullable Output<String> certPreference;

    /**
     * @return A field that lets you specify which SSL certificate type Hosting creates
     * for your domain name. Spark plan `CustomDomain`s only have access to the
     * `GROUPED` cert type, while Blaze plan can select any option.
     * Possible values are: `GROUPED`, `PROJECT_GROUPED`, `DEDICATED`.
     * 
     */
    public Optional<Output<String>> certPreference() {
        return Optional.ofNullable(this.certPreference);
    }

    /**
     * The ID of the `CustomDomain`, which is the domain name you&#39;d like to use with Firebase Hosting.
     * 
     */
    @Import(name="customDomain", required=true)
    private Output<String> customDomain;

    /**
     * @return The ID of the `CustomDomain`, which is the domain name you&#39;d like to use with Firebase Hosting.
     * 
     */
    public Output<String> customDomain() {
        return this.customDomain;
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

    /**
     * A domain name that this CustomDomain should direct traffic towards. If
     * specified, Hosting will respond to requests against this CustomDomain
     * with an HTTP 301 code, and route traffic to the specified `redirect_target`
     * instead.
     * 
     */
    @Import(name="redirectTarget")
    private @Nullable Output<String> redirectTarget;

    /**
     * @return A domain name that this CustomDomain should direct traffic towards. If
     * specified, Hosting will respond to requests against this CustomDomain
     * with an HTTP 301 code, and route traffic to the specified `redirect_target`
     * instead.
     * 
     */
    public Optional<Output<String>> redirectTarget() {
        return Optional.ofNullable(this.redirectTarget);
    }

    /**
     * The ID of the site in which to create this custom domain association.
     * 
     */
    @Import(name="siteId", required=true)
    private Output<String> siteId;

    /**
     * @return The ID of the site in which to create this custom domain association.
     * 
     */
    public Output<String> siteId() {
        return this.siteId;
    }

    @Import(name="waitDnsVerification")
    private @Nullable Output<Boolean> waitDnsVerification;

    public Optional<Output<Boolean>> waitDnsVerification() {
        return Optional.ofNullable(this.waitDnsVerification);
    }

    private HostingCustomDomainArgs() {}

    private HostingCustomDomainArgs(HostingCustomDomainArgs $) {
        this.certPreference = $.certPreference;
        this.customDomain = $.customDomain;
        this.project = $.project;
        this.redirectTarget = $.redirectTarget;
        this.siteId = $.siteId;
        this.waitDnsVerification = $.waitDnsVerification;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostingCustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostingCustomDomainArgs $;

        public Builder() {
            $ = new HostingCustomDomainArgs();
        }

        public Builder(HostingCustomDomainArgs defaults) {
            $ = new HostingCustomDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certPreference A field that lets you specify which SSL certificate type Hosting creates
         * for your domain name. Spark plan `CustomDomain`s only have access to the
         * `GROUPED` cert type, while Blaze plan can select any option.
         * Possible values are: `GROUPED`, `PROJECT_GROUPED`, `DEDICATED`.
         * 
         * @return builder
         * 
         */
        public Builder certPreference(@Nullable Output<String> certPreference) {
            $.certPreference = certPreference;
            return this;
        }

        /**
         * @param certPreference A field that lets you specify which SSL certificate type Hosting creates
         * for your domain name. Spark plan `CustomDomain`s only have access to the
         * `GROUPED` cert type, while Blaze plan can select any option.
         * Possible values are: `GROUPED`, `PROJECT_GROUPED`, `DEDICATED`.
         * 
         * @return builder
         * 
         */
        public Builder certPreference(String certPreference) {
            return certPreference(Output.of(certPreference));
        }

        /**
         * @param customDomain The ID of the `CustomDomain`, which is the domain name you&#39;d like to use with Firebase Hosting.
         * 
         * @return builder
         * 
         */
        public Builder customDomain(Output<String> customDomain) {
            $.customDomain = customDomain;
            return this;
        }

        /**
         * @param customDomain The ID of the `CustomDomain`, which is the domain name you&#39;d like to use with Firebase Hosting.
         * 
         * @return builder
         * 
         */
        public Builder customDomain(String customDomain) {
            return customDomain(Output.of(customDomain));
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

        /**
         * @param redirectTarget A domain name that this CustomDomain should direct traffic towards. If
         * specified, Hosting will respond to requests against this CustomDomain
         * with an HTTP 301 code, and route traffic to the specified `redirect_target`
         * instead.
         * 
         * @return builder
         * 
         */
        public Builder redirectTarget(@Nullable Output<String> redirectTarget) {
            $.redirectTarget = redirectTarget;
            return this;
        }

        /**
         * @param redirectTarget A domain name that this CustomDomain should direct traffic towards. If
         * specified, Hosting will respond to requests against this CustomDomain
         * with an HTTP 301 code, and route traffic to the specified `redirect_target`
         * instead.
         * 
         * @return builder
         * 
         */
        public Builder redirectTarget(String redirectTarget) {
            return redirectTarget(Output.of(redirectTarget));
        }

        /**
         * @param siteId The ID of the site in which to create this custom domain association.
         * 
         * @return builder
         * 
         */
        public Builder siteId(Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        /**
         * @param siteId The ID of the site in which to create this custom domain association.
         * 
         * @return builder
         * 
         */
        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        public Builder waitDnsVerification(@Nullable Output<Boolean> waitDnsVerification) {
            $.waitDnsVerification = waitDnsVerification;
            return this;
        }

        public Builder waitDnsVerification(Boolean waitDnsVerification) {
            return waitDnsVerification(Output.of(waitDnsVerification));
        }

        public HostingCustomDomainArgs build() {
            if ($.customDomain == null) {
                throw new MissingRequiredPropertyException("HostingCustomDomainArgs", "customDomain");
            }
            if ($.siteId == null) {
                throw new MissingRequiredPropertyException("HostingCustomDomainArgs", "siteId");
            }
            return $;
        }
    }

}
