// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeBackup.Outputs
{

    [OutputType]
    public sealed class BackupPlanBackupConfigSelectedNamespaces
    {
        /// <summary>
        /// A list of Kubernetes Namespaces.
        /// </summary>
        public readonly ImmutableArray<string> Namespaces;

        [OutputConstructor]
        private BackupPlanBackupConfigSelectedNamespaces(ImmutableArray<string> namespaces)
        {
            Namespaces = namespaces;
        }
    }
}
