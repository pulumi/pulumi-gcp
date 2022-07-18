// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.storage.outputs.GetBucketCor;
import com.pulumi.gcp.storage.outputs.GetBucketEncryption;
import com.pulumi.gcp.storage.outputs.GetBucketLifecycleRule;
import com.pulumi.gcp.storage.outputs.GetBucketLogging;
import com.pulumi.gcp.storage.outputs.GetBucketRetentionPolicy;
import com.pulumi.gcp.storage.outputs.GetBucketVersioning;
import com.pulumi.gcp.storage.outputs.GetBucketWebsite;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetBucketResult {
    private final List<GetBucketCor> cors;
    private final Boolean defaultEventBasedHold;
    private final List<GetBucketEncryption> encryptions;
    private final Boolean forceDestroy;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final Map<String,String> labels;
    private final List<GetBucketLifecycleRule> lifecycleRules;
    private final String location;
    private final List<GetBucketLogging> loggings;
    private final String name;
    private final String project;
    private final String publicAccessPrevention;
    private final Boolean requesterPays;
    private final List<GetBucketRetentionPolicy> retentionPolicies;
    private final String selfLink;
    private final String storageClass;
    private final Boolean uniformBucketLevelAccess;
    private final String url;
    private final List<GetBucketVersioning> versionings;
    private final List<GetBucketWebsite> websites;

    @CustomType.Constructor
    private GetBucketResult(
        @CustomType.Parameter("cors") List<GetBucketCor> cors,
        @CustomType.Parameter("defaultEventBasedHold") Boolean defaultEventBasedHold,
        @CustomType.Parameter("encryptions") List<GetBucketEncryption> encryptions,
        @CustomType.Parameter("forceDestroy") Boolean forceDestroy,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("lifecycleRules") List<GetBucketLifecycleRule> lifecycleRules,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("loggings") List<GetBucketLogging> loggings,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("publicAccessPrevention") String publicAccessPrevention,
        @CustomType.Parameter("requesterPays") Boolean requesterPays,
        @CustomType.Parameter("retentionPolicies") List<GetBucketRetentionPolicy> retentionPolicies,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("storageClass") String storageClass,
        @CustomType.Parameter("uniformBucketLevelAccess") Boolean uniformBucketLevelAccess,
        @CustomType.Parameter("url") String url,
        @CustomType.Parameter("versionings") List<GetBucketVersioning> versionings,
        @CustomType.Parameter("websites") List<GetBucketWebsite> websites) {
        this.cors = cors;
        this.defaultEventBasedHold = defaultEventBasedHold;
        this.encryptions = encryptions;
        this.forceDestroy = forceDestroy;
        this.id = id;
        this.labels = labels;
        this.lifecycleRules = lifecycleRules;
        this.location = location;
        this.loggings = loggings;
        this.name = name;
        this.project = project;
        this.publicAccessPrevention = publicAccessPrevention;
        this.requesterPays = requesterPays;
        this.retentionPolicies = retentionPolicies;
        this.selfLink = selfLink;
        this.storageClass = storageClass;
        this.uniformBucketLevelAccess = uniformBucketLevelAccess;
        this.url = url;
        this.versionings = versionings;
        this.websites = websites;
    }

    public List<GetBucketCor> cors() {
        return this.cors;
    }
    public Boolean defaultEventBasedHold() {
        return this.defaultEventBasedHold;
    }
    public List<GetBucketEncryption> encryptions() {
        return this.encryptions;
    }
    public Boolean forceDestroy() {
        return this.forceDestroy;
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
    public List<GetBucketLifecycleRule> lifecycleRules() {
        return this.lifecycleRules;
    }
    public String location() {
        return this.location;
    }
    public List<GetBucketLogging> loggings() {
        return this.loggings;
    }
    public String name() {
        return this.name;
    }
    public String project() {
        return this.project;
    }
    public String publicAccessPrevention() {
        return this.publicAccessPrevention;
    }
    public Boolean requesterPays() {
        return this.requesterPays;
    }
    public List<GetBucketRetentionPolicy> retentionPolicies() {
        return this.retentionPolicies;
    }
    public String selfLink() {
        return this.selfLink;
    }
    public String storageClass() {
        return this.storageClass;
    }
    public Boolean uniformBucketLevelAccess() {
        return this.uniformBucketLevelAccess;
    }
    public String url() {
        return this.url;
    }
    public List<GetBucketVersioning> versionings() {
        return this.versionings;
    }
    public List<GetBucketWebsite> websites() {
        return this.websites;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetBucketCor> cors;
        private Boolean defaultEventBasedHold;
        private List<GetBucketEncryption> encryptions;
        private Boolean forceDestroy;
        private String id;
        private Map<String,String> labels;
        private List<GetBucketLifecycleRule> lifecycleRules;
        private String location;
        private List<GetBucketLogging> loggings;
        private String name;
        private String project;
        private String publicAccessPrevention;
        private Boolean requesterPays;
        private List<GetBucketRetentionPolicy> retentionPolicies;
        private String selfLink;
        private String storageClass;
        private Boolean uniformBucketLevelAccess;
        private String url;
        private List<GetBucketVersioning> versionings;
        private List<GetBucketWebsite> websites;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cors = defaults.cors;
    	      this.defaultEventBasedHold = defaults.defaultEventBasedHold;
    	      this.encryptions = defaults.encryptions;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.lifecycleRules = defaults.lifecycleRules;
    	      this.location = defaults.location;
    	      this.loggings = defaults.loggings;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.publicAccessPrevention = defaults.publicAccessPrevention;
    	      this.requesterPays = defaults.requesterPays;
    	      this.retentionPolicies = defaults.retentionPolicies;
    	      this.selfLink = defaults.selfLink;
    	      this.storageClass = defaults.storageClass;
    	      this.uniformBucketLevelAccess = defaults.uniformBucketLevelAccess;
    	      this.url = defaults.url;
    	      this.versionings = defaults.versionings;
    	      this.websites = defaults.websites;
        }

        public Builder cors(List<GetBucketCor> cors) {
            this.cors = Objects.requireNonNull(cors);
            return this;
        }
        public Builder cors(GetBucketCor... cors) {
            return cors(List.of(cors));
        }
        public Builder defaultEventBasedHold(Boolean defaultEventBasedHold) {
            this.defaultEventBasedHold = Objects.requireNonNull(defaultEventBasedHold);
            return this;
        }
        public Builder encryptions(List<GetBucketEncryption> encryptions) {
            this.encryptions = Objects.requireNonNull(encryptions);
            return this;
        }
        public Builder encryptions(GetBucketEncryption... encryptions) {
            return encryptions(List.of(encryptions));
        }
        public Builder forceDestroy(Boolean forceDestroy) {
            this.forceDestroy = Objects.requireNonNull(forceDestroy);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder lifecycleRules(List<GetBucketLifecycleRule> lifecycleRules) {
            this.lifecycleRules = Objects.requireNonNull(lifecycleRules);
            return this;
        }
        public Builder lifecycleRules(GetBucketLifecycleRule... lifecycleRules) {
            return lifecycleRules(List.of(lifecycleRules));
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder loggings(List<GetBucketLogging> loggings) {
            this.loggings = Objects.requireNonNull(loggings);
            return this;
        }
        public Builder loggings(GetBucketLogging... loggings) {
            return loggings(List.of(loggings));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder publicAccessPrevention(String publicAccessPrevention) {
            this.publicAccessPrevention = Objects.requireNonNull(publicAccessPrevention);
            return this;
        }
        public Builder requesterPays(Boolean requesterPays) {
            this.requesterPays = Objects.requireNonNull(requesterPays);
            return this;
        }
        public Builder retentionPolicies(List<GetBucketRetentionPolicy> retentionPolicies) {
            this.retentionPolicies = Objects.requireNonNull(retentionPolicies);
            return this;
        }
        public Builder retentionPolicies(GetBucketRetentionPolicy... retentionPolicies) {
            return retentionPolicies(List.of(retentionPolicies));
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder storageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }
        public Builder uniformBucketLevelAccess(Boolean uniformBucketLevelAccess) {
            this.uniformBucketLevelAccess = Objects.requireNonNull(uniformBucketLevelAccess);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder versionings(List<GetBucketVersioning> versionings) {
            this.versionings = Objects.requireNonNull(versionings);
            return this;
        }
        public Builder versionings(GetBucketVersioning... versionings) {
            return versionings(List.of(versionings));
        }
        public Builder websites(List<GetBucketWebsite> websites) {
            this.websites = Objects.requireNonNull(websites);
            return this;
        }
        public Builder websites(GetBucketWebsite... websites) {
            return websites(List.of(websites));
        }        public GetBucketResult build() {
            return new GetBucketResult(cors, defaultEventBasedHold, encryptions, forceDestroy, id, labels, lifecycleRules, location, loggings, name, project, publicAccessPrevention, requesterPays, retentionPolicies, selfLink, storageClass, uniformBucketLevelAccess, url, versionings, websites);
        }
    }
}