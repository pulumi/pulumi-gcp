// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudDeploy.Outputs
{

    [OutputType]
    public sealed class CustomTargetTypeCustomActionsIncludeSkaffoldModuleGit
    {
        /// <summary>
        /// Relative path from the repository root to the Skaffold file.
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// Git ref the package should be cloned from.
        /// </summary>
        public readonly string? Ref;
        /// <summary>
        /// Git repository the package should be cloned from.
        /// </summary>
        public readonly string Repo;

        [OutputConstructor]
        private CustomTargetTypeCustomActionsIncludeSkaffoldModuleGit(
            string? path,

            string? @ref,

            string repo)
        {
            Path = path;
            Ref = @ref;
            Repo = repo;
        }
    }
}
