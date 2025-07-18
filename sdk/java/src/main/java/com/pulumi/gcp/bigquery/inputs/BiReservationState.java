// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigquery.inputs.BiReservationPreferredTableArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BiReservationState extends com.pulumi.resources.ResourceArgs {

    public static final BiReservationState Empty = new BiReservationState();

    /**
     * LOCATION_DESCRIPTION
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return LOCATION_DESCRIPTION
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name of the singleton BI reservation. Reservation names have the form `projects/{projectId}/locations/{locationId}/biReservation`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource name of the singleton BI reservation. Reservation names have the form `projects/{projectId}/locations/{locationId}/biReservation`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Preferred tables to use BI capacity for.
     * Structure is documented below.
     * 
     */
    @Import(name="preferredTables")
    private @Nullable Output<List<BiReservationPreferredTableArgs>> preferredTables;

    /**
     * @return Preferred tables to use BI capacity for.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<BiReservationPreferredTableArgs>>> preferredTables() {
        return Optional.ofNullable(this.preferredTables);
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
     * Size of a reservation, in bytes.
     * 
     */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @return Size of a reservation, in bytes.
     * 
     */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The last update timestamp of a reservation.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The last update timestamp of a reservation.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private BiReservationState() {}

    private BiReservationState(BiReservationState $) {
        this.location = $.location;
        this.name = $.name;
        this.preferredTables = $.preferredTables;
        this.project = $.project;
        this.size = $.size;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BiReservationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BiReservationState $;

        public Builder() {
            $ = new BiReservationState();
        }

        public Builder(BiReservationState defaults) {
            $ = new BiReservationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param location LOCATION_DESCRIPTION
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location LOCATION_DESCRIPTION
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The resource name of the singleton BI reservation. Reservation names have the form `projects/{projectId}/locations/{locationId}/biReservation`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource name of the singleton BI reservation. Reservation names have the form `projects/{projectId}/locations/{locationId}/biReservation`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param preferredTables Preferred tables to use BI capacity for.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder preferredTables(@Nullable Output<List<BiReservationPreferredTableArgs>> preferredTables) {
            $.preferredTables = preferredTables;
            return this;
        }

        /**
         * @param preferredTables Preferred tables to use BI capacity for.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder preferredTables(List<BiReservationPreferredTableArgs> preferredTables) {
            return preferredTables(Output.of(preferredTables));
        }

        /**
         * @param preferredTables Preferred tables to use BI capacity for.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder preferredTables(BiReservationPreferredTableArgs... preferredTables) {
            return preferredTables(List.of(preferredTables));
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
         * @param size Size of a reservation, in bytes.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size Size of a reservation, in bytes.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param updateTime The last update timestamp of a reservation.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The last update timestamp of a reservation.
         * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public BiReservationState build() {
            return $;
        }
    }

}
