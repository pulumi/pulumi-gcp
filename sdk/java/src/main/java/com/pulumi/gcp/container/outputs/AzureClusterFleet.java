// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureClusterFleet {
    /**
     * @return The name of the managed Hub Membership resource associated to this cluster. Membership names are formatted as projects/&lt;project-number&gt;/locations/global/membership/&lt;cluster-id&gt;.
     * 
     */
    private @Nullable String membership;
    /**
     * @return The number of the Fleet host project where this cluster will be registered.
     * 
     */
    private @Nullable String project;

    private AzureClusterFleet() {}
    /**
     * @return The name of the managed Hub Membership resource associated to this cluster. Membership names are formatted as projects/&lt;project-number&gt;/locations/global/membership/&lt;cluster-id&gt;.
     * 
     */
    public Optional<String> membership() {
        return Optional.ofNullable(this.membership);
    }
    /**
     * @return The number of the Fleet host project where this cluster will be registered.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterFleet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String membership;
        private @Nullable String project;
        public Builder() {}
        public Builder(AzureClusterFleet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.membership = defaults.membership;
    	      this.project = defaults.project;
        }

        @CustomType.Setter
        public Builder membership(@Nullable String membership) {

            this.membership = membership;
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {

            this.project = project;
            return this;
        }
        public AzureClusterFleet build() {
            final var _resultValue = new AzureClusterFleet();
            _resultValue.membership = membership;
            _resultValue.project = project;
            return _resultValue;
        }
    }
}
