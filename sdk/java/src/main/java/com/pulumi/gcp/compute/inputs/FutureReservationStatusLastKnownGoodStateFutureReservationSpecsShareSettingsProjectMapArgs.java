// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMapArgs extends com.pulumi.resources.ResourceArgs {

    public static final FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMapArgs Empty = new FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMapArgs();

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     * The project ID, should be same as the key of this project config in the parent map.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The project ID, should be same as the key of this project config in the parent map.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMapArgs() {}

    private FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMapArgs(FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMapArgs $) {
        this.project = $.project;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMapArgs $;

        public Builder() {
            $ = new FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMapArgs();
        }

        public Builder(FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMapArgs defaults) {
            $ = new FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMapArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
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
         * @param projectId The project ID, should be same as the key of this project config in the parent map.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The project ID, should be same as the key of this project config in the parent map.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMapArgs build() {
            if ($.project == null) {
                throw new MissingRequiredPropertyException("FutureReservationStatusLastKnownGoodStateFutureReservationSpecsShareSettingsProjectMapArgs", "project");
            }
            return $;
        }
    }

}
