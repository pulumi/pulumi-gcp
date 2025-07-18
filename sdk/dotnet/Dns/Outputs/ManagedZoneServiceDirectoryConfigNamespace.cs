// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Dns.Outputs
{

    [OutputType]
    public sealed class ManagedZoneServiceDirectoryConfigNamespace
    {
        /// <summary>
        /// The fully qualified or partial URL of the service directory namespace that should be
        /// associated with the zone. This should be formatted like
        /// `https://servicedirectory.googleapis.com/v1/projects/{project}/locations/{location}/namespaces/{namespace_id}`
        /// or simply `projects/{project}/locations/{location}/namespaces/{namespace_id}`
        /// Ignored for `public` visibility zones.
        /// </summary>
        public readonly string NamespaceUrl;

        [OutputConstructor]
        private ManagedZoneServiceDirectoryConfigNamespace(string namespaceUrl)
        {
            NamespaceUrl = namespaceUrl;
        }
    }
}
