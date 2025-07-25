// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firestore.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDocumentResult {
    private String collection;
    private String createTime;
    private String database;
    private String documentId;
    private String fields;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    private String path;
    private @Nullable String project;
    private String updateTime;

    private GetDocumentResult() {}
    public String collection() {
        return this.collection;
    }
    public String createTime() {
        return this.createTime;
    }
    public String database() {
        return this.database;
    }
    public String documentId() {
        return this.documentId;
    }
    public String fields() {
        return this.fields;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String path() {
        return this.path;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDocumentResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String collection;
        private String createTime;
        private String database;
        private String documentId;
        private String fields;
        private String id;
        private String name;
        private String path;
        private @Nullable String project;
        private String updateTime;
        public Builder() {}
        public Builder(GetDocumentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collection = defaults.collection;
    	      this.createTime = defaults.createTime;
    	      this.database = defaults.database;
    	      this.documentId = defaults.documentId;
    	      this.fields = defaults.fields;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.project = defaults.project;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder collection(String collection) {
            if (collection == null) {
              throw new MissingRequiredPropertyException("GetDocumentResult", "collection");
            }
            this.collection = collection;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetDocumentResult", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder database(String database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("GetDocumentResult", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder documentId(String documentId) {
            if (documentId == null) {
              throw new MissingRequiredPropertyException("GetDocumentResult", "documentId");
            }
            this.documentId = documentId;
            return this;
        }
        @CustomType.Setter
        public Builder fields(String fields) {
            if (fields == null) {
              throw new MissingRequiredPropertyException("GetDocumentResult", "fields");
            }
            this.fields = fields;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDocumentResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDocumentResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("GetDocumentResult", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {

            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            if (updateTime == null) {
              throw new MissingRequiredPropertyException("GetDocumentResult", "updateTime");
            }
            this.updateTime = updateTime;
            return this;
        }
        public GetDocumentResult build() {
            final var _resultValue = new GetDocumentResult();
            _resultValue.collection = collection;
            _resultValue.createTime = createTime;
            _resultValue.database = database;
            _resultValue.documentId = documentId;
            _resultValue.fields = fields;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.path = path;
            _resultValue.project = project;
            _resultValue.updateTime = updateTime;
            return _resultValue;
        }
    }
}
