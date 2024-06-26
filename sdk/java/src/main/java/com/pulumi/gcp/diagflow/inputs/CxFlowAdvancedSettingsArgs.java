// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsAudioExportGcsDestinationArgs;
import com.pulumi.gcp.diagflow.inputs.CxFlowAdvancedSettingsDtmfSettingsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxFlowAdvancedSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CxFlowAdvancedSettingsArgs Empty = new CxFlowAdvancedSettingsArgs();

    /**
     * If present, incoming audio is exported by Dialogflow to the configured Google Cloud Storage destination. Exposed at the following levels:
     * * Agent level
     * * Flow level
     *   Structure is documented below.
     * 
     */
    @Import(name="audioExportGcsDestination")
    private @Nullable Output<CxFlowAdvancedSettingsAudioExportGcsDestinationArgs> audioExportGcsDestination;

    /**
     * @return If present, incoming audio is exported by Dialogflow to the configured Google Cloud Storage destination. Exposed at the following levels:
     * * Agent level
     * * Flow level
     *   Structure is documented below.
     * 
     */
    public Optional<Output<CxFlowAdvancedSettingsAudioExportGcsDestinationArgs>> audioExportGcsDestination() {
        return Optional.ofNullable(this.audioExportGcsDestination);
    }

    /**
     * Define behaviors for DTMF (dual tone multi frequency). DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel. Exposed at the following levels:
     * * Agent level
     * * Flow level
     * * Page level
     * * Parameter level
     *   Structure is documented below.
     * 
     */
    @Import(name="dtmfSettings")
    private @Nullable Output<CxFlowAdvancedSettingsDtmfSettingsArgs> dtmfSettings;

    /**
     * @return Define behaviors for DTMF (dual tone multi frequency). DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel. Exposed at the following levels:
     * * Agent level
     * * Flow level
     * * Page level
     * * Parameter level
     *   Structure is documented below.
     * 
     */
    public Optional<Output<CxFlowAdvancedSettingsDtmfSettingsArgs>> dtmfSettings() {
        return Optional.ofNullable(this.dtmfSettings);
    }

    private CxFlowAdvancedSettingsArgs() {}

    private CxFlowAdvancedSettingsArgs(CxFlowAdvancedSettingsArgs $) {
        this.audioExportGcsDestination = $.audioExportGcsDestination;
        this.dtmfSettings = $.dtmfSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxFlowAdvancedSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxFlowAdvancedSettingsArgs $;

        public Builder() {
            $ = new CxFlowAdvancedSettingsArgs();
        }

        public Builder(CxFlowAdvancedSettingsArgs defaults) {
            $ = new CxFlowAdvancedSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audioExportGcsDestination If present, incoming audio is exported by Dialogflow to the configured Google Cloud Storage destination. Exposed at the following levels:
         * * Agent level
         * * Flow level
         *   Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder audioExportGcsDestination(@Nullable Output<CxFlowAdvancedSettingsAudioExportGcsDestinationArgs> audioExportGcsDestination) {
            $.audioExportGcsDestination = audioExportGcsDestination;
            return this;
        }

        /**
         * @param audioExportGcsDestination If present, incoming audio is exported by Dialogflow to the configured Google Cloud Storage destination. Exposed at the following levels:
         * * Agent level
         * * Flow level
         *   Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder audioExportGcsDestination(CxFlowAdvancedSettingsAudioExportGcsDestinationArgs audioExportGcsDestination) {
            return audioExportGcsDestination(Output.of(audioExportGcsDestination));
        }

        /**
         * @param dtmfSettings Define behaviors for DTMF (dual tone multi frequency). DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel. Exposed at the following levels:
         * * Agent level
         * * Flow level
         * * Page level
         * * Parameter level
         *   Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dtmfSettings(@Nullable Output<CxFlowAdvancedSettingsDtmfSettingsArgs> dtmfSettings) {
            $.dtmfSettings = dtmfSettings;
            return this;
        }

        /**
         * @param dtmfSettings Define behaviors for DTMF (dual tone multi frequency). DTMF settings does not override each other. DTMF settings set at different levels define DTMF detections running in parallel. Exposed at the following levels:
         * * Agent level
         * * Flow level
         * * Page level
         * * Parameter level
         *   Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder dtmfSettings(CxFlowAdvancedSettingsDtmfSettingsArgs dtmfSettings) {
            return dtmfSettings(Output.of(dtmfSettings));
        }

        public CxFlowAdvancedSettingsArgs build() {
            return $;
        }
    }

}
