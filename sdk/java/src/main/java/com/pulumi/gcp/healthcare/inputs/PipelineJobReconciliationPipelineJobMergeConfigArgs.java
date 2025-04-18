// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobMergeConfigWhistleConfigSourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineJobReconciliationPipelineJobMergeConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineJobReconciliationPipelineJobMergeConfigArgs Empty = new PipelineJobReconciliationPipelineJobMergeConfigArgs();

    /**
     * Describes the mapping configuration.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Describes the mapping configuration.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the path to the mapping configuration for harmonization pipeline.
     * Structure is documented below.
     * 
     */
    @Import(name="whistleConfigSource", required=true)
    private Output<PipelineJobReconciliationPipelineJobMergeConfigWhistleConfigSourceArgs> whistleConfigSource;

    /**
     * @return Specifies the path to the mapping configuration for harmonization pipeline.
     * Structure is documented below.
     * 
     */
    public Output<PipelineJobReconciliationPipelineJobMergeConfigWhistleConfigSourceArgs> whistleConfigSource() {
        return this.whistleConfigSource;
    }

    private PipelineJobReconciliationPipelineJobMergeConfigArgs() {}

    private PipelineJobReconciliationPipelineJobMergeConfigArgs(PipelineJobReconciliationPipelineJobMergeConfigArgs $) {
        this.description = $.description;
        this.whistleConfigSource = $.whistleConfigSource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineJobReconciliationPipelineJobMergeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineJobReconciliationPipelineJobMergeConfigArgs $;

        public Builder() {
            $ = new PipelineJobReconciliationPipelineJobMergeConfigArgs();
        }

        public Builder(PipelineJobReconciliationPipelineJobMergeConfigArgs defaults) {
            $ = new PipelineJobReconciliationPipelineJobMergeConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Describes the mapping configuration.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Describes the mapping configuration.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param whistleConfigSource Specifies the path to the mapping configuration for harmonization pipeline.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder whistleConfigSource(Output<PipelineJobReconciliationPipelineJobMergeConfigWhistleConfigSourceArgs> whistleConfigSource) {
            $.whistleConfigSource = whistleConfigSource;
            return this;
        }

        /**
         * @param whistleConfigSource Specifies the path to the mapping configuration for harmonization pipeline.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder whistleConfigSource(PipelineJobReconciliationPipelineJobMergeConfigWhistleConfigSourceArgs whistleConfigSource) {
            return whistleConfigSource(Output.of(whistleConfigSource));
        }

        public PipelineJobReconciliationPipelineJobMergeConfigArgs build() {
            if ($.whistleConfigSource == null) {
                throw new MissingRequiredPropertyException("PipelineJobReconciliationPipelineJobMergeConfigArgs", "whistleConfigSource");
            }
            return $;
        }
    }

}
