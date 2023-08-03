// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubnetworkIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubnetworkIamPolicyPlainArgs Empty = new GetSubnetworkIamPolicyPlainArgs();

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The GCP region for this subnetwork.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return The GCP region for this subnetwork.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="subnetwork", required=true)
    private String subnetwork;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String subnetwork() {
        return this.subnetwork;
    }

    private GetSubnetworkIamPolicyPlainArgs() {}

    private GetSubnetworkIamPolicyPlainArgs(GetSubnetworkIamPolicyPlainArgs $) {
        this.project = $.project;
        this.region = $.region;
        this.subnetwork = $.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubnetworkIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubnetworkIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetSubnetworkIamPolicyPlainArgs();
        }

        public Builder(GetSubnetworkIamPolicyPlainArgs defaults) {
            $ = new GetSubnetworkIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param region The GCP region for this subnetwork.
         * Used to find the parent resource to bind the IAM policy to. If not specified,
         * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
         * region is specified, it is taken from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        /**
         * @param subnetwork Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        public GetSubnetworkIamPolicyPlainArgs build() {
            $.subnetwork = Objects.requireNonNull($.subnetwork, "expected parameter 'subnetwork' to be non-null");
            return $;
        }
    }

}