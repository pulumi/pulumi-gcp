// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetAccessPolicyResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Resource name of the AccessPolicy.
     * 
     */
    private String name;
    private String parent;
    private @Nullable List<String> scopes;
    /**
     * @return Human readable title. Does not affect behavior.
     * 
     */
    private String title;

    private GetAccessPolicyResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource name of the AccessPolicy.
     * 
     */
    public String name() {
        return this.name;
    }
    public String parent() {
        return this.parent;
    }
    public List<String> scopes() {
        return this.scopes == null ? List.of() : this.scopes;
    }
    /**
     * @return Human readable title. Does not affect behavior.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private String parent;
        private @Nullable List<String> scopes;
        private String title;
        public Builder() {}
        public Builder(GetAccessPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.scopes = defaults.scopes;
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAccessPolicyResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAccessPolicyResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder parent(String parent) {
            if (parent == null) {
              throw new MissingRequiredPropertyException("GetAccessPolicyResult", "parent");
            }
            this.parent = parent;
            return this;
        }
        @CustomType.Setter
        public Builder scopes(@Nullable List<String> scopes) {

            this.scopes = scopes;
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        @CustomType.Setter
        public Builder title(String title) {
            if (title == null) {
              throw new MissingRequiredPropertyException("GetAccessPolicyResult", "title");
            }
            this.title = title;
            return this;
        }
        public GetAccessPolicyResult build() {
            final var _resultValue = new GetAccessPolicyResult();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.parent = parent;
            _resultValue.scopes = scopes;
            _resultValue.title = title;
            return _resultValue;
        }
    }
}
