// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.assuredworkloads.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadEkmProvisioningResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadEkmProvisioningResponseArgs Empty = new WorkloadEkmProvisioningResponseArgs();

    @Import(name="ekmProvisioningErrorDomain")
    private @Nullable Output<String> ekmProvisioningErrorDomain;

    public Optional<Output<String>> ekmProvisioningErrorDomain() {
        return Optional.ofNullable(this.ekmProvisioningErrorDomain);
    }

    @Import(name="ekmProvisioningErrorMapping")
    private @Nullable Output<String> ekmProvisioningErrorMapping;

    public Optional<Output<String>> ekmProvisioningErrorMapping() {
        return Optional.ofNullable(this.ekmProvisioningErrorMapping);
    }

    @Import(name="ekmProvisioningState")
    private @Nullable Output<String> ekmProvisioningState;

    public Optional<Output<String>> ekmProvisioningState() {
        return Optional.ofNullable(this.ekmProvisioningState);
    }

    private WorkloadEkmProvisioningResponseArgs() {}

    private WorkloadEkmProvisioningResponseArgs(WorkloadEkmProvisioningResponseArgs $) {
        this.ekmProvisioningErrorDomain = $.ekmProvisioningErrorDomain;
        this.ekmProvisioningErrorMapping = $.ekmProvisioningErrorMapping;
        this.ekmProvisioningState = $.ekmProvisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadEkmProvisioningResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadEkmProvisioningResponseArgs $;

        public Builder() {
            $ = new WorkloadEkmProvisioningResponseArgs();
        }

        public Builder(WorkloadEkmProvisioningResponseArgs defaults) {
            $ = new WorkloadEkmProvisioningResponseArgs(Objects.requireNonNull(defaults));
        }

        public Builder ekmProvisioningErrorDomain(@Nullable Output<String> ekmProvisioningErrorDomain) {
            $.ekmProvisioningErrorDomain = ekmProvisioningErrorDomain;
            return this;
        }

        public Builder ekmProvisioningErrorDomain(String ekmProvisioningErrorDomain) {
            return ekmProvisioningErrorDomain(Output.of(ekmProvisioningErrorDomain));
        }

        public Builder ekmProvisioningErrorMapping(@Nullable Output<String> ekmProvisioningErrorMapping) {
            $.ekmProvisioningErrorMapping = ekmProvisioningErrorMapping;
            return this;
        }

        public Builder ekmProvisioningErrorMapping(String ekmProvisioningErrorMapping) {
            return ekmProvisioningErrorMapping(Output.of(ekmProvisioningErrorMapping));
        }

        public Builder ekmProvisioningState(@Nullable Output<String> ekmProvisioningState) {
            $.ekmProvisioningState = ekmProvisioningState;
            return this;
        }

        public Builder ekmProvisioningState(String ekmProvisioningState) {
            return ekmProvisioningState(Output.of(ekmProvisioningState));
        }

        public WorkloadEkmProvisioningResponseArgs build() {
            return $;
        }
    }

}