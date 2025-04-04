// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.filestore.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.filestore.outputs.InstanceInitialReplicationReplica;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceInitialReplication {
    /**
     * @return The replication role.
     * Structure is documented below.
     * 
     */
    private @Nullable List<InstanceInitialReplicationReplica> replicas;
    /**
     * @return The replication role.
     * Default value is `STANDBY`.
     * Possible values are: `ROLE_UNSPECIFIED`, `ACTIVE`, `STANDBY`.
     * 
     */
    private @Nullable String role;

    private InstanceInitialReplication() {}
    /**
     * @return The replication role.
     * Structure is documented below.
     * 
     */
    public List<InstanceInitialReplicationReplica> replicas() {
        return this.replicas == null ? List.of() : this.replicas;
    }
    /**
     * @return The replication role.
     * Default value is `STANDBY`.
     * Possible values are: `ROLE_UNSPECIFIED`, `ACTIVE`, `STANDBY`.
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceInitialReplication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<InstanceInitialReplicationReplica> replicas;
        private @Nullable String role;
        public Builder() {}
        public Builder(InstanceInitialReplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicas = defaults.replicas;
    	      this.role = defaults.role;
        }

        @CustomType.Setter
        public Builder replicas(@Nullable List<InstanceInitialReplicationReplica> replicas) {

            this.replicas = replicas;
            return this;
        }
        public Builder replicas(InstanceInitialReplicationReplica... replicas) {
            return replicas(List.of(replicas));
        }
        @CustomType.Setter
        public Builder role(@Nullable String role) {

            this.role = role;
            return this;
        }
        public InstanceInitialReplication build() {
            final var _resultValue = new InstanceInitialReplication();
            _resultValue.replicas = replicas;
            _resultValue.role = role;
            return _resultValue;
        }
    }
}
