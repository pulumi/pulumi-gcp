// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs Empty = new PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs();

    /**
     * Directory path where all the Whistle files are located.
     * Example: gs://{bucket-id}/{path/to/import-root/dir}
     * 
     */
    @Import(name="importUriPrefix", required=true)
    private Output<String> importUriPrefix;

    /**
     * @return Directory path where all the Whistle files are located.
     * Example: gs://{bucket-id}/{path/to/import-root/dir}
     * 
     */
    public Output<String> importUriPrefix() {
        return this.importUriPrefix;
    }

    /**
     * Main configuration file which has the entrypoint or the root function.
     * Example: gs://{bucket-id}/{path/to/import-root/dir}/entrypoint-file-name.wstl.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    /**
     * @return Main configuration file which has the entrypoint or the root function.
     * Example: gs://{bucket-id}/{path/to/import-root/dir}/entrypoint-file-name.wstl.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    private PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs() {}

    private PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs(PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs $) {
        this.importUriPrefix = $.importUriPrefix;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs $;

        public Builder() {
            $ = new PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs();
        }

        public Builder(PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs defaults) {
            $ = new PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param importUriPrefix Directory path where all the Whistle files are located.
         * Example: gs://{bucket-id}/{path/to/import-root/dir}
         * 
         * @return builder
         * 
         */
        public Builder importUriPrefix(Output<String> importUriPrefix) {
            $.importUriPrefix = importUriPrefix;
            return this;
        }

        /**
         * @param importUriPrefix Directory path where all the Whistle files are located.
         * Example: gs://{bucket-id}/{path/to/import-root/dir}
         * 
         * @return builder
         * 
         */
        public Builder importUriPrefix(String importUriPrefix) {
            return importUriPrefix(Output.of(importUriPrefix));
        }

        /**
         * @param uri Main configuration file which has the entrypoint or the root function.
         * Example: gs://{bucket-id}/{path/to/import-root/dir}/entrypoint-file-name.wstl.
         * 
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri Main configuration file which has the entrypoint or the root function.
         * Example: gs://{bucket-id}/{path/to/import-root/dir}/entrypoint-file-name.wstl.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs build() {
            if ($.importUriPrefix == null) {
                throw new MissingRequiredPropertyException("PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs", "importUriPrefix");
            }
            if ($.uri == null) {
                throw new MissingRequiredPropertyException("PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs", "uri");
            }
            return $;
        }
    }

}
