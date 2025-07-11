// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Filestore.Outputs
{

    [OutputType]
    public sealed class InstanceDirectoryServices
    {
        /// <summary>
        /// Configuration for LDAP servers.
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.InstanceDirectoryServicesLdap? Ldap;

        [OutputConstructor]
        private InstanceDirectoryServices(Outputs.InstanceDirectoryServicesLdap? ldap)
        {
            Ldap = ldap;
        }
    }
}
