// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.artifactregistry.outputs.RepositoryCleanupPolicyCondition;
import com.pulumi.gcp.artifactregistry.outputs.RepositoryCleanupPolicyMostRecentVersions;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RepositoryCleanupPolicy {
    /**
     * @return Policy action.
     * Possible values are: `DELETE`, `KEEP`.
     * 
     */
    private @Nullable String action;
    /**
     * @return Policy condition for matching versions.
     * Structure is documented below.
     * 
     */
    private @Nullable RepositoryCleanupPolicyCondition condition;
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    private String id;
    /**
     * @return Policy condition for retaining a minimum number of versions. May only be
     * specified with a Keep action.
     * Structure is documented below.
     * 
     */
    private @Nullable RepositoryCleanupPolicyMostRecentVersions mostRecentVersions;

    private RepositoryCleanupPolicy() {}
    /**
     * @return Policy action.
     * Possible values are: `DELETE`, `KEEP`.
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return Policy condition for matching versions.
     * Structure is documented below.
     * 
     */
    public Optional<RepositoryCleanupPolicyCondition> condition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Policy condition for retaining a minimum number of versions. May only be
     * specified with a Keep action.
     * Structure is documented below.
     * 
     */
    public Optional<RepositoryCleanupPolicyMostRecentVersions> mostRecentVersions() {
        return Optional.ofNullable(this.mostRecentVersions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryCleanupPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private @Nullable RepositoryCleanupPolicyCondition condition;
        private String id;
        private @Nullable RepositoryCleanupPolicyMostRecentVersions mostRecentVersions;
        public Builder() {}
        public Builder(RepositoryCleanupPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.condition = defaults.condition;
    	      this.id = defaults.id;
    	      this.mostRecentVersions = defaults.mostRecentVersions;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {

            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder condition(@Nullable RepositoryCleanupPolicyCondition condition) {

            this.condition = condition;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("RepositoryCleanupPolicy", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mostRecentVersions(@Nullable RepositoryCleanupPolicyMostRecentVersions mostRecentVersions) {

            this.mostRecentVersions = mostRecentVersions;
            return this;
        }
        public RepositoryCleanupPolicy build() {
            final var _resultValue = new RepositoryCleanupPolicy();
            _resultValue.action = action;
            _resultValue.condition = condition;
            _resultValue.id = id;
            _resultValue.mostRecentVersions = mostRecentVersions;
            return _resultValue;
        }
    }
}
