// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Iam.Inputs
{

    public sealed class WorkloadIdentityPoolProviderAwsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AWS account ID.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        public WorkloadIdentityPoolProviderAwsArgs()
        {
        }
        public static new WorkloadIdentityPoolProviderAwsArgs Empty => new WorkloadIdentityPoolProviderAwsArgs();
    }
}
