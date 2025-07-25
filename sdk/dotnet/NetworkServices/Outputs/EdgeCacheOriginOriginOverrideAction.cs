// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkServices.Outputs
{

    [OutputType]
    public sealed class EdgeCacheOriginOriginOverrideAction
    {
        /// <summary>
        /// The header actions, including adding and removing
        /// headers, for request handled by this origin.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.EdgeCacheOriginOriginOverrideActionHeaderAction? HeaderAction;
        /// <summary>
        /// The URL rewrite configuration for request that are
        /// handled by this origin.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.EdgeCacheOriginOriginOverrideActionUrlRewrite? UrlRewrite;

        [OutputConstructor]
        private EdgeCacheOriginOriginOverrideAction(
            Outputs.EdgeCacheOriginOriginOverrideActionHeaderAction? headerAction,

            Outputs.EdgeCacheOriginOriginOverrideActionUrlRewrite? urlRewrite)
        {
            HeaderAction = headerAction;
            UrlRewrite = urlRewrite;
        }
    }
}
