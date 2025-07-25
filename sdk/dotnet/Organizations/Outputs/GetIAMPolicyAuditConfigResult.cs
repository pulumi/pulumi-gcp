// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Organizations.Outputs
{

    [OutputType]
    public sealed class GetIAMPolicyAuditConfigResult
    {
        /// <summary>
        /// A nested block that defines the operations you'd like to log.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetIAMPolicyAuditConfigAuditLogConfigResult> AuditLogConfigs;
        /// <summary>
        /// Defines a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
        /// </summary>
        public readonly string Service;

        [OutputConstructor]
        private GetIAMPolicyAuditConfigResult(
            ImmutableArray<Outputs.GetIAMPolicyAuditConfigAuditLogConfigResult> auditLogConfigs,

            string service)
        {
            AuditLogConfigs = auditLogConfigs;
            Service = service;
        }
    }
}
