// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainMappingSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainMappingSpecArgs Empty = new DomainMappingSpecArgs();

    /**
     * The mode of the certificate.
     * Default value is `AUTOMATIC`.
     * Possible values are: `NONE`, `AUTOMATIC`.
     * 
     */
    @Import(name="certificateMode")
    private @Nullable Output<String> certificateMode;

    /**
     * @return The mode of the certificate.
     * Default value is `AUTOMATIC`.
     * Possible values are: `NONE`, `AUTOMATIC`.
     * 
     */
    public Optional<Output<String>> certificateMode() {
        return Optional.ofNullable(this.certificateMode);
    }

    /**
     * If set, the mapping will override any mapping set before this spec was set.
     * It is recommended that the user leaves this empty to receive an error
     * warning about a potential conflict and only set it once the respective UI
     * has given such a warning.
     * 
     */
    @Import(name="forceOverride")
    private @Nullable Output<Boolean> forceOverride;

    /**
     * @return If set, the mapping will override any mapping set before this spec was set.
     * It is recommended that the user leaves this empty to receive an error
     * warning about a potential conflict and only set it once the respective UI
     * has given such a warning.
     * 
     */
    public Optional<Output<Boolean>> forceOverride() {
        return Optional.ofNullable(this.forceOverride);
    }

    /**
     * The name of the Cloud Run Service that this DomainMapping applies to.
     * The route must exist.
     * 
     */
    @Import(name="routeName", required=true)
    private Output<String> routeName;

    /**
     * @return The name of the Cloud Run Service that this DomainMapping applies to.
     * The route must exist.
     * 
     */
    public Output<String> routeName() {
        return this.routeName;
    }

    private DomainMappingSpecArgs() {}

    private DomainMappingSpecArgs(DomainMappingSpecArgs $) {
        this.certificateMode = $.certificateMode;
        this.forceOverride = $.forceOverride;
        this.routeName = $.routeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainMappingSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainMappingSpecArgs $;

        public Builder() {
            $ = new DomainMappingSpecArgs();
        }

        public Builder(DomainMappingSpecArgs defaults) {
            $ = new DomainMappingSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateMode The mode of the certificate.
         * Default value is `AUTOMATIC`.
         * Possible values are: `NONE`, `AUTOMATIC`.
         * 
         * @return builder
         * 
         */
        public Builder certificateMode(@Nullable Output<String> certificateMode) {
            $.certificateMode = certificateMode;
            return this;
        }

        /**
         * @param certificateMode The mode of the certificate.
         * Default value is `AUTOMATIC`.
         * Possible values are: `NONE`, `AUTOMATIC`.
         * 
         * @return builder
         * 
         */
        public Builder certificateMode(String certificateMode) {
            return certificateMode(Output.of(certificateMode));
        }

        /**
         * @param forceOverride If set, the mapping will override any mapping set before this spec was set.
         * It is recommended that the user leaves this empty to receive an error
         * warning about a potential conflict and only set it once the respective UI
         * has given such a warning.
         * 
         * @return builder
         * 
         */
        public Builder forceOverride(@Nullable Output<Boolean> forceOverride) {
            $.forceOverride = forceOverride;
            return this;
        }

        /**
         * @param forceOverride If set, the mapping will override any mapping set before this spec was set.
         * It is recommended that the user leaves this empty to receive an error
         * warning about a potential conflict and only set it once the respective UI
         * has given such a warning.
         * 
         * @return builder
         * 
         */
        public Builder forceOverride(Boolean forceOverride) {
            return forceOverride(Output.of(forceOverride));
        }

        /**
         * @param routeName The name of the Cloud Run Service that this DomainMapping applies to.
         * The route must exist.
         * 
         * @return builder
         * 
         */
        public Builder routeName(Output<String> routeName) {
            $.routeName = routeName;
            return this;
        }

        /**
         * @param routeName The name of the Cloud Run Service that this DomainMapping applies to.
         * The route must exist.
         * 
         * @return builder
         * 
         */
        public Builder routeName(String routeName) {
            return routeName(Output.of(routeName));
        }

        public DomainMappingSpecArgs build() {
            if ($.routeName == null) {
                throw new MissingRequiredPropertyException("DomainMappingSpecArgs", "routeName");
            }
            return $;
        }
    }

}
