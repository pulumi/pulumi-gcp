// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.migrationcenter.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreferenceSetState extends com.pulumi.resources.ResourceArgs {

    public static final PreferenceSetState Empty = new PreferenceSetState();

    /**
     * Output only. The timestamp when the preference set was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Output only. The timestamp when the preference set was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * A description of the preference set.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the preference set.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User-friendly display name. Maximum length is 63 characters.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return User-friendly display name. Maximum length is 63 characters.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Part of `parent`. See documentation of `projectsId`.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Part of `parent`. See documentation of `projectsId`.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Output only. Name of the preference set.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Output only. Name of the preference set.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Required. User specified ID for the preference set. It will become the last component of the preference set name. The ID must be unique within the project, must conform with RFC-1034, is restricted to lower-cased letters, and has a maximum length of 63 characters. The ID must match the regular expression `a-z?`.
     * 
     */
    @Import(name="preferenceSetId")
    private @Nullable Output<String> preferenceSetId;

    /**
     * @return Required. User specified ID for the preference set. It will become the last component of the preference set name. The ID must be unique within the project, must conform with RFC-1034, is restricted to lower-cased letters, and has a maximum length of 63 characters. The ID must match the regular expression `a-z?`.
     * 
     */
    public Optional<Output<String>> preferenceSetId() {
        return Optional.ofNullable(this.preferenceSetId);
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
     * Output only. The timestamp when the preference set was last updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Output only. The timestamp when the preference set was last updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    /**
     * VirtualMachinePreferences enables you to create sets of assumptions, for example, a geographical location and pricing track, for your migrated virtual machines. The set of preferences influence recommendations for migrating virtual machine assets.
     * Structure is documented below.
     * 
     */
    @Import(name="virtualMachinePreferences")
    private @Nullable Output<PreferenceSetVirtualMachinePreferencesArgs> virtualMachinePreferences;

    /**
     * @return VirtualMachinePreferences enables you to create sets of assumptions, for example, a geographical location and pricing track, for your migrated virtual machines. The set of preferences influence recommendations for migrating virtual machine assets.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreferenceSetVirtualMachinePreferencesArgs>> virtualMachinePreferences() {
        return Optional.ofNullable(this.virtualMachinePreferences);
    }

    private PreferenceSetState() {}

    private PreferenceSetState(PreferenceSetState $) {
        this.createTime = $.createTime;
        this.description = $.description;
        this.displayName = $.displayName;
        this.location = $.location;
        this.name = $.name;
        this.preferenceSetId = $.preferenceSetId;
        this.project = $.project;
        this.updateTime = $.updateTime;
        this.virtualMachinePreferences = $.virtualMachinePreferences;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreferenceSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreferenceSetState $;

        public Builder() {
            $ = new PreferenceSetState();
        }

        public Builder(PreferenceSetState defaults) {
            $ = new PreferenceSetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Output only. The timestamp when the preference set was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Output only. The timestamp when the preference set was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description A description of the preference set.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the preference set.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName User-friendly display name. Maximum length is 63 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName User-friendly display name. Maximum length is 63 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param location Part of `parent`. See documentation of `projectsId`.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Part of `parent`. See documentation of `projectsId`.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Output only. Name of the preference set.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Output only. Name of the preference set.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param preferenceSetId Required. User specified ID for the preference set. It will become the last component of the preference set name. The ID must be unique within the project, must conform with RFC-1034, is restricted to lower-cased letters, and has a maximum length of 63 characters. The ID must match the regular expression `a-z?`.
         * 
         * @return builder
         * 
         */
        public Builder preferenceSetId(@Nullable Output<String> preferenceSetId) {
            $.preferenceSetId = preferenceSetId;
            return this;
        }

        /**
         * @param preferenceSetId Required. User specified ID for the preference set. It will become the last component of the preference set name. The ID must be unique within the project, must conform with RFC-1034, is restricted to lower-cased letters, and has a maximum length of 63 characters. The ID must match the regular expression `a-z?`.
         * 
         * @return builder
         * 
         */
        public Builder preferenceSetId(String preferenceSetId) {
            return preferenceSetId(Output.of(preferenceSetId));
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
         * @param updateTime Output only. The timestamp when the preference set was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Output only. The timestamp when the preference set was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        /**
         * @param virtualMachinePreferences VirtualMachinePreferences enables you to create sets of assumptions, for example, a geographical location and pricing track, for your migrated virtual machines. The set of preferences influence recommendations for migrating virtual machine assets.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachinePreferences(@Nullable Output<PreferenceSetVirtualMachinePreferencesArgs> virtualMachinePreferences) {
            $.virtualMachinePreferences = virtualMachinePreferences;
            return this;
        }

        /**
         * @param virtualMachinePreferences VirtualMachinePreferences enables you to create sets of assumptions, for example, a geographical location and pricing track, for your migrated virtual machines. The set of preferences influence recommendations for migrating virtual machine assets.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachinePreferences(PreferenceSetVirtualMachinePreferencesArgs virtualMachinePreferences) {
            return virtualMachinePreferences(Output.of(virtualMachinePreferences));
        }

        public PreferenceSetState build() {
            return $;
        }
    }

}
