// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Outputs
{

    [OutputType]
    public sealed class AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProvider
    {
        /// <summary>
        /// A list of allowed JWT issuers. Each entry must be a valid Google service account, in the following format: service-account-name@project-id.iam.gserviceaccount.com
        /// </summary>
        public readonly ImmutableArray<string> AllowedIssuers;
        /// <summary>
        /// The list of JWT audiences. that are allowed to access. A JWT containing any of these audiences will be accepted.
        /// </summary>
        public readonly ImmutableArray<string> Audiences;

        [OutputConstructor]
        private AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProvider(
            ImmutableArray<string> allowedIssuers,

            ImmutableArray<string> audiences)
        {
            AllowedIssuers = allowedIssuers;
            Audiences = audiences;
        }
    }
}
