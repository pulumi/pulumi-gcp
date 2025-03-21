// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apphub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.apphub.outputs.GetDiscoveredServiceServiceProperty;
import com.pulumi.gcp.apphub.outputs.GetDiscoveredServiceServiceReference;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDiscoveredServiceResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The location that the underlying resource resides in.
     * 
     */
    private String location;
    /**
     * @return Resource name of a Service. Format: &#34;projects/{host-project-id}/locations/{location}/applications/{application-id}/services/{service-id}&#34;.
     * 
     */
    private String name;
    private @Nullable String project;
    /**
     * @return Properties of an underlying compute resource that can comprise a Service. Structure is documented below
     * 
     */
    private List<GetDiscoveredServiceServiceProperty> serviceProperties;
    /**
     * @return Reference to an underlying networking resource that can comprise a Service. Structure is documented below
     * 
     */
    private List<GetDiscoveredServiceServiceReference> serviceReferences;
    private String serviceUri;

    private GetDiscoveredServiceResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The location that the underlying resource resides in.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Resource name of a Service. Format: &#34;projects/{host-project-id}/locations/{location}/applications/{application-id}/services/{service-id}&#34;.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    /**
     * @return Properties of an underlying compute resource that can comprise a Service. Structure is documented below
     * 
     */
    public List<GetDiscoveredServiceServiceProperty> serviceProperties() {
        return this.serviceProperties;
    }
    /**
     * @return Reference to an underlying networking resource that can comprise a Service. Structure is documented below
     * 
     */
    public List<GetDiscoveredServiceServiceReference> serviceReferences() {
        return this.serviceReferences;
    }
    public String serviceUri() {
        return this.serviceUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiscoveredServiceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private @Nullable String project;
        private List<GetDiscoveredServiceServiceProperty> serviceProperties;
        private List<GetDiscoveredServiceServiceReference> serviceReferences;
        private String serviceUri;
        public Builder() {}
        public Builder(GetDiscoveredServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serviceProperties = defaults.serviceProperties;
    	      this.serviceReferences = defaults.serviceReferences;
    	      this.serviceUri = defaults.serviceUri;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDiscoveredServiceResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetDiscoveredServiceResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDiscoveredServiceResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {

            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder serviceProperties(List<GetDiscoveredServiceServiceProperty> serviceProperties) {
            if (serviceProperties == null) {
              throw new MissingRequiredPropertyException("GetDiscoveredServiceResult", "serviceProperties");
            }
            this.serviceProperties = serviceProperties;
            return this;
        }
        public Builder serviceProperties(GetDiscoveredServiceServiceProperty... serviceProperties) {
            return serviceProperties(List.of(serviceProperties));
        }
        @CustomType.Setter
        public Builder serviceReferences(List<GetDiscoveredServiceServiceReference> serviceReferences) {
            if (serviceReferences == null) {
              throw new MissingRequiredPropertyException("GetDiscoveredServiceResult", "serviceReferences");
            }
            this.serviceReferences = serviceReferences;
            return this;
        }
        public Builder serviceReferences(GetDiscoveredServiceServiceReference... serviceReferences) {
            return serviceReferences(List.of(serviceReferences));
        }
        @CustomType.Setter
        public Builder serviceUri(String serviceUri) {
            if (serviceUri == null) {
              throw new MissingRequiredPropertyException("GetDiscoveredServiceResult", "serviceUri");
            }
            this.serviceUri = serviceUri;
            return this;
        }
        public GetDiscoveredServiceResult build() {
            final var _resultValue = new GetDiscoveredServiceResult();
            _resultValue.id = id;
            _resultValue.location = location;
            _resultValue.name = name;
            _resultValue.project = project;
            _resultValue.serviceProperties = serviceProperties;
            _resultValue.serviceReferences = serviceReferences;
            _resultValue.serviceUri = serviceUri;
            return _resultValue;
        }
    }
}
