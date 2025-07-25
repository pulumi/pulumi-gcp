// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Outputs
{

    [OutputType]
    public sealed class PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoType
    {
        /// <summary>
        /// Name of the information type.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Optional custom sensitivity for this InfoType. This only applies to data profiling.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeSensitivityScore? SensitivityScore;
        /// <summary>
        /// Version name for this InfoType.
        /// </summary>
        public readonly string? Version;

        [OutputConstructor]
        private PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoType(
            string name,

            Outputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeSensitivityScore? sensitivityScore,

            string? version)
        {
            Name = name;
            SensitivityScore = sensitivityScore;
            Version = version;
        }
    }
}
