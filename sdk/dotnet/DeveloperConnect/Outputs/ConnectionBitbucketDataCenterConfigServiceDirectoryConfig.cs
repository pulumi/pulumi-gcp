// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DeveloperConnect.Outputs
{

    [OutputType]
    public sealed class ConnectionBitbucketDataCenterConfigServiceDirectoryConfig
    {
        /// <summary>
        /// Required. The Service Directory service name.
        /// Format:
        /// projects/{project}/locations/{location}/namespaces/{namespace}/services/{service}.
        /// </summary>
        public readonly string Service;

        [OutputConstructor]
        private ConnectionBitbucketDataCenterConfigServiceDirectoryConfig(string service)
        {
            Service = service;
        }
    }
}
