// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigNodePoolConfigNodeConfig {
    /**
     * @return The map of Kubernetes labels (key/value pairs) to be applied to
     * each node. These will added in addition to any default label(s)
     * that Kubernetes may apply to the node. In case of conflict in
     * label keys, the applied set may differ depending on the Kubernetes
     * version -- it&#39;s best to assume the behavior is undefined and
     * conflicts should be avoided. For more information, including usage
     * and the valid values, see:
     * - http://kubernetes.io/v1.1/docs/user-guide/labels.html
     *   An object containing a list of &#34;key&#34;: value pairs.
     *   For example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    private @Nullable Map<String,String> labels;
    /**
     * @return The default IPv4 address for SSH access and Kubernetes node.
     * Example: 192.168.0.1
     * 
     */
    private @Nullable String nodeIp;

    private BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigNodePoolConfigNodeConfig() {}
    /**
     * @return The map of Kubernetes labels (key/value pairs) to be applied to
     * each node. These will added in addition to any default label(s)
     * that Kubernetes may apply to the node. In case of conflict in
     * label keys, the applied set may differ depending on the Kubernetes
     * version -- it&#39;s best to assume the behavior is undefined and
     * conflicts should be avoided. For more information, including usage
     * and the valid values, see:
     * - http://kubernetes.io/v1.1/docs/user-guide/labels.html
     *   An object containing a list of &#34;key&#34;: value pairs.
     *   For example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * @return The default IPv4 address for SSH access and Kubernetes node.
     * Example: 192.168.0.1
     * 
     */
    public Optional<String> nodeIp() {
        return Optional.ofNullable(this.nodeIp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigNodePoolConfigNodeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> labels;
        private @Nullable String nodeIp;
        public Builder() {}
        public Builder(BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigNodePoolConfigNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.nodeIp = defaults.nodeIp;
        }

        @CustomType.Setter
        public Builder labels(@Nullable Map<String,String> labels) {

            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder nodeIp(@Nullable String nodeIp) {

            this.nodeIp = nodeIp;
            return this;
        }
        public BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigNodePoolConfigNodeConfig build() {
            final var _resultValue = new BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigNodePoolConfigNodeConfig();
            _resultValue.labels = labels;
            _resultValue.nodeIp = nodeIp;
            return _resultValue;
        }
    }
}
