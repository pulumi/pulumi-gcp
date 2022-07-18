// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureClusterFleetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureClusterFleetArgs Empty = new AzureClusterFleetArgs();

    /**
     * - 
     * The name of the managed Hub Membership resource associated to this cluster. Membership names are formatted as projects/&lt;project-number&gt;/locations/global/membership/&lt;cluster-id&gt;.
     * 
     */
    @Import(name="membership")
    private @Nullable Output<String> membership;

    /**
     * @return -
     * The name of the managed Hub Membership resource associated to this cluster. Membership names are formatted as projects/&lt;project-number&gt;/locations/global/membership/&lt;cluster-id&gt;.
     * 
     */
    public Optional<Output<String>> membership() {
        return Optional.ofNullable(this.membership);
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

    private AzureClusterFleetArgs() {}

    private AzureClusterFleetArgs(AzureClusterFleetArgs $) {
        this.membership = $.membership;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureClusterFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureClusterFleetArgs $;

        public Builder() {
            $ = new AzureClusterFleetArgs();
        }

        public Builder(AzureClusterFleetArgs defaults) {
            $ = new AzureClusterFleetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param membership -
         * The name of the managed Hub Membership resource associated to this cluster. Membership names are formatted as projects/&lt;project-number&gt;/locations/global/membership/&lt;cluster-id&gt;.
         * 
         * @return builder
         * 
         */
        public Builder membership(@Nullable Output<String> membership) {
            $.membership = membership;
            return this;
        }

        /**
         * @param membership -
         * The name of the managed Hub Membership resource associated to this cluster. Membership names are formatted as projects/&lt;project-number&gt;/locations/global/membership/&lt;cluster-id&gt;.
         * 
         * @return builder
         * 
         */
        public Builder membership(String membership) {
            return membership(Output.of(membership));
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

        public AzureClusterFleetArgs build() {
            return $;
        }
    }

}