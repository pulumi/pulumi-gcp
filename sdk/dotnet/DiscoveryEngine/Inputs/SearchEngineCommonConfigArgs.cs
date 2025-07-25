// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DiscoveryEngine.Inputs
{

    public sealed class SearchEngineCommonConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the company, business or entity that is associated with the engine. Setting this may help improve LLM related features.cd
        /// </summary>
        [Input("companyName")]
        public Input<string>? CompanyName { get; set; }

        public SearchEngineCommonConfigArgs()
        {
        }
        public static new SearchEngineCommonConfigArgs Empty => new SearchEngineCommonConfigArgs();
    }
}
