// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudtasks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class QueueStackdriverLoggingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueueStackdriverLoggingConfigArgs Empty = new QueueStackdriverLoggingConfigArgs();

    /**
     * Specifies the fraction of operations to write to Stackdriver Logging.
     * This field may contain any value between 0.0 and 1.0, inclusive. 0.0 is the
     * default and means that no operations are logged.
     * 
     */
    @Import(name="samplingRatio", required=true)
    private Output<Double> samplingRatio;

    /**
     * @return Specifies the fraction of operations to write to Stackdriver Logging.
     * This field may contain any value between 0.0 and 1.0, inclusive. 0.0 is the
     * default and means that no operations are logged.
     * 
     */
    public Output<Double> samplingRatio() {
        return this.samplingRatio;
    }

    private QueueStackdriverLoggingConfigArgs() {}

    private QueueStackdriverLoggingConfigArgs(QueueStackdriverLoggingConfigArgs $) {
        this.samplingRatio = $.samplingRatio;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueueStackdriverLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueueStackdriverLoggingConfigArgs $;

        public Builder() {
            $ = new QueueStackdriverLoggingConfigArgs();
        }

        public Builder(QueueStackdriverLoggingConfigArgs defaults) {
            $ = new QueueStackdriverLoggingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param samplingRatio Specifies the fraction of operations to write to Stackdriver Logging.
         * This field may contain any value between 0.0 and 1.0, inclusive. 0.0 is the
         * default and means that no operations are logged.
         * 
         * @return builder
         * 
         */
        public Builder samplingRatio(Output<Double> samplingRatio) {
            $.samplingRatio = samplingRatio;
            return this;
        }

        /**
         * @param samplingRatio Specifies the fraction of operations to write to Stackdriver Logging.
         * This field may contain any value between 0.0 and 1.0, inclusive. 0.0 is the
         * default and means that no operations are logged.
         * 
         * @return builder
         * 
         */
        public Builder samplingRatio(Double samplingRatio) {
            return samplingRatio(Output.of(samplingRatio));
        }

        public QueueStackdriverLoggingConfigArgs build() {
            $.samplingRatio = Objects.requireNonNull($.samplingRatio, "expected parameter 'samplingRatio' to be non-null");
            return $;
        }
    }

}