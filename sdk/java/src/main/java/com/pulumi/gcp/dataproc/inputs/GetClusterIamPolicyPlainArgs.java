// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterIamPolicyPlainArgs Empty = new GetClusterIamPolicyPlainArgs();

    /**
     * The name or relative resource id of the cluster to manage IAM policies for.
     * 
     */
    @Import(name="cluster", required=true)
    private String cluster;

    /**
     * @return The name or relative resource id of the cluster to manage IAM policies for.
     * 
     */
    public String cluster() {
        return this.cluster;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region")
    private @Nullable String region;

    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetClusterIamPolicyPlainArgs() {}

    private GetClusterIamPolicyPlainArgs(GetClusterIamPolicyPlainArgs $) {
        this.cluster = $.cluster;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetClusterIamPolicyPlainArgs();
        }

        public Builder(GetClusterIamPolicyPlainArgs defaults) {
            $ = new GetClusterIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cluster The name or relative resource id of the cluster to manage IAM policies for.
         * 
         * @return builder
         * 
         */
        public Builder cluster(String cluster) {
            $.cluster = cluster;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetClusterIamPolicyPlainArgs build() {
            $.cluster = Objects.requireNonNull($.cluster, "expected parameter 'cluster' to be non-null");
            return $;
        }
    }

}