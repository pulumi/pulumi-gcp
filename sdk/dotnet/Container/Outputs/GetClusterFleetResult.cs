// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class GetClusterFleetResult
    {
        public readonly string Membership;
        public readonly bool PreRegistered;
        /// <summary>
        /// The project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        public readonly string Project;

        [OutputConstructor]
        private GetClusterFleetResult(
            string membership,

            bool preRegistered,

            string project)
        {
            Membership = membership;
            PreRegistered = preRegistered;
            Project = project;
        }
    }
}