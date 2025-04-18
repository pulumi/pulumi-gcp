// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplateJobPigJobLoggingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobPigJobLoggingConfigArgs Empty = new WorkflowTemplateJobPigJobLoggingConfigArgs();

    /**
     * The per-package log levels for the driver. This may include &#34;root&#34; package name to configure rootLogger. Examples: &#39;com.google = FATAL&#39;, &#39;root = INFO&#39;, &#39;org.apache = DEBUG&#39;
     * 
     */
    @Import(name="driverLogLevels")
    private @Nullable Output<Map<String,String>> driverLogLevels;

    /**
     * @return The per-package log levels for the driver. This may include &#34;root&#34; package name to configure rootLogger. Examples: &#39;com.google = FATAL&#39;, &#39;root = INFO&#39;, &#39;org.apache = DEBUG&#39;
     * 
     */
    public Optional<Output<Map<String,String>>> driverLogLevels() {
        return Optional.ofNullable(this.driverLogLevels);
    }

    private WorkflowTemplateJobPigJobLoggingConfigArgs() {}

    private WorkflowTemplateJobPigJobLoggingConfigArgs(WorkflowTemplateJobPigJobLoggingConfigArgs $) {
        this.driverLogLevels = $.driverLogLevels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplateJobPigJobLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplateJobPigJobLoggingConfigArgs $;

        public Builder() {
            $ = new WorkflowTemplateJobPigJobLoggingConfigArgs();
        }

        public Builder(WorkflowTemplateJobPigJobLoggingConfigArgs defaults) {
            $ = new WorkflowTemplateJobPigJobLoggingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param driverLogLevels The per-package log levels for the driver. This may include &#34;root&#34; package name to configure rootLogger. Examples: &#39;com.google = FATAL&#39;, &#39;root = INFO&#39;, &#39;org.apache = DEBUG&#39;
         * 
         * @return builder
         * 
         */
        public Builder driverLogLevels(@Nullable Output<Map<String,String>> driverLogLevels) {
            $.driverLogLevels = driverLogLevels;
            return this;
        }

        /**
         * @param driverLogLevels The per-package log levels for the driver. This may include &#34;root&#34; package name to configure rootLogger. Examples: &#39;com.google = FATAL&#39;, &#39;root = INFO&#39;, &#39;org.apache = DEBUG&#39;
         * 
         * @return builder
         * 
         */
        public Builder driverLogLevels(Map<String,String> driverLogLevels) {
            return driverLogLevels(Output.of(driverLogLevels));
        }

        public WorkflowTemplateJobPigJobLoggingConfigArgs build() {
            return $;
        }
    }

}
