// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.iot.inputs.DeviceCredentialArgs;
import com.pulumi.gcp.iot.inputs.DeviceGatewayConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceArgs Empty = new DeviceArgs();

    /**
     * If a device is blocked, connections or requests from this device will fail.
     * 
     */
    @Import(name="blocked")
    private @Nullable Output<Boolean> blocked;

    /**
     * @return If a device is blocked, connections or requests from this device will fail.
     * 
     */
    public Optional<Output<Boolean>> blocked() {
        return Optional.ofNullable(this.blocked);
    }

    /**
     * The credentials used to authenticate this device.
     * Structure is documented below.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<List<DeviceCredentialArgs>> credentials;

    /**
     * @return The credentials used to authenticate this device.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<DeviceCredentialArgs>>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * Gateway-related configuration and state.
     * Structure is documented below.
     * 
     */
    @Import(name="gatewayConfig")
    private @Nullable Output<DeviceGatewayConfigArgs> gatewayConfig;

    /**
     * @return Gateway-related configuration and state.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DeviceGatewayConfigArgs>> gatewayConfig() {
        return Optional.ofNullable(this.gatewayConfig);
    }

    /**
     * The logging verbosity for device activity.
     * Possible values are: `NONE`, `ERROR`, `INFO`, `DEBUG`.
     * 
     */
    @Import(name="logLevel")
    private @Nullable Output<String> logLevel;

    /**
     * @return The logging verbosity for device activity.
     * Possible values are: `NONE`, `ERROR`, `INFO`, `DEBUG`.
     * 
     */
    public Optional<Output<String>> logLevel() {
        return Optional.ofNullable(this.logLevel);
    }

    /**
     * The metadata key-value pairs assigned to the device.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return The metadata key-value pairs assigned to the device.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * A unique name for the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique name for the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the device registry where this device should be created.
     * 
     * ***
     * 
     */
    @Import(name="registry", required=true)
    private Output<String> registry;

    /**
     * @return The name of the device registry where this device should be created.
     * 
     * ***
     * 
     */
    public Output<String> registry() {
        return this.registry;
    }

    private DeviceArgs() {}

    private DeviceArgs(DeviceArgs $) {
        this.blocked = $.blocked;
        this.credentials = $.credentials;
        this.gatewayConfig = $.gatewayConfig;
        this.logLevel = $.logLevel;
        this.metadata = $.metadata;
        this.name = $.name;
        this.registry = $.registry;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceArgs $;

        public Builder() {
            $ = new DeviceArgs();
        }

        public Builder(DeviceArgs defaults) {
            $ = new DeviceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blocked If a device is blocked, connections or requests from this device will fail.
         * 
         * @return builder
         * 
         */
        public Builder blocked(@Nullable Output<Boolean> blocked) {
            $.blocked = blocked;
            return this;
        }

        /**
         * @param blocked If a device is blocked, connections or requests from this device will fail.
         * 
         * @return builder
         * 
         */
        public Builder blocked(Boolean blocked) {
            return blocked(Output.of(blocked));
        }

        /**
         * @param credentials The credentials used to authenticate this device.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<List<DeviceCredentialArgs>> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The credentials used to authenticate this device.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder credentials(List<DeviceCredentialArgs> credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param credentials The credentials used to authenticate this device.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder credentials(DeviceCredentialArgs... credentials) {
            return credentials(List.of(credentials));
        }

        /**
         * @param gatewayConfig Gateway-related configuration and state.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gatewayConfig(@Nullable Output<DeviceGatewayConfigArgs> gatewayConfig) {
            $.gatewayConfig = gatewayConfig;
            return this;
        }

        /**
         * @param gatewayConfig Gateway-related configuration and state.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder gatewayConfig(DeviceGatewayConfigArgs gatewayConfig) {
            return gatewayConfig(Output.of(gatewayConfig));
        }

        /**
         * @param logLevel The logging verbosity for device activity.
         * Possible values are: `NONE`, `ERROR`, `INFO`, `DEBUG`.
         * 
         * @return builder
         * 
         */
        public Builder logLevel(@Nullable Output<String> logLevel) {
            $.logLevel = logLevel;
            return this;
        }

        /**
         * @param logLevel The logging verbosity for device activity.
         * Possible values are: `NONE`, `ERROR`, `INFO`, `DEBUG`.
         * 
         * @return builder
         * 
         */
        public Builder logLevel(String logLevel) {
            return logLevel(Output.of(logLevel));
        }

        /**
         * @param metadata The metadata key-value pairs assigned to the device.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata The metadata key-value pairs assigned to the device.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name A unique name for the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name for the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param registry The name of the device registry where this device should be created.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder registry(Output<String> registry) {
            $.registry = registry;
            return this;
        }

        /**
         * @param registry The name of the device registry where this device should be created.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder registry(String registry) {
            return registry(Output.of(registry));
        }

        public DeviceArgs build() {
            $.registry = Objects.requireNonNull($.registry, "expected parameter 'registry' to be non-null");
            return $;
        }
    }

}