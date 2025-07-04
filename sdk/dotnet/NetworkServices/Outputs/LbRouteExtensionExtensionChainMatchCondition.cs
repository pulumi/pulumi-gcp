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
    public sealed class LbRouteExtensionExtensionChainMatchCondition
    {
        /// <summary>
        /// A Common Expression Language (CEL) expression that is used to match requests for which the extension chain is executed.
        /// </summary>
        public readonly string CelExpression;

        [OutputConstructor]
        private LbRouteExtensionExtensionChainMatchCondition(string celExpression)
        {
            CelExpression = celExpression;
        }
    }
}
