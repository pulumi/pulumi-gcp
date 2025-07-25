// *** WARNING: this file was generated by pulumi-language-dotnet. ***
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
        /// <summary>
        /// Name of the environment variable.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// Project identifier (due to a known limitation, only project number is supported by this field) of the project that contains the secret. If not set, it will be populated with the function's project, assuming that the secret exists in the same project as of the function.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// ID of the secret in secret manager (not the full resource name).
        /// </summary>
        public readonly string Secret;
        /// <summary>
        /// Version of the secret (version number or the string "latest"). It is recommended to use a numeric version for secret environment variables as any updates to the secret value is not reflected until new clones start.
        /// </summary>
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
