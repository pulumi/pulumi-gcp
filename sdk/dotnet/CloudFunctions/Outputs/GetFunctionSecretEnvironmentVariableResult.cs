// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudFunctions.Outputs
{

    [OutputType]
    public sealed class GetFunctionSecretEnvironmentVariableResult
    {
        public readonly string Key;
        public readonly string ProjectId;
        public readonly string Secret;
        public readonly string Version;

        [OutputConstructor]
        private GetFunctionSecretEnvironmentVariableResult(
            string key,

            string projectId,

            string secret,

            string version)
        {
            Key = key;
            ProjectId = projectId;
            Secret = secret;
            Version = version;
        }
    }
}