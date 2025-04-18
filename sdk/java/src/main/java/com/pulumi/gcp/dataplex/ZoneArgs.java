// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecArgs;
import com.pulumi.gcp.dataplex.inputs.ZoneResourceSpecArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZoneArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZoneArgs Empty = new ZoneArgs();

    /**
     * Optional. Description of the zone.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. Description of the zone.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Required. Specification of the discovery feature applied to data in this zone.
     * 
     */
    @Import(name="discoverySpec", required=true)
    private Output<ZoneDiscoverySpecArgs> discoverySpec;

    /**
     * @return Required. Specification of the discovery feature applied to data in this zone.
     * 
     */
    public Output<ZoneDiscoverySpecArgs> discoverySpec() {
        return this.discoverySpec;
    }

    /**
     * Optional. User friendly display name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Optional. User friendly display name.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Optional. User defined labels for the zone. **Note**: This field is non-authoritative, and will only manage the labels
     * present in your configuration. Please refer to the field `effective_labels` for all of the labels present on the
     * resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. User defined labels for the zone. **Note**: This field is non-authoritative, and will only manage the labels
     * present in your configuration. Please refer to the field `effective_labels` for all of the labels present on the
     * resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The lake for the resource
     * 
     */
    @Import(name="lake", required=true)
    private Output<String> lake;

    /**
     * @return The lake for the resource
     * 
     */
    public Output<String> lake() {
        return this.lake;
    }

    /**
     * The location for the resource
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The name of the zone.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the zone.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Required. Immutable. Specification of the resources that are referenced by the assets within this zone.
     * 
     */
    @Import(name="resourceSpec", required=true)
    private Output<ZoneResourceSpecArgs> resourceSpec;

    /**
     * @return Required. Immutable. Specification of the resources that are referenced by the assets within this zone.
     * 
     */
    public Output<ZoneResourceSpecArgs> resourceSpec() {
        return this.resourceSpec;
    }

    /**
     * Required. Immutable. The type of the zone. Possible values: TYPE_UNSPECIFIED, RAW, CURATED
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Required. Immutable. The type of the zone. Possible values: TYPE_UNSPECIFIED, RAW, CURATED
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ZoneArgs() {}

    private ZoneArgs(ZoneArgs $) {
        this.description = $.description;
        this.discoverySpec = $.discoverySpec;
        this.displayName = $.displayName;
        this.labels = $.labels;
        this.lake = $.lake;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.resourceSpec = $.resourceSpec;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZoneArgs $;

        public Builder() {
            $ = new ZoneArgs();
        }

        public Builder(ZoneArgs defaults) {
            $ = new ZoneArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. Description of the zone.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. Description of the zone.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param discoverySpec Required. Specification of the discovery feature applied to data in this zone.
         * 
         * @return builder
         * 
         */
        public Builder discoverySpec(Output<ZoneDiscoverySpecArgs> discoverySpec) {
            $.discoverySpec = discoverySpec;
            return this;
        }

        /**
         * @param discoverySpec Required. Specification of the discovery feature applied to data in this zone.
         * 
         * @return builder
         * 
         */
        public Builder discoverySpec(ZoneDiscoverySpecArgs discoverySpec) {
            return discoverySpec(Output.of(discoverySpec));
        }

        /**
         * @param displayName Optional. User friendly display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Optional. User friendly display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param labels Optional. User defined labels for the zone. **Note**: This field is non-authoritative, and will only manage the labels
         * present in your configuration. Please refer to the field `effective_labels` for all of the labels present on the
         * resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. User defined labels for the zone. **Note**: This field is non-authoritative, and will only manage the labels
         * present in your configuration. Please refer to the field `effective_labels` for all of the labels present on the
         * resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param lake The lake for the resource
         * 
         * @return builder
         * 
         */
        public Builder lake(Output<String> lake) {
            $.lake = lake;
            return this;
        }

        /**
         * @param lake The lake for the resource
         * 
         * @return builder
         * 
         */
        public Builder lake(String lake) {
            return lake(Output.of(lake));
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location for the resource
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the zone.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the zone.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The project for the resource
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project for the resource
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param resourceSpec Required. Immutable. Specification of the resources that are referenced by the assets within this zone.
         * 
         * @return builder
         * 
         */
        public Builder resourceSpec(Output<ZoneResourceSpecArgs> resourceSpec) {
            $.resourceSpec = resourceSpec;
            return this;
        }

        /**
         * @param resourceSpec Required. Immutable. Specification of the resources that are referenced by the assets within this zone.
         * 
         * @return builder
         * 
         */
        public Builder resourceSpec(ZoneResourceSpecArgs resourceSpec) {
            return resourceSpec(Output.of(resourceSpec));
        }

        /**
         * @param type Required. Immutable. The type of the zone. Possible values: TYPE_UNSPECIFIED, RAW, CURATED
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Required. Immutable. The type of the zone. Possible values: TYPE_UNSPECIFIED, RAW, CURATED
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ZoneArgs build() {
            if ($.discoverySpec == null) {
                throw new MissingRequiredPropertyException("ZoneArgs", "discoverySpec");
            }
            if ($.lake == null) {
                throw new MissingRequiredPropertyException("ZoneArgs", "lake");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("ZoneArgs", "location");
            }
            if ($.resourceSpec == null) {
                throw new MissingRequiredPropertyException("ZoneArgs", "resourceSpec");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("ZoneArgs", "type");
            }
            return $;
        }
    }

}
