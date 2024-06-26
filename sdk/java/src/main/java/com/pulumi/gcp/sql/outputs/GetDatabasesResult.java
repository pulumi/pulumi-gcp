// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.sql.outputs.GetDatabasesDatabase;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDatabasesResult {
    private List<GetDatabasesDatabase> databases;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String instance;
    private @Nullable String project;

    private GetDatabasesResult() {}
    public List<GetDatabasesDatabase> databases() {
        return this.databases;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instance() {
        return this.instance;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabasesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDatabasesDatabase> databases;
        private String id;
        private String instance;
        private @Nullable String project;
        public Builder() {}
        public Builder(GetDatabasesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databases = defaults.databases;
    	      this.id = defaults.id;
    	      this.instance = defaults.instance;
    	      this.project = defaults.project;
        }

        @CustomType.Setter
        public Builder databases(List<GetDatabasesDatabase> databases) {
            if (databases == null) {
              throw new MissingRequiredPropertyException("GetDatabasesResult", "databases");
            }
            this.databases = databases;
            return this;
        }
        public Builder databases(GetDatabasesDatabase... databases) {
            return databases(List.of(databases));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDatabasesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instance(String instance) {
            if (instance == null) {
              throw new MissingRequiredPropertyException("GetDatabasesResult", "instance");
            }
            this.instance = instance;
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {

            this.project = project;
            return this;
        }
        public GetDatabasesResult build() {
            final var _resultValue = new GetDatabasesResult();
            _resultValue.databases = databases;
            _resultValue.id = id;
            _resultValue.instance = instance;
            _resultValue.project = project;
            return _resultValue;
        }
    }
}
