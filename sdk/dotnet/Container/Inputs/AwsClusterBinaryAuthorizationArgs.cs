// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class AwsClusterBinaryAuthorizationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Mode of operation for Binary Authorization policy evaluation. Possible values: DISABLED, PROJECT_SINGLETON_POLICY_ENFORCE
        /// </summary>
        [Input("evaluationMode")]
        public Input<string>? EvaluationMode { get; set; }

        public AwsClusterBinaryAuthorizationArgs()
        {
        }
        public static new AwsClusterBinaryAuthorizationArgs Empty => new AwsClusterBinaryAuthorizationArgs();
    }
}
