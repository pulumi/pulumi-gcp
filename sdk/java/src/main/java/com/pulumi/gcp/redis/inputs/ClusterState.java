// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.redis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.redis.inputs.ClusterDiscoveryEndpointArgs;
import com.pulumi.gcp.redis.inputs.ClusterPscConfigArgs;
import com.pulumi.gcp.redis.inputs.ClusterPscConnectionArgs;
import com.pulumi.gcp.redis.inputs.ClusterStateInfoArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * Optional. The authorization mode of the Redis cluster. If not provided, auth feature is disabled for the cluster.
     * Default value is `AUTH_MODE_DISABLED`.
     * Possible values are: `AUTH_MODE_UNSPECIFIED`, `AUTH_MODE_IAM_AUTH`, `AUTH_MODE_DISABLED`.
     * 
     */
    @Import(name="authorizationMode")
    private @Nullable Output<String> authorizationMode;

    /**
     * @return Optional. The authorization mode of the Redis cluster. If not provided, auth feature is disabled for the cluster.
     * Default value is `AUTH_MODE_DISABLED`.
     * Possible values are: `AUTH_MODE_UNSPECIFIED`, `AUTH_MODE_IAM_AUTH`, `AUTH_MODE_DISABLED`.
     * 
     */
    public Optional<Output<String>> authorizationMode() {
        return Optional.ofNullable(this.authorizationMode);
    }

    /**
     * The timestamp associated with the cluster creation request. A timestamp in
     * RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional
     * digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The timestamp associated with the cluster creation request. A timestamp in
     * RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional
     * digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Output only. Endpoints created on each given network,
     * for Redis clients to connect to the cluster.
     * Currently only one endpoint is supported.
     * Structure is documented below.
     * 
     */
    @Import(name="discoveryEndpoints")
    private @Nullable Output<List<ClusterDiscoveryEndpointArgs>> discoveryEndpoints;

    /**
     * @return Output only. Endpoints created on each given network,
     * for Redis clients to connect to the cluster.
     * Currently only one endpoint is supported.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ClusterDiscoveryEndpointArgs>>> discoveryEndpoints() {
        return Optional.ofNullable(this.discoveryEndpoints);
    }

    /**
     * Unique name of the resource in this scope including project and location using the form:
     * projects/{projectId}/locations/{locationId}/clusters/{clusterId}
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique name of the resource in this scope including project and location using the form:
     * projects/{projectId}/locations/{locationId}/clusters/{clusterId}
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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
     * Required. Each PscConfig configures the consumer network where two
     * network addresses will be designated to the cluster for client access.
     * Currently, only one PscConfig is supported.
     * Structure is documented below.
     * 
     */
    @Import(name="pscConfigs")
    private @Nullable Output<List<ClusterPscConfigArgs>> pscConfigs;

    /**
     * @return Required. Each PscConfig configures the consumer network where two
     * network addresses will be designated to the cluster for client access.
     * Currently, only one PscConfig is supported.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ClusterPscConfigArgs>>> pscConfigs() {
        return Optional.ofNullable(this.pscConfigs);
    }

    /**
     * Output only. PSC connections for discovery of the cluster topology and accessing the cluster.
     * Structure is documented below.
     * 
     */
    @Import(name="pscConnections")
    private @Nullable Output<List<ClusterPscConnectionArgs>> pscConnections;

    /**
     * @return Output only. PSC connections for discovery of the cluster topology and accessing the cluster.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ClusterPscConnectionArgs>>> pscConnections() {
        return Optional.ofNullable(this.pscConnections);
    }

    /**
     * The name of the region of the Redis cluster.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The name of the region of the Redis cluster.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Optional. The number of replica nodes per shard.
     * 
     */
    @Import(name="replicaCount")
    private @Nullable Output<Integer> replicaCount;

    /**
     * @return Optional. The number of replica nodes per shard.
     * 
     */
    public Optional<Output<Integer>> replicaCount() {
        return Optional.ofNullable(this.replicaCount);
    }

    /**
     * Required. Number of shards for the Redis cluster.
     * 
     */
    @Import(name="shardCount")
    private @Nullable Output<Integer> shardCount;

    /**
     * @return Required. Number of shards for the Redis cluster.
     * 
     */
    public Optional<Output<Integer>> shardCount() {
        return Optional.ofNullable(this.shardCount);
    }

    /**
     * Output only. Redis memory size in GB for the entire cluster.
     * 
     */
    @Import(name="sizeGb")
    private @Nullable Output<Integer> sizeGb;

    /**
     * @return Output only. Redis memory size in GB for the entire cluster.
     * 
     */
    public Optional<Output<Integer>> sizeGb() {
        return Optional.ofNullable(this.sizeGb);
    }

    /**
     * The current state of this cluster. Can be CREATING, READY, UPDATING, DELETING and SUSPENDED
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of this cluster. Can be CREATING, READY, UPDATING, DELETING and SUSPENDED
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Output only. Additional information about the current state of the cluster.
     * Structure is documented below.
     * 
     */
    @Import(name="stateInfos")
    private @Nullable Output<List<ClusterStateInfoArgs>> stateInfos;

    /**
     * @return Output only. Additional information about the current state of the cluster.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ClusterStateInfoArgs>>> stateInfos() {
        return Optional.ofNullable(this.stateInfos);
    }

    /**
     * Optional. The in-transit encryption for the Redis cluster.
     * If not provided, encryption is disabled for the cluster.
     * Default value is `TRANSIT_ENCRYPTION_MODE_DISABLED`.
     * Possible values are: `TRANSIT_ENCRYPTION_MODE_UNSPECIFIED`, `TRANSIT_ENCRYPTION_MODE_DISABLED`, `TRANSIT_ENCRYPTION_MODE_SERVER_AUTHENTICATION`.
     * 
     */
    @Import(name="transitEncryptionMode")
    private @Nullable Output<String> transitEncryptionMode;

    /**
     * @return Optional. The in-transit encryption for the Redis cluster.
     * If not provided, encryption is disabled for the cluster.
     * Default value is `TRANSIT_ENCRYPTION_MODE_DISABLED`.
     * Possible values are: `TRANSIT_ENCRYPTION_MODE_UNSPECIFIED`, `TRANSIT_ENCRYPTION_MODE_DISABLED`, `TRANSIT_ENCRYPTION_MODE_SERVER_AUTHENTICATION`.
     * 
     */
    public Optional<Output<String>> transitEncryptionMode() {
        return Optional.ofNullable(this.transitEncryptionMode);
    }

    /**
     * System assigned, unique identifier for the cluster.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return System assigned, unique identifier for the cluster.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    private ClusterState() {}

    private ClusterState(ClusterState $) {
        this.authorizationMode = $.authorizationMode;
        this.createTime = $.createTime;
        this.discoveryEndpoints = $.discoveryEndpoints;
        this.name = $.name;
        this.project = $.project;
        this.pscConfigs = $.pscConfigs;
        this.pscConnections = $.pscConnections;
        this.region = $.region;
        this.replicaCount = $.replicaCount;
        this.shardCount = $.shardCount;
        this.sizeGb = $.sizeGb;
        this.state = $.state;
        this.stateInfos = $.stateInfos;
        this.transitEncryptionMode = $.transitEncryptionMode;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterState $;

        public Builder() {
            $ = new ClusterState();
        }

        public Builder(ClusterState defaults) {
            $ = new ClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizationMode Optional. The authorization mode of the Redis cluster. If not provided, auth feature is disabled for the cluster.
         * Default value is `AUTH_MODE_DISABLED`.
         * Possible values are: `AUTH_MODE_UNSPECIFIED`, `AUTH_MODE_IAM_AUTH`, `AUTH_MODE_DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder authorizationMode(@Nullable Output<String> authorizationMode) {
            $.authorizationMode = authorizationMode;
            return this;
        }

        /**
         * @param authorizationMode Optional. The authorization mode of the Redis cluster. If not provided, auth feature is disabled for the cluster.
         * Default value is `AUTH_MODE_DISABLED`.
         * Possible values are: `AUTH_MODE_UNSPECIFIED`, `AUTH_MODE_IAM_AUTH`, `AUTH_MODE_DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder authorizationMode(String authorizationMode) {
            return authorizationMode(Output.of(authorizationMode));
        }

        /**
         * @param createTime The timestamp associated with the cluster creation request. A timestamp in
         * RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional
         * digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The timestamp associated with the cluster creation request. A timestamp in
         * RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional
         * digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param discoveryEndpoints Output only. Endpoints created on each given network,
         * for Redis clients to connect to the cluster.
         * Currently only one endpoint is supported.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder discoveryEndpoints(@Nullable Output<List<ClusterDiscoveryEndpointArgs>> discoveryEndpoints) {
            $.discoveryEndpoints = discoveryEndpoints;
            return this;
        }

        /**
         * @param discoveryEndpoints Output only. Endpoints created on each given network,
         * for Redis clients to connect to the cluster.
         * Currently only one endpoint is supported.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder discoveryEndpoints(List<ClusterDiscoveryEndpointArgs> discoveryEndpoints) {
            return discoveryEndpoints(Output.of(discoveryEndpoints));
        }

        /**
         * @param discoveryEndpoints Output only. Endpoints created on each given network,
         * for Redis clients to connect to the cluster.
         * Currently only one endpoint is supported.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder discoveryEndpoints(ClusterDiscoveryEndpointArgs... discoveryEndpoints) {
            return discoveryEndpoints(List.of(discoveryEndpoints));
        }

        /**
         * @param name Unique name of the resource in this scope including project and location using the form:
         * projects/{projectId}/locations/{locationId}/clusters/{clusterId}
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique name of the resource in this scope including project and location using the form:
         * projects/{projectId}/locations/{locationId}/clusters/{clusterId}
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param pscConfigs Required. Each PscConfig configures the consumer network where two
         * network addresses will be designated to the cluster for client access.
         * Currently, only one PscConfig is supported.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pscConfigs(@Nullable Output<List<ClusterPscConfigArgs>> pscConfigs) {
            $.pscConfigs = pscConfigs;
            return this;
        }

        /**
         * @param pscConfigs Required. Each PscConfig configures the consumer network where two
         * network addresses will be designated to the cluster for client access.
         * Currently, only one PscConfig is supported.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pscConfigs(List<ClusterPscConfigArgs> pscConfigs) {
            return pscConfigs(Output.of(pscConfigs));
        }

        /**
         * @param pscConfigs Required. Each PscConfig configures the consumer network where two
         * network addresses will be designated to the cluster for client access.
         * Currently, only one PscConfig is supported.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pscConfigs(ClusterPscConfigArgs... pscConfigs) {
            return pscConfigs(List.of(pscConfigs));
        }

        /**
         * @param pscConnections Output only. PSC connections for discovery of the cluster topology and accessing the cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pscConnections(@Nullable Output<List<ClusterPscConnectionArgs>> pscConnections) {
            $.pscConnections = pscConnections;
            return this;
        }

        /**
         * @param pscConnections Output only. PSC connections for discovery of the cluster topology and accessing the cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pscConnections(List<ClusterPscConnectionArgs> pscConnections) {
            return pscConnections(Output.of(pscConnections));
        }

        /**
         * @param pscConnections Output only. PSC connections for discovery of the cluster topology and accessing the cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder pscConnections(ClusterPscConnectionArgs... pscConnections) {
            return pscConnections(List.of(pscConnections));
        }

        /**
         * @param region The name of the region of the Redis cluster.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The name of the region of the Redis cluster.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param replicaCount Optional. The number of replica nodes per shard.
         * 
         * @return builder
         * 
         */
        public Builder replicaCount(@Nullable Output<Integer> replicaCount) {
            $.replicaCount = replicaCount;
            return this;
        }

        /**
         * @param replicaCount Optional. The number of replica nodes per shard.
         * 
         * @return builder
         * 
         */
        public Builder replicaCount(Integer replicaCount) {
            return replicaCount(Output.of(replicaCount));
        }

        /**
         * @param shardCount Required. Number of shards for the Redis cluster.
         * 
         * @return builder
         * 
         */
        public Builder shardCount(@Nullable Output<Integer> shardCount) {
            $.shardCount = shardCount;
            return this;
        }

        /**
         * @param shardCount Required. Number of shards for the Redis cluster.
         * 
         * @return builder
         * 
         */
        public Builder shardCount(Integer shardCount) {
            return shardCount(Output.of(shardCount));
        }

        /**
         * @param sizeGb Output only. Redis memory size in GB for the entire cluster.
         * 
         * @return builder
         * 
         */
        public Builder sizeGb(@Nullable Output<Integer> sizeGb) {
            $.sizeGb = sizeGb;
            return this;
        }

        /**
         * @param sizeGb Output only. Redis memory size in GB for the entire cluster.
         * 
         * @return builder
         * 
         */
        public Builder sizeGb(Integer sizeGb) {
            return sizeGb(Output.of(sizeGb));
        }

        /**
         * @param state The current state of this cluster. Can be CREATING, READY, UPDATING, DELETING and SUSPENDED
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of this cluster. Can be CREATING, READY, UPDATING, DELETING and SUSPENDED
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param stateInfos Output only. Additional information about the current state of the cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder stateInfos(@Nullable Output<List<ClusterStateInfoArgs>> stateInfos) {
            $.stateInfos = stateInfos;
            return this;
        }

        /**
         * @param stateInfos Output only. Additional information about the current state of the cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder stateInfos(List<ClusterStateInfoArgs> stateInfos) {
            return stateInfos(Output.of(stateInfos));
        }

        /**
         * @param stateInfos Output only. Additional information about the current state of the cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder stateInfos(ClusterStateInfoArgs... stateInfos) {
            return stateInfos(List.of(stateInfos));
        }

        /**
         * @param transitEncryptionMode Optional. The in-transit encryption for the Redis cluster.
         * If not provided, encryption is disabled for the cluster.
         * Default value is `TRANSIT_ENCRYPTION_MODE_DISABLED`.
         * Possible values are: `TRANSIT_ENCRYPTION_MODE_UNSPECIFIED`, `TRANSIT_ENCRYPTION_MODE_DISABLED`, `TRANSIT_ENCRYPTION_MODE_SERVER_AUTHENTICATION`.
         * 
         * @return builder
         * 
         */
        public Builder transitEncryptionMode(@Nullable Output<String> transitEncryptionMode) {
            $.transitEncryptionMode = transitEncryptionMode;
            return this;
        }

        /**
         * @param transitEncryptionMode Optional. The in-transit encryption for the Redis cluster.
         * If not provided, encryption is disabled for the cluster.
         * Default value is `TRANSIT_ENCRYPTION_MODE_DISABLED`.
         * Possible values are: `TRANSIT_ENCRYPTION_MODE_UNSPECIFIED`, `TRANSIT_ENCRYPTION_MODE_DISABLED`, `TRANSIT_ENCRYPTION_MODE_SERVER_AUTHENTICATION`.
         * 
         * @return builder
         * 
         */
        public Builder transitEncryptionMode(String transitEncryptionMode) {
            return transitEncryptionMode(Output.of(transitEncryptionMode));
        }

        /**
         * @param uid System assigned, unique identifier for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid System assigned, unique identifier for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        public ClusterState build() {
            return $;
        }
    }

}
