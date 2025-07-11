// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class AttachedClusterBinaryAuthorizationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configure Binary Authorization evaluation mode.
        /// Possible values are: `DISABLED`, `PROJECT_SINGLETON_POLICY_ENFORCE`.
        /// </summary>
        [Input("evaluationMode")]
        public Input<string>? EvaluationMode { get; set; }

        public AttachedClusterBinaryAuthorizationArgs()
        {
        }
        public static new AttachedClusterBinaryAuthorizationArgs Empty => new AttachedClusterBinaryAuthorizationArgs();
    }
}
