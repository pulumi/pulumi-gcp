// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkloadIdentityPoolProviderPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkloadIdentityPoolProviderPlainArgs Empty = new GetWorkloadIdentityPoolProviderPlainArgs();

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The id of the pool which is the
     * final component of the pool resource name.
     * 
     */
    @Import(name="workloadIdentityPoolId", required=true)
    private String workloadIdentityPoolId;

    /**
     * @return The id of the pool which is the
     * final component of the pool resource name.
     * 
     */
    public String workloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }

    /**
     * The id of the provider which is the
     * final component of the resource name.
     * 
     * ***
     * 
     */
    @Import(name="workloadIdentityPoolProviderId", required=true)
    private String workloadIdentityPoolProviderId;

    /**
     * @return The id of the provider which is the
     * final component of the resource name.
     * 
     * ***
     * 
     */
    public String workloadIdentityPoolProviderId() {
        return this.workloadIdentityPoolProviderId;
    }

    private GetWorkloadIdentityPoolProviderPlainArgs() {}

    private GetWorkloadIdentityPoolProviderPlainArgs(GetWorkloadIdentityPoolProviderPlainArgs $) {
        this.project = $.project;
        this.workloadIdentityPoolId = $.workloadIdentityPoolId;
        this.workloadIdentityPoolProviderId = $.workloadIdentityPoolProviderId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkloadIdentityPoolProviderPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkloadIdentityPoolProviderPlainArgs $;

        public Builder() {
            $ = new GetWorkloadIdentityPoolProviderPlainArgs();
        }

        public Builder(GetWorkloadIdentityPoolProviderPlainArgs defaults) {
            $ = new GetWorkloadIdentityPoolProviderPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
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
            $.workloadIdentityPoolId = workloadIdentityPoolId;
            return this;
        }

        /**
         * @param workloadIdentityPoolProviderId The id of the provider which is the
         * final component of the resource name.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder workloadIdentityPoolProviderId(String workloadIdentityPoolProviderId) {
            $.workloadIdentityPoolProviderId = workloadIdentityPoolProviderId;
            return this;
        }

        public GetWorkloadIdentityPoolProviderPlainArgs build() {
            if ($.workloadIdentityPoolId == null) {
                throw new MissingRequiredPropertyException("GetWorkloadIdentityPoolProviderPlainArgs", "workloadIdentityPoolId");
            }
            if ($.workloadIdentityPoolProviderId == null) {
                throw new MissingRequiredPropertyException("GetWorkloadIdentityPoolProviderPlainArgs", "workloadIdentityPoolProviderId");
            }
            return $;
        }
    }

}
