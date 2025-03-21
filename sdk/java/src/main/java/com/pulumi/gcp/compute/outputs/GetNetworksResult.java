// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworksResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The list of networks in the specified project.
     * 
     */
    private List<String> networks;
    /**
     * @return The project name being queried.
     * 
     */
    private @Nullable String project;
    /**
     * @return The URI of the resource.
     * 
     */
    private String selfLink;

    private GetNetworksResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The list of networks in the specified project.
     * 
     */
    public List<String> networks() {
        return this.networks;
    }
    /**
     * @return The project name being queried.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    /**
     * @return The URI of the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworksResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> networks;
        private @Nullable String project;
        private String selfLink;
        public Builder() {}
        public Builder(GetNetworksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.networks = defaults.networks;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNetworksResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder networks(List<String> networks) {
            if (networks == null) {
              throw new MissingRequiredPropertyException("GetNetworksResult", "networks");
            }
            this.networks = networks;
            return this;
        }
        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {

            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            if (selfLink == null) {
              throw new MissingRequiredPropertyException("GetNetworksResult", "selfLink");
            }
            this.selfLink = selfLink;
            return this;
        }
        public GetNetworksResult build() {
            final var _resultValue = new GetNetworksResult();
            _resultValue.id = id;
            _resultValue.networks = networks;
            _resultValue.project = project;
            _resultValue.selfLink = selfLink;
            return _resultValue;
        }
    }
}
