// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.cloudbuild.outputs.GetTriggerBuildArtifact;
import com.pulumi.gcp.cloudbuild.outputs.GetTriggerBuildAvailableSecret;
import com.pulumi.gcp.cloudbuild.outputs.GetTriggerBuildOption;
import com.pulumi.gcp.cloudbuild.outputs.GetTriggerBuildSecret;
import com.pulumi.gcp.cloudbuild.outputs.GetTriggerBuildSource;
import com.pulumi.gcp.cloudbuild.outputs.GetTriggerBuildStep;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetTriggerBuild {
    /**
     * @return Artifacts produced by the build that should be uploaded upon successful completion of all build steps.
     * 
     */
    private List<GetTriggerBuildArtifact> artifacts;
    /**
     * @return Secrets and secret environment variables.
     * 
     */
    private List<GetTriggerBuildAvailableSecret> availableSecrets;
    /**
     * @return A list of images to be pushed upon the successful completion of all build steps.
     * The images are pushed using the builder service account&#39;s credentials.
     * The digests of the pushed images will be stored in the Build resource&#39;s results field.
     * If any of the images fail to be pushed, the build status is marked FAILURE.
     * 
     */
    private List<String> images;
    /**
     * @return Google Cloud Storage bucket where logs should be written.
     * Logs file names will be of the format ${logsBucket}/log-${build_id}.txt.
     * 
     */
    private String logsBucket;
    /**
     * @return Special options for this build.
     * 
     */
    private List<GetTriggerBuildOption> options;
    /**
     * @return TTL in queue for this build. If provided and the build is enqueued longer than this value,
     * the build will expire and the build status will be EXPIRED.
     * The TTL starts ticking from createTime.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    private String queueTtl;
    /**
     * @return Secrets to decrypt using Cloud Key Management Service.
     * 
     */
    private List<GetTriggerBuildSecret> secrets;
    /**
     * @return The location of the source files to build.
     * 
     * One of &#39;storageSource&#39; or &#39;repoSource&#39; must be provided.
     * 
     */
    private List<GetTriggerBuildSource> sources;
    /**
     * @return The operations to be performed on the workspace.
     * 
     */
    private List<GetTriggerBuildStep> steps;
    /**
     * @return Substitutions data for Build resource.
     * 
     */
    private Map<String,String> substitutions;
    /**
     * @return Tags for annotation of a Build. These are not docker tags.
     * 
     */
    private List<String> tags;
    /**
     * @return Amount of time that this build should be allowed to run, to second granularity.
     * If this amount of time elapses, work on the build will cease and the build status will be TIMEOUT.
     * This timeout must be equal to or greater than the sum of the timeouts for build steps within the build.
     * The expected format is the number of seconds followed by s.
     * Default time is ten minutes (600s).
     * 
     */
    private String timeout;

    private GetTriggerBuild() {}
    /**
     * @return Artifacts produced by the build that should be uploaded upon successful completion of all build steps.
     * 
     */
    public List<GetTriggerBuildArtifact> artifacts() {
        return this.artifacts;
    }
    /**
     * @return Secrets and secret environment variables.
     * 
     */
    public List<GetTriggerBuildAvailableSecret> availableSecrets() {
        return this.availableSecrets;
    }
    /**
     * @return A list of images to be pushed upon the successful completion of all build steps.
     * The images are pushed using the builder service account&#39;s credentials.
     * The digests of the pushed images will be stored in the Build resource&#39;s results field.
     * If any of the images fail to be pushed, the build status is marked FAILURE.
     * 
     */
    public List<String> images() {
        return this.images;
    }
    /**
     * @return Google Cloud Storage bucket where logs should be written.
     * Logs file names will be of the format ${logsBucket}/log-${build_id}.txt.
     * 
     */
    public String logsBucket() {
        return this.logsBucket;
    }
    /**
     * @return Special options for this build.
     * 
     */
    public List<GetTriggerBuildOption> options() {
        return this.options;
    }
    /**
     * @return TTL in queue for this build. If provided and the build is enqueued longer than this value,
     * the build will expire and the build status will be EXPIRED.
     * The TTL starts ticking from createTime.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public String queueTtl() {
        return this.queueTtl;
    }
    /**
     * @return Secrets to decrypt using Cloud Key Management Service.
     * 
     */
    public List<GetTriggerBuildSecret> secrets() {
        return this.secrets;
    }
    /**
     * @return The location of the source files to build.
     * 
     * One of &#39;storageSource&#39; or &#39;repoSource&#39; must be provided.
     * 
     */
    public List<GetTriggerBuildSource> sources() {
        return this.sources;
    }
    /**
     * @return The operations to be performed on the workspace.
     * 
     */
    public List<GetTriggerBuildStep> steps() {
        return this.steps;
    }
    /**
     * @return Substitutions data for Build resource.
     * 
     */
    public Map<String,String> substitutions() {
        return this.substitutions;
    }
    /**
     * @return Tags for annotation of a Build. These are not docker tags.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return Amount of time that this build should be allowed to run, to second granularity.
     * If this amount of time elapses, work on the build will cease and the build status will be TIMEOUT.
     * This timeout must be equal to or greater than the sum of the timeouts for build steps within the build.
     * The expected format is the number of seconds followed by s.
     * Default time is ten minutes (600s).
     * 
     */
    public String timeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerBuild defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTriggerBuildArtifact> artifacts;
        private List<GetTriggerBuildAvailableSecret> availableSecrets;
        private List<String> images;
        private String logsBucket;
        private List<GetTriggerBuildOption> options;
        private String queueTtl;
        private List<GetTriggerBuildSecret> secrets;
        private List<GetTriggerBuildSource> sources;
        private List<GetTriggerBuildStep> steps;
        private Map<String,String> substitutions;
        private List<String> tags;
        private String timeout;
        public Builder() {}
        public Builder(GetTriggerBuild defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifacts = defaults.artifacts;
    	      this.availableSecrets = defaults.availableSecrets;
    	      this.images = defaults.images;
    	      this.logsBucket = defaults.logsBucket;
    	      this.options = defaults.options;
    	      this.queueTtl = defaults.queueTtl;
    	      this.secrets = defaults.secrets;
    	      this.sources = defaults.sources;
    	      this.steps = defaults.steps;
    	      this.substitutions = defaults.substitutions;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder artifacts(List<GetTriggerBuildArtifact> artifacts) {
            if (artifacts == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuild", "artifacts");
            }
            this.artifacts = artifacts;
            return this;
        }
        public Builder artifacts(GetTriggerBuildArtifact... artifacts) {
            return artifacts(List.of(artifacts));
        }
        @CustomType.Setter
        public Builder availableSecrets(List<GetTriggerBuildAvailableSecret> availableSecrets) {
            if (availableSecrets == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuild", "availableSecrets");
            }
            this.availableSecrets = availableSecrets;
            return this;
        }
        public Builder availableSecrets(GetTriggerBuildAvailableSecret... availableSecrets) {
            return availableSecrets(List.of(availableSecrets));
        }
        @CustomType.Setter
        public Builder images(List<String> images) {
            if (images == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuild", "images");
            }
            this.images = images;
            return this;
        }
        public Builder images(String... images) {
            return images(List.of(images));
        }
        @CustomType.Setter
        public Builder logsBucket(String logsBucket) {
            if (logsBucket == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuild", "logsBucket");
            }
            this.logsBucket = logsBucket;
            return this;
        }
        @CustomType.Setter
        public Builder options(List<GetTriggerBuildOption> options) {
            if (options == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuild", "options");
            }
            this.options = options;
            return this;
        }
        public Builder options(GetTriggerBuildOption... options) {
            return options(List.of(options));
        }
        @CustomType.Setter
        public Builder queueTtl(String queueTtl) {
            if (queueTtl == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuild", "queueTtl");
            }
            this.queueTtl = queueTtl;
            return this;
        }
        @CustomType.Setter
        public Builder secrets(List<GetTriggerBuildSecret> secrets) {
            if (secrets == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuild", "secrets");
            }
            this.secrets = secrets;
            return this;
        }
        public Builder secrets(GetTriggerBuildSecret... secrets) {
            return secrets(List.of(secrets));
        }
        @CustomType.Setter
        public Builder sources(List<GetTriggerBuildSource> sources) {
            if (sources == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuild", "sources");
            }
            this.sources = sources;
            return this;
        }
        public Builder sources(GetTriggerBuildSource... sources) {
            return sources(List.of(sources));
        }
        @CustomType.Setter
        public Builder steps(List<GetTriggerBuildStep> steps) {
            if (steps == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuild", "steps");
            }
            this.steps = steps;
            return this;
        }
        public Builder steps(GetTriggerBuildStep... steps) {
            return steps(List.of(steps));
        }
        @CustomType.Setter
        public Builder substitutions(Map<String,String> substitutions) {
            if (substitutions == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuild", "substitutions");
            }
            this.substitutions = substitutions;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuild", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder timeout(String timeout) {
            if (timeout == null) {
              throw new MissingRequiredPropertyException("GetTriggerBuild", "timeout");
            }
            this.timeout = timeout;
            return this;
        }
        public GetTriggerBuild build() {
            final var _resultValue = new GetTriggerBuild();
            _resultValue.artifacts = artifacts;
            _resultValue.availableSecrets = availableSecrets;
            _resultValue.images = images;
            _resultValue.logsBucket = logsBucket;
            _resultValue.options = options;
            _resultValue.queueTtl = queueTtl;
            _resultValue.secrets = secrets;
            _resultValue.sources = sources;
            _resultValue.steps = steps;
            _resultValue.substitutions = substitutions;
            _resultValue.tags = tags;
            _resultValue.timeout = timeout;
            return _resultValue;
        }
    }
}
