// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.secretmanager.outputs.GetSecretsSecretReplicationUserManagedReplica;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSecretsSecretReplicationUserManaged {
    /**
     * @return The list of Replicas for this Secret.
     * Structure is documented below.
     * 
     */
    private List<GetSecretsSecretReplicationUserManagedReplica> replicas;

    private GetSecretsSecretReplicationUserManaged() {}
    /**
     * @return The list of Replicas for this Secret.
     * Structure is documented below.
     * 
     */
    public List<GetSecretsSecretReplicationUserManagedReplica> replicas() {
        return this.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretsSecretReplicationUserManaged defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetSecretsSecretReplicationUserManagedReplica> replicas;
        public Builder() {}
        public Builder(GetSecretsSecretReplicationUserManaged defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicas = defaults.replicas;
        }

        @CustomType.Setter
        public Builder replicas(List<GetSecretsSecretReplicationUserManagedReplica> replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }
        public Builder replicas(GetSecretsSecretReplicationUserManagedReplica... replicas) {
            return replicas(List.of(replicas));
        }
        public GetSecretsSecretReplicationUserManaged build() {
            final var o = new GetSecretsSecretReplicationUserManaged();
            o.replicas = replicas;
            return o;
        }
    }
}