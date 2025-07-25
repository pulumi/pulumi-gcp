// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networksecurity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UrlListState extends com.pulumi.resources.ResourceArgs {

    public static final UrlListState Empty = new UrlListState();

    /**
     * Output only. Time when the security policy was created.
     * A timestamp in RFC3339 UTC &#39;Zulu&#39; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#39;2014-10-02T15:01:23Z&#39; and &#39;2014-10-02T15:01:23.045123456Z&#39;
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Output only. Time when the security policy was created.
     * A timestamp in RFC3339 UTC &#39;Zulu&#39; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#39;2014-10-02T15:01:23Z&#39; and &#39;2014-10-02T15:01:23.045123456Z&#39;
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Free-text description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Free-text description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The location of the url lists.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the url lists.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Short name of the UrlList resource to be created.
     * This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. &#39;urlList&#39;.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Short name of the UrlList resource to be created.
     * This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. &#39;urlList&#39;.
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
     * Output only. Time when the security policy was updated.
     * A timestamp in RFC3339 UTC &#39;Zulu&#39; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#39;2014-10-02T15:01:23Z&#39; and &#39;2014-10-02T15:01:23.045123456Z&#39;.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return Output only. Time when the security policy was updated.
     * A timestamp in RFC3339 UTC &#39;Zulu&#39; format, with nanosecond resolution and up to nine fractional digits.
     * Examples: &#39;2014-10-02T15:01:23Z&#39; and &#39;2014-10-02T15:01:23.045123456Z&#39;.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    /**
     * FQDNs and URLs.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return FQDNs and URLs.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private UrlListState() {}

    private UrlListState(UrlListState $) {
        this.createTime = $.createTime;
        this.description = $.description;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.updateTime = $.updateTime;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UrlListState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UrlListState $;

        public Builder() {
            $ = new UrlListState();
        }

        public Builder(UrlListState defaults) {
            $ = new UrlListState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Output only. Time when the security policy was created.
         * A timestamp in RFC3339 UTC &#39;Zulu&#39; format, with nanosecond resolution and up to nine fractional digits.
         * Examples: &#39;2014-10-02T15:01:23Z&#39; and &#39;2014-10-02T15:01:23.045123456Z&#39;
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Output only. Time when the security policy was created.
         * A timestamp in RFC3339 UTC &#39;Zulu&#39; format, with nanosecond resolution and up to nine fractional digits.
         * Examples: &#39;2014-10-02T15:01:23Z&#39; and &#39;2014-10-02T15:01:23.045123456Z&#39;
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description Free-text description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Free-text description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param location The location of the url lists.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the url lists.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Short name of the UrlList resource to be created.
         * This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. &#39;urlList&#39;.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Short name of the UrlList resource to be created.
         * This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. &#39;urlList&#39;.
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
         * @param updateTime Output only. Time when the security policy was updated.
         * A timestamp in RFC3339 UTC &#39;Zulu&#39; format, with nanosecond resolution and up to nine fractional digits.
         * Examples: &#39;2014-10-02T15:01:23Z&#39; and &#39;2014-10-02T15:01:23.045123456Z&#39;.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime Output only. Time when the security policy was updated.
         * A timestamp in RFC3339 UTC &#39;Zulu&#39; format, with nanosecond resolution and up to nine fractional digits.
         * Examples: &#39;2014-10-02T15:01:23Z&#39; and &#39;2014-10-02T15:01:23.045123456Z&#39;.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        /**
         * @param values FQDNs and URLs.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values FQDNs and URLs.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values FQDNs and URLs.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public UrlListState build() {
            return $;
        }
    }

}
