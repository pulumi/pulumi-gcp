// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceTemplateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTemplateArgs Empty = new GetInstanceTemplateArgs();

    /**
     * A filter to retrieve the instance templates.
     * See [gcloud topic filters](https://cloud.google.com/sdk/gcloud/reference/topic/filters) for reference.
     * If multiple instance templates match, either adjust the filter or specify `most_recent`. One of `name` or `filter` must be provided.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return A filter to retrieve the instance templates.
     * See [gcloud topic filters](https://cloud.google.com/sdk/gcloud/reference/topic/filters) for reference.
     * If multiple instance templates match, either adjust the filter or specify `most_recent`. One of `name` or `filter` must be provided.
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * If `filter` is provided, ensures the most recent template is returned when multiple instance templates match. One of `name` or `filter` must be provided.
     * 
     */
    @Import(name="mostRecent")
    private @Nullable Output<Boolean> mostRecent;

    /**
     * @return If `filter` is provided, ensures the most recent template is returned when multiple instance templates match. One of `name` or `filter` must be provided.
     * 
     */
    public Optional<Output<Boolean>> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }

    /**
     * The name of the instance template. One of `name` or `filter` must be provided.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the instance template. One of `name` or `filter` must be provided.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If `project` is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If `project` is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetInstanceTemplateArgs() {}

    private GetInstanceTemplateArgs(GetInstanceTemplateArgs $) {
        this.filter = $.filter;
        this.mostRecent = $.mostRecent;
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTemplateArgs $;

        public Builder() {
            $ = new GetInstanceTemplateArgs();
        }

        public Builder(GetInstanceTemplateArgs defaults) {
            $ = new GetInstanceTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filter A filter to retrieve the instance templates.
         * See [gcloud topic filters](https://cloud.google.com/sdk/gcloud/reference/topic/filters) for reference.
         * If multiple instance templates match, either adjust the filter or specify `most_recent`. One of `name` or `filter` must be provided.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter A filter to retrieve the instance templates.
         * See [gcloud topic filters](https://cloud.google.com/sdk/gcloud/reference/topic/filters) for reference.
         * If multiple instance templates match, either adjust the filter or specify `most_recent`. One of `name` or `filter` must be provided.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param mostRecent If `filter` is provided, ensures the most recent template is returned when multiple instance templates match. One of `name` or `filter` must be provided.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(@Nullable Output<Boolean> mostRecent) {
            $.mostRecent = mostRecent;
            return this;
        }

        /**
         * @param mostRecent If `filter` is provided, ensures the most recent template is returned when multiple instance templates match. One of `name` or `filter` must be provided.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(Boolean mostRecent) {
            return mostRecent(Output.of(mostRecent));
        }

        /**
         * @param name The name of the instance template. One of `name` or `filter` must be provided.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the instance template. One of `name` or `filter` must be provided.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If `project` is not provided, the provider project is used.
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
         * If `project` is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetInstanceTemplateArgs build() {
            return $;
        }
    }

}