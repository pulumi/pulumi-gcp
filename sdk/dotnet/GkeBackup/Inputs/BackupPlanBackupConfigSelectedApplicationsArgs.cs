// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeBackup.Inputs
{

    public sealed class BackupPlanBackupConfigSelectedApplicationsArgs : global::Pulumi.ResourceArgs
    {
        [Input("namespacedNames", required: true)]
        private InputList<Inputs.BackupPlanBackupConfigSelectedApplicationsNamespacedNameArgs>? _namespacedNames;

        /// <summary>
        /// A list of namespaced Kubernetes resources.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.BackupPlanBackupConfigSelectedApplicationsNamespacedNameArgs> NamespacedNames
        {
            get => _namespacedNames ?? (_namespacedNames = new InputList<Inputs.BackupPlanBackupConfigSelectedApplicationsNamespacedNameArgs>());
            set => _namespacedNames = value;
        }

        public BackupPlanBackupConfigSelectedApplicationsArgs()
        {
        }
        public static new BackupPlanBackupConfigSelectedApplicationsArgs Empty => new BackupPlanBackupConfigSelectedApplicationsArgs();
    }
}