// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Iam.Inputs
{

    public sealed class ProjectsPolicyBindingTargetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required. Immutable. Full Resource Name of the principal set used for principal access boundary policy bindings.
        /// Examples for each one of the following supported principal set types:
        /// * Project:
        /// * `//cloudresourcemanager.googleapis.com/projects/PROJECT_NUMBER`
        /// * `//cloudresourcemanager.googleapis.com/projects/PROJECT_ID`
        /// * Workload Identity Pool: `//iam.googleapis.com/projects/PROJECT_NUMBER/locations/LOCATION/workloadIdentityPools/WORKLOAD_POOL_ID`
        /// It must be parent by the policy binding's parent (the project).
        /// </summary>
        [Input("principalSet")]
        public Input<string>? PrincipalSet { get; set; }

        public ProjectsPolicyBindingTargetArgs()
        {
        }
        public static new ProjectsPolicyBindingTargetArgs Empty => new ProjectsPolicyBindingTargetArgs();
    }
}
