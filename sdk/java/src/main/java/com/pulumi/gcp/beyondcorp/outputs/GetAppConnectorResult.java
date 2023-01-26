// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.beyondcorp.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.beyondcorp.outputs.GetAppConnectorPrincipalInfo;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppConnectorResult {
    private String displayName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Map<String,String> labels;
    private String name;
    private List<GetAppConnectorPrincipalInfo> principalInfos;
    private @Nullable String project;
    private @Nullable String region;
    private String state;

    private GetAppConnectorResult() {}
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Map<String,String> labels() {
        return this.labels;
    }
    public String name() {
        return this.name;
    }
    public List<GetAppConnectorPrincipalInfo> principalInfos() {
        return this.principalInfos;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppConnectorResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String displayName;
        private String id;
        private Map<String,String> labels;
        private String name;
        private List<GetAppConnectorPrincipalInfo> principalInfos;
        private @Nullable String project;
        private @Nullable String region;
        private String state;
        public Builder() {}
        public Builder(GetAppConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.principalInfos = defaults.principalInfos;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder principalInfos(List<GetAppConnectorPrincipalInfo> principalInfos) {
            this.principalInfos = Objects.requireNonNull(principalInfos);
            return this;
        }
        public Builder principalInfos(GetAppConnectorPrincipalInfo... principalInfos) {
            return principalInfos(List.of(principalInfos));
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetAppConnectorResult build() {
            final var o = new GetAppConnectorResult();
            o.displayName = displayName;
            o.id = id;
            o.labels = labels;
            o.name = name;
            o.principalInfos = principalInfos;
            o.project = project;
            o.region = region;
            o.state = state;
            return o;
        }
    }
}