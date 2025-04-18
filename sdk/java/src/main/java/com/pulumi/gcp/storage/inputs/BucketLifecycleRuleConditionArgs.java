// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketLifecycleRuleConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleConditionArgs Empty = new BucketLifecycleRuleConditionArgs();

    /**
     * Minimum age of an object in days to satisfy this condition. **Note** To set `0` value of `age`, `send_age_if_zero` should be set `true` otherwise `0` value of `age` field will be ignored.
     * 
     */
    @Import(name="age")
    private @Nullable Output<Integer> age;

    /**
     * @return Minimum age of an object in days to satisfy this condition. **Note** To set `0` value of `age`, `send_age_if_zero` should be set `true` otherwise `0` value of `age` field will be ignored.
     * 
     */
    public Optional<Output<Integer>> age() {
        return Optional.ofNullable(this.age);
    }

    /**
     * A date in the RFC 3339 format YYYY-MM-DD. This condition is satisfied when an object is created before midnight of the specified date in UTC.
     * 
     */
    @Import(name="createdBefore")
    private @Nullable Output<String> createdBefore;

    /**
     * @return A date in the RFC 3339 format YYYY-MM-DD. This condition is satisfied when an object is created before midnight of the specified date in UTC.
     * 
     */
    public Optional<Output<String>> createdBefore() {
        return Optional.ofNullable(this.createdBefore);
    }

    /**
     * A date in the RFC 3339 format YYYY-MM-DD. This condition is satisfied when the customTime metadata for the object is set to an earlier date than the date used in this lifecycle condition.
     * 
     */
    @Import(name="customTimeBefore")
    private @Nullable Output<String> customTimeBefore;

    /**
     * @return A date in the RFC 3339 format YYYY-MM-DD. This condition is satisfied when the customTime metadata for the object is set to an earlier date than the date used in this lifecycle condition.
     * 
     */
    public Optional<Output<String>> customTimeBefore() {
        return Optional.ofNullable(this.customTimeBefore);
    }

    /**
     * Number of days elapsed since the user-specified timestamp set on an object.
     * 
     */
    @Import(name="daysSinceCustomTime")
    private @Nullable Output<Integer> daysSinceCustomTime;

    /**
     * @return Number of days elapsed since the user-specified timestamp set on an object.
     * 
     */
    public Optional<Output<Integer>> daysSinceCustomTime() {
        return Optional.ofNullable(this.daysSinceCustomTime);
    }

    /**
     * Number of days elapsed since the noncurrent timestamp of an object. This
     * 										condition is relevant only for versioned objects.
     * 
     */
    @Import(name="daysSinceNoncurrentTime")
    private @Nullable Output<Integer> daysSinceNoncurrentTime;

    /**
     * @return Number of days elapsed since the noncurrent timestamp of an object. This
     * 										condition is relevant only for versioned objects.
     * 
     */
    public Optional<Output<Integer>> daysSinceNoncurrentTime() {
        return Optional.ofNullable(this.daysSinceNoncurrentTime);
    }

    /**
     * One or more matching name prefixes to satisfy this condition.
     * 
     */
    @Import(name="matchesPrefixes")
    private @Nullable Output<List<String>> matchesPrefixes;

    /**
     * @return One or more matching name prefixes to satisfy this condition.
     * 
     */
    public Optional<Output<List<String>>> matchesPrefixes() {
        return Optional.ofNullable(this.matchesPrefixes);
    }

    /**
     * [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of objects to satisfy this condition. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`, `DURABLE_REDUCED_AVAILABILITY`.
     * 
     */
    @Import(name="matchesStorageClasses")
    private @Nullable Output<List<String>> matchesStorageClasses;

    /**
     * @return [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of objects to satisfy this condition. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`, `DURABLE_REDUCED_AVAILABILITY`.
     * 
     */
    public Optional<Output<List<String>>> matchesStorageClasses() {
        return Optional.ofNullable(this.matchesStorageClasses);
    }

    /**
     * One or more matching name suffixes to satisfy this condition.
     * 
     */
    @Import(name="matchesSuffixes")
    private @Nullable Output<List<String>> matchesSuffixes;

    /**
     * @return One or more matching name suffixes to satisfy this condition.
     * 
     */
    public Optional<Output<List<String>>> matchesSuffixes() {
        return Optional.ofNullable(this.matchesSuffixes);
    }

    /**
     * Creation date of an object in RFC 3339 (e.g. 2017-06-13) to satisfy this condition.
     * 
     */
    @Import(name="noncurrentTimeBefore")
    private @Nullable Output<String> noncurrentTimeBefore;

    /**
     * @return Creation date of an object in RFC 3339 (e.g. 2017-06-13) to satisfy this condition.
     * 
     */
    public Optional<Output<String>> noncurrentTimeBefore() {
        return Optional.ofNullable(this.noncurrentTimeBefore);
    }

    /**
     * Relevant only for versioned objects. The number of newer versions of an object to satisfy this condition.
     * 
     */
    @Import(name="numNewerVersions")
    private @Nullable Output<Integer> numNewerVersions;

    /**
     * @return Relevant only for versioned objects. The number of newer versions of an object to satisfy this condition.
     * 
     */
    public Optional<Output<Integer>> numNewerVersions() {
        return Optional.ofNullable(this.numNewerVersions);
    }

    /**
     * While set true, `age` value will be sent in the request even for zero value of the field. This field is only useful and required for setting 0 value to the `age` field. It can be used alone or together with `age` attribute. **NOTE** `age` attibute with `0` value will be ommitted from the API request if `send_age_if_zero` field is having `false` value.
     * 
     */
    @Import(name="sendAgeIfZero")
    private @Nullable Output<Boolean> sendAgeIfZero;

    /**
     * @return While set true, `age` value will be sent in the request even for zero value of the field. This field is only useful and required for setting 0 value to the `age` field. It can be used alone or together with `age` attribute. **NOTE** `age` attibute with `0` value will be ommitted from the API request if `send_age_if_zero` field is having `false` value.
     * 
     */
    public Optional<Output<Boolean>> sendAgeIfZero() {
        return Optional.ofNullable(this.sendAgeIfZero);
    }

    /**
     * While set true, `days_since_custom_time` value will be sent in the request even for zero value of the field. This field is only useful for setting 0 value to the `days_since_custom_time` field. It can be used alone or together with `days_since_custom_time`.
     * 
     */
    @Import(name="sendDaysSinceCustomTimeIfZero")
    private @Nullable Output<Boolean> sendDaysSinceCustomTimeIfZero;

    /**
     * @return While set true, `days_since_custom_time` value will be sent in the request even for zero value of the field. This field is only useful for setting 0 value to the `days_since_custom_time` field. It can be used alone or together with `days_since_custom_time`.
     * 
     */
    public Optional<Output<Boolean>> sendDaysSinceCustomTimeIfZero() {
        return Optional.ofNullable(this.sendDaysSinceCustomTimeIfZero);
    }

    /**
     * While set true, `days_since_noncurrent_time` value will be sent in the request even for zero value of the field. This field is only useful for setting 0 value to the `days_since_noncurrent_time` field. It can be used alone or together with `days_since_noncurrent_time`.
     * 
     */
    @Import(name="sendDaysSinceNoncurrentTimeIfZero")
    private @Nullable Output<Boolean> sendDaysSinceNoncurrentTimeIfZero;

    /**
     * @return While set true, `days_since_noncurrent_time` value will be sent in the request even for zero value of the field. This field is only useful for setting 0 value to the `days_since_noncurrent_time` field. It can be used alone or together with `days_since_noncurrent_time`.
     * 
     */
    public Optional<Output<Boolean>> sendDaysSinceNoncurrentTimeIfZero() {
        return Optional.ofNullable(this.sendDaysSinceNoncurrentTimeIfZero);
    }

    /**
     * While set true, `num_newer_versions` value will be sent in the request even for zero value of the field. This field is only useful for setting 0 value to the `num_newer_versions` field. It can be used alone or together with `num_newer_versions`.
     * 
     */
    @Import(name="sendNumNewerVersionsIfZero")
    private @Nullable Output<Boolean> sendNumNewerVersionsIfZero;

    /**
     * @return While set true, `num_newer_versions` value will be sent in the request even for zero value of the field. This field is only useful for setting 0 value to the `num_newer_versions` field. It can be used alone or together with `num_newer_versions`.
     * 
     */
    public Optional<Output<Boolean>> sendNumNewerVersionsIfZero() {
        return Optional.ofNullable(this.sendNumNewerVersionsIfZero);
    }

    /**
     * Match to live and/or archived objects. Unversioned buckets have only live objects. Supported values include: `&#34;LIVE&#34;`, `&#34;ARCHIVED&#34;`, `&#34;ANY&#34;`.
     * 
     */
    @Import(name="withState")
    private @Nullable Output<String> withState;

    /**
     * @return Match to live and/or archived objects. Unversioned buckets have only live objects. Supported values include: `&#34;LIVE&#34;`, `&#34;ARCHIVED&#34;`, `&#34;ANY&#34;`.
     * 
     */
    public Optional<Output<String>> withState() {
        return Optional.ofNullable(this.withState);
    }

    private BucketLifecycleRuleConditionArgs() {}

    private BucketLifecycleRuleConditionArgs(BucketLifecycleRuleConditionArgs $) {
        this.age = $.age;
        this.createdBefore = $.createdBefore;
        this.customTimeBefore = $.customTimeBefore;
        this.daysSinceCustomTime = $.daysSinceCustomTime;
        this.daysSinceNoncurrentTime = $.daysSinceNoncurrentTime;
        this.matchesPrefixes = $.matchesPrefixes;
        this.matchesStorageClasses = $.matchesStorageClasses;
        this.matchesSuffixes = $.matchesSuffixes;
        this.noncurrentTimeBefore = $.noncurrentTimeBefore;
        this.numNewerVersions = $.numNewerVersions;
        this.sendAgeIfZero = $.sendAgeIfZero;
        this.sendDaysSinceCustomTimeIfZero = $.sendDaysSinceCustomTimeIfZero;
        this.sendDaysSinceNoncurrentTimeIfZero = $.sendDaysSinceNoncurrentTimeIfZero;
        this.sendNumNewerVersionsIfZero = $.sendNumNewerVersionsIfZero;
        this.withState = $.withState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketLifecycleRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketLifecycleRuleConditionArgs $;

        public Builder() {
            $ = new BucketLifecycleRuleConditionArgs();
        }

        public Builder(BucketLifecycleRuleConditionArgs defaults) {
            $ = new BucketLifecycleRuleConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param age Minimum age of an object in days to satisfy this condition. **Note** To set `0` value of `age`, `send_age_if_zero` should be set `true` otherwise `0` value of `age` field will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder age(@Nullable Output<Integer> age) {
            $.age = age;
            return this;
        }

        /**
         * @param age Minimum age of an object in days to satisfy this condition. **Note** To set `0` value of `age`, `send_age_if_zero` should be set `true` otherwise `0` value of `age` field will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder age(Integer age) {
            return age(Output.of(age));
        }

        /**
         * @param createdBefore A date in the RFC 3339 format YYYY-MM-DD. This condition is satisfied when an object is created before midnight of the specified date in UTC.
         * 
         * @return builder
         * 
         */
        public Builder createdBefore(@Nullable Output<String> createdBefore) {
            $.createdBefore = createdBefore;
            return this;
        }

        /**
         * @param createdBefore A date in the RFC 3339 format YYYY-MM-DD. This condition is satisfied when an object is created before midnight of the specified date in UTC.
         * 
         * @return builder
         * 
         */
        public Builder createdBefore(String createdBefore) {
            return createdBefore(Output.of(createdBefore));
        }

        /**
         * @param customTimeBefore A date in the RFC 3339 format YYYY-MM-DD. This condition is satisfied when the customTime metadata for the object is set to an earlier date than the date used in this lifecycle condition.
         * 
         * @return builder
         * 
         */
        public Builder customTimeBefore(@Nullable Output<String> customTimeBefore) {
            $.customTimeBefore = customTimeBefore;
            return this;
        }

        /**
         * @param customTimeBefore A date in the RFC 3339 format YYYY-MM-DD. This condition is satisfied when the customTime metadata for the object is set to an earlier date than the date used in this lifecycle condition.
         * 
         * @return builder
         * 
         */
        public Builder customTimeBefore(String customTimeBefore) {
            return customTimeBefore(Output.of(customTimeBefore));
        }

        /**
         * @param daysSinceCustomTime Number of days elapsed since the user-specified timestamp set on an object.
         * 
         * @return builder
         * 
         */
        public Builder daysSinceCustomTime(@Nullable Output<Integer> daysSinceCustomTime) {
            $.daysSinceCustomTime = daysSinceCustomTime;
            return this;
        }

        /**
         * @param daysSinceCustomTime Number of days elapsed since the user-specified timestamp set on an object.
         * 
         * @return builder
         * 
         */
        public Builder daysSinceCustomTime(Integer daysSinceCustomTime) {
            return daysSinceCustomTime(Output.of(daysSinceCustomTime));
        }

        /**
         * @param daysSinceNoncurrentTime Number of days elapsed since the noncurrent timestamp of an object. This
         * 										condition is relevant only for versioned objects.
         * 
         * @return builder
         * 
         */
        public Builder daysSinceNoncurrentTime(@Nullable Output<Integer> daysSinceNoncurrentTime) {
            $.daysSinceNoncurrentTime = daysSinceNoncurrentTime;
            return this;
        }

        /**
         * @param daysSinceNoncurrentTime Number of days elapsed since the noncurrent timestamp of an object. This
         * 										condition is relevant only for versioned objects.
         * 
         * @return builder
         * 
         */
        public Builder daysSinceNoncurrentTime(Integer daysSinceNoncurrentTime) {
            return daysSinceNoncurrentTime(Output.of(daysSinceNoncurrentTime));
        }

        /**
         * @param matchesPrefixes One or more matching name prefixes to satisfy this condition.
         * 
         * @return builder
         * 
         */
        public Builder matchesPrefixes(@Nullable Output<List<String>> matchesPrefixes) {
            $.matchesPrefixes = matchesPrefixes;
            return this;
        }

        /**
         * @param matchesPrefixes One or more matching name prefixes to satisfy this condition.
         * 
         * @return builder
         * 
         */
        public Builder matchesPrefixes(List<String> matchesPrefixes) {
            return matchesPrefixes(Output.of(matchesPrefixes));
        }

        /**
         * @param matchesPrefixes One or more matching name prefixes to satisfy this condition.
         * 
         * @return builder
         * 
         */
        public Builder matchesPrefixes(String... matchesPrefixes) {
            return matchesPrefixes(List.of(matchesPrefixes));
        }

        /**
         * @param matchesStorageClasses [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of objects to satisfy this condition. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`, `DURABLE_REDUCED_AVAILABILITY`.
         * 
         * @return builder
         * 
         */
        public Builder matchesStorageClasses(@Nullable Output<List<String>> matchesStorageClasses) {
            $.matchesStorageClasses = matchesStorageClasses;
            return this;
        }

        /**
         * @param matchesStorageClasses [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of objects to satisfy this condition. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`, `DURABLE_REDUCED_AVAILABILITY`.
         * 
         * @return builder
         * 
         */
        public Builder matchesStorageClasses(List<String> matchesStorageClasses) {
            return matchesStorageClasses(Output.of(matchesStorageClasses));
        }

        /**
         * @param matchesStorageClasses [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of objects to satisfy this condition. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`, `DURABLE_REDUCED_AVAILABILITY`.
         * 
         * @return builder
         * 
         */
        public Builder matchesStorageClasses(String... matchesStorageClasses) {
            return matchesStorageClasses(List.of(matchesStorageClasses));
        }

        /**
         * @param matchesSuffixes One or more matching name suffixes to satisfy this condition.
         * 
         * @return builder
         * 
         */
        public Builder matchesSuffixes(@Nullable Output<List<String>> matchesSuffixes) {
            $.matchesSuffixes = matchesSuffixes;
            return this;
        }

        /**
         * @param matchesSuffixes One or more matching name suffixes to satisfy this condition.
         * 
         * @return builder
         * 
         */
        public Builder matchesSuffixes(List<String> matchesSuffixes) {
            return matchesSuffixes(Output.of(matchesSuffixes));
        }

        /**
         * @param matchesSuffixes One or more matching name suffixes to satisfy this condition.
         * 
         * @return builder
         * 
         */
        public Builder matchesSuffixes(String... matchesSuffixes) {
            return matchesSuffixes(List.of(matchesSuffixes));
        }

        /**
         * @param noncurrentTimeBefore Creation date of an object in RFC 3339 (e.g. 2017-06-13) to satisfy this condition.
         * 
         * @return builder
         * 
         */
        public Builder noncurrentTimeBefore(@Nullable Output<String> noncurrentTimeBefore) {
            $.noncurrentTimeBefore = noncurrentTimeBefore;
            return this;
        }

        /**
         * @param noncurrentTimeBefore Creation date of an object in RFC 3339 (e.g. 2017-06-13) to satisfy this condition.
         * 
         * @return builder
         * 
         */
        public Builder noncurrentTimeBefore(String noncurrentTimeBefore) {
            return noncurrentTimeBefore(Output.of(noncurrentTimeBefore));
        }

        /**
         * @param numNewerVersions Relevant only for versioned objects. The number of newer versions of an object to satisfy this condition.
         * 
         * @return builder
         * 
         */
        public Builder numNewerVersions(@Nullable Output<Integer> numNewerVersions) {
            $.numNewerVersions = numNewerVersions;
            return this;
        }

        /**
         * @param numNewerVersions Relevant only for versioned objects. The number of newer versions of an object to satisfy this condition.
         * 
         * @return builder
         * 
         */
        public Builder numNewerVersions(Integer numNewerVersions) {
            return numNewerVersions(Output.of(numNewerVersions));
        }

        /**
         * @param sendAgeIfZero While set true, `age` value will be sent in the request even for zero value of the field. This field is only useful and required for setting 0 value to the `age` field. It can be used alone or together with `age` attribute. **NOTE** `age` attibute with `0` value will be ommitted from the API request if `send_age_if_zero` field is having `false` value.
         * 
         * @return builder
         * 
         */
        public Builder sendAgeIfZero(@Nullable Output<Boolean> sendAgeIfZero) {
            $.sendAgeIfZero = sendAgeIfZero;
            return this;
        }

        /**
         * @param sendAgeIfZero While set true, `age` value will be sent in the request even for zero value of the field. This field is only useful and required for setting 0 value to the `age` field. It can be used alone or together with `age` attribute. **NOTE** `age` attibute with `0` value will be ommitted from the API request if `send_age_if_zero` field is having `false` value.
         * 
         * @return builder
         * 
         */
        public Builder sendAgeIfZero(Boolean sendAgeIfZero) {
            return sendAgeIfZero(Output.of(sendAgeIfZero));
        }

        /**
         * @param sendDaysSinceCustomTimeIfZero While set true, `days_since_custom_time` value will be sent in the request even for zero value of the field. This field is only useful for setting 0 value to the `days_since_custom_time` field. It can be used alone or together with `days_since_custom_time`.
         * 
         * @return builder
         * 
         */
        public Builder sendDaysSinceCustomTimeIfZero(@Nullable Output<Boolean> sendDaysSinceCustomTimeIfZero) {
            $.sendDaysSinceCustomTimeIfZero = sendDaysSinceCustomTimeIfZero;
            return this;
        }

        /**
         * @param sendDaysSinceCustomTimeIfZero While set true, `days_since_custom_time` value will be sent in the request even for zero value of the field. This field is only useful for setting 0 value to the `days_since_custom_time` field. It can be used alone or together with `days_since_custom_time`.
         * 
         * @return builder
         * 
         */
        public Builder sendDaysSinceCustomTimeIfZero(Boolean sendDaysSinceCustomTimeIfZero) {
            return sendDaysSinceCustomTimeIfZero(Output.of(sendDaysSinceCustomTimeIfZero));
        }

        /**
         * @param sendDaysSinceNoncurrentTimeIfZero While set true, `days_since_noncurrent_time` value will be sent in the request even for zero value of the field. This field is only useful for setting 0 value to the `days_since_noncurrent_time` field. It can be used alone or together with `days_since_noncurrent_time`.
         * 
         * @return builder
         * 
         */
        public Builder sendDaysSinceNoncurrentTimeIfZero(@Nullable Output<Boolean> sendDaysSinceNoncurrentTimeIfZero) {
            $.sendDaysSinceNoncurrentTimeIfZero = sendDaysSinceNoncurrentTimeIfZero;
            return this;
        }

        /**
         * @param sendDaysSinceNoncurrentTimeIfZero While set true, `days_since_noncurrent_time` value will be sent in the request even for zero value of the field. This field is only useful for setting 0 value to the `days_since_noncurrent_time` field. It can be used alone or together with `days_since_noncurrent_time`.
         * 
         * @return builder
         * 
         */
        public Builder sendDaysSinceNoncurrentTimeIfZero(Boolean sendDaysSinceNoncurrentTimeIfZero) {
            return sendDaysSinceNoncurrentTimeIfZero(Output.of(sendDaysSinceNoncurrentTimeIfZero));
        }

        /**
         * @param sendNumNewerVersionsIfZero While set true, `num_newer_versions` value will be sent in the request even for zero value of the field. This field is only useful for setting 0 value to the `num_newer_versions` field. It can be used alone or together with `num_newer_versions`.
         * 
         * @return builder
         * 
         */
        public Builder sendNumNewerVersionsIfZero(@Nullable Output<Boolean> sendNumNewerVersionsIfZero) {
            $.sendNumNewerVersionsIfZero = sendNumNewerVersionsIfZero;
            return this;
        }

        /**
         * @param sendNumNewerVersionsIfZero While set true, `num_newer_versions` value will be sent in the request even for zero value of the field. This field is only useful for setting 0 value to the `num_newer_versions` field. It can be used alone or together with `num_newer_versions`.
         * 
         * @return builder
         * 
         */
        public Builder sendNumNewerVersionsIfZero(Boolean sendNumNewerVersionsIfZero) {
            return sendNumNewerVersionsIfZero(Output.of(sendNumNewerVersionsIfZero));
        }

        /**
         * @param withState Match to live and/or archived objects. Unversioned buckets have only live objects. Supported values include: `&#34;LIVE&#34;`, `&#34;ARCHIVED&#34;`, `&#34;ANY&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder withState(@Nullable Output<String> withState) {
            $.withState = withState;
            return this;
        }

        /**
         * @param withState Match to live and/or archived objects. Unversioned buckets have only live objects. Supported values include: `&#34;LIVE&#34;`, `&#34;ARCHIVED&#34;`, `&#34;ANY&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder withState(String withState) {
            return withState(Output.of(withState));
        }

        public BucketLifecycleRuleConditionArgs build() {
            return $;
        }
    }

}
