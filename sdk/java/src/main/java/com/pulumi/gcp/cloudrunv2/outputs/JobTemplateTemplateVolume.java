// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrunv2.outputs.JobTemplateTemplateVolumeCloudSqlInstance;
import com.pulumi.gcp.cloudrunv2.outputs.JobTemplateTemplateVolumeSecret;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTemplateTemplateVolume {
    /**
     * @return For Cloud SQL volumes, contains the specific instances that should be mounted. Visit https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect Cloud SQL and Cloud Run.
     * Structure is documented below.
     * 
     */
    private @Nullable JobTemplateTemplateVolumeCloudSqlInstance cloudSqlInstance;
    /**
     * @return Volume&#39;s name.
     * 
     */
    private String name;
    /**
     * @return The name of the secret in Cloud Secret Manager. Format: {secret} if the secret is in the same project. projects/{project}/secrets/{secret} if the secret is in a different project.
     * 
     */
    private @Nullable JobTemplateTemplateVolumeSecret secret;

    private JobTemplateTemplateVolume() {}
    /**
     * @return For Cloud SQL volumes, contains the specific instances that should be mounted. Visit https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect Cloud SQL and Cloud Run.
     * Structure is documented below.
     * 
     */
    public Optional<JobTemplateTemplateVolumeCloudSqlInstance> cloudSqlInstance() {
        return Optional.ofNullable(this.cloudSqlInstance);
    }
    /**
     * @return Volume&#39;s name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The name of the secret in Cloud Secret Manager. Format: {secret} if the secret is in the same project. projects/{project}/secrets/{secret} if the secret is in a different project.
     * 
     */
    public Optional<JobTemplateTemplateVolumeSecret> secret() {
        return Optional.ofNullable(this.secret);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateTemplateVolume defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable JobTemplateTemplateVolumeCloudSqlInstance cloudSqlInstance;
        private String name;
        private @Nullable JobTemplateTemplateVolumeSecret secret;
        public Builder() {}
        public Builder(JobTemplateTemplateVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSqlInstance = defaults.cloudSqlInstance;
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
        }

        @CustomType.Setter
        public Builder cloudSqlInstance(@Nullable JobTemplateTemplateVolumeCloudSqlInstance cloudSqlInstance) {
            this.cloudSqlInstance = cloudSqlInstance;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder secret(@Nullable JobTemplateTemplateVolumeSecret secret) {
            this.secret = secret;
            return this;
        }
        public JobTemplateTemplateVolume build() {
            final var o = new JobTemplateTemplateVolume();
            o.cloudSqlInstance = cloudSqlInstance;
            o.name = name;
            o.secret = secret;
            return o;
        }
    }
}