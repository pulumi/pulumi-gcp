// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsAccessDeniedPageSettingsArgs;
import com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsAttributePropagationSettingsArgs;
import com.pulumi.gcp.iap.inputs.SettingsApplicationSettingsCsmSettingsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingsApplicationSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingsApplicationSettingsArgs Empty = new SettingsApplicationSettingsArgs();

    /**
     * Customization for Access Denied page. IAP allows customers to define a custom URI
     * to use as the error page when access is denied to users. If IAP prevents access
     * to this page, the default IAP error page will be displayed instead.
     * Structure is documented below.
     * 
     */
    @Import(name="accessDeniedPageSettings")
    private @Nullable Output<SettingsApplicationSettingsAccessDeniedPageSettingsArgs> accessDeniedPageSettings;

    /**
     * @return Customization for Access Denied page. IAP allows customers to define a custom URI
     * to use as the error page when access is denied to users. If IAP prevents access
     * to this page, the default IAP error page will be displayed instead.
     * Structure is documented below.
     * 
     */
    public Optional<Output<SettingsApplicationSettingsAccessDeniedPageSettingsArgs>> accessDeniedPageSettings() {
        return Optional.ofNullable(this.accessDeniedPageSettings);
    }

    /**
     * Settings to configure attribute propagation.
     * Structure is documented below.
     * 
     */
    @Import(name="attributePropagationSettings")
    private @Nullable Output<SettingsApplicationSettingsAttributePropagationSettingsArgs> attributePropagationSettings;

    /**
     * @return Settings to configure attribute propagation.
     * Structure is documented below.
     * 
     */
    public Optional<Output<SettingsApplicationSettingsAttributePropagationSettingsArgs>> attributePropagationSettings() {
        return Optional.ofNullable(this.attributePropagationSettings);
    }

    /**
     * The Domain value to set for cookies generated by IAP. This value is not validated by the API,
     * but will be ignored at runtime if invalid.
     * 
     */
    @Import(name="cookieDomain")
    private @Nullable Output<String> cookieDomain;

    /**
     * @return The Domain value to set for cookies generated by IAP. This value is not validated by the API,
     * but will be ignored at runtime if invalid.
     * 
     */
    public Optional<Output<String>> cookieDomain() {
        return Optional.ofNullable(this.cookieDomain);
    }

    /**
     * Settings to configure IAP&#39;s behavior for a service mesh.
     * Structure is documented below.
     * 
     */
    @Import(name="csmSettings")
    private @Nullable Output<SettingsApplicationSettingsCsmSettingsArgs> csmSettings;

    /**
     * @return Settings to configure IAP&#39;s behavior for a service mesh.
     * Structure is documented below.
     * 
     */
    public Optional<Output<SettingsApplicationSettingsCsmSettingsArgs>> csmSettings() {
        return Optional.ofNullable(this.csmSettings);
    }

    private SettingsApplicationSettingsArgs() {}

    private SettingsApplicationSettingsArgs(SettingsApplicationSettingsArgs $) {
        this.accessDeniedPageSettings = $.accessDeniedPageSettings;
        this.attributePropagationSettings = $.attributePropagationSettings;
        this.cookieDomain = $.cookieDomain;
        this.csmSettings = $.csmSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingsApplicationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingsApplicationSettingsArgs $;

        public Builder() {
            $ = new SettingsApplicationSettingsArgs();
        }

        public Builder(SettingsApplicationSettingsArgs defaults) {
            $ = new SettingsApplicationSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessDeniedPageSettings Customization for Access Denied page. IAP allows customers to define a custom URI
         * to use as the error page when access is denied to users. If IAP prevents access
         * to this page, the default IAP error page will be displayed instead.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder accessDeniedPageSettings(@Nullable Output<SettingsApplicationSettingsAccessDeniedPageSettingsArgs> accessDeniedPageSettings) {
            $.accessDeniedPageSettings = accessDeniedPageSettings;
            return this;
        }

        /**
         * @param accessDeniedPageSettings Customization for Access Denied page. IAP allows customers to define a custom URI
         * to use as the error page when access is denied to users. If IAP prevents access
         * to this page, the default IAP error page will be displayed instead.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder accessDeniedPageSettings(SettingsApplicationSettingsAccessDeniedPageSettingsArgs accessDeniedPageSettings) {
            return accessDeniedPageSettings(Output.of(accessDeniedPageSettings));
        }

        /**
         * @param attributePropagationSettings Settings to configure attribute propagation.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder attributePropagationSettings(@Nullable Output<SettingsApplicationSettingsAttributePropagationSettingsArgs> attributePropagationSettings) {
            $.attributePropagationSettings = attributePropagationSettings;
            return this;
        }

        /**
         * @param attributePropagationSettings Settings to configure attribute propagation.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder attributePropagationSettings(SettingsApplicationSettingsAttributePropagationSettingsArgs attributePropagationSettings) {
            return attributePropagationSettings(Output.of(attributePropagationSettings));
        }

        /**
         * @param cookieDomain The Domain value to set for cookies generated by IAP. This value is not validated by the API,
         * but will be ignored at runtime if invalid.
         * 
         * @return builder
         * 
         */
        public Builder cookieDomain(@Nullable Output<String> cookieDomain) {
            $.cookieDomain = cookieDomain;
            return this;
        }

        /**
         * @param cookieDomain The Domain value to set for cookies generated by IAP. This value is not validated by the API,
         * but will be ignored at runtime if invalid.
         * 
         * @return builder
         * 
         */
        public Builder cookieDomain(String cookieDomain) {
            return cookieDomain(Output.of(cookieDomain));
        }

        /**
         * @param csmSettings Settings to configure IAP&#39;s behavior for a service mesh.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder csmSettings(@Nullable Output<SettingsApplicationSettingsCsmSettingsArgs> csmSettings) {
            $.csmSettings = csmSettings;
            return this;
        }

        /**
         * @param csmSettings Settings to configure IAP&#39;s behavior for a service mesh.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder csmSettings(SettingsApplicationSettingsCsmSettingsArgs csmSettings) {
            return csmSettings(Output.of(csmSettings));
        }

        public SettingsApplicationSettingsArgs build() {
            return $;
        }
    }

}
