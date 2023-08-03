// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataplex.inputs.DatascanDataArgs;
import com.pulumi.gcp.dataplex.inputs.DatascanDataProfileResultArgs;
import com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecArgs;
import com.pulumi.gcp.dataplex.inputs.DatascanDataQualityResultArgs;
import com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecArgs;
import com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecArgs;
import com.pulumi.gcp.dataplex.inputs.DatascanExecutionStatusArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatascanState extends com.pulumi.resources.ResourceArgs {

    public static final DatascanState Empty = new DatascanState();

    /**
     * The time when the scan was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time when the scan was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The data source for DataScan.
     * Structure is documented below.
     * 
     */
    @Import(name="data")
    private @Nullable Output<DatascanDataArgs> data;

    /**
     * @return The data source for DataScan.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DatascanDataArgs>> data() {
        return Optional.ofNullable(this.data);
    }

    /**
     * The result of the data profile scan.
     * Structure is documented below.
     * 
     */
    @Import(name="dataProfileResults")
    private @Nullable Output<List<DatascanDataProfileResultArgs>> dataProfileResults;

    /**
     * @return The result of the data profile scan.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<DatascanDataProfileResultArgs>>> dataProfileResults() {
        return Optional.ofNullable(this.dataProfileResults);
    }

    /**
     * DataProfileScan related setting.
     * Structure is documented below.
     * 
     */
    @Import(name="dataProfileSpec")
    private @Nullable Output<DatascanDataProfileSpecArgs> dataProfileSpec;

    /**
     * @return DataProfileScan related setting.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DatascanDataProfileSpecArgs>> dataProfileSpec() {
        return Optional.ofNullable(this.dataProfileSpec);
    }

    /**
     * The result of the data quality scan.
     * Structure is documented below.
     * 
     */
    @Import(name="dataQualityResults")
    private @Nullable Output<List<DatascanDataQualityResultArgs>> dataQualityResults;

    /**
     * @return The result of the data quality scan.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<DatascanDataQualityResultArgs>>> dataQualityResults() {
        return Optional.ofNullable(this.dataQualityResults);
    }

    /**
     * DataQualityScan related setting.
     * Structure is documented below.
     * 
     */
    @Import(name="dataQualitySpec")
    private @Nullable Output<DatascanDataQualitySpecArgs> dataQualitySpec;

    /**
     * @return DataQualityScan related setting.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DatascanDataQualitySpecArgs>> dataQualitySpec() {
        return Optional.ofNullable(this.dataQualitySpec);
    }

    /**
     * DataScan identifier. Must contain only lowercase letters, numbers and hyphens. Must start with a letter. Must end with a number or a letter.
     * 
     */
    @Import(name="dataScanId")
    private @Nullable Output<String> dataScanId;

    /**
     * @return DataScan identifier. Must contain only lowercase letters, numbers and hyphens. Must start with a letter. Must end with a number or a letter.
     * 
     */
    public Optional<Output<String>> dataScanId() {
        return Optional.ofNullable(this.dataScanId);
    }

    /**
     * Description of the scan.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the scan.
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
     * DataScan execution settings.
     * Structure is documented below.
     * 
     */
    @Import(name="executionSpec")
    private @Nullable Output<DatascanExecutionSpecArgs> executionSpec;

    /**
     * @return DataScan execution settings.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DatascanExecutionSpecArgs>> executionSpec() {
        return Optional.ofNullable(this.executionSpec);
    }

    /**
     * Status of the data scan execution.
     * Structure is documented below.
     * 
     */
    @Import(name="executionStatuses")
    private @Nullable Output<List<DatascanExecutionStatusArgs>> executionStatuses;

    /**
     * @return Status of the data scan execution.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<DatascanExecutionStatusArgs>>> executionStatuses() {
        return Optional.ofNullable(this.executionStatuses);
    }

    /**
     * User-defined labels for the scan. A list of key-&gt;value pairs.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-defined labels for the scan. A list of key-&gt;value pairs.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location where the data scan should reside.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location where the data scan should reside.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the field.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the field.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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
     * Current state of the DataScan.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Current state of the DataScan.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The field data type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The field data type.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * System generated globally unique ID for the scan. This ID will be different if the scan is deleted and re-created with the same name.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return System generated globally unique ID for the scan. This ID will be different if the scan is deleted and re-created with the same name.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    /**
     * The time when the scan was last updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The time when the scan was last updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private DatascanState() {}

    private DatascanState(DatascanState $) {
        this.createTime = $.createTime;
        this.data = $.data;
        this.dataProfileResults = $.dataProfileResults;
        this.dataProfileSpec = $.dataProfileSpec;
        this.dataQualityResults = $.dataQualityResults;
        this.dataQualitySpec = $.dataQualitySpec;
        this.dataScanId = $.dataScanId;
        this.description = $.description;
        this.displayName = $.displayName;
        this.executionSpec = $.executionSpec;
        this.executionStatuses = $.executionStatuses;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.state = $.state;
        this.type = $.type;
        this.uid = $.uid;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatascanState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatascanState $;

        public Builder() {
            $ = new DatascanState();
        }

        public Builder(DatascanState defaults) {
            $ = new DatascanState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The time when the scan was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time when the scan was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param data The data source for DataScan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder data(@Nullable Output<DatascanDataArgs> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data The data source for DataScan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder data(DatascanDataArgs data) {
            return data(Output.of(data));
        }

        /**
         * @param dataProfileResults The result of the data profile scan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataProfileResults(@Nullable Output<List<DatascanDataProfileResultArgs>> dataProfileResults) {
            $.dataProfileResults = dataProfileResults;
            return this;
        }

        /**
         * @param dataProfileResults The result of the data profile scan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataProfileResults(List<DatascanDataProfileResultArgs> dataProfileResults) {
            return dataProfileResults(Output.of(dataProfileResults));
        }

        /**
         * @param dataProfileResults The result of the data profile scan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataProfileResults(DatascanDataProfileResultArgs... dataProfileResults) {
            return dataProfileResults(List.of(dataProfileResults));
        }

        /**
         * @param dataProfileSpec DataProfileScan related setting.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataProfileSpec(@Nullable Output<DatascanDataProfileSpecArgs> dataProfileSpec) {
            $.dataProfileSpec = dataProfileSpec;
            return this;
        }

        /**
         * @param dataProfileSpec DataProfileScan related setting.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataProfileSpec(DatascanDataProfileSpecArgs dataProfileSpec) {
            return dataProfileSpec(Output.of(dataProfileSpec));
        }

        /**
         * @param dataQualityResults The result of the data quality scan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataQualityResults(@Nullable Output<List<DatascanDataQualityResultArgs>> dataQualityResults) {
            $.dataQualityResults = dataQualityResults;
            return this;
        }

        /**
         * @param dataQualityResults The result of the data quality scan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataQualityResults(List<DatascanDataQualityResultArgs> dataQualityResults) {
            return dataQualityResults(Output.of(dataQualityResults));
        }

        /**
         * @param dataQualityResults The result of the data quality scan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataQualityResults(DatascanDataQualityResultArgs... dataQualityResults) {
            return dataQualityResults(List.of(dataQualityResults));
        }

        /**
         * @param dataQualitySpec DataQualityScan related setting.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataQualitySpec(@Nullable Output<DatascanDataQualitySpecArgs> dataQualitySpec) {
            $.dataQualitySpec = dataQualitySpec;
            return this;
        }

        /**
         * @param dataQualitySpec DataQualityScan related setting.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataQualitySpec(DatascanDataQualitySpecArgs dataQualitySpec) {
            return dataQualitySpec(Output.of(dataQualitySpec));
        }

        /**
         * @param dataScanId DataScan identifier. Must contain only lowercase letters, numbers and hyphens. Must start with a letter. Must end with a number or a letter.
         * 
         * @return builder
         * 
         */
        public Builder dataScanId(@Nullable Output<String> dataScanId) {
            $.dataScanId = dataScanId;
            return this;
        }

        /**
         * @param dataScanId DataScan identifier. Must contain only lowercase letters, numbers and hyphens. Must start with a letter. Must end with a number or a letter.
         * 
         * @return builder
         * 
         */
        public Builder dataScanId(String dataScanId) {
            return dataScanId(Output.of(dataScanId));
        }

        /**
         * @param description Description of the scan.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the scan.
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
         * @param executionSpec DataScan execution settings.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder executionSpec(@Nullable Output<DatascanExecutionSpecArgs> executionSpec) {
            $.executionSpec = executionSpec;
            return this;
        }

        /**
         * @param executionSpec DataScan execution settings.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder executionSpec(DatascanExecutionSpecArgs executionSpec) {
            return executionSpec(Output.of(executionSpec));
        }

        /**
         * @param executionStatuses Status of the data scan execution.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder executionStatuses(@Nullable Output<List<DatascanExecutionStatusArgs>> executionStatuses) {
            $.executionStatuses = executionStatuses;
            return this;
        }

        /**
         * @param executionStatuses Status of the data scan execution.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder executionStatuses(List<DatascanExecutionStatusArgs> executionStatuses) {
            return executionStatuses(Output.of(executionStatuses));
        }

        /**
         * @param executionStatuses Status of the data scan execution.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder executionStatuses(DatascanExecutionStatusArgs... executionStatuses) {
            return executionStatuses(List.of(executionStatuses));
        }

        /**
         * @param labels User-defined labels for the scan. A list of key-&gt;value pairs.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels for the scan. A list of key-&gt;value pairs.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The location where the data scan should reside.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location where the data scan should reside.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the field.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the field.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param state Current state of the DataScan.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Current state of the DataScan.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param type The field data type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The field data type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param uid System generated globally unique ID for the scan. This ID will be different if the scan is deleted and re-created with the same name.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid System generated globally unique ID for the scan. This ID will be different if the scan is deleted and re-created with the same name.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        /**
         * @param updateTime The time when the scan was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The time when the scan was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public DatascanState build() {
            return $;
        }
    }

}