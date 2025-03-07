// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.transcoder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobConfigInput {
    /**
     * @return A unique key for this input. Must be specified when using advanced mapping and edit lists.
     * 
     */
    private @Nullable String key;
    /**
     * @return URI of the media. Input files must be at least 5 seconds in duration and stored in Cloud Storage (for example, gs://bucket/inputs/file.mp4).
     * If empty, the value is populated from Job.input_uri.
     * 
     */
    private @Nullable String uri;

    private JobConfigInput() {}
    /**
     * @return A unique key for this input. Must be specified when using advanced mapping and edit lists.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return URI of the media. Input files must be at least 5 seconds in duration and stored in Cloud Storage (for example, gs://bucket/inputs/file.mp4).
     * If empty, the value is populated from Job.input_uri.
     * 
     */
    public Optional<String> uri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigInput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String key;
        private @Nullable String uri;
        public Builder() {}
        public Builder(JobConfigInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder key(@Nullable String key) {

            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder uri(@Nullable String uri) {

            this.uri = uri;
            return this;
        }
        public JobConfigInput build() {
            final var _resultValue = new JobConfigInput();
            _resultValue.key = key;
            _resultValue.uri = uri;
            return _resultValue;
        }
    }
}
