// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.recaptcha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnterpriseKeyAndroidSettings {
    /**
     * @return If set to true, it means allowed_package_names will not be enforced.
     * 
     */
    private final @Nullable Boolean allowAllPackageNames;
    /**
     * @return Android package names of apps allowed to use the key. Example: &#39;com.companyname.appname&#39;
     * 
     */
    private final @Nullable List<String> allowedPackageNames;

    @CustomType.Constructor
    private EnterpriseKeyAndroidSettings(
        @CustomType.Parameter("allowAllPackageNames") @Nullable Boolean allowAllPackageNames,
        @CustomType.Parameter("allowedPackageNames") @Nullable List<String> allowedPackageNames) {
        this.allowAllPackageNames = allowAllPackageNames;
        this.allowedPackageNames = allowedPackageNames;
    }

    /**
     * @return If set to true, it means allowed_package_names will not be enforced.
     * 
     */
    public Optional<Boolean> allowAllPackageNames() {
        return Optional.ofNullable(this.allowAllPackageNames);
    }
    /**
     * @return Android package names of apps allowed to use the key. Example: &#39;com.companyname.appname&#39;
     * 
     */
    public List<String> allowedPackageNames() {
        return this.allowedPackageNames == null ? List.of() : this.allowedPackageNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKeyAndroidSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowAllPackageNames;
        private @Nullable List<String> allowedPackageNames;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKeyAndroidSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllPackageNames = defaults.allowAllPackageNames;
    	      this.allowedPackageNames = defaults.allowedPackageNames;
        }

        public Builder allowAllPackageNames(@Nullable Boolean allowAllPackageNames) {
            this.allowAllPackageNames = allowAllPackageNames;
            return this;
        }
        public Builder allowedPackageNames(@Nullable List<String> allowedPackageNames) {
            this.allowedPackageNames = allowedPackageNames;
            return this;
        }
        public Builder allowedPackageNames(String... allowedPackageNames) {
            return allowedPackageNames(List.of(allowedPackageNames));
        }        public EnterpriseKeyAndroidSettings build() {
            return new EnterpriseKeyAndroidSettings(allowAllPackageNames, allowedPackageNames);
        }
    }
}