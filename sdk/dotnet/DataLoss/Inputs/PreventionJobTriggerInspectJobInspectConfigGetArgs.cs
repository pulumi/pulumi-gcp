// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionJobTriggerInspectJobInspectConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("customInfoTypes")]
        private InputList<Inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeGetArgs>? _customInfoTypes;

        /// <summary>
        /// Custom info types to be used. See https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeGetArgs> CustomInfoTypes
        {
            get => _customInfoTypes ?? (_customInfoTypes = new InputList<Inputs.PreventionJobTriggerInspectJobInspectConfigCustomInfoTypeGetArgs>());
            set => _customInfoTypes = value;
        }

        /// <summary>
        /// When true, excludes type information of the findings.
        /// </summary>
        [Input("excludeInfoTypes")]
        public Input<bool>? ExcludeInfoTypes { get; set; }

        /// <summary>
        /// When true, a contextual quote from the data that triggered a finding is included in the response.
        /// </summary>
        [Input("includeQuote")]
        public Input<bool>? IncludeQuote { get; set; }

        [Input("infoTypes")]
        private InputList<Inputs.PreventionJobTriggerInspectJobInspectConfigInfoTypeGetArgs>? _infoTypes;

        /// <summary>
        /// Restricts what infoTypes to look for. The values must correspond to InfoType values returned by infoTypes.list
        /// or listed at https://cloud.google.com/dlp/docs/infotypes-reference.
        /// When no InfoTypes or CustomInfoTypes are specified in a request, the system may automatically choose what detectors to run.
        /// By default this may be all types, but may change over time as detectors are updated.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionJobTriggerInspectJobInspectConfigInfoTypeGetArgs> InfoTypes
        {
            get => _infoTypes ?? (_infoTypes = new InputList<Inputs.PreventionJobTriggerInspectJobInspectConfigInfoTypeGetArgs>());
            set => _infoTypes = value;
        }

        /// <summary>
        /// Configuration to control the number of findings returned.
        /// Structure is documented below.
        /// </summary>
        [Input("limits")]
        public Input<Inputs.PreventionJobTriggerInspectJobInspectConfigLimitsGetArgs>? Limits { get; set; }

        /// <summary>
        /// Only returns findings equal or above this threshold. See https://cloud.google.com/dlp/docs/likelihood for more info
        /// Default value is `POSSIBLE`.
        /// Possible values are: `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, `VERY_LIKELY`.
        /// </summary>
        [Input("minLikelihood")]
        public Input<string>? MinLikelihood { get; set; }

        [Input("ruleSets")]
        private InputList<Inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetGetArgs>? _ruleSets;

        /// <summary>
        /// Set of rules to apply to the findings for this InspectConfig. Exclusion rules, contained in the set are executed in the end,
        /// other rules are executed in the order they are specified for each info type.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetGetArgs> RuleSets
        {
            get => _ruleSets ?? (_ruleSets = new InputList<Inputs.PreventionJobTriggerInspectJobInspectConfigRuleSetGetArgs>());
            set => _ruleSets = value;
        }

        public PreventionJobTriggerInspectJobInspectConfigGetArgs()
        {
        }
        public static new PreventionJobTriggerInspectJobInspectConfigGetArgs Empty => new PreventionJobTriggerInspectJobInspectConfigGetArgs();
    }
}