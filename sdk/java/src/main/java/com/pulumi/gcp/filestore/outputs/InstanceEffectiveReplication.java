// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.filestore.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.filestore.outputs.InstanceEffectiveReplicationReplica;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceEffectiveReplication {
    /**
     * @return The replication role.
     * Structure is documented below.
     * 
     */
    private @Nullable List<InstanceEffectiveReplicationReplica> replicas;
    /**
     * @return (Output)
     * The replication role.
     * 
     */
    private @Nullable String role;

    private InstanceEffectiveReplication() {}
    /**
     * @return The replication role.
     * Structure is documented below.
     * 
     */
    public List<InstanceEffectiveReplicationReplica> replicas() {
        return this.replicas == null ? List.of() : this.replicas;
    }
    /**
     * @return (Output)
     * The replication role.
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceEffectiveReplication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<InstanceEffectiveReplicationReplica> replicas;
        private @Nullable String role;
        public Builder() {}
        public Builder(InstanceEffectiveReplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicas = defaults.replicas;
    	      this.role = defaults.role;
        }

        @CustomType.Setter
        public Builder replicas(@Nullable List<InstanceEffectiveReplicationReplica> replicas) {

            this.replicas = replicas;
            return this;
        }
        public Builder replicas(InstanceEffectiveReplicationReplica... replicas) {
            return replicas(List.of(replicas));
        }
        @CustomType.Setter
        public Builder role(@Nullable String role) {

            this.role = role;
            return this;
        }
        public InstanceEffectiveReplication build() {
            final var _resultValue = new InstanceEffectiveReplication();
            _resultValue.replicas = replicas;
            _resultValue.role = role;
            return _resultValue;
        }
    }
}
