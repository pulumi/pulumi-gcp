// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudrunv2.inputs.JobTemplateTemplateContainerEnvValueSourceSecretKeyRefArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTemplateTemplateContainerEnvValueSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTemplateTemplateContainerEnvValueSourceArgs Empty = new JobTemplateTemplateContainerEnvValueSourceArgs();

    /**
     * Selects a secret and a specific version from Cloud Secret Manager.
     * Structure is documented below.
     * 
     */
    @Import(name="secretKeyRef")
    private @Nullable Output<JobTemplateTemplateContainerEnvValueSourceSecretKeyRefArgs> secretKeyRef;

    /**
     * @return Selects a secret and a specific version from Cloud Secret Manager.
     * Structure is documented below.
     * 
     */
    public Optional<Output<JobTemplateTemplateContainerEnvValueSourceSecretKeyRefArgs>> secretKeyRef() {
        return Optional.ofNullable(this.secretKeyRef);
    }

    private JobTemplateTemplateContainerEnvValueSourceArgs() {}

    private JobTemplateTemplateContainerEnvValueSourceArgs(JobTemplateTemplateContainerEnvValueSourceArgs $) {
        this.secretKeyRef = $.secretKeyRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTemplateTemplateContainerEnvValueSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTemplateTemplateContainerEnvValueSourceArgs $;

        public Builder() {
            $ = new JobTemplateTemplateContainerEnvValueSourceArgs();
        }

        public Builder(JobTemplateTemplateContainerEnvValueSourceArgs defaults) {
            $ = new JobTemplateTemplateContainerEnvValueSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretKeyRef Selects a secret and a specific version from Cloud Secret Manager.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder secretKeyRef(@Nullable Output<JobTemplateTemplateContainerEnvValueSourceSecretKeyRefArgs> secretKeyRef) {
            $.secretKeyRef = secretKeyRef;
            return this;
        }

        /**
         * @param secretKeyRef Selects a secret and a specific version from Cloud Secret Manager.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder secretKeyRef(JobTemplateTemplateContainerEnvValueSourceSecretKeyRefArgs secretKeyRef) {
            return secretKeyRef(Output.of(secretKeyRef));
        }

        public JobTemplateTemplateContainerEnvValueSourceArgs build() {
            return $;
        }
    }

}
