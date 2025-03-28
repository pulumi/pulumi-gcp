// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SharedVPCServiceProjectState extends com.pulumi.resources.ResourceArgs {

    public static final SharedVPCServiceProjectState Empty = new SharedVPCServiceProjectState();

    /**
     * The deletion policy for the shared VPC service. Setting ABANDON allows the resource to be abandoned rather than deleted. Possible values are: &#34;ABANDON&#34;.
     * 
     */
    @Import(name="deletionPolicy")
    private @Nullable Output<String> deletionPolicy;

    /**
     * @return The deletion policy for the shared VPC service. Setting ABANDON allows the resource to be abandoned rather than deleted. Possible values are: &#34;ABANDON&#34;.
     * 
     */
    public Optional<Output<String>> deletionPolicy() {
        return Optional.ofNullable(this.deletionPolicy);
    }

    /**
     * The ID of a host project to associate.
     * 
     */
    @Import(name="hostProject")
    private @Nullable Output<String> hostProject;

    /**
     * @return The ID of a host project to associate.
     * 
     */
    public Optional<Output<String>> hostProject() {
        return Optional.ofNullable(this.hostProject);
    }

    /**
     * The ID of the project that will serve as a Shared VPC service project.
     * 
     */
    @Import(name="serviceProject")
    private @Nullable Output<String> serviceProject;

    /**
     * @return The ID of the project that will serve as a Shared VPC service project.
     * 
     */
    public Optional<Output<String>> serviceProject() {
        return Optional.ofNullable(this.serviceProject);
    }

    private SharedVPCServiceProjectState() {}

    private SharedVPCServiceProjectState(SharedVPCServiceProjectState $) {
        this.deletionPolicy = $.deletionPolicy;
        this.hostProject = $.hostProject;
        this.serviceProject = $.serviceProject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedVPCServiceProjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedVPCServiceProjectState $;

        public Builder() {
            $ = new SharedVPCServiceProjectState();
        }

        public Builder(SharedVPCServiceProjectState defaults) {
            $ = new SharedVPCServiceProjectState(Objects.requireNonNull(defaults));
        }

        /**
         * @param deletionPolicy The deletion policy for the shared VPC service. Setting ABANDON allows the resource to be abandoned rather than deleted. Possible values are: &#34;ABANDON&#34;.
         * 
         * @return builder
         * 
         */
        public Builder deletionPolicy(@Nullable Output<String> deletionPolicy) {
            $.deletionPolicy = deletionPolicy;
            return this;
        }

        /**
         * @param deletionPolicy The deletion policy for the shared VPC service. Setting ABANDON allows the resource to be abandoned rather than deleted. Possible values are: &#34;ABANDON&#34;.
         * 
         * @return builder
         * 
         */
        public Builder deletionPolicy(String deletionPolicy) {
            return deletionPolicy(Output.of(deletionPolicy));
        }

        /**
         * @param hostProject The ID of a host project to associate.
         * 
         * @return builder
         * 
         */
        public Builder hostProject(@Nullable Output<String> hostProject) {
            $.hostProject = hostProject;
            return this;
        }

        /**
         * @param hostProject The ID of a host project to associate.
         * 
         * @return builder
         * 
         */
        public Builder hostProject(String hostProject) {
            return hostProject(Output.of(hostProject));
        }

        /**
         * @param serviceProject The ID of the project that will serve as a Shared VPC service project.
         * 
         * @return builder
         * 
         */
        public Builder serviceProject(@Nullable Output<String> serviceProject) {
            $.serviceProject = serviceProject;
            return this;
        }

        /**
         * @param serviceProject The ID of the project that will serve as a Shared VPC service project.
         * 
         * @return builder
         * 
         */
        public Builder serviceProject(String serviceProject) {
            return serviceProject(Output.of(serviceProject));
        }

        public SharedVPCServiceProjectState build() {
            return $;
        }
    }

}
