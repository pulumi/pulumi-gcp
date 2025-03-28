// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UsageExportBucketState extends com.pulumi.resources.ResourceArgs {

    public static final UsageExportBucketState Empty = new UsageExportBucketState();

    /**
     * The bucket to store reports in.
     * 
     * ***
     * 
     */
    @Import(name="bucketName")
    private @Nullable Output<String> bucketName;

    /**
     * @return The bucket to store reports in.
     * 
     * ***
     * 
     */
    public Optional<Output<String>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    /**
     * A prefix for the reports, for instance, the project name.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return A prefix for the reports, for instance, the project name.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * The project to set the export bucket on. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project to set the export bucket on. If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private UsageExportBucketState() {}

    private UsageExportBucketState(UsageExportBucketState $) {
        this.bucketName = $.bucketName;
        this.prefix = $.prefix;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UsageExportBucketState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UsageExportBucketState $;

        public Builder() {
            $ = new UsageExportBucketState();
        }

        public Builder(UsageExportBucketState defaults) {
            $ = new UsageExportBucketState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName The bucket to store reports in.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder bucketName(@Nullable Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName The bucket to store reports in.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param prefix A prefix for the reports, for instance, the project name.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix A prefix for the reports, for instance, the project name.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param project The project to set the export bucket on. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project to set the export bucket on. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public UsageExportBucketState build() {
            return $;
        }
    }

}
