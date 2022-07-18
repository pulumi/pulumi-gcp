// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.appengine.inputs.EngineSplitTrafficSplitArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EngineSplitTrafficState extends com.pulumi.resources.ResourceArgs {

    public static final EngineSplitTrafficState Empty = new EngineSplitTrafficState();

    /**
     * If set to true traffic will be migrated to this version.
     * 
     */
    @Import(name="migrateTraffic")
    private @Nullable Output<Boolean> migrateTraffic;

    /**
     * @return If set to true traffic will be migrated to this version.
     * 
     */
    public Optional<Output<Boolean>> migrateTraffic() {
        return Optional.ofNullable(this.migrateTraffic);
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
     * The name of the service these settings apply to.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return The name of the service these settings apply to.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * Mapping that defines fractional HTTP traffic diversion to different versions within the service.
     * Structure is documented below.
     * 
     */
    @Import(name="split")
    private @Nullable Output<EngineSplitTrafficSplitArgs> split;

    /**
     * @return Mapping that defines fractional HTTP traffic diversion to different versions within the service.
     * Structure is documented below.
     * 
     */
    public Optional<Output<EngineSplitTrafficSplitArgs>> split() {
        return Optional.ofNullable(this.split);
    }

    private EngineSplitTrafficState() {}

    private EngineSplitTrafficState(EngineSplitTrafficState $) {
        this.migrateTraffic = $.migrateTraffic;
        this.project = $.project;
        this.service = $.service;
        this.split = $.split;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EngineSplitTrafficState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EngineSplitTrafficState $;

        public Builder() {
            $ = new EngineSplitTrafficState();
        }

        public Builder(EngineSplitTrafficState defaults) {
            $ = new EngineSplitTrafficState(Objects.requireNonNull(defaults));
        }

        /**
         * @param migrateTraffic If set to true traffic will be migrated to this version.
         * 
         * @return builder
         * 
         */
        public Builder migrateTraffic(@Nullable Output<Boolean> migrateTraffic) {
            $.migrateTraffic = migrateTraffic;
            return this;
        }

        /**
         * @param migrateTraffic If set to true traffic will be migrated to this version.
         * 
         * @return builder
         * 
         */
        public Builder migrateTraffic(Boolean migrateTraffic) {
            return migrateTraffic(Output.of(migrateTraffic));
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
         * @param service The name of the service these settings apply to.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The name of the service these settings apply to.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param split Mapping that defines fractional HTTP traffic diversion to different versions within the service.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder split(@Nullable Output<EngineSplitTrafficSplitArgs> split) {
            $.split = split;
            return this;
        }

        /**
         * @param split Mapping that defines fractional HTTP traffic diversion to different versions within the service.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder split(EngineSplitTrafficSplitArgs split) {
            return split(Output.of(split));
        }

        public EngineSplitTrafficState build() {
            return $;
        }
    }

}