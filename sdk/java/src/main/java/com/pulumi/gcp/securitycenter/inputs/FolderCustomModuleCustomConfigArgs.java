// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigCustomOutputArgs;
import com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigPredicateArgs;
import com.pulumi.gcp.securitycenter.inputs.FolderCustomModuleCustomConfigResourceSelectorArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FolderCustomModuleCustomConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FolderCustomModuleCustomConfigArgs Empty = new FolderCustomModuleCustomConfigArgs();

    /**
     * Custom output properties.
     * Structure is documented below.
     * 
     */
    @Import(name="customOutput")
    private @Nullable Output<FolderCustomModuleCustomConfigCustomOutputArgs> customOutput;

    /**
     * @return Custom output properties.
     * Structure is documented below.
     * 
     */
    public Optional<Output<FolderCustomModuleCustomConfigCustomOutputArgs>> customOutput() {
        return Optional.ofNullable(this.customOutput);
    }

    /**
     * Text that describes the vulnerability or misconfiguration that the custom
     * module detects. This explanation is returned with each finding instance to
     * help investigators understand the detected issue. The text must be enclosed in quotation marks.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Text that describes the vulnerability or misconfiguration that the custom
     * module detects. This explanation is returned with each finding instance to
     * help investigators understand the detected issue. The text must be enclosed in quotation marks.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The CEL expression to evaluate to produce findings. When the expression evaluates
     * to true against a resource, a finding is generated.
     * Structure is documented below.
     * 
     */
    @Import(name="predicate", required=true)
    private Output<FolderCustomModuleCustomConfigPredicateArgs> predicate;

    /**
     * @return The CEL expression to evaluate to produce findings. When the expression evaluates
     * to true against a resource, a finding is generated.
     * Structure is documented below.
     * 
     */
    public Output<FolderCustomModuleCustomConfigPredicateArgs> predicate() {
        return this.predicate;
    }

    /**
     * An explanation of the recommended steps that security teams can take to resolve
     * the detected issue. This explanation is returned with each finding generated by
     * this module in the nextSteps property of the finding JSON.
     * 
     */
    @Import(name="recommendation", required=true)
    private Output<String> recommendation;

    /**
     * @return An explanation of the recommended steps that security teams can take to resolve
     * the detected issue. This explanation is returned with each finding generated by
     * this module in the nextSteps property of the finding JSON.
     * 
     */
    public Output<String> recommendation() {
        return this.recommendation;
    }

    /**
     * The resource types that the custom module operates on. Each custom module
     * can specify up to 5 resource types.
     * Structure is documented below.
     * 
     */
    @Import(name="resourceSelector", required=true)
    private Output<FolderCustomModuleCustomConfigResourceSelectorArgs> resourceSelector;

    /**
     * @return The resource types that the custom module operates on. Each custom module
     * can specify up to 5 resource types.
     * Structure is documented below.
     * 
     */
    public Output<FolderCustomModuleCustomConfigResourceSelectorArgs> resourceSelector() {
        return this.resourceSelector;
    }

    /**
     * The severity to assign to findings generated by the module.
     * Possible values are: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`.
     * 
     */
    @Import(name="severity", required=true)
    private Output<String> severity;

    /**
     * @return The severity to assign to findings generated by the module.
     * Possible values are: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`.
     * 
     */
    public Output<String> severity() {
        return this.severity;
    }

    private FolderCustomModuleCustomConfigArgs() {}

    private FolderCustomModuleCustomConfigArgs(FolderCustomModuleCustomConfigArgs $) {
        this.customOutput = $.customOutput;
        this.description = $.description;
        this.predicate = $.predicate;
        this.recommendation = $.recommendation;
        this.resourceSelector = $.resourceSelector;
        this.severity = $.severity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FolderCustomModuleCustomConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FolderCustomModuleCustomConfigArgs $;

        public Builder() {
            $ = new FolderCustomModuleCustomConfigArgs();
        }

        public Builder(FolderCustomModuleCustomConfigArgs defaults) {
            $ = new FolderCustomModuleCustomConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customOutput Custom output properties.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder customOutput(@Nullable Output<FolderCustomModuleCustomConfigCustomOutputArgs> customOutput) {
            $.customOutput = customOutput;
            return this;
        }

        /**
         * @param customOutput Custom output properties.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder customOutput(FolderCustomModuleCustomConfigCustomOutputArgs customOutput) {
            return customOutput(Output.of(customOutput));
        }

        /**
         * @param description Text that describes the vulnerability or misconfiguration that the custom
         * module detects. This explanation is returned with each finding instance to
         * help investigators understand the detected issue. The text must be enclosed in quotation marks.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Text that describes the vulnerability or misconfiguration that the custom
         * module detects. This explanation is returned with each finding instance to
         * help investigators understand the detected issue. The text must be enclosed in quotation marks.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param predicate The CEL expression to evaluate to produce findings. When the expression evaluates
         * to true against a resource, a finding is generated.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder predicate(Output<FolderCustomModuleCustomConfigPredicateArgs> predicate) {
            $.predicate = predicate;
            return this;
        }

        /**
         * @param predicate The CEL expression to evaluate to produce findings. When the expression evaluates
         * to true against a resource, a finding is generated.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder predicate(FolderCustomModuleCustomConfigPredicateArgs predicate) {
            return predicate(Output.of(predicate));
        }

        /**
         * @param recommendation An explanation of the recommended steps that security teams can take to resolve
         * the detected issue. This explanation is returned with each finding generated by
         * this module in the nextSteps property of the finding JSON.
         * 
         * @return builder
         * 
         */
        public Builder recommendation(Output<String> recommendation) {
            $.recommendation = recommendation;
            return this;
        }

        /**
         * @param recommendation An explanation of the recommended steps that security teams can take to resolve
         * the detected issue. This explanation is returned with each finding generated by
         * this module in the nextSteps property of the finding JSON.
         * 
         * @return builder
         * 
         */
        public Builder recommendation(String recommendation) {
            return recommendation(Output.of(recommendation));
        }

        /**
         * @param resourceSelector The resource types that the custom module operates on. Each custom module
         * can specify up to 5 resource types.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder resourceSelector(Output<FolderCustomModuleCustomConfigResourceSelectorArgs> resourceSelector) {
            $.resourceSelector = resourceSelector;
            return this;
        }

        /**
         * @param resourceSelector The resource types that the custom module operates on. Each custom module
         * can specify up to 5 resource types.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder resourceSelector(FolderCustomModuleCustomConfigResourceSelectorArgs resourceSelector) {
            return resourceSelector(Output.of(resourceSelector));
        }

        /**
         * @param severity The severity to assign to findings generated by the module.
         * Possible values are: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`.
         * 
         * @return builder
         * 
         */
        public Builder severity(Output<String> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity The severity to assign to findings generated by the module.
         * Possible values are: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`.
         * 
         * @return builder
         * 
         */
        public Builder severity(String severity) {
            return severity(Output.of(severity));
        }

        public FolderCustomModuleCustomConfigArgs build() {
            $.predicate = Objects.requireNonNull($.predicate, "expected parameter 'predicate' to be non-null");
            $.recommendation = Objects.requireNonNull($.recommendation, "expected parameter 'recommendation' to be non-null");
            $.resourceSelector = Objects.requireNonNull($.resourceSelector, "expected parameter 'resourceSelector' to be non-null");
            $.severity = Objects.requireNonNull($.severity, "expected parameter 'severity' to be non-null");
            return $;
        }
    }

}