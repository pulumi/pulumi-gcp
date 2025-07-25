// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Billing.Inputs
{

    public sealed class BudgetAmountGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configures a budget amount that is automatically set to 100% of
        /// last period's spend.
        /// Boolean. Set value to true to use. Do not set to false, instead
        /// use the `specified_amount` block.
        /// </summary>
        [Input("lastPeriodAmount")]
        public Input<bool>? LastPeriodAmount { get; set; }

        /// <summary>
        /// A specified amount to use as the budget. currencyCode is
        /// optional. If specified, it must match the currency of the
        /// billing account. The currencyCode is provided on output.
        /// Structure is documented below.
        /// </summary>
        [Input("specifiedAmount")]
        public Input<Inputs.BudgetAmountSpecifiedAmountGetArgs>? SpecifiedAmount { get; set; }

        public BudgetAmountGetArgs()
        {
        }
        public static new BudgetAmountGetArgs Empty => new BudgetAmountGetArgs();
    }
}
