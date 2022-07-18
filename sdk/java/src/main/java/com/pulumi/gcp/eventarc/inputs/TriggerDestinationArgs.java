// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.eventarc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.eventarc.inputs.TriggerDestinationCloudRunServiceArgs;
import com.pulumi.gcp.eventarc.inputs.TriggerDestinationGkeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerDestinationArgs Empty = new TriggerDestinationArgs();

    /**
     * [WARNING] Configuring a Cloud Function in Trigger is not supported as of today. The Cloud Function resource name. Format: projects/{project}/locations/{location}/functions/{function}
     * 
     */
    @Import(name="cloudFunction")
    private @Nullable Output<String> cloudFunction;

    /**
     * @return [WARNING] Configuring a Cloud Function in Trigger is not supported as of today. The Cloud Function resource name. Format: projects/{project}/locations/{location}/functions/{function}
     * 
     */
    public Optional<Output<String>> cloudFunction() {
        return Optional.ofNullable(this.cloudFunction);
    }

    /**
     * Cloud Run fully-managed service that receives the events. The service should be running in the same project of the trigger.
     * 
     */
    @Import(name="cloudRunService")
    private @Nullable Output<TriggerDestinationCloudRunServiceArgs> cloudRunService;

    /**
     * @return Cloud Run fully-managed service that receives the events. The service should be running in the same project of the trigger.
     * 
     */
    public Optional<Output<TriggerDestinationCloudRunServiceArgs>> cloudRunService() {
        return Optional.ofNullable(this.cloudRunService);
    }

    /**
     * A GKE service capable of receiving events. The service should be running in the same project as the trigger.
     * 
     */
    @Import(name="gke")
    private @Nullable Output<TriggerDestinationGkeArgs> gke;

    /**
     * @return A GKE service capable of receiving events. The service should be running in the same project as the trigger.
     * 
     */
    public Optional<Output<TriggerDestinationGkeArgs>> gke() {
        return Optional.ofNullable(this.gke);
    }

    /**
     * The resource name of the Workflow whose Executions are triggered by the events. The Workflow resource should be deployed in the same project as the trigger. Format: `projects/{project}/locations/{location}/workflows/{workflow}`
     * 
     */
    @Import(name="workflow")
    private @Nullable Output<String> workflow;

    /**
     * @return The resource name of the Workflow whose Executions are triggered by the events. The Workflow resource should be deployed in the same project as the trigger. Format: `projects/{project}/locations/{location}/workflows/{workflow}`
     * 
     */
    public Optional<Output<String>> workflow() {
        return Optional.ofNullable(this.workflow);
    }

    private TriggerDestinationArgs() {}

    private TriggerDestinationArgs(TriggerDestinationArgs $) {
        this.cloudFunction = $.cloudFunction;
        this.cloudRunService = $.cloudRunService;
        this.gke = $.gke;
        this.workflow = $.workflow;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerDestinationArgs $;

        public Builder() {
            $ = new TriggerDestinationArgs();
        }

        public Builder(TriggerDestinationArgs defaults) {
            $ = new TriggerDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudFunction [WARNING] Configuring a Cloud Function in Trigger is not supported as of today. The Cloud Function resource name. Format: projects/{project}/locations/{location}/functions/{function}
         * 
         * @return builder
         * 
         */
        public Builder cloudFunction(@Nullable Output<String> cloudFunction) {
            $.cloudFunction = cloudFunction;
            return this;
        }

        /**
         * @param cloudFunction [WARNING] Configuring a Cloud Function in Trigger is not supported as of today. The Cloud Function resource name. Format: projects/{project}/locations/{location}/functions/{function}
         * 
         * @return builder
         * 
         */
        public Builder cloudFunction(String cloudFunction) {
            return cloudFunction(Output.of(cloudFunction));
        }

        /**
         * @param cloudRunService Cloud Run fully-managed service that receives the events. The service should be running in the same project of the trigger.
         * 
         * @return builder
         * 
         */
        public Builder cloudRunService(@Nullable Output<TriggerDestinationCloudRunServiceArgs> cloudRunService) {
            $.cloudRunService = cloudRunService;
            return this;
        }

        /**
         * @param cloudRunService Cloud Run fully-managed service that receives the events. The service should be running in the same project of the trigger.
         * 
         * @return builder
         * 
         */
        public Builder cloudRunService(TriggerDestinationCloudRunServiceArgs cloudRunService) {
            return cloudRunService(Output.of(cloudRunService));
        }

        /**
         * @param gke A GKE service capable of receiving events. The service should be running in the same project as the trigger.
         * 
         * @return builder
         * 
         */
        public Builder gke(@Nullable Output<TriggerDestinationGkeArgs> gke) {
            $.gke = gke;
            return this;
        }

        /**
         * @param gke A GKE service capable of receiving events. The service should be running in the same project as the trigger.
         * 
         * @return builder
         * 
         */
        public Builder gke(TriggerDestinationGkeArgs gke) {
            return gke(Output.of(gke));
        }

        /**
         * @param workflow The resource name of the Workflow whose Executions are triggered by the events. The Workflow resource should be deployed in the same project as the trigger. Format: `projects/{project}/locations/{location}/workflows/{workflow}`
         * 
         * @return builder
         * 
         */
        public Builder workflow(@Nullable Output<String> workflow) {
            $.workflow = workflow;
            return this;
        }

        /**
         * @param workflow The resource name of the Workflow whose Executions are triggered by the events. The Workflow resource should be deployed in the same project as the trigger. Format: `projects/{project}/locations/{location}/workflows/{workflow}`
         * 
         * @return builder
         * 
         */
        public Builder workflow(String workflow) {
            return workflow(Output.of(workflow));
        }

        public TriggerDestinationArgs build() {
            return $;
        }
    }

}