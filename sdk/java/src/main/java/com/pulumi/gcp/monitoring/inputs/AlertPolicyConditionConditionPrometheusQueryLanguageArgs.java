// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertPolicyConditionConditionPrometheusQueryLanguageArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertPolicyConditionConditionPrometheusQueryLanguageArgs Empty = new AlertPolicyConditionConditionPrometheusQueryLanguageArgs();

    /**
     * The alerting rule name of this alert in the corresponding Prometheus
     * configuration file.
     * Some external tools may require this field to be populated correctly
     * in order to refer to the original Prometheus configuration file.
     * The rule group name and the alert name are necessary to update the
     * relevant AlertPolicies in case the definition of the rule group changes
     * in the future.
     * This field is optional. If this field is not empty, then it must be a
     * valid Prometheus label name.
     * 
     */
    @Import(name="alertRule")
    private @Nullable Output<String> alertRule;

    /**
     * @return The alerting rule name of this alert in the corresponding Prometheus
     * configuration file.
     * Some external tools may require this field to be populated correctly
     * in order to refer to the original Prometheus configuration file.
     * The rule group name and the alert name are necessary to update the
     * relevant AlertPolicies in case the definition of the rule group changes
     * in the future.
     * This field is optional. If this field is not empty, then it must be a
     * valid Prometheus label name.
     * 
     */
    public Optional<Output<String>> alertRule() {
        return Optional.ofNullable(this.alertRule);
    }

    @Import(name="disableMetricValidation")
    private @Nullable Output<Boolean> disableMetricValidation;

    public Optional<Output<Boolean>> disableMetricValidation() {
        return Optional.ofNullable(this.disableMetricValidation);
    }

    /**
     * Alerts are considered firing once their PromQL expression evaluated
     * to be &#34;true&#34; for this long. Alerts whose PromQL expression was not
     * evaluated to be &#34;true&#34; for long enough are considered pending. The
     * default value is zero. Must be zero or positive.
     * 
     */
    @Import(name="duration")
    private @Nullable Output<String> duration;

    /**
     * @return Alerts are considered firing once their PromQL expression evaluated
     * to be &#34;true&#34; for this long. Alerts whose PromQL expression was not
     * evaluated to be &#34;true&#34; for long enough are considered pending. The
     * default value is zero. Must be zero or positive.
     * 
     */
    public Optional<Output<String>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * How often this rule should be evaluated. Must be a positive multiple
     * of 30 seconds or missing. The default value is 30 seconds. If this
     * PrometheusQueryLanguageCondition was generated from a Prometheus
     * alerting rule, then this value should be taken from the enclosing
     * rule group.
     * 
     */
    @Import(name="evaluationInterval")
    private @Nullable Output<String> evaluationInterval;

    /**
     * @return How often this rule should be evaluated. Must be a positive multiple
     * of 30 seconds or missing. The default value is 30 seconds. If this
     * PrometheusQueryLanguageCondition was generated from a Prometheus
     * alerting rule, then this value should be taken from the enclosing
     * rule group.
     * 
     */
    public Optional<Output<String>> evaluationInterval() {
        return Optional.ofNullable(this.evaluationInterval);
    }

    /**
     * Labels to add to or overwrite in the PromQL query result. Label names
     * must be valid.
     * Label values can be templatized by using variables. The only available
     * variable names are the names of the labels in the PromQL result,
     * although label names beginning with \_\_ (two &#34;\_&#34;) are reserved for
     * internal use. &#34;labels&#34; may be empty. This field is intended to be used
     * for organizing and identifying the AlertPolicy.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels to add to or overwrite in the PromQL query result. Label names
     * must be valid.
     * Label values can be templatized by using variables. The only available
     * variable names are the names of the labels in the PromQL result,
     * although label names beginning with \_\_ (two &#34;\_&#34;) are reserved for
     * internal use. &#34;labels&#34; may be empty. This field is intended to be used
     * for organizing and identifying the AlertPolicy.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The PromQL expression to evaluate. Every evaluation cycle this
     * expression is evaluated at the current time, and all resultant time
     * series become pending/firing alerts. This field must not be empty.
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    /**
     * @return The PromQL expression to evaluate. Every evaluation cycle this
     * expression is evaluated at the current time, and all resultant time
     * series become pending/firing alerts. This field must not be empty.
     * 
     */
    public Output<String> query() {
        return this.query;
    }

    /**
     * The rule group name of this alert in the corresponding Prometheus
     * configuration file.
     * Some external tools may require this field to be populated correctly
     * in order to refer to the original Prometheus configuration file.
     * The rule group name and the alert name are necessary to update the
     * relevant AlertPolicies in case the definition of the rule group changes
     * in the future. This field is optional.
     * 
     */
    @Import(name="ruleGroup")
    private @Nullable Output<String> ruleGroup;

    /**
     * @return The rule group name of this alert in the corresponding Prometheus
     * configuration file.
     * Some external tools may require this field to be populated correctly
     * in order to refer to the original Prometheus configuration file.
     * The rule group name and the alert name are necessary to update the
     * relevant AlertPolicies in case the definition of the rule group changes
     * in the future. This field is optional.
     * 
     */
    public Optional<Output<String>> ruleGroup() {
        return Optional.ofNullable(this.ruleGroup);
    }

    private AlertPolicyConditionConditionPrometheusQueryLanguageArgs() {}

    private AlertPolicyConditionConditionPrometheusQueryLanguageArgs(AlertPolicyConditionConditionPrometheusQueryLanguageArgs $) {
        this.alertRule = $.alertRule;
        this.disableMetricValidation = $.disableMetricValidation;
        this.duration = $.duration;
        this.evaluationInterval = $.evaluationInterval;
        this.labels = $.labels;
        this.query = $.query;
        this.ruleGroup = $.ruleGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertPolicyConditionConditionPrometheusQueryLanguageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertPolicyConditionConditionPrometheusQueryLanguageArgs $;

        public Builder() {
            $ = new AlertPolicyConditionConditionPrometheusQueryLanguageArgs();
        }

        public Builder(AlertPolicyConditionConditionPrometheusQueryLanguageArgs defaults) {
            $ = new AlertPolicyConditionConditionPrometheusQueryLanguageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertRule The alerting rule name of this alert in the corresponding Prometheus
         * configuration file.
         * Some external tools may require this field to be populated correctly
         * in order to refer to the original Prometheus configuration file.
         * The rule group name and the alert name are necessary to update the
         * relevant AlertPolicies in case the definition of the rule group changes
         * in the future.
         * This field is optional. If this field is not empty, then it must be a
         * valid Prometheus label name.
         * 
         * @return builder
         * 
         */
        public Builder alertRule(@Nullable Output<String> alertRule) {
            $.alertRule = alertRule;
            return this;
        }

        /**
         * @param alertRule The alerting rule name of this alert in the corresponding Prometheus
         * configuration file.
         * Some external tools may require this field to be populated correctly
         * in order to refer to the original Prometheus configuration file.
         * The rule group name and the alert name are necessary to update the
         * relevant AlertPolicies in case the definition of the rule group changes
         * in the future.
         * This field is optional. If this field is not empty, then it must be a
         * valid Prometheus label name.
         * 
         * @return builder
         * 
         */
        public Builder alertRule(String alertRule) {
            return alertRule(Output.of(alertRule));
        }

        public Builder disableMetricValidation(@Nullable Output<Boolean> disableMetricValidation) {
            $.disableMetricValidation = disableMetricValidation;
            return this;
        }

        public Builder disableMetricValidation(Boolean disableMetricValidation) {
            return disableMetricValidation(Output.of(disableMetricValidation));
        }

        /**
         * @param duration Alerts are considered firing once their PromQL expression evaluated
         * to be &#34;true&#34; for this long. Alerts whose PromQL expression was not
         * evaluated to be &#34;true&#34; for long enough are considered pending. The
         * default value is zero. Must be zero or positive.
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration Alerts are considered firing once their PromQL expression evaluated
         * to be &#34;true&#34; for this long. Alerts whose PromQL expression was not
         * evaluated to be &#34;true&#34; for long enough are considered pending. The
         * default value is zero. Must be zero or positive.
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param evaluationInterval How often this rule should be evaluated. Must be a positive multiple
         * of 30 seconds or missing. The default value is 30 seconds. If this
         * PrometheusQueryLanguageCondition was generated from a Prometheus
         * alerting rule, then this value should be taken from the enclosing
         * rule group.
         * 
         * @return builder
         * 
         */
        public Builder evaluationInterval(@Nullable Output<String> evaluationInterval) {
            $.evaluationInterval = evaluationInterval;
            return this;
        }

        /**
         * @param evaluationInterval How often this rule should be evaluated. Must be a positive multiple
         * of 30 seconds or missing. The default value is 30 seconds. If this
         * PrometheusQueryLanguageCondition was generated from a Prometheus
         * alerting rule, then this value should be taken from the enclosing
         * rule group.
         * 
         * @return builder
         * 
         */
        public Builder evaluationInterval(String evaluationInterval) {
            return evaluationInterval(Output.of(evaluationInterval));
        }

        /**
         * @param labels Labels to add to or overwrite in the PromQL query result. Label names
         * must be valid.
         * Label values can be templatized by using variables. The only available
         * variable names are the names of the labels in the PromQL result,
         * although label names beginning with \_\_ (two &#34;\_&#34;) are reserved for
         * internal use. &#34;labels&#34; may be empty. This field is intended to be used
         * for organizing and identifying the AlertPolicy.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels to add to or overwrite in the PromQL query result. Label names
         * must be valid.
         * Label values can be templatized by using variables. The only available
         * variable names are the names of the labels in the PromQL result,
         * although label names beginning with \_\_ (two &#34;\_&#34;) are reserved for
         * internal use. &#34;labels&#34; may be empty. This field is intended to be used
         * for organizing and identifying the AlertPolicy.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param query The PromQL expression to evaluate. Every evaluation cycle this
         * expression is evaluated at the current time, and all resultant time
         * series become pending/firing alerts. This field must not be empty.
         * 
         * @return builder
         * 
         */
        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query The PromQL expression to evaluate. Every evaluation cycle this
         * expression is evaluated at the current time, and all resultant time
         * series become pending/firing alerts. This field must not be empty.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param ruleGroup The rule group name of this alert in the corresponding Prometheus
         * configuration file.
         * Some external tools may require this field to be populated correctly
         * in order to refer to the original Prometheus configuration file.
         * The rule group name and the alert name are necessary to update the
         * relevant AlertPolicies in case the definition of the rule group changes
         * in the future. This field is optional.
         * 
         * @return builder
         * 
         */
        public Builder ruleGroup(@Nullable Output<String> ruleGroup) {
            $.ruleGroup = ruleGroup;
            return this;
        }

        /**
         * @param ruleGroup The rule group name of this alert in the corresponding Prometheus
         * configuration file.
         * Some external tools may require this field to be populated correctly
         * in order to refer to the original Prometheus configuration file.
         * The rule group name and the alert name are necessary to update the
         * relevant AlertPolicies in case the definition of the rule group changes
         * in the future. This field is optional.
         * 
         * @return builder
         * 
         */
        public Builder ruleGroup(String ruleGroup) {
            return ruleGroup(Output.of(ruleGroup));
        }

        public AlertPolicyConditionConditionPrometheusQueryLanguageArgs build() {
            if ($.query == null) {
                throw new MissingRequiredPropertyException("AlertPolicyConditionConditionPrometheusQueryLanguageArgs", "query");
            }
            return $;
        }
    }

}
