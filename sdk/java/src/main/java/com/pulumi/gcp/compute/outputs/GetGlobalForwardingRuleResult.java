// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.GetGlobalForwardingRuleMetadataFilter;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGlobalForwardingRuleResult {
    private final String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String ipAddress;
    private final String ipProtocol;
    private final String ipVersion;
    private final String labelFingerprint;
    private final Map<String,String> labels;
    private final String loadBalancingScheme;
    private final List<GetGlobalForwardingRuleMetadataFilter> metadataFilters;
    private final String name;
    private final String network;
    private final String portRange;
    private final @Nullable String project;
    private final String pscConnectionId;
    private final String pscConnectionStatus;
    private final String selfLink;
    private final String target;

    @CustomType.Constructor
    private GetGlobalForwardingRuleResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("ipProtocol") String ipProtocol,
        @CustomType.Parameter("ipVersion") String ipVersion,
        @CustomType.Parameter("labelFingerprint") String labelFingerprint,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("loadBalancingScheme") String loadBalancingScheme,
        @CustomType.Parameter("metadataFilters") List<GetGlobalForwardingRuleMetadataFilter> metadataFilters,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("portRange") String portRange,
        @CustomType.Parameter("project") @Nullable String project,
        @CustomType.Parameter("pscConnectionId") String pscConnectionId,
        @CustomType.Parameter("pscConnectionStatus") String pscConnectionStatus,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("target") String target) {
        this.description = description;
        this.id = id;
        this.ipAddress = ipAddress;
        this.ipProtocol = ipProtocol;
        this.ipVersion = ipVersion;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.loadBalancingScheme = loadBalancingScheme;
        this.metadataFilters = metadataFilters;
        this.name = name;
        this.network = network;
        this.portRange = portRange;
        this.project = project;
        this.pscConnectionId = pscConnectionId;
        this.pscConnectionStatus = pscConnectionStatus;
        this.selfLink = selfLink;
        this.target = target;
    }

    public String description() {
        return this.description;
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
    public String ipProtocol() {
        return this.ipProtocol;
    }
    public String ipVersion() {
        return this.ipVersion;
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
    public List<GetGlobalForwardingRuleMetadataFilter> metadataFilters() {
        return this.metadataFilters;
    }
    public String name() {
        return this.name;
    }
    public String network() {
        return this.network;
    }
    public String portRange() {
        return this.portRange;
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
    public String selfLink() {
        return this.selfLink;
    }
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalForwardingRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String id;
        private String ipAddress;
        private String ipProtocol;
        private String ipVersion;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String loadBalancingScheme;
        private List<GetGlobalForwardingRuleMetadataFilter> metadataFilters;
        private String name;
        private String network;
        private String portRange;
        private @Nullable String project;
        private String pscConnectionId;
        private String pscConnectionStatus;
        private String selfLink;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalForwardingRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.ipVersion = defaults.ipVersion;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.loadBalancingScheme = defaults.loadBalancingScheme;
    	      this.metadataFilters = defaults.metadataFilters;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.portRange = defaults.portRange;
    	      this.project = defaults.project;
    	      this.pscConnectionId = defaults.pscConnectionId;
    	      this.pscConnectionStatus = defaults.pscConnectionStatus;
    	      this.selfLink = defaults.selfLink;
    	      this.target = defaults.target;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder ipProtocol(String ipProtocol) {
            this.ipProtocol = Objects.requireNonNull(ipProtocol);
            return this;
        }
        public Builder ipVersion(String ipVersion) {
            this.ipVersion = Objects.requireNonNull(ipVersion);
            return this;
        }
        public Builder labelFingerprint(String labelFingerprint) {
            this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder loadBalancingScheme(String loadBalancingScheme) {
            this.loadBalancingScheme = Objects.requireNonNull(loadBalancingScheme);
            return this;
        }
        public Builder metadataFilters(List<GetGlobalForwardingRuleMetadataFilter> metadataFilters) {
            this.metadataFilters = Objects.requireNonNull(metadataFilters);
            return this;
        }
        public Builder metadataFilters(GetGlobalForwardingRuleMetadataFilter... metadataFilters) {
            return metadataFilters(List.of(metadataFilters));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder portRange(String portRange) {
            this.portRange = Objects.requireNonNull(portRange);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder pscConnectionId(String pscConnectionId) {
            this.pscConnectionId = Objects.requireNonNull(pscConnectionId);
            return this;
        }
        public Builder pscConnectionStatus(String pscConnectionStatus) {
            this.pscConnectionStatus = Objects.requireNonNull(pscConnectionStatus);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }        public GetGlobalForwardingRuleResult build() {
            return new GetGlobalForwardingRuleResult(description, id, ipAddress, ipProtocol, ipVersion, labelFingerprint, labels, loadBalancingScheme, metadataFilters, name, network, portRange, project, pscConnectionId, pscConnectionStatus, selfLink, target);
        }
    }
}