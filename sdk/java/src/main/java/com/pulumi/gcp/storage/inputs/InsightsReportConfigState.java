// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.storage.inputs.InsightsReportConfigCsvOptionsArgs;
import com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsArgs;
import com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsArgs;
import com.pulumi.gcp.storage.inputs.InsightsReportConfigParquetOptionsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InsightsReportConfigState extends com.pulumi.resources.ResourceArgs {

    public static final InsightsReportConfigState Empty = new InsightsReportConfigState();

    /**
     * Options for configuring the format of the inventory report CSV file.
     * Structure is documented below.
     * 
     */
    @Import(name="csvOptions")
    private @Nullable Output<InsightsReportConfigCsvOptionsArgs> csvOptions;

    /**
     * @return Options for configuring the format of the inventory report CSV file.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InsightsReportConfigCsvOptionsArgs>> csvOptions() {
        return Optional.ofNullable(this.csvOptions);
    }

    /**
     * The editable display name of the inventory report configuration. Has a limit of 256 characters. Can be empty.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The editable display name of the inventory report configuration. Has a limit of 256 characters. Can be empty.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Options for configuring how inventory reports are generated.
     * Structure is documented below.
     * 
     */
    @Import(name="frequencyOptions")
    private @Nullable Output<InsightsReportConfigFrequencyOptionsArgs> frequencyOptions;

    /**
     * @return Options for configuring how inventory reports are generated.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InsightsReportConfigFrequencyOptionsArgs>> frequencyOptions() {
        return Optional.ofNullable(this.frequencyOptions);
    }

    /**
     * The location of the ReportConfig. The source and destination buckets specified in the ReportConfig
     * must be in the same location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the ReportConfig. The source and destination buckets specified in the ReportConfig
     * must be in the same location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The UUID of the inventory report configuration.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The UUID of the inventory report configuration.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Options for including metadata in an inventory report.
     * Structure is documented below.
     * 
     */
    @Import(name="objectMetadataReportOptions")
    private @Nullable Output<InsightsReportConfigObjectMetadataReportOptionsArgs> objectMetadataReportOptions;

    /**
     * @return Options for including metadata in an inventory report.
     * Structure is documented below.
     * 
     */
    public Optional<Output<InsightsReportConfigObjectMetadataReportOptionsArgs>> objectMetadataReportOptions() {
        return Optional.ofNullable(this.objectMetadataReportOptions);
    }

    /**
     * An option for outputting inventory reports as parquet files.
     * 
     */
    @Import(name="parquetOptions")
    private @Nullable Output<InsightsReportConfigParquetOptionsArgs> parquetOptions;

    /**
     * @return An option for outputting inventory reports as parquet files.
     * 
     */
    public Optional<Output<InsightsReportConfigParquetOptionsArgs>> parquetOptions() {
        return Optional.ofNullable(this.parquetOptions);
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

    private InsightsReportConfigState() {}

    private InsightsReportConfigState(InsightsReportConfigState $) {
        this.csvOptions = $.csvOptions;
        this.displayName = $.displayName;
        this.frequencyOptions = $.frequencyOptions;
        this.location = $.location;
        this.name = $.name;
        this.objectMetadataReportOptions = $.objectMetadataReportOptions;
        this.parquetOptions = $.parquetOptions;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InsightsReportConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InsightsReportConfigState $;

        public Builder() {
            $ = new InsightsReportConfigState();
        }

        public Builder(InsightsReportConfigState defaults) {
            $ = new InsightsReportConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param csvOptions Options for configuring the format of the inventory report CSV file.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder csvOptions(@Nullable Output<InsightsReportConfigCsvOptionsArgs> csvOptions) {
            $.csvOptions = csvOptions;
            return this;
        }

        /**
         * @param csvOptions Options for configuring the format of the inventory report CSV file.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder csvOptions(InsightsReportConfigCsvOptionsArgs csvOptions) {
            return csvOptions(Output.of(csvOptions));
        }

        /**
         * @param displayName The editable display name of the inventory report configuration. Has a limit of 256 characters. Can be empty.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The editable display name of the inventory report configuration. Has a limit of 256 characters. Can be empty.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param frequencyOptions Options for configuring how inventory reports are generated.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder frequencyOptions(@Nullable Output<InsightsReportConfigFrequencyOptionsArgs> frequencyOptions) {
            $.frequencyOptions = frequencyOptions;
            return this;
        }

        /**
         * @param frequencyOptions Options for configuring how inventory reports are generated.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder frequencyOptions(InsightsReportConfigFrequencyOptionsArgs frequencyOptions) {
            return frequencyOptions(Output.of(frequencyOptions));
        }

        /**
         * @param location The location of the ReportConfig. The source and destination buckets specified in the ReportConfig
         * must be in the same location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the ReportConfig. The source and destination buckets specified in the ReportConfig
         * must be in the same location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The UUID of the inventory report configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The UUID of the inventory report configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param objectMetadataReportOptions Options for including metadata in an inventory report.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder objectMetadataReportOptions(@Nullable Output<InsightsReportConfigObjectMetadataReportOptionsArgs> objectMetadataReportOptions) {
            $.objectMetadataReportOptions = objectMetadataReportOptions;
            return this;
        }

        /**
         * @param objectMetadataReportOptions Options for including metadata in an inventory report.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder objectMetadataReportOptions(InsightsReportConfigObjectMetadataReportOptionsArgs objectMetadataReportOptions) {
            return objectMetadataReportOptions(Output.of(objectMetadataReportOptions));
        }

        /**
         * @param parquetOptions An option for outputting inventory reports as parquet files.
         * 
         * @return builder
         * 
         */
        public Builder parquetOptions(@Nullable Output<InsightsReportConfigParquetOptionsArgs> parquetOptions) {
            $.parquetOptions = parquetOptions;
            return this;
        }

        /**
         * @param parquetOptions An option for outputting inventory reports as parquet files.
         * 
         * @return builder
         * 
         */
        public Builder parquetOptions(InsightsReportConfigParquetOptionsArgs parquetOptions) {
            return parquetOptions(Output.of(parquetOptions));
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

        public InsightsReportConfigState build() {
            return $;
        }
    }

}
