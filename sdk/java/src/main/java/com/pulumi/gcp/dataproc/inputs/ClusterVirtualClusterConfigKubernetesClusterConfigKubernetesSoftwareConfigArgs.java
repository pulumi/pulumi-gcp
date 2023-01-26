// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs Empty = new ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs();

    /**
     * The components that should be installed in this Dataproc cluster. The key must be a string from the\
     * KubernetesComponent enumeration. The value is the version of the software to be installed. At least one entry must be specified.
     * * **NOTE** : `component_version[SPARK]` is mandatory to set, or the creation of the cluster will fail.
     * 
     */
    @Import(name="componentVersion", required=true)
    private Output<Map<String,String>> componentVersion;

    /**
     * @return The components that should be installed in this Dataproc cluster. The key must be a string from the\
     * KubernetesComponent enumeration. The value is the version of the software to be installed. At least one entry must be specified.
     * * **NOTE** : `component_version[SPARK]` is mandatory to set, or the creation of the cluster will fail.
     * 
     */
    public Output<Map<String,String>> componentVersion() {
        return this.componentVersion;
    }

    /**
     * The properties to set on daemon config files. Property keys are specified in prefix:property format,
     * for example spark:spark.kubernetes.container.image.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return The properties to set on daemon config files. Property keys are specified in prefix:property format,
     * for example spark:spark.kubernetes.container.image.
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs() {}

    private ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs(ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs $) {
        this.componentVersion = $.componentVersion;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs $;

        public Builder() {
            $ = new ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs();
        }

        public Builder(ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs defaults) {
            $ = new ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param componentVersion The components that should be installed in this Dataproc cluster. The key must be a string from the\
         * KubernetesComponent enumeration. The value is the version of the software to be installed. At least one entry must be specified.
         * * **NOTE** : `component_version[SPARK]` is mandatory to set, or the creation of the cluster will fail.
         * 
         * @return builder
         * 
         */
        public Builder componentVersion(Output<Map<String,String>> componentVersion) {
            $.componentVersion = componentVersion;
            return this;
        }

        /**
         * @param componentVersion The components that should be installed in this Dataproc cluster. The key must be a string from the\
         * KubernetesComponent enumeration. The value is the version of the software to be installed. At least one entry must be specified.
         * * **NOTE** : `component_version[SPARK]` is mandatory to set, or the creation of the cluster will fail.
         * 
         * @return builder
         * 
         */
        public Builder componentVersion(Map<String,String> componentVersion) {
            return componentVersion(Output.of(componentVersion));
        }

        /**
         * @param properties The properties to set on daemon config files. Property keys are specified in prefix:property format,
         * for example spark:spark.kubernetes.container.image.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The properties to set on daemon config files. Property keys are specified in prefix:property format,
         * for example spark:spark.kubernetes.container.image.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        public ClusterVirtualClusterConfigKubernetesClusterConfigKubernetesSoftwareConfigArgs build() {
            $.componentVersion = Objects.requireNonNull($.componentVersion, "expected parameter 'componentVersion' to be non-null");
            return $;
        }
    }

}