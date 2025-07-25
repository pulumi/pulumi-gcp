// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.modelarmor.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TemplateFilterConfigSdpSettingsAdvancedConfig {
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
    private @Nullable String deidentifyTemplate;
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
    private @Nullable String inspectTemplate;

    private TemplateFilterConfigSdpSettingsAdvancedConfig() {}
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
    public Optional<String> deidentifyTemplate() {
        return Optional.ofNullable(this.deidentifyTemplate);
    }
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
    public Optional<String> inspectTemplate() {
        return Optional.ofNullable(this.inspectTemplate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateFilterConfigSdpSettingsAdvancedConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String deidentifyTemplate;
        private @Nullable String inspectTemplate;
        public Builder() {}
        public Builder(TemplateFilterConfigSdpSettingsAdvancedConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deidentifyTemplate = defaults.deidentifyTemplate;
    	      this.inspectTemplate = defaults.inspectTemplate;
        }

        @CustomType.Setter
        public Builder deidentifyTemplate(@Nullable String deidentifyTemplate) {

            this.deidentifyTemplate = deidentifyTemplate;
            return this;
        }
        @CustomType.Setter
        public Builder inspectTemplate(@Nullable String inspectTemplate) {

            this.inspectTemplate = inspectTemplate;
            return this;
        }
        public TemplateFilterConfigSdpSettingsAdvancedConfig build() {
            final var _resultValue = new TemplateFilterConfigSdpSettingsAdvancedConfig();
            _resultValue.deidentifyTemplate = deidentifyTemplate;
            _resultValue.inspectTemplate = inspectTemplate;
            return _resultValue;
        }
    }
}
