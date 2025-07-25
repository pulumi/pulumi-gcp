// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeBackup.Outputs
{

    [OutputType]
    public sealed class RestorePlanRestoreConfigTransformationRuleResourceFilter
    {
        /// <summary>
        /// (Filtering parameter) Any resource subject to transformation must
        /// belong to one of the listed "types". If this field is not provided,
        /// no type filtering will be performed
        /// (all resources of all types matching previous filtering parameters
        /// will be candidates for transformation).
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.RestorePlanRestoreConfigTransformationRuleResourceFilterGroupKind> GroupKinds;
        /// <summary>
        /// This is a JSONPath expression that matches specific fields of
        /// candidate resources and it operates as a filtering parameter
        /// (resources that are not matched with this expression will not
        /// be candidates for transformation).
        /// </summary>
        public readonly string? JsonPath;
        /// <summary>
        /// (Filtering parameter) Any resource subject to transformation must
        /// be contained within one of the listed Kubernetes Namespace in the
        /// Backup. If this field is not provided, no namespace filtering will
        /// be performed (all resources in all Namespaces, including all
        /// cluster-scoped resources, will be candidates for transformation).
        /// To mix cluster-scoped and namespaced resources in the same rule,
        /// use an empty string ("") as one of the target namespaces.
        /// </summary>
        public readonly ImmutableArray<string> Namespaces;

        [OutputConstructor]
        private RestorePlanRestoreConfigTransformationRuleResourceFilter(
            ImmutableArray<Outputs.RestorePlanRestoreConfigTransformationRuleResourceFilterGroupKind> groupKinds,

            string? jsonPath,

            ImmutableArray<string> namespaces)
        {
            GroupKinds = groupKinds;
            JsonPath = jsonPath;
            Namespaces = namespaces;
        }
    }
}
