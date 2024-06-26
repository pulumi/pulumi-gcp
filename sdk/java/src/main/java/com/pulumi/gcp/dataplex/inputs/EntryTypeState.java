// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataplex.inputs.EntryTypeRequiredAspectArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EntryTypeState extends com.pulumi.resources.ResourceArgs {

    public static final EntryTypeState Empty = new EntryTypeState();

    /**
     * The time when the EntryType was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time when the EntryType was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Description of the EntryType.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the EntryType.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User friendly display name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return User friendly display name.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Import(name="effectiveLabels")
    private @Nullable Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Optional<Output<Map<String,String>>> effectiveLabels() {
        return Optional.ofNullable(this.effectiveLabels);
    }

    /**
     * The entry type id of the entry type.
     * 
     */
    @Import(name="entryTypeId")
    private @Nullable Output<String> entryTypeId;

    /**
     * @return The entry type id of the entry type.
     * 
     */
    public Optional<Output<String>> entryTypeId() {
        return Optional.ofNullable(this.entryTypeId);
    }

    /**
     * User-defined labels for the EntryType.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-defined labels for the EntryType.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location where entry type will be created in.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location where entry type will be created in.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The relative resource name of the EntryType, of the form: projects/{project_number}/locations/{location_id}/entryTypes/{entry_type_id}
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The relative resource name of the EntryType, of the form: projects/{project_number}/locations/{location_id}/entryTypes/{entry_type_id}
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The platform that Entries of this type belongs to.
     * 
     */
    @Import(name="platform")
    private @Nullable Output<String> platform;

    /**
     * @return The platform that Entries of this type belongs to.
     * 
     */
    public Optional<Output<String>> platform() {
        return Optional.ofNullable(this.platform);
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
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Import(name="pulumiLabels")
    private @Nullable Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Optional<Output<Map<String,String>>> pulumiLabels() {
        return Optional.ofNullable(this.pulumiLabels);
    }

    /**
     * AspectInfo for the entry type.
     * Structure is documented below.
     * 
     */
    @Import(name="requiredAspects")
    private @Nullable Output<List<EntryTypeRequiredAspectArgs>> requiredAspects;

    /**
     * @return AspectInfo for the entry type.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<EntryTypeRequiredAspectArgs>>> requiredAspects() {
        return Optional.ofNullable(this.requiredAspects);
    }

    /**
     * The system that Entries of this type belongs to.
     * 
     */
    @Import(name="system")
    private @Nullable Output<String> system;

    /**
     * @return The system that Entries of this type belongs to.
     * 
     */
    public Optional<Output<String>> system() {
        return Optional.ofNullable(this.system);
    }

    /**
     * Indicates the class this Entry Type belongs to, for example, TABLE, DATABASE, MODEL.
     * 
     */
    @Import(name="typeAliases")
    private @Nullable Output<List<String>> typeAliases;

    /**
     * @return Indicates the class this Entry Type belongs to, for example, TABLE, DATABASE, MODEL.
     * 
     */
    public Optional<Output<List<String>>> typeAliases() {
        return Optional.ofNullable(this.typeAliases);
    }

    /**
     * System generated globally unique ID for the EntryType. This ID will be different if the EntryType is deleted and re-created with the same name.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return System generated globally unique ID for the EntryType. This ID will be different if the EntryType is deleted and re-created with the same name.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    /**
     * The time when the EntryType was last updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The time when the EntryType was last updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private EntryTypeState() {}

    private EntryTypeState(EntryTypeState $) {
        this.createTime = $.createTime;
        this.description = $.description;
        this.displayName = $.displayName;
        this.effectiveLabels = $.effectiveLabels;
        this.entryTypeId = $.entryTypeId;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.platform = $.platform;
        this.project = $.project;
        this.pulumiLabels = $.pulumiLabels;
        this.requiredAspects = $.requiredAspects;
        this.system = $.system;
        this.typeAliases = $.typeAliases;
        this.uid = $.uid;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntryTypeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntryTypeState $;

        public Builder() {
            $ = new EntryTypeState();
        }

        public Builder(EntryTypeState defaults) {
            $ = new EntryTypeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The time when the EntryType was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time when the EntryType was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description Description of the EntryType.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the EntryType.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName User friendly display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName User friendly display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(@Nullable Output<Map<String,String>> effectiveLabels) {
            $.effectiveLabels = effectiveLabels;
            return this;
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            return effectiveLabels(Output.of(effectiveLabels));
        }

        /**
         * @param entryTypeId The entry type id of the entry type.
         * 
         * @return builder
         * 
         */
        public Builder entryTypeId(@Nullable Output<String> entryTypeId) {
            $.entryTypeId = entryTypeId;
            return this;
        }

        /**
         * @param entryTypeId The entry type id of the entry type.
         * 
         * @return builder
         * 
         */
        public Builder entryTypeId(String entryTypeId) {
            return entryTypeId(Output.of(entryTypeId));
        }

        /**
         * @param labels User-defined labels for the EntryType.
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
         * @param labels User-defined labels for the EntryType.
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
         * @param location The location where entry type will be created in.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location where entry type will be created in.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The relative resource name of the EntryType, of the form: projects/{project_number}/locations/{location_id}/entryTypes/{entry_type_id}
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The relative resource name of the EntryType, of the form: projects/{project_number}/locations/{location_id}/entryTypes/{entry_type_id}
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param platform The platform that Entries of this type belongs to.
         * 
         * @return builder
         * 
         */
        public Builder platform(@Nullable Output<String> platform) {
            $.platform = platform;
            return this;
        }

        /**
         * @param platform The platform that Entries of this type belongs to.
         * 
         * @return builder
         * 
         */
        public Builder platform(String platform) {
            return platform(Output.of(platform));
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
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(@Nullable Output<Map<String,String>> pulumiLabels) {
            $.pulumiLabels = pulumiLabels;
            return this;
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            return pulumiLabels(Output.of(pulumiLabels));
        }

        /**
         * @param requiredAspects AspectInfo for the entry type.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requiredAspects(@Nullable Output<List<EntryTypeRequiredAspectArgs>> requiredAspects) {
            $.requiredAspects = requiredAspects;
            return this;
        }

        /**
         * @param requiredAspects AspectInfo for the entry type.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requiredAspects(List<EntryTypeRequiredAspectArgs> requiredAspects) {
            return requiredAspects(Output.of(requiredAspects));
        }

        /**
         * @param requiredAspects AspectInfo for the entry type.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requiredAspects(EntryTypeRequiredAspectArgs... requiredAspects) {
            return requiredAspects(List.of(requiredAspects));
        }

        /**
         * @param system The system that Entries of this type belongs to.
         * 
         * @return builder
         * 
         */
        public Builder system(@Nullable Output<String> system) {
            $.system = system;
            return this;
        }

        /**
         * @param system The system that Entries of this type belongs to.
         * 
         * @return builder
         * 
         */
        public Builder system(String system) {
            return system(Output.of(system));
        }

        /**
         * @param typeAliases Indicates the class this Entry Type belongs to, for example, TABLE, DATABASE, MODEL.
         * 
         * @return builder
         * 
         */
        public Builder typeAliases(@Nullable Output<List<String>> typeAliases) {
            $.typeAliases = typeAliases;
            return this;
        }

        /**
         * @param typeAliases Indicates the class this Entry Type belongs to, for example, TABLE, DATABASE, MODEL.
         * 
         * @return builder
         * 
         */
        public Builder typeAliases(List<String> typeAliases) {
            return typeAliases(Output.of(typeAliases));
        }

        /**
         * @param typeAliases Indicates the class this Entry Type belongs to, for example, TABLE, DATABASE, MODEL.
         * 
         * @return builder
         * 
         */
        public Builder typeAliases(String... typeAliases) {
            return typeAliases(List.of(typeAliases));
        }

        /**
         * @param uid System generated globally unique ID for the EntryType. This ID will be different if the EntryType is deleted and re-created with the same name.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid System generated globally unique ID for the EntryType. This ID will be different if the EntryType is deleted and re-created with the same name.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        /**
         * @param updateTime The time when the EntryType was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The time when the EntryType was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public EntryTypeState build() {
            return $;
        }
    }

}
