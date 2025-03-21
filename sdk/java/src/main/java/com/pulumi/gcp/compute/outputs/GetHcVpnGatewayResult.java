// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.outputs.GetHcVpnGatewayVpnInterface;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHcVpnGatewayResult {
    private String description;
    private Map<String,String> effectiveLabels;
    private String gatewayIpVersion;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String labelFingerprint;
    private Map<String,String> labels;
    private String name;
    private String network;
    private @Nullable String project;
    private Map<String,String> pulumiLabels;
    private @Nullable String region;
    private String selfLink;
    private String stackType;
    private List<GetHcVpnGatewayVpnInterface> vpnInterfaces;

    private GetHcVpnGatewayResult() {}
    public String description() {
        return this.description;
    }
    public Map<String,String> effectiveLabels() {
        return this.effectiveLabels;
    }
    public String gatewayIpVersion() {
        return this.gatewayIpVersion;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String labelFingerprint() {
        return this.labelFingerprint;
    }
    public Map<String,String> labels() {
        return this.labels;
    }
    public String name() {
        return this.name;
    }
    public String network() {
        return this.network;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public Map<String,String> pulumiLabels() {
        return this.pulumiLabels;
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public String selfLink() {
        return this.selfLink;
    }
    public String stackType() {
        return this.stackType;
    }
    public List<GetHcVpnGatewayVpnInterface> vpnInterfaces() {
        return this.vpnInterfaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHcVpnGatewayResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private Map<String,String> effectiveLabels;
        private String gatewayIpVersion;
        private String id;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String name;
        private String network;
        private @Nullable String project;
        private Map<String,String> pulumiLabels;
        private @Nullable String region;
        private String selfLink;
        private String stackType;
        private List<GetHcVpnGatewayVpnInterface> vpnInterfaces;
        public Builder() {}
        public Builder(GetHcVpnGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.effectiveLabels = defaults.effectiveLabels;
    	      this.gatewayIpVersion = defaults.gatewayIpVersion;
    	      this.id = defaults.id;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.pulumiLabels = defaults.pulumiLabels;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.stackType = defaults.stackType;
    	      this.vpnInterfaces = defaults.vpnInterfaces;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetHcVpnGatewayResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            if (effectiveLabels == null) {
              throw new MissingRequiredPropertyException("GetHcVpnGatewayResult", "effectiveLabels");
            }
            this.effectiveLabels = effectiveLabels;
            return this;
        }
        @CustomType.Setter
        public Builder gatewayIpVersion(String gatewayIpVersion) {
            if (gatewayIpVersion == null) {
              throw new MissingRequiredPropertyException("GetHcVpnGatewayResult", "gatewayIpVersion");
            }
            this.gatewayIpVersion = gatewayIpVersion;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetHcVpnGatewayResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder labelFingerprint(String labelFingerprint) {
            if (labelFingerprint == null) {
              throw new MissingRequiredPropertyException("GetHcVpnGatewayResult", "labelFingerprint");
            }
            this.labelFingerprint = labelFingerprint;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetHcVpnGatewayResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetHcVpnGatewayResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder network(String network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetHcVpnGatewayResult", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {

            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            if (pulumiLabels == null) {
              throw new MissingRequiredPropertyException("GetHcVpnGatewayResult", "pulumiLabels");
            }
            this.pulumiLabels = pulumiLabels;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            if (selfLink == null) {
              throw new MissingRequiredPropertyException("GetHcVpnGatewayResult", "selfLink");
            }
            this.selfLink = selfLink;
            return this;
        }
        @CustomType.Setter
        public Builder stackType(String stackType) {
            if (stackType == null) {
              throw new MissingRequiredPropertyException("GetHcVpnGatewayResult", "stackType");
            }
            this.stackType = stackType;
            return this;
        }
        @CustomType.Setter
        public Builder vpnInterfaces(List<GetHcVpnGatewayVpnInterface> vpnInterfaces) {
            if (vpnInterfaces == null) {
              throw new MissingRequiredPropertyException("GetHcVpnGatewayResult", "vpnInterfaces");
            }
            this.vpnInterfaces = vpnInterfaces;
            return this;
        }
        public Builder vpnInterfaces(GetHcVpnGatewayVpnInterface... vpnInterfaces) {
            return vpnInterfaces(List.of(vpnInterfaces));
        }
        public GetHcVpnGatewayResult build() {
            final var _resultValue = new GetHcVpnGatewayResult();
            _resultValue.description = description;
            _resultValue.effectiveLabels = effectiveLabels;
            _resultValue.gatewayIpVersion = gatewayIpVersion;
            _resultValue.id = id;
            _resultValue.labelFingerprint = labelFingerprint;
            _resultValue.labels = labels;
            _resultValue.name = name;
            _resultValue.network = network;
            _resultValue.project = project;
            _resultValue.pulumiLabels = pulumiLabels;
            _resultValue.region = region;
            _resultValue.selfLink = selfLink;
            _resultValue.stackType = stackType;
            _resultValue.vpnInterfaces = vpnInterfaces;
            return _resultValue;
        }
    }
}
