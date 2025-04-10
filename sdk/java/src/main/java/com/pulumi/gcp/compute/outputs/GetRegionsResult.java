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
public final class GetRegionsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of regions available in the given project
     * 
     */
    private List<String> names;
    private String project;
    private @Nullable String status;

    private GetRegionsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of regions available in the given project
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public String project() {
        return this.project;
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> names;
        private String project;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetRegionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.names = defaults.names;
    	      this.project = defaults.project;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRegionsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetRegionsResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder project(String project) {
            if (project == null) {
              throw new MissingRequiredPropertyException("GetRegionsResult", "project");
            }
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetRegionsResult build() {
            final var _resultValue = new GetRegionsResult();
            _resultValue.id = id;
            _resultValue.names = names;
            _resultValue.project = project;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
