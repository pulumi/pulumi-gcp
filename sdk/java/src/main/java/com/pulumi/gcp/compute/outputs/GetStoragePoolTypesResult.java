// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.outputs.GetStoragePoolTypesDeprecated;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetStoragePoolTypesResult {
    private String creationTimestamp;
    private List<GetStoragePoolTypesDeprecated> deprecateds;
    private String description;
    private Integer id;
    private String kind;
    private Integer maxPoolProvisionedCapacityGb;
    private Integer maxPoolProvisionedIops;
    private Integer maxPoolProvisionedThroughput;
    private Integer minPoolProvisionedCapacityGb;
    private Integer minPoolProvisionedIops;
    private Integer minPoolProvisionedThroughput;
    private String name;
    private String project;
    private String selfLink;
    private String selfLinkWithId;
    private String storagePoolType;
    private List<String> supportedDiskTypes;
    private String zone;

    private GetStoragePoolTypesResult() {}
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    public List<GetStoragePoolTypesDeprecated> deprecateds() {
        return this.deprecateds;
    }
    public String description() {
        return this.description;
    }
    public Integer id() {
        return this.id;
    }
    public String kind() {
        return this.kind;
    }
    public Integer maxPoolProvisionedCapacityGb() {
        return this.maxPoolProvisionedCapacityGb;
    }
    public Integer maxPoolProvisionedIops() {
        return this.maxPoolProvisionedIops;
    }
    public Integer maxPoolProvisionedThroughput() {
        return this.maxPoolProvisionedThroughput;
    }
    public Integer minPoolProvisionedCapacityGb() {
        return this.minPoolProvisionedCapacityGb;
    }
    public Integer minPoolProvisionedIops() {
        return this.minPoolProvisionedIops;
    }
    public Integer minPoolProvisionedThroughput() {
        return this.minPoolProvisionedThroughput;
    }
    public String name() {
        return this.name;
    }
    public String project() {
        return this.project;
    }
    public String selfLink() {
        return this.selfLink;
    }
    public String selfLinkWithId() {
        return this.selfLinkWithId;
    }
    public String storagePoolType() {
        return this.storagePoolType;
    }
    public List<String> supportedDiskTypes() {
        return this.supportedDiskTypes;
    }
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStoragePoolTypesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String creationTimestamp;
        private List<GetStoragePoolTypesDeprecated> deprecateds;
        private String description;
        private Integer id;
        private String kind;
        private Integer maxPoolProvisionedCapacityGb;
        private Integer maxPoolProvisionedIops;
        private Integer maxPoolProvisionedThroughput;
        private Integer minPoolProvisionedCapacityGb;
        private Integer minPoolProvisionedIops;
        private Integer minPoolProvisionedThroughput;
        private String name;
        private String project;
        private String selfLink;
        private String selfLinkWithId;
        private String storagePoolType;
        private List<String> supportedDiskTypes;
        private String zone;
        public Builder() {}
        public Builder(GetStoragePoolTypesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.deprecateds = defaults.deprecateds;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.maxPoolProvisionedCapacityGb = defaults.maxPoolProvisionedCapacityGb;
    	      this.maxPoolProvisionedIops = defaults.maxPoolProvisionedIops;
    	      this.maxPoolProvisionedThroughput = defaults.maxPoolProvisionedThroughput;
    	      this.minPoolProvisionedCapacityGb = defaults.minPoolProvisionedCapacityGb;
    	      this.minPoolProvisionedIops = defaults.minPoolProvisionedIops;
    	      this.minPoolProvisionedThroughput = defaults.minPoolProvisionedThroughput;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.storagePoolType = defaults.storagePoolType;
    	      this.supportedDiskTypes = defaults.supportedDiskTypes;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder creationTimestamp(String creationTimestamp) {
            if (creationTimestamp == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "creationTimestamp");
            }
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        @CustomType.Setter
        public Builder deprecateds(List<GetStoragePoolTypesDeprecated> deprecateds) {
            if (deprecateds == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "deprecateds");
            }
            this.deprecateds = deprecateds;
            return this;
        }
        public Builder deprecateds(GetStoragePoolTypesDeprecated... deprecateds) {
            return deprecateds(List.of(deprecateds));
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder maxPoolProvisionedCapacityGb(Integer maxPoolProvisionedCapacityGb) {
            if (maxPoolProvisionedCapacityGb == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "maxPoolProvisionedCapacityGb");
            }
            this.maxPoolProvisionedCapacityGb = maxPoolProvisionedCapacityGb;
            return this;
        }
        @CustomType.Setter
        public Builder maxPoolProvisionedIops(Integer maxPoolProvisionedIops) {
            if (maxPoolProvisionedIops == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "maxPoolProvisionedIops");
            }
            this.maxPoolProvisionedIops = maxPoolProvisionedIops;
            return this;
        }
        @CustomType.Setter
        public Builder maxPoolProvisionedThroughput(Integer maxPoolProvisionedThroughput) {
            if (maxPoolProvisionedThroughput == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "maxPoolProvisionedThroughput");
            }
            this.maxPoolProvisionedThroughput = maxPoolProvisionedThroughput;
            return this;
        }
        @CustomType.Setter
        public Builder minPoolProvisionedCapacityGb(Integer minPoolProvisionedCapacityGb) {
            if (minPoolProvisionedCapacityGb == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "minPoolProvisionedCapacityGb");
            }
            this.minPoolProvisionedCapacityGb = minPoolProvisionedCapacityGb;
            return this;
        }
        @CustomType.Setter
        public Builder minPoolProvisionedIops(Integer minPoolProvisionedIops) {
            if (minPoolProvisionedIops == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "minPoolProvisionedIops");
            }
            this.minPoolProvisionedIops = minPoolProvisionedIops;
            return this;
        }
        @CustomType.Setter
        public Builder minPoolProvisionedThroughput(Integer minPoolProvisionedThroughput) {
            if (minPoolProvisionedThroughput == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "minPoolProvisionedThroughput");
            }
            this.minPoolProvisionedThroughput = minPoolProvisionedThroughput;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            if (project == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "project");
            }
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            if (selfLink == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "selfLink");
            }
            this.selfLink = selfLink;
            return this;
        }
        @CustomType.Setter
        public Builder selfLinkWithId(String selfLinkWithId) {
            if (selfLinkWithId == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "selfLinkWithId");
            }
            this.selfLinkWithId = selfLinkWithId;
            return this;
        }
        @CustomType.Setter
        public Builder storagePoolType(String storagePoolType) {
            if (storagePoolType == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "storagePoolType");
            }
            this.storagePoolType = storagePoolType;
            return this;
        }
        @CustomType.Setter
        public Builder supportedDiskTypes(List<String> supportedDiskTypes) {
            if (supportedDiskTypes == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "supportedDiskTypes");
            }
            this.supportedDiskTypes = supportedDiskTypes;
            return this;
        }
        public Builder supportedDiskTypes(String... supportedDiskTypes) {
            return supportedDiskTypes(List.of(supportedDiskTypes));
        }
        @CustomType.Setter
        public Builder zone(String zone) {
            if (zone == null) {
              throw new MissingRequiredPropertyException("GetStoragePoolTypesResult", "zone");
            }
            this.zone = zone;
            return this;
        }
        public GetStoragePoolTypesResult build() {
            final var _resultValue = new GetStoragePoolTypesResult();
            _resultValue.creationTimestamp = creationTimestamp;
            _resultValue.deprecateds = deprecateds;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.kind = kind;
            _resultValue.maxPoolProvisionedCapacityGb = maxPoolProvisionedCapacityGb;
            _resultValue.maxPoolProvisionedIops = maxPoolProvisionedIops;
            _resultValue.maxPoolProvisionedThroughput = maxPoolProvisionedThroughput;
            _resultValue.minPoolProvisionedCapacityGb = minPoolProvisionedCapacityGb;
            _resultValue.minPoolProvisionedIops = minPoolProvisionedIops;
            _resultValue.minPoolProvisionedThroughput = minPoolProvisionedThroughput;
            _resultValue.name = name;
            _resultValue.project = project;
            _resultValue.selfLink = selfLink;
            _resultValue.selfLinkWithId = selfLinkWithId;
            _resultValue.storagePoolType = storagePoolType;
            _resultValue.supportedDiskTypes = supportedDiskTypes;
            _resultValue.zone = zone;
            return _resultValue;
        }
    }
}
