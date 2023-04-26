// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.logging.inputs.LinkedDatasetBigqueryDatasetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinkedDatasetState extends com.pulumi.resources.ResourceArgs {

    public static final LinkedDatasetState Empty = new LinkedDatasetState();

    /**
     * The information of a BigQuery Dataset. When a link is created, a BigQuery dataset is created along
     * with it, in the same project as the LogBucket it&#39;s linked to. This dataset will also have BigQuery
     * Views corresponding to the LogViews in the bucket.
     * Structure is documented below.
     * 
     */
    @Import(name="bigqueryDatasets")
    private @Nullable Output<List<LinkedDatasetBigqueryDatasetArgs>> bigqueryDatasets;

    /**
     * @return The information of a BigQuery Dataset. When a link is created, a BigQuery dataset is created along
     * with it, in the same project as the LogBucket it&#39;s linked to. This dataset will also have BigQuery
     * Views corresponding to the LogViews in the bucket.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<LinkedDatasetBigqueryDatasetArgs>>> bigqueryDatasets() {
        return Optional.ofNullable(this.bigqueryDatasets);
    }

    /**
     * The bucket to which the linked dataset is attached.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The bucket to which the linked dataset is attached.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * Output only. The creation timestamp of the link. A timestamp in RFC3339 UTC &#34;Zulu&#34; format,
     * with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34;
     * and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Output only. The creation timestamp of the link. A timestamp in RFC3339 UTC &#34;Zulu&#34; format,
     * with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34;
     * and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Describes this link. The maximum length of the description is 8000 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Describes this link. The maximum length of the description is 8000 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Output only. The linked dataset lifecycle state.
     * 
     */
    @Import(name="lifecycleState")
    private @Nullable Output<String> lifecycleState;

    /**
     * @return Output only. The linked dataset lifecycle state.
     * 
     */
    public Optional<Output<String>> lifecycleState() {
        return Optional.ofNullable(this.lifecycleState);
    }

    /**
     * The id of the linked dataset.
     * 
     */
    @Import(name="linkId")
    private @Nullable Output<String> linkId;

    /**
     * @return The id of the linked dataset.
     * 
     */
    public Optional<Output<String>> linkId() {
        return Optional.ofNullable(this.linkId);
    }

    /**
     * The location of the linked dataset.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the linked dataset.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name of the linked dataset. The name can have up to 100 characters. A valid link id
     * (at the end of the link name) must only have alphanumeric characters and underscores within it.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the linked dataset. The name can have up to 100 characters. A valid link id
     * (at the end of the link name) must only have alphanumeric characters and underscores within it.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The parent of the linked dataset.
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return The parent of the linked dataset.
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    private LinkedDatasetState() {}

    private LinkedDatasetState(LinkedDatasetState $) {
        this.bigqueryDatasets = $.bigqueryDatasets;
        this.bucket = $.bucket;
        this.createTime = $.createTime;
        this.description = $.description;
        this.lifecycleState = $.lifecycleState;
        this.linkId = $.linkId;
        this.location = $.location;
        this.name = $.name;
        this.parent = $.parent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedDatasetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedDatasetState $;

        public Builder() {
            $ = new LinkedDatasetState();
        }

        public Builder(LinkedDatasetState defaults) {
            $ = new LinkedDatasetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bigqueryDatasets The information of a BigQuery Dataset. When a link is created, a BigQuery dataset is created along
         * with it, in the same project as the LogBucket it&#39;s linked to. This dataset will also have BigQuery
         * Views corresponding to the LogViews in the bucket.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bigqueryDatasets(@Nullable Output<List<LinkedDatasetBigqueryDatasetArgs>> bigqueryDatasets) {
            $.bigqueryDatasets = bigqueryDatasets;
            return this;
        }

        /**
         * @param bigqueryDatasets The information of a BigQuery Dataset. When a link is created, a BigQuery dataset is created along
         * with it, in the same project as the LogBucket it&#39;s linked to. This dataset will also have BigQuery
         * Views corresponding to the LogViews in the bucket.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bigqueryDatasets(List<LinkedDatasetBigqueryDatasetArgs> bigqueryDatasets) {
            return bigqueryDatasets(Output.of(bigqueryDatasets));
        }

        /**
         * @param bigqueryDatasets The information of a BigQuery Dataset. When a link is created, a BigQuery dataset is created along
         * with it, in the same project as the LogBucket it&#39;s linked to. This dataset will also have BigQuery
         * Views corresponding to the LogViews in the bucket.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder bigqueryDatasets(LinkedDatasetBigqueryDatasetArgs... bigqueryDatasets) {
            return bigqueryDatasets(List.of(bigqueryDatasets));
        }

        /**
         * @param bucket The bucket to which the linked dataset is attached.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The bucket to which the linked dataset is attached.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param createTime Output only. The creation timestamp of the link. A timestamp in RFC3339 UTC &#34;Zulu&#34; format,
         * with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34;
         * and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Output only. The creation timestamp of the link. A timestamp in RFC3339 UTC &#34;Zulu&#34; format,
         * with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34;
         * and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description Describes this link. The maximum length of the description is 8000 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Describes this link. The maximum length of the description is 8000 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param lifecycleState Output only. The linked dataset lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleState(@Nullable Output<String> lifecycleState) {
            $.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * @param lifecycleState Output only. The linked dataset lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleState(String lifecycleState) {
            return lifecycleState(Output.of(lifecycleState));
        }

        /**
         * @param linkId The id of the linked dataset.
         * 
         * @return builder
         * 
         */
        public Builder linkId(@Nullable Output<String> linkId) {
            $.linkId = linkId;
            return this;
        }

        /**
         * @param linkId The id of the linked dataset.
         * 
         * @return builder
         * 
         */
        public Builder linkId(String linkId) {
            return linkId(Output.of(linkId));
        }

        /**
         * @param location The location of the linked dataset.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the linked dataset.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource name of the linked dataset. The name can have up to 100 characters. A valid link id
         * (at the end of the link name) must only have alphanumeric characters and underscores within it.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the linked dataset. The name can have up to 100 characters. A valid link id
         * (at the end of the link name) must only have alphanumeric characters and underscores within it.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parent The parent of the linked dataset.
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The parent of the linked dataset.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        public LinkedDatasetState build() {
            return $;
        }
    }

}