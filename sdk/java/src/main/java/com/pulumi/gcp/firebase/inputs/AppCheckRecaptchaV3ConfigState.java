// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppCheckRecaptchaV3ConfigState extends com.pulumi.resources.ResourceArgs {

    public static final AppCheckRecaptchaV3ConfigState Empty = new AppCheckRecaptchaV3ConfigState();

    /**
     * The ID of an
     * [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id).
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return The ID of an
     * [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id).
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * The relative resource name of the reCAPTCHA V3 configuration object
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The relative resource name of the reCAPTCHA V3 configuration object
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

    /**
     * The site secret used to identify your service for reCAPTCHA v3 verification.
     * For security reasons, this field will never be populated in any response.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="siteSecret")
    private @Nullable Output<String> siteSecret;

    /**
     * @return The site secret used to identify your service for reCAPTCHA v3 verification.
     * For security reasons, this field will never be populated in any response.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<Output<String>> siteSecret() {
        return Optional.ofNullable(this.siteSecret);
    }

    /**
     * Whether the siteSecret was previously set. Since we will never return the siteSecret field, this field is the only way to find out whether it was previously set.
     * 
     */
    @Import(name="siteSecretSet")
    private @Nullable Output<Boolean> siteSecretSet;

    /**
     * @return Whether the siteSecret was previously set. Since we will never return the siteSecret field, this field is the only way to find out whether it was previously set.
     * 
     */
    public Optional<Output<Boolean>> siteSecretSet() {
        return Optional.ofNullable(this.siteSecretSet);
    }

    /**
     * Specifies the duration for which App Check tokens exchanged from reCAPTCHA V3 artifacts will be valid.
     * If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days, inclusive.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="tokenTtl")
    private @Nullable Output<String> tokenTtl;

    /**
     * @return Specifies the duration for which App Check tokens exchanged from reCAPTCHA V3 artifacts will be valid.
     * If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days, inclusive.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<Output<String>> tokenTtl() {
        return Optional.ofNullable(this.tokenTtl);
    }

    private AppCheckRecaptchaV3ConfigState() {}

    private AppCheckRecaptchaV3ConfigState(AppCheckRecaptchaV3ConfigState $) {
        this.appId = $.appId;
        this.name = $.name;
        this.project = $.project;
        this.siteSecret = $.siteSecret;
        this.siteSecretSet = $.siteSecretSet;
        this.tokenTtl = $.tokenTtl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppCheckRecaptchaV3ConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppCheckRecaptchaV3ConfigState $;

        public Builder() {
            $ = new AppCheckRecaptchaV3ConfigState();
        }

        public Builder(AppCheckRecaptchaV3ConfigState defaults) {
            $ = new AppCheckRecaptchaV3ConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The ID of an
         * [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id).
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The ID of an
         * [Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id).
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param name The relative resource name of the reCAPTCHA V3 configuration object
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The relative resource name of the reCAPTCHA V3 configuration object
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

        /**
         * @param siteSecret The site secret used to identify your service for reCAPTCHA v3 verification.
         * For security reasons, this field will never be populated in any response.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder siteSecret(@Nullable Output<String> siteSecret) {
            $.siteSecret = siteSecret;
            return this;
        }

        /**
         * @param siteSecret The site secret used to identify your service for reCAPTCHA v3 verification.
         * For security reasons, this field will never be populated in any response.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder siteSecret(String siteSecret) {
            return siteSecret(Output.of(siteSecret));
        }

        /**
         * @param siteSecretSet Whether the siteSecret was previously set. Since we will never return the siteSecret field, this field is the only way to find out whether it was previously set.
         * 
         * @return builder
         * 
         */
        public Builder siteSecretSet(@Nullable Output<Boolean> siteSecretSet) {
            $.siteSecretSet = siteSecretSet;
            return this;
        }

        /**
         * @param siteSecretSet Whether the siteSecret was previously set. Since we will never return the siteSecret field, this field is the only way to find out whether it was previously set.
         * 
         * @return builder
         * 
         */
        public Builder siteSecretSet(Boolean siteSecretSet) {
            return siteSecretSet(Output.of(siteSecretSet));
        }

        /**
         * @param tokenTtl Specifies the duration for which App Check tokens exchanged from reCAPTCHA V3 artifacts will be valid.
         * If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days, inclusive.
         * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder tokenTtl(@Nullable Output<String> tokenTtl) {
            $.tokenTtl = tokenTtl;
            return this;
        }

        /**
         * @param tokenTtl Specifies the duration for which App Check tokens exchanged from reCAPTCHA V3 artifacts will be valid.
         * If unset, a default value of 1 hour is assumed. Must be between 30 minutes and 7 days, inclusive.
         * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder tokenTtl(String tokenTtl) {
            return tokenTtl(Output.of(tokenTtl));
        }

        public AppCheckRecaptchaV3ConfigState build() {
            return $;
        }
    }

}
