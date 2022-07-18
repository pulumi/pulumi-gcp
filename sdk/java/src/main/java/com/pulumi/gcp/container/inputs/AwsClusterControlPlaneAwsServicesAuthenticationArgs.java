// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsClusterControlPlaneAwsServicesAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsClusterControlPlaneAwsServicesAuthenticationArgs Empty = new AwsClusterControlPlaneAwsServicesAuthenticationArgs();

    /**
     * The Amazon Resource Name (ARN) of the role that the Anthos Multi-Cloud API will assume when managing AWS resources on your account.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the role that the Anthos Multi-Cloud API will assume when managing AWS resources on your account.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * Optional. An identifier for the assumed role session. When unspecified, it defaults to `multicloud-service-agent`.
     * 
     */
    @Import(name="roleSessionName")
    private @Nullable Output<String> roleSessionName;

    /**
     * @return Optional. An identifier for the assumed role session. When unspecified, it defaults to `multicloud-service-agent`.
     * 
     */
    public Optional<Output<String>> roleSessionName() {
        return Optional.ofNullable(this.roleSessionName);
    }

    private AwsClusterControlPlaneAwsServicesAuthenticationArgs() {}

    private AwsClusterControlPlaneAwsServicesAuthenticationArgs(AwsClusterControlPlaneAwsServicesAuthenticationArgs $) {
        this.roleArn = $.roleArn;
        this.roleSessionName = $.roleSessionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsClusterControlPlaneAwsServicesAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsClusterControlPlaneAwsServicesAuthenticationArgs $;

        public Builder() {
            $ = new AwsClusterControlPlaneAwsServicesAuthenticationArgs();
        }

        public Builder(AwsClusterControlPlaneAwsServicesAuthenticationArgs defaults) {
            $ = new AwsClusterControlPlaneAwsServicesAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param roleArn The Amazon Resource Name (ARN) of the role that the Anthos Multi-Cloud API will assume when managing AWS resources on your account.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The Amazon Resource Name (ARN) of the role that the Anthos Multi-Cloud API will assume when managing AWS resources on your account.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param roleSessionName Optional. An identifier for the assumed role session. When unspecified, it defaults to `multicloud-service-agent`.
         * 
         * @return builder
         * 
         */
        public Builder roleSessionName(@Nullable Output<String> roleSessionName) {
            $.roleSessionName = roleSessionName;
            return this;
        }

        /**
         * @param roleSessionName Optional. An identifier for the assumed role session. When unspecified, it defaults to `multicloud-service-agent`.
         * 
         * @return builder
         * 
         */
        public Builder roleSessionName(String roleSessionName) {
            return roleSessionName(Output.of(roleSessionName));
        }

        public AwsClusterControlPlaneAwsServicesAuthenticationArgs build() {
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}