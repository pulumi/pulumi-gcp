// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GcpUserAccessBindingScopedAccessSettingActiveSettingsSessionSettings {
    /**
     * @return Optional. How long a user is allowed to take between actions before a new access token must be issued. Only set for Google Cloud apps.
     * 
     */
    private @Nullable String maxInactivity;
    /**
     * @return Optional. The session length. Setting this field to zero is equal to disabling session. Also can set infinite session by flipping the enabled bit to false below. If useOidcMaxAge is true, for OIDC apps, the session length will be the minimum of this field and OIDC max_age param.
     * 
     */
    private @Nullable String sessionLength;
    /**
     * @return Optional. This field enables or disables Google Cloud session length. When false, all fields set above will be disregarded and the session length is basically infinite.
     * 
     */
    private @Nullable Boolean sessionLengthEnabled;
    /**
     * @return Optional. The session challenges proposed to users when the Google Cloud session length is up.
     * Possible values are: `LOGIN`, `SECURITY_KEY`, `PASSWORD`.
     * 
     */
    private @Nullable String sessionReauthMethod;
    /**
     * @return Optional. Only useful for OIDC apps. When false, the OIDC max_age param, if passed in the authentication request will be ignored. When true, the re-auth period will be the minimum of the sessionLength field and the max_age OIDC param.
     * 
     */
    private @Nullable Boolean useOidcMaxAge;

    private GcpUserAccessBindingScopedAccessSettingActiveSettingsSessionSettings() {}
    /**
     * @return Optional. How long a user is allowed to take between actions before a new access token must be issued. Only set for Google Cloud apps.
     * 
     */
    public Optional<String> maxInactivity() {
        return Optional.ofNullable(this.maxInactivity);
    }
    /**
     * @return Optional. The session length. Setting this field to zero is equal to disabling session. Also can set infinite session by flipping the enabled bit to false below. If useOidcMaxAge is true, for OIDC apps, the session length will be the minimum of this field and OIDC max_age param.
     * 
     */
    public Optional<String> sessionLength() {
        return Optional.ofNullable(this.sessionLength);
    }
    /**
     * @return Optional. This field enables or disables Google Cloud session length. When false, all fields set above will be disregarded and the session length is basically infinite.
     * 
     */
    public Optional<Boolean> sessionLengthEnabled() {
        return Optional.ofNullable(this.sessionLengthEnabled);
    }
    /**
     * @return Optional. The session challenges proposed to users when the Google Cloud session length is up.
     * Possible values are: `LOGIN`, `SECURITY_KEY`, `PASSWORD`.
     * 
     */
    public Optional<String> sessionReauthMethod() {
        return Optional.ofNullable(this.sessionReauthMethod);
    }
    /**
     * @return Optional. Only useful for OIDC apps. When false, the OIDC max_age param, if passed in the authentication request will be ignored. When true, the re-auth period will be the minimum of the sessionLength field and the max_age OIDC param.
     * 
     */
    public Optional<Boolean> useOidcMaxAge() {
        return Optional.ofNullable(this.useOidcMaxAge);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcpUserAccessBindingScopedAccessSettingActiveSettingsSessionSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String maxInactivity;
        private @Nullable String sessionLength;
        private @Nullable Boolean sessionLengthEnabled;
        private @Nullable String sessionReauthMethod;
        private @Nullable Boolean useOidcMaxAge;
        public Builder() {}
        public Builder(GcpUserAccessBindingScopedAccessSettingActiveSettingsSessionSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInactivity = defaults.maxInactivity;
    	      this.sessionLength = defaults.sessionLength;
    	      this.sessionLengthEnabled = defaults.sessionLengthEnabled;
    	      this.sessionReauthMethod = defaults.sessionReauthMethod;
    	      this.useOidcMaxAge = defaults.useOidcMaxAge;
        }

        @CustomType.Setter
        public Builder maxInactivity(@Nullable String maxInactivity) {

            this.maxInactivity = maxInactivity;
            return this;
        }
        @CustomType.Setter
        public Builder sessionLength(@Nullable String sessionLength) {

            this.sessionLength = sessionLength;
            return this;
        }
        @CustomType.Setter
        public Builder sessionLengthEnabled(@Nullable Boolean sessionLengthEnabled) {

            this.sessionLengthEnabled = sessionLengthEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder sessionReauthMethod(@Nullable String sessionReauthMethod) {

            this.sessionReauthMethod = sessionReauthMethod;
            return this;
        }
        @CustomType.Setter
        public Builder useOidcMaxAge(@Nullable Boolean useOidcMaxAge) {

            this.useOidcMaxAge = useOidcMaxAge;
            return this;
        }
        public GcpUserAccessBindingScopedAccessSettingActiveSettingsSessionSettings build() {
            final var _resultValue = new GcpUserAccessBindingScopedAccessSettingActiveSettingsSessionSettings();
            _resultValue.maxInactivity = maxInactivity;
            _resultValue.sessionLength = sessionLength;
            _resultValue.sessionLengthEnabled = sessionLengthEnabled;
            _resultValue.sessionReauthMethod = sessionReauthMethod;
            _resultValue.useOidcMaxAge = useOidcMaxAge;
            return _resultValue;
        }
    }
}
