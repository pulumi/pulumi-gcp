// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowFlexTemplateRequestArgs;
import com.pulumi.gcp.dataflow.inputs.PipelineWorkloadDataflowLaunchTemplateRequestArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineWorkloadArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineWorkloadArgs Empty = new PipelineWorkloadArgs();

    /**
     * Template information and additional parameters needed to launch a Dataflow job using the flex launch API.
     * https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#launchflextemplaterequest
     * Structure is documented below.
     * 
     */
    @Import(name="dataflowFlexTemplateRequest")
    private @Nullable Output<PipelineWorkloadDataflowFlexTemplateRequestArgs> dataflowFlexTemplateRequest;

    /**
     * @return Template information and additional parameters needed to launch a Dataflow job using the flex launch API.
     * https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#launchflextemplaterequest
     * Structure is documented below.
     * 
     */
    public Optional<Output<PipelineWorkloadDataflowFlexTemplateRequestArgs>> dataflowFlexTemplateRequest() {
        return Optional.ofNullable(this.dataflowFlexTemplateRequest);
    }

    /**
     * Template information and additional parameters needed to launch a Dataflow job using the standard launch API.
     * https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#launchtemplaterequest
     * Structure is documented below.
     * 
     */
    @Import(name="dataflowLaunchTemplateRequest")
    private @Nullable Output<PipelineWorkloadDataflowLaunchTemplateRequestArgs> dataflowLaunchTemplateRequest;

    /**
     * @return Template information and additional parameters needed to launch a Dataflow job using the standard launch API.
     * https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#launchtemplaterequest
     * Structure is documented below.
     * 
     */
    public Optional<Output<PipelineWorkloadDataflowLaunchTemplateRequestArgs>> dataflowLaunchTemplateRequest() {
        return Optional.ofNullable(this.dataflowLaunchTemplateRequest);
    }

    private PipelineWorkloadArgs() {}

    private PipelineWorkloadArgs(PipelineWorkloadArgs $) {
        this.dataflowFlexTemplateRequest = $.dataflowFlexTemplateRequest;
        this.dataflowLaunchTemplateRequest = $.dataflowLaunchTemplateRequest;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineWorkloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineWorkloadArgs $;

        public Builder() {
            $ = new PipelineWorkloadArgs();
        }

        public Builder(PipelineWorkloadArgs defaults) {
            $ = new PipelineWorkloadArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataflowFlexTemplateRequest Template information and additional parameters needed to launch a Dataflow job using the flex launch API.
         * https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#launchflextemplaterequest
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataflowFlexTemplateRequest(@Nullable Output<PipelineWorkloadDataflowFlexTemplateRequestArgs> dataflowFlexTemplateRequest) {
            $.dataflowFlexTemplateRequest = dataflowFlexTemplateRequest;
            return this;
        }

        /**
         * @param dataflowFlexTemplateRequest Template information and additional parameters needed to launch a Dataflow job using the flex launch API.
         * https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#launchflextemplaterequest
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataflowFlexTemplateRequest(PipelineWorkloadDataflowFlexTemplateRequestArgs dataflowFlexTemplateRequest) {
            return dataflowFlexTemplateRequest(Output.of(dataflowFlexTemplateRequest));
        }

        /**
         * @param dataflowLaunchTemplateRequest Template information and additional parameters needed to launch a Dataflow job using the standard launch API.
         * https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#launchtemplaterequest
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataflowLaunchTemplateRequest(@Nullable Output<PipelineWorkloadDataflowLaunchTemplateRequestArgs> dataflowLaunchTemplateRequest) {
            $.dataflowLaunchTemplateRequest = dataflowLaunchTemplateRequest;
            return this;
        }

        /**
         * @param dataflowLaunchTemplateRequest Template information and additional parameters needed to launch a Dataflow job using the standard launch API.
         * https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#launchtemplaterequest
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dataflowLaunchTemplateRequest(PipelineWorkloadDataflowLaunchTemplateRequestArgs dataflowLaunchTemplateRequest) {
            return dataflowLaunchTemplateRequest(Output.of(dataflowLaunchTemplateRequest));
        }

        public PipelineWorkloadArgs build() {
            return $;
        }
    }

}