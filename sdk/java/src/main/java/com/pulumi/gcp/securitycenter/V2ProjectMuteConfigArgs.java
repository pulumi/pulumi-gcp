// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2ProjectMuteConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final V2ProjectMuteConfigArgs Empty = new V2ProjectMuteConfigArgs();

    /**
     * A description of the mute config.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the mute config.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * An expression that defines the filter to apply across create/update
     * events of findings. While creating a filter string, be mindful of
     * the scope in which the mute configuration is being created. E.g.,
     * If a filter contains project = X but is created under the
     * project = Y scope, it might not match any findings.
     * 
     */
    @Import(name="filter", required=true)
    private Output<String> filter;

    /**
     * @return An expression that defines the filter to apply across create/update
     * events of findings. While creating a filter string, be mindful of
     * the scope in which the mute configuration is being created. E.g.,
     * If a filter contains project = X but is created under the
     * project = Y scope, it might not match any findings.
     * 
     */
    public Output<String> filter() {
        return this.filter;
    }

    /**
     * location Id is provided by project. If not provided, Use global as default.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return location Id is provided by project. If not provided, Use global as default.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Unique identifier provided by the client within the parent scope.
     * 
     */
    @Import(name="muteConfigId", required=true)
    private Output<String> muteConfigId;

    /**
     * @return Unique identifier provided by the client within the parent scope.
     * 
     */
    public Output<String> muteConfigId() {
        return this.muteConfigId;
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
     * The type of the mute config.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the mute config.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private V2ProjectMuteConfigArgs() {}

    private V2ProjectMuteConfigArgs(V2ProjectMuteConfigArgs $) {
        this.description = $.description;
        this.filter = $.filter;
        this.location = $.location;
        this.muteConfigId = $.muteConfigId;
        this.project = $.project;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2ProjectMuteConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2ProjectMuteConfigArgs $;

        public Builder() {
            $ = new V2ProjectMuteConfigArgs();
        }

        public Builder(V2ProjectMuteConfigArgs defaults) {
            $ = new V2ProjectMuteConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the mute config.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the mute config.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param filter An expression that defines the filter to apply across create/update
         * events of findings. While creating a filter string, be mindful of
         * the scope in which the mute configuration is being created. E.g.,
         * If a filter contains project = X but is created under the
         * project = Y scope, it might not match any findings.
         * 
         * @return builder
         * 
         */
        public Builder filter(Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter An expression that defines the filter to apply across create/update
         * events of findings. While creating a filter string, be mindful of
         * the scope in which the mute configuration is being created. E.g.,
         * If a filter contains project = X but is created under the
         * project = Y scope, it might not match any findings.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param location location Id is provided by project. If not provided, Use global as default.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location location Id is provided by project. If not provided, Use global as default.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param muteConfigId Unique identifier provided by the client within the parent scope.
         * 
         * @return builder
         * 
         */
        public Builder muteConfigId(Output<String> muteConfigId) {
            $.muteConfigId = muteConfigId;
            return this;
        }

        /**
         * @param muteConfigId Unique identifier provided by the client within the parent scope.
         * 
         * @return builder
         * 
         */
        public Builder muteConfigId(String muteConfigId) {
            return muteConfigId(Output.of(muteConfigId));
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
         * @param type The type of the mute config.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the mute config.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public V2ProjectMuteConfigArgs build() {
            if ($.filter == null) {
                throw new MissingRequiredPropertyException("V2ProjectMuteConfigArgs", "filter");
            }
            if ($.muteConfigId == null) {
                throw new MissingRequiredPropertyException("V2ProjectMuteConfigArgs", "muteConfigId");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("V2ProjectMuteConfigArgs", "type");
            }
            return $;
        }
    }

}
