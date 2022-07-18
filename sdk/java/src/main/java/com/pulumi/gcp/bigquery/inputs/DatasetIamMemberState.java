// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigquery.inputs.DatasetIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetIamMemberState extends com.pulumi.resources.ResourceArgs {

    public static final DatasetIamMemberState Empty = new DatasetIamMemberState();

    @Import(name="condition")
    private @Nullable Output<DatasetIamMemberConditionArgs> condition;

    public Optional<Output<DatasetIamMemberConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * The dataset ID.
     * 
     */
    @Import(name="datasetId")
    private @Nullable Output<String> datasetId;

    /**
     * @return The dataset ID.
     * 
     */
    public Optional<Output<String>> datasetId() {
        return Optional.ofNullable(this.datasetId);
    }

    /**
     * (Computed) The etag of the dataset&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return (Computed) The etag of the dataset&#39;s IAM policy.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    @Import(name="member")
    private @Nullable Output<String> member;

    public Optional<Output<String>> member() {
        return Optional.ofNullable(this.member);
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
     * The role that should be applied. Only one
     * `gcp.bigquery.DatasetIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.bigquery.DatasetIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private DatasetIamMemberState() {}

    private DatasetIamMemberState(DatasetIamMemberState $) {
        this.condition = $.condition;
        this.datasetId = $.datasetId;
        this.etag = $.etag;
        this.member = $.member;
        this.project = $.project;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetIamMemberState $;

        public Builder() {
            $ = new DatasetIamMemberState();
        }

        public Builder(DatasetIamMemberState defaults) {
            $ = new DatasetIamMemberState(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<DatasetIamMemberConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(DatasetIamMemberConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param datasetId The dataset ID.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(@Nullable Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        /**
         * @param datasetId The dataset ID.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        /**
         * @param etag (Computed) The etag of the dataset&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag (Computed) The etag of the dataset&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder member(@Nullable Output<String> member) {
            $.member = member;
            return this;
        }

        public Builder member(String member) {
            return member(Output.of(member));
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
         * @param role The role that should be applied. Only one
         * `gcp.bigquery.DatasetIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.bigquery.DatasetIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public DatasetIamMemberState build() {
            return $;
        }
    }

}