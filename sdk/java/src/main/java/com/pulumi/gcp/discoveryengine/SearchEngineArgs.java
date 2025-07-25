// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.discoveryengine;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.discoveryengine.inputs.SearchEngineCommonConfigArgs;
import com.pulumi.gcp.discoveryengine.inputs.SearchEngineSearchEngineConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SearchEngineArgs extends com.pulumi.resources.ResourceArgs {

    public static final SearchEngineArgs Empty = new SearchEngineArgs();

    /**
     * The collection ID.
     * 
     */
    @Import(name="collectionId", required=true)
    private Output<String> collectionId;

    /**
     * @return The collection ID.
     * 
     */
    public Output<String> collectionId() {
        return this.collectionId;
    }

    /**
     * Common config spec that specifies the metadata of the engine.
     * Structure is documented below.
     * 
     */
    @Import(name="commonConfig")
    private @Nullable Output<SearchEngineCommonConfigArgs> commonConfig;

    /**
     * @return Common config spec that specifies the metadata of the engine.
     * Structure is documented below.
     * 
     */
    public Optional<Output<SearchEngineCommonConfigArgs>> commonConfig() {
        return Optional.ofNullable(this.commonConfig);
    }

    /**
     * The data stores associated with this engine. For SOLUTION_TYPE_SEARCH type of engines, they can only associate with at most one data store.
     * 
     */
    @Import(name="dataStoreIds", required=true)
    private Output<List<String>> dataStoreIds;

    /**
     * @return The data stores associated with this engine. For SOLUTION_TYPE_SEARCH type of engines, they can only associate with at most one data store.
     * 
     */
    public Output<List<String>> dataStoreIds() {
        return this.dataStoreIds;
    }

    /**
     * Required. The display name of the engine. Should be human readable. UTF-8 encoded string with limit of 1024 characters.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return Required. The display name of the engine. Should be human readable. UTF-8 encoded string with limit of 1024 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Unique ID to use for Search Engine App.
     * 
     */
    @Import(name="engineId", required=true)
    private Output<String> engineId;

    /**
     * @return Unique ID to use for Search Engine App.
     * 
     */
    public Output<String> engineId() {
        return this.engineId;
    }

    /**
     * The industry vertical that the engine registers. The restriction of the Engine industry vertical is based on DataStore: If unspecified, default to GENERIC. Vertical on Engine has to match vertical of the DataStore liniked to the engine.
     * Default value is `GENERIC`.
     * Possible values are: `GENERIC`, `MEDIA`, `HEALTHCARE_FHIR`.
     * 
     */
    @Import(name="industryVertical")
    private @Nullable Output<String> industryVertical;

    /**
     * @return The industry vertical that the engine registers. The restriction of the Engine industry vertical is based on DataStore: If unspecified, default to GENERIC. Vertical on Engine has to match vertical of the DataStore liniked to the engine.
     * Default value is `GENERIC`.
     * Possible values are: `GENERIC`, `MEDIA`, `HEALTHCARE_FHIR`.
     * 
     */
    public Optional<Output<String>> industryVertical() {
        return Optional.ofNullable(this.industryVertical);
    }

    /**
     * Location.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return Location.
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * Configurations for a Search Engine.
     * Structure is documented below.
     * 
     */
    @Import(name="searchEngineConfig", required=true)
    private Output<SearchEngineSearchEngineConfigArgs> searchEngineConfig;

    /**
     * @return Configurations for a Search Engine.
     * Structure is documented below.
     * 
     */
    public Output<SearchEngineSearchEngineConfigArgs> searchEngineConfig() {
        return this.searchEngineConfig;
    }

    private SearchEngineArgs() {}

    private SearchEngineArgs(SearchEngineArgs $) {
        this.collectionId = $.collectionId;
        this.commonConfig = $.commonConfig;
        this.dataStoreIds = $.dataStoreIds;
        this.displayName = $.displayName;
        this.engineId = $.engineId;
        this.industryVertical = $.industryVertical;
        this.location = $.location;
        this.project = $.project;
        this.searchEngineConfig = $.searchEngineConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SearchEngineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SearchEngineArgs $;

        public Builder() {
            $ = new SearchEngineArgs();
        }

        public Builder(SearchEngineArgs defaults) {
            $ = new SearchEngineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param collectionId The collection ID.
         * 
         * @return builder
         * 
         */
        public Builder collectionId(Output<String> collectionId) {
            $.collectionId = collectionId;
            return this;
        }

        /**
         * @param collectionId The collection ID.
         * 
         * @return builder
         * 
         */
        public Builder collectionId(String collectionId) {
            return collectionId(Output.of(collectionId));
        }

        /**
         * @param commonConfig Common config spec that specifies the metadata of the engine.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder commonConfig(@Nullable Output<SearchEngineCommonConfigArgs> commonConfig) {
            $.commonConfig = commonConfig;
            return this;
        }

        /**
         * @param commonConfig Common config spec that specifies the metadata of the engine.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder commonConfig(SearchEngineCommonConfigArgs commonConfig) {
            return commonConfig(Output.of(commonConfig));
        }

        /**
         * @param dataStoreIds The data stores associated with this engine. For SOLUTION_TYPE_SEARCH type of engines, they can only associate with at most one data store.
         * 
         * @return builder
         * 
         */
        public Builder dataStoreIds(Output<List<String>> dataStoreIds) {
            $.dataStoreIds = dataStoreIds;
            return this;
        }

        /**
         * @param dataStoreIds The data stores associated with this engine. For SOLUTION_TYPE_SEARCH type of engines, they can only associate with at most one data store.
         * 
         * @return builder
         * 
         */
        public Builder dataStoreIds(List<String> dataStoreIds) {
            return dataStoreIds(Output.of(dataStoreIds));
        }

        /**
         * @param dataStoreIds The data stores associated with this engine. For SOLUTION_TYPE_SEARCH type of engines, they can only associate with at most one data store.
         * 
         * @return builder
         * 
         */
        public Builder dataStoreIds(String... dataStoreIds) {
            return dataStoreIds(List.of(dataStoreIds));
        }

        /**
         * @param displayName Required. The display name of the engine. Should be human readable. UTF-8 encoded string with limit of 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Required. The display name of the engine. Should be human readable. UTF-8 encoded string with limit of 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param engineId Unique ID to use for Search Engine App.
         * 
         * @return builder
         * 
         */
        public Builder engineId(Output<String> engineId) {
            $.engineId = engineId;
            return this;
        }

        /**
         * @param engineId Unique ID to use for Search Engine App.
         * 
         * @return builder
         * 
         */
        public Builder engineId(String engineId) {
            return engineId(Output.of(engineId));
        }

        /**
         * @param industryVertical The industry vertical that the engine registers. The restriction of the Engine industry vertical is based on DataStore: If unspecified, default to GENERIC. Vertical on Engine has to match vertical of the DataStore liniked to the engine.
         * Default value is `GENERIC`.
         * Possible values are: `GENERIC`, `MEDIA`, `HEALTHCARE_FHIR`.
         * 
         * @return builder
         * 
         */
        public Builder industryVertical(@Nullable Output<String> industryVertical) {
            $.industryVertical = industryVertical;
            return this;
        }

        /**
         * @param industryVertical The industry vertical that the engine registers. The restriction of the Engine industry vertical is based on DataStore: If unspecified, default to GENERIC. Vertical on Engine has to match vertical of the DataStore liniked to the engine.
         * Default value is `GENERIC`.
         * Possible values are: `GENERIC`, `MEDIA`, `HEALTHCARE_FHIR`.
         * 
         * @return builder
         * 
         */
        public Builder industryVertical(String industryVertical) {
            return industryVertical(Output.of(industryVertical));
        }

        /**
         * @param location Location.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
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
         * @param searchEngineConfig Configurations for a Search Engine.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder searchEngineConfig(Output<SearchEngineSearchEngineConfigArgs> searchEngineConfig) {
            $.searchEngineConfig = searchEngineConfig;
            return this;
        }

        /**
         * @param searchEngineConfig Configurations for a Search Engine.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder searchEngineConfig(SearchEngineSearchEngineConfigArgs searchEngineConfig) {
            return searchEngineConfig(Output.of(searchEngineConfig));
        }

        public SearchEngineArgs build() {
            if ($.collectionId == null) {
                throw new MissingRequiredPropertyException("SearchEngineArgs", "collectionId");
            }
            if ($.dataStoreIds == null) {
                throw new MissingRequiredPropertyException("SearchEngineArgs", "dataStoreIds");
            }
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("SearchEngineArgs", "displayName");
            }
            if ($.engineId == null) {
                throw new MissingRequiredPropertyException("SearchEngineArgs", "engineId");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("SearchEngineArgs", "location");
            }
            if ($.searchEngineConfig == null) {
                throw new MissingRequiredPropertyException("SearchEngineArgs", "searchEngineConfig");
            }
            return $;
        }
    }

}
