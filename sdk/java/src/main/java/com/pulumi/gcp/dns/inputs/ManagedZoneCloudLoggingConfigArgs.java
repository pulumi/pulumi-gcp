// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ManagedZoneCloudLoggingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedZoneCloudLoggingConfigArgs Empty = new ManagedZoneCloudLoggingConfigArgs();

    /**
     * If set, enable query logging for this ManagedZone. False by default, making logging opt-in.
     * 
     */
    @Import(name="enableLogging", required=true)
    private Output<Boolean> enableLogging;

    /**
     * @return If set, enable query logging for this ManagedZone. False by default, making logging opt-in.
     * 
     */
    public Output<Boolean> enableLogging() {
        return this.enableLogging;
    }

    private ManagedZoneCloudLoggingConfigArgs() {}

    private ManagedZoneCloudLoggingConfigArgs(ManagedZoneCloudLoggingConfigArgs $) {
        this.enableLogging = $.enableLogging;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZoneCloudLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZoneCloudLoggingConfigArgs $;

        public Builder() {
            $ = new ManagedZoneCloudLoggingConfigArgs();
        }

        public Builder(ManagedZoneCloudLoggingConfigArgs defaults) {
            $ = new ManagedZoneCloudLoggingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableLogging If set, enable query logging for this ManagedZone. False by default, making logging opt-in.
         * 
         * @return builder
         * 
         */
        public Builder enableLogging(Output<Boolean> enableLogging) {
            $.enableLogging = enableLogging;
            return this;
        }

        /**
         * @param enableLogging If set, enable query logging for this ManagedZone. False by default, making logging opt-in.
         * 
         * @return builder
         * 
         */
        public Builder enableLogging(Boolean enableLogging) {
            return enableLogging(Output.of(enableLogging));
        }

        public ManagedZoneCloudLoggingConfigArgs build() {
            $.enableLogging = Objects.requireNonNull($.enableLogging, "expected parameter 'enableLogging' to be non-null");
            return $;
        }
    }

}