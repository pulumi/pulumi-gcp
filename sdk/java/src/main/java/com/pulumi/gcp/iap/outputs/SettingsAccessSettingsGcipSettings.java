// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingsAccessSettingsGcipSettings {
    /**
     * @return Login page URI associated with the GCIP tenants. Typically, all resources within
     * the same project share the same login page, though it could be overridden at the
     * sub resource level.
     * 
     */
    private @Nullable String loginPageUri;
    /**
     * @return GCIP tenant ids that are linked to the IAP resource. tenantIds could be a string
     * beginning with a number character to indicate authenticating with GCIP tenant flow,
     * or in the format of _ to indicate authenticating with GCIP agent flow. If agent flow
     * is used, tenantIds should only contain one single element, while for tenant flow,
     * tenantIds can contain multiple elements.
     * 
     */
    private @Nullable List<String> tenantIds;

    private SettingsAccessSettingsGcipSettings() {}
    /**
     * @return Login page URI associated with the GCIP tenants. Typically, all resources within
     * the same project share the same login page, though it could be overridden at the
     * sub resource level.
     * 
     */
    public Optional<String> loginPageUri() {
        return Optional.ofNullable(this.loginPageUri);
    }
    /**
     * @return GCIP tenant ids that are linked to the IAP resource. tenantIds could be a string
     * beginning with a number character to indicate authenticating with GCIP tenant flow,
     * or in the format of _ to indicate authenticating with GCIP agent flow. If agent flow
     * is used, tenantIds should only contain one single element, while for tenant flow,
     * tenantIds can contain multiple elements.
     * 
     */
    public List<String> tenantIds() {
        return this.tenantIds == null ? List.of() : this.tenantIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingsAccessSettingsGcipSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String loginPageUri;
        private @Nullable List<String> tenantIds;
        public Builder() {}
        public Builder(SettingsAccessSettingsGcipSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loginPageUri = defaults.loginPageUri;
    	      this.tenantIds = defaults.tenantIds;
        }

        @CustomType.Setter
        public Builder loginPageUri(@Nullable String loginPageUri) {

            this.loginPageUri = loginPageUri;
            return this;
        }
        @CustomType.Setter
        public Builder tenantIds(@Nullable List<String> tenantIds) {

            this.tenantIds = tenantIds;
            return this;
        }
        public Builder tenantIds(String... tenantIds) {
            return tenantIds(List.of(tenantIds));
        }
        public SettingsAccessSettingsGcipSettings build() {
            final var _resultValue = new SettingsAccessSettingsGcipSettings();
            _resultValue.loginPageUri = loginPageUri;
            _resultValue.tenantIds = tenantIds;
            return _resultValue;
        }
    }
}
