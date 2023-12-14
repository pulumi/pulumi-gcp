// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs Empty = new FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs();

    /**
     * The relative resource name of the binauthz platform policy to audit. GKE
     * platform policies have the following format:
     * `projects/{project_number}/platforms/gke/policies/{policy_id}`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The relative resource name of the binauthz platform policy to audit. GKE
     * platform policies have the following format:
     * `projects/{project_number}/platforms/gke/policies/{policy_id}`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs() {}

    private FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs(FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs $;

        public Builder() {
            $ = new FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs();
        }

        public Builder(FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs defaults) {
            $ = new FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The relative resource name of the binauthz platform policy to audit. GKE
         * platform policies have the following format:
         * `projects/{project_number}/platforms/gke/policies/{policy_id}`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The relative resource name of the binauthz platform policy to audit. GKE
         * platform policies have the following format:
         * `projects/{project_number}/platforms/gke/policies/{policy_id}`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs build() {
            return $;
        }
    }

}