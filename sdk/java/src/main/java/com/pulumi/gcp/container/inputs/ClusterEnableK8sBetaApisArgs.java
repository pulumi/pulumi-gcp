// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ClusterEnableK8sBetaApisArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterEnableK8sBetaApisArgs Empty = new ClusterEnableK8sBetaApisArgs();

    /**
     * Enabled Kubernetes Beta APIs. To list a Beta API resource, use the representation {group}/{version}/{resource}. The version must be a Beta version. Note that you cannot disable beta APIs that are already enabled on a cluster without recreating it. See the [Configure beta APIs](https://cloud.google.com/kubernetes-engine/docs/how-to/use-beta-apis#configure-beta-apis) for more information.
     * 
     */
    @Import(name="enabledApis", required=true)
    private Output<List<String>> enabledApis;

    /**
     * @return Enabled Kubernetes Beta APIs. To list a Beta API resource, use the representation {group}/{version}/{resource}. The version must be a Beta version. Note that you cannot disable beta APIs that are already enabled on a cluster without recreating it. See the [Configure beta APIs](https://cloud.google.com/kubernetes-engine/docs/how-to/use-beta-apis#configure-beta-apis) for more information.
     * 
     */
    public Output<List<String>> enabledApis() {
        return this.enabledApis;
    }

    private ClusterEnableK8sBetaApisArgs() {}

    private ClusterEnableK8sBetaApisArgs(ClusterEnableK8sBetaApisArgs $) {
        this.enabledApis = $.enabledApis;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterEnableK8sBetaApisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterEnableK8sBetaApisArgs $;

        public Builder() {
            $ = new ClusterEnableK8sBetaApisArgs();
        }

        public Builder(ClusterEnableK8sBetaApisArgs defaults) {
            $ = new ClusterEnableK8sBetaApisArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabledApis Enabled Kubernetes Beta APIs. To list a Beta API resource, use the representation {group}/{version}/{resource}. The version must be a Beta version. Note that you cannot disable beta APIs that are already enabled on a cluster without recreating it. See the [Configure beta APIs](https://cloud.google.com/kubernetes-engine/docs/how-to/use-beta-apis#configure-beta-apis) for more information.
         * 
         * @return builder
         * 
         */
        public Builder enabledApis(Output<List<String>> enabledApis) {
            $.enabledApis = enabledApis;
            return this;
        }

        /**
         * @param enabledApis Enabled Kubernetes Beta APIs. To list a Beta API resource, use the representation {group}/{version}/{resource}. The version must be a Beta version. Note that you cannot disable beta APIs that are already enabled on a cluster without recreating it. See the [Configure beta APIs](https://cloud.google.com/kubernetes-engine/docs/how-to/use-beta-apis#configure-beta-apis) for more information.
         * 
         * @return builder
         * 
         */
        public Builder enabledApis(List<String> enabledApis) {
            return enabledApis(Output.of(enabledApis));
        }

        /**
         * @param enabledApis Enabled Kubernetes Beta APIs. To list a Beta API resource, use the representation {group}/{version}/{resource}. The version must be a Beta version. Note that you cannot disable beta APIs that are already enabled on a cluster without recreating it. See the [Configure beta APIs](https://cloud.google.com/kubernetes-engine/docs/how-to/use-beta-apis#configure-beta-apis) for more information.
         * 
         * @return builder
         * 
         */
        public Builder enabledApis(String... enabledApis) {
            return enabledApis(List.of(enabledApis));
        }

        public ClusterEnableK8sBetaApisArgs build() {
            $.enabledApis = Objects.requireNonNull($.enabledApis, "expected parameter 'enabledApis' to be non-null");
            return $;
        }
    }

}