// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InterconnectGroupPhysicalStructureMetroFacilityZoneArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterconnectGroupPhysicalStructureMetroFacilityZoneArgs Empty = new InterconnectGroupPhysicalStructureMetroFacilityZoneArgs();

    /**
     * Interconnects in the InterconnectGroup. Keys are arbitrary user-specified
     * strings. Users are encouraged, but not required, to use their preferred
     * format for resource links as keys.
     * Note that there are add-members and remove-members methods in gcloud.
     * The size of this map is limited by an &#34;Interconnects per group&#34; quota.
     * Structure is documented below.
     * 
     */
    @Import(name="interconnects")
    private @Nullable Output<List<String>> interconnects;

    /**
     * @return Interconnects in the InterconnectGroup. Keys are arbitrary user-specified
     * strings. Users are encouraged, but not required, to use their preferred
     * format for resource links as keys.
     * Note that there are add-members and remove-members methods in gcloud.
     * The size of this map is limited by an &#34;Interconnects per group&#34; quota.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<String>>> interconnects() {
        return Optional.ofNullable(this.interconnects);
    }

    /**
     * (Output)
     * The name of the zone, either &#34;zone1&#34; or &#34;zone2&#34;.
     * This is the second component of the location of Interconnects in
     * this facility.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return (Output)
     * The name of the zone, either &#34;zone1&#34; or &#34;zone2&#34;.
     * This is the second component of the location of Interconnects in
     * this facility.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private InterconnectGroupPhysicalStructureMetroFacilityZoneArgs() {}

    private InterconnectGroupPhysicalStructureMetroFacilityZoneArgs(InterconnectGroupPhysicalStructureMetroFacilityZoneArgs $) {
        this.interconnects = $.interconnects;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterconnectGroupPhysicalStructureMetroFacilityZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterconnectGroupPhysicalStructureMetroFacilityZoneArgs $;

        public Builder() {
            $ = new InterconnectGroupPhysicalStructureMetroFacilityZoneArgs();
        }

        public Builder(InterconnectGroupPhysicalStructureMetroFacilityZoneArgs defaults) {
            $ = new InterconnectGroupPhysicalStructureMetroFacilityZoneArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param interconnects Interconnects in the InterconnectGroup. Keys are arbitrary user-specified
         * strings. Users are encouraged, but not required, to use their preferred
         * format for resource links as keys.
         * Note that there are add-members and remove-members methods in gcloud.
         * The size of this map is limited by an &#34;Interconnects per group&#34; quota.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder interconnects(@Nullable Output<List<String>> interconnects) {
            $.interconnects = interconnects;
            return this;
        }

        /**
         * @param interconnects Interconnects in the InterconnectGroup. Keys are arbitrary user-specified
         * strings. Users are encouraged, but not required, to use their preferred
         * format for resource links as keys.
         * Note that there are add-members and remove-members methods in gcloud.
         * The size of this map is limited by an &#34;Interconnects per group&#34; quota.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder interconnects(List<String> interconnects) {
            return interconnects(Output.of(interconnects));
        }

        /**
         * @param interconnects Interconnects in the InterconnectGroup. Keys are arbitrary user-specified
         * strings. Users are encouraged, but not required, to use their preferred
         * format for resource links as keys.
         * Note that there are add-members and remove-members methods in gcloud.
         * The size of this map is limited by an &#34;Interconnects per group&#34; quota.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder interconnects(String... interconnects) {
            return interconnects(List.of(interconnects));
        }

        /**
         * @param zone (Output)
         * The name of the zone, either &#34;zone1&#34; or &#34;zone2&#34;.
         * This is the second component of the location of Interconnects in
         * this facility.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone (Output)
         * The name of the zone, either &#34;zone1&#34; or &#34;zone2&#34;.
         * This is the second component of the location of Interconnects in
         * this facility.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public InterconnectGroupPhysicalStructureMetroFacilityZoneArgs build() {
            return $;
        }
    }

}
