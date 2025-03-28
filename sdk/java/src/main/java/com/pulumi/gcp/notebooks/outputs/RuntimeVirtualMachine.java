// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.notebooks.outputs.RuntimeVirtualMachineVirtualMachineConfig;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuntimeVirtualMachine {
    /**
     * @return (Output)
     * The unique identifier of the Managed Compute Engine instance.
     * 
     */
    private @Nullable String instanceId;
    /**
     * @return (Output)
     * The user-friendly name of the Managed Compute Engine instance.
     * 
     */
    private @Nullable String instanceName;
    /**
     * @return Virtual Machine configuration settings.
     * Structure is documented below.
     * 
     */
    private @Nullable RuntimeVirtualMachineVirtualMachineConfig virtualMachineConfig;

    private RuntimeVirtualMachine() {}
    /**
     * @return (Output)
     * The unique identifier of the Managed Compute Engine instance.
     * 
     */
    public Optional<String> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }
    /**
     * @return (Output)
     * The user-friendly name of the Managed Compute Engine instance.
     * 
     */
    public Optional<String> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }
    /**
     * @return Virtual Machine configuration settings.
     * Structure is documented below.
     * 
     */
    public Optional<RuntimeVirtualMachineVirtualMachineConfig> virtualMachineConfig() {
        return Optional.ofNullable(this.virtualMachineConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeVirtualMachine defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String instanceId;
        private @Nullable String instanceName;
        private @Nullable RuntimeVirtualMachineVirtualMachineConfig virtualMachineConfig;
        public Builder() {}
        public Builder(RuntimeVirtualMachine defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.instanceName = defaults.instanceName;
    	      this.virtualMachineConfig = defaults.virtualMachineConfig;
        }

        @CustomType.Setter
        public Builder instanceId(@Nullable String instanceId) {

            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder instanceName(@Nullable String instanceName) {

            this.instanceName = instanceName;
            return this;
        }
        @CustomType.Setter
        public Builder virtualMachineConfig(@Nullable RuntimeVirtualMachineVirtualMachineConfig virtualMachineConfig) {

            this.virtualMachineConfig = virtualMachineConfig;
            return this;
        }
        public RuntimeVirtualMachine build() {
            final var _resultValue = new RuntimeVirtualMachine();
            _resultValue.instanceId = instanceId;
            _resultValue.instanceName = instanceName;
            _resultValue.virtualMachineConfig = virtualMachineConfig;
            return _resultValue;
        }
    }
}
