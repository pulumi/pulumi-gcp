// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Outputs
{

    [OutputType]
    public sealed class ScopeRbacRoleBindingRole
    {
        /// <summary>
        /// PredefinedRole is an ENUM representation of the default Kubernetes Roles
        /// Possible values are: `UNKNOWN`, `ADMIN`, `EDIT`, `VIEW`.
        /// 
        /// - - -
        /// </summary>
        public readonly string? PredefinedRole;

        [OutputConstructor]
        private ScopeRbacRoleBindingRole(string? predefinedRole)
        {
            PredefinedRole = predefinedRole;
        }
    }
}