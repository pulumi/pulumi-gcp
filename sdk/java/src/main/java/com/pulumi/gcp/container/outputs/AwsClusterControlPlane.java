// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.AwsClusterControlPlaneAwsServicesAuthentication;
import com.pulumi.gcp.container.outputs.AwsClusterControlPlaneConfigEncryption;
import com.pulumi.gcp.container.outputs.AwsClusterControlPlaneDatabaseEncryption;
import com.pulumi.gcp.container.outputs.AwsClusterControlPlaneInstancePlacement;
import com.pulumi.gcp.container.outputs.AwsClusterControlPlaneMainVolume;
import com.pulumi.gcp.container.outputs.AwsClusterControlPlaneProxyConfig;
import com.pulumi.gcp.container.outputs.AwsClusterControlPlaneRootVolume;
import com.pulumi.gcp.container.outputs.AwsClusterControlPlaneSshConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AwsClusterControlPlane {
    /**
     * @return Authentication configuration for management of AWS resources.
     * 
     */
    private final AwsClusterControlPlaneAwsServicesAuthentication awsServicesAuthentication;
    /**
     * @return The ARN of the AWS KMS key used to encrypt cluster configuration.
     * 
     */
    private final AwsClusterControlPlaneConfigEncryption configEncryption;
    /**
     * @return The ARN of the AWS KMS key used to encrypt cluster secrets.
     * 
     */
    private final AwsClusterControlPlaneDatabaseEncryption databaseEncryption;
    /**
     * @return The name of the AWS IAM instance pofile to assign to each control plane replica.
     * 
     */
    private final String iamInstanceProfile;
    /**
     * @return (Beta only) Details of placement information for an instance.
     * 
     */
    private final @Nullable AwsClusterControlPlaneInstancePlacement instancePlacement;
    /**
     * @return Optional. The AWS instance type. When unspecified, it defaults to `m5.large`.
     * 
     */
    private final @Nullable String instanceType;
    /**
     * @return Optional. Configuration related to the main volume provisioned for each control plane replica. The main volume is in charge of storing all of the cluster&#39;s etcd state. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 8 GiB with the GP2 volume type.
     * 
     */
    private final @Nullable AwsClusterControlPlaneMainVolume mainVolume;
    /**
     * @return Proxy configuration for outbound HTTP(S) traffic.
     * 
     */
    private final @Nullable AwsClusterControlPlaneProxyConfig proxyConfig;
    /**
     * @return Optional. Configuration related to the root volume provisioned for each control plane replica. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
     * 
     */
    private final @Nullable AwsClusterControlPlaneRootVolume rootVolume;
    /**
     * @return Optional. The IDs of additional security groups to add to control plane replicas. The Anthos Multi-Cloud API will automatically create and manage security groups with the minimum rules needed for a functioning cluster.
     * 
     */
    private final @Nullable List<String> securityGroupIds;
    /**
     * @return Optional. SSH configuration for how to access the underlying control plane machines.
     * 
     */
    private final @Nullable AwsClusterControlPlaneSshConfig sshConfig;
    /**
     * @return The list of subnets where control plane replicas will run. A replica will be provisioned on each subnet and up to three values can be provided. Each subnet must be in a different AWS Availability Zone (AZ).
     * 
     */
    private final List<String> subnetIds;
    /**
     * @return Optional. A set of AWS resource tags to propagate to all underlying managed AWS resources. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The Kubernetes version to run on control plane replicas (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling .
     * 
     */
    private final String version;

    @CustomType.Constructor
    private AwsClusterControlPlane(
        @CustomType.Parameter("awsServicesAuthentication") AwsClusterControlPlaneAwsServicesAuthentication awsServicesAuthentication,
        @CustomType.Parameter("configEncryption") AwsClusterControlPlaneConfigEncryption configEncryption,
        @CustomType.Parameter("databaseEncryption") AwsClusterControlPlaneDatabaseEncryption databaseEncryption,
        @CustomType.Parameter("iamInstanceProfile") String iamInstanceProfile,
        @CustomType.Parameter("instancePlacement") @Nullable AwsClusterControlPlaneInstancePlacement instancePlacement,
        @CustomType.Parameter("instanceType") @Nullable String instanceType,
        @CustomType.Parameter("mainVolume") @Nullable AwsClusterControlPlaneMainVolume mainVolume,
        @CustomType.Parameter("proxyConfig") @Nullable AwsClusterControlPlaneProxyConfig proxyConfig,
        @CustomType.Parameter("rootVolume") @Nullable AwsClusterControlPlaneRootVolume rootVolume,
        @CustomType.Parameter("securityGroupIds") @Nullable List<String> securityGroupIds,
        @CustomType.Parameter("sshConfig") @Nullable AwsClusterControlPlaneSshConfig sshConfig,
        @CustomType.Parameter("subnetIds") List<String> subnetIds,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("version") String version) {
        this.awsServicesAuthentication = awsServicesAuthentication;
        this.configEncryption = configEncryption;
        this.databaseEncryption = databaseEncryption;
        this.iamInstanceProfile = iamInstanceProfile;
        this.instancePlacement = instancePlacement;
        this.instanceType = instanceType;
        this.mainVolume = mainVolume;
        this.proxyConfig = proxyConfig;
        this.rootVolume = rootVolume;
        this.securityGroupIds = securityGroupIds;
        this.sshConfig = sshConfig;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.version = version;
    }

    /**
     * @return Authentication configuration for management of AWS resources.
     * 
     */
    public AwsClusterControlPlaneAwsServicesAuthentication awsServicesAuthentication() {
        return this.awsServicesAuthentication;
    }
    /**
     * @return The ARN of the AWS KMS key used to encrypt cluster configuration.
     * 
     */
    public AwsClusterControlPlaneConfigEncryption configEncryption() {
        return this.configEncryption;
    }
    /**
     * @return The ARN of the AWS KMS key used to encrypt cluster secrets.
     * 
     */
    public AwsClusterControlPlaneDatabaseEncryption databaseEncryption() {
        return this.databaseEncryption;
    }
    /**
     * @return The name of the AWS IAM instance pofile to assign to each control plane replica.
     * 
     */
    public String iamInstanceProfile() {
        return this.iamInstanceProfile;
    }
    /**
     * @return (Beta only) Details of placement information for an instance.
     * 
     */
    public Optional<AwsClusterControlPlaneInstancePlacement> instancePlacement() {
        return Optional.ofNullable(this.instancePlacement);
    }
    /**
     * @return Optional. The AWS instance type. When unspecified, it defaults to `m5.large`.
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return Optional. Configuration related to the main volume provisioned for each control plane replica. The main volume is in charge of storing all of the cluster&#39;s etcd state. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 8 GiB with the GP2 volume type.
     * 
     */
    public Optional<AwsClusterControlPlaneMainVolume> mainVolume() {
        return Optional.ofNullable(this.mainVolume);
    }
    /**
     * @return Proxy configuration for outbound HTTP(S) traffic.
     * 
     */
    public Optional<AwsClusterControlPlaneProxyConfig> proxyConfig() {
        return Optional.ofNullable(this.proxyConfig);
    }
    /**
     * @return Optional. Configuration related to the root volume provisioned for each control plane replica. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
     * 
     */
    public Optional<AwsClusterControlPlaneRootVolume> rootVolume() {
        return Optional.ofNullable(this.rootVolume);
    }
    /**
     * @return Optional. The IDs of additional security groups to add to control plane replicas. The Anthos Multi-Cloud API will automatically create and manage security groups with the minimum rules needed for a functioning cluster.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    /**
     * @return Optional. SSH configuration for how to access the underlying control plane machines.
     * 
     */
    public Optional<AwsClusterControlPlaneSshConfig> sshConfig() {
        return Optional.ofNullable(this.sshConfig);
    }
    /**
     * @return The list of subnets where control plane replicas will run. A replica will be provisioned on each subnet and up to three values can be provided. Each subnet must be in a different AWS Availability Zone (AZ).
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    /**
     * @return Optional. A set of AWS resource tags to propagate to all underlying managed AWS resources. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The Kubernetes version to run on control plane replicas (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling .
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterControlPlane defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsClusterControlPlaneAwsServicesAuthentication awsServicesAuthentication;
        private AwsClusterControlPlaneConfigEncryption configEncryption;
        private AwsClusterControlPlaneDatabaseEncryption databaseEncryption;
        private String iamInstanceProfile;
        private @Nullable AwsClusterControlPlaneInstancePlacement instancePlacement;
        private @Nullable String instanceType;
        private @Nullable AwsClusterControlPlaneMainVolume mainVolume;
        private @Nullable AwsClusterControlPlaneProxyConfig proxyConfig;
        private @Nullable AwsClusterControlPlaneRootVolume rootVolume;
        private @Nullable List<String> securityGroupIds;
        private @Nullable AwsClusterControlPlaneSshConfig sshConfig;
        private List<String> subnetIds;
        private @Nullable Map<String,String> tags;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterControlPlane defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsServicesAuthentication = defaults.awsServicesAuthentication;
    	      this.configEncryption = defaults.configEncryption;
    	      this.databaseEncryption = defaults.databaseEncryption;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.instancePlacement = defaults.instancePlacement;
    	      this.instanceType = defaults.instanceType;
    	      this.mainVolume = defaults.mainVolume;
    	      this.proxyConfig = defaults.proxyConfig;
    	      this.rootVolume = defaults.rootVolume;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.sshConfig = defaults.sshConfig;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        public Builder awsServicesAuthentication(AwsClusterControlPlaneAwsServicesAuthentication awsServicesAuthentication) {
            this.awsServicesAuthentication = Objects.requireNonNull(awsServicesAuthentication);
            return this;
        }
        public Builder configEncryption(AwsClusterControlPlaneConfigEncryption configEncryption) {
            this.configEncryption = Objects.requireNonNull(configEncryption);
            return this;
        }
        public Builder databaseEncryption(AwsClusterControlPlaneDatabaseEncryption databaseEncryption) {
            this.databaseEncryption = Objects.requireNonNull(databaseEncryption);
            return this;
        }
        public Builder iamInstanceProfile(String iamInstanceProfile) {
            this.iamInstanceProfile = Objects.requireNonNull(iamInstanceProfile);
            return this;
        }
        public Builder instancePlacement(@Nullable AwsClusterControlPlaneInstancePlacement instancePlacement) {
            this.instancePlacement = instancePlacement;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder mainVolume(@Nullable AwsClusterControlPlaneMainVolume mainVolume) {
            this.mainVolume = mainVolume;
            return this;
        }
        public Builder proxyConfig(@Nullable AwsClusterControlPlaneProxyConfig proxyConfig) {
            this.proxyConfig = proxyConfig;
            return this;
        }
        public Builder rootVolume(@Nullable AwsClusterControlPlaneRootVolume rootVolume) {
            this.rootVolume = rootVolume;
            return this;
        }
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder sshConfig(@Nullable AwsClusterControlPlaneSshConfig sshConfig) {
            this.sshConfig = sshConfig;
            return this;
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public AwsClusterControlPlane build() {
            return new AwsClusterControlPlane(awsServicesAuthentication, configEncryption, databaseEncryption, iamInstanceProfile, instancePlacement, instanceType, mainVolume, proxyConfig, rootVolume, securityGroupIds, sshConfig, subnetIds, tags, version);
        }
    }
}