// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.developerconnect;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitRepositoryLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitRepositoryLinkArgs Empty = new GitRepositoryLinkArgs();

    /**
     * Optional. Allows clients to store small amounts of arbitrary data.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    /**
     * @return Optional. Allows clients to store small amounts of arbitrary data.
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Required. Git Clone URI.
     * 
     */
    @Import(name="cloneUri", required=true)
    private Output<String> cloneUri;

    /**
     * @return Required. Git Clone URI.
     * 
     */
    public Output<String> cloneUri() {
        return this.cloneUri;
    }

    /**
     * Optional. This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return Optional. This checksum is computed by the server based on the value of other
     * fields, and may be sent on update and delete requests to ensure the
     * client has an up-to-date value before proceeding.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Required. The ID to use for the repository, which will become the final component of
     * the repository&#39;s resource name. This ID should be unique in the connection.
     * Allows alphanumeric characters and any of -._~%!$&amp;&#39;()*+,;={@literal @}.
     * 
     */
    @Import(name="gitRepositoryLinkId", required=true)
    private Output<String> gitRepositoryLinkId;

    /**
     * @return Required. The ID to use for the repository, which will become the final component of
     * the repository&#39;s resource name. This ID should be unique in the connection.
     * Allows alphanumeric characters and any of -._~%!$&amp;&#39;()*+,;={@literal @}.
     * 
     */
    public Output<String> gitRepositoryLinkId() {
        return this.gitRepositoryLinkId;
    }

    /**
     * Optional. Labels as key value pairs
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Labels as key value pairs
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `developerconnect.googleapis.com/GitRepositoryLink`.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `developerconnect.googleapis.com/GitRepositoryLink`.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `developerconnect.googleapis.com/GitRepositoryLink`.
     * 
     */
    @Import(name="parentConnection", required=true)
    private Output<String> parentConnection;

    /**
     * @return Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `developerconnect.googleapis.com/GitRepositoryLink`.
     * 
     */
    public Output<String> parentConnection() {
        return this.parentConnection;
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

    private GitRepositoryLinkArgs() {}

    private GitRepositoryLinkArgs(GitRepositoryLinkArgs $) {
        this.annotations = $.annotations;
        this.cloneUri = $.cloneUri;
        this.etag = $.etag;
        this.gitRepositoryLinkId = $.gitRepositoryLinkId;
        this.labels = $.labels;
        this.location = $.location;
        this.parentConnection = $.parentConnection;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitRepositoryLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitRepositoryLinkArgs $;

        public Builder() {
            $ = new GitRepositoryLinkArgs();
        }

        public Builder(GitRepositoryLinkArgs defaults) {
            $ = new GitRepositoryLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotations Optional. Allows clients to store small amounts of arbitrary data.
         * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
         * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Optional. Allows clients to store small amounts of arbitrary data.
         * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
         * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param cloneUri Required. Git Clone URI.
         * 
         * @return builder
         * 
         */
        public Builder cloneUri(Output<String> cloneUri) {
            $.cloneUri = cloneUri;
            return this;
        }

        /**
         * @param cloneUri Required. Git Clone URI.
         * 
         * @return builder
         * 
         */
        public Builder cloneUri(String cloneUri) {
            return cloneUri(Output.of(cloneUri));
        }

        /**
         * @param etag Optional. This checksum is computed by the server based on the value of other
         * fields, and may be sent on update and delete requests to ensure the
         * client has an up-to-date value before proceeding.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag Optional. This checksum is computed by the server based on the value of other
         * fields, and may be sent on update and delete requests to ensure the
         * client has an up-to-date value before proceeding.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param gitRepositoryLinkId Required. The ID to use for the repository, which will become the final component of
         * the repository&#39;s resource name. This ID should be unique in the connection.
         * Allows alphanumeric characters and any of -._~%!$&amp;&#39;()*+,;={@literal @}.
         * 
         * @return builder
         * 
         */
        public Builder gitRepositoryLinkId(Output<String> gitRepositoryLinkId) {
            $.gitRepositoryLinkId = gitRepositoryLinkId;
            return this;
        }

        /**
         * @param gitRepositoryLinkId Required. The ID to use for the repository, which will become the final component of
         * the repository&#39;s resource name. This ID should be unique in the connection.
         * Allows alphanumeric characters and any of -._~%!$&amp;&#39;()*+,;={@literal @}.
         * 
         * @return builder
         * 
         */
        public Builder gitRepositoryLinkId(String gitRepositoryLinkId) {
            return gitRepositoryLinkId(Output.of(gitRepositoryLinkId));
        }

        /**
         * @param labels Optional. Labels as key value pairs
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
         * @param labels Optional. Labels as key value pairs
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
         * @param location Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `developerconnect.googleapis.com/GitRepositoryLink`.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `developerconnect.googleapis.com/GitRepositoryLink`.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param parentConnection Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `developerconnect.googleapis.com/GitRepositoryLink`.
         * 
         * @return builder
         * 
         */
        public Builder parentConnection(Output<String> parentConnection) {
            $.parentConnection = parentConnection;
            return this;
        }

        /**
         * @param parentConnection Resource ID segment making up resource `name`. It identifies the resource within its parent collection as described in https://google.aip.dev/122. See documentation for resource type `developerconnect.googleapis.com/GitRepositoryLink`.
         * 
         * @return builder
         * 
         */
        public Builder parentConnection(String parentConnection) {
            return parentConnection(Output.of(parentConnection));
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

        public GitRepositoryLinkArgs build() {
            if ($.cloneUri == null) {
                throw new MissingRequiredPropertyException("GitRepositoryLinkArgs", "cloneUri");
            }
            if ($.gitRepositoryLinkId == null) {
                throw new MissingRequiredPropertyException("GitRepositoryLinkArgs", "gitRepositoryLinkId");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("GitRepositoryLinkArgs", "location");
            }
            if ($.parentConnection == null) {
                throw new MissingRequiredPropertyException("GitRepositoryLinkArgs", "parentConnection");
            }
            return $;
        }
    }

}
