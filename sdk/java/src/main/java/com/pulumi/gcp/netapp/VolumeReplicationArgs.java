// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.netapp;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.netapp.inputs.VolumeReplicationDestinationVolumeParametersArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeReplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeReplicationArgs Empty = new VolumeReplicationArgs();

    @Import(name="deleteDestinationVolume")
    private @Nullable Output<Boolean> deleteDestinationVolume;

    public Optional<Output<Boolean>> deleteDestinationVolume() {
        return Optional.ofNullable(this.deleteDestinationVolume);
    }

    /**
     * An description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An description of this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Destination volume parameters.
     * Structure is documented below.
     * 
     */
    @Import(name="destinationVolumeParameters")
    private @Nullable Output<VolumeReplicationDestinationVolumeParametersArgs> destinationVolumeParameters;

    /**
     * @return Destination volume parameters.
     * Structure is documented below.
     * 
     */
    public Optional<Output<VolumeReplicationDestinationVolumeParametersArgs>> destinationVolumeParameters() {
        return Optional.ofNullable(this.destinationVolumeParameters);
    }

    /**
     * Only replications with mirror_state=MIRRORED can be stopped. A replication in mirror_state=TRANSFERRING
     * currently receives an update and stopping the update might be undesirable. Set this parameter to true
     * to stop anyway. All data transferred to the destination will be discarded and content of destination
     * volume will remain at the state of the last successful update. Default is false.
     * 
     */
    @Import(name="forceStopping")
    private @Nullable Output<Boolean> forceStopping;

    /**
     * @return Only replications with mirror_state=MIRRORED can be stopped. A replication in mirror_state=TRANSFERRING
     * currently receives an update and stopping the update might be undesirable. Set this parameter to true
     * to stop anyway. All data transferred to the destination will be discarded and content of destination
     * volume will remain at the state of the last successful update. Default is false.
     * 
     */
    public Optional<Output<Boolean>> forceStopping() {
        return Optional.ofNullable(this.forceStopping);
    }

    /**
     * Labels as key value pairs. Example: `{ &#34;owner&#34;: &#34;Bob&#34;, &#34;department&#34;: &#34;finance&#34;, &#34;purpose&#34;: &#34;testing&#34; }`
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels as key value pairs. Example: `{ &#34;owner&#34;: &#34;Bob&#34;, &#34;department&#34;: &#34;finance&#34;, &#34;purpose&#34;: &#34;testing&#34; }`
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of region for this resource. The resource needs to be created in the region of the destination volume.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return Name of region for this resource. The resource needs to be created in the region of the destination volume.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The name of the replication. Needs to be unique per location.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the replication. Needs to be unique per location.
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
     * Set to false to stop/break the mirror. Stopping the mirror makes the destination volume read-write
     * and act independently from the source volume.
     * Set to true to enable/resume the mirror. WARNING: Resuming a mirror overwrites any changes
     * done to the destination volume with the content of the source volume.
     * 
     */
    @Import(name="replicationEnabled")
    private @Nullable Output<Boolean> replicationEnabled;

    /**
     * @return Set to false to stop/break the mirror. Stopping the mirror makes the destination volume read-write
     * and act independently from the source volume.
     * Set to true to enable/resume the mirror. WARNING: Resuming a mirror overwrites any changes
     * done to the destination volume with the content of the source volume.
     * 
     */
    public Optional<Output<Boolean>> replicationEnabled() {
        return Optional.ofNullable(this.replicationEnabled);
    }

    /**
     * Specifies the replication interval.
     * Possible values are: `EVERY_10_MINUTES`, `HOURLY`, `DAILY`.
     * 
     */
    @Import(name="replicationSchedule", required=true)
    private Output<String> replicationSchedule;

    /**
     * @return Specifies the replication interval.
     * Possible values are: `EVERY_10_MINUTES`, `HOURLY`, `DAILY`.
     * 
     */
    public Output<String> replicationSchedule() {
        return this.replicationSchedule;
    }

    /**
     * The name of the existing source volume.
     * 
     */
    @Import(name="volumeName", required=true)
    private Output<String> volumeName;

    /**
     * @return The name of the existing source volume.
     * 
     */
    public Output<String> volumeName() {
        return this.volumeName;
    }

    @Import(name="waitForMirror")
    private @Nullable Output<Boolean> waitForMirror;

    public Optional<Output<Boolean>> waitForMirror() {
        return Optional.ofNullable(this.waitForMirror);
    }

    private VolumeReplicationArgs() {}

    private VolumeReplicationArgs(VolumeReplicationArgs $) {
        this.deleteDestinationVolume = $.deleteDestinationVolume;
        this.description = $.description;
        this.destinationVolumeParameters = $.destinationVolumeParameters;
        this.forceStopping = $.forceStopping;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.replicationEnabled = $.replicationEnabled;
        this.replicationSchedule = $.replicationSchedule;
        this.volumeName = $.volumeName;
        this.waitForMirror = $.waitForMirror;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeReplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeReplicationArgs $;

        public Builder() {
            $ = new VolumeReplicationArgs();
        }

        public Builder(VolumeReplicationArgs defaults) {
            $ = new VolumeReplicationArgs(Objects.requireNonNull(defaults));
        }

        public Builder deleteDestinationVolume(@Nullable Output<Boolean> deleteDestinationVolume) {
            $.deleteDestinationVolume = deleteDestinationVolume;
            return this;
        }

        public Builder deleteDestinationVolume(Boolean deleteDestinationVolume) {
            return deleteDestinationVolume(Output.of(deleteDestinationVolume));
        }

        /**
         * @param description An description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destinationVolumeParameters Destination volume parameters.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder destinationVolumeParameters(@Nullable Output<VolumeReplicationDestinationVolumeParametersArgs> destinationVolumeParameters) {
            $.destinationVolumeParameters = destinationVolumeParameters;
            return this;
        }

        /**
         * @param destinationVolumeParameters Destination volume parameters.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder destinationVolumeParameters(VolumeReplicationDestinationVolumeParametersArgs destinationVolumeParameters) {
            return destinationVolumeParameters(Output.of(destinationVolumeParameters));
        }

        /**
         * @param forceStopping Only replications with mirror_state=MIRRORED can be stopped. A replication in mirror_state=TRANSFERRING
         * currently receives an update and stopping the update might be undesirable. Set this parameter to true
         * to stop anyway. All data transferred to the destination will be discarded and content of destination
         * volume will remain at the state of the last successful update. Default is false.
         * 
         * @return builder
         * 
         */
        public Builder forceStopping(@Nullable Output<Boolean> forceStopping) {
            $.forceStopping = forceStopping;
            return this;
        }

        /**
         * @param forceStopping Only replications with mirror_state=MIRRORED can be stopped. A replication in mirror_state=TRANSFERRING
         * currently receives an update and stopping the update might be undesirable. Set this parameter to true
         * to stop anyway. All data transferred to the destination will be discarded and content of destination
         * volume will remain at the state of the last successful update. Default is false.
         * 
         * @return builder
         * 
         */
        public Builder forceStopping(Boolean forceStopping) {
            return forceStopping(Output.of(forceStopping));
        }

        /**
         * @param labels Labels as key value pairs. Example: `{ &#34;owner&#34;: &#34;Bob&#34;, &#34;department&#34;: &#34;finance&#34;, &#34;purpose&#34;: &#34;testing&#34; }`
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels as key value pairs. Example: `{ &#34;owner&#34;: &#34;Bob&#34;, &#34;department&#34;: &#34;finance&#34;, &#34;purpose&#34;: &#34;testing&#34; }`
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location Name of region for this resource. The resource needs to be created in the region of the destination volume.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Name of region for this resource. The resource needs to be created in the region of the destination volume.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the replication. Needs to be unique per location.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the replication. Needs to be unique per location.
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
         * @param replicationEnabled Set to false to stop/break the mirror. Stopping the mirror makes the destination volume read-write
         * and act independently from the source volume.
         * Set to true to enable/resume the mirror. WARNING: Resuming a mirror overwrites any changes
         * done to the destination volume with the content of the source volume.
         * 
         * @return builder
         * 
         */
        public Builder replicationEnabled(@Nullable Output<Boolean> replicationEnabled) {
            $.replicationEnabled = replicationEnabled;
            return this;
        }

        /**
         * @param replicationEnabled Set to false to stop/break the mirror. Stopping the mirror makes the destination volume read-write
         * and act independently from the source volume.
         * Set to true to enable/resume the mirror. WARNING: Resuming a mirror overwrites any changes
         * done to the destination volume with the content of the source volume.
         * 
         * @return builder
         * 
         */
        public Builder replicationEnabled(Boolean replicationEnabled) {
            return replicationEnabled(Output.of(replicationEnabled));
        }

        /**
         * @param replicationSchedule Specifies the replication interval.
         * Possible values are: `EVERY_10_MINUTES`, `HOURLY`, `DAILY`.
         * 
         * @return builder
         * 
         */
        public Builder replicationSchedule(Output<String> replicationSchedule) {
            $.replicationSchedule = replicationSchedule;
            return this;
        }

        /**
         * @param replicationSchedule Specifies the replication interval.
         * Possible values are: `EVERY_10_MINUTES`, `HOURLY`, `DAILY`.
         * 
         * @return builder
         * 
         */
        public Builder replicationSchedule(String replicationSchedule) {
            return replicationSchedule(Output.of(replicationSchedule));
        }

        /**
         * @param volumeName The name of the existing source volume.
         * 
         * @return builder
         * 
         */
        public Builder volumeName(Output<String> volumeName) {
            $.volumeName = volumeName;
            return this;
        }

        /**
         * @param volumeName The name of the existing source volume.
         * 
         * @return builder
         * 
         */
        public Builder volumeName(String volumeName) {
            return volumeName(Output.of(volumeName));
        }

        public Builder waitForMirror(@Nullable Output<Boolean> waitForMirror) {
            $.waitForMirror = waitForMirror;
            return this;
        }

        public Builder waitForMirror(Boolean waitForMirror) {
            return waitForMirror(Output.of(waitForMirror));
        }

        public VolumeReplicationArgs build() {
            if ($.location == null) {
                throw new MissingRequiredPropertyException("VolumeReplicationArgs", "location");
            }
            if ($.replicationSchedule == null) {
                throw new MissingRequiredPropertyException("VolumeReplicationArgs", "replicationSchedule");
            }
            if ($.volumeName == null) {
                throw new MissingRequiredPropertyException("VolumeReplicationArgs", "volumeName");
            }
            return $;
        }
    }

}
