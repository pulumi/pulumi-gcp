// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.transcoder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class JobTemplateConfigEncryptionMpegCencArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTemplateConfigEncryptionMpegCencArgs Empty = new JobTemplateConfigEncryptionMpegCencArgs();

    /**
     * Specify the encryption scheme.
     * 
     */
    @Import(name="scheme", required=true)
    private Output<String> scheme;

    /**
     * @return Specify the encryption scheme.
     * 
     */
    public Output<String> scheme() {
        return this.scheme;
    }

    private JobTemplateConfigEncryptionMpegCencArgs() {}

    private JobTemplateConfigEncryptionMpegCencArgs(JobTemplateConfigEncryptionMpegCencArgs $) {
        this.scheme = $.scheme;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTemplateConfigEncryptionMpegCencArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTemplateConfigEncryptionMpegCencArgs $;

        public Builder() {
            $ = new JobTemplateConfigEncryptionMpegCencArgs();
        }

        public Builder(JobTemplateConfigEncryptionMpegCencArgs defaults) {
            $ = new JobTemplateConfigEncryptionMpegCencArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scheme Specify the encryption scheme.
         * 
         * @return builder
         * 
         */
        public Builder scheme(Output<String> scheme) {
            $.scheme = scheme;
            return this;
        }

        /**
         * @param scheme Specify the encryption scheme.
         * 
         * @return builder
         * 
         */
        public Builder scheme(String scheme) {
            return scheme(Output.of(scheme));
        }

        public JobTemplateConfigEncryptionMpegCencArgs build() {
            if ($.scheme == null) {
                throw new MissingRequiredPropertyException("JobTemplateConfigEncryptionMpegCencArgs", "scheme");
            }
            return $;
        }
    }

}
