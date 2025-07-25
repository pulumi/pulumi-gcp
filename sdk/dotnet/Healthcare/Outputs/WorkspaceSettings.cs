// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Healthcare.Outputs
{

    [OutputType]
    public sealed class WorkspaceSettings
    {
        /// <summary>
        /// Project IDs for data projects hosted in a workspace.
        /// </summary>
        public readonly ImmutableArray<string> DataProjectIds;

        [OutputConstructor]
        private WorkspaceSettings(ImmutableArray<string> dataProjectIds)
        {
            DataProjectIds = dataProjectIds;
        }
    }
}
