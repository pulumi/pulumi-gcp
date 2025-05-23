// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.inputs.RegionPerInstanceConfigPreservedStateInternalIpIpAddressArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionPerInstanceConfigPreservedStateInternalIpArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionPerInstanceConfigPreservedStateInternalIpArgs Empty = new RegionPerInstanceConfigPreservedStateInternalIpArgs();

    /**
     * These stateful IPs will never be released during autohealing, update or VM instance recreate operations. This flag is used to configure if the IP reservation should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted.
     * Default value is `NEVER`.
     * Possible values are: `NEVER`, `ON_PERMANENT_INSTANCE_DELETION`.
     * 
     */
    @Import(name="autoDelete")
    private @Nullable Output<String> autoDelete;

    /**
     * @return These stateful IPs will never be released during autohealing, update or VM instance recreate operations. This flag is used to configure if the IP reservation should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted.
     * Default value is `NEVER`.
     * Possible values are: `NEVER`, `ON_PERMANENT_INSTANCE_DELETION`.
     * 
     */
    public Optional<Output<String>> autoDelete() {
        return Optional.ofNullable(this.autoDelete);
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Import(name="interfaceName", required=true)
    private Output<String> interfaceName;

    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public Output<String> interfaceName() {
        return this.interfaceName;
    }

    /**
     * Ip address representation
     * Structure is documented below.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<RegionPerInstanceConfigPreservedStateInternalIpIpAddressArgs> ipAddress;

    /**
     * @return Ip address representation
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionPerInstanceConfigPreservedStateInternalIpIpAddressArgs>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    private RegionPerInstanceConfigPreservedStateInternalIpArgs() {}

    private RegionPerInstanceConfigPreservedStateInternalIpArgs(RegionPerInstanceConfigPreservedStateInternalIpArgs $) {
        this.autoDelete = $.autoDelete;
        this.interfaceName = $.interfaceName;
        this.ipAddress = $.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionPerInstanceConfigPreservedStateInternalIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionPerInstanceConfigPreservedStateInternalIpArgs $;

        public Builder() {
            $ = new RegionPerInstanceConfigPreservedStateInternalIpArgs();
        }

        public Builder(RegionPerInstanceConfigPreservedStateInternalIpArgs defaults) {
            $ = new RegionPerInstanceConfigPreservedStateInternalIpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoDelete These stateful IPs will never be released during autohealing, update or VM instance recreate operations. This flag is used to configure if the IP reservation should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted.
         * Default value is `NEVER`.
         * Possible values are: `NEVER`, `ON_PERMANENT_INSTANCE_DELETION`.
         * 
         * @return builder
         * 
         */
        public Builder autoDelete(@Nullable Output<String> autoDelete) {
            $.autoDelete = autoDelete;
            return this;
        }

        /**
         * @param autoDelete These stateful IPs will never be released during autohealing, update or VM instance recreate operations. This flag is used to configure if the IP reservation should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted.
         * Default value is `NEVER`.
         * Possible values are: `NEVER`, `ON_PERMANENT_INSTANCE_DELETION`.
         * 
         * @return builder
         * 
         */
        public Builder autoDelete(String autoDelete) {
            return autoDelete(Output.of(autoDelete));
        }

        /**
         * @param interfaceName The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder interfaceName(Output<String> interfaceName) {
            $.interfaceName = interfaceName;
            return this;
        }

        /**
         * @param interfaceName The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder interfaceName(String interfaceName) {
            return interfaceName(Output.of(interfaceName));
        }

        /**
         * @param ipAddress Ip address representation
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<RegionPerInstanceConfigPreservedStateInternalIpIpAddressArgs> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress Ip address representation
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(RegionPerInstanceConfigPreservedStateInternalIpIpAddressArgs ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public RegionPerInstanceConfigPreservedStateInternalIpArgs build() {
            if ($.interfaceName == null) {
                throw new MissingRequiredPropertyException("RegionPerInstanceConfigPreservedStateInternalIpArgs", "interfaceName");
            }
            return $;
        }
    }

}
