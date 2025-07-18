// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FolderState extends com.pulumi.resources.ResourceArgs {

    public static final FolderState Empty = new FolderState();

    /**
     * The name of the bucket that contains the folder.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The name of the bucket that contains the folder.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * The timestamp at which this folder was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The timestamp at which this folder was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * If set to true, items within folder if any will be force destroyed.
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    /**
     * @return If set to true, items within folder if any will be force destroyed.
     * 
     */
    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    /**
     * The metadata generation of the folder.
     * 
     */
    @Import(name="metageneration")
    private @Nullable Output<String> metageneration;

    /**
     * @return The metadata generation of the folder.
     * 
     */
    public Optional<Output<String>> metageneration() {
        return Optional.ofNullable(this.metageneration);
    }

    /**
     * The name of the folder expressed as a path. Must include
     * trailing &#39;/&#39;. For example, `example_dir/example_dir2/`, `example{@literal @}#/`, `a-b/d-f/`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the folder expressed as a path. Must include
     * trailing &#39;/&#39;. For example, `example_dir/example_dir2/`, `example{@literal @}#/`, `a-b/d-f/`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * The timestamp at which this folder was most recently updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The timestamp at which this folder was most recently updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private FolderState() {}

    private FolderState(FolderState $) {
        this.bucket = $.bucket;
        this.createTime = $.createTime;
        this.forceDestroy = $.forceDestroy;
        this.metageneration = $.metageneration;
        this.name = $.name;
        this.selfLink = $.selfLink;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FolderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FolderState $;

        public Builder() {
            $ = new FolderState();
        }

        public Builder(FolderState defaults) {
            $ = new FolderState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket that contains the folder.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket that contains the folder.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param createTime The timestamp at which this folder was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The timestamp at which this folder was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param forceDestroy If set to true, items within folder if any will be force destroyed.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * @param forceDestroy If set to true, items within folder if any will be force destroyed.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        /**
         * @param metageneration The metadata generation of the folder.
         * 
         * @return builder
         * 
         */
        public Builder metageneration(@Nullable Output<String> metageneration) {
            $.metageneration = metageneration;
            return this;
        }

        /**
         * @param metageneration The metadata generation of the folder.
         * 
         * @return builder
         * 
         */
        public Builder metageneration(String metageneration) {
            return metageneration(Output.of(metageneration));
        }

        /**
         * @param name The name of the folder expressed as a path. Must include
         * trailing &#39;/&#39;. For example, `example_dir/example_dir2/`, `example{@literal @}#/`, `a-b/d-f/`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the folder expressed as a path. Must include
         * trailing &#39;/&#39;. For example, `example_dir/example_dir2/`, `example{@literal @}#/`, `a-b/d-f/`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param selfLink The URI of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        /**
         * @param selfLink The URI of the created resource.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        /**
         * @param updateTime The timestamp at which this folder was most recently updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The timestamp at which this folder was most recently updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public FolderState build() {
            return $;
        }
    }

}
