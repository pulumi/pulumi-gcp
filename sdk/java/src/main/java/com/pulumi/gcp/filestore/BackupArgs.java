// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.filestore;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupArgs Empty = new BackupArgs();

    /**
     * A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The resource name of the backup. The name must be unique within the specified instance.
     * The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the backup. The name must be unique within the specified instance.
     * The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Name of the file share in the source Cloud Filestore instance that the backup is created from.
     * 
     */
    @Import(name="sourceFileShare", required=true)
    private Output<String> sourceFileShare;

    /**
     * @return Name of the file share in the source Cloud Filestore instance that the backup is created from.
     * 
     */
    public Output<String> sourceFileShare() {
        return this.sourceFileShare;
    }

    /**
     * The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
     * 
     */
    @Import(name="sourceInstance", required=true)
    private Output<String> sourceInstance;

    /**
     * @return The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
     * 
     */
    public Output<String> sourceInstance() {
        return this.sourceInstance;
    }

    /**
     * A map of resource manager tags.
     * Resource manager tag keys and values have the same definition as resource manager tags.
     * Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/{tag_value_id}.
     * The field is ignored (both PUT &amp; PATCH) when empty.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of resource manager tags.
     * Resource manager tag keys and values have the same definition as resource manager tags.
     * Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/{tag_value_id}.
     * The field is ignored (both PUT &amp; PATCH) when empty.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private BackupArgs() {}

    private BackupArgs(BackupArgs $) {
        this.description = $.description;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.sourceFileShare = $.sourceFileShare;
        this.sourceInstance = $.sourceInstance;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupArgs $;

        public Builder() {
            $ = new BackupArgs();
        }

        public Builder(BackupArgs defaults) {
            $ = new BackupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels Resource labels to represent user-provided metadata.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Resource labels to represent user-provided metadata.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The name of the location of the instance. This can be a region for ENTERPRISE tier instances.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource name of the backup. The name must be unique within the specified instance.
         * The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the backup. The name must be unique within the specified instance.
         * The name must be 1-63 characters long, and comply with
         * RFC1035. Specifically, the name must be 1-63 characters long and match
         * the regular expression `a-z?` which means the
         * first character must be a lowercase letter, and all following
         * characters must be a dash, lowercase letter, or digit, except the last
         * character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param sourceFileShare Name of the file share in the source Cloud Filestore instance that the backup is created from.
         * 
         * @return builder
         * 
         */
        public Builder sourceFileShare(Output<String> sourceFileShare) {
            $.sourceFileShare = sourceFileShare;
            return this;
        }

        /**
         * @param sourceFileShare Name of the file share in the source Cloud Filestore instance that the backup is created from.
         * 
         * @return builder
         * 
         */
        public Builder sourceFileShare(String sourceFileShare) {
            return sourceFileShare(Output.of(sourceFileShare));
        }

        /**
         * @param sourceInstance The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
         * 
         * @return builder
         * 
         */
        public Builder sourceInstance(Output<String> sourceInstance) {
            $.sourceInstance = sourceInstance;
            return this;
        }

        /**
         * @param sourceInstance The resource name of the source Cloud Filestore instance, in the format projects/{projectId}/locations/{locationId}/instances/{instanceId}, used to create this backup.
         * 
         * @return builder
         * 
         */
        public Builder sourceInstance(String sourceInstance) {
            return sourceInstance(Output.of(sourceInstance));
        }

        /**
         * @param tags A map of resource manager tags.
         * Resource manager tag keys and values have the same definition as resource manager tags.
         * Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/{tag_value_id}.
         * The field is ignored (both PUT &amp; PATCH) when empty.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of resource manager tags.
         * Resource manager tag keys and values have the same definition as resource manager tags.
         * Keys must be in the format tagKeys/{tag_key_id}, and values are in the format tagValues/{tag_value_id}.
         * The field is ignored (both PUT &amp; PATCH) when empty.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public BackupArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("BackupArgs", "location");
            }
            if ($.sourceFileShare == null) {
                throw new MissingRequiredPropertyException("BackupArgs", "sourceFileShare");
            }
            if ($.sourceInstance == null) {
                throw new MissingRequiredPropertyException("BackupArgs", "sourceInstance");
            }
            return $;
        }
    }

}
