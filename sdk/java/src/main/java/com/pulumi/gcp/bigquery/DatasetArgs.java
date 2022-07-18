// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigquery.inputs.DatasetAccessArgs;
import com.pulumi.gcp.bigquery.inputs.DatasetDefaultEncryptionConfigurationArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetArgs Empty = new DatasetArgs();

    /**
     * An array of objects that define dataset access for one or more entities.
     * Structure is documented below.
     * 
     */
    @Import(name="accesses")
    private @Nullable Output<List<DatasetAccessArgs>> accesses;

    /**
     * @return An array of objects that define dataset access for one or more entities.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<DatasetAccessArgs>>> accesses() {
        return Optional.ofNullable(this.accesses);
    }

    /**
     * The ID of the dataset containing this table.
     * 
     */
    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    /**
     * @return The ID of the dataset containing this table.
     * 
     */
    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * The default encryption key for all tables in the dataset. Once this property is set,
     * all newly-created partitioned tables in the dataset will have encryption key set to
     * this value, unless table creation request (or query) overrides the key.
     * Structure is documented below.
     * 
     */
    @Import(name="defaultEncryptionConfiguration")
    private @Nullable Output<DatasetDefaultEncryptionConfigurationArgs> defaultEncryptionConfiguration;

    /**
     * @return The default encryption key for all tables in the dataset. Once this property is set,
     * all newly-created partitioned tables in the dataset will have encryption key set to
     * this value, unless table creation request (or query) overrides the key.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DatasetDefaultEncryptionConfigurationArgs>> defaultEncryptionConfiguration() {
        return Optional.ofNullable(this.defaultEncryptionConfiguration);
    }

    /**
     * The default partition expiration for all partitioned tables in
     * the dataset, in milliseconds.
     * 
     */
    @Import(name="defaultPartitionExpirationMs")
    private @Nullable Output<Integer> defaultPartitionExpirationMs;

    /**
     * @return The default partition expiration for all partitioned tables in
     * the dataset, in milliseconds.
     * 
     */
    public Optional<Output<Integer>> defaultPartitionExpirationMs() {
        return Optional.ofNullable(this.defaultPartitionExpirationMs);
    }

    /**
     * The default lifetime of all tables in the dataset, in milliseconds.
     * The minimum value is 3600000 milliseconds (one hour).
     * 
     */
    @Import(name="defaultTableExpirationMs")
    private @Nullable Output<Integer> defaultTableExpirationMs;

    /**
     * @return The default lifetime of all tables in the dataset, in milliseconds.
     * The minimum value is 3600000 milliseconds (one hour).
     * 
     */
    public Optional<Output<Integer>> defaultTableExpirationMs() {
        return Optional.ofNullable(this.defaultTableExpirationMs);
    }

    /**
     * If set to `true`, delete all the tables in the
     * dataset when destroying the resource; otherwise,
     * destroying the resource will fail if tables are present.
     * 
     */
    @Import(name="deleteContentsOnDestroy")
    private @Nullable Output<Boolean> deleteContentsOnDestroy;

    /**
     * @return If set to `true`, delete all the tables in the
     * dataset when destroying the resource; otherwise,
     * destroying the resource will fail if tables are present.
     * 
     */
    public Optional<Output<Boolean>> deleteContentsOnDestroy() {
        return Optional.ofNullable(this.deleteContentsOnDestroy);
    }

    /**
     * A user-friendly description of the dataset
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A user-friendly description of the dataset
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A descriptive name for the dataset
     * 
     */
    @Import(name="friendlyName")
    private @Nullable Output<String> friendlyName;

    /**
     * @return A descriptive name for the dataset
     * 
     */
    public Optional<Output<String>> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * The labels associated with this dataset. You can use these to
     * organize and group your datasets
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The labels associated with this dataset. You can use these to
     * organize and group your datasets
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The geographic location where the dataset should reside.
     * See [official docs](https://cloud.google.com/bigquery/docs/dataset-locations).
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geographic location where the dataset should reside.
     * See [official docs](https://cloud.google.com/bigquery/docs/dataset-locations).
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
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

    private DatasetArgs() {}

    private DatasetArgs(DatasetArgs $) {
        this.accesses = $.accesses;
        this.datasetId = $.datasetId;
        this.defaultEncryptionConfiguration = $.defaultEncryptionConfiguration;
        this.defaultPartitionExpirationMs = $.defaultPartitionExpirationMs;
        this.defaultTableExpirationMs = $.defaultTableExpirationMs;
        this.deleteContentsOnDestroy = $.deleteContentsOnDestroy;
        this.description = $.description;
        this.friendlyName = $.friendlyName;
        this.labels = $.labels;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetArgs $;

        public Builder() {
            $ = new DatasetArgs();
        }

        public Builder(DatasetArgs defaults) {
            $ = new DatasetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accesses An array of objects that define dataset access for one or more entities.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder accesses(@Nullable Output<List<DatasetAccessArgs>> accesses) {
            $.accesses = accesses;
            return this;
        }

        /**
         * @param accesses An array of objects that define dataset access for one or more entities.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder accesses(List<DatasetAccessArgs> accesses) {
            return accesses(Output.of(accesses));
        }

        /**
         * @param accesses An array of objects that define dataset access for one or more entities.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder accesses(DatasetAccessArgs... accesses) {
            return accesses(List.of(accesses));
        }

        /**
         * @param datasetId The ID of the dataset containing this table.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        /**
         * @param datasetId The ID of the dataset containing this table.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        /**
         * @param defaultEncryptionConfiguration The default encryption key for all tables in the dataset. Once this property is set,
         * all newly-created partitioned tables in the dataset will have encryption key set to
         * this value, unless table creation request (or query) overrides the key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder defaultEncryptionConfiguration(@Nullable Output<DatasetDefaultEncryptionConfigurationArgs> defaultEncryptionConfiguration) {
            $.defaultEncryptionConfiguration = defaultEncryptionConfiguration;
            return this;
        }

        /**
         * @param defaultEncryptionConfiguration The default encryption key for all tables in the dataset. Once this property is set,
         * all newly-created partitioned tables in the dataset will have encryption key set to
         * this value, unless table creation request (or query) overrides the key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder defaultEncryptionConfiguration(DatasetDefaultEncryptionConfigurationArgs defaultEncryptionConfiguration) {
            return defaultEncryptionConfiguration(Output.of(defaultEncryptionConfiguration));
        }

        /**
         * @param defaultPartitionExpirationMs The default partition expiration for all partitioned tables in
         * the dataset, in milliseconds.
         * 
         * @return builder
         * 
         */
        public Builder defaultPartitionExpirationMs(@Nullable Output<Integer> defaultPartitionExpirationMs) {
            $.defaultPartitionExpirationMs = defaultPartitionExpirationMs;
            return this;
        }

        /**
         * @param defaultPartitionExpirationMs The default partition expiration for all partitioned tables in
         * the dataset, in milliseconds.
         * 
         * @return builder
         * 
         */
        public Builder defaultPartitionExpirationMs(Integer defaultPartitionExpirationMs) {
            return defaultPartitionExpirationMs(Output.of(defaultPartitionExpirationMs));
        }

        /**
         * @param defaultTableExpirationMs The default lifetime of all tables in the dataset, in milliseconds.
         * The minimum value is 3600000 milliseconds (one hour).
         * 
         * @return builder
         * 
         */
        public Builder defaultTableExpirationMs(@Nullable Output<Integer> defaultTableExpirationMs) {
            $.defaultTableExpirationMs = defaultTableExpirationMs;
            return this;
        }

        /**
         * @param defaultTableExpirationMs The default lifetime of all tables in the dataset, in milliseconds.
         * The minimum value is 3600000 milliseconds (one hour).
         * 
         * @return builder
         * 
         */
        public Builder defaultTableExpirationMs(Integer defaultTableExpirationMs) {
            return defaultTableExpirationMs(Output.of(defaultTableExpirationMs));
        }

        /**
         * @param deleteContentsOnDestroy If set to `true`, delete all the tables in the
         * dataset when destroying the resource; otherwise,
         * destroying the resource will fail if tables are present.
         * 
         * @return builder
         * 
         */
        public Builder deleteContentsOnDestroy(@Nullable Output<Boolean> deleteContentsOnDestroy) {
            $.deleteContentsOnDestroy = deleteContentsOnDestroy;
            return this;
        }

        /**
         * @param deleteContentsOnDestroy If set to `true`, delete all the tables in the
         * dataset when destroying the resource; otherwise,
         * destroying the resource will fail if tables are present.
         * 
         * @return builder
         * 
         */
        public Builder deleteContentsOnDestroy(Boolean deleteContentsOnDestroy) {
            return deleteContentsOnDestroy(Output.of(deleteContentsOnDestroy));
        }

        /**
         * @param description A user-friendly description of the dataset
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A user-friendly description of the dataset
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param friendlyName A descriptive name for the dataset
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param friendlyName A descriptive name for the dataset
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        /**
         * @param labels The labels associated with this dataset. You can use these to
         * organize and group your datasets
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The labels associated with this dataset. You can use these to
         * organize and group your datasets
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The geographic location where the dataset should reside.
         * See [official docs](https://cloud.google.com/bigquery/docs/dataset-locations).
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geographic location where the dataset should reside.
         * See [official docs](https://cloud.google.com/bigquery/docs/dataset-locations).
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

        public DatasetArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            return $;
        }
    }

}