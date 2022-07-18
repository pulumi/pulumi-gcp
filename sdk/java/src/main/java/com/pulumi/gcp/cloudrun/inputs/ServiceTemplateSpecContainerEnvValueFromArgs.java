// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvValueFromSecretKeyRefArgs;
import java.util.Objects;


public final class ServiceTemplateSpecContainerEnvValueFromArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerEnvValueFromArgs Empty = new ServiceTemplateSpecContainerEnvValueFromArgs();

    /**
     * Selects a key (version) of a secret in Secret Manager.
     * Structure is documented below.
     * 
     */
    @Import(name="secretKeyRef", required=true)
    private Output<ServiceTemplateSpecContainerEnvValueFromSecretKeyRefArgs> secretKeyRef;

    /**
     * @return Selects a key (version) of a secret in Secret Manager.
     * Structure is documented below.
     * 
     */
    public Output<ServiceTemplateSpecContainerEnvValueFromSecretKeyRefArgs> secretKeyRef() {
        return this.secretKeyRef;
    }

    private ServiceTemplateSpecContainerEnvValueFromArgs() {}

    private ServiceTemplateSpecContainerEnvValueFromArgs(ServiceTemplateSpecContainerEnvValueFromArgs $) {
        this.secretKeyRef = $.secretKeyRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTemplateSpecContainerEnvValueFromArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTemplateSpecContainerEnvValueFromArgs $;

        public Builder() {
            $ = new ServiceTemplateSpecContainerEnvValueFromArgs();
        }

        public Builder(ServiceTemplateSpecContainerEnvValueFromArgs defaults) {
            $ = new ServiceTemplateSpecContainerEnvValueFromArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretKeyRef Selects a key (version) of a secret in Secret Manager.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder secretKeyRef(Output<ServiceTemplateSpecContainerEnvValueFromSecretKeyRefArgs> secretKeyRef) {
            $.secretKeyRef = secretKeyRef;
            return this;
        }

        /**
         * @param secretKeyRef Selects a key (version) of a secret in Secret Manager.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder secretKeyRef(ServiceTemplateSpecContainerEnvValueFromSecretKeyRefArgs secretKeyRef) {
            return secretKeyRef(Output.of(secretKeyRef));
        }

        public ServiceTemplateSpecContainerEnvValueFromArgs build() {
            $.secretKeyRef = Objects.requireNonNull($.secretKeyRef, "expected parameter 'secretKeyRef' to be non-null");
            return $;
        }
    }

}