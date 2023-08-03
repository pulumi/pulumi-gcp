// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Monitoring.Inputs
{

    public sealed class AlertPolicyConditionConditionPrometheusQueryLanguageArgs : global::Pulumi.ResourceArgs
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
        [Input("alertRule")]
        public Input<string>? AlertRule { get; set; }

        /// <summary>
        /// Alerts are considered firing once their PromQL expression evaluated
        /// to be "true" for this long. Alerts whose PromQL expression was not
        /// evaluated to be "true" for long enough are considered pending. The
        /// default value is zero. Must be zero or positive.
        /// </summary>
        [Input("duration")]
        public Input<string>? Duration { get; set; }

        /// <summary>
        /// How often this rule should be evaluated. Must be a positive multiple
        /// of 30 seconds or missing. The default value is 30 seconds. If this
        /// PrometheusQueryLanguageCondition was generated from a Prometheus
        /// alerting rule, then this value should be taken from the enclosing
        /// rule group.
        /// </summary>
        [Input("evaluationInterval", required: true)]
        public Input<string> EvaluationInterval { get; set; } = null!;

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Labels to add to or overwrite in the PromQL query result. Label names
        /// must be valid.
        /// Label values can be templatized by using variables. The only available
        /// variable names are the names of the labels in the PromQL result, including
        /// "__name__" and "value". "labels" may be empty. This field is intended to be
        /// used for organizing and identifying the AlertPolicy
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// The PromQL expression to evaluate. Every evaluation cycle this
        /// expression is evaluated at the current time, and all resultant time
        /// series become pending/firing alerts. This field must not be empty.
        /// </summary>
        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

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
        [Input("ruleGroup")]
        public Input<string>? RuleGroup { get; set; }

        public AlertPolicyConditionConditionPrometheusQueryLanguageArgs()
        {
        }
        public static new AlertPolicyConditionConditionPrometheusQueryLanguageArgs Empty => new AlertPolicyConditionConditionPrometheusQueryLanguageArgs();
    }
}