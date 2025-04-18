// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.transcoder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class JobTemplateConfigOverlayImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTemplateConfigOverlayImageArgs Empty = new JobTemplateConfigOverlayImageArgs();

    /**
     * URI of the image in Cloud Storage. For example, gs://bucket/inputs/image.png.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return URI of the image in Cloud Storage. For example, gs://bucket/inputs/image.png.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    private JobTemplateConfigOverlayImageArgs() {}

    private JobTemplateConfigOverlayImageArgs(JobTemplateConfigOverlayImageArgs $) {
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTemplateConfigOverlayImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTemplateConfigOverlayImageArgs $;

        public Builder() {
            $ = new JobTemplateConfigOverlayImageArgs();
        }

        public Builder(JobTemplateConfigOverlayImageArgs defaults) {
            $ = new JobTemplateConfigOverlayImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param uri URI of the image in Cloud Storage. For example, gs://bucket/inputs/image.png.
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri URI of the image in Cloud Storage. For example, gs://bucket/inputs/image.png.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public JobTemplateConfigOverlayImageArgs build() {
            if ($.uri == null) {
                throw new MissingRequiredPropertyException("JobTemplateConfigOverlayImageArgs", "uri");
            }
            return $;
        }
    }

}
