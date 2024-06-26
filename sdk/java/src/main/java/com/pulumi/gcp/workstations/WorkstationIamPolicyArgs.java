// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.workstations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkstationIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkstationIamPolicyArgs Empty = new WorkstationIamPolicyArgs();

    /**
     * The location where the workstation parent resources reside.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location where the workstation parent resources reside.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
     * location is specified, it is taken from the provider configuration.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> policyData() {
        return this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="workstationClusterId", required=true)
    private Output<String> workstationClusterId;

    public Output<String> workstationClusterId() {
        return this.workstationClusterId;
    }

    @Import(name="workstationConfigId", required=true)
    private Output<String> workstationConfigId;

    public Output<String> workstationConfigId() {
        return this.workstationConfigId;
    }

    @Import(name="workstationId", required=true)
    private Output<String> workstationId;

    public Output<String> workstationId() {
        return this.workstationId;
    }

    private WorkstationIamPolicyArgs() {}

    private WorkstationIamPolicyArgs(WorkstationIamPolicyArgs $) {
        this.location = $.location;
        this.policyData = $.policyData;
        this.project = $.project;
        this.workstationClusterId = $.workstationClusterId;
        this.workstationConfigId = $.workstationConfigId;
        this.workstationId = $.workstationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkstationIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkstationIamPolicyArgs $;

        public Builder() {
            $ = new WorkstationIamPolicyArgs();
        }

        public Builder(WorkstationIamPolicyArgs defaults) {
            $ = new WorkstationIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The location where the workstation parent resources reside.
         * Used to find the parent resource to bind the IAM policy to. If not specified,
         * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
         * location is specified, it is taken from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location where the workstation parent resources reside.
         * Used to find the parent resource to bind the IAM policy to. If not specified,
         * the value will be parsed from the identifier of the parent resource. If no location is provided in the parent identifier and no
         * location is specified, it is taken from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
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
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder workstationClusterId(Output<String> workstationClusterId) {
            $.workstationClusterId = workstationClusterId;
            return this;
        }

        public Builder workstationClusterId(String workstationClusterId) {
            return workstationClusterId(Output.of(workstationClusterId));
        }

        public Builder workstationConfigId(Output<String> workstationConfigId) {
            $.workstationConfigId = workstationConfigId;
            return this;
        }

        public Builder workstationConfigId(String workstationConfigId) {
            return workstationConfigId(Output.of(workstationConfigId));
        }

        public Builder workstationId(Output<String> workstationId) {
            $.workstationId = workstationId;
            return this;
        }

        public Builder workstationId(String workstationId) {
            return workstationId(Output.of(workstationId));
        }

        public WorkstationIamPolicyArgs build() {
            if ($.policyData == null) {
                throw new MissingRequiredPropertyException("WorkstationIamPolicyArgs", "policyData");
            }
            if ($.workstationClusterId == null) {
                throw new MissingRequiredPropertyException("WorkstationIamPolicyArgs", "workstationClusterId");
            }
            if ($.workstationConfigId == null) {
                throw new MissingRequiredPropertyException("WorkstationIamPolicyArgs", "workstationConfigId");
            }
            if ($.workstationId == null) {
                throw new MissingRequiredPropertyException("WorkstationIamPolicyArgs", "workstationId");
            }
            return $;
        }
    }

}
