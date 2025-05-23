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
public final class V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryZypper {
    /**
     * @return The location of the repository directory.
     * 
     */
    private String baseUrl;
    /**
     * @return The display name of the repository.
     * 
     */
    private @Nullable String displayName;
    /**
     * @return URIs of GPG keys.
     * 
     */
    private @Nullable List<String> gpgKeys;
    /**
     * @return A one word, unique name for this repository. This is the `repo
     * id` in the zypper config file and also the `display_name` if
     * `display_name` is omitted. This id is also used as the unique
     * identifier when checking for GuestPolicy conflicts.
     * 
     */
    private String id;

    private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryZypper() {}
    /**
     * @return The location of the repository directory.
     * 
     */
    public String baseUrl() {
        return this.baseUrl;
    }
    /**
     * @return The display name of the repository.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return URIs of GPG keys.
     * 
     */
    public List<String> gpgKeys() {
        return this.gpgKeys == null ? List.of() : this.gpgKeys;
    }
    /**
     * @return A one word, unique name for this repository. This is the `repo
     * id` in the zypper config file and also the `display_name` if
     * `display_name` is omitted. This id is also used as the unique
     * identifier when checking for GuestPolicy conflicts.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryZypper defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String baseUrl;
        private @Nullable String displayName;
        private @Nullable List<String> gpgKeys;
        private String id;
        public Builder() {}
        public Builder(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryZypper defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUrl = defaults.baseUrl;
    	      this.displayName = defaults.displayName;
    	      this.gpgKeys = defaults.gpgKeys;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder baseUrl(String baseUrl) {
            if (baseUrl == null) {
              throw new MissingRequiredPropertyException("V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryZypper", "baseUrl");
            }
            this.baseUrl = baseUrl;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(@Nullable String displayName) {

            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder gpgKeys(@Nullable List<String> gpgKeys) {

            this.gpgKeys = gpgKeys;
            return this;
        }
        public Builder gpgKeys(String... gpgKeys) {
            return gpgKeys(List.of(gpgKeys));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryZypper", "id");
            }
            this.id = id;
            return this;
        }
        public V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryZypper build() {
            final var _resultValue = new V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceRepositoryZypper();
            _resultValue.baseUrl = baseUrl;
            _resultValue.displayName = displayName;
            _resultValue.gpgKeys = gpgKeys;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
