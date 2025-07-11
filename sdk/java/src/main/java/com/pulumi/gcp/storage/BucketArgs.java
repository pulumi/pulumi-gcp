// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.storage.inputs.BucketAutoclassArgs;
import com.pulumi.gcp.storage.inputs.BucketCorArgs;
import com.pulumi.gcp.storage.inputs.BucketCustomPlacementConfigArgs;
import com.pulumi.gcp.storage.inputs.BucketEncryptionArgs;
import com.pulumi.gcp.storage.inputs.BucketHierarchicalNamespaceArgs;
import com.pulumi.gcp.storage.inputs.BucketIpFilterArgs;
import com.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs;
import com.pulumi.gcp.storage.inputs.BucketLoggingArgs;
import com.pulumi.gcp.storage.inputs.BucketRetentionPolicyArgs;
import com.pulumi.gcp.storage.inputs.BucketSoftDeletePolicyArgs;
import com.pulumi.gcp.storage.inputs.BucketVersioningArgs;
import com.pulumi.gcp.storage.inputs.BucketWebsiteArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketArgs Empty = new BucketArgs();

    /**
     * The bucket&#39;s [Autoclass](https://cloud.google.com/storage/docs/autoclass) configuration.  Structure is documented below.
     * 
     */
    @Import(name="autoclass")
    private @Nullable Output<BucketAutoclassArgs> autoclass;

    /**
     * @return The bucket&#39;s [Autoclass](https://cloud.google.com/storage/docs/autoclass) configuration.  Structure is documented below.
     * 
     */
    public Optional<Output<BucketAutoclassArgs>> autoclass() {
        return Optional.ofNullable(this.autoclass);
    }

    /**
     * The bucket&#39;s [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    @Import(name="cors")
    private @Nullable Output<List<BucketCorArgs>> cors;

    /**
     * @return The bucket&#39;s [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    public Optional<Output<List<BucketCorArgs>>> cors() {
        return Optional.ofNullable(this.cors);
    }

    /**
     * The bucket&#39;s custom location configuration, which specifies the individual regions that comprise a dual-region bucket. If the bucket is designated a single or multi-region, the parameters are empty. Structure is documented below.
     * 
     */
    @Import(name="customPlacementConfig")
    private @Nullable Output<BucketCustomPlacementConfigArgs> customPlacementConfig;

    /**
     * @return The bucket&#39;s custom location configuration, which specifies the individual regions that comprise a dual-region bucket. If the bucket is designated a single or multi-region, the parameters are empty. Structure is documented below.
     * 
     */
    public Optional<Output<BucketCustomPlacementConfigArgs>> customPlacementConfig() {
        return Optional.ofNullable(this.customPlacementConfig);
    }

    /**
     * Whether or not to automatically apply an eventBasedHold to new objects added to the bucket.
     * 
     */
    @Import(name="defaultEventBasedHold")
    private @Nullable Output<Boolean> defaultEventBasedHold;

    /**
     * @return Whether or not to automatically apply an eventBasedHold to new objects added to the bucket.
     * 
     */
    public Optional<Output<Boolean>> defaultEventBasedHold() {
        return Optional.ofNullable(this.defaultEventBasedHold);
    }

    /**
     * Enables [object retention](https://cloud.google.com/storage/docs/object-lock) on a storage bucket.
     * 
     */
    @Import(name="enableObjectRetention")
    private @Nullable Output<Boolean> enableObjectRetention;

    /**
     * @return Enables [object retention](https://cloud.google.com/storage/docs/object-lock) on a storage bucket.
     * 
     */
    public Optional<Output<Boolean>> enableObjectRetention() {
        return Optional.ofNullable(this.enableObjectRetention);
    }

    /**
     * The bucket&#39;s encryption configuration. Structure is documented below.
     * 
     */
    @Import(name="encryption")
    private @Nullable Output<BucketEncryptionArgs> encryption;

    /**
     * @return The bucket&#39;s encryption configuration. Structure is documented below.
     * 
     */
    public Optional<Output<BucketEncryptionArgs>> encryption() {
        return Optional.ofNullable(this.encryption);
    }

    /**
     * When deleting a bucket, this
     * boolean option will delete all contained objects. If you try to delete a
     * bucket that contains objects, the provider will fail that run.
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    /**
     * @return When deleting a bucket, this
     * boolean option will delete all contained objects. If you try to delete a
     * bucket that contains objects, the provider will fail that run.
     * 
     */
    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    /**
     * The bucket&#39;s hierarchical namespace policy, which defines the bucket capability to handle folders in logical structure. Structure is documented below. To use this configuration, `uniform_bucket_level_access` must be enabled on bucket.
     * 
     */
    @Import(name="hierarchicalNamespace")
    private @Nullable Output<BucketHierarchicalNamespaceArgs> hierarchicalNamespace;

    /**
     * @return The bucket&#39;s hierarchical namespace policy, which defines the bucket capability to handle folders in logical structure. Structure is documented below. To use this configuration, `uniform_bucket_level_access` must be enabled on bucket.
     * 
     */
    public Optional<Output<BucketHierarchicalNamespaceArgs>> hierarchicalNamespace() {
        return Optional.ofNullable(this.hierarchicalNamespace);
    }

    /**
     * The bucket IP filtering configuration. Specifies the network sources that can access the bucket, as well as its underlying objects. Structure is documented below.
     * 
     */
    @Import(name="ipFilter")
    private @Nullable Output<BucketIpFilterArgs> ipFilter;

    /**
     * @return The bucket IP filtering configuration. Specifies the network sources that can access the bucket, as well as its underlying objects. Structure is documented below.
     * 
     */
    public Optional<Output<BucketIpFilterArgs>> ipFilter() {
        return Optional.ofNullable(this.ipFilter);
    }

    /**
     * A map of key/value label pairs to assign to the bucket.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return A map of key/value label pairs to assign to the bucket.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The bucket&#39;s [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    @Import(name="lifecycleRules")
    private @Nullable Output<List<BucketLifecycleRuleArgs>> lifecycleRules;

    /**
     * @return The bucket&#39;s [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    public Optional<Output<List<BucketLifecycleRuleArgs>>> lifecycleRules() {
        return Optional.ofNullable(this.lifecycleRules);
    }

    /**
     * The [GCS location](https://cloud.google.com/storage/docs/bucket-locations).
     * 
     * ***
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The [GCS location](https://cloud.google.com/storage/docs/bucket-locations).
     * 
     * ***
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The bucket&#39;s [Access &amp; Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration. Structure is documented below.
     * 
     */
    @Import(name="logging")
    private @Nullable Output<BucketLoggingArgs> logging;

    /**
     * @return The bucket&#39;s [Access &amp; Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration. Structure is documented below.
     * 
     */
    public Optional<Output<BucketLoggingArgs>> logging() {
        return Optional.ofNullable(this.logging);
    }

    /**
     * The name of the bucket.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the bucket.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Prevents public access to a bucket. Acceptable values are &#34;inherited&#34; or &#34;enforced&#34;. If &#34;inherited&#34;, the bucket uses [public access prevention](https://cloud.google.com/storage/docs/public-access-prevention) only if the bucket is subject to the public access prevention organization policy constraint. Defaults to &#34;inherited&#34;.
     * 
     */
    @Import(name="publicAccessPrevention")
    private @Nullable Output<String> publicAccessPrevention;

    /**
     * @return Prevents public access to a bucket. Acceptable values are &#34;inherited&#34; or &#34;enforced&#34;. If &#34;inherited&#34;, the bucket uses [public access prevention](https://cloud.google.com/storage/docs/public-access-prevention) only if the bucket is subject to the public access prevention organization policy constraint. Defaults to &#34;inherited&#34;.
     * 
     */
    public Optional<Output<String>> publicAccessPrevention() {
        return Optional.ofNullable(this.publicAccessPrevention);
    }

    /**
     * Enables [Requester Pays](https://cloud.google.com/storage/docs/requester-pays) on a storage bucket.
     * 
     */
    @Import(name="requesterPays")
    private @Nullable Output<Boolean> requesterPays;

    /**
     * @return Enables [Requester Pays](https://cloud.google.com/storage/docs/requester-pays) on a storage bucket.
     * 
     */
    public Optional<Output<Boolean>> requesterPays() {
        return Optional.ofNullable(this.requesterPays);
    }

    /**
     * Configuration of the bucket&#39;s data retention policy for how long objects in the bucket should be retained. Structure is documented below.
     * 
     */
    @Import(name="retentionPolicy")
    private @Nullable Output<BucketRetentionPolicyArgs> retentionPolicy;

    /**
     * @return Configuration of the bucket&#39;s data retention policy for how long objects in the bucket should be retained. Structure is documented below.
     * 
     */
    public Optional<Output<BucketRetentionPolicyArgs>> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }

    /**
     * The recovery point objective for cross-region replication of the bucket. Applicable only for dual and multi-region buckets. `&#34;DEFAULT&#34;` sets default replication. `&#34;ASYNC_TURBO&#34;` value enables turbo replication, valid for dual-region buckets only. See [Turbo Replication](https://cloud.google.com/storage/docs/managing-turbo-replication) for more information. If rpo is not specified at bucket creation, it defaults to `&#34;DEFAULT&#34;` for dual and multi-region buckets. **NOTE** If used with single-region bucket, It will throw an error.
     * 
     */
    @Import(name="rpo")
    private @Nullable Output<String> rpo;

    /**
     * @return The recovery point objective for cross-region replication of the bucket. Applicable only for dual and multi-region buckets. `&#34;DEFAULT&#34;` sets default replication. `&#34;ASYNC_TURBO&#34;` value enables turbo replication, valid for dual-region buckets only. See [Turbo Replication](https://cloud.google.com/storage/docs/managing-turbo-replication) for more information. If rpo is not specified at bucket creation, it defaults to `&#34;DEFAULT&#34;` for dual and multi-region buckets. **NOTE** If used with single-region bucket, It will throw an error.
     * 
     */
    public Optional<Output<String>> rpo() {
        return Optional.ofNullable(this.rpo);
    }

    /**
     * The bucket&#39;s soft delete policy, which defines the period of time that soft-deleted objects will be retained, and cannot
     * be permanently deleted. If it is not provided, by default Google Cloud Storage sets this to default soft delete policy
     * 
     */
    @Import(name="softDeletePolicy")
    private @Nullable Output<BucketSoftDeletePolicyArgs> softDeletePolicy;

    /**
     * @return The bucket&#39;s soft delete policy, which defines the period of time that soft-deleted objects will be retained, and cannot
     * be permanently deleted. If it is not provided, by default Google Cloud Storage sets this to default soft delete policy
     * 
     */
    public Optional<Output<BucketSoftDeletePolicyArgs>> softDeletePolicy() {
        return Optional.ofNullable(this.softDeletePolicy);
    }

    /**
     * The [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of the new bucket. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`.
     * 
     */
    @Import(name="storageClass")
    private @Nullable Output<String> storageClass;

    /**
     * @return The [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of the new bucket. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`.
     * 
     */
    public Optional<Output<String>> storageClass() {
        return Optional.ofNullable(this.storageClass);
    }

    /**
     * Enables [Uniform bucket-level access](https://cloud.google.com/storage/docs/uniform-bucket-level-access) access to a bucket.
     * 
     */
    @Import(name="uniformBucketLevelAccess")
    private @Nullable Output<Boolean> uniformBucketLevelAccess;

    /**
     * @return Enables [Uniform bucket-level access](https://cloud.google.com/storage/docs/uniform-bucket-level-access) access to a bucket.
     * 
     */
    public Optional<Output<Boolean>> uniformBucketLevelAccess() {
        return Optional.ofNullable(this.uniformBucketLevelAccess);
    }

    /**
     * The bucket&#39;s [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.  Structure is documented below.
     * 
     */
    @Import(name="versioning")
    private @Nullable Output<BucketVersioningArgs> versioning;

    /**
     * @return The bucket&#39;s [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.  Structure is documented below.
     * 
     */
    public Optional<Output<BucketVersioningArgs>> versioning() {
        return Optional.ofNullable(this.versioning);
    }

    /**
     * Configuration if the bucket acts as a website. Structure is documented below.
     * 
     */
    @Import(name="website")
    private @Nullable Output<BucketWebsiteArgs> website;

    /**
     * @return Configuration if the bucket acts as a website. Structure is documented below.
     * 
     */
    public Optional<Output<BucketWebsiteArgs>> website() {
        return Optional.ofNullable(this.website);
    }

    private BucketArgs() {}

    private BucketArgs(BucketArgs $) {
        this.autoclass = $.autoclass;
        this.cors = $.cors;
        this.customPlacementConfig = $.customPlacementConfig;
        this.defaultEventBasedHold = $.defaultEventBasedHold;
        this.enableObjectRetention = $.enableObjectRetention;
        this.encryption = $.encryption;
        this.forceDestroy = $.forceDestroy;
        this.hierarchicalNamespace = $.hierarchicalNamespace;
        this.ipFilter = $.ipFilter;
        this.labels = $.labels;
        this.lifecycleRules = $.lifecycleRules;
        this.location = $.location;
        this.logging = $.logging;
        this.name = $.name;
        this.project = $.project;
        this.publicAccessPrevention = $.publicAccessPrevention;
        this.requesterPays = $.requesterPays;
        this.retentionPolicy = $.retentionPolicy;
        this.rpo = $.rpo;
        this.softDeletePolicy = $.softDeletePolicy;
        this.storageClass = $.storageClass;
        this.uniformBucketLevelAccess = $.uniformBucketLevelAccess;
        this.versioning = $.versioning;
        this.website = $.website;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketArgs $;

        public Builder() {
            $ = new BucketArgs();
        }

        public Builder(BucketArgs defaults) {
            $ = new BucketArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoclass The bucket&#39;s [Autoclass](https://cloud.google.com/storage/docs/autoclass) configuration.  Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder autoclass(@Nullable Output<BucketAutoclassArgs> autoclass) {
            $.autoclass = autoclass;
            return this;
        }

        /**
         * @param autoclass The bucket&#39;s [Autoclass](https://cloud.google.com/storage/docs/autoclass) configuration.  Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder autoclass(BucketAutoclassArgs autoclass) {
            return autoclass(Output.of(autoclass));
        }

        /**
         * @param cors The bucket&#39;s [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cors(@Nullable Output<List<BucketCorArgs>> cors) {
            $.cors = cors;
            return this;
        }

        /**
         * @param cors The bucket&#39;s [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cors(List<BucketCorArgs> cors) {
            return cors(Output.of(cors));
        }

        /**
         * @param cors The bucket&#39;s [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cors(BucketCorArgs... cors) {
            return cors(List.of(cors));
        }

        /**
         * @param customPlacementConfig The bucket&#39;s custom location configuration, which specifies the individual regions that comprise a dual-region bucket. If the bucket is designated a single or multi-region, the parameters are empty. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder customPlacementConfig(@Nullable Output<BucketCustomPlacementConfigArgs> customPlacementConfig) {
            $.customPlacementConfig = customPlacementConfig;
            return this;
        }

        /**
         * @param customPlacementConfig The bucket&#39;s custom location configuration, which specifies the individual regions that comprise a dual-region bucket. If the bucket is designated a single or multi-region, the parameters are empty. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder customPlacementConfig(BucketCustomPlacementConfigArgs customPlacementConfig) {
            return customPlacementConfig(Output.of(customPlacementConfig));
        }

        /**
         * @param defaultEventBasedHold Whether or not to automatically apply an eventBasedHold to new objects added to the bucket.
         * 
         * @return builder
         * 
         */
        public Builder defaultEventBasedHold(@Nullable Output<Boolean> defaultEventBasedHold) {
            $.defaultEventBasedHold = defaultEventBasedHold;
            return this;
        }

        /**
         * @param defaultEventBasedHold Whether or not to automatically apply an eventBasedHold to new objects added to the bucket.
         * 
         * @return builder
         * 
         */
        public Builder defaultEventBasedHold(Boolean defaultEventBasedHold) {
            return defaultEventBasedHold(Output.of(defaultEventBasedHold));
        }

        /**
         * @param enableObjectRetention Enables [object retention](https://cloud.google.com/storage/docs/object-lock) on a storage bucket.
         * 
         * @return builder
         * 
         */
        public Builder enableObjectRetention(@Nullable Output<Boolean> enableObjectRetention) {
            $.enableObjectRetention = enableObjectRetention;
            return this;
        }

        /**
         * @param enableObjectRetention Enables [object retention](https://cloud.google.com/storage/docs/object-lock) on a storage bucket.
         * 
         * @return builder
         * 
         */
        public Builder enableObjectRetention(Boolean enableObjectRetention) {
            return enableObjectRetention(Output.of(enableObjectRetention));
        }

        /**
         * @param encryption The bucket&#39;s encryption configuration. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryption(@Nullable Output<BucketEncryptionArgs> encryption) {
            $.encryption = encryption;
            return this;
        }

        /**
         * @param encryption The bucket&#39;s encryption configuration. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryption(BucketEncryptionArgs encryption) {
            return encryption(Output.of(encryption));
        }

        /**
         * @param forceDestroy When deleting a bucket, this
         * boolean option will delete all contained objects. If you try to delete a
         * bucket that contains objects, the provider will fail that run.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * @param forceDestroy When deleting a bucket, this
         * boolean option will delete all contained objects. If you try to delete a
         * bucket that contains objects, the provider will fail that run.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        /**
         * @param hierarchicalNamespace The bucket&#39;s hierarchical namespace policy, which defines the bucket capability to handle folders in logical structure. Structure is documented below. To use this configuration, `uniform_bucket_level_access` must be enabled on bucket.
         * 
         * @return builder
         * 
         */
        public Builder hierarchicalNamespace(@Nullable Output<BucketHierarchicalNamespaceArgs> hierarchicalNamespace) {
            $.hierarchicalNamespace = hierarchicalNamespace;
            return this;
        }

        /**
         * @param hierarchicalNamespace The bucket&#39;s hierarchical namespace policy, which defines the bucket capability to handle folders in logical structure. Structure is documented below. To use this configuration, `uniform_bucket_level_access` must be enabled on bucket.
         * 
         * @return builder
         * 
         */
        public Builder hierarchicalNamespace(BucketHierarchicalNamespaceArgs hierarchicalNamespace) {
            return hierarchicalNamespace(Output.of(hierarchicalNamespace));
        }

        /**
         * @param ipFilter The bucket IP filtering configuration. Specifies the network sources that can access the bucket, as well as its underlying objects. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ipFilter(@Nullable Output<BucketIpFilterArgs> ipFilter) {
            $.ipFilter = ipFilter;
            return this;
        }

        /**
         * @param ipFilter The bucket IP filtering configuration. Specifies the network sources that can access the bucket, as well as its underlying objects. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ipFilter(BucketIpFilterArgs ipFilter) {
            return ipFilter(Output.of(ipFilter));
        }

        /**
         * @param labels A map of key/value label pairs to assign to the bucket.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels A map of key/value label pairs to assign to the bucket.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param lifecycleRules The bucket&#39;s [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleRules(@Nullable Output<List<BucketLifecycleRuleArgs>> lifecycleRules) {
            $.lifecycleRules = lifecycleRules;
            return this;
        }

        /**
         * @param lifecycleRules The bucket&#39;s [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleRules(List<BucketLifecycleRuleArgs> lifecycleRules) {
            return lifecycleRules(Output.of(lifecycleRules));
        }

        /**
         * @param lifecycleRules The bucket&#39;s [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleRules(BucketLifecycleRuleArgs... lifecycleRules) {
            return lifecycleRules(List.of(lifecycleRules));
        }

        /**
         * @param location The [GCS location](https://cloud.google.com/storage/docs/bucket-locations).
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The [GCS location](https://cloud.google.com/storage/docs/bucket-locations).
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param logging The bucket&#39;s [Access &amp; Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder logging(@Nullable Output<BucketLoggingArgs> logging) {
            $.logging = logging;
            return this;
        }

        /**
         * @param logging The bucket&#39;s [Access &amp; Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder logging(BucketLoggingArgs logging) {
            return logging(Output.of(logging));
        }

        /**
         * @param name The name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param publicAccessPrevention Prevents public access to a bucket. Acceptable values are &#34;inherited&#34; or &#34;enforced&#34;. If &#34;inherited&#34;, the bucket uses [public access prevention](https://cloud.google.com/storage/docs/public-access-prevention) only if the bucket is subject to the public access prevention organization policy constraint. Defaults to &#34;inherited&#34;.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessPrevention(@Nullable Output<String> publicAccessPrevention) {
            $.publicAccessPrevention = publicAccessPrevention;
            return this;
        }

        /**
         * @param publicAccessPrevention Prevents public access to a bucket. Acceptable values are &#34;inherited&#34; or &#34;enforced&#34;. If &#34;inherited&#34;, the bucket uses [public access prevention](https://cloud.google.com/storage/docs/public-access-prevention) only if the bucket is subject to the public access prevention organization policy constraint. Defaults to &#34;inherited&#34;.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessPrevention(String publicAccessPrevention) {
            return publicAccessPrevention(Output.of(publicAccessPrevention));
        }

        /**
         * @param requesterPays Enables [Requester Pays](https://cloud.google.com/storage/docs/requester-pays) on a storage bucket.
         * 
         * @return builder
         * 
         */
        public Builder requesterPays(@Nullable Output<Boolean> requesterPays) {
            $.requesterPays = requesterPays;
            return this;
        }

        /**
         * @param requesterPays Enables [Requester Pays](https://cloud.google.com/storage/docs/requester-pays) on a storage bucket.
         * 
         * @return builder
         * 
         */
        public Builder requesterPays(Boolean requesterPays) {
            return requesterPays(Output.of(requesterPays));
        }

        /**
         * @param retentionPolicy Configuration of the bucket&#39;s data retention policy for how long objects in the bucket should be retained. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(@Nullable Output<BucketRetentionPolicyArgs> retentionPolicy) {
            $.retentionPolicy = retentionPolicy;
            return this;
        }

        /**
         * @param retentionPolicy Configuration of the bucket&#39;s data retention policy for how long objects in the bucket should be retained. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(BucketRetentionPolicyArgs retentionPolicy) {
            return retentionPolicy(Output.of(retentionPolicy));
        }

        /**
         * @param rpo The recovery point objective for cross-region replication of the bucket. Applicable only for dual and multi-region buckets. `&#34;DEFAULT&#34;` sets default replication. `&#34;ASYNC_TURBO&#34;` value enables turbo replication, valid for dual-region buckets only. See [Turbo Replication](https://cloud.google.com/storage/docs/managing-turbo-replication) for more information. If rpo is not specified at bucket creation, it defaults to `&#34;DEFAULT&#34;` for dual and multi-region buckets. **NOTE** If used with single-region bucket, It will throw an error.
         * 
         * @return builder
         * 
         */
        public Builder rpo(@Nullable Output<String> rpo) {
            $.rpo = rpo;
            return this;
        }

        /**
         * @param rpo The recovery point objective for cross-region replication of the bucket. Applicable only for dual and multi-region buckets. `&#34;DEFAULT&#34;` sets default replication. `&#34;ASYNC_TURBO&#34;` value enables turbo replication, valid for dual-region buckets only. See [Turbo Replication](https://cloud.google.com/storage/docs/managing-turbo-replication) for more information. If rpo is not specified at bucket creation, it defaults to `&#34;DEFAULT&#34;` for dual and multi-region buckets. **NOTE** If used with single-region bucket, It will throw an error.
         * 
         * @return builder
         * 
         */
        public Builder rpo(String rpo) {
            return rpo(Output.of(rpo));
        }

        /**
         * @param softDeletePolicy The bucket&#39;s soft delete policy, which defines the period of time that soft-deleted objects will be retained, and cannot
         * be permanently deleted. If it is not provided, by default Google Cloud Storage sets this to default soft delete policy
         * 
         * @return builder
         * 
         */
        public Builder softDeletePolicy(@Nullable Output<BucketSoftDeletePolicyArgs> softDeletePolicy) {
            $.softDeletePolicy = softDeletePolicy;
            return this;
        }

        /**
         * @param softDeletePolicy The bucket&#39;s soft delete policy, which defines the period of time that soft-deleted objects will be retained, and cannot
         * be permanently deleted. If it is not provided, by default Google Cloud Storage sets this to default soft delete policy
         * 
         * @return builder
         * 
         */
        public Builder softDeletePolicy(BucketSoftDeletePolicyArgs softDeletePolicy) {
            return softDeletePolicy(Output.of(softDeletePolicy));
        }

        /**
         * @param storageClass The [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of the new bucket. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`.
         * 
         * @return builder
         * 
         */
        public Builder storageClass(@Nullable Output<String> storageClass) {
            $.storageClass = storageClass;
            return this;
        }

        /**
         * @param storageClass The [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of the new bucket. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`.
         * 
         * @return builder
         * 
         */
        public Builder storageClass(String storageClass) {
            return storageClass(Output.of(storageClass));
        }

        /**
         * @param uniformBucketLevelAccess Enables [Uniform bucket-level access](https://cloud.google.com/storage/docs/uniform-bucket-level-access) access to a bucket.
         * 
         * @return builder
         * 
         */
        public Builder uniformBucketLevelAccess(@Nullable Output<Boolean> uniformBucketLevelAccess) {
            $.uniformBucketLevelAccess = uniformBucketLevelAccess;
            return this;
        }

        /**
         * @param uniformBucketLevelAccess Enables [Uniform bucket-level access](https://cloud.google.com/storage/docs/uniform-bucket-level-access) access to a bucket.
         * 
         * @return builder
         * 
         */
        public Builder uniformBucketLevelAccess(Boolean uniformBucketLevelAccess) {
            return uniformBucketLevelAccess(Output.of(uniformBucketLevelAccess));
        }

        /**
         * @param versioning The bucket&#39;s [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.  Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder versioning(@Nullable Output<BucketVersioningArgs> versioning) {
            $.versioning = versioning;
            return this;
        }

        /**
         * @param versioning The bucket&#39;s [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.  Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder versioning(BucketVersioningArgs versioning) {
            return versioning(Output.of(versioning));
        }

        /**
         * @param website Configuration if the bucket acts as a website. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder website(@Nullable Output<BucketWebsiteArgs> website) {
            $.website = website;
            return this;
        }

        /**
         * @param website Configuration if the bucket acts as a website. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder website(BucketWebsiteArgs website) {
            return website(Output.of(website));
        }

        public BucketArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("BucketArgs", "location");
            }
            return $;
        }
    }

}
