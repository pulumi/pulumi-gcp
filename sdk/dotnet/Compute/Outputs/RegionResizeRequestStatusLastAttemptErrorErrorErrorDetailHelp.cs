// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelp
    {
        /// <summary>
        /// (Output)
        /// A nested object resource.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpLink> Links;

        [OutputConstructor]
        private RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelp(ImmutableArray<Outputs.RegionResizeRequestStatusLastAttemptErrorErrorErrorDetailHelpLink> links)
        {
            Links = links;
        }
    }
}
