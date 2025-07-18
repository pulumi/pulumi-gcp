// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.binaryauthorization;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.gcp.binaryauthorization.inputs.PolicyAdmissionWhitelistPatternArgs;
import com.pulumi.gcp.binaryauthorization.inputs.PolicyClusterAdmissionRuleArgs;
import com.pulumi.gcp.binaryauthorization.inputs.PolicyDefaultAdmissionRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * A whitelist of image patterns to exclude from admission rules. If an
     * image&#39;s name matches a whitelist pattern, the image&#39;s admission
     * requests will always be permitted regardless of your admission rules.
     * Structure is documented below.
     * 
     */
    @Import(name="admissionWhitelistPatterns")
    private @Nullable Output<List<PolicyAdmissionWhitelistPatternArgs>> admissionWhitelistPatterns;

    /**
     * @return A whitelist of image patterns to exclude from admission rules. If an
     * image&#39;s name matches a whitelist pattern, the image&#39;s admission
     * requests will always be permitted regardless of your admission rules.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<PolicyAdmissionWhitelistPatternArgs>>> admissionWhitelistPatterns() {
        return Optional.ofNullable(this.admissionWhitelistPatterns);
    }

    /**
     * Per-cluster admission rules. An admission rule specifies either that
     * all container images used in a pod creation request must be attested
     * to by one or more attestors, that all pod creations will be allowed,
     * or that all pod creations will be denied. There can be at most one
     * admission rule per cluster spec.
     * 
     * Identifier format: `{{location}}.{{clusterId}}`.
     * A location is either a compute zone (e.g. `us-central1-a`) or a region
     * (e.g. `us-central1`).
     * Structure is documented below.
     * 
     */
    @Import(name="clusterAdmissionRules")
    private @Nullable Output<List<PolicyClusterAdmissionRuleArgs>> clusterAdmissionRules;

    /**
     * @return Per-cluster admission rules. An admission rule specifies either that
     * all container images used in a pod creation request must be attested
     * to by one or more attestors, that all pod creations will be allowed,
     * or that all pod creations will be denied. There can be at most one
     * admission rule per cluster spec.
     * 
     * Identifier format: `{{location}}.{{clusterId}}`.
     * A location is either a compute zone (e.g. `us-central1-a`) or a region
     * (e.g. `us-central1`).
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<PolicyClusterAdmissionRuleArgs>>> clusterAdmissionRules() {
        return Optional.ofNullable(this.clusterAdmissionRules);
    }

    /**
     * Default admission rule for a cluster without a per-cluster admission
     * rule.
     * Structure is documented below.
     * 
     */
    @Import(name="defaultAdmissionRule", required=true)
    private Output<PolicyDefaultAdmissionRuleArgs> defaultAdmissionRule;

    /**
     * @return Default admission rule for a cluster without a per-cluster admission
     * rule.
     * Structure is documented below.
     * 
     */
    public Output<PolicyDefaultAdmissionRuleArgs> defaultAdmissionRule() {
        return this.defaultAdmissionRule;
    }

    /**
     * A descriptive comment.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A descriptive comment.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Controls the evaluation of a Google-maintained global admission policy
     * for common system-level images. Images not covered by the global
     * policy will be subject to the project admission policy.
     * Possible values are: `ENABLE`, `DISABLE`.
     * 
     */
    @Import(name="globalPolicyEvaluationMode")
    private @Nullable Output<String> globalPolicyEvaluationMode;

    /**
     * @return Controls the evaluation of a Google-maintained global admission policy
     * for common system-level images. Images not covered by the global
     * policy will be subject to the project admission policy.
     * Possible values are: `ENABLE`, `DISABLE`.
     * 
     */
    public Optional<Output<String>> globalPolicyEvaluationMode() {
        return Optional.ofNullable(this.globalPolicyEvaluationMode);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private PolicyArgs() {}

    private PolicyArgs(PolicyArgs $) {
        this.admissionWhitelistPatterns = $.admissionWhitelistPatterns;
        this.clusterAdmissionRules = $.clusterAdmissionRules;
        this.defaultAdmissionRule = $.defaultAdmissionRule;
        this.description = $.description;
        this.globalPolicyEvaluationMode = $.globalPolicyEvaluationMode;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyArgs $;

        public Builder() {
            $ = new PolicyArgs();
        }

        public Builder(PolicyArgs defaults) {
            $ = new PolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param admissionWhitelistPatterns A whitelist of image patterns to exclude from admission rules. If an
         * image&#39;s name matches a whitelist pattern, the image&#39;s admission
         * requests will always be permitted regardless of your admission rules.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder admissionWhitelistPatterns(@Nullable Output<List<PolicyAdmissionWhitelistPatternArgs>> admissionWhitelistPatterns) {
            $.admissionWhitelistPatterns = admissionWhitelistPatterns;
            return this;
        }

        /**
         * @param admissionWhitelistPatterns A whitelist of image patterns to exclude from admission rules. If an
         * image&#39;s name matches a whitelist pattern, the image&#39;s admission
         * requests will always be permitted regardless of your admission rules.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder admissionWhitelistPatterns(List<PolicyAdmissionWhitelistPatternArgs> admissionWhitelistPatterns) {
            return admissionWhitelistPatterns(Output.of(admissionWhitelistPatterns));
        }

        /**
         * @param admissionWhitelistPatterns A whitelist of image patterns to exclude from admission rules. If an
         * image&#39;s name matches a whitelist pattern, the image&#39;s admission
         * requests will always be permitted regardless of your admission rules.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder admissionWhitelistPatterns(PolicyAdmissionWhitelistPatternArgs... admissionWhitelistPatterns) {
            return admissionWhitelistPatterns(List.of(admissionWhitelistPatterns));
        }

        /**
         * @param clusterAdmissionRules Per-cluster admission rules. An admission rule specifies either that
         * all container images used in a pod creation request must be attested
         * to by one or more attestors, that all pod creations will be allowed,
         * or that all pod creations will be denied. There can be at most one
         * admission rule per cluster spec.
         * 
         * Identifier format: `{{location}}.{{clusterId}}`.
         * A location is either a compute zone (e.g. `us-central1-a`) or a region
         * (e.g. `us-central1`).
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder clusterAdmissionRules(@Nullable Output<List<PolicyClusterAdmissionRuleArgs>> clusterAdmissionRules) {
            $.clusterAdmissionRules = clusterAdmissionRules;
            return this;
        }

        /**
         * @param clusterAdmissionRules Per-cluster admission rules. An admission rule specifies either that
         * all container images used in a pod creation request must be attested
         * to by one or more attestors, that all pod creations will be allowed,
         * or that all pod creations will be denied. There can be at most one
         * admission rule per cluster spec.
         * 
         * Identifier format: `{{location}}.{{clusterId}}`.
         * A location is either a compute zone (e.g. `us-central1-a`) or a region
         * (e.g. `us-central1`).
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder clusterAdmissionRules(List<PolicyClusterAdmissionRuleArgs> clusterAdmissionRules) {
            return clusterAdmissionRules(Output.of(clusterAdmissionRules));
        }

        /**
         * @param clusterAdmissionRules Per-cluster admission rules. An admission rule specifies either that
         * all container images used in a pod creation request must be attested
         * to by one or more attestors, that all pod creations will be allowed,
         * or that all pod creations will be denied. There can be at most one
         * admission rule per cluster spec.
         * 
         * Identifier format: `{{location}}.{{clusterId}}`.
         * A location is either a compute zone (e.g. `us-central1-a`) or a region
         * (e.g. `us-central1`).
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder clusterAdmissionRules(PolicyClusterAdmissionRuleArgs... clusterAdmissionRules) {
            return clusterAdmissionRules(List.of(clusterAdmissionRules));
        }

        /**
         * @param defaultAdmissionRule Default admission rule for a cluster without a per-cluster admission
         * rule.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder defaultAdmissionRule(Output<PolicyDefaultAdmissionRuleArgs> defaultAdmissionRule) {
            $.defaultAdmissionRule = defaultAdmissionRule;
            return this;
        }

        /**
         * @param defaultAdmissionRule Default admission rule for a cluster without a per-cluster admission
         * rule.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder defaultAdmissionRule(PolicyDefaultAdmissionRuleArgs defaultAdmissionRule) {
            return defaultAdmissionRule(Output.of(defaultAdmissionRule));
        }

        /**
         * @param description A descriptive comment.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A descriptive comment.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param globalPolicyEvaluationMode Controls the evaluation of a Google-maintained global admission policy
         * for common system-level images. Images not covered by the global
         * policy will be subject to the project admission policy.
         * Possible values are: `ENABLE`, `DISABLE`.
         * 
         * @return builder
         * 
         */
        public Builder globalPolicyEvaluationMode(@Nullable Output<String> globalPolicyEvaluationMode) {
            $.globalPolicyEvaluationMode = globalPolicyEvaluationMode;
            return this;
        }

        /**
         * @param globalPolicyEvaluationMode Controls the evaluation of a Google-maintained global admission policy
         * for common system-level images. Images not covered by the global
         * policy will be subject to the project admission policy.
         * Possible values are: `ENABLE`, `DISABLE`.
         * 
         * @return builder
         * 
         */
        public Builder globalPolicyEvaluationMode(String globalPolicyEvaluationMode) {
            return globalPolicyEvaluationMode(Output.of(globalPolicyEvaluationMode));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public PolicyArgs build() {
            if ($.defaultAdmissionRule == null) {
                throw new MissingRequiredPropertyException("PolicyArgs", "defaultAdmissionRule");
            }
            return $;
        }
    }

}
