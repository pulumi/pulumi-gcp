// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vmwareengine.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.vmwareengine.outputs.GetSubnetDhcpAddressRange;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSubnetResult {
    private String createTime;
    private List<GetSubnetDhcpAddressRange> dhcpAddressRanges;
    private String gatewayId;
    private String gatewayIp;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String ipCidrRange;
    private String name;
    private String parent;
    private Boolean standardConfig;
    private String state;
    private String type;
    private String uid;
    private String updateTime;
    private Integer vlanId;

    private GetSubnetResult() {}
    public String createTime() {
        return this.createTime;
    }
    public List<GetSubnetDhcpAddressRange> dhcpAddressRanges() {
        return this.dhcpAddressRanges;
    }
    public String gatewayId() {
        return this.gatewayId;
    }
    public String gatewayIp() {
        return this.gatewayIp;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String ipCidrRange() {
        return this.ipCidrRange;
    }
    public String name() {
        return this.name;
    }
    public String parent() {
        return this.parent;
    }
    public Boolean standardConfig() {
        return this.standardConfig;
    }
    public String state() {
        return this.state;
    }
    public String type() {
        return this.type;
    }
    public String uid() {
        return this.uid;
    }
    public String updateTime() {
        return this.updateTime;
    }
    public Integer vlanId() {
        return this.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private List<GetSubnetDhcpAddressRange> dhcpAddressRanges;
        private String gatewayId;
        private String gatewayIp;
        private String id;
        private String ipCidrRange;
        private String name;
        private String parent;
        private Boolean standardConfig;
        private String state;
        private String type;
        private String uid;
        private String updateTime;
        private Integer vlanId;
        public Builder() {}
        public Builder(GetSubnetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.dhcpAddressRanges = defaults.dhcpAddressRanges;
    	      this.gatewayId = defaults.gatewayId;
    	      this.gatewayIp = defaults.gatewayIp;
    	      this.id = defaults.id;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.standardConfig = defaults.standardConfig;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
    	      this.vlanId = defaults.vlanId;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetSubnetResult", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder dhcpAddressRanges(List<GetSubnetDhcpAddressRange> dhcpAddressRanges) {
            if (dhcpAddressRanges == null) {
              throw new MissingRequiredPropertyException("GetSubnetResult", "dhcpAddressRanges");
            }
            this.dhcpAddressRanges = dhcpAddressRanges;
            return this;
        }
        public Builder dhcpAddressRanges(GetSubnetDhcpAddressRange... dhcpAddressRanges) {
            return dhcpAddressRanges(List.of(dhcpAddressRanges));
        }
        @CustomType.Setter
        public Builder gatewayId(String gatewayId) {
            if (gatewayId == null) {
              throw new MissingRequiredPropertyException("GetSubnetResult", "gatewayId");
            }
            this.gatewayId = gatewayId;
            return this;
        }
        @CustomType.Setter
        public Builder gatewayIp(String gatewayIp) {
            if (gatewayIp == null) {
              throw new MissingRequiredPropertyException("GetSubnetResult", "gatewayIp");
            }
            this.gatewayIp = gatewayIp;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSubnetResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipCidrRange(String ipCidrRange) {
            if (ipCidrRange == null) {
              throw new MissingRequiredPropertyException("GetSubnetResult", "ipCidrRange");
            }
            this.ipCidrRange = ipCidrRange;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSubnetResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder parent(String parent) {
            if (parent == null) {
              throw new MissingRequiredPropertyException("GetSubnetResult", "parent");
            }
            this.parent = parent;
            return this;
        }
        @CustomType.Setter
        public Builder standardConfig(Boolean standardConfig) {
            if (standardConfig == null) {
              throw new MissingRequiredPropertyException("GetSubnetResult", "standardConfig");
            }
            this.standardConfig = standardConfig;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetSubnetResult", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetSubnetResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uid(String uid) {
            if (uid == null) {
              throw new MissingRequiredPropertyException("GetSubnetResult", "uid");
            }
            this.uid = uid;
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            if (updateTime == null) {
              throw new MissingRequiredPropertyException("GetSubnetResult", "updateTime");
            }
            this.updateTime = updateTime;
            return this;
        }
        @CustomType.Setter
        public Builder vlanId(Integer vlanId) {
            if (vlanId == null) {
              throw new MissingRequiredPropertyException("GetSubnetResult", "vlanId");
            }
            this.vlanId = vlanId;
            return this;
        }
        public GetSubnetResult build() {
            final var _resultValue = new GetSubnetResult();
            _resultValue.createTime = createTime;
            _resultValue.dhcpAddressRanges = dhcpAddressRanges;
            _resultValue.gatewayId = gatewayId;
            _resultValue.gatewayIp = gatewayIp;
            _resultValue.id = id;
            _resultValue.ipCidrRange = ipCidrRange;
            _resultValue.name = name;
            _resultValue.parent = parent;
            _resultValue.standardConfig = standardConfig;
            _resultValue.state = state;
            _resultValue.type = type;
            _resultValue.uid = uid;
            _resultValue.updateTime = updateTime;
            _resultValue.vlanId = vlanId;
            return _resultValue;
        }
    }
}