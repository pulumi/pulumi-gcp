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
    public sealed class OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGoo
    {
        /// <summary>
        /// The name of the repository.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The url of the repository.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGoo(
            string name,

            string url)
        {
            Name = name;
            Url = url;
        }
    }
}
