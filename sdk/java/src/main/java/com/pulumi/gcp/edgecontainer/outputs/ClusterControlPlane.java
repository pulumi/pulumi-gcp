// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.edgecontainer.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.edgecontainer.outputs.ClusterControlPlaneLocal;
import com.pulumi.gcp.edgecontainer.outputs.ClusterControlPlaneRemote;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterControlPlane {
    /**
     * @return Local control plane configuration.
     * Structure is documented below.
     * 
     */
    private @Nullable ClusterControlPlaneLocal local;
    /**
     * @return Remote control plane configuration.
     * Structure is documented below.
     * 
     */
    private @Nullable ClusterControlPlaneRemote remote;

    private ClusterControlPlane() {}
    /**
     * @return Local control plane configuration.
     * Structure is documented below.
     * 
     */
    public Optional<ClusterControlPlaneLocal> local() {
        return Optional.ofNullable(this.local);
    }
    /**
     * @return Remote control plane configuration.
     * Structure is documented below.
     * 
     */
    public Optional<ClusterControlPlaneRemote> remote() {
        return Optional.ofNullable(this.remote);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterControlPlane defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterControlPlaneLocal local;
        private @Nullable ClusterControlPlaneRemote remote;
        public Builder() {}
        public Builder(ClusterControlPlane defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.local = defaults.local;
    	      this.remote = defaults.remote;
        }

        @CustomType.Setter
        public Builder local(@Nullable ClusterControlPlaneLocal local) {
            this.local = local;
            return this;
        }
        @CustomType.Setter
        public Builder remote(@Nullable ClusterControlPlaneRemote remote) {
            this.remote = remote;
            return this;
        }
        public ClusterControlPlane build() {
            final var o = new ClusterControlPlane();
            o.local = local;
            o.remote = remote;
            return o;
        }
    }
}