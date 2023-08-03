// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Monitoring.Outputs
{

    [OutputType]
    public sealed class AlertPolicyConditionConditionPrometheusQueryLanguage
    {
        /// <summary>
        /// The alerting rule name of this alert in the corresponding Prometheus
        /// configuration file.
        /// Some external tools may require this field to be populated correctly
        /// in order to refer to the original Prometheus configuration file.
        /// The rule group name and the alert name are necessary to update the
        /// relevant AlertPolicies in case the definition of the rule group changes
        /// in the future.
        /// This field is optional. If this field is not empty, then it must be a
        /// valid Prometheus label name.
        /// 
        /// - - -
        /// </summary>
        public readonly string? AlertRule;
        /// <summary>
        /// Alerts are considered firing once their PromQL expression evaluated
        /// to be "true" for this long. Alerts whose PromQL expression was not
        /// evaluated to be "true" for long enough are considered pending. The
        /// default value is zero. Must be zero or positive.
        /// </summary>
        public readonly string? Duration;
        /// <summary>
        /// How often this rule should be evaluated. Must be a positive multiple
        /// of 30 seconds or missing. The default value is 30 seconds. If this
        /// PrometheusQueryLanguageCondition was generated from a Prometheus
        /// alerting rule, then this value should be taken from the enclosing
        /// rule group.
        /// </summary>
        public readonly string EvaluationInterval;
        /// <summary>
        /// Labels to add to or overwrite in the PromQL query result. Label names
        /// must be valid.
        /// Label values can be templatized by using variables. The only available
        /// variable names are the names of the labels in the PromQL result, including
        /// "__name__" and "value". "labels" may be empty. This field is intended to be
        /// used for organizing and identifying the AlertPolicy
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Labels;
        /// <summary>
        /// The PromQL expression to evaluate. Every evaluation cycle this
        /// expression is evaluated at the current time, and all resultant time
        /// series become pending/firing alerts. This field must not be empty.
        /// </summary>
        public readonly string Query;
        /// <summary>
        /// The rule group name of this alert in the corresponding Prometheus
        /// configuration file.
        /// Some external tools may require this field to be populated correctly
        /// in order to refer to the original Prometheus configuration file.
        /// The rule group name and the alert name are necessary to update the
        /// relevant AlertPolicies in case the definition of the rule group changes
        /// in the future.
        /// This field is optional. If this field is not empty, then it must be a
        /// valid Prometheus label name.
        /// </summary>
        public readonly string? RuleGroup;

        [OutputConstructor]
        private AlertPolicyConditionConditionPrometheusQueryLanguage(
            string? alertRule,

            string? duration,

            string evaluationInterval,

            ImmutableDictionary<string, string>? labels,

            string query,

            string? ruleGroup)
        {
            AlertRule = alertRule;
            Duration = duration;
            EvaluationInterval = evaluationInterval;
            Labels = labels;
            Query = query;
            RuleGroup = ruleGroup;
        }
    }
}