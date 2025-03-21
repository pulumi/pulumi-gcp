// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionDiscoveryConfigOrgConfigLocation {
    /**
     * @return The ID for the folder within an organization to scan
     * 
     */
    private @Nullable String folderId;
    /**
     * @return The ID of an organization to scan
     * 
     */
    private @Nullable String organizationId;

    private PreventionDiscoveryConfigOrgConfigLocation() {}
    /**
     * @return The ID for the folder within an organization to scan
     * 
     */
    public Optional<String> folderId() {
        return Optional.ofNullable(this.folderId);
    }
    /**
     * @return The ID of an organization to scan
     * 
     */
    public Optional<String> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDiscoveryConfigOrgConfigLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String folderId;
        private @Nullable String organizationId;
        public Builder() {}
        public Builder(PreventionDiscoveryConfigOrgConfigLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folderId = defaults.folderId;
    	      this.organizationId = defaults.organizationId;
        }

        @CustomType.Setter
        public Builder folderId(@Nullable String folderId) {

            this.folderId = folderId;
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(@Nullable String organizationId) {

            this.organizationId = organizationId;
            return this;
        }
        public PreventionDiscoveryConfigOrgConfigLocation build() {
            final var _resultValue = new PreventionDiscoveryConfigOrgConfigLocation();
            _resultValue.folderId = folderId;
            _resultValue.organizationId = organizationId;
            return _resultValue;
        }
    }
}
