// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrunv2.outputs.JobTemplateTemplateContainerEnvValueSourceSecretKeyRef;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTemplateTemplateContainerEnvValueSource {
    /**
     * @return Selects a secret and a specific version from Cloud Secret Manager.
     * Structure is documented below.
     * 
     */
    private @Nullable JobTemplateTemplateContainerEnvValueSourceSecretKeyRef secretKeyRef;

    private JobTemplateTemplateContainerEnvValueSource() {}
    /**
     * @return Selects a secret and a specific version from Cloud Secret Manager.
     * Structure is documented below.
     * 
     */
    public Optional<JobTemplateTemplateContainerEnvValueSourceSecretKeyRef> secretKeyRef() {
        return Optional.ofNullable(this.secretKeyRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateTemplateContainerEnvValueSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable JobTemplateTemplateContainerEnvValueSourceSecretKeyRef secretKeyRef;
        public Builder() {}
        public Builder(JobTemplateTemplateContainerEnvValueSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretKeyRef = defaults.secretKeyRef;
        }

        @CustomType.Setter
        public Builder secretKeyRef(@Nullable JobTemplateTemplateContainerEnvValueSourceSecretKeyRef secretKeyRef) {
            this.secretKeyRef = secretKeyRef;
            return this;
        }
        public JobTemplateTemplateContainerEnvValueSource build() {
            final var o = new JobTemplateTemplateContainerEnvValueSource();
            o.secretKeyRef = secretKeyRef;
            return o;
        }
    }
}