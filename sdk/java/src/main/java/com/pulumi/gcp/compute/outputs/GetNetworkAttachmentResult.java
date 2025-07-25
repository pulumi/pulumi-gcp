// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.outputs.GetNetworkAttachmentConnectionEndpoint;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworkAttachmentResult {
    private List<GetNetworkAttachmentConnectionEndpoint> connectionEndpoints;
    private String connectionPreference;
    private String creationTimestamp;
    private String description;
    private String fingerprint;
    private String id;
    private String kind;
    private String name;
    private String network;
    private List<String> producerAcceptLists;
    private List<String> producerRejectLists;
    private @Nullable String project;
    private String region;
    private String selfLink;
    private String selfLinkWithId;
    private List<String> subnetworks;

    private GetNetworkAttachmentResult() {}
    public List<GetNetworkAttachmentConnectionEndpoint> connectionEndpoints() {
        return this.connectionEndpoints;
    }
    public String connectionPreference() {
        return this.connectionPreference;
    }
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    public String description() {
        return this.description;
    }
    public String fingerprint() {
        return this.fingerprint;
    }
    public String id() {
        return this.id;
    }
    public String kind() {
        return this.kind;
    }
    public String name() {
        return this.name;
    }
    public String network() {
        return this.network;
    }
    public List<String> producerAcceptLists() {
        return this.producerAcceptLists;
    }
    public List<String> producerRejectLists() {
        return this.producerRejectLists;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public String region() {
        return this.region;
    }
    public String selfLink() {
        return this.selfLink;
    }
    public String selfLinkWithId() {
        return this.selfLinkWithId;
    }
    public List<String> subnetworks() {
        return this.subnetworks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkAttachmentResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetNetworkAttachmentConnectionEndpoint> connectionEndpoints;
        private String connectionPreference;
        private String creationTimestamp;
        private String description;
        private String fingerprint;
        private String id;
        private String kind;
        private String name;
        private String network;
        private List<String> producerAcceptLists;
        private List<String> producerRejectLists;
        private @Nullable String project;
        private String region;
        private String selfLink;
        private String selfLinkWithId;
        private List<String> subnetworks;
        public Builder() {}
        public Builder(GetNetworkAttachmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionEndpoints = defaults.connectionEndpoints;
    	      this.connectionPreference = defaults.connectionPreference;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.producerAcceptLists = defaults.producerAcceptLists;
    	      this.producerRejectLists = defaults.producerRejectLists;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.subnetworks = defaults.subnetworks;
        }

        @CustomType.Setter
        public Builder connectionEndpoints(List<GetNetworkAttachmentConnectionEndpoint> connectionEndpoints) {
            if (connectionEndpoints == null) {
              throw new MissingRequiredPropertyException("GetNetworkAttachmentResult", "connectionEndpoints");
            }
            this.connectionEndpoints = connectionEndpoints;
            return this;
        }
        public Builder connectionEndpoints(GetNetworkAttachmentConnectionEndpoint... connectionEndpoints) {
            return connectionEndpoints(List.of(connectionEndpoints));
        }
        @CustomType.Setter
        public Builder connectionPreference(String connectionPreference) {
            if (connectionPreference == null) {
              throw new MissingRequiredPropertyException("GetNetworkAttachmentResult", "connectionPreference");
            }
            this.connectionPreference = connectionPreference;
            return this;
        }
        @CustomType.Setter
        public Builder creationTimestamp(String creationTimestamp) {
            if (creationTimestamp == null) {
              throw new MissingRequiredPropertyException("GetNetworkAttachmentResult", "creationTimestamp");
            }
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetNetworkAttachmentResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder fingerprint(String fingerprint) {
            if (fingerprint == null) {
              throw new MissingRequiredPropertyException("GetNetworkAttachmentResult", "fingerprint");
            }
            this.fingerprint = fingerprint;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNetworkAttachmentResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("GetNetworkAttachmentResult", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetNetworkAttachmentResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder network(String network) {
            if (network == null) {
              throw new MissingRequiredPropertyException("GetNetworkAttachmentResult", "network");
            }
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder producerAcceptLists(List<String> producerAcceptLists) {
            if (producerAcceptLists == null) {
              throw new MissingRequiredPropertyException("GetNetworkAttachmentResult", "producerAcceptLists");
            }
            this.producerAcceptLists = producerAcceptLists;
            return this;
        }
        public Builder producerAcceptLists(String... producerAcceptLists) {
            return producerAcceptLists(List.of(producerAcceptLists));
        }
        @CustomType.Setter
        public Builder producerRejectLists(List<String> producerRejectLists) {
            if (producerRejectLists == null) {
              throw new MissingRequiredPropertyException("GetNetworkAttachmentResult", "producerRejectLists");
            }
            this.producerRejectLists = producerRejectLists;
            return this;
        }
        public Builder producerRejectLists(String... producerRejectLists) {
            return producerRejectLists(List.of(producerRejectLists));
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {

            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetNetworkAttachmentResult", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            if (selfLink == null) {
              throw new MissingRequiredPropertyException("GetNetworkAttachmentResult", "selfLink");
            }
            this.selfLink = selfLink;
            return this;
        }
        @CustomType.Setter
        public Builder selfLinkWithId(String selfLinkWithId) {
            if (selfLinkWithId == null) {
              throw new MissingRequiredPropertyException("GetNetworkAttachmentResult", "selfLinkWithId");
            }
            this.selfLinkWithId = selfLinkWithId;
            return this;
        }
        @CustomType.Setter
        public Builder subnetworks(List<String> subnetworks) {
            if (subnetworks == null) {
              throw new MissingRequiredPropertyException("GetNetworkAttachmentResult", "subnetworks");
            }
            this.subnetworks = subnetworks;
            return this;
        }
        public Builder subnetworks(String... subnetworks) {
            return subnetworks(List.of(subnetworks));
        }
        public GetNetworkAttachmentResult build() {
            final var _resultValue = new GetNetworkAttachmentResult();
            _resultValue.connectionEndpoints = connectionEndpoints;
            _resultValue.connectionPreference = connectionPreference;
            _resultValue.creationTimestamp = creationTimestamp;
            _resultValue.description = description;
            _resultValue.fingerprint = fingerprint;
            _resultValue.id = id;
            _resultValue.kind = kind;
            _resultValue.name = name;
            _resultValue.network = network;
            _resultValue.producerAcceptLists = producerAcceptLists;
            _resultValue.producerRejectLists = producerRejectLists;
            _resultValue.project = project;
            _resultValue.region = region;
            _resultValue.selfLink = selfLink;
            _resultValue.selfLinkWithId = selfLinkWithId;
            _resultValue.subnetworks = subnetworks;
            return _resultValue;
        }
    }
}
