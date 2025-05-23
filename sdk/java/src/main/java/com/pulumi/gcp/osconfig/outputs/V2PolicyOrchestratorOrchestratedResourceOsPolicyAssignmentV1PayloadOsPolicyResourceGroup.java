// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupInventoryFilter;
import com.pulumi.gcp.osconfig.outputs.V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResource;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroup {
    /**
     * @return List of inventory filters for the resource group.
     * The resources in this resource group are applied to the target VM if it
     * satisfies at least one of the following inventory filters.
     * For example, to apply this resource group to VMs running either `RHEL` or
     * `CentOS` operating systems, specify 2 items for the list with following
     * values:
     * inventory_filters[0].os_short_name=&#39;rhel&#39; and
     * inventory_filters[1].os_short_name=&#39;centos&#39;
     * If the list is empty, this resource group will be applied to the target
     * VM unconditionally.
     * Structure is documented below.
     * 
     */
    private @Nullable List<V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupInventoryFilter> inventoryFilters;
    /**
     * @return Required. List of resources configured for this resource group.
     * The resources are executed in the exact order specified here.
     * Structure is documented below.
     * 
     */
    private List<V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResource> resources;

    private V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroup() {}
    /**
     * @return List of inventory filters for the resource group.
     * The resources in this resource group are applied to the target VM if it
     * satisfies at least one of the following inventory filters.
     * For example, to apply this resource group to VMs running either `RHEL` or
     * `CentOS` operating systems, specify 2 items for the list with following
     * values:
     * inventory_filters[0].os_short_name=&#39;rhel&#39; and
     * inventory_filters[1].os_short_name=&#39;centos&#39;
     * If the list is empty, this resource group will be applied to the target
     * VM unconditionally.
     * Structure is documented below.
     * 
     */
    public List<V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupInventoryFilter> inventoryFilters() {
        return this.inventoryFilters == null ? List.of() : this.inventoryFilters;
    }
    /**
     * @return Required. List of resources configured for this resource group.
     * The resources are executed in the exact order specified here.
     * Structure is documented below.
     * 
     */
    public List<V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResource> resources() {
        return this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupInventoryFilter> inventoryFilters;
        private List<V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResource> resources;
        public Builder() {}
        public Builder(V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inventoryFilters = defaults.inventoryFilters;
    	      this.resources = defaults.resources;
        }

        @CustomType.Setter
        public Builder inventoryFilters(@Nullable List<V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupInventoryFilter> inventoryFilters) {

            this.inventoryFilters = inventoryFilters;
            return this;
        }
        public Builder inventoryFilters(V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupInventoryFilter... inventoryFilters) {
            return inventoryFilters(List.of(inventoryFilters));
        }
        @CustomType.Setter
        public Builder resources(List<V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResource> resources) {
            if (resources == null) {
              throw new MissingRequiredPropertyException("V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroup", "resources");
            }
            this.resources = resources;
            return this;
        }
        public Builder resources(V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResource... resources) {
            return resources(List.of(resources));
        }
        public V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroup build() {
            final var _resultValue = new V2PolicyOrchestratorOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroup();
            _resultValue.inventoryFilters = inventoryFilters;
            _resultValue.resources = resources;
            return _resultValue;
        }
    }
}
