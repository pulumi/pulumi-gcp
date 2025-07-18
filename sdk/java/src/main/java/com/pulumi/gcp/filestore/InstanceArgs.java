// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.filestore;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.filestore.inputs.InstanceDirectoryServicesArgs;
import com.pulumi.gcp.filestore.inputs.InstanceFileSharesArgs;
import com.pulumi.gcp.filestore.inputs.InstanceInitialReplicationArgs;
import com.pulumi.gcp.filestore.inputs.InstanceNetworkArgs;
import com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * Indicates whether the instance is protected against deletion.
     * 
     */
    @Import(name="deletionProtectionEnabled")
    private @Nullable Output<Boolean> deletionProtectionEnabled;

    /**
     * @return Indicates whether the instance is protected against deletion.
     * 
     */
    public Optional<Output<Boolean>> deletionProtectionEnabled() {
        return Optional.ofNullable(this.deletionProtectionEnabled);
    }

    /**
     * The reason for enabling deletion protection.
     * 
     */
    @Import(name="deletionProtectionReason")
    private @Nullable Output<String> deletionProtectionReason;

    /**
     * @return The reason for enabling deletion protection.
     * 
     */
    public Optional<Output<String>> deletionProtectionReason() {
        return Optional.ofNullable(this.deletionProtectionReason);
    }

    /**
     * A description of the instance.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the instance.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Directory Services configuration.
     * Should only be set if protocol is &#34;NFS_V4_1&#34;.
     * Structure is documented below.
     * 
     */
    @Import(name="directoryServices")
    private @Nullable Output<InstanceDirectoryServicesArgs> directoryServices;

    /**
     * @return Directory Services configuration.
     * Should only be set if protocol is &#34;NFS_V4_1&#34;.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InstanceDirectoryServicesArgs>> directoryServices() {
        return Optional.ofNullable(this.directoryServices);
    }

    /**
     * File system shares on the instance. For this version, only a
     * single file share is supported.
     * Structure is documented below.
     * 
     */
    @Import(name="fileShares", required=true)
    private Output<InstanceFileSharesArgs> fileShares;

    /**
     * @return File system shares on the instance. For this version, only a
     * single file share is supported.
     * Structure is documented below.
     * 
     */
    public Output<InstanceFileSharesArgs> fileShares() {
        return this.fileShares;
    }

    /**
     * Replication configuration, once set, this cannot be updated.
     * Additionally this should be specified on the replica instance only, indicating the active as the peer_instance
     * Structure is documented below.
     * 
     */
    @Import(name="initialReplication")
    private @Nullable Output<InstanceInitialReplicationArgs> initialReplication;

    /**
     * @return Replication configuration, once set, this cannot be updated.
     * Additionally this should be specified on the replica instance only, indicating the active as the peer_instance
     * Structure is documented below.
     * 
     */
    public Optional<Output<InstanceInitialReplicationArgs>> initialReplication() {
        return Optional.ofNullable(this.initialReplication);
    }

    /**
     * KMS key name used for data encryption.
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    /**
     * @return KMS key name used for data encryption.
     * 
     */
    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name of the instance.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the instance.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * VPC networks to which the instance is connected. For this version,
     * only a single network is supported.
     * Structure is documented below.
     * 
     */
    @Import(name="networks", required=true)
    private Output<List<InstanceNetworkArgs>> networks;

    /**
     * @return VPC networks to which the instance is connected. For this version,
     * only a single network is supported.
     * Structure is documented below.
     * 
     */
    public Output<List<InstanceNetworkArgs>> networks() {
        return this.networks;
    }

    /**
     * Performance configuration for the instance. If not provided,
     * the default performance settings will be used.
     * Structure is documented below.
     * 
     */
    @Import(name="performanceConfig")
    private @Nullable Output<InstancePerformanceConfigArgs> performanceConfig;

    /**
     * @return Performance configuration for the instance. If not provided,
     * the default performance settings will be used.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InstancePerformanceConfigArgs>> performanceConfig() {
        return Optional.ofNullable(this.performanceConfig);
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
     * Either NFSv3, for using NFS version 3 as file sharing protocol,
     * or NFSv4.1, for using NFS version 4.1 as file sharing protocol.
     * NFSv4.1 can be used with HIGH_SCALE_SSD, ZONAL, REGIONAL and ENTERPRISE.
     * The default is NFSv3.
     * Default value is `NFS_V3`.
     * Possible values are: `NFS_V3`, `NFS_V4_1`.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return Either NFSv3, for using NFS version 3 as file sharing protocol,
     * or NFSv4.1, for using NFS version 4.1 as file sharing protocol.
     * NFSv4.1 can be used with HIGH_SCALE_SSD, ZONAL, REGIONAL and ENTERPRISE.
     * The default is NFSv3.
     * Default value is `NFS_V3`.
     * Possible values are: `NFS_V3`, `NFS_V4_1`.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * A map of resource manager tags. Resource manager tag keys
     * and values have the same definition as resource manager
     * tags. Keys must be in the format tagKeys/{tag_key_id},
     * and values are in the format tagValues/456. The field is
     * ignored when empty. The field is immutable and causes
     * resource replacement when mutated. This field is only set
     * at create time and modifying this field after creation
     * will trigger recreation. To apply tags to an existing
     * resource, see the `gcp.tags.TagValue` resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of resource manager tags. Resource manager tag keys
     * and values have the same definition as resource manager
     * tags. Keys must be in the format tagKeys/{tag_key_id},
     * and values are in the format tagValues/456. The field is
     * ignored when empty. The field is immutable and causes
     * resource replacement when mutated. This field is only set
     * at create time and modifying this field after creation
     * will trigger recreation. To apply tags to an existing
     * resource, see the `gcp.tags.TagValue` resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The service tier of the instance.
     * Possible values include: STANDARD, PREMIUM, BASIC_HDD, BASIC_SSD, HIGH_SCALE_SSD, ZONAL, REGIONAL and ENTERPRISE
     * 
     */
    @Import(name="tier", required=true)
    private Output<String> tier;

    /**
     * @return The service tier of the instance.
     * Possible values include: STANDARD, PREMIUM, BASIC_HDD, BASIC_SSD, HIGH_SCALE_SSD, ZONAL, REGIONAL and ENTERPRISE
     * 
     */
    public Output<String> tier() {
        return this.tier;
    }

    /**
     * (Optional, Deprecated)
     * The name of the Filestore zone of the instance.
     * 
     * &gt; **Warning:** `zone` is deprecated and will be removed in a future major release. Use `location` instead.
     * 
     * @deprecated
     * `zone` is deprecated and will be removed in a future major release. Use `location` instead.
     * 
     */
    @Deprecated /* `zone` is deprecated and will be removed in a future major release. Use `location` instead. */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return (Optional, Deprecated)
     * The name of the Filestore zone of the instance.
     * 
     * &gt; **Warning:** `zone` is deprecated and will be removed in a future major release. Use `location` instead.
     * 
     * @deprecated
     * `zone` is deprecated and will be removed in a future major release. Use `location` instead.
     * 
     */
    @Deprecated /* `zone` is deprecated and will be removed in a future major release. Use `location` instead. */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private InstanceArgs() {}

    private InstanceArgs(InstanceArgs $) {
        this.deletionProtectionEnabled = $.deletionProtectionEnabled;
        this.deletionProtectionReason = $.deletionProtectionReason;
        this.description = $.description;
        this.directoryServices = $.directoryServices;
        this.fileShares = $.fileShares;
        this.initialReplication = $.initialReplication;
        this.kmsKeyName = $.kmsKeyName;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.networks = $.networks;
        this.performanceConfig = $.performanceConfig;
        this.project = $.project;
        this.protocol = $.protocol;
        this.tags = $.tags;
        this.tier = $.tier;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceArgs $;

        public Builder() {
            $ = new InstanceArgs();
        }

        public Builder(InstanceArgs defaults) {
            $ = new InstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deletionProtectionEnabled Indicates whether the instance is protected against deletion.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtectionEnabled(@Nullable Output<Boolean> deletionProtectionEnabled) {
            $.deletionProtectionEnabled = deletionProtectionEnabled;
            return this;
        }

        /**
         * @param deletionProtectionEnabled Indicates whether the instance is protected against deletion.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtectionEnabled(Boolean deletionProtectionEnabled) {
            return deletionProtectionEnabled(Output.of(deletionProtectionEnabled));
        }

        /**
         * @param deletionProtectionReason The reason for enabling deletion protection.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtectionReason(@Nullable Output<String> deletionProtectionReason) {
            $.deletionProtectionReason = deletionProtectionReason;
            return this;
        }

        /**
         * @param deletionProtectionReason The reason for enabling deletion protection.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtectionReason(String deletionProtectionReason) {
            return deletionProtectionReason(Output.of(deletionProtectionReason));
        }

        /**
         * @param description A description of the instance.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the instance.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param directoryServices Directory Services configuration.
         * Should only be set if protocol is &#34;NFS_V4_1&#34;.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder directoryServices(@Nullable Output<InstanceDirectoryServicesArgs> directoryServices) {
            $.directoryServices = directoryServices;
            return this;
        }

        /**
         * @param directoryServices Directory Services configuration.
         * Should only be set if protocol is &#34;NFS_V4_1&#34;.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder directoryServices(InstanceDirectoryServicesArgs directoryServices) {
            return directoryServices(Output.of(directoryServices));
        }

        /**
         * @param fileShares File system shares on the instance. For this version, only a
         * single file share is supported.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fileShares(Output<InstanceFileSharesArgs> fileShares) {
            $.fileShares = fileShares;
            return this;
        }

        /**
         * @param fileShares File system shares on the instance. For this version, only a
         * single file share is supported.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fileShares(InstanceFileSharesArgs fileShares) {
            return fileShares(Output.of(fileShares));
        }

        /**
         * @param initialReplication Replication configuration, once set, this cannot be updated.
         * Additionally this should be specified on the replica instance only, indicating the active as the peer_instance
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder initialReplication(@Nullable Output<InstanceInitialReplicationArgs> initialReplication) {
            $.initialReplication = initialReplication;
            return this;
        }

        /**
         * @param initialReplication Replication configuration, once set, this cannot be updated.
         * Additionally this should be specified on the replica instance only, indicating the active as the peer_instance
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder initialReplication(InstanceInitialReplicationArgs initialReplication) {
            return initialReplication(Output.of(initialReplication));
        }

        /**
         * @param kmsKeyName KMS key name used for data encryption.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName KMS key name used for data encryption.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        /**
         * @param labels Resource labels to represent user-provided metadata.
         * 
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
         * @param labels Resource labels to represent user-provided metadata.
         * 
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
         * @param location The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource name of the instance.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the instance.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networks VPC networks to which the instance is connected. For this version,
         * only a single network is supported.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networks(Output<List<InstanceNetworkArgs>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks VPC networks to which the instance is connected. For this version,
         * only a single network is supported.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networks(List<InstanceNetworkArgs> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks VPC networks to which the instance is connected. For this version,
         * only a single network is supported.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networks(InstanceNetworkArgs... networks) {
            return networks(List.of(networks));
        }

        /**
         * @param performanceConfig Performance configuration for the instance. If not provided,
         * the default performance settings will be used.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder performanceConfig(@Nullable Output<InstancePerformanceConfigArgs> performanceConfig) {
            $.performanceConfig = performanceConfig;
            return this;
        }

        /**
         * @param performanceConfig Performance configuration for the instance. If not provided,
         * the default performance settings will be used.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder performanceConfig(InstancePerformanceConfigArgs performanceConfig) {
            return performanceConfig(Output.of(performanceConfig));
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
         * @param protocol Either NFSv3, for using NFS version 3 as file sharing protocol,
         * or NFSv4.1, for using NFS version 4.1 as file sharing protocol.
         * NFSv4.1 can be used with HIGH_SCALE_SSD, ZONAL, REGIONAL and ENTERPRISE.
         * The default is NFSv3.
         * Default value is `NFS_V3`.
         * Possible values are: `NFS_V3`, `NFS_V4_1`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Either NFSv3, for using NFS version 3 as file sharing protocol,
         * or NFSv4.1, for using NFS version 4.1 as file sharing protocol.
         * NFSv4.1 can be used with HIGH_SCALE_SSD, ZONAL, REGIONAL and ENTERPRISE.
         * The default is NFSv3.
         * Default value is `NFS_V3`.
         * Possible values are: `NFS_V3`, `NFS_V4_1`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param tags A map of resource manager tags. Resource manager tag keys
         * and values have the same definition as resource manager
         * tags. Keys must be in the format tagKeys/{tag_key_id},
         * and values are in the format tagValues/456. The field is
         * ignored when empty. The field is immutable and causes
         * resource replacement when mutated. This field is only set
         * at create time and modifying this field after creation
         * will trigger recreation. To apply tags to an existing
         * resource, see the `gcp.tags.TagValue` resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of resource manager tags. Resource manager tag keys
         * and values have the same definition as resource manager
         * tags. Keys must be in the format tagKeys/{tag_key_id},
         * and values are in the format tagValues/456. The field is
         * ignored when empty. The field is immutable and causes
         * resource replacement when mutated. This field is only set
         * at create time and modifying this field after creation
         * will trigger recreation. To apply tags to an existing
         * resource, see the `gcp.tags.TagValue` resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tier The service tier of the instance.
         * Possible values include: STANDARD, PREMIUM, BASIC_HDD, BASIC_SSD, HIGH_SCALE_SSD, ZONAL, REGIONAL and ENTERPRISE
         * 
         * @return builder
         * 
         */
        public Builder tier(Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The service tier of the instance.
         * Possible values include: STANDARD, PREMIUM, BASIC_HDD, BASIC_SSD, HIGH_SCALE_SSD, ZONAL, REGIONAL and ENTERPRISE
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        /**
         * @param zone (Optional, Deprecated)
         * The name of the Filestore zone of the instance.
         * 
         * &gt; **Warning:** `zone` is deprecated and will be removed in a future major release. Use `location` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * `zone` is deprecated and will be removed in a future major release. Use `location` instead.
         * 
         */
        @Deprecated /* `zone` is deprecated and will be removed in a future major release. Use `location` instead. */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone (Optional, Deprecated)
         * The name of the Filestore zone of the instance.
         * 
         * &gt; **Warning:** `zone` is deprecated and will be removed in a future major release. Use `location` instead.
         * 
         * @return builder
         * 
         * @deprecated
         * `zone` is deprecated and will be removed in a future major release. Use `location` instead.
         * 
         */
        @Deprecated /* `zone` is deprecated and will be removed in a future major release. Use `location` instead. */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public InstanceArgs build() {
            if ($.fileShares == null) {
                throw new MissingRequiredPropertyException("InstanceArgs", "fileShares");
            }
            if ($.networks == null) {
                throw new MissingRequiredPropertyException("InstanceArgs", "networks");
            }
            if ($.tier == null) {
                throw new MissingRequiredPropertyException("InstanceArgs", "tier");
            }
            return $;
        }
    }

}
