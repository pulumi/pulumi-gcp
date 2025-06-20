// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionInspectTemplateInspectConfigRuleSetGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("infoTypes", required: true)]
        private InputList<Inputs.PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs>? _infoTypes;

        /// <summary>
        /// List of infoTypes this rule set is applied to.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs> InfoTypes
        {
            get => _infoTypes ?? (_infoTypes = new InputList<Inputs.PreventionInspectTemplateInspectConfigRuleSetInfoTypeGetArgs>());
            set => _infoTypes = value;
        }

        [Input("rules", required: true)]
        private InputList<Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs>? _rules;

        /// <summary>
        /// Set of rules to be applied to infoTypes. The rules are applied in order.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleGetArgs>());
            set => _rules = value;
        }

        public PreventionInspectTemplateInspectConfigRuleSetGetArgs()
        {
        }
        public static new PreventionInspectTemplateInspectConfigRuleSetGetArgs Empty => new PreventionInspectTemplateInspectConfigRuleSetGetArgs();
    }
}
