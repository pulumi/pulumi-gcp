// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.bigquery.outputs.GetDatasetAccess;
import com.pulumi.gcp.bigquery.outputs.GetDatasetDefaultEncryptionConfiguration;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDatasetResult {
    private List<GetDatasetAccess> accesses;
    private Integer creationTime;
    private String datasetId;
    private String defaultCollation;
    private List<GetDatasetDefaultEncryptionConfiguration> defaultEncryptionConfigurations;
    private Integer defaultPartitionExpirationMs;
    private Integer defaultTableExpirationMs;
    private Boolean deleteContentsOnDestroy;
    private String description;
    private Map<String,String> effectiveLabels;
    private String etag;
    private String friendlyName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Boolean isCaseInsensitive;
    private Map<String,String> labels;
    private Integer lastModifiedTime;
    private String location;
    private String maxTimeTravelHours;
    private @Nullable String project;
    private Map<String,String> pulumiLabels;
    private String selfLink;
    private String storageBillingModel;

    private GetDatasetResult() {}
    public List<GetDatasetAccess> accesses() {
        return this.accesses;
    }
    public Integer creationTime() {
        return this.creationTime;
    }
    public String datasetId() {
        return this.datasetId;
    }
    public String defaultCollation() {
        return this.defaultCollation;
    }
    public List<GetDatasetDefaultEncryptionConfiguration> defaultEncryptionConfigurations() {
        return this.defaultEncryptionConfigurations;
    }
    public Integer defaultPartitionExpirationMs() {
        return this.defaultPartitionExpirationMs;
    }
    public Integer defaultTableExpirationMs() {
        return this.defaultTableExpirationMs;
    }
    public Boolean deleteContentsOnDestroy() {
        return this.deleteContentsOnDestroy;
    }
    public String description() {
        return this.description;
    }
    public Map<String,String> effectiveLabels() {
        return this.effectiveLabels;
    }
    public String etag() {
        return this.etag;
    }
    public String friendlyName() {
        return this.friendlyName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Boolean isCaseInsensitive() {
        return this.isCaseInsensitive;
    }
    public Map<String,String> labels() {
        return this.labels;
    }
    public Integer lastModifiedTime() {
        return this.lastModifiedTime;
    }
    public String location() {
        return this.location;
    }
    public String maxTimeTravelHours() {
        return this.maxTimeTravelHours;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public Map<String,String> pulumiLabels() {
        return this.pulumiLabels;
    }
    public String selfLink() {
        return this.selfLink;
    }
    public String storageBillingModel() {
        return this.storageBillingModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDatasetAccess> accesses;
        private Integer creationTime;
        private String datasetId;
        private String defaultCollation;
        private List<GetDatasetDefaultEncryptionConfiguration> defaultEncryptionConfigurations;
        private Integer defaultPartitionExpirationMs;
        private Integer defaultTableExpirationMs;
        private Boolean deleteContentsOnDestroy;
        private String description;
        private Map<String,String> effectiveLabels;
        private String etag;
        private String friendlyName;
        private String id;
        private Boolean isCaseInsensitive;
        private Map<String,String> labels;
        private Integer lastModifiedTime;
        private String location;
        private String maxTimeTravelHours;
        private @Nullable String project;
        private Map<String,String> pulumiLabels;
        private String selfLink;
        private String storageBillingModel;
        public Builder() {}
        public Builder(GetDatasetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accesses = defaults.accesses;
    	      this.creationTime = defaults.creationTime;
    	      this.datasetId = defaults.datasetId;
    	      this.defaultCollation = defaults.defaultCollation;
    	      this.defaultEncryptionConfigurations = defaults.defaultEncryptionConfigurations;
    	      this.defaultPartitionExpirationMs = defaults.defaultPartitionExpirationMs;
    	      this.defaultTableExpirationMs = defaults.defaultTableExpirationMs;
    	      this.deleteContentsOnDestroy = defaults.deleteContentsOnDestroy;
    	      this.description = defaults.description;
    	      this.effectiveLabels = defaults.effectiveLabels;
    	      this.etag = defaults.etag;
    	      this.friendlyName = defaults.friendlyName;
    	      this.id = defaults.id;
    	      this.isCaseInsensitive = defaults.isCaseInsensitive;
    	      this.labels = defaults.labels;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.maxTimeTravelHours = defaults.maxTimeTravelHours;
    	      this.project = defaults.project;
    	      this.pulumiLabels = defaults.pulumiLabels;
    	      this.selfLink = defaults.selfLink;
    	      this.storageBillingModel = defaults.storageBillingModel;
        }

        @CustomType.Setter
        public Builder accesses(List<GetDatasetAccess> accesses) {
            this.accesses = Objects.requireNonNull(accesses);
            return this;
        }
        public Builder accesses(GetDatasetAccess... accesses) {
            return accesses(List.of(accesses));
        }
        @CustomType.Setter
        public Builder creationTime(Integer creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        @CustomType.Setter
        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        @CustomType.Setter
        public Builder defaultCollation(String defaultCollation) {
            this.defaultCollation = Objects.requireNonNull(defaultCollation);
            return this;
        }
        @CustomType.Setter
        public Builder defaultEncryptionConfigurations(List<GetDatasetDefaultEncryptionConfiguration> defaultEncryptionConfigurations) {
            this.defaultEncryptionConfigurations = Objects.requireNonNull(defaultEncryptionConfigurations);
            return this;
        }
        public Builder defaultEncryptionConfigurations(GetDatasetDefaultEncryptionConfiguration... defaultEncryptionConfigurations) {
            return defaultEncryptionConfigurations(List.of(defaultEncryptionConfigurations));
        }
        @CustomType.Setter
        public Builder defaultPartitionExpirationMs(Integer defaultPartitionExpirationMs) {
            this.defaultPartitionExpirationMs = Objects.requireNonNull(defaultPartitionExpirationMs);
            return this;
        }
        @CustomType.Setter
        public Builder defaultTableExpirationMs(Integer defaultTableExpirationMs) {
            this.defaultTableExpirationMs = Objects.requireNonNull(defaultTableExpirationMs);
            return this;
        }
        @CustomType.Setter
        public Builder deleteContentsOnDestroy(Boolean deleteContentsOnDestroy) {
            this.deleteContentsOnDestroy = Objects.requireNonNull(deleteContentsOnDestroy);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            this.effectiveLabels = Objects.requireNonNull(effectiveLabels);
            return this;
        }
        @CustomType.Setter
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        @CustomType.Setter
        public Builder friendlyName(String friendlyName) {
            this.friendlyName = Objects.requireNonNull(friendlyName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder isCaseInsensitive(Boolean isCaseInsensitive) {
            this.isCaseInsensitive = Objects.requireNonNull(isCaseInsensitive);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder lastModifiedTime(Integer lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder maxTimeTravelHours(String maxTimeTravelHours) {
            this.maxTimeTravelHours = Objects.requireNonNull(maxTimeTravelHours);
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            this.pulumiLabels = Objects.requireNonNull(pulumiLabels);
            return this;
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        @CustomType.Setter
        public Builder storageBillingModel(String storageBillingModel) {
            this.storageBillingModel = Objects.requireNonNull(storageBillingModel);
            return this;
        }
        public GetDatasetResult build() {
            final var o = new GetDatasetResult();
            o.accesses = accesses;
            o.creationTime = creationTime;
            o.datasetId = datasetId;
            o.defaultCollation = defaultCollation;
            o.defaultEncryptionConfigurations = defaultEncryptionConfigurations;
            o.defaultPartitionExpirationMs = defaultPartitionExpirationMs;
            o.defaultTableExpirationMs = defaultTableExpirationMs;
            o.deleteContentsOnDestroy = deleteContentsOnDestroy;
            o.description = description;
            o.effectiveLabels = effectiveLabels;
            o.etag = etag;
            o.friendlyName = friendlyName;
            o.id = id;
            o.isCaseInsensitive = isCaseInsensitive;
            o.labels = labels;
            o.lastModifiedTime = lastModifiedTime;
            o.location = location;
            o.maxTimeTravelHours = maxTimeTravelHours;
            o.project = project;
            o.pulumiLabels = pulumiLabels;
            o.selfLink = selfLink;
            o.storageBillingModel = storageBillingModel;
            return o;
        }
    }
}