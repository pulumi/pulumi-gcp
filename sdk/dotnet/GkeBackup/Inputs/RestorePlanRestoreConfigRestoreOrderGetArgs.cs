// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeBackup.Inputs
{

    public sealed class RestorePlanRestoreConfigRestoreOrderGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("groupKindDependencies", required: true)]
        private InputList<Inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencyGetArgs>? _groupKindDependencies;

        /// <summary>
        /// A list of group kind dependency pairs
        /// that is used by Backup for GKE to
        /// generate a group kind restore order.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencyGetArgs> GroupKindDependencies
        {
            get => _groupKindDependencies ?? (_groupKindDependencies = new InputList<Inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencyGetArgs>());
            set => _groupKindDependencies = value;
        }

        public RestorePlanRestoreConfigRestoreOrderGetArgs()
        {
        }
        public static new RestorePlanRestoreConfigRestoreOrderGetArgs Empty => new RestorePlanRestoreConfigRestoreOrderGetArgs();
    }
}
