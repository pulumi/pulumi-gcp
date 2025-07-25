// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.oracledatabase.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudVmClusterState extends com.pulumi.resources.ResourceArgs {

    public static final CloudVmClusterState Empty = new CloudVmClusterState();

    /**
     * CIDR range of the backup subnet.
     * 
     */
    @Import(name="backupSubnetCidr")
    private @Nullable Output<String> backupSubnetCidr;

    /**
     * @return CIDR range of the backup subnet.
     * 
     */
    public Optional<Output<String>> backupSubnetCidr() {
        return Optional.ofNullable(this.backupSubnetCidr);
    }

    /**
     * Network settings. CIDR to use for cluster IP allocation.
     * 
     */
    @Import(name="cidr")
    private @Nullable Output<String> cidr;

    /**
     * @return Network settings. CIDR to use for cluster IP allocation.
     * 
     */
    public Optional<Output<String>> cidr() {
        return Optional.ofNullable(this.cidr);
    }

    /**
     * The ID of the VM Cluster to create. This value is restricted
     * to (^a-z?$) and must be a maximum of 63
     * characters in length. The value must start with a letter and end with
     * a letter or a number.
     * 
     */
    @Import(name="cloudVmClusterId")
    private @Nullable Output<String> cloudVmClusterId;

    /**
     * @return The ID of the VM Cluster to create. This value is restricted
     * to (^a-z?$) and must be a maximum of 63
     * characters in length. The value must start with a letter and end with
     * a letter or a number.
     * 
     */
    public Optional<Output<String>> cloudVmClusterId() {
        return Optional.ofNullable(this.cloudVmClusterId);
    }

    /**
     * The date and time that the VM cluster was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The date and time that the VM cluster was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    @Import(name="deletionProtection")
    private @Nullable Output<Boolean> deletionProtection;

    public Optional<Output<Boolean>> deletionProtection() {
        return Optional.ofNullable(this.deletionProtection);
    }

    /**
     * User friendly name for this resource.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return User friendly name for this resource.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Import(name="effectiveLabels")
    private @Nullable Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Optional<Output<Map<String,String>>> effectiveLabels() {
        return Optional.ofNullable(this.effectiveLabels);
    }

    /**
     * The name of the Exadata Infrastructure resource on which VM cluster
     * resource is created, in the following format:
     * projects/{project}/locations/{region}/cloudExadataInfrastuctures/{cloud_extradata_infrastructure}
     * 
     */
    @Import(name="exadataInfrastructure")
    private @Nullable Output<String> exadataInfrastructure;

    /**
     * @return The name of the Exadata Infrastructure resource on which VM cluster
     * resource is created, in the following format:
     * projects/{project}/locations/{region}/cloudExadataInfrastuctures/{cloud_extradata_infrastructure}
     * 
     */
    public Optional<Output<String>> exadataInfrastructure() {
        return Optional.ofNullable(this.exadataInfrastructure);
    }

    /**
     * GCP location where Oracle Exadata is hosted. It is same as GCP Oracle zone
     * of Exadata infrastructure.
     * 
     */
    @Import(name="gcpOracleZone")
    private @Nullable Output<String> gcpOracleZone;

    /**
     * @return GCP location where Oracle Exadata is hosted. It is same as GCP Oracle zone
     * of Exadata infrastructure.
     * 
     */
    public Optional<Output<String>> gcpOracleZone() {
        return Optional.ofNullable(this.gcpOracleZone);
    }

    /**
     * Labels or tags associated with the VM Cluster.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels or tags associated with the VM Cluster.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Resource ID segment making up resource `name`. See documentation for resource type `oracledatabase.googleapis.com/DbNode`.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource ID segment making up resource `name`. See documentation for resource type `oracledatabase.googleapis.com/DbNode`.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Identifier. The name of the VM Cluster resource with the format:
     * projects/{project}/locations/{region}/cloudVmClusters/{cloud_vm_cluster}
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Identifier. The name of the VM Cluster resource with the format:
     * projects/{project}/locations/{region}/cloudVmClusters/{cloud_vm_cluster}
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the VPC network.
     * Format: projects/{project}/global/networks/{network}
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return The name of the VPC network.
     * Format: projects/{project}/global/networks/{network}
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
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
     * Various properties and settings associated with Exadata VM cluster.
     * Structure is documented below.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<CloudVmClusterPropertiesArgs> properties;

    /**
     * @return Various properties and settings associated with Exadata VM cluster.
     * Structure is documented below.
     * 
     */
    public Optional<Output<CloudVmClusterPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Import(name="pulumiLabels")
    private @Nullable Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Optional<Output<Map<String,String>>> pulumiLabels() {
        return Optional.ofNullable(this.pulumiLabels);
    }

    private CloudVmClusterState() {}

    private CloudVmClusterState(CloudVmClusterState $) {
        this.backupSubnetCidr = $.backupSubnetCidr;
        this.cidr = $.cidr;
        this.cloudVmClusterId = $.cloudVmClusterId;
        this.createTime = $.createTime;
        this.deletionProtection = $.deletionProtection;
        this.displayName = $.displayName;
        this.effectiveLabels = $.effectiveLabels;
        this.exadataInfrastructure = $.exadataInfrastructure;
        this.gcpOracleZone = $.gcpOracleZone;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.network = $.network;
        this.project = $.project;
        this.properties = $.properties;
        this.pulumiLabels = $.pulumiLabels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudVmClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudVmClusterState $;

        public Builder() {
            $ = new CloudVmClusterState();
        }

        public Builder(CloudVmClusterState defaults) {
            $ = new CloudVmClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupSubnetCidr CIDR range of the backup subnet.
         * 
         * @return builder
         * 
         */
        public Builder backupSubnetCidr(@Nullable Output<String> backupSubnetCidr) {
            $.backupSubnetCidr = backupSubnetCidr;
            return this;
        }

        /**
         * @param backupSubnetCidr CIDR range of the backup subnet.
         * 
         * @return builder
         * 
         */
        public Builder backupSubnetCidr(String backupSubnetCidr) {
            return backupSubnetCidr(Output.of(backupSubnetCidr));
        }

        /**
         * @param cidr Network settings. CIDR to use for cluster IP allocation.
         * 
         * @return builder
         * 
         */
        public Builder cidr(@Nullable Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr Network settings. CIDR to use for cluster IP allocation.
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        /**
         * @param cloudVmClusterId The ID of the VM Cluster to create. This value is restricted
         * to (^a-z?$) and must be a maximum of 63
         * characters in length. The value must start with a letter and end with
         * a letter or a number.
         * 
         * @return builder
         * 
         */
        public Builder cloudVmClusterId(@Nullable Output<String> cloudVmClusterId) {
            $.cloudVmClusterId = cloudVmClusterId;
            return this;
        }

        /**
         * @param cloudVmClusterId The ID of the VM Cluster to create. This value is restricted
         * to (^a-z?$) and must be a maximum of 63
         * characters in length. The value must start with a letter and end with
         * a letter or a number.
         * 
         * @return builder
         * 
         */
        public Builder cloudVmClusterId(String cloudVmClusterId) {
            return cloudVmClusterId(Output.of(cloudVmClusterId));
        }

        /**
         * @param createTime The date and time that the VM cluster was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The date and time that the VM cluster was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            $.deletionProtection = deletionProtection;
            return this;
        }

        public Builder deletionProtection(Boolean deletionProtection) {
            return deletionProtection(Output.of(deletionProtection));
        }

        /**
         * @param displayName User friendly name for this resource.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName User friendly name for this resource.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(@Nullable Output<Map<String,String>> effectiveLabels) {
            $.effectiveLabels = effectiveLabels;
            return this;
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            return effectiveLabels(Output.of(effectiveLabels));
        }

        /**
         * @param exadataInfrastructure The name of the Exadata Infrastructure resource on which VM cluster
         * resource is created, in the following format:
         * projects/{project}/locations/{region}/cloudExadataInfrastuctures/{cloud_extradata_infrastructure}
         * 
         * @return builder
         * 
         */
        public Builder exadataInfrastructure(@Nullable Output<String> exadataInfrastructure) {
            $.exadataInfrastructure = exadataInfrastructure;
            return this;
        }

        /**
         * @param exadataInfrastructure The name of the Exadata Infrastructure resource on which VM cluster
         * resource is created, in the following format:
         * projects/{project}/locations/{region}/cloudExadataInfrastuctures/{cloud_extradata_infrastructure}
         * 
         * @return builder
         * 
         */
        public Builder exadataInfrastructure(String exadataInfrastructure) {
            return exadataInfrastructure(Output.of(exadataInfrastructure));
        }

        /**
         * @param gcpOracleZone GCP location where Oracle Exadata is hosted. It is same as GCP Oracle zone
         * of Exadata infrastructure.
         * 
         * @return builder
         * 
         */
        public Builder gcpOracleZone(@Nullable Output<String> gcpOracleZone) {
            $.gcpOracleZone = gcpOracleZone;
            return this;
        }

        /**
         * @param gcpOracleZone GCP location where Oracle Exadata is hosted. It is same as GCP Oracle zone
         * of Exadata infrastructure.
         * 
         * @return builder
         * 
         */
        public Builder gcpOracleZone(String gcpOracleZone) {
            return gcpOracleZone(Output.of(gcpOracleZone));
        }

        /**
         * @param labels Labels or tags associated with the VM Cluster.
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels or tags associated with the VM Cluster.
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location Resource ID segment making up resource `name`. See documentation for resource type `oracledatabase.googleapis.com/DbNode`.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource ID segment making up resource `name`. See documentation for resource type `oracledatabase.googleapis.com/DbNode`.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Identifier. The name of the VM Cluster resource with the format:
         * projects/{project}/locations/{region}/cloudVmClusters/{cloud_vm_cluster}
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Identifier. The name of the VM Cluster resource with the format:
         * projects/{project}/locations/{region}/cloudVmClusters/{cloud_vm_cluster}
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network The name of the VPC network.
         * Format: projects/{project}/global/networks/{network}
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The name of the VPC network.
         * Format: projects/{project}/global/networks/{network}
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
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
         * @param properties Various properties and settings associated with Exadata VM cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<CloudVmClusterPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Various properties and settings associated with Exadata VM cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder properties(CloudVmClusterPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(@Nullable Output<Map<String,String>> pulumiLabels) {
            $.pulumiLabels = pulumiLabels;
            return this;
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            return pulumiLabels(Output.of(pulumiLabels));
        }

        public CloudVmClusterState build() {
            return $;
        }
    }

}
