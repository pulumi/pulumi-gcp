// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkloadIdentityPoolProviderArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkloadIdentityPoolProviderArgs Empty = new GetWorkloadIdentityPoolProviderArgs();

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The id of the pool which is the
     * final component of the pool resource name.
     * 
     */
    @Import(name="workloadIdentityPoolId", required=true)
    private Output<String> workloadIdentityPoolId;

    /**
     * @return The id of the pool which is the
     * final component of the pool resource name.
     * 
     */
    public Output<String> workloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }

    /**
     * The id of the provider which is the
     * final component of the resource name.
     * 
     */
    @Import(name="workloadIdentityPoolProviderId", required=true)
    private Output<String> workloadIdentityPoolProviderId;

    /**
     * @return The id of the provider which is the
     * final component of the resource name.
     * 
     */
    public Output<String> workloadIdentityPoolProviderId() {
        return this.workloadIdentityPoolProviderId;
    }

    private GetWorkloadIdentityPoolProviderArgs() {}

    private GetWorkloadIdentityPoolProviderArgs(GetWorkloadIdentityPoolProviderArgs $) {
        this.project = $.project;
        this.workloadIdentityPoolId = $.workloadIdentityPoolId;
        this.workloadIdentityPoolProviderId = $.workloadIdentityPoolProviderId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkloadIdentityPoolProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkloadIdentityPoolProviderArgs $;

        public Builder() {
            $ = new GetWorkloadIdentityPoolProviderArgs();
        }

        public Builder(GetWorkloadIdentityPoolProviderArgs defaults) {
            $ = new GetWorkloadIdentityPoolProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The project in which the resource belongs. If it
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
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param workloadIdentityPoolId The id of the pool which is the
         * final component of the pool resource name.
         * 
         * @return builder
         * 
         */
        public Builder workloadIdentityPoolId(Output<String> workloadIdentityPoolId) {
            $.workloadIdentityPoolId = workloadIdentityPoolId;
            return this;
        }

        /**
         * @param workloadIdentityPoolId The id of the pool which is the
         * final component of the pool resource name.
         * 
         * @return builder
         * 
         */
        public Builder workloadIdentityPoolId(String workloadIdentityPoolId) {
            return workloadIdentityPoolId(Output.of(workloadIdentityPoolId));
        }

        /**
         * @param workloadIdentityPoolProviderId The id of the provider which is the
         * final component of the resource name.
         * 
         * @return builder
         * 
         */
        public Builder workloadIdentityPoolProviderId(Output<String> workloadIdentityPoolProviderId) {
            $.workloadIdentityPoolProviderId = workloadIdentityPoolProviderId;
            return this;
        }

        /**
         * @param workloadIdentityPoolProviderId The id of the provider which is the
         * final component of the resource name.
         * 
         * @return builder
         * 
         */
        public Builder workloadIdentityPoolProviderId(String workloadIdentityPoolProviderId) {
            return workloadIdentityPoolProviderId(Output.of(workloadIdentityPoolProviderId));
        }

        public GetWorkloadIdentityPoolProviderArgs build() {
            $.workloadIdentityPoolId = Objects.requireNonNull($.workloadIdentityPoolId, "expected parameter 'workloadIdentityPoolId' to be non-null");
            $.workloadIdentityPoolProviderId = Objects.requireNonNull($.workloadIdentityPoolProviderId, "expected parameter 'workloadIdentityPoolProviderId' to be non-null");
            return $;
        }
    }

}