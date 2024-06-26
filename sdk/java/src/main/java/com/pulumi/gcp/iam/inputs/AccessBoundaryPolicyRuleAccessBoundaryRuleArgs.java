// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.iam.inputs.AccessBoundaryPolicyRuleAccessBoundaryRuleAvailabilityConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessBoundaryPolicyRuleAccessBoundaryRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessBoundaryPolicyRuleAccessBoundaryRuleArgs Empty = new AccessBoundaryPolicyRuleAccessBoundaryRuleArgs();

    /**
     * The availability condition further constrains the access allowed by the access boundary rule.
     * Structure is documented below.
     * 
     */
    @Import(name="availabilityCondition")
    private @Nullable Output<AccessBoundaryPolicyRuleAccessBoundaryRuleAvailabilityConditionArgs> availabilityCondition;

    /**
     * @return The availability condition further constrains the access allowed by the access boundary rule.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AccessBoundaryPolicyRuleAccessBoundaryRuleAvailabilityConditionArgs>> availabilityCondition() {
        return Optional.ofNullable(this.availabilityCondition);
    }

    /**
     * A list of permissions that may be allowed for use on the specified resource.
     * 
     */
    @Import(name="availablePermissions")
    private @Nullable Output<List<String>> availablePermissions;

    /**
     * @return A list of permissions that may be allowed for use on the specified resource.
     * 
     */
    public Optional<Output<List<String>>> availablePermissions() {
        return Optional.ofNullable(this.availablePermissions);
    }

    /**
     * The full resource name of a Google Cloud resource entity.
     * 
     */
    @Import(name="availableResource")
    private @Nullable Output<String> availableResource;

    /**
     * @return The full resource name of a Google Cloud resource entity.
     * 
     */
    public Optional<Output<String>> availableResource() {
        return Optional.ofNullable(this.availableResource);
    }

    private AccessBoundaryPolicyRuleAccessBoundaryRuleArgs() {}

    private AccessBoundaryPolicyRuleAccessBoundaryRuleArgs(AccessBoundaryPolicyRuleAccessBoundaryRuleArgs $) {
        this.availabilityCondition = $.availabilityCondition;
        this.availablePermissions = $.availablePermissions;
        this.availableResource = $.availableResource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessBoundaryPolicyRuleAccessBoundaryRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessBoundaryPolicyRuleAccessBoundaryRuleArgs $;

        public Builder() {
            $ = new AccessBoundaryPolicyRuleAccessBoundaryRuleArgs();
        }

        public Builder(AccessBoundaryPolicyRuleAccessBoundaryRuleArgs defaults) {
            $ = new AccessBoundaryPolicyRuleAccessBoundaryRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityCondition The availability condition further constrains the access allowed by the access boundary rule.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder availabilityCondition(@Nullable Output<AccessBoundaryPolicyRuleAccessBoundaryRuleAvailabilityConditionArgs> availabilityCondition) {
            $.availabilityCondition = availabilityCondition;
            return this;
        }

        /**
         * @param availabilityCondition The availability condition further constrains the access allowed by the access boundary rule.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder availabilityCondition(AccessBoundaryPolicyRuleAccessBoundaryRuleAvailabilityConditionArgs availabilityCondition) {
            return availabilityCondition(Output.of(availabilityCondition));
        }

        /**
         * @param availablePermissions A list of permissions that may be allowed for use on the specified resource.
         * 
         * @return builder
         * 
         */
        public Builder availablePermissions(@Nullable Output<List<String>> availablePermissions) {
            $.availablePermissions = availablePermissions;
            return this;
        }

        /**
         * @param availablePermissions A list of permissions that may be allowed for use on the specified resource.
         * 
         * @return builder
         * 
         */
        public Builder availablePermissions(List<String> availablePermissions) {
            return availablePermissions(Output.of(availablePermissions));
        }

        /**
         * @param availablePermissions A list of permissions that may be allowed for use on the specified resource.
         * 
         * @return builder
         * 
         */
        public Builder availablePermissions(String... availablePermissions) {
            return availablePermissions(List.of(availablePermissions));
        }

        /**
         * @param availableResource The full resource name of a Google Cloud resource entity.
         * 
         * @return builder
         * 
         */
        public Builder availableResource(@Nullable Output<String> availableResource) {
            $.availableResource = availableResource;
            return this;
        }

        /**
         * @param availableResource The full resource name of a Google Cloud resource entity.
         * 
         * @return builder
         * 
         */
        public Builder availableResource(String availableResource) {
            return availableResource(Output.of(availableResource));
        }

        public AccessBoundaryPolicyRuleAccessBoundaryRuleArgs build() {
            return $;
        }
    }

}
