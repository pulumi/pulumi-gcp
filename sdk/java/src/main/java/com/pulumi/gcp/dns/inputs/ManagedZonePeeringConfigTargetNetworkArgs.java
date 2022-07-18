// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ManagedZonePeeringConfigTargetNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedZonePeeringConfigTargetNetworkArgs Empty = new ManagedZonePeeringConfigTargetNetworkArgs();

    /**
     * The id or fully qualified URL of the VPC network to forward queries to.
     * This should be formatted like `projects/{project}/global/networks/{network}` or
     * `https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}`
     * 
     */
    @Import(name="networkUrl", required=true)
    private Output<String> networkUrl;

    /**
     * @return The id or fully qualified URL of the VPC network to forward queries to.
     * This should be formatted like `projects/{project}/global/networks/{network}` or
     * `https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}`
     * 
     */
    public Output<String> networkUrl() {
        return this.networkUrl;
    }

    private ManagedZonePeeringConfigTargetNetworkArgs() {}

    private ManagedZonePeeringConfigTargetNetworkArgs(ManagedZonePeeringConfigTargetNetworkArgs $) {
        this.networkUrl = $.networkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZonePeeringConfigTargetNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZonePeeringConfigTargetNetworkArgs $;

        public Builder() {
            $ = new ManagedZonePeeringConfigTargetNetworkArgs();
        }

        public Builder(ManagedZonePeeringConfigTargetNetworkArgs defaults) {
            $ = new ManagedZonePeeringConfigTargetNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkUrl The id or fully qualified URL of the VPC network to forward queries to.
         * This should be formatted like `projects/{project}/global/networks/{network}` or
         * `https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}`
         * 
         * @return builder
         * 
         */
        public Builder networkUrl(Output<String> networkUrl) {
            $.networkUrl = networkUrl;
            return this;
        }

        /**
         * @param networkUrl The id or fully qualified URL of the VPC network to forward queries to.
         * This should be formatted like `projects/{project}/global/networks/{network}` or
         * `https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}`
         * 
         * @return builder
         * 
         */
        public Builder networkUrl(String networkUrl) {
            return networkUrl(Output.of(networkUrl));
        }

        public ManagedZonePeeringConfigTargetNetworkArgs build() {
            $.networkUrl = Objects.requireNonNull($.networkUrl, "expected parameter 'networkUrl' to be non-null");
            return $;
        }
    }

}