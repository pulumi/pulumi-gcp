// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrincipalAccessBoundaryPolicyDetailsRule {
    /**
     * @return The description of the principal access boundary policy rule. Must be less than or equal to 256 characters.
     * 
     */
    private @Nullable String description;
    /**
     * @return The access relationship of principals to the resources in this rule.
     * Possible values: ALLOW
     * 
     */
    private String effect;
    /**
     * @return A list of Cloud Resource Manager resources. The resource
     * and all the descendants are included. The number of resources in a policy
     * is limited to 500 across all rules.
     * The following resource types are supported:
     * * Organizations, such as `//cloudresourcemanager.googleapis.com/organizations/123`.
     * * Folders, such as `//cloudresourcemanager.googleapis.com/folders/123`.
     * * Projects, such as `//cloudresourcemanager.googleapis.com/projects/123`
     *   or `//cloudresourcemanager.googleapis.com/projects/my-project-id`.
     * 
     */
    private List<String> resources;

    private PrincipalAccessBoundaryPolicyDetailsRule() {}
    /**
     * @return The description of the principal access boundary policy rule. Must be less than or equal to 256 characters.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The access relationship of principals to the resources in this rule.
     * Possible values: ALLOW
     * 
     */
    public String effect() {
        return this.effect;
    }
    /**
     * @return A list of Cloud Resource Manager resources. The resource
     * and all the descendants are included. The number of resources in a policy
     * is limited to 500 across all rules.
     * The following resource types are supported:
     * * Organizations, such as `//cloudresourcemanager.googleapis.com/organizations/123`.
     * * Folders, such as `//cloudresourcemanager.googleapis.com/folders/123`.
     * * Projects, such as `//cloudresourcemanager.googleapis.com/projects/123`
     *   or `//cloudresourcemanager.googleapis.com/projects/my-project-id`.
     * 
     */
    public List<String> resources() {
        return this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrincipalAccessBoundaryPolicyDetailsRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private String effect;
        private List<String> resources;
        public Builder() {}
        public Builder(PrincipalAccessBoundaryPolicyDetailsRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.effect = defaults.effect;
    	      this.resources = defaults.resources;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder effect(String effect) {
            if (effect == null) {
              throw new MissingRequiredPropertyException("PrincipalAccessBoundaryPolicyDetailsRule", "effect");
            }
            this.effect = effect;
            return this;
        }
        @CustomType.Setter
        public Builder resources(List<String> resources) {
            if (resources == null) {
              throw new MissingRequiredPropertyException("PrincipalAccessBoundaryPolicyDetailsRule", "resources");
            }
            this.resources = resources;
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        public PrincipalAccessBoundaryPolicyDetailsRule build() {
            final var _resultValue = new PrincipalAccessBoundaryPolicyDetailsRule();
            _resultValue.description = description;
            _resultValue.effect = effect;
            _resultValue.resources = resources;
            return _resultValue;
        }
    }
}
