// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.storage.BucketArgs;
import com.pulumi.gcp.storage.inputs.BucketState;
import com.pulumi.gcp.storage.outputs.BucketAutoclass;
import com.pulumi.gcp.storage.outputs.BucketCor;
import com.pulumi.gcp.storage.outputs.BucketCustomPlacementConfig;
import com.pulumi.gcp.storage.outputs.BucketEncryption;
import com.pulumi.gcp.storage.outputs.BucketHierarchicalNamespace;
import com.pulumi.gcp.storage.outputs.BucketIpFilter;
import com.pulumi.gcp.storage.outputs.BucketLifecycleRule;
import com.pulumi.gcp.storage.outputs.BucketLogging;
import com.pulumi.gcp.storage.outputs.BucketRetentionPolicy;
import com.pulumi.gcp.storage.outputs.BucketSoftDeletePolicy;
import com.pulumi.gcp.storage.outputs.BucketVersioning;
import com.pulumi.gcp.storage.outputs.BucketWebsite;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a new bucket in Google cloud storage service (GCS).
 * Once a bucket has been created, its location can&#39;t be changed.
 * 
 * For more information see
 * [the official documentation](https://cloud.google.com/storage/docs/overview)
 * and
 * [API](https://cloud.google.com/storage/docs/json_api/v1/buckets).
 * 
 * **Note**: If the project id is not set on the resource or in the provider block it will be dynamically
 * determined which will require enabling the compute api.
 * 
 * ## Example Usage
 * 
 * ### Creating A Private Bucket In Standard Storage, In The EU Region. Bucket Configured As Static Website And CORS Configurations
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.storage.Bucket;
 * import com.pulumi.gcp.storage.BucketArgs;
 * import com.pulumi.gcp.storage.inputs.BucketWebsiteArgs;
 * import com.pulumi.gcp.storage.inputs.BucketCorArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var static_site = new Bucket("static-site", BucketArgs.builder()
 *             .name("image-store.com")
 *             .location("EU")
 *             .forceDestroy(true)
 *             .uniformBucketLevelAccess(true)
 *             .website(BucketWebsiteArgs.builder()
 *                 .mainPageSuffix("index.html")
 *                 .notFoundPage("404.html")
 *                 .build())
 *             .cors(BucketCorArgs.builder()
 *                 .origins("http://image-store.com")
 *                 .methods(                
 *                     "GET",
 *                     "HEAD",
 *                     "PUT",
 *                     "POST",
 *                     "DELETE")
 *                 .responseHeaders("*")
 *                 .maxAgeSeconds(3600)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Life Cycle Settings For Storage Bucket Objects
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.storage.Bucket;
 * import com.pulumi.gcp.storage.BucketArgs;
 * import com.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs;
 * import com.pulumi.gcp.storage.inputs.BucketLifecycleRuleConditionArgs;
 * import com.pulumi.gcp.storage.inputs.BucketLifecycleRuleActionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var auto_expire = new Bucket("auto-expire", BucketArgs.builder()
 *             .name("auto-expiring-bucket")
 *             .location("US")
 *             .forceDestroy(true)
 *             .lifecycleRules(            
 *                 BucketLifecycleRuleArgs.builder()
 *                     .condition(BucketLifecycleRuleConditionArgs.builder()
 *                         .age(3)
 *                         .build())
 *                     .action(BucketLifecycleRuleActionArgs.builder()
 *                         .type("Delete")
 *                         .build())
 *                     .build(),
 *                 BucketLifecycleRuleArgs.builder()
 *                     .condition(BucketLifecycleRuleConditionArgs.builder()
 *                         .age(1)
 *                         .build())
 *                     .action(BucketLifecycleRuleActionArgs.builder()
 *                         .type("AbortIncompleteMultipartUpload")
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Life Cycle Settings For Storage Bucket Objects With `Send_age_if_zero` Disabled
 * When creating a life cycle condition that does not also include an `age` field, a default `age` of 0 will be set. Set the `send_age_if_zero` flag to `false` to prevent this and avoid any potentially unintended interactions.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.storage.Bucket;
 * import com.pulumi.gcp.storage.BucketArgs;
 * import com.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs;
 * import com.pulumi.gcp.storage.inputs.BucketLifecycleRuleActionArgs;
 * import com.pulumi.gcp.storage.inputs.BucketLifecycleRuleConditionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var no_age_enabled = new Bucket("no-age-enabled", BucketArgs.builder()
 *             .name("no-age-enabled-bucket")
 *             .location("US")
 *             .forceDestroy(true)
 *             .lifecycleRules(BucketLifecycleRuleArgs.builder()
 *                 .action(BucketLifecycleRuleActionArgs.builder()
 *                     .type("Delete")
 *                     .build())
 *                 .condition(BucketLifecycleRuleConditionArgs.builder()
 *                     .daysSinceNoncurrentTime(3)
 *                     .sendAgeIfZero(false)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Enabling Public Access Prevention
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.storage.Bucket;
 * import com.pulumi.gcp.storage.BucketArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var no_public_access = new Bucket("no-public-access", BucketArgs.builder()
 *             .name("no-public-access-bucket")
 *             .location("US")
 *             .forceDestroy(true)
 *             .publicAccessPrevention("enforced")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Enabling Hierarchical Namespace
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.storage.Bucket;
 * import com.pulumi.gcp.storage.BucketArgs;
 * import com.pulumi.gcp.storage.inputs.BucketHierarchicalNamespaceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var hns_enabled = new Bucket("hns-enabled", BucketArgs.builder()
 *             .name("hns-enabled-bucket")
 *             .location("US")
 *             .forceDestroy(true)
 *             .hierarchicalNamespace(BucketHierarchicalNamespaceArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Storage buckets can be imported using the `name` or  `project/name`. If the project is not
 * 
 * passed to the import command it will be inferred from the provider block or environment variables.
 * 
 * If it cannot be inferred it will be queried from the Compute API (this will fail if the API is
 * 
 * not enabled).
 * 
 * * `{{project_id}}/{{bucket}}`
 * 
 * * `{{bucket}}`
 * 
 * When using the `pulumi import` command, Storage buckets can be imported using one of the formats above. For example:
 * 
 * ```sh
 * $ pulumi import gcp:storage/bucket:Bucket default {{bucket}}
 * ```
 * 
 * ```sh
 * $ pulumi import gcp:storage/bucket:Bucket default {{project_id}}/{{bucket}}
 * ```
 * 
 * `false` in state. If you&#39;ve set it to `true` in config, run `pulumi up` to
 * 
 * update the value set in state. If you delete this resource before updating the
 * 
 * value, objects in the bucket will not be destroyed.
 * 
 */
@ResourceType(type="gcp:storage/bucket:Bucket")
public class Bucket extends com.pulumi.resources.CustomResource {
    /**
     * The bucket&#39;s [Autoclass](https://cloud.google.com/storage/docs/autoclass) configuration.  Structure is documented below.
     * 
     */
    @Export(name="autoclass", refs={BucketAutoclass.class}, tree="[0]")
    private Output</* @Nullable */ BucketAutoclass> autoclass;

    /**
     * @return The bucket&#39;s [Autoclass](https://cloud.google.com/storage/docs/autoclass) configuration.  Structure is documented below.
     * 
     */
    public Output<Optional<BucketAutoclass>> autoclass() {
        return Codegen.optional(this.autoclass);
    }
    /**
     * The bucket&#39;s [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    @Export(name="cors", refs={List.class,BucketCor.class}, tree="[0,1]")
    private Output</* @Nullable */ List<BucketCor>> cors;

    /**
     * @return The bucket&#39;s [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    public Output<Optional<List<BucketCor>>> cors() {
        return Codegen.optional(this.cors);
    }
    /**
     * The bucket&#39;s custom location configuration, which specifies the individual regions that comprise a dual-region bucket. If the bucket is designated a single or multi-region, the parameters are empty. Structure is documented below.
     * 
     */
    @Export(name="customPlacementConfig", refs={BucketCustomPlacementConfig.class}, tree="[0]")
    private Output</* @Nullable */ BucketCustomPlacementConfig> customPlacementConfig;

    /**
     * @return The bucket&#39;s custom location configuration, which specifies the individual regions that comprise a dual-region bucket. If the bucket is designated a single or multi-region, the parameters are empty. Structure is documented below.
     * 
     */
    public Output<Optional<BucketCustomPlacementConfig>> customPlacementConfig() {
        return Codegen.optional(this.customPlacementConfig);
    }
    /**
     * Whether or not to automatically apply an eventBasedHold to new objects added to the bucket.
     * 
     */
    @Export(name="defaultEventBasedHold", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> defaultEventBasedHold;

    /**
     * @return Whether or not to automatically apply an eventBasedHold to new objects added to the bucket.
     * 
     */
    public Output<Optional<Boolean>> defaultEventBasedHold() {
        return Codegen.optional(this.defaultEventBasedHold);
    }
    @Export(name="effectiveLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> effectiveLabels;

    public Output<Map<String,String>> effectiveLabels() {
        return this.effectiveLabels;
    }
    /**
     * Enables [object retention](https://cloud.google.com/storage/docs/object-lock) on a storage bucket.
     * 
     */
    @Export(name="enableObjectRetention", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableObjectRetention;

    /**
     * @return Enables [object retention](https://cloud.google.com/storage/docs/object-lock) on a storage bucket.
     * 
     */
    public Output<Optional<Boolean>> enableObjectRetention() {
        return Codegen.optional(this.enableObjectRetention);
    }
    /**
     * The bucket&#39;s encryption configuration. Structure is documented below.
     * 
     */
    @Export(name="encryption", refs={BucketEncryption.class}, tree="[0]")
    private Output</* @Nullable */ BucketEncryption> encryption;

    /**
     * @return The bucket&#39;s encryption configuration. Structure is documented below.
     * 
     */
    public Output<Optional<BucketEncryption>> encryption() {
        return Codegen.optional(this.encryption);
    }
    /**
     * When deleting a bucket, this
     * boolean option will delete all contained objects. If you try to delete a
     * bucket that contains objects, the provider will fail that run.
     * 
     */
    @Export(name="forceDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return When deleting a bucket, this
     * boolean option will delete all contained objects. If you try to delete a
     * bucket that contains objects, the provider will fail that run.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * The bucket&#39;s hierarchical namespace policy, which defines the bucket capability to handle folders in logical structure. Structure is documented below. To use this configuration, `uniform_bucket_level_access` must be enabled on bucket.
     * 
     */
    @Export(name="hierarchicalNamespace", refs={BucketHierarchicalNamespace.class}, tree="[0]")
    private Output</* @Nullable */ BucketHierarchicalNamespace> hierarchicalNamespace;

    /**
     * @return The bucket&#39;s hierarchical namespace policy, which defines the bucket capability to handle folders in logical structure. Structure is documented below. To use this configuration, `uniform_bucket_level_access` must be enabled on bucket.
     * 
     */
    public Output<Optional<BucketHierarchicalNamespace>> hierarchicalNamespace() {
        return Codegen.optional(this.hierarchicalNamespace);
    }
    /**
     * The bucket IP filtering configuration. Specifies the network sources that can access the bucket, as well as its underlying objects. Structure is documented below.
     * 
     */
    @Export(name="ipFilter", refs={BucketIpFilter.class}, tree="[0]")
    private Output</* @Nullable */ BucketIpFilter> ipFilter;

    /**
     * @return The bucket IP filtering configuration. Specifies the network sources that can access the bucket, as well as its underlying objects. Structure is documented below.
     * 
     */
    public Output<Optional<BucketIpFilter>> ipFilter() {
        return Codegen.optional(this.ipFilter);
    }
    /**
     * A map of key/value label pairs to assign to the bucket.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A map of key/value label pairs to assign to the bucket.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The bucket&#39;s [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    @Export(name="lifecycleRules", refs={List.class,BucketLifecycleRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<BucketLifecycleRule>> lifecycleRules;

    /**
     * @return The bucket&#39;s [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    public Output<Optional<List<BucketLifecycleRule>>> lifecycleRules() {
        return Codegen.optional(this.lifecycleRules);
    }
    /**
     * The [GCS location](https://cloud.google.com/storage/docs/bucket-locations).
     * 
     * ***
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
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
    @Export(name="logging", refs={BucketLogging.class}, tree="[0]")
    private Output</* @Nullable */ BucketLogging> logging;

    /**
     * @return The bucket&#39;s [Access &amp; Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration. Structure is documented below.
     * 
     */
    public Output<Optional<BucketLogging>> logging() {
        return Codegen.optional(this.logging);
    }
    /**
     * The name of the bucket.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the bucket.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The project number of the project in which the resource belongs.
     * 
     */
    @Export(name="projectNumber", refs={Integer.class}, tree="[0]")
    private Output<Integer> projectNumber;

    /**
     * @return The project number of the project in which the resource belongs.
     * 
     */
    public Output<Integer> projectNumber() {
        return this.projectNumber;
    }
    /**
     * Prevents public access to a bucket. Acceptable values are &#34;inherited&#34; or &#34;enforced&#34;. If &#34;inherited&#34;, the bucket uses [public access prevention](https://cloud.google.com/storage/docs/public-access-prevention) only if the bucket is subject to the public access prevention organization policy constraint. Defaults to &#34;inherited&#34;.
     * 
     */
    @Export(name="publicAccessPrevention", refs={String.class}, tree="[0]")
    private Output<String> publicAccessPrevention;

    /**
     * @return Prevents public access to a bucket. Acceptable values are &#34;inherited&#34; or &#34;enforced&#34;. If &#34;inherited&#34;, the bucket uses [public access prevention](https://cloud.google.com/storage/docs/public-access-prevention) only if the bucket is subject to the public access prevention organization policy constraint. Defaults to &#34;inherited&#34;.
     * 
     */
    public Output<String> publicAccessPrevention() {
        return this.publicAccessPrevention;
    }
    /**
     * The combination of labels configured directly on the resource and default labels configured on the provider.
     * 
     */
    @Export(name="pulumiLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource and default labels configured on the provider.
     * 
     */
    public Output<Map<String,String>> pulumiLabels() {
        return this.pulumiLabels;
    }
    /**
     * Enables [Requester Pays](https://cloud.google.com/storage/docs/requester-pays) on a storage bucket.
     * 
     */
    @Export(name="requesterPays", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> requesterPays;

    /**
     * @return Enables [Requester Pays](https://cloud.google.com/storage/docs/requester-pays) on a storage bucket.
     * 
     */
    public Output<Optional<Boolean>> requesterPays() {
        return Codegen.optional(this.requesterPays);
    }
    /**
     * Configuration of the bucket&#39;s data retention policy for how long objects in the bucket should be retained. Structure is documented below.
     * 
     */
    @Export(name="retentionPolicy", refs={BucketRetentionPolicy.class}, tree="[0]")
    private Output</* @Nullable */ BucketRetentionPolicy> retentionPolicy;

    /**
     * @return Configuration of the bucket&#39;s data retention policy for how long objects in the bucket should be retained. Structure is documented below.
     * 
     */
    public Output<Optional<BucketRetentionPolicy>> retentionPolicy() {
        return Codegen.optional(this.retentionPolicy);
    }
    /**
     * The recovery point objective for cross-region replication of the bucket. Applicable only for dual and multi-region buckets. `&#34;DEFAULT&#34;` sets default replication. `&#34;ASYNC_TURBO&#34;` value enables turbo replication, valid for dual-region buckets only. See [Turbo Replication](https://cloud.google.com/storage/docs/managing-turbo-replication) for more information. If rpo is not specified at bucket creation, it defaults to `&#34;DEFAULT&#34;` for dual and multi-region buckets. **NOTE** If used with single-region bucket, It will throw an error.
     * 
     */
    @Export(name="rpo", refs={String.class}, tree="[0]")
    private Output<String> rpo;

    /**
     * @return The recovery point objective for cross-region replication of the bucket. Applicable only for dual and multi-region buckets. `&#34;DEFAULT&#34;` sets default replication. `&#34;ASYNC_TURBO&#34;` value enables turbo replication, valid for dual-region buckets only. See [Turbo Replication](https://cloud.google.com/storage/docs/managing-turbo-replication) for more information. If rpo is not specified at bucket creation, it defaults to `&#34;DEFAULT&#34;` for dual and multi-region buckets. **NOTE** If used with single-region bucket, It will throw an error.
     * 
     */
    public Output<String> rpo() {
        return this.rpo;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", refs={String.class}, tree="[0]")
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * The bucket&#39;s soft delete policy, which defines the period of time that soft-deleted objects will be retained, and cannot
     * be permanently deleted. If it is not provided, by default Google Cloud Storage sets this to default soft delete policy
     * 
     */
    @Export(name="softDeletePolicy", refs={BucketSoftDeletePolicy.class}, tree="[0]")
    private Output<BucketSoftDeletePolicy> softDeletePolicy;

    /**
     * @return The bucket&#39;s soft delete policy, which defines the period of time that soft-deleted objects will be retained, and cannot
     * be permanently deleted. If it is not provided, by default Google Cloud Storage sets this to default soft delete policy
     * 
     */
    public Output<BucketSoftDeletePolicy> softDeletePolicy() {
        return this.softDeletePolicy;
    }
    /**
     * The [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of the new bucket. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`.
     * 
     */
    @Export(name="storageClass", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageClass;

    /**
     * @return The [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of the new bucket. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`.
     * 
     */
    public Output<Optional<String>> storageClass() {
        return Codegen.optional(this.storageClass);
    }
    /**
     * The creation time of the bucket in RFC 3339 format.
     * 
     */
    @Export(name="timeCreated", refs={String.class}, tree="[0]")
    private Output<String> timeCreated;

    /**
     * @return The creation time of the bucket in RFC 3339 format.
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * Enables [Uniform bucket-level access](https://cloud.google.com/storage/docs/uniform-bucket-level-access) access to a bucket.
     * 
     */
    @Export(name="uniformBucketLevelAccess", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> uniformBucketLevelAccess;

    /**
     * @return Enables [Uniform bucket-level access](https://cloud.google.com/storage/docs/uniform-bucket-level-access) access to a bucket.
     * 
     */
    public Output<Boolean> uniformBucketLevelAccess() {
        return this.uniformBucketLevelAccess;
    }
    /**
     * The time at which the bucket&#39;s metadata or IAM policy was last updated, in RFC 3339 format.
     * 
     */
    @Export(name="updated", refs={String.class}, tree="[0]")
    private Output<String> updated;

    /**
     * @return The time at which the bucket&#39;s metadata or IAM policy was last updated, in RFC 3339 format.
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }
    /**
     * The base URL of the bucket, in the format `gs://&lt;bucket-name&gt;`.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return The base URL of the bucket, in the format `gs://&lt;bucket-name&gt;`.
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    /**
     * The bucket&#39;s [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.  Structure is documented below.
     * 
     */
    @Export(name="versioning", refs={BucketVersioning.class}, tree="[0]")
    private Output<BucketVersioning> versioning;

    /**
     * @return The bucket&#39;s [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.  Structure is documented below.
     * 
     */
    public Output<BucketVersioning> versioning() {
        return this.versioning;
    }
    /**
     * Configuration if the bucket acts as a website. Structure is documented below.
     * 
     */
    @Export(name="website", refs={BucketWebsite.class}, tree="[0]")
    private Output<BucketWebsite> website;

    /**
     * @return Configuration if the bucket acts as a website. Structure is documented below.
     * 
     */
    public Output<BucketWebsite> website() {
        return this.website;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Bucket(java.lang.String name) {
        this(name, BucketArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Bucket(java.lang.String name, BucketArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Bucket(java.lang.String name, BucketArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/bucket:Bucket", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Bucket(java.lang.String name, Output<java.lang.String> id, @Nullable BucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/bucket:Bucket", name, state, makeResourceOptions(options, id), false);
    }

    private static BucketArgs makeArgs(BucketArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BucketArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "effectiveLabels",
                "pulumiLabels"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Bucket get(java.lang.String name, Output<java.lang.String> id, @Nullable BucketState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Bucket(name, id, state, options);
    }
}
