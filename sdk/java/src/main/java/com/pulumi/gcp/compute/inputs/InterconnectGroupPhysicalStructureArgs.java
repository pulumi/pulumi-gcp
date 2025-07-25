// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.InterconnectGroupPhysicalStructureMetroArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InterconnectGroupPhysicalStructureArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterconnectGroupPhysicalStructureArgs Empty = new InterconnectGroupPhysicalStructureArgs();

    /**
     * (Output)
     * Metros used to explain this blocker in more detail.
     * These are three-letter lowercase strings like &#34;iad&#34;. A blocker like
     * INCOMPATIBLE_METROS will specify the problematic metros in this
     * field.
     * 
     */
    @Import(name="metros")
    private @Nullable Output<List<InterconnectGroupPhysicalStructureMetroArgs>> metros;

    /**
     * @return (Output)
     * Metros used to explain this blocker in more detail.
     * These are three-letter lowercase strings like &#34;iad&#34;. A blocker like
     * INCOMPATIBLE_METROS will specify the problematic metros in this
     * field.
     * 
     */
    public Optional<Output<List<InterconnectGroupPhysicalStructureMetroArgs>>> metros() {
        return Optional.ofNullable(this.metros);
    }

    private InterconnectGroupPhysicalStructureArgs() {}

    private InterconnectGroupPhysicalStructureArgs(InterconnectGroupPhysicalStructureArgs $) {
        this.metros = $.metros;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterconnectGroupPhysicalStructureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterconnectGroupPhysicalStructureArgs $;

        public Builder() {
            $ = new InterconnectGroupPhysicalStructureArgs();
        }

        public Builder(InterconnectGroupPhysicalStructureArgs defaults) {
            $ = new InterconnectGroupPhysicalStructureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metros (Output)
         * Metros used to explain this blocker in more detail.
         * These are three-letter lowercase strings like &#34;iad&#34;. A blocker like
         * INCOMPATIBLE_METROS will specify the problematic metros in this
         * field.
         * 
         * @return builder
         * 
         */
        public Builder metros(@Nullable Output<List<InterconnectGroupPhysicalStructureMetroArgs>> metros) {
            $.metros = metros;
            return this;
        }

        /**
         * @param metros (Output)
         * Metros used to explain this blocker in more detail.
         * These are three-letter lowercase strings like &#34;iad&#34;. A blocker like
         * INCOMPATIBLE_METROS will specify the problematic metros in this
         * field.
         * 
         * @return builder
         * 
         */
        public Builder metros(List<InterconnectGroupPhysicalStructureMetroArgs> metros) {
            return metros(Output.of(metros));
        }

        /**
         * @param metros (Output)
         * Metros used to explain this blocker in more detail.
         * These are three-letter lowercase strings like &#34;iad&#34;. A blocker like
         * INCOMPATIBLE_METROS will specify the problematic metros in this
         * field.
         * 
         * @return builder
         * 
         */
        public Builder metros(InterconnectGroupPhysicalStructureMetroArgs... metros) {
            return metros(List.of(metros));
        }

        public InterconnectGroupPhysicalStructureArgs build() {
            return $;
        }
    }

}
