// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Inputs
{

    public sealed class DatascanDataQualityResultRuleRuleSetExpectationArgs : global::Pulumi.ResourceArgs
    {
        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// Expected values for the column value.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public DatascanDataQualityResultRuleRuleSetExpectationArgs()
        {
        }
        public static new DatascanDataQualityResultRuleRuleSetExpectationArgs Empty => new DatascanDataQualityResultRuleRuleSetExpectationArgs();
    }
}