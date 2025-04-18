// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRouterNatSubnetwork {
    /**
     * @return Name of the NAT service. The name must be 1-63 characters long and
     * comply with RFC1035.
     * 
     */
    private String name;
    /**
     * @return List of the secondary ranges of the subnetwork that are allowed
     * to use NAT. This can be populated only if
     * &#39;LIST_OF_SECONDARY_IP_RANGES&#39; is one of the values in
     * sourceIpRangesToNat
     * 
     */
    private List<String> secondaryIpRangeNames;
    /**
     * @return List of options for which source IPs in the subnetwork
     * should have NAT enabled. Supported values include:
     * &#39;ALL_IP_RANGES&#39;, &#39;LIST_OF_SECONDARY_IP_RANGES&#39;,
     * &#39;PRIMARY_IP_RANGE&#39;.
     * 
     */
    private List<String> sourceIpRangesToNats;

    private GetRouterNatSubnetwork() {}
    /**
     * @return Name of the NAT service. The name must be 1-63 characters long and
     * comply with RFC1035.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of the secondary ranges of the subnetwork that are allowed
     * to use NAT. This can be populated only if
     * &#39;LIST_OF_SECONDARY_IP_RANGES&#39; is one of the values in
     * sourceIpRangesToNat
     * 
     */
    public List<String> secondaryIpRangeNames() {
        return this.secondaryIpRangeNames;
    }
    /**
     * @return List of options for which source IPs in the subnetwork
     * should have NAT enabled. Supported values include:
     * &#39;ALL_IP_RANGES&#39;, &#39;LIST_OF_SECONDARY_IP_RANGES&#39;,
     * &#39;PRIMARY_IP_RANGE&#39;.
     * 
     */
    public List<String> sourceIpRangesToNats() {
        return this.sourceIpRangesToNats;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouterNatSubnetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private List<String> secondaryIpRangeNames;
        private List<String> sourceIpRangesToNats;
        public Builder() {}
        public Builder(GetRouterNatSubnetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secondaryIpRangeNames = defaults.secondaryIpRangeNames;
    	      this.sourceIpRangesToNats = defaults.sourceIpRangesToNats;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRouterNatSubnetwork", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder secondaryIpRangeNames(List<String> secondaryIpRangeNames) {
            if (secondaryIpRangeNames == null) {
              throw new MissingRequiredPropertyException("GetRouterNatSubnetwork", "secondaryIpRangeNames");
            }
            this.secondaryIpRangeNames = secondaryIpRangeNames;
            return this;
        }
        public Builder secondaryIpRangeNames(String... secondaryIpRangeNames) {
            return secondaryIpRangeNames(List.of(secondaryIpRangeNames));
        }
        @CustomType.Setter
        public Builder sourceIpRangesToNats(List<String> sourceIpRangesToNats) {
            if (sourceIpRangesToNats == null) {
              throw new MissingRequiredPropertyException("GetRouterNatSubnetwork", "sourceIpRangesToNats");
            }
            this.sourceIpRangesToNats = sourceIpRangesToNats;
            return this;
        }
        public Builder sourceIpRangesToNats(String... sourceIpRangesToNats) {
            return sourceIpRangesToNats(List.of(sourceIpRangesToNats));
        }
        public GetRouterNatSubnetwork build() {
            final var _resultValue = new GetRouterNatSubnetwork();
            _resultValue.name = name;
            _resultValue.secondaryIpRangeNames = secondaryIpRangeNames;
            _resultValue.sourceIpRangesToNats = sourceIpRangesToNats;
            return _resultValue;
        }
    }
}
