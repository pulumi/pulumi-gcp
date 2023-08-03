// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Outputs
{

    [OutputType]
    public sealed class DatascanExecutionSpec
    {
        /// <summary>
        /// The unnested field (of type Date or Timestamp) that contains values which monotonically increase over time. If not specified, a data scan will run for all data in the table.
        /// </summary>
        public readonly string? Field;
        /// <summary>
        /// Spec related to how often and when a scan should be triggered.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.DatascanExecutionSpecTrigger Trigger;

        [OutputConstructor]
        private DatascanExecutionSpec(
            string? field,

            Outputs.DatascanExecutionSpecTrigger trigger)
        {
            Field = field;
            Trigger = trigger;
        }
    }
}