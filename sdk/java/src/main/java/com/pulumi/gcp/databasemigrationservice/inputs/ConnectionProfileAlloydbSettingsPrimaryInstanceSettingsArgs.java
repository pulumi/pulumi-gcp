// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.databasemigrationservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsMachineConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsArgs Empty = new ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsArgs();

    /**
     * Database flags to pass to AlloyDB when DMS is creating the AlloyDB cluster and instances. See the AlloyDB documentation for how these can be used.
     * 
     */
    @Import(name="databaseFlags")
    private @Nullable Output<Map<String,String>> databaseFlags;

    /**
     * @return Database flags to pass to AlloyDB when DMS is creating the AlloyDB cluster and instances. See the AlloyDB documentation for how these can be used.
     * 
     */
    public Optional<Output<Map<String,String>>> databaseFlags() {
        return Optional.ofNullable(this.databaseFlags);
    }

    /**
     * The database username.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The database username.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Labels for the AlloyDB primary instance created by DMS.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels for the AlloyDB primary instance created by DMS.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Configuration for the machines that host the underlying database engine.
     * Structure is documented below.
     * 
     */
    @Import(name="machineConfig", required=true)
    private Output<ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsMachineConfigArgs> machineConfig;

    /**
     * @return Configuration for the machines that host the underlying database engine.
     * Structure is documented below.
     * 
     */
    public Output<ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsMachineConfigArgs> machineConfig() {
        return this.machineConfig;
    }

    /**
     * (Output)
     * Output only. The private IP address for the Instance. This is the connection endpoint for an end-user application.
     * 
     */
    @Import(name="privateIp")
    private @Nullable Output<String> privateIp;

    /**
     * @return (Output)
     * Output only. The private IP address for the Instance. This is the connection endpoint for an end-user application.
     * 
     */
    public Optional<Output<String>> privateIp() {
        return Optional.ofNullable(this.privateIp);
    }

    private ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsArgs() {}

    private ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsArgs(ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsArgs $) {
        this.databaseFlags = $.databaseFlags;
        this.id = $.id;
        this.labels = $.labels;
        this.machineConfig = $.machineConfig;
        this.privateIp = $.privateIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsArgs $;

        public Builder() {
            $ = new ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsArgs();
        }

        public Builder(ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsArgs defaults) {
            $ = new ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseFlags Database flags to pass to AlloyDB when DMS is creating the AlloyDB cluster and instances. See the AlloyDB documentation for how these can be used.
         * 
         * @return builder
         * 
         */
        public Builder databaseFlags(@Nullable Output<Map<String,String>> databaseFlags) {
            $.databaseFlags = databaseFlags;
            return this;
        }

        /**
         * @param databaseFlags Database flags to pass to AlloyDB when DMS is creating the AlloyDB cluster and instances. See the AlloyDB documentation for how these can be used.
         * 
         * @return builder
         * 
         */
        public Builder databaseFlags(Map<String,String> databaseFlags) {
            return databaseFlags(Output.of(databaseFlags));
        }

        /**
         * @param id The database username.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The database username.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param labels Labels for the AlloyDB primary instance created by DMS.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for the AlloyDB primary instance created by DMS.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param machineConfig Configuration for the machines that host the underlying database engine.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder machineConfig(Output<ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsMachineConfigArgs> machineConfig) {
            $.machineConfig = machineConfig;
            return this;
        }

        /**
         * @param machineConfig Configuration for the machines that host the underlying database engine.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder machineConfig(ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsMachineConfigArgs machineConfig) {
            return machineConfig(Output.of(machineConfig));
        }

        /**
         * @param privateIp (Output)
         * Output only. The private IP address for the Instance. This is the connection endpoint for an end-user application.
         * 
         * @return builder
         * 
         */
        public Builder privateIp(@Nullable Output<String> privateIp) {
            $.privateIp = privateIp;
            return this;
        }

        /**
         * @param privateIp (Output)
         * Output only. The private IP address for the Instance. This is the connection endpoint for an end-user application.
         * 
         * @return builder
         * 
         */
        public Builder privateIp(String privateIp) {
            return privateIp(Output.of(privateIp));
        }

        public ConnectionProfileAlloydbSettingsPrimaryInstanceSettingsArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.machineConfig = Objects.requireNonNull($.machineConfig, "expected parameter 'machineConfig' to be non-null");
            return $;
        }
    }

}