// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AwsClusterControlPlaneAwsServicesAuthentication {
    /**
     * @return The Amazon Resource Name (ARN) of the role that the Anthos Multi-Cloud API will assume when managing AWS resources on your account.
     * 
     */
    private final String roleArn;
    /**
     * @return Optional. An identifier for the assumed role session. When unspecified, it defaults to `multicloud-service-agent`.
     * 
     */
    private final @Nullable String roleSessionName;

    @CustomType.Constructor
    private AwsClusterControlPlaneAwsServicesAuthentication(
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("roleSessionName") @Nullable String roleSessionName) {
        this.roleArn = roleArn;
        this.roleSessionName = roleSessionName;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the role that the Anthos Multi-Cloud API will assume when managing AWS resources on your account.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return Optional. An identifier for the assumed role session. When unspecified, it defaults to `multicloud-service-agent`.
     * 
     */
    public Optional<String> roleSessionName() {
        return Optional.ofNullable(this.roleSessionName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterControlPlaneAwsServicesAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleArn;
        private @Nullable String roleSessionName;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterControlPlaneAwsServicesAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.roleSessionName = defaults.roleSessionName;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleSessionName(@Nullable String roleSessionName) {
            this.roleSessionName = roleSessionName;
            return this;
        }        public AwsClusterControlPlaneAwsServicesAuthentication build() {
            return new AwsClusterControlPlaneAwsServicesAuthentication(roleArn, roleSessionName);
        }
    }
}