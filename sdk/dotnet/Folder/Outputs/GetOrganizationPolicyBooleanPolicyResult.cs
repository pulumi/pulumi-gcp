// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Folder.Outputs
{

    [OutputType]
    public sealed class GetOrganizationPolicyBooleanPolicyResult
    {
        /// <summary>
        /// If true, then the Policy is enforced. If false, then any configuration is acceptable.
        /// </summary>
        public readonly bool Enforced;

        [OutputConstructor]
        private GetOrganizationPolicyBooleanPolicyResult(bool enforced)
        {
            Enforced = enforced;
        }
    }
}
