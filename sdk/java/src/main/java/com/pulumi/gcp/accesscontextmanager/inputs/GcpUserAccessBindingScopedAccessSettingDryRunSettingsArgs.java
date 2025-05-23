// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GcpUserAccessBindingScopedAccessSettingDryRunSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GcpUserAccessBindingScopedAccessSettingDryRunSettingsArgs Empty = new GcpUserAccessBindingScopedAccessSettingDryRunSettingsArgs();

    /**
     * Optional. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: &#34;accessPolicies/9522/accessLevels/device_trusted&#34;
     * 
     */
    @Import(name="accessLevels")
    private @Nullable Output<String> accessLevels;

    /**
     * @return Optional. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: &#34;accessPolicies/9522/accessLevels/device_trusted&#34;
     * 
     */
    public Optional<Output<String>> accessLevels() {
        return Optional.ofNullable(this.accessLevels);
    }

    private GcpUserAccessBindingScopedAccessSettingDryRunSettingsArgs() {}

    private GcpUserAccessBindingScopedAccessSettingDryRunSettingsArgs(GcpUserAccessBindingScopedAccessSettingDryRunSettingsArgs $) {
        this.accessLevels = $.accessLevels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcpUserAccessBindingScopedAccessSettingDryRunSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcpUserAccessBindingScopedAccessSettingDryRunSettingsArgs $;

        public Builder() {
            $ = new GcpUserAccessBindingScopedAccessSettingDryRunSettingsArgs();
        }

        public Builder(GcpUserAccessBindingScopedAccessSettingDryRunSettingsArgs defaults) {
            $ = new GcpUserAccessBindingScopedAccessSettingDryRunSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessLevels Optional. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: &#34;accessPolicies/9522/accessLevels/device_trusted&#34;
         * 
         * @return builder
         * 
         */
        public Builder accessLevels(@Nullable Output<String> accessLevels) {
            $.accessLevels = accessLevels;
            return this;
        }

        /**
         * @param accessLevels Optional. Access level that a user must have to be granted access. Only one access level is supported, not multiple. This repeated field must have exactly one element. Example: &#34;accessPolicies/9522/accessLevels/device_trusted&#34;
         * 
         * @return builder
         * 
         */
        public Builder accessLevels(String accessLevels) {
            return accessLevels(Output.of(accessLevels));
        }

        public GcpUserAccessBindingScopedAccessSettingDryRunSettingsArgs build() {
            return $;
        }
    }

}
