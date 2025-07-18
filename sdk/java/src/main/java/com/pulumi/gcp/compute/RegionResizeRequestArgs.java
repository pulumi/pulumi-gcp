// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.compute.inputs.RegionResizeRequestRequestedRunDurationArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionResizeRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionResizeRequestArgs Empty = new RegionResizeRequestArgs();

    /**
     * An optional description of this resize-request.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resize-request.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The reference of the regional instance group manager this ResizeRequest is a part of.
     * 
     */
    @Import(name="instanceGroupManager", required=true)
    private Output<String> instanceGroupManager;

    /**
     * @return The reference of the regional instance group manager this ResizeRequest is a part of.
     * 
     */
    public Output<String> instanceGroupManager() {
        return this.instanceGroupManager;
    }

    /**
     * The name of this resize request. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of this resize request. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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
     * The reference of the compute region scoping this request. If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The reference of the compute region scoping this request. If it is not provided, the provider region is used.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Requested run duration for instances that will be created by this request. At the end of the run duration instances will be deleted.
     * Structure is documented below.
     * 
     */
    @Import(name="requestedRunDuration")
    private @Nullable Output<RegionResizeRequestRequestedRunDurationArgs> requestedRunDuration;

    /**
     * @return Requested run duration for instances that will be created by this request. At the end of the run duration instances will be deleted.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionResizeRequestRequestedRunDurationArgs>> requestedRunDuration() {
        return Optional.ofNullable(this.requestedRunDuration);
    }

    /**
     * The number of instances to be created by this resize request. The group&#39;s target size will be increased by this number.
     * 
     */
    @Import(name="resizeBy", required=true)
    private Output<Integer> resizeBy;

    /**
     * @return The number of instances to be created by this resize request. The group&#39;s target size will be increased by this number.
     * 
     */
    public Output<Integer> resizeBy() {
        return this.resizeBy;
    }

    private RegionResizeRequestArgs() {}

    private RegionResizeRequestArgs(RegionResizeRequestArgs $) {
        this.description = $.description;
        this.instanceGroupManager = $.instanceGroupManager;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
        this.requestedRunDuration = $.requestedRunDuration;
        this.resizeBy = $.resizeBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionResizeRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionResizeRequestArgs $;

        public Builder() {
            $ = new RegionResizeRequestArgs();
        }

        public Builder(RegionResizeRequestArgs defaults) {
            $ = new RegionResizeRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resize-request.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resize-request.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param instanceGroupManager The reference of the regional instance group manager this ResizeRequest is a part of.
         * 
         * @return builder
         * 
         */
        public Builder instanceGroupManager(Output<String> instanceGroupManager) {
            $.instanceGroupManager = instanceGroupManager;
            return this;
        }

        /**
         * @param instanceGroupManager The reference of the regional instance group manager this ResizeRequest is a part of.
         * 
         * @return builder
         * 
         */
        public Builder instanceGroupManager(String instanceGroupManager) {
            return instanceGroupManager(Output.of(instanceGroupManager));
        }

        /**
         * @param name The name of this resize request. The name must be 1-63 characters long, and comply with RFC1035.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this resize request. The name must be 1-63 characters long, and comply with RFC1035.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param region The reference of the compute region scoping this request. If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The reference of the compute region scoping this request. If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param requestedRunDuration Requested run duration for instances that will be created by this request. At the end of the run duration instances will be deleted.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requestedRunDuration(@Nullable Output<RegionResizeRequestRequestedRunDurationArgs> requestedRunDuration) {
            $.requestedRunDuration = requestedRunDuration;
            return this;
        }

        /**
         * @param requestedRunDuration Requested run duration for instances that will be created by this request. At the end of the run duration instances will be deleted.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requestedRunDuration(RegionResizeRequestRequestedRunDurationArgs requestedRunDuration) {
            return requestedRunDuration(Output.of(requestedRunDuration));
        }

        /**
         * @param resizeBy The number of instances to be created by this resize request. The group&#39;s target size will be increased by this number.
         * 
         * @return builder
         * 
         */
        public Builder resizeBy(Output<Integer> resizeBy) {
            $.resizeBy = resizeBy;
            return this;
        }

        /**
         * @param resizeBy The number of instances to be created by this resize request. The group&#39;s target size will be increased by this number.
         * 
         * @return builder
         * 
         */
        public Builder resizeBy(Integer resizeBy) {
            return resizeBy(Output.of(resizeBy));
        }

        public RegionResizeRequestArgs build() {
            if ($.instanceGroupManager == null) {
                throw new MissingRequiredPropertyException("RegionResizeRequestArgs", "instanceGroupManager");
            }
            if ($.resizeBy == null) {
                throw new MissingRequiredPropertyException("RegionResizeRequestArgs", "resizeBy");
            }
            return $;
        }
    }

}
