// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.oracledatabase.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDbNodesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDbNodesArgs Empty = new GetDbNodesArgs();

    /**
     * The ID of the VM Cluster.
     * 
     */
    @Import(name="cloudVmCluster", required=true)
    private Output<String> cloudVmCluster;

    /**
     * @return The ID of the VM Cluster.
     * 
     */
    public Output<String> cloudVmCluster() {
        return this.cloudVmCluster;
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
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetDbNodesArgs() {}

    private GetDbNodesArgs(GetDbNodesArgs $) {
        this.cloudVmCluster = $.cloudVmCluster;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDbNodesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDbNodesArgs $;

        public Builder() {
            $ = new GetDbNodesArgs();
        }

        public Builder(GetDbNodesArgs defaults) {
            $ = new GetDbNodesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudVmCluster The ID of the VM Cluster.
         * 
         * @return builder
         * 
         */
        public Builder cloudVmCluster(Output<String> cloudVmCluster) {
            $.cloudVmCluster = cloudVmCluster;
            return this;
        }

        /**
         * @param cloudVmCluster The ID of the VM Cluster.
         * 
         * @return builder
         * 
         */
        public Builder cloudVmCluster(String cloudVmCluster) {
            return cloudVmCluster(Output.of(cloudVmCluster));
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
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetDbNodesArgs build() {
            if ($.cloudVmCluster == null) {
                throw new MissingRequiredPropertyException("GetDbNodesArgs", "cloudVmCluster");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("GetDbNodesArgs", "location");
            }
            return $;
        }
    }

}
