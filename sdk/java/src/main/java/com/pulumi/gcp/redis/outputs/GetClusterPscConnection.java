// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.redis.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterPscConnection {
    /**
     * @return Output only. The IP allocated on the consumer network for the PSC forwarding rule.
     * 
     */
    private String address;
    /**
     * @return Output only. The URI of the consumer side forwarding rule. Example: projects/{projectNumOrId}/regions/us-east1/forwardingRules/{resourceId}.
     * 
     */
    private String forwardingRule;
    /**
     * @return The consumer network where the IP address resides, in the form of projects/{projectId}/global/networks/{network_id}.
     * 
     */
    private String network;
    /**
     * @return Output only. The consumer projectId where the forwarding rule is created from.
     * 
     */
    private String projectId;
    /**
     * @return Output only. The PSC connection id of the forwarding rule connected to the service attachment.
     * 
     */
    private String pscConnectionId;

    private GetClusterPscConnection() {}
    /**
     * @return Output only. The IP allocated on the consumer network for the PSC forwarding rule.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return Output only. The URI of the consumer side forwarding rule. Example: projects/{projectNumOrId}/regions/us-east1/forwardingRules/{resourceId}.
     * 
     */
    public String forwardingRule() {
        return this.forwardingRule;
    }
    /**
     * @return The consumer network where the IP address resides, in the form of projects/{projectId}/global/networks/{network_id}.
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return Output only. The consumer projectId where the forwarding rule is created from.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Output only. The PSC connection id of the forwarding rule connected to the service attachment.
     * 
     */
    public String pscConnectionId() {
        return this.pscConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterPscConnection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String forwardingRule;
        private String network;
        private String projectId;
        private String pscConnectionId;
        public Builder() {}
        public Builder(GetClusterPscConnection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.forwardingRule = defaults.forwardingRule;
    	      this.network = defaults.network;
    	      this.projectId = defaults.projectId;
    	      this.pscConnectionId = defaults.pscConnectionId;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetClusterPscConnection", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder forwardingRule(String forwardingRule) {
            if (forwardingRule == null) {
              throw new MissingRequiredPropertyException("GetClusterPscConnection", "forwardingRule");
            }
            this.forwardingRule = forwardingRule;
            return this;
        }
        @CustomType.Setter
        public Builder network(String network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetClusterPscConnection", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetClusterPscConnection", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder pscConnectionId(String pscConnectionId) {
            if (pscConnectionId == null) {
              throw new MissingRequiredPropertyException("GetClusterPscConnection", "pscConnectionId");
            }
            this.pscConnectionId = pscConnectionId;
            return this;
        }
        public GetClusterPscConnection build() {
            final var _resultValue = new GetClusterPscConnection();
            _resultValue.address = address;
            _resultValue.forwardingRule = forwardingRule;
            _resultValue.network = network;
            _resultValue.projectId = projectId;
            _resultValue.pscConnectionId = pscConnectionId;
            return _resultValue;
        }
    }
}
