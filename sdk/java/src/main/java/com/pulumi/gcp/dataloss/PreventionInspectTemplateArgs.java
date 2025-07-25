// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateArgs Empty = new PreventionInspectTemplateArgs();

    /**
     * A description of the inspect template.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the inspect template.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User set display name of the inspect template.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return User set display name of the inspect template.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The core content of the template.
     * Structure is documented below.
     * 
     */
    @Import(name="inspectConfig")
    private @Nullable Output<PreventionInspectTemplateInspectConfigArgs> inspectConfig;

    /**
     * @return The core content of the template.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionInspectTemplateInspectConfigArgs>> inspectConfig() {
        return Optional.ofNullable(this.inspectConfig);
    }

    /**
     * The parent of the inspect template in any of the following formats:
     * * `projects/{{project}}`
     * * `projects/{{project}}/locations/{{location}}`
     * * `organizations/{{organization_id}}`
     * * `organizations/{{organization_id}}/locations/{{location}}`
     * 
     */
    @Import(name="parent", required=true)
    private Output<String> parent;

    /**
     * @return The parent of the inspect template in any of the following formats:
     * * `projects/{{project}}`
     * * `projects/{{project}}/locations/{{location}}`
     * * `organizations/{{organization_id}}`
     * * `organizations/{{organization_id}}/locations/{{location}}`
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }

    /**
     * The template id can contain uppercase and lowercase letters, numbers, and hyphens;
     * that is, it must match the regular expression: [a-zA-Z\d-_]+. The maximum length is
     * 100 characters. Can be empty to allow the system to generate one.
     * 
     */
    @Import(name="templateId")
    private @Nullable Output<String> templateId;

    /**
     * @return The template id can contain uppercase and lowercase letters, numbers, and hyphens;
     * that is, it must match the regular expression: [a-zA-Z\d-_]+. The maximum length is
     * 100 characters. Can be empty to allow the system to generate one.
     * 
     */
    public Optional<Output<String>> templateId() {
        return Optional.ofNullable(this.templateId);
    }

    private PreventionInspectTemplateArgs() {}

    private PreventionInspectTemplateArgs(PreventionInspectTemplateArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.inspectConfig = $.inspectConfig;
        this.parent = $.parent;
        this.templateId = $.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionInspectTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionInspectTemplateArgs $;

        public Builder() {
            $ = new PreventionInspectTemplateArgs();
        }

        public Builder(PreventionInspectTemplateArgs defaults) {
            $ = new PreventionInspectTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the inspect template.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the inspect template.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName User set display name of the inspect template.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName User set display name of the inspect template.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param inspectConfig The core content of the template.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder inspectConfig(@Nullable Output<PreventionInspectTemplateInspectConfigArgs> inspectConfig) {
            $.inspectConfig = inspectConfig;
            return this;
        }

        /**
         * @param inspectConfig The core content of the template.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder inspectConfig(PreventionInspectTemplateInspectConfigArgs inspectConfig) {
            return inspectConfig(Output.of(inspectConfig));
        }

        /**
         * @param parent The parent of the inspect template in any of the following formats:
         * * `projects/{{project}}`
         * * `projects/{{project}}/locations/{{location}}`
         * * `organizations/{{organization_id}}`
         * * `organizations/{{organization_id}}/locations/{{location}}`
         * 
         * @return builder
         * 
         */
        public Builder parent(Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent The parent of the inspect template in any of the following formats:
         * * `projects/{{project}}`
         * * `projects/{{project}}/locations/{{location}}`
         * * `organizations/{{organization_id}}`
         * * `organizations/{{organization_id}}/locations/{{location}}`
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        /**
         * @param templateId The template id can contain uppercase and lowercase letters, numbers, and hyphens;
         * that is, it must match the regular expression: [a-zA-Z\d-_]+. The maximum length is
         * 100 characters. Can be empty to allow the system to generate one.
         * 
         * @return builder
         * 
         */
        public Builder templateId(@Nullable Output<String> templateId) {
            $.templateId = templateId;
            return this;
        }

        /**
         * @param templateId The template id can contain uppercase and lowercase letters, numbers, and hyphens;
         * that is, it must match the regular expression: [a-zA-Z\d-_]+. The maximum length is
         * 100 characters. Can be empty to allow the system to generate one.
         * 
         * @return builder
         * 
         */
        public Builder templateId(String templateId) {
            return templateId(Output.of(templateId));
        }

        public PreventionInspectTemplateArgs build() {
            if ($.parent == null) {
                throw new MissingRequiredPropertyException("PreventionInspectTemplateArgs", "parent");
            }
            return $;
        }
    }

}
