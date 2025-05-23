// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ControlProjectIntelligenceConfigEffectiveIntelligenceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ControlProjectIntelligenceConfigEffectiveIntelligenceConfigArgs Empty = new ControlProjectIntelligenceConfigEffectiveIntelligenceConfigArgs();

    /**
     * (Output)
     * The `StorageIntelligence` edition that is applicable for the resource.
     * 
     */
    @Import(name="effectiveEdition")
    private @Nullable Output<String> effectiveEdition;

    /**
     * @return (Output)
     * The `StorageIntelligence` edition that is applicable for the resource.
     * 
     */
    public Optional<Output<String>> effectiveEdition() {
        return Optional.ofNullable(this.effectiveEdition);
    }

    /**
     * (Output)
     * The Intelligence config resource that is applied for the target resource.
     * 
     */
    @Import(name="intelligenceConfig")
    private @Nullable Output<String> intelligenceConfig;

    /**
     * @return (Output)
     * The Intelligence config resource that is applied for the target resource.
     * 
     */
    public Optional<Output<String>> intelligenceConfig() {
        return Optional.ofNullable(this.intelligenceConfig);
    }

    private ControlProjectIntelligenceConfigEffectiveIntelligenceConfigArgs() {}

    private ControlProjectIntelligenceConfigEffectiveIntelligenceConfigArgs(ControlProjectIntelligenceConfigEffectiveIntelligenceConfigArgs $) {
        this.effectiveEdition = $.effectiveEdition;
        this.intelligenceConfig = $.intelligenceConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ControlProjectIntelligenceConfigEffectiveIntelligenceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ControlProjectIntelligenceConfigEffectiveIntelligenceConfigArgs $;

        public Builder() {
            $ = new ControlProjectIntelligenceConfigEffectiveIntelligenceConfigArgs();
        }

        public Builder(ControlProjectIntelligenceConfigEffectiveIntelligenceConfigArgs defaults) {
            $ = new ControlProjectIntelligenceConfigEffectiveIntelligenceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param effectiveEdition (Output)
         * The `StorageIntelligence` edition that is applicable for the resource.
         * 
         * @return builder
         * 
         */
        public Builder effectiveEdition(@Nullable Output<String> effectiveEdition) {
            $.effectiveEdition = effectiveEdition;
            return this;
        }

        /**
         * @param effectiveEdition (Output)
         * The `StorageIntelligence` edition that is applicable for the resource.
         * 
         * @return builder
         * 
         */
        public Builder effectiveEdition(String effectiveEdition) {
            return effectiveEdition(Output.of(effectiveEdition));
        }

        /**
         * @param intelligenceConfig (Output)
         * The Intelligence config resource that is applied for the target resource.
         * 
         * @return builder
         * 
         */
        public Builder intelligenceConfig(@Nullable Output<String> intelligenceConfig) {
            $.intelligenceConfig = intelligenceConfig;
            return this;
        }

        /**
         * @param intelligenceConfig (Output)
         * The Intelligence config resource that is applied for the target resource.
         * 
         * @return builder
         * 
         */
        public Builder intelligenceConfig(String intelligenceConfig) {
            return intelligenceConfig(Output.of(intelligenceConfig));
        }

        public ControlProjectIntelligenceConfigEffectiveIntelligenceConfigArgs build() {
            return $;
        }
    }

}
