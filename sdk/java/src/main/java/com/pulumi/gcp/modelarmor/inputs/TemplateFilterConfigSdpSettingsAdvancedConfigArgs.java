// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.modelarmor.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TemplateFilterConfigSdpSettingsAdvancedConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final TemplateFilterConfigSdpSettingsAdvancedConfigArgs Empty = new TemplateFilterConfigSdpSettingsAdvancedConfigArgs();

    /**
     * Optional Sensitive Data Protection Deidentify template resource name.
     * If provided then DeidentifyContent action is performed during Sanitization
     * using this template and inspect template. The De-identified data will
     * be returned in SdpDeidentifyResult.
     * Note that all info-types present in the deidentify template must be present
     * in inspect template.
     * e.g.
     * `projects/{project}/locations/{location}/deidentifyTemplates/{deidentify_template}`
     * 
     */
    @Import(name="deidentifyTemplate")
    private @Nullable Output<String> deidentifyTemplate;

    /**
     * @return Optional Sensitive Data Protection Deidentify template resource name.
     * If provided then DeidentifyContent action is performed during Sanitization
     * using this template and inspect template. The De-identified data will
     * be returned in SdpDeidentifyResult.
     * Note that all info-types present in the deidentify template must be present
     * in inspect template.
     * e.g.
     * `projects/{project}/locations/{location}/deidentifyTemplates/{deidentify_template}`
     * 
     */
    public Optional<Output<String>> deidentifyTemplate() {
        return Optional.ofNullable(this.deidentifyTemplate);
    }

    /**
     * Sensitive Data Protection inspect template resource name
     * If only inspect template is provided (de-identify template not provided),
     * then Sensitive Data Protection InspectContent action is performed during
     * Sanitization. All Sensitive Data Protection findings identified during
     * inspection will be returned as SdpFinding in SdpInsepctionResult.
     * e.g:-
     * `projects/{project}/locations/{location}/inspectTemplates/{inspect_template}`
     * 
     */
    @Import(name="inspectTemplate")
    private @Nullable Output<String> inspectTemplate;

    /**
     * @return Sensitive Data Protection inspect template resource name
     * If only inspect template is provided (de-identify template not provided),
     * then Sensitive Data Protection InspectContent action is performed during
     * Sanitization. All Sensitive Data Protection findings identified during
     * inspection will be returned as SdpFinding in SdpInsepctionResult.
     * e.g:-
     * `projects/{project}/locations/{location}/inspectTemplates/{inspect_template}`
     * 
     */
    public Optional<Output<String>> inspectTemplate() {
        return Optional.ofNullable(this.inspectTemplate);
    }

    private TemplateFilterConfigSdpSettingsAdvancedConfigArgs() {}

    private TemplateFilterConfigSdpSettingsAdvancedConfigArgs(TemplateFilterConfigSdpSettingsAdvancedConfigArgs $) {
        this.deidentifyTemplate = $.deidentifyTemplate;
        this.inspectTemplate = $.inspectTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateFilterConfigSdpSettingsAdvancedConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateFilterConfigSdpSettingsAdvancedConfigArgs $;

        public Builder() {
            $ = new TemplateFilterConfigSdpSettingsAdvancedConfigArgs();
        }

        public Builder(TemplateFilterConfigSdpSettingsAdvancedConfigArgs defaults) {
            $ = new TemplateFilterConfigSdpSettingsAdvancedConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deidentifyTemplate Optional Sensitive Data Protection Deidentify template resource name.
         * If provided then DeidentifyContent action is performed during Sanitization
         * using this template and inspect template. The De-identified data will
         * be returned in SdpDeidentifyResult.
         * Note that all info-types present in the deidentify template must be present
         * in inspect template.
         * e.g.
         * `projects/{project}/locations/{location}/deidentifyTemplates/{deidentify_template}`
         * 
         * @return builder
         * 
         */
        public Builder deidentifyTemplate(@Nullable Output<String> deidentifyTemplate) {
            $.deidentifyTemplate = deidentifyTemplate;
            return this;
        }

        /**
         * @param deidentifyTemplate Optional Sensitive Data Protection Deidentify template resource name.
         * If provided then DeidentifyContent action is performed during Sanitization
         * using this template and inspect template. The De-identified data will
         * be returned in SdpDeidentifyResult.
         * Note that all info-types present in the deidentify template must be present
         * in inspect template.
         * e.g.
         * `projects/{project}/locations/{location}/deidentifyTemplates/{deidentify_template}`
         * 
         * @return builder
         * 
         */
        public Builder deidentifyTemplate(String deidentifyTemplate) {
            return deidentifyTemplate(Output.of(deidentifyTemplate));
        }

        /**
         * @param inspectTemplate Sensitive Data Protection inspect template resource name
         * If only inspect template is provided (de-identify template not provided),
         * then Sensitive Data Protection InspectContent action is performed during
         * Sanitization. All Sensitive Data Protection findings identified during
         * inspection will be returned as SdpFinding in SdpInsepctionResult.
         * e.g:-
         * `projects/{project}/locations/{location}/inspectTemplates/{inspect_template}`
         * 
         * @return builder
         * 
         */
        public Builder inspectTemplate(@Nullable Output<String> inspectTemplate) {
            $.inspectTemplate = inspectTemplate;
            return this;
        }

        /**
         * @param inspectTemplate Sensitive Data Protection inspect template resource name
         * If only inspect template is provided (de-identify template not provided),
         * then Sensitive Data Protection InspectContent action is performed during
         * Sanitization. All Sensitive Data Protection findings identified during
         * inspection will be returned as SdpFinding in SdpInsepctionResult.
         * e.g:-
         * `projects/{project}/locations/{location}/inspectTemplates/{inspect_template}`
         * 
         * @return builder
         * 
         */
        public Builder inspectTemplate(String inspectTemplate) {
            return inspectTemplate(Output.of(inspectTemplate));
        }

        public TemplateFilterConfigSdpSettingsAdvancedConfigArgs build() {
            return $;
        }
    }

}
