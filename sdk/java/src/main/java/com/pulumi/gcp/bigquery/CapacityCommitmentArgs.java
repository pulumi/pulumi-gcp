// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CapacityCommitmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final CapacityCommitmentArgs Empty = new CapacityCommitmentArgs();

    /**
     * The optional capacity commitment ID. Capacity commitment name will be generated automatically if this field is
     * empty. This field must only contain lower case alphanumeric characters or dashes. The first and last character
     * cannot be a dash. Max length is 64 characters. NOTE: this ID won&#39;t be kept if the capacity commitment is split
     * or merged.
     * 
     */
    @Import(name="capacityCommitmentId")
    private @Nullable Output<String> capacityCommitmentId;

    /**
     * @return The optional capacity commitment ID. Capacity commitment name will be generated automatically if this field is
     * empty. This field must only contain lower case alphanumeric characters or dashes. The first and last character
     * cannot be a dash. Max length is 64 characters. NOTE: this ID won&#39;t be kept if the capacity commitment is split
     * or merged.
     * 
     */
    public Optional<Output<String>> capacityCommitmentId() {
        return Optional.ofNullable(this.capacityCommitmentId);
    }

    /**
     * The edition type. Valid values are STANDARD, ENTERPRISE, ENTERPRISE_PLUS
     * 
     */
    @Import(name="edition")
    private @Nullable Output<String> edition;

    /**
     * @return The edition type. Valid values are STANDARD, ENTERPRISE, ENTERPRISE_PLUS
     * 
     */
    public Optional<Output<String>> edition() {
        return Optional.ofNullable(this.edition);
    }

    /**
     * If true, fail the request if another project in the organization has a capacity commitment.
     * 
     */
    @Import(name="enforceSingleAdminProjectPerOrg")
    private @Nullable Output<String> enforceSingleAdminProjectPerOrg;

    /**
     * @return If true, fail the request if another project in the organization has a capacity commitment.
     * 
     */
    public Optional<Output<String>> enforceSingleAdminProjectPerOrg() {
        return Optional.ofNullable(this.enforceSingleAdminProjectPerOrg);
    }

    /**
     * The geographic location where the transfer config should reside.
     * Examples: US, EU, asia-northeast1. The default value is US.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geographic location where the transfer config should reside.
     * Examples: US, EU, asia-northeast1. The default value is US.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Capacity commitment plan. Valid values are at https://cloud.google.com/bigquery/docs/reference/reservations/rpc/google.cloud.bigquery.reservation.v1#commitmentplan
     * 
     */
    @Import(name="plan", required=true)
    private Output<String> plan;

    /**
     * @return Capacity commitment plan. Valid values are at https://cloud.google.com/bigquery/docs/reference/reservations/rpc/google.cloud.bigquery.reservation.v1#commitmentplan
     * 
     */
    public Output<String> plan() {
        return this.plan;
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
     * The plan this capacity commitment is converted to after commitmentEndTime passes. Once the plan is changed, committed period is extended according to commitment plan. Only applicable for some commitment plans.
     * 
     */
    @Import(name="renewalPlan")
    private @Nullable Output<String> renewalPlan;

    /**
     * @return The plan this capacity commitment is converted to after commitmentEndTime passes. Once the plan is changed, committed period is extended according to commitment plan. Only applicable for some commitment plans.
     * 
     */
    public Optional<Output<String>> renewalPlan() {
        return Optional.ofNullable(this.renewalPlan);
    }

    /**
     * Number of slots in this commitment.
     * 
     */
    @Import(name="slotCount", required=true)
    private Output<Integer> slotCount;

    /**
     * @return Number of slots in this commitment.
     * 
     */
    public Output<Integer> slotCount() {
        return this.slotCount;
    }

    private CapacityCommitmentArgs() {}

    private CapacityCommitmentArgs(CapacityCommitmentArgs $) {
        this.capacityCommitmentId = $.capacityCommitmentId;
        this.edition = $.edition;
        this.enforceSingleAdminProjectPerOrg = $.enforceSingleAdminProjectPerOrg;
        this.location = $.location;
        this.plan = $.plan;
        this.project = $.project;
        this.renewalPlan = $.renewalPlan;
        this.slotCount = $.slotCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CapacityCommitmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CapacityCommitmentArgs $;

        public Builder() {
            $ = new CapacityCommitmentArgs();
        }

        public Builder(CapacityCommitmentArgs defaults) {
            $ = new CapacityCommitmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacityCommitmentId The optional capacity commitment ID. Capacity commitment name will be generated automatically if this field is
         * empty. This field must only contain lower case alphanumeric characters or dashes. The first and last character
         * cannot be a dash. Max length is 64 characters. NOTE: this ID won&#39;t be kept if the capacity commitment is split
         * or merged.
         * 
         * @return builder
         * 
         */
        public Builder capacityCommitmentId(@Nullable Output<String> capacityCommitmentId) {
            $.capacityCommitmentId = capacityCommitmentId;
            return this;
        }

        /**
         * @param capacityCommitmentId The optional capacity commitment ID. Capacity commitment name will be generated automatically if this field is
         * empty. This field must only contain lower case alphanumeric characters or dashes. The first and last character
         * cannot be a dash. Max length is 64 characters. NOTE: this ID won&#39;t be kept if the capacity commitment is split
         * or merged.
         * 
         * @return builder
         * 
         */
        public Builder capacityCommitmentId(String capacityCommitmentId) {
            return capacityCommitmentId(Output.of(capacityCommitmentId));
        }

        /**
         * @param edition The edition type. Valid values are STANDARD, ENTERPRISE, ENTERPRISE_PLUS
         * 
         * @return builder
         * 
         */
        public Builder edition(@Nullable Output<String> edition) {
            $.edition = edition;
            return this;
        }

        /**
         * @param edition The edition type. Valid values are STANDARD, ENTERPRISE, ENTERPRISE_PLUS
         * 
         * @return builder
         * 
         */
        public Builder edition(String edition) {
            return edition(Output.of(edition));
        }

        /**
         * @param enforceSingleAdminProjectPerOrg If true, fail the request if another project in the organization has a capacity commitment.
         * 
         * @return builder
         * 
         */
        public Builder enforceSingleAdminProjectPerOrg(@Nullable Output<String> enforceSingleAdminProjectPerOrg) {
            $.enforceSingleAdminProjectPerOrg = enforceSingleAdminProjectPerOrg;
            return this;
        }

        /**
         * @param enforceSingleAdminProjectPerOrg If true, fail the request if another project in the organization has a capacity commitment.
         * 
         * @return builder
         * 
         */
        public Builder enforceSingleAdminProjectPerOrg(String enforceSingleAdminProjectPerOrg) {
            return enforceSingleAdminProjectPerOrg(Output.of(enforceSingleAdminProjectPerOrg));
        }

        /**
         * @param location The geographic location where the transfer config should reside.
         * Examples: US, EU, asia-northeast1. The default value is US.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geographic location where the transfer config should reside.
         * Examples: US, EU, asia-northeast1. The default value is US.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param plan Capacity commitment plan. Valid values are at https://cloud.google.com/bigquery/docs/reference/reservations/rpc/google.cloud.bigquery.reservation.v1#commitmentplan
         * 
         * @return builder
         * 
         */
        public Builder plan(Output<String> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan Capacity commitment plan. Valid values are at https://cloud.google.com/bigquery/docs/reference/reservations/rpc/google.cloud.bigquery.reservation.v1#commitmentplan
         * 
         * @return builder
         * 
         */
        public Builder plan(String plan) {
            return plan(Output.of(plan));
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
         * @param renewalPlan The plan this capacity commitment is converted to after commitmentEndTime passes. Once the plan is changed, committed period is extended according to commitment plan. Only applicable for some commitment plans.
         * 
         * @return builder
         * 
         */
        public Builder renewalPlan(@Nullable Output<String> renewalPlan) {
            $.renewalPlan = renewalPlan;
            return this;
        }

        /**
         * @param renewalPlan The plan this capacity commitment is converted to after commitmentEndTime passes. Once the plan is changed, committed period is extended according to commitment plan. Only applicable for some commitment plans.
         * 
         * @return builder
         * 
         */
        public Builder renewalPlan(String renewalPlan) {
            return renewalPlan(Output.of(renewalPlan));
        }

        /**
         * @param slotCount Number of slots in this commitment.
         * 
         * @return builder
         * 
         */
        public Builder slotCount(Output<Integer> slotCount) {
            $.slotCount = slotCount;
            return this;
        }

        /**
         * @param slotCount Number of slots in this commitment.
         * 
         * @return builder
         * 
         */
        public Builder slotCount(Integer slotCount) {
            return slotCount(Output.of(slotCount));
        }

        public CapacityCommitmentArgs build() {
            if ($.plan == null) {
                throw new MissingRequiredPropertyException("CapacityCommitmentArgs", "plan");
            }
            if ($.slotCount == null) {
                throw new MissingRequiredPropertyException("CapacityCommitmentArgs", "slotCount");
            }
            return $;
        }
    }

}
