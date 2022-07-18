// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceTemplateSpecContainerEnvFromSecretRef {
    private final List<GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference> localObjectReferences;
    private final Boolean optional;

    @CustomType.Constructor
    private GetServiceTemplateSpecContainerEnvFromSecretRef(
        @CustomType.Parameter("localObjectReferences") List<GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference> localObjectReferences,
        @CustomType.Parameter("optional") Boolean optional) {
        this.localObjectReferences = localObjectReferences;
        this.optional = optional;
    }

    public List<GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference> localObjectReferences() {
        return this.localObjectReferences;
    }
    public Boolean optional() {
        return this.optional;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainerEnvFromSecretRef defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference> localObjectReferences;
        private Boolean optional;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecContainerEnvFromSecretRef defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localObjectReferences = defaults.localObjectReferences;
    	      this.optional = defaults.optional;
        }

        public Builder localObjectReferences(List<GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference> localObjectReferences) {
            this.localObjectReferences = Objects.requireNonNull(localObjectReferences);
            return this;
        }
        public Builder localObjectReferences(GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference... localObjectReferences) {
            return localObjectReferences(List.of(localObjectReferences));
        }
        public Builder optional(Boolean optional) {
            this.optional = Objects.requireNonNull(optional);
            return this;
        }        public GetServiceTemplateSpecContainerEnvFromSecretRef build() {
            return new GetServiceTemplateSpecContainerEnvFromSecretRef(localObjectReferences, optional);
        }
    }
}