// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeBackup.Outputs
{

    [OutputType]
    public sealed class RestorePlanRestoreConfigTransformationRule
    {
        /// <summary>
        /// The description is a user specified string description
        /// of the transformation rule.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// A list of transformation rule actions to take against candidate
        /// resources. Actions are executed in order defined - this order
        /// matters, as they could potentially interfere with each other and
        /// the first operation could affect the outcome of the second operation.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.RestorePlanRestoreConfigTransformationRuleFieldAction> FieldActions;
        /// <summary>
        /// This field is used to specify a set of fields that should be used to
        /// determine which resources in backup should be acted upon by the
        /// supplied transformation rule actions, and this will ensure that only
        /// specific resources are affected by transformation rule actions.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.RestorePlanRestoreConfigTransformationRuleResourceFilter? ResourceFilter;

        [OutputConstructor]
        private RestorePlanRestoreConfigTransformationRule(
            string? description,

            ImmutableArray<Outputs.RestorePlanRestoreConfigTransformationRuleFieldAction> fieldActions,

            Outputs.RestorePlanRestoreConfigTransformationRuleResourceFilter? resourceFilter)
        {
            Description = description;
            FieldActions = fieldActions;
            ResourceFilter = resourceFilter;
        }
    }
}