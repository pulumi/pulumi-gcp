// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterClusterOperationsArgs;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneArgs;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerArgs;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterMaintenanceConfigArgs;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNetworkConfigArgs;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNodeAccessConfigArgs;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNodeConfigArgs;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterProxyArgs;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterSecurityConfigArgs;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStorageArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BareMetalAdminClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final BareMetalAdminClusterArgs Empty = new BareMetalAdminClusterArgs();

    /**
     * Annotations on the Bare Metal Admin Cluster.
     * This field has the same restrictions as Kubernetes annotations.
     * The total size of all keys and values combined is limited to 256k.
     * Key can have 2 segments: prefix (optional) and name (required),
     * separated by a slash (/).
     * Prefix must be a DNS subdomain.
     * Name must be 63 characters or less, begin and end with alphanumerics,
     * with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Annotations on the Bare Metal Admin Cluster.
     * This field has the same restrictions as Kubernetes annotations.
     * The total size of all keys and values combined is limited to 256k.
     * Key can have 2 segments: prefix (optional) and name (required),
     * separated by a slash (/).
     * Prefix must be a DNS subdomain.
     * Name must be 63 characters or less, begin and end with alphanumerics,
     * with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * A human readable description of this Bare Metal Admin Cluster.
     * 
     */
    @Import(name="bareMetalVersion")
    private @Nullable Output<String> bareMetalVersion;

    /**
     * @return A human readable description of this Bare Metal Admin Cluster.
     * 
     */
    public Optional<Output<String>> bareMetalVersion() {
        return Optional.ofNullable(this.bareMetalVersion);
    }

    /**
     * Specifies the Admin Cluster&#39;s observability infrastructure.
     * Structure is documented below.
     * 
     */
    @Import(name="clusterOperations")
    private @Nullable Output<BareMetalAdminClusterClusterOperationsArgs> clusterOperations;

    /**
     * @return Specifies the Admin Cluster&#39;s observability infrastructure.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BareMetalAdminClusterClusterOperationsArgs>> clusterOperations() {
        return Optional.ofNullable(this.clusterOperations);
    }

    /**
     * Specifies the control plane configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="controlPlane")
    private @Nullable Output<BareMetalAdminClusterControlPlaneArgs> controlPlane;

    /**
     * @return Specifies the control plane configuration.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BareMetalAdminClusterControlPlaneArgs>> controlPlane() {
        return Optional.ofNullable(this.controlPlane);
    }

    /**
     * A human readable description of this Bare Metal Admin Cluster.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A human readable description of this Bare Metal Admin Cluster.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the load balancer configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="loadBalancer")
    private @Nullable Output<BareMetalAdminClusterLoadBalancerArgs> loadBalancer;

    /**
     * @return Specifies the load balancer configuration.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BareMetalAdminClusterLoadBalancerArgs>> loadBalancer() {
        return Optional.ofNullable(this.loadBalancer);
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * Specifies the workload node configurations.
     * Structure is documented below.
     * 
     */
    @Import(name="maintenanceConfig")
    private @Nullable Output<BareMetalAdminClusterMaintenanceConfigArgs> maintenanceConfig;

    /**
     * @return Specifies the workload node configurations.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BareMetalAdminClusterMaintenanceConfigArgs>> maintenanceConfig() {
        return Optional.ofNullable(this.maintenanceConfig);
    }

    /**
     * The bare metal admin cluster name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The bare metal admin cluster name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Network configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="networkConfig")
    private @Nullable Output<BareMetalAdminClusterNetworkConfigArgs> networkConfig;

    /**
     * @return Network configuration.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BareMetalAdminClusterNetworkConfigArgs>> networkConfig() {
        return Optional.ofNullable(this.networkConfig);
    }

    /**
     * Specifies the node access related settings for the bare metal user cluster.
     * Structure is documented below.
     * 
     */
    @Import(name="nodeAccessConfig")
    private @Nullable Output<BareMetalAdminClusterNodeAccessConfigArgs> nodeAccessConfig;

    /**
     * @return Specifies the node access related settings for the bare metal user cluster.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BareMetalAdminClusterNodeAccessConfigArgs>> nodeAccessConfig() {
        return Optional.ofNullable(this.nodeAccessConfig);
    }

    /**
     * Specifies the workload node configurations.
     * Structure is documented below.
     * 
     */
    @Import(name="nodeConfig")
    private @Nullable Output<BareMetalAdminClusterNodeConfigArgs> nodeConfig;

    /**
     * @return Specifies the workload node configurations.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BareMetalAdminClusterNodeConfigArgs>> nodeConfig() {
        return Optional.ofNullable(this.nodeConfig);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Specifies the cluster proxy configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="proxy")
    private @Nullable Output<BareMetalAdminClusterProxyArgs> proxy;

    /**
     * @return Specifies the cluster proxy configuration.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BareMetalAdminClusterProxyArgs>> proxy() {
        return Optional.ofNullable(this.proxy);
    }

    /**
     * Specifies the security related settings for the Bare Metal User Cluster.
     * Structure is documented below.
     * 
     */
    @Import(name="securityConfig")
    private @Nullable Output<BareMetalAdminClusterSecurityConfigArgs> securityConfig;

    /**
     * @return Specifies the security related settings for the Bare Metal User Cluster.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BareMetalAdminClusterSecurityConfigArgs>> securityConfig() {
        return Optional.ofNullable(this.securityConfig);
    }

    /**
     * Specifies the cluster storage configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="storage")
    private @Nullable Output<BareMetalAdminClusterStorageArgs> storage;

    /**
     * @return Specifies the cluster storage configuration.
     * Structure is documented below.
     * 
     */
    public Optional<Output<BareMetalAdminClusterStorageArgs>> storage() {
        return Optional.ofNullable(this.storage);
    }

    private BareMetalAdminClusterArgs() {}

    private BareMetalAdminClusterArgs(BareMetalAdminClusterArgs $) {
        this.annotations = $.annotations;
        this.bareMetalVersion = $.bareMetalVersion;
        this.clusterOperations = $.clusterOperations;
        this.controlPlane = $.controlPlane;
        this.description = $.description;
        this.loadBalancer = $.loadBalancer;
        this.location = $.location;
        this.maintenanceConfig = $.maintenanceConfig;
        this.name = $.name;
        this.networkConfig = $.networkConfig;
        this.nodeAccessConfig = $.nodeAccessConfig;
        this.nodeConfig = $.nodeConfig;
        this.project = $.project;
        this.proxy = $.proxy;
        this.securityConfig = $.securityConfig;
        this.storage = $.storage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BareMetalAdminClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BareMetalAdminClusterArgs $;

        public Builder() {
            $ = new BareMetalAdminClusterArgs();
        }

        public Builder(BareMetalAdminClusterArgs defaults) {
            $ = new BareMetalAdminClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Annotations on the Bare Metal Admin Cluster.
         * This field has the same restrictions as Kubernetes annotations.
         * The total size of all keys and values combined is limited to 256k.
         * Key can have 2 segments: prefix (optional) and name (required),
         * separated by a slash (/).
         * Prefix must be a DNS subdomain.
         * Name must be 63 characters or less, begin and end with alphanumerics,
         * with dashes (-), underscores (_), dots (.), and alphanumerics between.
         * 
         * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
         * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations on the Bare Metal Admin Cluster.
         * This field has the same restrictions as Kubernetes annotations.
         * The total size of all keys and values combined is limited to 256k.
         * Key can have 2 segments: prefix (optional) and name (required),
         * separated by a slash (/).
         * Prefix must be a DNS subdomain.
         * Name must be 63 characters or less, begin and end with alphanumerics,
         * with dashes (-), underscores (_), dots (.), and alphanumerics between.
         * 
         * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
         * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param bareMetalVersion A human readable description of this Bare Metal Admin Cluster.
         * 
         * @return builder
         * 
         */
        public Builder bareMetalVersion(@Nullable Output<String> bareMetalVersion) {
            $.bareMetalVersion = bareMetalVersion;
            return this;
        }

        /**
         * @param bareMetalVersion A human readable description of this Bare Metal Admin Cluster.
         * 
         * @return builder
         * 
         */
        public Builder bareMetalVersion(String bareMetalVersion) {
            return bareMetalVersion(Output.of(bareMetalVersion));
        }

        /**
         * @param clusterOperations Specifies the Admin Cluster&#39;s observability infrastructure.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder clusterOperations(@Nullable Output<BareMetalAdminClusterClusterOperationsArgs> clusterOperations) {
            $.clusterOperations = clusterOperations;
            return this;
        }

        /**
         * @param clusterOperations Specifies the Admin Cluster&#39;s observability infrastructure.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder clusterOperations(BareMetalAdminClusterClusterOperationsArgs clusterOperations) {
            return clusterOperations(Output.of(clusterOperations));
        }

        /**
         * @param controlPlane Specifies the control plane configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder controlPlane(@Nullable Output<BareMetalAdminClusterControlPlaneArgs> controlPlane) {
            $.controlPlane = controlPlane;
            return this;
        }

        /**
         * @param controlPlane Specifies the control plane configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder controlPlane(BareMetalAdminClusterControlPlaneArgs controlPlane) {
            return controlPlane(Output.of(controlPlane));
        }

        /**
         * @param description A human readable description of this Bare Metal Admin Cluster.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A human readable description of this Bare Metal Admin Cluster.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param loadBalancer Specifies the load balancer configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancer(@Nullable Output<BareMetalAdminClusterLoadBalancerArgs> loadBalancer) {
            $.loadBalancer = loadBalancer;
            return this;
        }

        /**
         * @param loadBalancer Specifies the load balancer configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancer(BareMetalAdminClusterLoadBalancerArgs loadBalancer) {
            return loadBalancer(Output.of(loadBalancer));
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param maintenanceConfig Specifies the workload node configurations.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceConfig(@Nullable Output<BareMetalAdminClusterMaintenanceConfigArgs> maintenanceConfig) {
            $.maintenanceConfig = maintenanceConfig;
            return this;
        }

        /**
         * @param maintenanceConfig Specifies the workload node configurations.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceConfig(BareMetalAdminClusterMaintenanceConfigArgs maintenanceConfig) {
            return maintenanceConfig(Output.of(maintenanceConfig));
        }

        /**
         * @param name The bare metal admin cluster name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The bare metal admin cluster name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkConfig Network configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(@Nullable Output<BareMetalAdminClusterNetworkConfigArgs> networkConfig) {
            $.networkConfig = networkConfig;
            return this;
        }

        /**
         * @param networkConfig Network configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networkConfig(BareMetalAdminClusterNetworkConfigArgs networkConfig) {
            return networkConfig(Output.of(networkConfig));
        }

        /**
         * @param nodeAccessConfig Specifies the node access related settings for the bare metal user cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder nodeAccessConfig(@Nullable Output<BareMetalAdminClusterNodeAccessConfigArgs> nodeAccessConfig) {
            $.nodeAccessConfig = nodeAccessConfig;
            return this;
        }

        /**
         * @param nodeAccessConfig Specifies the node access related settings for the bare metal user cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder nodeAccessConfig(BareMetalAdminClusterNodeAccessConfigArgs nodeAccessConfig) {
            return nodeAccessConfig(Output.of(nodeAccessConfig));
        }

        /**
         * @param nodeConfig Specifies the workload node configurations.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder nodeConfig(@Nullable Output<BareMetalAdminClusterNodeConfigArgs> nodeConfig) {
            $.nodeConfig = nodeConfig;
            return this;
        }

        /**
         * @param nodeConfig Specifies the workload node configurations.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder nodeConfig(BareMetalAdminClusterNodeConfigArgs nodeConfig) {
            return nodeConfig(Output.of(nodeConfig));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param proxy Specifies the cluster proxy configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder proxy(@Nullable Output<BareMetalAdminClusterProxyArgs> proxy) {
            $.proxy = proxy;
            return this;
        }

        /**
         * @param proxy Specifies the cluster proxy configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder proxy(BareMetalAdminClusterProxyArgs proxy) {
            return proxy(Output.of(proxy));
        }

        /**
         * @param securityConfig Specifies the security related settings for the Bare Metal User Cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder securityConfig(@Nullable Output<BareMetalAdminClusterSecurityConfigArgs> securityConfig) {
            $.securityConfig = securityConfig;
            return this;
        }

        /**
         * @param securityConfig Specifies the security related settings for the Bare Metal User Cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder securityConfig(BareMetalAdminClusterSecurityConfigArgs securityConfig) {
            return securityConfig(Output.of(securityConfig));
        }

        /**
         * @param storage Specifies the cluster storage configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder storage(@Nullable Output<BareMetalAdminClusterStorageArgs> storage) {
            $.storage = storage;
            return this;
        }

        /**
         * @param storage Specifies the cluster storage configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder storage(BareMetalAdminClusterStorageArgs storage) {
            return storage(Output.of(storage));
        }

        public BareMetalAdminClusterArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("BareMetalAdminClusterArgs", "location");
            }
            return $;
        }
    }

}
