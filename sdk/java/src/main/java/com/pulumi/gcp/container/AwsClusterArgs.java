// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.container.inputs.AwsClusterAuthorizationArgs;
import com.pulumi.gcp.container.inputs.AwsClusterControlPlaneArgs;
import com.pulumi.gcp.container.inputs.AwsClusterFleetArgs;
import com.pulumi.gcp.container.inputs.AwsClusterLoggingConfigArgs;
import com.pulumi.gcp.container.inputs.AwsClusterNetworkingArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsClusterArgs Empty = new AwsClusterArgs();

    /**
     * Optional. Annotations on the cluster. This field has the same restrictions as Kubernetes annotations. The total size of all keys and values combined is limited to 256k. Key can have 2 segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Optional. Annotations on the cluster. This field has the same restrictions as Kubernetes annotations. The total size of all keys and values combined is limited to 256k. Key can have 2 segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Configuration related to the cluster RBAC settings.
     * 
     */
    @Import(name="authorization", required=true)
    private Output<AwsClusterAuthorizationArgs> authorization;

    /**
     * @return Configuration related to the cluster RBAC settings.
     * 
     */
    public Output<AwsClusterAuthorizationArgs> authorization() {
        return this.authorization;
    }

    /**
     * The AWS region where the cluster runs. Each Google Cloud region supports a subset of nearby AWS regions. You can call to list all supported AWS regions within a given Google Cloud region.
     * 
     */
    @Import(name="awsRegion", required=true)
    private Output<String> awsRegion;

    /**
     * @return The AWS region where the cluster runs. Each Google Cloud region supports a subset of nearby AWS regions. You can call to list all supported AWS regions within a given Google Cloud region.
     * 
     */
    public Output<String> awsRegion() {
        return this.awsRegion;
    }

    /**
     * Configuration related to the cluster control plane.
     * 
     */
    @Import(name="controlPlane", required=true)
    private Output<AwsClusterControlPlaneArgs> controlPlane;

    /**
     * @return Configuration related to the cluster control plane.
     * 
     */
    public Output<AwsClusterControlPlaneArgs> controlPlane() {
        return this.controlPlane;
    }

    /**
     * Optional. A human readable description of this cluster. Cannot be longer than 255 UTF-8 encoded bytes.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. A human readable description of this cluster. Cannot be longer than 255 UTF-8 encoded bytes.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Fleet configuration.
     * 
     */
    @Import(name="fleet", required=true)
    private Output<AwsClusterFleetArgs> fleet;

    /**
     * @return Fleet configuration.
     * 
     */
    public Output<AwsClusterFleetArgs> fleet() {
        return this.fleet;
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * (Beta only) Logging configuration.
     * 
     */
    @Import(name="loggingConfig")
    private @Nullable Output<AwsClusterLoggingConfigArgs> loggingConfig;

    /**
     * @return (Beta only) Logging configuration.
     * 
     */
    public Optional<Output<AwsClusterLoggingConfigArgs>> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }

    /**
     * The name of this resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of this resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Cluster-wide networking configuration.
     * 
     */
    @Import(name="networking", required=true)
    private Output<AwsClusterNetworkingArgs> networking;

    /**
     * @return Cluster-wide networking configuration.
     * 
     */
    public Output<AwsClusterNetworkingArgs> networking() {
        return this.networking;
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private AwsClusterArgs() {}

    private AwsClusterArgs(AwsClusterArgs $) {
        this.annotations = $.annotations;
        this.authorization = $.authorization;
        this.awsRegion = $.awsRegion;
        this.controlPlane = $.controlPlane;
        this.description = $.description;
        this.fleet = $.fleet;
        this.location = $.location;
        this.loggingConfig = $.loggingConfig;
        this.name = $.name;
        this.networking = $.networking;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsClusterArgs $;

        public Builder() {
            $ = new AwsClusterArgs();
        }

        public Builder(AwsClusterArgs defaults) {
            $ = new AwsClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Optional. Annotations on the cluster. This field has the same restrictions as Kubernetes annotations. The total size of all keys and values combined is limited to 256k. Key can have 2 segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Optional. Annotations on the cluster. This field has the same restrictions as Kubernetes annotations. The total size of all keys and values combined is limited to 256k. Key can have 2 segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param authorization Configuration related to the cluster RBAC settings.
         * 
         * @return builder
         * 
         */
        public Builder authorization(Output<AwsClusterAuthorizationArgs> authorization) {
            $.authorization = authorization;
            return this;
        }

        /**
         * @param authorization Configuration related to the cluster RBAC settings.
         * 
         * @return builder
         * 
         */
        public Builder authorization(AwsClusterAuthorizationArgs authorization) {
            return authorization(Output.of(authorization));
        }

        /**
         * @param awsRegion The AWS region where the cluster runs. Each Google Cloud region supports a subset of nearby AWS regions. You can call to list all supported AWS regions within a given Google Cloud region.
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(Output<String> awsRegion) {
            $.awsRegion = awsRegion;
            return this;
        }

        /**
         * @param awsRegion The AWS region where the cluster runs. Each Google Cloud region supports a subset of nearby AWS regions. You can call to list all supported AWS regions within a given Google Cloud region.
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(String awsRegion) {
            return awsRegion(Output.of(awsRegion));
        }

        /**
         * @param controlPlane Configuration related to the cluster control plane.
         * 
         * @return builder
         * 
         */
        public Builder controlPlane(Output<AwsClusterControlPlaneArgs> controlPlane) {
            $.controlPlane = controlPlane;
            return this;
        }

        /**
         * @param controlPlane Configuration related to the cluster control plane.
         * 
         * @return builder
         * 
         */
        public Builder controlPlane(AwsClusterControlPlaneArgs controlPlane) {
            return controlPlane(Output.of(controlPlane));
        }

        /**
         * @param description Optional. A human readable description of this cluster. Cannot be longer than 255 UTF-8 encoded bytes.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. A human readable description of this cluster. Cannot be longer than 255 UTF-8 encoded bytes.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fleet Fleet configuration.
         * 
         * @return builder
         * 
         */
        public Builder fleet(Output<AwsClusterFleetArgs> fleet) {
            $.fleet = fleet;
            return this;
        }

        /**
         * @param fleet Fleet configuration.
         * 
         * @return builder
         * 
         */
        public Builder fleet(AwsClusterFleetArgs fleet) {
            return fleet(Output.of(fleet));
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param loggingConfig (Beta only) Logging configuration.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(@Nullable Output<AwsClusterLoggingConfigArgs> loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        /**
         * @param loggingConfig (Beta only) Logging configuration.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(AwsClusterLoggingConfigArgs loggingConfig) {
            return loggingConfig(Output.of(loggingConfig));
        }

        /**
         * @param name The name of this resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networking Cluster-wide networking configuration.
         * 
         * @return builder
         * 
         */
        public Builder networking(Output<AwsClusterNetworkingArgs> networking) {
            $.networking = networking;
            return this;
        }

        /**
         * @param networking Cluster-wide networking configuration.
         * 
         * @return builder
         * 
         */
        public Builder networking(AwsClusterNetworkingArgs networking) {
            return networking(Output.of(networking));
        }

        /**
         * @param project The project for the resource
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project for the resource
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public AwsClusterArgs build() {
            $.authorization = Objects.requireNonNull($.authorization, "expected parameter 'authorization' to be non-null");
            $.awsRegion = Objects.requireNonNull($.awsRegion, "expected parameter 'awsRegion' to be non-null");
            $.controlPlane = Objects.requireNonNull($.controlPlane, "expected parameter 'controlPlane' to be non-null");
            $.fleet = Objects.requireNonNull($.fleet, "expected parameter 'fleet' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.networking = Objects.requireNonNull($.networking, "expected parameter 'networking' to be non-null");
            return $;
        }
    }

}