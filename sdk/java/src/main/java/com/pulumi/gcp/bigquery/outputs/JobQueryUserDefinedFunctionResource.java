// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobQueryUserDefinedFunctionResource {
    /**
     * @return An inline resource that contains code for a user-defined function (UDF).
     * Providing a inline code resource is equivalent to providing a URI for a file containing the same code.
     * 
     */
    private final @Nullable String inlineCode;
    /**
     * @return A code resource to load from a Google Cloud Storage URI (gs://bucket/path).
     * 
     */
    private final @Nullable String resourceUri;

    @CustomType.Constructor
    private JobQueryUserDefinedFunctionResource(
        @CustomType.Parameter("inlineCode") @Nullable String inlineCode,
        @CustomType.Parameter("resourceUri") @Nullable String resourceUri) {
        this.inlineCode = inlineCode;
        this.resourceUri = resourceUri;
    }

    /**
     * @return An inline resource that contains code for a user-defined function (UDF).
     * Providing a inline code resource is equivalent to providing a URI for a file containing the same code.
     * 
     */
    public Optional<String> inlineCode() {
        return Optional.ofNullable(this.inlineCode);
    }
    /**
     * @return A code resource to load from a Google Cloud Storage URI (gs://bucket/path).
     * 
     */
    public Optional<String> resourceUri() {
        return Optional.ofNullable(this.resourceUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobQueryUserDefinedFunctionResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String inlineCode;
        private @Nullable String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(JobQueryUserDefinedFunctionResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inlineCode = defaults.inlineCode;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder inlineCode(@Nullable String inlineCode) {
            this.inlineCode = inlineCode;
            return this;
        }
        public Builder resourceUri(@Nullable String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }        public JobQueryUserDefinedFunctionResource build() {
            return new JobQueryUserDefinedFunctionResource(inlineCode, resourceUri);
        }
    }
}