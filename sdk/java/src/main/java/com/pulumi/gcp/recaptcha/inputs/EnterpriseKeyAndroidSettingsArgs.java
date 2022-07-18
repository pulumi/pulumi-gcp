// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.recaptcha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnterpriseKeyAndroidSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnterpriseKeyAndroidSettingsArgs Empty = new EnterpriseKeyAndroidSettingsArgs();

    /**
     * If set to true, it means allowed_package_names will not be enforced.
     * 
     */
    @Import(name="allowAllPackageNames")
    private @Nullable Output<Boolean> allowAllPackageNames;

    /**
     * @return If set to true, it means allowed_package_names will not be enforced.
     * 
     */
    public Optional<Output<Boolean>> allowAllPackageNames() {
        return Optional.ofNullable(this.allowAllPackageNames);
    }

    /**
     * Android package names of apps allowed to use the key. Example: &#39;com.companyname.appname&#39;
     * 
     */
    @Import(name="allowedPackageNames")
    private @Nullable Output<List<String>> allowedPackageNames;

    /**
     * @return Android package names of apps allowed to use the key. Example: &#39;com.companyname.appname&#39;
     * 
     */
    public Optional<Output<List<String>>> allowedPackageNames() {
        return Optional.ofNullable(this.allowedPackageNames);
    }

    private EnterpriseKeyAndroidSettingsArgs() {}

    private EnterpriseKeyAndroidSettingsArgs(EnterpriseKeyAndroidSettingsArgs $) {
        this.allowAllPackageNames = $.allowAllPackageNames;
        this.allowedPackageNames = $.allowedPackageNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnterpriseKeyAndroidSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnterpriseKeyAndroidSettingsArgs $;

        public Builder() {
            $ = new EnterpriseKeyAndroidSettingsArgs();
        }

        public Builder(EnterpriseKeyAndroidSettingsArgs defaults) {
            $ = new EnterpriseKeyAndroidSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowAllPackageNames If set to true, it means allowed_package_names will not be enforced.
         * 
         * @return builder
         * 
         */
        public Builder allowAllPackageNames(@Nullable Output<Boolean> allowAllPackageNames) {
            $.allowAllPackageNames = allowAllPackageNames;
            return this;
        }

        /**
         * @param allowAllPackageNames If set to true, it means allowed_package_names will not be enforced.
         * 
         * @return builder
         * 
         */
        public Builder allowAllPackageNames(Boolean allowAllPackageNames) {
            return allowAllPackageNames(Output.of(allowAllPackageNames));
        }

        /**
         * @param allowedPackageNames Android package names of apps allowed to use the key. Example: &#39;com.companyname.appname&#39;
         * 
         * @return builder
         * 
         */
        public Builder allowedPackageNames(@Nullable Output<List<String>> allowedPackageNames) {
            $.allowedPackageNames = allowedPackageNames;
            return this;
        }

        /**
         * @param allowedPackageNames Android package names of apps allowed to use the key. Example: &#39;com.companyname.appname&#39;
         * 
         * @return builder
         * 
         */
        public Builder allowedPackageNames(List<String> allowedPackageNames) {
            return allowedPackageNames(Output.of(allowedPackageNames));
        }

        /**
         * @param allowedPackageNames Android package names of apps allowed to use the key. Example: &#39;com.companyname.appname&#39;
         * 
         * @return builder
         * 
         */
        public Builder allowedPackageNames(String... allowedPackageNames) {
            return allowedPackageNames(List.of(allowedPackageNames));
        }

        public EnterpriseKeyAndroidSettingsArgs build() {
            return $;
        }
    }

}