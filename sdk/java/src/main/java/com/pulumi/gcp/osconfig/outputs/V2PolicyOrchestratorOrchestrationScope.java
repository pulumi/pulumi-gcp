// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorOrchestrationScopeSelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class V2PolicyOrchestratorOrchestrationScope {
    /**
     * @return Optional. Selectors of the orchestration scope. There is a logical AND between each
     * selector defined.
     * When there is no explicit `ResourceHierarchySelector` selector specified,
     * the scope is by default bounded to the parent of the policy orchestrator
     * resource.
     * Structure is documented below.
     * 
     */
    private @Nullable List<V2PolicyOrchestratorOrchestrationScopeSelector> selectors;

    private V2PolicyOrchestratorOrchestrationScope() {}
    /**
     * @return Optional. Selectors of the orchestration scope. There is a logical AND between each
     * selector defined.
     * When there is no explicit `ResourceHierarchySelector` selector specified,
     * the scope is by default bounded to the parent of the policy orchestrator
     * resource.
     * Structure is documented below.
     * 
     */
    public List<V2PolicyOrchestratorOrchestrationScopeSelector> selectors() {
        return this.selectors == null ? List.of() : this.selectors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2PolicyOrchestratorOrchestrationScope defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<V2PolicyOrchestratorOrchestrationScopeSelector> selectors;
        public Builder() {}
        public Builder(V2PolicyOrchestratorOrchestrationScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectors = defaults.selectors;
        }

        @CustomType.Setter
        public Builder selectors(@Nullable List<V2PolicyOrchestratorOrchestrationScopeSelector> selectors) {

            this.selectors = selectors;
            return this;
        }
        public Builder selectors(V2PolicyOrchestratorOrchestrationScopeSelector... selectors) {
            return selectors(List.of(selectors));
        }
        public V2PolicyOrchestratorOrchestrationScope build() {
            final var _resultValue = new V2PolicyOrchestratorOrchestrationScope();
            _resultValue.selectors = selectors;
            return _resultValue;
        }
    }
}
