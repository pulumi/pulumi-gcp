// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigquery.inputs.DataTransferConfigEmailPreferencesArgs;
import com.pulumi.gcp.bigquery.inputs.DataTransferConfigScheduleOptionsArgs;
import com.pulumi.gcp.bigquery.inputs.DataTransferConfigSensitiveParamsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataTransferConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataTransferConfigArgs Empty = new DataTransferConfigArgs();

    /**
     * The number of days to look back to automatically refresh the data.
     * For example, if dataRefreshWindowDays = 10, then every day BigQuery
     * reingests data for [today-10, today-1], rather than ingesting data for
     * just [today-1]. Only valid if the data source supports the feature.
     * Set the value to 0 to use the default value.
     * 
     */
    @Import(name="dataRefreshWindowDays")
    private @Nullable Output<Integer> dataRefreshWindowDays;

    /**
     * @return The number of days to look back to automatically refresh the data.
     * For example, if dataRefreshWindowDays = 10, then every day BigQuery
     * reingests data for [today-10, today-1], rather than ingesting data for
     * just [today-1]. Only valid if the data source supports the feature.
     * Set the value to 0 to use the default value.
     * 
     */
    public Optional<Output<Integer>> dataRefreshWindowDays() {
        return Optional.ofNullable(this.dataRefreshWindowDays);
    }

    /**
     * The data source id. Cannot be changed once the transfer config is created.
     * 
     */
    @Import(name="dataSourceId", required=true)
    private Output<String> dataSourceId;

    /**
     * @return The data source id. Cannot be changed once the transfer config is created.
     * 
     */
    public Output<String> dataSourceId() {
        return this.dataSourceId;
    }

    /**
     * The BigQuery target dataset id.
     * 
     */
    @Import(name="destinationDatasetId")
    private @Nullable Output<String> destinationDatasetId;

    /**
     * @return The BigQuery target dataset id.
     * 
     */
    public Optional<Output<String>> destinationDatasetId() {
        return Optional.ofNullable(this.destinationDatasetId);
    }

    /**
     * When set to true, no runs are scheduled for a given transfer.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return When set to true, no runs are scheduled for a given transfer.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * The user specified display name for the transfer config.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The user specified display name for the transfer config.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Email notifications will be sent according to these preferences to the
     * email address of the user who owns this transfer config.
     * Structure is documented below.
     * 
     */
    @Import(name="emailPreferences")
    private @Nullable Output<DataTransferConfigEmailPreferencesArgs> emailPreferences;

    /**
     * @return Email notifications will be sent according to these preferences to the
     * email address of the user who owns this transfer config.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DataTransferConfigEmailPreferencesArgs>> emailPreferences() {
        return Optional.ofNullable(this.emailPreferences);
    }

    /**
     * The geographic location where the transfer config should reside.
     * Examples: US, EU, asia-northeast1. The default value is US.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geographic location where the transfer config should reside.
     * Examples: US, EU, asia-northeast1. The default value is US.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Pub/Sub topic where notifications will be sent after transfer runs
     * associated with this transfer config finish.
     * 
     */
    @Import(name="notificationPubsubTopic")
    private @Nullable Output<String> notificationPubsubTopic;

    /**
     * @return Pub/Sub topic where notifications will be sent after transfer runs
     * associated with this transfer config finish.
     * 
     */
    public Optional<Output<String>> notificationPubsubTopic() {
        return Optional.ofNullable(this.notificationPubsubTopic);
    }

    /**
     * Parameters specific to each data source. For more information see the bq tab in the &#39;Setting up a data transfer&#39;
     * section for each data source. For example the parameters for Cloud Storage transfers are listed here:
     * https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
     * 
     */
    @Import(name="params", required=true)
    private Output<Map<String,String>> params;

    /**
     * @return Parameters specific to each data source. For more information see the bq tab in the &#39;Setting up a data transfer&#39;
     * section for each data source. For example the parameters for Cloud Storage transfers are listed here:
     * https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
     * 
     */
    public Output<Map<String,String>> params() {
        return this.params;
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
     * Data transfer schedule. If the data source does not support a custom
     * schedule, this should be empty. If it is empty, the default value for
     * the data source will be used. The specified times are in UTC. Examples
     * of valid format: 1st,3rd monday of month 15:30, every wed,fri of jan,
     * jun 13:15, and first sunday of quarter 00:00. See more explanation
     * about the format here:
     * https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format
     * NOTE: the granularity should be at least 8 hours, or less frequent.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<String> schedule;

    /**
     * @return Data transfer schedule. If the data source does not support a custom
     * schedule, this should be empty. If it is empty, the default value for
     * the data source will be used. The specified times are in UTC. Examples
     * of valid format: 1st,3rd monday of month 15:30, every wed,fri of jan,
     * jun 13:15, and first sunday of quarter 00:00. See more explanation
     * about the format here:
     * https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format
     * NOTE: the granularity should be at least 8 hours, or less frequent.
     * 
     */
    public Optional<Output<String>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * Options customizing the data transfer schedule.
     * Structure is documented below.
     * 
     */
    @Import(name="scheduleOptions")
    private @Nullable Output<DataTransferConfigScheduleOptionsArgs> scheduleOptions;

    /**
     * @return Options customizing the data transfer schedule.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DataTransferConfigScheduleOptionsArgs>> scheduleOptions() {
        return Optional.ofNullable(this.scheduleOptions);
    }

    /**
     * Different parameters are configured primarily using the the `params` field on this
     * resource. This block contains the parameters which contain secrets or passwords so that they can be marked
     * sensitive and hidden from plan output. The name of the field, eg: secret_access_key, will be the key
     * in the `params` map in the api request.
     * Credentials may not be specified in both locations and will cause an error. Changing from one location
     * to a different credential configuration in the config will require an apply to update state.
     * Structure is documented below.
     * 
     */
    @Import(name="sensitiveParams")
    private @Nullable Output<DataTransferConfigSensitiveParamsArgs> sensitiveParams;

    /**
     * @return Different parameters are configured primarily using the the `params` field on this
     * resource. This block contains the parameters which contain secrets or passwords so that they can be marked
     * sensitive and hidden from plan output. The name of the field, eg: secret_access_key, will be the key
     * in the `params` map in the api request.
     * Credentials may not be specified in both locations and will cause an error. Changing from one location
     * to a different credential configuration in the config will require an apply to update state.
     * Structure is documented below.
     * 
     */
    public Optional<Output<DataTransferConfigSensitiveParamsArgs>> sensitiveParams() {
        return Optional.ofNullable(this.sensitiveParams);
    }

    /**
     * Service account email. If this field is set, transfer config will
     * be created with this service account credentials. It requires that
     * requesting user calling this API has permissions to act as this service account.
     * 
     */
    @Import(name="serviceAccountName")
    private @Nullable Output<String> serviceAccountName;

    /**
     * @return Service account email. If this field is set, transfer config will
     * be created with this service account credentials. It requires that
     * requesting user calling this API has permissions to act as this service account.
     * 
     */
    public Optional<Output<String>> serviceAccountName() {
        return Optional.ofNullable(this.serviceAccountName);
    }

    private DataTransferConfigArgs() {}

    private DataTransferConfigArgs(DataTransferConfigArgs $) {
        this.dataRefreshWindowDays = $.dataRefreshWindowDays;
        this.dataSourceId = $.dataSourceId;
        this.destinationDatasetId = $.destinationDatasetId;
        this.disabled = $.disabled;
        this.displayName = $.displayName;
        this.emailPreferences = $.emailPreferences;
        this.location = $.location;
        this.notificationPubsubTopic = $.notificationPubsubTopic;
        this.params = $.params;
        this.project = $.project;
        this.schedule = $.schedule;
        this.scheduleOptions = $.scheduleOptions;
        this.sensitiveParams = $.sensitiveParams;
        this.serviceAccountName = $.serviceAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataTransferConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataTransferConfigArgs $;

        public Builder() {
            $ = new DataTransferConfigArgs();
        }

        public Builder(DataTransferConfigArgs defaults) {
            $ = new DataTransferConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataRefreshWindowDays The number of days to look back to automatically refresh the data.
         * For example, if dataRefreshWindowDays = 10, then every day BigQuery
         * reingests data for [today-10, today-1], rather than ingesting data for
         * just [today-1]. Only valid if the data source supports the feature.
         * Set the value to 0 to use the default value.
         * 
         * @return builder
         * 
         */
        public Builder dataRefreshWindowDays(@Nullable Output<Integer> dataRefreshWindowDays) {
            $.dataRefreshWindowDays = dataRefreshWindowDays;
            return this;
        }

        /**
         * @param dataRefreshWindowDays The number of days to look back to automatically refresh the data.
         * For example, if dataRefreshWindowDays = 10, then every day BigQuery
         * reingests data for [today-10, today-1], rather than ingesting data for
         * just [today-1]. Only valid if the data source supports the feature.
         * Set the value to 0 to use the default value.
         * 
         * @return builder
         * 
         */
        public Builder dataRefreshWindowDays(Integer dataRefreshWindowDays) {
            return dataRefreshWindowDays(Output.of(dataRefreshWindowDays));
        }

        /**
         * @param dataSourceId The data source id. Cannot be changed once the transfer config is created.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceId(Output<String> dataSourceId) {
            $.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * @param dataSourceId The data source id. Cannot be changed once the transfer config is created.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceId(String dataSourceId) {
            return dataSourceId(Output.of(dataSourceId));
        }

        /**
         * @param destinationDatasetId The BigQuery target dataset id.
         * 
         * @return builder
         * 
         */
        public Builder destinationDatasetId(@Nullable Output<String> destinationDatasetId) {
            $.destinationDatasetId = destinationDatasetId;
            return this;
        }

        /**
         * @param destinationDatasetId The BigQuery target dataset id.
         * 
         * @return builder
         * 
         */
        public Builder destinationDatasetId(String destinationDatasetId) {
            return destinationDatasetId(Output.of(destinationDatasetId));
        }

        /**
         * @param disabled When set to true, no runs are scheduled for a given transfer.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled When set to true, no runs are scheduled for a given transfer.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param displayName The user specified display name for the transfer config.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The user specified display name for the transfer config.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param emailPreferences Email notifications will be sent according to these preferences to the
         * email address of the user who owns this transfer config.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder emailPreferences(@Nullable Output<DataTransferConfigEmailPreferencesArgs> emailPreferences) {
            $.emailPreferences = emailPreferences;
            return this;
        }

        /**
         * @param emailPreferences Email notifications will be sent according to these preferences to the
         * email address of the user who owns this transfer config.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder emailPreferences(DataTransferConfigEmailPreferencesArgs emailPreferences) {
            return emailPreferences(Output.of(emailPreferences));
        }

        /**
         * @param location The geographic location where the transfer config should reside.
         * Examples: US, EU, asia-northeast1. The default value is US.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geographic location where the transfer config should reside.
         * Examples: US, EU, asia-northeast1. The default value is US.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param notificationPubsubTopic Pub/Sub topic where notifications will be sent after transfer runs
         * associated with this transfer config finish.
         * 
         * @return builder
         * 
         */
        public Builder notificationPubsubTopic(@Nullable Output<String> notificationPubsubTopic) {
            $.notificationPubsubTopic = notificationPubsubTopic;
            return this;
        }

        /**
         * @param notificationPubsubTopic Pub/Sub topic where notifications will be sent after transfer runs
         * associated with this transfer config finish.
         * 
         * @return builder
         * 
         */
        public Builder notificationPubsubTopic(String notificationPubsubTopic) {
            return notificationPubsubTopic(Output.of(notificationPubsubTopic));
        }

        /**
         * @param params Parameters specific to each data source. For more information see the bq tab in the &#39;Setting up a data transfer&#39;
         * section for each data source. For example the parameters for Cloud Storage transfers are listed here:
         * https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
         * 
         * @return builder
         * 
         */
        public Builder params(Output<Map<String,String>> params) {
            $.params = params;
            return this;
        }

        /**
         * @param params Parameters specific to each data source. For more information see the bq tab in the &#39;Setting up a data transfer&#39;
         * section for each data source. For example the parameters for Cloud Storage transfers are listed here:
         * https://cloud.google.com/bigquery-transfer/docs/cloud-storage-transfer#bq
         * 
         * @return builder
         * 
         */
        public Builder params(Map<String,String> params) {
            return params(Output.of(params));
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
         * @param schedule Data transfer schedule. If the data source does not support a custom
         * schedule, this should be empty. If it is empty, the default value for
         * the data source will be used. The specified times are in UTC. Examples
         * of valid format: 1st,3rd monday of month 15:30, every wed,fri of jan,
         * jun 13:15, and first sunday of quarter 00:00. See more explanation
         * about the format here:
         * https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format
         * NOTE: the granularity should be at least 8 hours, or less frequent.
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule Data transfer schedule. If the data source does not support a custom
         * schedule, this should be empty. If it is empty, the default value for
         * the data source will be used. The specified times are in UTC. Examples
         * of valid format: 1st,3rd monday of month 15:30, every wed,fri of jan,
         * jun 13:15, and first sunday of quarter 00:00. See more explanation
         * about the format here:
         * https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format
         * NOTE: the granularity should be at least 8 hours, or less frequent.
         * 
         * @return builder
         * 
         */
        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param scheduleOptions Options customizing the data transfer schedule.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder scheduleOptions(@Nullable Output<DataTransferConfigScheduleOptionsArgs> scheduleOptions) {
            $.scheduleOptions = scheduleOptions;
            return this;
        }

        /**
         * @param scheduleOptions Options customizing the data transfer schedule.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder scheduleOptions(DataTransferConfigScheduleOptionsArgs scheduleOptions) {
            return scheduleOptions(Output.of(scheduleOptions));
        }

        /**
         * @param sensitiveParams Different parameters are configured primarily using the the `params` field on this
         * resource. This block contains the parameters which contain secrets or passwords so that they can be marked
         * sensitive and hidden from plan output. The name of the field, eg: secret_access_key, will be the key
         * in the `params` map in the api request.
         * Credentials may not be specified in both locations and will cause an error. Changing from one location
         * to a different credential configuration in the config will require an apply to update state.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sensitiveParams(@Nullable Output<DataTransferConfigSensitiveParamsArgs> sensitiveParams) {
            $.sensitiveParams = sensitiveParams;
            return this;
        }

        /**
         * @param sensitiveParams Different parameters are configured primarily using the the `params` field on this
         * resource. This block contains the parameters which contain secrets or passwords so that they can be marked
         * sensitive and hidden from plan output. The name of the field, eg: secret_access_key, will be the key
         * in the `params` map in the api request.
         * Credentials may not be specified in both locations and will cause an error. Changing from one location
         * to a different credential configuration in the config will require an apply to update state.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sensitiveParams(DataTransferConfigSensitiveParamsArgs sensitiveParams) {
            return sensitiveParams(Output.of(sensitiveParams));
        }

        /**
         * @param serviceAccountName Service account email. If this field is set, transfer config will
         * be created with this service account credentials. It requires that
         * requesting user calling this API has permissions to act as this service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountName(@Nullable Output<String> serviceAccountName) {
            $.serviceAccountName = serviceAccountName;
            return this;
        }

        /**
         * @param serviceAccountName Service account email. If this field is set, transfer config will
         * be created with this service account credentials. It requires that
         * requesting user calling this API has permissions to act as this service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountName(String serviceAccountName) {
            return serviceAccountName(Output.of(serviceAccountName));
        }

        public DataTransferConfigArgs build() {
            $.dataSourceId = Objects.requireNonNull($.dataSourceId, "expected parameter 'dataSourceId' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.params = Objects.requireNonNull($.params, "expected parameter 'params' to be non-null");
            return $;
        }
    }

}