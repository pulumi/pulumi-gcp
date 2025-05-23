// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.edgecontainer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpnConnectionVpcProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnConnectionVpcProjectArgs Empty = new VpnConnectionVpcProjectArgs();

    /**
     * The project of the VPC to connect to. If not specified, it is the same as the cluster project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The project of the VPC to connect to. If not specified, it is the same as the cluster project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private VpnConnectionVpcProjectArgs() {}

    private VpnConnectionVpcProjectArgs(VpnConnectionVpcProjectArgs $) {
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnConnectionVpcProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnConnectionVpcProjectArgs $;

        public Builder() {
            $ = new VpnConnectionVpcProjectArgs();
        }

        public Builder(VpnConnectionVpcProjectArgs defaults) {
            $ = new VpnConnectionVpcProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId The project of the VPC to connect to. If not specified, it is the same as the cluster project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The project of the VPC to connect to. If not specified, it is the same as the cluster project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public VpnConnectionVpcProjectArgs build() {
            return $;
        }
    }

}
