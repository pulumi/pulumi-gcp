// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseInstanceSettingsInsightsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceSettingsInsightsConfigArgs Empty = new DatabaseInstanceSettingsInsightsConfigArgs();

    /**
     * True if Query Insights feature is enabled.
     * 
     */
    @Import(name="queryInsightsEnabled")
    private @Nullable Output<Boolean> queryInsightsEnabled;

    /**
     * @return True if Query Insights feature is enabled.
     * 
     */
    public Optional<Output<Boolean>> queryInsightsEnabled() {
        return Optional.ofNullable(this.queryInsightsEnabled);
    }

    /**
     * Number of query execution plans captured by Insights per minute for all queries combined. Between 0 and 20. Default to 5.
     * 
     */
    @Import(name="queryPlansPerMinute")
    private @Nullable Output<Integer> queryPlansPerMinute;

    /**
     * @return Number of query execution plans captured by Insights per minute for all queries combined. Between 0 and 20. Default to 5.
     * 
     */
    public Optional<Output<Integer>> queryPlansPerMinute() {
        return Optional.ofNullable(this.queryPlansPerMinute);
    }

    /**
     * Maximum query length stored in bytes. Between 256 and 4500. Default to 1024. Higher query lengths are more useful for analytical queries, but they also require more memory. Changing the query length requires you to restart the instance. You can still add tags to queries that exceed the length limit.
     * 
     */
    @Import(name="queryStringLength")
    private @Nullable Output<Integer> queryStringLength;

    /**
     * @return Maximum query length stored in bytes. Between 256 and 4500. Default to 1024. Higher query lengths are more useful for analytical queries, but they also require more memory. Changing the query length requires you to restart the instance. You can still add tags to queries that exceed the length limit.
     * 
     */
    public Optional<Output<Integer>> queryStringLength() {
        return Optional.ofNullable(this.queryStringLength);
    }

    /**
     * True if Query Insights will record application tags from query when enabled.
     * 
     */
    @Import(name="recordApplicationTags")
    private @Nullable Output<Boolean> recordApplicationTags;

    /**
     * @return True if Query Insights will record application tags from query when enabled.
     * 
     */
    public Optional<Output<Boolean>> recordApplicationTags() {
        return Optional.ofNullable(this.recordApplicationTags);
    }

    /**
     * True if Query Insights will record client address when enabled.
     * 
     */
    @Import(name="recordClientAddress")
    private @Nullable Output<Boolean> recordClientAddress;

    /**
     * @return True if Query Insights will record client address when enabled.
     * 
     */
    public Optional<Output<Boolean>> recordClientAddress() {
        return Optional.ofNullable(this.recordClientAddress);
    }

    private DatabaseInstanceSettingsInsightsConfigArgs() {}

    private DatabaseInstanceSettingsInsightsConfigArgs(DatabaseInstanceSettingsInsightsConfigArgs $) {
        this.queryInsightsEnabled = $.queryInsightsEnabled;
        this.queryPlansPerMinute = $.queryPlansPerMinute;
        this.queryStringLength = $.queryStringLength;
        this.recordApplicationTags = $.recordApplicationTags;
        this.recordClientAddress = $.recordClientAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseInstanceSettingsInsightsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseInstanceSettingsInsightsConfigArgs $;

        public Builder() {
            $ = new DatabaseInstanceSettingsInsightsConfigArgs();
        }

        public Builder(DatabaseInstanceSettingsInsightsConfigArgs defaults) {
            $ = new DatabaseInstanceSettingsInsightsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param queryInsightsEnabled True if Query Insights feature is enabled.
         * 
         * @return builder
         * 
         */
        public Builder queryInsightsEnabled(@Nullable Output<Boolean> queryInsightsEnabled) {
            $.queryInsightsEnabled = queryInsightsEnabled;
            return this;
        }

        /**
         * @param queryInsightsEnabled True if Query Insights feature is enabled.
         * 
         * @return builder
         * 
         */
        public Builder queryInsightsEnabled(Boolean queryInsightsEnabled) {
            return queryInsightsEnabled(Output.of(queryInsightsEnabled));
        }

        /**
         * @param queryPlansPerMinute Number of query execution plans captured by Insights per minute for all queries combined. Between 0 and 20. Default to 5.
         * 
         * @return builder
         * 
         */
        public Builder queryPlansPerMinute(@Nullable Output<Integer> queryPlansPerMinute) {
            $.queryPlansPerMinute = queryPlansPerMinute;
            return this;
        }

        /**
         * @param queryPlansPerMinute Number of query execution plans captured by Insights per minute for all queries combined. Between 0 and 20. Default to 5.
         * 
         * @return builder
         * 
         */
        public Builder queryPlansPerMinute(Integer queryPlansPerMinute) {
            return queryPlansPerMinute(Output.of(queryPlansPerMinute));
        }

        /**
         * @param queryStringLength Maximum query length stored in bytes. Between 256 and 4500. Default to 1024. Higher query lengths are more useful for analytical queries, but they also require more memory. Changing the query length requires you to restart the instance. You can still add tags to queries that exceed the length limit.
         * 
         * @return builder
         * 
         */
        public Builder queryStringLength(@Nullable Output<Integer> queryStringLength) {
            $.queryStringLength = queryStringLength;
            return this;
        }

        /**
         * @param queryStringLength Maximum query length stored in bytes. Between 256 and 4500. Default to 1024. Higher query lengths are more useful for analytical queries, but they also require more memory. Changing the query length requires you to restart the instance. You can still add tags to queries that exceed the length limit.
         * 
         * @return builder
         * 
         */
        public Builder queryStringLength(Integer queryStringLength) {
            return queryStringLength(Output.of(queryStringLength));
        }

        /**
         * @param recordApplicationTags True if Query Insights will record application tags from query when enabled.
         * 
         * @return builder
         * 
         */
        public Builder recordApplicationTags(@Nullable Output<Boolean> recordApplicationTags) {
            $.recordApplicationTags = recordApplicationTags;
            return this;
        }

        /**
         * @param recordApplicationTags True if Query Insights will record application tags from query when enabled.
         * 
         * @return builder
         * 
         */
        public Builder recordApplicationTags(Boolean recordApplicationTags) {
            return recordApplicationTags(Output.of(recordApplicationTags));
        }

        /**
         * @param recordClientAddress True if Query Insights will record client address when enabled.
         * 
         * @return builder
         * 
         */
        public Builder recordClientAddress(@Nullable Output<Boolean> recordClientAddress) {
            $.recordClientAddress = recordClientAddress;
            return this;
        }

        /**
         * @param recordClientAddress True if Query Insights will record client address when enabled.
         * 
         * @return builder
         * 
         */
        public Builder recordClientAddress(Boolean recordClientAddress) {
            return recordClientAddress(Output.of(recordClientAddress));
        }

        public DatabaseInstanceSettingsInsightsConfigArgs build() {
            return $;
        }
    }

}
