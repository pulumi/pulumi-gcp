// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryApt {
    /**
     * @return Type of archive files in this repository.
     * Possible values are: `DEB`, `DEB_SRC`.
     * 
     */
    private String archiveType;
    /**
     * @return List of components for this repository. Must contain at least one
     * item.
     * 
     */
    private List<String> components;
    /**
     * @return Distribution of this repository.
     * 
     */
    private String distribution;
    /**
     * @return URI of the key file for this repository. The agent maintains a
     * keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg`.
     * 
     */
    private @Nullable String gpgKey;
    /**
     * @return URI for this repository.
     * 
     */
    private String uri;

    private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryApt() {}
    /**
     * @return Type of archive files in this repository.
     * Possible values are: `DEB`, `DEB_SRC`.
     * 
     */
    public String archiveType() {
        return this.archiveType;
    }
    /**
     * @return List of components for this repository. Must contain at least one
     * item.
     * 
     */
    public List<String> components() {
        return this.components;
    }
    /**
     * @return Distribution of this repository.
     * 
     */
    public String distribution() {
        return this.distribution;
    }
    /**
     * @return URI of the key file for this repository. The agent maintains a
     * keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg`.
     * 
     */
    public Optional<String> gpgKey() {
        return Optional.ofNullable(this.gpgKey);
    }
    /**
     * @return URI for this repository.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryApt defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String archiveType;
        private List<String> components;
        private String distribution;
        private @Nullable String gpgKey;
        private String uri;
        public Builder() {}
        public Builder(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryApt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveType = defaults.archiveType;
    	      this.components = defaults.components;
    	      this.distribution = defaults.distribution;
    	      this.gpgKey = defaults.gpgKey;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder archiveType(String archiveType) {
            if (archiveType == null) {
              throw new MissingRequiredPropertyException("V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryApt", "archiveType");
            }
            this.archiveType = archiveType;
            return this;
        }
        @CustomType.Setter
        public Builder components(List<String> components) {
            if (components == null) {
              throw new MissingRequiredPropertyException("V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryApt", "components");
            }
            this.components = components;
            return this;
        }
        public Builder components(String... components) {
            return components(List.of(components));
        }
        @CustomType.Setter
        public Builder distribution(String distribution) {
            if (distribution == null) {
              throw new MissingRequiredPropertyException("V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryApt", "distribution");
            }
            this.distribution = distribution;
            return this;
        }
        @CustomType.Setter
        public Builder gpgKey(@Nullable String gpgKey) {

            this.gpgKey = gpgKey;
            return this;
        }
        @CustomType.Setter
        public Builder uri(String uri) {
            if (uri == null) {
              throw new MissingRequiredPropertyException("V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryApt", "uri");
            }
            this.uri = uri;
            return this;
        }
        public V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryApt build() {
            final var _resultValue = new V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryApt();
            _resultValue.archiveType = archiveType;
            _resultValue.components = components;
            _resultValue.distribution = distribution;
            _resultValue.gpgKey = gpgKey;
            _resultValue.uri = uri;
            return _resultValue;
        }
    }
}
