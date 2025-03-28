// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.databasemigrationservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.databasemigrationservice.inputs.ConnectionProfileAlloydbSettingsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionProfileAlloydbArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionProfileAlloydbArgs Empty = new ConnectionProfileAlloydbArgs();

    /**
     * Required. The AlloyDB cluster ID that this connection profile is associated with.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return Required. The AlloyDB cluster ID that this connection profile is associated with.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * Immutable. Metadata used to create the destination AlloyDB cluster.
     * Structure is documented below.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<ConnectionProfileAlloydbSettingsArgs> settings;

    /**
     * @return Immutable. Metadata used to create the destination AlloyDB cluster.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionProfileAlloydbSettingsArgs>> settings() {
        return Optional.ofNullable(this.settings);
    }

    private ConnectionProfileAlloydbArgs() {}

    private ConnectionProfileAlloydbArgs(ConnectionProfileAlloydbArgs $) {
        this.clusterId = $.clusterId;
        this.settings = $.settings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionProfileAlloydbArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionProfileAlloydbArgs $;

        public Builder() {
            $ = new ConnectionProfileAlloydbArgs();
        }

        public Builder(ConnectionProfileAlloydbArgs defaults) {
            $ = new ConnectionProfileAlloydbArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId Required. The AlloyDB cluster ID that this connection profile is associated with.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId Required. The AlloyDB cluster ID that this connection profile is associated with.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param settings Immutable. Metadata used to create the destination AlloyDB cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<ConnectionProfileAlloydbSettingsArgs> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings Immutable. Metadata used to create the destination AlloyDB cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder settings(ConnectionProfileAlloydbSettingsArgs settings) {
            return settings(Output.of(settings));
        }

        public ConnectionProfileAlloydbArgs build() {
            if ($.clusterId == null) {
                throw new MissingRequiredPropertyException("ConnectionProfileAlloydbArgs", "clusterId");
            }
            return $;
        }
    }

}
