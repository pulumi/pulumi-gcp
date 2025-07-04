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
    public sealed class GetRouterStatusBestRoutesForRouterWarningResult
    {
        /// <summary>
        /// A warning code, if applicable. For example, Compute Engine returns
        /// NO_RESULTS_ON_PAGE if there are no results in the response.
        /// </summary>
        public readonly string Code;
        /// <summary>
        /// Metadata about this warning in key: value format. For example:
        /// "data": [  {  "key": "scope",  "value": "zones/us-east1-d"  }
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRouterStatusBestRoutesForRouterWarningDataResult> Datas;
        /// <summary>
        /// A human-readable description of the warning code.
        /// </summary>
        public readonly string Message;

        [OutputConstructor]
        private GetRouterStatusBestRoutesForRouterWarningResult(
            string code,

            ImmutableArray<Outputs.GetRouterStatusBestRoutesForRouterWarningDataResult> datas,

            string message)
        {
            Code = code;
            Datas = datas;
            Message = message;
        }
    }
}
