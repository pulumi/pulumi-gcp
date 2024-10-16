// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudtasks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.cloudtasks.inputs.QueueHttpTargetHeaderOverrideHeaderArgs;
import java.util.Objects;


public final class QueueHttpTargetHeaderOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueueHttpTargetHeaderOverrideArgs Empty = new QueueHttpTargetHeaderOverrideArgs();

    /**
     * Header embodying a key and a value.
     * Structure is documented below.
     * 
     */
    @Import(name="header", required=true)
    private Output<QueueHttpTargetHeaderOverrideHeaderArgs> header;

    /**
     * @return Header embodying a key and a value.
     * Structure is documented below.
     * 
     */
    public Output<QueueHttpTargetHeaderOverrideHeaderArgs> header() {
        return this.header;
    }

    private QueueHttpTargetHeaderOverrideArgs() {}

    private QueueHttpTargetHeaderOverrideArgs(QueueHttpTargetHeaderOverrideArgs $) {
        this.header = $.header;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueueHttpTargetHeaderOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueueHttpTargetHeaderOverrideArgs $;

        public Builder() {
            $ = new QueueHttpTargetHeaderOverrideArgs();
        }

        public Builder(QueueHttpTargetHeaderOverrideArgs defaults) {
            $ = new QueueHttpTargetHeaderOverrideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param header Header embodying a key and a value.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder header(Output<QueueHttpTargetHeaderOverrideHeaderArgs> header) {
            $.header = header;
            return this;
        }

        /**
         * @param header Header embodying a key and a value.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder header(QueueHttpTargetHeaderOverrideHeaderArgs header) {
            return header(Output.of(header));
        }

        public QueueHttpTargetHeaderOverrideArgs build() {
            if ($.header == null) {
                throw new MissingRequiredPropertyException("QueueHttpTargetHeaderOverrideArgs", "header");
            }
            return $;
        }
    }

}
