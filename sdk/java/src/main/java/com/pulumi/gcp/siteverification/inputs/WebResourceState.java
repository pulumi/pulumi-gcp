// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.siteverification.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.siteverification.inputs.WebResourceSiteArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebResourceState extends com.pulumi.resources.ResourceArgs {

    public static final WebResourceState Empty = new WebResourceState();

    /**
     * The email addresses of all direct, verified owners of this exact property. Indirect owners —
     * for example verified owners of the containing domain—are not included in this list.
     * 
     */
    @Import(name="owners")
    private @Nullable Output<List<String>> owners;

    /**
     * @return The email addresses of all direct, verified owners of this exact property. Indirect owners —
     * for example verified owners of the containing domain—are not included in this list.
     * 
     */
    public Optional<Output<List<String>>> owners() {
        return Optional.ofNullable(this.owners);
    }

    /**
     * Container for the address and type of a site for which a verification token will be verified.
     * Structure is documented below.
     * 
     */
    @Import(name="site")
    private @Nullable Output<WebResourceSiteArgs> site;

    /**
     * @return Container for the address and type of a site for which a verification token will be verified.
     * Structure is documented below.
     * 
     */
    public Optional<Output<WebResourceSiteArgs>> site() {
        return Optional.ofNullable(this.site);
    }

    /**
     * The verification method for the Site Verification system to use to verify
     * this site or domain.
     * Possible values are: `ANALYTICS`, `DNS_CNAME`, `DNS_TXT`, `FILE`, `META`, `TAG_MANAGER`.
     * 
     */
    @Import(name="verificationMethod")
    private @Nullable Output<String> verificationMethod;

    /**
     * @return The verification method for the Site Verification system to use to verify
     * this site or domain.
     * Possible values are: `ANALYTICS`, `DNS_CNAME`, `DNS_TXT`, `FILE`, `META`, `TAG_MANAGER`.
     * 
     */
    public Optional<Output<String>> verificationMethod() {
        return Optional.ofNullable(this.verificationMethod);
    }

    /**
     * The string used to identify this web resource.
     * 
     */
    @Import(name="webResourceId")
    private @Nullable Output<String> webResourceId;

    /**
     * @return The string used to identify this web resource.
     * 
     */
    public Optional<Output<String>> webResourceId() {
        return Optional.ofNullable(this.webResourceId);
    }

    private WebResourceState() {}

    private WebResourceState(WebResourceState $) {
        this.owners = $.owners;
        this.site = $.site;
        this.verificationMethod = $.verificationMethod;
        this.webResourceId = $.webResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebResourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebResourceState $;

        public Builder() {
            $ = new WebResourceState();
        }

        public Builder(WebResourceState defaults) {
            $ = new WebResourceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param owners The email addresses of all direct, verified owners of this exact property. Indirect owners —
         * for example verified owners of the containing domain—are not included in this list.
         * 
         * @return builder
         * 
         */
        public Builder owners(@Nullable Output<List<String>> owners) {
            $.owners = owners;
            return this;
        }

        /**
         * @param owners The email addresses of all direct, verified owners of this exact property. Indirect owners —
         * for example verified owners of the containing domain—are not included in this list.
         * 
         * @return builder
         * 
         */
        public Builder owners(List<String> owners) {
            return owners(Output.of(owners));
        }

        /**
         * @param owners The email addresses of all direct, verified owners of this exact property. Indirect owners —
         * for example verified owners of the containing domain—are not included in this list.
         * 
         * @return builder
         * 
         */
        public Builder owners(String... owners) {
            return owners(List.of(owners));
        }

        /**
         * @param site Container for the address and type of a site for which a verification token will be verified.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder site(@Nullable Output<WebResourceSiteArgs> site) {
            $.site = site;
            return this;
        }

        /**
         * @param site Container for the address and type of a site for which a verification token will be verified.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder site(WebResourceSiteArgs site) {
            return site(Output.of(site));
        }

        /**
         * @param verificationMethod The verification method for the Site Verification system to use to verify
         * this site or domain.
         * Possible values are: `ANALYTICS`, `DNS_CNAME`, `DNS_TXT`, `FILE`, `META`, `TAG_MANAGER`.
         * 
         * @return builder
         * 
         */
        public Builder verificationMethod(@Nullable Output<String> verificationMethod) {
            $.verificationMethod = verificationMethod;
            return this;
        }

        /**
         * @param verificationMethod The verification method for the Site Verification system to use to verify
         * this site or domain.
         * Possible values are: `ANALYTICS`, `DNS_CNAME`, `DNS_TXT`, `FILE`, `META`, `TAG_MANAGER`.
         * 
         * @return builder
         * 
         */
        public Builder verificationMethod(String verificationMethod) {
            return verificationMethod(Output.of(verificationMethod));
        }

        /**
         * @param webResourceId The string used to identify this web resource.
         * 
         * @return builder
         * 
         */
        public Builder webResourceId(@Nullable Output<String> webResourceId) {
            $.webResourceId = webResourceId;
            return this;
        }

        /**
         * @param webResourceId The string used to identify this web resource.
         * 
         * @return builder
         * 
         */
        public Builder webResourceId(String webResourceId) {
            return webResourceId(Output.of(webResourceId));
        }

        public WebResourceState build() {
            return $;
        }
    }

}
