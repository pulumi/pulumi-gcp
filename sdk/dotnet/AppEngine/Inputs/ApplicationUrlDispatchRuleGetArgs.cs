// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AppEngine.Inputs
{

    public sealed class ApplicationUrlDispatchRuleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        [Input("path")]
        public Input<string>? Path { get; set; }

        [Input("service")]
        public Input<string>? Service { get; set; }

        public ApplicationUrlDispatchRuleGetArgs()
        {
        }
        public static new ApplicationUrlDispatchRuleGetArgs Empty => new ApplicationUrlDispatchRuleGetArgs();
    }
}
