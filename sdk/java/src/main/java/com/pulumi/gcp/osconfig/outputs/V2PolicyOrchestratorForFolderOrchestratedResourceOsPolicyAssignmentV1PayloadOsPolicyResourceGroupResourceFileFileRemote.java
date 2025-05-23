// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileRemote {
    /**
     * @return SHA256 checksum of the remote file.
     * 
     */
    private @Nullable String sha256Checksum;
    /**
     * @return URI from which to fetch the object. It should contain both the
     * protocol and path following the format `{protocol}://{location}`.
     * 
     */
    private String uri;

    private V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileRemote() {}
    /**
     * @return SHA256 checksum of the remote file.
     * 
     */
    public Optional<String> sha256Checksum() {
        return Optional.ofNullable(this.sha256Checksum);
    }
    /**
     * @return URI from which to fetch the object. It should contain both the
     * protocol and path following the format `{protocol}://{location}`.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileRemote defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String sha256Checksum;
        private String uri;
        public Builder() {}
        public Builder(V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileRemote defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sha256Checksum = defaults.sha256Checksum;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder sha256Checksum(@Nullable String sha256Checksum) {

            this.sha256Checksum = sha256Checksum;
            return this;
        }
        @CustomType.Setter
        public Builder uri(String uri) {
            if (uri == null) {
              throw new MissingRequiredPropertyException("V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileRemote", "uri");
            }
            this.uri = uri;
            return this;
        }
        public V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileRemote build() {
            final var _resultValue = new V2PolicyOrchestratorForFolderOrchestratedResourceOsPolicyAssignmentV1PayloadOsPolicyResourceGroupResourceFileFileRemote();
            _resultValue.sha256Checksum = sha256Checksum;
            _resultValue.uri = uri;
            return _resultValue;
        }
    }
}
