// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.GetRouterStatusBestRoute;
import com.pulumi.gcp.compute.outputs.GetRouterStatusBestRoutesForRouter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRouterStatusResult {
    private final List<GetRouterStatusBestRoute> bestRoutes;
    private final List<GetRouterStatusBestRoutesForRouter> bestRoutesForRouters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * @return The network name or resource link to the parent
     * network of this subnetwork.
     * 
     */
    private final String network;
    private final @Nullable String project;
    private final String region;

    @CustomType.Constructor
    private GetRouterStatusResult(
        @CustomType.Parameter("bestRoutes") List<GetRouterStatusBestRoute> bestRoutes,
        @CustomType.Parameter("bestRoutesForRouters") List<GetRouterStatusBestRoutesForRouter> bestRoutesForRouters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("project") @Nullable String project,
        @CustomType.Parameter("region") String region) {
        this.bestRoutes = bestRoutes;
        this.bestRoutesForRouters = bestRoutesForRouters;
        this.id = id;
        this.name = name;
        this.network = network;
        this.project = project;
        this.region = region;
    }

    public List<GetRouterStatusBestRoute> bestRoutes() {
        return this.bestRoutes;
    }
    public List<GetRouterStatusBestRoutesForRouter> bestRoutesForRouters() {
        return this.bestRoutesForRouters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The network name or resource link to the parent
     * network of this subnetwork.
     * 
     */
    public String network() {
        return this.network;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouterStatusResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetRouterStatusBestRoute> bestRoutes;
        private List<GetRouterStatusBestRoutesForRouter> bestRoutesForRouters;
        private String id;
        private String name;
        private String network;
        private @Nullable String project;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouterStatusResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bestRoutes = defaults.bestRoutes;
    	      this.bestRoutesForRouters = defaults.bestRoutesForRouters;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder bestRoutes(List<GetRouterStatusBestRoute> bestRoutes) {
            this.bestRoutes = Objects.requireNonNull(bestRoutes);
            return this;
        }
        public Builder bestRoutes(GetRouterStatusBestRoute... bestRoutes) {
            return bestRoutes(List.of(bestRoutes));
        }
        public Builder bestRoutesForRouters(List<GetRouterStatusBestRoutesForRouter> bestRoutesForRouters) {
            this.bestRoutesForRouters = Objects.requireNonNull(bestRoutesForRouters);
            return this;
        }
        public Builder bestRoutesForRouters(GetRouterStatusBestRoutesForRouter... bestRoutesForRouters) {
            return bestRoutesForRouters(List.of(bestRoutesForRouters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }        public GetRouterStatusResult build() {
            return new GetRouterStatusResult(bestRoutes, bestRoutesForRouters, id, name, network, project, region);
        }
    }
}