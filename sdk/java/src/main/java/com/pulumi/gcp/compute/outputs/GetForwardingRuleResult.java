// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.outputs.GetForwardingRuleServiceDirectoryRegistration;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetForwardingRuleResult {
    private Boolean allPorts;
    private Boolean allowGlobalAccess;
    private Boolean allowPscGlobalAccess;
    private String backendService;
    private String baseForwardingRule;
    private String creationTimestamp;
    private String description;
    private Map<String,String> effectiveLabels;
    private Integer forwardingRuleId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String ipAddress;
    private String ipCollection;
    private String ipProtocol;
    private String ipVersion;
    private Boolean isMirroringCollector;
    private String labelFingerprint;
    private Map<String,String> labels;
    private String loadBalancingScheme;
    private String name;
    private String network;
    private String networkTier;
    private Boolean noAutomateDnsZone;
    private String portRange;
    private List<String> ports;
    private @Nullable String project;
    private String pscConnectionId;
    private String pscConnectionStatus;
    private Map<String,String> pulumiLabels;
    private Boolean recreateClosedPsc;
    private @Nullable String region;
    private String selfLink;
    private List<GetForwardingRuleServiceDirectoryRegistration> serviceDirectoryRegistrations;
    private String serviceLabel;
    private String serviceName;
    private List<String> sourceIpRanges;
    private String subnetwork;
    private String target;

    private GetForwardingRuleResult() {}
    public Boolean allPorts() {
        return this.allPorts;
    }
    public Boolean allowGlobalAccess() {
        return this.allowGlobalAccess;
    }
    public Boolean allowPscGlobalAccess() {
        return this.allowPscGlobalAccess;
    }
    public String backendService() {
        return this.backendService;
    }
    public String baseForwardingRule() {
        return this.baseForwardingRule;
    }
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    public String description() {
        return this.description;
    }
    public Map<String,String> effectiveLabels() {
        return this.effectiveLabels;
    }
    public Integer forwardingRuleId() {
        return this.forwardingRuleId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String ipAddress() {
        return this.ipAddress;
    }
    public String ipCollection() {
        return this.ipCollection;
    }
    public String ipProtocol() {
        return this.ipProtocol;
    }
    public String ipVersion() {
        return this.ipVersion;
    }
    public Boolean isMirroringCollector() {
        return this.isMirroringCollector;
    }
    public String labelFingerprint() {
        return this.labelFingerprint;
    }
    public Map<String,String> labels() {
        return this.labels;
    }
    public String loadBalancingScheme() {
        return this.loadBalancingScheme;
    }
    public String name() {
        return this.name;
    }
    public String network() {
        return this.network;
    }
    public String networkTier() {
        return this.networkTier;
    }
    public Boolean noAutomateDnsZone() {
        return this.noAutomateDnsZone;
    }
    public String portRange() {
        return this.portRange;
    }
    public List<String> ports() {
        return this.ports;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public String pscConnectionId() {
        return this.pscConnectionId;
    }
    public String pscConnectionStatus() {
        return this.pscConnectionStatus;
    }
    public Map<String,String> pulumiLabels() {
        return this.pulumiLabels;
    }
    public Boolean recreateClosedPsc() {
        return this.recreateClosedPsc;
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public String selfLink() {
        return this.selfLink;
    }
    public List<GetForwardingRuleServiceDirectoryRegistration> serviceDirectoryRegistrations() {
        return this.serviceDirectoryRegistrations;
    }
    public String serviceLabel() {
        return this.serviceLabel;
    }
    public String serviceName() {
        return this.serviceName;
    }
    public List<String> sourceIpRanges() {
        return this.sourceIpRanges;
    }
    public String subnetwork() {
        return this.subnetwork;
    }
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetForwardingRuleResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allPorts;
        private Boolean allowGlobalAccess;
        private Boolean allowPscGlobalAccess;
        private String backendService;
        private String baseForwardingRule;
        private String creationTimestamp;
        private String description;
        private Map<String,String> effectiveLabels;
        private Integer forwardingRuleId;
        private String id;
        private String ipAddress;
        private String ipCollection;
        private String ipProtocol;
        private String ipVersion;
        private Boolean isMirroringCollector;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String loadBalancingScheme;
        private String name;
        private String network;
        private String networkTier;
        private Boolean noAutomateDnsZone;
        private String portRange;
        private List<String> ports;
        private @Nullable String project;
        private String pscConnectionId;
        private String pscConnectionStatus;
        private Map<String,String> pulumiLabels;
        private Boolean recreateClosedPsc;
        private @Nullable String region;
        private String selfLink;
        private List<GetForwardingRuleServiceDirectoryRegistration> serviceDirectoryRegistrations;
        private String serviceLabel;
        private String serviceName;
        private List<String> sourceIpRanges;
        private String subnetwork;
        private String target;
        public Builder() {}
        public Builder(GetForwardingRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allPorts = defaults.allPorts;
    	      this.allowGlobalAccess = defaults.allowGlobalAccess;
    	      this.allowPscGlobalAccess = defaults.allowPscGlobalAccess;
    	      this.backendService = defaults.backendService;
    	      this.baseForwardingRule = defaults.baseForwardingRule;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.effectiveLabels = defaults.effectiveLabels;
    	      this.forwardingRuleId = defaults.forwardingRuleId;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipCollection = defaults.ipCollection;
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.ipVersion = defaults.ipVersion;
    	      this.isMirroringCollector = defaults.isMirroringCollector;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.loadBalancingScheme = defaults.loadBalancingScheme;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkTier = defaults.networkTier;
    	      this.noAutomateDnsZone = defaults.noAutomateDnsZone;
    	      this.portRange = defaults.portRange;
    	      this.ports = defaults.ports;
    	      this.project = defaults.project;
    	      this.pscConnectionId = defaults.pscConnectionId;
    	      this.pscConnectionStatus = defaults.pscConnectionStatus;
    	      this.pulumiLabels = defaults.pulumiLabels;
    	      this.recreateClosedPsc = defaults.recreateClosedPsc;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.serviceDirectoryRegistrations = defaults.serviceDirectoryRegistrations;
    	      this.serviceLabel = defaults.serviceLabel;
    	      this.serviceName = defaults.serviceName;
    	      this.sourceIpRanges = defaults.sourceIpRanges;
    	      this.subnetwork = defaults.subnetwork;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder allPorts(Boolean allPorts) {
            if (allPorts == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "allPorts");
            }
            this.allPorts = allPorts;
            return this;
        }
        @CustomType.Setter
        public Builder allowGlobalAccess(Boolean allowGlobalAccess) {
            if (allowGlobalAccess == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "allowGlobalAccess");
            }
            this.allowGlobalAccess = allowGlobalAccess;
            return this;
        }
        @CustomType.Setter
        public Builder allowPscGlobalAccess(Boolean allowPscGlobalAccess) {
            if (allowPscGlobalAccess == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "allowPscGlobalAccess");
            }
            this.allowPscGlobalAccess = allowPscGlobalAccess;
            return this;
        }
        @CustomType.Setter
        public Builder backendService(String backendService) {
            if (backendService == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "backendService");
            }
            this.backendService = backendService;
            return this;
        }
        @CustomType.Setter
        public Builder baseForwardingRule(String baseForwardingRule) {
            if (baseForwardingRule == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "baseForwardingRule");
            }
            this.baseForwardingRule = baseForwardingRule;
            return this;
        }
        @CustomType.Setter
        public Builder creationTimestamp(String creationTimestamp) {
            if (creationTimestamp == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "creationTimestamp");
            }
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            if (effectiveLabels == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "effectiveLabels");
            }
            this.effectiveLabels = effectiveLabels;
            return this;
        }
        @CustomType.Setter
        public Builder forwardingRuleId(Integer forwardingRuleId) {
            if (forwardingRuleId == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "forwardingRuleId");
            }
            this.forwardingRuleId = forwardingRuleId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            if (ipAddress == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "ipAddress");
            }
            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder ipCollection(String ipCollection) {
            if (ipCollection == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "ipCollection");
            }
            this.ipCollection = ipCollection;
            return this;
        }
        @CustomType.Setter
        public Builder ipProtocol(String ipProtocol) {
            if (ipProtocol == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "ipProtocol");
            }
            this.ipProtocol = ipProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder ipVersion(String ipVersion) {
            if (ipVersion == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "ipVersion");
            }
            this.ipVersion = ipVersion;
            return this;
        }
        @CustomType.Setter
        public Builder isMirroringCollector(Boolean isMirroringCollector) {
            if (isMirroringCollector == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "isMirroringCollector");
            }
            this.isMirroringCollector = isMirroringCollector;
            return this;
        }
        @CustomType.Setter
        public Builder labelFingerprint(String labelFingerprint) {
            if (labelFingerprint == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "labelFingerprint");
            }
            this.labelFingerprint = labelFingerprint;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancingScheme(String loadBalancingScheme) {
            if (loadBalancingScheme == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "loadBalancingScheme");
            }
            this.loadBalancingScheme = loadBalancingScheme;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder network(String network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder networkTier(String networkTier) {
            if (networkTier == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "networkTier");
            }
            this.networkTier = networkTier;
            return this;
        }
        @CustomType.Setter
        public Builder noAutomateDnsZone(Boolean noAutomateDnsZone) {
            if (noAutomateDnsZone == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "noAutomateDnsZone");
            }
            this.noAutomateDnsZone = noAutomateDnsZone;
            return this;
        }
        @CustomType.Setter
        public Builder portRange(String portRange) {
            if (portRange == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "portRange");
            }
            this.portRange = portRange;
            return this;
        }
        @CustomType.Setter
        public Builder ports(List<String> ports) {
            if (ports == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "ports");
            }
            this.ports = ports;
            return this;
        }
        public Builder ports(String... ports) {
            return ports(List.of(ports));
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {

            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder pscConnectionId(String pscConnectionId) {
            if (pscConnectionId == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "pscConnectionId");
            }
            this.pscConnectionId = pscConnectionId;
            return this;
        }
        @CustomType.Setter
        public Builder pscConnectionStatus(String pscConnectionStatus) {
            if (pscConnectionStatus == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "pscConnectionStatus");
            }
            this.pscConnectionStatus = pscConnectionStatus;
            return this;
        }
        @CustomType.Setter
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            if (pulumiLabels == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "pulumiLabels");
            }
            this.pulumiLabels = pulumiLabels;
            return this;
        }
        @CustomType.Setter
        public Builder recreateClosedPsc(Boolean recreateClosedPsc) {
            if (recreateClosedPsc == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "recreateClosedPsc");
            }
            this.recreateClosedPsc = recreateClosedPsc;
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
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "selfLink");
            }
            this.selfLink = selfLink;
            return this;
        }
        @CustomType.Setter
        public Builder serviceDirectoryRegistrations(List<GetForwardingRuleServiceDirectoryRegistration> serviceDirectoryRegistrations) {
            if (serviceDirectoryRegistrations == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "serviceDirectoryRegistrations");
            }
            this.serviceDirectoryRegistrations = serviceDirectoryRegistrations;
            return this;
        }
        public Builder serviceDirectoryRegistrations(GetForwardingRuleServiceDirectoryRegistration... serviceDirectoryRegistrations) {
            return serviceDirectoryRegistrations(List.of(serviceDirectoryRegistrations));
        }
        @CustomType.Setter
        public Builder serviceLabel(String serviceLabel) {
            if (serviceLabel == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "serviceLabel");
            }
            this.serviceLabel = serviceLabel;
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            if (serviceName == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "serviceName");
            }
            this.serviceName = serviceName;
            return this;
        }
        @CustomType.Setter
        public Builder sourceIpRanges(List<String> sourceIpRanges) {
            if (sourceIpRanges == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "sourceIpRanges");
            }
            this.sourceIpRanges = sourceIpRanges;
            return this;
        }
        public Builder sourceIpRanges(String... sourceIpRanges) {
            return sourceIpRanges(List.of(sourceIpRanges));
        }
        @CustomType.Setter
        public Builder subnetwork(String subnetwork) {
            if (subnetwork == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "subnetwork");
            }
            this.subnetwork = subnetwork;
            return this;
        }
        @CustomType.Setter
        public Builder target(String target) {
            if (target == null) {
              throw new MissingRequiredPropertyException("GetForwardingRuleResult", "target");
            }
            this.target = target;
            return this;
        }
        public GetForwardingRuleResult build() {
            final var _resultValue = new GetForwardingRuleResult();
            _resultValue.allPorts = allPorts;
            _resultValue.allowGlobalAccess = allowGlobalAccess;
            _resultValue.allowPscGlobalAccess = allowPscGlobalAccess;
            _resultValue.backendService = backendService;
            _resultValue.baseForwardingRule = baseForwardingRule;
            _resultValue.creationTimestamp = creationTimestamp;
            _resultValue.description = description;
            _resultValue.effectiveLabels = effectiveLabels;
            _resultValue.forwardingRuleId = forwardingRuleId;
            _resultValue.id = id;
            _resultValue.ipAddress = ipAddress;
            _resultValue.ipCollection = ipCollection;
            _resultValue.ipProtocol = ipProtocol;
            _resultValue.ipVersion = ipVersion;
            _resultValue.isMirroringCollector = isMirroringCollector;
            _resultValue.labelFingerprint = labelFingerprint;
            _resultValue.labels = labels;
            _resultValue.loadBalancingScheme = loadBalancingScheme;
            _resultValue.name = name;
            _resultValue.network = network;
            _resultValue.networkTier = networkTier;
            _resultValue.noAutomateDnsZone = noAutomateDnsZone;
            _resultValue.portRange = portRange;
            _resultValue.ports = ports;
            _resultValue.project = project;
            _resultValue.pscConnectionId = pscConnectionId;
            _resultValue.pscConnectionStatus = pscConnectionStatus;
            _resultValue.pulumiLabels = pulumiLabels;
            _resultValue.recreateClosedPsc = recreateClosedPsc;
            _resultValue.region = region;
            _resultValue.selfLink = selfLink;
            _resultValue.serviceDirectoryRegistrations = serviceDirectoryRegistrations;
            _resultValue.serviceLabel = serviceLabel;
            _resultValue.serviceName = serviceName;
            _resultValue.sourceIpRanges = sourceIpRanges;
            _resultValue.subnetwork = subnetwork;
            _resultValue.target = target;
            return _resultValue;
        }
    }
}
