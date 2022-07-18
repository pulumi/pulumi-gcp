// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UptimeCheckConfigResourceGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final UptimeCheckConfigResourceGroupArgs Empty = new UptimeCheckConfigResourceGroupArgs();

    /**
     * The group of resources being monitored. Should be the `name` of a group
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The group of resources being monitored. Should be the `name` of a group
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The resource type of the group members.
     * Possible values are `RESOURCE_TYPE_UNSPECIFIED`, `INSTANCE`, and `AWS_ELB_LOAD_BALANCER`.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return The resource type of the group members.
     * Possible values are `RESOURCE_TYPE_UNSPECIFIED`, `INSTANCE`, and `AWS_ELB_LOAD_BALANCER`.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    private UptimeCheckConfigResourceGroupArgs() {}

    private UptimeCheckConfigResourceGroupArgs(UptimeCheckConfigResourceGroupArgs $) {
        this.groupId = $.groupId;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UptimeCheckConfigResourceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UptimeCheckConfigResourceGroupArgs $;

        public Builder() {
            $ = new UptimeCheckConfigResourceGroupArgs();
        }

        public Builder(UptimeCheckConfigResourceGroupArgs defaults) {
            $ = new UptimeCheckConfigResourceGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupId The group of resources being monitored. Should be the `name` of a group
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The group of resources being monitored. Should be the `name` of a group
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param resourceType The resource type of the group members.
         * Possible values are `RESOURCE_TYPE_UNSPECIFIED`, `INSTANCE`, and `AWS_ELB_LOAD_BALANCER`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The resource type of the group members.
         * Possible values are `RESOURCE_TYPE_UNSPECIFIED`, `INSTANCE`, and `AWS_ELB_LOAD_BALANCER`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public UptimeCheckConfigResourceGroupArgs build() {
            return $;
        }
    }

}