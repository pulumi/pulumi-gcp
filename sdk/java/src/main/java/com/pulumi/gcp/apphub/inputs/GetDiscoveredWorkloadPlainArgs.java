// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apphub.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDiscoveredWorkloadPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiscoveredWorkloadPlainArgs Empty = new GetDiscoveredWorkloadPlainArgs();

    /**
     * The location of the discovered workload.
     * 
     */
    @Import(name="location", required=true)
    private String location;

    /**
     * @return The location of the discovered workload.
     * 
     */
    public String location() {
        return this.location;
    }

    /**
     * The host project of the discovered workload.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The host project of the discovered workload.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The uri of the workload (instance group managed by the Instance Group Manager). Example: &#34;//compute.googleapis.com/projects/1/regions/us-east1/instanceGroups/id1&#34;
     * 
     */
    @Import(name="workloadUri", required=true)
    private String workloadUri;

    /**
     * @return The uri of the workload (instance group managed by the Instance Group Manager). Example: &#34;//compute.googleapis.com/projects/1/regions/us-east1/instanceGroups/id1&#34;
     * 
     */
    public String workloadUri() {
        return this.workloadUri;
    }

    private GetDiscoveredWorkloadPlainArgs() {}

    private GetDiscoveredWorkloadPlainArgs(GetDiscoveredWorkloadPlainArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.workloadUri = $.workloadUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDiscoveredWorkloadPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDiscoveredWorkloadPlainArgs $;

        public Builder() {
            $ = new GetDiscoveredWorkloadPlainArgs();
        }

        public Builder(GetDiscoveredWorkloadPlainArgs defaults) {
            $ = new GetDiscoveredWorkloadPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The location of the discovered workload.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            $.location = location;
            return this;
        }

        /**
         * @param project The host project of the discovered workload.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param workloadUri The uri of the workload (instance group managed by the Instance Group Manager). Example: &#34;//compute.googleapis.com/projects/1/regions/us-east1/instanceGroups/id1&#34;
         * 
         * @return builder
         * 
         */
        public Builder workloadUri(String workloadUri) {
            $.workloadUri = workloadUri;
            return this;
        }

        public GetDiscoveredWorkloadPlainArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("GetDiscoveredWorkloadPlainArgs", "location");
            }
            if ($.workloadUri == null) {
                throw new MissingRequiredPropertyException("GetDiscoveredWorkloadPlainArgs", "workloadUri");
            }
            return $;
        }
    }

}
