// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.ReservationShareSettingsProjectMapArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReservationShareSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReservationShareSettingsArgs Empty = new ReservationShareSettingsArgs();

    /**
     * A map of project number and project config. This is only valid when shareType&#39;s value is SPECIFIC_PROJECTS.
     * Structure is documented below.
     * 
     */
    @Import(name="projectMaps")
    private @Nullable Output<List<ReservationShareSettingsProjectMapArgs>> projectMaps;

    /**
     * @return A map of project number and project config. This is only valid when shareType&#39;s value is SPECIFIC_PROJECTS.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ReservationShareSettingsProjectMapArgs>>> projectMaps() {
        return Optional.ofNullable(this.projectMaps);
    }

    /**
     * List of project IDs with which the reservation is shared.
     * 
     */
    @Import(name="projects")
    private @Nullable Output<List<String>> projects;

    /**
     * @return List of project IDs with which the reservation is shared.
     * 
     */
    public Optional<Output<List<String>>> projects() {
        return Optional.ofNullable(this.projects);
    }

    /**
     * Type of sharing for this shared-reservation
     * Possible values are: `LOCAL`, `SPECIFIC_PROJECTS`.
     * 
     */
    @Import(name="shareType")
    private @Nullable Output<String> shareType;

    /**
     * @return Type of sharing for this shared-reservation
     * Possible values are: `LOCAL`, `SPECIFIC_PROJECTS`.
     * 
     */
    public Optional<Output<String>> shareType() {
        return Optional.ofNullable(this.shareType);
    }

    private ReservationShareSettingsArgs() {}

    private ReservationShareSettingsArgs(ReservationShareSettingsArgs $) {
        this.projectMaps = $.projectMaps;
        this.projects = $.projects;
        this.shareType = $.shareType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservationShareSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservationShareSettingsArgs $;

        public Builder() {
            $ = new ReservationShareSettingsArgs();
        }

        public Builder(ReservationShareSettingsArgs defaults) {
            $ = new ReservationShareSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectMaps A map of project number and project config. This is only valid when shareType&#39;s value is SPECIFIC_PROJECTS.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder projectMaps(@Nullable Output<List<ReservationShareSettingsProjectMapArgs>> projectMaps) {
            $.projectMaps = projectMaps;
            return this;
        }

        /**
         * @param projectMaps A map of project number and project config. This is only valid when shareType&#39;s value is SPECIFIC_PROJECTS.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder projectMaps(List<ReservationShareSettingsProjectMapArgs> projectMaps) {
            return projectMaps(Output.of(projectMaps));
        }

        /**
         * @param projectMaps A map of project number and project config. This is only valid when shareType&#39;s value is SPECIFIC_PROJECTS.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder projectMaps(ReservationShareSettingsProjectMapArgs... projectMaps) {
            return projectMaps(List.of(projectMaps));
        }

        /**
         * @param projects List of project IDs with which the reservation is shared.
         * 
         * @return builder
         * 
         */
        public Builder projects(@Nullable Output<List<String>> projects) {
            $.projects = projects;
            return this;
        }

        /**
         * @param projects List of project IDs with which the reservation is shared.
         * 
         * @return builder
         * 
         */
        public Builder projects(List<String> projects) {
            return projects(Output.of(projects));
        }

        /**
         * @param projects List of project IDs with which the reservation is shared.
         * 
         * @return builder
         * 
         */
        public Builder projects(String... projects) {
            return projects(List.of(projects));
        }

        /**
         * @param shareType Type of sharing for this shared-reservation
         * Possible values are: `LOCAL`, `SPECIFIC_PROJECTS`.
         * 
         * @return builder
         * 
         */
        public Builder shareType(@Nullable Output<String> shareType) {
            $.shareType = shareType;
            return this;
        }

        /**
         * @param shareType Type of sharing for this shared-reservation
         * Possible values are: `LOCAL`, `SPECIFIC_PROJECTS`.
         * 
         * @return builder
         * 
         */
        public Builder shareType(String shareType) {
            return shareType(Output.of(shareType));
        }

        public ReservationShareSettingsArgs build() {
            return $;
        }
    }

}
