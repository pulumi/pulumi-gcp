// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V2FolderMuteConfigState extends com.pulumi.resources.ResourceArgs {

    public static final V2FolderMuteConfigState Empty = new V2FolderMuteConfigState();

    /**
     * The time at which the mute config was created. This field is set by
     * the server and will be ignored if provided on config creation.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time at which the mute config was created. This field is set by
     * the server and will be ignored if provided on config creation.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

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
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return An expression that defines the filter to apply across create/update
     * events of findings. While creating a filter string, be mindful of
     * the scope in which the mute configuration is being created. E.g.,
     * If a filter contains project = X but is created under the
     * project = Y scope, it might not match any findings.
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The folder whose Cloud Security Command Center the Mute
     * Config lives in.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The folder whose Cloud Security Command Center the Mute
     * Config lives in.
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * location Id is provided by folder. If not provided, Use global as default.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return location Id is provided by folder. If not provided, Use global as default.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Email address of the user who last edited the mute config. This
     * field is set by the server and will be ignored if provided on
     * config creation or update.
     * 
     */
    @Import(name="mostRecentEditor")
    private @Nullable Output<String> mostRecentEditor;

    /**
     * @return Email address of the user who last edited the mute config. This
     * field is set by the server and will be ignored if provided on
     * config creation or update.
     * 
     */
    public Optional<Output<String>> mostRecentEditor() {
        return Optional.ofNullable(this.mostRecentEditor);
    }

    /**
     * Unique identifier provided by the client within the parent scope.
     * 
     */
    @Import(name="muteConfigId")
    private @Nullable Output<String> muteConfigId;

    /**
     * @return Unique identifier provided by the client within the parent scope.
     * 
     */
    public Optional<Output<String>> muteConfigId() {
        return Optional.ofNullable(this.muteConfigId);
    }

    /**
     * Name of the mute config. Its format is
     * organizations/{organization}/locations/global/muteConfigs/{configId},
     * folders/{folder}/locations/global/muteConfigs/{configId},
     * or projects/{project}/locations/global/muteConfigs/{configId}
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the mute config. Its format is
     * organizations/{organization}/locations/global/muteConfigs/{configId},
     * folders/{folder}/locations/global/muteConfigs/{configId},
     * or projects/{project}/locations/global/muteConfigs/{configId}
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type of the mute config.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the mute config.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Output only. The most recent time at which the mute config was
     * updated. This field is set by the server and will be ignored if
     * provided on config creation or update.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Output only. The most recent time at which the mute config was
     * updated. This field is set by the server and will be ignored if
     * provided on config creation or update.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private V2FolderMuteConfigState() {}

    private V2FolderMuteConfigState(V2FolderMuteConfigState $) {
        this.createTime = $.createTime;
        this.description = $.description;
        this.filter = $.filter;
        this.folder = $.folder;
        this.location = $.location;
        this.mostRecentEditor = $.mostRecentEditor;
        this.muteConfigId = $.muteConfigId;
        this.name = $.name;
        this.type = $.type;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2FolderMuteConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2FolderMuteConfigState $;

        public Builder() {
            $ = new V2FolderMuteConfigState();
        }

        public Builder(V2FolderMuteConfigState defaults) {
            $ = new V2FolderMuteConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The time at which the mute config was created. This field is set by
         * the server and will be ignored if provided on config creation.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time at which the mute config was created. This field is set by
         * the server and will be ignored if provided on config creation.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
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
        public Builder filter(@Nullable Output<String> filter) {
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
         * @param folder The folder whose Cloud Security Command Center the Mute
         * Config lives in.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The folder whose Cloud Security Command Center the Mute
         * Config lives in.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param location location Id is provided by folder. If not provided, Use global as default.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location location Id is provided by folder. If not provided, Use global as default.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param mostRecentEditor Email address of the user who last edited the mute config. This
         * field is set by the server and will be ignored if provided on
         * config creation or update.
         * 
         * @return builder
         * 
         */
        public Builder mostRecentEditor(@Nullable Output<String> mostRecentEditor) {
            $.mostRecentEditor = mostRecentEditor;
            return this;
        }

        /**
         * @param mostRecentEditor Email address of the user who last edited the mute config. This
         * field is set by the server and will be ignored if provided on
         * config creation or update.
         * 
         * @return builder
         * 
         */
        public Builder mostRecentEditor(String mostRecentEditor) {
            return mostRecentEditor(Output.of(mostRecentEditor));
        }

        /**
         * @param muteConfigId Unique identifier provided by the client within the parent scope.
         * 
         * @return builder
         * 
         */
        public Builder muteConfigId(@Nullable Output<String> muteConfigId) {
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
         * @param name Name of the mute config. Its format is
         * organizations/{organization}/locations/global/muteConfigs/{configId},
         * folders/{folder}/locations/global/muteConfigs/{configId},
         * or projects/{project}/locations/global/muteConfigs/{configId}
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the mute config. Its format is
         * organizations/{organization}/locations/global/muteConfigs/{configId},
         * folders/{folder}/locations/global/muteConfigs/{configId},
         * or projects/{project}/locations/global/muteConfigs/{configId}
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The type of the mute config.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
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

        /**
         * @param updateTime Output only. The most recent time at which the mute config was
         * updated. This field is set by the server and will be ignored if
         * provided on config creation or update.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Output only. The most recent time at which the mute config was
         * updated. This field is set by the server and will be ignored if
         * provided on config creation or update.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public V2FolderMuteConfigState build() {
            return $;
        }
    }

}
