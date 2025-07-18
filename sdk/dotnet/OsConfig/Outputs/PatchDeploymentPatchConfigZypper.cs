// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.OsConfig.Outputs
{

    [OutputType]
    public sealed class PatchDeploymentPatchConfigZypper
    {
        /// <summary>
        /// Install only patches with these categories. Common categories include security, recommended, and feature.
        /// </summary>
        public readonly ImmutableArray<string> Categories;
        /// <summary>
        /// List of packages to exclude from update.
        /// </summary>
        public readonly ImmutableArray<string> Excludes;
        /// <summary>
        /// An exclusive list of patches to be updated. These are the only patches that will be installed using 'zypper patch patch:' command.
        /// This field must not be used with any other patch configuration fields.
        /// </summary>
        public readonly ImmutableArray<string> ExclusivePatches;
        /// <summary>
        /// Install only patches with these severities. Common severities include critical, important, moderate, and low.
        /// </summary>
        public readonly ImmutableArray<string> Severities;
        /// <summary>
        /// Adds the --with-optional flag to zypper patch.
        /// </summary>
        public readonly bool? WithOptional;
        /// <summary>
        /// Adds the --with-update flag, to zypper patch.
        /// </summary>
        public readonly bool? WithUpdate;

        [OutputConstructor]
        private PatchDeploymentPatchConfigZypper(
            ImmutableArray<string> categories,

            ImmutableArray<string> excludes,

            ImmutableArray<string> exclusivePatches,

            ImmutableArray<string> severities,

            bool? withOptional,

            bool? withUpdate)
        {
            Categories = categories;
            Excludes = excludes;
            ExclusivePatches = exclusivePatches;
            Severities = severities;
            WithOptional = withOptional;
            WithUpdate = withUpdate;
        }
    }
}
