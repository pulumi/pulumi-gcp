// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.migrationcenter.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesNodeTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesNodeTypeArgs Empty = new PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesNodeTypeArgs();

    /**
     * Name of the Sole Tenant node. Consult https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes
     * 
     */
    @Import(name="nodeName")
    private @Nullable Output<String> nodeName;

    /**
     * @return Name of the Sole Tenant node. Consult https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes
     * 
     */
    public Optional<Output<String>> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }

    private PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesNodeTypeArgs() {}

    private PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesNodeTypeArgs(PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesNodeTypeArgs $) {
        this.nodeName = $.nodeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesNodeTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesNodeTypeArgs $;

        public Builder() {
            $ = new PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesNodeTypeArgs();
        }

        public Builder(PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesNodeTypeArgs defaults) {
            $ = new PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesNodeTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodeName Name of the Sole Tenant node. Consult https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes
         * 
         * @return builder
         * 
         */
        public Builder nodeName(@Nullable Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param nodeName Name of the Sole Tenant node. Consult https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        public PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesNodeTypeArgs build() {
            return $;
        }
    }

}
