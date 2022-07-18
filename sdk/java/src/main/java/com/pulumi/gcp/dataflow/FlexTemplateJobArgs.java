// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataflow;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlexTemplateJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexTemplateJobArgs Empty = new FlexTemplateJobArgs();

    /**
     * The GCS path to the Dataflow job Flex
     * Template.
     * 
     */
    @Import(name="containerSpecGcsPath", required=true)
    private Output<String> containerSpecGcsPath;

    /**
     * @return The GCS path to the Dataflow job Flex
     * Template.
     * 
     */
    public Output<String> containerSpecGcsPath() {
        return this.containerSpecGcsPath;
    }

    /**
     * User labels to be specified for the job. Keys and values
     * should follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
     * page. **Note**: This field is marked as deprecated as the API does not currently
     * support adding labels.
     * **NOTE**: Google-provided Dataflow templates often provide default labels
     * that begin with `goog-dataflow-provided`. Unless explicitly set in config, these
     * labels will be ignored to prevent diffs on re-apply.
     * 
     * @deprecated
     * Deprecated until the API supports this field
     * 
     */
    @Deprecated /* Deprecated until the API supports this field */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return User labels to be specified for the job. Keys and values
     * should follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
     * page. **Note**: This field is marked as deprecated as the API does not currently
     * support adding labels.
     * **NOTE**: Google-provided Dataflow templates often provide default labels
     * that begin with `goog-dataflow-provided`. Unless explicitly set in config, these
     * labels will be ignored to prevent diffs on re-apply.
     * 
     * @deprecated
     * Deprecated until the API supports this field
     * 
     */
    @Deprecated /* Deprecated until the API supports this field */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * A unique name for the resource, required by Dataflow.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique name for the resource, required by Dataflow.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * One of &#34;drain&#34; or &#34;cancel&#34;. Specifies behavior of
     * deletion during `pulumi destroy`.  See above note.
     * 
     */
    @Import(name="onDelete")
    private @Nullable Output<String> onDelete;

    /**
     * @return One of &#34;drain&#34; or &#34;cancel&#34;. Specifies behavior of
     * deletion during `pulumi destroy`.  See above note.
     * 
     */
    public Optional<Output<String>> onDelete() {
        return Optional.ofNullable(this.onDelete);
    }

    /**
     * Key/Value pairs to be passed to the Dataflow job (as
     * used in the template). Additional [pipeline options](https://cloud.google.com/dataflow/docs/guides/specifying-exec-params#setting-other-cloud-dataflow-pipeline-options)
     * such as `serviceAccount`, `workerMachineType`, etc can be specified here.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,Object>> parameters;

    /**
     * @return Key/Value pairs to be passed to the Dataflow job (as
     * used in the template). Additional [pipeline options](https://cloud.google.com/dataflow/docs/guides/specifying-exec-params#setting-other-cloud-dataflow-pipeline-options)
     * such as `serviceAccount`, `workerMachineType`, etc can be specified here.
     * 
     */
    public Optional<Output<Map<String,Object>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The project in which the resource belongs. If it is not
     * provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project in which the resource belongs. If it is not
     * provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region in which the created job should run.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region in which the created job should run.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * If true, treat DRAINING and CANCELLING as terminal job states and do not wait for further changes before removing from
     * terraform state and moving on. WARNING: this will lead to job name conflicts if you do not ensure that the job names are
     * different, e.g. by embedding a release ID or by using a random_id.
     * 
     */
    @Import(name="skipWaitOnJobTermination")
    private @Nullable Output<Boolean> skipWaitOnJobTermination;

    /**
     * @return If true, treat DRAINING and CANCELLING as terminal job states and do not wait for further changes before removing from
     * terraform state and moving on. WARNING: this will lead to job name conflicts if you do not ensure that the job names are
     * different, e.g. by embedding a release ID or by using a random_id.
     * 
     */
    public Optional<Output<Boolean>> skipWaitOnJobTermination() {
        return Optional.ofNullable(this.skipWaitOnJobTermination);
    }

    private FlexTemplateJobArgs() {}

    private FlexTemplateJobArgs(FlexTemplateJobArgs $) {
        this.containerSpecGcsPath = $.containerSpecGcsPath;
        this.labels = $.labels;
        this.name = $.name;
        this.onDelete = $.onDelete;
        this.parameters = $.parameters;
        this.project = $.project;
        this.region = $.region;
        this.skipWaitOnJobTermination = $.skipWaitOnJobTermination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexTemplateJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexTemplateJobArgs $;

        public Builder() {
            $ = new FlexTemplateJobArgs();
        }

        public Builder(FlexTemplateJobArgs defaults) {
            $ = new FlexTemplateJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerSpecGcsPath The GCS path to the Dataflow job Flex
         * Template.
         * 
         * @return builder
         * 
         */
        public Builder containerSpecGcsPath(Output<String> containerSpecGcsPath) {
            $.containerSpecGcsPath = containerSpecGcsPath;
            return this;
        }

        /**
         * @param containerSpecGcsPath The GCS path to the Dataflow job Flex
         * Template.
         * 
         * @return builder
         * 
         */
        public Builder containerSpecGcsPath(String containerSpecGcsPath) {
            return containerSpecGcsPath(Output.of(containerSpecGcsPath));
        }

        /**
         * @param labels User labels to be specified for the job. Keys and values
         * should follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
         * page. **Note**: This field is marked as deprecated as the API does not currently
         * support adding labels.
         * **NOTE**: Google-provided Dataflow templates often provide default labels
         * that begin with `goog-dataflow-provided`. Unless explicitly set in config, these
         * labels will be ignored to prevent diffs on re-apply.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated until the API supports this field
         * 
         */
        @Deprecated /* Deprecated until the API supports this field */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User labels to be specified for the job. Keys and values
         * should follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
         * page. **Note**: This field is marked as deprecated as the API does not currently
         * support adding labels.
         * **NOTE**: Google-provided Dataflow templates often provide default labels
         * that begin with `goog-dataflow-provided`. Unless explicitly set in config, these
         * labels will be ignored to prevent diffs on re-apply.
         * 
         * @return builder
         * 
         * @deprecated
         * Deprecated until the API supports this field
         * 
         */
        @Deprecated /* Deprecated until the API supports this field */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name A unique name for the resource, required by Dataflow.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name for the resource, required by Dataflow.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param onDelete One of &#34;drain&#34; or &#34;cancel&#34;. Specifies behavior of
         * deletion during `pulumi destroy`.  See above note.
         * 
         * @return builder
         * 
         */
        public Builder onDelete(@Nullable Output<String> onDelete) {
            $.onDelete = onDelete;
            return this;
        }

        /**
         * @param onDelete One of &#34;drain&#34; or &#34;cancel&#34;. Specifies behavior of
         * deletion during `pulumi destroy`.  See above note.
         * 
         * @return builder
         * 
         */
        public Builder onDelete(String onDelete) {
            return onDelete(Output.of(onDelete));
        }

        /**
         * @param parameters Key/Value pairs to be passed to the Dataflow job (as
         * used in the template). Additional [pipeline options](https://cloud.google.com/dataflow/docs/guides/specifying-exec-params#setting-other-cloud-dataflow-pipeline-options)
         * such as `serviceAccount`, `workerMachineType`, etc can be specified here.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,Object>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Key/Value pairs to be passed to the Dataflow job (as
         * used in the template). Additional [pipeline options](https://cloud.google.com/dataflow/docs/guides/specifying-exec-params#setting-other-cloud-dataflow-pipeline-options)
         * such as `serviceAccount`, `workerMachineType`, etc can be specified here.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,Object> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param project The project in which the resource belongs. If it is not
         * provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project in which the resource belongs. If it is not
         * provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region The region in which the created job should run.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region in which the created job should run.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param skipWaitOnJobTermination If true, treat DRAINING and CANCELLING as terminal job states and do not wait for further changes before removing from
         * terraform state and moving on. WARNING: this will lead to job name conflicts if you do not ensure that the job names are
         * different, e.g. by embedding a release ID or by using a random_id.
         * 
         * @return builder
         * 
         */
        public Builder skipWaitOnJobTermination(@Nullable Output<Boolean> skipWaitOnJobTermination) {
            $.skipWaitOnJobTermination = skipWaitOnJobTermination;
            return this;
        }

        /**
         * @param skipWaitOnJobTermination If true, treat DRAINING and CANCELLING as terminal job states and do not wait for further changes before removing from
         * terraform state and moving on. WARNING: this will lead to job name conflicts if you do not ensure that the job names are
         * different, e.g. by embedding a release ID or by using a random_id.
         * 
         * @return builder
         * 
         */
        public Builder skipWaitOnJobTermination(Boolean skipWaitOnJobTermination) {
            return skipWaitOnJobTermination(Output.of(skipWaitOnJobTermination));
        }

        public FlexTemplateJobArgs build() {
            $.containerSpecGcsPath = Objects.requireNonNull($.containerSpecGcsPath, "expected parameter 'containerSpecGcsPath' to be non-null");
            return $;
        }
    }

}