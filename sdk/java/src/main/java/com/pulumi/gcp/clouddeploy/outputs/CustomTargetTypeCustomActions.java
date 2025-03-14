// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.clouddeploy.outputs.CustomTargetTypeCustomActionsIncludeSkaffoldModule;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomTargetTypeCustomActions {
    /**
     * @return The Skaffold custom action responsible for deploy operations.
     * 
     */
    private String deployAction;
    /**
     * @return List of Skaffold modules Cloud Deploy will include in the Skaffold Config as required before performing diagnose.
     * Structure is documented below.
     * 
     */
    private @Nullable List<CustomTargetTypeCustomActionsIncludeSkaffoldModule> includeSkaffoldModules;
    /**
     * @return The Skaffold custom action responsible for render operations. If not provided then Cloud Deploy will perform the render operations via `skaffold render`.
     * 
     */
    private @Nullable String renderAction;

    private CustomTargetTypeCustomActions() {}
    /**
     * @return The Skaffold custom action responsible for deploy operations.
     * 
     */
    public String deployAction() {
        return this.deployAction;
    }
    /**
     * @return List of Skaffold modules Cloud Deploy will include in the Skaffold Config as required before performing diagnose.
     * Structure is documented below.
     * 
     */
    public List<CustomTargetTypeCustomActionsIncludeSkaffoldModule> includeSkaffoldModules() {
        return this.includeSkaffoldModules == null ? List.of() : this.includeSkaffoldModules;
    }
    /**
     * @return The Skaffold custom action responsible for render operations. If not provided then Cloud Deploy will perform the render operations via `skaffold render`.
     * 
     */
    public Optional<String> renderAction() {
        return Optional.ofNullable(this.renderAction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomTargetTypeCustomActions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deployAction;
        private @Nullable List<CustomTargetTypeCustomActionsIncludeSkaffoldModule> includeSkaffoldModules;
        private @Nullable String renderAction;
        public Builder() {}
        public Builder(CustomTargetTypeCustomActions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployAction = defaults.deployAction;
    	      this.includeSkaffoldModules = defaults.includeSkaffoldModules;
    	      this.renderAction = defaults.renderAction;
        }

        @CustomType.Setter
        public Builder deployAction(String deployAction) {
            if (deployAction == null) {
              throw new MissingRequiredPropertyException("CustomTargetTypeCustomActions", "deployAction");
            }
            this.deployAction = deployAction;
            return this;
        }
        @CustomType.Setter
        public Builder includeSkaffoldModules(@Nullable List<CustomTargetTypeCustomActionsIncludeSkaffoldModule> includeSkaffoldModules) {

            this.includeSkaffoldModules = includeSkaffoldModules;
            return this;
        }
        public Builder includeSkaffoldModules(CustomTargetTypeCustomActionsIncludeSkaffoldModule... includeSkaffoldModules) {
            return includeSkaffoldModules(List.of(includeSkaffoldModules));
        }
        @CustomType.Setter
        public Builder renderAction(@Nullable String renderAction) {

            this.renderAction = renderAction;
            return this;
        }
        public CustomTargetTypeCustomActions build() {
            final var _resultValue = new CustomTargetTypeCustomActions();
            _resultValue.deployAction = deployAction;
            _resultValue.includeSkaffoldModules = includeSkaffoldModules;
            _resultValue.renderAction = renderAction;
            return _resultValue;
        }
    }
}
