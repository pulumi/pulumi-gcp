// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class JobTemplateTemplateNodeSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTemplateTemplateNodeSelectorArgs Empty = new JobTemplateTemplateNodeSelectorArgs();

    /**
     * The GPU to attach to an instance. See https://cloud.google.com/run/docs/configuring/jobs/gpu for configuring GPU.
     * 
     */
    @Import(name="accelerator", required=true)
    private Output<String> accelerator;

    /**
     * @return The GPU to attach to an instance. See https://cloud.google.com/run/docs/configuring/jobs/gpu for configuring GPU.
     * 
     */
    public Output<String> accelerator() {
        return this.accelerator;
    }

    private JobTemplateTemplateNodeSelectorArgs() {}

    private JobTemplateTemplateNodeSelectorArgs(JobTemplateTemplateNodeSelectorArgs $) {
        this.accelerator = $.accelerator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTemplateTemplateNodeSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTemplateTemplateNodeSelectorArgs $;

        public Builder() {
            $ = new JobTemplateTemplateNodeSelectorArgs();
        }

        public Builder(JobTemplateTemplateNodeSelectorArgs defaults) {
            $ = new JobTemplateTemplateNodeSelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accelerator The GPU to attach to an instance. See https://cloud.google.com/run/docs/configuring/jobs/gpu for configuring GPU.
         * 
         * @return builder
         * 
         */
        public Builder accelerator(Output<String> accelerator) {
            $.accelerator = accelerator;
            return this;
        }

        /**
         * @param accelerator The GPU to attach to an instance. See https://cloud.google.com/run/docs/configuring/jobs/gpu for configuring GPU.
         * 
         * @return builder
         * 
         */
        public Builder accelerator(String accelerator) {
            return accelerator(Output.of(accelerator));
        }

        public JobTemplateTemplateNodeSelectorArgs build() {
            if ($.accelerator == null) {
                throw new MissingRequiredPropertyException("JobTemplateTemplateNodeSelectorArgs", "accelerator");
            }
            return $;
        }
    }

}
